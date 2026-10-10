package com.kubi.transfer.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchCoinEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010!J\t\u00102\u001a\u00020\u0011HÆ\u0003J¨\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00104J\u0006\u00105\u001a\u00020\u000fJ\u0013\u00106\u001a\u00020\u00112\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u000fHÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010#\"\u0004\b$\u0010%¨\u0006@"}, m90084d2 = {"Lcom/kubi/transfer/entity/AccountCoin;", "Landroid/os/Parcelable;", "accountType", "", "accountTag", FirebaseAnalytics.Param.CURRENCY, "currencyName", "currencyFullName", "iconUrl", "totalBalance", "availableBalance", "baseLegalCurrencyPrice", "totalBaseLegalCurrency", "availableBaseLegalCurrency", "precision", "", "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)V", "getAccountType", "()Ljava/lang/String;", "getAccountTag", "getCurrency", "getCurrencyName", "getCurrencyFullName", "getIconUrl", "getTotalBalance", "getAvailableBalance", "getBaseLegalCurrencyPrice", "getTotalBaseLegalCurrency", "getAvailableBaseLegalCurrency", "getPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Z)Lcom/kubi/transfer/entity/AccountCoin;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TransferLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AccountCoin implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountCoin> CREATOR = new C26306a();

    @Nullable
    private final String accountTag;

    @Nullable
    private final String accountType;

    @Nullable
    private final String availableBalance;

    @Nullable
    private final String availableBaseLegalCurrency;

    @Nullable
    private final String baseLegalCurrencyPrice;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyFullName;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String iconUrl;
    private boolean isSelected;

    @Nullable
    private final Integer precision;

    @Nullable
    private final String totalBalance;

    @Nullable
    private final String totalBaseLegalCurrency;

    /* JADX INFO: renamed from: com.kubi.transfer.entity.AccountCoin$a */
    /* JADX INFO: compiled from: SearchCoinEntity.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C26306a implements Parcelable.Creator<AccountCoin> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountCoin createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountCoin(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountCoin[] newArray(int i11) {
            return new AccountCoin[i11];
        }
    }

    public AccountCoin(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Integer num, boolean z11) {
        this.accountType = str;
        this.accountTag = str2;
        this.currency = str3;
        this.currencyName = str4;
        this.currencyFullName = str5;
        this.iconUrl = str6;
        this.totalBalance = str7;
        this.availableBalance = str8;
        this.baseLegalCurrencyPrice = str9;
        this.totalBaseLegalCurrency = str10;
        this.availableBaseLegalCurrency = str11;
        this.precision = num;
        this.isSelected = z11;
    }

    public static /* synthetic */ AccountCoin copy$default(AccountCoin accountCoin, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountCoin.accountType;
        }
        return accountCoin.copy(str, (i11 & 2) != 0 ? accountCoin.accountTag : str2, (i11 & 4) != 0 ? accountCoin.currency : str3, (i11 & 8) != 0 ? accountCoin.currencyName : str4, (i11 & 16) != 0 ? accountCoin.currencyFullName : str5, (i11 & 32) != 0 ? accountCoin.iconUrl : str6, (i11 & 64) != 0 ? accountCoin.totalBalance : str7, (i11 & 128) != 0 ? accountCoin.availableBalance : str8, (i11 & 256) != 0 ? accountCoin.baseLegalCurrencyPrice : str9, (i11 & 512) != 0 ? accountCoin.totalBaseLegalCurrency : str10, (i11 & 1024) != 0 ? accountCoin.availableBaseLegalCurrency : str11, (i11 & 2048) != 0 ? accountCoin.precision : num, (i11 & 4096) != 0 ? accountCoin.isSelected : z11);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountCoin)) {
            return false;
        }
        AccountCoin accountCoin = (AccountCoin) other;
        return Intrinsics.areEqual(this.accountType, accountCoin.accountType) && Intrinsics.areEqual(this.accountTag, accountCoin.accountTag) && Intrinsics.areEqual(this.currency, accountCoin.currency) && Intrinsics.areEqual(this.currencyName, accountCoin.currencyName) && Intrinsics.areEqual(this.currencyFullName, accountCoin.currencyFullName) && Intrinsics.areEqual(this.iconUrl, accountCoin.iconUrl) && Intrinsics.areEqual(this.totalBalance, accountCoin.totalBalance) && Intrinsics.areEqual(this.availableBalance, accountCoin.availableBalance) && Intrinsics.areEqual(this.baseLegalCurrencyPrice, accountCoin.baseLegalCurrencyPrice) && Intrinsics.areEqual(this.totalBaseLegalCurrency, accountCoin.totalBaseLegalCurrency) && Intrinsics.areEqual(this.availableBaseLegalCurrency, accountCoin.availableBaseLegalCurrency) && Intrinsics.areEqual(this.precision, accountCoin.precision) && this.isSelected == accountCoin.isSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTotalBaseLegalCurrency() {
        return this.totalBaseLegalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAvailableBaseLegalCurrency() {
        return this.availableBaseLegalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getPrecision() {
        return this.precision;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getBaseLegalCurrencyPrice() {
        return this.baseLegalCurrencyPrice;
    }

    @NotNull
    public final AccountCoin copy(@Nullable String accountType, @Nullable String accountTag, @Nullable String currency, @Nullable String currencyName, @Nullable String currencyFullName, @Nullable String iconUrl, @Nullable String totalBalance, @Nullable String availableBalance, @Nullable String baseLegalCurrencyPrice, @Nullable String totalBaseLegalCurrency, @Nullable String availableBaseLegalCurrency, @Nullable Integer precision, boolean isSelected) {
        return new AccountCoin(accountType, accountTag, currency, currencyName, currencyFullName, iconUrl, totalBalance, availableBalance, baseLegalCurrencyPrice, totalBaseLegalCurrency, availableBaseLegalCurrency, precision, isSelected);
    }

    @Nullable
    public final String getAccountTag() {
        return this.accountTag;
    }

    @Nullable
    public final String getAccountType() {
        return this.accountType;
    }

    @Nullable
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getAvailableBaseLegalCurrency() {
        return this.availableBaseLegalCurrency;
    }

    @Nullable
    public final String getBaseLegalCurrencyPrice() {
        return this.baseLegalCurrencyPrice;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    public final String getTotalBaseLegalCurrency() {
        return this.totalBaseLegalCurrency;
    }

    public int hashCode() {
        String str = this.accountType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.accountTag;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencyFullName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconUrl;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.totalBalance;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.availableBalance;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.baseLegalCurrencyPrice;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.totalBaseLegalCurrency;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.availableBaseLegalCurrency;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num = this.precision;
        return ((iHashCode11 + (num != null ? num.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSelected);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z11) {
        this.isSelected = z11;
    }

    @NotNull
    public String toString() {
        return "AccountCoin(accountType=" + this.accountType + ", accountTag=" + this.accountTag + ", currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", iconUrl=" + this.iconUrl + ", totalBalance=" + this.totalBalance + ", availableBalance=" + this.availableBalance + ", baseLegalCurrencyPrice=" + this.baseLegalCurrencyPrice + ", totalBaseLegalCurrency=" + this.totalBaseLegalCurrency + ", availableBaseLegalCurrency=" + this.availableBaseLegalCurrency + ", precision=" + this.precision + ", isSelected=" + this.isSelected + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.accountType);
        dest.writeString(this.accountTag);
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeString(this.currencyFullName);
        dest.writeString(this.iconUrl);
        dest.writeString(this.totalBalance);
        dest.writeString(this.availableBalance);
        dest.writeString(this.baseLegalCurrencyPrice);
        dest.writeString(this.totalBaseLegalCurrency);
        dest.writeString(this.availableBaseLegalCurrency);
        Integer num = this.precision;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeInt(this.isSelected ? 1 : 0);
    }

    public /* synthetic */ AccountCoin(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, num, (i11 & 4096) != 0 ? false : z11);
    }
}
