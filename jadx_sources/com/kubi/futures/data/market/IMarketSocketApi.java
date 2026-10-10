package com.kubi.futures.data.market;

import com.kubi.kumex.data.market.model.FundingRateEntity;
import com.kubi.kumex.data.market.model.PriceAggregationEntity;
import com.kubi.network.api.subscribe.model.SubscribeMessage;
import hr.C38293f;
import hr.InterfaceC38288a;
import hr.InterfaceC38289b;
import hr.InterfaceC38292e;
import io.reactivex.Observable;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kr.InterfaceC41975c;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.futures.data.market.u, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IMarketSocketApi.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0016\b\u0001\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH&J@\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b2\b\b\u0003\u0010\t\u001a\u00020\u0010H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/futures/data/market/IMarketSocketApi;", "", "observeFundingRate", "Lio/reactivex/Observable;", "Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "topic", "", "periodFlow", "Lcom/kubi/network/api/subscribe/annotations/PeriodFlow;", "convert", "Lcom/kubi/network/restful/core/IConverter;", "Lcom/kubi/network/api/subscribe/model/SubscribeMessage;", "observePrices", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/kubi/kumex/data/market/model/PriceAggregationEntity;", "Lcom/kubi/futures/data/market/PriceAggregationConvert;", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IMarketSocketApi {
    @NotNull
    /* JADX INFO: renamed from: a */
    InterfaceC41634e<List<PriceAggregationEntity>> m24865a(@InterfaceC38288a @NotNull String str, @InterfaceC38289b(waitPeriodResult = true) @NotNull C38293f<List<PriceAggregationEntity>> c38293f, @InterfaceC38292e @NotNull PriceAggregationConvert priceAggregationConvert);

    @NotNull
    /* JADX INFO: renamed from: b */
    Observable<FundingRateEntity> m24866b(@InterfaceC38288a @NotNull String str, @InterfaceC38289b(waitPeriodResult = true) @NotNull C38293f<FundingRateEntity> c38293f, @InterfaceC38292e @NotNull InterfaceC41975c<SubscribeMessage, FundingRateEntity> interfaceC41975c);

    /* JADX INFO: renamed from: c */
    static /* synthetic */ InterfaceC41634e m24864c(IMarketSocketApi iMarketSocketApi, String str, C38293f c38293f, PriceAggregationConvert priceAggregationConvert, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: observePrices");
        }
        if ((i11 & 4) != 0) {
            priceAggregationConvert = new PriceAggregationConvert();
        }
        return iMarketSocketApi.m24865a(str, c38293f, priceAggregationConvert);
    }
}
