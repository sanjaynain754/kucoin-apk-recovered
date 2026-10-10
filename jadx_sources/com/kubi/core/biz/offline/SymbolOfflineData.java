package com.kubi.core.biz.offline;

import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.core.biz.offline.a, reason: from Kotlin metadata and from toString */
/* JADX INFO: compiled from: SymbolOfflineData.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u0019\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006-"}, m90084d2 = {"Lcom/kubi/core/biz/offline/SymbolOfflineData;", "", "id", "", "symbol", "showStartTime", "", "baseCloseWithdrawTime", "quoteCloseWithdrawTime", "showEndTime", "offlineTime", SignTermItem.LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSymbol", "getShowStartTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getBaseCloseWithdrawTime", "getQuoteCloseWithdrawTime", "getShowEndTime", "getOfflineTime", "getLink", "closeWithdrawTime", "getCloseWithdrawCurrency", "symbolInfoEntity", "Lcom/kubi/data/entity/SymbolInfoEntity;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/kubi/core/biz/offline/SymbolOfflineData;", "equals", "", "other", "hashCode", "", "toString", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SymbolOfflineData {

    /* JADX INFO: renamed from: a, reason: from toString */
    @Nullable
    public final String id;

    /* JADX INFO: renamed from: b, reason: from toString */
    @Nullable
    public final String symbol;

    /* JADX INFO: renamed from: c, reason: from toString */
    @Nullable
    public final Long showStartTime;

    /* JADX INFO: renamed from: d, reason: from toString */
    @Nullable
    public final Long baseCloseWithdrawTime;

    /* JADX INFO: renamed from: e, reason: from toString */
    @Nullable
    public final Long quoteCloseWithdrawTime;

    /* JADX INFO: renamed from: f, reason: from toString */
    @Nullable
    public final Long showEndTime;

    /* JADX INFO: renamed from: g, reason: from toString */
    @Nullable
    public final Long offlineTime;

    /* JADX INFO: renamed from: h, reason: from toString */
    @Nullable
    public final String link;

    public SymbolOfflineData(@Nullable String str, @Nullable String str2, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, @Nullable Long l15, @Nullable String str3) {
        this.id = str;
        this.symbol = str2;
        this.showStartTime = l11;
        this.baseCloseWithdrawTime = l12;
        this.quoteCloseWithdrawTime = l13;
        this.showEndTime = l14;
        this.offlineTime = l15;
        this.link = str3;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m22085b(@Nullable SymbolInfoEntity symbolInfoEntity) {
        String baseCurrency = symbolInfoEntity != null ? symbolInfoEntity.getBaseCurrency() : null;
        String quoteCurrency = symbolInfoEntity != null ? symbolInfoEntity.getQuoteCurrency() : null;
        if (this.baseCloseWithdrawTime != null) {
            return baseCurrency;
        }
        if (this.quoteCloseWithdrawTime != null) {
            return quoteCurrency;
        }
        return null;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SymbolOfflineData)) {
            return false;
        }
        SymbolOfflineData symbolOfflineData = (SymbolOfflineData) other;
        return Intrinsics.areEqual(this.id, symbolOfflineData.id) && Intrinsics.areEqual(this.symbol, symbolOfflineData.symbol) && Intrinsics.areEqual(this.showStartTime, symbolOfflineData.showStartTime) && Intrinsics.areEqual(this.baseCloseWithdrawTime, symbolOfflineData.baseCloseWithdrawTime) && Intrinsics.areEqual(this.quoteCloseWithdrawTime, symbolOfflineData.quoteCloseWithdrawTime) && Intrinsics.areEqual(this.showEndTime, symbolOfflineData.showEndTime) && Intrinsics.areEqual(this.offlineTime, symbolOfflineData.offlineTime) && Intrinsics.areEqual(this.link, symbolOfflineData.link);
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Long m22084a() {
        Long l11 = this.baseCloseWithdrawTime;
        return l11 == null ? this.quoteCloseWithdrawTime : l11;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getOfflineTime() {
        return this.offlineTime;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getShowEndTime() {
        return this.showEndTime;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getShowStartTime() {
        return this.showStartTime;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.symbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l11 = this.showStartTime;
        int iHashCode3 = (iHashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.baseCloseWithdrawTime;
        int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.quoteCloseWithdrawTime;
        int iHashCode5 = (iHashCode4 + (l13 == null ? 0 : l13.hashCode())) * 31;
        Long l14 = this.showEndTime;
        int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.offlineTime;
        int iHashCode7 = (iHashCode6 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str3 = this.link;
        return iHashCode7 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SymbolOfflineData(id=" + this.id + ", symbol=" + this.symbol + ", showStartTime=" + this.showStartTime + ", baseCloseWithdrawTime=" + this.baseCloseWithdrawTime + ", quoteCloseWithdrawTime=" + this.quoteCloseWithdrawTime + ", showEndTime=" + this.showEndTime + ", offlineTime=" + this.offlineTime + ", link=" + this.link + ')';
    }

    public /* synthetic */ SymbolOfflineData(String str, String str2, Long l11, Long l12, Long l13, Long l14, Long l15, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, l11, (i11 & 8) != 0 ? null : l12, (i11 & 16) != 0 ? null : l13, l14, l15, str3);
    }
}
