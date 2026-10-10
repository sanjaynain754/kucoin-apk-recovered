package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.mvi.state.InterfaceC19282d;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/FloatingWindowFiatPriceSwitchIntent;", "Lcom/kubi/mvi/state/IIntent;", "switch", "", "<init>", "(Z)V", "getSwitch", "()Z", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FloatingWindowFiatPriceSwitchIntent implements InterfaceC19282d {
    private final boolean switch;

    public final boolean getSwitch() {
        return this.switch;
    }

    public FloatingWindowFiatPriceSwitchIntent(boolean z11) {
        this.switch = z11;
    }
}
