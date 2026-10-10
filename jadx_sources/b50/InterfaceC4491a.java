package b50;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.tradingbotkit.entity.MarketsEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: b50.a */
/* JADX INFO: compiled from: MarketApi.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0003H'JD\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\tH'J6\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\u0014\b\u0001\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\tH'J0\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00040\u00032\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0014\u001a\u00020\tH'J0\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u00040\u00032\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0014\u001a\u00020\tH'J&\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u00040\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\tH'J \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\tH'J \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\tH'J.\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00050\u00040\u00032\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0003\u0010\u001f\u001a\u00020\tH'J@\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0!0\u00050\u00040\u00032\b\b\u0001\u0010\"\u001a\u00020\t2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010\u001f\u001a\u00020\tH'J6\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00040\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0003\u0010&\u001a\u00020\t2\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\tH'J2\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010*\u001a\u00020\t2\b\b\u0001\u0010+\u001a\u00020\tH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/spot/market/api/MarketApi;", "", "getQuotes", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Ljava/util/ArrayList;", "Lcom/kubi/tradingbotkit/entity/MarketsEntity;", "cancelTradeOder", "tradeType", "", "orderId", "symbol", "type", "requestTradeOder", "stringStringMap", "", "fingerEvent", "getTradeDataBySymbols", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "from", "getMarketSymbol", "quotes", "getSymbolsInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "addFavorSymbol", "stickSymbol", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "header", "getCheckRequiredValidation", "", "bizType", "loginToken", "getOrderBookList", "Lcom/kubi/data/entity/OrderBookEntity;", TUIConstants.TUIContact.LIMIT, "precision", "getPreviewInfo", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC4491a {
    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m4289a(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @FormUrlEncoded
    @POST("v2/chameleon/user/collect/spot")
    @NotNull
    Observable<BaseEntity<Object>> addFavorSymbol(@Field("symbols") @Nullable String symbol);

    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    Observable<BaseEntity<ArrayList<TradeItemBean>>> getMarketSymbol(@Nullable @Query("quote") String quotes, @Header("User-Agent") @NotNull String from);

    @GET("v1/markets")
    @NotNull
    /* JADX INFO: renamed from: q */
    Observable<BaseEntity<ArrayList<MarketsEntity>>> m4290q();
}
