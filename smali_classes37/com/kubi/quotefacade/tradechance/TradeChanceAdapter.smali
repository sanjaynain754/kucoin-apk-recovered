.class public final Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;
.super Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;
.source "TradeChanceAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter<",
        "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00102\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0014J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0002H\u0014J\u0018\u0010\u0019\u001a\u00020\u0010*\u0006\u0012\u0002\u0008\u00030\t2\u0006\u0010\u0018\u001a\u00020\u0002H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0008H\u0002R>\u0010\u0006\u001a&\u0012\u0004\u0012\u00020\u0008\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\t0\u0007j\u0012\u0012\u0004\u0012\u00020\u0008\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\t`\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000e\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;",
        "Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;",
        "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;",
        "Lio/chad/library/adapter/base/BaseViewHolder;",
        "<init>",
        "()V",
        "contentViews",
        "Ljava/util/LinkedHashMap;",
        "",
        "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;",
        "Lkotlin/collections/LinkedHashMap;",
        "getContentViews",
        "()Ljava/util/LinkedHashMap;",
        "setContentViews",
        "(Ljava/util/LinkedHashMap;)V",
        "setDatas",
        "",
        "context",
        "Landroid/content/Context;",
        "dataList",
        "",
        "refreshItems",
        "convert",
        "helper",
        "item",
        "fillData",
        "isShowDivider",
        "",
        "position",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nTradeChanceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeChanceAdapter.kt\ncom/kubi/quotefacade/tradechance/TradeChanceAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,93:1\n1869#2,2:94\n360#2,7:96\n1869#2:103\n360#2,7:104\n1870#2:111\n*S KotlinDebug\n*F\n+ 1 TradeChanceAdapter.kt\ncom/kubi/quotefacade/tradechance/TradeChanceAdapter\n*L\n36#1:94,2\n86#1:96,7\n51#1:103\n52#1:104,7\n51#1:111\n*E\n"
    }
.end annotation


# instance fields
.field public i:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 5
    .line 6
    sget v0, Lcom/kubi/quotefacade/R$layout;->quote_item_trade_chance_data:I

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 11
    const/4 v1, 0x3

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v1, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 15
    const/4 v1, 0x4

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 19
    const/4 v1, 0x5

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1, v0}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 23
    .line 24
    const/16 v0, 0x3e7

    .line 25
    .line 26
    sget v1, Lcom/kubi/quotefacade/R$layout;->quote_item_trade_chance_footer:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v0, v1}, Lio/chad/library/adapter/base/BaseMultiItemQuickAdapter;->addItemType(II)V

    .line 30
    .line 31
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    .line 34
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 35
    .line 36
    iput-object v0, p0, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i:Ljava/util/LinkedHashMap;

    .line 37
    return-void
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

.method public static synthetic g(Ljava/util/List;Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->o(Ljava/util/List;Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;)Lkotlin/Unit;

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

.method public static synthetic h(Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->k(Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;)Lkotlin/Unit;

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

.method public static final k(Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    instance-of v0, p0, Lcom/kubi/quotefacade/tradechance/ChanceDataPlate;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    instance-of v0, p1, Lcom/kubi/quotefacade/tradechance/submodule/plate/ChancePlateView;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    move-object v1, p1

    .line 11
    .line 12
    check-cast v1, Lcom/kubi/quotefacade/tradechance/submodule/plate/ChancePlateView;

    .line 13
    .line 14
    :cond_0
    if-eqz v1, :cond_9

    .line 15
    .line 16
    check-cast p0, Lcom/kubi/quotefacade/tradechance/ChanceDataPlate;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/quotefacade/tradechance/ChanceDataPlate;->getEntity()Lcom/kubi/quotefacade/entity/ChancePlateEntity;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p0}, Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;->f(Ljava/lang/Object;)V

    .line 24
    goto :goto_0

    .line 25
    .line 26
    :cond_1
    instance-of v0, p0, Lcom/kubi/quotefacade/tradechance/ChanceDataGemBox;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    instance-of v0, p1, Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxView;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    move-object v1, p1

    .line 34
    .line 35
    check-cast v1, Lcom/kubi/quotefacade/tradechance/submodule/gembox/ChanceGemBoxView;

    .line 36
    .line 37
    :cond_2
    if-eqz v1, :cond_9

    .line 38
    .line 39
    check-cast p0, Lcom/kubi/quotefacade/tradechance/ChanceDataGemBox;

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/kubi/quotefacade/tradechance/ChanceDataGemBox;->getEntity()Lcom/kubi/quotefacade/entity/ChanceGemBoxEntity;

    .line 43
    move-result-object p0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0}, Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;->f(Ljava/lang/Object;)V

    .line 47
    goto :goto_0

    .line 48
    .line 49
    :cond_3
    instance-of v0, p0, Lcom/kubi/quotefacade/tradechance/ChanceDataMarketChange;

    .line 50
    .line 51
    if-eqz v0, :cond_5

    .line 52
    .line 53
    instance-of v0, p1, Lcom/kubi/quotefacade/tradechance/submodule/marketchange/ChanceChangeView;

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    move-object v1, p1

    .line 57
    .line 58
    check-cast v1, Lcom/kubi/quotefacade/tradechance/submodule/marketchange/ChanceChangeView;

    .line 59
    .line 60
    :cond_4
    if-eqz v1, :cond_9

    .line 61
    .line 62
    check-cast p0, Lcom/kubi/quotefacade/tradechance/ChanceDataMarketChange;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/kubi/quotefacade/tradechance/ChanceDataMarketChange;->getEntityList()Ljava/util/List;

    .line 66
    move-result-object p0

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p0}, Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;->f(Ljava/lang/Object;)V

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :cond_5
    instance-of v0, p0, Lcom/kubi/quotefacade/tradechance/ChanceDataWhale;

    .line 73
    .line 74
    if-eqz v0, :cond_7

    .line 75
    .line 76
    instance-of v0, p1, Lcom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView;

    .line 77
    .line 78
    if-eqz v0, :cond_6

    .line 79
    move-object v1, p1

    .line 80
    .line 81
    check-cast v1, Lcom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView;

    .line 82
    .line 83
    :cond_6
    if-eqz v1, :cond_9

    .line 84
    .line 85
    check-cast p0, Lcom/kubi/quotefacade/tradechance/ChanceDataWhale;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/kubi/quotefacade/tradechance/ChanceDataWhale;->getEntityList()Ljava/util/List;

    .line 89
    move-result-object p0

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p0}, Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;->f(Ljava/lang/Object;)V

    .line 93
    goto :goto_0

    .line 94
    .line 95
    :cond_7
    instance-of v0, p0, Lcom/kubi/quotefacade/tradechance/ChanceDataHotRank;

    .line 96
    .line 97
    if-eqz v0, :cond_9

    .line 98
    .line 99
    instance-of v0, p1, Lcom/kubi/quotefacade/tradechance/submodule/hotrank/ChanceHotrankView;

    .line 100
    .line 101
    if-eqz v0, :cond_8

    .line 102
    move-object v1, p1

    .line 103
    .line 104
    check-cast v1, Lcom/kubi/quotefacade/tradechance/submodule/hotrank/ChanceHotrankView;

    .line 105
    .line 106
    :cond_8
    if-eqz v1, :cond_9

    .line 107
    .line 108
    check-cast p0, Lcom/kubi/quotefacade/tradechance/ChanceDataHotRank;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/kubi/quotefacade/tradechance/ChanceDataHotRank;->getEntity()Lcom/kubi/quotefacade/entity/ChanceHotRankEntity;

    .line 112
    move-result-object p0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, p0}, Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;->f(Ljava/lang/Object;)V

    .line 116
    .line 117
    :cond_9
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 118
    return-object p0
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

.method public static final o(Ljava/util/List;Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    const-string v2, "getData(...)"

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    move-result v3

    .line 35
    const/4 v4, -0x1

    .line 36
    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    check-cast v3, Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Lio/chad/library/adapter/base/entity/MultiItemEntity;->getItemType()I

    .line 47
    move-result v3

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Lio/chad/library/adapter/base/entity/MultiItemEntity;->getItemType()I

    .line 51
    move-result v5

    .line 52
    .line 53
    if-ne v3, v5, :cond_1

    .line 54
    goto :goto_2

    .line 55
    .line 56
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    move v2, v4

    .line 59
    .line 60
    :goto_2
    if-eq v2, v4, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v2, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 71
    goto :goto_0

    .line 72
    .line 73
    :cond_3
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 74
    return-object p0
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


# virtual methods
.method public bridge synthetic convert(Lio/chad/library/adapter/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    check-cast p2, Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;)V

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

.method public i(Lio/chad/library/adapter/base/BaseViewHolder;Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;)V
    .locals 4
    .param p1    # Lio/chad/library/adapter/base/BaseViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "helper"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "item"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Lio/chad/library/adapter/base/entity/MultiItemEntity;->getItemType()I

    .line 14
    move-result v0

    .line 15
    .line 16
    const/16 v1, 0x3e7

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    sget v0, Lcom/kubi/quotefacade/R$id;->divider:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getBindingAdapterPosition()I

    .line 25
    move-result v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->m(I)Z

    .line 29
    move-result v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->setGone(IZ)Lio/chad/library/adapter/base/BaseViewHolder;

    .line 33
    .line 34
    iget-object v0, p0, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i:Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    .line 37
    invoke-interface {p2}, Lio/chad/library/adapter/base/entity/MultiItemEntity;->getItemType()I

    .line 38
    move-result v1

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_1
    sget v1, Lcom/kubi/quotefacade/R$id;->layoutContainer:I

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v1}, Lio/chad/library/adapter/base/BaseViewHolder;->getView(I)Landroid/view/View;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    check-cast p1, Landroid/widget/FrameLayout;

    .line 60
    .line 61
    if-nez p1, :cond_2

    .line 62
    :goto_0
    return-void

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    move-result v1

    .line 67
    .line 68
    if-nez v1, :cond_5

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 75
    .line 76
    if-eqz v2, :cond_3

    .line 77
    .line 78
    check-cast v1, Landroid/view/ViewGroup;

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/4 v1, 0x0

    .line 81
    .line 82
    :goto_1
    if-eqz v1, :cond_4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 86
    .line 87
    :cond_4
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 88
    const/4 v2, -0x1

    .line 89
    const/4 v3, -0x2

    .line 90
    .line 91
    .line 92
    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    .line 98
    :cond_5
    invoke-virtual {p0, v0, p2}, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->j(Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;)V

    .line 99
    return-void
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

.method public final j(Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView<",
            "*>;",
            "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/quotefacade/tradechance/b;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p2, p1}, Lcom/kubi/quotefacade/tradechance/b;-><init>(Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView;)V

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

.method public final l()Ljava/util/LinkedHashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/Integer;",
            "Lcom/kubi/quotefacade/tradechance/submodule/BaseChanceChildView<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i:Ljava/util/LinkedHashMap;

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
.end method

.method public final m(I)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "getData(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    move v2, v1

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v3

    .line 20
    const/4 v4, -0x1

    .line 21
    .line 22
    if-eqz v3, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    check-cast v3, Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;

    .line 29
    .line 30
    instance-of v3, v3, Lcom/kubi/quotefacade/tradechance/ChanceDataFooter;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v2, v4

    .line 38
    :goto_1
    const/4 v0, 0x1

    .line 39
    .line 40
    if-eq v2, v4, :cond_3

    .line 41
    sub-int/2addr v2, v0

    .line 42
    .line 43
    if-eq p1, v2, :cond_2

    .line 44
    return v0

    .line 45
    :cond_2
    return v1

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-virtual {p0}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 53
    move-result v2

    .line 54
    sub-int/2addr v2, v0

    .line 55
    .line 56
    if-eq p1, v2, :cond_4

    .line 57
    return v0

    .line 58
    :cond_4
    return v1
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

.method public final n(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "dataList"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/quotefacade/tradechance/a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p1, p0}, Lcom/kubi/quotefacade/tradechance/a;-><init>(Ljava/util/List;Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

    .line 14
    return-void
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

.method public final p(Landroid/content/Context;Ljava/util/List;)V
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "dataList"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_3

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    check-cast v1, Lcom/kubi/quotefacade/tradechance/ITradeChanceDataItem;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i:Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    .line 31
    invoke-interface {v1}, Lio/chad/library/adapter/base/entity/MultiItemEntity;->getItemType()I

    .line 32
    move-result v3

    .line 33
    .line 34
    .line 35
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    instance-of v2, v1, Lcom/kubi/quotefacade/tradechance/ChanceDataPlate;

    .line 45
    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    iget-object v2, p0, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i:Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    check-cast v1, Lcom/kubi/quotefacade/tradechance/ChanceDataPlate;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/ChanceDataPlate;->getItemType()I

    .line 54
    move-result v1

    .line 55
    .line 56
    .line 57
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 58
    move-result-object v1

    .line 59
    .line 60
    new-instance v3, Lcom/kubi/quotefacade/tradechance/submodule/plate/ChancePlateView;

    .line 61
    .line 62
    .line 63
    invoke-direct {v3, p1}, Lcom/kubi/quotefacade/tradechance/submodule/plate/ChancePlateView;-><init>(Landroid/content/Context;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :cond_1
    instance-of v2, v1, Lcom/kubi/quotefacade/tradechance/ChanceDataMarketChange;

    .line 70
    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    iget-object v2, p0, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    check-cast v1, Lcom/kubi/quotefacade/tradechance/ChanceDataMarketChange;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/ChanceDataMarketChange;->getItemType()I

    .line 79
    move-result v1

    .line 80
    .line 81
    .line 82
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    new-instance v3, Lcom/kubi/quotefacade/tradechance/submodule/marketchange/ChanceChangeView;

    .line 86
    .line 87
    .line 88
    invoke-direct {v3, p1}, Lcom/kubi/quotefacade/tradechance/submodule/marketchange/ChanceChangeView;-><init>(Landroid/content/Context;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    goto :goto_0

    .line 93
    .line 94
    :cond_2
    instance-of v2, v1, Lcom/kubi/quotefacade/tradechance/ChanceDataWhale;

    .line 95
    .line 96
    if-eqz v2, :cond_0

    .line 97
    .line 98
    iget-object v2, p0, Lcom/kubi/quotefacade/tradechance/TradeChanceAdapter;->i:Ljava/util/LinkedHashMap;

    .line 99
    .line 100
    check-cast v1, Lcom/kubi/quotefacade/tradechance/ChanceDataWhale;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Lcom/kubi/quotefacade/tradechance/ChanceDataWhale;->getItemType()I

    .line 104
    move-result v1

    .line 105
    .line 106
    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    new-instance v3, Lcom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView;

    .line 111
    .line 112
    .line 113
    invoke-direct {v3, p1}, Lcom/kubi/quotefacade/tradechance/submodule/whale/ChanceWhaleView;-><init>(Landroid/content/Context;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    goto :goto_0

    .line 118
    .line 119
    .line 120
    :cond_3
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->toMutableList(Ljava/util/Collection;)Ljava/util/List;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 125
    return-void
    .line 126
    .line 127
    .line 128
.end method
