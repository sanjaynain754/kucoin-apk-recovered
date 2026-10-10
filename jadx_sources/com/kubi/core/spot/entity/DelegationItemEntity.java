package com.kubi.core.spot.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import cn.jiguang.privates.push.constants.JPushConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelegationItemEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010!\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0086\u0001\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010*J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020,HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017¨\u00068"}, m90084d2 = {"Lcom/kubi/core/spot/entity/DelegationItemEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.PRICE, "Ljava/math/BigDecimal;", JPushConstants.Operation.KEY_SEQUENCE, "", "side", "", "size", "time", "fee", FirebaseAnalytics.Param.TAX, "taxRate", "taxCurrency", "feeCurrency", "<init>", "(Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrice", "()Ljava/math/BigDecimal;", "getSequence", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSide", "()Ljava/lang/String;", "getSize", "getTime", "getFee", "getTax", "getTaxRate", "getTaxCurrency", "getFeeCurrency", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/core/spot/entity/DelegationItemEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DelegationItemEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DelegationItemEntity> CREATOR = new C12426a();

    @Nullable
    private final BigDecimal fee;

    @Nullable
    private final String feeCurrency;

    @Nullable
    private final BigDecimal price;

    @Nullable
    private final Long sequence;

    @Nullable
    private final String side;

    @Nullable
    private final BigDecimal size;

    @SerializedName("newTax")
    @Nullable
    private final String tax;

    @Nullable
    private final String taxCurrency;

    @Nullable
    private final String taxRate;

    @Nullable
    private final Long time;

    /* JADX INFO: renamed from: com.kubi.core.spot.entity.DelegationItemEntity$a */
    /* JADX INFO: compiled from: DelegationItemEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C12426a implements Parcelable.Creator<DelegationItemEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DelegationItemEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DelegationItemEntity((BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final DelegationItemEntity[] newArray(int i11) {
            return new DelegationItemEntity[i11];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelegationItemEntity)) {
            return false;
        }
        DelegationItemEntity delegationItemEntity = (DelegationItemEntity) other;
        return Intrinsics.areEqual(this.price, delegationItemEntity.price) && Intrinsics.areEqual(this.sequence, delegationItemEntity.sequence) && Intrinsics.areEqual(this.side, delegationItemEntity.side) && Intrinsics.areEqual(this.size, delegationItemEntity.size) && Intrinsics.areEqual(this.time, delegationItemEntity.time) && Intrinsics.areEqual(this.fee, delegationItemEntity.fee) && Intrinsics.areEqual(this.tax, delegationItemEntity.tax) && Intrinsics.areEqual(this.taxRate, delegationItemEntity.taxRate) && Intrinsics.areEqual(this.taxCurrency, delegationItemEntity.taxCurrency) && Intrinsics.areEqual(this.feeCurrency, delegationItemEntity.feeCurrency);
    }

    public static /* synthetic */ DelegationItemEntity copy$default(DelegationItemEntity delegationItemEntity, BigDecimal bigDecimal, Long l11, String str, BigDecimal bigDecimal2, Long l12, BigDecimal bigDecimal3, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = delegationItemEntity.price;
        }
        if ((i11 & 2) != 0) {
            l11 = delegationItemEntity.sequence;
        }
        if ((i11 & 4) != 0) {
            str = delegationItemEntity.side;
        }
        if ((i11 & 8) != 0) {
            bigDecimal2 = delegationItemEntity.size;
        }
        if ((i11 & 16) != 0) {
            l12 = delegationItemEntity.time;
        }
        if ((i11 & 32) != 0) {
            bigDecimal3 = delegationItemEntity.fee;
        }
        if ((i11 & 64) != 0) {
            str2 = delegationItemEntity.tax;
        }
        if ((i11 & 128) != 0) {
            str3 = delegationItemEntity.taxRate;
        }
        if ((i11 & 256) != 0) {
            str4 = delegationItemEntity.taxCurrency;
        }
        if ((i11 & 512) != 0) {
            str5 = delegationItemEntity.feeCurrency;
        }
        String str6 = str4;
        String str7 = str5;
        String str8 = str2;
        String str9 = str3;
        Long l13 = l12;
        BigDecimal bigDecimal4 = bigDecimal3;
        return delegationItemEntity.copy(bigDecimal, l11, str, bigDecimal2, l13, bigDecimal4, str8, str9, str6, str7);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @NotNull
    public final DelegationItemEntity copy(@Nullable BigDecimal price, @Nullable Long sequence, @Nullable String side, @Nullable BigDecimal size, @Nullable Long time, @Nullable BigDecimal fee, @Nullable String tax, @Nullable String taxRate, @Nullable String taxCurrency, @Nullable String feeCurrency) {
        return new DelegationItemEntity(price, sequence, side, size, time, fee, tax, taxRate, taxCurrency, feeCurrency);
    }

    @Nullable
    public final BigDecimal getFee() {
        return this.fee;
    }

    @Nullable
    public final String getFeeCurrency() {
        return this.feeCurrency;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final Long getSequence() {
        return this.sequence;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getTax() {
        return this.tax;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final String getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.price;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Long l11 = this.sequence;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.side;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.size;
        int iHashCode4 = (iHashCode3 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Long l12 = this.time;
        int iHashCode5 = (iHashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.fee;
        int iHashCode6 = (iHashCode5 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        String str2 = this.tax;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.taxRate;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.taxCurrency;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.feeCurrency;
        return iHashCode9 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DelegationItemEntity(price=" + this.price + ", sequence=" + this.sequence + ", side=" + this.side + ", size=" + this.size + ", time=" + this.time + ", fee=" + this.fee + ", tax=" + this.tax + ", taxRate=" + this.taxRate + ", taxCurrency=" + this.taxCurrency + ", feeCurrency=" + this.feeCurrency + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.price);
        Long l11 = this.sequence;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.side);
        dest.writeSerializable(this.size);
        Long l12 = this.time;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeSerializable(this.fee);
        dest.writeString(this.tax);
        dest.writeString(this.taxRate);
        dest.writeString(this.taxCurrency);
        dest.writeString(this.feeCurrency);
    }

    public DelegationItemEntity(@Nullable BigDecimal bigDecimal, @Nullable Long l11, @Nullable String str, @Nullable BigDecimal bigDecimal2, @Nullable Long l12, @Nullable BigDecimal bigDecimal3, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.price = bigDecimal;
        this.sequence = l11;
        this.side = str;
        this.size = bigDecimal2;
        this.time = l12;
        this.fee = bigDecimal3;
        this.tax = str2;
        this.taxRate = str3;
        this.taxCurrency = str4;
        this.feeCurrency = str5;
    }
}
