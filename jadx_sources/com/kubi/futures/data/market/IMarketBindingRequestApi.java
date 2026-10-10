package com.kubi.futures.data.market;

import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.PriceAggregationEntity;
import com.kubi.kumex.data.market.model.PricesSymbolsReqInfo;
import hr.C38293f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: renamed from: com.kubi.futures.data.market.r, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketBindingRequest.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/market/IMarketBindingRequestApi;", "", "getFundingRate", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "symbol", "", "getAggregationPrices", "", "Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;", "symbols", "Lcom/kubi/kumex/data/market/model/PricesSymbolsReqInfo;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarketBindingRequestApi {
    @POST("v1/km/marketInfo")
    @NotNull
    /* JADX INFO: renamed from: a */
    C38293f<List<PriceAggregationEntity>> m24857a(@Body @NotNull PricesSymbolsReqInfo pricesSymbolsReqInfo) throws Throwable;

    @GET("v1/kumex-market/latest-ticker")
    @NotNull
    /* JADX INFO: renamed from: b */
    C38293f<FundingRateEntity> m24858b(@NotNull @Query("symbol") String str) throws Throwable;
}
