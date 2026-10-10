package com.kubi.welfare.api.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WelfareEntity.kt */
/* JADX INFO: loaded from: classes58.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020\u0007J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u0005HÖ\u0001J\u0016\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013¨\u00067"}, m90084d2 = {"Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "count", "", "rewardDate", "", "status", "reason", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getCount", "()Ljava/lang/Integer;", "setCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRewardDate", "()Ljava/lang/Long;", "setRewardDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStatus", "setStatus", "getReason", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/kubi/welfare/api/entity/InviteRecordItemEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class InviteRecordItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InviteRecordItemEntity> CREATOR = new C27123a();

    @Nullable
    private BigDecimal amount;

    @Nullable
    private Integer count;

    @Nullable
    private String currency;

    @Nullable
    private final String reason;

    @Nullable
    private Long rewardDate;

    @Nullable
    private Integer status;

    /* JADX INFO: renamed from: com.kubi.welfare.api.entity.InviteRecordItemEntity$a */
    /* JADX INFO: compiled from: WelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27123a implements Parcelable.Creator<InviteRecordItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InviteRecordItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InviteRecordItemEntity((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InviteRecordItemEntity[] newArray(int i11) {
            return new InviteRecordItemEntity[i11];
        }
    }

    public static /* synthetic */ InviteRecordItemEntity copy$default(InviteRecordItemEntity inviteRecordItemEntity, BigDecimal bigDecimal, String str, Integer num, Long l11, Integer num2, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = inviteRecordItemEntity.amount;
        }
        if ((i11 & 2) != 0) {
            str = inviteRecordItemEntity.currency;
        }
        if ((i11 & 4) != 0) {
            num = inviteRecordItemEntity.count;
        }
        if ((i11 & 8) != 0) {
            l11 = inviteRecordItemEntity.rewardDate;
        }
        if ((i11 & 16) != 0) {
            num2 = inviteRecordItemEntity.status;
        }
        if ((i11 & 32) != 0) {
            str2 = inviteRecordItemEntity.reason;
        }
        Integer num3 = num2;
        String str3 = str2;
        return inviteRecordItemEntity.copy(bigDecimal, str, num, l11, num3, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InviteRecordItemEntity)) {
            return false;
        }
        InviteRecordItemEntity inviteRecordItemEntity = (InviteRecordItemEntity) other;
        return Intrinsics.areEqual(this.amount, inviteRecordItemEntity.amount) && Intrinsics.areEqual(this.currency, inviteRecordItemEntity.currency) && Intrinsics.areEqual(this.count, inviteRecordItemEntity.count) && Intrinsics.areEqual(this.rewardDate, inviteRecordItemEntity.rewardDate) && Intrinsics.areEqual(this.status, inviteRecordItemEntity.status) && Intrinsics.areEqual(this.reason, inviteRecordItemEntity.reason);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeString(this.currency);
        Integer num = this.count;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Long l11 = this.rewardDate;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Integer num2 = this.status;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
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
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getRewardDate() {
        return this.rewardDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    public final InviteRecordItemEntity copy(@Nullable BigDecimal amount, @Nullable String currency, @Nullable Integer count, @Nullable Long rewardDate, @Nullable Integer status, @Nullable String reason) {
        return new InviteRecordItemEntity(amount, currency, count, rewardDate, status, reason);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final Integer getCount() {
        return this.count;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
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
    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.count;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l11 = this.rewardDate;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num2 = this.status;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.reason;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setAmount(@Nullable BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final void setCount(@Nullable Integer num) {
        this.count = num;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setRewardDate(@Nullable Long l11) {
        this.rewardDate = l11;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    @NotNull
    public String toString() {
        return "InviteRecordItemEntity(amount=" + this.amount + ", currency=" + this.currency + ", count=" + this.count + ", rewardDate=" + this.rewardDate + ", status=" + this.status + ", reason=" + this.reason + ')';
    }

    public InviteRecordItemEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable Integer num, @Nullable Long l11, @Nullable Integer num2, @Nullable String str2) {
        this.amount = bigDecimal;
        this.currency = str;
        this.count = num;
        this.rewardDate = l11;
        this.status = num2;
        this.reason = str2;
    }
}
