.class public final Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;
.super Ljava/lang/Object;
.source "SpotSidebarTabDataGetArea.kt"

# interfaces
.implements Lcom/kubi/mart/sidebar/spot/tablist/data/ITabListGet;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u0096@\u00a2\u0006\u0002\u0010\u000cJ,\u0010\r\u001a\u00020\u000e2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;",
        "Lcom/kubi/mart/sidebar/spot/tablist/data/ITabListGet;",
        "sidebarType",
        "",
        "menuModel",
        "Lcom/kubi/mart/entity/SpotMenuModel;",
        "symbolCode",
        "<init>",
        "(Ljava/lang/String;Lcom/kubi/mart/entity/SpotMenuModel;Ljava/lang/String;)V",
        "fetchList",
        "",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchPageList",
        "",
        "dataList",
        "",
        "Lcom/kubi/mart/entity/SidebarDataItemEntity;",
        "pageNum",
        "",
        "pageSize",
        "(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "MartLib_googleRelease"
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
        "SMAP\nSpotSidebarTabDataGetArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotSidebarTabDataGetArea.kt\ncom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n774#2:58\n865#2,2:59\n1563#2:61\n1634#2,3:62\n1#3:65\n*S KotlinDebug\n*F\n+ 1 SpotSidebarTabDataGetArea.kt\ncom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea\n*L\n26#1:58\n26#1:59,2\n31#1:61\n31#1:62,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/kubi/mart/entity/SpotMenuModel;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/kubi/mart/entity/SpotMenuModel;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/mart/entity/SpotMenuModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "sidebarType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "menuModel"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "symbolCode"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->b:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->c:Lcom/kubi/mart/entity/SpotMenuModel;

    .line 23
    .line 24
    iput-object p3, p0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->d:Ljava/lang/String;

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
.end method

.method public static final synthetic b(Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->c(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
.end method


# virtual methods
.method public a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;->label:I

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
    iput v1, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;-><init>(Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;->label:I

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
    iget-object v0, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;->L$0:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ljava/util/List;

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    .line 52
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    throw p1

    .line 54
    .line 55
    .line 56
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 57
    .line 58
    new-instance p1, Ljava/util/ArrayList;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    iget-object v2, p0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->c:Lcom/kubi/mart/entity/SpotMenuModel;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/kubi/mart/entity/SpotMenuModel;->getCount()I

    .line 67
    move-result v2

    .line 68
    .line 69
    iput-object p1, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;->L$0:Ljava/lang/Object;

    .line 70
    .line 71
    iput v3, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchList$1;->label:I

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, p1, v3, v2, v0}, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->c(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    if-ne v0, v1, :cond_3

    .line 78
    return-object v1

    .line 79
    :cond_3
    move-object v0, p1

    .line 80
    .line 81
    :goto_1
    new-instance p1, Ljava/util/ArrayList;

    .line 82
    .line 83
    .line 84
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    move-result v1

    .line 93
    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    move-result-object v1

    .line 99
    move-object v2, v1

    .line 100
    .line 101
    check-cast v2, Lcom/kubi/mart/entity/SidebarDataItemEntity;

    .line 102
    .line 103
    iget-object v4, p0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->b:Ljava/lang/String;

    .line 104
    .line 105
    const-string v5, "spot_grid"

    .line 106
    .line 107
    .line 108
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    move-result v4

    .line 110
    .line 111
    if-eqz v4, :cond_6

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lcom/kubi/mart/sidebar/spot/tablist/data/a;->a()Ljava/util/HashSet;

    .line 115
    move-result-object v4

    .line 116
    .line 117
    if-nez v4, :cond_5

    .line 118
    .line 119
    .line 120
    invoke-static {}, Lkotlin/collections/SetsKt;->emptySet()Ljava/util/Set;

    .line 121
    move-result-object v4

    .line 122
    .line 123
    .line 124
    :cond_5
    invoke-virtual {v2}, Lcom/kubi/mart/entity/SidebarDataItemEntity;->getSymbol()Ljava/lang/String;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->contains(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 129
    move-result v2

    .line 130
    goto :goto_3

    .line 131
    :cond_6
    move v2, v3

    .line 132
    .line 133
    :goto_3
    if-eqz v2, :cond_4

    .line 134
    .line 135
    .line 136
    invoke-interface {p1, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 137
    goto :goto_2

    .line 138
    .line 139
    :cond_7
    new-instance v0, Ljava/util/ArrayList;

    .line 140
    .line 141
    const/16 v1, 0xa

    .line 142
    .line 143
    .line 144
    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 145
    move-result v1

    .line 146
    .line 147
    .line 148
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    move-result-object p1

    .line 153
    .line 154
    .line 155
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    move-result v1

    .line 157
    .line 158
    if-eqz v1, :cond_8

    .line 159
    .line 160
    .line 161
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    check-cast v1, Lcom/kubi/mart/entity/SidebarDataItemEntity;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lcom/kubi/mart/entity/SidebarDataItemEntity;->toTradeItemBean()Lcom/kubi/data/entity/TradeItemBean;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    .line 171
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 172
    goto :goto_4

    .line 173
    :cond_8
    return-object v0
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
.end method

.method public final c(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/mart/entity/SidebarDataItemEntity;",
            ">;II",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    move-object/from16 v3, p4

    instance-of v4, v3, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;

    iget v5, v4, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->label:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->label:I

    :goto_0
    move-object v8, v4

    goto :goto_1

    :cond_0
    new-instance v4, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;

    invoke-direct {v4, v0, v3}, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;-><init>(Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;Lkotlin/coroutines/Continuation;)V

    goto :goto_0

    :goto_1
    iget-object v3, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->result:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    .line 1
    iget v5, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->label:I

    const/4 v11, 0x2

    const/4 v6, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v6, :cond_2

    if-ne v5, v11, :cond_1

    iget-object v1, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lcom/kubi/mart/entity/SidebarDataEntity;

    iget-object v1, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->I$1:I

    iget v2, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->I$0:I

    iget-object v5, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v6, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move v12, v2

    move v2, v1

    move v1, v12

    move-object v12, v6

    goto :goto_3

    :cond_3
    invoke-static {v3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iget-object v3, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->c:Lcom/kubi/mart/entity/SpotMenuModel;

    invoke-virtual {v3}, Lcom/kubi/mart/entity/SpotMenuModel;->getTabType()Ljava/lang/String;

    move-result-object v3

    const-string v5, "DYNAMIC"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 3
    iget-object v12, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->d:Ljava/lang/String;

    const-string v3, "-"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v13

    const/16 v16, 0x6

    const/16 v17, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x0

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    .line 4
    :goto_2
    invoke-static {}, Lfq/b;->a()Lbq/a;

    move-result-object v5

    .line 5
    iget-object v7, v0, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->c:Lcom/kubi/mart/entity/SpotMenuModel;

    invoke-virtual {v7}, Lcom/kubi/mart/entity/SpotMenuModel;->getConcept()Ljava/lang/String;

    move-result-object v7

    .line 6
    invoke-interface {v5, v7, v3, v1, v2}, Lbq/a;->e(Ljava/lang/String;Ljava/lang/String;II)Lkotlinx/coroutines/flow/e;

    move-result-object v5

    move-object/from16 v12, p1

    .line 7
    iput-object v12, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$0:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$1:Ljava/lang/Object;

    iput v1, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->I$0:I

    iput v2, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->I$1:I

    iput v6, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->label:I

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lcom/kubi/network/retrofit/utils/RetrofitFlowExKt;->g(Lkotlinx/coroutines/flow/e;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    goto :goto_4

    :cond_5
    move-object/from16 v18, v5

    move-object v5, v3

    move-object/from16 v3, v18

    :goto_3
    check-cast v3, Lcom/kubi/network/retrofit/utils/f;

    invoke-virtual {v3}, Lcom/kubi/network/retrofit/utils/f;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kubi/mart/entity/SidebarDataEntity;

    if-eqz v3, :cond_8

    .line 8
    invoke-virtual {v3}, Lcom/kubi/mart/entity/SidebarDataEntity;->getItems()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-interface {v12, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-result v6

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 9
    :cond_6
    invoke-virtual {v3}, Lcom/kubi/mart/entity/SidebarDataEntity;->getCurrentPage()Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    move-result v6

    .line 10
    invoke-virtual {v3}, Lcom/kubi/mart/entity/SidebarDataEntity;->getTotalPage()Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    move-result v7

    if-ge v6, v7, :cond_8

    add-int/lit8 v7, v6, 0x1

    .line 11
    invoke-virtual {v3}, Lcom/kubi/mart/entity/SidebarDataEntity;->getPageSize()Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v9, v2}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    move-result v9

    invoke-static {v12}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$0:Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$1:Ljava/lang/Object;

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->L$2:Ljava/lang/Object;

    iput v1, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->I$0:I

    iput v2, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->I$1:I

    iput v6, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->I$2:I

    iput v11, v8, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea$fetchPageList$1;->label:I

    invoke-virtual {v0, v12, v7, v9, v8}, Lcom/kubi/mart/sidebar/spot/tablist/data/SpotSidebarTabDataGetArea;->c(Ljava/util/List;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_7

    :goto_4
    return-object v4

    .line 12
    :cond_7
    :goto_5
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1

    :cond_8
    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v1
.end method
