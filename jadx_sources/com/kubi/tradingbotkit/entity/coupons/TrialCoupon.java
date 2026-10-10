package com.kubi.tradingbotkit.entity.coupons;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AllCouponsItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, m90084d2 = {"Lcom/kubi/tradingbotkit/entity/coupons/TrialCoupon;", "", "desc", "", "subTitle", "expirationTime", "", "id", "name", "trialAmount", "Lcom/kubi/tradingbotkit/entity/coupons/TrialAmount;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/tradingbotkit/entity/coupons/TrialAmount;)V", "getDesc", "()Ljava/lang/String;", "getSubTitle", "getExpirationTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getId", "getName", "getTrialAmount", "()Lcom/kubi/tradingbotkit/entity/coupons/TrialAmount;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/tradingbotkit/entity/coupons/TrialAmount;)Lcom/kubi/tradingbotkit/entity/coupons/TrialCoupon;", "equals", "", "other", "hashCode", "", "toString", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class TrialCoupon {

    @Nullable
    private final String desc;

    @Nullable
    private final Long expirationTime;

    @Nullable
    private final String id;

    @Nullable
    private final String name;

    @Nullable
    private final String subTitle;

    @Nullable
    private final TrialAmount trialAmount;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrialCoupon)) {
            return false;
        }
        TrialCoupon trialCoupon = (TrialCoupon) other;
        return Intrinsics.areEqual(this.desc, trialCoupon.desc) && Intrinsics.areEqual(this.subTitle, trialCoupon.subTitle) && Intrinsics.areEqual(this.expirationTime, trialCoupon.expirationTime) && Intrinsics.areEqual(this.id, trialCoupon.id) && Intrinsics.areEqual(this.name, trialCoupon.name) && Intrinsics.areEqual(this.trialAmount, trialCoupon.trialAmount);
    }

    public static /* synthetic */ TrialCoupon copy$default(TrialCoupon trialCoupon, String str, String str2, Long l11, String str3, String str4, TrialAmount trialAmount, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trialCoupon.desc;
        }
        if ((i11 & 2) != 0) {
            str2 = trialCoupon.subTitle;
        }
        if ((i11 & 4) != 0) {
            l11 = trialCoupon.expirationTime;
        }
        if ((i11 & 8) != 0) {
            str3 = trialCoupon.id;
        }
        if ((i11 & 16) != 0) {
            str4 = trialCoupon.name;
        }
        if ((i11 & 32) != 0) {
            trialAmount = trialCoupon.trialAmount;
        }
        String str5 = str4;
        TrialAmount trialAmount2 = trialAmount;
        return trialCoupon.copy(str, str2, l11, str3, str5, trialAmount2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TrialAmount getTrialAmount() {
        return this.trialAmount;
    }

    @NotNull
    public final TrialCoupon copy(@Nullable String desc, @Nullable String subTitle, @Nullable Long expirationTime, @Nullable String id2, @Nullable String name, @Nullable TrialAmount trialAmount) {
        return new TrialCoupon(desc, subTitle, expirationTime, id2, name, trialAmount);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final Long getExpirationTime() {
        return this.expirationTime;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getSubTitle() {
        return this.subTitle;
    }

    @Nullable
    public final TrialAmount getTrialAmount() {
        return this.trialAmount;
    }

    public int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.expirationTime;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TrialAmount trialAmount = this.trialAmount;
        return iHashCode5 + (trialAmount != null ? trialAmount.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TrialCoupon(desc=" + this.desc + ", subTitle=" + this.subTitle + ", expirationTime=" + this.expirationTime + ", id=" + this.id + ", name=" + this.name + ", trialAmount=" + this.trialAmount + ')';
    }

    public TrialCoupon(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable TrialAmount trialAmount) {
        this.desc = str;
        this.subTitle = str2;
        this.expirationTime = l11;
        this.id = str3;
        this.name = str4;
        this.trialAmount = trialAmount;
    }
}
