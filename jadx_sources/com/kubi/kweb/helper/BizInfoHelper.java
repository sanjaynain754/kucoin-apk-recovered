package com.kubi.kweb.helper;

import androidx.annotation.Keep;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.host.HostManager;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.web.model.SupportPageModel;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;
import x00.C45976a;
import x00.C45977b;

/* JADX INFO: compiled from: BizInfoHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\t\u001a\u00020\u0005*\u00020\u0005H\u0002J\u001c\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010J$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0002J\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/kweb/helper/BizInfoHelper;", "", "<init>", "()V", "TAG", "", "bizMap", "", "Lcom/kubi/sdk/web/config/WebBizInfo;", "fixPath", "loadV2Config", "", "loadMap", "", "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;", "initBizConfig", "", "handleConfig", "loadMapV3", "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;", "loadV2Map", "testConfig", "config", "PackageConfig", "LoadMapInfo", "BaseWebInfo", "LoadMapV3", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBizInfoHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizInfoHelper.kt\ncom/kubi/kweb/helper/BizInfoHelper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 4 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,169:1\n216#2,2:170\n216#2,2:179\n216#2,2:181\n35#3,4:172\n39#3:178\n44#4,2:176\n*S KotlinDebug\n*F\n+ 1 BizInfoHelper.kt\ncom/kubi/kweb/helper/BizInfoHelper\n*L\n75#1:170,2\n131#1:179,2\n143#1:181,2\n99#1:172,4\n99#1:178\n99#1:176,2\n*E\n"})
public final class BizInfoHelper {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final BizInfoHelper f31023a = new BizInfoHelper();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Map<String, C45976a> f31024b = new LinkedHashMap();

    /* JADX INFO: compiled from: BizInfoHelper.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kweb/helper/BizInfoHelper$BaseWebInfo;", "", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class BaseWebInfo {

        @NotNull
        private final String source;

        /* JADX WARN: Multi-variable type inference failed */
        public BaseWebInfo() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BaseWebInfo) && Intrinsics.areEqual(this.source, ((BaseWebInfo) other).source);
        }

        public BaseWebInfo(@NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public static /* synthetic */ BaseWebInfo copy$default(BaseWebInfo baseWebInfo, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = baseWebInfo.source;
            }
            return baseWebInfo.copy(str);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        @NotNull
        public final BaseWebInfo copy(@NotNull String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new BaseWebInfo(source);
        }

        @NotNull
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        @NotNull
        public String toString() {
            return "BaseWebInfo(source=" + this.source + ')';
        }

        public /* synthetic */ BaseWebInfo(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str);
        }
    }

    /* JADX INFO: compiled from: BizInfoHelper.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003JW\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, m90084d2 = {"Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "", "source", "indexEnable", "", "noWifiEnable", "httpProxy", "indexHtmlName", Constants.BIZ, "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;)V", "getPackageName", "()Ljava/lang/String;", "getSource", "getIndexEnable", "()Z", "getNoWifiEnable", "getHttpProxy", "getIndexHtmlName", "getBiz", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadMapInfo {

        @Nullable
        private final String biz;

        @SerializedName("androidHttpProxy")
        private final boolean httpProxy;
        private final boolean indexEnable;

        @Nullable
        private final String indexHtmlName;
        private final boolean noWifiEnable;

        @Nullable
        private final String packageName;

        @Nullable
        private final String source;

        public LoadMapInfo(@Nullable String str, @Nullable String str2, boolean z11, boolean z12, boolean z13, @Nullable String str3, @Nullable String str4) {
            this.packageName = str;
            this.source = str2;
            this.indexEnable = z11;
            this.noWifiEnable = z12;
            this.httpProxy = z13;
            this.indexHtmlName = str3;
            this.biz = str4;
        }

        public static /* synthetic */ LoadMapInfo copy$default(LoadMapInfo loadMapInfo, String str, String str2, boolean z11, boolean z12, boolean z13, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = loadMapInfo.packageName;
            }
            if ((i11 & 2) != 0) {
                str2 = loadMapInfo.source;
            }
            if ((i11 & 4) != 0) {
                z11 = loadMapInfo.indexEnable;
            }
            if ((i11 & 8) != 0) {
                z12 = loadMapInfo.noWifiEnable;
            }
            if ((i11 & 16) != 0) {
                z13 = loadMapInfo.httpProxy;
            }
            if ((i11 & 32) != 0) {
                str3 = loadMapInfo.indexHtmlName;
            }
            if ((i11 & 64) != 0) {
                str4 = loadMapInfo.biz;
            }
            String str5 = str3;
            String str6 = str4;
            boolean z14 = z13;
            boolean z15 = z11;
            return loadMapInfo.copy(str, str2, z15, z12, z14, str5, str6);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMapInfo)) {
                return false;
            }
            LoadMapInfo loadMapInfo = (LoadMapInfo) other;
            return Intrinsics.areEqual(this.packageName, loadMapInfo.packageName) && Intrinsics.areEqual(this.source, loadMapInfo.source) && this.indexEnable == loadMapInfo.indexEnable && this.noWifiEnable == loadMapInfo.noWifiEnable && this.httpProxy == loadMapInfo.httpProxy && Intrinsics.areEqual(this.indexHtmlName, loadMapInfo.indexHtmlName) && Intrinsics.areEqual(this.biz, loadMapInfo.biz);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPackageName() {
            return this.packageName;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getIndexEnable() {
            return this.indexEnable;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final boolean getNoWifiEnable() {
            return this.noWifiEnable;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getHttpProxy() {
            return this.httpProxy;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getIndexHtmlName() {
            return this.indexHtmlName;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        @NotNull
        public final LoadMapInfo copy(@Nullable String packageName, @Nullable String source, boolean indexEnable, boolean noWifiEnable, boolean httpProxy, @Nullable String indexHtmlName, @Nullable String biz) {
            return new LoadMapInfo(packageName, source, indexEnable, noWifiEnable, httpProxy, indexHtmlName, biz);
        }

        @Nullable
        public final String getBiz() {
            return this.biz;
        }

        public final boolean getHttpProxy() {
            return this.httpProxy;
        }

        public final boolean getIndexEnable() {
            return this.indexEnable;
        }

        @Nullable
        public final String getIndexHtmlName() {
            return this.indexHtmlName;
        }

        public final boolean getNoWifiEnable() {
            return this.noWifiEnable;
        }

        @Nullable
        public final String getPackageName() {
            return this.packageName;
        }

        @Nullable
        public final String getSource() {
            return this.source;
        }

        public int hashCode() {
            String str = this.packageName;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.source;
            int iHashCode2 = (((((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.indexEnable)) * 31) + Boolean.hashCode(this.noWifiEnable)) * 31) + Boolean.hashCode(this.httpProxy)) * 31;
            String str3 = this.indexHtmlName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.biz;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "LoadMapInfo(packageName=" + this.packageName + ", source=" + this.source + ", indexEnable=" + this.indexEnable + ", noWifiEnable=" + this.noWifiEnable + ", httpProxy=" + this.httpProxy + ", indexHtmlName=" + this.indexHtmlName + ", biz=" + this.biz + ')';
        }

        public /* synthetic */ LoadMapInfo(String str, String str2, boolean z11, boolean z12, boolean z13, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? null : str3, str4);
        }
    }

    /* JADX INFO: compiled from: BizInfoHelper.kt */
    /* JADX INFO: loaded from: classes18.dex */
    @Keep
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001BC\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;", "", TtmlNode.RUBY_BASE, "", "", "Lcom/kubi/kweb/helper/BizInfoHelper$BaseWebInfo;", "offlinePages", "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;", "supportPages", "", "Lcom/kubi/sdk/web/model/SupportPageModel;", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getBase", "()Ljava/util/Map;", "getOfflinePages", "getSupportPages", "()Ljava/util/List;", "isEmpty", "", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class LoadMapV3 {

        @SerializedName(TtmlNode.RUBY_BASE)
        @NotNull
        private final Map<String, BaseWebInfo> base;

        @SerializedName("offlinePages")
        @NotNull
        private final Map<String, LoadMapInfo> offlinePages;

        @SerializedName("supportPages")
        @NotNull
        private final List<SupportPageModel> supportPages;

        public LoadMapV3() {
            this(null, null, null, 7, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadMapV3)) {
                return false;
            }
            LoadMapV3 loadMapV3 = (LoadMapV3) other;
            return Intrinsics.areEqual(this.base, loadMapV3.base) && Intrinsics.areEqual(this.offlinePages, loadMapV3.offlinePages) && Intrinsics.areEqual(this.supportPages, loadMapV3.supportPages);
        }

        public LoadMapV3(@NotNull Map<String, BaseWebInfo> base, @NotNull Map<String, LoadMapInfo> offlinePages, @NotNull List<SupportPageModel> supportPages) {
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(offlinePages, "offlinePages");
            Intrinsics.checkNotNullParameter(supportPages, "supportPages");
            this.base = base;
            this.offlinePages = offlinePages;
            this.supportPages = supportPages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LoadMapV3 copy$default(LoadMapV3 loadMapV3, Map map, Map map2, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = loadMapV3.base;
            }
            if ((i11 & 2) != 0) {
                map2 = loadMapV3.offlinePages;
            }
            if ((i11 & 4) != 0) {
                list = loadMapV3.supportPages;
            }
            return loadMapV3.copy(map, map2, list);
        }

        @NotNull
        public final Map<String, BaseWebInfo> component1() {
            return this.base;
        }

        @NotNull
        public final Map<String, LoadMapInfo> component2() {
            return this.offlinePages;
        }

        @NotNull
        public final List<SupportPageModel> component3() {
            return this.supportPages;
        }

        @NotNull
        public final LoadMapV3 copy(@NotNull Map<String, BaseWebInfo> base, @NotNull Map<String, LoadMapInfo> offlinePages, @NotNull List<SupportPageModel> supportPages) {
            Intrinsics.checkNotNullParameter(base, "base");
            Intrinsics.checkNotNullParameter(offlinePages, "offlinePages");
            Intrinsics.checkNotNullParameter(supportPages, "supportPages");
            return new LoadMapV3(base, offlinePages, supportPages);
        }

        @NotNull
        public final Map<String, BaseWebInfo> getBase() {
            return this.base;
        }

        @NotNull
        public final Map<String, LoadMapInfo> getOfflinePages() {
            return this.offlinePages;
        }

        @NotNull
        public final List<SupportPageModel> getSupportPages() {
            return this.supportPages;
        }

        public int hashCode() {
            return (((this.base.hashCode() * 31) + this.offlinePages.hashCode()) * 31) + this.supportPages.hashCode();
        }

        public final boolean isEmpty() {
            return this.base.isEmpty() && this.offlinePages.isEmpty() && this.supportPages.isEmpty();
        }

        @NotNull
        public String toString() {
            return "LoadMapV3(base=" + this.base + ", offlinePages=" + this.offlinePages + ", supportPages=" + this.supportPages + ')';
        }

        public /* synthetic */ LoadMapV3(Map map, Map map2, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? MapsKt.emptyMap() : map, (i11 & 2) != 0 ? MapsKt.emptyMap() : map2, (i11 & 4) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* JADX INFO: compiled from: BizInfoHelper.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B)\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/kweb/helper/BizInfoHelper$PackageConfig;", "", "loadMap", "", "", "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapInfo;", "loadMapV3", "Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;", "<init>", "(Ljava/util/Map;Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;)V", "getLoadMap", "()Ljava/util/Map;", "getLoadMapV3", "()Lcom/kubi/kweb/helper/BizInfoHelper$LoadMapV3;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class PackageConfig {

        @SerializedName("loadMap")
        @NotNull
        private final Map<String, LoadMapInfo> loadMap;

        @SerializedName("loadMapV3")
        @Nullable
        private final LoadMapV3 loadMapV3;

        /* JADX WARN: Multi-variable type inference failed */
        public PackageConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PackageConfig)) {
                return false;
            }
            PackageConfig packageConfig = (PackageConfig) other;
            return Intrinsics.areEqual(this.loadMap, packageConfig.loadMap) && Intrinsics.areEqual(this.loadMapV3, packageConfig.loadMapV3);
        }

        public PackageConfig(@NotNull Map<String, LoadMapInfo> loadMap, @Nullable LoadMapV3 loadMapV3) {
            Intrinsics.checkNotNullParameter(loadMap, "loadMap");
            this.loadMap = loadMap;
            this.loadMapV3 = loadMapV3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PackageConfig copy$default(PackageConfig packageConfig, Map map, LoadMapV3 loadMapV3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = packageConfig.loadMap;
            }
            if ((i11 & 2) != 0) {
                loadMapV3 = packageConfig.loadMapV3;
            }
            return packageConfig.copy(map, loadMapV3);
        }

        @NotNull
        public final Map<String, LoadMapInfo> component1() {
            return this.loadMap;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final LoadMapV3 getLoadMapV3() {
            return this.loadMapV3;
        }

        @NotNull
        public final PackageConfig copy(@NotNull Map<String, LoadMapInfo> loadMap, @Nullable LoadMapV3 loadMapV3) {
            Intrinsics.checkNotNullParameter(loadMap, "loadMap");
            return new PackageConfig(loadMap, loadMapV3);
        }

        @NotNull
        public final Map<String, LoadMapInfo> getLoadMap() {
            return this.loadMap;
        }

        @Nullable
        public final LoadMapV3 getLoadMapV3() {
            return this.loadMapV3;
        }

        public int hashCode() {
            int iHashCode = this.loadMap.hashCode() * 31;
            LoadMapV3 loadMapV3 = this.loadMapV3;
            return iHashCode + (loadMapV3 == null ? 0 : loadMapV3.hashCode());
        }

        @NotNull
        public String toString() {
            return "PackageConfig(loadMap=" + this.loadMap + ", loadMapV3=" + this.loadMapV3 + ')';
        }

        public /* synthetic */ PackageConfig(Map map, LoadMapV3 loadMapV3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? MapsKt.emptyMap() : map, (i11 & 2) != 0 ? null : loadMapV3);
        }
    }

    /* JADX INFO: renamed from: com.kubi.kweb.helper.BizInfoHelper$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C17083a extends TypeToken<PackageConfig> {
    }

    /* JADX INFO: renamed from: a */
    public final String m36727a(String str) {
        if (StringsKt.startsWith$default(str, "http", false, 2, (Object) null)) {
            return str;
        }
        if (StringsKt.startsWith$default(str, "/", false, 2, (Object) null)) {
            return HostManager.a.m() + str;
        }
        return HostManager.a.m() + '/' + str;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<C45976a> m36729c() {
        Object objM20457a;
        try {
            try {
                RemoteConfig remoteConfig = RemoteConfig.f19636a;
                Type type = new C17083a().getType();
                Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
                objM20457a = RemoteConfig.m20457a("h5_offline_package", type);
            } catch (Throwable th2) {
                C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
                objM20457a = null;
            }
            PackageConfig packageConfig = (PackageConfig) objM20457a;
            if (packageConfig != null) {
                LoadMapV3 loadMapV3 = packageConfig.getLoadMapV3();
                if (loadMapV3 == null) {
                    C45977b.f103426a.m101428n(-1);
                    C43840a.m96550d("Not Fetch, So initBizConfig: v2", "BizInfoHelper");
                    m36730d(packageConfig.getLoadMap());
                } else {
                    m36728b(loadMapV3, packageConfig.getLoadMap());
                }
            } else {
                C45977b.f103426a.m101428n(-1);
            }
        } catch (Throwable th3) {
            C44128b.m97262f("loadh5Config", "initBizConfig error", th3);
        }
        return CollectionsKt.toList(f31024b.values());
    }

    /* JADX INFO: renamed from: b */
    public final void m36728b(LoadMapV3 loadMapV3, Map<String, LoadMapInfo> map) {
        String strM36727a;
        if (loadMapV3.isEmpty()) {
            C45977b.f103426a.m101428n(1);
            C43840a.m96550d("initBizConfig: v2", "BizInfoHelper");
            m36730d(map);
            return;
        }
        C45977b.f103426a.m101428n(2);
        C43840a.m96550d("initBizConfig: v3", "BizInfoHelper");
        for (Map.Entry<String, BaseWebInfo> entry : loadMapV3.getBase().entrySet()) {
            String key = entry.getKey();
            BaseWebInfo value = entry.getValue();
            C45976a c45976a = new C45976a(key, key, key, f31023a.m36727a(value.getSource()), false, false, false, null, 240, null);
            f31024b.put(c45976a.getMatchPath(), c45976a);
            C45977b.f103426a.m101415a(key);
            C44128b.m97266j("BizInfoHelper", c45976a.getMatchPath() + ": " + value);
        }
        for (Map.Entry<String, LoadMapInfo> entry2 : loadMapV3.getOfflinePages().entrySet()) {
            String key2 = entry2.getKey();
            LoadMapInfo value2 = entry2.getValue();
            String biz = value2.getBiz();
            String packageName = value2.getPackageName();
            boolean httpProxy = value2.getHttpProxy();
            boolean indexEnable = value2.getIndexEnable();
            String source = value2.getSource();
            if (source != null) {
                strM36727a = f31023a.m36727a(source);
            } else {
                strM36727a = null;
            }
            C45976a c45976a2 = new C45976a(key2, biz, packageName, strM36727a, indexEnable, httpProxy, value2.getNoWifiEnable(), value2.getIndexHtmlName());
            f31024b.put(c45976a2.getMatchPath(), c45976a2);
            C45977b.f103426a.m101417c(value2.getPackageName());
            C44128b.m97266j("BizInfoHelper", c45976a2.getMatchPath() + ": " + value2);
        }
        C45977b.f103426a.m101420f(loadMapV3.getSupportPages());
    }

    /* JADX INFO: renamed from: d */
    public final void m36730d(Map<String, LoadMapInfo> map) {
        String strM36727a;
        for (Map.Entry<String, LoadMapInfo> entry : map.entrySet()) {
            String key = entry.getKey();
            LoadMapInfo value = entry.getValue();
            String biz = value.getBiz();
            String packageName = value.getPackageName();
            boolean httpProxy = value.getHttpProxy();
            boolean indexEnable = value.getIndexEnable();
            String source = value.getSource();
            if (source != null) {
                strM36727a = f31023a.m36727a(source);
            } else {
                strM36727a = null;
            }
            C45976a c45976a = new C45976a(key, biz, packageName, strM36727a, indexEnable, httpProxy, value.getNoWifiEnable(), value.getIndexHtmlName());
            f31024b.put(c45976a.getMatchPath(), c45976a);
            C45977b.f103426a.m101417c(value.getPackageName());
            C44128b.m97266j("BizInfoHelper", c45976a.getMatchPath() + ": " + value);
        }
    }
}
