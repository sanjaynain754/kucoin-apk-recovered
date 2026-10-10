package com.kubi.core.biz.coupon;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponEntity;", "", "status", "", "totalAmount", "", "remainingAmount", FirebaseAnalytics.Param.CURRENCY, "discountRate", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalAmount", "()Ljava/lang/String;", "getRemainingAmount", "getCurrency", "getDiscountRate", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/biz/coupon/UnifiedCouponEntity;", "equals", "", "other", "hashCode", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedCouponEntity {

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @Nullable
    private final String currency;

    @SerializedName("discountRate")
    @Nullable
    private final String discountRate;

    @SerializedName("remainingAmount")
    @Nullable
    private final String remainingAmount;

    @SerializedName("status")
    @Nullable
    private final Integer status;

    @SerializedName("totalAmount")
    @Nullable
    private final String totalAmount;

    public UnifiedCouponEntity() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedCouponEntity)) {
            return false;
        }
        UnifiedCouponEntity unifiedCouponEntity = (UnifiedCouponEntity) other;
        return Intrinsics.areEqual(this.status, unifiedCouponEntity.status) && Intrinsics.areEqual(this.totalAmount, unifiedCouponEntity.totalAmount) && Intrinsics.areEqual(this.remainingAmount, unifiedCouponEntity.remainingAmount) && Intrinsics.areEqual(this.currency, unifiedCouponEntity.currency) && Intrinsics.areEqual(this.discountRate, unifiedCouponEntity.discountRate);
    }

    public UnifiedCouponEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.status = num;
        this.totalAmount = str;
        this.remainingAmount = str2;
        this.currency = str3;
        this.discountRate = str4;
    }

    public static /* synthetic */ UnifiedCouponEntity copy$default(UnifiedCouponEntity unifiedCouponEntity, Integer num, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = unifiedCouponEntity.status;
        }
        if ((i11 & 2) != 0) {
            str = unifiedCouponEntity.totalAmount;
        }
        if ((i11 & 4) != 0) {
            str2 = unifiedCouponEntity.remainingAmount;
        }
        if ((i11 & 8) != 0) {
            str3 = unifiedCouponEntity.currency;
        }
        if ((i11 & 16) != 0) {
            str4 = unifiedCouponEntity.discountRate;
        }
        String str5 = str4;
        String str6 = str2;
        return unifiedCouponEntity.copy(num, str, str6, str3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRemainingAmount() {
        return this.remainingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDiscountRate() {
        return this.discountRate;
    }

    @NotNull
    public final UnifiedCouponEntity copy(@Nullable Integer status, @Nullable String totalAmount, @Nullable String remainingAmount, @Nullable String currency, @Nullable String discountRate) {
        return new UnifiedCouponEntity(status, totalAmount, remainingAmount, currency, discountRate);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDiscountRate() {
        return this.discountRate;
    }

    @Nullable
    public final String getRemainingAmount() {
        return this.remainingAmount;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        Integer num = this.status;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.totalAmount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.remainingAmount;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discountRate;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedCouponEntity(status=" + this.status + ", totalAmount=" + this.totalAmount + ", remainingAmount=" + this.remainingAmount + ", currency=" + this.currency + ", discountRate=" + this.discountRate + ')';
    }

    public /* synthetic */ UnifiedCouponEntity(Integer num, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
    }
}
