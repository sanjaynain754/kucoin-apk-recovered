.class public final Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "FavAllAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u001e\n\u0002\u0008\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0008H\u0007J\u001c\u0010\u0016\u001a\u00020\u00122\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0014J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0016\u0010\u001f\u001a\u00020\u00122\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020!H\u0016J\u000c\u0010\"\u001a\u00020\u0005*\u00020\u001bH\u0002J\u0010\u0010#\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u0010\u0010$\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J\u001e\u0010%\u001a\u00020\u00122\u000c\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "isTrade",
        "",
        "isHomeRank",
        "symbolType",
        "",
        "<init>",
        "(ZZLjava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "filterKey",
        "",
        "longClickPosition",
        "isShowFee",
        "isNotBindRecyclerView",
        "setIsShowFee",
        "",
        "isShow",
        "setLongClickPosition",
        "position",
        "convert",
        "helper",
        "item",
        "setRootView",
        "setAlphaItemView",
        "Lcom/kubi/quotefacade/entity/AllTradeItemBean;",
        "setCommonView",
        "setETFView",
        "setPriceView",
        "replaceData",
        "data",
        "",
        "isSpotType",
        "isPreview",
        "showVolumeText",
        "filterData",
        "quote",
        "QuoteFacadeLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final i:Z

.field public final j:Z

.field public final k:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public l:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:I

.field public n:Z


# direct methods
.method public constructor <init>(ZZLjava/lang/Integer;)V
    .locals 1
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget v0, Lcom/kubi/quotefacade/R$layout;->item_list_favorite:I

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;-><init>(I)V

    .line 6
    .line 7
    iput-boolean p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->i:Z

    .line 8
    .line 9
    iput-boolean p2, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->j:Z

    .line 10
    .line 11
    iput-object p3, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->k:Ljava/lang/Integer;

    .line 12
    const/4 p1, -0x1

    .line 13
    .line 14
    iput p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->m:I

    .line 15
    const/4 p1, 0x1

    .line 16
    .line 17
    iput-boolean p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->n:Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    .line 21
    return-void
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
.end method

.method public static synthetic g(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->n(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Lkotlin/Unit;

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
.end method

.method private final i(Ljava/util/Collection;Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p2, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l:Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Lcom/kubi/data/entity/TradeItemBean;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 34
    move-result-object v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    move-result v2

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    goto :goto_0

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-super {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 52
    return-void
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
.end method

.method public static final n(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Lkotlin/Unit;
    .locals 13

    .line 1
    .line 2
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_trade_pair_box:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/resources/widget/TradePairFlexboxView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/TradePairFlexboxView;->getTradePairView()Lcom/kubi/resources/widget/BaseTextView;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getShowSymbol()Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "--"

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    :cond_0
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_lever:I

    .line 32
    const/4 v1, 0x0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 36
    .line 37
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_quote:I

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 41
    .line 42
    sget v0, Lcom/kubi/quotefacade/R$id;->label_prep_group:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 46
    .line 47
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_label_st:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 51
    .line 52
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_ready:I

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 56
    .line 57
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_fee:I

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 61
    .line 62
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_etf_label:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 66
    .line 67
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_label_new:I

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 71
    .line 72
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_label_rwa:I

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 76
    .line 77
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_label_stock_token:I

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 81
    .line 82
    sget v0, Lcom/kubi/quotefacade/R$id;->iv_warning_tag:I

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 86
    .line 87
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_money_price:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 91
    .line 92
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_value:I

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getValue()D

    .line 96
    move-result-wide v2

    .line 97
    .line 98
    .line 99
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    .line 103
    invoke-static {v2}, Lcom/kubi/quotefacade/helper/u1;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, v0, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 108
    .line 109
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_price:I

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 113
    move-result-object v0

    .line 114
    .line 115
    check-cast v0, Lcom/kubi/resources/widget/UpDownColorTextView;

    .line 116
    .line 117
    .line 118
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 119
    const/4 v2, 0x3

    .line 120
    const/4 v3, 0x0

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v3, v1, v2, v3}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 127
    move-result-object v2

    .line 128
    .line 129
    if-eqz v2, :cond_1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 133
    move-result-object v2

    .line 134
    .line 135
    .line 136
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getShowSymbol()Ljava/lang/String;

    .line 137
    move-result-object v4

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 141
    move-result v2

    .line 142
    .line 143
    if-eqz v2, :cond_1

    .line 144
    const/4 v1, 0x1

    .line 145
    .line 146
    .line 147
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/UpDownColorTextView;->setSameSymbol(Ljava/lang/Boolean;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getShowSymbol()Ljava/lang/String;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 159
    .line 160
    new-instance v1, Ljava/math/BigDecimal;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 164
    move-result-wide v4

    .line 165
    .line 166
    .line 167
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    .line 171
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v1}, Lcom/kubi/quotefacade/helper/u1;->a(Ljava/math/BigDecimal;)Landroid/text/SpannableStringBuilder;

    .line 175
    move-result-object v1

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    .line 180
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_change_rate:I

    .line 181
    .line 182
    .line 183
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 184
    move-result-object v1

    .line 185
    .line 186
    if-eqz v1, :cond_2

    .line 187
    .line 188
    new-instance v4, Ljava/math/BigDecimal;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 192
    move-result-wide v1

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 196
    move-result-object v1

    .line 197
    .line 198
    .line 199
    invoke-direct {v4, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v4}, Lkf/a;->y(Ljava/math/BigDecimal;)I

    .line 203
    move-result v7

    .line 204
    .line 205
    const/16 v11, 0x13

    .line 206
    const/4 v12, 0x0

    .line 207
    const/4 v5, 0x0

    .line 208
    const/4 v6, 0x0

    .line 209
    const/4 v8, 0x1

    .line 210
    const/4 v9, 0x0

    .line 211
    const/4 v10, 0x0

    .line 212
    .line 213
    .line 214
    invoke-static/range {v4 .. v12}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 215
    move-result-object v1

    .line 216
    .line 217
    .line 218
    invoke-static {v1}, Lnf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    move-result-object v1

    .line 220
    .line 221
    .line 222
    invoke-static {v1}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    move-result-object v3

    .line 224
    .line 225
    .line 226
    :cond_2
    invoke-static {v3}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 227
    move-result-object v1

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 231
    move-result-object v1

    .line 232
    .line 233
    const-string v2, "setText(...)"

    .line 234
    .line 235
    .line 236
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 240
    move-result-object p1

    .line 241
    .line 242
    .line 243
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 244
    move-result-wide v2

    .line 245
    .line 246
    iget-object p0, p0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 250
    move-result-object p0

    .line 251
    .line 252
    const-string p1, "getContext(...)"

    .line 253
    .line 254
    .line 255
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v2, v3, p0}, Lcom/kubi/resources/g;->k(DLandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 259
    move-result-object p0

    .line 260
    .line 261
    .line 262
    invoke-static {v1, v0, p0}, Lcom/kubi/resources/g;->r(Lio/chad/library/adapter/base/BaseViewHolder;ILandroid/graphics/drawable/Drawable;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 265
    return-object p0
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
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
.end method

.method private final s(Lio/chad/library/adapter/base/BaseViewHolder;)V
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/kubi/quotefacade/R$id;->root_view:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 10
    move-result p1

    .line 11
    .line 12
    iget v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->m:I

    .line 13
    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    sget p1, Lcom/kubi/quotefacade/R$color;->c_cover2:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    sget p1, Lcom/kubi/quotefacade/R$drawable;->selector_darkoverlay_click:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

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
.end method


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/data/entity/TradeItemBean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

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
.end method

.method public h(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 3
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/data/entity/TradeItemBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_3

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    instance-of v0, p2, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    goto :goto_0

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-direct {p0, p1}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->s(Lio/chad/library/adapter/base/BaseViewHolder;)V

    .line 14
    move-object v0, p2

    .line 15
    .line 16
    check-cast v0, Lcom/kubi/quotefacade/entity/AllTradeItemBean;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x5

    .line 22
    .line 23
    if-ne v1, v2, :cond_2

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V

    .line 27
    .line 28
    iget-boolean v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->j:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    new-instance v0, Lyu/x;

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, Lyu/x;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1, p2}, Lyu/x;->a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 39
    return-void

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0, p1, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V

    .line 43
    .line 44
    iget-boolean v1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->j:Z

    .line 45
    .line 46
    .line 47
    invoke-static {p2, v1}, Lyu/u;->a(Lcom/kubi/data/entity/TradeItemBean;Z)Lyu/z;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, p1, p2}, Lyu/z;->a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->p(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, p1, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->r(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V

    .line 58
    :cond_3
    :goto_0
    return-void
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
.end method

.method public final j()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
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
.end method

.method public final k(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isPreviewEnableShow()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->i:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    cmpg-double p1, v0, v2

    .line 23
    .line 24
    if-gtz p1, :cond_0

    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
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
.end method

.method public final l(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x3

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_1
    :goto_0
    return v1
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
.end method

.method public final m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/favorites/all/a;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p1, p2}, Lcom/kubi/quotefacade/favorites/all/a;-><init>(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

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
.end method

.method public final o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->k(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 10
    move-result v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 14
    move-result v4

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v4, v1}, Lyu/a0;->a(Lcom/kubi/data/entity/TradeItemBean;ZLio/chad/library/adapter/base/BaseViewHolder;)V

    .line 18
    .line 19
    sget v4, Lcom/kubi/quotefacade/R$id;->iv_warning_tag:I

    .line 20
    .line 21
    sget-object v5, Lcom/kubi/quotefacade/helper/t1;->a:Lcom/kubi/quotefacade/helper/t1;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kubi/quotefacade/entity/AllTradeItemBean;->getCollectType()I

    .line 25
    move-result v6

    .line 26
    const/4 v7, 0x1

    .line 27
    const/4 v8, 0x0

    .line 28
    const/4 v9, 0x2

    .line 29
    .line 30
    if-ne v6, v9, :cond_0

    .line 31
    move v6, v7

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v6, v8

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->isAlarm()Z

    .line 37
    move-result v10

    .line 38
    .line 39
    iget-boolean v11, v0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->i:Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v6, v10, v11}, Lcom/kubi/quotefacade/helper/t1;->d(ZZZ)Z

    .line 43
    move-result v5

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v4, v5}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 47
    move-result-object v4

    .line 48
    .line 49
    sget v5, Lcom/kubi/quotefacade/R$id;->tv_lever:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 53
    move-result-object v6

    .line 54
    .line 55
    .line 56
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEtfSymbol()Z

    .line 57
    move-result v6

    .line 58
    .line 59
    if-nez v6, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getMaxLeverage()I

    .line 63
    move-result v6

    .line 64
    .line 65
    if-lez v6, :cond_1

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lhf/a;->a()Z

    .line 69
    move-result v6

    .line 70
    .line 71
    if-eqz v6, :cond_1

    .line 72
    move v6, v7

    .line 73
    goto :goto_1

    .line 74
    :cond_1
    move v6, v8

    .line 75
    .line 76
    .line 77
    :goto_1
    invoke-virtual {v4, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 78
    move-result-object v4

    .line 79
    .line 80
    new-instance v6, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getMaxLeverage()I

    .line 87
    move-result v10

    .line 88
    .line 89
    .line 90
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const/16 v10, 0x78

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    move-result-object v6

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4, v5, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    sget v5, Lcom/kubi/quotefacade/R$id;->tv_money_price:I

    .line 106
    .line 107
    const-string v6, "-"

    .line 108
    const/4 v10, 0x0

    .line 109
    .line 110
    if-nez v3, :cond_3

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 117
    move-result-wide v11

    .line 118
    .line 119
    .line 120
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 121
    move-result-object v13

    .line 122
    .line 123
    if-eqz v13, :cond_2

    .line 124
    .line 125
    .line 126
    invoke-virtual {v13}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 127
    move-result-object v13

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    move-object v13, v10

    .line 130
    .line 131
    .line 132
    :goto_2
    invoke-static {v11, v12, v13}, Lkf/a;->m(DLjava/lang/String;)D

    .line 133
    move-result-wide v11

    .line 134
    .line 135
    new-instance v13, Ljava/math/BigDecimal;

    .line 136
    .line 137
    .line 138
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 139
    move-result-object v11

    .line 140
    .line 141
    .line 142
    invoke-direct {v13, v11}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    const/16 v17, 0x7

    .line 145
    .line 146
    const/16 v18, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    .line 150
    const/16 v16, 0x0

    .line 151
    .line 152
    .line 153
    invoke-static/range {v13 .. v18}, Lkf/b;->g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IILjava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 154
    move-result-object v11

    .line 155
    goto :goto_3

    .line 156
    :cond_3
    move-object v11, v6

    .line 157
    .line 158
    .line 159
    :goto_3
    invoke-virtual {v4, v5, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 160
    move-result-object v4

    .line 161
    .line 162
    sget v5, Lcom/kubi/quotefacade/R$id;->tv_change_rate:I

    .line 163
    .line 164
    if-eqz v3, :cond_4

    .line 165
    move-object v11, v6

    .line 166
    goto :goto_5

    .line 167
    .line 168
    .line 169
    :cond_4
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 170
    move-result-object v11

    .line 171
    .line 172
    if-eqz v11, :cond_5

    .line 173
    .line 174
    new-instance v12, Ljava/math/BigDecimal;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    .line 178
    move-result-wide v13

    .line 179
    .line 180
    .line 181
    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 182
    move-result-object v11

    .line 183
    .line 184
    .line 185
    invoke-direct {v12, v11}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v12}, Lkf/a;->y(Ljava/math/BigDecimal;)I

    .line 189
    move-result v15

    .line 190
    .line 191
    const/16 v19, 0x13

    .line 192
    .line 193
    const/16 v20, 0x0

    .line 194
    const/4 v13, 0x0

    .line 195
    const/4 v14, 0x0

    .line 196
    .line 197
    const/16 v16, 0x1

    .line 198
    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    const/16 v18, 0x0

    .line 202
    .line 203
    .line 204
    invoke-static/range {v12 .. v20}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 205
    move-result-object v11

    .line 206
    .line 207
    .line 208
    invoke-static {v11}, Lnf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    move-result-object v11

    .line 210
    .line 211
    .line 212
    invoke-static {v11}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    move-result-object v11

    .line 214
    goto :goto_4

    .line 215
    :cond_5
    move-object v11, v10

    .line 216
    .line 217
    .line 218
    :goto_4
    invoke-static {v11}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    move-result-object v11

    .line 220
    .line 221
    .line 222
    :goto_5
    invoke-virtual {v4, v5, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 223
    move-result-object v4

    .line 224
    .line 225
    sget v11, Lcom/kubi/quotefacade/R$id;->tv_value:I

    .line 226
    .line 227
    iget-boolean v12, v0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->i:Z

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v11, v12}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 231
    move-result-object v4

    .line 232
    .line 233
    sget v12, Lcom/kubi/quotefacade/R$id;->tv_etf_label:I

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 237
    move-result v13

    .line 238
    .line 239
    if-eqz v13, :cond_6

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 243
    move-result-object v13

    .line 244
    .line 245
    .line 246
    invoke-virtual {v13}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEtfSymbol()Z

    .line 247
    move-result v13

    .line 248
    .line 249
    if-eqz v13, :cond_6

    .line 250
    move v13, v7

    .line 251
    goto :goto_6

    .line 252
    :cond_6
    move v13, v8

    .line 253
    .line 254
    .line 255
    :goto_6
    invoke-virtual {v4, v12, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 256
    move-result-object v4

    .line 257
    .line 258
    sget v12, Lcom/kubi/quotefacade/R$id;->tv_label_st:I

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 262
    move-result v13

    .line 263
    .line 264
    if-eqz v13, :cond_7

    .line 265
    .line 266
    iget-boolean v13, v0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->j:Z

    .line 267
    .line 268
    if-nez v13, :cond_7

    .line 269
    .line 270
    .line 271
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getMark()I

    .line 272
    move-result v13

    .line 273
    .line 274
    if-ne v13, v7, :cond_7

    .line 275
    move v13, v7

    .line 276
    goto :goto_7

    .line 277
    :cond_7
    move v13, v8

    .line 278
    .line 279
    .line 280
    :goto_7
    invoke-virtual {v4, v12, v13}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 281
    move-result-object v4

    .line 282
    .line 283
    const-string v12, "setGone(...)"

    .line 284
    .line 285
    .line 286
    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    const-string v12, "getContext(...)"

    .line 289
    .line 290
    if-eqz v3, :cond_8

    .line 291
    .line 292
    iget-object v13, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 296
    move-result-object v13

    .line 297
    .line 298
    .line 299
    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    sget v12, Lcom/kubi/quotefacade/R$attr;->upColor:I

    .line 302
    .line 303
    .line 304
    invoke-static {v13, v12}, Lcom/kubi/resources/g;->b(Landroid/content/Context;I)I

    .line 305
    move-result v12

    .line 306
    const/4 v13, 0x0

    .line 307
    .line 308
    .line 309
    invoke-static {v12, v13, v9, v10}, Lcom/kubi/resources/g;->m(IFILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    .line 310
    move-result-object v9

    .line 311
    goto :goto_8

    .line 312
    .line 313
    .line 314
    :cond_8
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 315
    move-result-object v9

    .line 316
    .line 317
    .line 318
    invoke-static {v9}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 319
    move-result-wide v9

    .line 320
    .line 321
    iget-object v13, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v13}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 325
    move-result-object v13

    .line 326
    .line 327
    .line 328
    invoke-static {v13, v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-static {v9, v10, v13}, Lcom/kubi/resources/g;->k(DLandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 332
    move-result-object v9

    .line 333
    .line 334
    .line 335
    :goto_8
    invoke-static {v4, v5, v9}, Lcom/kubi/resources/g;->r(Lio/chad/library/adapter/base/BaseViewHolder;ILandroid/graphics/drawable/Drawable;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 336
    move-result-object v4

    .line 337
    .line 338
    sget v5, Lcom/kubi/quotefacade/R$id;->tv_ready:I

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 342
    move-result v9

    .line 343
    .line 344
    if-eqz v9, :cond_9

    .line 345
    .line 346
    iget-boolean v9, v0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->j:Z

    .line 347
    .line 348
    if-nez v9, :cond_9

    .line 349
    .line 350
    if-eqz v3, :cond_9

    .line 351
    move v9, v7

    .line 352
    goto :goto_9

    .line 353
    :cond_9
    move v9, v8

    .line 354
    .line 355
    .line 356
    :goto_9
    invoke-virtual {v4, v5, v9}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 357
    move-result-object v4

    .line 358
    .line 359
    if-eqz v3, :cond_a

    .line 360
    goto :goto_a

    .line 361
    .line 362
    .line 363
    :cond_a
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->t(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Ljava/lang/String;

    .line 364
    move-result-object v6

    .line 365
    .line 366
    .line 367
    :goto_a
    invoke-virtual {v4, v11, v6}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 368
    move-result-object v3

    .line 369
    .line 370
    sget v4, Lcom/kubi/quotefacade/R$id;->tv_label_new:I

    .line 371
    .line 372
    .line 373
    invoke-virtual {v3, v4, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 374
    move-result-object v3

    .line 375
    .line 376
    sget v4, Lcom/kubi/quotefacade/R$id;->tv_label_rwa:I

    .line 377
    .line 378
    .line 379
    invoke-virtual {v3, v4, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 380
    move-result-object v3

    .line 381
    .line 382
    sget v4, Lcom/kubi/quotefacade/R$id;->tv_label_stock_token:I

    .line 383
    .line 384
    .line 385
    invoke-virtual {v3, v4, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getCoinLabel()Ljava/lang/String;

    .line 389
    move-result-object v3

    .line 390
    .line 391
    if-nez v3, :cond_b

    .line 392
    .line 393
    const-string v3, ""

    .line 394
    .line 395
    .line 396
    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 397
    move-result v4

    .line 398
    .line 399
    const/16 v5, 0xa

    .line 400
    .line 401
    if-le v4, v5, :cond_c

    .line 402
    .line 403
    new-instance v4, Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 407
    const/4 v5, 0x7

    .line 408
    .line 409
    .line 410
    invoke-virtual {v3, v8, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 411
    move-result-object v3

    .line 412
    .line 413
    const-string v5, "substring(...)"

    .line 414
    .line 415
    .line 416
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    const-string v3, "..."

    .line 422
    .line 423
    .line 424
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 428
    move-result-object v3

    .line 429
    .line 430
    :cond_c
    sget v4, Lcom/kubi/quotefacade/R$id;->tv_fee:I

    .line 431
    .line 432
    .line 433
    invoke-virtual {v1, v4, v3}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 434
    move-result-object v1

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 438
    move-result v2

    .line 439
    .line 440
    if-eqz v2, :cond_d

    .line 441
    .line 442
    iget-boolean v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->j:Z

    .line 443
    .line 444
    if-nez v2, :cond_d

    .line 445
    .line 446
    iget-boolean v2, v0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->n:Z

    .line 447
    .line 448
    if-eqz v2, :cond_d

    .line 449
    .line 450
    .line 451
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 452
    move-result v2

    .line 453
    .line 454
    if-lez v2, :cond_d

    .line 455
    goto :goto_b

    .line 456
    :cond_d
    move v7, v8

    .line 457
    .line 458
    .line 459
    :goto_b
    invoke-virtual {v1, v4, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 460
    return-void
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
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
.end method

.method public final p(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEtfSymbol()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lgf/n;->a:Lgf/n;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 22
    move-result-object p2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrency()Ljava/lang/String;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    const-string v1, "getBaseCurrency(...)"

    .line 29
    .line 30
    .line 31
    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, Lgf/n;->w(Ljava/lang/String;)Lcom/kubi/data/entity/EtfCoinEntity;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    if-eqz p2, :cond_1

    .line 38
    .line 39
    sget v0, Lcom/kubi/quotefacade/R$id;->tv_etf_label:I

    .line 40
    .line 41
    iget-object v1, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Lcom/kubi/data/entity/EtfCoinEntity;->getBuyType()Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    const-string v3, "L"

    .line 48
    .line 49
    .line 50
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    move-result v2

    .line 52
    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    sget v2, Lcom/kubi/quotefacade/R$string;->etf_label_times_long:I

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_0
    sget v2, Lcom/kubi/quotefacade/R$string;->etf_label_times_short:I

    .line 59
    .line 60
    .line 61
    :goto_0
    invoke-virtual {p2}, Lcom/kubi/data/entity/EtfCoinEntity;->getMultiple()Ljava/lang/String;

    .line 62
    move-result-object v4

    .line 63
    .line 64
    .line 65
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 66
    move-result-object v4

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    check-cast p1, Landroid/widget/TextView;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Lcom/kubi/data/entity/EtfCoinEntity;->getBuyType()Ljava/lang/String;

    .line 83
    move-result-object p2

    .line 84
    .line 85
    .line 86
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    move-result p2

    .line 88
    .line 89
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 90
    .line 91
    const-string v1, "mContext"

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0, p2}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 98
    move-result v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 102
    .line 103
    iget-object v0, p0, Lio/chad/library/adapter/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-static {p2, v0}, Lcom/kubi/resources/g;->o(ZLandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 110
    move-result-object p2

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 114
    return-void

    .line 115
    .line 116
    :cond_1
    sget p2, Lcom/kubi/quotefacade/R$id;->tv_etf_label:I

    .line 117
    const/4 v0, 0x0

    .line 118
    .line 119
    .line 120
    invoke-virtual {p1, p2, v0}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 121
    :cond_2
    return-void
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public final q(I)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->m:I

    .line 3
    return-void
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
.end method

.method public final r(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/entity/AllTradeItemBean;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p2}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->k(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    sget v1, Lcom/kubi/quotefacade/R$id;->tv_value:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    const-string v2, "getView(...)"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    check-cast v1, Landroid/widget/TextView;

    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x3

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2, v3, v4, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 28
    move-result-object v5

    .line 29
    .line 30
    const-string v6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    .line 31
    .line 32
    .line 33
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 39
    move-result-object v6

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEtfSymbol()Z

    .line 43
    move-result v6

    .line 44
    .line 45
    if-eqz v6, :cond_0

    .line 46
    .line 47
    const/high16 v6, 0x40800000    # 4.0f

    .line 48
    .line 49
    .line 50
    invoke-static {v6}, Lcom/blankj/utilcode/util/i0;->a(F)I

    .line 51
    move-result v6

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move v6, v3

    .line 54
    .line 55
    .line 56
    :goto_0
    invoke-virtual {v5, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    sget v1, Lcom/kubi/quotefacade/R$id;->tv_price:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    check-cast p1, Lcom/kubi/resources/widget/UpDownColorTextView;

    .line 68
    .line 69
    .line 70
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-static {p1, v2, v3, v4, v2}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v3}, Lcom/kubi/resources/widget/UpDownColorTextView;->setVisibleToUser(Z)V

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    const-string p2, "-"

    .line 81
    goto :goto_1

    .line 82
    .line 83
    :cond_1
    new-instance v0, Ljava/math/BigDecimal;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 87
    move-result-wide v1

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    const/16 v8, 0x7e

    .line 101
    const/4 v9, 0x0

    .line 102
    const/4 v2, 0x0

    .line 103
    const/4 v3, 0x0

    .line 104
    const/4 v4, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    const/4 v6, 0x0

    .line 107
    const/4 v7, 0x0

    .line 108
    .line 109
    .line 110
    invoke-static/range {v0 .. v9}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 111
    move-result-object p2

    .line 112
    .line 113
    .line 114
    invoke-static {p2}, Lcom/kubi/quotefacade/helper/QuoteExKt;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 115
    move-result-object p2

    .line 116
    .line 117
    .line 118
    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 119
    return-void
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
.end method

.method public replaceData(Ljava/util/Collection;)V
    .locals 1
    .param p1    # Ljava/util/Collection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;)V"
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
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->l:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0, p1, v0}, Lcom/kubi/quotefacade/favorites/all/FavAllAdapter;->i(Ljava/util/Collection;Ljava/lang/String;)V

    .line 22
    return-void

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-super {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

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
.end method

.method public final t(Lcom/kubi/quotefacade/entity/AllTradeItemBean;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getValue()D

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, p1}, Lgf/i;->e(DLjava/lang/String;)Ljava/lang/String;

    .line 16
    move-result-object p1

    .line 17
    return-object p1
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
.end method
