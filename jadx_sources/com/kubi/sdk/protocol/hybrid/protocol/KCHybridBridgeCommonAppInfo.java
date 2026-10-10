package com.kubi.sdk.protocol.hybrid.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCHybridBridgeCommonCall.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\nHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/protocol/hybrid/protocol/KCHybridBridgeCommonAppInfo;", "", "legal", "", "legalSymbol", "lang", "version", "webHost", "feeLevel", "darkMode", "", "cstyle", "siteType", "appMode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getAppMode", "()Ljava/lang/String;", "getCstyle", "()Z", "getDarkMode", "getFeeLevel", "getLang", "getLegal", "getLegalSymbol", "getSiteType", "getVersion", "getWebHost", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCHybridBridgeCommonAppInfo {

    @NotNull
    private final String appMode;
    private final boolean cstyle;
    private final boolean darkMode;

    @NotNull
    private final String feeLevel;

    @NotNull
    private final String lang;

    @NotNull
    private final String legal;

    @NotNull
    private final String legalSymbol;

    @NotNull
    private final String siteType;

    @NotNull
    private final String version;

    @NotNull
    private final String webHost;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCHybridBridgeCommonAppInfo)) {
            return false;
        }
        KCHybridBridgeCommonAppInfo kCHybridBridgeCommonAppInfo = (KCHybridBridgeCommonAppInfo) other;
        return Intrinsics.areEqual(this.legal, kCHybridBridgeCommonAppInfo.legal) && Intrinsics.areEqual(this.legalSymbol, kCHybridBridgeCommonAppInfo.legalSymbol) && Intrinsics.areEqual(this.lang, kCHybridBridgeCommonAppInfo.lang) && Intrinsics.areEqual(this.version, kCHybridBridgeCommonAppInfo.version) && Intrinsics.areEqual(this.webHost, kCHybridBridgeCommonAppInfo.webHost) && Intrinsics.areEqual(this.feeLevel, kCHybridBridgeCommonAppInfo.feeLevel) && this.darkMode == kCHybridBridgeCommonAppInfo.darkMode && this.cstyle == kCHybridBridgeCommonAppInfo.cstyle && Intrinsics.areEqual(this.siteType, kCHybridBridgeCommonAppInfo.siteType) && Intrinsics.areEqual(this.appMode, kCHybridBridgeCommonAppInfo.appMode);
    }

    public KCHybridBridgeCommonAppInfo(@NotNull String legal, @NotNull String legalSymbol, @NotNull String lang, @NotNull String version, @NotNull String webHost, @NotNull String feeLevel, boolean z11, boolean z12, @NotNull String siteType, @NotNull String appMode) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(legalSymbol, "legalSymbol");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(webHost, "webHost");
        Intrinsics.checkNotNullParameter(feeLevel, "feeLevel");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
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
    }

    public static /* synthetic */ KCHybridBridgeCommonAppInfo copy$default(KCHybridBridgeCommonAppInfo kCHybridBridgeCommonAppInfo, String str, String str2, String str3, String str4, String str5, String str6, boolean z11, boolean z12, String str7, String str8, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCHybridBridgeCommonAppInfo.legal;
        }
        if ((i11 & 2) != 0) {
            str2 = kCHybridBridgeCommonAppInfo.legalSymbol;
        }
        if ((i11 & 4) != 0) {
            str3 = kCHybridBridgeCommonAppInfo.lang;
        }
        if ((i11 & 8) != 0) {
            str4 = kCHybridBridgeCommonAppInfo.version;
        }
        if ((i11 & 16) != 0) {
            str5 = kCHybridBridgeCommonAppInfo.webHost;
        }
        if ((i11 & 32) != 0) {
            str6 = kCHybridBridgeCommonAppInfo.feeLevel;
        }
        if ((i11 & 64) != 0) {
            z11 = kCHybridBridgeCommonAppInfo.darkMode;
        }
        if ((i11 & 128) != 0) {
            z12 = kCHybridBridgeCommonAppInfo.cstyle;
        }
        if ((i11 & 256) != 0) {
            str7 = kCHybridBridgeCommonAppInfo.siteType;
        }
        if ((i11 & 512) != 0) {
            str8 = kCHybridBridgeCommonAppInfo.appMode;
        }
        String str9 = str7;
        String str10 = str8;
        boolean z13 = z11;
        boolean z14 = z12;
        String str11 = str5;
        String str12 = str6;
        return kCHybridBridgeCommonAppInfo.copy(str, str2, str3, str4, str11, str12, z13, z14, str9, str10);
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
    public final KCHybridBridgeCommonAppInfo copy(@NotNull String legal, @NotNull String legalSymbol, @NotNull String lang, @NotNull String version, @NotNull String webHost, @NotNull String feeLevel, boolean darkMode, boolean cstyle, @NotNull String siteType, @NotNull String appMode) {
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(legalSymbol, "legalSymbol");
        Intrinsics.checkNotNullParameter(lang, "lang");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(webHost, "webHost");
        Intrinsics.checkNotNullParameter(feeLevel, "feeLevel");
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        Intrinsics.checkNotNullParameter(appMode, "appMode");
        return new KCHybridBridgeCommonAppInfo(legal, legalSymbol, lang, version, webHost, feeLevel, darkMode, cstyle, siteType, appMode);
    }

    @NotNull
    public final String getAppMode() {
        return this.appMode;
    }

    public final boolean getCstyle() {
        return this.cstyle;
    }

    public final boolean getDarkMode() {
        return this.darkMode;
    }

    @NotNull
    public final String getFeeLevel() {
        return this.feeLevel;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
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
        return ((((i11 + (z12 ? 1 : z12)) * 31) + this.siteType.hashCode()) * 31) + this.appMode.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCHybridBridgeCommonAppInfo(legal=" + this.legal + ", legalSymbol=" + this.legalSymbol + ", lang=" + this.lang + ", version=" + this.version + ", webHost=" + this.webHost + ", feeLevel=" + this.feeLevel + ", darkMode=" + this.darkMode + ", cstyle=" + this.cstyle + ", siteType=" + this.siteType + ", appMode=" + this.appMode + ')';
    }
}
