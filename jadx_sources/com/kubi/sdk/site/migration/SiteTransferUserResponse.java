package com.kubi.sdk.site.migration;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.MapsKt;

/* JADX INFO: compiled from: SiteMigrationAPI.kt */
/* JADX INFO: loaded from: classes45.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/sdk/site/migration/SiteTransferUserResponse;", "", "<init>", "()V", "transferSwitchMap", "", "", "", "getTransferSwitchMap", "()Ljava/util/Map;", "originalSiteType", "getOriginalSiteType", "()Ljava/lang/String;", "targetSiteType", "getTargetSiteType", "targetRegion", "getTargetRegion", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SiteTransferUserResponse {

    @Nullable
    private final String originalSiteType;

    @Nullable
    private final String targetRegion;

    @Nullable
    private final String targetSiteType;

    @NotNull
    private final Map<String, Boolean> transferSwitchMap = MapsKt.emptyMap();

    @Nullable
    public final String getOriginalSiteType() {
        return this.originalSiteType;
    }

    @Nullable
    public final String getTargetRegion() {
        return this.targetRegion;
    }

    @Nullable
    public final String getTargetSiteType() {
        return this.targetSiteType;
    }

    @NotNull
    public final Map<String, Boolean> getTransferSwitchMap() {
        return this.transferSwitchMap;
    }
}
