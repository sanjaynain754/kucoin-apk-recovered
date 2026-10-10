package com.kubi.margin.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginEntity.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, m90084d2 = {"Lcom/kubi/margin/entity/WsBalance;", "", "hold", "Ljava/math/BigDecimal;", "liabilityInterest", "liabilityPrincipal", "total", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getHold", "()Ljava/math/BigDecimal;", "getLiabilityInterest", "getLiabilityPrincipal", "getTotal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsBalance {

    @Nullable
    private final BigDecimal hold;

    @Nullable
    private final BigDecimal liabilityInterest;

    @Nullable
    private final BigDecimal liabilityPrincipal;

    @Nullable
    private final BigDecimal total;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsBalance)) {
            return false;
        }
        WsBalance wsBalance = (WsBalance) other;
        return Intrinsics.areEqual(this.hold, wsBalance.hold) && Intrinsics.areEqual(this.liabilityInterest, wsBalance.liabilityInterest) && Intrinsics.areEqual(this.liabilityPrincipal, wsBalance.liabilityPrincipal) && Intrinsics.areEqual(this.total, wsBalance.total);
    }

    public static /* synthetic */ WsBalance copy$default(WsBalance wsBalance, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = wsBalance.hold;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = wsBalance.liabilityInterest;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = wsBalance.liabilityPrincipal;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = wsBalance.total;
        }
        return wsBalance.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getLiabilityInterest() {
        return this.liabilityInterest;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLiabilityPrincipal() {
        return this.liabilityPrincipal;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTotal() {
        return this.total;
    }

    @NotNull
    public final WsBalance copy(@Nullable BigDecimal hold, @Nullable BigDecimal liabilityInterest, @Nullable BigDecimal liabilityPrincipal, @Nullable BigDecimal total) {
        return new WsBalance(hold, liabilityInterest, liabilityPrincipal, total);
    }

    @Nullable
    public final BigDecimal getHold() {
        return this.hold;
    }

    @Nullable
    public final BigDecimal getLiabilityInterest() {
        return this.liabilityInterest;
    }

    @Nullable
    public final BigDecimal getLiabilityPrincipal() {
        return this.liabilityPrincipal;
    }

    @Nullable
    public final BigDecimal getTotal() {
        return this.total;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.hold;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.liabilityInterest;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.liabilityPrincipal;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.total;
        return iHashCode3 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "WsBalance(hold=" + this.hold + ", liabilityInterest=" + this.liabilityInterest + ", liabilityPrincipal=" + this.liabilityPrincipal + ", total=" + this.total + ')';
    }

    public WsBalance(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.hold = bigDecimal;
        this.liabilityInterest = bigDecimal2;
        this.liabilityPrincipal = bigDecimal3;
        this.total = bigDecimal4;
    }
}
