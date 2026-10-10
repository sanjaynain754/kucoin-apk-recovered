package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: B2CEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003J¶\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010:J\u0006\u0010;\u001a\u00020\u0011J\u0013\u0010<\u001a\u00020\u00032\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020\u0011HÖ\u0001J\t\u0010@\u001a\u00020\u0007HÖ\u0001J\u0016\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0011R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d¨\u0006F"}, m90084d2 = {"Lcom/kubi/assets/entity/B2CLoanEntity;", "Landroid/os/Parcelable;", "autoPurchase", "", "createdAt", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyLoanMinUnit", "currencyName", TUIConstants.TUIGroupNotePlugin.PLUGIN_GROUP_NOTE_DEADLINE, "iconUrl", "interestRateUnit", "lendMinAmount", "maxInterestRate", "minInterestRate", "precision", "", "state", "yearInterestRate", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getAutoPurchase", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCreatedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "getCurrencyLoanMinUnit", "getCurrencyName", "getDeadline", "getIconUrl", "getInterestRateUnit", "getLendMinAmount", "getMaxInterestRate", "getMinInterestRate", "getPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getState", "getYearInterestRate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/B2CLoanEntity;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class B2CLoanEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<B2CLoanEntity> CREATOR = new Creator();

    @Nullable
    private final Boolean autoPurchase;

    @Nullable
    private final Long createdAt;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyLoanMinUnit;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String deadline;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String interestRateUnit;

    @Nullable
    private final String lendMinAmount;

    @Nullable
    private final String maxInterestRate;

    @Nullable
    private final String minInterestRate;

    @Nullable
    private final Integer precision;

    @Nullable
    private final String state;

    @Nullable
    private final String yearInterestRate;

    /* JADX INFO: compiled from: B2CEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<B2CLoanEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CLoanEntity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new B2CLoanEntity(boolValueOf, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final B2CLoanEntity[] newArray(int i11) {
            return new B2CLoanEntity[i11];
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
        if (!(other instanceof B2CLoanEntity)) {
            return false;
        }
        B2CLoanEntity b2CLoanEntity = (B2CLoanEntity) other;
        return Intrinsics.areEqual(this.autoPurchase, b2CLoanEntity.autoPurchase) && Intrinsics.areEqual(this.createdAt, b2CLoanEntity.createdAt) && Intrinsics.areEqual(this.currency, b2CLoanEntity.currency) && Intrinsics.areEqual(this.currencyLoanMinUnit, b2CLoanEntity.currencyLoanMinUnit) && Intrinsics.areEqual(this.currencyName, b2CLoanEntity.currencyName) && Intrinsics.areEqual(this.deadline, b2CLoanEntity.deadline) && Intrinsics.areEqual(this.iconUrl, b2CLoanEntity.iconUrl) && Intrinsics.areEqual(this.interestRateUnit, b2CLoanEntity.interestRateUnit) && Intrinsics.areEqual(this.lendMinAmount, b2CLoanEntity.lendMinAmount) && Intrinsics.areEqual(this.maxInterestRate, b2CLoanEntity.maxInterestRate) && Intrinsics.areEqual(this.minInterestRate, b2CLoanEntity.minInterestRate) && Intrinsics.areEqual(this.precision, b2CLoanEntity.precision) && Intrinsics.areEqual(this.state, b2CLoanEntity.state) && Intrinsics.areEqual(this.yearInterestRate, b2CLoanEntity.yearInterestRate);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getAutoPurchase() {
        return this.autoPurchase;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMinInterestRate() {
        return this.minInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getYearInterestRate() {
        return this.yearInterestRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeadline() {
        return this.deadline;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInterestRateUnit() {
        return this.interestRateUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLendMinAmount() {
        return this.lendMinAmount;
    }

    @NotNull
    public final B2CLoanEntity copy(@Nullable Boolean autoPurchase, @Nullable Long createdAt, @Nullable String currency, @Nullable String currencyLoanMinUnit, @Nullable String currencyName, @Nullable String deadline, @Nullable String iconUrl, @Nullable String interestRateUnit, @Nullable String lendMinAmount, @Nullable String maxInterestRate, @Nullable String minInterestRate, @Nullable Integer precision, @Nullable String state, @Nullable String yearInterestRate) {
        return new B2CLoanEntity(autoPurchase, createdAt, currency, currencyLoanMinUnit, currencyName, deadline, iconUrl, interestRateUnit, lendMinAmount, maxInterestRate, minInterestRate, precision, state, yearInterestRate);
    }

    @Nullable
    public final Boolean getAutoPurchase() {
        return this.autoPurchase;
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
    public final String getCurrencyLoanMinUnit() {
        return this.currencyLoanMinUnit;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getDeadline() {
        return this.deadline;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getInterestRateUnit() {
        return this.interestRateUnit;
    }

    @Nullable
    public final String getLendMinAmount() {
        return this.lendMinAmount;
    }

    @Nullable
    public final String getMaxInterestRate() {
        return this.maxInterestRate;
    }

    @Nullable
    public final String getMinInterestRate() {
        return this.minInterestRate;
    }

    @Nullable
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getYearInterestRate() {
        return this.yearInterestRate;
    }

    public int hashCode() {
        Boolean bool = this.autoPurchase;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l11 = this.createdAt;
        int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str = this.currency;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyLoanMinUnit;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyName;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deadline;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconUrl;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.interestRateUnit;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.lendMinAmount;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.maxInterestRate;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.minInterestRate;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Integer num = this.precision;
        int iHashCode12 = (iHashCode11 + (num == null ? 0 : num.hashCode())) * 31;
        String str10 = this.state;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.yearInterestRate;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "B2CLoanEntity(autoPurchase=" + this.autoPurchase + ", createdAt=" + this.createdAt + ", currency=" + this.currency + ", currencyLoanMinUnit=" + this.currencyLoanMinUnit + ", currencyName=" + this.currencyName + ", deadline=" + this.deadline + ", iconUrl=" + this.iconUrl + ", interestRateUnit=" + this.interestRateUnit + ", lendMinAmount=" + this.lendMinAmount + ", maxInterestRate=" + this.maxInterestRate + ", minInterestRate=" + this.minInterestRate + ", precision=" + this.precision + ", state=" + this.state + ", yearInterestRate=" + this.yearInterestRate + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.autoPurchase;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l11 = this.createdAt;
        if (l11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l11.longValue());
        }
        dest.writeString(this.currency);
        dest.writeString(this.currencyLoanMinUnit);
        dest.writeString(this.currencyName);
        dest.writeString(this.deadline);
        dest.writeString(this.iconUrl);
        dest.writeString(this.interestRateUnit);
        dest.writeString(this.lendMinAmount);
        dest.writeString(this.maxInterestRate);
        dest.writeString(this.minInterestRate);
        Integer num = this.precision;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.state);
        dest.writeString(this.yearInterestRate);
    }

    public B2CLoanEntity(@Nullable Boolean bool, @Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Integer num, @Nullable String str10, @Nullable String str11) {
        this.autoPurchase = bool;
        this.createdAt = l11;
        this.currency = str;
        this.currencyLoanMinUnit = str2;
        this.currencyName = str3;
        this.deadline = str4;
        this.iconUrl = str5;
        this.interestRateUnit = str6;
        this.lendMinAmount = str7;
        this.maxInterestRate = str8;
        this.minInterestRate = str9;
        this.precision = num;
        this.state = str10;
        this.yearInterestRate = str11;
    }
}
