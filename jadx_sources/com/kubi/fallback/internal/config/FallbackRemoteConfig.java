package com.kubi.fallback.internal.config;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FallbackRemoteConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Keep
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/fallback/internal/config/FallbackRemoteConfig;", "", "enabled", "", "dynamicRoutes", "", "Lcom/kubi/fallback/internal/config/FallbackData;", "errorCodes", "globalFallback", "<init>", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/kubi/fallback/internal/config/FallbackData;)V", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDynamicRoutes", "()Ljava/util/List;", "getErrorCodes", "getGlobalFallback", "()Lcom/kubi/fallback/internal/config/FallbackData;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Lcom/kubi/fallback/internal/config/FallbackData;)Lcom/kubi/fallback/internal/config/FallbackRemoteConfig;", "equals", "other", "hashCode", "", "toString", "", "LFallback_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class FallbackRemoteConfig {

    @SerializedName("dynamicRoutes")
    @Nullable
    private final List<FallbackData> dynamicRoutes;

    @SerializedName("enabled")
    @Nullable
    private final Boolean enabled;

    @SerializedName("errorCodes")
    @Nullable
    private final List<FallbackData> errorCodes;

    @SerializedName("globalFallback")
    @Nullable
    private final FallbackData globalFallback;

    public FallbackRemoteConfig() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FallbackRemoteConfig)) {
            return false;
        }
        FallbackRemoteConfig fallbackRemoteConfig = (FallbackRemoteConfig) other;
        return Intrinsics.areEqual(this.enabled, fallbackRemoteConfig.enabled) && Intrinsics.areEqual(this.dynamicRoutes, fallbackRemoteConfig.dynamicRoutes) && Intrinsics.areEqual(this.errorCodes, fallbackRemoteConfig.errorCodes) && Intrinsics.areEqual(this.globalFallback, fallbackRemoteConfig.globalFallback);
    }

    public FallbackRemoteConfig(@Nullable Boolean bool, @Nullable List<FallbackData> list, @Nullable List<FallbackData> list2, @Nullable FallbackData fallbackData) {
        this.enabled = bool;
        this.dynamicRoutes = list;
        this.errorCodes = list2;
        this.globalFallback = fallbackData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FallbackRemoteConfig copy$default(FallbackRemoteConfig fallbackRemoteConfig, Boolean bool, List list, List list2, FallbackData fallbackData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = fallbackRemoteConfig.enabled;
        }
        if ((i11 & 2) != 0) {
            list = fallbackRemoteConfig.dynamicRoutes;
        }
        if ((i11 & 4) != 0) {
            list2 = fallbackRemoteConfig.errorCodes;
        }
        if ((i11 & 8) != 0) {
            fallbackData = fallbackRemoteConfig.globalFallback;
        }
        return fallbackRemoteConfig.copy(bool, list, list2, fallbackData);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<FallbackData> component2() {
        return this.dynamicRoutes;
    }

    @Nullable
    public final List<FallbackData> component3() {
        return this.errorCodes;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FallbackData getGlobalFallback() {
        return this.globalFallback;
    }

    @NotNull
    public final FallbackRemoteConfig copy(@Nullable Boolean enabled, @Nullable List<FallbackData> dynamicRoutes, @Nullable List<FallbackData> errorCodes, @Nullable FallbackData globalFallback) {
        return new FallbackRemoteConfig(enabled, dynamicRoutes, errorCodes, globalFallback);
    }

    @Nullable
    public final List<FallbackData> getDynamicRoutes() {
        return this.dynamicRoutes;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final List<FallbackData> getErrorCodes() {
        return this.errorCodes;
    }

    @Nullable
    public final FallbackData getGlobalFallback() {
        return this.globalFallback;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        List<FallbackData> list = this.dynamicRoutes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<FallbackData> list2 = this.errorCodes;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        FallbackData fallbackData = this.globalFallback;
        return iHashCode3 + (fallbackData != null ? fallbackData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FallbackRemoteConfig(enabled=" + this.enabled + ", dynamicRoutes=" + this.dynamicRoutes + ", errorCodes=" + this.errorCodes + ", globalFallback=" + this.globalFallback + ')';
    }

    public /* synthetic */ FallbackRemoteConfig(Boolean bool, List list, List list2, FallbackData fallbackData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? Boolean.FALSE : bool, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : list2, (i11 & 8) != 0 ? null : fallbackData);
    }
}
