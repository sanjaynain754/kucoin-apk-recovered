package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeTradeTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u00104\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00106\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005HÆ\u0003JÂ\u0001\u0010;\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u000f2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b \u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\"\u0010\u0017R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b&\u0010\u0017R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b'\u0010\u0017R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b(\u0010\u0017R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001a¨\u0006C"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/AlphaCurrencyInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "currencySeq", "", "siteType", "", "chainSeq", "chainLogo", "tokenIcon", "tokenName", "tokenFullName", "tokenDecimal", "tokenAddress", "tokenBridgeId", "quoteCurrency", "", "openingTime", "createdAt", "upgradeStatus", "chainId", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getCurrencySeq", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSiteType", "()Ljava/lang/String;", "getChainSeq", "getChainLogo", "getTokenIcon", "getTokenName", "getTokenFullName", "getTokenDecimal", "getTokenAddress", "getTokenBridgeId", "getQuoteCurrency", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOpeningTime", "getCreatedAt", "getUpgradeStatus", "getChainId", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/AlphaCurrencyInfo;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeTradeTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeTradeTurboModule.kt\ncom/kubi/rn/core/turbo/AlphaCurrencyInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,385:1\n1#2:386\n*E\n"})
public final /* data */ class AlphaCurrencyInfo implements WritableMapSerializable {

    @Nullable
    private final String chainId;

    @Nullable
    private final String chainLogo;

    @Nullable
    private final Double chainSeq;

    @Nullable
    private final Double createdAt;

    @Nullable
    private final Double currencySeq;

    @Nullable
    private final Double openingTime;

    @Nullable
    private final Boolean quoteCurrency;

    @Nullable
    private final String siteType;

    @Nullable
    private final String tokenAddress;

    @Nullable
    private final Double tokenBridgeId;

    @Nullable
    private final Double tokenDecimal;

    @Nullable
    private final String tokenFullName;

    @Nullable
    private final String tokenIcon;

    @Nullable
    private final String tokenName;

    @Nullable
    private final Double upgradeStatus;

    public AlphaCurrencyInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    @NotNull
    public final AlphaCurrencyInfo copy(@Nullable Double currencySeq, @Nullable String siteType, @Nullable Double chainSeq, @Nullable String chainLogo, @Nullable String tokenIcon, @Nullable String tokenName, @Nullable String tokenFullName, @Nullable Double tokenDecimal, @Nullable String tokenAddress, @Nullable Double tokenBridgeId, @Nullable Boolean quoteCurrency, @Nullable Double openingTime, @Nullable Double createdAt, @Nullable Double upgradeStatus, @Nullable String chainId) {
        return new AlphaCurrencyInfo(currencySeq, siteType, chainSeq, chainLogo, tokenIcon, tokenName, tokenFullName, tokenDecimal, tokenAddress, tokenBridgeId, quoteCurrency, openingTime, createdAt, upgradeStatus, chainId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaCurrencyInfo)) {
            return false;
        }
        AlphaCurrencyInfo alphaCurrencyInfo = (AlphaCurrencyInfo) other;
        return Intrinsics.areEqual((Object) this.currencySeq, (Object) alphaCurrencyInfo.currencySeq) && Intrinsics.areEqual(this.siteType, alphaCurrencyInfo.siteType) && Intrinsics.areEqual((Object) this.chainSeq, (Object) alphaCurrencyInfo.chainSeq) && Intrinsics.areEqual(this.chainLogo, alphaCurrencyInfo.chainLogo) && Intrinsics.areEqual(this.tokenIcon, alphaCurrencyInfo.tokenIcon) && Intrinsics.areEqual(this.tokenName, alphaCurrencyInfo.tokenName) && Intrinsics.areEqual(this.tokenFullName, alphaCurrencyInfo.tokenFullName) && Intrinsics.areEqual((Object) this.tokenDecimal, (Object) alphaCurrencyInfo.tokenDecimal) && Intrinsics.areEqual(this.tokenAddress, alphaCurrencyInfo.tokenAddress) && Intrinsics.areEqual((Object) this.tokenBridgeId, (Object) alphaCurrencyInfo.tokenBridgeId) && Intrinsics.areEqual(this.quoteCurrency, alphaCurrencyInfo.quoteCurrency) && Intrinsics.areEqual((Object) this.openingTime, (Object) alphaCurrencyInfo.openingTime) && Intrinsics.areEqual((Object) this.createdAt, (Object) alphaCurrencyInfo.createdAt) && Intrinsics.areEqual((Object) this.upgradeStatus, (Object) alphaCurrencyInfo.upgradeStatus) && Intrinsics.areEqual(this.chainId, alphaCurrencyInfo.chainId);
    }

    public AlphaCurrencyInfo(@Nullable Double d11, @Nullable String str, @Nullable Double d12, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Double d13, @Nullable String str6, @Nullable Double d14, @Nullable Boolean bool, @Nullable Double d15, @Nullable Double d16, @Nullable Double d17, @Nullable String str7) {
        this.currencySeq = d11;
        this.siteType = str;
        this.chainSeq = d12;
        this.chainLogo = str2;
        this.tokenIcon = str3;
        this.tokenName = str4;
        this.tokenFullName = str5;
        this.tokenDecimal = d13;
        this.tokenAddress = str6;
        this.tokenBridgeId = d14;
        this.quoteCurrency = bool;
        this.openingTime = d15;
        this.createdAt = d16;
        this.upgradeStatus = d17;
        this.chainId = str7;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Double getCurrencySeq() {
        return this.currencySeq;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Double getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Double getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Double getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Double getUpgradeStatus() {
        return this.upgradeStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getChainSeq() {
        return this.chainSeq;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTokenName() {
        return this.tokenName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Double getTokenDecimal() {
        return this.tokenDecimal;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @Nullable
    public final String getChainId() {
        return this.chainId;
    }

    @Nullable
    public final String getChainLogo() {
        return this.chainLogo;
    }

    @Nullable
    public final Double getChainSeq() {
        return this.chainSeq;
    }

    @Nullable
    public final Double getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Double getCurrencySeq() {
        return this.currencySeq;
    }

    @Nullable
    public final Double getOpeningTime() {
        return this.openingTime;
    }

    @Nullable
    public final Boolean getQuoteCurrency() {
        return this.quoteCurrency;
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @Nullable
    public final Double getTokenBridgeId() {
        return this.tokenBridgeId;
    }

    @Nullable
    public final Double getTokenDecimal() {
        return this.tokenDecimal;
    }

    @Nullable
    public final String getTokenFullName() {
        return this.tokenFullName;
    }

    @Nullable
    public final String getTokenIcon() {
        return this.tokenIcon;
    }

    @Nullable
    public final String getTokenName() {
        return this.tokenName;
    }

    @Nullable
    public final Double getUpgradeStatus() {
        return this.upgradeStatus;
    }

    public int hashCode() {
        Double d11 = this.currencySeq;
        int iHashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        String str = this.siteType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d12 = this.chainSeq;
        int iHashCode3 = (iHashCode2 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str2 = this.chainLogo;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.tokenIcon;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.tokenName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tokenFullName;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d13 = this.tokenDecimal;
        int iHashCode8 = (iHashCode7 + (d13 == null ? 0 : d13.hashCode())) * 31;
        String str6 = this.tokenAddress;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d14 = this.tokenBridgeId;
        int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Boolean bool = this.quoteCurrency;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d15 = this.openingTime;
        int iHashCode12 = (iHashCode11 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.createdAt;
        int iHashCode13 = (iHashCode12 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.upgradeStatus;
        int iHashCode14 = (iHashCode13 + (d17 == null ? 0 : d17.hashCode())) * 31;
        String str7 = this.chainId;
        return iHashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AlphaCurrencyInfo(currencySeq=" + this.currencySeq + ", siteType=" + this.siteType + ", chainSeq=" + this.chainSeq + ", chainLogo=" + this.chainLogo + ", tokenIcon=" + this.tokenIcon + ", tokenName=" + this.tokenName + ", tokenFullName=" + this.tokenFullName + ", tokenDecimal=" + this.tokenDecimal + ", tokenAddress=" + this.tokenAddress + ", tokenBridgeId=" + this.tokenBridgeId + ", quoteCurrency=" + this.quoteCurrency + ", openingTime=" + this.openingTime + ", createdAt=" + this.createdAt + ", upgradeStatus=" + this.upgradeStatus + ", chainId=" + this.chainId + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Double d11 = this.currencySeq;
        if (d11 != null) {
            writableMapCreateMap.putDouble("currencySeq", d11.doubleValue());
        }
        String str = this.siteType;
        if (str != null) {
            writableMapCreateMap.putString("siteType", str.toString());
        }
        Double d12 = this.chainSeq;
        if (d12 != null) {
            writableMapCreateMap.putDouble("chainSeq", d12.doubleValue());
        }
        String str2 = this.chainLogo;
        if (str2 != null) {
            writableMapCreateMap.putString("chainLogo", str2.toString());
        }
        String str3 = this.tokenIcon;
        if (str3 != null) {
            writableMapCreateMap.putString("tokenIcon", str3.toString());
        }
        String str4 = this.tokenName;
        if (str4 != null) {
            writableMapCreateMap.putString("tokenName", str4.toString());
        }
        String str5 = this.tokenFullName;
        if (str5 != null) {
            writableMapCreateMap.putString("tokenFullName", str5.toString());
        }
        Double d13 = this.tokenDecimal;
        if (d13 != null) {
            writableMapCreateMap.putDouble("tokenDecimal", d13.doubleValue());
        }
        String str6 = this.tokenAddress;
        if (str6 != null) {
            writableMapCreateMap.putString("tokenAddress", str6.toString());
        }
        Double d14 = this.tokenBridgeId;
        if (d14 != null) {
            writableMapCreateMap.putDouble("tokenBridgeId", d14.doubleValue());
        }
        Boolean bool = this.quoteCurrency;
        if (bool != null) {
            writableMapCreateMap.putBoolean("quoteCurrency", bool.booleanValue());
        }
        Double d15 = this.openingTime;
        if (d15 != null) {
            writableMapCreateMap.putDouble("openingTime", d15.doubleValue());
        }
        Double d16 = this.createdAt;
        if (d16 != null) {
            writableMapCreateMap.putDouble("createdAt", d16.doubleValue());
        }
        Double d17 = this.upgradeStatus;
        if (d17 != null) {
            writableMapCreateMap.putDouble("upgradeStatus", d17.doubleValue());
        }
        String str7 = this.chainId;
        if (str7 != null) {
            writableMapCreateMap.putString("chainId", str7.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ AlphaCurrencyInfo(Double d11, String str, Double d12, String str2, String str3, String str4, String str5, Double d13, String str6, Double d14, Boolean bool, Double d15, Double d16, Double d17, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : d12, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : d13, (i11 & 256) != 0 ? null : str6, (i11 & 512) != 0 ? null : d14, (i11 & 1024) != 0 ? null : bool, (i11 & 2048) != 0 ? null : d15, (i11 & 4096) != 0 ? null : d16, (i11 & 8192) != 0 ? null : d17, (i11 & 16384) != 0 ? null : str7);
    }
}
