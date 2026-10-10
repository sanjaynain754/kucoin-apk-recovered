.class public final Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "SearchCoinListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/assets/entity/SearchCoinEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u001e\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BK\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0008\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001c\u0010\u001e\u001a\u00020\n*\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\rH\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002J\u0010\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\rH\u0002J\u001c\u0010$\u001a\u00020\n2\u0008\u0010%\u001a\u0004\u0018\u00010\u00032\u0008\u0010 \u001a\u0004\u0018\u00010\u0002H\u0014J\u001c\u0010\'\u001a\u00020\n2\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010&\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001b\u0010\u001cR\u000e\u0010&\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/assets/entity/SearchCoinEntity;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "fromType",
        "",
        "data",
        "",
        "clearHistory",
        "Lkotlin/Function0;",
        "",
        "headerItemClickListener",
        "Lkotlin/Function2;",
        "Lcom/kubi/data/entity/CoinInfoEntity;",
        "",
        "<init>",
        "(ILjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V",
        "getFromType",
        "()I",
        "mSearchHistoryCoinListAdapter",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;",
        "getMSearchHistoryCoinListAdapter",
        "()Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;",
        "mSearchHistoryCoinListAdapter$delegate",
        "Lkotlin/Lazy;",
        "mHotCoinListAdapter",
        "Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;",
        "getMHotCoinListAdapter",
        "()Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;",
        "mHotCoinListAdapter$delegate",
        "buildCoinListItem",
        "itemType",
        "item",
        "getItemEnabled",
        "",
        "getItemEnableSubscribe",
        "convert",
        "helper",
        "filterText",
        "replaceData",
        "",
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
        "SMAP\nSearchCoinListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchCoinListAdapter.kt\ncom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,214:1\n1#2:215\n*E\n"
    }
.end annotation


# instance fields
.field public final i:I

.field public final j:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public n:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/SearchCoinEntity;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lcom/kubi/data/entity/CoinInfoEntity;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "clearHistory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerItemClickListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 4
    iput p1, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->i:I

    .line 5
    iput-object p3, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->j:Lkotlin/jvm/functions/Function0;

    .line 6
    iput-object p4, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->k:Lkotlin/jvm/functions/Function2;

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    .line 7
    sget p1, Lcom/kubi/assets/R$layout;->kucoin_withdraw_coin_list_history:I

    goto :goto_0

    .line 8
    :cond_0
    sget p1, Lcom/kubi/assets/R$layout;->kucoin_new_coin_list_history:I

    :goto_0
    const/4 p3, 0x1

    .line 9
    invoke-virtual {p0, p3, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 10
    sget p1, Lcom/kubi/assets/R$layout;->kucoin_new_coin_list_hot:I

    invoke-virtual {p0, p2, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 11
    sget p1, Lcom/kubi/assets/R$layout;->kucoin_new_item_coin_list:I

    const/4 p2, 0x5

    invoke-virtual {p0, p2, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    const/16 p2, 0xa

    .line 12
    invoke-virtual {p0, p2, p1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    const/4 p1, 0x3

    .line 13
    sget p2, Lcom/kubi/assets/R$layout;->kucoin_new_item_coin_list_remain:I

    .line 14
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    const/4 p1, 0x4

    .line 15
    sget p2, Lcom/kubi/assets/R$layout;->kucoin_new_coin_list_remain:I

    .line 16
    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    const/4 p1, 0x6

    .line 17
    sget p2, Lcom/kubi/sdk/R$layout;->view_empty:I

    invoke-virtual {p0, p1, p2}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 18
    new-instance p1, Lcom/kubi/assets/search/depositandwithdraw/d0;

    invoke-direct {p1, p0}, Lcom/kubi/assets/search/depositandwithdraw/d0;-><init>(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->l:Lkotlin/Lazy;

    .line 19
    new-instance p1, Lcom/kubi/assets/search/depositandwithdraw/e0;

    invoke-direct {p1, p0}, Lcom/kubi/assets/search/depositandwithdraw/e0;-><init>(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->m:Lkotlin/Lazy;

    .line 20
    const-string p1, ""

    iput-object p1, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->n:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    const/4 p1, 0x1

    :cond_0
    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_1

    .line 1
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 2
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;-><init>(ILjava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static synthetic g(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->n(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Landroid/view/View;)Lkotlin/Unit;

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

.method public static synthetic h(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->s(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;

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
.end method

.method public static synthetic i(Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->t(Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

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

.method public static synthetic j(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->u(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;

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
.end method

.method public static synthetic k(Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->v(Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

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

.method private final l(Lio/chad/library/adapter/base/BaseViewHolder;ILcom/kubi/data/entity/CoinInfoEntity;)V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move/from16 v2, p2

    .line 7
    .line 8
    move-object/from16 v3, p3

    .line 9
    .line 10
    .line 11
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getAvailableBalance()D

    .line 12
    move-result-wide v4

    .line 13
    .line 14
    .line 15
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-static {v4}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 20
    move-result-wide v4

    .line 21
    .line 22
    sget v6, Lcom/kubi/assets/R$id;->tv_coin_name:I

    .line 23
    .line 24
    .line 25
    invoke-static {v3}, Lcom/kubi/assets/AssetExKt;->k(Lcom/kubi/data/entity/CoinInfoEntity;)Ljava/lang/String;

    .line 26
    move-result-object v7

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 30
    .line 31
    sget v7, Lcom/kubi/assets/R$id;->tv_coin_name_full:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getName()Ljava/lang/String;

    .line 35
    move-result-object v8

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v3, v2}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->p(Lcom/kubi/data/entity/CoinInfoEntity;I)Z

    .line 42
    move-result v7

    .line 43
    const/4 v8, 0x1

    .line 44
    const/4 v9, 0x0

    .line 45
    .line 46
    if-eqz v7, :cond_0

    .line 47
    .line 48
    sget-object v7, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 49
    .line 50
    sget v10, Lcom/kubi/assets/R$color;->emphasis:I

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v10}, Lcom/kubi/utils/c;->a(I)I

    .line 54
    move-result v7

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 58
    .line 59
    sget v6, Lcom/kubi/assets/R$id;->tv_pause:I

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v6, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 63
    .line 64
    sget v6, Lcom/kubi/assets/R$id;->tv_subscript:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v6, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 68
    goto :goto_1

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-direct {v0, v3}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->o(Lcom/kubi/data/entity/CoinInfoEntity;)Z

    .line 72
    move-result v7

    .line 73
    .line 74
    if-eqz v7, :cond_1

    .line 75
    .line 76
    sget v7, Lcom/kubi/assets/R$id;->tv_subscript:I

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 80
    .line 81
    sget v7, Lcom/kubi/assets/R$id;->tv_pause:I

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v7, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 85
    goto :goto_0

    .line 86
    .line 87
    :cond_1
    sget v7, Lcom/kubi/assets/R$id;->tv_subscript:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v7, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 91
    .line 92
    sget v7, Lcom/kubi/assets/R$id;->tv_pause:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 96
    .line 97
    :goto_0
    sget-object v7, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 98
    .line 99
    sget v10, Lcom/kubi/assets/R$color;->emphasis60:I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7, v10}, Lcom/kubi/utils/c;->a(I)I

    .line 103
    move-result v7

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setTextColor(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 107
    :goto_1
    const/4 v6, 0x3

    .line 108
    .line 109
    if-eq v2, v6, :cond_3

    .line 110
    const/4 v4, 0x5

    .line 111
    .line 112
    if-eq v2, v4, :cond_2

    .line 113
    .line 114
    const/16 v4, 0xa

    .line 115
    .line 116
    if-eq v2, v4, :cond_2

    .line 117
    goto :goto_3

    .line 118
    .line 119
    :cond_2
    sget v2, Lcom/kubi/assets/R$id;->tv_balance:I

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v2, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 123
    goto :goto_3

    .line 124
    .line 125
    :cond_3
    sget v2, Lcom/kubi/assets/R$id;->tv_balance:I

    .line 126
    .line 127
    const-wide/16 v6, 0x0

    .line 128
    .line 129
    cmpg-double v6, v4, v6

    .line 130
    .line 131
    if-nez v6, :cond_4

    .line 132
    move v7, v8

    .line 133
    goto :goto_2

    .line 134
    :cond_4
    move v7, v9

    .line 135
    :goto_2
    xor-int/2addr v7, v8

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, v2, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 139
    .line 140
    new-instance v7, Ljava/math/BigDecimal;

    .line 141
    .line 142
    .line 143
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 144
    move-result-object v10

    .line 145
    .line 146
    .line 147
    invoke-direct {v7, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 151
    move-result-object v10

    .line 152
    const/4 v11, 0x2

    .line 153
    const/4 v12, 0x0

    .line 154
    .line 155
    .line 156
    invoke-static {v7, v10, v9, v11, v12}, Lgf/i;->b(Ljava/math/BigDecimal;Ljava/lang/String;IILjava/lang/Object;)Ljava/lang/String;

    .line 157
    move-result-object v7

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1, v2, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 161
    .line 162
    sget v2, Lcom/kubi/assets/R$id;->tv_legal_symbol_price:I

    .line 163
    .line 164
    if-nez v6, :cond_5

    .line 165
    move v9, v8

    .line 166
    .line 167
    :cond_5
    xor-int/lit8 v6, v9, 0x1

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v2, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 174
    move-result-object v6

    .line 175
    .line 176
    .line 177
    invoke-static {v4, v5, v6}, Lkf/a;->m(DLjava/lang/String;)D

    .line 178
    move-result-wide v7

    .line 179
    .line 180
    const/16 v16, 0x7f

    .line 181
    .line 182
    const/16 v17, 0x0

    .line 183
    const/4 v9, 0x0

    .line 184
    const/4 v10, 0x0

    .line 185
    const/4 v11, 0x0

    .line 186
    const/4 v12, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    const/4 v14, 0x0

    .line 189
    const/4 v15, 0x0

    .line 190
    .line 191
    .line 192
    invoke-static/range {v7 .. v17}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 193
    move-result-object v4

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1, v2, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 197
    .line 198
    :goto_3
    iget-object v2, v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v3}, Lcom/kubi/data/entity/CoinInfoEntity;->getIconUrl()Ljava/lang/String;

    .line 202
    move-result-object v3

    .line 203
    .line 204
    sget v4, Lcom/kubi/assets/R$id;->iv_icon:I

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 208
    move-result-object v1

    .line 209
    .line 210
    check-cast v1, Landroid/widget/ImageView;

    .line 211
    .line 212
    .line 213
    invoke-static {v2, v3, v1}, Lcom/kubi/sdk/util/v;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;)V

    .line 214
    return-void
.end method

.method public static final n(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->j:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0
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

.method private final o(Lcom/kubi/data/entity/CoinInfoEntity;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getSubscriptionInfo()Lcom/kubi/data/entity/SubscriptionInfoEntity;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/data/entity/SubscriptionInfoEntity;->getEnableSubscribe()Ljava/lang/Boolean;

    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->getSubscriptionInfo()Lcom/kubi/data/entity/SubscriptionInfoEntity;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/data/entity/SubscriptionInfoEntity;->getSubscribeRecordId()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    move-result p1

    .line 42
    .line 43
    if-nez p1, :cond_2

    .line 44
    const/4 p1, 0x1

    .line 45
    return p1

    .line 46
    :cond_2
    const/4 p1, 0x0

    .line 47
    return p1
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
.end method

.method private final p(Lcom/kubi/data/entity/CoinInfoEntity;I)Z
    .locals 1

    .line 1
    const/4 v0, 0x5

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->isDepositEnabled()Z

    .line 7
    move-result p1

    .line 8
    return p1

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/data/entity/CoinInfoEntity;->isWithdrawEnabled()Z

    .line 12
    move-result p1

    .line 13
    return p1
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

.method public static final s(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/search/depositandwithdraw/g0;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0, p0}, Lcom/kubi/assets/search/depositandwithdraw/g0;-><init>(Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;)V

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
.end method

.method public static final t(Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p4}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->k:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    const-string p2, "popCoin"

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_0
    return-void
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

.method public static final u(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;-><init>()V

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/search/depositandwithdraw/f0;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0, p0}, Lcom/kubi/assets/search/depositandwithdraw/f0;-><init>(Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;)V

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
.end method

.method public static final v(Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p4}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/data/entity/CoinInfoEntity;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    iget-object p1, p1, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->k:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    const-string p2, "historySearch"

    .line 13
    .line 14
    .line 15
    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    :cond_0
    return-void
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
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/assets/entity/SearchCoinEntity;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/SearchCoinEntity;)V

    .line 6
    return-void
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

.method public m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/assets/entity/SearchCoinEntity;)V
    .locals 3
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/assets/entity/SearchCoinEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p2}, Lcom/kubi/assets/entity/SearchCoinEntity;->getItemType()I

    .line 6
    move-result v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    if-ne v1, v2, :cond_6

    .line 24
    .line 25
    if-eqz p1, :cond_12

    .line 26
    .line 27
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 28
    .line 29
    if-eqz v0, :cond_12

    .line 30
    .line 31
    sget v1, Lcom/kubi/assets/R$id;->history_list:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    if-eqz v1, :cond_5

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->r()Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Lcom/kubi/assets/entity/SearchCoinEntity;->getCoinList()Ljava/util/List;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    if-eqz v1, :cond_4

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 56
    move-result v1

    .line 57
    .line 58
    if-eqz v1, :cond_2

    .line 59
    goto :goto_1

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {p2}, Lcom/kubi/assets/entity/SearchCoinEntity;->getCoinList()Ljava/util/List;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    if-eqz p2, :cond_3

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->r()Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 73
    .line 74
    :cond_3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 75
    .line 76
    if-eqz p1, :cond_5

    .line 77
    .line 78
    sget p2, Lcom/kubi/assets/R$id;->layout_history:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    if-eqz p1, :cond_5

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 88
    goto :goto_2

    .line 89
    .line 90
    .line 91
    :cond_4
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->r()Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 96
    move-result-object v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {p2, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 100
    .line 101
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 102
    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    sget p2, Lcom/kubi/assets/R$id;->layout_history:I

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    .line 114
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 115
    .line 116
    :cond_5
    :goto_2
    sget p1, Lcom/kubi/assets/R$id;->delete_history:I

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 124
    .line 125
    new-instance p2, Lcom/kubi/assets/search/depositandwithdraw/c0;

    .line 126
    .line 127
    .line 128
    invoke-direct {p2, p0}, Lcom/kubi/assets/search/depositandwithdraw/c0;-><init>(Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 132
    return-void

    .line 133
    .line 134
    :cond_6
    :goto_3
    if-nez v0, :cond_7

    .line 135
    goto :goto_5

    .line 136
    .line 137
    .line 138
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 139
    move-result v1

    .line 140
    const/4 v2, 0x2

    .line 141
    .line 142
    if-ne v1, v2, :cond_b

    .line 143
    .line 144
    if-eqz p1, :cond_12

    .line 145
    .line 146
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 147
    .line 148
    if-eqz v0, :cond_12

    .line 149
    .line 150
    sget v1, Lcom/kubi/assets/R$id;->hot_list:I

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 154
    move-result-object v0

    .line 155
    .line 156
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 157
    .line 158
    if-eqz v0, :cond_12

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->q()Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2}, Lcom/kubi/assets/entity/SearchCoinEntity;->getCoinList()Ljava/util/List;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    .line 174
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    move-result v0

    .line 176
    .line 177
    if-eqz v0, :cond_8

    .line 178
    goto :goto_4

    .line 179
    .line 180
    .line 181
    :cond_8
    invoke-virtual {p2}, Lcom/kubi/assets/entity/SearchCoinEntity;->getCoinList()Ljava/util/List;

    .line 182
    move-result-object p2

    .line 183
    .line 184
    if-eqz p2, :cond_9

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->q()Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;

    .line 188
    move-result-object v0

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, p2}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 192
    .line 193
    :cond_9
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 194
    .line 195
    if-eqz p1, :cond_12

    .line 196
    .line 197
    sget p2, Lcom/kubi/assets/R$id;->layout_hot:I

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 201
    move-result-object p1

    .line 202
    .line 203
    if-eqz p1, :cond_12

    .line 204
    .line 205
    .line 206
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 207
    return-void

    .line 208
    .line 209
    .line 210
    :cond_a
    :goto_4
    invoke-virtual {p0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->q()Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;

    .line 211
    move-result-object p2

    .line 212
    .line 213
    .line 214
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 215
    move-result-object v0

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 219
    .line 220
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 221
    .line 222
    if-eqz p1, :cond_12

    .line 223
    .line 224
    sget p2, Lcom/kubi/assets/R$id;->layout_hot:I

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 228
    move-result-object p1

    .line 229
    .line 230
    if-eqz p1, :cond_12

    .line 231
    .line 232
    .line 233
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 234
    return-void

    .line 235
    .line 236
    :cond_b
    :goto_5
    if-nez v0, :cond_c

    .line 237
    goto :goto_6

    .line 238
    .line 239
    .line 240
    :cond_c
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 241
    move-result v1

    .line 242
    const/4 v2, 0x5

    .line 243
    .line 244
    if-eq v1, v2, :cond_11

    .line 245
    .line 246
    :goto_6
    if-nez v0, :cond_d

    .line 247
    goto :goto_7

    .line 248
    .line 249
    .line 250
    :cond_d
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 251
    move-result v1

    .line 252
    const/4 v2, 0x3

    .line 253
    .line 254
    if-eq v1, v2, :cond_11

    .line 255
    .line 256
    :goto_7
    if-nez v0, :cond_e

    .line 257
    goto :goto_8

    .line 258
    .line 259
    .line 260
    :cond_e
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 261
    move-result v1

    .line 262
    .line 263
    const/16 v2, 0xa

    .line 264
    .line 265
    if-ne v1, v2, :cond_f

    .line 266
    goto :goto_9

    .line 267
    .line 268
    :cond_f
    :goto_8
    if-nez v0, :cond_10

    .line 269
    goto :goto_a

    .line 270
    .line 271
    .line 272
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 273
    move-result p2

    .line 274
    const/4 v0, 0x6

    .line 275
    .line 276
    if-ne p2, v0, :cond_12

    .line 277
    .line 278
    if-eqz p1, :cond_12

    .line 279
    .line 280
    sget p2, Lcom/kubi/assets/R$id;->empty_icon:I

    .line 281
    .line 282
    sget v0, Lcom/kubi/assets/R$drawable;->ic2_common_empty:I

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setImageResource(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 286
    .line 287
    sget p2, Lcom/kubi/assets/R$id;->empty_tips:I

    .line 288
    .line 289
    sget v0, Lcom/kubi/assets/R$string;->no_more_data:I

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(II)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 293
    return-void

    .line 294
    .line 295
    :cond_11
    :goto_9
    if-eqz p1, :cond_12

    .line 296
    .line 297
    .line 298
    invoke-virtual {p2}, Lcom/kubi/assets/entity/SearchCoinEntity;->getCoinEntity()Lcom/kubi/data/entity/CoinInfoEntity;

    .line 299
    move-result-object v0

    .line 300
    .line 301
    if-eqz v0, :cond_12

    .line 302
    .line 303
    .line 304
    invoke-virtual {p2}, Lcom/kubi/assets/entity/SearchCoinEntity;->getItemType()I

    .line 305
    move-result p2

    .line 306
    .line 307
    .line 308
    invoke-direct {p0, p1, p2, v0}, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->l(Lio/chad/library/adapter/base/BaseViewHolder;ILcom/kubi/data/entity/CoinInfoEntity;)V

    .line 309
    .line 310
    iget-object p2, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->n:Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    invoke-static {p2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 314
    move-result p2

    .line 315
    .line 316
    if-nez p2, :cond_12

    .line 317
    .line 318
    sget p2, Lcom/kubi/assets/R$id;->tv_coin_name:I

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 322
    move-result-object p2

    .line 323
    .line 324
    const-string v0, "getView(...)"

    .line 325
    .line 326
    .line 327
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    .line 329
    check-cast p2, Landroid/widget/TextView;

    .line 330
    .line 331
    iget-object v1, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->n:Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    invoke-static {p2, v1}, Le60/b;->c(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 335
    .line 336
    sget p2, Lcom/kubi/assets/R$id;->tv_coin_name_full:I

    .line 337
    .line 338
    .line 339
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 340
    move-result-object p1

    .line 341
    .line 342
    .line 343
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 344
    .line 345
    check-cast p1, Landroid/widget/TextView;

    .line 346
    .line 347
    iget-object p2, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->n:Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    invoke-static {p1, p2}, Le60/b;->c(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 351
    :cond_12
    :goto_a
    return-void
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

.method public final q()Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->m:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/search/depositandwithdraw/SearchHotCoinListAdapter;

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

.method public final r()Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->l:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/search/depositandwithdraw/SearchHistoryCoinListAdapter;

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

.method public final w(Ljava/util/Collection;Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/kubi/assets/entity/SearchCoinEntity;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "filterText"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/assets/search/depositandwithdraw/SearchCoinListAdapter;->n:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-super {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 16
    return-void
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
