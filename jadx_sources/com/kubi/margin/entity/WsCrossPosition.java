package com.kubi.margin.entity;

import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsBean.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006#"}, m90084d2 = {"Lcom/kubi/margin/entity/WsCrossPosition;", "", "subject", "", "debtRatio", "Ljava/math/BigDecimal;", "statusBizType", "status", "marginCoefficientTotalAsset", "collateralAssetsAmount", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getSubject", "()Ljava/lang/String;", "setSubject", "(Ljava/lang/String;)V", "getDebtRatio", "()Ljava/math/BigDecimal;", "getStatusBizType", "getStatus", "getMarginCoefficientTotalAsset", "getCollateralAssetsAmount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsCrossPosition {

    @Nullable
    private final BigDecimal collateralAssetsAmount;

    @Nullable
    private final BigDecimal debtRatio;

    @Nullable
    private final BigDecimal marginCoefficientTotalAsset;

    @Nullable
    private final String status;

    @Nullable
    private final String statusBizType;

    @Nullable
    private String subject;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsCrossPosition)) {
            return false;
        }
        WsCrossPosition wsCrossPosition = (WsCrossPosition) other;
        return Intrinsics.areEqual(this.subject, wsCrossPosition.subject) && Intrinsics.areEqual(this.debtRatio, wsCrossPosition.debtRatio) && Intrinsics.areEqual(this.statusBizType, wsCrossPosition.statusBizType) && Intrinsics.areEqual(this.status, wsCrossPosition.status) && Intrinsics.areEqual(this.marginCoefficientTotalAsset, wsCrossPosition.marginCoefficientTotalAsset) && Intrinsics.areEqual(this.collateralAssetsAmount, wsCrossPosition.collateralAssetsAmount);
    }

    public static /* synthetic */ WsCrossPosition copy$default(WsCrossPosition wsCrossPosition, String str, BigDecimal bigDecimal, String str2, String str3, BigDecimal bigDecimal2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsCrossPosition.subject;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = wsCrossPosition.debtRatio;
        }
        if ((i11 & 4) != 0) {
            str2 = wsCrossPosition.statusBizType;
        }
        if ((i11 & 8) != 0) {
            str3 = wsCrossPosition.status;
        }
        if ((i11 & 16) != 0) {
            bigDecimal2 = wsCrossPosition.marginCoefficientTotalAsset;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = wsCrossPosition.collateralAssetsAmount;
        }
        BigDecimal bigDecimal4 = bigDecimal2;
        BigDecimal bigDecimal5 = bigDecimal3;
        return wsCrossPosition.copy(str, bigDecimal, str2, str3, bigDecimal4, bigDecimal5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getDebtRatio() {
        return this.debtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMarginCoefficientTotalAsset() {
        return this.marginCoefficientTotalAsset;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getCollateralAssetsAmount() {
        return this.collateralAssetsAmount;
    }

    @NotNull
    public final WsCrossPosition copy(@Nullable String subject, @Nullable BigDecimal debtRatio, @Nullable String statusBizType, @Nullable String status, @Nullable BigDecimal marginCoefficientTotalAsset, @Nullable BigDecimal collateralAssetsAmount) {
        return new WsCrossPosition(subject, debtRatio, statusBizType, status, marginCoefficientTotalAsset, collateralAssetsAmount);
    }

    @Nullable
    public final BigDecimal getCollateralAssetsAmount() {
        return this.collateralAssetsAmount;
    }

    @Nullable
    public final BigDecimal getDebtRatio() {
        return this.debtRatio;
    }

    @Nullable
    public final BigDecimal getMarginCoefficientTotalAsset() {
        return this.marginCoefficientTotalAsset;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getStatusBizType() {
        return this.statusBizType;
    }

    @Nullable
    public final String getSubject() {
        return this.subject;
    }

    public int hashCode() {
        String str = this.subject;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BigDecimal bigDecimal = this.debtRatio;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.statusBizType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.marginCoefficientTotalAsset;
        int iHashCode5 = (iHashCode4 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.collateralAssetsAmount;
        return iHashCode5 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    public final void setSubject(@Nullable String str) {
        this.subject = str;
    }

    @NotNull
    public String toString() {
        return "WsCrossPosition(subject=" + this.subject + ", debtRatio=" + this.debtRatio + ", statusBizType=" + this.statusBizType + ", status=" + this.status + ", marginCoefficientTotalAsset=" + this.marginCoefficientTotalAsset + ", collateralAssetsAmount=" + this.collateralAssetsAmount + ')';
    }

    public WsCrossPosition(@Nullable String str, @Nullable BigDecimal bigDecimal, @Nullable String str2, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3) {
        this.subject = str;
        this.debtRatio = bigDecimal;
        this.statusBizType = str2;
        this.status = str3;
        this.marginCoefficientTotalAsset = bigDecimal2;
        this.collateralAssetsAmount = bigDecimal3;
    }
}
