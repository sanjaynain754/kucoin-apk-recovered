package com.kubi.sdk.site.info.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SiteInfoEntity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/site/info/data/SiteInfoEntity;", "", "forceRedirect", "", "siteType", "", "<init>", "(ZLjava/lang/String;)V", "getForceRedirect", "()Z", "getSiteType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class SiteInfoEntity {
    private final boolean forceRedirect;

    @NotNull
    private final String siteType;

    /* JADX WARN: Multi-variable type inference failed */
    public SiteInfoEntity() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SiteInfoEntity)) {
            return false;
        }
        SiteInfoEntity siteInfoEntity = (SiteInfoEntity) other;
        return this.forceRedirect == siteInfoEntity.forceRedirect && Intrinsics.areEqual(this.siteType, siteInfoEntity.siteType);
    }

    public SiteInfoEntity(boolean z11, @NotNull String siteType) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        this.forceRedirect = z11;
        this.siteType = siteType;
    }

    public static /* synthetic */ SiteInfoEntity copy$default(SiteInfoEntity siteInfoEntity, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = siteInfoEntity.forceRedirect;
        }
        if ((i11 & 2) != 0) {
            str = siteInfoEntity.siteType;
        }
        return siteInfoEntity.copy(z11, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getForceRedirect() {
        return this.forceRedirect;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSiteType() {
        return this.siteType;
    }

    @NotNull
    public final SiteInfoEntity copy(boolean forceRedirect, @NotNull String siteType) {
        Intrinsics.checkNotNullParameter(siteType, "siteType");
        return new SiteInfoEntity(forceRedirect, siteType);
    }

    public final boolean getForceRedirect() {
        return this.forceRedirect;
    }

    @NotNull
    public final String getSiteType() {
        return this.siteType;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.forceRedirect) * 31) + this.siteType.hashCode();
    }

    @NotNull
    public String toString() {
        return "SiteInfoEntity(forceRedirect=" + this.forceRedirect + ", siteType=" + this.siteType + ')';
    }

    public /* synthetic */ SiteInfoEntity(boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? "" : str);
    }
}
