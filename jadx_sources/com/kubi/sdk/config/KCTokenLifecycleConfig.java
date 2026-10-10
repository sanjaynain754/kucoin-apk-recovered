package com.kubi.sdk.config;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KCTokenLifecycleConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006#"}, m90084d2 = {"Lcom/kubi/sdk/config/KCTokenLifecycleConfig;", "", "enabled", "", "softWindowMinutes", "", "hardWindowMinutes", "hardWindowEnabled", "softWindowEnabled", "preflightSkipExact", "", "", "<init>", "(ZJJZZLjava/util/List;)V", "getEnabled", "()Z", "getSoftWindowMinutes", "()J", "getHardWindowMinutes", "getHardWindowEnabled", "getSoftWindowEnabled", "getPreflightSkipExact", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class KCTokenLifecycleConfig {
    private final boolean enabled;
    private final boolean hardWindowEnabled;
    private final long hardWindowMinutes;

    @NotNull
    private final List<String> preflightSkipExact;
    private final boolean softWindowEnabled;
    private final long softWindowMinutes;

    public KCTokenLifecycleConfig() {
        this(false, 0L, 0L, false, false, null, 63, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KCTokenLifecycleConfig)) {
            return false;
        }
        KCTokenLifecycleConfig kCTokenLifecycleConfig = (KCTokenLifecycleConfig) other;
        return this.enabled == kCTokenLifecycleConfig.enabled && this.softWindowMinutes == kCTokenLifecycleConfig.softWindowMinutes && this.hardWindowMinutes == kCTokenLifecycleConfig.hardWindowMinutes && this.hardWindowEnabled == kCTokenLifecycleConfig.hardWindowEnabled && this.softWindowEnabled == kCTokenLifecycleConfig.softWindowEnabled && Intrinsics.areEqual(this.preflightSkipExact, kCTokenLifecycleConfig.preflightSkipExact);
    }

    public KCTokenLifecycleConfig(boolean z11, long j11, long j12, boolean z12, boolean z13, @NotNull List<String> preflightSkipExact) {
        Intrinsics.checkNotNullParameter(preflightSkipExact, "preflightSkipExact");
        this.enabled = z11;
        this.softWindowMinutes = j11;
        this.hardWindowMinutes = j12;
        this.hardWindowEnabled = z12;
        this.softWindowEnabled = z13;
        this.preflightSkipExact = preflightSkipExact;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KCTokenLifecycleConfig copy$default(KCTokenLifecycleConfig kCTokenLifecycleConfig, boolean z11, long j11, long j12, boolean z12, boolean z13, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = kCTokenLifecycleConfig.enabled;
        }
        if ((i11 & 2) != 0) {
            j11 = kCTokenLifecycleConfig.softWindowMinutes;
        }
        if ((i11 & 4) != 0) {
            j12 = kCTokenLifecycleConfig.hardWindowMinutes;
        }
        if ((i11 & 8) != 0) {
            z12 = kCTokenLifecycleConfig.hardWindowEnabled;
        }
        if ((i11 & 16) != 0) {
            z13 = kCTokenLifecycleConfig.softWindowEnabled;
        }
        if ((i11 & 32) != 0) {
            list = kCTokenLifecycleConfig.preflightSkipExact;
        }
        List list2 = list;
        boolean z14 = z12;
        long j13 = j12;
        return kCTokenLifecycleConfig.copy(z11, j11, j13, z14, z13, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getSoftWindowMinutes() {
        return this.softWindowMinutes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getHardWindowMinutes() {
        return this.hardWindowMinutes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHardWindowEnabled() {
        return this.hardWindowEnabled;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSoftWindowEnabled() {
        return this.softWindowEnabled;
    }

    @NotNull
    public final List<String> component6() {
        return this.preflightSkipExact;
    }

    @NotNull
    public final KCTokenLifecycleConfig copy(boolean enabled, long softWindowMinutes, long hardWindowMinutes, boolean hardWindowEnabled, boolean softWindowEnabled, @NotNull List<String> preflightSkipExact) {
        Intrinsics.checkNotNullParameter(preflightSkipExact, "preflightSkipExact");
        return new KCTokenLifecycleConfig(enabled, softWindowMinutes, hardWindowMinutes, hardWindowEnabled, softWindowEnabled, preflightSkipExact);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final boolean getHardWindowEnabled() {
        return this.hardWindowEnabled;
    }

    public final long getHardWindowMinutes() {
        return this.hardWindowMinutes;
    }

    @NotNull
    public final List<String> getPreflightSkipExact() {
        return this.preflightSkipExact;
    }

    public final boolean getSoftWindowEnabled() {
        return this.softWindowEnabled;
    }

    public final long getSoftWindowMinutes() {
        return this.softWindowMinutes;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.enabled) * 31) + Long.hashCode(this.softWindowMinutes)) * 31) + Long.hashCode(this.hardWindowMinutes)) * 31) + Boolean.hashCode(this.hardWindowEnabled)) * 31) + Boolean.hashCode(this.softWindowEnabled)) * 31) + this.preflightSkipExact.hashCode();
    }

    @NotNull
    public String toString() {
        return "KCTokenLifecycleConfig(enabled=" + this.enabled + ", softWindowMinutes=" + this.softWindowMinutes + ", hardWindowMinutes=" + this.hardWindowMinutes + ", hardWindowEnabled=" + this.hardWindowEnabled + ", softWindowEnabled=" + this.softWindowEnabled + ", preflightSkipExact=" + this.preflightSkipExact + ')';
    }

    public /* synthetic */ KCTokenLifecycleConfig(boolean z11, long j11, long j12, boolean z12, boolean z13, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? 10L : j11, (i11 & 4) != 0 ? 5L : j12, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? false : z13, (i11 & 32) != 0 ? CollectionsKt.listOf("/app/v1/kucoin-site-config") : list);
    }
}
