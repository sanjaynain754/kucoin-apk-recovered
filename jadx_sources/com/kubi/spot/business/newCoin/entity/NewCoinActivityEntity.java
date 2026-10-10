package com.kubi.spot.business.newCoin.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NewCoinActivityEntity.kt */
/* JADX INFO: loaded from: classes47.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0016\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00102\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00103\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00104\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00107\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00108\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00109\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010!JÎ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020@HÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0006\u0010\u001cR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\n\u0010\u001cR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u0011\u0010\u001cR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b'\u0010!R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b(\u0010!R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b)\u0010!R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b*\u0010!¨\u0006B"}, m90084d2 = {"Lcom/kubi/spot/business/newCoin/entity/NewCoinActivityEntity;", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "symbol", "isWorldPremiere", "", "introPic", "type", "isDisplay", "tradeStartAt", "", "stopReminderAt", "languageInfo", "Lcom/kubi/spot/business/newCoin/entity/LanguageInfo;", "iconUrl", "isAllowBook", "tradeCountdown", "stopReminderStatus", "remindLimit", "arrivalLimit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/spot/business/newCoin/entity/LanguageInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getCurrency", "()Ljava/lang/String;", "getCurrencyName", "getSymbol", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIntroPic", "getType", "getTradeStartAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStopReminderAt", "getLanguageInfo", "()Lcom/kubi/spot/business/newCoin/entity/LanguageInfo;", "getIconUrl", "getTradeCountdown", "getStopReminderStatus", "getRemindLimit", "getArrivalLimit", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Lcom/kubi/spot/business/newCoin/entity/LanguageInfo;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/kubi/spot/business/newCoin/entity/NewCoinActivityEntity;", "equals", "other", "hashCode", "", "toString", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class NewCoinActivityEntity {

    @Nullable
    private final Long arrivalLimit;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyName;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final String introPic;

    @Nullable
    private final Boolean isAllowBook;

    @Nullable
    private final Boolean isDisplay;

    @Nullable
    private final Boolean isWorldPremiere;

    @Nullable
    private final LanguageInfo languageInfo;

    @Nullable
    private final Long remindLimit;

    @Nullable
    private final Long stopReminderAt;

    @Nullable
    private final Long stopReminderStatus;

    @Nullable
    private final String symbol;

    @Nullable
    private final Long tradeCountdown;

    @Nullable
    private final Long tradeStartAt;

    @Nullable
    private final String type;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewCoinActivityEntity)) {
            return false;
        }
        NewCoinActivityEntity newCoinActivityEntity = (NewCoinActivityEntity) other;
        return Intrinsics.areEqual(this.currency, newCoinActivityEntity.currency) && Intrinsics.areEqual(this.currencyName, newCoinActivityEntity.currencyName) && Intrinsics.areEqual(this.symbol, newCoinActivityEntity.symbol) && Intrinsics.areEqual(this.isWorldPremiere, newCoinActivityEntity.isWorldPremiere) && Intrinsics.areEqual(this.introPic, newCoinActivityEntity.introPic) && Intrinsics.areEqual(this.type, newCoinActivityEntity.type) && Intrinsics.areEqual(this.isDisplay, newCoinActivityEntity.isDisplay) && Intrinsics.areEqual(this.tradeStartAt, newCoinActivityEntity.tradeStartAt) && Intrinsics.areEqual(this.stopReminderAt, newCoinActivityEntity.stopReminderAt) && Intrinsics.areEqual(this.languageInfo, newCoinActivityEntity.languageInfo) && Intrinsics.areEqual(this.iconUrl, newCoinActivityEntity.iconUrl) && Intrinsics.areEqual(this.isAllowBook, newCoinActivityEntity.isAllowBook) && Intrinsics.areEqual(this.tradeCountdown, newCoinActivityEntity.tradeCountdown) && Intrinsics.areEqual(this.stopReminderStatus, newCoinActivityEntity.stopReminderStatus) && Intrinsics.areEqual(this.remindLimit, newCoinActivityEntity.remindLimit) && Intrinsics.areEqual(this.arrivalLimit, newCoinActivityEntity.arrivalLimit);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final LanguageInfo getLanguageInfo() {
        return this.languageInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getIsAllowBook() {
        return this.isAllowBook;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Long getTradeCountdown() {
        return this.tradeCountdown;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getStopReminderStatus() {
        return this.stopReminderStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Long getRemindLimit() {
        return this.remindLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Long getArrivalLimit() {
        return this.arrivalLimit;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getIsWorldPremiere() {
        return this.isWorldPremiere;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIntroPic() {
        return this.introPic;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsDisplay() {
        return this.isDisplay;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Long getTradeStartAt() {
        return this.tradeStartAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getStopReminderAt() {
        return this.stopReminderAt;
    }

    @NotNull
    public final NewCoinActivityEntity copy(@Nullable String currency, @Nullable String currencyName, @Nullable String symbol, @Nullable Boolean isWorldPremiere, @Nullable String introPic, @Nullable String type, @Nullable Boolean isDisplay, @Nullable Long tradeStartAt, @Nullable Long stopReminderAt, @Nullable LanguageInfo languageInfo, @Nullable String iconUrl, @Nullable Boolean isAllowBook, @Nullable Long tradeCountdown, @Nullable Long stopReminderStatus, @Nullable Long remindLimit, @Nullable Long arrivalLimit) {
        return new NewCoinActivityEntity(currency, currencyName, symbol, isWorldPremiere, introPic, type, isDisplay, tradeStartAt, stopReminderAt, languageInfo, iconUrl, isAllowBook, tradeCountdown, stopReminderStatus, remindLimit, arrivalLimit);
    }

    @Nullable
    public final Long getArrivalLimit() {
        return this.arrivalLimit;
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

    @Nullable
    public final String getIntroPic() {
        return this.introPic;
    }

    @Nullable
    public final LanguageInfo getLanguageInfo() {
        return this.languageInfo;
    }

    @Nullable
    public final Long getRemindLimit() {
        return this.remindLimit;
    }

    @Nullable
    public final Long getStopReminderAt() {
        return this.stopReminderAt;
    }

    @Nullable
    public final Long getStopReminderStatus() {
        return this.stopReminderStatus;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final Long getTradeCountdown() {
        return this.tradeCountdown;
    }

    @Nullable
    public final Long getTradeStartAt() {
        return this.tradeStartAt;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.currency;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currencyName;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isWorldPremiere;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.introPic;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.type;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool2 = this.isDisplay;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l11 = this.tradeStartAt;
        int iHashCode8 = (iHashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.stopReminderAt;
        int iHashCode9 = (iHashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        LanguageInfo languageInfo = this.languageInfo;
        int iHashCode10 = (iHashCode9 + (languageInfo == null ? 0 : languageInfo.hashCode())) * 31;
        String str6 = this.iconUrl;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool3 = this.isAllowBook;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Long l13 = this.tradeCountdown;
        int iHashCode13 = (iHashCode12 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.stopReminderStatus;
        int iHashCode14 = (iHashCode13 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.remindLimit;
        int iHashCode15 = (iHashCode14 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Long l16 = this.arrivalLimit;
        return iHashCode15 + (l16 != null ? l16.hashCode() : 0);
    }

    @Nullable
    public final Boolean isAllowBook() {
        return this.isAllowBook;
    }

    @Nullable
    public final Boolean isDisplay() {
        return this.isDisplay;
    }

    @Nullable
    public final Boolean isWorldPremiere() {
        return this.isWorldPremiere;
    }

    @NotNull
    public String toString() {
        return "NewCoinActivityEntity(currency=" + this.currency + ", currencyName=" + this.currencyName + ", symbol=" + this.symbol + ", isWorldPremiere=" + this.isWorldPremiere + ", introPic=" + this.introPic + ", type=" + this.type + ", isDisplay=" + this.isDisplay + ", tradeStartAt=" + this.tradeStartAt + ", stopReminderAt=" + this.stopReminderAt + ", languageInfo=" + this.languageInfo + ", iconUrl=" + this.iconUrl + ", isAllowBook=" + this.isAllowBook + ", tradeCountdown=" + this.tradeCountdown + ", stopReminderStatus=" + this.stopReminderStatus + ", remindLimit=" + this.remindLimit + ", arrivalLimit=" + this.arrivalLimit + ')';
    }

    public NewCoinActivityEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool2, @Nullable Long l11, @Nullable Long l12, @Nullable LanguageInfo languageInfo, @Nullable String str6, @Nullable Boolean bool3, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable Long l16) {
        this.currency = str;
        this.currencyName = str2;
        this.symbol = str3;
        this.isWorldPremiere = bool;
        this.introPic = str4;
        this.type = str5;
        this.isDisplay = bool2;
        this.tradeStartAt = l11;
        this.stopReminderAt = l12;
        this.languageInfo = languageInfo;
        this.iconUrl = str6;
        this.isAllowBook = bool3;
        this.tradeCountdown = l13;
        this.stopReminderStatus = l14;
        this.remindLimit = l15;
        this.arrivalLimit = l16;
    }
}
