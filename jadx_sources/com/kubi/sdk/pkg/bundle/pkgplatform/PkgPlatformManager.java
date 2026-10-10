package com.kubi.sdk.pkg.bundle.pkgplatform;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.bundle.C23935a;
import com.kubi.sdk.pkg.bundle.i18n.RnI18nManager;
import com.kubi.sdk.pkg.config.PackConfigManager;
import com.kubi.sdk.pkg.task.DownloadPriority;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.task.TaskException;
import com.kubi.sdk.pkg.task.TaskStatus;
import com.kubi.sdk.pkg.util.C23985b;
import com.kubi.sdk.pkg.util.PackageException;
import com.kubi.sdk.pkg.util.VersionUtils;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C41686h;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.MatchResult;
import p852kotlin.text.Regex;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: PkgPlatformManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u000256B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#JO\u0010&\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020*2\u0006\u0010\n\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u00101R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager;", "", "<init>", "()V", "", Constants.BIZ, "", "n", "(Ljava/lang/String;)Z", "Landroid/content/Context;", "context", "", "criticalBizList", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformStartupPlan;", CmcdData.Factory.STREAMING_FORMAT_SS, "(Landroid/content/Context;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/task/DownloadPriority;", "priority", "Lcom/kubi/sdk/pkg/task/TaskStatus;", "u", "(Landroid/content/Context;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dirName", "Lkotlin/Pair;", "", "r", "(Ljava/lang/String;)Lkotlin/Pair;", "qrCodeUrl", "w", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subPackageName", "o", "filterBiz", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;", CmcdData.Factory.STREAMING_FORMAT_HLS, "(Landroid/content/Context;Ljava/lang/String;)Ljava/util/List;", "reportedBundles", "queryType", "p", "(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Lcom/kubi/sdk/pkg/task/DownloadPriority;Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleData;", "data", "", "t", "(Landroid/content/Context;Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleData;)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "", "m", "(Ljava/lang/String;Ljava/lang/String;)I", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "leadUpgradeCache", "QrCodeData", "QrCodeResponse", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPkgPlatformManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager\n+ 2 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 3 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 PackageException.kt\ncom/kubi/sdk/pkg/util/PackageExceptionKt\n*L\n1#1,605:1\n34#2:606\n62#3:607\n3792#4:608\n4307#4,2:609\n3792#4:621\n4307#4,2:622\n1603#5,9:611\n1855#5:620\n766#5:624\n857#5,2:625\n1856#5:628\n1612#5:629\n1855#5,2:632\n1#6:627\n22#7,2:630\n*S KotlinDebug\n*F\n+ 1 PkgPlatformManager.kt\ncom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager\n*L\n236#1:606\n236#1:607\n243#1:608\n243#1:609,2\n253#1:621\n253#1:622,2\n246#1:611,9\n246#1:620\n258#1:624\n258#1:625,2\n246#1:628\n246#1:629\n344#1:632,2\n246#1:627\n335#1:630,2\n*E\n"})
public final class PkgPlatformManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final PkgPlatformManager f47352a = new PkgPlatformManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, Boolean> leadUpgradeCache = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: PkgPlatformManager.kt */
    @Keep
    @Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u0087\u0001\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015¨\u00060"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$QrCodeData;", "", Constants.BIZ, "", "version", "url", "packageHash", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "packageSize", "", "buildNo", "leadUpgrade", "", "basicDeps", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgBasicDep;", "subPackages", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;Ljava/util/List;)V", "getBasicDeps", "()Ljava/util/List;", "getBiz", "()Ljava/lang/String;", "getBuildNo", "()J", "getLeadUpgrade", "()Z", "getPackageHash", "getPackageSize", "getSdkVersion", "getSubPackages", "getUrl", "getVersion", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class QrCodeData {

        @Nullable
        private final List<PkgBasicDep> basicDeps;

        @Nullable
        private final String biz;
        private final long buildNo;
        private final boolean leadUpgrade;

        @Nullable
        private final String packageHash;
        private final long packageSize;

        @Nullable
        private final String sdkVersion;

        @Nullable
        private final List<PkgBasicDep> subPackages;

        @Nullable
        private final String url;

        @Nullable
        private final String version;

        public QrCodeData() {
            this(null, null, null, null, null, 0L, 0L, false, null, null, 1023, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QrCodeData)) {
                return false;
            }
            QrCodeData qrCodeData = (QrCodeData) other;
            return Intrinsics.areEqual(this.biz, qrCodeData.biz) && Intrinsics.areEqual(this.version, qrCodeData.version) && Intrinsics.areEqual(this.url, qrCodeData.url) && Intrinsics.areEqual(this.packageHash, qrCodeData.packageHash) && Intrinsics.areEqual(this.sdkVersion, qrCodeData.sdkVersion) && this.packageSize == qrCodeData.packageSize && this.buildNo == qrCodeData.buildNo && this.leadUpgrade == qrCodeData.leadUpgrade && Intrinsics.areEqual(this.basicDeps, qrCodeData.basicDeps) && Intrinsics.areEqual(this.subPackages, qrCodeData.subPackages);
        }

        public QrCodeData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j11, long j12, boolean z11, @Nullable List<PkgBasicDep> list, @Nullable List<PkgBasicDep> list2) {
            this.biz = str;
            this.version = str2;
            this.url = str3;
            this.packageHash = str4;
            this.sdkVersion = str5;
            this.packageSize = j11;
            this.buildNo = j12;
            this.leadUpgrade = z11;
            this.basicDeps = list;
            this.subPackages = list2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ QrCodeData copy$default(QrCodeData qrCodeData, String str, String str2, String str3, String str4, String str5, long j11, long j12, boolean z11, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = qrCodeData.biz;
            }
            if ((i11 & 2) != 0) {
                str2 = qrCodeData.version;
            }
            if ((i11 & 4) != 0) {
                str3 = qrCodeData.url;
            }
            if ((i11 & 8) != 0) {
                str4 = qrCodeData.packageHash;
            }
            if ((i11 & 16) != 0) {
                str5 = qrCodeData.sdkVersion;
            }
            if ((i11 & 32) != 0) {
                j11 = qrCodeData.packageSize;
            }
            if ((i11 & 64) != 0) {
                j12 = qrCodeData.buildNo;
            }
            if ((i11 & 128) != 0) {
                z11 = qrCodeData.leadUpgrade;
            }
            if ((i11 & 256) != 0) {
                list = qrCodeData.basicDeps;
            }
            if ((i11 & 512) != 0) {
                list2 = qrCodeData.subPackages;
            }
            List list3 = list2;
            boolean z12 = z11;
            long j13 = j12;
            long j14 = j11;
            String str6 = str4;
            String str7 = str5;
            String str8 = str3;
            return qrCodeData.copy(str, str2, str8, str6, str7, j14, j13, z12, list, list3);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBiz() {
            return this.biz;
        }

        @Nullable
        public final List<PkgBasicDep> component10() {
            return this.subPackages;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getVersion() {
            return this.version;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getPackageHash() {
            return this.packageHash;
        }

        @Nullable
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getPackageSize() {
            return this.packageSize;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final long getBuildNo() {
            return this.buildNo;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final boolean getLeadUpgrade() {
            return this.leadUpgrade;
        }

        @Nullable
        public final List<PkgBasicDep> component9() {
            return this.basicDeps;
        }

        @NotNull
        public final QrCodeData copy(@Nullable String biz, @Nullable String version, @Nullable String url, @Nullable String packageHash, @Nullable String sdkVersion, long packageSize, long buildNo, boolean leadUpgrade, @Nullable List<PkgBasicDep> basicDeps, @Nullable List<PkgBasicDep> subPackages) {
            return new QrCodeData(biz, version, url, packageHash, sdkVersion, packageSize, buildNo, leadUpgrade, basicDeps, subPackages);
        }

        @Nullable
        public final List<PkgBasicDep> getBasicDeps() {
            return this.basicDeps;
        }

        @Nullable
        public final String getBiz() {
            return this.biz;
        }

        public final long getBuildNo() {
            return this.buildNo;
        }

        public final boolean getLeadUpgrade() {
            return this.leadUpgrade;
        }

        @Nullable
        public final String getPackageHash() {
            return this.packageHash;
        }

        public final long getPackageSize() {
            return this.packageSize;
        }

        @Nullable
        public final String getSdkVersion() {
            return this.sdkVersion;
        }

        @Nullable
        public final List<PkgBasicDep> getSubPackages() {
            return this.subPackages;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @Nullable
        public final String getVersion() {
            return this.version;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v16, types: [int] */
        /* JADX WARN: Type inference failed for: r2v17, types: [int] */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v28 */
        public int hashCode() {
            String str = this.biz;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.version;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.url;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.packageHash;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.sdkVersion;
            int iHashCode5 = (((((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Long.hashCode(this.packageSize)) * 31) + Long.hashCode(this.buildNo)) * 31;
            boolean z11 = this.leadUpgrade;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = (iHashCode5 + r11) * 31;
            List<PkgBasicDep> list = this.basicDeps;
            int iHashCode6 = (i11 + (list == null ? 0 : list.hashCode())) * 31;
            List<PkgBasicDep> list2 = this.subPackages;
            return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "QrCodeData(biz=" + this.biz + ", version=" + this.version + ", url=" + this.url + ", packageHash=" + this.packageHash + ", sdkVersion=" + this.sdkVersion + ", packageSize=" + this.packageSize + ", buildNo=" + this.buildNo + ", leadUpgrade=" + this.leadUpgrade + ", basicDeps=" + this.basicDeps + ", subPackages=" + this.subPackages + ')';
        }

        public /* synthetic */ QrCodeData(String str, String str2, String str3, String str4, String str5, long j11, long j12, boolean z11, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? 0L : j11, (i11 & 64) == 0 ? j12 : 0L, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : list, (i11 & 512) != 0 ? null : list2);
        }
    }

    /* JADX INFO: compiled from: PkgPlatformManager.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0083\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$QrCodeResponse;", "", "success", "", "code", "", "data", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$QrCodeData;", "(ZLjava/lang/String;Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$QrCodeData;)V", "getCode", "()Ljava/lang/String;", "getData", "()Lcom/kubi/sdk/pkg/bundle/pkgplatform/PkgPlatformManager$QrCodeData;", "getSuccess", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class QrCodeResponse {

        @Nullable
        private final String code;

        @Nullable
        private final QrCodeData data;
        private final boolean success;

        public QrCodeResponse() {
            this(false, null, null, 7, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QrCodeResponse)) {
                return false;
            }
            QrCodeResponse qrCodeResponse = (QrCodeResponse) other;
            return this.success == qrCodeResponse.success && Intrinsics.areEqual(this.code, qrCodeResponse.code) && Intrinsics.areEqual(this.data, qrCodeResponse.data);
        }

        public QrCodeResponse(boolean z11, @Nullable String str, @Nullable QrCodeData qrCodeData) {
            this.success = z11;
            this.code = str;
            this.data = qrCodeData;
        }

        public static /* synthetic */ QrCodeResponse copy$default(QrCodeResponse qrCodeResponse, boolean z11, String str, QrCodeData qrCodeData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = qrCodeResponse.success;
            }
            if ((i11 & 2) != 0) {
                str = qrCodeResponse.code;
            }
            if ((i11 & 4) != 0) {
                qrCodeData = qrCodeResponse.data;
            }
            return qrCodeResponse.copy(z11, str, qrCodeData);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getSuccess() {
            return this.success;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final QrCodeData getData() {
            return this.data;
        }

        @NotNull
        public final QrCodeResponse copy(boolean success, @Nullable String code, @Nullable QrCodeData data) {
            return new QrCodeResponse(success, code, data);
        }

        @Nullable
        public final String getCode() {
            return this.code;
        }

        @Nullable
        public final QrCodeData getData() {
            return this.data;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z11 = this.success;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = r11 * 31;
            String str = this.code;
            int iHashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
            QrCodeData qrCodeData = this.data;
            return iHashCode + (qrCodeData != null ? qrCodeData.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "QrCodeResponse(success=" + this.success + ", code=" + this.code + ", data=" + this.data + ')';
        }

        public /* synthetic */ QrCodeResponse(boolean z11, String str, QrCodeData qrCodeData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : qrCodeData);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ List m57615i(PkgPlatformManager pkgPlatformManager, Context context, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return pkgPlatformManager.m57621h(context, str);
    }

    /* JADX INFO: renamed from: l */
    public static final int m57618l(File file, File file2) {
        PkgPlatformManager pkgPlatformManager = f47352a;
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "a.name");
        String name2 = file2.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "b.name");
        return pkgPlatformManager.m57622m(name, name2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Object m57619q(PkgPlatformManager pkgPlatformManager, Context context, List list, String str, DownloadPriority downloadPriority, Collection collection, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            downloadPriority = DownloadPriority.NORMAL;
        }
        DownloadPriority downloadPriority2 = downloadPriority;
        if ((i11 & 16) != 0) {
            collection = CollectionsKt.emptyList();
        }
        return pkgPlatformManager.m57625p(context, list, str2, downloadPriority2, collection, continuation);
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Object m57620v(PkgPlatformManager pkgPlatformManager, Context context, String str, DownloadPriority downloadPriority, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            downloadPriority = DownloadPriority.VERY_HIGH;
        }
        return pkgPlatformManager.m57629u(context, str, downloadPriority, continuation);
    }

    /* JADX INFO: renamed from: h */
    public final List<CalcBundleBundleItem> m57621h(Context context, String filterBiz) {
        File[] fileArrListFiles;
        File file = new File(TaskCommonKt.m57795e(context) + File.separator + "jsbundles");
        if (!file.exists()) {
            return CollectionsKt.emptyList();
        }
        File[] fileArrListFiles2 = file.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.b
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return PkgPlatformManager.m57616j(file2);
            }
        });
        if (fileArrListFiles2 == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList<File> arrayList = new ArrayList();
        for (File file2 : fileArrListFiles2) {
            if (filterBiz == null || Intrinsics.areEqual(file2.getName(), filterBiz)) {
                arrayList.add(file2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (File file3 : arrayList) {
            File file4 = new File(file3, "main");
            CalcBundleBundleItem calcBundleBundleItem = null;
            if (file4.exists() && file4.isDirectory() && (fileArrListFiles = file4.listFiles(new FileFilter() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.c
                @Override // java.io.FileFilter
                public final boolean accept(File file5) {
                    return PkgPlatformManager.m57617k(file5);
                }
            })) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (File file5 : fileArrListFiles) {
                    PkgPlatformManager pkgPlatformManager = f47352a;
                    String name = file5.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "versionDir.name");
                    Pair<String, Long> pairM57626r = pkgPlatformManager.m57626r(name);
                    if (pairM57626r != null && pairM57626r.getSecond().longValue() > 0) {
                        arrayList3.add(file5);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : arrayList3) {
                    String name2 = file3.getName();
                    Intrinsics.checkNotNullExpressionValue(name2, "bizDir.name");
                    String name3 = ((File) obj).getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "versionDir.name");
                    if (C23935a.m57544a(context, name2, "main", name3)) {
                        arrayList4.add(obj);
                    }
                }
                File file6 = (File) CollectionsKt.maxWithOrNull(arrayList4, new Comparator() { // from class: com.kubi.sdk.pkg.bundle.pkgplatform.d
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        return PkgPlatformManager.m57618l((File) obj2, (File) obj3);
                    }
                });
                if (file6 != null) {
                    PkgPlatformManager pkgPlatformManager2 = f47352a;
                    String name4 = file6.getName();
                    Intrinsics.checkNotNullExpressionValue(name4, "latestVersionDir.name");
                    Pair<String, Long> pairM57626r2 = pkgPlatformManager2.m57626r(name4);
                    if (pairM57626r2 != null) {
                        String strComponent1 = pairM57626r2.component1();
                        long jLongValue = pairM57626r2.component2().longValue();
                        C23985b.f47489a.m57877e("pkgPlatform", "buildReportedBundles biz=" + file3.getName() + " version=" + strComponent1 + " buildNo=" + jLongValue);
                        String name5 = file3.getName();
                        Intrinsics.checkNotNullExpressionValue(name5, "bizDir.name");
                        calcBundleBundleItem = new CalcBundleBundleItem(name5, strComponent1, Long.valueOf(jLongValue));
                    }
                }
            }
            if (calcBundleBundleItem != null) {
                arrayList2.add(calcBundleBundleItem);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m57623n(@NotNull String biz) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Boolean boolRemove = leadUpgradeCache.remove(biz);
        if (boolRemove == null) {
            return false;
        }
        return boolRemove.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0158, code lost:
    
        if (r0 == r3) goto L49;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m57625p(Context context, List<CalcBundleBundleItem> list, String str, DownloadPriority downloadPriority, Collection<String> collection, Continuation<? super TaskStatus> continuation) {
        PkgPlatformManager$executeCalcBundle$1 pkgPlatformManager$executeCalcBundle$1;
        Context context2;
        Collection<String> collection2;
        PkgPlatformManager pkgPlatformManager;
        DownloadPriority downloadPriority2;
        List<CalcBundleBundleItem> list2;
        List<CalcBundleDeleteItem> delete;
        List<PkgBundleUpdateItem> update;
        if (continuation instanceof PkgPlatformManager$executeCalcBundle$1) {
            pkgPlatformManager$executeCalcBundle$1 = (PkgPlatformManager$executeCalcBundle$1) continuation;
            int i11 = pkgPlatformManager$executeCalcBundle$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pkgPlatformManager$executeCalcBundle$1.label = i11 - Integer.MIN_VALUE;
            } else {
                pkgPlatformManager$executeCalcBundle$1 = new PkgPlatformManager$executeCalcBundle$1(this, continuation);
            }
        } else {
            pkgPlatformManager$executeCalcBundle$1 = new PkgPlatformManager$executeCalcBundle$1(this, continuation);
        }
        Object objM57606b = pkgPlatformManager$executeCalcBundle$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = pkgPlatformManager$executeCalcBundle$1.label;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    collection2 = (Collection) pkgPlatformManager$executeCalcBundle$1.L$4;
                    downloadPriority2 = (DownloadPriority) pkgPlatformManager$executeCalcBundle$1.L$3;
                    list2 = (List) pkgPlatformManager$executeCalcBundle$1.L$2;
                    context2 = (Context) pkgPlatformManager$executeCalcBundle$1.L$1;
                    pkgPlatformManager = (PkgPlatformManager) pkgPlatformManager$executeCalcBundle$1.L$0;
                    ResultKt.throwOnFailure(objM57606b);
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objM57606b);
                }
                return (TaskStatus) objM57606b;
            }
            ResultKt.throwOnFailure(objM57606b);
            String strM57690d = PackConfigManager.f47378a.m57690d();
            if (strM57690d == null) {
                strM57690d = "";
            }
            CalcBundleRequest calcBundleRequest = new CalcBundleRequest(strM57690d, null, str, list, 2, null);
            PkgPlatformClient pkgPlatformClient = PkgPlatformClient.f47350a;
            pkgPlatformManager$executeCalcBundle$1.L$0 = this;
            pkgPlatformManager$executeCalcBundle$1.L$1 = context;
            pkgPlatformManager$executeCalcBundle$1.L$2 = list;
            pkgPlatformManager$executeCalcBundle$1.L$3 = downloadPriority;
            pkgPlatformManager$executeCalcBundle$1.L$4 = collection;
            pkgPlatformManager$executeCalcBundle$1.label = 1;
            objM57606b = pkgPlatformClient.m57606b(calcBundleRequest, pkgPlatformManager$executeCalcBundle$1);
            if (objM57606b != coroutine_suspended) {
                context2 = context;
                collection2 = collection;
                pkgPlatformManager = this;
                downloadPriority2 = downloadPriority;
                list2 = list;
            }
            return coroutine_suspended;
            CalcBundleResponse calcBundleResponse = (CalcBundleResponse) objM57606b;
            if (!calcBundleResponse.getSuccess()) {
                C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "executeCalcBundle 服务端返回失败: code=" + calcBundleResponse.getCode(), null, 4, null);
                return TaskStatus.INSTANCE.result(1501, "包管理平台返回失败: code=" + calcBundleResponse.getCode());
            }
            CalcBundleData data = calcBundleResponse.getData();
            C23985b c23985b = C23985b.f47489a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("executeCalcBundle update=");
            sb2.append((data == null || (update = data.getUpdate()) == null) ? 0 : update.size());
            sb2.append(", delete=");
            sb2.append((data == null || (delete = data.getDelete()) == null) ? 0 : delete.size());
            sb2.append(", priority=");
            sb2.append(downloadPriority2);
            c23985b.m57877e("pkgPlatform", sb2.toString());
            pkgPlatformManager.m57628t(context2, data);
            PkgPlatformUpdateTask pkgPlatformUpdateTask = new PkgPlatformUpdateTask(context2, calcBundleResponse, list2, downloadPriority2, collection2);
            pkgPlatformManager$executeCalcBundle$1.L$0 = null;
            pkgPlatformManager$executeCalcBundle$1.L$1 = null;
            pkgPlatformManager$executeCalcBundle$1.L$2 = null;
            pkgPlatformManager$executeCalcBundle$1.L$3 = null;
            pkgPlatformManager$executeCalcBundle$1.L$4 = null;
            pkgPlatformManager$executeCalcBundle$1.label = 2;
            objM57606b = pkgPlatformUpdateTask.m57655t(pkgPlatformManager$executeCalcBundle$1);
        } catch (TaskException e11) {
            C23985b.m57873d(C23985b.f47489a, "pkgPlatform", "executeCalcBundle 请求失败: " + e11.getMessage(), null, 4, null);
            return TaskStatus.INSTANCE.result(e11.getCode(), e11.getMessage());
        } catch (Exception e12) {
            C43846g.m96568c(new PackageException(e12, "pkgPlatform", false, null, 8, null), null, 2, null);
            return TaskStatus.INSTANCE.result(2000, "包管理平台请求异常: " + e12.getMessage());
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final Pair<String, Long> m57626r(@NotNull String dirName) {
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        MatchResult matchResultMatchEntire = new Regex("^(\\d+\\.\\d+\\.\\d+)-(\\d+)$").matchEntire(dirName);
        if (matchResultMatchEntire == null) {
            MatchResult matchResultMatchEntire2 = new Regex("^(\\d+\\.\\d+\\.\\d+)$").matchEntire(dirName);
            if (matchResultMatchEntire2 != null) {
                return TuplesKt.m90091to(matchResultMatchEntire2.getGroupValues().get(1), 0L);
            }
            return null;
        }
        String str = matchResultMatchEntire.getGroupValues().get(1);
        Long longOrNull = StringsKt.toLongOrNull(matchResultMatchEntire.getGroupValues().get(2));
        if (longOrNull != null) {
            return TuplesKt.m90091to(str, longOrNull);
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final void m57628t(Context context, CalcBundleData data) {
        List<PkgBundleUpdateItem> update;
        if (data != null && (update = data.getUpdate()) != null) {
            for (PkgBundleUpdateItem pkgBundleUpdateItem : update) {
                String biz = pkgBundleUpdateItem.getBiz();
                if (biz != null && pkgBundleUpdateItem.getLeadUpgrade()) {
                    leadUpgradeCache.put(biz, Boolean.TRUE);
                    C23985b.f47489a.m57877e("pkgPlatform", "calcBundle leadUpgrade=true for biz=" + biz);
                }
            }
        }
        RnI18nManager.f47318a.m57561f(context, data != null ? data.getUpdate() : null);
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m57616j(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m57617k(File file) {
        return file.isDirectory();
    }

    /* JADX INFO: renamed from: m */
    public final int m57622m(String a11, String b11) {
        Pair<String, Long> pairM57626r = m57626r(a11);
        Pair<String, Long> pairM57626r2 = m57626r(b11);
        if (pairM57626r == null && pairM57626r2 == null) {
            return 0;
        }
        if (pairM57626r == null) {
            return -1;
        }
        if (pairM57626r2 == null) {
            return 1;
        }
        int iM57851b = VersionUtils.f47483a.m57851b(pairM57626r.getFirst(), pairM57626r2.getFirst());
        if (iM57851b != 0) {
            return iM57851b;
        }
        return Intrinsics.compare(pairM57626r.getSecond().longValue(), pairM57626r2.getSecond().longValue());
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m57624o(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PkgPlatformManager$downloadSubPackage$2(str, context, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m57627s(@NotNull Context context, @NotNull Collection<String> collection, @NotNull Continuation<? super PkgPlatformStartupPlan> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PkgPlatformManager$prepareStartUpdateAll$2(context, collection, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Object m57629u(@NotNull Context context, @NotNull String str, @NotNull DownloadPriority downloadPriority, @NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PkgPlatformManager$startUpdate$2(str, context, downloadPriority, null), continuation);
    }

    @Nullable
    /* JADX INFO: renamed from: w */
    public final Object m57630w(@NotNull Context context, @NotNull String str, @NotNull Continuation<? super TaskStatus> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new PkgPlatformManager$startUpdateFromQrCode$2(str, context, null), continuation);
    }
}
