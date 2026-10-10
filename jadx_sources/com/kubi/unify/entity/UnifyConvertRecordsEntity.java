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
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003JV\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011¨\u0006,"}, m90084d2 = {"Lcom/kubi/unify/entity/UnifyConvertRecordsEntity;", "Landroid/os/Parcelable;", "createdAt", "", "fromSize", "Ljava/math/BigDecimal;", "fromCurrency", "", "toSize", "toCurrency", "convertPrice", "<init>", "(Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)V", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFromSize", "()Ljava/math/BigDecimal;", "getFromCurrency", "()Ljava/lang/String;", "getToSize", "getToCurrency", "getConvertPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;)Lcom/kubi/unify/entity/UnifyConvertRecordsEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifyConvertRecordsEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifyConvertRecordsEntity> CREATOR = new C26519a();

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    @Nullable
    private final BigDecimal convertPrice;

    @SerializedName("executionTime")
    @Nullable
    private final Long createdAt;

    @SerializedName("fromCurrencyCode")
    @Nullable
    private final String fromCurrency;

    @SerializedName("fromSize")
    @Nullable
    private final BigDecimal fromSize;

    @SerializedName("toCurrencyCode")
    @Nullable
    private final String toCurrency;

    @SerializedName("toSize")
    @Nullable
    private final BigDecimal toSize;

    /* JADX INFO: renamed from: com.kubi.unify.entity.UnifyConvertRecordsEntity$a */
    /* JADX INFO: compiled from: RecordsEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26519a implements Parcelable.Creator<UnifyConvertRecordsEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UnifyConvertRecordsEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifyConvertRecordsEntity(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UnifyConvertRecordsEntity[] newArray(int i11) {
            return new UnifyConvertRecordsEntity[i11];
        }
    }

    public static /* synthetic */ UnifyConvertRecordsEntity copy$default(UnifyConvertRecordsEntity unifyConvertRecordsEntity, Long l11, BigDecimal bigDecimal, String str, BigDecimal bigDecimal2, String str2, BigDecimal bigDecimal3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = unifyConvertRecordsEntity.createdAt;
        }
        if ((i11 & 2) != 0) {
            bigDecimal = unifyConvertRecordsEntity.fromSize;
        }
        if ((i11 & 4) != 0) {
            str = unifyConvertRecordsEntity.fromCurrency;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = unifyConvertRecordsEntity.toSize;
        }
        if ((i11 & 16) != 0) {
            str2 = unifyConvertRecordsEntity.toCurrency;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = unifyConvertRecordsEntity.convertPrice;
        }
        String str3 = str2;
        BigDecimal bigDecimal4 = bigDecimal3;
        return unifyConvertRecordsEntity.copy(l11, bigDecimal, str, bigDecimal2, str3, bigDecimal4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifyConvertRecordsEntity)) {
            return false;
        }
        UnifyConvertRecordsEntity unifyConvertRecordsEntity = (UnifyConvertRecordsEntity) other;
        return Intrinsics.areEqual(this.createdAt, unifyConvertRecordsEntity.createdAt) && Intrinsics.areEqual(this.fromSize, unifyConvertRecordsEntity.fromSize) && Intrinsics.areEqual(this.fromCurrency, unifyConvertRecordsEntity.fromCurrency) && Intrinsics.areEqual(this.toSize, unifyConvertRecordsEntity.toSize) && Intrinsics.areEqual(this.toCurrency, unifyConvertRecordsEntity.toCurrency) && Intrinsics.areEqual(this.convertPrice, unifyConvertRecordsEntity.convertPrice);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getFromSize() {
        return this.fromSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFromCurrency() {
        return this.fromCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getToSize() {
        return this.toSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getToCurrency() {
        return this.toCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getConvertPrice() {
        return this.convertPrice;
    }

    @NotNull
    public final UnifyConvertRecordsEntity copy(@Nullable Long createdAt, @Nullable BigDecimal fromSize, @Nullable String fromCurrency, @Nullable BigDecimal toSize, @Nullable String toCurrency, @Nullable BigDecimal convertPrice) {
        return new UnifyConvertRecordsEntity(createdAt, fromSize, fromCurrency, toSize, toCurrency, convertPrice);
    }

    @Nullable
    public final BigDecimal getConvertPrice() {
        return this.convertPrice;
    }

    @Nullable
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getFromCurrency() {
        return this.fromCurrency;
    }

    @Nullable
    public final BigDecimal getFromSize() {
        return this.fromSize;
    }

    @Nullable
    public final String getToCurrency() {
        return this.toCurrency;
    }

    @Nullable
    public final BigDecimal getToSize() {
        return this.toSize;
    }

    public int hashCode() {
        Long l11 = this.createdAt;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        BigDecimal bigDecimal = this.fromSize;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str = this.fromCurrency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.toSize;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str2 = this.toCurrency;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.convertPrice;
        return iHashCode5 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UnifyConvertRecordsEntity(createdAt=" + this.createdAt + ", fromSize=" + this.fromSize + ", fromCurrency=" + this.fromCurrency + ", toSize=" + this.toSize + ", toCurrency=" + this.toCurrency + ", convertPrice=" + this.convertPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.fromSize);
        dest.writeString(this.fromCurrency);
        dest.writeSerializable(this.toSize);
        dest.writeString(this.toCurrency);
        dest.writeSerializable(this.convertPrice);
    }

    public UnifyConvertRecordsEntity(@Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable String str2, @Nullable BigDecimal bigDecimal3) {
        this.createdAt = l11;
        this.fromSize = bigDecimal;
        this.fromCurrency = str;
        this.toSize = bigDecimal2;
        this.toCurrency = str2;
        this.convertPrice = bigDecimal3;
    }
}
