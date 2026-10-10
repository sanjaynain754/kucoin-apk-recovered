package com.kubi.sdk.pkg.bundle.pkgplatform;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PkgPlatformApi.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleRequest;", "", "appName", "", "platform", "queryType", "bundles", "", "Lcom/kubi/sdk/pkg/bundle/pkgplatform/CalcBundleBundleItem;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAppName", "()Ljava/lang/String;", "getBundles", "()Ljava/util/List;", "getPlatform", "getQueryType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Package_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class CalcBundleRequest {

    @NotNull
    private final String appName;

    @NotNull
    private final List<CalcBundleBundleItem> bundles;

    @NotNull
    private final String platform;

    @Nullable
    private final String queryType;

    public CalcBundleRequest(@NotNull String appName, @NotNull String platform, @Nullable String str, @NotNull List<CalcBundleBundleItem> bundles) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(bundles, "bundles");
        this.appName = appName;
        this.platform = platform;
        this.queryType = str;
        this.bundles = bundles;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalcBundleRequest)) {
            return false;
        }
        CalcBundleRequest calcBundleRequest = (CalcBundleRequest) other;
        return Intrinsics.areEqual(this.appName, calcBundleRequest.appName) && Intrinsics.areEqual(this.platform, calcBundleRequest.platform) && Intrinsics.areEqual(this.queryType, calcBundleRequest.queryType) && Intrinsics.areEqual(this.bundles, calcBundleRequest.bundles);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalcBundleRequest copy$default(CalcBundleRequest calcBundleRequest, String str, String str2, String str3, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = calcBundleRequest.appName;
        }
        if ((i11 & 2) != 0) {
            str2 = calcBundleRequest.platform;
        }
        if ((i11 & 4) != 0) {
            str3 = calcBundleRequest.queryType;
        }
        if ((i11 & 8) != 0) {
            list = calcBundleRequest.bundles;
        }
        return calcBundleRequest.copy(str, str2, str3, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQueryType() {
        return this.queryType;
    }

    @NotNull
    public final List<CalcBundleBundleItem> component4() {
        return this.bundles;
    }

    @NotNull
    public final CalcBundleRequest copy(@NotNull String appName, @NotNull String platform, @Nullable String queryType, @NotNull List<CalcBundleBundleItem> bundles) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(bundles, "bundles");
        return new CalcBundleRequest(appName, platform, queryType, bundles);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final List<CalcBundleBundleItem> getBundles() {
        return this.bundles;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    @Nullable
    public final String getQueryType() {
        return this.queryType;
    }

    public int hashCode() {
        int iHashCode = ((this.appName.hashCode() * 31) + this.platform.hashCode()) * 31;
        String str = this.queryType;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bundles.hashCode();
    }

    @NotNull
    public String toString() {
        return "CalcBundleRequest(appName=" + this.appName + ", platform=" + this.platform + ", queryType=" + this.queryType + ", bundles=" + this.bundles + ')';
    }

    public /* synthetic */ CalcBundleRequest(String str, String str2, String str3, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? "ANDROID" : str2, (i11 & 4) != 0 ? null : str3, list);
    }
}
