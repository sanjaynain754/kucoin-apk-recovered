package my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: my.b, reason: from toString */
/* JADX INFO: compiled from: NativeEventHubCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, m90084d2 = {"Lcom/kubi/sdk/eventhub/EventHubPublishResult;", "", "nativeDelivered", "", "deliveredCount", "", "skipped", "", "Lcom/kubi/sdk/eventhub/EventHubSkippedTarget;", "traceId", "", "<init>", "(ZILjava/util/List;Ljava/lang/String;)V", "getNativeDelivered", "()Z", "getDeliveredCount", "()I", "getSkipped", "()Ljava/util/List;", "getTraceId", "()Ljava/lang/String;", "toMap", "", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeEventHubCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeEventHubCenter.kt\ncom/kubi/sdk/eventhub/EventHubPublishResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,426:1\n1563#2:427\n1634#2,3:428\n*S KotlinDebug\n*F\n+ 1 NativeEventHubCenter.kt\ncom/kubi/sdk/eventhub/EventHubPublishResult\n*L\n100#1:427\n100#1:428,3\n*E\n"})
public final /* data */ class EventHubPublishResult {

    /* JADX INFO: renamed from: a, reason: from toString */
    public final boolean nativeDelivered;

    /* JADX INFO: renamed from: b, reason: from toString */
    public final int deliveredCount;

    /* JADX INFO: renamed from: c, reason: from toString */
    @NotNull
    public final List<EventHubSkippedTarget> skipped;

    /* JADX INFO: renamed from: d, reason: from toString */
    @NotNull
    public final String traceId;

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventHubPublishResult)) {
            return false;
        }
        EventHubPublishResult eventHubPublishResult = (EventHubPublishResult) other;
        return this.nativeDelivered == eventHubPublishResult.nativeDelivered && this.deliveredCount == eventHubPublishResult.deliveredCount && Intrinsics.areEqual(this.skipped, eventHubPublishResult.skipped) && Intrinsics.areEqual(this.traceId, eventHubPublishResult.traceId);
    }

    public EventHubPublishResult(boolean z11, int i11, @NotNull List<EventHubSkippedTarget> skipped, @NotNull String traceId) {
        Intrinsics.checkNotNullParameter(skipped, "skipped");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        this.nativeDelivered = z11;
        this.deliveredCount = i11;
        this.skipped = skipped;
        this.traceId = traceId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDeliveredCount() {
        return this.deliveredCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNativeDelivered() {
        return this.nativeDelivered;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<EventHubSkippedTarget> m93449c() {
        return this.skipped;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m93450d() {
        Pair pairM90091to = TuplesKt.m90091to("nativeDelivered", Boolean.valueOf(this.nativeDelivered));
        Pair pairM90091to2 = TuplesKt.m90091to("deliveredCount", Integer.valueOf(this.deliveredCount));
        List<EventHubSkippedTarget> list = this.skipped;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventHubSkippedTarget) it.next()).m93453c());
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("skipped", arrayList), TuplesKt.m90091to("traceId", this.traceId));
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.nativeDelivered) * 31) + Integer.hashCode(this.deliveredCount)) * 31) + this.skipped.hashCode()) * 31) + this.traceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "EventHubPublishResult(nativeDelivered=" + this.nativeDelivered + ", deliveredCount=" + this.deliveredCount + ", skipped=" + this.skipped + ", traceId=" + this.traceId + ')';
    }
}
