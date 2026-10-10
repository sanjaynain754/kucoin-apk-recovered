package com.kubi.kumex.market.p091v2.viewModel;

import com.kubi.kumex.data.platform.model.NasdaqMarketStatusEntity;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.kumex.market.v2.viewModel.b */
/* JADX INFO: compiled from: MarketInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m90084d2 = {"toUsStockMarketStatus", "Lcom/kubi/kumex/market/v2/viewModel/UsStockMarketStatus;", "Lcom/kubi/kumex/data/platform/model/NasdaqMarketStatusEntity;", "KumexLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C16509b {
    /* JADX INFO: renamed from: b */
    public static final UsStockMarketStatus m35127b(NasdaqMarketStatusEntity nasdaqMarketStatusEntity) {
        return new UsStockMarketStatus(nasdaqMarketStatusEntity.isLowLiquidityPeriod(), nasdaqMarketStatusEntity.getMarketSession());
    }
}
