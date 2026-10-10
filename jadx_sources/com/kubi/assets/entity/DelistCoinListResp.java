package com.kubi.assets.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DelistCoinListResp.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0092\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010+J\u0006\u0010,\u001a\u00020\nJ\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\nHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u00068"}, m90084d2 = {"Lcom/kubi/assets/entity/DelistCoinListResp;", "Landroid/os/Parcelable;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "currencyFullName", "currencyIcon", "currencyStatus", "balance", "withdrawPrecision", "", "chainId", "chainName", "chainFullName", "withdrawMemo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyName", "getCurrencyFullName", "getCurrencyIcon", "getCurrencyStatus", "getBalance", "getWithdrawPrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getChainId", "getChainName", "getChainFullName", "getWithdrawMemo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/DelistCoinListResp;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class DelistCoinListResp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DelistCoinListResp> CREATOR = new Creator();

    @Nullable
    private final String balance;

    @Nullable
    private final String chainFullName;

    @Nullable
    private final String chainId;

    @Nullable
    private final String chainName;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyFullName;

    @Nullable
    private final String currencyIcon;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String currencyStatus;

    @Nullable
    private final String withdrawMemo;

    @Nullable
    private final Integer withdrawPrecision;

    /* JADX INFO: compiled from: DelistCoinListResp.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Creator implements Parcelable.Creator<DelistCoinListResp> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DelistCoinListResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DelistCoinListResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DelistCoinListResp[] newArray(int i11) {
            return new DelistCoinListResp[i11];
        }
    }

    public DelistCoinListResp() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelistCoinListResp)) {
            return false;
        }
        DelistCoinListResp delistCoinListResp = (DelistCoinListResp) other;
        return Intrinsics.areEqual(this.currency, delistCoinListResp.currency) && Intrinsics.areEqual(this.currencyName, delistCoinListResp.currencyName) && Intrinsics.areEqual(this.currencyFullName, delistCoinListResp.currencyFullName) && Intrinsics.areEqual(this.currencyIcon, delistCoinListResp.currencyIcon) && Intrinsics.areEqual(this.currencyStatus, delistCoinListResp.currencyStatus) && Intrinsics.areEqual(this.balance, delistCoinListResp.balance) && Intrinsics.areEqual(this.withdrawPrecision, delistCoinListResp.withdrawPrecision) && Intrinsics.areEqual(this.chainId, delistCoinListResp.chainId) && Intrinsics.areEqual(this.chainName, delistCoinListResp.chainName) && Intrinsics.areEqual(this.chainFullName, delistCoinListResp.chainFullName) && Intrinsics.areEqual(this.withdrawMemo, delistCoinListResp.withdrawMemo);
    }

    public DelistCoinListResp(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.currency = str;
        this.currencyName = str2;
        this.currencyFullName = str3;
        this.currencyIcon = str4;
        this.currencyStatus = str5;
        this.balance = str6;
        this.withdrawPrecision = num;
        this.chainId = str7;
        this.chainName = str8;
        this.chainFullName = str9;
        this.withdrawMemo = str10;
    }

    public static /* synthetic */ DelistCoinListResp copy$default(DelistCoinListResp delistCoinListResp, String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = delistCoinListResp.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = delistCoinListResp.currencyName;
        }
        if ((i11 & 4) != 0) {
            str3 = delistCoinListResp.currencyFullName;
        }
        if ((i11 & 8) != 0) {
            str4 = delistCoinListResp.currencyIcon;
        }
        if ((i11 & 16) != 0) {
            str5 = delistCoinListResp.currencyStatus;
        }
        if ((i11 & 32) != 0) {
            str6 = delistCoinListResp.balance;
        }
        if ((i11 & 64) != 0) {
            num = delistCoinListResp.withdrawPrecision;
        }
        if ((i11 & 128) != 0) {
            str7 = delistCoinListResp.chainId;
        }
        if ((i11 & 256) != 0) {
            str8 = delistCoinListResp.chainName;
        }
        if ((i11 & 512) != 0) {
            str9 = delistCoinListResp.chainFullName;
        }
        if ((i11 & 1024) != 0) {
            str10 = delistCoinListResp.withdrawMemo;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str6;
        Integer num2 = num;
        String str16 = str5;
        String str17 = str3;
        return delistCoinListResp.copy(str, str2, str17, str4, str16, str15, num2, str13, str14, str11, str12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getChainFullName() {
        return this.chainFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getWithdrawMemo() {
        return this.withdrawMemo;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCurrencyStatus() {
        return this.currencyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getWithdrawPrecision() {
        return this.withdrawPrecision;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getChainName() {
        return this.chainName;
    }

    @NotNull
    public final DelistCoinListResp copy(@Nullable String currency, @Nullable String currencyName, @Nullable String currencyFullName, @Nullable String currencyIcon, @Nullable String currencyStatus, @Nullable String balance, @Nullable Integer withdrawPrecision, @Nullable String chainId, @Nullable String chainName, @Nullable String chainFullName, @Nullable String withdrawMemo) {
        return new DelistCoinListResp(currency, currencyName, currencyFullName, currencyIcon, currencyStatus, balance, withdrawPrecision, chainId, chainName, chainFullName, withdrawMemo);
    }

    @Nullable
    public final String getBalance() {
        return this.balance;
    }

    @Nullable
    public final String getChainFullName() {
        return this.chainFullName;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainName() {
        return this.chainName;
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
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getCurrencyStatus() {
        return this.currencyStatus;
    }

    @Nullable
    public final String getWithdrawMemo() {
        return this.withdrawMemo;
    }

    @Nullable
    public final Integer getWithdrawPrecision() {
        return this.withdrawPrecision;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyFullName;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyIcon;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currencyStatus;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.balance;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.withdrawPrecision;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.chainId;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.chainName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.chainFullName;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.withdrawMemo;
        return iHashCode10 + (str10 != null ? str10.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DelistCoinListResp(currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", currencyIcon=" + this.currencyIcon + ", currencyStatus=" + this.currencyStatus + ", balance=" + this.balance + ", withdrawPrecision=" + this.withdrawPrecision + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainFullName=" + this.chainFullName + ", withdrawMemo=" + this.withdrawMemo + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.currency);
        dest.writeString(this.currencyName);
        dest.writeString(this.currencyFullName);
        dest.writeString(this.currencyIcon);
        dest.writeString(this.currencyStatus);
        dest.writeString(this.balance);
        Integer num = this.withdrawPrecision;
        if (num == null) {
            iIntValue = 0;
        } else {
            dest.writeInt(1);
            iIntValue = num.intValue();
        }
        dest.writeInt(iIntValue);
        dest.writeString(this.chainId);
        dest.writeString(this.chainName);
        dest.writeString(this.chainFullName);
        dest.writeString(this.withdrawMemo);
    }

    public /* synthetic */ DelistCoinListResp(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : num, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8, (i11 & 512) != 0 ? null : str9, (i11 & 1024) != 0 ? null : str10);
    }
}
