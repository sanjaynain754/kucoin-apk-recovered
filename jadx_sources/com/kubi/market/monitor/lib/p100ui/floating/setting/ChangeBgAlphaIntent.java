package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.mvi.state.InterfaceC19282d;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/ChangeBgAlphaIntent;", "Lcom/kubi/mvi/state/IIntent;", "type", "", "bgAlpha", "<init>", "(II)V", "getType", "()I", "getBgAlpha", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChangeBgAlphaIntent implements InterfaceC19282d {
    private final int bgAlpha;
    private final int type;

    public final int getBgAlpha() {
        return this.bgAlpha;
    }

    public final int getType() {
        return this.type;
    }

    public ChangeBgAlphaIntent(int i11, int i12) {
        this.type = i11;
        this.bgAlpha = i12;
    }
}
