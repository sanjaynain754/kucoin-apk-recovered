package com.kubi.quotefacade.repository;

import com.kubi.config.exception.KCConfigException;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.exception.ApiException;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.p110rn.kline.KlineFlutterMiniConstants;
import com.kubi.quotefacade.api.IQuoteFacadeService;
import com.kubi.quotefacade.entity.AllTradeItemBean;
import com.kubi.quotefacade.entity.AlphaItemEntity;
import com.kubi.quotefacade.entity.AlphaListBodyParam;
import com.kubi.quotefacade.entity.AlphaMarketEntity;
import com.kubi.quotefacade.entity.AlphaMenuEntity;
import com.kubi.quotefacade.entity.AlphaWithTokenParam;
import com.kubi.quotefacade.entity.AlphaWithTokenTypeParamV2;
import com.kubi.quotefacade.entity.ChainBackDeleteEntity;
import com.kubi.quotefacade.entity.ChainDataByTokensParam;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.entity.ChainListEntity;
import com.kubi.quotefacade.entity.ChainListParam;
import com.kubi.quotefacade.entity.ChainMenuEntity;
import com.kubi.quotefacade.entity.ChainWithTokenParam;
import com.kubi.quotefacade.entity.ComplianceFinanceRuleEntity;
import com.kubi.quotefacade.entity.FavMarketQuoteEntity;
import com.kubi.quotefacade.entity.FutureQuoteEntity;
import com.kubi.quotefacade.entity.HoldingAlphaData;
import com.kubi.quotefacade.entity.HoldingCombinedData;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingDir;
import com.kubi.quotefacade.entity.MarketListEntity;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.quotefacade.entity.MarketMenuEntity;
import com.kubi.quotefacade.entity.PinTopFavParam;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.entity.RankFuturesEntity;
import com.kubi.quotefacade.entity.RankMarketEntity;
import com.kubi.quotefacade.entity.RecommendQuoteEntity;
import com.kubi.quotefacade.entity.TradeSymbolEntity;
import com.kubi.quotefacade.entity.UpdateFavParam;
import com.kubi.quotefacade.entity.UserFavoritesEntity;
import com.kubi.quotefacade.entity.UserFavoritesItem;
import com.kubi.quotefacade.entity.UserFavoritesSpotEntity;
import com.kubi.quotefacade.entity.request.SymbolRequestParams;
import com.kubi.quotefacade.helper.QuoteBusinessConfigHelp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414kv.C41986b;
import p414kv.C41987c;
import p414kv.C41989e;
import p414kv.C41992h;
import p414kv.C41993i;
import p569qq.C43846g;
import p844zu.InterfaceC46925b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;
import y70.StorageId;

/* JADX INFO: compiled from: QuoteMarketRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u0085\u00012\u00020\u0001:\u0002\u0085\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0086@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ,\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aJ$\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0017H\u0007J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\"H\u0086@¢\u0006\u0002\u0010\u0011J\u001c\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\"0\u00172\u0006\u0010\u001f\u001a\u00020\u001aH\u0007J\u001c\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\"2\u0006\u0010\u001f\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010)J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u0017J\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0086@¢\u0006\u0002\u0010\u0011J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0086@¢\u0006\u0002\u0010\u0011J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0086@¢\u0006\u0002\u0010\u0011J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u0002000\"2\u0006\u00101\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010)J*\u00102\u001a\b\u0012\u0004\u0012\u0002000\"2\u0006\u00101\u001a\u00020\u001a2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0086@¢\u0006\u0002\u00104J\u001c\u00105\u001a\u00020\u00012\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0086@¢\u0006\u0002\u00106J\u001c\u00107\u001a\b\u0012\u0004\u0012\u0002000\"2\u0006\u00101\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010)J\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u001a0\"2\u0006\u00109\u001a\u00020:H\u0086@¢\u0006\u0002\u0010;J$\u0010<\u001a\n\u0012\u0004\u0012\u00020=\u0018\u00010\"2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0086@¢\u0006\u0002\u00106J\u001a\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010)J \u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020EH\u0086@¢\u0006\u0002\u0010FJ\u0014\u0010G\u001a\b\u0012\u0004\u0012\u0002000\"H\u0086@¢\u0006\u0002\u0010\u0011J/\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010I\u001a\u0004\u0018\u00010\u001a2\b\u0010J\u001a\u0004\u0018\u00010\u001d2\b\u0010K\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010LJ)\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001a0\"2\b\u0010J\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010OJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010Q\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0\u0017J\u0018\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010U0\u00172\b\u0010V\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0\u00172\b\u0010V\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Z0\u00172\b\u0010@\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010Q\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010Q\u001a\u0004\u0018\u00010\u001aJ\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010Q\u001a\u0004\u0018\u00010\u001aJ\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u00172\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001a0\"J%\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\u0010Q\u001a\u0004\u0018\u00010\u001a2\b\u0010J\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010bJ\u001e\u0010c\u001a\b\u0012\u0004\u0012\u00020d0\"2\b\u0010I\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010)J\u001e\u0010e\u001a\u0004\u0018\u00010f2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u001a0\"H\u0086@¢\u0006\u0002\u00106J0\u0010g\u001a\b\u0012\u0004\u0012\u00020h0\"2\b\u0010I\u001a\u0004\u0018\u00010\u001a2\u0006\u0010i\u001a\u00020\u001a2\b\u0010J\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0002\u0010jJ*\u0010k\u001a\b\u0012\u0004\u0012\u00020l0\"2\f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001a0\"2\u0006\u0010n\u001a\u00020\u001aH\u0086@¢\u0006\u0002\u0010oJ\u0012\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\"0\u0017J\u0014\u0010r\u001a\b\u0012\u0004\u0012\u00020s0\u00172\u0006\u0010t\u001a\u00020uJ\u001a\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0\"0\u00172\u0006\u0010n\u001a\u00020\u001aJ\u0012\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\"0\u0017J:\u0010x\u001a\n\u0012\u0004\u0012\u00020y\u0018\u00010\"2\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001a2\u0006\u0010i\u001a\u00020\u001a2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010}J/\u0010~\u001a\n\u0012\u0004\u0012\u00020\u007f\u0018\u00010\"2\u0006\u0010z\u001a\u00020\u001a2\u0006\u0010{\u001a\u00020\u001a2\u0006\u0010i\u001a\u00020\u001aH\u0086@¢\u0006\u0003\u0010\u0080\u0001J\u0017\u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010\"H\u0086@¢\u0006\u0002\u0010\u0011J\u0017\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\"H\u0086@¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0086@¢\u0006\u0002\u0010\u0011R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR#\u0010\u000b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\f\u0010\b¨\u0006\u0086\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/repository/QuoteMarketRepository;", "", "<init>", "()V", "api", "Lcom/kubi/quotefacade/api/IQuoteApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/quotefacade/api/IQuoteApi;", "api$delegate", "Lkotlin/Lazy;", "multiApi", "getMultiApi", "multiApi$delegate", "getMenuList", "Lcom/kubi/network/retrofit/utils/RetrofitResult;", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMenuToSp", "", "marketMenuEntity", "getMenuFromSp", "getSpotList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/quotefacade/entity/MarketListEntity;", "l1p", "", "l2p", "pageSize", "", "getFutureList", "includeMarket", "getEtfList", "getCollectSpotList", "", "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "getCollectFlatSpotList", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "getCollectFutureList", "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;", "getCollectFlatFutureList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectETFList", "getRecommendSpotList", "Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;", "getRecommendFutureList", "getRecommendETFList", "getRecommendAlphaList", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "collectType", "getAlphaDataByTokens", "tokenChains", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrDeleteAlphaToFavList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavAlphaList", "getUserAlphaFavorites", "isPremium", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlphaFavoritesInfo", "Lcom/kubi/quotefacade/entity/AlphaFavEntity;", "fetchAlphaMenu", "Lcom/kubi/quotefacade/entity/AlphaMenuEntity;", "excludes", "getAlphaCoins", "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;", "alphaType", "bodyParam", "Lcom/kubi/quotefacade/entity/AlphaListBodyParam;", "(Ljava/lang/String;Lcom/kubi/quotefacade/entity/AlphaListBodyParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlphaRankList", "topFavList", "symbol", "favType", KlineFlutterMiniConstants.PROP_DATA_SOURCE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "updateFavList", "symbolList", "(Ljava/util/List;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "addOrDeleteSpotToFavList", "symbols", "getMarketHoldingsTabData", "Lcom/kubi/quotefacade/entity/HoldingDir;", "getMarketHoldingsData", "Lcom/kubi/quotefacade/entity/HoldingData;", "holdingsType", "getMarketAlphaHoldingsData", "Lcom/kubi/quotefacade/entity/HoldingAlphaData;", "getMarketAllHoldingsData", "Lcom/kubi/quotefacade/entity/HoldingCombinedData;", "addFutureToFavList", "addFutureListToFavList", "addOrDeleteEtfToFavList", "addOrDeleteMemeToFavList", "Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;", "tokenList", "addOrDeleteFavListItem", "(Ljava/lang/String;Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "getQuoteFutureDataBySymbols", "Lcom/kubi/quotefacade/entity/AllTradeItemBean;", "getSpotQuoteDataBySymbols", "Lcom/kubi/quotefacade/entity/TradeSymbolEntity;", "getQuoteDataBySymbols", "Lcom/kubi/data/entity/TradeItemBean;", "from", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChainDataByTokens", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "tokens", "orderByRange", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChainMenuList", "Lcom/kubi/quotefacade/entity/ChainMenuEntity;", "getChainMarketList", "Lcom/kubi/quotefacade/entity/ChainListEntity;", "param", "Lcom/kubi/quotefacade/entity/ChainListParam;", "getFavChainList", "getFavSimpleChainList", "fetchRankSpotList", "Lcom/kubi/quotefacade/entity/RankEntity;", "rankType", "catalog", "market", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRankFuturesList", "Lcom/kubi/quotefacade/entity/RankFuturesEntity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectAllList", "fetchMarket", "fetchBusinessConfig", "Lcom/kubi/quotefacade/entity/ComplianceFinanceRuleEntity;", "Companion", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nQuoteMarketRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuoteMarketRepository.kt\ncom/kubi/quotefacade/repository/QuoteMarketRepository\n+ 2 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,527:1\n174#2,5:528\n44#3,2:533\n44#3,2:535\n44#3,2:537\n44#3,2:554\n44#3,2:556\n44#3,2:558\n44#3,2:560\n44#3,2:576\n44#3,2:578\n44#3,2:593\n44#3,2:595\n1617#4,9:539\n1869#4:548\n295#4,2:549\n1870#4:552\n1626#4:553\n1563#4:562\n1634#4,3:563\n774#4:566\n865#4,2:567\n1563#4:569\n1634#4,3:570\n774#4:573\n865#4,2:574\n1617#4,9:580\n1869#4:589\n1870#4:591\n1626#4:592\n1#5:551\n1#5:590\n*S KotlinDebug\n*F\n+ 1 QuoteMarketRepository.kt\ncom/kubi/quotefacade/repository/QuoteMarketRepository\n*L\n100#1:528,5\n175#1:533,2\n199#1:535,2\n221#1:537,2\n239#1:554,2\n252#1:556,2\n273#1:558,2\n285#1:560,2\n459#1:576,2\n474#1:578,2\n508#1:593,2\n523#1:595,2\n231#1:539,9\n231#1:548\n232#1:549,2\n231#1:552\n231#1:553\n374#1:562\n374#1:563,3\n393#1:566\n393#1:567,2\n398#1:569\n398#1:570,3\n407#1:573\n407#1:574,2\n485#1:580,9\n485#1:589\n485#1:591\n485#1:592\n231#1:551\n485#1:590\n*E\n"})
public final class QuoteMarketRepository {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f42588c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f42589a = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.repository.a
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteMarketRepository.m52964k();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f42590b = LazyKt.lazy(new Function0() { // from class: com.kubi.quotefacade.repository.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return QuoteMarketRepository.m52960V();
        }
    });

    /* JADX INFO: compiled from: QuoteMarketRepository.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/quotefacade/repository/QuoteMarketRepository$Companion;", "", "<init>", "()V", "TAG", "", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m52965q(QuoteMarketRepository quoteMarketRepository, String str, String str2, String str3, String str4, Continuation continuation, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            str4 = null;
        }
        return quoteMarketRepository.m53001p(str, str2, str3, str4, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: A */
    public final Object m52966A(@NotNull String str, @NotNull Continuation<? super List<MarketListEntityItem>> continuation) throws Exception {
        QuoteMarketRepository$getCollectFlatFutureList$1 quoteMarketRepository$getCollectFlatFutureList$1;
        List<MarketListEntityItem> items;
        if (continuation instanceof QuoteMarketRepository$getCollectFlatFutureList$1) {
            quoteMarketRepository$getCollectFlatFutureList$1 = (QuoteMarketRepository$getCollectFlatFutureList$1) continuation;
            int i11 = quoteMarketRepository$getCollectFlatFutureList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getCollectFlatFutureList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getCollectFlatFutureList$1 = new QuoteMarketRepository$getCollectFlatFutureList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getCollectFlatFutureList$1 = new QuoteMarketRepository$getCollectFlatFutureList$1(this, continuation);
        }
        Object objM103348E = quoteMarketRepository$getCollectFlatFutureList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getCollectFlatFutureList$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM103348E);
            InterfaceC46925b interfaceC46925bM53005u = m53005u();
            quoteMarketRepository$getCollectFlatFutureList$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            quoteMarketRepository$getCollectFlatFutureList$1.label = 1;
            objM103348E = interfaceC46925bM53005u.m103348E("Futures", str, "PriceWarn", quoteMarketRepository$getCollectFlatFutureList$1);
            if (objM103348E == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM103348E);
        }
        UserFavoritesSpotEntity userFavoritesSpotEntity = (UserFavoritesSpotEntity) objM103348E;
        return (userFavoritesSpotEntity == null || (items = userFavoritesSpotEntity.getItems()) == null) ? CollectionsKt.emptyList() : items;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: B */
    public final Object m52967B(@NotNull Continuation<? super List<MarketListEntityItem>> continuation) throws Exception {
        QuoteMarketRepository$getCollectFlatSpotList$1 quoteMarketRepository$getCollectFlatSpotList$1;
        List<MarketListEntityItem> items;
        if (continuation instanceof QuoteMarketRepository$getCollectFlatSpotList$1) {
            quoteMarketRepository$getCollectFlatSpotList$1 = (QuoteMarketRepository$getCollectFlatSpotList$1) continuation;
            int i11 = quoteMarketRepository$getCollectFlatSpotList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getCollectFlatSpotList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getCollectFlatSpotList$1 = new QuoteMarketRepository$getCollectFlatSpotList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getCollectFlatSpotList$1 = new QuoteMarketRepository$getCollectFlatSpotList$1(this, continuation);
        }
        QuoteMarketRepository$getCollectFlatSpotList$1 quoteMarketRepository$getCollectFlatSpotList$2 = quoteMarketRepository$getCollectFlatSpotList$1;
        Object objM103342x = quoteMarketRepository$getCollectFlatSpotList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getCollectFlatSpotList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM103342x);
            InterfaceC46925b interfaceC46925bM53005u = m53005u();
            quoteMarketRepository$getCollectFlatSpotList$2.label = 1;
            objM103342x = InterfaceC46925b.m103342x(interfaceC46925bM53005u, IQuoteFacadeService.Companion.TRADE_TYPE_SPOT, null, null, quoteMarketRepository$getCollectFlatSpotList$2, 4, null);
            if (objM103342x == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM103342x);
        }
        UserFavoritesSpotEntity userFavoritesSpotEntity = (UserFavoritesSpotEntity) objM103342x;
        return (userFavoritesSpotEntity == null || (items = userFavoritesSpotEntity.getItems()) == null) ? CollectionsKt.emptyList() : items;
    }

    @NotNull
    /* JADX INFO: renamed from: C */
    public final InterfaceC41634e<MarketListEntity> m52968C(@NotNull String l1p, @NotNull String l2p, int i11) {
        Intrinsics.checkNotNullParameter(l1p, "l1p");
        Intrinsics.checkNotNullParameter(l2p, "l2p");
        return m53005u().m103344A(l1p, i11);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: D */
    public final Object m52969D(@NotNull String str, @NotNull Continuation<? super List<AlphaItemEntity>> continuation) throws Exception {
        QuoteMarketRepository$getFavAlphaList$1 quoteMarketRepository$getFavAlphaList$1;
        List<AlphaItemEntity> items;
        if (continuation instanceof QuoteMarketRepository$getFavAlphaList$1) {
            quoteMarketRepository$getFavAlphaList$1 = (QuoteMarketRepository$getFavAlphaList$1) continuation;
            int i11 = quoteMarketRepository$getFavAlphaList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getFavAlphaList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getFavAlphaList$1 = new QuoteMarketRepository$getFavAlphaList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getFavAlphaList$1 = new QuoteMarketRepository$getFavAlphaList$1(this, continuation);
        }
        QuoteMarketRepository$getFavAlphaList$1 quoteMarketRepository$getFavAlphaList$2 = quoteMarketRepository$getFavAlphaList$1;
        Object objM103341J = quoteMarketRepository$getFavAlphaList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getFavAlphaList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM103341J);
            InterfaceC46925b interfaceC46925bM52978M = m52978M();
            quoteMarketRepository$getFavAlphaList$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            quoteMarketRepository$getFavAlphaList$2.label = 1;
            objM103341J = InterfaceC46925b.m103341J(interfaceC46925bM52978M, str, null, quoteMarketRepository$getFavAlphaList$2, 2, null);
            if (objM103341J == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM103341J);
        }
        AlphaMarketEntity alphaMarketEntity = (AlphaMarketEntity) objM103341J;
        return (alphaMarketEntity == null || (items = alphaMarketEntity.getItems()) == null) ? CollectionsKt.emptyList() : items;
    }

    @NotNull
    /* JADX INFO: renamed from: E */
    public final InterfaceC41634e<List<ChainItemEntity>> m52970E(@NotNull String orderByRange) {
        Intrinsics.checkNotNullParameter(orderByRange, "orderByRange");
        return m53005u().m103369i(orderByRange);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final InterfaceC41634e<MarketListEntity> m52971F(@NotNull String l1p, @NotNull String l2p, int i11, @NotNull String includeMarket) {
        Intrinsics.checkNotNullParameter(l1p, "l1p");
        Intrinsics.checkNotNullParameter(l2p, "l2p");
        Intrinsics.checkNotNullParameter(includeMarket, "includeMarket");
        return m53005u().m103383w(l1p, l2p, i11, includeMarket);
    }

    @Nullable
    /* JADX INFO: renamed from: K */
    public final MarketMenuEntity m52976K() {
        return (MarketMenuEntity) C46392a.f104043a.m102336j(new StorageId("ku_quote_market_sp_name", "ku_quote_market_sp_table", null, false, 12, null), MarketMenuEntity.class, null);
    }

    @Nullable
    /* JADX INFO: renamed from: L */
    public final Object m52977L(@NotNull Continuation<? super C19334f<MarketMenuEntity>> continuation) {
        return RetrofitFlowExKt.m42823d(m53005u().m103364d(QuoteBusinessConfigHelp.f41933a.m51845i()), false, new QuoteMarketRepository$getMenuList$2(this, null), continuation);
    }

    /* JADX INFO: renamed from: M */
    public final InterfaceC46925b m52978M() {
        return (InterfaceC46925b) this.f42590b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135 A[LOOP:1: B:49:0x012f->B:51:0x0135, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r12 == r0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0182, code lost:
    
        if (r12 == r0) goto L59;
     */
    @Nullable
    /* JADX INFO: renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m52979N(@Nullable String str, @NotNull String str2, @Nullable Integer num, @NotNull Continuation<? super List<? extends TradeItemBean>> continuation) {
        QuoteMarketRepository$getQuoteDataBySymbols$1 quoteMarketRepository$getQuoteDataBySymbols$1;
        List list;
        List list2;
        ArrayList arrayList;
        Iterator it;
        if (continuation instanceof QuoteMarketRepository$getQuoteDataBySymbols$1) {
            quoteMarketRepository$getQuoteDataBySymbols$1 = (QuoteMarketRepository$getQuoteDataBySymbols$1) continuation;
            int i11 = quoteMarketRepository$getQuoteDataBySymbols$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getQuoteDataBySymbols$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getQuoteDataBySymbols$1 = new QuoteMarketRepository$getQuoteDataBySymbols$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getQuoteDataBySymbols$1 = new QuoteMarketRepository$getQuoteDataBySymbols$1(this, continuation);
        }
        QuoteMarketRepository$getQuoteDataBySymbols$1 quoteMarketRepository$getQuoteDataBySymbols$2 = quoteMarketRepository$getQuoteDataBySymbols$1;
        Object objM42824e = quoteMarketRepository$getQuoteDataBySymbols$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getQuoteDataBySymbols$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            if (num != null && num.intValue() == 1) {
                InterfaceC41634e<List<TradeItemBean>> interfaceC41634eM103350G = m53005u().m103350G(str, str2);
                QuoteMarketRepository$getQuoteDataBySymbols$2 quoteMarketRepository$getQuoteDataBySymbols$3 = new QuoteMarketRepository$getQuoteDataBySymbols$2(null);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$2 = SpillingKt.nullOutSpilledVariable(num);
                quoteMarketRepository$getQuoteDataBySymbols$2.label = 1;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103350G, false, quoteMarketRepository$getQuoteDataBySymbols$3, quoteMarketRepository$getQuoteDataBySymbols$2, 1, null);
            } else if (num != null && num.intValue() == 2) {
                ArrayList arrayList2 = new ArrayList();
                InterfaceC41634e<List<FutureQuoteEntity>> interfaceC41634eM103363c = m53005u().m103363c(str);
                QuoteMarketRepository$getQuoteDataBySymbols$4 quoteMarketRepository$getQuoteDataBySymbols$4 = new QuoteMarketRepository$getQuoteDataBySymbols$4(null);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$2 = SpillingKt.nullOutSpilledVariable(num);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$3 = arrayList2;
                quoteMarketRepository$getQuoteDataBySymbols$2.label = 2;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103363c, false, quoteMarketRepository$getQuoteDataBySymbols$4, quoteMarketRepository$getQuoteDataBySymbols$2, 1, null);
                if (objM42824e != coroutine_suspended) {
                    list = arrayList2;
                    list2 = (List) RetrofitFlowExKt.m42829j((C19334f) objM42824e);
                    if (list2 != null) {
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(Boxing.boxBoolean(list.add(new C41987c().mo51723a((FutureQuoteEntity) it.next()))));
                        }
                    }
                    return list;
                }
            } else {
                if (num == null || num.intValue() != 3) {
                    return CollectionsKt.emptyList();
                }
                InterfaceC41634e<List<TradeItemBean>> interfaceC41634eM103350G2 = m53005u().m103350G(str, str2);
                QuoteMarketRepository$getQuoteDataBySymbols$6 quoteMarketRepository$getQuoteDataBySymbols$6 = new QuoteMarketRepository$getQuoteDataBySymbols$6(null);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                quoteMarketRepository$getQuoteDataBySymbols$2.L$2 = SpillingKt.nullOutSpilledVariable(num);
                quoteMarketRepository$getQuoteDataBySymbols$2.label = 3;
                objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103350G2, false, quoteMarketRepository$getQuoteDataBySymbols$6, quoteMarketRepository$getQuoteDataBySymbols$2, 1, null);
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM42824e);
            List list3 = (List) RetrofitFlowExKt.m42829j((C19334f) objM42824e);
            if (list3 == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list3) {
                if (!((TradeItemBean) obj).getSymbolInfoEntity().isEtfSymbol()) {
                    arrayList3.add(obj);
                }
            }
            return arrayList3;
        }
        if (i12 == 2) {
            list = (List) quoteMarketRepository$getQuoteDataBySymbols$2.L$3;
            ResultKt.throwOnFailure(objM42824e);
            list2 = (List) RetrofitFlowExKt.m42829j((C19334f) objM42824e);
            if (list2 != null) {
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boxing.boxBoolean(list.add(new C41987c().mo51723a((FutureQuoteEntity) it.next()))));
                }
            }
            return list;
        }
        if (i12 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(objM42824e);
        List list4 = (List) RetrofitFlowExKt.m42829j((C19334f) objM42824e);
        if (list4 == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list4) {
            if (((TradeItemBean) obj2).getSymbolInfoEntity().isEtfSymbol()) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: O */
    public final Object m52980O(@Nullable String str, @NotNull Continuation<? super List<AllTradeItemBean>> continuation) {
        QuoteMarketRepository$getQuoteFutureDataBySymbols$1 quoteMarketRepository$getQuoteFutureDataBySymbols$1;
        List list;
        if (continuation instanceof QuoteMarketRepository$getQuoteFutureDataBySymbols$1) {
            quoteMarketRepository$getQuoteFutureDataBySymbols$1 = (QuoteMarketRepository$getQuoteFutureDataBySymbols$1) continuation;
            int i11 = quoteMarketRepository$getQuoteFutureDataBySymbols$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getQuoteFutureDataBySymbols$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getQuoteFutureDataBySymbols$1 = new QuoteMarketRepository$getQuoteFutureDataBySymbols$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getQuoteFutureDataBySymbols$1 = new QuoteMarketRepository$getQuoteFutureDataBySymbols$1(this, continuation);
        }
        QuoteMarketRepository$getQuoteFutureDataBySymbols$1 quoteMarketRepository$getQuoteFutureDataBySymbols$2 = quoteMarketRepository$getQuoteFutureDataBySymbols$1;
        Object obj = quoteMarketRepository$getQuoteFutureDataBySymbols$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getQuoteFutureDataBySymbols$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList = new ArrayList();
            InterfaceC41634e<List<FutureQuoteEntity>> interfaceC41634eM103363c = m53005u().m103363c(str);
            QuoteMarketRepository$getQuoteFutureDataBySymbols$2 quoteMarketRepository$getQuoteFutureDataBySymbols$3 = new QuoteMarketRepository$getQuoteFutureDataBySymbols$2(null);
            quoteMarketRepository$getQuoteFutureDataBySymbols$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
            quoteMarketRepository$getQuoteFutureDataBySymbols$2.L$1 = arrayList;
            quoteMarketRepository$getQuoteFutureDataBySymbols$2.label = 1;
            Object objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103363c, false, quoteMarketRepository$getQuoteFutureDataBySymbols$3, quoteMarketRepository$getQuoteFutureDataBySymbols$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM42824e;
            list = arrayList;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) quoteMarketRepository$getQuoteFutureDataBySymbols$2.L$1;
            ResultKt.throwOnFailure(obj);
        }
        List list2 = (List) RetrofitFlowExKt.m42829j((C19334f) obj);
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Boxing.boxBoolean(list.add(new C41986b().mo51723a((FutureQuoteEntity) it.next()))));
            }
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: P */
    public final Object m52981P(@NotNull String str, @NotNull Continuation<? super List<AlphaItemEntity>> continuation) {
        QuoteMarketRepository$getRecommendAlphaList$1 quoteMarketRepository$getRecommendAlphaList$1;
        if (continuation instanceof QuoteMarketRepository$getRecommendAlphaList$1) {
            quoteMarketRepository$getRecommendAlphaList$1 = (QuoteMarketRepository$getRecommendAlphaList$1) continuation;
            int i11 = quoteMarketRepository$getRecommendAlphaList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getRecommendAlphaList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getRecommendAlphaList$1 = new QuoteMarketRepository$getRecommendAlphaList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getRecommendAlphaList$1 = new QuoteMarketRepository$getRecommendAlphaList$1(this, continuation);
        }
        Object objM103365e = quoteMarketRepository$getRecommendAlphaList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getRecommendAlphaList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103365e);
                String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                quoteMarketRepository$getRecommendAlphaList$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$getRecommendAlphaList$1.L$1 = SpillingKt.nullOutSpilledVariable(strM51845i);
                quoteMarketRepository$getRecommendAlphaList$1.label = 1;
                objM103365e = interfaceC46925bM52978M.m103365e(str, strM51845i, quoteMarketRepository$getRecommendAlphaList$1);
                if (objM103365e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103365e);
            }
            return (List) objM103365e;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return CollectionsKt.emptyList();
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: Q */
    public final Object m52982Q(@NotNull Continuation<? super List<RecommendQuoteEntity>> continuation) {
        QuoteMarketRepository$getRecommendETFList$1 quoteMarketRepository$getRecommendETFList$1;
        if (continuation instanceof QuoteMarketRepository$getRecommendETFList$1) {
            quoteMarketRepository$getRecommendETFList$1 = (QuoteMarketRepository$getRecommendETFList$1) continuation;
            int i11 = quoteMarketRepository$getRecommendETFList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getRecommendETFList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getRecommendETFList$1 = new QuoteMarketRepository$getRecommendETFList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getRecommendETFList$1 = new QuoteMarketRepository$getRecommendETFList$1(this, continuation);
        }
        QuoteMarketRepository$getRecommendETFList$1 quoteMarketRepository$getRecommendETFList$2 = quoteMarketRepository$getRecommendETFList$1;
        Object objM42824e = quoteMarketRepository$getRecommendETFList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getRecommendETFList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<List<RecommendQuoteEntity>> interfaceC41634eM103375o = m53005u().m103375o();
            QuoteMarketRepository$getRecommendETFList$2 quoteMarketRepository$getRecommendETFList$3 = new QuoteMarketRepository$getRecommendETFList$2(null);
            quoteMarketRepository$getRecommendETFList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103375o, false, quoteMarketRepository$getRecommendETFList$3, quoteMarketRepository$getRecommendETFList$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        List list = (List) RetrofitFlowExKt.m42829j((C19334f) objM42824e);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: R */
    public final Object m52983R(@NotNull Continuation<? super List<RecommendQuoteEntity>> continuation) {
        QuoteMarketRepository$getRecommendFutureList$1 quoteMarketRepository$getRecommendFutureList$1;
        if (continuation instanceof QuoteMarketRepository$getRecommendFutureList$1) {
            quoteMarketRepository$getRecommendFutureList$1 = (QuoteMarketRepository$getRecommendFutureList$1) continuation;
            int i11 = quoteMarketRepository$getRecommendFutureList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getRecommendFutureList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getRecommendFutureList$1 = new QuoteMarketRepository$getRecommendFutureList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getRecommendFutureList$1 = new QuoteMarketRepository$getRecommendFutureList$1(this, continuation);
        }
        QuoteMarketRepository$getRecommendFutureList$1 quoteMarketRepository$getRecommendFutureList$2 = quoteMarketRepository$getRecommendFutureList$1;
        Object objM42824e = quoteMarketRepository$getRecommendFutureList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getRecommendFutureList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
            InterfaceC41634e<List<RecommendQuoteEntity>> interfaceC41634eM103362b = m53005u().m103362b(strM51845i);
            QuoteMarketRepository$getRecommendFutureList$2 quoteMarketRepository$getRecommendFutureList$3 = new QuoteMarketRepository$getRecommendFutureList$2(null);
            quoteMarketRepository$getRecommendFutureList$2.L$0 = SpillingKt.nullOutSpilledVariable(strM51845i);
            quoteMarketRepository$getRecommendFutureList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103362b, false, quoteMarketRepository$getRecommendFutureList$3, quoteMarketRepository$getRecommendFutureList$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        List list = (List) RetrofitFlowExKt.m42829j((C19334f) objM42824e);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: S */
    public final Object m52984S(@NotNull Continuation<? super List<RecommendQuoteEntity>> continuation) {
        QuoteMarketRepository$getRecommendSpotList$1 quoteMarketRepository$getRecommendSpotList$1;
        if (continuation instanceof QuoteMarketRepository$getRecommendSpotList$1) {
            quoteMarketRepository$getRecommendSpotList$1 = (QuoteMarketRepository$getRecommendSpotList$1) continuation;
            int i11 = quoteMarketRepository$getRecommendSpotList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getRecommendSpotList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getRecommendSpotList$1 = new QuoteMarketRepository$getRecommendSpotList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getRecommendSpotList$1 = new QuoteMarketRepository$getRecommendSpotList$1(this, continuation);
        }
        QuoteMarketRepository$getRecommendSpotList$1 quoteMarketRepository$getRecommendSpotList$2 = quoteMarketRepository$getRecommendSpotList$1;
        Object objM42824e = quoteMarketRepository$getRecommendSpotList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getRecommendSpotList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<List<RecommendQuoteEntity>> interfaceC41634eM103378r = m53005u().m103378r();
            QuoteMarketRepository$getRecommendSpotList$2 quoteMarketRepository$getRecommendSpotList$3 = new QuoteMarketRepository$getRecommendSpotList$2(null);
            quoteMarketRepository$getRecommendSpotList$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103378r, false, quoteMarketRepository$getRecommendSpotList$3, quoteMarketRepository$getRecommendSpotList$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        List list = (List) RetrofitFlowExKt.m42829j((C19334f) objM42824e);
        return list == null ? CollectionsKt.emptyList() : list;
    }

    @NotNull
    /* JADX INFO: renamed from: T */
    public final InterfaceC41634e<MarketListEntity> m52985T(@NotNull String l1p, @NotNull String l2p, int i11) {
        Intrinsics.checkNotNullParameter(l1p, "l1p");
        Intrinsics.checkNotNullParameter(l2p, "l2p");
        return m53005u().m103377q(l1p, l2p, i11);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: U */
    public final Object m52986U(@NotNull List<String> list, @NotNull Continuation<? super TradeSymbolEntity> continuation) {
        QuoteMarketRepository$getSpotQuoteDataBySymbols$1 quoteMarketRepository$getSpotQuoteDataBySymbols$1;
        if (continuation instanceof QuoteMarketRepository$getSpotQuoteDataBySymbols$1) {
            quoteMarketRepository$getSpotQuoteDataBySymbols$1 = (QuoteMarketRepository$getSpotQuoteDataBySymbols$1) continuation;
            int i11 = quoteMarketRepository$getSpotQuoteDataBySymbols$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getSpotQuoteDataBySymbols$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getSpotQuoteDataBySymbols$1 = new QuoteMarketRepository$getSpotQuoteDataBySymbols$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getSpotQuoteDataBySymbols$1 = new QuoteMarketRepository$getSpotQuoteDataBySymbols$1(this, continuation);
        }
        QuoteMarketRepository$getSpotQuoteDataBySymbols$1 quoteMarketRepository$getSpotQuoteDataBySymbols$2 = quoteMarketRepository$getSpotQuoteDataBySymbols$1;
        Object objM42824e = quoteMarketRepository$getSpotQuoteDataBySymbols$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getSpotQuoteDataBySymbols$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<TradeSymbolEntity> interfaceC41634eM103379s = m53005u().m103379s(new SymbolRequestParams(list));
            QuoteMarketRepository$getSpotQuoteDataBySymbols$2 quoteMarketRepository$getSpotQuoteDataBySymbols$3 = new QuoteMarketRepository$getSpotQuoteDataBySymbols$2(null);
            quoteMarketRepository$getSpotQuoteDataBySymbols$2.L$0 = SpillingKt.nullOutSpilledVariable(list);
            quoteMarketRepository$getSpotQuoteDataBySymbols$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM103379s, false, quoteMarketRepository$getSpotQuoteDataBySymbols$3, quoteMarketRepository$getSpotQuoteDataBySymbols$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        return RetrofitFlowExKt.m42829j((C19334f) objM42824e);
    }

    /* JADX INFO: renamed from: W */
    public final void m52987W(MarketMenuEntity marketMenuEntity) {
        C46392a.m102331n(new StorageId("ku_quote_market_sp_name", "ku_quote_market_sp_table", null, false, 12, null), marketMenuEntity);
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final InterfaceC41634e<Object> m52989Y(@NotNull List<String> symbolList, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(symbolList, "symbolList");
        return m53005u().m103360R(new UpdateFavParam(symbolList, num, Boolean.TRUE));
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public final InterfaceC41634e<Object> m52994h(@Nullable String str, @Nullable Integer num) {
        if (num != null && num.intValue() == 1) {
            return m52996j(str);
        }
        if (num != null && num.intValue() == 2) {
            return m52990d(str);
        }
        return (num != null && num.intValue() == 3) ? m52993g(str) : C41636g.m90879C();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final InterfaceC41634e<ChainBackDeleteEntity> m52995i(@NotNull List<String> tokenList) {
        Intrinsics.checkNotNullParameter(tokenList, "tokenList");
        return m53005u().m103345B(new ChainWithTokenParam(tokenList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: l */
    public final Object m52997l(@Nullable String str, @NotNull Continuation<? super AlphaMenuEntity> continuation) {
        QuoteMarketRepository$fetchAlphaMenu$1 quoteMarketRepository$fetchAlphaMenu$1;
        if (continuation instanceof QuoteMarketRepository$fetchAlphaMenu$1) {
            quoteMarketRepository$fetchAlphaMenu$1 = (QuoteMarketRepository$fetchAlphaMenu$1) continuation;
            int i11 = quoteMarketRepository$fetchAlphaMenu$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$fetchAlphaMenu$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$fetchAlphaMenu$1 = new QuoteMarketRepository$fetchAlphaMenu$1(this, continuation);
            }
        } else {
            quoteMarketRepository$fetchAlphaMenu$1 = new QuoteMarketRepository$fetchAlphaMenu$1(this, continuation);
        }
        Object objM103370j = quoteMarketRepository$fetchAlphaMenu$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$fetchAlphaMenu$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103370j);
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                quoteMarketRepository$fetchAlphaMenu$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$fetchAlphaMenu$1.label = 1;
                objM103370j = interfaceC46925bM52978M.m103370j(str, quoteMarketRepository$fetchAlphaMenu$1);
                if (objM103370j == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103370j);
            }
            return (AlphaMenuEntity) objM103370j;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m52998m(@NotNull Continuation<? super ComplianceFinanceRuleEntity> continuation) {
        QuoteMarketRepository$fetchBusinessConfig$1 quoteMarketRepository$fetchBusinessConfig$1;
        if (continuation instanceof QuoteMarketRepository$fetchBusinessConfig$1) {
            quoteMarketRepository$fetchBusinessConfig$1 = (QuoteMarketRepository$fetchBusinessConfig$1) continuation;
            int i11 = quoteMarketRepository$fetchBusinessConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$fetchBusinessConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$fetchBusinessConfig$1 = new QuoteMarketRepository$fetchBusinessConfig$1(this, continuation);
            }
        } else {
            quoteMarketRepository$fetchBusinessConfig$1 = new QuoteMarketRepository$fetchBusinessConfig$1(this, continuation);
        }
        Object objM103371k = quoteMarketRepository$fetchBusinessConfig$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$fetchBusinessConfig$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103371k);
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                quoteMarketRepository$fetchBusinessConfig$1.label = 1;
                objM103371k = interfaceC46925bM52978M.m103371k(quoteMarketRepository$fetchBusinessConfig$1);
                if (objM103371k == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103371k);
            }
            return (ComplianceFinanceRuleEntity) objM103371k;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m52999n(@NotNull Continuation<? super List<String>> continuation) {
        QuoteMarketRepository$fetchMarket$1 quoteMarketRepository$fetchMarket$1;
        if (continuation instanceof QuoteMarketRepository$fetchMarket$1) {
            quoteMarketRepository$fetchMarket$1 = (QuoteMarketRepository$fetchMarket$1) continuation;
            int i11 = quoteMarketRepository$fetchMarket$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$fetchMarket$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$fetchMarket$1 = new QuoteMarketRepository$fetchMarket$1(this, continuation);
            }
        } else {
            quoteMarketRepository$fetchMarket$1 = new QuoteMarketRepository$fetchMarket$1(this, continuation);
        }
        Object objM103382v = quoteMarketRepository$fetchMarket$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$fetchMarket$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103382v);
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                quoteMarketRepository$fetchMarket$1.label = 1;
                objM103382v = interfaceC46925bM52978M.m103382v(quoteMarketRepository$fetchMarket$1);
                if (objM103382v == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103382v);
            }
            RankMarketEntity rankMarketEntity = (RankMarketEntity) objM103382v;
            if (rankMarketEntity != null) {
                return rankMarketEntity.getMarkets();
            }
            return null;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m53000o(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Continuation<? super List<RankFuturesEntity>> continuation) {
        QuoteMarketRepository$fetchRankFuturesList$1 quoteMarketRepository$fetchRankFuturesList$1;
        if (continuation instanceof QuoteMarketRepository$fetchRankFuturesList$1) {
            quoteMarketRepository$fetchRankFuturesList$1 = (QuoteMarketRepository$fetchRankFuturesList$1) continuation;
            int i11 = quoteMarketRepository$fetchRankFuturesList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$fetchRankFuturesList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$fetchRankFuturesList$1 = new QuoteMarketRepository$fetchRankFuturesList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$fetchRankFuturesList$1 = new QuoteMarketRepository$fetchRankFuturesList$1(this, continuation);
        }
        QuoteMarketRepository$fetchRankFuturesList$1 quoteMarketRepository$fetchRankFuturesList$2 = quoteMarketRepository$fetchRankFuturesList$1;
        Object objM103384z = quoteMarketRepository$fetchRankFuturesList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$fetchRankFuturesList$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103384z);
                String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                quoteMarketRepository$fetchRankFuturesList$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$fetchRankFuturesList$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                quoteMarketRepository$fetchRankFuturesList$2.L$2 = SpillingKt.nullOutSpilledVariable(str3);
                quoteMarketRepository$fetchRankFuturesList$2.L$3 = SpillingKt.nullOutSpilledVariable(strM51845i);
                quoteMarketRepository$fetchRankFuturesList$2.label = 1;
                objM103384z = interfaceC46925bM52978M.m103384z(str, str2, str3, strM51845i, quoteMarketRepository$fetchRankFuturesList$2);
                if (objM103384z == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103384z);
            }
            return (List) objM103384z;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m53001p(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull Continuation<? super List<RankEntity>> continuation) {
        QuoteMarketRepository$fetchRankSpotList$1 quoteMarketRepository$fetchRankSpotList$1;
        if (continuation instanceof QuoteMarketRepository$fetchRankSpotList$1) {
            quoteMarketRepository$fetchRankSpotList$1 = (QuoteMarketRepository$fetchRankSpotList$1) continuation;
            int i11 = quoteMarketRepository$fetchRankSpotList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$fetchRankSpotList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$fetchRankSpotList$1 = new QuoteMarketRepository$fetchRankSpotList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$fetchRankSpotList$1 = new QuoteMarketRepository$fetchRankSpotList$1(this, continuation);
        }
        QuoteMarketRepository$fetchRankSpotList$1 quoteMarketRepository$fetchRankSpotList$2 = quoteMarketRepository$fetchRankSpotList$1;
        Object objM103352I = quoteMarketRepository$fetchRankSpotList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$fetchRankSpotList$2.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103352I);
                String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                quoteMarketRepository$fetchRankSpotList$2.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$fetchRankSpotList$2.L$1 = SpillingKt.nullOutSpilledVariable(str2);
                quoteMarketRepository$fetchRankSpotList$2.L$2 = SpillingKt.nullOutSpilledVariable(str3);
                quoteMarketRepository$fetchRankSpotList$2.L$3 = SpillingKt.nullOutSpilledVariable(str4);
                quoteMarketRepository$fetchRankSpotList$2.L$4 = SpillingKt.nullOutSpilledVariable(strM51845i);
                quoteMarketRepository$fetchRankSpotList$2.label = 1;
                objM103352I = interfaceC46925bM52978M.m103352I(str, str2, str3, str4, strM51845i, quoteMarketRepository$fetchRankSpotList$2);
                if (objM103352I == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103352I);
            }
            return (List) objM103352I;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r1 == r4) goto L36;
     */
    @Nullable
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m53002r(@NotNull String str, @NotNull AlphaListBodyParam alphaListBodyParam, @NotNull Continuation<? super AlphaMarketEntity> continuation) {
        QuoteMarketRepository$getAlphaCoins$1 quoteMarketRepository$getAlphaCoins$1;
        QuoteMarketRepository quoteMarketRepository;
        if (continuation instanceof QuoteMarketRepository$getAlphaCoins$1) {
            quoteMarketRepository$getAlphaCoins$1 = (QuoteMarketRepository$getAlphaCoins$1) continuation;
            int i11 = quoteMarketRepository$getAlphaCoins$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getAlphaCoins$1.label = i11 - Integer.MIN_VALUE;
                quoteMarketRepository = this;
            } else {
                quoteMarketRepository = this;
                quoteMarketRepository$getAlphaCoins$1 = new QuoteMarketRepository$getAlphaCoins$1(quoteMarketRepository, continuation);
            }
        } else {
            quoteMarketRepository = this;
            quoteMarketRepository$getAlphaCoins$1 = new QuoteMarketRepository$getAlphaCoins$1(quoteMarketRepository, continuation);
        }
        Object objM103380t = quoteMarketRepository$getAlphaCoins$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getAlphaCoins$1.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    ResultKt.throwOnFailure(objM103380t);
                    return (AlphaMarketEntity) objM103380t;
                }
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103380t);
                return (AlphaMarketEntity) objM103380t;
            }
            ResultKt.throwOnFailure(objM103380t);
            String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
            if (Intrinsics.areEqual(str, "alpha_premium")) {
                InterfaceC46925b interfaceC46925bM52978M = quoteMarketRepository.m52978M();
                AlphaListBodyParam alphaListBodyParamCopy$default = AlphaListBodyParam.copy$default(alphaListBodyParam, null, null, null, null, null, null, null, strM51845i, 127, null);
                quoteMarketRepository$getAlphaCoins$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$getAlphaCoins$1.L$1 = SpillingKt.nullOutSpilledVariable(alphaListBodyParam);
                quoteMarketRepository$getAlphaCoins$1.L$2 = SpillingKt.nullOutSpilledVariable(strM51845i);
                quoteMarketRepository$getAlphaCoins$1.label = 1;
                objM103380t = interfaceC46925bM52978M.m103381u(alphaListBodyParamCopy$default, quoteMarketRepository$getAlphaCoins$1);
                if (objM103380t == coroutine_suspended) {
                }
                return (AlphaMarketEntity) objM103380t;
            }
            if (!Intrinsics.areEqual(str, "alpha_onchain")) {
                return null;
            }
            InterfaceC46925b interfaceC46925bM52978M2 = quoteMarketRepository.m52978M();
            quoteMarketRepository$getAlphaCoins$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            quoteMarketRepository$getAlphaCoins$1.L$1 = SpillingKt.nullOutSpilledVariable(alphaListBodyParam);
            quoteMarketRepository$getAlphaCoins$1.L$2 = SpillingKt.nullOutSpilledVariable(strM51845i);
            quoteMarketRepository$getAlphaCoins$1.label = 2;
            objM103380t = interfaceC46925bM52978M2.m103380t(alphaListBodyParam, quoteMarketRepository$getAlphaCoins$1);
            return coroutine_suspended;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return null;
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m53003s(@NotNull String str, @NotNull List<String> list, @NotNull Continuation<? super List<AlphaItemEntity>> continuation) {
        QuoteMarketRepository$getAlphaDataByTokens$1 quoteMarketRepository$getAlphaDataByTokens$1;
        if (continuation instanceof QuoteMarketRepository$getAlphaDataByTokens$1) {
            quoteMarketRepository$getAlphaDataByTokens$1 = (QuoteMarketRepository$getAlphaDataByTokens$1) continuation;
            int i11 = quoteMarketRepository$getAlphaDataByTokens$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getAlphaDataByTokens$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getAlphaDataByTokens$1 = new QuoteMarketRepository$getAlphaDataByTokens$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getAlphaDataByTokens$1 = new QuoteMarketRepository$getAlphaDataByTokens$1(this, continuation);
        }
        Object objM103373m = quoteMarketRepository$getAlphaDataByTokens$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getAlphaDataByTokens$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103373m);
                String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                AlphaWithTokenTypeParamV2 alphaWithTokenTypeParamV2 = new AlphaWithTokenTypeParamV2(str, null, list, strM51845i);
                quoteMarketRepository$getAlphaDataByTokens$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                quoteMarketRepository$getAlphaDataByTokens$1.L$1 = SpillingKt.nullOutSpilledVariable(list);
                quoteMarketRepository$getAlphaDataByTokens$1.L$2 = SpillingKt.nullOutSpilledVariable(strM51845i);
                quoteMarketRepository$getAlphaDataByTokens$1.label = 1;
                objM103373m = interfaceC46925bM52978M.m103373m("Alpha_Ondo", alphaWithTokenTypeParamV2, quoteMarketRepository$getAlphaDataByTokens$1);
                if (objM103373m == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103373m);
            }
            return (List) objM103373m;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return CollectionsKt.emptyList();
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: t */
    public final Object m53004t(@NotNull Continuation<? super List<AlphaItemEntity>> continuation) {
        QuoteMarketRepository$getAlphaRankList$1 quoteMarketRepository$getAlphaRankList$1;
        if (continuation instanceof QuoteMarketRepository$getAlphaRankList$1) {
            quoteMarketRepository$getAlphaRankList$1 = (QuoteMarketRepository$getAlphaRankList$1) continuation;
            int i11 = quoteMarketRepository$getAlphaRankList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getAlphaRankList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getAlphaRankList$1 = new QuoteMarketRepository$getAlphaRankList$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getAlphaRankList$1 = new QuoteMarketRepository$getAlphaRankList$1(this, continuation);
        }
        Object objM103361a = quoteMarketRepository$getAlphaRankList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getAlphaRankList$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM103361a);
                InterfaceC46925b interfaceC46925bM52978M = m52978M();
                quoteMarketRepository$getAlphaRankList$1.label = 1;
                objM103361a = interfaceC46925bM52978M.m103361a(quoteMarketRepository$getAlphaRankList$1);
                if (objM103361a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM103361a);
            }
            return (List) objM103361a;
        } catch (ApiException e11) {
            C44128b.m97263g("QuoteMarketRepository", e11);
            return CollectionsKt.emptyList();
        } catch (Exception e12) {
            C43846g.m96568c(new KCConfigException(e12, "QuoteMarketRepository", false, null, 8, null), null, 2, null);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC46925b m53005u() {
        return (InterfaceC46925b) this.f42589a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: v */
    public final Object m53006v(@NotNull List<String> list, @NotNull String str, @NotNull Continuation<? super List<ChainItemEntity>> continuation) {
        QuoteMarketRepository$getChainDataByTokens$1 quoteMarketRepository$getChainDataByTokens$1;
        if (continuation instanceof QuoteMarketRepository$getChainDataByTokens$1) {
            quoteMarketRepository$getChainDataByTokens$1 = (QuoteMarketRepository$getChainDataByTokens$1) continuation;
            int i11 = quoteMarketRepository$getChainDataByTokens$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getChainDataByTokens$1.label = i11 - Integer.MIN_VALUE;
            } else {
                quoteMarketRepository$getChainDataByTokens$1 = new QuoteMarketRepository$getChainDataByTokens$1(this, continuation);
            }
        } else {
            quoteMarketRepository$getChainDataByTokens$1 = new QuoteMarketRepository$getChainDataByTokens$1(this, continuation);
        }
        Object objM42823d = quoteMarketRepository$getChainDataByTokens$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getChainDataByTokens$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42823d);
            InterfaceC41634e<List<ChainItemEntity>> interfaceC41634eM103372l = m53005u().m103372l(new ChainDataByTokensParam(list, str));
            QuoteMarketRepository$getChainDataByTokens$2 quoteMarketRepository$getChainDataByTokens$2 = new QuoteMarketRepository$getChainDataByTokens$2(null);
            quoteMarketRepository$getChainDataByTokens$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
            quoteMarketRepository$getChainDataByTokens$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
            quoteMarketRepository$getChainDataByTokens$1.label = 1;
            objM42823d = RetrofitFlowExKt.m42823d(interfaceC41634eM103372l, false, quoteMarketRepository$getChainDataByTokens$2, quoteMarketRepository$getChainDataByTokens$1);
            if (objM42823d == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42823d);
        }
        List list2 = (List) RetrofitFlowExKt.m42829j((C19334f) objM42823d);
        return list2 == null ? CollectionsKt.emptyList() : list2;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final InterfaceC41634e<ChainListEntity> m53007w(@NotNull ChainListParam param) {
        Intrinsics.checkNotNullParameter(param, "param");
        return m53005u().m103357O(param);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Nullable
    /* JADX INFO: renamed from: y */
    public final Object m53009y(@NotNull Continuation<? super List<AllTradeItemBean>> continuation) throws Exception {
        QuoteMarketRepository$getCollectAllList$1 quoteMarketRepository$getCollectAllList$1;
        QuoteMarketRepository quoteMarketRepository;
        List<UserFavoritesItem> items;
        AlphaItemEntity alpha;
        AllTradeItemBean allTradeItemBeanM92070b;
        if (continuation instanceof QuoteMarketRepository$getCollectAllList$1) {
            quoteMarketRepository$getCollectAllList$1 = (QuoteMarketRepository$getCollectAllList$1) continuation;
            int i11 = quoteMarketRepository$getCollectAllList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                quoteMarketRepository$getCollectAllList$1.label = i11 - Integer.MIN_VALUE;
                quoteMarketRepository = this;
            } else {
                quoteMarketRepository = this;
                quoteMarketRepository$getCollectAllList$1 = new QuoteMarketRepository$getCollectAllList$1(quoteMarketRepository, continuation);
            }
        } else {
            quoteMarketRepository = this;
            quoteMarketRepository$getCollectAllList$1 = new QuoteMarketRepository$getCollectAllList$1(quoteMarketRepository, continuation);
        }
        QuoteMarketRepository$getCollectAllList$1 quoteMarketRepository$getCollectAllList$2 = quoteMarketRepository$getCollectAllList$1;
        Object objM103343y = quoteMarketRepository$getCollectAllList$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = quoteMarketRepository$getCollectAllList$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM103343y);
            String strM51845i = QuoteBusinessConfigHelp.f41933a.m51845i();
            InterfaceC46925b interfaceC46925bM52978M = quoteMarketRepository.m52978M();
            quoteMarketRepository$getCollectAllList$2.L$0 = SpillingKt.nullOutSpilledVariable(strM51845i);
            quoteMarketRepository$getCollectAllList$2.label = 1;
            objM103343y = InterfaceC46925b.m103343y(interfaceC46925bM52978M, null, strM51845i, null, quoteMarketRepository$getCollectAllList$2, 5, null);
            if (objM103343y == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM103343y);
        }
        UserFavoritesEntity userFavoritesEntity = (UserFavoritesEntity) objM103343y;
        if (userFavoritesEntity == null || (items = userFavoritesEntity.getItems()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (UserFavoritesItem userFavoritesItem : items) {
            Integer type = userFavoritesItem.getType();
            if (type != null && type.intValue() == 1) {
                MarketListEntityItem spot = userFavoritesItem.getSpot();
                if (spot != null) {
                    allTradeItemBeanM92070b = C41989e.m92069a(new AllTradeItemBean(0, 0L, null, 7, null), new C41993i().mo51723a(spot), 1);
                } else {
                    allTradeItemBeanM92070b = null;
                }
            } else if (type != null && type.intValue() == 2) {
                MarketListEntityItem futures = userFavoritesItem.getFutures();
                if (futures != null) {
                    allTradeItemBeanM92070b = C41989e.m92069a(new AllTradeItemBean(0, 0L, null, 7, null), new C41992h().mo51723a(futures), 2);
                } else {
                    allTradeItemBeanM92070b = null;
                }
            } else if (type == null || type.intValue() != 3 || (alpha = userFavoritesItem.getAlpha()) == null) {
                allTradeItemBeanM92070b = null;
            } else {
                allTradeItemBeanM92070b = C41989e.m92070b(new AllTradeItemBean(0, 0L, null, 7, null), alpha, 5);
            }
            if (allTradeItemBeanM92070b != null) {
                arrayList.add(allTradeItemBeanM92070b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: V */
    public static final InterfaceC46925b m52960V() {
        return (InterfaceC46925b) C42597a.m93388d().create(InterfaceC46925b.class);
    }

    /* JADX INFO: renamed from: k */
    public static final InterfaceC46925b m52964k() {
        return (InterfaceC46925b) C42597a.m93387c().create(InterfaceC46925b.class);
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final InterfaceC41634e<HoldingCombinedData> m52972G(@Nullable String str) {
        return m53005u().m103349F(str);
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final InterfaceC41634e<HoldingAlphaData> m52973H(@Nullable String str) {
        return m53005u().m103353K(str);
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final InterfaceC41634e<HoldingData> m52974I(@Nullable String str) {
        return m53005u().m103355M(str);
    }

    @NotNull
    /* JADX INFO: renamed from: J */
    public final InterfaceC41634e<HoldingDir> m52975J() {
        return m53005u().m103374n();
    }

    @NotNull
    /* JADX INFO: renamed from: X */
    public final InterfaceC41634e<Object> m52988X(@Nullable String str, @Nullable Integer num, @Nullable String str2) {
        return m53005u().m103366f(new PinTopFavParam(str, num, str2));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final InterfaceC41634e<Object> m52990d(@Nullable String str) {
        return m53005u().m103351H(str);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final InterfaceC41634e<Object> m52991e(@Nullable String str) {
        return m53005u().m103351H(str);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Object m52992f(@NotNull List<String> list, @NotNull Continuation<Object> continuation) {
        return m52978M().m103359Q(new AlphaWithTokenParam(list), continuation);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public final InterfaceC41634e<Object> m52993g(@Nullable String str) {
        return m53005u().m103356N(str);
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final InterfaceC41634e<Object> m52996j(@Nullable String str) {
        return m53005u().m103358P(str);
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final InterfaceC41634e<List<ChainMenuEntity>> m53008x() {
        return m53005u().m103354L();
    }

    @NotNull
    /* JADX INFO: renamed from: z */
    public final InterfaceC41634e<List<FavMarketQuoteEntity>> m53010z() {
        return m53005u().m103347D();
    }
}
