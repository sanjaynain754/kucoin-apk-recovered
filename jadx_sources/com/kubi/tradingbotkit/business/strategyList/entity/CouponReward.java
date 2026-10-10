package com.kubi.tradingbotkit.business.strategyList.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: StrategyItemEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020$R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017¨\u0006*"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/strategyList/entity/CouponReward;", "Landroid/os/Parcelable;", "couponsId", "", FirebaseAnalytics.Param.CURRENCY, "expiredTime", "", "maxReward", "Ljava/math/BigDecimal;", "name", "rewardSize", "taskId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;)V", "getCouponsId", "()Ljava/lang/String;", "setCouponsId", "(Ljava/lang/String;)V", "getCurrency", "setCurrency", "getExpiredTime", "()Ljava/lang/Long;", "setExpiredTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getMaxReward", "()Ljava/math/BigDecimal;", "setMaxReward", "(Ljava/math/BigDecimal;)V", "getName", "setName", "getRewardSize", "setRewardSize", "getTaskId", "setTaskId", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class CouponReward implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CouponReward> CREATOR = new C26191a();

    @Nullable
    private String couponsId;

    @Nullable
    private String currency;

    @Nullable
    private Long expiredTime;

    @Nullable
    private BigDecimal maxReward;

    @Nullable
    private String name;

    @Nullable
    private BigDecimal rewardSize;

    @Nullable
    private Long taskId;

    /* JADX INFO: renamed from: com.kubi.tradingbotkit.business.strategyList.entity.CouponReward$a */
    /* JADX INFO: compiled from: StrategyItemEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26191a implements Parcelable.Creator<CouponReward> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponReward createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CouponReward(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponReward[] newArray(int i11) {
            return new CouponReward[i11];
        }
    }

    public CouponReward() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public CouponReward(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable BigDecimal bigDecimal2, @Nullable Long l12) {
        this.couponsId = str;
        this.currency = str2;
        this.expiredTime = l11;
        this.maxReward = bigDecimal;
        this.name = str3;
        this.rewardSize = bigDecimal2;
        this.taskId = l12;
    }

    @Nullable
    public final String getCouponsId() {
        return this.couponsId;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getExpiredTime() {
        return this.expiredTime;
    }

    @Nullable
    public final BigDecimal getMaxReward() {
        return this.maxReward;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final BigDecimal getRewardSize() {
        return this.rewardSize;
    }

    @Nullable
    public final Long getTaskId() {
        return this.taskId;
    }

    public final void setCouponsId(@Nullable String str) {
        this.couponsId = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setExpiredTime(@Nullable Long l11) {
        this.expiredTime = l11;
    }

    public final void setMaxReward(@Nullable BigDecimal bigDecimal) {
        this.maxReward = bigDecimal;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRewardSize(@Nullable BigDecimal bigDecimal) {
        this.rewardSize = bigDecimal;
    }

    public final void setTaskId(@Nullable Long l11) {
        this.taskId = l11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.couponsId);
        dest.writeString(this.currency);
        Long l11 = this.expiredTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.maxReward);
        dest.writeString(this.name);
        dest.writeSerializable(this.rewardSize);
        Long l12 = this.taskId;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
    }

    public /* synthetic */ CouponReward(String str, String str2, Long l11, BigDecimal bigDecimal, String str3, BigDecimal bigDecimal2, Long l12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? 0L : l11, (i11 & 8) != 0 ? null : bigDecimal, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : bigDecimal2, (i11 & 64) != 0 ? 0L : l12);
    }
}
