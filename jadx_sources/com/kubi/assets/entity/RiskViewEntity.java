package com.kubi.assets.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OnGoingEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JU\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/assets/entity/RiskViewEntity;", "", "status", "", "liabilityRate", "", "riskGrade", "transferableAmountDebtRatio", "Ljava/math/BigDecimal;", "liquidationDebtRatio", FirebaseAnalytics.Param.CURRENCY, "b", "", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Z)V", "getStatus", "()Ljava/lang/String;", "getLiabilityRate", "()D", "getRiskGrade", "getTransferableAmountDebtRatio", "()Ljava/math/BigDecimal;", "getLiquidationDebtRatio", "getCurrency", "getB", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RiskViewEntity {
    private final boolean b;

    @Nullable
    private final String currency;
    private final double liabilityRate;

    @Nullable
    private final BigDecimal liquidationDebtRatio;

    @NotNull
    private final String riskGrade;

    @NotNull
    private final String status;

    @Nullable
    private final BigDecimal transferableAmountDebtRatio;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskViewEntity)) {
            return false;
        }
        RiskViewEntity riskViewEntity = (RiskViewEntity) other;
        return Intrinsics.areEqual(this.status, riskViewEntity.status) && Double.compare(this.liabilityRate, riskViewEntity.liabilityRate) == 0 && Intrinsics.areEqual(this.riskGrade, riskViewEntity.riskGrade) && Intrinsics.areEqual(this.transferableAmountDebtRatio, riskViewEntity.transferableAmountDebtRatio) && Intrinsics.areEqual(this.liquidationDebtRatio, riskViewEntity.liquidationDebtRatio) && Intrinsics.areEqual(this.currency, riskViewEntity.currency) && this.b == riskViewEntity.b;
    }

    public RiskViewEntity(@NotNull String status, double d11, @NotNull String riskGrade, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, boolean z11) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(riskGrade, "riskGrade");
        this.status = status;
        this.liabilityRate = d11;
        this.riskGrade = riskGrade;
        this.transferableAmountDebtRatio = bigDecimal;
        this.liquidationDebtRatio = bigDecimal2;
        this.currency = str;
        this.b = z11;
    }

    public static /* synthetic */ RiskViewEntity copy$default(RiskViewEntity riskViewEntity, String str, double d11, String str2, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = riskViewEntity.status;
        }
        if ((i11 & 2) != 0) {
            d11 = riskViewEntity.liabilityRate;
        }
        if ((i11 & 4) != 0) {
            str2 = riskViewEntity.riskGrade;
        }
        if ((i11 & 8) != 0) {
            bigDecimal = riskViewEntity.transferableAmountDebtRatio;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = riskViewEntity.liquidationDebtRatio;
        }
        if ((i11 & 32) != 0) {
            str3 = riskViewEntity.currency;
        }
        if ((i11 & 64) != 0) {
            z11 = riskViewEntity.b;
        }
        boolean z12 = z11;
        BigDecimal bigDecimal3 = bigDecimal2;
        String str4 = str2;
        return riskViewEntity.copy(str, d11, str4, bigDecimal, bigDecimal3, str3, z12);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLiabilityRate() {
        return this.liabilityRate;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @NotNull
    public final RiskViewEntity copy(@NotNull String status, double liabilityRate, @NotNull String riskGrade, @Nullable BigDecimal transferableAmountDebtRatio, @Nullable BigDecimal liquidationDebtRatio, @Nullable String currency, boolean b11) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(riskGrade, "riskGrade");
        return new RiskViewEntity(status, liabilityRate, riskGrade, transferableAmountDebtRatio, liquidationDebtRatio, currency, b11);
    }

    public final boolean getB() {
        return this.b;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    public final double getLiabilityRate() {
        return this.liabilityRate;
    }

    @Nullable
    public final BigDecimal getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @NotNull
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final BigDecimal getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    public int hashCode() {
        int iHashCode = ((((this.status.hashCode() * 31) + Double.hashCode(this.liabilityRate)) * 31) + this.riskGrade.hashCode()) * 31;
        BigDecimal bigDecimal = this.transferableAmountDebtRatio;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.liquidationDebtRatio;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.currency;
        return ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.b);
    }

    @NotNull
    public String toString() {
        return "RiskViewEntity(status=" + this.status + ", liabilityRate=" + this.liabilityRate + ", riskGrade=" + this.riskGrade + ", transferableAmountDebtRatio=" + this.transferableAmountDebtRatio + ", liquidationDebtRatio=" + this.liquidationDebtRatio + ", currency=" + this.currency + ", b=" + this.b + ')';
    }
}
