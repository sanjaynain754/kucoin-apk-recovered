package com.kubi.utaspotlib.api;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UtaSocketApi.kt */
/* JADX INFO: loaded from: classes54.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0099\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00065"}, m90084d2 = {"Lcom/kubi/utaspotlib/api/UnifyFundsInfoEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "equity", "Ljava/math/BigDecimal;", "balance", "availableEquity", "lockedEquity", "occupiedEquity", "liability", "avgCost", "avgCostCurrency", "availableWithdrawEquity", "unrealisedPnl", "liabilityRate", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getEquity", "()Ljava/math/BigDecimal;", "getBalance", "getAvailableEquity", "getLockedEquity", "getOccupiedEquity", "getLiability", "getAvgCost", "getAvgCostCurrency", "setAvgCostCurrency", "(Ljava/lang/String;)V", "getAvailableWithdrawEquity", "getUnrealisedPnl", "getLiabilityRate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "", "toString", "UtaSpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyFundsInfoEntity {

    @SerializedName("availableEquity")
    @Nullable
    private final BigDecimal availableEquity;

    @SerializedName("availableWithdrawEquity")
    @Nullable
    private final BigDecimal availableWithdrawEquity;

    @SerializedName("avgCost")
    @Nullable
    private final BigDecimal avgCost;

    @SerializedName("avgCostCurrency")
    @Nullable
    private String avgCostCurrency;

    @SerializedName("balance")
    @Nullable
    private final BigDecimal balance;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @Nullable
    private final String currency;

    @SerializedName("equity")
    @Nullable
    private final BigDecimal equity;

    @SerializedName("liability")
    @Nullable
    private final BigDecimal liability;

    @SerializedName("liabilityRate")
    @Nullable
    private final BigDecimal liabilityRate;

    @SerializedName("lockedEquity")
    @Nullable
    private final BigDecimal lockedEquity;

    @SerializedName("occupiedEquity")
    @Nullable
    private final BigDecimal occupiedEquity;

    @SerializedName("unrealisedPnl")
    @Nullable
    private final BigDecimal unrealisedPnl;

    public UnifyFundsInfoEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str2, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9, @Nullable BigDecimal bigDecimal10) {
        this.currency = str;
        this.equity = bigDecimal;
        this.balance = bigDecimal2;
        this.availableEquity = bigDecimal3;
        this.lockedEquity = bigDecimal4;
        this.occupiedEquity = bigDecimal5;
        this.liability = bigDecimal6;
        this.avgCost = bigDecimal7;
        this.avgCostCurrency = str2;
        this.availableWithdrawEquity = bigDecimal8;
        this.unrealisedPnl = bigDecimal9;
        this.liabilityRate = bigDecimal10;
    }

    public static /* synthetic */ UnifyFundsInfoEntity copy$default(UnifyFundsInfoEntity unifyFundsInfoEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str2, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyFundsInfoEntity.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = unifyFundsInfoEntity.equity;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = unifyFundsInfoEntity.balance;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = unifyFundsInfoEntity.availableEquity;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = unifyFundsInfoEntity.lockedEquity;
        }
        if ((i11 & 32) != 0) {
            bigDecimal5 = unifyFundsInfoEntity.occupiedEquity;
        }
        if ((i11 & 64) != 0) {
            bigDecimal6 = unifyFundsInfoEntity.liability;
        }
        if ((i11 & 128) != 0) {
            bigDecimal7 = unifyFundsInfoEntity.avgCost;
        }
        if ((i11 & 256) != 0) {
            str2 = unifyFundsInfoEntity.avgCostCurrency;
        }
        if ((i11 & 512) != 0) {
            bigDecimal8 = unifyFundsInfoEntity.availableWithdrawEquity;
        }
        if ((i11 & 1024) != 0) {
            bigDecimal9 = unifyFundsInfoEntity.unrealisedPnl;
        }
        if ((i11 & 2048) != 0) {
            bigDecimal10 = unifyFundsInfoEntity.liabilityRate;
        }
        BigDecimal bigDecimal11 = bigDecimal9;
        BigDecimal bigDecimal12 = bigDecimal10;
        String str3 = str2;
        BigDecimal bigDecimal13 = bigDecimal8;
        BigDecimal bigDecimal14 = bigDecimal6;
        BigDecimal bigDecimal15 = bigDecimal7;
        BigDecimal bigDecimal16 = bigDecimal4;
        BigDecimal bigDecimal17 = bigDecimal5;
        return unifyFundsInfoEntity.copy(str, bigDecimal, bigDecimal2, bigDecimal3, bigDecimal16, bigDecimal17, bigDecimal14, bigDecimal15, str3, bigDecimal13, bigDecimal11, bigDecimal12);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyFundsInfoEntity)) {
            return false;
        }
        UnifyFundsInfoEntity unifyFundsInfoEntity = (UnifyFundsInfoEntity) other;
        return Intrinsics.areEqual(this.currency, unifyFundsInfoEntity.currency) && Intrinsics.areEqual(this.equity, unifyFundsInfoEntity.equity) && Intrinsics.areEqual(this.balance, unifyFundsInfoEntity.balance) && Intrinsics.areEqual(this.availableEquity, unifyFundsInfoEntity.availableEquity) && Intrinsics.areEqual(this.lockedEquity, unifyFundsInfoEntity.lockedEquity) && Intrinsics.areEqual(this.occupiedEquity, unifyFundsInfoEntity.occupiedEquity) && Intrinsics.areEqual(this.liability, unifyFundsInfoEntity.liability) && Intrinsics.areEqual(this.avgCost, unifyFundsInfoEntity.avgCost) && Intrinsics.areEqual(this.avgCostCurrency, unifyFundsInfoEntity.avgCostCurrency) && Intrinsics.areEqual(this.availableWithdrawEquity, unifyFundsInfoEntity.availableWithdrawEquity) && Intrinsics.areEqual(this.unrealisedPnl, unifyFundsInfoEntity.unrealisedPnl) && Intrinsics.areEqual(this.liabilityRate, unifyFundsInfoEntity.liabilityRate);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvailableWithdrawEquity() {
        return this.availableWithdrawEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getAvailableEquity() {
        return this.availableEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLockedEquity() {
        return this.lockedEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getOccupiedEquity() {
        return this.occupiedEquity;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getAvgCost() {
        return this.avgCost;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAvgCostCurrency() {
        return this.avgCostCurrency;
    }

    @NotNull
    public final UnifyFundsInfoEntity copy(@Nullable String currency, @Nullable BigDecimal equity, @Nullable BigDecimal balance, @Nullable BigDecimal availableEquity, @Nullable BigDecimal lockedEquity, @Nullable BigDecimal occupiedEquity, @Nullable BigDecimal liability, @Nullable BigDecimal avgCost, @Nullable String avgCostCurrency, @Nullable BigDecimal availableWithdrawEquity, @Nullable BigDecimal unrealisedPnl, @Nullable BigDecimal liabilityRate) {
        return new UnifyFundsInfoEntity(currency, equity, balance, availableEquity, lockedEquity, occupiedEquity, liability, avgCost, avgCostCurrency, availableWithdrawEquity, unrealisedPnl, liabilityRate);
    }

    @Nullable
    public final BigDecimal getAvailableEquity() {
        return this.availableEquity;
    }

    @Nullable
    public final BigDecimal getAvailableWithdrawEquity() {
        return this.availableWithdrawEquity;
    }

    @Nullable
    public final BigDecimal getAvgCost() {
        return this.avgCost;
    }

    @Nullable
    public final String getAvgCostCurrency() {
        return this.avgCostCurrency;
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getEquity() {
        return this.equity;
    }

    @Nullable
    public final BigDecimal getLiability() {
        return this.liability;
    }

    @Nullable
    public final BigDecimal getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    public final BigDecimal getLockedEquity() {
        return this.lockedEquity;
    }

    @Nullable
    public final BigDecimal getOccupiedEquity() {
        return this.occupiedEquity;
    }

    @Nullable
    public final BigDecimal getUnrealisedPnl() {
        return this.unrealisedPnl;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.equity;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.balance;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.availableEquity;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.lockedEquity;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.occupiedEquity;
        int iHashCode6 = (iHashCode5 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.liability;
        int iHashCode7 = (iHashCode6 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.avgCost;
        int iHashCode8 = (iHashCode7 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str2 = this.avgCostCurrency;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.availableWithdrawEquity;
        int iHashCode10 = (iHashCode9 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.unrealisedPnl;
        int iHashCode11 = (iHashCode10 + (bigDecimal9 == null ? 0 : bigDecimal9.hashCode())) * 31;
        BigDecimal bigDecimal10 = this.liabilityRate;
        return iHashCode11 + (bigDecimal10 != null ? bigDecimal10.hashCode() : 0);
    }

    public final void setAvgCostCurrency(@Nullable String str) {
        this.avgCostCurrency = str;
    }

    @NotNull
    public String toString() {
        return "UnifyFundsInfoEntity(currency=" + this.currency + ", equity=" + this.equity + ", balance=" + this.balance + ", availableEquity=" + this.availableEquity + ", lockedEquity=" + this.lockedEquity + ", occupiedEquity=" + this.occupiedEquity + ", liability=" + this.liability + ", avgCost=" + this.avgCost + ", avgCostCurrency=" + this.avgCostCurrency + ", availableWithdrawEquity=" + this.availableWithdrawEquity + ", unrealisedPnl=" + this.unrealisedPnl + ", liabilityRate=" + this.liabilityRate + ')';
    }

    public /* synthetic */ UnifyFundsInfoEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, String str2, BigDecimal bigDecimal8, BigDecimal bigDecimal9, BigDecimal bigDecimal10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? BigDecimal.ZERO : bigDecimal, (i11 & 4) != 0 ? BigDecimal.ZERO : bigDecimal2, (i11 & 8) != 0 ? BigDecimal.ZERO : bigDecimal3, (i11 & 16) != 0 ? BigDecimal.ZERO : bigDecimal4, (i11 & 32) != 0 ? BigDecimal.ZERO : bigDecimal5, (i11 & 64) != 0 ? BigDecimal.ZERO : bigDecimal6, (i11 & 128) != 0 ? null : bigDecimal7, (i11 & 256) != 0 ? null : str2, (i11 & 512) != 0 ? BigDecimal.ZERO : bigDecimal8, (i11 & 1024) != 0 ? BigDecimal.ZERO : bigDecimal9, (i11 & 2048) != 0 ? null : bigDecimal10);
    }
}
