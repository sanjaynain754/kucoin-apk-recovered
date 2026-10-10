.class public final Lcom/facebook/imagepipeline/cache/BufferedDiskCache;
.super Ljava/lang/Object;
.source "BufferedDiskCache.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/cache/BufferedDiskCache$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 $2\u00020\u0001:\u0001<B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J&\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0086\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001d\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001b\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020!0\u00172\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\"\u0010#J\u0013\u0010$\u001a\u0008\u0012\u0004\u0012\u00020!0\u0017\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008&\u0010\u0013J%\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\'\u0010\u001aJ%\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008,\u0010-J!\u0010.\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0002\u00a2\u0006\u0004\u0008.\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00106R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u00108R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010:\u00a8\u0006="
    }
    d2 = {
        "Lcom/facebook/imagepipeline/cache/BufferedDiskCache;",
        "",
        "Lr3/e;",
        "fileCache",
        "Lz3/h;",
        "pooledByteBufferFactory",
        "Lz3/k;",
        "pooledByteStreams",
        "Ljava/util/concurrent/Executor;",
        "readExecutor",
        "writeExecutor",
        "Lq5/n;",
        "imageCacheStatsTracker",
        "<init>",
        "(Lr3/e;Lz3/h;Lz3/k;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lq5/n;)V",
        "Lq3/a;",
        "key",
        "",
        "j",
        "(Lq3/a;)Z",
        "k",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isCancelled",
        "Lo0/e;",
        "Lx5/i;",
        "m",
        "(Lq3/a;Ljava/util/concurrent/atomic/AtomicBoolean;)Lo0/e;",
        "",
        "f",
        "(Lq3/a;)V",
        "encodedImage",
        "p",
        "(Lq3/a;Lx5/i;)V",
        "Ljava/lang/Void;",
        "s",
        "(Lq3/a;)Lo0/e;",
        "h",
        "()Lo0/e;",
        "g",
        "n",
        "pinnedImage",
        "l",
        "(Lq3/a;Lx5/i;)Lo0/e;",
        "Lcom/facebook/common/memory/PooledByteBuffer;",
        "r",
        "(Lq3/a;)Lcom/facebook/common/memory/PooledByteBuffer;",
        "u",
        "a",
        "Lr3/e;",
        "b",
        "Lz3/h;",
        "c",
        "Lz3/k;",
        "d",
        "Ljava/util/concurrent/Executor;",
        "e",
        "Lq5/n;",
        "Lq5/t;",
        "Lq5/t;",
        "stagingArea",
        "Companion",
        "imagepipeline_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBufferedDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedDiskCache.kt\ncom/facebook/imagepipeline/cache/BufferedDiskCache\n+ 2 FrescoSystrace.kt\ncom/facebook/imagepipeline/systrace/FrescoSystrace\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n40#2,2:393\n44#2,5:396\n40#2,9:401\n1#3:395\n*S KotlinDebug\n*F\n+ 1 BufferedDiskCache.kt\ncom/facebook/imagepipeline/cache/BufferedDiskCache\n*L\n115#1:393,2\n115#1:396,5\n234#1:401,9\n*E\n"
    }
.end annotation


# static fields
.field public static final h:Lcom/facebook/imagepipeline/cache/BufferedDiskCache$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final i:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lr3/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lz3/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lz3/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/util/concurrent/Executor;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lq5/n;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lq5/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->h:Lcom/facebook/imagepipeline/cache/BufferedDiskCache$Companion;

    .line 9
    .line 10
    const-class v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;

    .line 11
    .line 12
    sput-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 13
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public constructor <init>(Lr3/e;Lz3/h;Lz3/k;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Lq5/n;)V
    .locals 1
    .param p1    # Lr3/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lz3/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lz3/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/util/concurrent/Executor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lq5/n;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "fileCache"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "pooledByteBufferFactory"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string/jumbo v0, "pooledByteStreams"

    .line 15
    .line 16
    .line 17
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string/jumbo v0, "readExecutor"

    .line 21
    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string/jumbo v0, "writeExecutor"

    .line 27
    .line 28
    .line 29
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    const-string v0, "imageCacheStatsTracker"

    .line 32
    .line 33
    .line 34
    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    iput-object p1, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 40
    .line 41
    iput-object p2, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->b:Lz3/h;

    .line 42
    .line 43
    iput-object p3, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->c:Lz3/k;

    .line 44
    .line 45
    iput-object p4, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->d:Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    iput-object p5, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->e:Ljava/util/concurrent/Executor;

    .line 48
    .line 49
    iput-object p6, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lq5/t;->d()Lq5/t;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    const-string p2, "getInstance(...)"

    .line 56
    .line 57
    .line 58
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    iput-object p1, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 61
    return-void
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
.end method

.method public static synthetic a(Lx5/i;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Ljava/io/OutputStream;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->v(Lx5/i;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Ljava/io/OutputStream;)V

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
.end method

.method public static synthetic b(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)Ljava/lang/Void;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->t(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)Ljava/lang/Void;

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
.end method

.method public static synthetic c(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;Lx5/i;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->q(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;Lx5/i;)V

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
.end method

.method public static synthetic d(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)Ljava/lang/Void;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)Ljava/lang/Void;

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
.end method

.method public static synthetic e(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)Lx5/i;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->o(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)Lx5/i;

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
.end method

.method public static final i(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)Ljava/lang/Void;
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v0}, Ly5/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Lq5/t;->a()V

    .line 17
    .line 18
    iget-object p1, p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Lr3/e;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    .line 24
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 25
    return-object v0

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    .line 28
    .line 29
    :try_start_1
    invoke-static {p0, p1}, Ly5/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 30
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 31
    :catchall_1
    move-exception p0

    .line 32
    .line 33
    .line 34
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 35
    throw p0
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public static final o(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)Lx5/i;
    .locals 4

    .line 1
    .line 2
    const-string v0, "$isCancelled"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "this$0"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v0, "$key"

    .line 14
    .line 15
    .line 16
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0}, Ly5/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 25
    move-result p1

    .line 26
    .line 27
    if-nez p1, :cond_3

    .line 28
    .line 29
    iget-object p1, p2, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p3}, Lq5/t;->c(Lq3/a;)Lx5/i;

    .line 33
    move-result-object p1

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 38
    .line 39
    const-string v2, "Found image for %s in staging area"

    .line 40
    .line 41
    .line 42
    invoke-interface {p3}, Lq3/a;->a()Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v2, v3}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    iget-object p2, p2, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 49
    .line 50
    .line 51
    invoke-interface {p2, p3}, Lq5/n;->g(Lq3/a;)V

    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_0
    sget-object p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 57
    .line 58
    const-string v2, "Did not find image for %s in staging area"

    .line 59
    .line 60
    .line 61
    invoke-interface {p3}, Lq3/a;->a()Ljava/lang/String;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-static {p1, v2, v3}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    iget-object p1, p2, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, p3}, Lq5/n;->c(Lq3/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :try_start_1
    invoke-virtual {p2, p3}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->r(Lq3/a;)Lcom/facebook/common/memory/PooledByteBuffer;

    .line 74
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    .line 76
    if-nez p1, :cond_1

    .line 77
    .line 78
    .line 79
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 80
    return-object v0

    .line 81
    .line 82
    .line 83
    :cond_1
    :try_start_2
    invoke-static {p1}, La4/a;->p(Ljava/io/Closeable;)La4/a;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    const-string p2, "of(...)"

    .line 87
    .line 88
    .line 89
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    .line 91
    :try_start_3
    new-instance p2, Lx5/i;

    .line 92
    .line 93
    .line 94
    invoke-direct {p2, p1}, Lx5/i;-><init>(La4/a;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 95
    .line 96
    .line 97
    :try_start_4
    invoke-static {p1}, La4/a;->j(La4/a;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 98
    move-object p1, p2

    .line 99
    .line 100
    .line 101
    :goto_0
    :try_start_5
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 102
    move-result p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 103
    .line 104
    if-nez p2, :cond_2

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 108
    return-object p1

    .line 109
    .line 110
    :cond_2
    :try_start_6
    sget-object p2, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 111
    .line 112
    const-string p3, "Host thread was interrupted, decreasing reference count"

    .line 113
    .line 114
    .line 115
    invoke-static {p2, p3}, Lx3/a;->x(Ljava/lang/Class;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lx5/i;->close()V

    .line 119
    .line 120
    new-instance p1, Ljava/lang/InterruptedException;

    .line 121
    .line 122
    .line 123
    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    .line 124
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 125
    :catchall_1
    move-exception p2

    .line 126
    .line 127
    .line 128
    :try_start_7
    invoke-static {p1}, La4/a;->j(La4/a;)V

    .line 129
    throw p2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 130
    .line 131
    .line 132
    :catch_0
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 133
    return-object v0

    .line 134
    .line 135
    :cond_3
    :try_start_8
    new-instance p1, Ljava/util/concurrent/CancellationException;

    .line 136
    .line 137
    .line 138
    invoke-direct {p1}, Ljava/util/concurrent/CancellationException;-><init>()V

    .line 139
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 140
    .line 141
    .line 142
    :goto_1
    :try_start_9
    invoke-static {p0, p1}, Ly5/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 143
    throw p1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 144
    :catchall_2
    move-exception p0

    .line 145
    .line 146
    .line 147
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 148
    throw p0
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
.end method

.method public static final q(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;Lx5/i;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "$key"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0}, Ly5/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    :try_start_0
    invoke-virtual {p1, p2, p3}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->u(Lq3/a;Lx5/i;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    iget-object p0, p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 22
    .line 23
    .line 24
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2, p3}, Lq5/t;->h(Lq3/a;Lx5/i;)Z

    .line 28
    .line 29
    .line 30
    invoke-static {p3}, Lx5/i;->g(Lx5/i;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception v1

    .line 36
    .line 37
    .line 38
    :try_start_1
    invoke-static {p0, v1}, Ly5/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 39
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    :catchall_1
    move-exception p0

    .line 41
    .line 42
    iget-object p1, p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 43
    .line 44
    .line 45
    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, p2, p3}, Lq5/t;->h(Lq3/a;Lx5/i;)Z

    .line 49
    .line 50
    .line 51
    invoke-static {p3}, Lx5/i;->g(Lx5/i;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v0}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 55
    throw p0
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
.end method

.method public static final t(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)Ljava/lang/Void;
    .locals 3

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "$key"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0}, Ly5/a;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    :try_start_0
    iget-object v2, p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p2}, Lq5/t;->g(Lq3/a;)Z

    .line 22
    .line 23
    iget-object p1, p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 24
    .line 25
    .line 26
    invoke-interface {p1, p2}, Lr3/e;->d(Lq3/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 30
    return-object v0

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    .line 33
    .line 34
    :try_start_1
    invoke-static {p0, p1}, Ly5/a;->c(Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 35
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 36
    :catchall_1
    move-exception p0

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Ly5/a;->f(Ljava/lang/Object;)V

    .line 40
    throw p0
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
.end method

.method public static final v(Lx5/i;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Ljava/io/OutputStream;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "this$0"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-string/jumbo v0, "os"

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lx5/i;->n()Ljava/io/InputStream;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    iget-object p1, p1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->c:Lz3/k;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, p0, p2}, Lz3/k;->a(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    const-string p1, "Required value was null."

    .line 32
    .line 33
    .line 34
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    throw p0
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
.end method


# virtual methods
.method public final f(Lq3/a;)V
    .locals 1
    .param p1    # Lq3/a;
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
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Lr3/e;->b(Lq3/a;)Z

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
.end method

.method public final g(Lq3/a;)Z
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lq5/t;->c(Lq3/a;)Lx5/i;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lx5/i;->close()V

    .line 12
    .line 13
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    const-string v2, "Found image for %s in staging area"

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v2, v1}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    .line 24
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, p1}, Lq5/n;->g(Lq3/a;)V

    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    .line 31
    :cond_0
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    const-string v2, "Did not find image for %s in staging area"

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v2, v1}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 43
    .line 44
    .line 45
    invoke-interface {v0, p1}, Lq5/n;->c(Lq3/a;)V

    .line 46
    .line 47
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 48
    .line 49
    .line 50
    invoke-interface {v0, p1}, Lr3/e;->f(Lq3/a;)Z

    .line 51
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    const/4 p1, 0x0

    .line 54
    :goto_0
    return p1
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
.end method

.method public final h()Lo0/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo0/e<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lq5/t;->a()V

    .line 6
    .line 7
    const-string v0, "BufferedDiskCache_clearAll"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ly5/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    :try_start_0
    new-instance v1, Lq5/d;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v0, p0}, Lq5/d;-><init>(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)V

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->e:Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v0}, Lo0/e;->b(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lo0/e;

    .line 22
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-object v0

    .line 24
    :catch_0
    move-exception v0

    .line 25
    .line 26
    sget-object v1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 27
    const/4 v2, 0x0

    .line 28
    .line 29
    new-array v2, v2, [Ljava/lang/Object;

    .line 30
    .line 31
    const-string v3, "Failed to schedule disk-cache clear"

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v0, v3, v2}, Lx3/a;->H(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lo0/e;->g(Ljava/lang/Exception;)Lo0/e;

    .line 38
    move-result-object v0

    .line 39
    return-object v0
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
.end method

.method public final j(Lq3/a;)Z
    .locals 1
    .param p1    # Lq3/a;
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
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lq5/t;->b(Lq3/a;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, p1}, Lr3/e;->g(Lq3/a;)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    return p1

    .line 25
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 26
    return p1
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
.end method

.method public final k(Lq3/a;)Z
    .locals 1
    .param p1    # Lq3/a;
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
    .line 8
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->j(Lq3/a;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g(Lq3/a;)Z

    .line 17
    move-result p1

    .line 18
    return p1
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public final l(Lq3/a;Lx5/i;)Lo0/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/a;",
            "Lx5/i;",
            ")",
            "Lo0/e<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "Found image for %s in staging area"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2, v1}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Lq5/n;->g(Lq3/a;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p2}, Lo0/e;->h(Ljava/lang/Object;)Lo0/e;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    const-string p2, "forResult(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    return-object p1
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
.end method

.method public final m(Lq3/a;Ljava/util/concurrent/atomic/AtomicBoolean;)Lo0/e;
    .locals 1
    .param p1    # Lq3/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/concurrent/atomic/AtomicBoolean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/a;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            ")",
            "Lo0/e<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "isCancelled"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ld6/b;->d()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_2

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lq5/t;->c(Lq3/a;)Lx5/i;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1, v0}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->l(Lq3/a;Lx5/i;)Lo0/e;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0

    .line 33
    .line 34
    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->n(Lq3/a;Ljava/util/concurrent/atomic/AtomicBoolean;)Lo0/e;

    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    .line 39
    :cond_2
    const-string v0, "BufferedDiskCache#get"

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 43
    .line 44
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lq5/t;->c(Lq3/a;)Lx5/i;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1, v0}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->l(Lq3/a;Lx5/i;)Lo0/e;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-nez v0, :cond_4

    .line 57
    goto :goto_1

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    goto :goto_2

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->n(Lq3/a;Ljava/util/concurrent/atomic/AtomicBoolean;)Lo0/e;

    .line 63
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :cond_4
    invoke-static {}, Ld6/b;->b()V

    .line 67
    return-object v0

    .line 68
    .line 69
    .line 70
    :goto_2
    invoke-static {}, Ld6/b;->b()V

    .line 71
    throw p1
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
.end method

.method public final n(Lq3/a;Ljava/util/concurrent/atomic/AtomicBoolean;)Lo0/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/a;",
            "Ljava/util/concurrent/atomic/AtomicBoolean;",
            ")",
            "Lo0/e<",
            "Lx5/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    const-string v0, "BufferedDiskCache_getAsync"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ly5/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lq5/e;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, v0, p2, p0, p1}, Lq5/e;-><init>(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)V

    .line 12
    .line 13
    iget-object p2, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->d:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    .line 16
    invoke-static {v1, p2}, Lo0/e;->b(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lo0/e;

    .line 17
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    return-object p1

    .line 19
    :catch_0
    move-exception p2

    .line 20
    .line 21
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    const-string v1, "Failed to schedule disk-cache read for %s"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p2, v1, p1}, Lx3/a;->H(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2}, Lo0/e;->g(Ljava/lang/Exception;)Lo0/e;

    .line 38
    move-result-object p1

    .line 39
    return-object p1
    .line 40
    .line 41
    .line 42
.end method

.method public final p(Lq3/a;Lx5/i;)V
    .locals 5
    .param p1    # Lq3/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx5/i;
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
    const-string v0, "encodedImage"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ld6/b;->d()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    const-string v1, "Failed to schedule disk-cache write for %s"

    .line 17
    .line 18
    const-string v2, "BufferedDiskCache_putAsync"

    .line 19
    .line 20
    const-string v3, "Check failed."

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Lx5/i;->E(Lx5/i;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1, p2}, Lq5/t;->f(Lq3/a;Lx5/i;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Lx5/i;->b(Lx5/i;)Lx5/i;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-static {v2}, Ly5/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    iget-object v3, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->e:Ljava/util/concurrent/Executor;

    .line 44
    .line 45
    new-instance v4, Lq5/f;

    .line 46
    .line 47
    .line 48
    invoke-direct {v4, v2, p0, p1, v0}, Lq5/f;-><init>(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;Lx5/i;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    goto :goto_1

    .line 53
    :catch_0
    move-exception v2

    .line 54
    .line 55
    sget-object v3, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v2, v1, v4}, Lx3/a;->H(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    .line 68
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1, p2}, Lq5/t;->h(Lq3/a;Lx5/i;)Z

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Lx5/i;->g(Lx5/i;)V

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    .line 80
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    throw p1

    .line 82
    .line 83
    :cond_1
    const-string v0, "BufferedDiskCache#put"

    .line 84
    .line 85
    .line 86
    invoke-static {v0}, Ld6/b;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :try_start_1
    invoke-static {p2}, Lx5/i;->E(Lx5/i;)Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, p1, p2}, Lq5/t;->f(Lq3/a;Lx5/i;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p2}, Lx5/i;->b(Lx5/i;)Lx5/i;

    .line 101
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    .line 104
    :try_start_2
    invoke-static {v2}, Ly5/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 105
    move-result-object v2

    .line 106
    .line 107
    iget-object v3, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->e:Ljava/util/concurrent/Executor;

    .line 108
    .line 109
    new-instance v4, Lq5/f;

    .line 110
    .line 111
    .line 112
    invoke-direct {v4, v2, p0, p1, v0}, Lq5/f;-><init>(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;Lx5/i;)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v3, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 116
    goto :goto_0

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    goto :goto_2

    .line 119
    :catch_1
    move-exception v2

    .line 120
    .line 121
    :try_start_3
    sget-object v3, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    .line 128
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 129
    move-result-object v4

    .line 130
    .line 131
    .line 132
    invoke-static {v3, v2, v1, v4}, Lx3/a;->H(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 133
    .line 134
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, p1, p2}, Lq5/t;->h(Lq3/a;Lx5/i;)Z

    .line 138
    .line 139
    .line 140
    invoke-static {v0}, Lx5/i;->g(Lx5/i;)V

    .line 141
    .line 142
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 143
    .line 144
    .line 145
    invoke-static {}, Ld6/b;->b()V

    .line 146
    :goto_1
    return-void

    .line 147
    .line 148
    :cond_2
    :try_start_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 149
    .line 150
    .line 151
    invoke-direct {p1, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 152
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 153
    .line 154
    .line 155
    :goto_2
    invoke-static {}, Ld6/b;->b()V

    .line 156
    throw p1
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
.end method

.method public final r(Lq3/a;)Lcom/facebook/common/memory/PooledByteBuffer;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 3
    .line 4
    const-string v1, "Disk cache read for %s"

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 14
    .line 15
    .line 16
    invoke-interface {v1, p1}, Lr3/e;->e(Lq3/a;)Lo3/a;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const-string v1, "Disk cache miss for %s"

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1, v2}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, p1}, Lq5/n;->m(Lq3/a;)V

    .line 34
    const/4 p1, 0x0

    .line 35
    return-object p1

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    const-string v2, "Found entry in disk cache for %s"

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v2, v3}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 47
    .line 48
    iget-object v2, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, p1}, Lq5/n;->d(Lq3/a;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1}, Lo3/a;->a()Ljava/io/InputStream;

    .line 55
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 56
    .line 57
    :try_start_1
    iget-object v3, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->b:Lz3/h;

    .line 58
    .line 59
    .line 60
    invoke-interface {v1}, Lo3/a;->size()J

    .line 61
    move-result-wide v4

    .line 62
    long-to-int v1, v4

    .line 63
    .line 64
    .line 65
    invoke-interface {v3, v2, v1}, Lz3/h;->e(Ljava/io/InputStream;I)Lcom/facebook/common/memory/PooledByteBuffer;

    .line 66
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    .line 68
    .line 69
    :try_start_2
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 70
    .line 71
    const-string v2, "Successful read from disk cache for %s"

    .line 72
    .line 73
    .line 74
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 75
    move-result-object v3

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v2, v3}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    return-object v1

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 84
    throw v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 85
    .line 86
    :goto_0
    sget-object v1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 90
    move-result-object v2

    .line 91
    .line 92
    .line 93
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 94
    move-result-object v2

    .line 95
    .line 96
    const-string v3, "Exception reading from cache for %s"

    .line 97
    .line 98
    .line 99
    invoke-static {v1, v0, v3, v2}, Lx3/a;->H(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 102
    .line 103
    .line 104
    invoke-interface {v1, p1}, Lq5/n;->a(Lq3/a;)V

    .line 105
    throw v0
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
.end method

.method public final s(Lq3/a;)Lo0/e;
    .locals 3
    .param p1    # Lq3/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq3/a;",
            ")",
            "Lo0/e<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "key"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->g:Lq5/t;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lq5/t;->g(Lq3/a;)Z

    .line 11
    .line 12
    :try_start_0
    const-string v0, "BufferedDiskCache_remove"

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Ly5/a;->d(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    new-instance v1, Lq5/c;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v0, p0, p1}, Lq5/c;-><init>(Ljava/lang/Object;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;Lq3/a;)V

    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->e:Ljava/util/concurrent/Executor;

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v0}, Lo0/e;->b(Ljava/util/concurrent/Callable;Ljava/util/concurrent/Executor;)Lo0/e;

    .line 27
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    return-object p1

    .line 29
    :catch_0
    move-exception v0

    .line 30
    .line 31
    sget-object v1, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    const-string v2, "Failed to schedule disk-cache remove for %s"

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0, v2, p1}, Lx3/a;->H(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Lo0/e;->g(Ljava/lang/Exception;)Lo0/e;

    .line 48
    move-result-object p1

    .line 49
    return-object p1
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
.end method

.method public final u(Lq3/a;Lx5/i;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    const-string v2, "About to write to disk-cache for key %s"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v2, v1}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    :try_start_0
    iget-object v1, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->a:Lr3/e;

    .line 14
    .line 15
    new-instance v2, Lq5/g;

    .line 16
    .line 17
    .line 18
    invoke-direct {v2, p2, p0}, Lq5/g;-><init>(Lx5/i;Lcom/facebook/imagepipeline/cache/BufferedDiskCache;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1, p1, v2}, Lr3/e;->c(Lq3/a;Lq3/f;)Lo3/a;

    .line 22
    .line 23
    iget-object p2, p0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->f:Lq5/n;

    .line 24
    .line 25
    .line 26
    invoke-interface {p2, p1}, Lq5/n;->l(Lq3/a;)V

    .line 27
    .line 28
    const-string p2, "Successful disk-cache write for key %s"

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-static {v0, p2, v1}, Lx3/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-void

    .line 37
    :catch_0
    move-exception p2

    .line 38
    .line 39
    sget-object v0, Lcom/facebook/imagepipeline/cache/BufferedDiskCache;->i:Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-interface {p1}, Lq3/a;->a()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    .line 46
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    const-string v1, "Failed to write to disk-cache for key %s"

    .line 50
    .line 51
    .line 52
    invoke-static {v0, p2, v1, p1}, Lx3/a;->H(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    return-void
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
.end method
