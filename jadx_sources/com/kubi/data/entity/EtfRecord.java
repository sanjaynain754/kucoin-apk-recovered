package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EtfEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b-\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00102\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00103\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003JÂ\u0001\u00108\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u00109J\u0006\u0010:\u001a\u00020;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020;HÖ\u0001J\t\u0010A\u001a\u00020\u0006HÖ\u0001J\u0016\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020;R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006G"}, m90084d2 = {"Lcom/kubi/data/entity/EtfRecord;", "Landroid/os/Parcelable;", "amount", "Ljava/math/BigDecimal;", "feeAmount", "taxCurrency", "", "taxAmount", "taxRate", "taxRegion", "netAssetValue", "size", "applyTime", "", "confirmTime", "baseCurrencyCode", "baseCurrencyName", "quoteCurrencyCode", "quoteCurrencyName", "state", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/math/BigDecimal;", "getFeeAmount", "getTaxCurrency", "()Ljava/lang/String;", "getTaxAmount", "getTaxRate", "getTaxRegion", "getNetAssetValue", "getSize", "getApplyTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getConfirmTime", "getBaseCurrencyCode", "getBaseCurrencyName", "getQuoteCurrencyCode", "getQuoteCurrencyName", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/data/entity/EtfRecord;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EtfRecord implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EtfRecord> CREATOR = new Creator();

    @Nullable
    private final BigDecimal amount;

    @Nullable
    private final Long applyTime;

    @Nullable
    private final String baseCurrencyCode;

    @Nullable
    private final String baseCurrencyName;

    @Nullable
    private final Long confirmTime;

    @Nullable
    private final BigDecimal feeAmount;

    @Nullable
    private final BigDecimal netAssetValue;

    @Nullable
    private final String quoteCurrencyCode;

    @Nullable
    private final String quoteCurrencyName;

    @Nullable
    private final BigDecimal size;

    @Nullable
    private final String state;

    @SerializedName("taxAmountNew")
    @Nullable
    private final BigDecimal taxAmount;

    @SerializedName("taxCurrencyNew")
    @Nullable
    private final String taxCurrency;

    @SerializedName("taxRateNew")
    @Nullable
    private final BigDecimal taxRate;

    @Nullable
    private final String taxRegion;

    /* JADX INFO: compiled from: EtfEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EtfRecord> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfRecord createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EtfRecord((BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfRecord[] newArray(int i11) {
            return new EtfRecord[i11];
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
        if (!(other instanceof EtfRecord)) {
            return false;
        }
        EtfRecord etfRecord = (EtfRecord) other;
        return Intrinsics.areEqual(this.amount, etfRecord.amount) && Intrinsics.areEqual(this.feeAmount, etfRecord.feeAmount) && Intrinsics.areEqual(this.taxCurrency, etfRecord.taxCurrency) && Intrinsics.areEqual(this.taxAmount, etfRecord.taxAmount) && Intrinsics.areEqual(this.taxRate, etfRecord.taxRate) && Intrinsics.areEqual(this.taxRegion, etfRecord.taxRegion) && Intrinsics.areEqual(this.netAssetValue, etfRecord.netAssetValue) && Intrinsics.areEqual(this.size, etfRecord.size) && Intrinsics.areEqual(this.applyTime, etfRecord.applyTime) && Intrinsics.areEqual(this.confirmTime, etfRecord.confirmTime) && Intrinsics.areEqual(this.baseCurrencyCode, etfRecord.baseCurrencyCode) && Intrinsics.areEqual(this.baseCurrencyName, etfRecord.baseCurrencyName) && Intrinsics.areEqual(this.quoteCurrencyCode, etfRecord.quoteCurrencyCode) && Intrinsics.areEqual(this.quoteCurrencyName, etfRecord.quoteCurrencyName) && Intrinsics.areEqual(this.state, etfRecord.state);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Long getConfirmTime() {
        return this.confirmTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getQuoteCurrencyCode() {
        return this.quoteCurrencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTaxRegion() {
        return this.taxRegion;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getNetAssetValue() {
        return this.netAssetValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getApplyTime() {
        return this.applyTime;
    }

    @NotNull
    public final EtfRecord copy(@Nullable BigDecimal amount, @Nullable BigDecimal feeAmount, @Nullable String taxCurrency, @Nullable BigDecimal taxAmount, @Nullable BigDecimal taxRate, @Nullable String taxRegion, @Nullable BigDecimal netAssetValue, @Nullable BigDecimal size, @Nullable Long applyTime, @Nullable Long confirmTime, @Nullable String baseCurrencyCode, @Nullable String baseCurrencyName, @Nullable String quoteCurrencyCode, @Nullable String quoteCurrencyName, @Nullable String state) {
        return new EtfRecord(amount, feeAmount, taxCurrency, taxAmount, taxRate, taxRegion, netAssetValue, size, applyTime, confirmTime, baseCurrencyCode, baseCurrencyName, quoteCurrencyCode, quoteCurrencyName, state);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final Long getApplyTime() {
        return this.applyTime;
    }

    @Nullable
    public final String getBaseCurrencyCode() {
        return this.baseCurrencyCode;
    }

    @Nullable
    public final String getBaseCurrencyName() {
        return this.baseCurrencyName;
    }

    @Nullable
    public final Long getConfirmTime() {
        return this.confirmTime;
    }

    @Nullable
    public final BigDecimal getFeeAmount() {
        return this.feeAmount;
    }

    @Nullable
    public final BigDecimal getNetAssetValue() {
        return this.netAssetValue;
    }

    @Nullable
    public final String getQuoteCurrencyCode() {
        return this.quoteCurrencyCode;
    }

    @Nullable
    public final String getQuoteCurrencyName() {
        return this.quoteCurrencyName;
    }

    @Nullable
    public final BigDecimal getSize() {
        return this.size;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final BigDecimal getTaxAmount() {
        return this.taxAmount;
    }

    @Nullable
    public final String getTaxCurrency() {
        return this.taxCurrency;
    }

    @Nullable
    public final BigDecimal getTaxRate() {
        return this.taxRate;
    }

    @Nullable
    public final String getTaxRegion() {
        return this.taxRegion;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.amount;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.feeAmount;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str = this.taxCurrency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.taxAmount;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.taxRate;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str2 = this.taxRegion;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.netAssetValue;
        int iHashCode7 = (iHashCode6 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.size;
        int iHashCode8 = (iHashCode7 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        Long l11 = this.applyTime;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.confirmTime;
        int iHashCode10 = (iHashCode9 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str3 = this.baseCurrencyCode;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.baseCurrencyName;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.quoteCurrencyCode;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.quoteCurrencyName;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.state;
        return iHashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EtfRecord(amount=" + this.amount + ", feeAmount=" + this.feeAmount + ", taxCurrency=" + this.taxCurrency + ", taxAmount=" + this.taxAmount + ", taxRate=" + this.taxRate + ", taxRegion=" + this.taxRegion + ", netAssetValue=" + this.netAssetValue + ", size=" + this.size + ", applyTime=" + this.applyTime + ", confirmTime=" + this.confirmTime + ", baseCurrencyCode=" + this.baseCurrencyCode + ", baseCurrencyName=" + this.baseCurrencyName + ", quoteCurrencyCode=" + this.quoteCurrencyCode + ", quoteCurrencyName=" + this.quoteCurrencyName + ", state=" + this.state + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.feeAmount);
        dest.writeString(this.taxCurrency);
        dest.writeSerializable(this.taxAmount);
        dest.writeSerializable(this.taxRate);
        dest.writeString(this.taxRegion);
        dest.writeSerializable(this.netAssetValue);
        dest.writeSerializable(this.size);
        Long l11 = this.applyTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.confirmTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.baseCurrencyCode);
        dest.writeString(this.baseCurrencyName);
        dest.writeString(this.quoteCurrencyCode);
        dest.writeString(this.quoteCurrencyName);
        dest.writeString(this.state);
    }

    public EtfRecord(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable String str, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable String str2, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable Long l11, @Nullable Long l12, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.amount = bigDecimal;
        this.feeAmount = bigDecimal2;
        this.taxCurrency = str;
        this.taxAmount = bigDecimal3;
        this.taxRate = bigDecimal4;
        this.taxRegion = str2;
        this.netAssetValue = bigDecimal5;
        this.size = bigDecimal6;
        this.applyTime = l11;
        this.confirmTime = l12;
        this.baseCurrencyCode = str3;
        this.baseCurrencyName = str4;
        this.quoteCurrencyCode = str5;
        this.quoteCurrencyName = str6;
        this.state = str7;
    }
}
