package com.kubi.core.biz.coupon;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedTradeCoupon.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010Jb\u0010\u001c\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0015\u0010\u0010¨\u0006$"}, m90084d2 = {"Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;", "", "availableCoupons", "", "Lcom/kubi/core/biz/coupon/UnifiedCouponEntity;", "availableCount", "", "unavailableCoupons", "unavailableCount", "totalCount", "usingCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAvailableCoupons", "()Ljava/util/List;", "getAvailableCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnavailableCoupons", "getUnavailableCount", "getTotalCount", "getUsingCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/core/biz/coupon/UnifiedCouponAvailableEntity;", "equals", "", "other", "hashCode", "toString", "", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedCouponAvailableEntity {

    @SerializedName("availableCount")
    @Nullable
    private final Integer availableCount;

    @SerializedName("availableCoupons")
    @Nullable
    private final List<UnifiedCouponEntity> availableCoupons;

    @SerializedName("totalCount")
    @Nullable
    private final Integer totalCount;

    @SerializedName("unavailableCount")
    @Nullable
    private final Integer unavailableCount;

    @SerializedName("unavailableCoupons")
    @Nullable
    private final List<UnifiedCouponEntity> unavailableCoupons;

    @SerializedName("usingCount")
    @Nullable
    private final Integer usingCount;

    public UnifiedCouponAvailableEntity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedCouponAvailableEntity)) {
            return false;
        }
        UnifiedCouponAvailableEntity unifiedCouponAvailableEntity = (UnifiedCouponAvailableEntity) other;
        return Intrinsics.areEqual(this.availableCoupons, unifiedCouponAvailableEntity.availableCoupons) && Intrinsics.areEqual(this.availableCount, unifiedCouponAvailableEntity.availableCount) && Intrinsics.areEqual(this.unavailableCoupons, unifiedCouponAvailableEntity.unavailableCoupons) && Intrinsics.areEqual(this.unavailableCount, unifiedCouponAvailableEntity.unavailableCount) && Intrinsics.areEqual(this.totalCount, unifiedCouponAvailableEntity.totalCount) && Intrinsics.areEqual(this.usingCount, unifiedCouponAvailableEntity.usingCount);
    }

    public UnifiedCouponAvailableEntity(@Nullable List<UnifiedCouponEntity> list, @Nullable Integer num, @Nullable List<UnifiedCouponEntity> list2, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        this.availableCoupons = list;
        this.availableCount = num;
        this.unavailableCoupons = list2;
        this.unavailableCount = num2;
        this.totalCount = num3;
        this.usingCount = num4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifiedCouponAvailableEntity copy$default(UnifiedCouponAvailableEntity unifiedCouponAvailableEntity, List list, Integer num, List list2, Integer num2, Integer num3, Integer num4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = unifiedCouponAvailableEntity.availableCoupons;
        }
        if ((i11 & 2) != 0) {
            num = unifiedCouponAvailableEntity.availableCount;
        }
        if ((i11 & 4) != 0) {
            list2 = unifiedCouponAvailableEntity.unavailableCoupons;
        }
        if ((i11 & 8) != 0) {
            num2 = unifiedCouponAvailableEntity.unavailableCount;
        }
        if ((i11 & 16) != 0) {
            num3 = unifiedCouponAvailableEntity.totalCount;
        }
        if ((i11 & 32) != 0) {
            num4 = unifiedCouponAvailableEntity.usingCount;
        }
        Integer num5 = num3;
        Integer num6 = num4;
        return unifiedCouponAvailableEntity.copy(list, num, list2, num2, num5, num6);
    }

    @Nullable
    public final List<UnifiedCouponEntity> component1() {
        return this.availableCoupons;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAvailableCount() {
        return this.availableCount;
    }

    @Nullable
    public final List<UnifiedCouponEntity> component3() {
        return this.unavailableCoupons;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getUnavailableCount() {
        return this.unavailableCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getUsingCount() {
        return this.usingCount;
    }

    @NotNull
    public final UnifiedCouponAvailableEntity copy(@Nullable List<UnifiedCouponEntity> availableCoupons, @Nullable Integer availableCount, @Nullable List<UnifiedCouponEntity> unavailableCoupons, @Nullable Integer unavailableCount, @Nullable Integer totalCount, @Nullable Integer usingCount) {
        return new UnifiedCouponAvailableEntity(availableCoupons, availableCount, unavailableCoupons, unavailableCount, totalCount, usingCount);
    }

    @Nullable
    public final Integer getAvailableCount() {
        return this.availableCount;
    }

    @Nullable
    public final List<UnifiedCouponEntity> getAvailableCoupons() {
        return this.availableCoupons;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @Nullable
    public final Integer getUnavailableCount() {
        return this.unavailableCount;
    }

    @Nullable
    public final List<UnifiedCouponEntity> getUnavailableCoupons() {
        return this.unavailableCoupons;
    }

    @Nullable
    public final Integer getUsingCount() {
        return this.usingCount;
    }

    public int hashCode() {
        List<UnifiedCouponEntity> list = this.availableCoupons;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.availableCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<UnifiedCouponEntity> list2 = this.unavailableCoupons;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num2 = this.unavailableCount;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalCount;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.usingCount;
        return iHashCode5 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedCouponAvailableEntity(availableCoupons=" + this.availableCoupons + ", availableCount=" + this.availableCount + ", unavailableCoupons=" + this.unavailableCoupons + ", unavailableCount=" + this.unavailableCount + ", totalCount=" + this.totalCount + ", usingCount=" + this.usingCount + ')';
    }

    public /* synthetic */ UnifiedCouponAvailableEntity(List list, Integer num, List list2, Integer num2, Integer num3, Integer num4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : list2, (i11 & 8) != 0 ? null : num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : num4);
    }
}
