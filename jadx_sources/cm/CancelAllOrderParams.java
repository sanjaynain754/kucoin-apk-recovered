package cm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm.f, reason: from toString */
/* JADX INFO: compiled from: OrderParams.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "", "symbol", "", "fundsType", "includeStopOrders", "", "includeShortCutStopOrders", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getSymbol", "()Ljava/lang/String;", "getFundsType", "getIncludeStopOrders", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIncludeShortCutStopOrders", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/kumex/data/trade/model/CancelAllOrderParams;", "equals", "other", "hashCode", "", "toString", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class CancelAllOrderParams {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String fundsType;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Boolean includeStopOrders;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Boolean includeShortCutStopOrders;

    public CancelAllOrderParams(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.symbol = str;
        this.fundsType = str2;
        this.includeStopOrders = bool;
        this.includeShortCutStopOrders = bool2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CancelAllOrderParams)) {
            return false;
        }
        CancelAllOrderParams cancelAllOrderParams = (CancelAllOrderParams) other;
        return Intrinsics.areEqual(this.symbol, cancelAllOrderParams.symbol) && Intrinsics.areEqual(this.fundsType, cancelAllOrderParams.fundsType) && Intrinsics.areEqual(this.includeStopOrders, cancelAllOrderParams.includeStopOrders) && Intrinsics.areEqual(this.includeShortCutStopOrders, cancelAllOrderParams.includeShortCutStopOrders);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFundsType() {
        return this.fundsType;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getIncludeShortCutStopOrders() {
        return this.includeShortCutStopOrders;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Boolean getIncludeStopOrders() {
        return this.includeStopOrders;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fundsType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.includeStopOrders;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.includeShortCutStopOrders;
        return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CancelAllOrderParams(symbol=" + this.symbol + ", fundsType=" + this.fundsType + ", includeStopOrders=" + this.includeStopOrders + ", includeShortCutStopOrders=" + this.includeShortCutStopOrders + ')';
    }

    public /* synthetic */ CancelAllOrderParams(String str, String str2, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : bool, bool2);
    }
}
