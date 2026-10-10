.class public interface abstract Lzu/b;
.super Ljava/lang/Object;
.source "IQuoteApi.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u0012\u0012\u000e\u0012\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u00032\n\u0008\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\'\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f2\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00130\u000fH\'J\u0018\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u000f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020\u0018H\'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00130\u000f2\u0008\u0008\u0001\u0010\u001b\u001a\u00020\u0007H\'J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00130\u000fH\'J,\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000f2\u0008\u0008\u0001\u0010\u001f\u001a\u00020\u00072\u0008\u0008\u0001\u0010 \u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\'J8\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000f2\u0008\u0008\u0001\u0010\u001f\u001a\u00020\u00072\u0008\u0008\u0001\u0010 \u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000b2\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\'J\"\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u000f2\u0008\u0008\u0001\u0010#\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u000c\u001a\u00020\u000bH\'J\u0014\u0010$\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%0\u00130\u000fH\'J \u0010&\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\'0\u00130\u000f2\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\'J\u0014\u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020%0\u00130\u000fH\'J\u0014\u0010)\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0\u00130\u000fH\'J \u0010+\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0\u00130\u000f2\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\'J\u0014\u0010,\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0\u00130\u000fH\'J,\u0010-\u001a\u0008\u0012\u0004\u0012\u00020.0\u00132\n\u0008\u0001\u0010/\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u00100J\u001c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u00102\u001a\u000203H\u00a7@\u00a2\u0006\u0002\u00104J&\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00132\u000e\u0008\u0001\u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0013H\u00a7@\u00a2\u0006\u0002\u00107J\u001e\u00108\u001a\u0008\u0012\u0004\u0012\u00020.0\u00132\u0008\u0008\u0001\u0010\u0017\u001a\u000209H\u00a7@\u00a2\u0006\u0002\u0010:J(\u0010;\u001a\u0008\u0012\u0004\u0012\u00020.0\u00132\u0008\u0008\u0003\u0010<\u001a\u00020\u00072\u0008\u0008\u0001\u0010\u0017\u001a\u00020=H\u00a7@\u00a2\u0006\u0002\u0010>J\u0018\u0010?\u001a\u00020\u00012\u0008\u0008\u0001\u0010\u0017\u001a\u00020@H\u00a7@\u00a2\u0006\u0002\u0010AJ \u0010B\u001a\u0008\u0012\u0004\u0012\u00020.0\u00132\n\u0008\u0001\u0010/\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010CJ\u001a\u0010D\u001a\u00020E2\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010CJ\u0018\u0010F\u001a\u00020G2\u0008\u0008\u0001\u0010\u0017\u001a\u00020HH\u00a7@\u00a2\u0006\u0002\u0010IJ\u0018\u0010J\u001a\u00020G2\u0008\u0008\u0001\u0010\u0017\u001a\u00020HH\u00a7@\u00a2\u0006\u0002\u0010IJ\u0014\u0010K\u001a\u0008\u0012\u0004\u0012\u00020.0\u0013H\u00a7@\u00a2\u0006\u0002\u0010LJ\u0018\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020NH\'J\u0018\u0010O\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020PH\'J\u001a\u0010Q\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f2\n\u0008\u0001\u0010R\u001a\u0004\u0018\u00010\u0007H\'J\u001a\u0010S\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f2\n\u0008\u0001\u0010T\u001a\u0004\u0018\u00010\u0007H\'J\u001a\u0010U\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u000f2\n\u0008\u0001\u0010T\u001a\u0004\u0018\u00010\u0007H\'J\u0018\u0010V\u001a\u0008\u0012\u0004\u0012\u00020W0\u000f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020XH\'J*\u0010Y\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020Z0\u00130\u000f2\n\u0008\u0001\u0010T\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0001\u0010[\u001a\u00020\u0007H\'J\u001a\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\u000f2\u0008\u0008\u0001\u0010T\u001a\u00020^H\'J\u001e\u0010_\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001a0\u00130\u000f2\u0008\u0008\u0001\u0010\u0017\u001a\u00020`H\'J \u0010a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\'0\u00130\u000f2\n\u0008\u0001\u0010T\u001a\u0004\u0018\u00010\u0007H\'J\u0010\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010c0\u000fH\'J\u001c\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0\u000f2\n\u0008\u0001\u0010f\u001a\u0004\u0018\u00010\u0007H\'J\u001c\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0\u000f2\n\u0008\u0001\u0010f\u001a\u0004\u0018\u00010\u0007H\'J\u001c\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j0\u000f2\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\'J\u0016\u0010k\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020l\u0018\u00010\u00130\u000fH\'JR\u0010m\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010\u00132\n\u0008\u0001\u0010o\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010p\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010[\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010q\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010rJF\u0010s\u001a\n\u0012\u0004\u0012\u00020t\u0018\u00010\u00132\n\u0008\u0001\u0010o\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010p\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010[\u001a\u0004\u0018\u00010\u00072\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010uJ\"\u0010v\u001a\n\u0012\u0004\u0012\u00020w\u0018\u00010\u00132\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0002\u0010CJ\u0010\u0010x\u001a\u0004\u0018\u00010yH\u00a7@\u00a2\u0006\u0002\u0010LJ\u0010\u0010z\u001a\u0004\u0018\u00010{H\u00a7@\u00a2\u0006\u0002\u0010LJ0\u0010|\u001a\u0004\u0018\u00010}2\u0008\u0008\u0003\u0010<\u001a\u00020\u00072\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010~\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u007fJ2\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\u0008\u0008\u0001\u0010<\u001a\u00020\u00072\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0003\u0010~\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\u007fJ%\u0010\u0082\u0001\u001a\u0004\u0018\u00010G2\u0008\u0008\u0001\u0010<\u001a\u00020\u00072\u0008\u0008\u0003\u0010~\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u00100\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0083\u0001\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/kubi/quotefacade/api/IQuoteApi;",
        "",
        "getCardBusinessIdList",
        "Lio/reactivex/Observable;",
        "Lcom/kubi/sdk/base/entity/BaseEntity;",
        "Lcom/kubi/quotefacade/entity/Letter;",
        "cardBusinessIdList",
        "",
        "gmtCreated",
        "",
        "direct",
        "",
        "pageSize",
        "(Ljava/lang/String;Ljava/lang/Long;II)Lio/reactivex/Observable;",
        "getMenuList",
        "Lkotlinx/coroutines/flow/Flow;",
        "Lcom/kubi/quotefacade/entity/MarketMenuEntity;",
        "excludes",
        "getChainMenuList",
        "",
        "Lcom/kubi/quotefacade/entity/ChainMenuEntity;",
        "getChainMarketList",
        "Lcom/kubi/quotefacade/entity/ChainListEntity;",
        "param",
        "Lcom/kubi/quotefacade/entity/ChainListParam;",
        "getFavChainList",
        "Lcom/kubi/quotefacade/entity/ChainItemEntity;",
        "orderByRange",
        "getFavSimpleChainList",
        "getSpotList",
        "Lcom/kubi/quotefacade/entity/MarketListEntity;",
        "l1Keyword",
        "l2Keyword",
        "getFutureList",
        "getEtfList",
        "l1p",
        "getCollectSpotList",
        "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;",
        "getCollectFutureList",
        "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;",
        "getCollectETFList",
        "getRecommendSpotList",
        "Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;",
        "getRecommendFutureList",
        "getRecommendETFList",
        "fetchAlphaRecommend",
        "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
        "collectType",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchUserAlphaFavorites",
        "isPremium",
        "",
        "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchAlphaFavoritesInfo",
        "tokenChains",
        "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getAlphaDataByTokens",
        "Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParam;",
        "(Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getV2AlphaDataByTokens",
        "datasource",
        "Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;",
        "(Ljava/lang/String;Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "addOrDeleteAlphaToFav",
        "Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;",
        "(Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getFavAlphaList",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchAlphaMenu",
        "Lcom/kubi/quotefacade/entity/AlphaMenuEntity;",
        "fetchAlphaHighlights",
        "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;",
        "Lcom/kubi/quotefacade/entity/AlphaListBodyParam;",
        "(Lcom/kubi/quotefacade/entity/AlphaListBodyParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "fetchAlphaChainArea",
        "fetchAlphaRankList",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "updateFavoriteList",
        "Lcom/kubi/quotefacade/entity/UpdateFavParam;",
        "topFavoriteList",
        "Lcom/kubi/quotefacade/entity/PinTopFavParam;",
        "addOrDeleteSpotToFav",
        "symbol",
        "addOrDeleteFuturesToFav",
        "symbols",
        "addOrDeleteEtfToFav",
        "addOrDeleteMemeToFav",
        "Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;",
        "Lcom/kubi/quotefacade/entity/ChainWithTokenParam;",
        "getQuoteDataBySymbols",
        "Lcom/kubi/data/entity/TradeItemBean;",
        "from",
        "getQuoteDataBySymbolsV2",
        "Lcom/kubi/quotefacade/entity/TradeSymbolEntity;",
        "Lcom/kubi/quotefacade/entity/request/SymbolRequestParams;",
        "getChainDataByTokens",
        "Lcom/kubi/quotefacade/entity/ChainDataByTokensParam;",
        "getFutureDataBySymbols",
        "getMarketHoldingsDir",
        "Lcom/kubi/quotefacade/entity/HoldingDir;",
        "getMarketHoldingsData",
        "Lcom/kubi/quotefacade/entity/HoldingData;",
        "holdingsType",
        "getMarketAlphaHoldingsData",
        "Lcom/kubi/quotefacade/entity/HoldingAlphaData;",
        "getMarketAllHoldingsData",
        "Lcom/kubi/quotefacade/entity/HoldingCombinedData;",
        "chainHotSectors",
        "Lcom/kubi/quotefacade/entity/ChainMarketSectorsEntity;",
        "getRankSoptList",
        "Lcom/kubi/quotefacade/entity/RankEntity;",
        "rankType",
        "catalog",
        "market",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getRankFuturesList",
        "Lcom/kubi/quotefacade/entity/RankFuturesEntity;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCollectAllList",
        "Lcom/kubi/quotefacade/entity/AllQuoteEntity;",
        "fetchMarket",
        "Lcom/kubi/quotefacade/entity/RankMarketEntity;",
        "fetchBusinessConfig",
        "Lcom/kubi/quotefacade/entity/ComplianceFinanceRuleEntity;",
        "getCollectAllFavorites",
        "Lcom/kubi/quotefacade/entity/UserFavoritesEntity;",
        "customizations",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "getCollectFlatFavorites",
        "Lcom/kubi/quotefacade/entity/UserFavoritesSpotEntity;",
        "getCollectFlatFavoritesAlpha",
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


# direct methods
.method public static synthetic J(Lzu/b;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p5, :cond_1

    .line 3
    .line 4
    and-int/lit8 p4, p4, 0x2

    .line 5
    .line 6
    if-eqz p4, :cond_0

    .line 7
    .line 8
    const-string p2, "PriceWarn,SymbolLabel"

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lzu/b;->h(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string p1, "Super calls with default arguments not supported in this target, function: getCollectFlatFavoritesAlpha"

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p0
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
.end method

.method public static synthetic x(Lzu/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p6, :cond_1

    .line 3
    .line 4
    and-int/lit8 p5, p5, 0x4

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    const-string p3, "PriceWarn,SymbolLabel"

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lzu/b;->E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 16
    .line 17
    const-string p1, "Super calls with default arguments not supported in this target, function: getCollectFlatFavorites"

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 21
    throw p0
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
.end method

.method public static synthetic y(Lzu/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    if-nez p6, :cond_2

    .line 3
    .line 4
    and-int/lit8 p6, p5, 0x1

    .line 5
    .line 6
    if-eqz p6, :cond_0

    .line 7
    .line 8
    const-string p1, "All"

    .line 9
    .line 10
    :cond_0
    and-int/lit8 p5, p5, 0x4

    .line 11
    .line 12
    if-eqz p5, :cond_1

    .line 13
    .line 14
    const-string p3, "PriceWarn,SymbolLabel"

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-interface {p0, p1, p2, p3, p4}, Lzu/b;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    .line 21
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    const-string p1, "Super calls with default arguments not supported in this target, function: getCollectAllFavorites"

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    throw p0
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
.end method


# virtual methods
.method public abstract A(Ljava/lang/String;I)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "l1Keyword"
        .end annotation
    .end param
    .param p2    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/MarketListEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/app/discover-new/market_area/area/etf"
    .end annotation
.end method

.method public abstract B(Lcom/kubi/quotefacade/entity/ChainWithTokenParam;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/quotefacade/entity/ChainWithTokenParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/ChainWithTokenParam;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "/app/discover-front/dex/smart_contract/favorites"
    .end annotation
.end method

.method public abstract C(Ljava/lang/String;Ljava/lang/Long;II)Lio/reactivex/Observable;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "cardGroupIdList"
        .end annotation
    .end param
    .param p2    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "gmtCreated"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "direct"
        .end annotation
    .end param
    .param p4    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "II)",
            "Lio/reactivex/Observable<",
            "Lcom/kubi/sdk/base/entity/BaseEntity<",
            "Lcom/kubi/quotefacade/entity/Letter;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/message-center/cardGroupList"
    .end annotation
.end method

.method public abstract D()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/chameleon/etf/collect/symbols"
    .end annotation
.end method

.method public abstract E(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "datasource"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "customizations"
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/UserFavoritesSpotEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "discover-front/user_favorites"
    .end annotation
.end method

.method public abstract F(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/HoldingCombinedData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/holding/all/list"
    .end annotation
.end method

.method public abstract G(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbols"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Header;
            value = "User-Agent"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/data/entity/TradeItemBean;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/market/symbol"
    .end annotation

    .annotation runtime Lretrofit2/http/Headers;
        value = {
            "Cache-Time: 1000",
            "SELF-UA: true"
        }
    .end annotation
.end method

.method public abstract H(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "symbols"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/chameleon/user/collect/contract"
    .end annotation
.end method

.method public abstract I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "rankType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "catalog"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "from"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "market"
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .param p6    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/RankEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/api-reaper/rank"
    .end annotation
.end method

.method public abstract K(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "accountType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/HoldingAlphaData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/alpha/holding/list"
    .end annotation
.end method

.method public abstract L()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/ChainMenuEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/api-reaper/pathfinder/menu/list"
    .end annotation
.end method

.method public abstract M(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "accountType"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/HoldingData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/holding/list"
    .end annotation
.end method

.method public abstract N(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "symbols"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/chameleon/user/collect/etf"
    .end annotation
.end method

.method public abstract O(Lcom/kubi/quotefacade/entity/ChainListParam;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/quotefacade/entity/ChainListParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/ChainListParam;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/ChainListEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/api-reaper/pathfinder/chain/tokens"
    .end annotation
.end method

.method public abstract P(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Field;
            value = "symbols"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/FormUrlEncoded;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/chameleon/user/collect/spot"
    .end annotation
.end method

.method public abstract Q(Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;",
            "Lkotlin/coroutines/Continuation<",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/alpha/collect/fav"
    .end annotation
.end method

.method public abstract R(Lcom/kubi/quotefacade/entity/UpdateFavParam;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/quotefacade/entity/UpdateFavParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/UpdateFavParam;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/chameleon/collect/batch-update"
    .end annotation
.end method

.method public abstract a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
            "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/alpha/homepage/list"
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/collect/future/symbol/recommend"
    .end annotation
.end method

.method public abstract c(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "symbols"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/chameleon/contract/v2/symbols"
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/MarketMenuEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/app/discover-new/market_area/menu/app"
    .end annotation
.end method

.method public abstract e(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "collectType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/alpha/collect/recommend"
    .end annotation
.end method

.method public abstract f(Lcom/kubi/quotefacade/entity/PinTopFavParam;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/quotefacade/entity/PinTopFavParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/PinTopFavParam;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/chameleon/collect/top"
    .end annotation
.end method

.method public abstract g()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/ChainMarketSectorsEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/api-reaper/pathfinder/conceptBlock/list"
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "datasource"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "customizations"
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "discover-front/user_favorites"
    .end annotation
.end method

.method public abstract i(Ljava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "orderByRange"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/ChainItemEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/app/pathfinder/dex/smart_contract/favorites_with_trade"
    .end annotation
.end method

.method public abstract j(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/AlphaMenuEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "discover-new/market_area/alpha/menu/app"
    .end annotation
.end method

.method public abstract k(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/ComplianceFinanceRuleEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "discover-front/dynamic_uri_parameters/includes"
    .end annotation
.end method

.method public abstract l(Lcom/kubi/quotefacade/entity/ChainDataByTokensParam;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/quotefacade/entity/ChainDataByTokensParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/ChainDataByTokensParam;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/ChainItemEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v1/api-reaper/pathfinder/tokenChain/list"
    .end annotation
.end method

.method public abstract m(Ljava/lang/String;Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "datasource"
        .end annotation
    .end param
    .param p2    # Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/AlphaItemEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "discover-front/alpha/items"
    .end annotation
.end method

.method public abstract n()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/HoldingDir;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/holding/dir"
    .end annotation
.end method

.method public abstract o()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/collect/etf/symbol/recommend"
    .end annotation
.end method

.method public abstract p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "datasource"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "customizations"
        .end annotation
    .end param
    .param p4    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/UserFavoritesEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "discover-front/user_favorites"
    .end annotation
.end method

.method public abstract q(Ljava/lang/String;Ljava/lang/String;I)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "l1Keyword"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "l2Keyword"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I)",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/MarketListEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/app/discover-new/market_area/area/spot"
    .end annotation
.end method

.method public abstract r()Lkotlinx/coroutines/flow/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/e<",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v1/collect/spot/symbol/recommend"
    .end annotation
.end method

.method public abstract s(Lcom/kubi/quotefacade/entity/request/SymbolRequestParams;)Lkotlinx/coroutines/flow/e;
    .param p1    # Lcom/kubi/quotefacade/entity/request/SymbolRequestParams;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/request/SymbolRequestParams;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/TradeSymbolEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "v2/market/symbol"
    .end annotation
.end method

.method public abstract t(Lcom/kubi/quotefacade/entity/AlphaListBodyParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/quotefacade/entity/AlphaListBodyParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/AlphaListBodyParam;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "discover-new/market_area/alpha/chain_area"
    .end annotation
.end method

.method public abstract u(Lcom/kubi/quotefacade/entity/AlphaListBodyParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lcom/kubi/quotefacade/entity/AlphaListBodyParam;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Body;
        .end annotation
    .end param
    .param p2    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/quotefacade/entity/AlphaListBodyParam;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/POST;
        value = "discover-new/market_area/alpha/highlights"
    .end annotation
.end method

.method public abstract v(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/kubi/quotefacade/entity/RankMarketEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "discover-new/rankings/markets"
    .end annotation
.end method

.method public abstract w(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lkotlinx/coroutines/flow/e;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "l1Keyword"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "l2Keyword"
        .end annotation
    .end param
    .param p3    # I
        .annotation runtime Lretrofit2/http/Query;
            value = "pageSize"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            ")",
            "Lkotlinx/coroutines/flow/e<",
            "Lcom/kubi/quotefacade/entity/MarketListEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "/app/discover-new/market_area/area/future"
    .end annotation
.end method

.method public abstract z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "rankType"
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "catalog"
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "from"
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation

        .annotation runtime Lretrofit2/http/Query;
            value = "excludes"
        .end annotation
    .end param
    .param p5    # Lkotlin/coroutines/Continuation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/util/List<",
            "Lcom/kubi/quotefacade/entity/RankFuturesEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .annotation runtime Lretrofit2/http/GET;
        value = "v2/api-reaper/rank"
    .end annotation
.end method
