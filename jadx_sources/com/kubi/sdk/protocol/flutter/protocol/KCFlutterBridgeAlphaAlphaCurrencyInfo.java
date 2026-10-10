package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCFlutterBridgeAlphaCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0002\u0010\u0012J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u0006HÆ\u0003J\t\u0010,\u001a\u00020\u0006HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0006HÆ\u0001J\u0013\u00101\u001a\u00020\r2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\u0014\u00105\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000106J\t\u00107\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0014R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017¨\u00068"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeAlphaAlphaCurrencyInfo;", "", "currencySeq", "", "chainSeq", "chainLogo", "", "tokenIcon", "tokenName", "tokenFullName", "tokenDecimal", "tokenAddress", "quoteCurrency", "", "chainId", "openingTime", "upgradeStatus", "currencyType", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ZLjava/lang/String;JJLjava/lang/String;)V", "getChainId", "()Ljava/lang/String;", "getChainLogo", "getChainSeq", "()J", "getCurrencySeq", "getCurrencyType", "getOpeningTime", "getQuoteCurrency", "()Z", "getTokenAddress", "getTokenDecimal", "getTokenFullName", "getTokenIcon", "getTokenName", "getUpgradeStatus", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCFlutterBridgeAlphaAlphaCurrencyInfo {

    @NotNull
    private final String chainId;

    @NotNull
    private final String chainLogo;
    private final long chainSeq;
    private final long currencySeq;

    @NotNull
    private final String currencyType;
    private final long openingTime;
    private final boolean quoteCurrency;

    @NotNull
    private final String tokenAddress;
    private final long tokenDecimal;

    @NotNull
    private final String tokenFullName;

    @NotNull
    private final String tokenIcon;

    @NotNull
    private final String tokenName;
    private final long upgradeStatus;

    public KCFlutterBridgeAlphaAlphaCurrencyInfo(long j11, long j12, @NotNull String chainLogo, @NotNull String tokenIcon, @NotNull String tokenName, @NotNull String tokenFullName, long j13, @NotNull String tokenAddress, boolean z11, @NotNull String chainId, long j14, long j15, @NotNull String currencyType) {
        Intrinsics.checkNotNullParameter(chainLogo, "chainLogo");
        Intrinsics.checkNotNullParameter(tokenIcon, "tokenIcon");
        Intrinsics.checkNotNullParameter(tokenName, "tokenName");
        Intrinsics.checkNotNullParameter(tokenFullName, "tokenFullName");
        Intrinsics.checkNotNullParameter(tokenAddress, "tokenAddress");
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(currencyType, "currencyType");
        this.currencySeq = j11;
        this.chainSeq = j12;
        this.chainLogo = chainLogo;
        this.tokenIcon = tokenIcon;
        this.tokenName = tokenName;
        this.tokenFullName = tokenFullName;
        this.tokenDecimal = j13;
        this.tokenAddress = tokenAddress;
        this.quoteCurrency = z11;
        this.chainId = chainId;
        this.openingTime = j14;
        this.upgradeStatus = j15;
        this.currencyType = currencyType;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeAlphaAlphaCurrencyInfo)) {
            return false;
        }
        KCFlutterBridgeAlphaAlphaCurrencyInfo kCFlutterBridgeAlphaAlphaCurrencyInfo = (KCFlutterBridgeAlphaAlphaCurrencyInfo) other;
        return this.currencySeq == kCFlutterBridgeAlphaAlphaCurrencyInfo.currencySeq && this.chainSeq == kCFlutterBridgeAlphaAlphaCurrencyInfo.chainSeq && Intrinsics.areEqual(this.chainLogo, kCFlutterBridgeAlphaAlphaCurrencyInfo.chainLogo) && Intrinsics.areEqual(this.tokenIcon, kCFlutterBridgeAlphaAlphaCurrencyInfo.tokenIcon) && Intrinsics.areEqual(this.tokenName, kCFlutterBridgeAlphaAlphaCurrencyInfo.tokenName) && Intrinsics.areEqual(this.tokenFullName, kCFlutterBridgeAlphaAlphaCurrencyInfo.tokenFullName) && this.tokenDecimal == kCFlutterBridgeAlphaAlphaCurrencyInfo.tokenDecimal && Intrinsics.areEqual(this.tokenAddress, kCFlutterBridgeAlphaAlphaCurrencyInfo.tokenAddress) && this.quoteCurrency == kCFlutterBridgeAlphaAlphaCurrencyInfo.quoteCurrency && Intrinsics.areEqual(this.chainId, kCFlutterBridgeAlphaAlphaCurrencyInfo.chainId) && this.openingTime == kCFlutterBridgeAlphaAlphaCurrencyInfo.openingTime && this.upgradeStatus == kCFlutterBridgeAlphaAlphaCurrencyInfo.upgradeStatus && Intrinsics.areEqual(this.currencyType, kCFlutterBridgeAlphaAlphaCurrencyInfo.currencyType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getCurrencySeq() {
        return this.currencySeq;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getOpeningTime() {
        return this.openingTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getUpgradeStatus() {
        return this.upgradeStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCurrencyType() {
        return this.currencyType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getChainSeq() {
        return this.chainSeq;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTokenName() {
        return this.tokenName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTokenDecimal() {
        return this.tokenDecimal;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    public final KCFlutterBridgeAlphaAlphaCurrencyInfo copy(long currencySeq, long chainSeq, @NotNull String chainLogo, @NotNull String tokenIcon, @NotNull String tokenName, @NotNull String tokenFullName, long tokenDecimal, @NotNull String tokenAddress, boolean quoteCurrency, @NotNull String chainId, long openingTime, long upgradeStatus, @NotNull String currencyType) {
        Intrinsics.checkNotNullParameter(chainLogo, "chainLogo");
        Intrinsics.checkNotNullParameter(tokenIcon, "tokenIcon");
        Intrinsics.checkNotNullParameter(tokenName, "tokenName");
        Intrinsics.checkNotNullParameter(tokenFullName, "tokenFullName");
        Intrinsics.checkNotNullParameter(tokenAddress, "tokenAddress");
        Intrinsics.checkNotNullParameter(chainId, "chainId");
        Intrinsics.checkNotNullParameter(currencyType, "currencyType");
        return new KCFlutterBridgeAlphaAlphaCurrencyInfo(currencySeq, chainSeq, chainLogo, tokenIcon, tokenName, tokenFullName, tokenDecimal, tokenAddress, quoteCurrency, chainId, openingTime, upgradeStatus, currencyType);
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

    public final long getCurrencySeq() {
        return this.currencySeq;
    }

    @NotNull
    public final String getCurrencyType() {
        return this.currencyType;
    }

    public final long getOpeningTime() {
        return this.openingTime;
    }

    public final boolean getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @NotNull
    public final String getTokenAddress() {
        return this.tokenAddress;
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
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    public int hashCode() {
        int iHashCode = ((((((((((((((Long.hashCode(this.currencySeq) * 31) + Long.hashCode(this.chainSeq)) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenIcon.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenFullName.hashCode()) * 31) + Long.hashCode(this.tokenDecimal)) * 31) + this.tokenAddress.hashCode()) * 31;
        boolean z11 = this.quoteCurrency;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        return ((((((((iHashCode + r11) * 31) + this.chainId.hashCode()) * 31) + Long.hashCode(this.openingTime)) * 31) + Long.hashCode(this.upgradeStatus)) * 31) + this.currencyType.hashCode();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("currencySeq", Long.valueOf(this.currencySeq));
        linkedHashMap.put("chainSeq", Long.valueOf(this.chainSeq));
        linkedHashMap.put("chainLogo", this.chainLogo);
        linkedHashMap.put("tokenIcon", this.tokenIcon);
        linkedHashMap.put("tokenName", this.tokenName);
        linkedHashMap.put("tokenFullName", this.tokenFullName);
        linkedHashMap.put("tokenDecimal", Long.valueOf(this.tokenDecimal));
        linkedHashMap.put("tokenAddress", this.tokenAddress);
        linkedHashMap.put("quoteCurrency", Boolean.valueOf(this.quoteCurrency));
        linkedHashMap.put("chainId", this.chainId);
        linkedHashMap.put("openingTime", Long.valueOf(this.openingTime));
        linkedHashMap.put("upgradeStatus", Long.valueOf(this.upgradeStatus));
        linkedHashMap.put("currencyType", this.currencyType);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeAlphaAlphaCurrencyInfo(currencySeq=" + this.currencySeq + ", chainSeq=" + this.chainSeq + ", chainLogo=" + this.chainLogo + ", tokenIcon=" + this.tokenIcon + ", tokenName=" + this.tokenName + ", tokenFullName=" + this.tokenFullName + ", tokenDecimal=" + this.tokenDecimal + ", tokenAddress=" + this.tokenAddress + ", quoteCurrency=" + this.quoteCurrency + ", chainId=" + this.chainId + ", openingTime=" + this.openingTime + ", upgradeStatus=" + this.upgradeStatus + ", currencyType=" + this.currencyType + ')';
    }
}
