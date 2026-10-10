package p844zu;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.kubi.data.entity.TradeItemBean;
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
import com.kubi.quotefacade.entity.ChainMarketSectorsEntity;
import com.kubi.quotefacade.entity.ChainMenuEntity;
import com.kubi.quotefacade.entity.ChainWithTokenParam;
import com.kubi.quotefacade.entity.ComplianceFinanceRuleEntity;
import com.kubi.quotefacade.entity.FavMarketQuoteEntity;
import com.kubi.quotefacade.entity.FutureQuoteEntity;
import com.kubi.quotefacade.entity.HoldingAlphaData;
import com.kubi.quotefacade.entity.HoldingCombinedData;
import com.kubi.quotefacade.entity.HoldingData;
import com.kubi.quotefacade.entity.HoldingDir;
import com.kubi.quotefacade.entity.Letter;
import com.kubi.quotefacade.entity.MarketListEntity;
import com.kubi.quotefacade.entity.MarketMenuEntity;
import com.kubi.quotefacade.entity.PinTopFavParam;
import com.kubi.quotefacade.entity.RankEntity;
import com.kubi.quotefacade.entity.RankFuturesEntity;
import com.kubi.quotefacade.entity.RankMarketEntity;
import com.kubi.quotefacade.entity.RecommendQuoteEntity;
import com.kubi.quotefacade.entity.TradeSymbolEntity;
import com.kubi.quotefacade.entity.UpdateFavParam;
import com.kubi.quotefacade.entity.UserFavoritesEntity;
import com.kubi.quotefacade.entity.UserFavoritesSpotEntity;
import com.kubi.quotefacade.entity.request.SymbolRequestParams;
import com.kubi.sdk.base.entity.BaseEntity;
import io.reactivex.Observable;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: zu.b */
/* JADX INFO: compiled from: IQuoteApi.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000²\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00040\u00032\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u000fH'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000f2\b\b\u0001\u0010\u0017\u001a\u00020\u0018H'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u000f2\b\b\u0001\u0010\u001b\u001a\u00020\u0007H'J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00130\u000fH'J,\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\b\b\u0001\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH'J8\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\b\b\u0001\u0010\u001f\u001a\u00020\u00072\b\b\u0001\u0010 \u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H'J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000f2\b\b\u0001\u0010#\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH'J\u0014\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00130\u000fH'J \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00130\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H'J\u0014\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00130\u000fH'J\u0014\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00130\u000fH'J \u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00130\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H'J\u0014\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00130\u000fH'J,\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00132\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u00100J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\u0006\u00102\u001a\u000203H§@¢\u0006\u0002\u00104J&\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00132\u000e\b\u0001\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H§@¢\u0006\u0002\u00107J\u001e\u00108\u001a\b\u0012\u0004\u0012\u00020.0\u00132\b\b\u0001\u0010\u0017\u001a\u000209H§@¢\u0006\u0002\u0010:J(\u0010;\u001a\b\u0012\u0004\u0012\u00020.0\u00132\b\b\u0003\u0010<\u001a\u00020\u00072\b\b\u0001\u0010\u0017\u001a\u00020=H§@¢\u0006\u0002\u0010>J\u0018\u0010?\u001a\u00020\u00012\b\b\u0001\u0010\u0017\u001a\u00020@H§@¢\u0006\u0002\u0010AJ \u0010B\u001a\b\u0012\u0004\u0012\u00020.0\u00132\n\b\u0001\u0010/\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010CJ\u001a\u0010D\u001a\u00020E2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010CJ\u0018\u0010F\u001a\u00020G2\b\b\u0001\u0010\u0017\u001a\u00020HH§@¢\u0006\u0002\u0010IJ\u0018\u0010J\u001a\u00020G2\b\b\u0001\u0010\u0017\u001a\u00020HH§@¢\u0006\u0002\u0010IJ\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020.0\u0013H§@¢\u0006\u0002\u0010LJ\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0001\u0010\u0017\u001a\u00020NH'J\u0018\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0001\u0010\u0017\u001a\u00020PH'J\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\n\b\u0001\u0010R\u001a\u0004\u0018\u00010\u0007H'J\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0007H'J\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0007H'J\u0018\u0010V\u001a\b\u0012\u0004\u0012\u00020W0\u000f2\b\b\u0001\u0010\u0017\u001a\u00020XH'J*\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00130\u000f2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010[\u001a\u00020\u0007H'J\u001a\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010]0\u000f2\b\b\u0001\u0010T\u001a\u00020^H'J\u001e\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00130\u000f2\b\b\u0001\u0010\u0017\u001a\u00020`H'J \u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00130\u000f2\n\b\u0001\u0010T\u001a\u0004\u0018\u00010\u0007H'J\u0010\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010c0\u000fH'J\u001c\u0010d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010e0\u000f2\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u0007H'J\u001c\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0\u000f2\n\b\u0001\u0010f\u001a\u0004\u0018\u00010\u0007H'J\u001c\u0010i\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010j0\u000f2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H'J\u0016\u0010k\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020l\u0018\u00010\u00130\u000fH'JR\u0010m\u001a\n\u0012\u0004\u0012\u00020n\u0018\u00010\u00132\n\b\u0001\u0010o\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010[\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010q\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010rJF\u0010s\u001a\n\u0012\u0004\u0012\u00020t\u0018\u00010\u00132\n\b\u0001\u0010o\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010p\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010[\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010uJ\"\u0010v\u001a\n\u0012\u0004\u0012\u00020w\u0018\u00010\u00132\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0007H§@¢\u0006\u0002\u0010CJ\u0010\u0010x\u001a\u0004\u0018\u00010yH§@¢\u0006\u0002\u0010LJ\u0010\u0010z\u001a\u0004\u0018\u00010{H§@¢\u0006\u0002\u0010LJ0\u0010|\u001a\u0004\u0018\u00010}2\b\b\u0003\u0010<\u001a\u00020\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010~\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u007fJ2\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00012\b\b\u0001\u0010<\u001a\u00020\u00072\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010~\u001a\u00020\u0007H§@¢\u0006\u0002\u0010\u007fJ%\u0010\u0082\u0001\u001a\u0004\u0018\u00010G2\b\b\u0001\u0010<\u001a\u00020\u00072\b\b\u0003\u0010~\u001a\u00020\u0007H§@¢\u0006\u0002\u00100ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0083\u0001À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/quotefacade/api/IQuoteApi;", "", "getCardBusinessIdList", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/quotefacade/entity/Letter;", "cardBusinessIdList", "", "gmtCreated", "", DevicePublicKeyStringDef.DIRECT, "", "pageSize", "(Ljava/lang/String;Ljava/lang/Long;II)Lio/reactivex/Observable;", "getMenuList", "Lkotlinx/coroutines/flow/Flow;", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;", "excludes", "getChainMenuList", "", "Lcom/kubi/quotefacade/entity/ChainMenuEntity;", "getChainMarketList", "Lcom/kubi/quotefacade/entity/ChainListEntity;", "param", "Lcom/kubi/quotefacade/entity/ChainListParam;", "getFavChainList", "Lcom/kubi/quotefacade/entity/ChainItemEntity;", "orderByRange", "getFavSimpleChainList", "getSpotList", "Lcom/kubi/quotefacade/entity/MarketListEntity;", "l1Keyword", "l2Keyword", "getFutureList", "getEtfList", "l1p", "getCollectSpotList", "Lcom/kubi/quotefacade/entity/FavMarketQuoteEntity;", "getCollectFutureList", "Lcom/kubi/quotefacade/entity/FutureQuoteEntity;", "getCollectETFList", "getRecommendSpotList", "Lcom/kubi/quotefacade/entity/RecommendQuoteEntity;", "getRecommendFutureList", "getRecommendETFList", "fetchAlphaRecommend", "Lcom/kubi/quotefacade/entity/AlphaItemEntity;", "collectType", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUserAlphaFavorites", "isPremium", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAlphaFavoritesInfo", "tokenChains", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlphaDataByTokens", "Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParam;", "(Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getV2AlphaDataByTokens", "datasource", "Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;", "(Ljava/lang/String;Lcom/kubi/quotefacade/entity/AlphaWithTokenTypeParamV2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addOrDeleteAlphaToFav", "Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;", "(Lcom/kubi/quotefacade/entity/AlphaWithTokenParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavAlphaList", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAlphaMenu", "Lcom/kubi/quotefacade/entity/AlphaMenuEntity;", "fetchAlphaHighlights", "Lcom/kubi/quotefacade/entity/AlphaMarketEntity;", "Lcom/kubi/quotefacade/entity/AlphaListBodyParam;", "(Lcom/kubi/quotefacade/entity/AlphaListBodyParam;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAlphaChainArea", "fetchAlphaRankList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateFavoriteList", "Lcom/kubi/quotefacade/entity/UpdateFavParam;", "topFavoriteList", "Lcom/kubi/quotefacade/entity/PinTopFavParam;", "addOrDeleteSpotToFav", "symbol", "addOrDeleteFuturesToFav", "symbols", "addOrDeleteEtfToFav", "addOrDeleteMemeToFav", "Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;", "Lcom/kubi/quotefacade/entity/ChainWithTokenParam;", "getQuoteDataBySymbols", "Lcom/kubi/data/entity/TradeItemBean;", "from", "getQuoteDataBySymbolsV2", "Lcom/kubi/quotefacade/entity/TradeSymbolEntity;", "Lcom/kubi/quotefacade/entity/request/SymbolRequestParams;", "getChainDataByTokens", "Lcom/kubi/quotefacade/entity/ChainDataByTokensParam;", "getFutureDataBySymbols", "getMarketHoldingsDir", "Lcom/kubi/quotefacade/entity/HoldingDir;", "getMarketHoldingsData", "Lcom/kubi/quotefacade/entity/HoldingData;", "holdingsType", "getMarketAlphaHoldingsData", "Lcom/kubi/quotefacade/entity/HoldingAlphaData;", "getMarketAllHoldingsData", "Lcom/kubi/quotefacade/entity/HoldingCombinedData;", "chainHotSectors", "Lcom/kubi/quotefacade/entity/ChainMarketSectorsEntity;", "getRankSoptList", "Lcom/kubi/quotefacade/entity/RankEntity;", "rankType", "catalog", "market", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRankFuturesList", "Lcom/kubi/quotefacade/entity/RankFuturesEntity;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectAllList", "Lcom/kubi/quotefacade/entity/AllQuoteEntity;", "fetchMarket", "Lcom/kubi/quotefacade/entity/RankMarketEntity;", "fetchBusinessConfig", "Lcom/kubi/quotefacade/entity/ComplianceFinanceRuleEntity;", "getCollectAllFavorites", "Lcom/kubi/quotefacade/entity/UserFavoritesEntity;", "customizations", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCollectFlatFavorites", "Lcom/kubi/quotefacade/entity/UserFavoritesSpotEntity;", "getCollectFlatFavoritesAlpha", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46925b {
    @GET("/app/discover-new/market_area/area/etf")
    @NotNull
    /* JADX INFO: renamed from: A */
    InterfaceC41634e<MarketListEntity> m103344A(@NotNull @Query("l1Keyword") String str, @Query("pageSize") int i11);

    @POST("/app/discover-front/dex/smart_contract/favorites")
    @NotNull
    /* JADX INFO: renamed from: B */
    InterfaceC41634e<ChainBackDeleteEntity> m103345B(@Body @NotNull ChainWithTokenParam chainWithTokenParam);

    @GET("v1/message-center/cardGroupList")
    @NotNull
    /* JADX INFO: renamed from: C */
    Observable<BaseEntity<Letter>> m103346C(@Nullable @Query("cardGroupIdList") String str, @Nullable @Query("gmtCreated") Long l11, @Query(DevicePublicKeyStringDef.DIRECT) int i11, @Query("pageSize") int i12);

    @GET("v1/chameleon/etf/collect/symbols")
    @NotNull
    /* JADX INFO: renamed from: D */
    InterfaceC41634e<List<FavMarketQuoteEntity>> m103347D();

    @GET("discover-front/user_favorites")
    @Nullable
    /* JADX INFO: renamed from: E */
    Object m103348E(@NotNull @Query("datasource") String str, @Nullable @Query("excludes") String str2, @NotNull @Query("customizations") String str3, @NotNull Continuation<? super UserFavoritesSpotEntity> continuation) throws Exception;

    @GET("v1/holding/all/list")
    @NotNull
    /* JADX INFO: renamed from: F */
    InterfaceC41634e<HoldingCombinedData> m103349F(@Nullable @Query("excludes") String str);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: G */
    InterfaceC41634e<List<TradeItemBean>> m103350G(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @FormUrlEncoded
    @POST("v2/chameleon/user/collect/contract")
    @NotNull
    /* JADX INFO: renamed from: H */
    InterfaceC41634e<Object> m103351H(@Field("symbols") @Nullable String str);

    @GET("v2/api-reaper/rank")
    @Nullable
    /* JADX INFO: renamed from: I */
    Object m103352I(@Nullable @Query("rankType") String str, @Nullable @Query("catalog") String str2, @Nullable @Query("from") String str3, @Nullable @Query("market") String str4, @Nullable @Query("excludes") String str5, @NotNull Continuation<? super List<RankEntity>> continuation) throws Exception;

    @GET("v1/alpha/holding/list")
    @NotNull
    /* JADX INFO: renamed from: K */
    InterfaceC41634e<HoldingAlphaData> m103353K(@Nullable @Query("accountType") String str);

    @GET("v1/api-reaper/pathfinder/menu/list")
    @NotNull
    /* JADX INFO: renamed from: L */
    InterfaceC41634e<List<ChainMenuEntity>> m103354L();

    @GET("v1/holding/list")
    @NotNull
    /* JADX INFO: renamed from: M */
    InterfaceC41634e<HoldingData> m103355M(@Nullable @Query("accountType") String str);

    @FormUrlEncoded
    @POST("v2/chameleon/user/collect/etf")
    @NotNull
    /* JADX INFO: renamed from: N */
    InterfaceC41634e<Object> m103356N(@Field("symbols") @Nullable String str);

    @POST("v1/api-reaper/pathfinder/chain/tokens")
    @NotNull
    /* JADX INFO: renamed from: O */
    InterfaceC41634e<ChainListEntity> m103357O(@Body @NotNull ChainListParam chainListParam);

    @FormUrlEncoded
    @POST("v2/chameleon/user/collect/spot")
    @NotNull
    /* JADX INFO: renamed from: P */
    InterfaceC41634e<Object> m103358P(@Field("symbols") @Nullable String str);

    @POST("v1/alpha/collect/fav")
    @Nullable
    /* JADX INFO: renamed from: Q */
    Object m103359Q(@Body @NotNull AlphaWithTokenParam alphaWithTokenParam, @NotNull Continuation<Object> continuation);

    @POST("v2/chameleon/collect/batch-update")
    @NotNull
    /* JADX INFO: renamed from: R */
    InterfaceC41634e<Object> m103360R(@Body @NotNull UpdateFavParam updateFavParam);

    @GET("v1/alpha/homepage/list")
    @Nullable
    /* JADX INFO: renamed from: a */
    Object m103361a(@NotNull Continuation<? super List<AlphaItemEntity>> continuation);

    @GET("v1/collect/future/symbol/recommend")
    @NotNull
    /* JADX INFO: renamed from: b */
    InterfaceC41634e<List<RecommendQuoteEntity>> m103362b(@Nullable @Query("excludes") String str);

    @GET("v1/chameleon/contract/v2/symbols")
    @NotNull
    /* JADX INFO: renamed from: c */
    InterfaceC41634e<List<FutureQuoteEntity>> m103363c(@Nullable @Query("symbols") String str);

    @GET("/app/discover-new/market_area/menu/app")
    @NotNull
    /* JADX INFO: renamed from: d */
    InterfaceC41634e<MarketMenuEntity> m103364d(@Nullable @Query("excludes") String str);

    @GET("v1/alpha/collect/recommend")
    @Nullable
    /* JADX INFO: renamed from: e */
    Object m103365e(@Nullable @Query("collectType") String str, @Nullable @Query("excludes") String str2, @NotNull Continuation<? super List<AlphaItemEntity>> continuation);

    @POST("v1/chameleon/collect/top")
    @NotNull
    /* JADX INFO: renamed from: f */
    InterfaceC41634e<Object> m103366f(@Body @NotNull PinTopFavParam pinTopFavParam);

    @GET("v1/api-reaper/pathfinder/conceptBlock/list")
    @NotNull
    /* JADX INFO: renamed from: g */
    InterfaceC41634e<List<ChainMarketSectorsEntity>> m103367g();

    @GET("discover-front/user_favorites")
    @Nullable
    /* JADX INFO: renamed from: h */
    Object m103368h(@NotNull @Query("datasource") String str, @NotNull @Query("customizations") String str2, @NotNull Continuation<? super AlphaMarketEntity> continuation) throws Exception;

    @GET("/app/pathfinder/dex/smart_contract/favorites_with_trade")
    @NotNull
    /* JADX INFO: renamed from: i */
    InterfaceC41634e<List<ChainItemEntity>> m103369i(@NotNull @Query("orderByRange") String str);

    @GET("discover-new/market_area/alpha/menu/app")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m103370j(@Nullable @Query("excludes") String str, @NotNull Continuation<? super AlphaMenuEntity> continuation);

    @GET("discover-front/dynamic_uri_parameters/includes")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m103371k(@NotNull Continuation<? super ComplianceFinanceRuleEntity> continuation) throws Exception;

    @POST("v1/api-reaper/pathfinder/tokenChain/list")
    @NotNull
    /* JADX INFO: renamed from: l */
    InterfaceC41634e<List<ChainItemEntity>> m103372l(@Body @NotNull ChainDataByTokensParam chainDataByTokensParam);

    @POST("discover-front/alpha/items")
    @Nullable
    /* JADX INFO: renamed from: m */
    Object m103373m(@NotNull @Query("datasource") String str, @Body @NotNull AlphaWithTokenTypeParamV2 alphaWithTokenTypeParamV2, @NotNull Continuation<? super List<AlphaItemEntity>> continuation);

    @GET("v1/holding/dir")
    @NotNull
    /* JADX INFO: renamed from: n */
    InterfaceC41634e<HoldingDir> m103374n();

    @GET("v1/collect/etf/symbol/recommend")
    @NotNull
    /* JADX INFO: renamed from: o */
    InterfaceC41634e<List<RecommendQuoteEntity>> m103375o();

    @GET("discover-front/user_favorites")
    @Nullable
    /* JADX INFO: renamed from: p */
    Object m103376p(@NotNull @Query("datasource") String str, @Nullable @Query("excludes") String str2, @NotNull @Query("customizations") String str3, @NotNull Continuation<? super UserFavoritesEntity> continuation) throws Exception;

    @GET("/app/discover-new/market_area/area/spot")
    @NotNull
    /* JADX INFO: renamed from: q */
    InterfaceC41634e<MarketListEntity> m103377q(@NotNull @Query("l1Keyword") String str, @NotNull @Query("l2Keyword") String str2, @Query("pageSize") int i11);

    @GET("v1/collect/spot/symbol/recommend")
    @NotNull
    /* JADX INFO: renamed from: r */
    InterfaceC41634e<List<RecommendQuoteEntity>> m103378r();

    @POST("v2/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: s */
    InterfaceC41634e<TradeSymbolEntity> m103379s(@Body @NotNull SymbolRequestParams symbolRequestParams);

    @POST("discover-new/market_area/alpha/chain_area")
    @Nullable
    /* JADX INFO: renamed from: t */
    Object m103380t(@Body @NotNull AlphaListBodyParam alphaListBodyParam, @NotNull Continuation<? super AlphaMarketEntity> continuation);

    @POST("discover-new/market_area/alpha/highlights")
    @Nullable
    /* JADX INFO: renamed from: u */
    Object m103381u(@Body @NotNull AlphaListBodyParam alphaListBodyParam, @NotNull Continuation<? super AlphaMarketEntity> continuation);

    @GET("discover-new/rankings/markets")
    @Nullable
    /* JADX INFO: renamed from: v */
    Object m103382v(@NotNull Continuation<? super RankMarketEntity> continuation) throws Exception;

    @GET("/app/discover-new/market_area/area/future")
    @NotNull
    /* JADX INFO: renamed from: w */
    InterfaceC41634e<MarketListEntity> m103383w(@NotNull @Query("l1Keyword") String str, @NotNull @Query("l2Keyword") String str2, @Query("pageSize") int i11, @Nullable @Query("excludes") String str3);

    @GET("v2/api-reaper/rank")
    @Nullable
    /* JADX INFO: renamed from: z */
    Object m103384z(@Nullable @Query("rankType") String str, @Nullable @Query("catalog") String str2, @Nullable @Query("from") String str3, @Nullable @Query("excludes") String str4, @NotNull Continuation<? super List<RankFuturesEntity>> continuation) throws Exception;

    /* JADX INFO: renamed from: J */
    static /* synthetic */ Object m103341J(InterfaceC46925b interfaceC46925b, String str, String str2, Continuation continuation, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCollectFlatFavoritesAlpha");
        }
        if ((i11 & 2) != 0) {
            str2 = "PriceWarn,SymbolLabel";
        }
        return interfaceC46925b.m103368h(str, str2, continuation);
    }

    /* JADX INFO: renamed from: x */
    static /* synthetic */ Object m103342x(InterfaceC46925b interfaceC46925b, String str, String str2, String str3, Continuation continuation, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCollectFlatFavorites");
        }
        if ((i11 & 4) != 0) {
            str3 = "PriceWarn,SymbolLabel";
        }
        return interfaceC46925b.m103348E(str, str2, str3, continuation);
    }

    /* JADX INFO: renamed from: y */
    static /* synthetic */ Object m103343y(InterfaceC46925b interfaceC46925b, String str, String str2, String str3, Continuation continuation, int i11, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCollectAllFavorites");
        }
        if ((i11 & 1) != 0) {
            str = "All";
        }
        if ((i11 & 4) != 0) {
            str3 = "PriceWarn,SymbolLabel";
        }
        return interfaceC46925b.m103376p(str, str2, str3, continuation);
    }
}
