.class public final Lcom/kubi/rn/core/BundleLoader;
.super Ljava/lang/Object;
.source "BundleLoader.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/rn/core/BundleLoader$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001:\u00011B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0017J0\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u001c2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u0002J\u0006\u0010\u001e\u001a\u00020\u0011J6\u0010\u001f\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010$H\u0086@\u00a2\u0006\u0002\u0010%J\u0016\u0010&\u001a\u00020\'2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0017J&\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\'H\u0086@\u00a2\u0006\u0002\u0010+J.\u0010(\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\'2\u0006\u0010,\u001a\u00020-H\u0086@\u00a2\u0006\u0002\u0010.J\u000c\u0010/\u001a\u00020\'*\u00020\u0015H\u0002J\u000c\u00100\u001a\u00020\u0011*\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"
    }
    d2 = {
        "Lcom/kubi/rn/core/BundleLoader;",
        "",
        "<init>",
        "()V",
        "TAG",
        "",
        "METRO_CHECK_TIMEOUT_MS",
        "",
        "instanceCache",
        "",
        "Lcom/kubi/rn/core/BundleLoader$CacheItem;",
        "instanceCreationMutex",
        "Lkotlinx/coroutines/sync/Mutex;",
        "popCache",
        "Lcom/facebook/react/ReactInstanceManager;",
        "path",
        "afterInBackground",
        "",
        "application",
        "Landroid/app/Application;",
        "param",
        "Lcom/kubi/rn/core/ReactInitParam;",
        "prepare",
        "(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "report",
        "code",
        "version",
        "duration",
        "",
        "errorMessage",
        "clearCache",
        "loadAsync",
        "Lcom/kubi/rn/core/SplitBundleLoader;",
        "fcpTracker",
        "Lcom/kubi/rn/core/KrnFcpTracker;",
        "ownerExceptionHandler",
        "Lcom/facebook/react/bridge/JSExceptionHandler;",
        "(Landroid/app/Application;Lcom/kubi/rn/core/ReactInitParam;Lcom/kubi/rn/core/KrnFcpTracker;Lcom/facebook/react/bridge/JSExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isMetroRunning",
        "",
        "createReactInstance",
        "bundleFilePath",
        "isDebug",
        "(Landroid/app/Application;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "exceptionHandler",
        "Lcom/kubi/rn/core/EngineExceptionHandler;",
        "(Landroid/app/Application;Ljava/lang/String;ZLcom/kubi/rn/core/EngineExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "isLocalServerDebug",
        "logMetroSourceUrlIfNeeded",
        "CacheItem",
        "BReactNativeLib_googleRelease"
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
        "SMAP\nBundleLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,474:1\n295#2,2:475\n47#3,4:477\n71#4,2:481\n73#4,2:484\n1#5:483\n116#6,11:486\n*S KotlinDebug\n*F\n+ 1 BundleLoader.kt\ncom/kubi/rn/core/BundleLoader\n*L\n64#1:475,2\n80#1:477,4\n133#1:481,2\n133#1:484,2\n241#1:486,11\n*E\n"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/kubi/rn/core/BundleLoader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final METRO_CHECK_TIMEOUT_MS:I = 0x12c

.field private static final TAG:Ljava/lang/String; = "BundleLoader"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final instanceCache:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/rn/core/BundleLoader$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final instanceCreationMutex:Lrg0/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/rn/core/BundleLoader;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/rn/core/BundleLoader;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/rn/core/BundleLoader;->INSTANCE:Lcom/kubi/rn/core/BundleLoader;

    .line 8
    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/kubi/rn/core/BundleLoader;->instanceCache:Ljava/util/List;

    .line 15
    const/4 v0, 0x1

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v0, v1}, Lrg0/f;->b(ZILjava/lang/Object;)Lrg0/a;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sput-object v0, Lcom/kubi/rn/core/BundleLoader;->instanceCreationMutex:Lrg0/a;

    .line 24
    return-void
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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static synthetic a(Lcom/facebook/react/ReactInstanceManager;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/rn/core/BundleLoader;->logMetroSourceUrlIfNeeded$lambda$16(Lcom/facebook/react/ReactInstanceManager;)Lkotlin/Unit;

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
.end method

.method public static final synthetic access$isMetroRunning(Lcom/kubi/rn/core/BundleLoader;Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lcom/kubi/rn/core/BundleLoader;->isMetroRunning(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic access$logMetroSourceUrlIfNeeded(Lcom/kubi/rn/core/BundleLoader;Lcom/facebook/react/ReactInstanceManager;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/rn/core/BundleLoader;->logMetroSourceUrlIfNeeded(Lcom/facebook/react/ReactInstanceManager;)V

    .line 4
    return-void
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
.end method

.method private final isLocalServerDebug(Lcom/kubi/rn/core/ReactInitParam;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/rn/core/ReactInitParam;->getCustomParameters()Landroid/os/Bundle;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const-string v0, "rnLocalServerDebug"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    .line 16
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    return v1

    .line 25
    .line 26
    :cond_1
    const-string v0, "true"

    .line 27
    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    move-result p1

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    return v1

    .line 34
    :cond_2
    const/4 p1, 0x0

    .line 35
    return p1
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
.end method

.method private final isMetroRunning(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/rn/core/BundleLoader$isMetroRunning$2;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p1, v2}, Lcom/kubi/rn/core/BundleLoader$isMetroRunning$2;-><init>(Landroid/app/Application;Lkotlin/coroutines/Continuation;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
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
.end method

.method public static synthetic loadAsync$default(Lcom/kubi/rn/core/BundleLoader;Landroid/app/Application;Lcom/kubi/rn/core/ReactInitParam;Lcom/kubi/rn/core/KrnFcpTracker;Lcom/facebook/react/bridge/JSExceptionHandler;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/kubi/rn/core/ReactHostException;
        }
    .end annotation

    .line 1
    .line 2
    and-int/lit8 p7, p6, 0x4

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p7, :cond_0

    .line 6
    move-object p3, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p6, p6, 0x8

    .line 9
    .line 10
    if-eqz p6, :cond_1

    .line 11
    move-object p4, v0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual/range {p0 .. p5}, Lcom/kubi/rn/core/BundleLoader;->loadAsync(Landroid/app/Application;Lcom/kubi/rn/core/ReactInitParam;Lcom/kubi/rn/core/KrnFcpTracker;Lcom/facebook/react/bridge/JSExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method private final logMetroSourceUrlIfNeeded(Lcom/facebook/react/ReactInstanceManager;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/rn/core/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1}, Lcom/kubi/rn/core/a;-><init>(Lcom/facebook/react/ReactInstanceManager;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/utils/x0;->e(Lkotlin/jvm/functions/Function0;)V

    .line 9
    return-void
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
.end method

.method private static final logMetroSourceUrlIfNeeded$lambda$16(Lcom/facebook/react/ReactInstanceManager;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "Metro sourceUrl="

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/facebook/react/ReactInstanceManager;->getDevSupportManager()Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 16
    move-result-object p0

    .line 17
    .line 18
    .line 19
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getSourceUrl()Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    if-nez p0, :cond_0

    .line 23
    .line 24
    const-string p0, ""

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    .line 33
    const-string v1, "BundleLoader"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1, p0}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    return-object p0
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
.end method

.method private final popCache(Ljava/lang/String;)Lcom/facebook/react/ReactInstanceManager;
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/rn/core/BundleLoader;->instanceCache:Ljava/util/List;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    move-result-object v2

    .line 19
    move-object v4, v2

    .line 20
    .line 21
    check-cast v4, Lcom/kubi/rn/core/BundleLoader$a;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Lcom/kubi/rn/core/BundleLoader$a;->b()Ljava/lang/String;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    .line 28
    invoke-static {v4, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    move-result v4

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v2, v3

    .line 36
    .line 37
    :goto_0
    check-cast v2, Lcom/kubi/rn/core/BundleLoader$a;

    .line 38
    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    sget-object p1, Lcom/kubi/rn/core/BundleLoader;->instanceCache:Ljava/util/List;

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/kubi/rn/core/BundleLoader$a;->a()Lcom/facebook/react/ReactInstanceManager;

    .line 48
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    :cond_2
    monitor-exit v0

    .line 50
    return-object v3

    .line 51
    :goto_1
    monitor-exit v0

    .line 52
    throw p1
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
.end method

.method private final report(ILjava/lang/String;JLjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/monitor/TechnologyEvent;->a:Lcom/kubi/monitor/TechnologyEvent;

    .line 3
    .line 4
    sget-object v0, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b:Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "code"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1, p1}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->b(Ljava/lang/String;I)V

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const-string p1, "version"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    :cond_0
    const-wide/16 p1, 0x0

    .line 23
    .line 24
    cmp-long p1, p3, p1

    .line 25
    .line 26
    if-lez p1, :cond_1

    .line 27
    .line 28
    const-string p1, "duration"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1, p3, p4}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->g(Ljava/lang/String;J)V

    .line 32
    .line 33
    :cond_1
    if-eqz p5, :cond_2

    .line 34
    .line 35
    const-string p1, "error_message"

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1, p5}, Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    :cond_2
    const-string p1, "krn_prepare_rate"

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, Lcom/kubi/monitor/TechnologyEvent;->d(Ljava/lang/String;Lcom/kubi/monitor/TechnologyEvent$EventParametersBuilder;)V

    .line 44
    return-void
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
.end method

.method public static synthetic report$default(Lcom/kubi/rn/core/BundleLoader;ILjava/lang/String;JLjava/lang/String;ILjava/lang/Object;)V
    .locals 6

    .line 1
    .line 2
    and-int/lit8 p7, p6, 0x4

    .line 3
    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    const-wide/16 p3, 0x0

    .line 7
    :cond_0
    move-wide v3, p3

    .line 8
    .line 9
    and-int/lit8 p3, p6, 0x8

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    const/4 p5, 0x0

    .line 13
    :cond_1
    move-object v0, p0

    .line 14
    move v1, p1

    .line 15
    move-object v2, p2

    .line 16
    move-object v5, p5

    .line 17
    .line 18
    .line 19
    invoke-direct/range {v0 .. v5}, Lcom/kubi/rn/core/BundleLoader;->report(ILjava/lang/String;JLjava/lang/String;)V

    .line 20
    return-void
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
.end method


# virtual methods
.method public final afterInBackground(Landroid/app/Application;Lcom/kubi/rn/core/ReactInitParam;)V
    .locals 7
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/rn/core/ReactInitParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "param"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/rn/core/ReactNativeEngine;->INSTANCE:Lcom/kubi/rn/core/ReactNativeEngine;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/rn/core/ReactNativeEngine;->isDisable$BReactNativeLib_googleRelease()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lkotlinx/coroutines/l0;

    .line 22
    .line 23
    const-string v1, "react_native_init"

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Lkotlinx/coroutines/l0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    sget-object v1, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 37
    .line 38
    new-instance v2, Lcom/kubi/rn/core/BundleLoader$afterInBackground$$inlined$CoroutineExceptionHandler$1;

    .line 39
    .line 40
    .line 41
    invoke-direct {v2, v1}, Lcom/kubi/rn/core/BundleLoader$afterInBackground$$inlined$CoroutineExceptionHandler$1;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v2}, Lkotlin/coroutines/CoroutineContext;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    new-instance v4, Lcom/kubi/rn/core/BundleLoader$afterInBackground$1;

    .line 52
    const/4 v0, 0x0

    .line 53
    .line 54
    .line 55
    invoke-direct {v4, p1, p2, v0}, Lcom/kubi/rn/core/BundleLoader$afterInBackground$1;-><init>(Landroid/app/Application;Lcom/kubi/rn/core/ReactInitParam;Lkotlin/coroutines/Continuation;)V

    .line 56
    const/4 v5, 0x3

    .line 57
    const/4 v6, 0x0

    .line 58
    const/4 v2, 0x0

    .line 59
    const/4 v3, 0x0

    .line 60
    .line 61
    .line 62
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 63
    return-void
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
.end method

.method public final clearCache()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/rn/core/BundleLoader;->instanceCache:Ljava/util/List;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 7
    .line 8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception v1

    .line 12
    monitor-exit v0

    .line 13
    throw v1
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
.end method

.method public final createReactInstance(Landroid/app/Application;Ljava/lang/String;ZLcom/kubi/rn/core/EngineExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 7
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/kubi/rn/core/EngineExceptionHandler;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/kubi/rn/core/EngineExceptionHandler;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/facebook/react/ReactInstanceManager;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 3
    invoke-static {}, Lo00/a;->c()Lkotlinx/coroutines/j0;

    move-result-object v0

    new-instance v1, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;

    const/4 v6, 0x0

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    move-object v4, p4

    invoke-direct/range {v1 .. v6}, Lcom/kubi/rn/core/BundleLoader$createReactInstance$3;-><init>(Landroid/app/Application;Ljava/lang/String;Lcom/kubi/rn/core/EngineExceptionHandler;ZLkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p5}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final createReactInstance(Landroid/app/Application;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/facebook/react/ReactInstanceManager;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    new-instance v4, Lcom/kubi/rn/core/EngineExceptionHandler;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {v4, v0, v1, v0}, Lcom/kubi/rn/core/EngineExceptionHandler;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v5, p4

    .line 2
    invoke-virtual/range {v0 .. v5}, Lcom/kubi/rn/core/BundleLoader;->createReactInstance(Landroid/app/Application;Ljava/lang/String;ZLcom/kubi/rn/core/EngineExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final loadAsync(Landroid/app/Application;Lcom/kubi/rn/core/ReactInitParam;Lcom/kubi/rn/core/KrnFcpTracker;Lcom/facebook/react/bridge/JSExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 33
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/rn/core/ReactInitParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/kubi/rn/core/KrnFcpTracker;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/facebook/react/bridge/JSExceptionHandler;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lcom/kubi/rn/core/ReactInitParam;",
            "Lcom/kubi/rn/core/KrnFcpTracker;",
            "Lcom/facebook/react/bridge/JSExceptionHandler;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/rn/core/SplitBundleLoader;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/kubi/rn/core/ReactHostException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move-object/from16 v0, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    move-object/from16 v3, p3

    .line 9
    .line 10
    move-object/from16 v4, p4

    .line 11
    .line 12
    move-object/from16 v5, p5

    .line 13
    .line 14
    instance-of v6, v5, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;

    .line 15
    .line 16
    if-eqz v6, :cond_0

    .line 17
    move-object v6, v5

    .line 18
    .line 19
    check-cast v6, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;

    .line 20
    .line 21
    iget v7, v6, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->label:I

    .line 22
    .line 23
    const/high16 v8, -0x80000000

    .line 24
    .line 25
    and-int v9, v7, v8

    .line 26
    .line 27
    if-eqz v9, :cond_0

    .line 28
    sub-int/2addr v7, v8

    .line 29
    .line 30
    iput v7, v6, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->label:I

    .line 31
    :goto_0
    move-object v12, v6

    .line 32
    goto :goto_1

    .line 33
    .line 34
    :cond_0
    new-instance v6, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;

    .line 35
    .line 36
    .line 37
    invoke-direct {v6, v1, v5}, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;-><init>(Lcom/kubi/rn/core/BundleLoader;Lkotlin/coroutines/Continuation;)V

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :goto_1
    iget-object v5, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->result:Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 44
    move-result-object v6

    .line 45
    .line 46
    iget v7, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->label:I

    .line 47
    .line 48
    const-string v8, "component"

    .line 49
    const/4 v10, 0x4

    .line 50
    const/4 v11, 0x3

    .line 51
    .line 52
    const-string v13, ""

    .line 53
    const/4 v14, 0x2

    .line 54
    const/4 v15, 0x1

    .line 55
    .line 56
    if-eqz v7, :cond_5

    .line 57
    .line 58
    if-eq v7, v15, :cond_4

    .line 59
    .line 60
    if-eq v7, v14, :cond_3

    .line 61
    .line 62
    if-eq v7, v11, :cond_2

    .line 63
    .line 64
    if-ne v7, v10, :cond_1

    .line 65
    .line 66
    iget v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 67
    .line 68
    iget-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$6:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v2, Lrg0/a;

    .line 71
    .line 72
    iget-object v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$5:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v3, Lcom/kubi/rn/core/EngineExceptionHandler;

    .line 75
    .line 76
    iget-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$4:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;

    .line 79
    .line 80
    iget-object v6, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v6, Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 83
    .line 84
    iget-object v6, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, Lcom/kubi/rn/core/KrnFcpTracker;

    .line 87
    .line 88
    iget-object v7, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, Lcom/kubi/rn/core/ReactInitParam;

    .line 91
    .line 92
    iget-object v7, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v7, Landroid/app/Application;

    .line 95
    .line 96
    .line 97
    :try_start_0
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    move-object v11, v3

    .line 99
    move-object v7, v5

    .line 100
    const/4 v3, 0x0

    .line 101
    move-object v5, v4

    .line 102
    move-object v4, v2

    .line 103
    const/4 v2, 0x0

    .line 104
    .line 105
    goto/16 :goto_b

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    const/4 v3, 0x0

    .line 108
    .line 109
    goto/16 :goto_e

    .line 110
    .line 111
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 112
    .line 113
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    throw v0

    .line 118
    .line 119
    :cond_2
    iget v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$1:I

    .line 120
    .line 121
    iget v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 122
    .line 123
    iget-object v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$6:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast v3, Lrg0/a;

    .line 126
    .line 127
    iget-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$5:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v4, Lcom/kubi/rn/core/EngineExceptionHandler;

    .line 130
    .line 131
    iget-object v7, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$4:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v7, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;

    .line 134
    .line 135
    iget-object v8, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v8, Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 138
    .line 139
    iget-object v11, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v11, Lcom/kubi/rn/core/KrnFcpTracker;

    .line 142
    .line 143
    iget-object v13, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v13, Lcom/kubi/rn/core/ReactInitParam;

    .line 146
    .line 147
    iget-object v10, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v10, Landroid/app/Application;

    .line 150
    .line 151
    .line 152
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 153
    move-object v5, v7

    .line 154
    move-object v7, v13

    .line 155
    move-object v13, v11

    .line 156
    move-object v11, v4

    .line 157
    move-object v4, v3

    .line 158
    move v3, v0

    .line 159
    move v0, v2

    .line 160
    const/4 v2, 0x0

    .line 161
    .line 162
    goto/16 :goto_8

    .line 163
    .line 164
    :cond_3
    iget-wide v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->J$0:J

    .line 165
    .line 166
    iget v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 167
    .line 168
    iget-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v4, Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 171
    .line 172
    iget-object v7, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v7, Lcom/kubi/rn/core/KrnFcpTracker;

    .line 175
    .line 176
    iget-object v10, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v10, Lcom/kubi/rn/core/ReactInitParam;

    .line 179
    .line 180
    iget-object v9, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast v9, Landroid/app/Application;

    .line 183
    .line 184
    .line 185
    :try_start_1
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/kubi/sdk/pkg/task/TaskException; {:try_start_1 .. :try_end_1} :catch_0

    .line 186
    .line 187
    move-object/from16 v20, v7

    .line 188
    move-object v7, v5

    .line 189
    move v5, v0

    .line 190
    move-object v0, v9

    .line 191
    .line 192
    goto/16 :goto_4

    .line 193
    :catch_0
    move-exception v0

    .line 194
    .line 195
    move-object/from16 v16, v7

    .line 196
    .line 197
    goto/16 :goto_f

    .line 198
    .line 199
    :cond_4
    iget v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 200
    .line 201
    iget-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v2, Lcom/facebook/react/bridge/JSExceptionHandler;

    .line 204
    .line 205
    iget-object v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v3, Lcom/kubi/rn/core/KrnFcpTracker;

    .line 208
    .line 209
    iget-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 210
    .line 211
    check-cast v4, Lcom/kubi/rn/core/ReactInitParam;

    .line 212
    .line 213
    iget-object v7, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v7, Landroid/app/Application;

    .line 216
    .line 217
    .line 218
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 219
    .line 220
    move-object/from16 v31, v5

    .line 221
    move v5, v0

    .line 222
    move-object v0, v7

    .line 223
    .line 224
    move-object/from16 v7, v31

    .line 225
    .line 226
    move-object/from16 v31, v4

    .line 227
    move-object v4, v2

    .line 228
    .line 229
    move-object/from16 v2, v31

    .line 230
    goto :goto_3

    .line 231
    .line 232
    .line 233
    :cond_5
    invoke-static {v5}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    invoke-static {}, Lcom/kubi/rn/core/ReactConstKt;->getDeveloperSupport()Z

    .line 237
    move-result v5

    .line 238
    .line 239
    if-eqz v5, :cond_6

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->isDebug()Z

    .line 243
    move-result v5

    .line 244
    .line 245
    if-eqz v5, :cond_6

    .line 246
    move v5, v15

    .line 247
    goto :goto_2

    .line 248
    :cond_6
    const/4 v5, 0x0

    .line 249
    .line 250
    :goto_2
    if-eqz v5, :cond_7

    .line 251
    .line 252
    sget-object v7, Lcom/kubi/rn/debug/RnMetroConfigManager;->INSTANCE:Lcom/kubi/rn/debug/RnMetroConfigManager;

    .line 253
    .line 254
    .line 255
    invoke-direct {v1, v2}, Lcom/kubi/rn/core/BundleLoader;->isLocalServerDebug(Lcom/kubi/rn/core/ReactInitParam;)Z

    .line 256
    move-result v9

    .line 257
    .line 258
    .line 259
    invoke-virtual {v7, v0, v15, v9}, Lcom/kubi/rn/debug/RnMetroConfigManager;->restoreManagedHostIfNeeded(Landroid/content/Context;ZZ)V

    .line 260
    .line 261
    :cond_7
    if-eqz v5, :cond_a

    .line 262
    .line 263
    iput-object v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 264
    .line 265
    iput-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 266
    .line 267
    iput-object v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 268
    .line 269
    iput-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 270
    .line 271
    iput v5, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 272
    .line 273
    iput v15, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->label:I

    .line 274
    .line 275
    .line 276
    invoke-direct {v1, v0, v12}, Lcom/kubi/rn/core/BundleLoader;->isMetroRunning(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 277
    move-result-object v7

    .line 278
    .line 279
    if-ne v7, v6, :cond_8

    .line 280
    .line 281
    goto/16 :goto_a

    .line 282
    .line 283
    :cond_8
    :goto_3
    check-cast v7, Ljava/lang/Boolean;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 287
    move-result v7

    .line 288
    .line 289
    const-string v8, ", entry="

    .line 290
    .line 291
    if-eqz v7, :cond_9

    .line 292
    .line 293
    new-instance v7, Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 297
    .line 298
    const-string v9, "loadAsync debug mode uses local mock bundle, biz="

    .line 299
    .line 300
    .line 301
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getBiz()Ljava/lang/String;

    .line 305
    move-result-object v9

    .line 306
    .line 307
    .line 308
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getEntry()Ljava/lang/String;

    .line 315
    move-result-object v8

    .line 316
    .line 317
    .line 318
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 322
    move-result-object v7

    .line 323
    .line 324
    const-string v8, "BundleLoader"

    .line 325
    .line 326
    .line 327
    invoke-static {v8, v7}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    sget-object v7, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->h:Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig$Companion;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getBiz()Ljava/lang/String;

    .line 333
    move-result-object v8

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getEntry()Ljava/lang/String;

    .line 337
    move-result-object v9

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7, v0, v8, v9}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig$Companion;->mock(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;

    .line 341
    move-result-object v7

    .line 342
    move-object v13, v2

    .line 343
    move-object v10, v0

    .line 344
    move-object v8, v4

    .line 345
    .line 346
    goto/16 :goto_7

    .line 347
    .line 348
    :cond_9
    sget-object v18, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 349
    .line 350
    new-instance v0, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    .line 355
    const-string v3, "debug metro is not running, biz="

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getBiz()Ljava/lang/String;

    .line 362
    move-result-object v3

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getEntry()Ljava/lang/String;

    .line 372
    move-result-object v2

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    move-result-object v20

    .line 380
    .line 381
    const/16 v22, 0x4

    .line 382
    .line 383
    const/16 v23, 0x0

    .line 384
    .line 385
    const-string v19, "loadBundle"

    .line 386
    .line 387
    const/16 v21, 0x0

    .line 388
    .line 389
    .line 390
    invoke-static/range {v18 .. v23}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 391
    .line 392
    new-instance v0, Lcom/kubi/rn/core/ReactHostException;

    .line 393
    .line 394
    const-string v2, "Metro \u672a\u542f\u52a8\u6216\u4e0d\u53ef\u8fbe\uff0c\u8bf7\u786e\u8ba4\u672c\u5730\u8c03\u8bd5\u670d\u52a1\u5df2\u5f00\u542f"

    .line 395
    .line 396
    const/16 v7, 0x190

    .line 397
    .line 398
    .line 399
    invoke-direct {v0, v7, v2}, Lcom/kubi/rn/core/ReactHostException;-><init>(ILjava/lang/String;)V

    .line 400
    throw v0

    .line 401
    .line 402
    :cond_a
    const/16 v7, 0x190

    .line 403
    .line 404
    .line 405
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 406
    move-result-wide v9

    .line 407
    .line 408
    :try_start_2
    sget-object v7, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getBiz()Ljava/lang/String;

    .line 412
    move-result-object v15

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Lcom/kubi/rn/core/ReactInitParam;->getEntry()Ljava/lang/String;

    .line 416
    move-result-object v11

    .line 417
    .line 418
    iput-object v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 419
    .line 420
    iput-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 421
    .line 422
    iput-object v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 423
    .line 424
    iput-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 425
    .line 426
    iput v5, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 427
    .line 428
    iput-wide v9, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->J$0:J

    .line 429
    .line 430
    iput v14, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->label:I

    .line 431
    .line 432
    .line 433
    invoke-virtual {v7, v0, v15, v11, v12}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->T(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 434
    move-result-object v7
    :try_end_2
    .catch Lcom/kubi/sdk/pkg/task/TaskException; {:try_start_2 .. :try_end_2} :catch_2

    .line 435
    .line 436
    if-ne v7, v6, :cond_b

    .line 437
    .line 438
    goto/16 :goto_a

    .line 439
    .line 440
    :cond_b
    move-object/from16 v20, v3

    .line 441
    .line 442
    move-wide/from16 v31, v9

    .line 443
    move-object v10, v2

    .line 444
    .line 445
    move-wide/from16 v2, v31

    .line 446
    :goto_4
    :try_start_3
    move-object v9, v7

    .line 447
    .line 448
    check-cast v9, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;

    .line 449
    .line 450
    if-eqz v20, :cond_e

    .line 451
    .line 452
    .line 453
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 454
    move-result-wide v21

    .line 455
    .line 456
    sub-long v22, v21, v2

    .line 457
    .line 458
    .line 459
    invoke-virtual {v10}, Lcom/kubi/rn/core/ReactInitParam;->getBiz()Ljava/lang/String;

    .line 460
    move-result-object v24

    .line 461
    .line 462
    .line 463
    invoke-virtual {v9}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->i()Ljava/lang/String;

    .line 464
    move-result-object v25

    .line 465
    .line 466
    .line 467
    invoke-virtual {v9}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->d()I

    .line 468
    move-result v26

    .line 469
    .line 470
    new-instance v11, Lorg/json/JSONObject;

    .line 471
    .line 472
    .line 473
    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    .line 474
    .line 475
    .line 476
    invoke-virtual {v10}, Lcom/kubi/rn/core/ReactInitParam;->getComponent()Ljava/lang/String;

    .line 477
    move-result-object v15

    .line 478
    .line 479
    .line 480
    invoke-virtual {v11, v8, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 481
    .line 482
    const-string v15, "bundle_url"

    .line 483
    .line 484
    .line 485
    invoke-virtual {v9}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->e()Ljava/lang/String;

    .line 486
    move-result-object v21

    .line 487
    .line 488
    if-nez v21, :cond_c

    .line 489
    move-object v14, v13

    .line 490
    goto :goto_5

    .line 491
    .line 492
    :cond_c
    move-object/from16 v14, v21

    .line 493
    .line 494
    .line 495
    :goto_5
    invoke-virtual {v11, v15, v14}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 496
    .line 497
    const-string v14, "base_version"

    .line 498
    .line 499
    .line 500
    invoke-virtual {v9}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->b()Ljava/lang/String;

    .line 501
    move-result-object v15

    .line 502
    .line 503
    if-nez v15, :cond_d

    .line 504
    move-object v15, v13

    .line 505
    .line 506
    .line 507
    :cond_d
    invoke-virtual {v11, v14, v15}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 508
    .line 509
    const-string v14, "base_bundle_path"

    .line 510
    .line 511
    .line 512
    invoke-virtual {v9}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->a()Ljava/lang/String;

    .line 513
    move-result-object v9

    .line 514
    .line 515
    .line 516
    invoke-virtual {v11, v14, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 517
    .line 518
    sget-object v9, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 519
    .line 520
    .line 521
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 522
    move-result-object v28

    .line 523
    .line 524
    const/16 v29, 0x20

    .line 525
    .line 526
    const/16 v30, 0x0

    .line 527
    .line 528
    const/16 v27, 0x0

    .line 529
    .line 530
    const/16 v21, 0x1

    .line 531
    .line 532
    .line 533
    invoke-static/range {v20 .. v30}, Lcom/kubi/rn/core/KrnFcpTracker;->reportFetchBundle$default(Lcom/kubi/rn/core/KrnFcpTracker;ZJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 534
    goto :goto_6

    .line 535
    :catch_1
    move-exception v0

    .line 536
    .line 537
    move-object/from16 v16, v20

    .line 538
    .line 539
    goto/16 :goto_f

    .line 540
    .line 541
    :cond_e
    :goto_6
    check-cast v7, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;
    :try_end_3
    .catch Lcom/kubi/sdk/pkg/task/TaskException; {:try_start_3 .. :try_end_3} :catch_1

    .line 542
    move-object v13, v10

    .line 543
    .line 544
    move-object/from16 v3, v20

    .line 545
    move-object v8, v4

    .line 546
    move-object v10, v0

    .line 547
    .line 548
    :goto_7
    if-eqz v3, :cond_f

    .line 549
    .line 550
    .line 551
    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->i()Ljava/lang/String;

    .line 552
    move-result-object v0

    .line 553
    .line 554
    .line 555
    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->b()Ljava/lang/String;

    .line 556
    move-result-object v2

    .line 557
    .line 558
    .line 559
    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->a()Ljava/lang/String;

    .line 560
    move-result-object v4

    .line 561
    .line 562
    .line 563
    invoke-virtual {v7}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->f()Ljava/lang/String;

    .line 564
    move-result-object v9

    .line 565
    .line 566
    .line 567
    invoke-virtual {v3, v0, v2, v4, v9}, Lcom/kubi/rn/core/KrnFcpTracker;->recordBundleConfig(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 568
    .line 569
    :cond_f
    if-eqz v3, :cond_10

    .line 570
    .line 571
    .line 572
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 573
    move-result-wide v14

    .line 574
    .line 575
    .line 576
    invoke-virtual {v3, v14, v15}, Lcom/kubi/rn/core/KrnFcpTracker;->setFetchBundleEnd(J)V

    .line 577
    .line 578
    :cond_10
    sget-object v0, Lcom/kubi/rn/core/RnBreadcrumbs;->INSTANCE:Lcom/kubi/rn/core/RnBreadcrumbs;

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v13, v7}, Lcom/kubi/rn/core/RnBreadcrumbs;->bundleConfig(Lcom/kubi/rn/core/ReactInitParam;Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;)V

    .line 582
    .line 583
    if-eqz v3, :cond_11

    .line 584
    .line 585
    .line 586
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 587
    move-result-wide v14

    .line 588
    .line 589
    .line 590
    invoke-virtual {v3, v14, v15}, Lcom/kubi/rn/core/KrnFcpTracker;->setLoadBaseBundleStart(J)V

    .line 591
    .line 592
    :cond_11
    sget-object v0, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 593
    .line 594
    const-string v2, "loadBundle"

    .line 595
    .line 596
    const-string v4, "\u65b0\u521b\u5efarn\u5bb9\u5668\u5b9e\u4f8b"

    .line 597
    .line 598
    .line 599
    invoke-virtual {v0, v2, v4}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 600
    .line 601
    new-instance v4, Lcom/kubi/rn/core/EngineExceptionHandler;

    .line 602
    .line 603
    .line 604
    invoke-direct {v4, v8}, Lcom/kubi/rn/core/EngineExceptionHandler;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    .line 605
    .line 606
    sget-object v0, Lcom/kubi/rn/core/BundleLoader;->instanceCreationMutex:Lrg0/a;

    .line 607
    .line 608
    iput-object v10, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    invoke-static {v13}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 612
    move-result-object v2

    .line 613
    .line 614
    iput-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 615
    .line 616
    iput-object v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    move-result-object v2

    .line 621
    .line 622
    iput-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 623
    .line 624
    iput-object v7, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$4:Ljava/lang/Object;

    .line 625
    .line 626
    iput-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$5:Ljava/lang/Object;

    .line 627
    .line 628
    iput-object v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$6:Ljava/lang/Object;

    .line 629
    .line 630
    iput v5, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 631
    const/4 v2, 0x0

    .line 632
    .line 633
    iput v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$1:I

    .line 634
    const/4 v2, 0x3

    .line 635
    .line 636
    iput v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->label:I

    .line 637
    const/4 v2, 0x0

    .line 638
    .line 639
    .line 640
    invoke-interface {v0, v2, v12}, Lrg0/a;->d(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 641
    move-result-object v9

    .line 642
    .line 643
    if-ne v9, v6, :cond_12

    .line 644
    goto :goto_a

    .line 645
    :cond_12
    move-object v11, v4

    .line 646
    move-object v4, v0

    .line 647
    move v0, v5

    .line 648
    move-object v5, v7

    .line 649
    move-object v7, v13

    .line 650
    move-object v13, v3

    .line 651
    const/4 v3, 0x0

    .line 652
    .line 653
    :goto_8
    :try_start_4
    sget-object v9, Lcom/kubi/rn/core/BundleLoader;->INSTANCE:Lcom/kubi/rn/core/BundleLoader;

    .line 654
    move-object v14, v7

    .line 655
    move-object v7, v9

    .line 656
    .line 657
    .line 658
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->a()Ljava/lang/String;

    .line 659
    move-result-object v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 660
    .line 661
    if-eqz v0, :cond_13

    .line 662
    const/4 v15, 0x1

    .line 663
    goto :goto_9

    .line 664
    :cond_13
    const/4 v15, 0x0

    .line 665
    .line 666
    .line 667
    :goto_9
    :try_start_5
    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 668
    move-result-object v2

    .line 669
    .line 670
    iput-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$0:Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    invoke-static {v14}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 674
    move-result-object v2

    .line 675
    .line 676
    iput-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$1:Ljava/lang/Object;

    .line 677
    .line 678
    iput-object v13, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$2:Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    invoke-static {v8}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    move-result-object v2

    .line 683
    .line 684
    iput-object v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$3:Ljava/lang/Object;

    .line 685
    .line 686
    iput-object v5, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$4:Ljava/lang/Object;

    .line 687
    .line 688
    iput-object v11, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$5:Ljava/lang/Object;

    .line 689
    .line 690
    iput-object v4, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->L$6:Ljava/lang/Object;

    .line 691
    .line 692
    iput v0, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$0:I

    .line 693
    .line 694
    iput v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$1:I

    .line 695
    const/4 v2, 0x0

    .line 696
    .line 697
    iput v2, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->I$2:I

    .line 698
    const/4 v3, 0x4

    .line 699
    .line 700
    iput v3, v12, Lcom/kubi/rn/core/BundleLoader$loadAsync$1;->label:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 701
    move-object v8, v10

    .line 702
    move v10, v15

    .line 703
    const/4 v3, 0x0

    .line 704
    .line 705
    .line 706
    :try_start_6
    invoke-virtual/range {v7 .. v12}, Lcom/kubi/rn/core/BundleLoader;->createReactInstance(Landroid/app/Application;Ljava/lang/String;ZLcom/kubi/rn/core/EngineExceptionHandler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 707
    move-result-object v7

    .line 708
    .line 709
    if-ne v7, v6, :cond_14

    .line 710
    :goto_a
    return-object v6

    .line 711
    :cond_14
    move-object v6, v13

    .line 712
    .line 713
    :goto_b
    check-cast v7, Lcom/facebook/react/ReactInstanceManager;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 714
    .line 715
    .line 716
    invoke-interface {v4, v3}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 717
    .line 718
    if-eqz v6, :cond_15

    .line 719
    .line 720
    .line 721
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 722
    move-result-wide v3

    .line 723
    .line 724
    .line 725
    invoke-virtual {v6, v3, v4}, Lcom/kubi/rn/core/KrnFcpTracker;->setLoadBaseBundleEnd(J)V

    .line 726
    .line 727
    :cond_15
    sget-object v3, Lcom/kubi/rn/core/RNInstanceManagerHolder;->INSTANCE:Lcom/kubi/rn/core/RNInstanceManagerHolder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v3, v7}, Lcom/kubi/rn/core/RNInstanceManagerHolder;->setCurrentInstanceManager(Lcom/facebook/react/ReactInstanceManager;)V

    .line 731
    .line 732
    if-nez v0, :cond_16

    .line 733
    .line 734
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/BundleManager;->a:Lcom/kubi/sdk/pkg/bundle/BundleManager;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v0, v5}, Lcom/kubi/sdk/pkg/bundle/BundleManager;->b0(Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;)V

    .line 738
    .line 739
    .line 740
    :cond_16
    invoke-virtual {v5}, Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;->g()Z

    .line 741
    move-result v0

    .line 742
    .line 743
    if-eqz v0, :cond_17

    .line 744
    const/4 v14, 0x2

    .line 745
    goto :goto_c

    .line 746
    :cond_17
    move v14, v2

    .line 747
    .line 748
    :goto_c
    new-instance v0, Lcom/kubi/rn/core/SplitBundleLoader;

    .line 749
    .line 750
    .line 751
    invoke-direct {v0, v7, v14, v5, v11}, Lcom/kubi/rn/core/SplitBundleLoader;-><init>(Lcom/facebook/react/ReactInstanceManager;ILcom/kubi/sdk/pkg/bundle/LoadBundleConfig;Lcom/kubi/rn/core/EngineExceptionHandler;)V

    .line 752
    return-object v0

    .line 753
    :catchall_1
    move-exception v0

    .line 754
    :goto_d
    move-object v2, v4

    .line 755
    goto :goto_e

    .line 756
    :catchall_2
    move-exception v0

    .line 757
    const/4 v3, 0x0

    .line 758
    goto :goto_d

    .line 759
    :catchall_3
    move-exception v0

    .line 760
    move-object v3, v2

    .line 761
    goto :goto_d

    .line 762
    .line 763
    .line 764
    :goto_e
    invoke-interface {v2, v3}, Lrg0/a;->e(Ljava/lang/Object;)V

    .line 765
    throw v0

    .line 766
    :catch_2
    move-exception v0

    .line 767
    .line 768
    move-object/from16 v16, v3

    .line 769
    .line 770
    move-wide/from16 v31, v9

    .line 771
    move-object v10, v2

    .line 772
    .line 773
    move-wide/from16 v2, v31

    .line 774
    .line 775
    :goto_f
    sget-object v17, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 776
    .line 777
    new-instance v4, Ljava/lang/StringBuilder;

    .line 778
    .line 779
    .line 780
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 781
    .line 782
    const-string v5, "code: "

    .line 783
    .line 784
    .line 785
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskException;->getCode()I

    .line 789
    move-result v5

    .line 790
    .line 791
    .line 792
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 793
    .line 794
    const-string v5, ", message: "

    .line 795
    .line 796
    .line 797
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 798
    .line 799
    .line 800
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 801
    move-result-object v5

    .line 802
    .line 803
    .line 804
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 805
    .line 806
    .line 807
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 808
    move-result-object v19

    .line 809
    .line 810
    const/16 v21, 0x4

    .line 811
    .line 812
    const/16 v22, 0x0

    .line 813
    .line 814
    const-string v18, "loadBundle"

    .line 815
    .line 816
    const/16 v20, 0x0

    .line 817
    .line 818
    .line 819
    invoke-static/range {v17 .. v22}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 820
    .line 821
    if-eqz v16, :cond_1a

    .line 822
    .line 823
    .line 824
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 825
    move-result-wide v4

    .line 826
    .line 827
    sub-long v18, v4, v2

    .line 828
    .line 829
    .line 830
    invoke-virtual {v10}, Lcom/kubi/rn/core/ReactInitParam;->getBiz()Ljava/lang/String;

    .line 831
    move-result-object v20

    .line 832
    .line 833
    .line 834
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 835
    move-result-object v23

    .line 836
    .line 837
    new-instance v2, Lorg/json/JSONObject;

    .line 838
    .line 839
    .line 840
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 841
    .line 842
    .line 843
    invoke-virtual {v10}, Lcom/kubi/rn/core/ReactInitParam;->getComponent()Ljava/lang/String;

    .line 844
    move-result-object v3

    .line 845
    .line 846
    .line 847
    invoke-virtual {v2, v8, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 848
    .line 849
    const-string v3, "task_code"

    .line 850
    .line 851
    .line 852
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskException;->getCode()I

    .line 853
    move-result v4

    .line 854
    .line 855
    .line 856
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 860
    move-result-object v3

    .line 861
    .line 862
    if-eqz v3, :cond_19

    .line 863
    .line 864
    new-instance v4, Ljava/lang/StringBuilder;

    .line 865
    .line 866
    .line 867
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    move-result-object v5

    .line 872
    .line 873
    .line 874
    invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 875
    move-result-object v5

    .line 876
    .line 877
    .line 878
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 879
    .line 880
    const-string v5, ": "

    .line 881
    .line 882
    .line 883
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 884
    .line 885
    .line 886
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 887
    move-result-object v3

    .line 888
    .line 889
    .line 890
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 894
    move-result-object v3

    .line 895
    .line 896
    if-nez v3, :cond_18

    .line 897
    goto :goto_10

    .line 898
    :cond_18
    move-object v13, v3

    .line 899
    .line 900
    :cond_19
    :goto_10
    const-string v3, "cause"

    .line 901
    .line 902
    .line 903
    invoke-virtual {v2, v3, v13}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 904
    .line 905
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 906
    .line 907
    .line 908
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 909
    move-result-object v24

    .line 910
    .line 911
    const/16 v25, 0x8

    .line 912
    .line 913
    const/16 v26, 0x0

    .line 914
    .line 915
    const/16 v17, 0x0

    .line 916
    .line 917
    const/16 v21, 0x0

    .line 918
    .line 919
    const/16 v22, 0x0

    .line 920
    .line 921
    .line 922
    invoke-static/range {v16 .. v26}, Lcom/kubi/rn/core/KrnFcpTracker;->reportFetchBundle$default(Lcom/kubi/rn/core/KrnFcpTracker;ZJLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 923
    .line 924
    .line 925
    :cond_1a
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskException;->getCode()I

    .line 926
    move-result v2

    .line 927
    .line 928
    const/16 v3, 0x57c

    .line 929
    .line 930
    if-ne v2, v3, :cond_1b

    .line 931
    .line 932
    const/16 v9, 0x190

    .line 933
    goto :goto_11

    .line 934
    .line 935
    .line 936
    :cond_1b
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/task/TaskException;->getCode()I

    .line 937
    move-result v9

    .line 938
    .line 939
    :goto_11
    new-instance v2, Lcom/kubi/rn/core/ReactHostException;

    .line 940
    .line 941
    .line 942
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 943
    move-result-object v0

    .line 944
    .line 945
    if-nez v0, :cond_1c

    .line 946
    .line 947
    new-instance v0, Ljava/lang/StringBuilder;

    .line 948
    .line 949
    .line 950
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 951
    .line 952
    .line 953
    invoke-virtual {v10}, Lcom/kubi/rn/core/ReactInitParam;->getBiz()Ljava/lang/String;

    .line 954
    move-result-object v3

    .line 955
    .line 956
    .line 957
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 958
    .line 959
    const-string v3, " \u627e\u4e0d\u5230\u914d\u7f6e\u6587\u4ef6"

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 963
    .line 964
    .line 965
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 966
    move-result-object v0

    .line 967
    .line 968
    .line 969
    :cond_1c
    invoke-direct {v2, v9, v0}, Lcom/kubi/rn/core/ReactHostException;-><init>(ILjava/lang/String;)V

    .line 970
    throw v2
.end method

.method public final prepare(Landroid/app/Application;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Application;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/mvi/common/MviExKt;->m()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p1

    .line 10
    .line 11
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object p1
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
.end method
