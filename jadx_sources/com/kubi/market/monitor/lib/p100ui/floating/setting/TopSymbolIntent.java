package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/TopSymbolIntent;", "Lcom/kubi/mvi/state/IIntent;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class TopSymbolIntent implements InterfaceC19282d {

    @NotNull
    private final String symbol;

    public TopSymbolIntent(@NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }
}
