package com.kubi.host.core;

import androidx.annotation.Keep;
import com.kubi.p110rn.modules.BridgeParamKeyKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HostMonitor.kt */
/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/host/core/MonitorConfig;", "", "pingCount", "", BridgeParamKeyKt.RN_CONTAINER_UI_ENABLE, "", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getEnable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPingCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "equals", "other", "Companion", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class MonitorConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final Boolean enable;

    @Nullable
    private final Integer pingCount;

    /* JADX INFO: compiled from: HostMonitor.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m90084d2 = {"Lcom/kubi/host/core/MonitorConfig$Companion;", "", "()V", "default", "Lcom/kubi/host/core/MonitorConfig;", "Host_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        /* JADX INFO: renamed from: default, reason: not valid java name */
        public final MonitorConfig m103792default() {
            return new MonitorConfig(3, Boolean.TRUE);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(MonitorConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.kubi.host.core.MonitorConfig");
        MonitorConfig monitorConfig = (MonitorConfig) other;
        return Intrinsics.areEqual(this.pingCount, monitorConfig.pingCount) && Intrinsics.areEqual(this.enable, monitorConfig.enable);
    }

    @Nullable
    public final Boolean getEnable() {
        return this.enable;
    }

    @Nullable
    public final Integer getPingCount() {
        return this.pingCount;
    }

    public MonitorConfig(@Nullable Integer num, @Nullable Boolean bool) {
        this.pingCount = num;
        this.enable = bool;
    }
}
