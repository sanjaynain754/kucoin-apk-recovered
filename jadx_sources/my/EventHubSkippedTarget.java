package my;

import com.kubi.sdk.eventhub.EventHubSkipReason;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: my.c, reason: from toString */
/* JADX INFO: compiled from: NativeEventHubCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/EventHubSkippedTarget;", "", "containerId", "", "reason", "Lcom/kubi/sdk/eventhub/EventHubSkipReason;", "<init>", "(Ljava/lang/String;Lcom/kubi/sdk/eventhub/EventHubSkipReason;)V", "getContainerId", "()Ljava/lang/String;", "getReason", "()Lcom/kubi/sdk/eventhub/EventHubSkipReason;", "toMap", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EventHubSkippedTarget {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String containerId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final EventHubSkipReason reason;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventHubSkippedTarget)) {
            return false;
        }
        EventHubSkippedTarget eventHubSkippedTarget = (EventHubSkippedTarget) other;
        return Intrinsics.areEqual(this.containerId, eventHubSkippedTarget.containerId) && this.reason == eventHubSkippedTarget.reason;
    }

    public EventHubSkippedTarget(@NotNull String containerId, @NotNull EventHubSkipReason reason) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.containerId = containerId;
        this.reason = reason;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EventHubSkipReason getReason() {
        return this.reason;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Map<String, Object> m93453c() {
        return MapsKt.mapOf(TuplesKt.m90091to("containerId", this.containerId), TuplesKt.m90091to("reason", this.reason.getValue()));
    }

    public int hashCode() {
        return (this.containerId.hashCode() * 31) + this.reason.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventHubSkippedTarget(containerId=" + this.containerId + ", reason=" + this.reason + ')';
    }
}
