package com.kubi.sdk.protocol.flutter.protocol;

import androidx.annotation.Keep;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KCFlutterBridgeCoreCall.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B©\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0017J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0007HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003JÌ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00032\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020AHÖ\u0001J\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010CJ\t\u0010D\u001a\u00020\tHÖ\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u001cR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019¨\u0006E"}, m90084d2 = {"Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo;", "", "isUseDealVolUnit", "", "isNativeDebug", "cstyle", "themeMode", "", "proxyAddress", "", "uniqueDeviceId", "anonymousId", "legal", "legalPrice", "", "Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreLegalPrice;", "darkMode", "legalSymbol", "localTimezone", "language", FirebaseAnalytics.Param.CURRENCY, "siteType", "appMode", "(ZZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnonymousId", "()Ljava/lang/String;", "getAppMode", "getCstyle", "()Z", "getCurrency", "getDarkMode", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLanguage", "getLegal", "getLegalPrice", "()Ljava/util/List;", "getLegalSymbol", "getLocalTimezone", "getProxyAddress", "getSiteType", "getThemeMode", "()J", "getUniqueDeviceId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ZZZJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo;", "equals", "other", "hashCode", "", "toMap", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCFlutterBridgeCoreCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCFlutterBridgeCoreCall.kt\ncom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,270:1\n1549#2:271\n1620#2,3:272\n*S KotlinDebug\n*F\n+ 1 KCFlutterBridgeCoreCall.kt\ncom/kubi/sdk/protocol/flutter/protocol/KCFlutterBridgeCoreAppInfo\n*L\n57#1:271\n57#1:272,3\n*E\n"})
public final /* data */ class KCFlutterBridgeCoreAppInfo {

    @Nullable
    private final String anonymousId;

    @Nullable
    private final String appMode;
    private final boolean cstyle;

    @Nullable
    private final String currency;

    @Nullable
    private final Boolean darkMode;
    private final boolean isNativeDebug;
    private final boolean isUseDealVolUnit;

    @Nullable
    private final String language;

    @Nullable
    private final String legal;

    @Nullable
    private final List<KCFlutterBridgeCoreLegalPrice> legalPrice;

    @Nullable
    private final String legalSymbol;

    @Nullable
    private final String localTimezone;

    @Nullable
    private final String proxyAddress;

    @Nullable
    private final String siteType;
    private final long themeMode;

    @Nullable
    private final String uniqueDeviceId;

    public KCFlutterBridgeCoreAppInfo(boolean z11, boolean z12, boolean z13, long j11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<KCFlutterBridgeCoreLegalPrice> list, @Nullable Boolean bool, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.isUseDealVolUnit = z11;
        this.isNativeDebug = z12;
        this.cstyle = z13;
        this.themeMode = j11;
        this.proxyAddress = str;
        this.uniqueDeviceId = str2;
        this.anonymousId = str3;
        this.legal = str4;
        this.legalPrice = list;
        this.darkMode = bool;
        this.legalSymbol = str5;
        this.localTimezone = str6;
        this.language = str7;
        this.currency = str8;
        this.siteType = str9;
        this.appMode = str10;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCFlutterBridgeCoreAppInfo)) {
            return false;
        }
        KCFlutterBridgeCoreAppInfo kCFlutterBridgeCoreAppInfo = (KCFlutterBridgeCoreAppInfo) other;
        return this.isUseDealVolUnit == kCFlutterBridgeCoreAppInfo.isUseDealVolUnit && this.isNativeDebug == kCFlutterBridgeCoreAppInfo.isNativeDebug && this.cstyle == kCFlutterBridgeCoreAppInfo.cstyle && this.themeMode == kCFlutterBridgeCoreAppInfo.themeMode && Intrinsics.areEqual(this.proxyAddress, kCFlutterBridgeCoreAppInfo.proxyAddress) && Intrinsics.areEqual(this.uniqueDeviceId, kCFlutterBridgeCoreAppInfo.uniqueDeviceId) && Intrinsics.areEqual(this.anonymousId, kCFlutterBridgeCoreAppInfo.anonymousId) && Intrinsics.areEqual(this.legal, kCFlutterBridgeCoreAppInfo.legal) && Intrinsics.areEqual(this.legalPrice, kCFlutterBridgeCoreAppInfo.legalPrice) && Intrinsics.areEqual(this.darkMode, kCFlutterBridgeCoreAppInfo.darkMode) && Intrinsics.areEqual(this.legalSymbol, kCFlutterBridgeCoreAppInfo.legalSymbol) && Intrinsics.areEqual(this.localTimezone, kCFlutterBridgeCoreAppInfo.localTimezone) && Intrinsics.areEqual(this.language, kCFlutterBridgeCoreAppInfo.language) && Intrinsics.areEqual(this.currency, kCFlutterBridgeCoreAppInfo.currency) && Intrinsics.areEqual(this.siteType, kCFlutterBridgeCoreAppInfo.siteType) && Intrinsics.areEqual(this.appMode, kCFlutterBridgeCoreAppInfo.appMode);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsUseDealVolUnit() {
        return this.isUseDealVolUnit;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getDarkMode() {
        return this.darkMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLegalSymbol() {
        return this.legalSymbol;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLocalTimezone() {
        return this.localTimezone;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getAppMode() {
        return this.appMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsNativeDebug() {
        return this.isNativeDebug;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCstyle() {
        return this.cstyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getThemeMode() {
        return this.themeMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProxyAddress() {
        return this.proxyAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUniqueDeviceId() {
        return this.uniqueDeviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    public final List<KCFlutterBridgeCoreLegalPrice> component9() {
        return this.legalPrice;
    }

    @NotNull
    public final KCFlutterBridgeCoreAppInfo copy(boolean isUseDealVolUnit, boolean isNativeDebug, boolean cstyle, long themeMode, @Nullable String proxyAddress, @Nullable String uniqueDeviceId, @Nullable String anonymousId, @Nullable String legal, @Nullable List<KCFlutterBridgeCoreLegalPrice> legalPrice, @Nullable Boolean darkMode, @Nullable String legalSymbol, @Nullable String localTimezone, @Nullable String language, @Nullable String currency, @Nullable String siteType, @Nullable String appMode) {
        return new KCFlutterBridgeCoreAppInfo(isUseDealVolUnit, isNativeDebug, cstyle, themeMode, proxyAddress, uniqueDeviceId, anonymousId, legal, legalPrice, darkMode, legalSymbol, localTimezone, language, currency, siteType, appMode);
    }

    @Nullable
    public final String getAnonymousId() {
        return this.anonymousId;
    }

    @Nullable
    public final String getAppMode() {
        return this.appMode;
    }

    public final boolean getCstyle() {
        return this.cstyle;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Boolean getDarkMode() {
        return this.darkMode;
    }

    @Nullable
    public final String getLanguage() {
        return this.language;
    }

    @Nullable
    public final String getLegal() {
        return this.legal;
    }

    @Nullable
    public final List<KCFlutterBridgeCoreLegalPrice> getLegalPrice() {
        return this.legalPrice;
    }

    @Nullable
    public final String getLegalSymbol() {
        return this.legalSymbol;
    }

    @Nullable
    public final String getLocalTimezone() {
        return this.localTimezone;
    }

    @Nullable
    public final String getProxyAddress() {
        return this.proxyAddress;
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    public final long getThemeMode() {
        return this.themeMode;
    }

    @Nullable
    public final String getUniqueDeviceId() {
        return this.uniqueDeviceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public int hashCode() {
        boolean z11 = this.isUseDealVolUnit;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = r11 * 31;
        boolean z12 = this.isNativeDebug;
        ?? r12 = z12;
        if (z12) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z13 = this.cstyle;
        int iHashCode = (((i12 + (z13 ? 1 : z13)) * 31) + Long.hashCode(this.themeMode)) * 31;
        String str = this.proxyAddress;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.uniqueDeviceId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.anonymousId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.legal;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<KCFlutterBridgeCoreLegalPrice> list = this.legalPrice;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.darkMode;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.legalSymbol;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.localTimezone;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.language;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.currency;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.siteType;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.appMode;
        return iHashCode12 + (str10 != null ? str10.hashCode() : 0);
    }

    public final boolean isNativeDebug() {
        return this.isNativeDebug;
    }

    public final boolean isUseDealVolUnit() {
        return this.isUseDealVolUnit;
    }

    @NotNull
    public final Map<String, Object> toMap() {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("isUseDealVolUnit", Boolean.valueOf(this.isUseDealVolUnit));
        linkedHashMap.put("isNativeDebug", Boolean.valueOf(this.isNativeDebug));
        linkedHashMap.put("cstyle", Boolean.valueOf(this.cstyle));
        linkedHashMap.put("themeMode", Long.valueOf(this.themeMode));
        linkedHashMap.put("proxyAddress", this.proxyAddress);
        linkedHashMap.put("uniqueDeviceId", this.uniqueDeviceId);
        linkedHashMap.put("anonymousId", this.anonymousId);
        linkedHashMap.put("legal", this.legal);
        List<KCFlutterBridgeCoreLegalPrice> list = this.legalPrice;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((KCFlutterBridgeCoreLegalPrice) it.next()).toMap());
            }
        } else {
            arrayList = null;
        }
        linkedHashMap.put("legalPrice", arrayList);
        linkedHashMap.put("darkMode", this.darkMode);
        linkedHashMap.put("legalSymbol", this.legalSymbol);
        linkedHashMap.put("localTimezone", this.localTimezone);
        linkedHashMap.put("language", this.language);
        linkedHashMap.put(FirebaseAnalytics.Param.CURRENCY, this.currency);
        linkedHashMap.put("siteType", this.siteType);
        linkedHashMap.put("appMode", this.appMode);
        return linkedHashMap;
    }

    @NotNull
    public String toString() {
        return "KCFlutterBridgeCoreAppInfo(isUseDealVolUnit=" + this.isUseDealVolUnit + ", isNativeDebug=" + this.isNativeDebug + ", cstyle=" + this.cstyle + ", themeMode=" + this.themeMode + ", proxyAddress=" + this.proxyAddress + ", uniqueDeviceId=" + this.uniqueDeviceId + ", anonymousId=" + this.anonymousId + ", legal=" + this.legal + ", legalPrice=" + this.legalPrice + ", darkMode=" + this.darkMode + ", legalSymbol=" + this.legalSymbol + ", localTimezone=" + this.localTimezone + ", language=" + this.language + ", currency=" + this.currency + ", siteType=" + this.siteType + ", appMode=" + this.appMode + ')';
    }

    public /* synthetic */ KCFlutterBridgeCoreAppInfo(boolean z11, boolean z12, boolean z13, long j11, String str, String str2, String str3, String str4, List list, Boolean bool, String str5, String str6, String str7, String str8, String str9, String str10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? true : z13, j11, str, str2, str3, str4, list, bool, str5, str6, str7, str8, str9, str10);
    }
}
