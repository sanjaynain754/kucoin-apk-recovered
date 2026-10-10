package com.kubi.tradingbotkit.entity.coupons;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AllCouponsItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0003J>\u0010\u0014\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/coupons/ExperienceGoldEntity;", "", "coupons", "", "Lcom/kubi/tradingbotkit/entity/coupons/AllCouponsItemEntity;", "serverTime", "", "trialCoupons", "Lcom/kubi/tradingbotkit/entity/coupons/TrialCoupon;", "<init>", "(Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)V", "getCoupons", "()Ljava/util/List;", "getServerTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTrialCoupons", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Long;Ljava/util/List;)Lcom/kubi/tradingbotkit/entity/coupons/ExperienceGoldEntity;", "equals", "", "other", "hashCode", "", "toString", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ExperienceGoldEntity {

    @Nullable
    private final List<AllCouponsItemEntity> coupons;

    @Nullable
    private final Long serverTime;

    @Nullable
    private final List<TrialCoupon> trialCoupons;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperienceGoldEntity)) {
            return false;
        }
        ExperienceGoldEntity experienceGoldEntity = (ExperienceGoldEntity) other;
        return Intrinsics.areEqual(this.coupons, experienceGoldEntity.coupons) && Intrinsics.areEqual(this.serverTime, experienceGoldEntity.serverTime) && Intrinsics.areEqual(this.trialCoupons, experienceGoldEntity.trialCoupons);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperienceGoldEntity copy$default(ExperienceGoldEntity experienceGoldEntity, List list, Long l11, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = experienceGoldEntity.coupons;
        }
        if ((i11 & 2) != 0) {
            l11 = experienceGoldEntity.serverTime;
        }
        if ((i11 & 4) != 0) {
            list2 = experienceGoldEntity.trialCoupons;
        }
        return experienceGoldEntity.copy(list, l11, list2);
    }

    @Nullable
    public final List<AllCouponsItemEntity> component1() {
        return this.coupons;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getServerTime() {
        return this.serverTime;
    }

    @Nullable
    public final List<TrialCoupon> component3() {
        return this.trialCoupons;
    }

    @NotNull
    public final ExperienceGoldEntity copy(@Nullable List<AllCouponsItemEntity> coupons, @Nullable Long serverTime, @Nullable List<TrialCoupon> trialCoupons) {
        return new ExperienceGoldEntity(coupons, serverTime, trialCoupons);
    }

    @Nullable
    public final List<AllCouponsItemEntity> getCoupons() {
        return this.coupons;
    }

    @Nullable
    public final Long getServerTime() {
        return this.serverTime;
    }

    @Nullable
    public final List<TrialCoupon> getTrialCoupons() {
        return this.trialCoupons;
    }

    public int hashCode() {
        List<AllCouponsItemEntity> list = this.coupons;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l11 = this.serverTime;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        List<TrialCoupon> list2 = this.trialCoupons;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ExperienceGoldEntity(coupons=" + this.coupons + ", serverTime=" + this.serverTime + ", trialCoupons=" + this.trialCoupons + ')';
    }

    public ExperienceGoldEntity(@Nullable List<AllCouponsItemEntity> list, @Nullable Long l11, @Nullable List<TrialCoupon> list2) {
        this.coupons = list;
        this.serverTime = l11;
        this.trialCoupons = list2;
    }
}
