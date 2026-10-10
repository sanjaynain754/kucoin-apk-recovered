package com.kubi.home.api;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RankNewCoin.kt */
/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000eR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006."}, m90084d2 = {"Lcom/kubi/home/api/RankNewCoin;", "", FirebaseAnalytics.Param.CURRENCY, "", "fullName", "iconUrl", "openingTime", "", "openingPrice", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getFullName", "setFullName", "getIconUrl", "setIconUrl", "getOpeningTime", "()Ljava/lang/Long;", "setOpeningTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getOpeningPrice", "setOpeningPrice", "allItemAmount", "", "getAllItemAmount", "()Ljava/lang/Double;", "setAllItemAmount", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/home/api/RankNewCoin;", "equals", "", "other", "hashCode", "", "toString", "HomeApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class RankNewCoin {

    @Nullable
    private Double allItemAmount;

    @Nullable
    private String currency;

    @Nullable
    private String fullName;

    @Nullable
    private String iconUrl;

    @Nullable
    private String openingPrice;

    @Nullable
    private Long openingTime;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RankNewCoin)) {
            return false;
        }
        RankNewCoin rankNewCoin = (RankNewCoin) other;
        return Intrinsics.areEqual(this.currency, rankNewCoin.currency) && Intrinsics.areEqual(this.fullName, rankNewCoin.fullName) && Intrinsics.areEqual(this.iconUrl, rankNewCoin.iconUrl) && Intrinsics.areEqual(this.openingTime, rankNewCoin.openingTime) && Intrinsics.areEqual(this.openingPrice, rankNewCoin.openingPrice);
    }

    public static /* synthetic */ RankNewCoin copy$default(RankNewCoin rankNewCoin, String str, String str2, String str3, Long l11, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = rankNewCoin.currency;
        }
        if ((i11 & 2) != 0) {
            str2 = rankNewCoin.fullName;
        }
        if ((i11 & 4) != 0) {
            str3 = rankNewCoin.iconUrl;
        }
        if ((i11 & 8) != 0) {
            l11 = rankNewCoin.openingTime;
        }
        if ((i11 & 16) != 0) {
            str4 = rankNewCoin.openingPrice;
        }
        String str5 = str4;
        String str6 = str3;
        return rankNewCoin.copy(str, str2, str6, l11, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOpeningPrice() {
        return this.openingPrice;
    }

    @NotNull
    public final RankNewCoin copy(@Nullable String currency, @Nullable String fullName, @Nullable String iconUrl, @Nullable Long openingTime, @Nullable String openingPrice) {
        return new RankNewCoin(currency, fullName, iconUrl, openingTime, openingPrice);
    }

    @Nullable
    public final Double getAllItemAmount() {
        return this.allItemAmount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getFullName() {
        return this.fullName;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getOpeningPrice() {
        return this.openingPrice;
    }

    @Nullable
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fullName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.iconUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l11 = this.openingTime;
        int iHashCode4 = (iHashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str4 = this.openingPrice;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAllItemAmount(@Nullable Double d11) {
        this.allItemAmount = d11;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setFullName(@Nullable String str) {
        this.fullName = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setOpeningPrice(@Nullable String str) {
        this.openingPrice = str;
    }

    public final void setOpeningTime(@Nullable Long l11) {
        this.openingTime = l11;
    }

    @NotNull
    public String toString() {
        return "RankNewCoin(currency=" + this.currency + ", fullName=" + this.fullName + ", iconUrl=" + this.iconUrl + ", openingTime=" + this.openingTime + ", openingPrice=" + this.openingPrice + ')';
    }

    public RankNewCoin(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Long l11, @Nullable String str4) {
        this.currency = str;
        this.fullName = str2;
        this.iconUrl = str3;
        this.openingTime = l11;
        this.openingPrice = str4;
    }
}
