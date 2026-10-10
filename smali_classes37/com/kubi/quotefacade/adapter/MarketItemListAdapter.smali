.class public final Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;
.super Lio/chad/library/adapter/base/BaseQuickAdapter;
.source "MarketItemListAdapter.kt"


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
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u001e\n\u0002\u0008\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0007H\u0007J\u001c\u0010\u001b\u001a\u00020\u00122\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0014J\u0018\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0010\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010!\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u0016\u0010#\u001a\u00020\u00122\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00020%H\u0016J\u0008\u0010&\u001a\u00020\u0005H\u0002J\u0010\u0010\'\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002J\u001c\u0010(\u001a\u00020\u00122\u000c\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00020%2\u0006\u0010)\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"
    }
    d2 = {
        "Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;",
        "Lio/chad/library/adapter/base/BaseQuickAdapter;",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "isTrade",
        "",
        "symbolType",
        "",
        "<init>",
        "(ZLjava/lang/Integer;)V",
        "Ljava/lang/Integer;",
        "isFavor",
        "filterKey",
        "",
        "longClickPosition",
        "isShowFee",
        "isNotBindRecyclerView",
        "setIsFavor",
        "",
        "setIsShowFee",
        "isShow",
        "customRightSymbolSortType",
        "Lcom/kubi/quotefacade/market/sort/SymbolsSortType;",
        "updateRightCustomSymbolSortType",
        "curSymbolSortType",
        "setLongClickPosition",
        "position",
        "convert",
        "helper",
        "item",
        "setRootView",
        "setCommonView",
        "getFundingRateMarketCapInfo",
        "setETFView",
        "setPriceView",
        "replaceData",
        "data",
        "",
        "isSpotType",
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

.field public final j:Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Z

.field public l:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public m:I

.field public n:Z

.field public o:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/lang/Integer;)V
    .locals 1
    .param p2    # Ljava/lang/Integer;
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
    iput-boolean p1, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->i:Z

    .line 8
    .line 9
    iput-object p2, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->j:Ljava/lang/Integer;

    .line 10
    const/4 p1, -0x1

    .line 11
    .line 12
    iput p1, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->m:I

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->setHasStableIds(Z)V

    .line 17
    .line 18
    sget-object p1, Lcom/kubi/quotefacade/market/sort/SymbolsSortType;->CHANGE_RATE:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->o:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

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
.end method

.method private final k()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->j:Ljava/lang/Integer;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    :goto_0
    iget-object v0, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->j:Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    goto :goto_1

    .line 17
    .line 18
    .line 19
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x2

    .line 22
    .line 23
    if-ne v0, v1, :cond_2

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    :goto_1
    const/4 v0, 0x0

    .line 26
    return v0

    .line 27
    :cond_3
    :goto_2
    const/4 v0, 0x1

    .line 28
    return v0
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

.method private final l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 20

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
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    .line 13
    invoke-virtual {v3}, Lcom/kubi/data/entity/SymbolInfoEntity;->isPreviewEnableShow()Z

    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x1

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-boolean v3, v0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->i:Z

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    move v3, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v3, v4

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 29
    move-result v6

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v6, v1}, Lyu/a0;->a(Lcom/kubi/data/entity/TradeItemBean;ZLio/chad/library/adapter/base/BaseViewHolder;)V

    .line 33
    .line 34
    sget v6, Lcom/kubi/quotefacade/R$id;->iv_fav:I

    .line 35
    .line 36
    iget-boolean v7, v0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k:Z

    .line 37
    .line 38
    if-nez v7, :cond_2

    .line 39
    .line 40
    .line 41
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 42
    move-result v7

    .line 43
    .line 44
    if-eqz v7, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-static {v2}, Lyu/u;->b(Lcom/kubi/data/entity/TradeItemBean;)Z

    .line 48
    move-result v7

    .line 49
    goto :goto_1

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {v2}, Lyu/u;->c(Lcom/kubi/data/entity/TradeItemBean;)Z

    .line 53
    move-result v7

    .line 54
    .line 55
    :goto_1
    if-eqz v7, :cond_2

    .line 56
    move v7, v5

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v7, v4

    .line 59
    .line 60
    .line 61
    :goto_2
    invoke-virtual {v1, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 62
    move-result-object v6

    .line 63
    .line 64
    sget v7, Lcom/kubi/quotefacade/R$id;->iv_warning_tag:I

    .line 65
    .line 66
    sget-object v8, Lcom/kubi/quotefacade/helper/t1;->a:Lcom/kubi/quotefacade/helper/t1;

    .line 67
    .line 68
    .line 69
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 70
    move-result v9

    .line 71
    xor-int/2addr v9, v5

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->isAlarm()Z

    .line 75
    move-result v10

    .line 76
    .line 77
    iget-boolean v11, v0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->i:Z

    .line 78
    .line 79
    .line 80
    invoke-virtual {v8, v9, v10, v11}, Lcom/kubi/quotefacade/helper/t1;->d(ZZZ)Z

    .line 81
    move-result v8

    .line 82
    .line 83
    .line 84
    invoke-virtual {v6, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 85
    move-result-object v6

    .line 86
    .line 87
    sget v7, Lcom/kubi/quotefacade/R$id;->tv_lever:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getMaxLeverage()I

    .line 91
    move-result v8

    .line 92
    .line 93
    if-lez v8, :cond_3

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lhf/a;->a()Z

    .line 97
    move-result v8

    .line 98
    .line 99
    if-eqz v8, :cond_3

    .line 100
    move v8, v5

    .line 101
    goto :goto_3

    .line 102
    :cond_3
    move v8, v4

    .line 103
    .line 104
    .line 105
    :goto_3
    invoke-virtual {v6, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 106
    move-result-object v6

    .line 107
    .line 108
    new-instance v8, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getMaxLeverage()I

    .line 115
    move-result v9

    .line 116
    .line 117
    .line 118
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const/16 v9, 0x78

    .line 121
    .line 122
    .line 123
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 127
    move-result-object v8

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v7, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 131
    move-result-object v6

    .line 132
    .line 133
    sget v7, Lcom/kubi/quotefacade/R$id;->tv_money_price:I

    .line 134
    .line 135
    const-string v8, "-"

    .line 136
    const/4 v9, 0x0

    .line 137
    .line 138
    if-eqz v3, :cond_4

    .line 139
    move-object v10, v8

    .line 140
    goto :goto_5

    .line 141
    .line 142
    .line 143
    :cond_4
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 144
    move-result-wide v10

    .line 145
    .line 146
    .line 147
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 148
    move-result-object v12

    .line 149
    .line 150
    if-eqz v12, :cond_5

    .line 151
    .line 152
    .line 153
    invoke-virtual {v12}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 154
    move-result-object v12

    .line 155
    goto :goto_4

    .line 156
    :cond_5
    move-object v12, v9

    .line 157
    .line 158
    .line 159
    :goto_4
    invoke-static {v10, v11, v12}, Lkf/a;->m(DLjava/lang/String;)D

    .line 160
    move-result-wide v10

    .line 161
    .line 162
    new-instance v12, Ljava/math/BigDecimal;

    .line 163
    .line 164
    .line 165
    invoke-static {v10, v11}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 166
    move-result-object v10

    .line 167
    .line 168
    .line 169
    invoke-direct {v12, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    const/16 v16, 0x7

    .line 172
    .line 173
    const/16 v17, 0x0

    .line 174
    const/4 v13, 0x0

    .line 175
    const/4 v14, 0x0

    .line 176
    const/4 v15, 0x0

    .line 177
    .line 178
    .line 179
    invoke-static/range {v12 .. v17}, Lkf/b;->g(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;IILjava/lang/Object;)Landroid/text/SpannableStringBuilder;

    .line 180
    move-result-object v10

    .line 181
    .line 182
    .line 183
    :goto_5
    invoke-virtual {v6, v7, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 184
    move-result-object v6

    .line 185
    .line 186
    sget v7, Lcom/kubi/quotefacade/R$id;->tv_change_rate:I

    .line 187
    .line 188
    iget-object v10, v0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->o:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 189
    .line 190
    sget-object v11, Lcom/kubi/quotefacade/market/sort/SymbolsSortType;->CHANGE_RATE:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 191
    .line 192
    if-ne v10, v11, :cond_6

    .line 193
    move v10, v5

    .line 194
    goto :goto_6

    .line 195
    :cond_6
    move v10, v4

    .line 196
    .line 197
    .line 198
    :goto_6
    invoke-virtual {v6, v7, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setVisible(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 199
    move-result-object v6

    .line 200
    .line 201
    if-eqz v3, :cond_7

    .line 202
    move-object v10, v8

    .line 203
    goto :goto_8

    .line 204
    .line 205
    .line 206
    :cond_7
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 207
    move-result-object v10

    .line 208
    .line 209
    if-eqz v10, :cond_8

    .line 210
    .line 211
    new-instance v11, Ljava/math/BigDecimal;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    .line 215
    move-result-wide v12

    .line 216
    .line 217
    .line 218
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 219
    move-result-object v10

    .line 220
    .line 221
    .line 222
    invoke-direct {v11, v10}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-static {v11}, Lkf/a;->y(Ljava/math/BigDecimal;)I

    .line 226
    move-result v14

    .line 227
    .line 228
    const/16 v18, 0x13

    .line 229
    .line 230
    const/16 v19, 0x0

    .line 231
    const/4 v12, 0x0

    .line 232
    const/4 v13, 0x0

    .line 233
    const/4 v15, 0x1

    .line 234
    .line 235
    const/16 v16, 0x0

    .line 236
    .line 237
    const/16 v17, 0x0

    .line 238
    .line 239
    .line 240
    invoke-static/range {v11 .. v19}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 241
    move-result-object v10

    .line 242
    .line 243
    .line 244
    invoke-static {v10}, Lnf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    move-result-object v10

    .line 246
    .line 247
    .line 248
    invoke-static {v10}, Lnf/b;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    move-result-object v10

    .line 250
    goto :goto_7

    .line 251
    :cond_8
    move-object v10, v9

    .line 252
    .line 253
    .line 254
    :goto_7
    invoke-static {v10}, Llf/b;->l(Ljava/lang/String;)Ljava/lang/String;

    .line 255
    move-result-object v10

    .line 256
    .line 257
    .line 258
    :goto_8
    invoke-virtual {v6, v7, v10}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 259
    move-result-object v6

    .line 260
    .line 261
    sget v10, Lcom/kubi/quotefacade/R$id;->tv_value:I

    .line 262
    .line 263
    iget-boolean v11, v0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->i:Z

    .line 264
    .line 265
    .line 266
    invoke-virtual {v6, v10, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 267
    move-result-object v6

    .line 268
    .line 269
    sget v11, Lcom/kubi/quotefacade/R$id;->tv_etf_label:I

    .line 270
    .line 271
    .line 272
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 273
    move-result v12

    .line 274
    .line 275
    if-eqz v12, :cond_9

    .line 276
    .line 277
    .line 278
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 279
    move-result-object v12

    .line 280
    .line 281
    .line 282
    invoke-virtual {v12}, Lcom/kubi/data/entity/SymbolInfoEntity;->isEtfSymbol()Z

    .line 283
    move-result v12

    .line 284
    .line 285
    if-eqz v12, :cond_9

    .line 286
    move v12, v5

    .line 287
    goto :goto_9

    .line 288
    :cond_9
    move v12, v4

    .line 289
    .line 290
    .line 291
    :goto_9
    invoke-virtual {v6, v11, v12}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 292
    move-result-object v6

    .line 293
    .line 294
    sget v11, Lcom/kubi/quotefacade/R$id;->tv_label_st:I

    .line 295
    .line 296
    .line 297
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 298
    move-result v12

    .line 299
    .line 300
    if-eqz v12, :cond_a

    .line 301
    .line 302
    .line 303
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getMark()I

    .line 304
    move-result v12

    .line 305
    .line 306
    if-ne v12, v5, :cond_a

    .line 307
    move v12, v5

    .line 308
    goto :goto_a

    .line 309
    :cond_a
    move v12, v4

    .line 310
    .line 311
    .line 312
    :goto_a
    invoke-virtual {v6, v11, v12}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 313
    move-result-object v6

    .line 314
    .line 315
    const-string v11, "setGone(...)"

    .line 316
    .line 317
    .line 318
    invoke-static {v6, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    const-string v11, "getContext(...)"

    .line 321
    .line 322
    if-eqz v3, :cond_b

    .line 323
    .line 324
    iget-object v12, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 325
    .line 326
    .line 327
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 328
    move-result-object v12

    .line 329
    .line 330
    .line 331
    invoke-static {v12, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 332
    .line 333
    sget v11, Lcom/kubi/quotefacade/R$attr;->upColor:I

    .line 334
    .line 335
    .line 336
    invoke-static {v12, v11}, Lcom/kubi/resources/g;->b(Landroid/content/Context;I)I

    .line 337
    move-result v11

    .line 338
    const/4 v12, 0x0

    .line 339
    const/4 v13, 0x2

    .line 340
    .line 341
    .line 342
    invoke-static {v11, v12, v13, v9}, Lcom/kubi/resources/g;->m(IFILjava/lang/Object;)Landroid/graphics/drawable/GradientDrawable;

    .line 343
    move-result-object v11

    .line 344
    goto :goto_b

    .line 345
    .line 346
    .line 347
    :cond_b
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getChangeRate()Ljava/lang/Double;

    .line 348
    move-result-object v12

    .line 349
    .line 350
    .line 351
    invoke-static {v12}, Lcom/kubi/utils/extensions/d;->f(Ljava/lang/Double;)D

    .line 352
    move-result-wide v12

    .line 353
    .line 354
    iget-object v14, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v14}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 358
    move-result-object v14

    .line 359
    .line 360
    .line 361
    invoke-static {v14, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-static {v12, v13, v14}, Lcom/kubi/resources/g;->k(DLandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 365
    move-result-object v11

    .line 366
    .line 367
    .line 368
    :goto_b
    invoke-static {v6, v7, v11}, Lcom/kubi/resources/g;->r(Lio/chad/library/adapter/base/BaseViewHolder;ILandroid/graphics/drawable/Drawable;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 369
    move-result-object v6

    .line 370
    .line 371
    sget v7, Lcom/kubi/quotefacade/R$id;->tv_ready:I

    .line 372
    .line 373
    .line 374
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 375
    move-result v11

    .line 376
    .line 377
    if-eqz v11, :cond_c

    .line 378
    .line 379
    if-eqz v3, :cond_c

    .line 380
    move v11, v5

    .line 381
    goto :goto_c

    .line 382
    :cond_c
    move v11, v4

    .line 383
    .line 384
    .line 385
    :goto_c
    invoke-virtual {v6, v7, v11}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 386
    move-result-object v6

    .line 387
    .line 388
    if-eqz v3, :cond_d

    .line 389
    goto :goto_d

    .line 390
    .line 391
    .line 392
    :cond_d
    invoke-direct {v0, v2}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->q(Lcom/kubi/data/entity/TradeItemBean;)Ljava/lang/String;

    .line 393
    move-result-object v8

    .line 394
    .line 395
    .line 396
    :goto_d
    invoke-virtual {v6, v10, v8}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 397
    move-result-object v3

    .line 398
    .line 399
    sget v6, Lcom/kubi/quotefacade/R$id;->tv_label_new:I

    .line 400
    .line 401
    .line 402
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 403
    move-result v7

    .line 404
    .line 405
    if-nez v7, :cond_10

    .line 406
    .line 407
    instance-of v7, v2, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 408
    .line 409
    if-eqz v7, :cond_e

    .line 410
    move-object v7, v2

    .line 411
    .line 412
    check-cast v7, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 413
    goto :goto_e

    .line 414
    :cond_e
    move-object v7, v9

    .line 415
    .line 416
    :goto_e
    if-eqz v7, :cond_f

    .line 417
    .line 418
    .line 419
    invoke-static {v7}, Lyu/a0;->d(Lcom/kubi/quotefacade/entity/FutureTradeItemBean;)Z

    .line 420
    move-result v7

    .line 421
    .line 422
    if-ne v7, v5, :cond_f

    .line 423
    move v7, v5

    .line 424
    goto :goto_f

    .line 425
    :cond_f
    move v7, v4

    .line 426
    .line 427
    :goto_f
    if-eqz v7, :cond_10

    .line 428
    move v7, v5

    .line 429
    goto :goto_10

    .line 430
    :cond_10
    move v7, v4

    .line 431
    .line 432
    .line 433
    :goto_10
    invoke-virtual {v3, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 434
    move-result-object v3

    .line 435
    .line 436
    sget v6, Lcom/kubi/quotefacade/R$id;->tv_label_rwa:I

    .line 437
    .line 438
    .line 439
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 440
    move-result v7

    .line 441
    .line 442
    if-eqz v7, :cond_11

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->isRWA()Z

    .line 446
    move-result v7

    .line 447
    .line 448
    if-eqz v7, :cond_11

    .line 449
    move v7, v5

    .line 450
    goto :goto_11

    .line 451
    :cond_11
    move v7, v4

    .line 452
    .line 453
    .line 454
    :goto_11
    invoke-virtual {v3, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 455
    move-result-object v3

    .line 456
    .line 457
    sget v6, Lcom/kubi/quotefacade/R$id;->iv_hot_tag:I

    .line 458
    .line 459
    .line 460
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 461
    move-result v7

    .line 462
    .line 463
    if-nez v7, :cond_14

    .line 464
    .line 465
    instance-of v7, v2, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 466
    .line 467
    if-eqz v7, :cond_12

    .line 468
    move-object v9, v2

    .line 469
    .line 470
    check-cast v9, Lcom/kubi/quotefacade/entity/FutureTradeItemBean;

    .line 471
    .line 472
    :cond_12
    if-eqz v9, :cond_13

    .line 473
    .line 474
    .line 475
    invoke-static {v9}, Lyu/a0;->c(Lcom/kubi/quotefacade/entity/FutureTradeItemBean;)Z

    .line 476
    move-result v7

    .line 477
    .line 478
    if-ne v7, v5, :cond_13

    .line 479
    move v7, v5

    .line 480
    goto :goto_12

    .line 481
    :cond_13
    move v7, v4

    .line 482
    .line 483
    :goto_12
    if-eqz v7, :cond_14

    .line 484
    move v7, v5

    .line 485
    goto :goto_13

    .line 486
    :cond_14
    move v7, v4

    .line 487
    .line 488
    .line 489
    :goto_13
    invoke-virtual {v3, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 490
    move-result-object v3

    .line 491
    .line 492
    sget v6, Lcom/kubi/quotefacade/R$id;->fundingRateMarketCapInfoTv:I

    .line 493
    .line 494
    iget-object v7, v0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->o:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 495
    .line 496
    sget-object v8, Lcom/kubi/quotefacade/market/sort/SymbolsSortType;->FUNDING_RATE:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 497
    .line 498
    if-eq v7, v8, :cond_16

    .line 499
    .line 500
    sget-object v8, Lcom/kubi/quotefacade/market/sort/SymbolsSortType;->MARKET_CAP:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 501
    .line 502
    if-ne v7, v8, :cond_15

    .line 503
    goto :goto_14

    .line 504
    :cond_15
    move v7, v4

    .line 505
    goto :goto_15

    .line 506
    :cond_16
    :goto_14
    move v7, v5

    .line 507
    .line 508
    .line 509
    :goto_15
    invoke-virtual {v3, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 510
    move-result-object v3

    .line 511
    .line 512
    .line 513
    invoke-virtual {v0, v2}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->i(Lcom/kubi/data/entity/TradeItemBean;)Ljava/lang/String;

    .line 514
    move-result-object v7

    .line 515
    .line 516
    .line 517
    invoke-virtual {v3, v6, v7}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {v2}, Lcom/kubi/data/entity/TradeItemBean;->getCoinLabel()Ljava/lang/String;

    .line 521
    move-result-object v2

    .line 522
    .line 523
    if-nez v2, :cond_17

    .line 524
    .line 525
    const-string v2, ""

    .line 526
    .line 527
    .line 528
    :cond_17
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 529
    move-result v3

    .line 530
    .line 531
    const/16 v6, 0xa

    .line 532
    .line 533
    if-le v3, v6, :cond_18

    .line 534
    .line 535
    new-instance v3, Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 539
    const/4 v6, 0x7

    .line 540
    .line 541
    .line 542
    invoke-virtual {v2, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 543
    move-result-object v2

    .line 544
    .line 545
    const-string v6, "substring(...)"

    .line 546
    .line 547
    .line 548
    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    const-string v2, "..."

    .line 554
    .line 555
    .line 556
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 560
    move-result-object v2

    .line 561
    .line 562
    :cond_18
    sget v3, Lcom/kubi/quotefacade/R$id;->tv_fee:I

    .line 563
    .line 564
    .line 565
    invoke-virtual {v1, v3, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 566
    move-result-object v1

    .line 567
    .line 568
    .line 569
    invoke-direct {v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

    .line 570
    move-result v6

    .line 571
    .line 572
    if-eqz v6, :cond_1a

    .line 573
    .line 574
    iget-boolean v6, v0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->n:Z

    .line 575
    .line 576
    if-eqz v6, :cond_1a

    .line 577
    .line 578
    .line 579
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 580
    move-result v2

    .line 581
    .line 582
    if-lez v2, :cond_19

    .line 583
    move v2, v5

    .line 584
    goto :goto_16

    .line 585
    :cond_19
    move v2, v4

    .line 586
    .line 587
    :goto_16
    if-eqz v2, :cond_1a

    .line 588
    move v4, v5

    .line 589
    .line 590
    .line 591
    :cond_1a
    invoke-virtual {v1, v3, v4}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 592
    return-void
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

.method private final m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->k()Z

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

.method private final o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/data/entity/SymbolInfoEntity;->isPreviewEnableShow()Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->i:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    const/4 v0, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    .line 20
    :goto_0
    sget v2, Lcom/kubi/quotefacade/R$id;->tv_value:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    const-string v3, "getView(...)"

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    check-cast v2, Landroid/widget/TextView;

    .line 32
    const/4 v3, 0x0

    .line 33
    const/4 v4, 0x3

    .line 34
    .line 35
    .line 36
    invoke-static {v2, v3, v1, v4, v3}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 37
    .line 38
    sget v2, Lcom/kubi/quotefacade/R$id;->tv_price:I

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    check-cast p1, Lcom/kubi/resources/widget/UpDownColorTextView;

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v3, v1, v4, v3}, Lrs/b;->c(Landroid/widget/TextView;Lrs/c;ZILjava/lang/Object;)Landroid/widget/TextView;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, Lcom/kubi/resources/widget/UpDownColorTextView;->setVisibleToUser(Z)V

    .line 54
    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    const-string p2, "-"

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_1
    new-instance v0, Ljava/math/BigDecimal;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getLastDealPrice()D

    .line 64
    move-result-wide v1

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    const/16 v8, 0x7e

    .line 78
    const/4 v9, 0x0

    .line 79
    const/4 v2, 0x0

    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x0

    .line 82
    const/4 v5, 0x0

    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    .line 86
    .line 87
    invoke-static/range {v0 .. v9}, Lgf/j;->d(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    .line 91
    invoke-static {p2}, Lcom/kubi/quotefacade/helper/QuoteExKt;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    move-result-object p2

    .line 93
    .line 94
    .line 95
    :goto_1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    return-void
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

.method private final q(Lcom/kubi/data/entity/TradeItemBean;)Ljava/lang/String;
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


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/data/entity/TradeItemBean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->g(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

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

.method public g(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
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
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-nez p2, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lio/chad/library/adapter/base/BaseQuickAdapter;->TAG:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "symbolType="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->j:Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v2, ", isTrade="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget-boolean v2, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->i:Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v2, ",item="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/kubi/data/entity/TradeItemBean;->getSymbol()Ljava/lang/String;

    .line 41
    move-result-object v2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->p(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0, p1, p2}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->l(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 58
    const/4 v0, 0x0

    .line 59
    .line 60
    .line 61
    invoke-static {p2, v0}, Lyu/u;->a(Lcom/kubi/data/entity/TradeItemBean;Z)Lyu/z;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, p1, p2}, Lyu/z;->a(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 66
    .line 67
    .line 68
    invoke-direct {p0, p1, p2}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->m(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 69
    .line 70
    .line 71
    invoke-direct {p0, p1, p2}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->o(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V

    .line 72
    :cond_1
    :goto_0
    return-void
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

.method public final h(Ljava/util/Collection;Ljava/lang/String;)V
    .locals 3
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
            "+",
            "Lcom/kubi/data/entity/TradeItemBean;",
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
    const-string v0, "quote"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iput-object p2, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->l:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

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
    new-instance v0, Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    move-result v1

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    check-cast v1, Lcom/kubi/data/entity/TradeItemBean;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-static {v2, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    move-result v2

    .line 53
    .line 54
    if-eqz v2, :cond_1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    goto :goto_0

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-super {p0, v0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 62
    return-void
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

.method public final i(Lcom/kubi/data/entity/TradeItemBean;)Ljava/lang/String;
    .locals 12

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->o:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/quotefacade/market/sort/SymbolsSortType;->FUNDING_RATE:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v3, p1, Lcom/kubi/data/entity/TradeItemBean;->fundingRate:Ljava/math/BigDecimal;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/16 v10, 0x13

    .line 14
    const/4 v11, 0x0

    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x4

    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x1

    .line 21
    .line 22
    .line 23
    invoke-static/range {v3 .. v11}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {v2}, Llf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    .line 31
    :cond_1
    sget-object v1, Lcom/kubi/quotefacade/market/sort/SymbolsSortType;->MARKET_CAP:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 32
    .line 33
    if-ne v0, v1, :cond_3

    .line 34
    .line 35
    iget-object v0, p1, Lcom/kubi/data/entity/TradeItemBean;->marketCap:Ljava/math/BigDecimal;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 41
    move-result-wide v0

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/data/entity/TradeItemBean;->getSymbolInfoEntity()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 45
    move-result-object p1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Lcom/kubi/data/entity/SymbolInfoEntity;->getQuoteCurrency()Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, p1}, Lkf/a;->m(DLjava/lang/String;)D

    .line 53
    move-result-wide v0

    .line 54
    .line 55
    new-instance p1, Ljava/math/BigDecimal;

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move-object p1, v2

    .line 65
    :goto_0
    const/4 v0, 0x0

    .line 66
    const/4 v1, 0x1

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v0, v1, v1, v2}, Lkf/a;->c(Ljava/math/BigDecimal;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    .line 73
    :cond_3
    const-string p1, "--"

    .line 74
    return-object p1
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

.method public final n(I)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->m:I

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

.method public final p(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/data/entity/TradeItemBean;)V
    .locals 1

    .line 1
    .line 2
    sget p2, Lcom/kubi/quotefacade/R$id;->root_view:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 6
    move-result-object p2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getAdapterPosition()I

    .line 10
    move-result p1

    .line 11
    .line 12
    iget v0, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->m:I

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    sget p1, Lcom/kubi/quotefacade/R$color;->c_cover2:I

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    sget p1, Lcom/kubi/quotefacade/R$drawable;->selector_darkoverlay_click:I

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundResource(I)V

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

.method public final r(Lcom/kubi/quotefacade/market/sort/SymbolsSortType;)V
    .locals 1
    .param p1    # Lcom/kubi/quotefacade/market/sort/SymbolsSortType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "curSymbolSortType"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->o:Lcom/kubi/quotefacade/market/sort/SymbolsSortType;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

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
    iget-object v0, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->l:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->l:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Lcom/kubi/quotefacade/adapter/MarketItemListAdapter;->h(Ljava/util/Collection;Ljava/lang/String;)V

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
