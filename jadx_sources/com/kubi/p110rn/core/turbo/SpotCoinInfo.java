package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeSymbolsCoinTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B÷\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010+\u001a\u00020,H\u0016J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010<\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010=\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010>\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)J\u0010\u0010@\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010)Jþ\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00122\b\u0010D\u001a\u0004\u0018\u00010EHÖ\u0003J\t\u0010F\u001a\u00020GHÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0011\u0010)R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0013\u0010)R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0014\u0010)R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0015\u0010)R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0016\u0010)R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u0010*\u001a\u0004\b\u0017\u0010)¨\u0006I"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/SpotCoinInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "code", "", FirebaseAnalytics.Param.CURRENCY, "name", "iconUrl", "precision", "status", "withdrawMinFee", "withdrawMinSize", "withdrawEnableAt", "depositEnableAt", "context", "digital", "withdrawEnabled", "depositEnabled", "isDigitalCoin", "", "isStableCoin", "isDelistingCoin", "isDebitEnabled", "isEarnEnabled", "isTransferEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getCode", "()Ljava/lang/String;", "getCurrency", "getName", "getIconUrl", "getPrecision", "getStatus", "getWithdrawMinFee", "getWithdrawMinSize", "getWithdrawEnableAt", "getDepositEnableAt", "getContext", "getDigital", "getWithdrawEnabled", "getDepositEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/kubi/rn/core/turbo/SpotCoinInfo;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeSymbolsCoinTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeSymbolsCoinTurboModule.kt\ncom/kubi/rn/core/turbo/SpotCoinInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,521:1\n1#2:522\n*E\n"})
public final /* data */ class SpotCoinInfo implements WritableMapSerializable {

    @Nullable
    private final String code;

    @Nullable
    private final String context;

    @Nullable
    private final String currency;

    @Nullable
    private final String depositEnableAt;

    @Nullable
    private final String depositEnabled;

    @Nullable
    private final String digital;

    @Nullable
    private final String iconUrl;

    @Nullable
    private final Boolean isDebitEnabled;

    @Nullable
    private final Boolean isDelistingCoin;

    @Nullable
    private final Boolean isDigitalCoin;

    @Nullable
    private final Boolean isEarnEnabled;

    @Nullable
    private final Boolean isStableCoin;

    @Nullable
    private final Boolean isTransferEnabled;

    @Nullable
    private final String name;

    @Nullable
    private final String precision;

    @Nullable
    private final String status;

    @Nullable
    private final String withdrawEnableAt;

    @Nullable
    private final String withdrawEnabled;

    @Nullable
    private final String withdrawMinFee;

    @Nullable
    private final String withdrawMinSize;

    public SpotCoinInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    public static /* synthetic */ SpotCoinInfo copy$default(SpotCoinInfo spotCoinInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, Object obj) {
        Boolean bool7;
        Boolean bool8;
        String str15 = (i11 & 1) != 0 ? spotCoinInfo.code : str;
        String str16 = (i11 & 2) != 0 ? spotCoinInfo.currency : str2;
        String str17 = (i11 & 4) != 0 ? spotCoinInfo.name : str3;
        String str18 = (i11 & 8) != 0 ? spotCoinInfo.iconUrl : str4;
        String str19 = (i11 & 16) != 0 ? spotCoinInfo.precision : str5;
        String str20 = (i11 & 32) != 0 ? spotCoinInfo.status : str6;
        String str21 = (i11 & 64) != 0 ? spotCoinInfo.withdrawMinFee : str7;
        String str22 = (i11 & 128) != 0 ? spotCoinInfo.withdrawMinSize : str8;
        String str23 = (i11 & 256) != 0 ? spotCoinInfo.withdrawEnableAt : str9;
        String str24 = (i11 & 512) != 0 ? spotCoinInfo.depositEnableAt : str10;
        String str25 = (i11 & 1024) != 0 ? spotCoinInfo.context : str11;
        String str26 = (i11 & 2048) != 0 ? spotCoinInfo.digital : str12;
        String str27 = (i11 & 4096) != 0 ? spotCoinInfo.withdrawEnabled : str13;
        String str28 = (i11 & 8192) != 0 ? spotCoinInfo.depositEnabled : str14;
        String str29 = str15;
        Boolean bool9 = (i11 & 16384) != 0 ? spotCoinInfo.isDigitalCoin : bool;
        Boolean bool10 = (i11 & 32768) != 0 ? spotCoinInfo.isStableCoin : bool2;
        Boolean bool11 = (i11 & 65536) != 0 ? spotCoinInfo.isDelistingCoin : bool3;
        Boolean bool12 = (i11 & 131072) != 0 ? spotCoinInfo.isDebitEnabled : bool4;
        Boolean bool13 = (i11 & 262144) != 0 ? spotCoinInfo.isEarnEnabled : bool5;
        if ((i11 & 524288) != 0) {
            bool8 = bool13;
            bool7 = spotCoinInfo.isTransferEnabled;
        } else {
            bool7 = bool6;
            bool8 = bool13;
        }
        return spotCoinInfo.copy(str29, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, bool9, bool10, bool11, bool12, bool8, bool7);
    }

    @NotNull
    public final SpotCoinInfo copy(@Nullable String code, @Nullable String currency, @Nullable String name, @Nullable String iconUrl, @Nullable String precision, @Nullable String status, @Nullable String withdrawMinFee, @Nullable String withdrawMinSize, @Nullable String withdrawEnableAt, @Nullable String depositEnableAt, @Nullable String context, @Nullable String digital, @Nullable String withdrawEnabled, @Nullable String depositEnabled, @Nullable Boolean isDigitalCoin, @Nullable Boolean isStableCoin, @Nullable Boolean isDelistingCoin, @Nullable Boolean isDebitEnabled, @Nullable Boolean isEarnEnabled, @Nullable Boolean isTransferEnabled) {
        return new SpotCoinInfo(code, currency, name, iconUrl, precision, status, withdrawMinFee, withdrawMinSize, withdrawEnableAt, depositEnableAt, context, digital, withdrawEnabled, depositEnabled, isDigitalCoin, isStableCoin, isDelistingCoin, isDebitEnabled, isEarnEnabled, isTransferEnabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotCoinInfo)) {
            return false;
        }
        SpotCoinInfo spotCoinInfo = (SpotCoinInfo) other;
        return Intrinsics.areEqual(this.code, spotCoinInfo.code) && Intrinsics.areEqual(this.currency, spotCoinInfo.currency) && Intrinsics.areEqual(this.name, spotCoinInfo.name) && Intrinsics.areEqual(this.iconUrl, spotCoinInfo.iconUrl) && Intrinsics.areEqual(this.precision, spotCoinInfo.precision) && Intrinsics.areEqual(this.status, spotCoinInfo.status) && Intrinsics.areEqual(this.withdrawMinFee, spotCoinInfo.withdrawMinFee) && Intrinsics.areEqual(this.withdrawMinSize, spotCoinInfo.withdrawMinSize) && Intrinsics.areEqual(this.withdrawEnableAt, spotCoinInfo.withdrawEnableAt) && Intrinsics.areEqual(this.depositEnableAt, spotCoinInfo.depositEnableAt) && Intrinsics.areEqual(this.context, spotCoinInfo.context) && Intrinsics.areEqual(this.digital, spotCoinInfo.digital) && Intrinsics.areEqual(this.withdrawEnabled, spotCoinInfo.withdrawEnabled) && Intrinsics.areEqual(this.depositEnabled, spotCoinInfo.depositEnabled) && Intrinsics.areEqual(this.isDigitalCoin, spotCoinInfo.isDigitalCoin) && Intrinsics.areEqual(this.isStableCoin, spotCoinInfo.isStableCoin) && Intrinsics.areEqual(this.isDelistingCoin, spotCoinInfo.isDelistingCoin) && Intrinsics.areEqual(this.isDebitEnabled, spotCoinInfo.isDebitEnabled) && Intrinsics.areEqual(this.isEarnEnabled, spotCoinInfo.isEarnEnabled) && Intrinsics.areEqual(this.isTransferEnabled, spotCoinInfo.isTransferEnabled);
    }

    public SpotCoinInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Boolean bool4, @Nullable Boolean bool5, @Nullable Boolean bool6) {
        this.code = str;
        this.currency = str2;
        this.name = str3;
        this.iconUrl = str4;
        this.precision = str5;
        this.status = str6;
        this.withdrawMinFee = str7;
        this.withdrawMinSize = str8;
        this.withdrawEnableAt = str9;
        this.depositEnableAt = str10;
        this.context = str11;
        this.digital = str12;
        this.withdrawEnabled = str13;
        this.depositEnabled = str14;
        this.isDigitalCoin = bool;
        this.isStableCoin = bool2;
        this.isDelistingCoin = bool3;
        this.isDebitEnabled = bool4;
        this.isEarnEnabled = bool5;
        this.isTransferEnabled = bool6;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getContext() {
        return this.context;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDigital() {
        return this.digital;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getWithdrawEnabled() {
        return this.withdrawEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDepositEnabled() {
        return this.depositEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Boolean getIsDigitalCoin() {
        return this.isDigitalCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Boolean getIsStableCoin() {
        return this.isStableCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsDelistingCoin() {
        return this.isDelistingCoin;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Boolean getIsDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Boolean getIsEarnEnabled() {
        return this.isEarnEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Boolean getIsTransferEnabled() {
        return this.isTransferEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPrecision() {
        return this.precision;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getContext() {
        return this.context;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final String getDepositEnableAt() {
        return this.depositEnableAt;
    }

    @Nullable
    public final String getDepositEnabled() {
        return this.depositEnabled;
    }

    @Nullable
    public final String getDigital() {
        return this.digital;
    }

    @Nullable
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPrecision() {
        return this.precision;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getWithdrawEnableAt() {
        return this.withdrawEnableAt;
    }

    @Nullable
    public final String getWithdrawEnabled() {
        return this.withdrawEnabled;
    }

    @Nullable
    public final String getWithdrawMinFee() {
        return this.withdrawMinFee;
    }

    @Nullable
    public final String getWithdrawMinSize() {
        return this.withdrawMinSize;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.precision;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.status;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.withdrawMinFee;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.withdrawMinSize;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.withdrawEnableAt;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.depositEnableAt;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.context;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.digital;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.withdrawEnabled;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.depositEnabled;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool = this.isDigitalCoin;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isStableCoin;
        int iHashCode16 = (iHashCode15 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isDelistingCoin;
        int iHashCode17 = (iHashCode16 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isDebitEnabled;
        int iHashCode18 = (iHashCode17 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isEarnEnabled;
        int iHashCode19 = (iHashCode18 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isTransferEnabled;
        return iHashCode19 + (bool6 != null ? bool6.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDebitEnabled() {
        return this.isDebitEnabled;
    }

    @Nullable
    public final Boolean isDelistingCoin() {
        return this.isDelistingCoin;
    }

    @Nullable
    public final Boolean isDigitalCoin() {
        return this.isDigitalCoin;
    }

    @Nullable
    public final Boolean isEarnEnabled() {
        return this.isEarnEnabled;
    }

    @Nullable
    public final Boolean isStableCoin() {
        return this.isStableCoin;
    }

    @Nullable
    public final Boolean isTransferEnabled() {
        return this.isTransferEnabled;
    }

    @NotNull
    public String toString() {
        return "SpotCoinInfo(code=" + this.code + ", currency=" + this.currency + ", name=" + this.name + ", iconUrl=" + this.iconUrl + ", precision=" + this.precision + ", status=" + this.status + ", withdrawMinFee=" + this.withdrawMinFee + ", withdrawMinSize=" + this.withdrawMinSize + ", withdrawEnableAt=" + this.withdrawEnableAt + ", depositEnableAt=" + this.depositEnableAt + ", context=" + this.context + ", digital=" + this.digital + ", withdrawEnabled=" + this.withdrawEnabled + ", depositEnabled=" + this.depositEnabled + ", isDigitalCoin=" + this.isDigitalCoin + ", isStableCoin=" + this.isStableCoin + ", isDelistingCoin=" + this.isDelistingCoin + ", isDebitEnabled=" + this.isDebitEnabled + ", isEarnEnabled=" + this.isEarnEnabled + ", isTransferEnabled=" + this.isTransferEnabled + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.code;
        if (str != null) {
            writableMapCreateMap.putString("code", str.toString());
        }
        String str2 = this.currency;
        if (str2 != null) {
            writableMapCreateMap.putString(FirebaseAnalytics.Param.CURRENCY, str2.toString());
        }
        String str3 = this.name;
        if (str3 != null) {
            writableMapCreateMap.putString("name", str3.toString());
        }
        String str4 = this.iconUrl;
        if (str4 != null) {
            writableMapCreateMap.putString("iconUrl", str4.toString());
        }
        String str5 = this.precision;
        if (str5 != null) {
            writableMapCreateMap.putString("precision", str5.toString());
        }
        String str6 = this.status;
        if (str6 != null) {
            writableMapCreateMap.putString("status", str6.toString());
        }
        String str7 = this.withdrawMinFee;
        if (str7 != null) {
            writableMapCreateMap.putString("withdrawMinFee", str7.toString());
        }
        String str8 = this.withdrawMinSize;
        if (str8 != null) {
            writableMapCreateMap.putString("withdrawMinSize", str8.toString());
        }
        String str9 = this.withdrawEnableAt;
        if (str9 != null) {
            writableMapCreateMap.putString("withdrawEnableAt", str9.toString());
        }
        String str10 = this.depositEnableAt;
        if (str10 != null) {
            writableMapCreateMap.putString("depositEnableAt", str10.toString());
        }
        String str11 = this.context;
        if (str11 != null) {
            writableMapCreateMap.putString("context", str11.toString());
        }
        String str12 = this.digital;
        if (str12 != null) {
            writableMapCreateMap.putString("digital", str12.toString());
        }
        String str13 = this.withdrawEnabled;
        if (str13 != null) {
            writableMapCreateMap.putString("withdrawEnabled", str13.toString());
        }
        String str14 = this.depositEnabled;
        if (str14 != null) {
            writableMapCreateMap.putString("depositEnabled", str14.toString());
        }
        Boolean bool = this.isDigitalCoin;
        if (bool != null) {
            writableMapCreateMap.putBoolean("isDigitalCoin", bool.booleanValue());
        }
        Boolean bool2 = this.isStableCoin;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("isStableCoin", bool2.booleanValue());
        }
        Boolean bool3 = this.isDelistingCoin;
        if (bool3 != null) {
            writableMapCreateMap.putBoolean("isDelistingCoin", bool3.booleanValue());
        }
        Boolean bool4 = this.isDebitEnabled;
        if (bool4 != null) {
            writableMapCreateMap.putBoolean("isDebitEnabled", bool4.booleanValue());
        }
        Boolean bool5 = this.isEarnEnabled;
        if (bool5 != null) {
            writableMapCreateMap.putBoolean("isEarnEnabled", bool5.booleanValue());
        }
        Boolean bool6 = this.isTransferEnabled;
        if (bool6 != null) {
            writableMapCreateMap.putBoolean("isTransferEnabled", bool6.booleanValue());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ SpotCoinInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, (i11 & 4096) != 0 ? null : str13, (i11 & 8192) != 0 ? null : str14, (i11 & 16384) != 0 ? null : bool, (i11 & 32768) != 0 ? null : bool2, (i11 & 65536) != 0 ? null : bool3, (i11 & 131072) != 0 ? null : bool4, (i11 & 262144) != 0 ? null : bool5, (i11 & 524288) != 0 ? null : bool6);
    }
}
