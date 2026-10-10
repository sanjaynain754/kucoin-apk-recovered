package com.kubi.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.appsflyer.AppsFlyerProperties;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EtfEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jª\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u000205J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109HÖ\u0003J\t\u0010:\u001a\u000205HÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001J\u0016\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000205R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015¨\u0006A"}, m90084d2 = {"Lcom/kubi/data/entity/EtfRebalanceRecord;", "Landroid/os/Parcelable;", "assetName", "", "assetType", AppsFlyerProperties.CURRENCY_CODE, "exchangeName", "id", "rebalanceAfterAssetSize", "Ljava/math/BigDecimal;", "rebalanceAfterLeverageRatio", "rebalanceBatchNum", "rebalanceBeforeAssetSize", "rebalanceBeforeLeverageRatio", "rebalanceFlowNum", "rebalanceTime", "", "rebalanceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getAssetName", "()Ljava/lang/String;", "getAssetType", "getCurrencyCode", "getExchangeName", "getId", "getRebalanceAfterAssetSize", "()Ljava/math/BigDecimal;", "getRebalanceAfterLeverageRatio", "getRebalanceBatchNum", "getRebalanceBeforeAssetSize", "getRebalanceBeforeLeverageRatio", "getRebalanceFlowNum", "getRebalanceTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRebalanceType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/data/entity/EtfRebalanceRecord;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EtfRebalanceRecord implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EtfRebalanceRecord> CREATOR = new Creator();

    @Nullable
    private final String assetName;

    @Nullable
    private final String assetType;

    @Nullable
    private final String currencyCode;

    @Nullable
    private final String exchangeName;

    @Nullable
    private final String id;

    @Nullable
    private final BigDecimal rebalanceAfterAssetSize;

    @Nullable
    private final String rebalanceAfterLeverageRatio;

    @Nullable
    private final String rebalanceBatchNum;

    @Nullable
    private final BigDecimal rebalanceBeforeAssetSize;

    @Nullable
    private final String rebalanceBeforeLeverageRatio;

    @Nullable
    private final String rebalanceFlowNum;

    @Nullable
    private final Long rebalanceTime;

    @Nullable
    private final String rebalanceType;

    /* JADX INFO: compiled from: EtfEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<EtfRebalanceRecord> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfRebalanceRecord createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EtfRebalanceRecord(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EtfRebalanceRecord[] newArray(int i11) {
            return new EtfRebalanceRecord[i11];
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
        if (!(other instanceof EtfRebalanceRecord)) {
            return false;
        }
        EtfRebalanceRecord etfRebalanceRecord = (EtfRebalanceRecord) other;
        return Intrinsics.areEqual(this.assetName, etfRebalanceRecord.assetName) && Intrinsics.areEqual(this.assetType, etfRebalanceRecord.assetType) && Intrinsics.areEqual(this.currencyCode, etfRebalanceRecord.currencyCode) && Intrinsics.areEqual(this.exchangeName, etfRebalanceRecord.exchangeName) && Intrinsics.areEqual(this.id, etfRebalanceRecord.id) && Intrinsics.areEqual(this.rebalanceAfterAssetSize, etfRebalanceRecord.rebalanceAfterAssetSize) && Intrinsics.areEqual(this.rebalanceAfterLeverageRatio, etfRebalanceRecord.rebalanceAfterLeverageRatio) && Intrinsics.areEqual(this.rebalanceBatchNum, etfRebalanceRecord.rebalanceBatchNum) && Intrinsics.areEqual(this.rebalanceBeforeAssetSize, etfRebalanceRecord.rebalanceBeforeAssetSize) && Intrinsics.areEqual(this.rebalanceBeforeLeverageRatio, etfRebalanceRecord.rebalanceBeforeLeverageRatio) && Intrinsics.areEqual(this.rebalanceFlowNum, etfRebalanceRecord.rebalanceFlowNum) && Intrinsics.areEqual(this.rebalanceTime, etfRebalanceRecord.rebalanceTime) && Intrinsics.areEqual(this.rebalanceType, etfRebalanceRecord.rebalanceType);
    }

    public static /* synthetic */ EtfRebalanceRecord copy$default(EtfRebalanceRecord etfRebalanceRecord, String str, String str2, String str3, String str4, String str5, BigDecimal bigDecimal, String str6, String str7, BigDecimal bigDecimal2, String str8, String str9, Long l11, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = etfRebalanceRecord.assetName;
        }
        return etfRebalanceRecord.copy(str, (i11 & 2) != 0 ? etfRebalanceRecord.assetType : str2, (i11 & 4) != 0 ? etfRebalanceRecord.currencyCode : str3, (i11 & 8) != 0 ? etfRebalanceRecord.exchangeName : str4, (i11 & 16) != 0 ? etfRebalanceRecord.id : str5, (i11 & 32) != 0 ? etfRebalanceRecord.rebalanceAfterAssetSize : bigDecimal, (i11 & 64) != 0 ? etfRebalanceRecord.rebalanceAfterLeverageRatio : str6, (i11 & 128) != 0 ? etfRebalanceRecord.rebalanceBatchNum : str7, (i11 & 256) != 0 ? etfRebalanceRecord.rebalanceBeforeAssetSize : bigDecimal2, (i11 & 512) != 0 ? etfRebalanceRecord.rebalanceBeforeLeverageRatio : str8, (i11 & 1024) != 0 ? etfRebalanceRecord.rebalanceFlowNum : str9, (i11 & 2048) != 0 ? etfRebalanceRecord.rebalanceTime : l11, (i11 & 4096) != 0 ? etfRebalanceRecord.rebalanceType : str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAssetName() {
        return this.assetName;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRebalanceBeforeLeverageRatio() {
        return this.rebalanceBeforeLeverageRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRebalanceFlowNum() {
        return this.rebalanceFlowNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Long getRebalanceTime() {
        return this.rebalanceTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getRebalanceType() {
        return this.rebalanceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAssetType() {
        return this.assetType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getExchangeName() {
        return this.exchangeName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getRebalanceAfterAssetSize() {
        return this.rebalanceAfterAssetSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRebalanceAfterLeverageRatio() {
        return this.rebalanceAfterLeverageRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getRebalanceBatchNum() {
        return this.rebalanceBatchNum;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getRebalanceBeforeAssetSize() {
        return this.rebalanceBeforeAssetSize;
    }

    @NotNull
    public final EtfRebalanceRecord copy(@Nullable String assetName, @Nullable String assetType, @Nullable String currencyCode, @Nullable String exchangeName, @Nullable String id2, @Nullable BigDecimal rebalanceAfterAssetSize, @Nullable String rebalanceAfterLeverageRatio, @Nullable String rebalanceBatchNum, @Nullable BigDecimal rebalanceBeforeAssetSize, @Nullable String rebalanceBeforeLeverageRatio, @Nullable String rebalanceFlowNum, @Nullable Long rebalanceTime, @Nullable String rebalanceType) {
        return new EtfRebalanceRecord(assetName, assetType, currencyCode, exchangeName, id2, rebalanceAfterAssetSize, rebalanceAfterLeverageRatio, rebalanceBatchNum, rebalanceBeforeAssetSize, rebalanceBeforeLeverageRatio, rebalanceFlowNum, rebalanceTime, rebalanceType);
    }

    @Nullable
    public final String getAssetName() {
        return this.assetName;
    }

    @Nullable
    public final String getAssetType() {
        return this.assetType;
    }

    @Nullable
    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    @Nullable
    public final String getExchangeName() {
        return this.exchangeName;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getRebalanceAfterAssetSize() {
        return this.rebalanceAfterAssetSize;
    }

    @Nullable
    public final String getRebalanceAfterLeverageRatio() {
        return this.rebalanceAfterLeverageRatio;
    }

    @Nullable
    public final String getRebalanceBatchNum() {
        return this.rebalanceBatchNum;
    }

    @Nullable
    public final BigDecimal getRebalanceBeforeAssetSize() {
        return this.rebalanceBeforeAssetSize;
    }

    @Nullable
    public final String getRebalanceBeforeLeverageRatio() {
        return this.rebalanceBeforeLeverageRatio;
    }

    @Nullable
    public final String getRebalanceFlowNum() {
        return this.rebalanceFlowNum;
    }

    @Nullable
    public final Long getRebalanceTime() {
        return this.rebalanceTime;
    }

    @Nullable
    public final String getRebalanceType() {
        return this.rebalanceType;
    }

    public int hashCode() {
        String str = this.assetName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.assetType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.exchangeName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.id;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        BigDecimal bigDecimal = this.rebalanceAfterAssetSize;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str6 = this.rebalanceAfterLeverageRatio;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rebalanceBatchNum;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.rebalanceBeforeAssetSize;
        int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        String str8 = this.rebalanceBeforeLeverageRatio;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.rebalanceFlowNum;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l11 = this.rebalanceTime;
        int iHashCode12 = (iHashCode11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str10 = this.rebalanceType;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EtfRebalanceRecord(assetName=" + this.assetName + ", assetType=" + this.assetType + ", currencyCode=" + this.currencyCode + ", exchangeName=" + this.exchangeName + ", id=" + this.id + ", rebalanceAfterAssetSize=" + this.rebalanceAfterAssetSize + ", rebalanceAfterLeverageRatio=" + this.rebalanceAfterLeverageRatio + ", rebalanceBatchNum=" + this.rebalanceBatchNum + ", rebalanceBeforeAssetSize=" + this.rebalanceBeforeAssetSize + ", rebalanceBeforeLeverageRatio=" + this.rebalanceBeforeLeverageRatio + ", rebalanceFlowNum=" + this.rebalanceFlowNum + ", rebalanceTime=" + this.rebalanceTime + ", rebalanceType=" + this.rebalanceType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.assetName);
        dest.writeString(this.assetType);
        dest.writeString(this.currencyCode);
        dest.writeString(this.exchangeName);
        dest.writeString(this.id);
        dest.writeSerializable(this.rebalanceAfterAssetSize);
        dest.writeString(this.rebalanceAfterLeverageRatio);
        dest.writeString(this.rebalanceBatchNum);
        dest.writeSerializable(this.rebalanceBeforeAssetSize);
        dest.writeString(this.rebalanceBeforeLeverageRatio);
        dest.writeString(this.rebalanceFlowNum);
        Long l11 = this.rebalanceTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.rebalanceType);
    }

    public EtfRebalanceRecord(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable BigDecimal bigDecimal, @Nullable String str6, @Nullable String str7, @Nullable BigDecimal bigDecimal2, @Nullable String str8, @Nullable String str9, @Nullable Long l11, @Nullable String str10) {
        this.assetName = str;
        this.assetType = str2;
        this.currencyCode = str3;
        this.exchangeName = str4;
        this.id = str5;
        this.rebalanceAfterAssetSize = bigDecimal;
        this.rebalanceAfterLeverageRatio = str6;
        this.rebalanceBatchNum = str7;
        this.rebalanceBeforeAssetSize = bigDecimal2;
        this.rebalanceBeforeLeverageRatio = str8;
        this.rebalanceFlowNum = str9;
        this.rebalanceTime = l11;
        this.rebalanceType = str10;
    }
}
