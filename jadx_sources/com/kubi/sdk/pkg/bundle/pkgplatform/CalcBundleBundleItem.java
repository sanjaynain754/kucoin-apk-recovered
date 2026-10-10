package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.annotation.Keep;
import com.kubi.p110rn.Constants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PkgPlatformApi.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000bJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;", "", Constants.BIZ, "", "version", "buildNo", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getBiz", "()Ljava/lang/String;", "getBuildNo", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVersion", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class CalcBundleBundleItem {

    @NotNull
    private final String biz;

    @Nullable
    private final Long buildNo;

    @Nullable
    private final String version;

    public CalcBundleBundleItem(@NotNull String biz, @Nullable String str, @Nullable Long l11) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        this.biz = biz;
        this.version = str;
        this.buildNo = l11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcBundleBundleItem)) {
            return false;
        }
        CalcBundleBundleItem calcBundleBundleItem = (CalcBundleBundleItem) other;
        return Intrinsics.areEqual(this.biz, calcBundleBundleItem.biz) && Intrinsics.areEqual(this.version, calcBundleBundleItem.version) && Intrinsics.areEqual(this.buildNo, calcBundleBundleItem.buildNo);
    }

    public static /* synthetic */ CalcBundleBundleItem copy$default(CalcBundleBundleItem calcBundleBundleItem, String str, String str2, Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = calcBundleBundleItem.biz;
        }
        if ((i11 & 2) != 0) {
            str2 = calcBundleBundleItem.version;
        }
        if ((i11 & 4) != 0) {
            l11 = calcBundleBundleItem.buildNo;
        }
        return calcBundleBundleItem.copy(str, str2, l11);
    }

    @NotNull
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
    public final Long getBuildNo() {
        return this.buildNo;
    }

    @NotNull
    public final CalcBundleBundleItem copy(@NotNull String biz, @Nullable String version, @Nullable Long buildNo) {
        Intrinsics.checkNotNullParameter(biz, "biz");
        return new CalcBundleBundleItem(biz, version, buildNo);
    }

    @NotNull
    public final String getBiz() {
        return this.biz;
    }

    @Nullable
    public final Long getBuildNo() {
        return this.buildNo;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.biz.hashCode() * 31;
        String str = this.version;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.buildNo;
        return iHashCode2 + (l11 != null ? l11.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CalcBundleBundleItem(biz=" + this.biz + ", version=" + this.version + ", buildNo=" + this.buildNo + ')';
    }

    public /* synthetic */ CalcBundleBundleItem(String str, String str2, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : l11);
    }
}
