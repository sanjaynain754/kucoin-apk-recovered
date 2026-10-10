package com.kubi.market.monitor.lib.p100ui.floating.window;

import com.kubi.market.monitor.lib.entity.StateTradeItemBean;
import com.kubi.mvi.state.InterfaceC19284f;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.market.monitor.lib.ui.floating.window.FloatingWindowContract$FloatingWindowState, reason: from toString */
/* JADX INFO: compiled from: FloatingWindowContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowState;", "Lcom/kubi/mvi/state/IState;", "dataList", "", "Lcom/kubi/market/monitor/lib/entity/StateTradeItemBean;", "pageSize", "", "<init>", "(Ljava/util/List;I)V", "getDataList", "()Ljava/util/List;", "getPageSize", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FloatingWindowState implements InterfaceC19284f {

    @NotNull
    private final List<StateTradeItemBean> dataList;
    private final int pageSize;

    /* JADX WARN: Multi-variable type inference failed */
    public FloatingWindowState() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloatingWindowState)) {
            return false;
        }
        FloatingWindowState floatingWindowState = (FloatingWindowState) other;
        return Intrinsics.areEqual(this.dataList, floatingWindowState.dataList) && this.pageSize == floatingWindowState.pageSize;
    }

    public FloatingWindowState(@NotNull List<StateTradeItemBean> dataList, int i11) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.dataList = dataList;
        this.pageSize = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FloatingWindowState copy$default(FloatingWindowState floatingWindowState, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = floatingWindowState.dataList;
        }
        if ((i12 & 2) != 0) {
            i11 = floatingWindowState.pageSize;
        }
        return floatingWindowState.copy(list, i11);
    }

    @NotNull
    public final FloatingWindowState copy(@NotNull List<StateTradeItemBean> dataList, int pageSize) {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        return new FloatingWindowState(dataList, pageSize);
    }

    @NotNull
    public final List<StateTradeItemBean> getDataList() {
        return this.dataList;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        return (this.dataList.hashCode() * 31) + Integer.hashCode(this.pageSize);
    }

    @NotNull
    public String toString() {
        return "FloatingWindowState(dataList=" + this.dataList + ", pageSize=" + this.pageSize + ')';
    }

    public /* synthetic */ FloatingWindowState(List list, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? CollectionsKt.emptyList() : list, (i12 & 2) != 0 ? 0 : i11);
    }
}
