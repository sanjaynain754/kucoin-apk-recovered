package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010&J\u000b\u0010E\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003JÎ\u0001\u0010N\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010OJ\u0006\u0010P\u001a\u00020QJ\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020QHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020QR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010)\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010+\"\u0004\b5\u0010-R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010+\"\u0004\b7\u0010-R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010+\"\u0004\b9\u0010-R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010+\"\u0004\b;\u0010-R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010+\"\u0004\b=\u0010-¨\u0006]"}, m90084d2 = {"Lcom/kubi/assets/entity/OptionsPositionEntity;", "Landroid/os/Parcelable;", "id", "", "productCode", "productName", "optionType", "side", "symbol", "strikeTime", "", "totalSize", "Ljava/math/BigDecimal;", "amount", "avgPrice", "currentProfitLossAmount", "currentProfitLossRate", "breakEvenPrice", "breakEvenRate", "markPrice", "indexPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getProductCode", "setProductCode", "getProductName", "setProductName", "getOptionType", "setOptionType", "getSide", "setSide", "getSymbol", "setSymbol", "getStrikeTime", "()Ljava/lang/Long;", "setStrikeTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getTotalSize", "()Ljava/math/BigDecimal;", "setTotalSize", "(Ljava/math/BigDecimal;)V", "getAmount", "setAmount", "getAvgPrice", "setAvgPrice", "getCurrentProfitLossAmount", "setCurrentProfitLossAmount", "getCurrentProfitLossRate", "setCurrentProfitLossRate", "getBreakEvenPrice", "setBreakEvenPrice", "getBreakEvenRate", "setBreakEvenRate", "getMarkPrice", "setMarkPrice", "getIndexPrice", "setIndexPrice", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/assets/entity/OptionsPositionEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class OptionsPositionEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionsPositionEntity> CREATOR = new Creator();

    @Nullable
    private BigDecimal amount;

    @Nullable
    private BigDecimal avgPrice;

    @Nullable
    private BigDecimal breakEvenPrice;

    @Nullable
    private BigDecimal breakEvenRate;

    @Nullable
    private BigDecimal currentProfitLossAmount;

    @Nullable
    private BigDecimal currentProfitLossRate;

    @Nullable
    private String id;

    @Nullable
    private BigDecimal indexPrice;

    @Nullable
    private BigDecimal markPrice;

    @Nullable
    private String optionType;

    @Nullable
    private String productCode;

    @Nullable
    private String productName;

    @Nullable
    private String side;

    @Nullable
    private Long strikeTime;

    @Nullable
    private String symbol;

    @Nullable
    private BigDecimal totalSize;

    /* JADX INFO: compiled from: AssetEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<OptionsPositionEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsPositionEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionsPositionEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OptionsPositionEntity[] newArray(int i11) {
            return new OptionsPositionEntity[i11];
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
        if (!(other instanceof OptionsPositionEntity)) {
            return false;
        }
        OptionsPositionEntity optionsPositionEntity = (OptionsPositionEntity) other;
        return Intrinsics.areEqual(this.id, optionsPositionEntity.id) && Intrinsics.areEqual(this.productCode, optionsPositionEntity.productCode) && Intrinsics.areEqual(this.productName, optionsPositionEntity.productName) && Intrinsics.areEqual(this.optionType, optionsPositionEntity.optionType) && Intrinsics.areEqual(this.side, optionsPositionEntity.side) && Intrinsics.areEqual(this.symbol, optionsPositionEntity.symbol) && Intrinsics.areEqual(this.strikeTime, optionsPositionEntity.strikeTime) && Intrinsics.areEqual(this.totalSize, optionsPositionEntity.totalSize) && Intrinsics.areEqual(this.amount, optionsPositionEntity.amount) && Intrinsics.areEqual(this.avgPrice, optionsPositionEntity.avgPrice) && Intrinsics.areEqual(this.currentProfitLossAmount, optionsPositionEntity.currentProfitLossAmount) && Intrinsics.areEqual(this.currentProfitLossRate, optionsPositionEntity.currentProfitLossRate) && Intrinsics.areEqual(this.breakEvenPrice, optionsPositionEntity.breakEvenPrice) && Intrinsics.areEqual(this.breakEvenRate, optionsPositionEntity.breakEvenRate) && Intrinsics.areEqual(this.markPrice, optionsPositionEntity.markPrice) && Intrinsics.areEqual(this.indexPrice, optionsPositionEntity.indexPrice);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getCurrentProfitLossAmount() {
        return this.currentProfitLossAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getCurrentProfitLossRate() {
        return this.currentProfitLossRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getBreakEvenPrice() {
        return this.breakEvenPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getBreakEvenRate() {
        return this.breakEvenRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOptionType() {
        return this.optionType;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSide() {
        return this.side;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getStrikeTime() {
        return this.strikeTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTotalSize() {
        return this.totalSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public final OptionsPositionEntity copy(@Nullable String id2, @Nullable String productCode, @Nullable String productName, @Nullable String optionType, @Nullable String side, @Nullable String symbol, @Nullable Long strikeTime, @Nullable BigDecimal totalSize, @Nullable BigDecimal amount, @Nullable BigDecimal avgPrice, @Nullable BigDecimal currentProfitLossAmount, @Nullable BigDecimal currentProfitLossRate, @Nullable BigDecimal breakEvenPrice, @Nullable BigDecimal breakEvenRate, @Nullable BigDecimal markPrice, @Nullable BigDecimal indexPrice) {
        return new OptionsPositionEntity(id2, productCode, productName, optionType, side, symbol, strikeTime, totalSize, amount, avgPrice, currentProfitLossAmount, currentProfitLossRate, breakEvenPrice, breakEvenRate, markPrice, indexPrice);
    }

    @Nullable
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @Nullable
    public final BigDecimal getAvgPrice() {
        return this.avgPrice;
    }

    @Nullable
    public final BigDecimal getBreakEvenPrice() {
        return this.breakEvenPrice;
    }

    @Nullable
    public final BigDecimal getBreakEvenRate() {
        return this.breakEvenRate;
    }

    @Nullable
    public final BigDecimal getCurrentProfitLossAmount() {
        return this.currentProfitLossAmount;
    }

    @Nullable
    public final BigDecimal getCurrentProfitLossRate() {
        return this.currentProfitLossRate;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final BigDecimal getIndexPrice() {
        return this.indexPrice;
    }

    @Nullable
    public final BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    @Nullable
    public final String getOptionType() {
        return this.optionType;
    }

    @Nullable
    public final String getProductCode() {
        return this.productCode;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getSide() {
        return this.side;
    }

    @Nullable
    public final Long getStrikeTime() {
        return this.strikeTime;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final BigDecimal getTotalSize() {
        return this.totalSize;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productCode;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.optionType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.side;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.symbol;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l11 = this.strikeTime;
        int iHashCode7 = (iHashCode6 + (l11 == null ? 0 : l11.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalSize;
        int iHashCode8 = (iHashCode7 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.amount;
        int iHashCode9 = (iHashCode8 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.avgPrice;
        int iHashCode10 = (iHashCode9 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.currentProfitLossAmount;
        int iHashCode11 = (iHashCode10 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.currentProfitLossRate;
        int iHashCode12 = (iHashCode11 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.breakEvenPrice;
        int iHashCode13 = (iHashCode12 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.breakEvenRate;
        int iHashCode14 = (iHashCode13 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.markPrice;
        int iHashCode15 = (iHashCode14 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        BigDecimal bigDecimal9 = this.indexPrice;
        return iHashCode15 + (bigDecimal9 != null ? bigDecimal9.hashCode() : 0);
    }

    public final void setAmount(@Nullable BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final void setAvgPrice(@Nullable BigDecimal bigDecimal) {
        this.avgPrice = bigDecimal;
    }

    public final void setBreakEvenPrice(@Nullable BigDecimal bigDecimal) {
        this.breakEvenPrice = bigDecimal;
    }

    public final void setBreakEvenRate(@Nullable BigDecimal bigDecimal) {
        this.breakEvenRate = bigDecimal;
    }

    public final void setCurrentProfitLossAmount(@Nullable BigDecimal bigDecimal) {
        this.currentProfitLossAmount = bigDecimal;
    }

    public final void setCurrentProfitLossRate(@Nullable BigDecimal bigDecimal) {
        this.currentProfitLossRate = bigDecimal;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setIndexPrice(@Nullable BigDecimal bigDecimal) {
        this.indexPrice = bigDecimal;
    }

    public final void setMarkPrice(@Nullable BigDecimal bigDecimal) {
        this.markPrice = bigDecimal;
    }

    public final void setOptionType(@Nullable String str) {
        this.optionType = str;
    }

    public final void setProductCode(@Nullable String str) {
        this.productCode = str;
    }

    public final void setProductName(@Nullable String str) {
        this.productName = str;
    }

    public final void setSide(@Nullable String str) {
        this.side = str;
    }

    public final void setStrikeTime(@Nullable Long l11) {
        this.strikeTime = l11;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setTotalSize(@Nullable BigDecimal bigDecimal) {
        this.totalSize = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "OptionsPositionEntity(id=" + this.id + ", productCode=" + this.productCode + ", productName=" + this.productName + ", optionType=" + this.optionType + ", side=" + this.side + ", symbol=" + this.symbol + ", strikeTime=" + this.strikeTime + ", totalSize=" + this.totalSize + ", amount=" + this.amount + ", avgPrice=" + this.avgPrice + ", currentProfitLossAmount=" + this.currentProfitLossAmount + ", currentProfitLossRate=" + this.currentProfitLossRate + ", breakEvenPrice=" + this.breakEvenPrice + ", breakEvenRate=" + this.breakEvenRate + ", markPrice=" + this.markPrice + ", indexPrice=" + this.indexPrice + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.productCode);
        dest.writeString(this.productName);
        dest.writeString(this.optionType);
        dest.writeString(this.side);
        dest.writeString(this.symbol);
        Long l11 = this.strikeTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeSerializable(this.totalSize);
        dest.writeSerializable(this.amount);
        dest.writeSerializable(this.avgPrice);
        dest.writeSerializable(this.currentProfitLossAmount);
        dest.writeSerializable(this.currentProfitLossRate);
        dest.writeSerializable(this.breakEvenPrice);
        dest.writeSerializable(this.breakEvenRate);
        dest.writeSerializable(this.markPrice);
        dest.writeSerializable(this.indexPrice);
    }

    public OptionsPositionEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Long l11, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable BigDecimal bigDecimal9) {
        this.id = str;
        this.productCode = str2;
        this.productName = str3;
        this.optionType = str4;
        this.side = str5;
        this.symbol = str6;
        this.strikeTime = l11;
        this.totalSize = bigDecimal;
        this.amount = bigDecimal2;
        this.avgPrice = bigDecimal3;
        this.currentProfitLossAmount = bigDecimal4;
        this.currentProfitLossRate = bigDecimal5;
        this.breakEvenPrice = bigDecimal6;
        this.breakEvenRate = bigDecimal7;
        this.markPrice = bigDecimal8;
        this.indexPrice = bigDecimal9;
    }
}
