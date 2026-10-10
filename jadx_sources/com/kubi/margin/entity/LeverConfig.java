package com.kubi.margin.entity;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: LeverBean.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÂ\u0003J\u009b\u0001\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020/HÖ\u0001J\t\u00105\u001a\u00020\rHÖ\u0001J\u0016\u00106\u001a\u0002072\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020/R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, m90084d2 = {"Lcom/kubi/margin/entity/LeverConfig;", "Landroid/os/Parcelable;", "borrowableDebtBufferRatio", "Ljava/math/BigDecimal;", "earlyWarningDebtRatio", "liquidationDebtRatio", "maxAutoLoanDebtRatio", "maxLeverage", "riskLeverage", "defaultLeverage", "transferableAmountDebtBufferRatio", "transferableAmountDebtRatio", "riskGrade", "", "remindPriceDeviateRatio", "riskGradeArray", "", "", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/util/List;)V", "getBorrowableDebtBufferRatio", "()Ljava/math/BigDecimal;", "getEarlyWarningDebtRatio", "getLiquidationDebtRatio", "getMaxAutoLoanDebtRatio", "getMaxLeverage", "getRiskLeverage", "getDefaultLeverage", "getTransferableAmountDebtBufferRatio", "getTransferableAmountDebtRatio", "getRiskGrade", "()Ljava/lang/String;", "getRemindPriceDeviateRatio", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "MarginLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LeverConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LeverConfig> CREATOR = new C17618a();

    @Nullable
    private final BigDecimal borrowableDebtBufferRatio;

    @Nullable
    private final BigDecimal defaultLeverage;

    @Nullable
    private final BigDecimal earlyWarningDebtRatio;

    @Nullable
    private final BigDecimal liquidationDebtRatio;

    @Nullable
    private final BigDecimal maxAutoLoanDebtRatio;

    @NotNull
    private final BigDecimal maxLeverage;

    @Nullable
    private final BigDecimal remindPriceDeviateRatio;

    @Nullable
    private final String riskGrade;

    @Nullable
    private List<Double> riskGradeArray;

    @NotNull
    private final BigDecimal riskLeverage;

    @Nullable
    private final BigDecimal transferableAmountDebtBufferRatio;

    @Nullable
    private final BigDecimal transferableAmountDebtRatio;

    /* JADX INFO: renamed from: com.kubi.margin.entity.LeverConfig$a */
    /* JADX INFO: compiled from: LeverBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C17618a implements Parcelable.Creator<LeverConfig> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LeverConfig createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal2 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal3 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal4 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal5 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal6 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal7 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal8 = (BigDecimal) parcel.readSerializable();
            BigDecimal bigDecimal9 = (BigDecimal) parcel.readSerializable();
            String string = parcel.readString();
            BigDecimal bigDecimal10 = (BigDecimal) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(Double.valueOf(parcel.readDouble()));
                }
            }
            return new LeverConfig(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6, bigDecimal7, bigDecimal8, bigDecimal9, string, bigDecimal10, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LeverConfig[] newArray(int i11) {
            return new LeverConfig[i11];
        }
    }

    public LeverConfig() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeverConfig copy$default(LeverConfig leverConfig, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str, BigDecimal bigDecimal10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bigDecimal = leverConfig.borrowableDebtBufferRatio;
        }
        if ((i11 & 2) != 0) {
            bigDecimal2 = leverConfig.earlyWarningDebtRatio;
        }
        if ((i11 & 4) != 0) {
            bigDecimal3 = leverConfig.liquidationDebtRatio;
        }
        if ((i11 & 8) != 0) {
            bigDecimal4 = leverConfig.maxAutoLoanDebtRatio;
        }
        if ((i11 & 16) != 0) {
            bigDecimal5 = leverConfig.maxLeverage;
        }
        if ((i11 & 32) != 0) {
            bigDecimal6 = leverConfig.riskLeverage;
        }
        if ((i11 & 64) != 0) {
            bigDecimal7 = leverConfig.defaultLeverage;
        }
        if ((i11 & 128) != 0) {
            bigDecimal8 = leverConfig.transferableAmountDebtBufferRatio;
        }
        if ((i11 & 256) != 0) {
            bigDecimal9 = leverConfig.transferableAmountDebtRatio;
        }
        if ((i11 & 512) != 0) {
            str = leverConfig.riskGrade;
        }
        if ((i11 & 1024) != 0) {
            bigDecimal10 = leverConfig.remindPriceDeviateRatio;
        }
        if ((i11 & 2048) != 0) {
            list = leverConfig.riskGradeArray;
        }
        BigDecimal bigDecimal11 = bigDecimal10;
        List list2 = list;
        BigDecimal bigDecimal12 = bigDecimal9;
        String str2 = str;
        BigDecimal bigDecimal13 = bigDecimal7;
        BigDecimal bigDecimal14 = bigDecimal8;
        BigDecimal bigDecimal15 = bigDecimal5;
        BigDecimal bigDecimal16 = bigDecimal6;
        return leverConfig.copy(bigDecimal, bigDecimal2, bigDecimal3, bigDecimal4, bigDecimal15, bigDecimal16, bigDecimal13, bigDecimal14, bigDecimal12, str2, bigDecimal11, list2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LeverConfig)) {
            return false;
        }
        LeverConfig leverConfig = (LeverConfig) other;
        return Intrinsics.areEqual(this.borrowableDebtBufferRatio, leverConfig.borrowableDebtBufferRatio) && Intrinsics.areEqual(this.earlyWarningDebtRatio, leverConfig.earlyWarningDebtRatio) && Intrinsics.areEqual(this.liquidationDebtRatio, leverConfig.liquidationDebtRatio) && Intrinsics.areEqual(this.maxAutoLoanDebtRatio, leverConfig.maxAutoLoanDebtRatio) && Intrinsics.areEqual(this.maxLeverage, leverConfig.maxLeverage) && Intrinsics.areEqual(this.riskLeverage, leverConfig.riskLeverage) && Intrinsics.areEqual(this.defaultLeverage, leverConfig.defaultLeverage) && Intrinsics.areEqual(this.transferableAmountDebtBufferRatio, leverConfig.transferableAmountDebtBufferRatio) && Intrinsics.areEqual(this.transferableAmountDebtRatio, leverConfig.transferableAmountDebtRatio) && Intrinsics.areEqual(this.riskGrade, leverConfig.riskGrade) && Intrinsics.areEqual(this.remindPriceDeviateRatio, leverConfig.remindPriceDeviateRatio) && Intrinsics.areEqual(this.riskGradeArray, leverConfig.riskGradeArray);
    }

    public LeverConfig(@Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @NotNull BigDecimal maxLeverage, @NotNull BigDecimal riskLeverage, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable String str, @Nullable BigDecimal bigDecimal8, @Nullable List<Double> list) {
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(riskLeverage, "riskLeverage");
        this.borrowableDebtBufferRatio = bigDecimal;
        this.earlyWarningDebtRatio = bigDecimal2;
        this.liquidationDebtRatio = bigDecimal3;
        this.maxAutoLoanDebtRatio = bigDecimal4;
        this.maxLeverage = maxLeverage;
        this.riskLeverage = riskLeverage;
        this.defaultLeverage = bigDecimal5;
        this.transferableAmountDebtBufferRatio = bigDecimal6;
        this.transferableAmountDebtRatio = bigDecimal7;
        this.riskGrade = str;
        this.remindPriceDeviateRatio = bigDecimal8;
        this.riskGradeArray = list;
    }

    private final List<Double> component12() {
        return this.riskGradeArray;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BigDecimal getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getRemindPriceDeviateRatio() {
        return this.remindPriceDeviateRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BigDecimal getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BigDecimal getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BigDecimal getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    @NotNull
    public final LeverConfig copy(@Nullable BigDecimal borrowableDebtBufferRatio, @Nullable BigDecimal earlyWarningDebtRatio, @Nullable BigDecimal liquidationDebtRatio, @Nullable BigDecimal maxAutoLoanDebtRatio, @NotNull BigDecimal maxLeverage, @NotNull BigDecimal riskLeverage, @Nullable BigDecimal defaultLeverage, @Nullable BigDecimal transferableAmountDebtBufferRatio, @Nullable BigDecimal transferableAmountDebtRatio, @Nullable String riskGrade, @Nullable BigDecimal remindPriceDeviateRatio, @Nullable List<Double> riskGradeArray) {
        Intrinsics.checkNotNullParameter(maxLeverage, "maxLeverage");
        Intrinsics.checkNotNullParameter(riskLeverage, "riskLeverage");
        return new LeverConfig(borrowableDebtBufferRatio, earlyWarningDebtRatio, liquidationDebtRatio, maxAutoLoanDebtRatio, maxLeverage, riskLeverage, defaultLeverage, transferableAmountDebtBufferRatio, transferableAmountDebtRatio, riskGrade, remindPriceDeviateRatio, riskGradeArray);
    }

    @Nullable
    public final BigDecimal getBorrowableDebtBufferRatio() {
        return this.borrowableDebtBufferRatio;
    }

    @Nullable
    public final BigDecimal getDefaultLeverage() {
        return this.defaultLeverage;
    }

    @Nullable
    public final BigDecimal getEarlyWarningDebtRatio() {
        return this.earlyWarningDebtRatio;
    }

    @Nullable
    public final BigDecimal getLiquidationDebtRatio() {
        return this.liquidationDebtRatio;
    }

    @Nullable
    public final BigDecimal getMaxAutoLoanDebtRatio() {
        return this.maxAutoLoanDebtRatio;
    }

    @NotNull
    public final BigDecimal getMaxLeverage() {
        return this.maxLeverage;
    }

    @Nullable
    public final BigDecimal getRemindPriceDeviateRatio() {
        return this.remindPriceDeviateRatio;
    }

    @Nullable
    public final String getRiskGrade() {
        return this.riskGrade;
    }

    @NotNull
    public final BigDecimal getRiskLeverage() {
        return this.riskLeverage;
    }

    @Nullable
    public final BigDecimal getTransferableAmountDebtBufferRatio() {
        return this.transferableAmountDebtBufferRatio;
    }

    @Nullable
    public final BigDecimal getTransferableAmountDebtRatio() {
        return this.transferableAmountDebtRatio;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.borrowableDebtBufferRatio;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.earlyWarningDebtRatio;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.liquidationDebtRatio;
        int iHashCode3 = (iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.maxAutoLoanDebtRatio;
        int iHashCode4 = (((((iHashCode3 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31) + this.maxLeverage.hashCode()) * 31) + this.riskLeverage.hashCode()) * 31;
        BigDecimal bigDecimal5 = this.defaultLeverage;
        int iHashCode5 = (iHashCode4 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.transferableAmountDebtBufferRatio;
        int iHashCode6 = (iHashCode5 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.transferableAmountDebtRatio;
        int iHashCode7 = (iHashCode6 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        String str = this.riskGrade;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.remindPriceDeviateRatio;
        int iHashCode9 = (iHashCode8 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        List<Double> list = this.riskGradeArray;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "LeverConfig(borrowableDebtBufferRatio=" + this.borrowableDebtBufferRatio + ", earlyWarningDebtRatio=" + this.earlyWarningDebtRatio + ", liquidationDebtRatio=" + this.liquidationDebtRatio + ", maxAutoLoanDebtRatio=" + this.maxAutoLoanDebtRatio + ", maxLeverage=" + this.maxLeverage + ", riskLeverage=" + this.riskLeverage + ", defaultLeverage=" + this.defaultLeverage + ", transferableAmountDebtBufferRatio=" + this.transferableAmountDebtBufferRatio + ", transferableAmountDebtRatio=" + this.transferableAmountDebtRatio + ", riskGrade=" + this.riskGrade + ", remindPriceDeviateRatio=" + this.remindPriceDeviateRatio + ", riskGradeArray=" + this.riskGradeArray + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.borrowableDebtBufferRatio);
        dest.writeSerializable(this.earlyWarningDebtRatio);
        dest.writeSerializable(this.liquidationDebtRatio);
        dest.writeSerializable(this.maxAutoLoanDebtRatio);
        dest.writeSerializable(this.maxLeverage);
        dest.writeSerializable(this.riskLeverage);
        dest.writeSerializable(this.defaultLeverage);
        dest.writeSerializable(this.transferableAmountDebtBufferRatio);
        dest.writeSerializable(this.transferableAmountDebtRatio);
        dest.writeString(this.riskGrade);
        dest.writeSerializable(this.remindPriceDeviateRatio);
        List<Double> list = this.riskGradeArray;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            dest.writeDouble(it.next().doubleValue());
        }
    }

    public /* synthetic */ LeverConfig(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, BigDecimal bigDecimal9, String str, BigDecimal bigDecimal10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bigDecimal, (i11 & 2) != 0 ? null : bigDecimal2, (i11 & 4) != 0 ? null : bigDecimal3, (i11 & 8) != 0 ? null : bigDecimal4, (i11 & 16) != 0 ? new BigDecimal(5) : bigDecimal5, (i11 & 32) != 0 ? new BigDecimal(5) : bigDecimal6, (i11 & 64) != 0 ? new BigDecimal(3) : bigDecimal7, (i11 & 128) != 0 ? null : bigDecimal8, (i11 & 256) != 0 ? null : bigDecimal9, (i11 & 512) != 0 ? null : str, (i11 & 1024) != 0 ? null : bigDecimal10, (i11 & 2048) != 0 ? null : list);
    }
}
