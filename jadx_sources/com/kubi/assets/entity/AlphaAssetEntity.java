package com.kubi.assets.entity;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AlphaAssetEntity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\b\u0086\b\u0018\u00002\u00020\u0001B\u0083\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010A\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010B\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010F\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010K\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010L\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010*J\u000b\u0010M\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u008a\u0002\u0010O\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020\u000b2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\rHÖ\u0001J\t\u0010T\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010(\u001a\u0004\b\n\u0010'R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010(\u001a\u0004\b0\u0010'R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b2\u0010-R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b4\u0010-R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b6\u0010\u001fR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010+\u001a\u0004\b7\u0010*R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b9\u0010-¨\u0006U"}, m90084d2 = {"Lcom/kubi/assets/entity/AlphaAssetEntity;", "", "currencySeq", "", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "currencyFullName", "iconUrl", "chainIconUrl", "isDigital", "", "currencyStatus", "", "totalBalance", "Ljava/math/BigDecimal;", "availableBalance", "holdBalance", "autoTransfer", "tokenAddress", "baseAmount", "baseCurrency", "baseCurrencyPrice", "chain", "delistingTime", "precision", "changeRate", "changeRateValue", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "getCurrencySeq", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCurrency", "()Ljava/lang/String;", "getCurrencyName", "getCurrencyFullName", "getIconUrl", "getChainIconUrl", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrencyStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalBalance", "()Ljava/math/BigDecimal;", "getAvailableBalance", "getHoldBalance", "getAutoTransfer", "getTokenAddress", "getBaseAmount", "getBaseCurrency", "getBaseCurrencyPrice", "getChain", "getDelistingTime", "getPrecision", "getChangeRate", "getChangeRateValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Boolean;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lcom/kubi/assets/entity/AlphaAssetEntity;", "equals", "other", "hashCode", "toString", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class AlphaAssetEntity {

    @Nullable
    private final Boolean autoTransfer;

    @Nullable
    private final BigDecimal availableBalance;

    @Nullable
    private final BigDecimal baseAmount;

    @Nullable
    private final String baseCurrency;

    @Nullable
    private final BigDecimal baseCurrencyPrice;

    @Nullable
    private final String chain;

    @Nullable
    private final String chainIconUrl;

    @Nullable
    private final BigDecimal changeRate;

    @Nullable
    private final BigDecimal changeRateValue;

    @Nullable
    private final String currency;

    @Nullable
    private final String currencyFullName;

    @Nullable
    private final String currencyName;

    @Nullable
    private final Long currencySeq;

    @Nullable
    private final Integer currencyStatus;

    @Nullable
    private final Long delistingTime;

    @Nullable
    private final BigDecimal holdBalance;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final Boolean isDigital;

    @Nullable
    private final Integer precision;

    @Nullable
    private final String tokenAddress;

    @Nullable
    private final BigDecimal totalBalance;

    public AlphaAssetEntity() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public static /* synthetic */ AlphaAssetEntity copy$default(AlphaAssetEntity alphaAssetEntity, Long l11, String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool2, String str6, BigDecimal bigDecimal4, String str7, BigDecimal bigDecimal5, String str8, Long l12, Integer num2, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, Object obj) {
        BigDecimal bigDecimal8;
        BigDecimal bigDecimal9;
        Long l13 = (i11 & 1) != 0 ? alphaAssetEntity.currencySeq : l11;
        String str9 = (i11 & 2) != 0 ? alphaAssetEntity.currency : str;
        String str10 = (i11 & 4) != 0 ? alphaAssetEntity.currencyName : str2;
        String str11 = (i11 & 8) != 0 ? alphaAssetEntity.currencyFullName : str3;
        String str12 = (i11 & 16) != 0 ? alphaAssetEntity.iconUrl : str4;
        String str13 = (i11 & 32) != 0 ? alphaAssetEntity.chainIconUrl : str5;
        Boolean bool3 = (i11 & 64) != 0 ? alphaAssetEntity.isDigital : bool;
        Integer num3 = (i11 & 128) != 0 ? alphaAssetEntity.currencyStatus : num;
        BigDecimal bigDecimal10 = (i11 & 256) != 0 ? alphaAssetEntity.totalBalance : bigDecimal;
        BigDecimal bigDecimal11 = (i11 & 512) != 0 ? alphaAssetEntity.availableBalance : bigDecimal2;
        BigDecimal bigDecimal12 = (i11 & 1024) != 0 ? alphaAssetEntity.holdBalance : bigDecimal3;
        Boolean bool4 = (i11 & 2048) != 0 ? alphaAssetEntity.autoTransfer : bool2;
        String str14 = (i11 & 4096) != 0 ? alphaAssetEntity.tokenAddress : str6;
        BigDecimal bigDecimal13 = (i11 & 8192) != 0 ? alphaAssetEntity.baseAmount : bigDecimal4;
        Long l14 = l13;
        String str15 = (i11 & 16384) != 0 ? alphaAssetEntity.baseCurrency : str7;
        BigDecimal bigDecimal14 = (i11 & 32768) != 0 ? alphaAssetEntity.baseCurrencyPrice : bigDecimal5;
        String str16 = (i11 & 65536) != 0 ? alphaAssetEntity.chain : str8;
        Long l15 = (i11 & 131072) != 0 ? alphaAssetEntity.delistingTime : l12;
        Integer num4 = (i11 & 262144) != 0 ? alphaAssetEntity.precision : num2;
        BigDecimal bigDecimal15 = (i11 & 524288) != 0 ? alphaAssetEntity.changeRate : bigDecimal6;
        if ((i11 & 1048576) != 0) {
            bigDecimal9 = bigDecimal15;
            bigDecimal8 = alphaAssetEntity.changeRateValue;
        } else {
            bigDecimal8 = bigDecimal7;
            bigDecimal9 = bigDecimal15;
        }
        return alphaAssetEntity.copy(l14, str9, str10, str11, str12, str13, bool3, num3, bigDecimal10, bigDecimal11, bigDecimal12, bool4, str14, bigDecimal13, str15, bigDecimal14, str16, l15, num4, bigDecimal9, bigDecimal8);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlphaAssetEntity)) {
            return false;
        }
        AlphaAssetEntity alphaAssetEntity = (AlphaAssetEntity) other;
        return Intrinsics.areEqual(this.currencySeq, alphaAssetEntity.currencySeq) && Intrinsics.areEqual(this.currency, alphaAssetEntity.currency) && Intrinsics.areEqual(this.currencyName, alphaAssetEntity.currencyName) && Intrinsics.areEqual(this.currencyFullName, alphaAssetEntity.currencyFullName) && Intrinsics.areEqual(this.iconUrl, alphaAssetEntity.iconUrl) && Intrinsics.areEqual(this.chainIconUrl, alphaAssetEntity.chainIconUrl) && Intrinsics.areEqual(this.isDigital, alphaAssetEntity.isDigital) && Intrinsics.areEqual(this.currencyStatus, alphaAssetEntity.currencyStatus) && Intrinsics.areEqual(this.totalBalance, alphaAssetEntity.totalBalance) && Intrinsics.areEqual(this.availableBalance, alphaAssetEntity.availableBalance) && Intrinsics.areEqual(this.holdBalance, alphaAssetEntity.holdBalance) && Intrinsics.areEqual(this.autoTransfer, alphaAssetEntity.autoTransfer) && Intrinsics.areEqual(this.tokenAddress, alphaAssetEntity.tokenAddress) && Intrinsics.areEqual(this.baseAmount, alphaAssetEntity.baseAmount) && Intrinsics.areEqual(this.baseCurrency, alphaAssetEntity.baseCurrency) && Intrinsics.areEqual(this.baseCurrencyPrice, alphaAssetEntity.baseCurrencyPrice) && Intrinsics.areEqual(this.chain, alphaAssetEntity.chain) && Intrinsics.areEqual(this.delistingTime, alphaAssetEntity.delistingTime) && Intrinsics.areEqual(this.precision, alphaAssetEntity.precision) && Intrinsics.areEqual(this.changeRate, alphaAssetEntity.changeRate) && Intrinsics.areEqual(this.changeRateValue, alphaAssetEntity.changeRateValue);
    }

    public AlphaAssetEntity(@Nullable Long l11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool, @Nullable Integer num, @Nullable BigDecimal bigDecimal, @Nullable BigDecimal bigDecimal2, @Nullable BigDecimal bigDecimal3, @Nullable Boolean bool2, @Nullable String str6, @Nullable BigDecimal bigDecimal4, @Nullable String str7, @Nullable BigDecimal bigDecimal5, @Nullable String str8, @Nullable Long l12, @Nullable Integer num2, @Nullable BigDecimal bigDecimal6, @Nullable BigDecimal bigDecimal7) {
        this.currencySeq = l11;
        this.currency = str;
        this.currencyName = str2;
        this.currencyFullName = str3;
        this.iconUrl = str4;
        this.chainIconUrl = str5;
        this.isDigital = bool;
        this.currencyStatus = num;
        this.totalBalance = bigDecimal;
        this.availableBalance = bigDecimal2;
        this.holdBalance = bigDecimal3;
        this.autoTransfer = bool2;
        this.tokenAddress = str6;
        this.baseAmount = bigDecimal4;
        this.baseCurrency = str7;
        this.baseCurrencyPrice = bigDecimal5;
        this.chain = str8;
        this.delistingTime = l12;
        this.precision = num2;
        this.changeRate = bigDecimal6;
        this.changeRateValue = bigDecimal7;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getCurrencySeq() {
        return this.currencySeq;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getAutoTransfer() {
        return this.autoTransfer;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final BigDecimal getBaseAmount() {
        return this.baseAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final BigDecimal getBaseCurrencyPrice() {
        return this.baseCurrencyPrice;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getChain() {
        return this.chain;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Long getDelistingTime() {
        return this.delistingTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final BigDecimal getChangeRateValue() {
        return this.changeRateValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getChainIconUrl() {
        return this.chainIconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIsDigital() {
        return this.isDigital;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getCurrencyStatus() {
        return this.currencyStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final AlphaAssetEntity copy(@Nullable Long currencySeq, @Nullable String currency, @Nullable String currencyName, @Nullable String currencyFullName, @Nullable String iconUrl, @Nullable String chainIconUrl, @Nullable Boolean isDigital, @Nullable Integer currencyStatus, @Nullable BigDecimal totalBalance, @Nullable BigDecimal availableBalance, @Nullable BigDecimal holdBalance, @Nullable Boolean autoTransfer, @Nullable String tokenAddress, @Nullable BigDecimal baseAmount, @Nullable String baseCurrency, @Nullable BigDecimal baseCurrencyPrice, @Nullable String chain, @Nullable Long delistingTime, @Nullable Integer precision, @Nullable BigDecimal changeRate, @Nullable BigDecimal changeRateValue) {
        return new AlphaAssetEntity(currencySeq, currency, currencyName, currencyFullName, iconUrl, chainIconUrl, isDigital, currencyStatus, totalBalance, availableBalance, holdBalance, autoTransfer, tokenAddress, baseAmount, baseCurrency, baseCurrencyPrice, chain, delistingTime, precision, changeRate, changeRateValue);
    }

    @Nullable
    public final Boolean getAutoTransfer() {
        return this.autoTransfer;
    }

    @Nullable
    public final BigDecimal getAvailableBalance() {
        return this.availableBalance;
    }

    @Nullable
    public final BigDecimal getBaseAmount() {
        return this.baseAmount;
    }

    @Nullable
    public final String getBaseCurrency() {
        return this.baseCurrency;
    }

    @Nullable
    public final BigDecimal getBaseCurrencyPrice() {
        return this.baseCurrencyPrice;
    }

    @Nullable
    public final String getChain() {
        return this.chain;
    }

    @Nullable
    public final String getChainIconUrl() {
        return this.chainIconUrl;
    }

    @Nullable
    public final BigDecimal getChangeRate() {
        return this.changeRate;
    }

    @Nullable
    public final BigDecimal getChangeRateValue() {
        return this.changeRateValue;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    @Nullable
    public final String getCurrencyName() {
        return this.currencyName;
    }

    @Nullable
    public final Long getCurrencySeq() {
        return this.currencySeq;
    }

    @Nullable
    public final Integer getCurrencyStatus() {
        return this.currencyStatus;
    }

    @Nullable
    public final Long getDelistingTime() {
        return this.delistingTime;
    }

    @Nullable
    public final BigDecimal getHoldBalance() {
        return this.holdBalance;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final Integer getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    @Nullable
    public final BigDecimal getTotalBalance() {
        return this.totalBalance;
    }

    public int hashCode() {
        Long l11 = this.currencySeq;
        int iHashCode = (l11 == null ? 0 : l11.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.currencyName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currencyFullName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chainIconUrl;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isDigital;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.currencyStatus;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        BigDecimal bigDecimal = this.totalBalance;
        int iHashCode9 = (iHashCode8 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.availableBalance;
        int iHashCode10 = (iHashCode9 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.holdBalance;
        int iHashCode11 = (iHashCode10 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        Boolean bool2 = this.autoTransfer;
        int iHashCode12 = (iHashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.tokenAddress;
        int iHashCode13 = (iHashCode12 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.baseAmount;
        int iHashCode14 = (iHashCode13 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        String str7 = this.baseCurrency;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.baseCurrencyPrice;
        int iHashCode16 = (iHashCode15 + (bigDecimal5 == null ? 0 : bigDecimal5.hashCode())) * 31;
        String str8 = this.chain;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l12 = this.delistingTime;
        int iHashCode18 = (iHashCode17 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Integer num2 = this.precision;
        int iHashCode19 = (iHashCode18 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BigDecimal bigDecimal6 = this.changeRate;
        int iHashCode20 = (iHashCode19 + (bigDecimal6 == null ? 0 : bigDecimal6.hashCode())) * 31;
        BigDecimal bigDecimal7 = this.changeRateValue;
        return iHashCode20 + (bigDecimal7 != null ? bigDecimal7.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDigital() {
        return this.isDigital;
    }

    @NotNull
    public String toString() {
        return "AlphaAssetEntity(currencySeq=" + this.currencySeq + ", currency=" + this.currency + ", currencyName=" + this.currencyName + ", currencyFullName=" + this.currencyFullName + ", iconUrl=" + this.iconUrl + ", chainIconUrl=" + this.chainIconUrl + ", isDigital=" + this.isDigital + ", currencyStatus=" + this.currencyStatus + ", totalBalance=" + this.totalBalance + ", availableBalance=" + this.availableBalance + ", holdBalance=" + this.holdBalance + ", autoTransfer=" + this.autoTransfer + ", tokenAddress=" + this.tokenAddress + ", baseAmount=" + this.baseAmount + ", baseCurrency=" + this.baseCurrency + ", baseCurrencyPrice=" + this.baseCurrencyPrice + ", chain=" + this.chain + ", delistingTime=" + this.delistingTime + ", precision=" + this.precision + ", changeRate=" + this.changeRate + ", changeRateValue=" + this.changeRateValue + ')';
    }

    public /* synthetic */ AlphaAssetEntity(Long l11, String str, String str2, String str3, String str4, String str5, Boolean bool, Integer num, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Boolean bool2, String str6, BigDecimal bigDecimal4, String str7, BigDecimal bigDecimal5, String str8, Long l12, Integer num2, BigDecimal bigDecimal6, BigDecimal bigDecimal7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : l11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : num, (i11 & 256) != 0 ? null : bigDecimal, (i11 & 512) != 0 ? null : bigDecimal2, (i11 & 1024) != 0 ? null : bigDecimal3, (i11 & 2048) != 0 ? null : bool2, (i11 & 4096) != 0 ? null : str6, (i11 & 8192) != 0 ? null : bigDecimal4, (i11 & 16384) != 0 ? null : str7, (i11 & 32768) != 0 ? null : bigDecimal5, (i11 & 65536) != 0 ? null : str8, (i11 & 131072) != 0 ? null : l12, (i11 & 262144) != 0 ? null : num2, (i11 & 524288) != 0 ? null : bigDecimal6, (i11 & 1048576) != 0 ? null : bigDecimal7);
    }
}
