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
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001dJJ\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\nJ\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\nHÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u00064"}, m90084d2 = {"Lcom/kubi/welfare/api/entity/OtherRecordItemEntity;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "reason", "transferFinishTime", "", "type", "", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getReason", "setReason", "getTransferFinishTime", "()Ljava/lang/Long;", "setTransferFinishTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/kubi/welfare/api/entity/OtherRecordItemEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "WelfareApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OtherRecordItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OtherRecordItemEntity> CREATOR = new C27124a();

    @Nullable
    private BigDecimal amount;

    @Nullable
    private String currency;

    @Nullable
    private String reason;

    @Nullable
    private Long transferFinishTime;

    @Nullable
    private Integer type;

    /* JADX INFO: renamed from: com.kubi.welfare.api.entity.OtherRecordItemEntity$a */
    /* JADX INFO: compiled from: WelfareEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C27124a implements Parcelable.Creator<OtherRecordItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OtherRecordItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OtherRecordItemEntity((BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OtherRecordItemEntity[] newArray(int i11) {
            return new OtherRecordItemEntity[i11];
        }
    }

    public static /* synthetic */ OtherRecordItemEntity copy$default(OtherRecordItemEntity otherRecordItemEntity, BigDecimal bigDecimal, String str, String str2, Long l11, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = otherRecordItemEntity.amount;
        }
        if ((i11 & 2) != 0) {
            str = otherRecordItemEntity.currency;
        }
        if ((i11 & 4) != 0) {
            str2 = otherRecordItemEntity.reason;
        }
        if ((i11 & 8) != 0) {
            l11 = otherRecordItemEntity.transferFinishTime;
        }
        if ((i11 & 16) != 0) {
            num = otherRecordItemEntity.type;
        }
        Integer num2 = num;
        String str3 = str2;
        return otherRecordItemEntity.copy(bigDecimal, str, str3, l11, num2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherRecordItemEntity)) {
            return false;
        }
        OtherRecordItemEntity otherRecordItemEntity = (OtherRecordItemEntity) other;
        return Intrinsics.areEqual(this.amount, otherRecordItemEntity.amount) && Intrinsics.areEqual(this.currency, otherRecordItemEntity.currency) && Intrinsics.areEqual(this.reason, otherRecordItemEntity.reason) && Intrinsics.areEqual(this.transferFinishTime, otherRecordItemEntity.transferFinishTime) && Intrinsics.areEqual(this.type, otherRecordItemEntity.type);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeString(this.currency);
        dest.writeString(this.reason);
        Long l11 = this.transferFinishTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Integer num = this.type;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
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
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getTransferFinishTime() {
        return this.transferFinishTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @NotNull
    public final OtherRecordItemEntity copy(@Nullable BigDecimal amount, @Nullable String currency, @Nullable String reason, @Nullable Long transferFinishTime, @Nullable Integer type) {
        return new OtherRecordItemEntity(amount, currency, reason, transferFinishTime, type);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
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
    public final Long getTransferFinishTime() {
        return this.transferFinishTime;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.reason;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.transferFinishTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Integer num = this.type;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final void setAmount(@Nullable BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setReason(@Nullable String str) {
        this.reason = str;
    }

    public final void setTransferFinishTime(@Nullable Long l11) {
        this.transferFinishTime = l11;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    @NotNull
    public String toString() {
        return "OtherRecordItemEntity(amount=" + this.amount + ", currency=" + this.currency + ", reason=" + this.reason + ", transferFinishTime=" + this.transferFinishTime + ", type=" + this.type + ')';
    }

    public OtherRecordItemEntity(@Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Integer num) {
        this.amount = bigDecimal;
        this.currency = str;
        this.reason = str2;
        this.transferFinishTime = l11;
        this.type = num;
    }
}
