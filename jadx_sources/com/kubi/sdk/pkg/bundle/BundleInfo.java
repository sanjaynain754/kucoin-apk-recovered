package com.kubi.sdk.pkg.bundle;

import android.content.Context;
import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.pkg.task.TaskCommonKt;
import com.kubi.sdk.pkg.util.VersionUtils;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BundleInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u0000 .2\u00020\u0001:\u0001.BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\bJ\u0011\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\bJ\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0086\u0004J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010+\u001a\u0004\u0018\u00010\u0000J\t\u0010,\u001a\u00020\u001eHÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000e¨\u0006/"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "", Constants.BIZ, "", "entry", "version", "baseVersion", "baseDepUrl", "baseDepHash", "baseDepSize", "", "bundleUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getBaseDepHash", "()Ljava/lang/String;", "getBaseDepSize", "()J", "getBaseDepUrl", "getBaseVersion", "getBiz", "getBundleUrl", "getEntry", "name", "getName", "getVersion", "bundleDirPath", "context", "Landroid/content/Context;", "bundleFilePath", "compareVersion", "", "other", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "getBaseInfo", "hashCode", "toString", "Companion", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundleInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n+ 2 BundleCommon.kt\ncom/kubi/sdk/pkg/bundle/BundleCommonKt\n+ 3 TaskCommon.kt\ncom/kubi/sdk/pkg/task/TaskCommonKt\n*L\n1#1,64:1\n30#2:65\n41#2:66\n37#2:67\n30#2:69\n37#2:70\n62#3:68\n62#3:71\n*S KotlinDebug\n*F\n+ 1 BundleInfo.kt\ncom/kubi/sdk/pkg/bundle/BundleInfo\n*L\n23#1:65\n28#1:66\n28#1:67\n28#1:69\n30#1:70\n28#1:68\n30#1:71\n*E\n"})
public final /* data */ class BundleInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String baseDepHash;
    private final long baseDepSize;

    @Nullable
    private final String baseDepUrl;

    @Nullable
    private final String baseVersion;

    @NotNull
    private final String biz;

    @Nullable
    private final String bundleUrl;

    @NotNull
    private final String entry;

    @NotNull
    private final String version;

    /* JADX INFO: compiled from: BundleInfo.kt */
    @Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ!\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000f¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundleInfo$Companion;", "", "()V", "buildBase", "Lcom/kubi/sdk/pkg/bundle/BundleInfo;", "version", "", "compareBundleVersion", "", "v1", "v2", "compareBundleVersion$Package_release", "parseVersion", "Lkotlin/Pair;", "", "parseVersion$Package_release", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final BundleInfo buildBase(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            return new BundleInfo("krnbase", "main", version, null, null, null, 0L, null, 240, null);
        }

        public final int compareBundleVersion$Package_release(@NotNull String v11, @NotNull String v12) {
            Intrinsics.checkNotNullParameter(v11, "v1");
            Intrinsics.checkNotNullParameter(v12, "v2");
            Pair<String, Long> version$Package_release = parseVersion$Package_release(v11);
            String strComponent1 = version$Package_release.component1();
            long jLongValue = version$Package_release.component2().longValue();
            Pair<String, Long> version$Package_release2 = parseVersion$Package_release(v12);
            String strComponent2 = version$Package_release2.component1();
            long jLongValue2 = version$Package_release2.component2().longValue();
            int iM57851b = VersionUtils.f47483a.m57851b(strComponent1, strComponent2);
            return iM57851b != 0 ? iM57851b : Intrinsics.compare(jLongValue, jLongValue2);
        }

        @NotNull
        public final Pair<String, Long> parseVersion$Package_release(@NotNull String version) {
            Intrinsics.checkNotNullParameter(version, "version");
            int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) version, '-', 0, false, 6, (Object) null);
            if (iLastIndexOf$default > 0) {
                String strSubstring = version.substring(iLastIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                Long longOrNull = StringsKt.toLongOrNull(strSubstring);
                if (longOrNull != null) {
                    String strSubstring2 = version.substring(0, iLastIndexOf$default);
                    Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    return TuplesKt.m90091to(strSubstring2, longOrNull);
                }
            }
            return TuplesKt.m90091to(version, -1L);
        }
    }

    public BundleInfo(@NotNull String biz, @NotNull String entry, @NotNull String version, @Nullable String str, @Nullable String str2, @Nullable String str3, long j11, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(version, "version");
        this.biz = biz;
        this.entry = entry;
        this.version = version;
        this.baseVersion = str;
        this.baseDepUrl = str2;
        this.baseDepHash = str3;
        this.baseDepSize = j11;
        this.bundleUrl = str4;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BundleInfo)) {
            return false;
        }
        BundleInfo bundleInfo = (BundleInfo) other;
        return Intrinsics.areEqual(this.biz, bundleInfo.biz) && Intrinsics.areEqual(this.entry, bundleInfo.entry) && Intrinsics.areEqual(this.version, bundleInfo.version) && Intrinsics.areEqual(this.baseVersion, bundleInfo.baseVersion) && Intrinsics.areEqual(this.baseDepUrl, bundleInfo.baseDepUrl) && Intrinsics.areEqual(this.baseDepHash, bundleInfo.baseDepHash) && this.baseDepSize == bundleInfo.baseDepSize && Intrinsics.areEqual(this.bundleUrl, bundleInfo.bundleUrl);
    }

    public static /* synthetic */ BundleInfo copy$default(BundleInfo bundleInfo, String str, String str2, String str3, String str4, String str5, String str6, long j11, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bundleInfo.biz;
        }
        if ((i11 & 2) != 0) {
            str2 = bundleInfo.entry;
        }
        if ((i11 & 4) != 0) {
            str3 = bundleInfo.version;
        }
        if ((i11 & 8) != 0) {
            str4 = bundleInfo.baseVersion;
        }
        if ((i11 & 16) != 0) {
            str5 = bundleInfo.baseDepUrl;
        }
        if ((i11 & 32) != 0) {
            str6 = bundleInfo.baseDepHash;
        }
        if ((i11 & 64) != 0) {
            j11 = bundleInfo.baseDepSize;
        }
        if ((i11 & 128) != 0) {
            str7 = bundleInfo.bundleUrl;
        }
        String str8 = str7;
        long j12 = j11;
        String str9 = str5;
        String str10 = str6;
        return bundleInfo.copy(str, str2, str3, str4, str9, str10, j12, str8);
    }

    @NotNull
    public final String bundleDirPath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String biz = getBiz();
        String entry = getEntry();
        String version = getVersion();
        String strM57795e = TaskCommonKt.m57795e(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("jsbundles");
        return ((sb2.toString() + str + biz) + str + entry) + str + version;
    }

    @NotNull
    public final String bundleFilePath(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String biz = getBiz();
        String entry = getEntry();
        String version = getVersion();
        String strM57795e = TaskCommonKt.m57795e(context);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM57795e);
        String str = File.separator;
        sb2.append(str);
        sb2.append("jsbundles");
        String str2 = ((sb2.toString() + str + biz) + str + entry) + str + version;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(biz + '-' + entry);
        sb3.append(".android.hbc");
        return str2 + str + sb3.toString();
    }

    public final int compareVersion(@NotNull BundleInfo other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return INSTANCE.compareBundleVersion$Package_release(this.version, other.version);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntry() {
        return this.entry;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBaseVersion() {
        return this.baseVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBaseDepUrl() {
        return this.baseDepUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBaseDepHash() {
        return this.baseDepHash;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getBaseDepSize() {
        return this.baseDepSize;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBundleUrl() {
        return this.bundleUrl;
    }

    @NotNull
    public final BundleInfo copy(@NotNull String biz, @NotNull String entry, @NotNull String version, @Nullable String baseVersion, @Nullable String baseDepUrl, @Nullable String baseDepHash, long baseDepSize, @Nullable String bundleUrl) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(version, "version");
        return new BundleInfo(biz, entry, version, baseVersion, baseDepUrl, baseDepHash, baseDepSize, bundleUrl);
    }

    @Nullable
    public final String getBaseDepHash() {
        return this.baseDepHash;
    }

    public final long getBaseDepSize() {
        return this.baseDepSize;
    }

    @Nullable
    public final String getBaseDepUrl() {
        return this.baseDepUrl;
    }

    @Nullable
    public final BundleInfo getBaseInfo() {
        String str = this.baseVersion;
        if (str == null) {
            return null;
        }
        return INSTANCE.buildBase(str);
    }

    @Nullable
    public final String getBaseVersion() {
        return this.baseVersion;
    }

    @NotNull
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    public final String getBundleUrl() {
        return this.bundleUrl;
    }

    @NotNull
    public final String getEntry() {
        return this.entry;
    }

    @NotNull
    public final String getName() {
        return this.biz + '-' + this.entry;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((this.biz.hashCode() * 31) + this.entry.hashCode()) * 31) + this.version.hashCode()) * 31;
        String str = this.baseVersion;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.baseDepUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.baseDepHash;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.baseDepSize)) * 31;
        String str4 = this.bundleUrl;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BundleInfo(biz=" + this.biz + ", entry=" + this.entry + ", version=" + this.version + ", baseVersion=" + this.baseVersion + ", baseDepUrl=" + this.baseDepUrl + ", baseDepHash=" + this.baseDepHash + ", baseDepSize=" + this.baseDepSize + ", bundleUrl=" + this.bundleUrl + ')';
    }

    public /* synthetic */ BundleInfo(String str, String str2, String str3, String str4, String str5, String str6, long j11, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? 0L : j11, (i11 & 128) != 0 ? null : str7);
    }
}
