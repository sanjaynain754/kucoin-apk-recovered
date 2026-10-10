package com.kubi.core.biz.symbolbarold;

import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.symbolbarold.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: SymbolBarContract.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\r¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/core/biz/symbolbarold/LeverConfig;", "", "symbol", "", "isShow", "", "lever", "Ljava/math/BigDecimal;", "isIsolatedEnable", "<init>", "(Ljava/lang/String;ZLjava/math/BigDecimal;Z)V", "getSymbol", "()Ljava/lang/String;", "()Z", "getLever", "()Ljava/math/BigDecimal;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverConfig {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String symbol;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final boolean isShow;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final BigDecimal lever;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final boolean isIsolatedEnable;

    public LeverConfig() {
        this(null, false, null, false, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverConfig)) {
            return false;
        }
        LeverConfig leverConfig = (LeverConfig) other;
        return Intrinsics.areEqual(this.symbol, leverConfig.symbol) && this.isShow == leverConfig.isShow && Intrinsics.areEqual(this.lever, leverConfig.lever) && this.isIsolatedEnable == leverConfig.isIsolatedEnable;
    }

    public LeverConfig(@NotNull String symbol, boolean z11, @NotNull BigDecimal lever, boolean z12) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(lever, "lever");
        this.symbol = symbol;
        this.isShow = z11;
        this.lever = lever;
        this.isIsolatedEnable = z12;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final BigDecimal getLever() {
        return this.lever;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    public int hashCode() {
        return (((((this.symbol.hashCode() * 31) + Boolean.hashCode(this.isShow)) * 31) + this.lever.hashCode()) * 31) + Boolean.hashCode(this.isIsolatedEnable);
    }

    @NotNull
    public String toString() {
        return "LeverConfig(symbol=" + this.symbol + ", isShow=" + this.isShow + ", lever=" + this.lever + ", isIsolatedEnable=" + this.isIsolatedEnable + ')';
    }

    public /* synthetic */ LeverConfig(String str, boolean z11, BigDecimal bigDecimal, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? new BigDecimal("10") : bigDecimal, (i11 & 8) != 0 ? false : z12);
    }
}
