package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: OtcBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0016\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006,"}, m90084d2 = {"Lcom/kubi/otc/entity/AdRule;", "Landroid/os/Parcelable;", "kycLevel", "", "legalTradeTimesLimitType", "legalTradeTimesLimit", "onlineStartDate", "onlineEndDate", "onlineTimeZone", "onlineType", "tradeTimeLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKycLevel", "()Ljava/lang/String;", "getLegalTradeTimesLimitType", "getLegalTradeTimesLimit", "getOnlineStartDate", "getOnlineEndDate", "getOnlineTimeZone", "getOnlineType", "getTradeTimeLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AdRule implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdRule> CREATOR = new Creator();

    @Nullable
    private final String kycLevel;

    @Nullable
    private final String legalTradeTimesLimit;

    @Nullable
    private final String legalTradeTimesLimitType;

    @Nullable
    private final String onlineEndDate;

    @Nullable
    private final String onlineStartDate;

    @Nullable
    private final String onlineTimeZone;

    @Nullable
    private final String onlineType;

    @Nullable
    private final String tradeTimeLimit;

    /* JADX INFO: compiled from: OtcBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<AdRule> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdRule createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdRule(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdRule[] newArray(int i11) {
            return new AdRule[i11];
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
        if (!(other instanceof AdRule)) {
            return false;
        }
        AdRule adRule = (AdRule) other;
        return Intrinsics.areEqual(this.kycLevel, adRule.kycLevel) && Intrinsics.areEqual(this.legalTradeTimesLimitType, adRule.legalTradeTimesLimitType) && Intrinsics.areEqual(this.legalTradeTimesLimit, adRule.legalTradeTimesLimit) && Intrinsics.areEqual(this.onlineStartDate, adRule.onlineStartDate) && Intrinsics.areEqual(this.onlineEndDate, adRule.onlineEndDate) && Intrinsics.areEqual(this.onlineTimeZone, adRule.onlineTimeZone) && Intrinsics.areEqual(this.onlineType, adRule.onlineType) && Intrinsics.areEqual(this.tradeTimeLimit, adRule.tradeTimeLimit);
    }

    public static /* synthetic */ AdRule copy$default(AdRule adRule, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = adRule.kycLevel;
        }
        if ((i11 & 2) != 0) {
            str2 = adRule.legalTradeTimesLimitType;
        }
        if ((i11 & 4) != 0) {
            str3 = adRule.legalTradeTimesLimit;
        }
        if ((i11 & 8) != 0) {
            str4 = adRule.onlineStartDate;
        }
        if ((i11 & 16) != 0) {
            str5 = adRule.onlineEndDate;
        }
        if ((i11 & 32) != 0) {
            str6 = adRule.onlineTimeZone;
        }
        if ((i11 & 64) != 0) {
            str7 = adRule.onlineType;
        }
        if ((i11 & 128) != 0) {
            str8 = adRule.tradeTimeLimit;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return adRule.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLegalTradeTimesLimitType() {
        return this.legalTradeTimesLimitType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLegalTradeTimesLimit() {
        return this.legalTradeTimesLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOnlineStartDate() {
        return this.onlineStartDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOnlineEndDate() {
        return this.onlineEndDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOnlineTimeZone() {
        return this.onlineTimeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOnlineType() {
        return this.onlineType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTradeTimeLimit() {
        return this.tradeTimeLimit;
    }

    @NotNull
    public final AdRule copy(@Nullable String kycLevel, @Nullable String legalTradeTimesLimitType, @Nullable String legalTradeTimesLimit, @Nullable String onlineStartDate, @Nullable String onlineEndDate, @Nullable String onlineTimeZone, @Nullable String onlineType, @Nullable String tradeTimeLimit) {
        return new AdRule(kycLevel, legalTradeTimesLimitType, legalTradeTimesLimit, onlineStartDate, onlineEndDate, onlineTimeZone, onlineType, tradeTimeLimit);
    }

    @Nullable
    public final String getKycLevel() {
        return this.kycLevel;
    }

    @Nullable
    public final String getLegalTradeTimesLimit() {
        return this.legalTradeTimesLimit;
    }

    @Nullable
    public final String getLegalTradeTimesLimitType() {
        return this.legalTradeTimesLimitType;
    }

    @Nullable
    public final String getOnlineEndDate() {
        return this.onlineEndDate;
    }

    @Nullable
    public final String getOnlineStartDate() {
        return this.onlineStartDate;
    }

    @Nullable
    public final String getOnlineTimeZone() {
        return this.onlineTimeZone;
    }

    @Nullable
    public final String getOnlineType() {
        return this.onlineType;
    }

    @Nullable
    public final String getTradeTimeLimit() {
        return this.tradeTimeLimit;
    }

    public int hashCode() {
        String str = this.kycLevel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.legalTradeTimesLimitType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.legalTradeTimesLimit;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.onlineStartDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.onlineEndDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.onlineTimeZone;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.onlineType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.tradeTimeLimit;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AdRule(kycLevel=" + this.kycLevel + ", legalTradeTimesLimitType=" + this.legalTradeTimesLimitType + ", legalTradeTimesLimit=" + this.legalTradeTimesLimit + ", onlineStartDate=" + this.onlineStartDate + ", onlineEndDate=" + this.onlineEndDate + ", onlineTimeZone=" + this.onlineTimeZone + ", onlineType=" + this.onlineType + ", tradeTimeLimit=" + this.tradeTimeLimit + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.kycLevel);
        dest.writeString(this.legalTradeTimesLimitType);
        dest.writeString(this.legalTradeTimesLimit);
        dest.writeString(this.onlineStartDate);
        dest.writeString(this.onlineEndDate);
        dest.writeString(this.onlineTimeZone);
        dest.writeString(this.onlineType);
        dest.writeString(this.tradeTimeLimit);
    }

    public AdRule(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.kycLevel = str;
        this.legalTradeTimesLimitType = str2;
        this.legalTradeTimesLimit = str3;
        this.onlineStartDate = str4;
        this.onlineEndDate = str5;
        this.onlineTimeZone = str6;
        this.onlineType = str7;
        this.tradeTimeLimit = str8;
    }
}
