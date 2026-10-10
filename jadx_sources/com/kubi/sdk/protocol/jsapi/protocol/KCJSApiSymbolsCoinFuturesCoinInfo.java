package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import androidx.media3.common.C2711C;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSymbolsCoinModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bí\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u0003¢\u0006\u0002\u0010!J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u001bHÆ\u0003J\t\u0010F\u001a\u00020\u001bHÆ\u0003J\t\u0010G\u001a\u00020\u001bHÆ\u0003J\t\u0010H\u001a\u00020\u001bHÆ\u0003J\t\u0010I\u001a\u00020\u001bHÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J«\u0002\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010 \u001a\u00020\u0003HÆ\u0001J\u0013\u0010S\u001a\u00020\u001b2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010U\u001a\u00020VHÖ\u0001J\t\u0010W\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010#R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010#R\u0011\u0010\u001e\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010*R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010#R\u0011\u0010\u001c\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010*R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010#R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010#R\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010*R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010#R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010#R\u0011\u0010\u001d\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010*R\u0011\u0010\u001f\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010*R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010#R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010#R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010#R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010#¨\u0006X"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSymbolsCoinFuturesCoinInfo;", "", "code", "", FirebaseAnalytics.Param.CURRENCY, "name", "iconUrl", "withdrawDisabledTip", "depositDisabledTip", "type", "precision", "status", "withdrawEnableAt", "depositEnableAt", "withdrawMinFee", "withdrawMinSize", "innerWithdrawMinFee", "availableBalance", "totalBalance", "isDepositEnabled", "isWithdrawEnabled", "isDisplayWithdraw", "isDisplayDeposit", "isMarginEnabled", "isDebitEnabled", "isPoolXEnabled", "isEarnEnabled", "", "isDigitalCoin", "isStableCoin", "isDelistingCoin", "isTransferEnabled", "properties", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;)V", "getAvailableBalance", "()Ljava/lang/String;", "getCode", "getCurrency", "getDepositDisabledTip", "getDepositEnableAt", "getIconUrl", "getInnerWithdrawMinFee", "()Z", "getName", "getPrecision", "getProperties", "getStatus", "getTotalBalance", "getType", "getWithdrawDisabledTip", "getWithdrawEnableAt", "getWithdrawMinFee", "getWithdrawMinSize", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSymbolsCoinFuturesCoinInfo {

    @NotNull
    private final String availableBalance;

    @NotNull
    private final String code;

    @NotNull
    private final String currency;

    @NotNull
    private final String depositDisabledTip;

    @NotNull
    private final String depositEnableAt;

    @NotNull
    private final String iconUrl;

    @NotNull
    private final String innerWithdrawMinFee;

    @NotNull
    private final String isDebitEnabled;
    private final boolean isDelistingCoin;

    @NotNull
    private final String isDepositEnabled;
    private final boolean isDigitalCoin;

    @NotNull
    private final String isDisplayDeposit;

    @NotNull
    private final String isDisplayWithdraw;
    private final boolean isEarnEnabled;

    @NotNull
    private final String isMarginEnabled;

    @NotNull
    private final String isPoolXEnabled;
    private final boolean isStableCoin;
    private final boolean isTransferEnabled;

    @NotNull
    private final String isWithdrawEnabled;

    @NotNull
    private final String name;

    @NotNull
    private final String precision;

    @NotNull
    private final String properties;

    @NotNull
    private final String status;

    @NotNull
    private final String totalBalance;

    @NotNull
    private final String type;

    @NotNull
    private final String withdrawDisabledTip;

    @NotNull
    private final String withdrawEnableAt;

    @NotNull
    private final String withdrawMinFee;

    @NotNull
    private final String withdrawMinSize;

    public KCJSApiSymbolsCoinFuturesCoinInfo(@NotNull String code, @NotNull String currency, @NotNull String name, @NotNull String iconUrl, @NotNull String withdrawDisabledTip, @NotNull String depositDisabledTip, @NotNull String type, @NotNull String precision, @NotNull String status, @NotNull String withdrawEnableAt, @NotNull String depositEnableAt, @NotNull String withdrawMinFee, @NotNull String withdrawMinSize, @NotNull String innerWithdrawMinFee, @NotNull String availableBalance, @NotNull String totalBalance, @NotNull String isDepositEnabled, @NotNull String isWithdrawEnabled, @NotNull String isDisplayWithdraw, @NotNull String isDisplayDeposit, @NotNull String isMarginEnabled, @NotNull String isDebitEnabled, @NotNull String isPoolXEnabled, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, @NotNull String properties) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(withdrawDisabledTip, "withdrawDisabledTip");
        Intrinsics.checkNotNullParameter(depositDisabledTip, "depositDisabledTip");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(withdrawEnableAt, "withdrawEnableAt");
        Intrinsics.checkNotNullParameter(depositEnableAt, "depositEnableAt");
        Intrinsics.checkNotNullParameter(withdrawMinFee, "withdrawMinFee");
        Intrinsics.checkNotNullParameter(withdrawMinSize, "withdrawMinSize");
        Intrinsics.checkNotNullParameter(innerWithdrawMinFee, "innerWithdrawMinFee");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(isDepositEnabled, "isDepositEnabled");
        Intrinsics.checkNotNullParameter(isWithdrawEnabled, "isWithdrawEnabled");
        Intrinsics.checkNotNullParameter(isDisplayWithdraw, "isDisplayWithdraw");
        Intrinsics.checkNotNullParameter(isDisplayDeposit, "isDisplayDeposit");
        Intrinsics.checkNotNullParameter(isMarginEnabled, "isMarginEnabled");
        Intrinsics.checkNotNullParameter(isDebitEnabled, "isDebitEnabled");
        Intrinsics.checkNotNullParameter(isPoolXEnabled, "isPoolXEnabled");
        Intrinsics.checkNotNullParameter(properties, "properties");
        this.code = code;
        this.currency = currency;
        this.name = name;
        this.iconUrl = iconUrl;
        this.withdrawDisabledTip = withdrawDisabledTip;
        this.depositDisabledTip = depositDisabledTip;
        this.type = type;
        this.precision = precision;
        this.status = status;
        this.withdrawEnableAt = withdrawEnableAt;
        this.depositEnableAt = depositEnableAt;
        this.withdrawMinFee = withdrawMinFee;
        this.withdrawMinSize = withdrawMinSize;
        this.innerWithdrawMinFee = innerWithdrawMinFee;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
        this.isDepositEnabled = isDepositEnabled;
        this.isWithdrawEnabled = isWithdrawEnabled;
        this.isDisplayWithdraw = isDisplayWithdraw;
        this.isDisplayDeposit = isDisplayDeposit;
        this.isMarginEnabled = isMarginEnabled;
        this.isDebitEnabled = isDebitEnabled;
        this.isPoolXEnabled = isPoolXEnabled;
        this.isEarnEnabled = z11;
        this.isDigitalCoin = z12;
        this.isStableCoin = z13;
        this.isDelistingCoin = z14;
        this.isTransferEnabled = z15;
        this.properties = properties;
    }

    public static /* synthetic */ KCJSApiSymbolsCoinFuturesCoinInfo copy$default(KCJSApiSymbolsCoinFuturesCoinInfo kCJSApiSymbolsCoinFuturesCoinInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str24, int i11, Object obj) {
        String str25;
        boolean z16;
        String str26 = (i11 & 1) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.code : str;
        String str27 = (i11 & 2) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.currency : str2;
        String str28 = (i11 & 4) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.name : str3;
        String str29 = (i11 & 8) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.iconUrl : str4;
        String str30 = (i11 & 16) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.withdrawDisabledTip : str5;
        String str31 = (i11 & 32) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.depositDisabledTip : str6;
        String str32 = (i11 & 64) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.type : str7;
        String str33 = (i11 & 128) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.precision : str8;
        String str34 = (i11 & 256) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.status : str9;
        String str35 = (i11 & 512) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.withdrawEnableAt : str10;
        String str36 = (i11 & 1024) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.depositEnableAt : str11;
        String str37 = (i11 & 2048) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.withdrawMinFee : str12;
        String str38 = (i11 & 4096) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.withdrawMinSize : str13;
        String str39 = (i11 & 8192) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.innerWithdrawMinFee : str14;
        String str40 = str26;
        String str41 = (i11 & 16384) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.availableBalance : str15;
        String str42 = (i11 & 32768) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.totalBalance : str16;
        String str43 = (i11 & 65536) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isDepositEnabled : str17;
        String str44 = (i11 & 131072) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isWithdrawEnabled : str18;
        String str45 = (i11 & 262144) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isDisplayWithdraw : str19;
        String str46 = (i11 & 524288) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isDisplayDeposit : str20;
        String str47 = (i11 & 1048576) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isMarginEnabled : str21;
        String str48 = (i11 & 2097152) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isDebitEnabled : str22;
        String str49 = (i11 & 4194304) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isPoolXEnabled : str23;
        boolean z17 = (i11 & 8388608) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isEarnEnabled : z11;
        boolean z18 = (i11 & 16777216) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isDigitalCoin : z12;
        boolean z19 = (i11 & 33554432) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isStableCoin : z13;
        boolean z21 = (i11 & 67108864) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isDelistingCoin : z14;
        boolean z22 = (i11 & C2711C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? kCJSApiSymbolsCoinFuturesCoinInfo.isTransferEnabled : z15;
        if ((i11 & 268435456) != 0) {
            z16 = z22;
            str25 = kCJSApiSymbolsCoinFuturesCoinInfo.properties;
        } else {
            str25 = str24;
            z16 = z22;
        }
        return kCJSApiSymbolsCoinFuturesCoinInfo.copy(str40, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str41, str42, str43, str44, str45, str46, str47, str48, str49, z17, z18, z19, z21, z16, str25);
    }

    @NotNull
    public final KCJSApiSymbolsCoinFuturesCoinInfo copy(@NotNull String code, @NotNull String currency, @NotNull String name, @NotNull String iconUrl, @NotNull String withdrawDisabledTip, @NotNull String depositDisabledTip, @NotNull String type, @NotNull String precision, @NotNull String status, @NotNull String withdrawEnableAt, @NotNull String depositEnableAt, @NotNull String withdrawMinFee, @NotNull String withdrawMinSize, @NotNull String innerWithdrawMinFee, @NotNull String availableBalance, @NotNull String totalBalance, @NotNull String isDepositEnabled, @NotNull String isWithdrawEnabled, @NotNull String isDisplayWithdraw, @NotNull String isDisplayDeposit, @NotNull String isMarginEnabled, @NotNull String isDebitEnabled, @NotNull String isPoolXEnabled, boolean isEarnEnabled, boolean isDigitalCoin, boolean isStableCoin, boolean isDelistingCoin, boolean isTransferEnabled, @NotNull String properties) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(withdrawDisabledTip, "withdrawDisabledTip");
        Intrinsics.checkNotNullParameter(depositDisabledTip, "depositDisabledTip");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(precision, "precision");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(withdrawEnableAt, "withdrawEnableAt");
        Intrinsics.checkNotNullParameter(depositEnableAt, "depositEnableAt");
        Intrinsics.checkNotNullParameter(withdrawMinFee, "withdrawMinFee");
        Intrinsics.checkNotNullParameter(withdrawMinSize, "withdrawMinSize");
        Intrinsics.checkNotNullParameter(innerWithdrawMinFee, "innerWithdrawMinFee");
        Intrinsics.checkNotNullParameter(availableBalance, "availableBalance");
        Intrinsics.checkNotNullParameter(totalBalance, "totalBalance");
        Intrinsics.checkNotNullParameter(isDepositEnabled, "isDepositEnabled");
        Intrinsics.checkNotNullParameter(isWithdrawEnabled, "isWithdrawEnabled");
        Intrinsics.checkNotNullParameter(isDisplayWithdraw, "isDisplayWithdraw");
        Intrinsics.checkNotNullParameter(isDisplayDeposit, "isDisplayDeposit");
        Intrinsics.checkNotNullParameter(isMarginEnabled, "isMarginEnabled");
        Intrinsics.checkNotNullParameter(isDebitEnabled, "isDebitEnabled");
        Intrinsics.checkNotNullParameter(isPoolXEnabled, "isPoolXEnabled");
        Intrinsics.checkNotNullParameter(properties, "properties");
        return new KCJSApiSymbolsCoinFuturesCoinInfo(code, currency, name, iconUrl, withdrawDisabledTip, depositDisabledTip, type, precision, status, withdrawEnableAt, depositEnableAt, withdrawMinFee, withdrawMinSize, innerWithdrawMinFee, availableBalance, totalBalance, isDepositEnabled, isWithdrawEnabled, isDisplayWithdraw, isDisplayDeposit, isMarginEnabled, isDebitEnabled, isPoolXEnabled, isEarnEnabled, isDigitalCoin, isStableCoin, isDelistingCoin, isTransferEnabled, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSymbolsCoinFuturesCoinInfo)) {
            return false;
        }
        KCJSApiSymbolsCoinFuturesCoinInfo kCJSApiSymbolsCoinFuturesCoinInfo = (KCJSApiSymbolsCoinFuturesCoinInfo) other;
        return Intrinsics.areEqual(this.code, kCJSApiSymbolsCoinFuturesCoinInfo.code) && Intrinsics.areEqual(this.currency, kCJSApiSymbolsCoinFuturesCoinInfo.currency) && Intrinsics.areEqual(this.name, kCJSApiSymbolsCoinFuturesCoinInfo.name) && Intrinsics.areEqual(this.iconUrl, kCJSApiSymbolsCoinFuturesCoinInfo.iconUrl) && Intrinsics.areEqual(this.withdrawDisabledTip, kCJSApiSymbolsCoinFuturesCoinInfo.withdrawDisabledTip) && Intrinsics.areEqual(this.depositDisabledTip, kCJSApiSymbolsCoinFuturesCoinInfo.depositDisabledTip) && Intrinsics.areEqual(this.type, kCJSApiSymbolsCoinFuturesCoinInfo.type) && Intrinsics.areEqual(this.precision, kCJSApiSymbolsCoinFuturesCoinInfo.precision) && Intrinsics.areEqual(this.status, kCJSApiSymbolsCoinFuturesCoinInfo.status) && Intrinsics.areEqual(this.withdrawEnableAt, kCJSApiSymbolsCoinFuturesCoinInfo.withdrawEnableAt) && Intrinsics.areEqual(this.depositEnableAt, kCJSApiSymbolsCoinFuturesCoinInfo.depositEnableAt) && Intrinsics.areEqual(this.withdrawMinFee, kCJSApiSymbolsCoinFuturesCoinInfo.withdrawMinFee) && Intrinsics.areEqual(this.withdrawMinSize, kCJSApiSymbolsCoinFuturesCoinInfo.withdrawMinSize) && Intrinsics.areEqual(this.innerWithdrawMinFee, kCJSApiSymbolsCoinFuturesCoinInfo.innerWithdrawMinFee) && Intrinsics.areEqual(this.availableBalance, kCJSApiSymbolsCoinFuturesCoinInfo.availableBalance) && Intrinsics.areEqual(this.totalBalance, kCJSApiSymbolsCoinFuturesCoinInfo.totalBalance) && Intrinsics.areEqual(this.isDepositEnabled, kCJSApiSymbolsCoinFuturesCoinInfo.isDepositEnabled) && Intrinsics.areEqual(this.isWithdrawEnabled, kCJSApiSymbolsCoinFuturesCoinInfo.isWithdrawEnabled) && Intrinsics.areEqual(this.isDisplayWithdraw, kCJSApiSymbolsCoinFuturesCoinInfo.isDisplayWithdraw) && Intrinsics.areEqual(this.isDisplayDeposit, kCJSApiSymbolsCoinFuturesCoinInfo.isDisplayDeposit) && Intrinsics.areEqual(this.isMarginEnabled, kCJSApiSymbolsCoinFuturesCoinInfo.isMarginEnabled) && Intrinsics.areEqual(this.isDebitEnabled, kCJSApiSymbolsCoinFuturesCoinInfo.isDebitEnabled) && Intrinsics.areEqual(this.isPoolXEnabled, kCJSApiSymbolsCoinFuturesCoinInfo.isPoolXEnabled) && this.isEarnEnabled == kCJSApiSymbolsCoinFuturesCoinInfo.isEarnEnabled && this.isDigitalCoin == kCJSApiSymbolsCoinFuturesCoinInfo.isDigitalCoin && this.isStableCoin == kCJSApiSymbolsCoinFuturesCoinInfo.isStableCoin && this.isDelistingCoin == kCJSApiSymbolsCoinFuturesCoinInfo.isDelistingCoin && this.isTransferEnabled == kCJSApiSymbolsCoinFuturesCoinInfo.isTransferEnabled && Intrinsics.areEqual(this.properties, kCJSApiSymbolsCoinFuturesCoinInfo.properties);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getIsDepositEnabled() {
        return this.isDepositEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getIsWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getIsDisplayWithdraw() {
        return this.isDisplayWithdraw;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getIsDisplayDeposit() {
        return this.isDisplayDeposit;
    }

    @NotNull
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getIsMarginEnabled() {
        return this.isMarginEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getIsPoolXEnabled() {
        return this.isPoolXEnabled;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsEarnEnabled() {
        return this.isEarnEnabled;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsDigitalCoin() {
        return this.isDigitalCoin;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final boolean getIsStableCoin() {
        return this.isStableCoin;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final boolean getIsDelistingCoin() {
        return this.isDelistingCoin;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final boolean getIsTransferEnabled() {
        return this.isTransferEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final String getProperties() {
        return this.properties;
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
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDepositDisabledTip() {
        return this.depositDisabledTip;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPrecision() {
        return this.precision;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final String getDepositDisabledTip() {
        return this.depositDisabledTip;
    }

    @NotNull
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getInnerWithdrawMinFee() {
        return this.innerWithdrawMinFee;
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
    public final String getProperties() {
        return this.properties;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTotalBalance() {
        return this.totalBalance;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getWithdrawDisabledTip() {
        return this.withdrawDisabledTip;
    }

    @NotNull
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
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
    /* JADX WARN: Type inference failed for: r0v47, types: [int] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51, types: [int] */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v55, types: [int] */
    /* JADX WARN: Type inference failed for: r1v45, types: [int] */
    /* JADX WARN: Type inference failed for: r1v47, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49, types: [int] */
    /* JADX WARN: Type inference failed for: r1v51, types: [int] */
    /* JADX WARN: Type inference failed for: r1v55 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v59 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((this.code.hashCode() * 31) + this.currency.hashCode()) * 31) + this.name.hashCode()) * 31) + this.iconUrl.hashCode()) * 31) + this.withdrawDisabledTip.hashCode()) * 31) + this.depositDisabledTip.hashCode()) * 31) + this.type.hashCode()) * 31) + this.precision.hashCode()) * 31) + this.status.hashCode()) * 31) + this.withdrawEnableAt.hashCode()) * 31) + this.depositEnableAt.hashCode()) * 31) + this.withdrawMinFee.hashCode()) * 31) + this.withdrawMinSize.hashCode()) * 31) + this.innerWithdrawMinFee.hashCode()) * 31) + this.availableBalance.hashCode()) * 31) + this.totalBalance.hashCode()) * 31) + this.isDepositEnabled.hashCode()) * 31) + this.isWithdrawEnabled.hashCode()) * 31) + this.isDisplayWithdraw.hashCode()) * 31) + this.isDisplayDeposit.hashCode()) * 31) + this.isMarginEnabled.hashCode()) * 31) + this.isDebitEnabled.hashCode()) * 31) + this.isPoolXEnabled.hashCode()) * 31;
        boolean z11 = this.isEarnEnabled;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.isDigitalCoin;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.isStableCoin;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int i13 = (i12 + r13) * 31;
        boolean z14 = this.isDelistingCoin;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (i13 + r14) * 31;
        boolean z15 = this.isTransferEnabled;
        return ((i14 + (z15 ? 1 : z15)) * 31) + this.properties.hashCode();
    }

    @NotNull
    public final String isDebitEnabled() {
        return this.isDebitEnabled;
    }

    public final boolean isDelistingCoin() {
        return this.isDelistingCoin;
    }

    @NotNull
    public final String isDepositEnabled() {
        return this.isDepositEnabled;
    }

    public final boolean isDigitalCoin() {
        return this.isDigitalCoin;
    }

    @NotNull
    public final String isDisplayDeposit() {
        return this.isDisplayDeposit;
    }

    @NotNull
    public final String isDisplayWithdraw() {
        return this.isDisplayWithdraw;
    }

    public final boolean isEarnEnabled() {
        return this.isEarnEnabled;
    }

    @NotNull
    public final String isMarginEnabled() {
        return this.isMarginEnabled;
    }

    @NotNull
    public final String isPoolXEnabled() {
        return this.isPoolXEnabled;
    }

    public final boolean isStableCoin() {
        return this.isStableCoin;
    }

    public final boolean isTransferEnabled() {
        return this.isTransferEnabled;
    }

    @NotNull
    public final String isWithdrawEnabled() {
        return this.isWithdrawEnabled;
    }

    @NotNull
    public String toString() {
        return "KCJSApiSymbolsCoinFuturesCoinInfo(code=" + this.code + ", currency=" + this.currency + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", withdrawDisabledTip=" + this.withdrawDisabledTip + ", depositDisabledTip=" + this.depositDisabledTip + ", type=" + this.type + ", precision=" + this.precision + ", status=" + this.status + ", withdrawEnableAt=" + this.withdrawEnableAt + ", depositEnableAt=" + this.depositEnableAt + ", withdrawMinFee=" + this.withdrawMinFee + ", withdrawMinSize=" + this.withdrawMinSize + ", innerWithdrawMinFee=" + this.innerWithdrawMinFee + ", availableBalance=" + this.availableBalance + ", totalBalance=" + this.totalBalance + ", isDepositEnabled=" + this.isDepositEnabled + ", isWithdrawEnabled=" + this.isWithdrawEnabled + ", isDisplayWithdraw=" + this.isDisplayWithdraw + ", isDisplayDeposit=" + this.isDisplayDeposit + ", isMarginEnabled=" + this.isMarginEnabled + ", isDebitEnabled=" + this.isDebitEnabled + ", isPoolXEnabled=" + this.isPoolXEnabled + ", isEarnEnabled=" + this.isEarnEnabled + ", isDigitalCoin=" + this.isDigitalCoin + ", isStableCoin=" + this.isStableCoin + ", isDelistingCoin=" + this.isDelistingCoin + ", isTransferEnabled=" + this.isTransferEnabled + ", properties=" + this.properties + ')';
    }
}
