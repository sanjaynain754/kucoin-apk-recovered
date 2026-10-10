package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: LoadBundleConfig.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001%BM\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010 \u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0013\u0010!\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010$\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010#¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "bundleInfo", "", "baseBundleFilePath", "childBundleFilePath", "", "fromRemote", "fromPkgPlatform", "leadUpgrade", "isLocalBundle", "<init>", "(Lcom/kubi/sdk/pkg/bundle/BundleInfo;Ljava/lang/String;Ljava/lang/String;ZZZZ)V", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "c", "()Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "d", "Z", "g", "()Z", "e", "getFromPkgPlatform", CmcdData.Factory.STREAMING_FORMAT_HLS, "j", "i", "version", "baseVersion", "bundleUrl", "", "()I", "bundleOrigin", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class LoadBundleConfig {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final BundleInfo bundleInfo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String baseBundleFilePath;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String childBundleFilePath;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean fromRemote;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean fromPkgPlatform;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean leadUpgrade;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean isLocalBundle;

    /* JADX INFO: compiled from: LoadBundleConfig.kt */
    @Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JC\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0013J\u001e\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig$Companion;", "", "()V", "BUNDLE_ORIGIN_CLOUD_CONFIG", "", "BUNDLE_ORIGIN_LOCAL", "BUNDLE_ORIGIN_OTHER", "BUNDLE_ORIGIN_PKG_PLATFORM", "create", "Lcom/kubi/sdk/pkg/bundle/LoadBundleConfig;", "context", "Landroid/content/Context;", "bundleInfo", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "fromRemote", "", "fromPkgPlatform", "leadUpgrade", "isLocalBundle", "create$Package_release", "mock", Constants.BIZ, "", "entry", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nLoadBundleConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoadBundleConfig.kt\ncom/kubi/sdk/pkg/bundle/LoadBundleConfig$Companion\n+ 2 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 3 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 4 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n*L\n1#1,88:1\n28#2:89\n28#2:94\n41#3:90\n37#3:91\n30#3:93\n41#3:95\n37#3:96\n30#3:98\n41#3:99\n37#3:100\n30#3:102\n62#4:92\n62#4:97\n62#4:101\n*S KotlinDebug\n*F\n+ 1 LoadBundleConfig.kt\ncom/kubi/sdk/pkg/bundle/LoadBundleConfig$Companion\n*L\n74#1:89\n75#1:94\n74#1:90\n74#1:91\n74#1:93\n75#1:95\n75#1:96\n75#1:98\n86#1:99\n86#1:100\n86#1:102\n74#1:92\n75#1:97\n86#1:101\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ LoadBundleConfig create$Package_release$default(Companion companion, Context context, BundleInfo bundleInfo, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
            if ((i11 & 8) != 0) {
                z12 = false;
            }
            if ((i11 & 16) != 0) {
                z13 = false;
            }
            if ((i11 & 32) != 0) {
                z14 = !z11;
            }
            return companion.create$Package_release(context, bundleInfo, z11, z12, z13, z14);
        }

        @NotNull
        public final LoadBundleConfig create$Package_release(@NotNull Context context, @NotNull BundleInfo bundleInfo, boolean fromRemote, boolean fromPkgPlatform, boolean leadUpgrade, boolean isLocalBundle) {
            String str;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(bundleInfo, "bundleInfo");
            String biz = bundleInfo.getBiz();
            String entry = bundleInfo.getEntry();
            String version = bundleInfo.getVersion();
            String strM57795e = TaskCommonKt.m57795e(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM57795e);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("jsbundles");
            String str3 = ((sb2.toString() + str2 + biz) + str2 + entry) + str2 + version;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(biz + '-' + entry);
            sb3.append(".android.hbc");
            String str4 = str3 + str2 + sb3.toString();
            BundleInfo baseInfo = bundleInfo.getBaseInfo();
            if (baseInfo != null) {
                String biz2 = baseInfo.getBiz();
                String entry2 = baseInfo.getEntry();
                String version2 = baseInfo.getVersion();
                String str5 = (((TaskCommonKt.m57795e(context) + str2 + "jsbundles") + str2 + biz2) + str2 + entry2) + str2 + version2;
                StringBuilder sb4 = new StringBuilder();
                sb4.append(biz2 + '-' + entry2);
                sb4.append(".android.hbc");
                str = str5 + str2 + sb4.toString();
            } else {
                str = null;
            }
            String str6 = str;
            return str6 != null ? new LoadBundleConfig(bundleInfo, str6, str4, fromRemote, fromPkgPlatform, leadUpgrade, isLocalBundle, null) : new LoadBundleConfig(bundleInfo, str4, null, fromRemote, fromPkgPlatform, leadUpgrade, isLocalBundle, null);
        }

        @NotNull
        public final LoadBundleConfig mock(@NotNull Context context, @NotNull String biz, @NotNull String entry) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(biz, "biz");
            Intrinsics.checkNotNullParameter(entry, "entry");
            String strM57795e = TaskCommonKt.m57795e(context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strM57795e);
            String str = File.separator;
            sb2.append(str);
            sb2.append("jsbundles");
            String str2 = ((sb2.toString() + str + biz) + str + entry) + str + "1.0.0";
            StringBuilder sb3 = new StringBuilder();
            sb3.append(biz + '-' + entry);
            sb3.append(".android.hbc");
            return new LoadBundleConfig(null, str2 + str + sb3.toString(), null, false, false, false, false, 120, null);
        }
    }

    public /* synthetic */ LoadBundleConfig(BundleInfo bundleInfo, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundleInfo, str, str2, z11, z12, z13, z14);
    }

    public LoadBundleConfig(BundleInfo bundleInfo, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.bundleInfo = bundleInfo;
        this.baseBundleFilePath = str;
        this.childBundleFilePath = str2;
        this.fromRemote = z11;
        this.fromPkgPlatform = z12;
        this.leadUpgrade = z13;
        this.isLocalBundle = z14;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBaseBundleFilePath() {
        return this.baseBundleFilePath;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m57535b() {
        BundleInfo bundleInfo = this.bundleInfo;
        if (bundleInfo != null) {
            return bundleInfo.getBaseVersion();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final BundleInfo getBundleInfo() {
        return this.bundleInfo;
    }

    /* JADX INFO: renamed from: d */
    public final int m57537d() {
        if (this.fromRemote) {
            return this.fromPkgPlatform ? 2 : 3;
        }
        return 1;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final String m57538e() {
        BundleInfo bundleInfo = this.bundleInfo;
        if (bundleInfo != null) {
            return bundleInfo.getBundleUrl();
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getChildBundleFilePath() {
        return this.childBundleFilePath;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getFromRemote() {
        return this.fromRemote;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getLeadUpgrade() {
        return this.leadUpgrade;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final String m57542i() {
        BundleInfo bundleInfo = this.bundleInfo;
        if (bundleInfo != null) {
            return bundleInfo.getVersion();
        }
        return null;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getIsLocalBundle() {
        return this.isLocalBundle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ LoadBundleConfig(BundleInfo bundleInfo, String str, String str2, boolean z11, boolean z12, boolean z13, boolean z14, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        z11 = (i11 & 8) != 0 ? false : z11;
        this(bundleInfo, str, str2, z11, (i11 & 16) != 0 ? false : z12, (i11 & 32) != 0 ? false : z13, (i11 & 64) != 0 ? !z11 : z14);
    }
}
