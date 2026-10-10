package com.kubi.assets.entity;

import androidx.annotation.Keep;
import androidx.core.app.FrameMetricsAggregator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EarnEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0005\u0010\u0012R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006*"}, m90084d2 = {"Lcom/kubi/assets/entity/LiteCurrencyDetail;", "", FirebaseAnalytics.Param.CURRENCY, "", "iconUrl", "isDigital", "", "currencyName", "currencyFullName", "totalBalance", "availableBalance", "holdBalance", "earnHoldingAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getIconUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrencyName", "getCurrencyFullName", "getTotalBalance", "getAvailableBalance", "getHoldBalance", "getEarnHoldingAmount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/assets/entity/LiteCurrencyDetail;", "equals", "other", "hashCode", "", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class LiteCurrencyDetail {

    @SerializedName("availableBalance")
    @Nullable
    private final String availableBalance;

    @SerializedName(FirebaseAnalytics.Param.CURRENCY)
    @Nullable
    private final String currency;

    @SerializedName("currencyFullName")
    @Nullable
    private final String currencyFullName;

    @SerializedName("currencyName")
    @Nullable
    private final String currencyName;

    @SerializedName("earnHoldingAmount")
    @Nullable
    private final String earnHoldingAmount;

    @SerializedName("holdBalance")
    @Nullable
    private final String holdBalance;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("isDigital")
    @Nullable
    private final Boolean isDigital;

    @SerializedName("totalBalance")
    @Nullable
    private final String totalBalance;

    public LiteCurrencyDetail() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiteCurrencyDetail)) {
            return false;
        }
        LiteCurrencyDetail liteCurrencyDetail = (LiteCurrencyDetail) other;
        return Intrinsics.areEqual(this.currency, liteCurrencyDetail.currency) && Intrinsics.areEqual(this.iconUrl, liteCurrencyDetail.iconUrl) && Intrinsics.areEqual(this.isDigital, liteCurrencyDetail.isDigital) && Intrinsics.areEqual(this.currencyName, liteCurrencyDetail.currencyName) && Intrinsics.areEqual(this.currencyFullName, liteCurrencyDetail.currencyFullName) && Intrinsics.areEqual(this.totalBalance, liteCurrencyDetail.totalBalance) && Intrinsics.areEqual(this.availableBalance, liteCurrencyDetail.availableBalance) && Intrinsics.areEqual(this.holdBalance, liteCurrencyDetail.holdBalance) && Intrinsics.areEqual(this.earnHoldingAmount, liteCurrencyDetail.earnHoldingAmount);
    }

    public LiteCurrencyDetail(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8) {
        this.currency = str;
        this.iconUrl = str2;
        this.isDigital = bool;
        this.currencyName = str3;
        this.currencyFullName = str4;
        this.totalBalance = str5;
        this.availableBalance = str6;
        this.holdBalance = str7;
        this.earnHoldingAmount = str8;
    }

    public static /* synthetic */ LiteCurrencyDetail copy$default(LiteCurrencyDetail liteCurrencyDetail, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = liteCurrencyDetail.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = liteCurrencyDetail.iconUrl;
        }
        if ((i11 & 4) != 0) {
            bool = liteCurrencyDetail.isDigital;
        }
        if ((i11 & 8) != 0) {
            str3 = liteCurrencyDetail.currencyName;
        }
        if ((i11 & 16) != 0) {
            str4 = liteCurrencyDetail.currencyFullName;
        }
        if ((i11 & 32) != 0) {
            str5 = liteCurrencyDetail.totalBalance;
        }
        if ((i11 & 64) != 0) {
            str6 = liteCurrencyDetail.availableBalance;
        }
        if ((i11 & 128) != 0) {
            str7 = liteCurrencyDetail.holdBalance;
        }
        if ((i11 & 256) != 0) {
            str8 = liteCurrencyDetail.earnHoldingAmount;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        String str13 = str4;
        Boolean bool2 = bool;
        return liteCurrencyDetail.copy(str, str2, bool2, str3, str13, str11, str12, str9, str10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsDigital() {
        return this.isDigital;
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
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEarnHoldingAmount() {
        return this.earnHoldingAmount;
    }

    @NotNull
    public final LiteCurrencyDetail copy(@Nullable String currency, @Nullable String iconUrl, @Nullable Boolean isDigital, @Nullable String currencyName, @Nullable String currencyFullName, @Nullable String totalBalance, @Nullable String availableBalance, @Nullable String holdBalance, @Nullable String earnHoldingAmount) {
        return new LiteCurrencyDetail(currency, iconUrl, isDigital, currencyName, currencyFullName, totalBalance, availableBalance, holdBalance, earnHoldingAmount);
    }

    @Nullable
    public final String getAvailableBalance() {
        return this.availableBalance;
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
    public final String getEarnHoldingAmount() {
        return this.earnHoldingAmount;
    }

    @Nullable
    public final String getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isDigital;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.currencyName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currencyFullName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.totalBalance;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.availableBalance;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.holdBalance;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.earnHoldingAmount;
        return iHashCode8 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDigital() {
        return this.isDigital;
    }

    @NotNull
    public String toString() {
        return "LiteCurrencyDetail(currency=" + this.currency + ", iconUrl=" + this.iconUrl + ", isDigital=" + this.isDigital + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", totalBalance=" + this.totalBalance + ", availableBalance=" + this.availableBalance + ", holdBalance=" + this.holdBalance + ", earnHoldingAmount=" + this.earnHoldingAmount + ')';
    }

    public /* synthetic */ LiteCurrencyDetail(String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, String str7, String str8, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? null : str7, (i11 & 256) != 0 ? null : str8);
    }
}
