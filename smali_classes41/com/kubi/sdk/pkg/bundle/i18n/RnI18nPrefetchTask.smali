.class public final Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;
.super Ljava/lang/Object;
.source "RnI18nPrefetchTask.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$Companion;,
        Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 )2\u00020\u0001:\u0002*\u001fB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ)\u0010\u0013\u001a\u00020\u00122\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J+\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J)\u0010\u001a\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ#\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006+"
    }
    d2 = {
        "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;",
        "",
        "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;",
        "storage",
        "Lcom/kubi/sdk/pkg/bundle/i18n/a;",
        "fetcher",
        "",
        "maxConcurrent",
        "",
        "",
        "inflight",
        "<init>",
        "(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;Lcom/kubi/sdk/pkg/bundle/i18n/a;ILjava/util/Set;)V",
        "",
        "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;",
        "metadata",
        "Lcom/kubi/sdk/pkg/bundle/i18n/b;",
        "locale",
        "",
        "i",
        "(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;",
        "g",
        "(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/b;)Ljava/util/List;",
        "cdn",
        "projectId",
        "f",
        "(Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/b;Ljava/lang/String;)Ljava/lang/String;",
        "item",
        "h",
        "(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "a",
        "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;",
        "b",
        "Lcom/kubi/sdk/pkg/bundle/i18n/a;",
        "c",
        "Ljava/util/Set;",
        "Lrg0/g;",
        "d",
        "Lrg0/g;",
        "semaphore",
        "e",
        "Companion",
        "Package_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nRnI18nPrefetchTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1045#2:162\n1360#2:163\n1446#2,2:164\n1603#2,9:166\n1855#2:175\n1856#2:177\n1612#2:178\n1448#2,3:179\n1#3:176\n*S KotlinDebug\n*F\n+ 1 RnI18nPrefetchTask.kt\ncom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask\n*L\n67#1:162\n68#1:163\n68#1:164,2\n74#1:166,9\n74#1:175\n74#1:177\n74#1:178\n68#1:179,3\n74#1:176\n*E\n"
    }
.end annotation


# static fields
.field public static final e:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final g:I

.field public static final h:Lkotlin/text/Regex;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/kubi/sdk/pkg/bundle/i18n/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lrg0/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->e:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$Companion;

    .line 9
    .line 10
    const-string v0, "rnI18nPrefetch"

    .line 11
    .line 12
    sput-object v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

    .line 13
    const/4 v0, 0x1

    .line 14
    .line 15
    sput v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->g:I

    .line 16
    .line 17
    new-instance v0, Lkotlin/text/Regex;

    .line 18
    .line 19
    const-string v1, "^[A-Za-z0-9._-]+$"

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    sput-object v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->h:Lkotlin/text/Regex;

    .line 25
    return-void
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

.method public constructor <init>(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;Lcom/kubi/sdk/pkg/bundle/i18n/a;ILjava/util/Set;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/pkg/bundle/i18n/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/Set;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;",
            "Lcom/kubi/sdk/pkg/bundle/i18n/a;",
            "I",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "storage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fetcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflight"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->a:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;

    .line 3
    iput-object p2, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->b:Lcom/kubi/sdk/pkg/bundle/i18n/a;

    .line 4
    iput-object p4, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->c:Ljava/util/Set;

    const/4 p1, 0x1

    .line 5
    invoke-static {p3, p1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p1

    const/4 p2, 0x2

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-static {p1, p4, p2, p3}, Lrg0/j;->b(IIILjava/lang/Object;)Lrg0/g;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->d:Lrg0/g;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;Lcom/kubi/sdk/pkg/bundle/i18n/a;ILjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 6
    sget p3, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->g:I

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 7
    new-instance p4, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p4}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    invoke-static {p4}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p4

    const-string p5, "newSetFromMap(Concurrent\u2026shMap<String, Boolean>())"

    invoke-static {p4, p5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;-><init>(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;Lcom/kubi/sdk/pkg/bundle/i18n/a;ILjava/util/Set;)V

    return-void
.end method

.method public static final synthetic a(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->h(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method

.method public static final synthetic b()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->g:I

    .line 3
    return v0
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

.method public static final synthetic c()Lkotlin/text/Regex;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->h:Lkotlin/text/Regex;

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

.method public static final synthetic d(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;)Lrg0/g;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->d:Lrg0/g;

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
.end method

.method public static final synthetic e()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

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


# virtual methods
.method public final f(Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lokhttp3/HttpUrl;->Companion:Lokhttp3/HttpUrl$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lokhttp3/HttpUrl$Companion;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    return-object v0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, "https"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_4

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->username()Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 30
    move-result v1

    .line 31
    .line 32
    if-lez v1, :cond_1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->password()Ljava/lang/String;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 41
    move-result v1

    .line 42
    .line 43
    if-lez v1, :cond_2

    .line 44
    goto :goto_0

    .line 45
    .line 46
    .line 47
    :cond_2
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->query()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    if-nez v1, :cond_4

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->fragment()Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    if-eqz v1, :cond_3

    .line 57
    goto :goto_0

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    const-string v0, "i18n"

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 71
    move-result-object v0

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 83
    move-result-object p1

    .line 84
    .line 85
    new-instance p2, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    const-string p3, ".json"

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    move-result-object p2

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p2}, Lokhttp3/HttpUrl$Builder;->addPathSegment(Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 112
    move-result-object p1

    .line 113
    return-object p1

    .line 114
    :cond_4
    :goto_0
    return-object v0
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
.end method

.method public final g(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/b;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;",
            ">;",
            "Lcom/kubi/sdk/pkg/bundle/i18n/b;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$b;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$b;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-eqz v2, :cond_8

    .line 30
    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    check-cast v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;->getI18n()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 43
    move-result-object v4

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 47
    move-result-object v5

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3, v4, v5}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;->shouldNativePrefetch(Ljava/lang/String;Ljava/lang/String;)Z

    .line 51
    move-result v3

    .line 52
    .line 53
    if-nez v3, :cond_0

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 57
    move-result-object v2

    .line 58
    goto :goto_4

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;->getI18n()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;->getCdn()Ljava/lang/String;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    if-eqz v3, :cond_7

    .line 69
    .line 70
    .line 71
    invoke-static {v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    move-result-object v3

    .line 77
    .line 78
    if-nez v3, :cond_1

    .line 79
    goto :goto_3

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;->getI18n()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nMeta;->projectIds()Ljava/util/List;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    new-instance v4, Ljava/util/ArrayList;

    .line 90
    .line 91
    .line 92
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    .line 99
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    move-result v5

    .line 101
    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    move-result-object v5

    .line 107
    .line 108
    check-cast v5, Ljava/lang/String;

    .line 109
    .line 110
    sget-object v6, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->h:Lkotlin/text/Regex;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v5}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 114
    move-result v6

    .line 115
    const/4 v7, 0x0

    .line 116
    .line 117
    if-eqz v6, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 121
    move-result v6

    .line 122
    .line 123
    if-nez v6, :cond_3

    .line 124
    goto :goto_2

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-virtual {p0, v3, p2, v5}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f(Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/b;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    move-result-object v6

    .line 129
    .line 130
    if-nez v6, :cond_4

    .line 131
    goto :goto_2

    .line 132
    .line 133
    :cond_4
    new-instance v7, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;

    .line 134
    .line 135
    .line 136
    invoke-direct {v7, v5, v6}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    :cond_5
    :goto_2
    if-eqz v7, :cond_2

    .line 139
    .line 140
    .line 141
    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 142
    goto :goto_1

    .line 143
    :cond_6
    move-object v2, v4

    .line 144
    goto :goto_4

    .line 145
    .line 146
    .line 147
    :cond_7
    :goto_3
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 148
    move-result-object v2

    .line 149
    .line 150
    .line 151
    :goto_4
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 152
    .line 153
    goto/16 :goto_0

    .line 154
    :cond_8
    return-object v1
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

.method public final h(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;",
            "Lcom/kubi/sdk/pkg/bundle/i18n/b;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p3, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p3

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p3}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;-><init>(Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p3, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->label:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$3:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/String;

    .line 42
    .line 43
    iget-object p2, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$2:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Lcom/kubi/sdk/pkg/bundle/i18n/b;

    .line 46
    .line 47
    iget-object v1, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$1:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;

    .line 50
    .line 51
    iget-object v0, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$0:Ljava/lang/Object;

    .line 52
    move-object v2, v0

    .line 53
    .line 54
    check-cast v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;

    .line 55
    .line 56
    .line 57
    :try_start_0
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    move-object v0, p3

    .line 59
    move-object p3, p1

    .line 60
    move-object p1, v1

    .line 61
    .line 62
    goto/16 :goto_2

    .line 63
    :catchall_0
    move-exception v0

    .line 64
    move-object p2, v0

    .line 65
    move-object p3, p1

    .line 66
    move-object p1, v1

    .line 67
    .line 68
    goto/16 :goto_7

    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object p2, v0

    .line 71
    .line 72
    goto/16 :goto_9

    .line 73
    .line 74
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    .line 79
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    throw p1

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    new-instance p3, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 92
    move-result-object v2

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    const/16 v2, 0x7c

    .line 98
    .line 99
    .line 100
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    .line 107
    invoke-virtual {p3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    .line 117
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 121
    move-result-object p3

    .line 122
    .line 123
    iget-object v2, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->c:Ljava/util/Set;

    .line 124
    .line 125
    .line 126
    invoke-interface {v2, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 127
    move-result v2

    .line 128
    .line 129
    if-nez v2, :cond_3

    .line 130
    .line 131
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 132
    return-object p1

    .line 133
    .line 134
    :cond_3
    iget-object v2, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->a:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 138
    move-result-object v4

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 142
    move-result-object v5

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 146
    move-result-object v6

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v4, v5, v6}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/JsonObject;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    if-nez v2, :cond_4

    .line 153
    .line 154
    new-instance v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;

    .line 155
    const/4 v4, 0x3

    .line 156
    const/4 v5, 0x0

    .line 157
    .line 158
    .line 159
    invoke-direct {v2, v5, v5, v4, v5}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 160
    goto :goto_1

    .line 161
    .line 162
    :cond_4
    iget-object v2, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->a:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 166
    move-result-object v4

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 170
    move-result-object v5

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 174
    move-result-object v6

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v4, v5, v6}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;

    .line 178
    move-result-object v2

    .line 179
    .line 180
    :goto_1
    :try_start_1
    iget-object v4, p0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->b:Lcom/kubi/sdk/pkg/bundle/i18n/a;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->b()Ljava/lang/String;

    .line 184
    move-result-object v5

    .line 185
    .line 186
    iput-object p0, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$0:Ljava/lang/Object;

    .line 187
    .line 188
    iput-object p1, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$1:Ljava/lang/Object;

    .line 189
    .line 190
    iput-object p2, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$2:Ljava/lang/Object;

    .line 191
    .line 192
    iput-object p3, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->L$3:Ljava/lang/Object;

    .line 193
    .line 194
    iput v3, v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$download$1;->label:I

    .line 195
    .line 196
    .line 197
    invoke-interface {v4, v5, v2, v0}, Lcom/kubi/sdk/pkg/bundle/i18n/a;->a(Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 198
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 199
    .line 200
    if-ne v0, v1, :cond_5

    .line 201
    return-object v1

    .line 202
    :cond_5
    move-object v2, p0

    .line 203
    .line 204
    :goto_2
    :try_start_2
    check-cast v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpResult;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpResult;->getNotModified()Z

    .line 208
    move-result v1

    .line 209
    .line 210
    if-eqz v1, :cond_7

    .line 211
    .line 212
    iget-object v1, v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->a:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 216
    move-result-object v3

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 220
    move-result-object v4

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 224
    move-result-object p2

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpResult;->getValidator()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;

    .line 228
    move-result-object v0

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v3, v4, p2, v0}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;)Z

    .line 232
    move-result p2

    .line 233
    .line 234
    if-eqz p2, :cond_6

    .line 235
    .line 236
    sget-object p2, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 237
    .line 238
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

    .line 239
    .line 240
    new-instance v1, Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    const-string v3, "i18n CDN \u672a\u53d8\u5316: "

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 252
    move-result-object v3

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 259
    move-result-object v1

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2, v0, v1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 263
    goto :goto_4

    .line 264
    :catchall_1
    move-exception v0

    .line 265
    move-object p2, v0

    .line 266
    .line 267
    goto/16 :goto_7

    .line 268
    :catch_1
    move-exception v0

    .line 269
    move-object p2, v0

    .line 270
    :goto_3
    move-object p1, p3

    .line 271
    .line 272
    goto/16 :goto_9

    .line 273
    .line 274
    :cond_6
    sget-object v3, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 275
    .line 276
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

    .line 277
    .line 278
    new-instance p2, Ljava/lang/StringBuilder;

    .line 279
    .line 280
    .line 281
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 282
    .line 283
    const-string v0, "i18n 304 \u672c\u5730\u6587\u4ef6\u4e0d\u53ef\u7528\uff0c\u8df3\u8fc7\u91cd\u590d\u8bf7\u6c42: "

    .line 284
    .line 285
    .line 286
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 290
    move-result-object v0

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 294
    .line 295
    .line 296
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 297
    move-result-object v5

    .line 298
    const/4 v7, 0x4

    .line 299
    const/4 v8, 0x0

    .line 300
    const/4 v6, 0x0

    .line 301
    .line 302
    .line 303
    invoke-static/range {v3 .. v8}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 304
    .line 305
    :goto_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 306
    .line 307
    :goto_5
    iget-object p2, v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->c:Ljava/util/Set;

    .line 308
    .line 309
    .line 310
    invoke-interface {p2, p3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 311
    return-object p1

    .line 312
    .line 313
    .line 314
    :cond_7
    :try_start_3
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpResult;->getBody()Ljava/lang/String;

    .line 315
    move-result-object v7

    .line 316
    .line 317
    if-nez v7, :cond_8

    .line 318
    .line 319
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 320
    goto :goto_5

    .line 321
    .line 322
    :cond_8
    iget-object v3, v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->a:Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;

    .line 323
    .line 324
    .line 325
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 326
    move-result-object v4

    .line 327
    .line 328
    .line 329
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 330
    move-result-object v5

    .line 331
    .line 332
    .line 333
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 334
    move-result-object v6

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpResult;->getValidator()Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;

    .line 338
    move-result-object v8

    .line 339
    .line 340
    .line 341
    invoke-virtual/range {v3 .. v8}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nStorage;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nHttpValidator;)Z

    .line 342
    move-result v0

    .line 343
    .line 344
    if-eqz v0, :cond_9

    .line 345
    .line 346
    sget-object v0, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 347
    .line 348
    sget-object v1, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

    .line 349
    .line 350
    new-instance v3, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    .line 353
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 354
    .line 355
    const-string v4, "i18n \u9884\u53d6\u6210\u529f: "

    .line 356
    .line 357
    .line 358
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 362
    move-result-object v4

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    const/16 v4, 0x5f

    .line 368
    .line 369
    .line 370
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 374
    move-result-object v5

    .line 375
    .line 376
    .line 377
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 384
    move-result-object p2

    .line 385
    .line 386
    .line 387
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 391
    move-result-object p2

    .line 392
    .line 393
    .line 394
    invoke-virtual {v0, v1, p2}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 395
    goto :goto_6

    .line 396
    .line 397
    :cond_9
    sget-object v3, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 398
    .line 399
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

    .line 400
    .line 401
    new-instance p2, Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 405
    .line 406
    const-string v0, "i18n \u54cd\u5e94\u4e0d\u662f\u5408\u6cd5 JSON \u5bf9\u8c61: "

    .line 407
    .line 408
    .line 409
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 413
    move-result-object v0

    .line 414
    .line 415
    .line 416
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 420
    move-result-object v5

    .line 421
    const/4 v7, 0x4

    .line 422
    const/4 v8, 0x0

    .line 423
    const/4 v6, 0x0

    .line 424
    .line 425
    .line 426
    invoke-static/range {v3 .. v8}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 427
    .line 428
    :goto_6
    iget-object p1, v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->c:Ljava/util/Set;

    .line 429
    .line 430
    .line 431
    invoke-interface {p1, p3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 432
    goto :goto_8

    .line 433
    :catchall_2
    move-exception v0

    .line 434
    move-object p2, v0

    .line 435
    move-object v2, p0

    .line 436
    goto :goto_7

    .line 437
    :catch_2
    move-exception v0

    .line 438
    move-object p2, v0

    .line 439
    move-object v2, p0

    .line 440
    .line 441
    goto/16 :goto_3

    .line 442
    .line 443
    :goto_7
    :try_start_4
    sget-object v3, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 444
    .line 445
    sget-object v4, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

    .line 446
    .line 447
    new-instance v0, Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 451
    .line 452
    const-string v1, "i18n \u9884\u53d6\u5931\u8d25: "

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {p1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$a;->a()Ljava/lang/String;

    .line 459
    move-result-object p1

    .line 460
    .line 461
    .line 462
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 463
    .line 464
    const-string p1, ", "

    .line 465
    .line 466
    .line 467
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 468
    .line 469
    .line 470
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 471
    move-result-object p1

    .line 472
    .line 473
    .line 474
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    move-result-object v5

    .line 479
    const/4 v7, 0x4

    .line 480
    const/4 v8, 0x0

    .line 481
    const/4 v6, 0x0

    .line 482
    .line 483
    .line 484
    invoke-static/range {v3 .. v8}, Lcom/kubi/sdk/pkg/util/b;->d(Lcom/kubi/sdk/pkg/util/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 485
    goto :goto_6

    .line 486
    .line 487
    :goto_8
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 488
    return-object p1

    .line 489
    :catchall_3
    move-exception v0

    .line 490
    move-object p1, v0

    .line 491
    goto :goto_a

    .line 492
    :goto_9
    :try_start_5
    throw p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 493
    :catchall_4
    move-exception v0

    .line 494
    move-object p2, v0

    .line 495
    move-object p3, p1

    .line 496
    move-object p1, p2

    .line 497
    .line 498
    :goto_a
    iget-object p2, v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->c:Ljava/util/Set;

    .line 499
    .line 500
    .line 501
    invoke-interface {p2, p3}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 502
    throw p1
.end method

.method public final i(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/sdk/pkg/bundle/i18n/b;
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
            "Ljava/util/List<",
            "Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nBundleMeta;",
            ">;",
            "Lcom/kubi/sdk/pkg/bundle/i18n/b;",
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
    sget-object v0, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->h:Lkotlin/text/Regex;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 10
    move-result v1

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-nez v0, :cond_0

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->g(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/b;)Ljava/util/List;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sget-object v1, Lcom/kubi/sdk/pkg/util/b;->a:Lcom/kubi/sdk/pkg/util/b;

    .line 30
    .line 31
    sget-object v2, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;->f:Ljava/lang/String;

    .line 32
    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    const-string v4, "i18n \u9884\u53d6\u8ba1\u5212: metadata="

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 45
    move-result p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    const-string p1, ", eligibleFiles="

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 57
    move-result p1

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string p1, ", context="

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->b()Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const/16 p1, 0x2f

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p2}, Lcom/kubi/sdk/pkg/bundle/i18n/b;->a()Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1, v2, p1}, Lcom/kubi/sdk/pkg/util/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    new-instance p1, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$execute$2;

    .line 94
    const/4 v1, 0x0

    .line 95
    .line 96
    .line 97
    invoke-direct {p1, v0, p0, p2, v1}, Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask$execute$2;-><init>(Ljava/util/List;Lcom/kubi/sdk/pkg/bundle/i18n/RnI18nPrefetchTask;Lcom/kubi/sdk/pkg/bundle/i18n/b;Lkotlin/coroutines/Continuation;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p1, p3}, Lkotlinx/coroutines/n0;->f(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 105
    move-result-object p2

    .line 106
    .line 107
    if-ne p1, p2, :cond_1

    .line 108
    return-object p1

    .line 109
    .line 110
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 111
    return-object p1

    .line 112
    .line 113
    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 114
    return-object p1
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
.end method
