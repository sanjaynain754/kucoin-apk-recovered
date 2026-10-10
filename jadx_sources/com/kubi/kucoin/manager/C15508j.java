package com.kubi.kucoin.manager;

import com.futures.tradebiz.core.model.p063pb.TradeStatisticsPb;
import com.kubi.data.entity.WsFutureSnapshotEntity;
import com.kubi.network.restful.C19321b;
import er.C37237b;
import gr.C38000b;
import gr.C38003e;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.kucoin.manager.j */
/* JADX INFO: compiled from: MarketFutureContractPbWsApi.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m90084d2 = {"FUTURE_SNAPSHORT_PB_PREFIX", "", "buildMarketSnapshotV2PbWsApi", "Lcom/kubi/kucoin/manager/IMarketSnapShortPbWsApi;", "toWsFutureSnapshotEntity", "Lcom/kubi/data/entity/WsFutureSnapshotEntity;", "Lcom/futures/tradebiz/core/model/pb/TradeStatisticsPb;", "LDataProvider_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C15508j {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final IMarketSnapShortPbWsApi m32610a() {
        return (IMarketSnapShortPbWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83279b())).m42778c(new C38003e()).m42776a().m42772b(IMarketSnapShortPbWsApi.class);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final WsFutureSnapshotEntity m32611b(@NotNull TradeStatisticsPb tradeStatisticsPb) {
        double d11;
        double dDoubleValue;
        Intrinsics.checkNotNullParameter(tradeStatisticsPb, "<this>");
        String symbol = tradeStatisticsPb.getSymbol();
        Intrinsics.checkNotNullExpressionValue(symbol, "getSymbol(...)");
        String volume = tradeStatisticsPb.getVolume();
        Intrinsics.checkNotNullExpressionValue(volume, "getVolume(...)");
        Double doubleOrNull = StringsKt.toDoubleOrNull(volume);
        double dDoubleValue2 = doubleOrNull != null ? doubleOrNull.doubleValue() : 0.0d;
        String turnover = tradeStatisticsPb.getTurnover();
        Intrinsics.checkNotNullExpressionValue(turnover, "getTurnover(...)");
        Double doubleOrNull2 = StringsKt.toDoubleOrNull(turnover);
        double dDoubleValue3 = doubleOrNull2 != null ? doubleOrNull2.doubleValue() : 0.0d;
        String lastPrice = tradeStatisticsPb.getLastPrice();
        Intrinsics.checkNotNullExpressionValue(lastPrice, "getLastPrice(...)");
        Double doubleOrNull3 = StringsKt.toDoubleOrNull(lastPrice);
        double dDoubleValue4 = doubleOrNull3 != null ? doubleOrNull3.doubleValue() : 0.0d;
        String lowPrice = tradeStatisticsPb.getLowPrice();
        Intrinsics.checkNotNullExpressionValue(lowPrice, "getLowPrice(...)");
        Double doubleOrNull4 = StringsKt.toDoubleOrNull(lowPrice);
        double dDoubleValue5 = doubleOrNull4 != null ? doubleOrNull4.doubleValue() : 0.0d;
        String highPrice = tradeStatisticsPb.getHighPrice();
        Intrinsics.checkNotNullExpressionValue(highPrice, "getHighPrice(...)");
        Double doubleOrNull5 = StringsKt.toDoubleOrNull(highPrice);
        double dDoubleValue6 = doubleOrNull5 != null ? doubleOrNull5.doubleValue() : 0.0d;
        String priceChg = tradeStatisticsPb.getPriceChg();
        Intrinsics.checkNotNullExpressionValue(priceChg, "getPriceChg(...)");
        Double doubleOrNull6 = StringsKt.toDoubleOrNull(priceChg);
        double dDoubleValue7 = doubleOrNull6 != null ? doubleOrNull6.doubleValue() : 0.0d;
        String priceChgPct = tradeStatisticsPb.getPriceChgPct();
        Intrinsics.checkNotNullExpressionValue(priceChgPct, "getPriceChgPct(...)");
        Double doubleOrNull7 = StringsKt.toDoubleOrNull(priceChgPct);
        if (doubleOrNull7 != null) {
            double d12 = dDoubleValue7;
            dDoubleValue = doubleOrNull7.doubleValue();
            d11 = d12;
        } else {
            d11 = dDoubleValue7;
            dDoubleValue = 0.0d;
        }
        return new WsFutureSnapshotEntity(symbol, dDoubleValue2, dDoubleValue3, dDoubleValue4, dDoubleValue5, dDoubleValue6, d11, dDoubleValue);
    }
}
