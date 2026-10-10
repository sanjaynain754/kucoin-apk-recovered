package com.kubi.market.monitor.lib.p100ui.floating.setting;

import com.kubi.data.entity.TradeItemBean;
import com.kubi.mvi.state.InterfaceC19282d;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatWindowSettingContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/SortIntent;", "Lcom/kubi/mvi/state/IIntent;", "list", "", "Lcom/kubi/data/entity/TradeItemBean;", "<init>", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SortIntent implements InterfaceC19282d {

    @NotNull
    private final List<TradeItemBean> list;

    /* JADX WARN: Multi-variable type inference failed */
    public SortIntent(@NotNull List<? extends TradeItemBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.list = list;
    }

    @NotNull
    public final List<TradeItemBean> getList() {
        return this.list;
    }
}
