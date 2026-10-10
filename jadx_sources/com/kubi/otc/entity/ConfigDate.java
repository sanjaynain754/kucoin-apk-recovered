package com.kubi.otc.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0013R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\""}, m90084d2 = {"Lcom/kubi/otc/entity/ConfigDate;", "Landroid/os/Parcelable;", "cardSetting", "Lcom/kubi/otc/entity/ConfigDate$CardSetting;", "sepaCardSetting", "riskInfo", "Lcom/kubi/otc/entity/ConfigDate$RiskInfo;", "<init>", "(Lcom/kubi/otc/entity/ConfigDate$CardSetting;Lcom/kubi/otc/entity/ConfigDate$CardSetting;Lcom/kubi/otc/entity/ConfigDate$RiskInfo;)V", "getCardSetting", "()Lcom/kubi/otc/entity/ConfigDate$CardSetting;", "getSepaCardSetting", "getRiskInfo", "()Lcom/kubi/otc/entity/ConfigDate$RiskInfo;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "CardSetting", "RiskInfo", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class ConfigDate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConfigDate> CREATOR = new Creator();

    @SerializedName("card_setting")
    @Nullable
    private final CardSetting cardSetting;

    @SerializedName("risk_info")
    @Nullable
    private final RiskInfo riskInfo;

    @SerializedName("sepa_payout_card_setting")
    @Nullable
    private final CardSetting sepaCardSetting;

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/otc/entity/ConfigDate$CardSetting;", "Landroid/os/Parcelable;", "maxNum", "", "<init>", "(Ljava/lang/String;)V", "getMaxNum", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class CardSetting implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CardSetting> CREATOR = new Creator();

        @SerializedName("max_cards")
        @Nullable
        private final String maxNum;

        /* JADX INFO: compiled from: FiatBean.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<CardSetting> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardSetting createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardSetting(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final CardSetting[] newArray(int i11) {
                return new CardSetting[i11];
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
            return (other instanceof CardSetting) && Intrinsics.areEqual(this.maxNum, ((CardSetting) other).maxNum);
        }

        public static /* synthetic */ CardSetting copy$default(CardSetting cardSetting, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = cardSetting.maxNum;
            }
            return cardSetting.copy(str);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMaxNum() {
            return this.maxNum;
        }

        @NotNull
        public final CardSetting copy(@Nullable String maxNum) {
            return new CardSetting(maxNum);
        }

        @Nullable
        public final String getMaxNum() {
            return this.maxNum;
        }

        public int hashCode() {
            String str = this.maxNum;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return "CardSetting(maxNum=" + this.maxNum + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.maxNum);
        }

        public CardSetting(@Nullable String str) {
            this.maxNum = str;
        }
    }

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<ConfigDate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigDate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfigDate(parcel.readInt() == 0 ? null : CardSetting.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CardSetting.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? RiskInfo.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfigDate[] newArray(int i11) {
            return new ConfigDate[i11];
        }
    }

    /* JADX INFO: compiled from: FiatBean.kt */
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/otc/entity/ConfigDate$RiskInfo;", "Landroid/os/Parcelable;", "cybsUrl", "", "orgId", "merchantId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCybsUrl", "()Ljava/lang/String;", "getOrgId", "getMerchantId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RiskInfo implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<RiskInfo> CREATOR = new Creator();

        @SerializedName("cybs_url")
        @Nullable
        private final String cybsUrl;

        @SerializedName("merchant_id")
        @Nullable
        private final String merchantId;

        @SerializedName("org_id")
        @Nullable
        private final String orgId;

        /* JADX INFO: compiled from: FiatBean.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class Creator implements Parcelable.Creator<RiskInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskInfo createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RiskInfo(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RiskInfo[] newArray(int i11) {
                return new RiskInfo[i11];
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
            if (!(other instanceof RiskInfo)) {
                return false;
            }
            RiskInfo riskInfo = (RiskInfo) other;
            return Intrinsics.areEqual(this.cybsUrl, riskInfo.cybsUrl) && Intrinsics.areEqual(this.orgId, riskInfo.orgId) && Intrinsics.areEqual(this.merchantId, riskInfo.merchantId);
        }

        public static /* synthetic */ RiskInfo copy$default(RiskInfo riskInfo, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = riskInfo.cybsUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = riskInfo.orgId;
            }
            if ((i11 & 4) != 0) {
                str3 = riskInfo.merchantId;
            }
            return riskInfo.copy(str, str2, str3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCybsUrl() {
            return this.cybsUrl;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOrgId() {
            return this.orgId;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getMerchantId() {
            return this.merchantId;
        }

        @NotNull
        public final RiskInfo copy(@Nullable String cybsUrl, @Nullable String orgId, @Nullable String merchantId) {
            return new RiskInfo(cybsUrl, orgId, merchantId);
        }

        @Nullable
        public final String getCybsUrl() {
            return this.cybsUrl;
        }

        @Nullable
        public final String getMerchantId() {
            return this.merchantId;
        }

        @Nullable
        public final String getOrgId() {
            return this.orgId;
        }

        public int hashCode() {
            String str = this.cybsUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.orgId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.merchantId;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RiskInfo(cybsUrl=" + this.cybsUrl + ", orgId=" + this.orgId + ", merchantId=" + this.merchantId + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.cybsUrl);
            dest.writeString(this.orgId);
            dest.writeString(this.merchantId);
        }

        public RiskInfo(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.cybsUrl = str;
            this.orgId = str2;
            this.merchantId = str3;
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
        if (!(other instanceof ConfigDate)) {
            return false;
        }
        ConfigDate configDate = (ConfigDate) other;
        return Intrinsics.areEqual(this.cardSetting, configDate.cardSetting) && Intrinsics.areEqual(this.sepaCardSetting, configDate.sepaCardSetting) && Intrinsics.areEqual(this.riskInfo, configDate.riskInfo);
    }

    public static /* synthetic */ ConfigDate copy$default(ConfigDate configDate, CardSetting cardSetting, CardSetting cardSetting2, RiskInfo riskInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cardSetting = configDate.cardSetting;
        }
        if ((i11 & 2) != 0) {
            cardSetting2 = configDate.sepaCardSetting;
        }
        if ((i11 & 4) != 0) {
            riskInfo = configDate.riskInfo;
        }
        return configDate.copy(cardSetting, cardSetting2, riskInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final CardSetting getCardSetting() {
        return this.cardSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CardSetting getSepaCardSetting() {
        return this.sepaCardSetting;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RiskInfo getRiskInfo() {
        return this.riskInfo;
    }

    @NotNull
    public final ConfigDate copy(@Nullable CardSetting cardSetting, @Nullable CardSetting sepaCardSetting, @Nullable RiskInfo riskInfo) {
        return new ConfigDate(cardSetting, sepaCardSetting, riskInfo);
    }

    @Nullable
    public final CardSetting getCardSetting() {
        return this.cardSetting;
    }

    @Nullable
    public final RiskInfo getRiskInfo() {
        return this.riskInfo;
    }

    @Nullable
    public final CardSetting getSepaCardSetting() {
        return this.sepaCardSetting;
    }

    public int hashCode() {
        CardSetting cardSetting = this.cardSetting;
        int iHashCode = (cardSetting == null ? 0 : cardSetting.hashCode()) * 31;
        CardSetting cardSetting2 = this.sepaCardSetting;
        int iHashCode2 = (iHashCode + (cardSetting2 == null ? 0 : cardSetting2.hashCode())) * 31;
        RiskInfo riskInfo = this.riskInfo;
        return iHashCode2 + (riskInfo != null ? riskInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ConfigDate(cardSetting=" + this.cardSetting + ", sepaCardSetting=" + this.sepaCardSetting + ", riskInfo=" + this.riskInfo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CardSetting cardSetting = this.cardSetting;
        if (cardSetting == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardSetting.writeToParcel(dest, flags);
        }
        CardSetting cardSetting2 = this.sepaCardSetting;
        if (cardSetting2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cardSetting2.writeToParcel(dest, flags);
        }
        RiskInfo riskInfo = this.riskInfo;
        if (riskInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            riskInfo.writeToParcel(dest, flags);
        }
    }

    public ConfigDate(@Nullable CardSetting cardSetting, @Nullable CardSetting cardSetting2, @Nullable RiskInfo riskInfo) {
        this.cardSetting = cardSetting;
        this.sepaCardSetting = cardSetting2;
        this.riskInfo = riskInfo;
    }
}
