package com.kubi.kumex.data.market.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.fasterxml.jackson.databind.node.C6447a;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: FundingRateEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0001LB¯\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010*\u001a\u00020\u0006J\u0006\u0010+\u001a\u00020\nJ\b\u0010,\u001a\u0004\u0018\u00010\nJ\u0012\u0010-\u001a\u0004\u0018\u00010\n2\b\u0010.\u001a\u0004\u0018\u00010\nJ\b\u0010/\u001a\u00020\u0003H\u0002J\u0010\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00102\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010(J¶\u0001\u0010>\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010?J\u0006\u0010@\u001a\u00020\u0013J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010DHÖ\u0003J\t\u0010E\u001a\u00020\u0013HÖ\u0001J\t\u0010F\u001a\u00020\u0006HÖ\u0001J\u0016\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0013R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001d\u0010\u0017R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(¨\u0006M"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "Landroid/os/Parcelable;", "remainSettleTime", "", "settleTime", "symbol", "", "granularity", "currentFundingRateGranularity", "lastFundingRate", "Ljava/math/BigDecimal;", "lastTimeFundingRate", "fundingRate", "predictedValue", "predictedFundingRate", "fundingRateCap", "fundingRateFloor", "dailyInterestRate", "period", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)V", "getRemainSettleTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSettleTime", "getSymbol", "()Ljava/lang/String;", "getGranularity", "getCurrentFundingRateGranularity", "getLastFundingRate", "()Ljava/math/BigDecimal;", "getLastTimeFundingRate", "getFundingRate", "getPredictedValue", "getPredictedFundingRate", "getFundingRateCap", "getFundingRateFloor", "getDailyInterestRate", "getPeriod", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPeriodHour", "getPeriodHours", "getCurrentFundingRate", "getAnnualizedFundingRate", "rate", "getPeriodMillis", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Integer;)Lcom/kubi/kumex/data/market/model/FundingRateEntity;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFundingRateEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FundingRateEntity.kt\ncom/kubi/kumex/data/market/model/FundingRateEntity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final /* data */ class FundingRateEntity implements Parcelable {

    @Deprecated
    public static final int ANNUALIZED_SCALE = 16;

    @Deprecated
    public static final long DEFAULT_FUNDING_PERIOD_HOURS = 8;

    @Deprecated
    public static final long DEFAULT_FUNDING_PERIOD_MILLIS = 28800000;

    @Deprecated
    public static final int PERIOD_HOUR_DISPLAY_SCALE = 4;

    @Nullable
    private final Long currentFundingRateGranularity;

    @Nullable
    private final BigDecimal dailyInterestRate;

    @Nullable
    private final BigDecimal fundingRate;

    @Nullable
    private final BigDecimal fundingRateCap;

    @Nullable
    private final BigDecimal fundingRateFloor;

    @Nullable
    private final Long granularity;

    @Nullable
    private final BigDecimal lastFundingRate;

    @Nullable
    private final BigDecimal lastTimeFundingRate;

    @Nullable
    private final Integer period;

    @SerializedName("predictedFundingRate")
    @Nullable
    private final BigDecimal predictedFundingRate;

    @Nullable
    private final BigDecimal predictedValue;

    @Nullable
    private final Long remainSettleTime;

    @Nullable
    private final Long settleTime;

    @Nullable
    private final String symbol;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<FundingRateEntity> CREATOR = new C15778a();

    @Deprecated
    public static final long MILLIS_PER_HOUR = 3600000;
    private static final BigDecimal MILLIS_PER_HOUR_BD = BigDecimal.valueOf(MILLIS_PER_HOUR);
    private static final BigDecimal ANNUAL_MILLIS_BD = BigDecimal.valueOf(31536000000L);

    /* JADX INFO: compiled from: FundingRateEntity.kt */
    @Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\n \r*\u0004\u0018\u00010\f0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/data/market/model/FundingRateEntity$Companion;", "", "<init>", "()V", "MILLIS_PER_HOUR", "", "DEFAULT_FUNDING_PERIOD_HOURS", "DEFAULT_FUNDING_PERIOD_MILLIS", "PERIOD_HOUR_DISPLAY_SCALE", "", "ANNUALIZED_SCALE", "MILLIS_PER_HOUR_BD", "Ljava/math/BigDecimal;", "kotlin.jvm.PlatformType", "getMILLIS_PER_HOUR_BD", "()Ljava/math/BigDecimal;", "ANNUAL_MILLIS_BD", "getANNUAL_MILLIS_BD", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final BigDecimal getANNUAL_MILLIS_BD() {
            return FundingRateEntity.ANNUAL_MILLIS_BD;
        }

        public final BigDecimal getMILLIS_PER_HOUR_BD() {
            return FundingRateEntity.MILLIS_PER_HOUR_BD;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kumex.data.market.model.FundingRateEntity$a */
    /* JADX INFO: compiled from: FundingRateEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15778a implements Parcelable.Creator<FundingRateEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FundingRateEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FundingRateEntity(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final FundingRateEntity[] newArray(int i11) {
            return new FundingRateEntity[i11];
        }
    }

    public FundingRateEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FundingRateEntity)) {
            return false;
        }
        FundingRateEntity fundingRateEntity = (FundingRateEntity) other;
        return Intrinsics.areEqual(this.remainSettleTime, fundingRateEntity.remainSettleTime) && Intrinsics.areEqual(this.settleTime, fundingRateEntity.settleTime) && Intrinsics.areEqual(this.symbol, fundingRateEntity.symbol) && Intrinsics.areEqual(this.granularity, fundingRateEntity.granularity) && Intrinsics.areEqual(this.currentFundingRateGranularity, fundingRateEntity.currentFundingRateGranularity) && Intrinsics.areEqual(this.lastFundingRate, fundingRateEntity.lastFundingRate) && Intrinsics.areEqual(this.lastTimeFundingRate, fundingRateEntity.lastTimeFundingRate) && Intrinsics.areEqual(this.fundingRate, fundingRateEntity.fundingRate) && Intrinsics.areEqual(this.predictedValue, fundingRateEntity.predictedValue) && Intrinsics.areEqual(this.predictedFundingRate, fundingRateEntity.predictedFundingRate) && Intrinsics.areEqual(this.fundingRateCap, fundingRateEntity.fundingRateCap) && Intrinsics.areEqual(this.fundingRateFloor, fundingRateEntity.fundingRateFloor) && Intrinsics.areEqual(this.dailyInterestRate, fundingRateEntity.dailyInterestRate) && Intrinsics.areEqual(this.period, fundingRateEntity.period);
    }

    public FundingRateEntity(@Nullable Long l11, @Nullable Long l12, @Nullable String str, @Nullable Long l13, @Nullable Long l14, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7, @Nullable BigDecimal bigDecimal8, @Nullable Integer num) {
        this.remainSettleTime = l11;
        this.settleTime = l12;
        this.symbol = str;
        this.granularity = l13;
        this.currentFundingRateGranularity = l14;
        this.lastFundingRate = bigDecimal;
        this.lastTimeFundingRate = bigDecimal2;
        this.fundingRate = bigDecimal3;
        this.predictedValue = bigDecimal4;
        this.predictedFundingRate = bigDecimal5;
        this.fundingRateCap = bigDecimal6;
        this.fundingRateFloor = bigDecimal7;
        this.dailyInterestRate = bigDecimal8;
        this.period = num;
    }

    private final long getPeriodMillis() {
        Long l11 = this.currentFundingRateGranularity;
        Long l12 = null;
        if (l11 != null) {
            if (l11.longValue() <= 0) {
                l11 = null;
            }
            if (l11 != null) {
                return l11.longValue();
            }
        }
        Long l13 = this.granularity;
        if (l13 != null && l13.longValue() > 0) {
            l12 = l13;
        }
        return l12 != null ? l12.longValue() : DEFAULT_FUNDING_PERIOD_MILLIS;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getRemainSettleTime() {
        return this.remainSettleTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getPredictedFundingRate() {
        return this.predictedFundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getFundingRateCap() {
        return this.fundingRateCap;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final BigDecimal getFundingRateFloor() {
        return this.fundingRateFloor;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final BigDecimal getDailyInterestRate() {
        return this.dailyInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getPeriod() {
        return this.period;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getSettleTime() {
        return this.settleTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getGranularity() {
        return this.granularity;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getCurrentFundingRateGranularity() {
        return this.currentFundingRateGranularity;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getLastFundingRate() {
        return this.lastFundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getLastTimeFundingRate() {
        return this.lastTimeFundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getPredictedValue() {
        return this.predictedValue;
    }

    @NotNull
    public final FundingRateEntity copy(@Nullable Long remainSettleTime, @Nullable Long settleTime, @Nullable String symbol, @Nullable Long granularity, @Nullable Long currentFundingRateGranularity, @Nullable BigDecimal lastFundingRate, @Nullable BigDecimal lastTimeFundingRate, @Nullable BigDecimal fundingRate, @Nullable BigDecimal predictedValue, @Nullable BigDecimal predictedFundingRate, @Nullable BigDecimal fundingRateCap, @Nullable BigDecimal fundingRateFloor, @Nullable BigDecimal dailyInterestRate, @Nullable Integer period) {
        return new FundingRateEntity(remainSettleTime, settleTime, symbol, granularity, currentFundingRateGranularity, lastFundingRate, lastTimeFundingRate, fundingRate, predictedValue, predictedFundingRate, fundingRateCap, fundingRateFloor, dailyInterestRate, period);
    }

    @Nullable
    public final BigDecimal getAnnualizedFundingRate(@Nullable BigDecimal rate) {
        BigDecimal bigDecimalMultiply;
        if (rate == null || (bigDecimalMultiply = rate.multiply(ANNUAL_MILLIS_BD)) == null) {
            return null;
        }
        return bigDecimalMultiply.divide(BigDecimal.valueOf(getPeriodMillis()), 16, RoundingMode.HALF_UP);
    }

    @Nullable
    public final BigDecimal getCurrentFundingRate() {
        return this.lastFundingRate;
    }

    @Nullable
    public final Long getCurrentFundingRateGranularity() {
        return this.currentFundingRateGranularity;
    }

    @Nullable
    public final BigDecimal getDailyInterestRate() {
        return this.dailyInterestRate;
    }

    @Nullable
    public final BigDecimal getFundingRate() {
        return this.fundingRate;
    }

    @Nullable
    public final BigDecimal getFundingRateCap() {
        return this.fundingRateCap;
    }

    @Nullable
    public final BigDecimal getFundingRateFloor() {
        return this.fundingRateFloor;
    }

    @Nullable
    public final Long getGranularity() {
        return this.granularity;
    }

    @Nullable
    public final BigDecimal getLastFundingRate() {
        return this.lastFundingRate;
    }

    @Nullable
    public final BigDecimal getLastTimeFundingRate() {
        return this.lastTimeFundingRate;
    }

    @Nullable
    public final Integer getPeriod() {
        return this.period;
    }

    @Nullable
    public final BigDecimal getPredictedFundingRate() {
        return this.predictedFundingRate;
    }

    @Nullable
    public final BigDecimal getPredictedValue() {
        return this.predictedValue;
    }

    @Nullable
    public final Long getRemainSettleTime() {
        return this.remainSettleTime;
    }

    @Nullable
    public final Long getSettleTime() {
        return this.settleTime;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        Long l11 = this.remainSettleTime;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        Long l12 = this.settleTime;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.symbol;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l13 = this.granularity;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.currentFundingRateGranularity;
        int iHashCode5 = (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31;
        BigDecimal bigDecimal = this.lastFundingRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.lastTimeFundingRate;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.fundingRate;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.predictedValue;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.predictedFundingRate;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.fundingRateCap;
        int iHashCode11 = (iHashCode10 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.fundingRateFloor;
        int iHashCode12 = (iHashCode11 + (bigDecimal7 == null ? 0 : bigDecimal7.hashCode())) * 31;
        BigDecimal bigDecimal8 = this.dailyInterestRate;
        int iHashCode13 = (iHashCode12 + (bigDecimal8 == null ? 0 : bigDecimal8.hashCode())) * 31;
        Integer num = this.period;
        return iHashCode13 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FundingRateEntity(remainSettleTime=" + this.remainSettleTime + ", settleTime=" + this.settleTime + ", symbol=" + this.symbol + ", granularity=" + this.granularity + ", currentFundingRateGranularity=" + this.currentFundingRateGranularity + ", lastFundingRate=" + this.lastFundingRate + ", lastTimeFundingRate=" + this.lastTimeFundingRate + ", fundingRate=" + this.fundingRate + ", predictedValue=" + this.predictedValue + ", predictedFundingRate=" + this.predictedFundingRate + ", fundingRateCap=" + this.fundingRateCap + ", fundingRateFloor=" + this.fundingRateFloor + ", dailyInterestRate=" + this.dailyInterestRate + ", period=" + this.period + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l11 = this.remainSettleTime;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        Long l12 = this.settleTime;
        if (l12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l12.longValue());
        }
        dest.writeString(this.symbol);
        Long l13 = this.granularity;
        if (l13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l13.longValue());
        }
        Long l14 = this.currentFundingRateGranularity;
        if (l14 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l14.longValue());
        }
        dest.writeSerializable(this.lastFundingRate);
        dest.writeSerializable(this.lastTimeFundingRate);
        dest.writeSerializable(this.fundingRate);
        dest.writeSerializable(this.predictedValue);
        dest.writeSerializable(this.predictedFundingRate);
        dest.writeSerializable(this.fundingRateCap);
        dest.writeSerializable(this.fundingRateFloor);
        dest.writeSerializable(this.dailyInterestRate);
        Integer num = this.period;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
    }

    @NotNull
    public final String getPeriodHour() {
        BigDecimal periodHours = getPeriodHours();
        if (periodHours.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {
            String plainString = periodHours.setScale(0, RoundingMode.UNNECESSARY).toPlainString();
            Intrinsics.checkNotNull(plainString);
            return plainString;
        }
        String plainString2 = C6447a.m11724a(periodHours.setScale(4, RoundingMode.HALF_UP)).toPlainString();
        Intrinsics.checkNotNull(plainString2);
        return plainString2;
    }

    @NotNull
    public final BigDecimal getPeriodHours() {
        BigDecimal bigDecimalDivide = BigDecimal.valueOf(getPeriodMillis()).divide(MILLIS_PER_HOUR_BD, 16, RoundingMode.HALF_UP);
        Intrinsics.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    public /* synthetic */ FundingRateEntity(Long l11, Long l12, String str, Long l13, Long l14, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, BigDecimal bigDecimal6, BigDecimal bigDecimal7, BigDecimal bigDecimal8, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : l12, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : l13, (i11 & 16) != 0 ? null : l14, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : bigDecimal5, (i11 & 1024) != 0 ? null : bigDecimal6, (i11 & 2048) != 0 ? null : bigDecimal7, (i11 & 4096) != 0 ? null : bigDecimal8, (i11 & 8192) != 0 ? null : num);
    }
}
