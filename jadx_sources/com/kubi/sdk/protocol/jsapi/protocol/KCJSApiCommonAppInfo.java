package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import com.tencent.bugly.proguard.C33577c3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiCommonModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0002\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\nHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003JÇ\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010?\u001a\u00020\n2\b\u0010@\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010A\u001a\u00020BHÖ\u0001J\t\u0010C\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019¨\u0006D"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiCommonAppInfo;", "", "legal", "", "legalSymbol", "lang", "version", "webHost", "feeLevel", "darkMode", "", "cstyle", "siteType", "appMode", "isInland", C33577c3.f69334H, "networkType", "xversion", "apiType", "appPciHost", "isTurnoverLegal", "anonymousId", "h5Host", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAnonymousId", "()Ljava/lang/String;", "getApiType", "getAppMode", "getAppPciHost", "getCstyle", "()Z", "getDarkMode", "getDeviceId", "getFeeLevel", "getH5Host", "getLang", "getLegal", "getLegalSymbol", "getNetworkType", "getSiteType", "getVersion", "getWebHost", "getXversion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiCommonAppInfo {

    @NotNull
    private final String anonymousId;

    @NotNull
    private final String apiType;

    @NotNull
    private final String appMode;

    @NotNull
    private final String appPciHost;
    private final boolean cstyle;
    private final boolean darkMode;

    @NotNull
    private final String deviceId;

    @NotNull
    private final String feeLevel;

    @NotNull
    private final String h5Host;
    private final boolean isInland;
    private final boolean isTurnoverLegal;

    @NotNull
    private final String lang;

    @NotNull
    private final String legal;

    @NotNull
    private final String legalSymbol;

    @NotNull
    private final String networkType;

    @NotNull
    private final String siteType;

    @NotNull
    private final String version;

    @NotNull
    private final String webHost;

    @NotNull
    private final String xversion;

    public KCJSApiCommonAppInfo(@NotNull String legal, @NotNull String legalSymbol, @NotNull String lang, @NotNull String version, @NotNull String webHost, @NotNull String feeLevel, boolean z11, boolean z12, @NotNull String siteType, @NotNull String appMode, boolean z13, @NotNull String deviceId, @NotNull String networkType, @NotNull String xversion, @NotNull String apiType, @NotNull String appPciHost, boolean z14, @NotNull String anonymousId, @NotNull String h5Host) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(legalSymbol, "legalSymbol");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(webHost, "webHost");
        Intrinsics.checkNotNullParameter(feeLevel, "feeLevel");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(xversion, "xversion");
        Intrinsics.checkNotNullParameter(apiType, "apiType");
        Intrinsics.checkNotNullParameter(appPciHost, "appPciHost");
        Intrinsics.checkNotNullParameter(anonymousId, "anonymousId");
        Intrinsics.checkNotNullParameter(h5Host, "h5Host");
        this.legal = legal;
        this.legalSymbol = legalSymbol;
        this.lang = lang;
        this.version = version;
        this.webHost = webHost;
        this.feeLevel = feeLevel;
        this.darkMode = z11;
        this.cstyle = z12;
        this.siteType = siteType;
        this.appMode = appMode;
        this.isInland = z13;
        this.deviceId = deviceId;
        this.networkType = networkType;
        this.xversion = xversion;
        this.apiType = apiType;
        this.appPciHost = appPciHost;
        this.isTurnoverLegal = z14;
        this.anonymousId = anonymousId;
        this.h5Host = h5Host;
    }

    public static /* synthetic */ KCJSApiCommonAppInfo copy$default(KCJSApiCommonAppInfo kCJSApiCommonAppInfo, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, boolean z12, String str7, String str8, boolean z13, String str9, String str10, String str11, String str12, String str13, boolean z14, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? kCJSApiCommonAppInfo.legal : str;
        String str19 = (i11 & 2) != 0 ? kCJSApiCommonAppInfo.legalSymbol : str2;
        String str20 = (i11 & 4) != 0 ? kCJSApiCommonAppInfo.lang : str3;
        String str21 = (i11 & 8) != 0 ? kCJSApiCommonAppInfo.version : str4;
        String str22 = (i11 & 16) != 0 ? kCJSApiCommonAppInfo.webHost : str5;
        String str23 = (i11 & 32) != 0 ? kCJSApiCommonAppInfo.feeLevel : str6;
        boolean z15 = (i11 & 64) != 0 ? kCJSApiCommonAppInfo.darkMode : z11;
        boolean z16 = (i11 & 128) != 0 ? kCJSApiCommonAppInfo.cstyle : z12;
        String str24 = (i11 & 256) != 0 ? kCJSApiCommonAppInfo.siteType : str7;
        String str25 = (i11 & 512) != 0 ? kCJSApiCommonAppInfo.appMode : str8;
        boolean z17 = (i11 & 1024) != 0 ? kCJSApiCommonAppInfo.isInland : z13;
        String str26 = (i11 & 2048) != 0 ? kCJSApiCommonAppInfo.deviceId : str9;
        String str27 = (i11 & 4096) != 0 ? kCJSApiCommonAppInfo.networkType : str10;
        String str28 = (i11 & 8192) != 0 ? kCJSApiCommonAppInfo.xversion : str11;
        String str29 = str18;
        String str30 = (i11 & 16384) != 0 ? kCJSApiCommonAppInfo.apiType : str12;
        String str31 = (i11 & 32768) != 0 ? kCJSApiCommonAppInfo.appPciHost : str13;
        boolean z18 = (i11 & 65536) != 0 ? kCJSApiCommonAppInfo.isTurnoverLegal : z14;
        String str32 = (i11 & 131072) != 0 ? kCJSApiCommonAppInfo.anonymousId : str14;
        if ((i11 & 262144) != 0) {
            str17 = str32;
            str16 = kCJSApiCommonAppInfo.h5Host;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return kCJSApiCommonAppInfo.copy(str29, str19, str20, str21, str22, str23, z15, z16, str24, str25, z17, str26, str27, str28, str30, str31, z18, str17, str16);
    }

    @NotNull
    public final KCJSApiCommonAppInfo copy(@NotNull String legal, @NotNull String legalSymbol, @NotNull String lang, @NotNull String version, @NotNull String webHost, @NotNull String feeLevel, boolean darkMode, boolean cstyle, @NotNull String siteType, @NotNull String appMode, boolean isInland, @NotNull String deviceId, @NotNull String networkType, @NotNull String xversion, @NotNull String apiType, @NotNull String appPciHost, boolean isTurnoverLegal, @NotNull String anonymousId, @NotNull String h5Host) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(legalSymbol, "legalSymbol");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(webHost, "webHost");
        Intrinsics.checkNotNullParameter(feeLevel, "feeLevel");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(xversion, "xversion");
        Intrinsics.checkNotNullParameter(apiType, "apiType");
        Intrinsics.checkNotNullParameter(appPciHost, "appPciHost");
        Intrinsics.checkNotNullParameter(anonymousId, "anonymousId");
        Intrinsics.checkNotNullParameter(h5Host, "h5Host");
        return new KCJSApiCommonAppInfo(legal, legalSymbol, lang, version, webHost, feeLevel, darkMode, cstyle, siteType, appMode, isInland, deviceId, networkType, xversion, apiType, appPciHost, isTurnoverLegal, anonymousId, h5Host);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiCommonAppInfo)) {
            return false;
        }
        KCJSApiCommonAppInfo kCJSApiCommonAppInfo = (KCJSApiCommonAppInfo) other;
        return Intrinsics.areEqual(this.legal, kCJSApiCommonAppInfo.legal) && Intrinsics.areEqual(this.legalSymbol, kCJSApiCommonAppInfo.legalSymbol) && Intrinsics.areEqual(this.lang, kCJSApiCommonAppInfo.lang) && Intrinsics.areEqual(this.version, kCJSApiCommonAppInfo.version) && Intrinsics.areEqual(this.webHost, kCJSApiCommonAppInfo.webHost) && Intrinsics.areEqual(this.feeLevel, kCJSApiCommonAppInfo.feeLevel) && this.darkMode == kCJSApiCommonAppInfo.darkMode && this.cstyle == kCJSApiCommonAppInfo.cstyle && Intrinsics.areEqual(this.siteType, kCJSApiCommonAppInfo.siteType) && Intrinsics.areEqual(this.appMode, kCJSApiCommonAppInfo.appMode) && this.isInland == kCJSApiCommonAppInfo.isInland && Intrinsics.areEqual(this.deviceId, kCJSApiCommonAppInfo.deviceId) && Intrinsics.areEqual(this.networkType, kCJSApiCommonAppInfo.networkType) && Intrinsics.areEqual(this.xversion, kCJSApiCommonAppInfo.xversion) && Intrinsics.areEqual(this.apiType, kCJSApiCommonAppInfo.apiType) && Intrinsics.areEqual(this.appPciHost, kCJSApiCommonAppInfo.appPciHost) && this.isTurnoverLegal == kCJSApiCommonAppInfo.isTurnoverLegal && Intrinsics.areEqual(this.anonymousId, kCJSApiCommonAppInfo.anonymousId) && Intrinsics.areEqual(this.h5Host, kCJSApiCommonAppInfo.h5Host);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAppMode() {
        return this.appMode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsInland() {
        return this.isInland;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getXversion() {
        return this.xversion;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getApiType() {
        return this.apiType;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAppPciHost() {
        return this.appPciHost;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final boolean getIsTurnoverLegal() {
        return this.isTurnoverLegal;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getAnonymousId() {
        return this.anonymousId;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getH5Host() {
        return this.h5Host;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLegalSymbol() {
        return this.legalSymbol;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWebHost() {
        return this.webHost;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFeeLevel() {
        return this.feeLevel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getDarkMode() {
        return this.darkMode;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getCstyle() {
        return this.cstyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @NotNull
    public final String getAnonymousId() {
        return this.anonymousId;
    }

    @NotNull
    public final String getApiType() {
        return this.apiType;
    }

    @NotNull
    public final String getAppMode() {
        return this.appMode;
    }

    @NotNull
    public final String getAppPciHost() {
        return this.appPciHost;
    }

    public final boolean getCstyle() {
        return this.cstyle;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getFeeLevel() {
        return this.feeLevel;
    }

    @NotNull
    public final String getH5Host() {
        return this.h5Host;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final String getLegal() {
        return this.legal;
    }

    @NotNull
    public final String getLegalSymbol() {
        return this.legalSymbol;
    }

    @NotNull
    public final String getNetworkType() {
        return this.networkType;
    }

    @NotNull
    public final String getSiteType() {
        return this.siteType;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final String getWebHost() {
        return this.webHost;
    }

    @NotNull
    public final String getXversion() {
        return this.xversion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((this.legal.hashCode() * 31) + this.legalSymbol.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.version.hashCode()) * 31) + this.webHost.hashCode()) * 31) + this.feeLevel.hashCode()) * 31;
        boolean z11 = this.darkMode;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (iHashCode + r11) * 31;
        boolean z12 = this.cstyle;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int iHashCode2 = (((((i11 + r12) * 31) + this.siteType.hashCode()) * 31) + this.appMode.hashCode()) * 31;
        boolean z13 = this.isInland;
        ?? r13 = z13;
        if (z13) {
            r13 = 1;
        }
        int iHashCode3 = (((((((((((iHashCode2 + r13) * 31) + this.deviceId.hashCode()) * 31) + this.networkType.hashCode()) * 31) + this.xversion.hashCode()) * 31) + this.apiType.hashCode()) * 31) + this.appPciHost.hashCode()) * 31;
        boolean z14 = this.isTurnoverLegal;
        return ((((iHashCode3 + (z14 ? 1 : z14)) * 31) + this.anonymousId.hashCode()) * 31) + this.h5Host.hashCode();
    }

    public final boolean isInland() {
        return this.isInland;
    }

    public final boolean isTurnoverLegal() {
        return this.isTurnoverLegal;
    }

    @NotNull
    public String toString() {
        return "KCJSApiCommonAppInfo(legal=" + this.legal + ", legalSymbol=" + this.legalSymbol + ", lang=" + this.lang + ", version=" + this.version + ", webHost=" + this.webHost + ", feeLevel=" + this.feeLevel + ", darkMode=" + this.darkMode + ", cstyle=" + this.cstyle + ", siteType=" + this.siteType + ", appMode=" + this.appMode + ", isInland=" + this.isInland + ", deviceId=" + this.deviceId + ", networkType=" + this.networkType + ", xversion=" + this.xversion + ", apiType=" + this.apiType + ", appPciHost=" + this.appPciHost + ", isTurnoverLegal=" + this.isTurnoverLegal + ", anonymousId=" + this.anonymousId + ", h5Host=" + this.h5Host + ')';
    }
}
