package com.kubi.futures.data.market;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.kumex.data.market.model.MexCurrencyIconUrlEntity;
import com.kubi.kumex.data.market.model.PriceEntity;
import com.kubi.kumex.data.market.model.QuotesEntity;
import com.kubi.kumex.data.market.model.TickerEntity;
import com.kubi.kumex.market.p091v2.coinInfo.entity.MarketCoinInfo;
import com.kubi.kumex.market.p091v2.coinInfo.entity.TagEntity;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.tradingbotkit.model.AllCouponsItemModel;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.futures.data.market.q, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'J\u0012\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'J\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00042\b\b\u0003\u0010\u0012\u001a\u00020\u0004H'J<\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0015\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u00042\b\b\u0003\u0010\u0018\u001a\u00020\u0004H'J(\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aj\n\u0012\u0004\u0012\u00020\u001b\u0018\u0001`\u001c2\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004H'J&\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f0\u001e2\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0004H'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006#À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/market/IMarketApi;", "", "fetchContractMaxMinPrice", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "symbol", "fetchPrice", "Lcom/kubi/kumex/data/market/model/PriceEntity;", "getTicker", "Lokhttp3/Request;", "fetchTicker", "Lcom/kubi/kumex/data/market/model/TickerEntity;", "fetchMexCurrencyIconUrl", "Lcom/kubi/kumex/data/market/model/MexCurrencyIconUrlEntity;", "getDiscoverDetailTags", "Lcom/kubi/kumex/market/v2/coinInfo/entity/TagEntity;", "item", "type", "getMarketCoinInfo", "Lcom/kubi/kumex/market/v2/coinInfo/entity/MarketCoinInfo;", FirebaseAnalytics.Param.CURRENCY, "legalCurrency", "lang", "source", "getSymbolsInfo", "Ljava/util/ArrayList;", "Lcom/kubi/data/entity/SymbolInfoEntity;", "Lkotlin/collections/ArrayList;", "fetchQuotesListBySymbolsForDistribution", "Lio/reactivex/Observable;", "Lcom/kubi/sdk/base/entity/BaseEntity;", "", "Lcom/kubi/kumex/data/market/model/QuotesEntity;", "symbols", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarketApi {
    @GET("v1/symbols")
    @Nullable
    /* JADX INFO: renamed from: c */
    ArrayList<SymbolInfoEntity> mo24803c(@Nullable @Query("symbols") String str) throws Throwable;

    @GET("v1/kumex-market/latest-ticker")
    @NotNull
    /* JADX INFO: renamed from: i */
    Request mo24809i(@NotNull @Query("symbol") String str);

    @GET("v1/kumex-market/market/list")
    @NotNull
    /* JADX INFO: renamed from: n */
    Observable<BaseEntity<List<QuotesEntity>>> mo24812n(@Nullable @Query("symbols") String str) throws Throwable;

    @GET("v1/discover/item/tag")
    @Nullable
    /* JADX INFO: renamed from: q */
    TagEntity mo24816q(@NotNull @Query("item") String str, @NotNull @Query("type") String str2) throws Throwable;

    @GET("v1/kumex-contract/contract-info")
    @Nullable
    /* JADX INFO: renamed from: r */
    MexCurrencyIconUrlEntity mo24818r(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/kumex-index/index-price")
    @NotNull
    /* JADX INFO: renamed from: s */
    PriceEntity mo24820s(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/kumex-market/latest-ticker")
    @Nullable
    /* JADX INFO: renamed from: t */
    TickerEntity mo24822t(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/kumex-trade/orders/price-limit")
    @NotNull
    /* JADX INFO: renamed from: v */
    HashMap<String, String> mo24826v(@NotNull @Query("symbol") String str) throws Throwable;

    @GET("v1/quick-silver/universe-currency/symbols/info/{currency}")
    @Nullable
    /* JADX INFO: renamed from: w */
    MarketCoinInfo mo24828w(@Path(FirebaseAnalytics.Param.CURRENCY) @NotNull String str, @NotNull @Query("symbol") String str2, @NotNull @Query("legalCurrency") String str3, @NotNull @Query("lang") String str4, @NotNull @Query("source") String str5) throws Throwable;

    /* JADX INFO: renamed from: j */
    static /* synthetic */ TagEntity m24855j(IMarketApi iMarketApi, String str, String str2, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDiscoverDetailTags");
        }
        if ((i11 & 2) != 0) {
            str2 = AllCouponsItemModel.UNAVAILABLE_REASON_SYMBOL;
        }
        return iMarketApi.mo24816q(str, str2);
    }

    /* JADX INFO: renamed from: k */
    static /* synthetic */ MarketCoinInfo m24856k(IMarketApi iMarketApi, String str, String str2, String str3, String str4, String str5, int i11, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMarketCoinInfo");
        }
        if ((i11 & 16) != 0) {
            str5 = "APP";
        }
        return iMarketApi.mo24828w(str, str2, str3, str4, str5);
    }
}
