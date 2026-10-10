package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSymbolsCoinModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0002\u0010\u0018J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0012HÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\t\u00101\u001a\u00020\u0012HÆ\u0003J\t\u00102\u001a\u00020\u0012HÆ\u0003J\t\u00103\u001a\u00020\u0012HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0012HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003JÑ\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0012HÆ\u0001J\u0013\u0010>\u001a\u00020\u00122\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\t\u0010B\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010!R\u0011\u0010\u0014\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010!R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010!R\u0011\u0010\u0016\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010!R\u0011\u0010\u0013\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010!R\u0011\u0010\u0017\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010!R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001a¨\u0006C"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinSpotCoinInfo;", "", "code", "", FirebaseAnalytics.Param.CURRENCY, "name", "iconUrl", "precision", "status", "withdrawMinFee", "withdrawMinSize", "withdrawEnableAt", "depositEnableAt", "context", "digital", "withdrawEnabled", "depositEnabled", "isDigitalCoin", "", "isStableCoin", "isDelistingCoin", "isDebitEnabled", "isEarnEnabled", "isTransferEnabled", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZ)V", "getCode", "()Ljava/lang/String;", "getContext", "getCurrency", "getDepositEnableAt", "getDepositEnabled", "getDigital", "getIconUrl", "()Z", "getName", "getPrecision", "getStatus", "getWithdrawEnableAt", "getWithdrawEnabled", "getWithdrawMinFee", "getWithdrawMinSize", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSymbolsCoinSpotCoinInfo {

    @NotNull
    private final String code;

    @NotNull
    private final String context;

    @NotNull
    private final String currency;

    @NotNull
    private final String depositEnableAt;

    @NotNull
    private final String depositEnabled;

    @NotNull
    private final String digital;

    @NotNull
    private final String iconUrl;
    private final boolean isDebitEnabled;
    private final boolean isDelistingCoin;
    private final boolean isDigitalCoin;
    private final boolean isEarnEnabled;
    private final boolean isStableCoin;
    private final boolean isTransferEnabled;

    @NotNull
    private final String name;

    @NotNull
    private final String precision;

    @NotNull
    private final String status;

    @NotNull
    private final String withdrawEnableAt;

    @NotNull
    private final String withdrawEnabled;

    @NotNull
    private final String withdrawMinFee;

    @NotNull
    private final String withdrawMinSize;

    public KCJSApiSymbolsCoinSpotCoinInfo(@NotNull String code, @NotNull String currency, @NotNull String name, @NotNull String iconUrl, @NotNull String precision, @NotNull String status, @NotNull String withdrawMinFee, @NotNull String withdrawMinSize, @NotNull String withdrawEnableAt, @NotNull String depositEnableAt, @NotNull String context, @NotNull String digital, @NotNull String withdrawEnabled, @NotNull String depositEnabled, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(withdrawMinFee, "withdrawMinFee");
        Intrinsics.checkNotNullParameter(withdrawMinSize, "withdrawMinSize");
        Intrinsics.checkNotNullParameter(withdrawEnableAt, "withdrawEnableAt");
        Intrinsics.checkNotNullParameter(depositEnableAt, "depositEnableAt");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(digital, "digital");
        Intrinsics.checkNotNullParameter(withdrawEnabled, "withdrawEnabled");
        Intrinsics.checkNotNullParameter(depositEnabled, "depositEnabled");
        this.code = code;
        this.currency = currency;
        this.name = name;
        this.iconUrl = iconUrl;
        this.precision = precision;
        this.status = status;
        this.withdrawMinFee = withdrawMinFee;
        this.withdrawMinSize = withdrawMinSize;
        this.withdrawEnableAt = withdrawEnableAt;
        this.depositEnableAt = depositEnableAt;
        this.context = context;
        this.digital = digital;
        this.withdrawEnabled = withdrawEnabled;
        this.depositEnabled = depositEnabled;
        this.isDigitalCoin = z11;
        this.isStableCoin = z12;
        this.isDelistingCoin = z13;
        this.isDebitEnabled = z14;
        this.isEarnEnabled = z15;
        this.isTransferEnabled = z16;
    }

    public static /* synthetic */ KCJSApiSymbolsCoinSpotCoinInfo copy$default(KCJSApiSymbolsCoinSpotCoinInfo kCJSApiSymbolsCoinSpotCoinInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i11, Object obj) {
        boolean z17;
        boolean z18;
        String str15 = (i11 & 1) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.code : str;
        String str16 = (i11 & 2) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.currency : str2;
        String str17 = (i11 & 4) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.name : str3;
        String str18 = (i11 & 8) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.iconUrl : str4;
        String str19 = (i11 & 16) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.precision : str5;
        String str20 = (i11 & 32) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.status : str6;
        String str21 = (i11 & 64) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.withdrawMinFee : str7;
        String str22 = (i11 & 128) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.withdrawMinSize : str8;
        String str23 = (i11 & 256) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.withdrawEnableAt : str9;
        String str24 = (i11 & 512) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.depositEnableAt : str10;
        String str25 = (i11 & 1024) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.context : str11;
        String str26 = (i11 & 2048) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.digital : str12;
        String str27 = (i11 & 4096) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.withdrawEnabled : str13;
        String str28 = (i11 & 8192) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.depositEnabled : str14;
        String str29 = str15;
        boolean z19 = (i11 & 16384) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.isDigitalCoin : z11;
        boolean z21 = (i11 & 32768) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.isStableCoin : z12;
        boolean z22 = (i11 & 65536) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.isDelistingCoin : z13;
        boolean z23 = (i11 & 131072) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.isDebitEnabled : z14;
        boolean z24 = (i11 & 262144) != 0 ? kCJSApiSymbolsCoinSpotCoinInfo.isEarnEnabled : z15;
        if ((i11 & 524288) != 0) {
            z18 = z24;
            z17 = kCJSApiSymbolsCoinSpotCoinInfo.isTransferEnabled;
        } else {
            z17 = z16;
            z18 = z24;
        }
        return kCJSApiSymbolsCoinSpotCoinInfo.copy(str29, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, z19, z21, z22, z23, z18, z17);
    }

    @NotNull
    public final KCJSApiSymbolsCoinSpotCoinInfo copy(@NotNull String code, @NotNull String currency, @NotNull String name, @NotNull String iconUrl, @NotNull String precision, @NotNull String status, @NotNull String withdrawMinFee, @NotNull String withdrawMinSize, @NotNull String withdrawEnableAt, @NotNull String depositEnableAt, @NotNull String context, @NotNull String digital, @NotNull String withdrawEnabled, @NotNull String depositEnabled, boolean isDigitalCoin, boolean isStableCoin, boolean isDelistingCoin, boolean isDebitEnabled, boolean isEarnEnabled, boolean isTransferEnabled) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(withdrawMinFee, "withdrawMinFee");
        Intrinsics.checkNotNullParameter(withdrawMinSize, "withdrawMinSize");
        Intrinsics.checkNotNullParameter(withdrawEnableAt, "withdrawEnableAt");
        Intrinsics.checkNotNullParameter(depositEnableAt, "depositEnableAt");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(digital, "digital");
        Intrinsics.checkNotNullParameter(withdrawEnabled, "withdrawEnabled");
        Intrinsics.checkNotNullParameter(depositEnabled, "depositEnabled");
        return new KCJSApiSymbolsCoinSpotCoinInfo(code, currency, name, iconUrl, precision, status, withdrawMinFee, withdrawMinSize, withdrawEnableAt, depositEnableAt, context, digital, withdrawEnabled, depositEnabled, isDigitalCoin, isStableCoin, isDelistingCoin, isDebitEnabled, isEarnEnabled, isTransferEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSymbolsCoinSpotCoinInfo)) {
            return false;
        }
        KCJSApiSymbolsCoinSpotCoinInfo kCJSApiSymbolsCoinSpotCoinInfo = (KCJSApiSymbolsCoinSpotCoinInfo) other;
        return Intrinsics.areEqual(this.code, kCJSApiSymbolsCoinSpotCoinInfo.code) && Intrinsics.areEqual(this.currency, kCJSApiSymbolsCoinSpotCoinInfo.currency) && Intrinsics.areEqual(this.name, kCJSApiSymbolsCoinSpotCoinInfo.name) && Intrinsics.areEqual(this.iconUrl, kCJSApiSymbolsCoinSpotCoinInfo.iconUrl) && Intrinsics.areEqual(this.precision, kCJSApiSymbolsCoinSpotCoinInfo.precision) && Intrinsics.areEqual(this.status, kCJSApiSymbolsCoinSpotCoinInfo.status) && Intrinsics.areEqual(this.withdrawMinFee, kCJSApiSymbolsCoinSpotCoinInfo.withdrawMinFee) && Intrinsics.areEqual(this.withdrawMinSize, kCJSApiSymbolsCoinSpotCoinInfo.withdrawMinSize) && Intrinsics.areEqual(this.withdrawEnableAt, kCJSApiSymbolsCoinSpotCoinInfo.withdrawEnableAt) && Intrinsics.areEqual(this.depositEnableAt, kCJSApiSymbolsCoinSpotCoinInfo.depositEnableAt) && Intrinsics.areEqual(this.context, kCJSApiSymbolsCoinSpotCoinInfo.context) && Intrinsics.areEqual(this.digital, kCJSApiSymbolsCoinSpotCoinInfo.digital) && Intrinsics.areEqual(this.withdrawEnabled, kCJSApiSymbolsCoinSpotCoinInfo.withdrawEnabled) && Intrinsics.areEqual(this.depositEnabled, kCJSApiSymbolsCoinSpotCoinInfo.depositEnabled) && this.isDigitalCoin == kCJSApiSymbolsCoinSpotCoinInfo.isDigitalCoin && this.isStableCoin == kCJSApiSymbolsCoinSpotCoinInfo.isStableCoin && this.isDelistingCoin == kCJSApiSymbolsCoinSpotCoinInfo.isDelistingCoin && this.isDebitEnabled == kCJSApiSymbolsCoinSpotCoinInfo.isDebitEnabled && this.isEarnEnabled == kCJSApiSymbolsCoinSpotCoinInfo.isEarnEnabled && this.isTransferEnabled == kCJSApiSymbolsCoinSpotCoinInfo.isTransferEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDigital() {
        return this.digital;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getWithdrawEnabled() {
        return this.withdrawEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDepositEnabled() {
        return this.depositEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsDigitalCoin() {
        return this.isDigitalCoin;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getIsStableCoin() {
        return this.isStableCoin;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsDelistingCoin() {
        return this.isDelistingCoin;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getIsEarnEnabled() {
        return this.isEarnEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getIsTransferEnabled() {
        return this.isTransferEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getContext() {
        return this.context;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @NotNull
    public final String getDepositEnabled() {
        return this.depositEnabled;
    }

    @NotNull
    public final String getDigital() {
        return this.digital;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPrecision() {
        return this.precision;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @NotNull
    public final String getWithdrawEnabled() {
        return this.withdrawEnabled;
    }

    @NotNull
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @NotNull
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v39, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((this.code.hashCode() * 31) + this.currency.hashCode()) * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.status.hashCode()) * 31) + this.withdrawMinFee.hashCode()) * 31) + this.withdrawMinSize.hashCode()) * 31) + this.withdrawEnableAt.hashCode()) * 31) + this.depositEnableAt.hashCode()) * 31) + this.context.hashCode()) * 31) + this.digital.hashCode()) * 31) + this.withdrawEnabled.hashCode()) * 31) + this.depositEnabled.hashCode()) * 31;
        boolean z11 = this.isDigitalCoin;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.isStableCoin;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.isDelistingCoin;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.isDebitEnabled;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        boolean z15 = this.isEarnEnabled;
        ?? r15 = z15;
        if (z15) {
            r15 = 1;
        }
        int i15 = (i14 + r15) * 31;
        boolean z16 = this.isTransferEnabled;
        return i15 + (z16 ? 1 : z16);
    }

    public final boolean isDebitEnabled() {
        return this.isDebitEnabled;
    }

    public final boolean isDelistingCoin() {
        return this.isDelistingCoin;
    }

    public final boolean isDigitalCoin() {
        return this.isDigitalCoin;
    }

    public final boolean isEarnEnabled() {
        return this.isEarnEnabled;
    }

    public final boolean isStableCoin() {
        return this.isStableCoin;
    }

    public final boolean isTransferEnabled() {
        return this.isTransferEnabled;
    }

    @NotNull
    public String toString() {
        return "KCJSApiSymbolsCoinSpotCoinInfo(code=" + this.code + ", currency=" + this.currency + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", precision=" + this.precision + ", status=" + this.status + ", withdrawMinFee=" + this.withdrawMinFee + ", withdrawMinSize=" + this.withdrawMinSize + ", withdrawEnableAt=" + this.withdrawEnableAt + ", depositEnableAt=" + this.depositEnableAt + ", context=" + this.context + ", digital=" + this.digital + ", withdrawEnabled=" + this.withdrawEnabled + ", depositEnabled=" + this.depositEnabled + ", isDigitalCoin=" + this.isDigitalCoin + ", isStableCoin=" + this.isStableCoin + ", isDelistingCoin=" + this.isDelistingCoin + ", isDebitEnabled=" + this.isDebitEnabled + ", isEarnEnabled=" + this.isEarnEnabled + ", isTransferEnabled=" + this.isTransferEnabled + ')';
    }
}
