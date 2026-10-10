package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.kubi.user.protocol.entity.SignTermItem;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiTradeModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006$"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeSymbolOfflineInfo;", "", "id", "", "symbol", "showStartTime", "showEndTime", "offlineTime", "baseCloseWithdrawTime", "quoteCloseWithdrawTime", SignTermItem.LINK, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBaseCloseWithdrawTime", "()Ljava/lang/String;", "getId", "getLink", "getOfflineTime", "getQuoteCloseWithdrawTime", "getShowEndTime", "getShowStartTime", "getSymbol", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiTradeSymbolOfflineInfo {

    @Nullable
    private final String baseCloseWithdrawTime;

    @NotNull
    private final String id;

    @Nullable
    private final String link;

    @NotNull
    private final String offlineTime;

    @Nullable
    private final String quoteCloseWithdrawTime;

    @NotNull
    private final String showEndTime;

    @NotNull
    private final String showStartTime;

    @NotNull
    private final String symbol;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiTradeSymbolOfflineInfo)) {
            return false;
        }
        KCJSApiTradeSymbolOfflineInfo kCJSApiTradeSymbolOfflineInfo = (KCJSApiTradeSymbolOfflineInfo) other;
        return Intrinsics.areEqual(this.id, kCJSApiTradeSymbolOfflineInfo.id) && Intrinsics.areEqual(this.symbol, kCJSApiTradeSymbolOfflineInfo.symbol) && Intrinsics.areEqual(this.showStartTime, kCJSApiTradeSymbolOfflineInfo.showStartTime) && Intrinsics.areEqual(this.showEndTime, kCJSApiTradeSymbolOfflineInfo.showEndTime) && Intrinsics.areEqual(this.offlineTime, kCJSApiTradeSymbolOfflineInfo.offlineTime) && Intrinsics.areEqual(this.baseCloseWithdrawTime, kCJSApiTradeSymbolOfflineInfo.baseCloseWithdrawTime) && Intrinsics.areEqual(this.quoteCloseWithdrawTime, kCJSApiTradeSymbolOfflineInfo.quoteCloseWithdrawTime) && Intrinsics.areEqual(this.link, kCJSApiTradeSymbolOfflineInfo.link);
    }

    public KCJSApiTradeSymbolOfflineInfo(@NotNull String id2, @NotNull String symbol, @NotNull String showStartTime, @NotNull String showEndTime, @NotNull String offlineTime, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(showStartTime, "showStartTime");
        Intrinsics.checkNotNullParameter(showEndTime, "showEndTime");
        Intrinsics.checkNotNullParameter(offlineTime, "offlineTime");
        this.id = id2;
        this.symbol = symbol;
        this.showStartTime = showStartTime;
        this.showEndTime = showEndTime;
        this.offlineTime = offlineTime;
        this.baseCloseWithdrawTime = str;
        this.quoteCloseWithdrawTime = str2;
        this.link = str3;
    }

    public static /* synthetic */ KCJSApiTradeSymbolOfflineInfo copy$default(KCJSApiTradeSymbolOfflineInfo kCJSApiTradeSymbolOfflineInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiTradeSymbolOfflineInfo.id;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiTradeSymbolOfflineInfo.symbol;
        }
        if ((i11 & 4) != 0) {
            str3 = kCJSApiTradeSymbolOfflineInfo.showStartTime;
        }
        if ((i11 & 8) != 0) {
            str4 = kCJSApiTradeSymbolOfflineInfo.showEndTime;
        }
        if ((i11 & 16) != 0) {
            str5 = kCJSApiTradeSymbolOfflineInfo.offlineTime;
        }
        if ((i11 & 32) != 0) {
            str6 = kCJSApiTradeSymbolOfflineInfo.baseCloseWithdrawTime;
        }
        if ((i11 & 64) != 0) {
            str7 = kCJSApiTradeSymbolOfflineInfo.quoteCloseWithdrawTime;
        }
        if ((i11 & 128) != 0) {
            str8 = kCJSApiTradeSymbolOfflineInfo.link;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return kCJSApiTradeSymbolOfflineInfo.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSymbol() {
        return this.symbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShowStartTime() {
        return this.showStartTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShowEndTime() {
        return this.showEndTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOfflineTime() {
        return this.offlineTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBaseCloseWithdrawTime() {
        return this.baseCloseWithdrawTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getQuoteCloseWithdrawTime() {
        return this.quoteCloseWithdrawTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final KCJSApiTradeSymbolOfflineInfo copy(@NotNull String id2, @NotNull String symbol, @NotNull String showStartTime, @NotNull String showEndTime, @NotNull String offlineTime, @Nullable String baseCloseWithdrawTime, @Nullable String quoteCloseWithdrawTime, @Nullable String link) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(showStartTime, "showStartTime");
        Intrinsics.checkNotNullParameter(showEndTime, "showEndTime");
        Intrinsics.checkNotNullParameter(offlineTime, "offlineTime");
        return new KCJSApiTradeSymbolOfflineInfo(id2, symbol, showStartTime, showEndTime, offlineTime, baseCloseWithdrawTime, quoteCloseWithdrawTime, link);
    }

    @Nullable
    public final String getBaseCloseWithdrawTime() {
        return this.baseCloseWithdrawTime;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getOfflineTime() {
        return this.offlineTime;
    }

    @Nullable
    public final String getQuoteCloseWithdrawTime() {
        return this.quoteCloseWithdrawTime;
    }

    @NotNull
    public final String getShowEndTime() {
        return this.showEndTime;
    }

    @NotNull
    public final String getShowStartTime() {
        return this.showStartTime;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.showStartTime.hashCode()) * 31) + this.showEndTime.hashCode()) * 31) + this.offlineTime.hashCode()) * 31;
        String str = this.baseCloseWithdrawTime;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.quoteCloseWithdrawTime;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiTradeSymbolOfflineInfo(id=" + this.id + ", symbol=" + this.symbol + ", showStartTime=" + this.showStartTime + ", showEndTime=" + this.showEndTime + ", offlineTime=" + this.offlineTime + ", baseCloseWithdrawTime=" + this.baseCloseWithdrawTime + ", quoteCloseWithdrawTime=" + this.quoteCloseWithdrawTime + ", link=" + this.link + ')';
    }
}
