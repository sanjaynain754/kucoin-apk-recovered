package com.kubi.payment.fast.data.entities;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatCouponListInfo.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo;", "", "<init>", "()V", "Request", "Response", "CouponInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FiatCouponListInfo {

    /* JADX INFO: compiled from: FiatCouponListInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0010HÆ\u0003J¦\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\"\"\u0004\b%\u0010$¨\u0006:"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "", "rewardId", "", "prizeName", "discountRate", "amount", FirebaseAnalytics.Param.CURRENCY, "paymentMethodName", "expireTime", "", "minOrderAmount", "minOrderAmountCurrency", "reason", "reasonDetail", "isChecked", "", "isUnsupportedReasonUnfold", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getRewardId", "()Ljava/lang/String;", "getPrizeName", "getDiscountRate", "getAmount", "getCurrency", "getPaymentMethodName", "getExpireTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMinOrderAmount", "getMinOrderAmountCurrency", "getReason", "getReasonDetail", "()Z", "setChecked", "(Z)V", "setUnsupportedReasonUnfold", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CouponInfo {

        @Nullable
        private final String amount;

        @Nullable
        private final String currency;

        @Nullable
        private final String discountRate;

        @Nullable
        private final Long expireTime;
        private transient boolean isChecked;
        private transient boolean isUnsupportedReasonUnfold;

        @Nullable
        private final String minOrderAmount;

        @Nullable
        private final String minOrderAmountCurrency;

        @Nullable
        private final String paymentMethodName;

        @Nullable
        private final String prizeName;

        @Nullable
        private final String reason;

        @Nullable
        private final String reasonDetail;

        @Nullable
        private final String rewardId;

        public CouponInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l11, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, boolean z11, boolean z12) {
            this.rewardId = str;
            this.prizeName = str2;
            this.discountRate = str3;
            this.amount = str4;
            this.currency = str5;
            this.paymentMethodName = str6;
            this.expireTime = l11;
            this.minOrderAmount = str7;
            this.minOrderAmountCurrency = str8;
            this.reason = str9;
            this.reasonDetail = str10;
            this.isChecked = z11;
            this.isUnsupportedReasonUnfold = z12;
        }

        public static /* synthetic */ CouponInfo copy$default(CouponInfo couponInfo, String str, String str2, String str3, String str4, String str5, String str6, Long l11, String str7, String str8, String str9, String str10, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = couponInfo.rewardId;
            }
            return couponInfo.copy(str, (i11 & 2) != 0 ? couponInfo.prizeName : str2, (i11 & 4) != 0 ? couponInfo.discountRate : str3, (i11 & 8) != 0 ? couponInfo.amount : str4, (i11 & 16) != 0 ? couponInfo.currency : str5, (i11 & 32) != 0 ? couponInfo.paymentMethodName : str6, (i11 & 64) != 0 ? couponInfo.expireTime : l11, (i11 & 128) != 0 ? couponInfo.minOrderAmount : str7, (i11 & 256) != 0 ? couponInfo.minOrderAmountCurrency : str8, (i11 & 512) != 0 ? couponInfo.reason : str9, (i11 & 1024) != 0 ? couponInfo.reasonDetail : str10, (i11 & 2048) != 0 ? couponInfo.isChecked : z11, (i11 & 4096) != 0 ? couponInfo.isUnsupportedReasonUnfold : z12);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CouponInfo)) {
                return false;
            }
            CouponInfo couponInfo = (CouponInfo) other;
            return Intrinsics.areEqual(this.rewardId, couponInfo.rewardId) && Intrinsics.areEqual(this.prizeName, couponInfo.prizeName) && Intrinsics.areEqual(this.discountRate, couponInfo.discountRate) && Intrinsics.areEqual(this.amount, couponInfo.amount) && Intrinsics.areEqual(this.currency, couponInfo.currency) && Intrinsics.areEqual(this.paymentMethodName, couponInfo.paymentMethodName) && Intrinsics.areEqual(this.expireTime, couponInfo.expireTime) && Intrinsics.areEqual(this.minOrderAmount, couponInfo.minOrderAmount) && Intrinsics.areEqual(this.minOrderAmountCurrency, couponInfo.minOrderAmountCurrency) && Intrinsics.areEqual(this.reason, couponInfo.reason) && Intrinsics.areEqual(this.reasonDetail, couponInfo.reasonDetail) && this.isChecked == couponInfo.isChecked && this.isUnsupportedReasonUnfold == couponInfo.isUnsupportedReasonUnfold;
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getRewardId() {
            return this.rewardId;
        }

        @Nullable
        /* JADX INFO: renamed from: component10, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        /* JADX INFO: renamed from: component11, reason: from getter */
        public final String getReasonDetail() {
            return this.reasonDetail;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final boolean getIsUnsupportedReasonUnfold() {
            return this.isUnsupportedReasonUnfold;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getPrizeName() {
            return this.prizeName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDiscountRate() {
            return this.discountRate;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getMinOrderAmount() {
            return this.minOrderAmount;
        }

        @Nullable
        /* JADX INFO: renamed from: component9, reason: from getter */
        public final String getMinOrderAmountCurrency() {
            return this.minOrderAmountCurrency;
        }

        @NotNull
        public final CouponInfo copy(@Nullable String rewardId, @Nullable String prizeName, @Nullable String discountRate, @Nullable String amount, @Nullable String currency, @Nullable String paymentMethodName, @Nullable Long expireTime, @Nullable String minOrderAmount, @Nullable String minOrderAmountCurrency, @Nullable String reason, @Nullable String reasonDetail, boolean isChecked, boolean isUnsupportedReasonUnfold) {
            return new CouponInfo(rewardId, prizeName, discountRate, amount, currency, paymentMethodName, expireTime, minOrderAmount, minOrderAmountCurrency, reason, reasonDetail, isChecked, isUnsupportedReasonUnfold);
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
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
        public final Long getExpireTime() {
            return this.expireTime;
        }

        @Nullable
        public final String getMinOrderAmount() {
            return this.minOrderAmount;
        }

        @Nullable
        public final String getMinOrderAmountCurrency() {
            return this.minOrderAmountCurrency;
        }

        @Nullable
        public final String getPaymentMethodName() {
            return this.paymentMethodName;
        }

        @Nullable
        public final String getPrizeName() {
            return this.prizeName;
        }

        @Nullable
        public final String getReason() {
            return this.reason;
        }

        @Nullable
        public final String getReasonDetail() {
            return this.reasonDetail;
        }

        @Nullable
        public final String getRewardId() {
            return this.rewardId;
        }

        public int hashCode() {
            String str = this.rewardId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.prizeName;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.discountRate;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.amount;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.currency;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.paymentMethodName;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Long l11 = this.expireTime;
            int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
            String str7 = this.minOrderAmount;
            int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.minOrderAmountCurrency;
            int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.reason;
            int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.reasonDetail;
            return ((((iHashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isUnsupportedReasonUnfold);
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final boolean isUnsupportedReasonUnfold() {
            return this.isUnsupportedReasonUnfold;
        }

        public final void setChecked(boolean z11) {
            this.isChecked = z11;
        }

        public final void setUnsupportedReasonUnfold(boolean z11) {
            this.isUnsupportedReasonUnfold = z11;
        }

        @NotNull
        public String toString() {
            return "CouponInfo(rewardId=" + this.rewardId + ", prizeName=" + this.prizeName + ", discountRate=" + this.discountRate + ", amount=" + this.amount + ", currency=" + this.currency + ", paymentMethodName=" + this.paymentMethodName + ", expireTime=" + this.expireTime + ", minOrderAmount=" + this.minOrderAmount + ", minOrderAmountCurrency=" + this.minOrderAmountCurrency + ", reason=" + this.reason + ", reasonDetail=" + this.reasonDetail + ", isChecked=" + this.isChecked + ", isUnsupportedReasonUnfold=" + this.isUnsupportedReasonUnfold + ')';
        }

        public /* synthetic */ CouponInfo(String str, String str2, String str3, String str4, String str5, String str6, Long l11, String str7, String str8, String str9, String str10, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4, str5, str6, l11, str7, str8, str9, str10, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? false : z12);
        }
    }

    /* JADX INFO: compiled from: FiatCouponListInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Request;", "", "bizType", "", "side", "fiatCurrency", "cryptoCurrency", "paymentMethodCode", "quoteType", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBizType", "()Ljava/lang/String;", "getSide", "getFiatCurrency", "getCryptoCurrency", "getPaymentMethodCode", "getQuoteType", "getAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Request {

        @Nullable
        private final String amount;

        @Nullable
        private final String bizType;

        @Nullable
        private final String cryptoCurrency;

        @Nullable
        private final String fiatCurrency;

        @Nullable
        private final String paymentMethodCode;

        @Nullable
        private final String quoteType;

        @Nullable
        private final String side;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.bizType, request.bizType) && Intrinsics.areEqual(this.side, request.side) && Intrinsics.areEqual(this.fiatCurrency, request.fiatCurrency) && Intrinsics.areEqual(this.cryptoCurrency, request.cryptoCurrency) && Intrinsics.areEqual(this.paymentMethodCode, request.paymentMethodCode) && Intrinsics.areEqual(this.quoteType, request.quoteType) && Intrinsics.areEqual(this.amount, request.amount);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.bizType;
            }
            if ((i11 & 2) != 0) {
                str2 = request.side;
            }
            if ((i11 & 4) != 0) {
                str3 = request.fiatCurrency;
            }
            if ((i11 & 8) != 0) {
                str4 = request.cryptoCurrency;
            }
            if ((i11 & 16) != 0) {
                str5 = request.paymentMethodCode;
            }
            if ((i11 & 32) != 0) {
                str6 = request.quoteType;
            }
            if ((i11 & 64) != 0) {
                str7 = request.amount;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return request.copy(str, str2, str11, str4, str10, str8, str9);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBizType() {
            return this.bizType;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSide() {
            return this.side;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getQuoteType() {
            return this.quoteType;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getAmount() {
            return this.amount;
        }

        @NotNull
        public final Request copy(@Nullable String bizType, @Nullable String side, @Nullable String fiatCurrency, @Nullable String cryptoCurrency, @Nullable String paymentMethodCode, @Nullable String quoteType, @Nullable String amount) {
            return new Request(bizType, side, fiatCurrency, cryptoCurrency, paymentMethodCode, quoteType, amount);
        }

        @Nullable
        public final String getAmount() {
            return this.amount;
        }

        @Nullable
        public final String getBizType() {
            return this.bizType;
        }

        @Nullable
        public final String getCryptoCurrency() {
            return this.cryptoCurrency;
        }

        @Nullable
        public final String getFiatCurrency() {
            return this.fiatCurrency;
        }

        @Nullable
        public final String getPaymentMethodCode() {
            return this.paymentMethodCode;
        }

        @Nullable
        public final String getQuoteType() {
            return this.quoteType;
        }

        @Nullable
        public final String getSide() {
            return this.side;
        }

        public int hashCode() {
            String str = this.bizType;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.side;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fiatCurrency;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.cryptoCurrency;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.paymentMethodCode;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.quoteType;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.amount;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Request(bizType=" + this.bizType + ", side=" + this.side + ", fiatCurrency=" + this.fiatCurrency + ", cryptoCurrency=" + this.cryptoCurrency + ", paymentMethodCode=" + this.paymentMethodCode + ", quoteType=" + this.quoteType + ", amount=" + this.amount + ')';
        }

        public Request(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.bizType = str;
            this.side = str2;
            this.fiatCurrency = str3;
            this.cryptoCurrency = str4;
            this.paymentMethodCode = str5;
            this.quoteType = str6;
            this.amount = str7;
        }
    }

    /* JADX INFO: compiled from: FiatCouponListInfo.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$Response;", "", "availableList", "", "Lcom/kubi/payment/fast/data/entities/FiatCouponListInfo$CouponInfo;", "notEligibleList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAvailableList", "()Ljava/util/List;", "getNotEligibleList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class Response {

        @Nullable
        private final List<CouponInfo> availableList;

        @Nullable
        private final List<CouponInfo> notEligibleList;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Response)) {
                return false;
            }
            Response response = (Response) other;
            return Intrinsics.areEqual(this.availableList, response.availableList) && Intrinsics.areEqual(this.notEligibleList, response.notEligibleList);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Response copy$default(Response response, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = response.availableList;
            }
            if ((i11 & 2) != 0) {
                list2 = response.notEligibleList;
            }
            return response.copy(list, list2);
        }

        @Nullable
        public final List<CouponInfo> component1() {
            return this.availableList;
        }

        @Nullable
        public final List<CouponInfo> component2() {
            return this.notEligibleList;
        }

        @NotNull
        public final Response copy(@Nullable List<CouponInfo> availableList, @Nullable List<CouponInfo> notEligibleList) {
            return new Response(availableList, notEligibleList);
        }

        @Nullable
        public final List<CouponInfo> getAvailableList() {
            return this.availableList;
        }

        @Nullable
        public final List<CouponInfo> getNotEligibleList() {
            return this.notEligibleList;
        }

        public int hashCode() {
            List<CouponInfo> list = this.availableList;
            int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
            List<CouponInfo> list2 = this.notEligibleList;
            return iHashCode + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Response(availableList=" + this.availableList + ", notEligibleList=" + this.notEligibleList + ')';
        }

        public Response(@Nullable List<CouponInfo> list, @Nullable List<CouponInfo> list2) {
            this.availableList = list;
            this.notEligibleList = list2;
        }
    }
}
