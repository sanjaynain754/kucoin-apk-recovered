package com.kubi.market.monitor.lib.p100ui.floating.window;

import com.kubi.mvi.state.InterfaceC19282d;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FloatingWindowContract.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "Lcom/kubi/mvi/state/IIntent;", "<init>", "()V", "InitFloating", "AddOrRemoveDataIntent", "SortListDataIntent", "DataUpdateIntervalTimeIntent", "PageStateIntent", "UpdateSpanRowIntent", "AppBackgroundPollingMonitor", "OnDestroyIntent", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AddOrRemoveDataIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AppBackgroundPollingMonitor;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$DataUpdateIntervalTimeIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$InitFloating;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$OnDestroyIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$PageStateIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$SortListDataIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$UpdateSpanRowIntent;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class FloatingWindowContract$FloatingWindowIntent implements InterfaceC19282d {

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AddOrRemoveDataIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "symbolStr", "", "isAdd", "", "<init>", "(Ljava/lang/String;Z)V", "getSymbolStr", "()Ljava/lang/String;", "()Z", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class AddOrRemoveDataIntent extends FloatingWindowContract$FloatingWindowIntent {
        private final boolean isAdd;

        @NotNull
        private final String symbolStr;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddOrRemoveDataIntent(@NotNull String symbolStr, boolean z11) {
            super(null);
            Intrinsics.checkNotNullParameter(symbolStr, "symbolStr");
            this.symbolStr = symbolStr;
            this.isAdd = z11;
        }

        @NotNull
        public final String getSymbolStr() {
            return this.symbolStr;
        }

        /* JADX INFO: renamed from: isAdd, reason: from getter */
        public final boolean getIsAdd() {
            return this.isAdd;
        }
    }

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$AppBackgroundPollingMonitor;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "start", "", "<init>", "(Z)V", "getStart", "()Z", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class AppBackgroundPollingMonitor extends FloatingWindowContract$FloatingWindowIntent {
        private final boolean start;

        public AppBackgroundPollingMonitor(boolean z11) {
            super(null);
            this.start = z11;
        }

        public final boolean getStart() {
            return this.start;
        }
    }

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$DataUpdateIntervalTimeIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "<init>", "()V", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class DataUpdateIntervalTimeIntent extends FloatingWindowContract$FloatingWindowIntent {
        public DataUpdateIntervalTimeIntent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$InitFloating;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "<init>", "()V", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class InitFloating extends FloatingWindowContract$FloatingWindowIntent {
        public InitFloating() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$OnDestroyIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "<init>", "()V", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class OnDestroyIntent extends FloatingWindowContract$FloatingWindowIntent {
        public OnDestroyIntent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$PageStateIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "type", "", "<init>", "(I)V", "getType", "()I", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class PageStateIntent extends FloatingWindowContract$FloatingWindowIntent {
        private final int type;

        public PageStateIntent(int i11) {
            super(null);
            this.type = i11;
        }

        public final int getType() {
            return this.type;
        }
    }

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$SortListDataIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "<init>", "()V", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class SortListDataIntent extends FloatingWindowContract$FloatingWindowIntent {
        public SortListDataIntent() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: FloatingWindowContract.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent$UpdateSpanRowIntent;", "Lcom/kubi/market/monitor/lib/ui/floating/window/FloatingWindowContract$FloatingWindowIntent;", "pageSize", "", "<init>", "(I)V", "getPageSize", "()I", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class UpdateSpanRowIntent extends FloatingWindowContract$FloatingWindowIntent {
        private final int pageSize;

        public UpdateSpanRowIntent(int i11) {
            super(null);
            this.pageSize = i11;
        }

        public final int getPageSize() {
            return this.pageSize;
        }
    }

    public /* synthetic */ FloatingWindowContract$FloatingWindowIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FloatingWindowContract$FloatingWindowIntent() {
    }
}
