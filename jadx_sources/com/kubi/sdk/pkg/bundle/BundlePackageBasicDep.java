package com.kubi.sdk.pkg.bundle;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BundlePackageInfo.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003JM\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/BundlePackageBasicDep;", "", Constants.BIZ, "", "version", "url", "packageHash", "buildNo", "", "packageSize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "getBiz", "()Ljava/lang/String;", "getBuildNo", "()J", "getPackageHash", "getPackageSize", "getUrl", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class BundlePackageBasicDep {

    @Nullable
    private final String biz;
    private final long buildNo;

    @SerializedName("packageHash")
    @Nullable
    private final String packageHash;

    @SerializedName("packageSize")
    private final long packageSize;

    @Nullable
    private final String url;

    @Nullable
    private final String version;

    public BundlePackageBasicDep(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, long j11, long j12) {
        this.biz = str;
        this.version = str2;
        this.url = str3;
        this.packageHash = str4;
        this.buildNo = j11;
        this.packageSize = j12;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BundlePackageBasicDep)) {
            return false;
        }
        BundlePackageBasicDep bundlePackageBasicDep = (BundlePackageBasicDep) other;
        return Intrinsics.areEqual(this.biz, bundlePackageBasicDep.biz) && Intrinsics.areEqual(this.version, bundlePackageBasicDep.version) && Intrinsics.areEqual(this.url, bundlePackageBasicDep.url) && Intrinsics.areEqual(this.packageHash, bundlePackageBasicDep.packageHash) && this.buildNo == bundlePackageBasicDep.buildNo && this.packageSize == bundlePackageBasicDep.packageSize;
    }

    public static /* synthetic */ BundlePackageBasicDep copy$default(BundlePackageBasicDep bundlePackageBasicDep, String str, String str2, String str3, String str4, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bundlePackageBasicDep.biz;
        }
        if ((i11 & 2) != 0) {
            str2 = bundlePackageBasicDep.version;
        }
        if ((i11 & 4) != 0) {
            str3 = bundlePackageBasicDep.url;
        }
        if ((i11 & 8) != 0) {
            str4 = bundlePackageBasicDep.packageHash;
        }
        if ((i11 & 16) != 0) {
            j11 = bundlePackageBasicDep.buildNo;
        }
        if ((i11 & 32) != 0) {
            j12 = bundlePackageBasicDep.packageSize;
        }
        long j13 = j12;
        long j14 = j11;
        return bundlePackageBasicDep.copy(str, str2, str3, str4, j14, j13);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBiz() {
        return this.biz;
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getBuildNo() {
        return this.buildNo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getPackageSize() {
        return this.packageSize;
    }

    @NotNull
    public final BundlePackageBasicDep copy(@Nullable String biz, @Nullable String version, @Nullable String url, @Nullable String packageHash, long buildNo, long packageSize) {
        return new BundlePackageBasicDep(biz, version, url, packageHash, buildNo, packageSize);
    }

    @Nullable
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
        String str2 = this.version;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageHash;
        return ((((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Long.hashCode(this.buildNo)) * 31) + Long.hashCode(this.packageSize);
    }

    @NotNull
    public String toString() {
        return "BundlePackageBasicDep(biz=" + this.biz + ", version=" + this.version + ", url=" + this.url + ", packageHash=" + this.packageHash + ", buildNo=" + this.buildNo + ", packageSize=" + this.packageSize + ')';
    }

    public /* synthetic */ BundlePackageBasicDep(String str, String str2, String str3, String str4, long j11, long j12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? 0L : j11, (i11 & 32) != 0 ? 0L : j12);
    }
}
