package p768xo;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.MarketTicker;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.margin.entity.DelegationBorrowingEntity;
import com.kubi.margin.entity.DelegationInterestEntity;
import com.kubi.margin.entity.DelegationLiquidationEntity;
import com.kubi.margin.entity.DelegationRepaymentEntity;
import com.kubi.margin.entity.TagEntity;
import com.kubi.margin.market.info.MarketCoinInfo;
import com.kubi.margin.market.info.MarketTradeStat;
import com.kubi.quotefacade.entity.MarketListEntityItem;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.sdk.base.entity.BasePageEntity;
import com.kubi.spot.entity.DelegationEntity;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: renamed from: xo.h */
/* JADX INFO: compiled from: MarketApi.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JD\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0006H'J\u001e\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H'J0\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00040\u00032\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'J*\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\u0015\u001a\u00020\u0006H'J0\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00040\u00032\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0006H'J \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H'J\u0014\u0010\u001a\u001a\u00020\u000b2\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H'J&\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000f0\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H'J \u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H'J:\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u000f0\u00040\u00032\b\b\u0001\u0010 \u001a\u00020!2\b\b\u0003\u0010\"\u001a\u00020\u00062\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0006H'JL\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060%0\u000f0\u00040\u00032\b\b\u0001\u0010&\u001a\u00020\u00062\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\"\u001a\u00020\u00062\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u0006H'J6\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0003\u0010\f\u001a\u00020\u00062\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0006H'J2\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010-\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u0006H'J@\u0010/\u001a.\u0012*\u0012(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r00j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\r`10\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006H'JT\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u00040\u00032$\b\u0001\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`12\b\b\u0003\u00106\u001a\u0002072\b\b\u0003\u00108\u001a\u000207H'J@\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:030\u00040\u00032$\b\u0001\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`1H'J@\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<030\u00040\u00032$\b\u0001\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`1H'J@\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>030\u00040\u00032$\b\u0001\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`1H'J@\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@030\u00040\u00032$\b\u0001\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`1H'J@\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u00040\u00032$\b\u0001\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`1H'J(\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00042\b\b\u0001\u0010D\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010EJF\u0010F\u001a\b\u0012\u0004\u0012\u00020G0\u00042\b\b\u0001\u0010-\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010H\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u00062\b\b\u0003\u0010I\u001a\u00020\u0006H§@¢\u0006\u0002\u0010JJ\u0012\u0010K\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0006H'J(\u0010L\u001a\b\u0012\u0004\u0012\u00020M0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H§@¢\u0006\u0002\u0010EJ\u001e\u0010N\u001a\b\u0012\u0004\u0012\u0002070\u00042\b\b\u0001\u0010-\u001a\u00020\u0006H§@¢\u0006\u0002\u0010OJ@\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u00040\u00032$\b\u0001\u00105\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000600j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`1H'J \u0010Q\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'J\u0012\u0010R\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0006H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006SÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/margin/api/MarketApi;", "", "cancelTradeOder", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "tradeType", "", "orderId", "symbol", "type", "getSymbolHistory", "Lokhttp3/Request;", TUIConstants.TUIContact.LIMIT, "", "getTradeDataBySymbols", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "from", "getDiscoverTradeDataBySymbols", "Lcom/kubi/quotefacade/entity/MarketListEntityItem;", "customizations", "getMarketSymbol", "quotes", "marketTick", "Lcom/kubi/data/entity/MarketTicker;", "marketTickRequest", "getSymbolsInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "addFavorSymbol", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "header", "fingerId", "getCheckRequiredValidation", "", "bizType", "loginToken", "getOrderBookList", "Lcom/kubi/data/entity/OrderBookEntity;", "precision", "getPreviewInfo", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "fetchDelegationCount", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "getTradeOrdersV2", "Lcom/kubi/sdk/base/entity/BasePageEntity;", "Lcom/kubi/spot/entity/DelegationEntity;", ReportDataTable.COLUMN_PARAMS, "checkAllowCancelAll", "", "forceTypeLimit", "getBorrowOrder", "Lcom/kubi/margin/entity/DelegationBorrowingEntity;", "getRepayOrder", "Lcom/kubi/margin/entity/DelegationRepaymentEntity;", "getInterestRecord", "Lcom/kubi/margin/entity/DelegationInterestEntity;", "getLiquidationRecord", "Lcom/kubi/margin/entity/DelegationLiquidationEntity;", "getStopOrdersV2", "getDiscoverDetailTags", "Lcom/kubi/margin/entity/TagEntity;", "item", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarketCoinInfo", "Lcom/kubi/margin/market/info/MarketCoinInfo;", "legalCurrency", "source", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMarketTickerStats", "getTradeStats", "Lcom/kubi/margin/market/info/MarketTradeStat;", "supportFlashTrade", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getStopOrdersV3", "cancelOcoOder", "getTicker", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC46307h {
    @GET("v1/margin/loan/order/query-borrow-order")
    @NotNull
    /* JADX INFO: renamed from: A */
    Observable<BaseEntity<BasePageEntity<DelegationBorrowingEntity>>> m102119A(@QueryMap @NotNull HashMap<String, String> map);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m102120a(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @FormUrlEncoded
    @POST("v2/chameleon/user/collect/spot")
    @NotNull
    Observable<BaseEntity<Object>> addFavorSymbol(@Field("symbols") @Nullable String symbol);

    @GET("v1/market/orderbook-level2")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<OrderBookEntity>> m102121b(@Nullable @Query("symbol") String str, @NotNull @Query(TUIConstants.TUIContact.LIMIT) String str2, @Nullable @Query("precision") String str3);

    @GET("v1/symbols")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<ArrayList<SymbolInfoEntity>>> m102122c(@Nullable @Query("symbols") String str);

    @GET("v2/kc/trade/orders")
    @NotNull
    /* JADX INFO: renamed from: e */
    Observable<BaseEntity<BasePageEntity<DelegationEntity>>> m102123e(@QueryMap @NotNull HashMap<String, String> map, @Query("checkAllowCancelAll") boolean z11, @Query("forceTypeLimit") boolean z12);

    @GET("v1/margin/loan/order/query-repay-order")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<BasePageEntity<DelegationRepaymentEntity>>> m102124g(@QueryMap @NotNull HashMap<String, String> map);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    Observable<BaseEntity<ArrayList<TradeItemBean>>> getMarketSymbol(@Nullable @Query("quote") String quotes, @Header("User-Agent") @NotNull String from);

    @GET("v1/kumex-market/latest-ticker")
    @NotNull
    /* JADX INFO: renamed from: i */
    Request m102125i(@NotNull @Query("symbol") String str);

    @GET("v1/api-reaper/flash-trade/valid-enter/{currency}")
    @Nullable
    /* JADX INFO: renamed from: j */
    Object m102126j(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @NotNull Continuation<? super BaseEntity<Boolean>> continuation);

    @GET("v1/discover/item/tag")
    @Nullable
    /* JADX INFO: renamed from: k */
    Object m102127k(@NotNull @Query("item") String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super BaseEntity<TagEntity>> continuation);

    @GET("v1/quick-silver/universe-currency/symbols/stats/{symbol}")
    @NotNull
    /* JADX INFO: renamed from: l */
    Request m102128l(@Path("symbol") @NotNull String str) throws Throwable;

    @GET("v3/kc/trade/stop-orders")
    @NotNull
    /* JADX INFO: renamed from: m */
    Observable<BaseEntity<BasePageEntity<DelegationEntity>>> m102129m(@QueryMap @NotNull HashMap<String, String> map);

    @GET("v1/quick-silver/universe-currency/symbols/info/{currency}")
    @Nullable
    /* JADX INFO: renamed from: n */
    Object m102130n(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @NotNull @Query("symbol") String str2, @NotNull @Query("legalCurrency") String str3, @NotNull @Query("lang") String str4, @NotNull @Query("source") String str5, @NotNull Continuation<? super BaseEntity<MarketCoinInfo>> continuation);

    @GET("v1/trade/symbol-history")
    @NotNull
    /* JADX INFO: renamed from: o */
    Request m102131o(@Query(TUIConstants.TUIContact.LIMIT) int i11, @Nullable @Query("symbol") String str) throws Throwable;

    @GET("v1/quick-silver/universe-currency/symbol/user-trade-status")
    @Nullable
    /* JADX INFO: renamed from: p */
    Object m102132p(@NotNull @Query("symbol") String str, @NotNull @Query("type") String str2, @NotNull Continuation<? super BaseEntity<MarketTradeStat>> continuation);

    @GET("v1/kc/order/summary")
    @NotNull
    /* JADX INFO: renamed from: q */
    Observable<BaseEntity<HashMap<String, Integer>>> m102133q(@Nullable @Query("tradeType") String str);

    @GET("v1/margin/loan/order/query-interest-record")
    @NotNull
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<BasePageEntity<DelegationInterestEntity>>> m102134r(@QueryMap @NotNull HashMap<String, String> map);

    @FormUrlEncoded
    @POST("v1/kc/trade/oco-order-cancel")
    @NotNull
    /* JADX INFO: renamed from: s */
    Observable<BaseEntity<Object>> m102135s(@Field("orderId") @Nullable String str);

    @GET("v1/market/tick")
    @NotNull
    /* JADX INFO: renamed from: t */
    Observable<BaseEntity<MarketTicker>> m102136t(@Nullable @Query("symbol") String str);

    @GET("v1/market/tick")
    @NotNull
    /* JADX INFO: renamed from: u */
    Request m102137u(@Nullable @Query("symbol") String str) throws Throwable;

    @Headers({"Cache-Time: 1000", "X-KC-CDN-SITE-TYPE: global"})
    @GET("discover-front/trading/item/spot")
    @NotNull
    /* JADX INFO: renamed from: v */
    Observable<BaseEntity<MarketListEntityItem>> m102138v(@Nullable @Query("symbol") String str, @NotNull @Query("customizations") String str2);

    @FormUrlEncoded
    @POST("v1/trade/order-cancel")
    @NotNull
    /* JADX INFO: renamed from: w */
    Observable<BaseEntity<Object>> m102139w(@Field("tradeType") @Nullable String str, @Field("orderId") @Nullable String str2, @Field("symbol") @Nullable String str3, @Field("type") @Nullable String str4);

    @GET("v1/margin/liquidation/get-list")
    @NotNull
    /* JADX INFO: renamed from: x */
    Observable<BaseEntity<BasePageEntity<DelegationLiquidationEntity>>> m102140x(@QueryMap @NotNull HashMap<String, String> map);

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m102114d(InterfaceC46307h interfaceC46307h, String str, String str2, String str3, String str4, String str5, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketCoinInfo");
        }
        if ((i11 & 16) != 0) {
            str5 = "APP";
        }
        return interfaceC46307h.m102130n(str, str2, str3, str4, str5, continuation);
    }

    /* JADX INFO: renamed from: f */
    static /* synthetic */ Object m102115f(InterfaceC46307h interfaceC46307h, String str, String str2, Continuation continuation, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiscoverDetailTags");
        }
        if ((i11 & 2) != 0) {
            str2 = AllCouponsItemModel.UNAVAILABLE_REASON_SYMBOL;
        }
        return interfaceC46307h.m102127k(str, str2, continuation);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ Observable m102116h(InterfaceC46307h interfaceC46307h, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBookList");
        }
        if ((i11 & 2) != 0) {
            str2 = "50";
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return interfaceC46307h.m102121b(str, str2, str3);
    }

    /* JADX INFO: renamed from: y */
    static /* synthetic */ Observable m102117y(InterfaceC46307h interfaceC46307h, HashMap map, boolean z11, boolean z12, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTradeOrdersV2");
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        return interfaceC46307h.m102123e(map, z11, z12);
    }

    /* JADX INFO: renamed from: z */
    static /* synthetic */ Observable m102118z(InterfaceC46307h interfaceC46307h, String str, String str2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiscoverTradeDataBySymbols");
        }
        if ((i11 & 2) != 0) {
            str2 = "UserFavorites,PriceWarn,SymbolLabel";
        }
        return interfaceC46307h.m102138v(str, str2);
    }
}
