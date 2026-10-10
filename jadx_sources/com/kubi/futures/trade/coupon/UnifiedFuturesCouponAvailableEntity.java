package com.kubi.futures.trade.coupon;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedFuturesCoupon.kt */
/* JADX INFO: loaded from: classes13.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ8\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;", "", "availableCoupons", "", "Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponEntity;", "availableCount", "", "totalCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAvailableCoupons", "()Ljava/util/List;", "getAvailableCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalCount", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/kubi/futures/trade/coupon/UnifiedFuturesCouponAvailableEntity;", "equals", "", "other", "hashCode", "toString", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedFuturesCouponAvailableEntity {

    @SerializedName("availableCount")
    @Nullable
    private final Integer availableCount;

    @SerializedName("availableCoupons")
    @Nullable
    private final List<UnifiedFuturesCouponEntity> availableCoupons;

    @SerializedName("totalCount")
    @Nullable
    private final Integer totalCount;

    public UnifiedFuturesCouponAvailableEntity() {
        this(null, null, null, 7, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedFuturesCouponAvailableEntity)) {
            return false;
        }
        UnifiedFuturesCouponAvailableEntity unifiedFuturesCouponAvailableEntity = (UnifiedFuturesCouponAvailableEntity) other;
        return Intrinsics.areEqual(this.availableCoupons, unifiedFuturesCouponAvailableEntity.availableCoupons) && Intrinsics.areEqual(this.availableCount, unifiedFuturesCouponAvailableEntity.availableCount) && Intrinsics.areEqual(this.totalCount, unifiedFuturesCouponAvailableEntity.totalCount);
    }

    public UnifiedFuturesCouponAvailableEntity(@Nullable List<UnifiedFuturesCouponEntity> list, @Nullable Integer num, @Nullable Integer num2) {
        this.availableCoupons = list;
        this.availableCount = num;
        this.totalCount = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UnifiedFuturesCouponAvailableEntity copy$default(UnifiedFuturesCouponAvailableEntity unifiedFuturesCouponAvailableEntity, List list, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = unifiedFuturesCouponAvailableEntity.availableCoupons;
        }
        if ((i11 & 2) != 0) {
            num = unifiedFuturesCouponAvailableEntity.availableCount;
        }
        if ((i11 & 4) != 0) {
            num2 = unifiedFuturesCouponAvailableEntity.totalCount;
        }
        return unifiedFuturesCouponAvailableEntity.copy(list, num, num2);
    }

    @Nullable
    public final List<UnifiedFuturesCouponEntity> component1() {
        return this.availableCoupons;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getAvailableCount() {
        return this.availableCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    @NotNull
    public final UnifiedFuturesCouponAvailableEntity copy(@Nullable List<UnifiedFuturesCouponEntity> availableCoupons, @Nullable Integer availableCount, @Nullable Integer totalCount) {
        return new UnifiedFuturesCouponAvailableEntity(availableCoupons, availableCount, totalCount);
    }

    @Nullable
    public final Integer getAvailableCount() {
        return this.availableCount;
    }

    @Nullable
    public final List<UnifiedFuturesCouponEntity> getAvailableCoupons() {
        return this.availableCoupons;
    }

    @Nullable
    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        List<UnifiedFuturesCouponEntity> list = this.availableCoupons;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.availableCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifiedFuturesCouponAvailableEntity(availableCoupons=" + this.availableCoupons + ", availableCount=" + this.availableCount + ", totalCount=" + this.totalCount + ')';
    }

    public /* synthetic */ UnifiedFuturesCouponAvailableEntity(List list, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2);
    }
}
