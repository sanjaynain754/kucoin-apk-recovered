.class public final Lcom/kubi/kumex/record/filter/AssetFilterHelper;
.super Ljava/lang/Object;
.source "RecordFilterHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J \u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u001d2\u0006\u0010 \u001a\u00020\tH\u0002J\"\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010 \u001a\u00020\t2\n\u0008\u0002\u0010%\u001a\u0004\u0018\u00010&JF\u0010\'\u001a\u0012\u0012\u0004\u0012\u00020(0\u0005j\u0008\u0012\u0004\u0012\u00020(`\n2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u000200J?\u00101\u001a\u0008\u0012\u0004\u0012\u000203022\u0006\u0010)\u001a\u00020*2\u000c\u00104\u001a\u0008\u0012\u0004\u0012\u0002050\u00082\u0006\u0010/\u001a\u0002002\u0006\u0010.\u001a\u00020\t2\u0006\u00106\u001a\u00020\t\u00a2\u0006\u0002\u00107RO\u0010\u0004\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00060\u0005j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0006`\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000cR+\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\u0008\u0012\u0004\u0012\u00020\t`\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000e\u001a\u0004\u0008\u0012\u0010\u0013RO\u0010\u0015\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00060\u0005j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0006`\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u000e\u001a\u0004\u0008\u0016\u0010\u000cR+\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0010j\u0008\u0012\u0004\u0012\u00020\t`\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u000e\u001a\u0004\u0008\u0019\u0010\u0013RF\u0010\u001b\u001a:\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d0\u001cj\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\u001d`\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"
    }
    d2 = {
        "Lcom/kubi/kumex/record/filter/AssetFilterHelper;",
        "",
        "<init>",
        "()V",
        "groupListSelf",
        "Ljava/util/ArrayList;",
        "Lkotlin/Pair;",
        "",
        "",
        "",
        "Lkotlin/collections/ArrayList;",
        "getGroupListSelf",
        "()Ljava/util/ArrayList;",
        "groupListSelf$delegate",
        "Lkotlin/Lazy;",
        "groupAllListSelf",
        "Ljava/util/HashSet;",
        "Lkotlin/collections/HashSet;",
        "getGroupAllListSelf",
        "()Ljava/util/HashSet;",
        "groupAllListSelf$delegate",
        "groupListTrial",
        "getGroupListTrial",
        "groupListTrial$delegate",
        "groupAllListTrial",
        "getGroupAllListTrial",
        "groupAllListTrial$delegate",
        "cacheFilterTypeList",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "getFilterTypeList",
        "type",
        "fetchFilterTypeList",
        "",
        "coroutineScope",
        "Lkotlinx/coroutines/CoroutineScope;",
        "callBack",
        "Lio/reactivex/functions/Action;",
        "getFilterDataByType",
        "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;",
        "context",
        "Landroid/content/Context;",
        "sideType",
        "timeType",
        "initFundsType",
        "bizType",
        "isSameFundsType",
        "",
        "groupList",
        "",
        "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$FilterGroupList;",
        "filterData",
        "Lcom/kubi/resources/widget/drop/FilterType$IFilter;",
        "fundsType",
        "(Landroid/content/Context;[Lcom/kubi/resources/widget/drop/FilterType$IFilter;ZLjava/lang/String;Ljava/lang/String;)Ljava/util/List;",
        "KumexLib_googleRelease"
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
        "SMAP\nRecordFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordFilterHelper.kt\ncom/kubi/kumex/record/filter/AssetFilterHelper\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n47#2,4:244\n13472#3,2:248\n13472#3,2:250\n13472#3,2:252\n13472#3,2:254\n3829#3:259\n4344#3,2:260\n4154#3:263\n4254#3,2:264\n1563#4:256\n1634#4,2:257\n1636#4:262\n1869#4:266\n1869#4,2:267\n1870#4:269\n1869#4,2:270\n1869#4,2:272\n*S KotlinDebug\n*F\n+ 1 RecordFilterHelper.kt\ncom/kubi/kumex/record/filter/AssetFilterHelper\n*L\n101#1:244,4\n139#1:248,2\n152#1:250,2\n164#1:252,2\n174#1:254,2\n196#1:259\n196#1:260,2\n207#1:263\n207#1:264,2\n193#1:256\n193#1:257,2\n193#1:262\n221#1:266\n222#1:267,2\n221#1:269\n53#1:270,2\n74#1:272,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/kumex/record/filter/AssetFilterHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->a:Lcom/kubi/kumex/record/filter/AssetFilterHelper;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/kumex/record/filter/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/kumex/record/filter/a;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->b:Lkotlin/Lazy;

    .line 19
    .line 20
    new-instance v0, Lcom/kubi/kumex/record/filter/b;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/kubi/kumex/record/filter/b;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    sput-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->c:Lkotlin/Lazy;

    .line 30
    .line 31
    new-instance v0, Lcom/kubi/kumex/record/filter/c;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Lcom/kubi/kumex/record/filter/c;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    sput-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->d:Lkotlin/Lazy;

    .line 41
    .line 42
    new-instance v0, Lcom/kubi/kumex/record/filter/d;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Lcom/kubi/kumex/record/filter/d;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    sput-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->e:Lkotlin/Lazy;

    .line 52
    .line 53
    new-instance v0, Ljava/util/HashMap;

    .line 54
    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    sput-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->f:Ljava/util/HashMap;

    .line 59
    return-void
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
.end method

.method public constructor <init>()V
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
.end method

.method public static synthetic a()Ljava/util/HashSet;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->o()Ljava/util/HashSet;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic b()Ljava/util/HashSet;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->n()Ljava/util/HashSet;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic c()Ljava/util/ArrayList;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->q()Ljava/util/ArrayList;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic d()Ljava/util/ArrayList;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->r()Ljava/util/ArrayList;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final synthetic e()Ljava/util/HashMap;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->f:Ljava/util/HashMap;

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
.end method

.method public static synthetic g(Lcom/kubi/kumex/record/filter/AssetFilterHelper;Lkotlinx/coroutines/m0;Ljava/lang/String;Lio/reactivex/functions/Action;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p4, p4, 0x4

    .line 3
    .line 4
    if-eqz p4, :cond_0

    .line 5
    const/4 p3, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->f(Lkotlinx/coroutines/m0;Ljava/lang/String;Lio/reactivex/functions/Action;)V

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
.end method

.method public static final n()Ljava/util/HashSet;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->a:Lcom/kubi/kumex/record/filter/AssetFilterHelper;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->l()Ljava/util/ArrayList;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final o()Ljava/util/HashSet;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/util/HashSet;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->a:Lcom/kubi/kumex/record/filter/AssetFilterHelper;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->m()Ljava/util/ArrayList;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Lkotlin/Pair;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    return-object v0
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final q()Ljava/util/ArrayList;
    .locals 9

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lkotlin/Pair;

    .line 8
    .line 9
    sget v2, Lcom/kubi/kumex/R$string;->assets_most_used:I

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    const-string v7, "TAX"

    .line 16
    .line 17
    const-string v8, "TRIAL_WITHDRAW"

    .line 18
    .line 19
    const-string v3, "PNL"

    .line 20
    .line 21
    const-string v4, "FUNDING_FEE"

    .line 22
    .line 23
    const-string v5, "TRANSFER"

    .line 24
    .line 25
    const-string v6, "TRADE_FEE"

    .line 26
    .line 27
    .line 28
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 29
    move-result-object v3

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    return-object v0
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
.end method

.method public static final r()Ljava/util/ArrayList;
    .locals 8

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lkotlin/Pair;

    .line 8
    .line 9
    sget v2, Lcom/kubi/kumex/R$string;->assets_most_used:I

    .line 10
    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    const-string v3, "FUNDING_FEE"

    .line 16
    .line 17
    const-string v4, "RECYCLE"

    .line 18
    .line 19
    const-string v5, "REWARD"

    .line 20
    .line 21
    const-string v6, "PNL"

    .line 22
    .line 23
    const-string v7, "TRADE_FEE"

    .line 24
    .line 25
    .line 26
    filled-new-array {v5, v6, v7, v3, v4}, [Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    return-object v0
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
.method public final f(Lkotlinx/coroutines/m0;Ljava/lang/String;Lio/reactivex/functions/Action;)V
    .locals 9
    .param p1    # Lkotlinx/coroutines/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "coroutineScope"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "type"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    sget-object v1, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    move-result-object v0

    .line 32
    .line 33
    sget-object v1, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->f:Ljava/util/HashMap;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Ljava/util/Map;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 45
    move-result v1

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_0
    if-eqz p3, :cond_1

    .line 51
    .line 52
    .line 53
    invoke-interface {p3}, Lio/reactivex/functions/Action;->run()V

    .line 54
    :cond_1
    return-void

    .line 55
    .line 56
    :cond_2
    :goto_0
    sget-object v1, Lkotlinx/coroutines/CoroutineExceptionHandler;->M0:Lkotlinx/coroutines/CoroutineExceptionHandler$a;

    .line 57
    .line 58
    new-instance v2, Lcom/kubi/kumex/record/filter/AssetFilterHelper$a;

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, v1, p3}, Lcom/kubi/kumex/record/filter/AssetFilterHelper$a;-><init>(Lkotlinx/coroutines/CoroutineExceptionHandler$a;Lio/reactivex/functions/Action;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lo00/a;->b()Lkotlinx/coroutines/j0;

    .line 65
    move-result-object v1

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Lkotlin/coroutines/AbstractCoroutineContextElement;->plus(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;

    .line 69
    move-result-object v4

    .line 70
    .line 71
    new-instance v6, Lcom/kubi/kumex/record/filter/AssetFilterHelper$fetchFilterTypeList$1;

    .line 72
    const/4 v1, 0x0

    .line 73
    .line 74
    .line 75
    invoke-direct {v6, p2, v0, p3, v1}, Lcom/kubi/kumex/record/filter/AssetFilterHelper$fetchFilterTypeList$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/reactivex/functions/Action;Lkotlin/coroutines/Continuation;)V

    .line 76
    const/4 v7, 0x2

    .line 77
    const/4 v8, 0x0

    .line 78
    const/4 v5, 0x0

    .line 79
    move-object v3, p1

    .line 80
    .line 81
    .line 82
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 83
    return-void
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
.end method

.method public final h(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/ArrayList;
    .locals 16
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/ArrayList<",
            "Lcom/kubi/resources/widget/drop/a$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    move-object/from16 v3, p4

    .line 9
    .line 10
    const-string v4, "context"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    const-string v4, "sideType"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    const-string v4, "timeType"

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    const-string v4, "initFundsType"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    const-string v4, "bizType"

    .line 31
    .line 32
    move-object/from16 v5, p5

    .line 33
    .line 34
    .line 35
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    new-instance v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    new-instance v6, Lcom/kubi/resources/widget/drop/a$a;

    .line 43
    .line 44
    sget v7, Lcom/kubi/kumex/R$string;->direction:I

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    new-instance v8, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 51
    .line 52
    sget v9, Lcom/kubi/kumex/R$string;->all:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 56
    move-result-object v9

    .line 57
    .line 58
    const-string v10, "getString(...)"

    .line 59
    .line 60
    .line 61
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    const-string v11, ""

    .line 64
    .line 65
    .line 66
    invoke-direct {v8, v9, v11}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    new-instance v9, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 69
    .line 70
    sget v12, Lcom/kubi/kumex/R$string;->in_account:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 74
    move-result-object v12

    .line 75
    .line 76
    .line 77
    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    const-string v13, "IN"

    .line 80
    .line 81
    .line 82
    invoke-direct {v9, v12, v13}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 83
    .line 84
    new-instance v12, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 85
    .line 86
    sget v13, Lcom/kubi/kumex/R$string;->out_account:I

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 90
    move-result-object v13

    .line 91
    .line 92
    .line 93
    invoke-static {v13, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    const-string v14, "OUT"

    .line 96
    .line 97
    .line 98
    invoke-direct {v12, v13, v14}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    filled-new-array {v8, v9, v12}, [Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 102
    move-result-object v8

    .line 103
    .line 104
    check-cast v8, [Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 105
    .line 106
    .line 107
    invoke-direct {v6, v7, v8}, Lcom/kubi/resources/widget/drop/a$a;-><init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6}, Lcom/kubi/resources/widget/drop/a$a;->b()[Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 111
    move-result-object v7

    .line 112
    .line 113
    const-string v8, "getList(...)"

    .line 114
    .line 115
    .line 116
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    array-length v9, v7

    .line 118
    const/4 v12, 0x0

    .line 119
    move v13, v12

    .line 120
    .line 121
    :goto_0
    if-ge v13, v9, :cond_0

    .line 122
    .line 123
    aget-object v14, v7, v13

    .line 124
    .line 125
    .line 126
    invoke-interface {v14}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 127
    move-result-object v15

    .line 128
    .line 129
    .line 130
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 131
    move-result v15

    .line 132
    .line 133
    .line 134
    invoke-interface {v14, v15}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 135
    .line 136
    add-int/lit8 v13, v13, 0x1

    .line 137
    goto :goto_0

    .line 138
    .line 139
    .line 140
    :cond_0
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    new-instance v1, Lcom/kubi/resources/widget/drop/a$a;

    .line 143
    .line 144
    sget v6, Lcom/kubi/kumex/R$string;->time:I

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 148
    move-result-object v6

    .line 149
    .line 150
    new-instance v7, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 151
    .line 152
    sget v9, Lcom/kubi/kumex/R$string;->one_week:I

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 156
    move-result-object v9

    .line 157
    .line 158
    .line 159
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    .line 161
    const-string v13, "ONE_WEEK"

    .line 162
    .line 163
    .line 164
    invoke-direct {v7, v9, v13}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 165
    .line 166
    new-instance v9, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 167
    .line 168
    sget v13, Lcom/kubi/kumex/R$string;->half_month:I

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 172
    move-result-object v13

    .line 173
    .line 174
    .line 175
    invoke-static {v13, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    const-string v14, "HALF_MONTH"

    .line 178
    .line 179
    .line 180
    invoke-direct {v9, v13, v14}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    new-instance v13, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 183
    .line 184
    sget v14, Lcom/kubi/kumex/R$string;->one_month:I

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 188
    move-result-object v14

    .line 189
    .line 190
    .line 191
    invoke-static {v14, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    const-string v15, "ONE_MONTH"

    .line 194
    .line 195
    .line 196
    invoke-direct {v13, v14, v15}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    filled-new-array {v7, v9, v13}, [Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 200
    move-result-object v7

    .line 201
    .line 202
    check-cast v7, [Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 203
    .line 204
    .line 205
    invoke-direct {v1, v6, v7}, Lcom/kubi/resources/widget/drop/a$a;-><init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Lcom/kubi/resources/widget/drop/a$a;->b()[Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 209
    move-result-object v6

    .line 210
    .line 211
    .line 212
    invoke-static {v6, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    array-length v7, v6

    .line 214
    move v9, v12

    .line 215
    .line 216
    :goto_1
    if-ge v9, v7, :cond_1

    .line 217
    .line 218
    aget-object v13, v6, v9

    .line 219
    .line 220
    .line 221
    invoke-interface {v13}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 222
    move-result-object v14

    .line 223
    .line 224
    .line 225
    invoke-static {v14, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    move-result v14

    .line 227
    .line 228
    .line 229
    invoke-interface {v13, v14}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 230
    .line 231
    add-int/lit8 v9, v9, 0x1

    .line 232
    goto :goto_1

    .line 233
    .line 234
    .line 235
    :cond_1
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    new-instance v1, Lcom/kubi/resources/widget/drop/a$a;

    .line 238
    .line 239
    sget v2, Lcom/kubi/kumex/R$string;->kumex_funds_type:I

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 243
    move-result-object v2

    .line 244
    .line 245
    new-instance v6, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 246
    .line 247
    sget v7, Lcom/kubi/kumex/R$string;->kumex_self_balance:I

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 251
    move-result-object v7

    .line 252
    .line 253
    .line 254
    invoke-static {v7, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 255
    .line 256
    const-string v9, "selfFunds"

    .line 257
    .line 258
    .line 259
    invoke-direct {v6, v7, v9}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    new-instance v7, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 262
    .line 263
    sget v9, Lcom/kubi/kumex/R$string;->kumex_trial_balance:I

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 267
    move-result-object v9

    .line 268
    .line 269
    .line 270
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    const-string v10, "trialFunds"

    .line 273
    .line 274
    .line 275
    invoke-direct {v7, v9, v10}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    filled-new-array {v6, v7}, [Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 279
    move-result-object v6

    .line 280
    .line 281
    check-cast v6, [Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 282
    .line 283
    .line 284
    invoke-direct {v1, v2, v6}, Lcom/kubi/resources/widget/drop/a$a;-><init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1}, Lcom/kubi/resources/widget/drop/a$a;->b()[Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 288
    move-result-object v2

    .line 289
    .line 290
    .line 291
    invoke-static {v2, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    array-length v6, v2

    .line 293
    move v7, v12

    .line 294
    .line 295
    :goto_2
    if-ge v7, v6, :cond_2

    .line 296
    .line 297
    aget-object v9, v2, v7

    .line 298
    .line 299
    .line 300
    invoke-interface {v9}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 301
    move-result-object v10

    .line 302
    .line 303
    .line 304
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 305
    move-result v10

    .line 306
    .line 307
    .line 308
    invoke-interface {v9, v10}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 309
    .line 310
    add-int/lit8 v7, v7, 0x1

    .line 311
    goto :goto_2

    .line 312
    .line 313
    .line 314
    :cond_2
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 315
    .line 316
    move-object/from16 v1, p0

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1, v3}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->i(Ljava/lang/String;)Ljava/util/Map;

    .line 320
    move-result-object v2

    .line 321
    .line 322
    if-nez v2, :cond_3

    .line 323
    .line 324
    .line 325
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 326
    move-result-object v2

    .line 327
    .line 328
    :cond_3
    new-instance v3, Lcom/kubi/resources/widget/drop/a$a;

    .line 329
    .line 330
    sget v6, Lcom/kubi/kumex/R$string;->type:I

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 334
    move-result-object v0

    .line 335
    .line 336
    sget-object v6, Lcom/kubi/resources/widget/drop/FilterType;->a:Lcom/kubi/resources/widget/drop/FilterType$Companion;

    .line 337
    const/4 v7, 0x2

    .line 338
    const/4 v9, 0x0

    .line 339
    .line 340
    .line 341
    invoke-static {v6, v2, v12, v7, v9}, Lcom/kubi/resources/widget/drop/FilterType$Companion;->convert2Filter$default(Lcom/kubi/resources/widget/drop/FilterType$Companion;Ljava/util/Map;ZILjava/lang/Object;)[Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 342
    move-result-object v2

    .line 343
    .line 344
    check-cast v2, [Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 345
    .line 346
    .line 347
    invoke-direct {v3, v0, v2}, Lcom/kubi/resources/widget/drop/a$a;-><init>(Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v3}, Lcom/kubi/resources/widget/drop/a$a;->b()[Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 351
    move-result-object v0

    .line 352
    .line 353
    .line 354
    invoke-static {v0, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 355
    array-length v2, v0

    .line 356
    .line 357
    :goto_3
    if-ge v12, v2, :cond_5

    .line 358
    .line 359
    aget-object v6, v0, v12

    .line 360
    .line 361
    .line 362
    invoke-interface {v6}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 363
    move-result-object v7

    .line 364
    .line 365
    if-eqz p6, :cond_4

    .line 366
    move-object v8, v5

    .line 367
    goto :goto_4

    .line 368
    :cond_4
    move-object v8, v11

    .line 369
    .line 370
    .line 371
    :goto_4
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    move-result v7

    .line 373
    .line 374
    .line 375
    invoke-interface {v6, v7}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 376
    .line 377
    add-int/lit8 v12, v12, 0x1

    .line 378
    goto :goto_3

    .line 379
    .line 380
    .line 381
    :cond_5
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 382
    return-object v4
.end method

.method public final i(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    sget-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->f:Ljava/util/HashMap;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    check-cast p1, Ljava/util/Map;

    .line 30
    return-object p1
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
.end method

.method public final j()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->c:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/HashSet;

    .line 9
    return-object v0
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

.method public final k()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->e:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/HashSet;

    .line 9
    return-object v0
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

.method public final l()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    return-object v0
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

.method public final m()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->d:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/util/ArrayList;

    .line 9
    return-object v0
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

.method public final p(Landroid/content/Context;[Lcom/kubi/resources/widget/drop/FilterType$b;ZLjava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 18
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # [Lcom/kubi/resources/widget/drop/FilterType$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[",
            "Lcom/kubi/resources/widget/drop/FilterType$b;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move-object/from16 v2, p4

    .line 7
    .line 8
    move-object/from16 v3, p5

    .line 9
    .line 10
    const-string v5, "context"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    const-string v5, "filterData"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    const-string v5, "bizType"

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    const-string v5, "fundsType"

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    const-string v5, "selfFunds"

    .line 31
    .line 32
    .line 33
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v6

    .line 35
    .line 36
    if-eqz v6, :cond_0

    .line 37
    .line 38
    .line 39
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->l()Ljava/util/ArrayList;

    .line 40
    move-result-object v6

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->m()Ljava/util/ArrayList;

    .line 45
    move-result-object v6

    .line 46
    .line 47
    :goto_0
    new-instance v7, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v8, 0xa

    .line 50
    .line 51
    .line 52
    invoke-static {v6, v8}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 53
    move-result v8

    .line 54
    .line 55
    .line 56
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    move-result-object v6

    .line 61
    .line 62
    .line 63
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    move-result v8

    .line 65
    .line 66
    const-string v9, ""

    .line 67
    .line 68
    const-string v10, "getString(...)"

    .line 69
    .line 70
    if-eqz v8, :cond_3

    .line 71
    .line 72
    .line 73
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    move-result-object v8

    .line 75
    .line 76
    check-cast v8, Lkotlin/Pair;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v8}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 80
    move-result-object v12

    .line 81
    .line 82
    check-cast v12, Ljava/lang/Number;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 86
    move-result v12

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 90
    move-result-object v12

    .line 91
    .line 92
    .line 93
    invoke-static {v12, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    new-instance v13, Ljava/util/ArrayList;

    .line 96
    .line 97
    .line 98
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 99
    array-length v14, v1

    .line 100
    const/4 v15, 0x0

    .line 101
    .line 102
    :goto_2
    if-ge v15, v14, :cond_2

    .line 103
    .line 104
    const/16 v16, 0x1

    .line 105
    .line 106
    aget-object v4, v1, v15

    .line 107
    .line 108
    .line 109
    invoke-virtual {v8}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 110
    move-result-object v17

    .line 111
    .line 112
    move-object/from16 v11, v17

    .line 113
    .line 114
    check-cast v11, [Ljava/lang/Object;

    .line 115
    .line 116
    move-object/from16 v17, v6

    .line 117
    .line 118
    .line 119
    invoke-interface {v4}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 120
    move-result-object v6

    .line 121
    .line 122
    .line 123
    invoke-static {v11, v6}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    move-result v6

    .line 125
    .line 126
    if-eqz v6, :cond_1

    .line 127
    .line 128
    .line 129
    invoke-interface {v13, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    :cond_1
    add-int/lit8 v15, v15, 0x1

    .line 132
    .line 133
    move-object/from16 v6, v17

    .line 134
    goto :goto_2

    .line 135
    .line 136
    :cond_2
    move-object/from16 v17, v6

    .line 137
    .line 138
    const/16 v16, 0x1

    .line 139
    .line 140
    .line 141
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 142
    move-result-object v4

    .line 143
    .line 144
    new-instance v6, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 145
    .line 146
    sget v8, Lcom/kubi/kumex/R$string;->all:I

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 150
    move-result-object v8

    .line 151
    .line 152
    .line 153
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-direct {v6, v8, v9}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    const/4 v8, 0x0

    .line 158
    .line 159
    .line 160
    invoke-interface {v4, v8, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 161
    .line 162
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 163
    .line 164
    new-instance v6, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 165
    .line 166
    .line 167
    invoke-direct {v6, v8, v12, v4}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;-><init>(ZLjava/lang/String;Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {v7, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    move-object/from16 v6, v17

    .line 173
    goto :goto_1

    .line 174
    .line 175
    :cond_3
    const/16 v16, 0x1

    .line 176
    .line 177
    .line 178
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 179
    move-result-object v4

    .line 180
    .line 181
    sget v6, Lcom/kubi/kumex/R$string;->more:I

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 185
    move-result-object v6

    .line 186
    .line 187
    .line 188
    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 189
    .line 190
    new-instance v7, Ljava/util/ArrayList;

    .line 191
    .line 192
    .line 193
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 194
    array-length v8, v1

    .line 195
    const/4 v11, 0x0

    .line 196
    .line 197
    :goto_3
    if-ge v11, v8, :cond_6

    .line 198
    .line 199
    aget-object v12, v1, v11

    .line 200
    .line 201
    .line 202
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 203
    move-result v13

    .line 204
    .line 205
    if-eqz v13, :cond_4

    .line 206
    .line 207
    sget-object v13, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->a:Lcom/kubi/kumex/record/filter/AssetFilterHelper;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v13}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->j()Ljava/util/HashSet;

    .line 211
    move-result-object v13

    .line 212
    goto :goto_4

    .line 213
    .line 214
    :cond_4
    sget-object v13, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->a:Lcom/kubi/kumex/record/filter/AssetFilterHelper;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v13}, Lcom/kubi/kumex/record/filter/AssetFilterHelper;->k()Ljava/util/HashSet;

    .line 218
    move-result-object v13

    .line 219
    .line 220
    .line 221
    :goto_4
    invoke-interface {v12}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 222
    move-result-object v14

    .line 223
    .line 224
    .line 225
    invoke-virtual {v13, v14}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 226
    move-result v13

    .line 227
    .line 228
    if-nez v13, :cond_5

    .line 229
    .line 230
    .line 231
    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 234
    goto :goto_3

    .line 235
    .line 236
    .line 237
    :cond_6
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 238
    move-result-object v1

    .line 239
    .line 240
    new-instance v3, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 241
    .line 242
    sget v5, Lcom/kubi/kumex/R$string;->all:I

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 246
    move-result-object v0

    .line 247
    .line 248
    .line 249
    invoke-static {v0, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    .line 251
    .line 252
    invoke-direct {v3, v0, v9}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 253
    const/4 v8, 0x0

    .line 254
    .line 255
    .line 256
    invoke-interface {v1, v8, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 257
    .line 258
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 259
    .line 260
    new-instance v0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 261
    .line 262
    .line 263
    invoke-direct {v0, v8, v6, v1}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;-><init>(ZLjava/lang/String;Ljava/util/List;)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 270
    move-result v0

    .line 271
    .line 272
    if-nez v0, :cond_a

    .line 273
    .line 274
    if-nez p3, :cond_7

    .line 275
    goto :goto_7

    .line 276
    .line 277
    .line 278
    :cond_7
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 279
    move-result v0

    .line 280
    move v1, v8

    .line 281
    .line 282
    :goto_5
    if-ge v1, v0, :cond_d

    .line 283
    .line 284
    .line 285
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 286
    move-result-object v3

    .line 287
    .line 288
    check-cast v3, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->b()Ljava/util/List;

    .line 292
    move-result-object v5

    .line 293
    .line 294
    .line 295
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 296
    move-result v5

    .line 297
    move v6, v8

    .line 298
    .line 299
    :goto_6
    if-ge v6, v5, :cond_9

    .line 300
    .line 301
    .line 302
    invoke-virtual {v3}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->b()Ljava/util/List;

    .line 303
    move-result-object v7

    .line 304
    .line 305
    .line 306
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 307
    move-result-object v7

    .line 308
    .line 309
    check-cast v7, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 310
    .line 311
    .line 312
    invoke-interface {v7}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 313
    move-result-object v9

    .line 314
    .line 315
    .line 316
    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    move-result v9

    .line 318
    .line 319
    .line 320
    invoke-interface {v7, v9}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 321
    .line 322
    .line 323
    invoke-interface {v7}, Lcom/kubi/resources/widget/drop/FilterType$b;->d()Z

    .line 324
    move-result v7

    .line 325
    .line 326
    if-eqz v7, :cond_8

    .line 327
    .line 328
    move/from16 v7, v16

    .line 329
    .line 330
    .line 331
    invoke-virtual {v3, v7}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->d(Z)V

    .line 332
    return-object v4

    .line 333
    .line 334
    :cond_8
    move/from16 v7, v16

    .line 335
    add-int/2addr v6, v7

    .line 336
    goto :goto_6

    .line 337
    .line 338
    :cond_9
    move/from16 v7, v16

    .line 339
    add-int/2addr v1, v7

    .line 340
    goto :goto_5

    .line 341
    .line 342
    .line 343
    :cond_a
    :goto_7
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 344
    move-result-object v0

    .line 345
    .line 346
    .line 347
    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 348
    move-result v1

    .line 349
    .line 350
    if-eqz v1, :cond_c

    .line 351
    .line 352
    .line 353
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 354
    move-result-object v1

    .line 355
    .line 356
    check-cast v1, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->b()Ljava/util/List;

    .line 360
    move-result-object v1

    .line 361
    .line 362
    .line 363
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 364
    move-result-object v1

    .line 365
    .line 366
    .line 367
    :goto_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    move-result v2

    .line 369
    .line 370
    if-eqz v2, :cond_b

    .line 371
    .line 372
    .line 373
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    move-result-object v2

    .line 375
    .line 376
    check-cast v2, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 377
    .line 378
    .line 379
    invoke-interface {v2}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 380
    move-result-object v3

    .line 381
    .line 382
    .line 383
    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    move-result v3

    .line 385
    .line 386
    .line 387
    invoke-interface {v2, v3}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 388
    goto :goto_8

    .line 389
    .line 390
    .line 391
    :cond_c
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 392
    move-result-object v0

    .line 393
    .line 394
    check-cast v0, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;

    .line 395
    .line 396
    if-eqz v0, :cond_d

    .line 397
    const/4 v7, 0x1

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v7}, Lcom/kubi/kumex/record/filter/RecordFilterRecyclerView$a;->d(Z)V

    .line 401
    :cond_d
    return-object v4
.end method
