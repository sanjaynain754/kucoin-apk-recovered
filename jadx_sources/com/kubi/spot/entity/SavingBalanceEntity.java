package com.kubi.spot.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SavingBalanceEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m90084d2 = {"Lcom/kubi/spot/entity/SavingBalanceEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "availableBalance", "Ljava/math/BigDecimal;", "holdBalance", "totalBalance", "redeemingBalance", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getAvailableBalance", "()Ljava/math/BigDecimal;", "getHoldBalance", "getTotalBalance", "getRedeemingBalance", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SavingBalanceEntity {

    @SerializedName("available_balance")
    @Nullable
    private final BigDecimal availableBalance;

    @Nullable
    private final String currency;

    @SerializedName("hold_balance")
    @Nullable
    private final BigDecimal holdBalance;

    @SerializedName("redeeming_balance")
    @Nullable
    private final BigDecimal redeemingBalance;

    @SerializedName("total_balance")
    @Nullable
    private final BigDecimal totalBalance;

    public SavingBalanceEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingBalanceEntity)) {
            return false;
        }
        SavingBalanceEntity savingBalanceEntity = (SavingBalanceEntity) other;
        return Intrinsics.areEqual(this.currency, savingBalanceEntity.currency) && Intrinsics.areEqual(this.availableBalance, savingBalanceEntity.availableBalance) && Intrinsics.areEqual(this.holdBalance, savingBalanceEntity.holdBalance) && Intrinsics.areEqual(this.totalBalance, savingBalanceEntity.totalBalance) && Intrinsics.areEqual(this.redeemingBalance, savingBalanceEntity.redeemingBalance);
    }

    public SavingBalanceEntity(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.currency = str;
        this.availableBalance = bigDecimal;
        this.holdBalance = bigDecimal2;
        this.totalBalance = bigDecimal3;
        this.redeemingBalance = bigDecimal4;
    }

    public static /* synthetic */ SavingBalanceEntity copy$default(SavingBalanceEntity savingBalanceEntity, String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = savingBalanceEntity.currency;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = savingBalanceEntity.availableBalance;
        }
        if ((i11 & 4) != 0) {
            bigDecimal2 = savingBalanceEntity.holdBalance;
        }
        if ((i11 & 8) != 0) {
            bigDecimal3 = savingBalanceEntity.totalBalance;
        }
        if ((i11 & 16) != 0) {
            bigDecimal4 = savingBalanceEntity.redeemingBalance;
        }
        BigDecimal bigDecimal5 = bigDecimal4;
        BigDecimal bigDecimal6 = bigDecimal2;
        return savingBalanceEntity.copy(str, bigDecimal, bigDecimal6, bigDecimal3, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getRedeemingBalance() {
        return this.redeemingBalance;
    }

    @NotNull
    public final SavingBalanceEntity copy(@Nullable String currency, @Nullable BigDecimal availableBalance, @Nullable BigDecimal holdBalance, @Nullable BigDecimal totalBalance, @Nullable BigDecimal redeemingBalance) {
        return new SavingBalanceEntity(currency, availableBalance, holdBalance, totalBalance, redeemingBalance);
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final BigDecimal getRedeemingBalance() {
        return this.redeemingBalance;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.availableBalance;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.holdBalance;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.totalBalance;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.redeemingBalance;
        return iHashCode4 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SavingBalanceEntity(currency=" + this.currency + ", availableBalance=" + this.availableBalance + ", holdBalance=" + this.holdBalance + ", totalBalance=" + this.totalBalance + ", redeemingBalance=" + this.redeemingBalance + ')';
    }

    public /* synthetic */ SavingBalanceEntity(String str, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bigDecimal, (i11 & 4) != 0 ? null : bigDecimal2, (i11 & 8) != 0 ? null : bigDecimal3, (i11 & 16) != 0 ? null : bigDecimal4);
    }
}
