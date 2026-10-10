package ge;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.core.spot.entity.MarginSymbol;
import com.kubi.core.spot.entity.NFTEntity;
import com.kubi.core.spot.entity.OrderBookCenterEntity;
import com.kubi.data.entity.OrderBookEntity;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.SymbolPreviewEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.sdk.base.entity.BaseEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

/* JADX INFO: renamed from: ge.b */
/* JADX INFO: compiled from: MarketApi.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'J6\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH'J \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00040\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH'J0\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00040\u00032\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0012\u001a\u00020\bH'J&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000f0\u00040\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH'J \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\bH'J:\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\b\u0003\u0010\u001a\u001a\u00020\b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\bH'JL\u0010\u001c\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001d0\u000f0\u00040\u00032\b\b\u0001\u0010\u001e\u001a\u00020\b2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u001a\u001a\u00020\b2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\bH'J6\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00040\u00032\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\"\u001a\u00020\b2\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\bH'J2\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00040\u00032\b\b\u0001\u0010\r\u001a\u00020\b2\b\b\u0001\u0010&\u001a\u00020\b2\b\b\u0001\u0010'\u001a\u00020\bH'J\u001e\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00040\u00032\b\b\u0001\u0010*\u001a\u00020\bH'J\u001a\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0,0\u00040\u0003H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/core/spot/api/MarketApi;", "", "requestOcoOder", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "Lcom/kubi/core/spot/entity/OrderResultEntity;", "stringStringMap", "", "", "fingerEvent", "requestTsoOder", "getOrderBookCenter", "Lcom/kubi/core/spot/entity/OrderBookCenterEntity;", "symbol", "getTradeDataBySymbols", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/TradeItemBean;", "symbols", "from", "getSymbolsInfo", "Lcom/kubi/data/entity/SymbolInfoEntity;", "addFavorSymbol", "checkValidationCode", "Lcom/kubi/data/entity/CheckCodeResultEntity;", "checkCodeParamsEntity", "Lcom/kubi/data/entity/CheckCodeParamsEntity;", "header", "fingerId", "getCheckRequiredValidation", "", "bizType", "loginToken", "getOrderBookList", "Lcom/kubi/data/entity/OrderBookEntity;", TUIConstants.TUIContact.LIMIT, "precision", "getPreviewInfo", "Lcom/kubi/data/entity/SymbolPreviewEntity;", FirebaseAnalytics.Param.CURRENCY, "lang", "getNftInfo", "Lcom/kubi/core/spot/entity/NFTEntity;", "symbolName", "getMarginSymbols", "", "Lcom/kubi/core/spot/entity/MarginSymbol;", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface InterfaceC37872b {
    @Headers({"Cache-Time: 1000", "SELF-UA: true"})
    @GET("v1/market/symbol")
    @NotNull
    /* JADX INFO: renamed from: a */
    Observable<BaseEntity<ArrayList<TradeItemBean>>> m85491a(@Nullable @Query("symbols") String str, @Header("User-Agent") @NotNull String str2);

    @GET("v1/market/orderbook-level2")
    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<BaseEntity<OrderBookEntity>> m85492b(@Nullable @Query("symbol") String str, @NotNull @Query(TUIConstants.TUIContact.LIMIT) String str2, @Nullable @Query("precision") String str3);

    @GET("v1/symbols")
    @NotNull
    /* JADX INFO: renamed from: c */
    Observable<BaseEntity<ArrayList<SymbolInfoEntity>>> m85493c(@Nullable @Query("symbols") String str);

    @GET("v1/symbol/previewInfo")
    @NotNull
    /* JADX INFO: renamed from: d */
    Observable<BaseEntity<SymbolPreviewEntity>> m85494d(@NotNull @Query("symbol") String str, @NotNull @Query(FirebaseAnalytics.Param.CURRENCY) String str2, @NotNull @Query("lang") String str3);

    @GET("v1/market/orderbook-level1")
    @NotNull
    /* JADX INFO: renamed from: g */
    Observable<BaseEntity<OrderBookCenterEntity>> m85495g(@Nullable @Query("symbol") String str);

    @GET("v1/symbol/loan-symbols")
    @NotNull
    /* JADX INFO: renamed from: h */
    Observable<BaseEntity<List<MarginSymbol>>> m85496h();

    @GET("v1/kc/token/symbol")
    @NotNull
    /* JADX INFO: renamed from: r */
    Observable<BaseEntity<NFTEntity>> m85497r(@NotNull @Query("symbolName") String str);

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Observable m85490e(InterfaceC37872b interfaceC37872b, String str, String str2, String str3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getOrderBookList");
        }
        if ((i11 & 2) != 0) {
            str2 = "50";
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        return interfaceC37872b.m85492b(str, str2, str3);
    }
}
