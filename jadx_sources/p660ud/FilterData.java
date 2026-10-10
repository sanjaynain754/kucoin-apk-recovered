package p660ud;

import com.kubi.utils.TimeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ud.f0, reason: from toString */
/* JADX INFO: compiled from: MixAccountHistoryDelegationVM.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0013J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006%"}, m90084d2 = {"Lcom/kubi/core/biz/order/record/history/HistoryDelegationContract$FilterData;", "", "symbol", "", "status", "timeType", "side", "filterStatus", "orderType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getStatus", "getTimeType", "getSide", "getFilterStatus", "getOrderType", "getTimeRange", "Lkotlin/Pair;", "getStart", "beforeGet", "Lcom/kubi/utils/TimeUtils$BeforeGet;", "value", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FilterData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String status;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String timeType;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String side;

    /* JADX INFO: renamed from: e, reason: from toString */
    @NotNull
    public final String filterStatus;

    /* JADX INFO: renamed from: f, reason: from toString */
    @NotNull
    public final String orderType;

    public FilterData() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FilterData)) {
            return false;
        }
        FilterData filterData = (FilterData) other;
        return Intrinsics.areEqual(this.symbol, filterData.symbol) && Intrinsics.areEqual(this.status, filterData.status) && Intrinsics.areEqual(this.timeType, filterData.timeType) && Intrinsics.areEqual(this.side, filterData.side) && Intrinsics.areEqual(this.filterStatus, filterData.filterStatus) && Intrinsics.areEqual(this.orderType, filterData.orderType);
    }

    public FilterData(@NotNull String symbol, @NotNull String status, @NotNull String timeType, @NotNull String side, @NotNull String filterStatus, @NotNull String orderType) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(filterStatus, "filterStatus");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        this.symbol = symbol;
        this.status = status;
        this.timeType = timeType;
        this.side = side;
        this.filterStatus = filterStatus;
        this.orderType = orderType;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ FilterData m99818b(FilterData filterData, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = filterData.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = filterData.status;
        }
        if ((i11 & 4) != 0) {
            str3 = filterData.timeType;
        }
        if ((i11 & 8) != 0) {
            str4 = filterData.side;
        }
        if ((i11 & 16) != 0) {
            str5 = filterData.filterStatus;
        }
        if ((i11 & 32) != 0) {
            str6 = filterData.orderType;
        }
        String str7 = str5;
        String str8 = str6;
        return filterData.m99819a(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final FilterData m99819a(@NotNull String symbol, @NotNull String status, @NotNull String timeType, @NotNull String side, @NotNull String filterStatus, @NotNull String orderType) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(timeType, "timeType");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter(filterStatus, "filterStatus");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return new FilterData(symbol, status, timeType, side, filterStatus, orderType);
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFilterStatus() {
        return this.filterStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOrderType() {
        return this.orderType;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (((((((((this.symbol.hashCode() * 31) + this.status.hashCode()) * 31) + this.timeType.hashCode()) * 31) + this.side.hashCode()) * 31) + this.filterStatus.hashCode()) * 31) + this.orderType.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public final Pair<String, String> m99826i() {
        TimeUtils.C27004b c27004b = new TimeUtils.C27004b();
        return new Pair<>(m99823f(c27004b, this.timeType), c27004b.f54265b);
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTimeType() {
        return this.timeType;
    }

    @NotNull
    public String toString() {
        return "FilterData(symbol=" + this.symbol + ", status=" + this.status + ", timeType=" + this.timeType + ", side=" + this.side + ", filterStatus=" + this.filterStatus + ", orderType=" + this.orderType + ')';
    }

    /* JADX INFO: renamed from: f */
    public final String m99823f(TimeUtils.C27004b c27004b, String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1480287667) {
            if (iHashCode != -170154913) {
                if (iHashCode == 1346794279 && str.equals("ONE_MONTH")) {
                    return String.valueOf(c27004b.m66434a(30, 6));
                }
                return "";
            }
            if (str.equals("THREE_MONTH")) {
                return String.valueOf(c27004b.m66434a(90, 6));
            }
            return "";
        }
        if (str.equals("ONE_WEEK")) {
            return String.valueOf(c27004b.m66434a(7, 6));
        }
        return "";
    }

    public /* synthetic */ FilterData(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "done" : str2, (i11 & 4) != 0 ? "THREE_MONTH" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6);
    }
}
