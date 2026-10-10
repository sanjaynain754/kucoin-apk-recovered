.class public final Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$a;
.super Ljava/lang/Object;
.source "MarginMarketRecommendFragment.kt"

# interfaces
.implements Lcom/kubi/resources/widget/RadioGroupPlus$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "com/kubi/margin/market/recommend/MarginMarketRecommendFragment$onViewCreated$1$1",
        "Lcom/kubi/resources/widget/RadioGroupPlus$OnCheckedChangeListener;",
        "onCheckedChanged",
        "",
        "group",
        "Lcom/kubi/resources/widget/RadioGroupPlus;",
        "checkedId",
        "",
        "isChecked",
        "",
        "MarginLib_googleRelease"
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
        "SMAP\nMarginMarketRecommendFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment$onViewCreated$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,323:1\n774#2:324\n865#2,2:325\n*S KotlinDebug\n*F\n+ 1 MarginMarketRecommendFragment.kt\ncom/kubi/margin/market/recommend/MarginMarketRecommendFragment$onViewCreated$1$1\n*L\n121#1:324\n121#1:325,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;


# direct methods
.method public constructor <init>(Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$a;->a:Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method


# virtual methods
.method public a(Lcom/kubi/resources/widget/RadioGroupPlus;IZ)V
    .locals 5

    .line 1
    .line 2
    sget p1, Lcom/kubi/margin/R$id;->rb_activity:I

    .line 3
    const/4 p3, 0x0

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    const-string p1, "1"

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    sget p1, Lcom/kubi/margin/R$id;->rb_robot:I

    .line 11
    .line 12
    if-ne p2, p1, :cond_1

    .line 13
    .line 14
    const-string p1, "2"

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_1
    sget p1, Lcom/kubi/margin/R$id;->rb_earn:I

    .line 18
    .line 19
    if-ne p2, p1, :cond_2

    .line 20
    .line 21
    const-string p1, "3"

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_2
    sget p1, Lcom/kubi/margin/R$id;->rb_otc:I

    .line 25
    .line 26
    if-ne p2, p1, :cond_3

    .line 27
    .line 28
    const-string p1, "4"

    .line 29
    goto :goto_0

    .line 30
    :cond_3
    move-object p1, p3

    .line 31
    .line 32
    :goto_0
    if-eqz p1, :cond_4

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$a;->a:Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;->C3(Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;)Lcom/kubi/data/entity/TradeItemBean;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    const-string v1, "symbol"

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    const-string v1, "B4candle"

    .line 55
    .line 56
    const-string v2, "RecommendTab"

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v2, p1, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 60
    .line 61
    :cond_4
    iget-object p1, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$a;->a:Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;->B3(Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;)Ljava/util/List;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    new-instance v0, Ljava/util/ArrayList;

    .line 68
    .line 69
    .line 70
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    move-result v1

    .line 79
    .line 80
    if-eqz v1, :cond_c

    .line 81
    .line 82
    .line 83
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    move-result-object v1

    .line 85
    move-object v2, v1

    .line 86
    .line 87
    check-cast v2, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;

    .line 88
    .line 89
    sget v3, Lcom/kubi/margin/R$id;->rb_all:I

    .line 90
    .line 91
    if-ne p2, v3, :cond_6

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_6
    sget v3, Lcom/kubi/margin/R$id;->rb_activity:I

    .line 95
    .line 96
    if-ne p2, v3, :cond_7

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->getType()I

    .line 100
    move-result v2

    .line 101
    .line 102
    if-nez v2, :cond_5

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_7
    sget v3, Lcom/kubi/margin/R$id;->rb_robot:I

    .line 106
    .line 107
    if-ne p2, v3, :cond_9

    .line 108
    .line 109
    .line 110
    invoke-virtual {v2}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->getType()I

    .line 111
    move-result v3

    .line 112
    const/4 v4, 0x1

    .line 113
    .line 114
    if-ne v3, v4, :cond_8

    .line 115
    .line 116
    sget-object v3, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->BotSpotGrid:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 117
    .line 118
    .line 119
    invoke-static {v3}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 120
    move-result v3

    .line 121
    .line 122
    if-nez v3, :cond_b

    .line 123
    .line 124
    .line 125
    :cond_8
    invoke-virtual {v2}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->getType()I

    .line 126
    move-result v2

    .line 127
    const/4 v3, 0x2

    .line 128
    .line 129
    if-ne v2, v3, :cond_5

    .line 130
    .line 131
    sget-object v2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->BotFuturesContractGrid:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 132
    .line 133
    .line 134
    invoke-static {v2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 135
    move-result v2

    .line 136
    .line 137
    if-eqz v2, :cond_5

    .line 138
    goto :goto_2

    .line 139
    .line 140
    :cond_9
    sget v3, Lcom/kubi/margin/R$id;->rb_earn:I

    .line 141
    .line 142
    if-ne p2, v3, :cond_a

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->getType()I

    .line 146
    move-result v2

    .line 147
    const/4 v3, 0x3

    .line 148
    .line 149
    if-ne v2, v3, :cond_5

    .line 150
    goto :goto_2

    .line 151
    .line 152
    :cond_a
    sget v3, Lcom/kubi/margin/R$id;->rb_otc:I

    .line 153
    .line 154
    if-ne p2, v3, :cond_5

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendEntity;->getType()I

    .line 158
    move-result v2

    .line 159
    const/4 v3, 0x4

    .line 160
    .line 161
    if-ne v2, v3, :cond_5

    .line 162
    .line 163
    .line 164
    :cond_b
    :goto_2
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 165
    goto :goto_1

    .line 166
    .line 167
    :cond_c
    iget-object p1, p0, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment$a;->a:Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;

    .line 168
    .line 169
    .line 170
    invoke-static {p1}, Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;->A3(Lcom/kubi/margin/market/recommend/MarginMarketRecommendFragment;)Lcom/kubi/margin/market/recommend/MarginMarketRecommendAdapter;

    .line 171
    move-result-object p1

    .line 172
    .line 173
    if-nez p1, :cond_d

    .line 174
    .line 175
    const-string p1, "mAdapter"

    .line 176
    .line 177
    .line 178
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 179
    goto :goto_3

    .line 180
    :cond_d
    move-object p3, p1

    .line 181
    .line 182
    .line 183
    :goto_3
    invoke-virtual {p3, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 184
    return-void
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
