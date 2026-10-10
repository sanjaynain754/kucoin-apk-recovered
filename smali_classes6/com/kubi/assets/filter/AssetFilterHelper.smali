.class public final Lcom/kubi/assets/filter/AssetFilterHelper;
.super Ljava/lang/Object;
.source "AssetFilterHelper.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\r0\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u0010J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00102\n\u0008\u0002\u0010!\u001a\u0004\u0018\u00010\"J$\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b0$2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J$\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020(0\u0017JG\u0010)\u001a\u0008\u0012\u0004\u0012\u00020*0\u00172\u0006\u0010+\u001a\u00020,2\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020.0\u000f2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020(0\u00172\u0006\u0010/\u001a\u00020\u0010\u00a2\u0006\u0002\u00100R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u0007\u0010\u0008RH\u0010\u000b\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\r0\u000cj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\r`\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013RH\u0010\u0014\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\r0\u000cj\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00100\u000f0\r`\u00118BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0013RF\u0010\u0019\u001a:\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b0\u001aj\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001b`\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00061"
    }
    d2 = {
        "Lcom/kubi/assets/filter/AssetFilterHelper;",
        "",
        "<init>",
        "()V",
        "api",
        "Lcom/kubi/assets/AssetV2Api;",
        "kotlin.jvm.PlatformType",
        "getApi",
        "()Lcom/kubi/assets/AssetV2Api;",
        "api$delegate",
        "Lkotlin/Lazy;",
        "defaultGroupList",
        "Ljava/util/ArrayList;",
        "Lkotlin/Pair;",
        "",
        "",
        "",
        "Lkotlin/collections/ArrayList;",
        "getDefaultGroupList",
        "()Ljava/util/ArrayList;",
        "unifiedGroupList",
        "getUnifiedGroupList",
        "getAssetsMostUsed",
        "",
        "fromType",
        "cacheFilterTypeList",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "getFilterTypeList",
        "type",
        "fetchFilterTypeList",
        "",
        "callBack",
        "Lio/reactivex/functions/Action;",
        "getFilterTypeApi",
        "Lkotlinx/coroutines/flow/Flow;",
        "getFilterDataByType",
        "Lcom/kubi/resources/widget/drop/DropMenuHelper$FilterData;",
        "initParams",
        "Lcom/kubi/assets/filter/ParcelizePair;",
        "groupList",
        "Lcom/kubi/assets/filter/AssetFilterRecyclerView$FilterGroupList;",
        "context",
        "Landroid/content/Context;",
        "filterData",
        "Lcom/kubi/resources/widget/drop/FilterType$IFilter;",
        "filterKey",
        "(Landroid/content/Context;Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$IFilter;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nAssetFilterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1869#2,2:296\n1563#2:298\n1634#2,2:299\n1056#2:309\n1636#2:310\n1869#2:315\n1869#2,2:316\n1870#2:318\n11318#3:301\n11429#3,4:302\n3829#3:306\n4344#3,2:307\n4154#3:311\n4254#3,2:312\n1#4:314\n*S KotlinDebug\n*F\n+ 1 AssetFilterHelper.kt\ncom/kubi/assets/filter/AssetFilterHelper\n*L\n233#1:296,2\n237#1:298\n237#1:299,2\n246#1:309\n237#1:310\n273#1:315\n274#1:316,2\n273#1:318\n239#1:301\n239#1:302,4\n245#1:306\n245#1:307,2\n258#1:311\n258#1:312,2\n*E\n"
    }
.end annotation


# static fields
.field public static final a:Lcom/kubi/assets/filter/AssetFilterHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ljava/util/HashMap;
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
    new-instance v0, Lcom/kubi/assets/filter/AssetFilterHelper;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/filter/AssetFilterHelper;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/kubi/assets/filter/AssetFilterHelper;->a:Lcom/kubi/assets/filter/AssetFilterHelper;

    .line 8
    .line 9
    new-instance v0, Lcom/kubi/assets/filter/f;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lcom/kubi/assets/filter/f;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    sput-object v0, Lcom/kubi/assets/filter/AssetFilterHelper;->b:Lkotlin/Lazy;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    sput-object v0, Lcom/kubi/assets/filter/AssetFilterHelper;->c:Ljava/util/HashMap;

    .line 26
    return-void
    .line 27
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
.end method

.method public static synthetic a()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/filter/AssetFilterHelper;->d()Lcom/kubi/assets/h0;

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
.end method

.method public static final synthetic b()Ljava/util/HashMap;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/filter/AssetFilterHelper;->c:Ljava/util/HashMap;

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
.end method

.method public static final synthetic c(Lcom/kubi/assets/filter/AssetFilterHelper;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/filter/AssetFilterHelper;->k(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

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
.end method

.method public static final d()Lcom/kubi/assets/h0;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lmr/a;->c()Lretrofit2/Retrofit;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-class v1, Lcom/kubi/assets/h0;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/kubi/assets/h0;

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
.end method

.method public static synthetic f(Lcom/kubi/assets/filter/AssetFilterHelper;Ljava/lang/String;Lio/reactivex/functions/Action;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p3, p3, 0x2

    .line 3
    .line 4
    if-eqz p3, :cond_0

    .line 5
    const/4 p2, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/filter/AssetFilterHelper;->e(Ljava/lang/String;Lio/reactivex/functions/Action;)V

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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
.end method


# virtual methods
.method public final e(Ljava/lang/String;Lio/reactivex/functions/Action;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/reactivex/functions/Action;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    sget-object v1, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sget-object v1, Lcom/kubi/assets/filter/AssetFilterHelper;->c:Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    check-cast v1, Ljava/util/Map;

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 40
    move-result v1

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    if-eqz p2, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-interface {p2}, Lio/reactivex/functions/Action;->run()V

    .line 49
    :cond_1
    return-void

    .line 50
    .line 51
    :cond_2
    :goto_0
    new-instance v1, Lcom/kubi/assets/filter/AssetFilterHelper$fetchFilterTypeList$1;

    .line 52
    const/4 v2, 0x0

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, p1, v0, p2, v2}, Lcom/kubi/assets/filter/AssetFilterHelper$fetchFilterTypeList$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/reactivex/functions/Action;Lkotlin/coroutines/Continuation;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lcom/kubi/mvi/common/MviExKt;->n(Lkotlin/jvm/functions/Function2;)V

    .line 59
    return-void
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
.end method

.method public final g()Lcom/kubi/assets/h0;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/filter/AssetFilterHelper;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/h0;

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
.end method

.method public final h(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/Integer;",
            "[",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "UNIFIED"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/assets/filter/AssetFilterHelper;->m()Ljava/util/ArrayList;

    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/filter/AssetFilterHelper;->i()Ljava/util/ArrayList;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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

.method public final i()Ljava/util/ArrayList;
    .locals 15
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
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/assets/AssetExKt;->q()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lkotlin/Pair;

    .line 14
    .line 15
    sget v2, Lcom/kubi/assets/R$string;->assets_most_used:I

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    move-result-object v2

    .line 20
    .line 21
    const-string v13, "EARN_LOCK"

    .line 22
    .line 23
    const-string v14, "EARN_HOLD_INCOME"

    .line 24
    .line 25
    const-string v3, "DEPOSIT"

    .line 26
    .line 27
    const-string v4, "WITHDRAW"

    .line 28
    .line 29
    const-string v5, "BUY_CURRENCY"

    .line 30
    .line 31
    const-string v6, "SELL_CURRENCY"

    .line 32
    .line 33
    const-string v7, "FIAT_BALANCE_DEAL"

    .line 34
    .line 35
    const-string v8, "FIAT_OUT"

    .line 36
    .line 37
    const-string v9, "FLASH_TRADE"

    .line 38
    .line 39
    const-string v10, "FLASH_CONVERT"

    .line 40
    .line 41
    const-string v11, "EARN_REDEEM"

    .line 42
    .line 43
    const-string v12, "EARN_INCOME"

    .line 44
    .line 45
    .line 46
    filled-new-array/range {v3 .. v14}, [Ljava/lang/String;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    .line 50
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    return-object v0

    .line 55
    .line 56
    :cond_0
    new-instance v1, Lkotlin/Pair;

    .line 57
    .line 58
    sget v2, Lcom/kubi/assets/R$string;->assets_most_used:I

    .line 59
    .line 60
    .line 61
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    const-string v10, "FLASH_TRADE"

    .line 65
    .line 66
    const-string v11, "EARN_INCOME"

    .line 67
    .line 68
    const-string v3, "DEPOSIT"

    .line 69
    .line 70
    const-string v4, "WITHDRAW"

    .line 71
    .line 72
    const-string v5, "TRANSFER"

    .line 73
    .line 74
    const-string v6, "MARGIN_LOAN_LEND"

    .line 75
    .line 76
    const-string v7, "REWARDS"

    .line 77
    .line 78
    const-string v8, "AIRDROP_FORK"

    .line 79
    .line 80
    const-string v9, "TRADE_EXCHANGE"

    .line 81
    .line 82
    .line 83
    filled-new-array/range {v3 .. v11}, [Ljava/lang/String;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    .line 87
    invoke-direct {v1, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    return-object v0
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
.end method

.method public final j(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/filter/ParcelizePair;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/drop/a$a;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "initParams"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    if-eqz p1, :cond_7

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 11
    move-result v0

    .line 12
    .line 13
    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :sswitch_0
    const-string v0, "ISOLATED"

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_0
    sget-object p1, Lcom/kubi/assets/filter/FilterAccountType$e;->a:Lcom/kubi/assets/filter/FilterAccountType$e;

    .line 29
    .line 30
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0, p2}, Lcom/kubi/assets/filter/FilterAccountType$e;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 38
    move-result-object p1

    .line 39
    return-object p1

    .line 40
    .line 41
    :sswitch_1
    const-string v0, "UNIFIED"

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    move-result p1

    .line 46
    .line 47
    if-nez p1, :cond_1

    .line 48
    .line 49
    goto/16 :goto_0

    .line 50
    .line 51
    :cond_1
    sget-object p1, Lcom/kubi/assets/filter/FilterAccountType$g;->a:Lcom/kubi/assets/filter/FilterAccountType$g;

    .line 52
    .line 53
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 57
    move-result-object v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, v0, p2}, Lcom/kubi/assets/filter/FilterAccountType$g;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    .line 64
    :sswitch_2
    const-string v0, "TRADE"

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    move-result p1

    .line 69
    .line 70
    if-nez p1, :cond_2

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_2
    sget-object p1, Lcom/kubi/assets/filter/FilterAccountType$b;->a:Lcom/kubi/assets/filter/FilterAccountType$b;

    .line 74
    .line 75
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0, p2}, Lcom/kubi/assets/filter/FilterAccountType$b;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 83
    move-result-object p1

    .line 84
    return-object p1

    .line 85
    .line 86
    :sswitch_3
    const-string v0, "MAIN"

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    move-result p1

    .line 91
    .line 92
    if-nez p1, :cond_3

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :cond_3
    sget-object p1, Lcom/kubi/assets/filter/FilterAccountType$a;->a:Lcom/kubi/assets/filter/FilterAccountType$a;

    .line 96
    .line 97
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0, p2}, Lcom/kubi/assets/filter/FilterAccountType$a;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 105
    move-result-object p1

    .line 106
    return-object p1

    .line 107
    .line 108
    :sswitch_4
    const-string v0, "FIAT"

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    move-result p1

    .line 113
    .line 114
    if-nez p1, :cond_4

    .line 115
    goto :goto_0

    .line 116
    .line 117
    :cond_4
    sget-object p1, Lcom/kubi/assets/filter/FilterAccountType$d;->a:Lcom/kubi/assets/filter/FilterAccountType$d;

    .line 118
    .line 119
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v0, p2}, Lcom/kubi/assets/filter/FilterAccountType$d;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 127
    move-result-object p1

    .line 128
    return-object p1

    .line 129
    .line 130
    :sswitch_5
    const-string v0, "OPTION"

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    move-result p1

    .line 135
    .line 136
    if-nez p1, :cond_5

    .line 137
    goto :goto_0

    .line 138
    .line 139
    :cond_5
    sget-object p1, Lcom/kubi/assets/filter/FilterAccountType$f;->a:Lcom/kubi/assets/filter/FilterAccountType$f;

    .line 140
    .line 141
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 145
    move-result-object v0

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v0, p2}, Lcom/kubi/assets/filter/FilterAccountType$f;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    .line 152
    :sswitch_6
    const-string v0, "MARGIN"

    .line 153
    .line 154
    .line 155
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    move-result p1

    .line 157
    .line 158
    if-nez p1, :cond_6

    .line 159
    goto :goto_0

    .line 160
    .line 161
    :cond_6
    sget-object p1, Lcom/kubi/assets/filter/FilterAccountType$c;->a:Lcom/kubi/assets/filter/FilterAccountType$c;

    .line 162
    .line 163
    sget-object v0, Lcom/kubi/utils/l;->a:Lcom/kubi/utils/l;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Lcom/kubi/utils/l;->a()Landroid/content/Context;

    .line 167
    move-result-object v0

    .line 168
    .line 169
    .line 170
    invoke-virtual {p1, v0, p2}, Lcom/kubi/assets/filter/FilterAccountType$c;->a(Landroid/content/Context;Ljava/util/List;)Ljava/util/ArrayList;

    .line 171
    move-result-object p1

    .line 172
    return-object p1

    .line 173
    .line 174
    .line 175
    :cond_7
    :goto_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 176
    move-result-object p1

    .line 177
    return-object p1

    .line 178
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x78e08652 -> :sswitch_6
        -0x74a2838b -> :sswitch_5
        0x20ec36 -> :sswitch_4
        0x23fdb9 -> :sswitch_3
        0x4c5f944 -> :sswitch_2
        0x19b14d72 -> :sswitch_1
        0x50f7a519 -> :sswitch_0
    .end sparse-switch
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
.end method

.method public final k(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "UNIFIED"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/kubi/assets/filter/AssetFilterHelper;->g()Lcom/kubi/assets/h0;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Lcom/kubi/assets/h0;->c1()Lkotlinx/coroutines/flow/e;

    .line 16
    move-result-object p1

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/filter/AssetFilterHelper;->g()Lcom/kubi/assets/h0;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0, p1}, Lcom/kubi/assets/h0;->b(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;

    .line 25
    move-result-object p1

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
    .line 43
.end method

.method public final l(Ljava/lang/String;)Ljava/util/Map;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string v0, "type"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    sget-object v1, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/kubi/sdk/function/language/LanguageType;->getLocalString()Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    sget-object v0, Lcom/kubi/assets/filter/AssetFilterHelper;->c:Ljava/util/HashMap;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    check-cast p1, Ljava/util/Map;

    .line 35
    return-object p1
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
    .locals 8
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
    sget v2, Lcom/kubi/assets/R$string;->assets_most_used:I

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
    const-string v4, "TRANSFER"

    .line 18
    .line 19
    const-string v5, "SPOT_EXCHANGE"

    .line 20
    .line 21
    const-string v6, "FUTURES_EXCHANGE_OPEN"

    .line 22
    .line 23
    const-string v7, "FUTURES_EXCHANGE_CLOSE"

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
.end method

.method public final n(Landroid/content/Context;Ljava/lang/String;[Lcom/kubi/resources/widget/drop/FilterType$b;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 20
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # [Lcom/kubi/resources/widget/drop/FilterType$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
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
            "[",
            "Lcom/kubi/resources/widget/drop/FilterType$b;",
            "Ljava/util/List<",
            "Lcom/kubi/assets/filter/ParcelizePair;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;",
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
    move-object/from16 v1, p3

    .line 5
    .line 6
    move-object/from16 v2, p5

    .line 7
    .line 8
    const-string v4, "context"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v4, "filterData"

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    const-string v4, "initParams"

    .line 19
    .line 20
    move-object/from16 v5, p4

    .line 21
    .line 22
    .line 23
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    const-string v4, "filterKey"

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    const-string v4, ""

    .line 31
    .line 32
    if-nez p2, :cond_0

    .line 33
    move-object v6, v4

    .line 34
    .line 35
    :goto_0
    move-object/from16 v7, p0

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :cond_0
    move-object/from16 v6, p2

    .line 39
    goto :goto_0

    .line 40
    .line 41
    .line 42
    :goto_1
    invoke-virtual {v7, v6}, Lcom/kubi/assets/filter/AssetFilterHelper;->h(Ljava/lang/String;)Ljava/util/List;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    new-instance v8, Ljava/util/HashSet;

    .line 46
    .line 47
    .line 48
    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 52
    move-result-object v9

    .line 53
    .line 54
    .line 55
    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    move-result v10

    .line 57
    .line 58
    if-eqz v10, :cond_1

    .line 59
    .line 60
    .line 61
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    move-result-object v10

    .line 63
    .line 64
    check-cast v10, Lkotlin/Pair;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v10}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 68
    move-result-object v10

    .line 69
    .line 70
    check-cast v10, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-static {v8, v10}, Lkotlin/collections/CollectionsKt;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 74
    goto :goto_2

    .line 75
    .line 76
    :cond_1
    new-instance v9, Ljava/util/ArrayList;

    .line 77
    .line 78
    const/16 v10, 0xa

    .line 79
    .line 80
    .line 81
    invoke-static {v6, v10}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 82
    move-result v10

    .line 83
    .line 84
    .line 85
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    move-result-object v6

    .line 90
    .line 91
    .line 92
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 93
    move-result v10

    .line 94
    .line 95
    const-string v11, "getString(...)"

    .line 96
    .line 97
    if-eqz v10, :cond_5

    .line 98
    .line 99
    .line 100
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    move-result-object v10

    .line 102
    .line 103
    check-cast v10, Lkotlin/Pair;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 107
    move-result-object v13

    .line 108
    .line 109
    check-cast v13, [Ljava/lang/Object;

    .line 110
    .line 111
    new-instance v14, Ljava/util/ArrayList;

    .line 112
    array-length v15, v13

    .line 113
    .line 114
    .line 115
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 116
    array-length v15, v13

    .line 117
    const/4 v3, 0x0

    .line 118
    .line 119
    const/16 v16, 0x1

    .line 120
    .line 121
    const/16 v17, 0x0

    .line 122
    .line 123
    :goto_4
    if-ge v3, v15, :cond_2

    .line 124
    .line 125
    aget-object v18, v13, v3

    .line 126
    .line 127
    add-int/lit8 v19, v17, 0x1

    .line 128
    .line 129
    move-object/from16 v12, v18

    .line 130
    .line 131
    check-cast v12, Ljava/lang/String;

    .line 132
    .line 133
    move/from16 v18, v3

    .line 134
    .line 135
    .line 136
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    move-result-object v3

    .line 138
    .line 139
    .line 140
    invoke-static {v12, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 141
    move-result-object v3

    .line 142
    .line 143
    .line 144
    invoke-interface {v14, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    add-int/lit8 v3, v18, 0x1

    .line 147
    .line 148
    move/from16 v17, v19

    .line 149
    goto :goto_4

    .line 150
    .line 151
    .line 152
    :cond_2
    invoke-static {v14}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 153
    move-result-object v3

    .line 154
    .line 155
    .line 156
    invoke-virtual {v10}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 157
    move-result-object v12

    .line 158
    .line 159
    check-cast v12, Ljava/lang/Number;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v12}, Ljava/lang/Number;->intValue()I

    .line 163
    move-result v12

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 167
    move-result-object v12

    .line 168
    .line 169
    .line 170
    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    new-instance v13, Ljava/util/ArrayList;

    .line 173
    .line 174
    .line 175
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 176
    array-length v14, v1

    .line 177
    const/4 v15, 0x0

    .line 178
    .line 179
    :goto_5
    if-ge v15, v14, :cond_4

    .line 180
    .line 181
    aget-object v5, v1, v15

    .line 182
    .line 183
    .line 184
    invoke-virtual {v10}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 185
    move-result-object v17

    .line 186
    .line 187
    move-object/from16 v18, v6

    .line 188
    .line 189
    move-object/from16 v6, v17

    .line 190
    .line 191
    check-cast v6, [Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    invoke-interface {v5}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 195
    move-result-object v7

    .line 196
    .line 197
    .line 198
    invoke-static {v6, v7}, Lkotlin/collections/ArraysKt;->contains([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 199
    move-result v6

    .line 200
    .line 201
    if-eqz v6, :cond_3

    .line 202
    .line 203
    .line 204
    invoke-interface {v13, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    :cond_3
    add-int/lit8 v15, v15, 0x1

    .line 207
    .line 208
    move-object/from16 v7, p0

    .line 209
    .line 210
    move-object/from16 v5, p4

    .line 211
    .line 212
    move-object/from16 v6, v18

    .line 213
    goto :goto_5

    .line 214
    .line 215
    :cond_4
    move-object/from16 v18, v6

    .line 216
    .line 217
    new-instance v5, Lcom/kubi/assets/filter/AssetFilterHelper$a;

    .line 218
    .line 219
    .line 220
    invoke-direct {v5, v3}, Lcom/kubi/assets/filter/AssetFilterHelper$a;-><init>(Ljava/util/Map;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v13, v5}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 224
    move-result-object v3

    .line 225
    .line 226
    .line 227
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 228
    move-result-object v3

    .line 229
    .line 230
    new-instance v5, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 231
    .line 232
    sget v6, Lcom/kubi/assets/R$string;->all:I

    .line 233
    .line 234
    .line 235
    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 236
    move-result-object v6

    .line 237
    .line 238
    .line 239
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    invoke-direct {v5, v6, v4}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 243
    const/4 v6, 0x0

    .line 244
    .line 245
    .line 246
    invoke-interface {v3, v6, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 247
    .line 248
    sget-object v5, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 249
    .line 250
    new-instance v5, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;

    .line 251
    .line 252
    .line 253
    invoke-direct {v5, v6, v12, v3}, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;-><init>(ZLjava/lang/String;Ljava/util/List;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {v9, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    move-object/from16 v7, p0

    .line 259
    .line 260
    move-object/from16 v5, p4

    .line 261
    .line 262
    move-object/from16 v6, v18

    .line 263
    .line 264
    goto/16 :goto_3

    .line 265
    .line 266
    :cond_5
    const/16 v16, 0x1

    .line 267
    .line 268
    .line 269
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 270
    move-result-object v3

    .line 271
    .line 272
    sget v5, Lcom/kubi/assets/R$string;->more:I

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 276
    move-result-object v5

    .line 277
    .line 278
    .line 279
    invoke-static {v5, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 280
    .line 281
    new-instance v6, Ljava/util/ArrayList;

    .line 282
    .line 283
    .line 284
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 285
    array-length v7, v1

    .line 286
    const/4 v9, 0x0

    .line 287
    .line 288
    :goto_6
    if-ge v9, v7, :cond_7

    .line 289
    .line 290
    aget-object v10, v1, v9

    .line 291
    .line 292
    .line 293
    invoke-interface {v10}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 294
    move-result-object v12

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 298
    move-result v12

    .line 299
    .line 300
    if-nez v12, :cond_6

    .line 301
    .line 302
    .line 303
    invoke-interface {v6, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    :cond_6
    add-int/lit8 v9, v9, 0x1

    .line 306
    goto :goto_6

    .line 307
    .line 308
    .line 309
    :cond_7
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 310
    move-result-object v1

    .line 311
    .line 312
    new-instance v6, Lcom/kubi/resources/widget/drop/FilterType$a;

    .line 313
    .line 314
    sget v7, Lcom/kubi/assets/R$string;->all:I

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 318
    move-result-object v0

    .line 319
    .line 320
    .line 321
    invoke-static {v0, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    .line 323
    .line 324
    invoke-direct {v6, v0, v4}, Lcom/kubi/resources/widget/drop/FilterType$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 325
    const/4 v0, 0x0

    .line 326
    .line 327
    .line 328
    invoke-interface {v1, v0, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 329
    .line 330
    sget-object v6, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 331
    .line 332
    new-instance v6, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;

    .line 333
    .line 334
    .line 335
    invoke-direct {v6, v0, v5, v1}, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;-><init>(ZLjava/lang/String;Ljava/util/List;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 339
    .line 340
    .line 341
    invoke-interface/range {p4 .. p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    move-result-object v1

    .line 343
    .line 344
    .line 345
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    move-result v5

    .line 347
    const/4 v6, 0x0

    .line 348
    .line 349
    if-eqz v5, :cond_9

    .line 350
    .line 351
    .line 352
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 353
    move-result-object v5

    .line 354
    move-object v7, v5

    .line 355
    .line 356
    check-cast v7, Lcom/kubi/assets/filter/ParcelizePair;

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7}, Lcom/kubi/assets/filter/ParcelizePair;->getKey()Ljava/lang/String;

    .line 360
    move-result-object v7

    .line 361
    .line 362
    .line 363
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 364
    move-result v7

    .line 365
    .line 366
    if-eqz v7, :cond_8

    .line 367
    goto :goto_7

    .line 368
    :cond_9
    move-object v5, v6

    .line 369
    .line 370
    :goto_7
    check-cast v5, Lcom/kubi/assets/filter/ParcelizePair;

    .line 371
    .line 372
    if-eqz v5, :cond_a

    .line 373
    .line 374
    .line 375
    invoke-virtual {v5}, Lcom/kubi/assets/filter/ParcelizePair;->getValue()Ljava/lang/String;

    .line 376
    move-result-object v6

    .line 377
    .line 378
    :cond_a
    if-nez v6, :cond_b

    .line 379
    goto :goto_8

    .line 380
    :cond_b
    move-object v4, v6

    .line 381
    .line 382
    .line 383
    :goto_8
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 384
    move-result v1

    .line 385
    .line 386
    if-eqz v1, :cond_e

    .line 387
    .line 388
    .line 389
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 390
    move-result-object v0

    .line 391
    .line 392
    .line 393
    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 394
    move-result v1

    .line 395
    .line 396
    if-eqz v1, :cond_d

    .line 397
    .line 398
    .line 399
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 400
    move-result-object v1

    .line 401
    .line 402
    check-cast v1, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1}, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;->b()Ljava/util/List;

    .line 406
    move-result-object v1

    .line 407
    .line 408
    .line 409
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 410
    move-result-object v1

    .line 411
    .line 412
    .line 413
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 414
    move-result v2

    .line 415
    .line 416
    if-eqz v2, :cond_c

    .line 417
    .line 418
    .line 419
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 420
    move-result-object v2

    .line 421
    .line 422
    check-cast v2, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 423
    .line 424
    .line 425
    invoke-interface {v2}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 426
    move-result-object v5

    .line 427
    .line 428
    .line 429
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    move-result v5

    .line 431
    .line 432
    .line 433
    invoke-interface {v2, v5}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 434
    goto :goto_9

    .line 435
    .line 436
    .line 437
    :cond_d
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 438
    move-result-object v0

    .line 439
    .line 440
    check-cast v0, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;

    .line 441
    .line 442
    if-eqz v0, :cond_11

    .line 443
    .line 444
    move/from16 v1, v16

    .line 445
    .line 446
    .line 447
    invoke-virtual {v0, v1}, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;->d(Z)V

    .line 448
    return-object v3

    .line 449
    .line 450
    .line 451
    :cond_e
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 452
    move-result v1

    .line 453
    move v6, v0

    .line 454
    .line 455
    :goto_a
    if-ge v6, v1, :cond_11

    .line 456
    .line 457
    .line 458
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 459
    move-result-object v2

    .line 460
    .line 461
    check-cast v2, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2}, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;->b()Ljava/util/List;

    .line 465
    move-result-object v5

    .line 466
    .line 467
    .line 468
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 469
    move-result v5

    .line 470
    move v7, v0

    .line 471
    .line 472
    :goto_b
    if-ge v7, v5, :cond_10

    .line 473
    .line 474
    .line 475
    invoke-virtual {v2}, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;->b()Ljava/util/List;

    .line 476
    move-result-object v8

    .line 477
    .line 478
    .line 479
    invoke-interface {v8, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 480
    move-result-object v8

    .line 481
    .line 482
    check-cast v8, Lcom/kubi/resources/widget/drop/FilterType$b;

    .line 483
    .line 484
    .line 485
    invoke-interface {v8}, Lcom/kubi/resources/widget/drop/FilterType$b;->a()Ljava/lang/String;

    .line 486
    move-result-object v9

    .line 487
    .line 488
    .line 489
    invoke-static {v9, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 490
    move-result v9

    .line 491
    .line 492
    .line 493
    invoke-interface {v8, v9}, Lcom/kubi/resources/widget/drop/FilterType$b;->c(Z)V

    .line 494
    .line 495
    .line 496
    invoke-interface {v8}, Lcom/kubi/resources/widget/drop/FilterType$b;->d()Z

    .line 497
    move-result v8

    .line 498
    .line 499
    if-eqz v8, :cond_f

    .line 500
    const/4 v8, 0x1

    .line 501
    .line 502
    .line 503
    invoke-virtual {v2, v8}, Lcom/kubi/assets/filter/AssetFilterRecyclerView$a;->d(Z)V

    .line 504
    return-object v3

    .line 505
    :cond_f
    const/4 v8, 0x1

    .line 506
    add-int/2addr v7, v8

    .line 507
    goto :goto_b

    .line 508
    :cond_10
    const/4 v8, 0x1

    .line 509
    add-int/2addr v6, v8

    .line 510
    goto :goto_a

    .line 511
    :cond_11
    return-object v3
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
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
.end method
