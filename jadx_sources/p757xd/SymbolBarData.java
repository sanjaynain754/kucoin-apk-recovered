package p757xd;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xd.c, reason: from toString */
/* JADX INFO: compiled from: SymbolBarData.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003Jj\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u000bHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001d¨\u0006-"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbar/SymbolBarData;", "", "symbol", "", "showSymbol", "changeRate", "Ljava/math/BigDecimal;", "changeRateEnable", "", "leverValue", "kLinePosition", "", "kLinePanelOpen", "smallKLineEnable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Integer;ZZ)V", "getSymbol", "()Ljava/lang/String;", "getShowSymbol", "getChangeRate", "()Ljava/math/BigDecimal;", "getChangeRateEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLeverValue", "getKLinePosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getKLinePanelOpen", "()Z", "getSmallKLineEnable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/lang/Integer;ZZ)Lcom/kubi/core/biz/symbolbar/SymbolBarData;", "equals", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolBarData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String showSymbol;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final BigDecimal changeRate;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Boolean changeRateEnable;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final BigDecimal leverValue;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final Integer kLinePosition;

    /* JADX INFO: renamed from: g, reason: from toString */
    public final boolean kLinePanelOpen;

    /* JADX INFO: renamed from: h, reason: from toString */
    public final boolean smallKLineEnable;

    public SymbolBarData() {
        this(null, null, null, null, null, null, false, false, 255, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolBarData)) {
            return false;
        }
        SymbolBarData symbolBarData = (SymbolBarData) other;
        return Intrinsics.areEqual(this.symbol, symbolBarData.symbol) && Intrinsics.areEqual(this.showSymbol, symbolBarData.showSymbol) && Intrinsics.areEqual(this.changeRate, symbolBarData.changeRate) && Intrinsics.areEqual(this.changeRateEnable, symbolBarData.changeRateEnable) && Intrinsics.areEqual(this.leverValue, symbolBarData.leverValue) && Intrinsics.areEqual(this.kLinePosition, symbolBarData.kLinePosition) && this.kLinePanelOpen == symbolBarData.kLinePanelOpen && this.smallKLineEnable == symbolBarData.smallKLineEnable;
    }

    public SymbolBarData(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal2, @Nullable Integer num, boolean z11, boolean z12) {
        this.symbol = str;
        this.showSymbol = str2;
        this.changeRate = bigDecimal;
        this.changeRateEnable = bool;
        this.leverValue = bigDecimal2;
        this.kLinePosition = num;
        this.kLinePanelOpen = z11;
        this.smallKLineEnable = z12;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ SymbolBarData m101707b(SymbolBarData symbolBarData, String str, String str2, BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, Integer num, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = symbolBarData.symbol;
        }
        if ((i11 & 2) != 0) {
            str2 = symbolBarData.showSymbol;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = symbolBarData.changeRate;
        }
        if ((i11 & 8) != 0) {
            bool = symbolBarData.changeRateEnable;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = symbolBarData.leverValue;
        }
        if ((i11 & 32) != 0) {
            num = symbolBarData.kLinePosition;
        }
        if ((i11 & 64) != 0) {
            z11 = symbolBarData.kLinePanelOpen;
        }
        if ((i11 & 128) != 0) {
            z12 = symbolBarData.smallKLineEnable;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        BigDecimal bigDecimal3 = bigDecimal2;
        Integer num2 = num;
        return symbolBarData.m101708a(str, str2, bigDecimal, bool, bigDecimal3, num2, z13, z14);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final SymbolBarData m101708a(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable Boolean bool, @Nullable BigDecimal bigDecimal2, @Nullable Integer num, boolean z11, boolean z12) {
        return new SymbolBarData(str, str2, bigDecimal, bool, bigDecimal2, num, z11, z12);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getChangeRateEnable() {
        return this.changeRateEnable;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getKLinePanelOpen() {
        return this.kLinePanelOpen;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getKLinePosition() {
        return this.kLinePosition;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final BigDecimal getLeverValue() {
        return this.leverValue;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getShowSymbol() {
        return this.showSymbol;
    }

    public int hashCode() {
        String str = this.symbol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.showSymbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.changeRate;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Boolean bool = this.changeRateEnable;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.leverValue;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Integer num = this.kLinePosition;
        return ((((iHashCode5 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.kLinePanelOpen)) * 31) + Boolean.hashCode(this.smallKLineEnable);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getSmallKLineEnable() {
        return this.smallKLineEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public String toString() {
        return "SymbolBarData(symbol=" + this.symbol + ", showSymbol=" + this.showSymbol + ", changeRate=" + this.changeRate + ", changeRateEnable=" + this.changeRateEnable + ", leverValue=" + this.leverValue + ", kLinePosition=" + this.kLinePosition + ", kLinePanelOpen=" + this.kLinePanelOpen + ", smallKLineEnable=" + this.smallKLineEnable + ')';
    }

    public /* synthetic */ SymbolBarData(String str, String str2, BigDecimal bigDecimal, Boolean bool, BigDecimal bigDecimal2, Integer num, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bigDecimal, (i11 & 8) != 0 ? Boolean.TRUE : bool, (i11 & 16) != 0 ? null : bigDecimal2, (i11 & 32) != 0 ? null : num, (i11 & 64) != 0 ? false : z11, (i11 & 128) != 0 ? true : z12);
    }
}
