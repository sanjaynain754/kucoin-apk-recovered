package com.kubi.otc.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FiatBean.kt */
/* JADX INFO: loaded from: classes33.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jb\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000e¨\u0006-"}, m90084d2 = {"Lcom/kubi/otc/entity/FiatCurrency;", "", FirebaseAnalytics.Param.CURRENCY, "", "availableBalance", "transfer", "", "transferAvailableBalance", "fiat2CryptoRate", "crypto2FiatRate", "inTransitBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getAvailableBalance", "setAvailableBalance", "getTransfer", "()Ljava/lang/Boolean;", "setTransfer", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getTransferAvailableBalance", "setTransferAvailableBalance", "getFiat2CryptoRate", "setFiat2CryptoRate", "getCrypto2FiatRate", "setCrypto2FiatRate", "getInTransitBalance", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/otc/entity/FiatCurrency;", "equals", "other", "hashCode", "", "toString", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FiatCurrency {

    @SerializedName("withdrawAvailableBalance")
    @Nullable
    private String availableBalance;

    @Nullable
    private String crypto2FiatRate;

    @Nullable
    private String currency;

    @Nullable
    private String fiat2CryptoRate;

    @SerializedName("inTransitBalance")
    @Nullable
    private final String inTransitBalance;

    @Nullable
    private Boolean transfer;

    @Nullable
    private String transferAvailableBalance;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiatCurrency)) {
            return false;
        }
        FiatCurrency fiatCurrency = (FiatCurrency) other;
        return Intrinsics.areEqual(this.currency, fiatCurrency.currency) && Intrinsics.areEqual(this.availableBalance, fiatCurrency.availableBalance) && Intrinsics.areEqual(this.transfer, fiatCurrency.transfer) && Intrinsics.areEqual(this.transferAvailableBalance, fiatCurrency.transferAvailableBalance) && Intrinsics.areEqual(this.fiat2CryptoRate, fiatCurrency.fiat2CryptoRate) && Intrinsics.areEqual(this.crypto2FiatRate, fiatCurrency.crypto2FiatRate) && Intrinsics.areEqual(this.inTransitBalance, fiatCurrency.inTransitBalance);
    }

    public static /* synthetic */ FiatCurrency copy$default(FiatCurrency fiatCurrency, String str, String str2, Boolean bool, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fiatCurrency.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = fiatCurrency.availableBalance;
        }
        if ((i11 & 4) != 0) {
            bool = fiatCurrency.transfer;
        }
        if ((i11 & 8) != 0) {
            str3 = fiatCurrency.transferAvailableBalance;
        }
        if ((i11 & 16) != 0) {
            str4 = fiatCurrency.fiat2CryptoRate;
        }
        if ((i11 & 32) != 0) {
            str5 = fiatCurrency.crypto2FiatRate;
        }
        if ((i11 & 64) != 0) {
            str6 = fiatCurrency.inTransitBalance;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        Boolean bool2 = bool;
        return fiatCurrency.copy(str, str2, bool2, str3, str9, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getTransfer() {
        return this.transfer;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTransferAvailableBalance() {
        return this.transferAvailableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFiat2CryptoRate() {
        return this.fiat2CryptoRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCrypto2FiatRate() {
        return this.crypto2FiatRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInTransitBalance() {
        return this.inTransitBalance;
    }

    @NotNull
    public final FiatCurrency copy(@Nullable String currency, @Nullable String availableBalance, @Nullable Boolean transfer, @Nullable String transferAvailableBalance, @Nullable String fiat2CryptoRate, @Nullable String crypto2FiatRate, @Nullable String inTransitBalance) {
        return new FiatCurrency(currency, availableBalance, transfer, transferAvailableBalance, fiat2CryptoRate, crypto2FiatRate, inTransitBalance);
    }

    @Nullable
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final String getCrypto2FiatRate() {
        return this.crypto2FiatRate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getFiat2CryptoRate() {
        return this.fiat2CryptoRate;
    }

    @Nullable
    public final String getInTransitBalance() {
        return this.inTransitBalance;
    }

    @Nullable
    public final Boolean getTransfer() {
        return this.transfer;
    }

    @Nullable
    public final String getTransferAvailableBalance() {
        return this.transferAvailableBalance;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.availableBalance;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.transfer;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.transferAvailableBalance;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fiat2CryptoRate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.crypto2FiatRate;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.inTransitBalance;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAvailableBalance(@Nullable String str) {
        this.availableBalance = str;
    }

    public final void setCrypto2FiatRate(@Nullable String str) {
        this.crypto2FiatRate = str;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setFiat2CryptoRate(@Nullable String str) {
        this.fiat2CryptoRate = str;
    }

    public final void setTransfer(@Nullable Boolean bool) {
        this.transfer = bool;
    }

    public final void setTransferAvailableBalance(@Nullable String str) {
        this.transferAvailableBalance = str;
    }

    @NotNull
    public String toString() {
        return "FiatCurrency(currency=" + this.currency + ", availableBalance=" + this.availableBalance + ", transfer=" + this.transfer + ", transferAvailableBalance=" + this.transferAvailableBalance + ", fiat2CryptoRate=" + this.fiat2CryptoRate + ", crypto2FiatRate=" + this.crypto2FiatRate + ", inTransitBalance=" + this.inTransitBalance + ')';
    }

    public FiatCurrency(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.currency = str;
        this.availableBalance = str2;
        this.transfer = bool;
        this.transferAvailableBalance = str3;
        this.fiat2CryptoRate = str4;
        this.crypto2FiatRate = str5;
        this.inTransitBalance = str6;
    }
}
