package com.kubi.sdk.pkg.bundle;

import androidx.annotation.Keep;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.Constants;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: BundlePackageInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B¥\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015¢\u0006\u0002\u0010\u0017J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\u0011\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u000eHÆ\u0003J¹\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0006HÖ\u0001J\t\u0010H\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010!\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001dR\u0011\u0010#\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001fR\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0013\u0010'\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0016\u0010\u0013\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001d¨\u0006I"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundlePackageInfo;", "", Constants.BIZ, "", "entry", "type", "", "version", "platform", "basic", "Lcom/kubi/sdk/pkg/bundle/BundlePackageBasic;", "hash", "packageHash", "timestamp", "", "buildNo", "buildNoCamel", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "url", "packageSize", "basicDepsArray", "", "Lcom/kubi/sdk/pkg/bundle/BundlePackageBasicDep;", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/pkg/bundle/BundlePackageBasic;Ljava/lang/String;Ljava/lang/String;JJJLjava/lang/String;Ljava/lang/String;JLjava/util/List;)V", "getBasic", "()Lcom/kubi/sdk/pkg/bundle/BundlePackageBasic;", "getBasicDepsArray", "()Ljava/util/List;", "getBiz", "()Ljava/lang/String;", "getBuildNo", "()J", "getBuildNoCamel", "effectiveBaseVersion", "getEffectiveBaseVersion", "effectiveBuildNo", "getEffectiveBuildNo", "effectiveEntry", "getEffectiveEntry", "effectiveHash", "getEffectiveHash", "getEntry", "getHash", "getPackageHash", "getPackageSize", "getPlatform", "getSdkVersion", "getTimestamp", "getType", "()I", "getUrl", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBundlePackageInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundlePackageInfo.kt\ncom/kubi/sdk/pkg/bundle/BundlePackageInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1#2:126\n288#3,2:127\n*S KotlinDebug\n*F\n+ 1 BundlePackageInfo.kt\ncom/kubi/sdk/pkg/bundle/BundlePackageInfo\n*L\n101#1:127,2\n*E\n"})
public final /* data */ class BundlePackageInfo {

    @SerializedName("basic_deps")
    @Nullable
    private final BundlePackageBasic basic;

    @SerializedName("basicDeps")
    @Nullable
    private final List<BundlePackageBasicDep> basicDepsArray;

    @Nullable
    private final String biz;

    @SerializedName("build_no")
    private final long buildNo;

    @SerializedName("buildNo")
    private final long buildNoCamel;

    @Nullable
    private final String entry;

    @SerializedName("package_hash")
    @Nullable
    private final String hash;

    @SerializedName("packageHash")
    @Nullable
    private final String packageHash;

    @SerializedName("package_size")
    private final long packageSize;

    @Nullable
    private final String platform;

    @SerializedName("sdk_version")
    @Nullable
    private final String sdkVersion;
    private final long timestamp;
    private final int type;

    @Nullable
    private final String url;

    @Nullable
    private final String version;

    public BundlePackageInfo(@Nullable String str, @Nullable String str2, int i11, @Nullable String str3, @Nullable String str4, @Nullable BundlePackageBasic bundlePackageBasic, @Nullable String str5, @Nullable String str6, long j11, long j12, long j13, @Nullable String str7, @Nullable String str8, long j14, @Nullable List<BundlePackageBasicDep> list) {
        this.biz = str;
        this.entry = str2;
        this.type = i11;
        this.version = str3;
        this.platform = str4;
        this.basic = bundlePackageBasic;
        this.hash = str5;
        this.packageHash = str6;
        this.timestamp = j11;
        this.buildNo = j12;
        this.buildNoCamel = j13;
        this.sdkVersion = str7;
        this.url = str8;
        this.packageSize = j14;
        this.basicDepsArray = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BundlePackageInfo)) {
            return false;
        }
        BundlePackageInfo bundlePackageInfo = (BundlePackageInfo) other;
        return Intrinsics.areEqual(this.biz, bundlePackageInfo.biz) && Intrinsics.areEqual(this.entry, bundlePackageInfo.entry) && this.type == bundlePackageInfo.type && Intrinsics.areEqual(this.version, bundlePackageInfo.version) && Intrinsics.areEqual(this.platform, bundlePackageInfo.platform) && Intrinsics.areEqual(this.basic, bundlePackageInfo.basic) && Intrinsics.areEqual(this.hash, bundlePackageInfo.hash) && Intrinsics.areEqual(this.packageHash, bundlePackageInfo.packageHash) && this.timestamp == bundlePackageInfo.timestamp && this.buildNo == bundlePackageInfo.buildNo && this.buildNoCamel == bundlePackageInfo.buildNoCamel && Intrinsics.areEqual(this.sdkVersion, bundlePackageInfo.sdkVersion) && Intrinsics.areEqual(this.url, bundlePackageInfo.url) && this.packageSize == bundlePackageInfo.packageSize && Intrinsics.areEqual(this.basicDepsArray, bundlePackageInfo.basicDepsArray);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getBuildNo() {
        return this.buildNo;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getBuildNoCamel() {
        return this.buildNoCamel;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final long getPackageSize() {
        return this.packageSize;
    }

    @Nullable
    public final List<BundlePackageBasicDep> component15() {
        return this.basicDepsArray;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntry() {
        return this.entry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BundlePackageBasic getBasic() {
        return this.basic;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPackageHash() {
        return this.packageHash;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final BundlePackageInfo copy(@Nullable String biz, @Nullable String entry, int type, @Nullable String version, @Nullable String platform, @Nullable BundlePackageBasic basic, @Nullable String hash, @Nullable String packageHash, long timestamp, long buildNo, long buildNoCamel, @Nullable String sdkVersion, @Nullable String url, long packageSize, @Nullable List<BundlePackageBasicDep> basicDepsArray) {
        return new BundlePackageInfo(biz, entry, type, version, platform, basic, hash, packageHash, timestamp, buildNo, buildNoCamel, sdkVersion, url, packageSize, basicDepsArray);
    }

    @Nullable
    public final BundlePackageBasic getBasic() {
        return this.basic;
    }

    @Nullable
    public final List<BundlePackageBasicDep> getBasicDepsArray() {
        return this.basicDepsArray;
    }

    @Nullable
    public final String getBiz() {
        return this.biz;
    }

    public final long getBuildNo() {
        return this.buildNo;
    }

    public final long getBuildNoCamel() {
        return this.buildNoCamel;
    }

    @Nullable
    public final String getEffectiveBaseVersion() {
        Object next;
        String version;
        String version2;
        BundlePackageBasic bundlePackageBasic = this.basic;
        if (bundlePackageBasic != null && (version2 = bundlePackageBasic.getVersion()) != null) {
            if (version2.length() <= 0) {
                version2 = null;
            }
            if (version2 != null) {
                return version2;
            }
        }
        List<BundlePackageBasicDep> list = this.basicDepsArray;
        if (list != null) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                version = ((BundlePackageBasicDep) next).getVersion();
            } while (version == null || version.length() == 0);
            BundlePackageBasicDep bundlePackageBasicDep = (BundlePackageBasicDep) next;
            if (bundlePackageBasicDep != null) {
                long buildNo = bundlePackageBasicDep.getBuildNo();
                if (buildNo <= 0) {
                    return bundlePackageBasicDep.getVersion();
                }
                return bundlePackageBasicDep.getVersion() + '-' + buildNo;
            }
        }
        return null;
    }

    public final long getEffectiveBuildNo() {
        long j11 = this.buildNoCamel;
        return j11 > 0 ? j11 : this.buildNo;
    }

    @NotNull
    public final String getEffectiveEntry() {
        String str = this.entry;
        return (str == null || str.length() == 0) ? "main" : this.entry;
    }

    @Nullable
    public final String getEffectiveHash() {
        String str = this.packageHash;
        return (str == null || str.length() == 0) ? this.hash : this.packageHash;
    }

    @Nullable
    public final String getEntry() {
        return this.entry;
    }

    @Nullable
    public final String getHash() {
        return this.hash;
    }

    @Nullable
    public final String getPackageHash() {
        return this.packageHash;
    }

    public final long getPackageSize() {
        return this.packageSize;
    }

    @Nullable
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.biz;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.entry;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + Integer.hashCode(this.type)) * 31;
        String str3 = this.version;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.platform;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BundlePackageBasic bundlePackageBasic = this.basic;
        int iHashCode5 = (iHashCode4 + (bundlePackageBasic == null ? 0 : bundlePackageBasic.hashCode())) * 31;
        String str5 = this.hash;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.packageHash;
        int iHashCode7 = (((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31) + Long.hashCode(this.buildNo)) * 31) + Long.hashCode(this.buildNoCamel)) * 31;
        String str7 = this.sdkVersion;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.url;
        int iHashCode9 = (((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + Long.hashCode(this.packageSize)) * 31;
        List<BundlePackageBasicDep> list = this.basicDepsArray;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BundlePackageInfo(biz=" + this.biz + ", entry=" + this.entry + ", type=" + this.type + ", version=" + this.version + ", platform=" + this.platform + ", basic=" + this.basic + ", hash=" + this.hash + ", packageHash=" + this.packageHash + ", timestamp=" + this.timestamp + ", buildNo=" + this.buildNo + ", buildNoCamel=" + this.buildNoCamel + ", sdkVersion=" + this.sdkVersion + ", url=" + this.url + ", packageSize=" + this.packageSize + ", basicDepsArray=" + this.basicDepsArray + ')';
    }

    public /* synthetic */ BundlePackageInfo(String str, String str2, int i11, String str3, String str4, BundlePackageBasic bundlePackageBasic, String str5, String str6, long j11, long j12, long j13, String str7, String str8, long j14, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i12 & 4) != 0 ? 0 : i11, str3, str4, bundlePackageBasic, str5, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? 0L : j11, (i12 & 512) != 0 ? 0L : j12, (i12 & 1024) != 0 ? 0L : j13, str7, str8, (i12 & 8192) != 0 ? 0L : j14, (i12 & 16384) != 0 ? null : list);
    }
}
