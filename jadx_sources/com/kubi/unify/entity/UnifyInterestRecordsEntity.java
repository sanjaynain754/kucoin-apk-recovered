package com.kubi.unify.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecordsEntity.kt */
/* JADX INFO: loaded from: classes52.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006,"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyInterestRecordsEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "createdAt", "", "liabilitySize", "Ljava/math/BigDecimal;", "interestFreeLiability", "hourlyInterestRate", "interestSize", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrency", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLiabilitySize", "()Ljava/math/BigDecimal;", "getInterestFreeLiability", "getHourlyInterestRate", "getInterestSize", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifyInterestRecordsEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyInterestRecordsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifyInterestRecordsEntity> CREATOR = new C26522a();

    @SerializedName("interestTime")
    @Nullable
    private final Long createdAt;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @Nullable
    private final String currency;

    @SerializedName("hourlyInterestRate")
    @Nullable
    private final BigDecimal hourlyInterestRate;

    @SerializedName("interestFreeLiability")
    @Nullable
    private final BigDecimal interestFreeLiability;

    @SerializedName("interestSize")
    @Nullable
    private final BigDecimal interestSize;

    @SerializedName("liabilitySize")
    @Nullable
    private final BigDecimal liabilitySize;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UnifyInterestRecordsEntity$a */
    /* JADX INFO: compiled from: RecordsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26522a implements Parcelable.Creator<UnifyInterestRecordsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifyInterestRecordsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifyInterestRecordsEntity(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifyInterestRecordsEntity[] newArray(int i11) {
            return new UnifyInterestRecordsEntity[i11];
        }
    }

    public static /* synthetic */ UnifyInterestRecordsEntity copy$default(UnifyInterestRecordsEntity unifyInterestRecordsEntity, String str, Long l11, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifyInterestRecordsEntity.currency;
        }
        if ((i11 & 2) != 0) {
            l11 = unifyInterestRecordsEntity.createdAt;
        }
        if ((i11 & 4) != 0) {
            bigDecimal = unifyInterestRecordsEntity.liabilitySize;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = unifyInterestRecordsEntity.interestFreeLiability;
        }
        if ((i11 & 16) != 0) {
            bigDecimal3 = unifyInterestRecordsEntity.hourlyInterestRate;
        }
        if ((i11 & 32) != 0) {
            bigDecimal4 = unifyInterestRecordsEntity.interestSize;
        }
        BigDecimal bigDecimal5 = bigDecimal3;
        BigDecimal bigDecimal6 = bigDecimal4;
        return unifyInterestRecordsEntity.copy(str, l11, bigDecimal, bigDecimal2, bigDecimal5, bigDecimal6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyInterestRecordsEntity)) {
            return false;
        }
        UnifyInterestRecordsEntity unifyInterestRecordsEntity = (UnifyInterestRecordsEntity) other;
        return Intrinsics.areEqual(this.currency, unifyInterestRecordsEntity.currency) && Intrinsics.areEqual(this.createdAt, unifyInterestRecordsEntity.createdAt) && Intrinsics.areEqual(this.liabilitySize, unifyInterestRecordsEntity.liabilitySize) && Intrinsics.areEqual(this.interestFreeLiability, unifyInterestRecordsEntity.interestFreeLiability) && Intrinsics.areEqual(this.hourlyInterestRate, unifyInterestRecordsEntity.hourlyInterestRate) && Intrinsics.areEqual(this.interestSize, unifyInterestRecordsEntity.interestSize);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLiabilitySize() {
        return this.liabilitySize;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getInterestFreeLiability() {
        return this.interestFreeLiability;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getHourlyInterestRate() {
        return this.hourlyInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getInterestSize() {
        return this.interestSize;
    }

    @NotNull
    public final UnifyInterestRecordsEntity copy(@Nullable String currency, @Nullable Long createdAt, @Nullable BigDecimal liabilitySize, @Nullable BigDecimal interestFreeLiability, @Nullable BigDecimal hourlyInterestRate, @Nullable BigDecimal interestSize) {
        return new UnifyInterestRecordsEntity(currency, createdAt, liabilitySize, interestFreeLiability, hourlyInterestRate, interestSize);
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
    public final BigDecimal getHourlyInterestRate() {
        return this.hourlyInterestRate;
    }

    @Nullable
    public final BigDecimal getInterestFreeLiability() {
        return this.interestFreeLiability;
    }

    @Nullable
    public final BigDecimal getInterestSize() {
        return this.interestSize;
    }

    @Nullable
    public final BigDecimal getLiabilitySize() {
        return this.liabilitySize;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.createdAt;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.liabilitySize;
        int iHashCode3 = (iHashCode2 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.interestFreeLiability;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.hourlyInterestRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.interestSize;
        return iHashCode5 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyInterestRecordsEntity(currency=" + this.currency + ", createdAt=" + this.createdAt + ", liabilitySize=" + this.liabilitySize + ", interestFreeLiability=" + this.interestFreeLiability + ", hourlyInterestRate=" + this.hourlyInterestRate + ", interestSize=" + this.interestSize + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.liabilitySize);
        dest.writeSerializable(this.interestFreeLiability);
        dest.writeSerializable(this.hourlyInterestRate);
        dest.writeSerializable(this.interestSize);
    }

    public UnifyInterestRecordsEntity(@Nullable String str, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        this.currency = str;
        this.createdAt = l11;
        this.liabilitySize = bigDecimal;
        this.interestFreeLiability = bigDecimal2;
        this.hourlyInterestRate = bigDecimal3;
        this.interestSize = bigDecimal4;
    }
}
