package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.tencent.bugly.proguard.C33577c3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NativeCommonTurboModule.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bë\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010-\u001a\u00020.H\u0016J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00106\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jò\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\n2\b\u0010E\u001a\u0004\u0018\u00010FHÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u000e\u0010!R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b\u0014\u0010!R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001a¨\u0006J"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/AppInfo;", "Lcom/kubi/rn/core/turbo/WritableMapSerializable;", "legal", "", "legalSymbol", "lang", "version", "webHost", "feeLevel", "darkMode", "", "cstyle", "siteType", "appMode", "isInland", C33577c3.f69334H, "networkType", "xversion", "apiType", "appPciHost", "isTurnoverLegal", "anonymousId", "h5Host", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getLegal", "()Ljava/lang/String;", "getLegalSymbol", "getLang", "getVersion", "getWebHost", "getFeeLevel", "getDarkMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCstyle", "getSiteType", "getAppMode", "getDeviceId", "getNetworkType", "getXversion", "getApiType", "getAppPciHost", "getAnonymousId", "getH5Host", "toWritableMap", "Lcom/facebook/react/bridge/WritableMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/rn/core/turbo/AppInfo;", "equals", "other", "", "hashCode", "", "toString", "app_modules_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeCommonTurboModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeCommonTurboModule.kt\ncom/kubi/rn/core/turbo/AppInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,387:1\n1#2:388\n*E\n"})
public final /* data */ class AppInfo implements WritableMapSerializable {

    @Nullable
    private final String anonymousId;

    @Nullable
    private final String apiType;

    @Nullable
    private final String appMode;

    @Nullable
    private final String appPciHost;

    @Nullable
    private final Boolean cstyle;

    @Nullable
    private final Boolean darkMode;

    @Nullable
    private final String deviceId;

    @Nullable
    private final String feeLevel;

    @Nullable
    private final String h5Host;

    @Nullable
    private final Boolean isInland;

    @Nullable
    private final Boolean isTurnoverLegal;

    @Nullable
    private final String lang;

    @Nullable
    private final String legal;

    @Nullable
    private final String legalSymbol;

    @Nullable
    private final String networkType;

    @Nullable
    private final String siteType;

    @Nullable
    private final String version;

    @Nullable
    private final String webHost;

    @Nullable
    private final String xversion;

    public AppInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3, String str9, String str10, String str11, String str12, String str13, Boolean bool4, String str14, String str15, int i11, Object obj) {
        String str16;
        String str17;
        String str18 = (i11 & 1) != 0 ? appInfo.legal : str;
        String str19 = (i11 & 2) != 0 ? appInfo.legalSymbol : str2;
        String str20 = (i11 & 4) != 0 ? appInfo.lang : str3;
        String str21 = (i11 & 8) != 0 ? appInfo.version : str4;
        String str22 = (i11 & 16) != 0 ? appInfo.webHost : str5;
        String str23 = (i11 & 32) != 0 ? appInfo.feeLevel : str6;
        Boolean bool5 = (i11 & 64) != 0 ? appInfo.darkMode : bool;
        Boolean bool6 = (i11 & 128) != 0 ? appInfo.cstyle : bool2;
        String str24 = (i11 & 256) != 0 ? appInfo.siteType : str7;
        String str25 = (i11 & 512) != 0 ? appInfo.appMode : str8;
        Boolean bool7 = (i11 & 1024) != 0 ? appInfo.isInland : bool3;
        String str26 = (i11 & 2048) != 0 ? appInfo.deviceId : str9;
        String str27 = (i11 & 4096) != 0 ? appInfo.networkType : str10;
        String str28 = (i11 & 8192) != 0 ? appInfo.xversion : str11;
        String str29 = str18;
        String str30 = (i11 & 16384) != 0 ? appInfo.apiType : str12;
        String str31 = (i11 & 32768) != 0 ? appInfo.appPciHost : str13;
        Boolean bool8 = (i11 & 65536) != 0 ? appInfo.isTurnoverLegal : bool4;
        String str32 = (i11 & 131072) != 0 ? appInfo.anonymousId : str14;
        if ((i11 & 262144) != 0) {
            str17 = str32;
            str16 = appInfo.h5Host;
        } else {
            str16 = str15;
            str17 = str32;
        }
        return appInfo.copy(str29, str19, str20, str21, str22, str23, bool5, bool6, str24, str25, bool7, str26, str27, str28, str30, str31, bool8, str17, str16);
    }

    @NotNull
    public final AppInfo copy(@Nullable String legal, @Nullable String legalSymbol, @Nullable String lang, @Nullable String version, @Nullable String webHost, @Nullable String feeLevel, @Nullable Boolean darkMode, @Nullable Boolean cstyle, @Nullable String siteType, @Nullable String appMode, @Nullable Boolean isInland, @Nullable String deviceId, @Nullable String networkType, @Nullable String xversion, @Nullable String apiType, @Nullable String appPciHost, @Nullable Boolean isTurnoverLegal, @Nullable String anonymousId, @Nullable String h5Host) {
        return new AppInfo(legal, legalSymbol, lang, version, webHost, feeLevel, darkMode, cstyle, siteType, appMode, isInland, deviceId, networkType, xversion, apiType, appPciHost, isTurnoverLegal, anonymousId, h5Host);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppInfo)) {
            return false;
        }
        AppInfo appInfo = (AppInfo) other;
        return Intrinsics.areEqual(this.legal, appInfo.legal) && Intrinsics.areEqual(this.legalSymbol, appInfo.legalSymbol) && Intrinsics.areEqual(this.lang, appInfo.lang) && Intrinsics.areEqual(this.version, appInfo.version) && Intrinsics.areEqual(this.webHost, appInfo.webHost) && Intrinsics.areEqual(this.feeLevel, appInfo.feeLevel) && Intrinsics.areEqual(this.darkMode, appInfo.darkMode) && Intrinsics.areEqual(this.cstyle, appInfo.cstyle) && Intrinsics.areEqual(this.siteType, appInfo.siteType) && Intrinsics.areEqual(this.appMode, appInfo.appMode) && Intrinsics.areEqual(this.isInland, appInfo.isInland) && Intrinsics.areEqual(this.deviceId, appInfo.deviceId) && Intrinsics.areEqual(this.networkType, appInfo.networkType) && Intrinsics.areEqual(this.xversion, appInfo.xversion) && Intrinsics.areEqual(this.apiType, appInfo.apiType) && Intrinsics.areEqual(this.appPciHost, appInfo.appPciHost) && Intrinsics.areEqual(this.isTurnoverLegal, appInfo.isTurnoverLegal) && Intrinsics.areEqual(this.anonymousId, appInfo.anonymousId) && Intrinsics.areEqual(this.h5Host, appInfo.h5Host);
    }

    public AppInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str7, @Nullable String str8, @Nullable Boolean bool3, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable Boolean bool4, @Nullable String str14, @Nullable String str15) {
        this.legal = str;
        this.legalSymbol = str2;
        this.lang = str3;
        this.version = str4;
        this.webHost = str5;
        this.feeLevel = str6;
        this.darkMode = bool;
        this.cstyle = bool2;
        this.siteType = str7;
        this.appMode = str8;
        this.isInland = bool3;
        this.deviceId = str9;
        this.networkType = str10;
        this.xversion = str11;
        this.apiType = str12;
        this.appPciHost = str13;
        this.isTurnoverLegal = bool4;
        this.anonymousId = str14;
        this.h5Host = str15;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAppMode() {
        return this.appMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getIsInland() {
        return this.isInland;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getNetworkType() {
        return this.networkType;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getXversion() {
        return this.xversion;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getApiType() {
        return this.apiType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAppPciHost() {
        return this.appPciHost;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Boolean getIsTurnoverLegal() {
        return this.isTurnoverLegal;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getH5Host() {
        return this.h5Host;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLegalSymbol() {
        return this.legalSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getWebHost() {
        return this.webHost;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFeeLevel() {
        return this.feeLevel;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getDarkMode() {
        return this.darkMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getCstyle() {
        return this.cstyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    public final String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public final String getApiType() {
        return this.apiType;
    }

    @Nullable
    public final String getAppMode() {
        return this.appMode;
    }

    @Nullable
    public final String getAppPciHost() {
        return this.appPciHost;
    }

    @Nullable
    public final Boolean getCstyle() {
        return this.cstyle;
    }

    @Nullable
    public final Boolean getDarkMode() {
        return this.darkMode;
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final String getFeeLevel() {
        return this.feeLevel;
    }

    @Nullable
    public final String getH5Host() {
        return this.h5Host;
    }

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    @Nullable
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    public final String getLegalSymbol() {
        return this.legalSymbol;
    }

    @Nullable
    public final String getNetworkType() {
        return this.networkType;
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    public final String getWebHost() {
        return this.webHost;
    }

    @Nullable
    public final String getXversion() {
        return this.xversion;
    }

    public int hashCode() {
        String str = this.legal;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.legalSymbol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lang;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.version;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.webHost;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.feeLevel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.darkMode;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.cstyle;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.siteType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.appMode;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool3 = this.isInland;
        int iHashCode11 = (iHashCode10 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str9 = this.deviceId;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.networkType;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.xversion;
        int iHashCode14 = (iHashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.apiType;
        int iHashCode15 = (iHashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.appPciHost;
        int iHashCode16 = (iHashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Boolean bool4 = this.isTurnoverLegal;
        int iHashCode17 = (iHashCode16 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str14 = this.anonymousId;
        int iHashCode18 = (iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.h5Host;
        return iHashCode18 + (str15 != null ? str15.hashCode() : 0);
    }

    @Nullable
    public final Boolean isInland() {
        return this.isInland;
    }

    @Nullable
    public final Boolean isTurnoverLegal() {
        return this.isTurnoverLegal;
    }

    @NotNull
    public String toString() {
        return "AppInfo(legal=" + this.legal + ", legalSymbol=" + this.legalSymbol + ", lang=" + this.lang + ", version=" + this.version + ", webHost=" + this.webHost + ", feeLevel=" + this.feeLevel + ", darkMode=" + this.darkMode + ", cstyle=" + this.cstyle + ", siteType=" + this.siteType + ", appMode=" + this.appMode + ", isInland=" + this.isInland + ", deviceId=" + this.deviceId + ", networkType=" + this.networkType + ", xversion=" + this.xversion + ", apiType=" + this.apiType + ", appPciHost=" + this.appPciHost + ", isTurnoverLegal=" + this.isTurnoverLegal + ", anonymousId=" + this.anonymousId + ", h5Host=" + this.h5Host + ")";
    }

    @Override // com.kubi.p110rn.core.turbo.WritableMapSerializable
    @NotNull
    public WritableMap toWritableMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String str = this.legal;
        if (str != null) {
            writableMapCreateMap.putString("legal", str.toString());
        }
        String str2 = this.legalSymbol;
        if (str2 != null) {
            writableMapCreateMap.putString("legalSymbol", str2.toString());
        }
        String str3 = this.lang;
        if (str3 != null) {
            writableMapCreateMap.putString("lang", str3.toString());
        }
        String str4 = this.version;
        if (str4 != null) {
            writableMapCreateMap.putString("version", str4.toString());
        }
        String str5 = this.webHost;
        if (str5 != null) {
            writableMapCreateMap.putString("webHost", str5.toString());
        }
        String str6 = this.feeLevel;
        if (str6 != null) {
            writableMapCreateMap.putString("feeLevel", str6.toString());
        }
        Boolean bool = this.darkMode;
        if (bool != null) {
            writableMapCreateMap.putBoolean("darkMode", bool.booleanValue());
        }
        Boolean bool2 = this.cstyle;
        if (bool2 != null) {
            writableMapCreateMap.putBoolean("cstyle", bool2.booleanValue());
        }
        String str7 = this.siteType;
        if (str7 != null) {
            writableMapCreateMap.putString("siteType", str7.toString());
        }
        String str8 = this.appMode;
        if (str8 != null) {
            writableMapCreateMap.putString("appMode", str8.toString());
        }
        Boolean bool3 = this.isInland;
        if (bool3 != null) {
            writableMapCreateMap.putBoolean("isInland", bool3.booleanValue());
        }
        String str9 = this.deviceId;
        if (str9 != null) {
            writableMapCreateMap.putString(C33577c3.f69334H, str9.toString());
        }
        String str10 = this.networkType;
        if (str10 != null) {
            writableMapCreateMap.putString("networkType", str10.toString());
        }
        String str11 = this.xversion;
        if (str11 != null) {
            writableMapCreateMap.putString("xversion", str11.toString());
        }
        String str12 = this.apiType;
        if (str12 != null) {
            writableMapCreateMap.putString("apiType", str12.toString());
        }
        String str13 = this.appPciHost;
        if (str13 != null) {
            writableMapCreateMap.putString("appPciHost", str13.toString());
        }
        Boolean bool4 = this.isTurnoverLegal;
        if (bool4 != null) {
            writableMapCreateMap.putBoolean("isTurnoverLegal", bool4.booleanValue());
        }
        String str14 = this.anonymousId;
        if (str14 != null) {
            writableMapCreateMap.putString("anonymousId", str14.toString());
        }
        String str15 = this.h5Host;
        if (str15 != null) {
            writableMapCreateMap.putString("h5Host", str15.toString());
        }
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public /* synthetic */ AppInfo(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, String str7, String str8, Boolean bool3, String str9, String str10, String str11, String str12, String str13, Boolean bool4, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? null : bool2, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? null : bool3, (i11 & 2048) != 0 ? null : str9, (i11 & 4096) != 0 ? null : str10, (i11 & 8192) != 0 ? null : str11, (i11 & 16384) != 0 ? null : str12, (i11 & 32768) != 0 ? null : str13, (i11 & 65536) != 0 ? null : bool4, (i11 & 131072) != 0 ? null : str14, (i11 & 262144) != 0 ? null : str15);
    }
}
