package com.kubi.transfer.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SearchSymbolEntity.kt */
/* JADX INFO: loaded from: classes51.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/transfer/entity/Base;", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "iconUrl", "availableBalance", "availableBaseLegalCurrency", "baseLegalCurrencyPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyName", "getIconUrl", "getAvailableBalance", "getAvailableBaseLegalCurrency", "getBaseLegalCurrencyPrice", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "TransferApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class Base {

    @Nullable
    private final String availableBalance;

    @Nullable
    private final String availableBaseLegalCurrency;

    @Nullable
    private final String baseLegalCurrencyPrice;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String iconUrl;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Base)) {
            return false;
        }
        Base base = (Base) other;
        return Intrinsics.areEqual(this.currency, base.currency) && Intrinsics.areEqual(this.currencyName, base.currencyName) && Intrinsics.areEqual(this.iconUrl, base.iconUrl) && Intrinsics.areEqual(this.availableBalance, base.availableBalance) && Intrinsics.areEqual(this.availableBaseLegalCurrency, base.availableBaseLegalCurrency) && Intrinsics.areEqual(this.baseLegalCurrencyPrice, base.baseLegalCurrencyPrice);
    }

    public static /* synthetic */ Base copy$default(Base base, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = base.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = base.currencyName;
        }
        if ((i11 & 4) != 0) {
            str3 = base.iconUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = base.availableBalance;
        }
        if ((i11 & 16) != 0) {
            str5 = base.availableBaseLegalCurrency;
        }
        if ((i11 & 32) != 0) {
            str6 = base.baseLegalCurrencyPrice;
        }
        String str7 = str5;
        String str8 = str6;
        return base.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvailableBaseLegalCurrency() {
        return this.availableBaseLegalCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBaseLegalCurrencyPrice() {
        return this.baseLegalCurrencyPrice;
    }

    @NotNull
    public final Base copy(@Nullable String currency, @Nullable String currencyName, @Nullable String iconUrl, @Nullable String availableBalance, @Nullable String availableBaseLegalCurrency, @Nullable String baseLegalCurrencyPrice) {
        return new Base(currency, currencyName, iconUrl, availableBalance, availableBaseLegalCurrency, baseLegalCurrencyPrice);
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
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.availableBalance;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.availableBaseLegalCurrency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.baseLegalCurrencyPrice;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Base(currency=" + this.currency + ", currencyName=" + this.currencyName + ", iconUrl=" + this.iconUrl + ", availableBalance=" + this.availableBalance + ", availableBaseLegalCurrency=" + this.availableBaseLegalCurrency + ", baseLegalCurrencyPrice=" + this.baseLegalCurrencyPrice + ')';
    }

    public Base(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.currency = str;
        this.currencyName = str2;
        this.iconUrl = str3;
        this.availableBalance = str4;
        this.availableBaseLegalCurrency = str5;
        this.baseLegalCurrencyPrice = str6;
    }
}
