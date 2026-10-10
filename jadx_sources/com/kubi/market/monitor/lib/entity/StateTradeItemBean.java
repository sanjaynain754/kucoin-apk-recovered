package com.kubi.market.monitor.lib.entity;

import androidx.annotation.Keep;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.data.entity.WsMarketSnapshotEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StateTradeItemBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0000J\u0006\u0010\u0014\u001a\u00020\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "()V", "lastDealPriceStateChange", "", "getLastDealPriceStateChange", "()I", "setLastDealPriceStateChange", "(I)V", "equals", "", "other", "", "updateInfo", "", "Lcom/kubi/data/entity/WsMarketSnapshotEntity;", "getBean", "getNewInfo", "otherBean", "logString", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class StateTradeItemBean extends TradeItemBean {
    private int lastDealPriceStateChange;

    @Override // com.kubi.data.entity.TradeItemBean
    public boolean equals(@Nullable Object other) {
        if (!(other instanceof TradeItemBean)) {
            return this == other;
        }
        TradeItemBean tradeItemBean = (TradeItemBean) other;
        return Intrinsics.areEqual(tradeItemBean.getSymbol(), getSymbol()) && tradeItemBean.getLastDealPrice() == getLastDealPrice() && Intrinsics.areEqual(tradeItemBean.getChangeRate(), getChangeRate());
    }

    @NotNull
    public final StateTradeItemBean getBean(@NotNull WsMarketSnapshotEntity other) {
        Intrinsics.checkNotNullParameter(other, "other");
        StateTradeItemBean stateTradeItemBean = new StateTradeItemBean();
        stateTradeItemBean.setSymbol(other.getSymbolCode());
        stateTradeItemBean.setLastDealPrice(other.getLastTradedPrice());
        stateTradeItemBean.setChangeRate(Double.valueOf(other.getChangeRate()));
        stateTradeItemBean.setValue(other.getVolValue());
        return stateTradeItemBean;
    }

    public final int getLastDealPriceStateChange() {
        return this.lastDealPriceStateChange;
    }

    @NotNull
    public final StateTradeItemBean getNewInfo(@Nullable StateTradeItemBean otherBean) {
        if (otherBean == null || !Intrinsics.areEqual(otherBean.getSymbol(), getSymbol())) {
            return this;
        }
        StateTradeItemBean stateTradeItemBean = new StateTradeItemBean();
        stateTradeItemBean.setSymbol(otherBean.getSymbol());
        stateTradeItemBean.setLastDealPrice(otherBean.getLastDealPrice());
        stateTradeItemBean.setChangeRate(otherBean.getChangeRate());
        stateTradeItemBean.setValue(otherBean.getValue());
        return stateTradeItemBean;
    }

    @NotNull
    public final String logString() {
        return "bean={changeRate=" + getChangeRate() + ", lastDealPrice=" + getLastDealPrice() + ", symbol='" + getSymbol() + "', value=" + getValue() + ", mark=" + getMark() + ", showSymbol='" + getShowSymbol() + "'}";
    }

    public final void setLastDealPriceStateChange(int i11) {
        this.lastDealPriceStateChange = i11;
    }

    public final void updateInfo(@NotNull WsMarketSnapshotEntity other) {
        Intrinsics.checkNotNullParameter(other, "other");
        setSymbol(other.getSymbolCode());
        setLastDealPrice(other.getLastTradedPrice());
        setChangeRate(Double.valueOf(other.getChangeRate()));
        setValue(other.getVolValue());
    }
}
