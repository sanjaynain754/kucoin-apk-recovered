package com.kubi.data.entity;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WsRankMarketSnapshotEntity.kt */
/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b>\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00102J\u0010\u0010H\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00107J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jª\u0001\u0010J\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\u00122\b\u0010M\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010N\u001a\u00020\u0003HÖ\u0001J\t\u0010O\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010&\"\u0004\b*\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u001c\u0010\r\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u0010\n\u0002\u00105\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001c\"\u0004\b<\u0010\u001e¨\u0006P"}, m90084d2 = {"Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "", "order", "", FirebaseAnalytics.Param.CURRENCY, "", "symbol", "symbolCode", "quote", "changeRate", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.PRICE, "value", "markCap", "volValue", "openingTime", "", "inverseSymbol", "", "iconUrl", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)V", "getOrder", "()Ljava/lang/Integer;", "setOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCurrency", "()Ljava/lang/String;", "setCurrency", "(Ljava/lang/String;)V", "getSymbol", "setSymbol", "getSymbolCode", "setSymbolCode", "getQuote", "setQuote", "getChangeRate", "()Ljava/math/BigDecimal;", "setChangeRate", "(Ljava/math/BigDecimal;)V", "getPrice", "setPrice", "getValue", "setValue", "getMarkCap", "setMarkCap", "getVolValue", "setVolValue", "getOpeningTime", "()Ljava/lang/Long;", "setOpeningTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getInverseSymbol", "()Ljava/lang/Boolean;", "setInverseSymbol", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getIconUrl", "setIconUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/kubi/data/entity/WsRankMarketSnapshotEntity;", "equals", "other", "hashCode", "toString", "LDataProvider_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class WsRankMarketSnapshotEntity {

    @Nullable
    private BigDecimal changeRate;

    @Nullable
    private String currency;

    @Nullable
    private String iconUrl;

    @Nullable
    private Boolean inverseSymbol;

    @Nullable
    private BigDecimal markCap;

    @Nullable
    private Long openingTime;

    @Nullable
    private Integer order;

    @Nullable
    private BigDecimal price;

    @Nullable
    private String quote;

    @Nullable
    private String symbol;

    @Nullable
    private String symbolCode;

    @Nullable
    private BigDecimal value;

    @Nullable
    private BigDecimal volValue;

    public WsRankMarketSnapshotEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WsRankMarketSnapshotEntity)) {
            return false;
        }
        WsRankMarketSnapshotEntity wsRankMarketSnapshotEntity = (WsRankMarketSnapshotEntity) other;
        return Intrinsics.areEqual(this.order, wsRankMarketSnapshotEntity.order) && Intrinsics.areEqual(this.currency, wsRankMarketSnapshotEntity.currency) && Intrinsics.areEqual(this.symbol, wsRankMarketSnapshotEntity.symbol) && Intrinsics.areEqual(this.symbolCode, wsRankMarketSnapshotEntity.symbolCode) && Intrinsics.areEqual(this.quote, wsRankMarketSnapshotEntity.quote) && Intrinsics.areEqual(this.changeRate, wsRankMarketSnapshotEntity.changeRate) && Intrinsics.areEqual(this.price, wsRankMarketSnapshotEntity.price) && Intrinsics.areEqual(this.value, wsRankMarketSnapshotEntity.value) && Intrinsics.areEqual(this.markCap, wsRankMarketSnapshotEntity.markCap) && Intrinsics.areEqual(this.volValue, wsRankMarketSnapshotEntity.volValue) && Intrinsics.areEqual(this.openingTime, wsRankMarketSnapshotEntity.openingTime) && Intrinsics.areEqual(this.inverseSymbol, wsRankMarketSnapshotEntity.inverseSymbol) && Intrinsics.areEqual(this.iconUrl, wsRankMarketSnapshotEntity.iconUrl);
    }

    public WsRankMarketSnapshotEntity(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable BigDecimal bigDecimal4, @Nullable BigDecimal bigDecimal5, @Nullable Long l11, @Nullable Boolean bool, @Nullable String str5) {
        this.order = num;
        this.currency = str;
        this.symbol = str2;
        this.symbolCode = str3;
        this.quote = str4;
        this.changeRate = bigDecimal;
        this.price = bigDecimal2;
        this.value = bigDecimal3;
        this.markCap = bigDecimal4;
        this.volValue = bigDecimal5;
        this.openingTime = l11;
        this.inverseSymbol = bool;
        this.iconUrl = str5;
    }

    public static /* synthetic */ WsRankMarketSnapshotEntity copy$default(WsRankMarketSnapshotEntity wsRankMarketSnapshotEntity, Integer num, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Long l11, Boolean bool, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = wsRankMarketSnapshotEntity.order;
        }
        return wsRankMarketSnapshotEntity.copy(num, (i11 & 2) != 0 ? wsRankMarketSnapshotEntity.currency : str, (i11 & 4) != 0 ? wsRankMarketSnapshotEntity.symbol : str2, (i11 & 8) != 0 ? wsRankMarketSnapshotEntity.symbolCode : str3, (i11 & 16) != 0 ? wsRankMarketSnapshotEntity.quote : str4, (i11 & 32) != 0 ? wsRankMarketSnapshotEntity.changeRate : bigDecimal, (i11 & 64) != 0 ? wsRankMarketSnapshotEntity.price : bigDecimal2, (i11 & 128) != 0 ? wsRankMarketSnapshotEntity.value : bigDecimal3, (i11 & 256) != 0 ? wsRankMarketSnapshotEntity.markCap : bigDecimal4, (i11 & 512) != 0 ? wsRankMarketSnapshotEntity.volValue : bigDecimal5, (i11 & 1024) != 0 ? wsRankMarketSnapshotEntity.openingTime : l11, (i11 & 2048) != 0 ? wsRankMarketSnapshotEntity.inverseSymbol : bool, (i11 & 4096) != 0 ? wsRankMarketSnapshotEntity.iconUrl : str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getInverseSymbol() {
        return this.inverseSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BigDecimal getValue() {
        return this.value;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getMarkCap() {
        return this.markCap;
    }

    @NotNull
    public final WsRankMarketSnapshotEntity copy(@Nullable Integer order, @Nullable String currency, @Nullable String symbol, @Nullable String symbolCode, @Nullable String quote, @Nullable BigDecimal changeRate, @Nullable BigDecimal price, @Nullable BigDecimal value, @Nullable BigDecimal markCap, @Nullable BigDecimal volValue, @Nullable Long openingTime, @Nullable Boolean inverseSymbol, @Nullable String iconUrl) {
        return new WsRankMarketSnapshotEntity(order, currency, symbol, symbolCode, quote, changeRate, price, value, markCap, volValue, openingTime, inverseSymbol, iconUrl);
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Boolean getInverseSymbol() {
        return this.inverseSymbol;
    }

    @Nullable
    public final BigDecimal getMarkCap() {
        return this.markCap;
    }

    @Nullable
    public final Long getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final Integer getOrder() {
        return this.order;
    }

    @Nullable
    public final BigDecimal getPrice() {
        return this.price;
    }

    @Nullable
    public final String getQuote() {
        return this.quote;
    }

    @Nullable
    public final String getSymbol() {
        return this.symbol;
    }

    @Nullable
    public final String getSymbolCode() {
        return this.symbolCode;
    }

    @Nullable
    public final BigDecimal getValue() {
        return this.value;
    }

    @Nullable
    public final BigDecimal getVolValue() {
        return this.volValue;
    }

    public int hashCode() {
        Integer num = this.order;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.symbol;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.symbolCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.quote;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BigDecimal bigDecimal = this.changeRate;
        int iHashCode6 = (iHashCode5 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.price;
        int iHashCode7 = (iHashCode6 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.value;
        int iHashCode8 = (iHashCode7 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.markCap;
        int iHashCode9 = (iHashCode8 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.volValue;
        int iHashCode10 = (iHashCode9 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        Long l11 = this.openingTime;
        int iHashCode11 = (iHashCode10 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.inverseSymbol;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.iconUrl;
        return iHashCode12 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setChangeRate(@Nullable BigDecimal bigDecimal) {
        this.changeRate = bigDecimal;
    }

    public final void setCurrency(@Nullable String str) {
        this.currency = str;
    }

    public final void setIconUrl(@Nullable String str) {
        this.iconUrl = str;
    }

    public final void setInverseSymbol(@Nullable Boolean bool) {
        this.inverseSymbol = bool;
    }

    public final void setMarkCap(@Nullable BigDecimal bigDecimal) {
        this.markCap = bigDecimal;
    }

    public final void setOpeningTime(@Nullable Long l11) {
        this.openingTime = l11;
    }

    public final void setOrder(@Nullable Integer num) {
        this.order = num;
    }

    public final void setPrice(@Nullable BigDecimal bigDecimal) {
        this.price = bigDecimal;
    }

    public final void setQuote(@Nullable String str) {
        this.quote = str;
    }

    public final void setSymbol(@Nullable String str) {
        this.symbol = str;
    }

    public final void setSymbolCode(@Nullable String str) {
        this.symbolCode = str;
    }

    public final void setValue(@Nullable BigDecimal bigDecimal) {
        this.value = bigDecimal;
    }

    public final void setVolValue(@Nullable BigDecimal bigDecimal) {
        this.volValue = bigDecimal;
    }

    @NotNull
    public String toString() {
        return "WsRankMarketSnapshotEntity(order=" + this.order + ", currency=" + this.currency + ", symbol=" + this.symbol + ", symbolCode=" + this.symbolCode + ", quote=" + this.quote + ", changeRate=" + this.changeRate + ", price=" + this.price + ", value=" + this.value + ", markCap=" + this.markCap + ", volValue=" + this.volValue + ", openingTime=" + this.openingTime + ", inverseSymbol=" + this.inverseSymbol + ", iconUrl=" + this.iconUrl + ')';
    }

    public /* synthetic */ WsRankMarketSnapshotEntity(Integer num, String str, String str2, String str3, String str4, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Long l11, Boolean bool, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : bigDecimal, (i11 & 64) != 0 ? null : bigDecimal2, (i11 & 128) != 0 ? null : bigDecimal3, (i11 & 256) != 0 ? null : bigDecimal4, (i11 & 512) != 0 ? null : bigDecimal5, (i11 & 1024) != 0 ? 0L : l11, (i11 & 2048) != 0 ? Boolean.FALSE : bool, (i11 & 4096) != 0 ? null : str5);
    }
}
