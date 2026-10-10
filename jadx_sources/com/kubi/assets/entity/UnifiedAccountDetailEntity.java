package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UnifiedAccountDetailEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010.\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u0086\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00102J\u0006\u00103\u001a\u000204J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u000204HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u000204R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\"\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006@"}, m90084d2 = {"Lcom/kubi/assets/entity/UnifiedAccountDetailEntity;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "direction", "bizType", "bizTypeCode", "totalAmountWithFeeTax", "Ljava/math/BigDecimal;", "balance", "fee", "", FirebaseAnalytics.Param.TAX, "remark", "tradeDate", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;)V", "getCurrency", "()Ljava/lang/String;", "getDirection", "getBizType", "getBizTypeCode", "getTotalAmountWithFeeTax", "()Ljava/math/BigDecimal;", "setTotalAmountWithFeeTax", "(Ljava/math/BigDecimal;)V", "getBalance", "setBalance", "getFee", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getTax", "getRemark", "getTradeDate", "()Ljava/lang/Long;", "setTradeDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/assets/entity/UnifiedAccountDetailEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class UnifiedAccountDetailEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UnifiedAccountDetailEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal balance;

    @SerializedName("type")
    @Nullable
    private final String bizType;

    @SerializedName("businessType")
    @Nullable
    private final String bizTypeCode;

    @Nullable
    private final String currency;

    @Nullable
    private final String direction;

    @Nullable
    private final Double fee;

    @Nullable
    private final String remark;

    @Nullable
    private final Double tax;

    @Nullable
    private BigDecimal totalAmountWithFeeTax;

    @SerializedName("ts")
    @Nullable
    private Long tradeDate;

    /* JADX INFO: compiled from: UnifiedAccountDetailEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<UnifiedAccountDetailEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAccountDetailEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UnifiedAccountDetailEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnifiedAccountDetailEntity[] newArray(int i11) {
            return new UnifiedAccountDetailEntity[i11];
        }
    }

    public UnifiedAccountDetailEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable Double d11, @Nullable Double d12, @Nullable String str5, @Nullable Long l11) {
        this.currency = str;
        this.direction = str2;
        this.bizType = str3;
        this.bizTypeCode = str4;
        this.totalAmountWithFeeTax = bigDecimal;
        this.balance = bigDecimal2;
        this.fee = d11;
        this.tax = d12;
        this.remark = str5;
        this.tradeDate = l11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnifiedAccountDetailEntity)) {
            return false;
        }
        UnifiedAccountDetailEntity unifiedAccountDetailEntity = (UnifiedAccountDetailEntity) other;
        return Intrinsics.areEqual(this.currency, unifiedAccountDetailEntity.currency) && Intrinsics.areEqual(this.direction, unifiedAccountDetailEntity.direction) && Intrinsics.areEqual(this.bizType, unifiedAccountDetailEntity.bizType) && Intrinsics.areEqual(this.bizTypeCode, unifiedAccountDetailEntity.bizTypeCode) && Intrinsics.areEqual(this.totalAmountWithFeeTax, unifiedAccountDetailEntity.totalAmountWithFeeTax) && Intrinsics.areEqual(this.balance, unifiedAccountDetailEntity.balance) && Intrinsics.areEqual((Object) this.fee, (Object) unifiedAccountDetailEntity.fee) && Intrinsics.areEqual((Object) this.tax, (Object) unifiedAccountDetailEntity.tax) && Intrinsics.areEqual(this.remark, unifiedAccountDetailEntity.remark) && Intrinsics.areEqual(this.tradeDate, unifiedAccountDetailEntity.tradeDate);
    }

    public static /* synthetic */ UnifiedAccountDetailEntity copy$default(UnifiedAccountDetailEntity unifiedAccountDetailEntity, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, Double d11, Double d12, String str5, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = unifiedAccountDetailEntity.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = unifiedAccountDetailEntity.direction;
        }
        if ((i11 & 4) != 0) {
            str3 = unifiedAccountDetailEntity.bizType;
        }
        if ((i11 & 8) != 0) {
            str4 = unifiedAccountDetailEntity.bizTypeCode;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = unifiedAccountDetailEntity.totalAmountWithFeeTax;
        }
        if ((i11 & 32) != 0) {
            bigDecimal2 = unifiedAccountDetailEntity.balance;
        }
        if ((i11 & 64) != 0) {
            d11 = unifiedAccountDetailEntity.fee;
        }
        if ((i11 & 128) != 0) {
            d12 = unifiedAccountDetailEntity.tax;
        }
        if ((i11 & 256) != 0) {
            str5 = unifiedAccountDetailEntity.remark;
        }
        if ((i11 & 512) != 0) {
            l11 = unifiedAccountDetailEntity.tradeDate;
        }
        String str6 = str5;
        Long l12 = l11;
        Double d13 = d11;
        Double d14 = d12;
        BigDecimal bigDecimal3 = bigDecimal;
        BigDecimal bigDecimal4 = bigDecimal2;
        return unifiedAccountDetailEntity.copy(str, str2, str3, str4, bigDecimal3, bigDecimal4, d13, d14, str6, l12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getTradeDate() {
        return this.tradeDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBizTypeCode() {
        return this.bizTypeCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getTotalAmountWithFeeTax() {
        return this.totalAmountWithFeeTax;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getFee() {
        return this.fee;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getTax() {
        return this.tax;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    @NotNull
    public final UnifiedAccountDetailEntity copy(@Nullable String currency, @Nullable String direction, @Nullable String bizType, @Nullable String bizTypeCode, @Nullable BigDecimal totalAmountWithFeeTax, @Nullable BigDecimal balance, @Nullable Double fee, @Nullable Double tax, @Nullable String remark, @Nullable Long tradeDate) {
        return new UnifiedAccountDetailEntity(currency, direction, bizType, bizTypeCode, totalAmountWithFeeTax, balance, fee, tax, remark, tradeDate);
    }

    @Nullable
    public final BigDecimal getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getBizType() {
        return this.bizType;
    }

    @Nullable
    public final String getBizTypeCode() {
        return this.bizTypeCode;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDirection() {
        return this.direction;
    }

    @Nullable
    public final Double getFee() {
        return this.fee;
    }

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final Double getTax() {
        return this.tax;
    }

    @Nullable
    public final BigDecimal getTotalAmountWithFeeTax() {
        return this.totalAmountWithFeeTax;
    }

    @Nullable
    public final Long getTradeDate() {
        return this.tradeDate;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.direction;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bizType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bizTypeCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalAmountWithFeeTax;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.balance;
        int iHashCode6 = (iHashCode5 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        Double d11 = this.fee;
        int iHashCode7 = (iHashCode6 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.tax;
        int iHashCode8 = (iHashCode7 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str5 = this.remark;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l11 = this.tradeDate;
        return iHashCode9 + (l11 != null ? l11.hashCode() : 0);
    }

    public final void setBalance(@Nullable BigDecimal bigDecimal) {
        this.balance = bigDecimal;
    }

    public final void setTotalAmountWithFeeTax(@Nullable BigDecimal bigDecimal) {
        this.totalAmountWithFeeTax = bigDecimal;
    }

    public final void setTradeDate(@Nullable Long l11) {
        this.tradeDate = l11;
    }

    @NotNull
    public String toString() {
        return "UnifiedAccountDetailEntity(currency=" + this.currency + ", direction=" + this.direction + ", bizType=" + this.bizType + ", bizTypeCode=" + this.bizTypeCode + ", totalAmountWithFeeTax=" + this.totalAmountWithFeeTax + ", balance=" + this.balance + ", fee=" + this.fee + ", tax=" + this.tax + ", remark=" + this.remark + ", tradeDate=" + this.tradeDate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.direction);
        dest.writeString(this.bizType);
        dest.writeString(this.bizTypeCode);
        dest.writeSerializable(this.totalAmountWithFeeTax);
        dest.writeSerializable(this.balance);
        Double d11 = this.fee;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.tax;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        dest.writeString(this.remark);
        Long l11 = this.tradeDate;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
    }

    public /* synthetic */ UnifiedAccountDetailEntity(String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, Double d11, Double d12, String str5, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, bigDecimal, bigDecimal2, d11, d12, str5, (i11 & 512) != 0 ? null : l11);
    }
}
