package com.kubi.sdk.protocol.jsapi.protocol;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCJSApiSiteModule.kt */
/* JADX INFO: loaded from: classes41.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/sdk/protocol/jsapi/protocol/KCJSApiSiteSupportSiteItem;", "", "siteType", "", "siteName", "(Ljava/lang/String;Ljava/lang/String;)V", "getSiteName", "()Ljava/lang/String;", "getSiteType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KcProtocol_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final /* data */ class KCJSApiSiteSupportSiteItem {

    @Nullable
    private final String siteName;

    @Nullable
    private final String siteType;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCJSApiSiteSupportSiteItem)) {
            return false;
        }
        KCJSApiSiteSupportSiteItem kCJSApiSiteSupportSiteItem = (KCJSApiSiteSupportSiteItem) other;
        return Intrinsics.areEqual(this.siteType, kCJSApiSiteSupportSiteItem.siteType) && Intrinsics.areEqual(this.siteName, kCJSApiSiteSupportSiteItem.siteName);
    }

    public static /* synthetic */ KCJSApiSiteSupportSiteItem copy$default(KCJSApiSiteSupportSiteItem kCJSApiSiteSupportSiteItem, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = kCJSApiSiteSupportSiteItem.siteType;
        }
        if ((i11 & 2) != 0) {
            str2 = kCJSApiSiteSupportSiteItem.siteName;
        }
        return kCJSApiSiteSupportSiteItem.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSiteName() {
        return this.siteName;
    }

    @NotNull
    public final KCJSApiSiteSupportSiteItem copy(@Nullable String siteType, @Nullable String siteName) {
        return new KCJSApiSiteSupportSiteItem(siteType, siteName);
    }

    @Nullable
    public final String getSiteName() {
        return this.siteName;
    }

    @Nullable
    public final String getSiteType() {
        return this.siteType;
    }

    public int hashCode() {
        String str = this.siteType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.siteName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KCJSApiSiteSupportSiteItem(siteType=" + this.siteType + ", siteName=" + this.siteName + ')';
    }

    public KCJSApiSiteSupportSiteItem(@Nullable String str, @Nullable String str2) {
        this.siteType = str;
        this.siteName = str2;
    }
}
