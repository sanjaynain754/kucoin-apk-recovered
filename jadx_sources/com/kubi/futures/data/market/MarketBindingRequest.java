package com.kubi.futures.data.market;

import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.PriceAggregationEntity;
import com.kubi.kumex.data.market.model.PricesSymbolsReqInfo;
import hr.C38290c;
import hr.C38293f;
import java.util.List;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.futures.data.market.x, reason: from Kotlin metadata */
/* JADX INFO: compiled from: MarketBindingRequest.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\f2\u0006\u0010\u0013\u001a\u00020\u0014R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/futures/data/market/MarketBindingRequest;", "", "<init>", "()V", "api", "Lcom/kubi/futures/data/market/IMarketBindingRequestApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/futures/data/market/IMarketBindingRequestApi;", "api$delegate", "Lkotlin/Lazy;", "getFundingRate", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "symbol", "", "getAggregationPrices", "", "Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;", "symbols", "Lcom/kubi/kumex/data/market/model/PricesSymbolsReqInfo;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class MarketBindingRequest {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f22736a = LazyKt.lazy(new Function0() { // from class: com.kubi.futures.data.market.w
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MarketBindingRequest.m24870b();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final IMarketBindingRequestApi m24870b() {
        return (IMarketBindingRequestApi) C38290c.m86420a(C42597a.f94305a).create(IMarketBindingRequestApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final C38293f<List<PriceAggregationEntity>> m24871c(@NotNull PricesSymbolsReqInfo symbols) {
        Intrinsics.checkNotNullParameter(symbols, "symbols");
        return m24872d().m24857a(symbols);
    }

    /* JADX INFO: renamed from: d */
    public final IMarketBindingRequestApi m24872d() {
        return (IMarketBindingRequestApi) this.f22736a.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final C38293f<FundingRateEntity> m24873e(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return m24872d().m24858b(symbol);
    }
}
