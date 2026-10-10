package com.kubi.welfare.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareEntity.kt */
/* JADX INFO: loaded from: classes58.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jb\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020\u000bJ\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u000bHÖ\u0001J\t\u00105\u001a\u00020\u0006HÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016¨\u0006;"}, m90084d2 = {"Lcom/kubi/welfare/api/entity/EncourageRecordItemEntity;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "holdAmount", "holdCurrency", "", "rewardDate", "", "shareDate", "status", "", "reason", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "getHoldAmount", "setHoldAmount", "getHoldCurrency", "()Ljava/lang/String;", "setHoldCurrency", "(Ljava/lang/String;)V", "getRewardDate", "()Ljava/lang/Long;", "setRewardDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getShareDate", "setShareDate", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/welfare/api/entity/EncourageRecordItemEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EncourageRecordItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EncourageRecordItemEntity> CREATOR = new C27121a();

    @Nullable
    private BigDecimal amount;

    @Nullable
    private BigDecimal holdAmount;

    @Nullable
    private String holdCurrency;

    @Nullable
    private final String reason;

    @Nullable
    private Long rewardDate;

    @Nullable
    private Long shareDate;

    @Nullable
    private Integer status;

    /* JADX INFO: renamed from: com.kubi.welfare.api.entity.EncourageRecordItemEntity$a */
    /* JADX INFO: compiled from: WelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27121a implements Parcelable.Creator<EncourageRecordItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EncourageRecordItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EncourageRecordItemEntity((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EncourageRecordItemEntity[] newArray(int i11) {
            return new EncourageRecordItemEntity[i11];
        }
    }

    public static /* synthetic */ EncourageRecordItemEntity copy$default(EncourageRecordItemEntity encourageRecordItemEntity, BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, Long l11, Long l12, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = encourageRecordItemEntity.amount;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = encourageRecordItemEntity.holdAmount;
        }
        if ((i11 & 4) != 0) {
            str = encourageRecordItemEntity.holdCurrency;
        }
        if ((i11 & 8) != 0) {
            l11 = encourageRecordItemEntity.rewardDate;
        }
        if ((i11 & 16) != 0) {
            l12 = encourageRecordItemEntity.shareDate;
        }
        if ((i11 & 32) != 0) {
            num = encourageRecordItemEntity.status;
        }
        if ((i11 & 64) != 0) {
            str2 = encourageRecordItemEntity.reason;
        }
        Integer num2 = num;
        String str3 = str2;
        Long l13 = l12;
        String str4 = str;
        return encourageRecordItemEntity.copy(bigDecimal, bigDecimal2, str4, l11, l13, num2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EncourageRecordItemEntity)) {
            return false;
        }
        EncourageRecordItemEntity encourageRecordItemEntity = (EncourageRecordItemEntity) other;
        return Intrinsics.areEqual(this.amount, encourageRecordItemEntity.amount) && Intrinsics.areEqual(this.holdAmount, encourageRecordItemEntity.holdAmount) && Intrinsics.areEqual(this.holdCurrency, encourageRecordItemEntity.holdCurrency) && Intrinsics.areEqual(this.rewardDate, encourageRecordItemEntity.rewardDate) && Intrinsics.areEqual(this.shareDate, encourageRecordItemEntity.shareDate) && Intrinsics.areEqual(this.status, encourageRecordItemEntity.status) && Intrinsics.areEqual(this.reason, encourageRecordItemEntity.reason);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.holdAmount);
        dest.writeString(this.holdCurrency);
        Long l11 = this.rewardDate;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.shareDate;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        Integer num = this.status;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.reason);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getHoldAmount() {
        return this.holdAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getHoldCurrency() {
        return this.holdCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getRewardDate() {
        return this.rewardDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getShareDate() {
        return this.shareDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final EncourageRecordItemEntity copy(@Nullable BigDecimal amount, @Nullable BigDecimal holdAmount, @Nullable String holdCurrency, @Nullable Long rewardDate, @Nullable Long shareDate, @Nullable Integer status, @Nullable String reason) {
        return new EncourageRecordItemEntity(amount, holdAmount, holdCurrency, rewardDate, shareDate, status, reason);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final BigDecimal getHoldAmount() {
        return this.holdAmount;
    }

    @Nullable
    public final String getHoldCurrency() {
        return this.holdCurrency;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final Long getRewardDate() {
        return this.rewardDate;
    }

    @Nullable
    public final Long getShareDate() {
        return this.shareDate;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.holdAmount;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.holdCurrency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.rewardDate;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.shareDate;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num = this.status;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.reason;
        return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAmount(@Nullable BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final void setHoldAmount(@Nullable BigDecimal bigDecimal) {
        this.holdAmount = bigDecimal;
    }

    public final void setHoldCurrency(@Nullable String str) {
        this.holdCurrency = str;
    }

    public final void setRewardDate(@Nullable Long l11) {
        this.rewardDate = l11;
    }

    public final void setShareDate(@Nullable Long l11) {
        this.shareDate = l11;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    @NotNull
    public String toString() {
        return "EncourageRecordItemEntity(amount=" + this.amount + ", holdAmount=" + this.holdAmount + ", holdCurrency=" + this.holdCurrency + ", rewardDate=" + this.rewardDate + ", shareDate=" + this.shareDate + ", status=" + this.status + ", reason=" + this.reason + ')';
    }

    public EncourageRecordItemEntity(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable Long l11, @Nullable Long l12, @Nullable Integer num, @Nullable String str2) {
        this.amount = bigDecimal;
        this.holdAmount = bigDecimal2;
        this.holdCurrency = str;
        this.rewardDate = l11;
        this.shareDate = l12;
        this.status = num;
        this.reason = str2;
    }
}
