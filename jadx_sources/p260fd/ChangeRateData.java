package p260fd;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fd.c, reason: from toString */
/* JADX INFO: compiled from: ChangeRateData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/core/base/quote/data/ChangeRateData;", "", "symbol", "", "changeRate", "Ljava/math/BigDecimal;", "formatChangeRateV2", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "getChangeRate", "()Ljava/math/BigDecimal;", "getFormatChangeRateV2", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ChangeRateData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final BigDecimal changeRate;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final String formatChangeRateV2;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeRateData)) {
            return false;
        }
        ChangeRateData changeRateData = (ChangeRateData) other;
        return Intrinsics.areEqual(this.symbol, changeRateData.symbol) && Intrinsics.areEqual(this.changeRate, changeRateData.changeRate) && Intrinsics.areEqual(this.formatChangeRateV2, changeRateData.formatChangeRateV2);
    }

    public ChangeRateData(@NotNull String symbol, @Nullable BigDecimal bigDecimal, @Nullable String str) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.symbol = symbol;
        this.changeRate = bigDecimal;
        this.formatChangeRateV2 = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = this.symbol.hashCode() * 31;
        BigDecimal bigDecimal = this.changeRate;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.formatChangeRateV2;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChangeRateData(symbol=" + this.symbol + ", changeRate=" + this.changeRate + ", formatChangeRateV2=" + this.formatChangeRateV2 + ')';
    }
}
