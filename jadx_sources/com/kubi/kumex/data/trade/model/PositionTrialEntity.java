package com.kubi.kumex.data.trade.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Serializable;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PositionEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B{\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0004HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0084\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020-HÖ\u0001J\t\u00103\u001a\u00020\u0004HÖ\u0001J\u0016\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020-R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001a¨\u00069"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "code", "", "prizeType", "expiredPeriod", "", FirebaseAnalytics.Param.CURRENCY, "faceValue", "Ljava/math/BigDecimal;", "withDrawHelpText", "helpText", "minTotalAmount", "minCloseRealisedPnl", "maxValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCode", "()Ljava/lang/String;", "getPrizeType", "getExpiredPeriod", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "getFaceValue", "()Ljava/math/BigDecimal;", "getWithDrawHelpText", "getHelpText", "getMinTotalAmount", "getMinCloseRealisedPnl", "getMaxValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class PositionTrialEntity implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<PositionTrialEntity> CREATOR = new C15839a();

    @NotNull
    private final String code;

    @Nullable
    private final String currency;

    @Nullable
    private final Long expiredPeriod;

    @Nullable
    private final BigDecimal faceValue;

    @Nullable
    private final String helpText;

    @Nullable
    private final BigDecimal maxValue;

    @Nullable
    private final BigDecimal minCloseRealisedPnl;

    @Nullable
    private final BigDecimal minTotalAmount;

    @Nullable
    private final String prizeType;

    @Nullable
    private final String withDrawHelpText;

    /* JADX INFO: renamed from: com.kubi.kumex.data.trade.model.PositionTrialEntity$a */
    /* JADX INFO: compiled from: PositionEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C15839a implements Parcelable.Creator<PositionTrialEntity> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PositionTrialEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PositionTrialEntity(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (BigDecimal) parcel.readSerializable(), parcel.readString(), parcel.readString(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable(), (BigDecimal) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PositionTrialEntity[] newArray(int i11) {
            return new PositionTrialEntity[i11];
        }
    }

    public PositionTrialEntity(@NotNull String code, @Nullable String str, @Nullable Long l11, @Nullable String str2, @Nullable BigDecimal bigDecimal, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.code = code;
        this.prizeType = str;
        this.expiredPeriod = l11;
        this.currency = str2;
        this.faceValue = bigDecimal;
        this.withDrawHelpText = str3;
        this.helpText = str4;
        this.minTotalAmount = bigDecimal2;
        this.minCloseRealisedPnl = bigDecimal3;
        this.maxValue = bigDecimal4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionTrialEntity)) {
            return false;
        }
        PositionTrialEntity positionTrialEntity = (PositionTrialEntity) other;
        return Intrinsics.areEqual(this.code, positionTrialEntity.code) && Intrinsics.areEqual(this.prizeType, positionTrialEntity.prizeType) && Intrinsics.areEqual(this.expiredPeriod, positionTrialEntity.expiredPeriod) && Intrinsics.areEqual(this.currency, positionTrialEntity.currency) && Intrinsics.areEqual(this.faceValue, positionTrialEntity.faceValue) && Intrinsics.areEqual(this.withDrawHelpText, positionTrialEntity.withDrawHelpText) && Intrinsics.areEqual(this.helpText, positionTrialEntity.helpText) && Intrinsics.areEqual(this.minTotalAmount, positionTrialEntity.minTotalAmount) && Intrinsics.areEqual(this.minCloseRealisedPnl, positionTrialEntity.minCloseRealisedPnl) && Intrinsics.areEqual(this.maxValue, positionTrialEntity.maxValue);
    }

    public static /* synthetic */ PositionTrialEntity copy$default(PositionTrialEntity positionTrialEntity, String str, String str2, Long l11, String str3, BigDecimal bigDecimal, String str4, String str5, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = positionTrialEntity.code;
        }
        if ((i11 & 2) != 0) {
            str2 = positionTrialEntity.prizeType;
        }
        if ((i11 & 4) != 0) {
            l11 = positionTrialEntity.expiredPeriod;
        }
        if ((i11 & 8) != 0) {
            str3 = positionTrialEntity.currency;
        }
        if ((i11 & 16) != 0) {
            bigDecimal = positionTrialEntity.faceValue;
        }
        if ((i11 & 32) != 0) {
            str4 = positionTrialEntity.withDrawHelpText;
        }
        if ((i11 & 64) != 0) {
            str5 = positionTrialEntity.helpText;
        }
        if ((i11 & 128) != 0) {
            bigDecimal2 = positionTrialEntity.minTotalAmount;
        }
        if ((i11 & 256) != 0) {
            bigDecimal3 = positionTrialEntity.minCloseRealisedPnl;
        }
        if ((i11 & 512) != 0) {
            bigDecimal4 = positionTrialEntity.maxValue;
        }
        BigDecimal bigDecimal5 = bigDecimal3;
        BigDecimal bigDecimal6 = bigDecimal4;
        String str6 = str5;
        BigDecimal bigDecimal7 = bigDecimal2;
        BigDecimal bigDecimal8 = bigDecimal;
        String str7 = str4;
        return positionTrialEntity.copy(str, str2, l11, str3, bigDecimal8, str7, str6, bigDecimal7, bigDecimal5, bigDecimal6);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getExpiredPeriod() {
        return this.expiredPeriod;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWithDrawHelpText() {
        return this.withDrawHelpText;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHelpText() {
        return this.helpText;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getMinTotalAmount() {
        return this.minTotalAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getMinCloseRealisedPnl() {
        return this.minCloseRealisedPnl;
    }

    @NotNull
    public final PositionTrialEntity copy(@NotNull String code, @Nullable String prizeType, @Nullable Long expiredPeriod, @Nullable String currency, @Nullable BigDecimal faceValue, @Nullable String withDrawHelpText, @Nullable String helpText, @Nullable BigDecimal minTotalAmount, @Nullable BigDecimal minCloseRealisedPnl, @Nullable BigDecimal maxValue) {
        Intrinsics.checkNotNullParameter(code, "code");
        return new PositionTrialEntity(code, prizeType, expiredPeriod, currency, faceValue, withDrawHelpText, helpText, minTotalAmount, minCloseRealisedPnl, maxValue);
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Long getExpiredPeriod() {
        return this.expiredPeriod;
    }

    @Nullable
    public final BigDecimal getFaceValue() {
        return this.faceValue;
    }

    @Nullable
    public final String getHelpText() {
        return this.helpText;
    }

    @Nullable
    public final BigDecimal getMaxValue() {
        return this.maxValue;
    }

    @Nullable
    public final BigDecimal getMinCloseRealisedPnl() {
        return this.minCloseRealisedPnl;
    }

    @Nullable
    public final BigDecimal getMinTotalAmount() {
        return this.minTotalAmount;
    }

    @Nullable
    public final String getPrizeType() {
        return this.prizeType;
    }

    @Nullable
    public final String getWithDrawHelpText() {
        return this.withDrawHelpText;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.prizeType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.expiredPeriod;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str2 = this.currency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BigDecimal bigDecimal = this.faceValue;
        int iHashCode5 = (iHashCode4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str3 = this.withDrawHelpText;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.helpText;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.minTotalAmount;
        int iHashCode8 = (iHashCode7 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.minCloseRealisedPnl;
        int iHashCode9 = (iHashCode8 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.maxValue;
        return iHashCode9 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PositionTrialEntity(code=" + this.code + ", prizeType=" + this.prizeType + ", expiredPeriod=" + this.expiredPeriod + ", currency=" + this.currency + ", faceValue=" + this.faceValue + ", withDrawHelpText=" + this.withDrawHelpText + ", helpText=" + this.helpText + ", minTotalAmount=" + this.minTotalAmount + ", minCloseRealisedPnl=" + this.minCloseRealisedPnl + ", maxValue=" + this.maxValue + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.code);
        dest.writeString(this.prizeType);
        Long l11 = this.expiredPeriod;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        dest.writeSerializable(this.faceValue);
        dest.writeString(this.withDrawHelpText);
        dest.writeString(this.helpText);
        dest.writeSerializable(this.minTotalAmount);
        dest.writeSerializable(this.minCloseRealisedPnl);
        dest.writeSerializable(this.maxValue);
    }

    public /* synthetic */ PositionTrialEntity(String str, String str2, Long l11, String str3, BigDecimal bigDecimal, String str4, String str5, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : bigDecimal, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : bigDecimal2, (i11 & 256) != 0 ? null : bigDecimal3, (i11 & 512) != 0 ? null : bigDecimal4);
    }
}
