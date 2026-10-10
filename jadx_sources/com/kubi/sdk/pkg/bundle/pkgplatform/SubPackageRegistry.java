package com.kubi.sdk.pkg.bundle.pkgplatform;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.bundle.BundleInfo;
import com.kubi.sdk.pkg.bundle.BundleVersionManager;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.utils.C27099x;
import com.kubi.utils.DataMapUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: SubPackageRegistry.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002$%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J+\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001f\u0010\u0012J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003R \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00100!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\"¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry;", "", "<init>", "()V", "", "i", "", "parentBiz", "parentVersionDir", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;", "subPackages", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", CmcdData.Factory.STREAM_TYPE_LIVE, "subPackageBiz", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry$SubPackageInfo;", "f", "(Ljava/lang/String;)Lcom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry$SubPackageInfo;", "Landroid/content/Context;", "context", "", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/lang/String;)Z", "g", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "info", "b", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry$SubPackageInfo;)Ljava/lang/String;", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "d", "j", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "registry", "Memento", "SubPackageInfo", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSubPackageRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubPackageRegistry.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 6 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n*L\n1#1,281:1\n1603#2,9:282\n1855#2:291\n1856#2:294\n1612#2:295\n1549#2:296\n1620#2,3:297\n1603#2,9:300\n1855#2:309\n1856#2:311\n1612#2:312\n1549#2:313\n1620#2,3:314\n1#3:292\n1#3:293\n1#3:310\n467#4,7:317\n34#5:324\n30#5:326\n41#5:327\n37#5:328\n30#5:330\n62#6:325\n62#6:329\n*S KotlinDebug\n*F\n+ 1 SubPackageRegistry.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry\n*L\n110#1:282,9\n110#1:291\n110#1:294\n110#1:295\n131#1:296\n131#1:297,3\n145#1:300,9\n145#1:309\n145#1:311\n145#1:312\n165#1:313\n165#1:314,3\n110#1:293\n145#1:310\n183#1:317,7\n261#1:324\n265#1:326\n267#1:327\n267#1:328\n267#1:330\n261#1:325\n267#1:329\n*E\n"})
public final class SubPackageRegistry {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final SubPackageRegistry f47367a = new SubPackageRegistry();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, SubPackageInfo> registry = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: SubPackageRegistry.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry$Memento;", "", "subPackages", "", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry$SubPackageInfo;", "(Ljava/util/Map;)V", "getSubPackages", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class Memento {

        @NotNull
        private final Map<String, SubPackageInfo> subPackages;

        /* JADX WARN: Multi-variable type inference failed */
        public Memento() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Memento) && Intrinsics.areEqual(this.subPackages, ((Memento) other).subPackages);
        }

        public Memento(@NotNull Map<String, SubPackageInfo> subPackages) {
            Intrinsics.checkNotNullParameter(subPackages, "subPackages");
            this.subPackages = subPackages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Memento copy$default(Memento memento, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = memento.subPackages;
            }
            return memento.copy(map);
        }

        @NotNull
        public final Map<String, SubPackageInfo> component1() {
            return this.subPackages;
        }

        @NotNull
        public final Memento copy(@NotNull Map<String, SubPackageInfo> subPackages) {
            Intrinsics.checkNotNullParameter(subPackages, "subPackages");
            return new Memento(subPackages);
        }

        @NotNull
        public final Map<String, SubPackageInfo> getSubPackages() {
            return this.subPackages;
        }

        public int hashCode() {
            return this.subPackages.hashCode();
        }

        @NotNull
        public String toString() {
            return "Memento(subPackages=" + this.subPackages + ')';
        }

        public /* synthetic */ Memento(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? MapsKt.emptyMap() : map);
        }
    }

    /* JADX INFO: compiled from: SubPackageRegistry.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006("}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/SubPackageRegistry$SubPackageInfo;", "", Constants.BIZ, "", "version", "buildNo", "", "url", "packageHash", "packageSize", "parentBiz", "parentVersionDir", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getBiz", "()Ljava/lang/String;", "getBuildNo", "()J", "getPackageHash", "getPackageSize", "getParentBiz", "getParentVersionDir", "getUrl", "getVersion", "versionDir", "getVersionDir", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class SubPackageInfo {

        @NotNull
        private final String biz;
        private final long buildNo;

        @Nullable
        private final String packageHash;
        private final long packageSize;

        @Nullable
        private final String parentBiz;

        @Nullable
        private final String parentVersionDir;

        @NotNull
        private final String url;

        @NotNull
        private final String version;

        public SubPackageInfo(@NotNull String biz, @NotNull String version, long j11, @NotNull String url, @Nullable String str, long j12, @Nullable String str2, @Nullable String str3) {
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(url, "url");
            this.biz = biz;
            this.version = version;
            this.buildNo = j11;
            this.url = url;
            this.packageHash = str;
            this.packageSize = j12;
            this.parentBiz = str2;
            this.parentVersionDir = str3;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubPackageInfo)) {
                return false;
            }
            SubPackageInfo subPackageInfo = (SubPackageInfo) other;
            return Intrinsics.areEqual(this.biz, subPackageInfo.biz) && Intrinsics.areEqual(this.version, subPackageInfo.version) && this.buildNo == subPackageInfo.buildNo && Intrinsics.areEqual(this.url, subPackageInfo.url) && Intrinsics.areEqual(this.packageHash, subPackageInfo.packageHash) && this.packageSize == subPackageInfo.packageSize && Intrinsics.areEqual(this.parentBiz, subPackageInfo.parentBiz) && Intrinsics.areEqual(this.parentVersionDir, subPackageInfo.parentVersionDir);
        }

        public static /* synthetic */ SubPackageInfo copy$default(SubPackageInfo subPackageInfo, String str, String str2, long j11, String str3, String str4, long j12, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = subPackageInfo.biz;
            }
            if ((i11 & 2) != 0) {
                str2 = subPackageInfo.version;
            }
            if ((i11 & 4) != 0) {
                j11 = subPackageInfo.buildNo;
            }
            if ((i11 & 8) != 0) {
                str3 = subPackageInfo.url;
            }
            if ((i11 & 16) != 0) {
                str4 = subPackageInfo.packageHash;
            }
            if ((i11 & 32) != 0) {
                j12 = subPackageInfo.packageSize;
            }
            if ((i11 & 64) != 0) {
                str5 = subPackageInfo.parentBiz;
            }
            if ((i11 & 128) != 0) {
                str6 = subPackageInfo.parentVersionDir;
            }
            long j13 = j12;
            String str7 = str3;
            long j14 = j11;
            return subPackageInfo.copy(str, str2, j14, str7, str4, j13, str5, str6);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getBuildNo() {
            return this.buildNo;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getPackageHash() {
            return this.packageHash;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getPackageSize() {
            return this.packageSize;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getParentBiz() {
            return this.parentBiz;
        }

        @Nullable
        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getParentVersionDir() {
            return this.parentVersionDir;
        }

        @NotNull
        public final SubPackageInfo copy(@NotNull String biz, @NotNull String version, long buildNo, @NotNull String url, @Nullable String packageHash, long packageSize, @Nullable String parentBiz, @Nullable String parentVersionDir) {
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(version, "version");
            Intrinsics.checkNotNullParameter(url, "url");
            return new SubPackageInfo(biz, version, buildNo, url, packageHash, packageSize, parentBiz, parentVersionDir);
        }

        @NotNull
        public final String getBiz() {
            return this.biz;
        }

        public final long getBuildNo() {
            return this.buildNo;
        }

        @Nullable
        public final String getPackageHash() {
            return this.packageHash;
        }

        public final long getPackageSize() {
            return this.packageSize;
        }

        @Nullable
        public final String getParentBiz() {
            return this.parentBiz;
        }

        @Nullable
        public final String getParentVersionDir() {
            return this.parentVersionDir;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final String getVersion() {
            return this.version;
        }

        @NotNull
        public final String getVersionDir() {
            if (this.buildNo <= 0) {
                return this.version;
            }
            return this.version + '-' + this.buildNo;
        }

        public int hashCode() {
            int iHashCode = ((((((this.biz.hashCode() * 31) + this.version.hashCode()) * 31) + Long.hashCode(this.buildNo)) * 31) + this.url.hashCode()) * 31;
            String str = this.packageHash;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.packageSize)) * 31;
            String str2 = this.parentBiz;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.parentVersionDir;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SubPackageInfo(biz=" + this.biz + ", version=" + this.version + ", buildNo=" + this.buildNo + ", url=" + this.url + ", packageHash=" + this.packageHash + ", packageSize=" + this.packageSize + ", parentBiz=" + this.parentBiz + ", parentVersionDir=" + this.parentVersionDir + ')';
        }

        public /* synthetic */ SubPackageInfo(String str, String str2, long j11, String str3, String str4, long j12, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i11 & 4) != 0 ? 0L : j11, str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? 0L : j12, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final int m57666e(Map.Entry entry, Map.Entry entry2) {
        return BundleInfo.INSTANCE.compareBundleVersion$Package_release(StringsKt.substringAfter$default((String) entry.getKey(), "@", (String) null, 2, (Object) null), StringsKt.substringAfter$default((String) entry2.getKey(), "@", (String) null, 2, (Object) null));
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m57667b(@NotNull Context context, @NotNull SubPackageInfo info) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        String strM57795e = TaskCommonKt.m57795e(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("jsbundles");
        String string = sb2.toString();
        if (info.getParentBiz() != null && info.getParentVersionDir() != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string);
            sb3.append('/');
            sb3.append(info.getParentBiz());
            sb3.append("/main/");
            sb3.append(info.getParentVersionDir());
            sb3.append('/');
            sb3.append(info.getBiz());
            sb3.append("/main/");
            sb3.append(info.getVersionDir());
            sb3.append('/');
            sb3.append(info.getBiz() + "-main");
            sb3.append(".android.hbc");
            return sb3.toString();
        }
        String biz = info.getBiz();
        String versionDir = info.getVersionDir();
        String str2 = (((TaskCommonKt.m57795e(context) + str + "jsbundles") + str + biz) + str + "main") + str + versionDir;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(biz + "-main");
        sb4.append(".android.hbc");
        return str2 + str + sb4.toString();
    }

    /* JADX INFO: renamed from: c */
    public final String m57668c(String subPackageBiz, String parentVersionDir) {
        return subPackageBiz + '@' + parentVersionDir;
    }

    /* JADX INFO: renamed from: d */
    public final SubPackageInfo m57669d(String subPackageBiz) {
        String strM57518e;
        String str = subPackageBiz + '@';
        ConcurrentHashMap<String, SubPackageInfo> concurrentHashMap = registry;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubPackageInfo> entry : concurrentHashMap.entrySet()) {
            if (StringsKt.startsWith$default(entry.getKey(), str, false, 2, (Object) null)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            return registry.get(subPackageBiz);
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            SubPackageInfo subPackageInfo = (SubPackageInfo) entry2.getValue();
            String strSubstringAfter$default = StringsKt.substringAfter$default(str2, "@", (String) null, 2, (Object) null);
            if (subPackageInfo.getParentBiz() != null && (strM57518e = BundleVersionManager.f47295a.m57518e(subPackageInfo.getParentBiz(), "main")) != null && BundleInfo.INSTANCE.compareBundleVersion$Package_release(strSubstringAfter$default, strM57518e) == 0) {
                return subPackageInfo;
            }
        }
        Map.Entry entry3 = (Map.Entry) CollectionsKt.maxWithOrNull(linkedHashMap.entrySet(), new Comparator() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return SubPackageRegistry.m57666e((Map.Entry) obj, (Map.Entry) obj2);
            }
        });
        if (entry3 != null) {
            return (SubPackageInfo) entry3.getValue();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final SubPackageInfo m57670f(@NotNull String subPackageBiz) {
        Intrinsics.checkNotNullParameter(subPackageBiz, "subPackageBiz");
        return m57669d(subPackageBiz);
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m57671g(@NotNull Context context, @NotNull String subPackageBiz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subPackageBiz, "subPackageBiz");
        SubPackageInfo subPackageInfoM57669d = m57669d(subPackageBiz);
        if (subPackageInfoM57669d == null) {
            return null;
        }
        String strM57667b = m57667b(context, subPackageInfoM57669d);
        if (TaskCommonKt.m57792b(strM57667b)) {
            return strM57667b;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m57672h(@NotNull Context context, @NotNull String subPackageBiz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(subPackageBiz, "subPackageBiz");
        SubPackageInfo subPackageInfoM57669d = m57669d(subPackageBiz);
        if (subPackageInfoM57669d == null) {
            return false;
        }
        return TaskCommonKt.m57792b(m57667b(context, subPackageInfoM57669d));
    }

    /* JADX INFO: renamed from: i */
    public final void m57673i() {
        Memento memento;
        try {
            String strM66369j = DataMapUtil.m66369j(DataMapUtil.f54245a, "sub_package_registry", null, 2, null);
            if (strM66369j.length() != 0 && (memento = (Memento) TaskCommonKt.m57793c(strM66369j, Memento.class)) != null) {
                ConcurrentHashMap<String, SubPackageInfo> concurrentHashMap = registry;
                concurrentHashMap.putAll(memento.getSubPackages());
                C23985b.f47489a.m57877e("pkgPlatform", "SubPackageRegistry.load: " + concurrentHashMap.size() + " 条子包映射已恢复");
            }
        } catch (Exception e11) {
            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "SubPackageRegistry.load 失败: " + e11.getMessage(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m57674j() {
        try {
            DataMapUtil.f54245a.m66380o("sub_package_registry", C27099x.m66919i(new Memento(MapsKt.toMap(registry)), false, 2, null));
        } catch (Exception e11) {
            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "SubPackageRegistry.persist 失败: " + e11.getMessage(), null, 4, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m57675k(@NotNull String parentBiz, @NotNull String parentVersionDir, @NotNull List<PkgBasicDep> subPackages) {
        String version;
        String url;
        String parentVersionDir2 = parentVersionDir;
        Intrinsics.checkNotNullParameter(parentBiz, "parentBiz");
        Intrinsics.checkNotNullParameter(parentVersionDir2, "parentVersionDir");
        Intrinsics.checkNotNullParameter(subPackages, "subPackages");
        if (subPackages.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (PkgBasicDep pkgBasicDep : subPackages) {
            String biz = pkgBasicDep.getBiz();
            Pair pairM90091to = null;
            if (biz != null) {
                if (biz.length() <= 0) {
                    biz = null;
                }
                if (biz != null && (version = pkgBasicDep.getVersion()) != null) {
                    if (version.length() <= 0) {
                        version = null;
                    }
                    if (version != null && (url = pkgBasicDep.getUrl()) != null) {
                        String str = url.length() > 0 ? url : null;
                        if (str != null) {
                            pairM90091to = TuplesKt.m90091to(f47367a.m57668c(biz, parentVersionDir2), new SubPackageInfo(biz, version, pkgBasicDep.getBuildNo(), str, pkgBasicDep.getPackageHash(), pkgBasicDep.getPackageSize(), parentBiz, parentVersionDir2));
                        }
                    }
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
            parentVersionDir2 = parentVersionDir;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        MapsKt.putAll(registry, arrayList);
        m57674j();
        C23985b c23985b = C23985b.f47489a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SubPackageRegistry.saveSubPackages: parentBiz=");
        sb2.append(parentBiz);
        sb2.append(", saved=");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).getFirst());
        }
        sb2.append(arrayList2);
        c23985b.m57877e("pkgPlatform", sb2.toString());
    }

    /* JADX INFO: renamed from: l */
    public final void m57676l(@NotNull String parentBiz, @NotNull String parentVersionDir, @NotNull List<PkgBasicDep> subPackages) {
        String version;
        String url;
        String parentVersionDir2 = parentVersionDir;
        Intrinsics.checkNotNullParameter(parentBiz, "parentBiz");
        Intrinsics.checkNotNullParameter(parentVersionDir2, "parentVersionDir");
        Intrinsics.checkNotNullParameter(subPackages, "subPackages");
        if (subPackages.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (PkgBasicDep pkgBasicDep : subPackages) {
            String biz = pkgBasicDep.getBiz();
            Pair pairM90091to = null;
            if (biz != null) {
                if (biz.length() <= 0) {
                    biz = null;
                }
                if (biz != null && (version = pkgBasicDep.getVersion()) != null) {
                    if (version.length() <= 0) {
                        version = null;
                    }
                    if (version != null && (url = pkgBasicDep.getUrl()) != null) {
                        String str = url.length() > 0 ? url : null;
                        if (str != null) {
                            pairM90091to = TuplesKt.m90091to(f47367a.m57668c(biz, parentVersionDir2), new SubPackageInfo(biz, version, pkgBasicDep.getBuildNo(), str, pkgBasicDep.getPackageHash(), pkgBasicDep.getPackageSize(), parentBiz, parentVersionDir2));
                        }
                    }
                }
            }
            if (pairM90091to != null) {
                arrayList.add(pairM90091to);
            }
            parentVersionDir2 = parentVersionDir;
        }
        if (arrayList.isEmpty()) {
            return;
        }
        MapsKt.putAll(registry, arrayList);
        C23985b c23985b = C23985b.f47489a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SubPackageRegistry.saveSubPackagesInMemory: parentBiz=");
        sb2.append(parentBiz);
        sb2.append(", saved=");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Pair) it.next()).getFirst());
        }
        sb2.append(arrayList2);
        c23985b.m57877e("pkgPlatform", sb2.toString());
    }
}
