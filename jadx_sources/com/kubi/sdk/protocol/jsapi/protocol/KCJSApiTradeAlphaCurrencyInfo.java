package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiTradeModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b*\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0002\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\u009f\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001J\u0013\u00107\u001a\u00020\u000f2\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020:HÖ\u0001J\t\u0010;\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0013\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019¨\u0006<"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiTradeAlphaCurrencyInfo;", "", "currencySeq", "", "siteType", "", "chainSeq", "chainLogo", "tokenIcon", "tokenName", "tokenFullName", "tokenDecimal", "tokenAddress", "tokenBridgeId", "quoteCurrency", "", "openingTime", "createdAt", "upgradeStatus", "chainId", "(JLjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JZJJJLjava/lang/String;)V", "getChainId", "()Ljava/lang/String;", "getChainLogo", "getChainSeq", "()J", "getCreatedAt", "getCurrencySeq", "getOpeningTime", "getQuoteCurrency", "()Z", "getSiteType", "getTokenAddress", "getTokenBridgeId", "getTokenDecimal", "getTokenFullName", "getTokenIcon", "getTokenName", "getUpgradeStatus", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiTradeAlphaCurrencyInfo {

    @NotNull
    private final String chainId;

    @NotNull
    private final String chainLogo;
    private final long chainSeq;
    private final long createdAt;
    private final long currencySeq;
    private final long openingTime;
    private final boolean quoteCurrency;

    @NotNull
    private final String siteType;

    @NotNull
    private final String tokenAddress;
    private final long tokenBridgeId;
    private final long tokenDecimal;

    @NotNull
    private final String tokenFullName;

    @NotNull
    private final String tokenIcon;

    @NotNull
    private final String tokenName;
    private final long upgradeStatus;

    public KCJSApiTradeAlphaCurrencyInfo(long j11, @NotNull String siteType, long j12, @NotNull String chainLogo, @NotNull String tokenIcon, @NotNull String tokenName, @NotNull String tokenFullName, long j13, @NotNull String tokenAddress, long j14, boolean z11, long j15, long j16, long j17, @NotNull String chainId) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(chainLogo, "chainLogo");
        Intrinsics.checkNotNullParameter(tokenIcon, "tokenIcon");
        Intrinsics.checkNotNullParameter(tokenName, "tokenName");
        Intrinsics.checkNotNullParameter(tokenFullName, "tokenFullName");
        Intrinsics.checkNotNullParameter(tokenAddress, "tokenAddress");
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        this.currencySeq = j11;
        this.siteType = siteType;
        this.chainSeq = j12;
        this.chainLogo = chainLogo;
        this.tokenIcon = tokenIcon;
        this.tokenName = tokenName;
        this.tokenFullName = tokenFullName;
        this.tokenDecimal = j13;
        this.tokenAddress = tokenAddress;
        this.tokenBridgeId = j14;
        this.quoteCurrency = z11;
        this.openingTime = j15;
        this.createdAt = j16;
        this.upgradeStatus = j17;
        this.chainId = chainId;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiTradeAlphaCurrencyInfo)) {
            return false;
        }
        KCJSApiTradeAlphaCurrencyInfo kCJSApiTradeAlphaCurrencyInfo = (KCJSApiTradeAlphaCurrencyInfo) other;
        return this.currencySeq == kCJSApiTradeAlphaCurrencyInfo.currencySeq && Intrinsics.areEqual(this.siteType, kCJSApiTradeAlphaCurrencyInfo.siteType) && this.chainSeq == kCJSApiTradeAlphaCurrencyInfo.chainSeq && Intrinsics.areEqual(this.chainLogo, kCJSApiTradeAlphaCurrencyInfo.chainLogo) && Intrinsics.areEqual(this.tokenIcon, kCJSApiTradeAlphaCurrencyInfo.tokenIcon) && Intrinsics.areEqual(this.tokenName, kCJSApiTradeAlphaCurrencyInfo.tokenName) && Intrinsics.areEqual(this.tokenFullName, kCJSApiTradeAlphaCurrencyInfo.tokenFullName) && this.tokenDecimal == kCJSApiTradeAlphaCurrencyInfo.tokenDecimal && Intrinsics.areEqual(this.tokenAddress, kCJSApiTradeAlphaCurrencyInfo.tokenAddress) && this.tokenBridgeId == kCJSApiTradeAlphaCurrencyInfo.tokenBridgeId && this.quoteCurrency == kCJSApiTradeAlphaCurrencyInfo.quoteCurrency && this.openingTime == kCJSApiTradeAlphaCurrencyInfo.openingTime && this.createdAt == kCJSApiTradeAlphaCurrencyInfo.createdAt && this.upgradeStatus == kCJSApiTradeAlphaCurrencyInfo.upgradeStatus && Intrinsics.areEqual(this.chainId, kCJSApiTradeAlphaCurrencyInfo.chainId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCurrencySeq() {
        return this.currencySeq;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getQuoteCurrency() {
        return this.quoteCurrency;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getOpeningTime() {
        return this.openingTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getUpgradeStatus() {
        return this.upgradeStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getChainSeq() {
        return this.chainSeq;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTokenDecimal() {
        return this.tokenDecimal;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @NotNull
    public final KCJSApiTradeAlphaCurrencyInfo copy(long currencySeq, @NotNull String siteType, long chainSeq, @NotNull String chainLogo, @NotNull String tokenIcon, @NotNull String tokenName, @NotNull String tokenFullName, long tokenDecimal, @NotNull String tokenAddress, long tokenBridgeId, boolean quoteCurrency, long openingTime, long createdAt, long upgradeStatus, @NotNull String chainId) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(chainLogo, "chainLogo");
        Intrinsics.checkNotNullParameter(tokenIcon, "tokenIcon");
        Intrinsics.checkNotNullParameter(tokenName, "tokenName");
        Intrinsics.checkNotNullParameter(tokenFullName, "tokenFullName");
        Intrinsics.checkNotNullParameter(tokenAddress, "tokenAddress");
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        return new KCJSApiTradeAlphaCurrencyInfo(currencySeq, siteType, chainSeq, chainLogo, tokenIcon, tokenName, tokenFullName, tokenDecimal, tokenAddress, tokenBridgeId, quoteCurrency, openingTime, createdAt, upgradeStatus, chainId);
    }

    @NotNull
    public final String getChainId() {
        return this.chainId;
    }

    @NotNull
    public final String getChainLogo() {
        return this.chainLogo;
    }

    public final long getChainSeq() {
        return this.chainSeq;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final long getCurrencySeq() {
        return this.currencySeq;
    }

    public final long getOpeningTime() {
        return this.openingTime;
    }

    public final boolean getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    public final String getSiteType() {
        return this.siteType;
    }

    @NotNull
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    public final long getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    public final long getTokenDecimal() {
        return this.tokenDecimal;
    }

    @NotNull
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    @NotNull
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @NotNull
    public final String getTokenName() {
        return this.tokenName;
    }

    public final long getUpgradeStatus() {
        return this.upgradeStatus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((Long.hashCode(this.currencySeq) * 31) + this.siteType.hashCode()) * 31) + Long.hashCode(this.chainSeq)) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenIcon.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenFullName.hashCode()) * 31) + Long.hashCode(this.tokenDecimal)) * 31) + this.tokenAddress.hashCode()) * 31) + Long.hashCode(this.tokenBridgeId)) * 31;
        boolean z11 = this.quoteCurrency;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return ((((((((iHashCode + r11) * 31) + Long.hashCode(this.openingTime)) * 31) + Long.hashCode(this.createdAt)) * 31) + Long.hashCode(this.upgradeStatus)) * 31) + this.chainId.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCJSApiTradeAlphaCurrencyInfo(currencySeq=" + this.currencySeq + ", siteType=" + this.siteType + ", chainSeq=" + this.chainSeq + ", chainLogo=" + this.chainLogo + ", tokenIcon=" + this.tokenIcon + ", tokenName=" + this.tokenName + ", tokenFullName=" + this.tokenFullName + ", tokenDecimal=" + this.tokenDecimal + ", tokenAddress=" + this.tokenAddress + ", tokenBridgeId=" + this.tokenBridgeId + ", quoteCurrency=" + this.quoteCurrency + ", openingTime=" + this.openingTime + ", createdAt=" + this.createdAt + ", upgradeStatus=" + this.upgradeStatus + ", chainId=" + this.chainId + ')';
    }
}
