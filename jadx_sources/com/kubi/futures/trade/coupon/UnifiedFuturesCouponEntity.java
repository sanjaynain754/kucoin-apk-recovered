package com.kubi.futures.trade.coupon;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedFuturesCoupon.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponEntity;", "", "totalAmount", "", "remainingAmount", FirebaseAnalytics.Param.CURRENCY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTotalAmount", "()Ljava/lang/String;", "getRemainingAmount", "getCurrency", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedFuturesCouponEntity {

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @Nullable
    private final String currency;

    @SerializedName("remainingAmount")
    @Nullable
    private final String remainingAmount;

    @SerializedName("totalAmount")
    @Nullable
    private final String totalAmount;

    public UnifiedFuturesCouponEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedFuturesCouponEntity)) {
            return false;
        }
        UnifiedFuturesCouponEntity unifiedFuturesCouponEntity = (UnifiedFuturesCouponEntity) other;
        return Intrinsics.areEqual(this.totalAmount, unifiedFuturesCouponEntity.totalAmount) && Intrinsics.areEqual(this.remainingAmount, unifiedFuturesCouponEntity.remainingAmount) && Intrinsics.areEqual(this.currency, unifiedFuturesCouponEntity.currency);
    }

    public UnifiedFuturesCouponEntity(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.totalAmount = str;
        this.remainingAmount = str2;
        this.currency = str3;
    }

    public static /* synthetic */ UnifiedFuturesCouponEntity copy$default(UnifiedFuturesCouponEntity unifiedFuturesCouponEntity, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifiedFuturesCouponEntity.totalAmount;
        }
        if ((i11 & 2) != 0) {
            str2 = unifiedFuturesCouponEntity.remainingAmount;
        }
        if ((i11 & 4) != 0) {
            str3 = unifiedFuturesCouponEntity.currency;
        }
        return unifiedFuturesCouponEntity.copy(str, str2, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRemainingAmount() {
        return this.remainingAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final UnifiedFuturesCouponEntity copy(@Nullable String totalAmount, @Nullable String remainingAmount, @Nullable String currency) {
        return new UnifiedFuturesCouponEntity(totalAmount, remainingAmount, currency);
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getRemainingAmount() {
        return this.remainingAmount;
    }

    @Nullable
    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public int hashCode() {
        String str = this.totalAmount;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.remainingAmount;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedFuturesCouponEntity(totalAmount=" + this.totalAmount + ", remainingAmount=" + this.remainingAmount + ", currency=" + this.currency + ')';
    }

    public /* synthetic */ UnifiedFuturesCouponEntity(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
