package my;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: my.d, reason: from toString */
/* JADX INFO: compiled from: NativeEventHubCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/EventHubSubscription;", "", "subscriptionId", "", "topic", "containerId", "createdAt", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getSubscriptionId", "()Ljava/lang/String;", "getTopic", "getContainerId", "getCreatedAt", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final /* data */ class EventHubSubscription {

    /* JADX INFO: renamed from: a, reason: from toString */
    @NotNull
    public final String subscriptionId;

    /* JADX INFO: renamed from: b, reason: from toString */
    @NotNull
    public final String topic;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final String containerId;

    /* JADX INFO: renamed from: d, reason: from toString */
    public final long createdAt;

    public EventHubSubscription(@NotNull String subscriptionId, @NotNull String topic, @NotNull String containerId, long j11) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        this.subscriptionId = subscriptionId;
        this.topic = topic;
        this.containerId = containerId;
        this.createdAt = j11;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventHubSubscription)) {
            return false;
        }
        EventHubSubscription eventHubSubscription = (EventHubSubscription) other;
        return Intrinsics.areEqual(this.subscriptionId, eventHubSubscription.subscriptionId) && Intrinsics.areEqual(this.topic, eventHubSubscription.topic) && Intrinsics.areEqual(this.containerId, eventHubSubscription.containerId) && this.createdAt == eventHubSubscription.createdAt;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getContainerId() {
        return this.containerId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    public int hashCode() {
        return (((((this.subscriptionId.hashCode() * 31) + this.topic.hashCode()) * 31) + this.containerId.hashCode()) * 31) + Long.hashCode(this.createdAt);
    }

    @NotNull
    public String toString() {
        return "EventHubSubscription(subscriptionId=" + this.subscriptionId + ", topic=" + this.topic + ", containerId=" + this.containerId + ", createdAt=" + this.createdAt + ')';
    }

    public /* synthetic */ EventHubSubscription(String str, String str2, String str3, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? System.currentTimeMillis() : j11);
    }
}
