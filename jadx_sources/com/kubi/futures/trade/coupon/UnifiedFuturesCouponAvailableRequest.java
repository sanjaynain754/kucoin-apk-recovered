package com.kubi.futures.trade.coupon;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedFuturesCoupon.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableRequest;", "", "prizeType", "", "symbol", "", "<init>", "(ILjava/lang/String;)V", "getPrizeType", "()I", "getSymbol", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedFuturesCouponAvailableRequest {

    @SerializedName("prizeType")
    private final int prizeType;

    @SerializedName("symbol")
    @NotNull
    private final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedFuturesCouponAvailableRequest)) {
            return false;
        }
        UnifiedFuturesCouponAvailableRequest unifiedFuturesCouponAvailableRequest = (UnifiedFuturesCouponAvailableRequest) other;
        return this.prizeType == unifiedFuturesCouponAvailableRequest.prizeType && Intrinsics.areEqual(this.symbol, unifiedFuturesCouponAvailableRequest.symbol);
    }

    public UnifiedFuturesCouponAvailableRequest(int i11, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.prizeType = i11;
        this.symbol = symbol;
    }

    public static /* synthetic */ UnifiedFuturesCouponAvailableRequest copy$default(UnifiedFuturesCouponAvailableRequest unifiedFuturesCouponAvailableRequest, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = unifiedFuturesCouponAvailableRequest.prizeType;
        }
        if ((i12 & 2) != 0) {
            str = unifiedFuturesCouponAvailableRequest.symbol;
        }
        return unifiedFuturesCouponAvailableRequest.copy(i11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPrizeType() {
        return this.prizeType;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    public final UnifiedFuturesCouponAvailableRequest copy(int prizeType, @NotNull String symbol) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        return new UnifiedFuturesCouponAvailableRequest(prizeType, symbol);
    }

    public final int getPrizeType() {
        return this.prizeType;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return (Integer.hashCode(this.prizeType) * 31) + this.symbol.hashCode();
    }

    @NotNull
    public String toString() {
        return "UnifiedFuturesCouponAvailableRequest(prizeType=" + this.prizeType + ", symbol=" + this.symbol + ')';
    }
}
