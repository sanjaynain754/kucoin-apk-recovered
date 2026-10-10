package com.kubi.margin.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.math.BigDecimal;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MarginCouponConfig.kt */
/* JADX INFO: loaded from: classes27.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00100\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00106J\u0006\u00107\u001a\u000208J\u0013\u00109\u001a\u00020&2\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u000208HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000208R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b \u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\"\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b%\u0010'¨\u0006C"}, m90084d2 = {"Lcom/kubi/margin/api/entity/MarginCouponConfig;", "Landroid/os/Parcelable;", "activityId", "", "couponId", "couponQuota", "Ljava/math/BigDecimal;", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, FirebaseAnalytics.Param.DISCOUNT, "discountedAmount", "expiredDate", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_DEADLINE, "id", "receiveDate", "state", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getActivityId", "()Ljava/lang/String;", "getCouponId", "getCouponQuota", "()Ljava/math/BigDecimal;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getDiscount", "getDiscountedAmount", "getExpiredDate", "getDeadline", "getId", "getReceiveDate", "getState", "getUserId", "isUnReceive", "", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/margin/api/entity/MarginCouponConfig;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class MarginCouponConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MarginCouponConfig> CREATOR = new C17487a();

    @Nullable
    private final String activityId;

    @Nullable
    private final String couponId;

    @Nullable
    private final BigDecimal couponQuota;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final Long deadline;

    @Nullable
    private final String discount;

    @Nullable
    private final BigDecimal discountedAmount;

    @Nullable
    private final Long expiredDate;

    @Nullable
    private final String id;

    @Nullable
    private final Long receiveDate;

    @Nullable
    private final String state;

    @Nullable
    private final String userId;

    /* JADX INFO: renamed from: com.kubi.margin.api.entity.MarginCouponConfig$a */
    /* JADX INFO: compiled from: MarginCouponConfig.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17487a implements Parcelable.Creator<MarginCouponConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarginCouponConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarginCouponConfig(parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarginCouponConfig[] newArray(int i11) {
            return new MarginCouponConfig[i11];
        }
    }

    public static /* synthetic */ MarginCouponConfig copy$default(MarginCouponConfig marginCouponConfig, String str, String str2, BigDecimal bigDecimal, Long l11, String str3, String str4, BigDecimal bigDecimal2, Long l12, Long l13, String str5, Long l14, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = marginCouponConfig.activityId;
        }
        return marginCouponConfig.copy(str, (i11 & 2) != 0 ? marginCouponConfig.couponId : str2, (i11 & 4) != 0 ? marginCouponConfig.couponQuota : bigDecimal, (i11 & 8) != 0 ? marginCouponConfig.createdAt : l11, (i11 & 16) != 0 ? marginCouponConfig.currency : str3, (i11 & 32) != 0 ? marginCouponConfig.discount : str4, (i11 & 64) != 0 ? marginCouponConfig.discountedAmount : bigDecimal2, (i11 & 128) != 0 ? marginCouponConfig.expiredDate : l12, (i11 & 256) != 0 ? marginCouponConfig.deadline : l13, (i11 & 512) != 0 ? marginCouponConfig.id : str5, (i11 & 1024) != 0 ? marginCouponConfig.receiveDate : l14, (i11 & 2048) != 0 ? marginCouponConfig.state : str6, (i11 & 4096) != 0 ? marginCouponConfig.userId : str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarginCouponConfig)) {
            return false;
        }
        MarginCouponConfig marginCouponConfig = (MarginCouponConfig) other;
        return Intrinsics.areEqual(this.activityId, marginCouponConfig.activityId) && Intrinsics.areEqual(this.couponId, marginCouponConfig.couponId) && Intrinsics.areEqual(this.couponQuota, marginCouponConfig.couponQuota) && Intrinsics.areEqual(this.createdAt, marginCouponConfig.createdAt) && Intrinsics.areEqual(this.currency, marginCouponConfig.currency) && Intrinsics.areEqual(this.discount, marginCouponConfig.discount) && Intrinsics.areEqual(this.discountedAmount, marginCouponConfig.discountedAmount) && Intrinsics.areEqual(this.expiredDate, marginCouponConfig.expiredDate) && Intrinsics.areEqual(this.deadline, marginCouponConfig.deadline) && Intrinsics.areEqual(this.id, marginCouponConfig.id) && Intrinsics.areEqual(this.receiveDate, marginCouponConfig.receiveDate) && Intrinsics.areEqual(this.state, marginCouponConfig.state) && Intrinsics.areEqual(this.userId, marginCouponConfig.userId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getReceiveDate() {
        return this.receiveDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getCouponQuota() {
        return this.couponQuota;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDiscount() {
        return this.discount;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getDiscountedAmount() {
        return this.discountedAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getExpiredDate() {
        return this.expiredDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getDeadline() {
        return this.deadline;
    }

    @NotNull
    public final MarginCouponConfig copy(@Nullable String activityId, @Nullable String couponId, @Nullable BigDecimal couponQuota, @Nullable Long createdAt, @Nullable String currency, @Nullable String discount, @Nullable BigDecimal discountedAmount, @Nullable Long expiredDate, @Nullable Long deadline, @Nullable String id2, @Nullable Long receiveDate, @Nullable String state, @Nullable String userId) {
        return new MarginCouponConfig(activityId, couponId, couponQuota, createdAt, currency, discount, discountedAmount, expiredDate, deadline, id2, receiveDate, state, userId);
    }

    @Nullable
    public final String getActivityId() {
        return this.activityId;
    }

    @Nullable
    public final String getCouponId() {
        return this.couponId;
    }

    @Nullable
    public final BigDecimal getCouponQuota() {
        return this.couponQuota;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getDeadline() {
        return this.deadline;
    }

    @Nullable
    public final String getDiscount() {
        return this.discount;
    }

    @Nullable
    public final BigDecimal getDiscountedAmount() {
        return this.discountedAmount;
    }

    @Nullable
    public final Long getExpiredDate() {
        return this.expiredDate;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Long getReceiveDate() {
        return this.receiveDate;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        String str = this.activityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.couponId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.couponQuota;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        Long l11 = this.createdAt;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discount;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.discountedAmount;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l12 = this.expiredDate;
        int iHashCode8 = (iHashCode7 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.deadline;
        int iHashCode9 = (iHashCode8 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str5 = this.id;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l14 = this.receiveDate;
        int iHashCode11 = (iHashCode10 + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str6 = this.state;
        int iHashCode12 = (iHashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.userId;
        return iHashCode12 + (str7 != null ? str7.hashCode() : 0);
    }

    public final boolean isUnReceive() {
        String upperCase;
        String str = this.state;
        if (str != null) {
            upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        } else {
            upperCase = null;
        }
        return Intrinsics.areEqual(upperCase, "UNUSE");
    }

    @NotNull
    public String toString() {
        return "MarginCouponConfig(activityId=" + this.activityId + ", couponId=" + this.couponId + ", couponQuota=" + this.couponQuota + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", discount=" + this.discount + ", discountedAmount=" + this.discountedAmount + ", expiredDate=" + this.expiredDate + ", deadline=" + this.deadline + ", id=" + this.id + ", receiveDate=" + this.receiveDate + ", state=" + this.state + ", userId=" + this.userId + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.activityId);
        dest.writeString(this.couponId);
        dest.writeSerializable(this.couponQuota);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        dest.writeString(this.discount);
        dest.writeSerializable(this.discountedAmount);
        Long l12 = this.expiredDate;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Long l13 = this.deadline;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        dest.writeString(this.id);
        Long l14 = this.receiveDate;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        dest.writeString(this.state);
        dest.writeString(this.userId);
    }

    public MarginCouponConfig(@Nullable String str, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal2, @Nullable Long l12, @Nullable Long l13, @Nullable String str5, @Nullable Long l14, @Nullable String str6, @Nullable String str7) {
        this.activityId = str;
        this.couponId = str2;
        this.couponQuota = bigDecimal;
        this.createdAt = l11;
        this.currency = str3;
        this.discount = str4;
        this.discountedAmount = bigDecimal2;
        this.expiredDate = l12;
        this.deadline = l13;
        this.id = str5;
        this.receiveDate = l14;
        this.state = str6;
        this.userId = str7;
    }
}
