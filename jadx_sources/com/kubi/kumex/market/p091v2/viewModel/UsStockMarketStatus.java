package com.kubi.kumex.market.p091v2.viewModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.kumex.market.v2.viewModel.c, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: MarketInfoViewModel.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/kumex/market/v2/viewModel/UsStockMarketStatus;", "", "isLowLiquidityPeriod", "", "marketSession", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getMarketSession", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UsStockMarketStatus {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean isLowLiquidityPeriod;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String marketSession;

    /* JADX WARN: Multi-variable type inference failed */
    public UsStockMarketStatus() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsStockMarketStatus)) {
            return false;
        }
        UsStockMarketStatus usStockMarketStatus = (UsStockMarketStatus) other;
        return this.isLowLiquidityPeriod == usStockMarketStatus.isLowLiquidityPeriod && Intrinsics.areEqual(this.marketSession, usStockMarketStatus.marketSession);
    }

    public UsStockMarketStatus(boolean z11, @Nullable String str) {
        this.isLowLiquidityPeriod = z11;
        this.marketSession = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getMarketSession() {
        return this.marketSession;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsLowLiquidityPeriod() {
        return this.isLowLiquidityPeriod;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLowLiquidityPeriod) * 31;
        String str = this.marketSession;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "UsStockMarketStatus(isLowLiquidityPeriod=" + this.isLowLiquidityPeriod + ", marketSession=" + this.marketSession + ')';
    }

    public /* synthetic */ UsStockMarketStatus(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str);
    }
}
