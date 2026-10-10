package com.kubi.p110rn.core.turbo;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.kubi.p110rn.modules.eventhub.RNEventHubRegistry;
import com.kubi.sdk.eventhub.EventHubDeliveryPolicy;
import com.kubi.sdk.eventhub.EventHubTechStack;
import com.kubi.sdk.util.C24267r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import my.C42677p;
import my.EventHubPublishResult;
import my.EventHubTarget;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import ro.C44128b;

/* JADX INFO: compiled from: NativeKRNEventHubBridge.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J0\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\fH\u0002J\u001a\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018*\u00020\u0013H\u0002J\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0013H\u0002J$\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002J\f\u0010 \u001a\u00020\f*\u00020\u001bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridge;", "Lcom/kubi/rn/core/turbo/NativeKRNEventHubBridgeSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getContext", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "subscribe", "topic", "", "sticky", "", "unsubscribe", "subscriptionId", "publish", "payload", "Lcom/facebook/react/bridge/ReadableMap;", "target", "deliveryPolicy", "currentContainerId", "toEventHubMap", "", "", "toEventHubTarget", "Lcom/kubi/sdk/eventhub/EventHubTarget;", "readTechStacks", "", "Lcom/kubi/sdk/eventhub/EventHubTechStack;", "targetMap", "toLogString", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeKRNEventHubBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeKRNEventHubBridge.kt\ncom/kubi/rn/core/turbo/NativeKRNEventHubBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1193#2,2:103\n1267#2,4:105\n1617#2,9:109\n1869#2:118\n1870#2:120\n1626#2:121\n1563#2:123\n1634#2,3:124\n1#3:119\n1#3:122\n*S KotlinDebug\n*F\n+ 1 NativeKRNEventHubBridge.kt\ncom/kubi/rn/core/turbo/NativeKRNEventHubBridge\n*L\n80#1:103,2\n80#1:105,4\n92#1:109,9\n92#1:118\n92#1:120\n92#1:121\n99#1:123\n99#1:124,3\n92#1:119\n*E\n"})
public final class NativeKRNEventHubBridge extends NativeKRNEventHubBridgeSpec {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeKRNEventHubBridge(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    private final String currentContainerId() {
        RNEventHubRegistry rNEventHubRegistry = RNEventHubRegistry.INSTANCE;
        ReactApplicationContext reactApplicationContext = this.reactContext;
        String strFindContainerId = rNEventHubRegistry.findContainerId(reactApplicationContext, reactApplicationContext.getCurrentActivity());
        if (strFindContainerId != null) {
            return strFindContainerId;
        }
        String str = "rn-" + System.identityHashCode(this.reactContext);
        C44128b.m97266j("EventHub", "rn containerId fallback=" + str);
        return str;
    }

    private final Set<EventHubTechStack> readTechStacks(Map<String, ? extends Object> targetMap) {
        Set<EventHubTechStack> of2;
        Object obj = targetMap.get("techStacks");
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            EventHubTechStack.Companion companion = EventHubTechStack.INSTANCE;
            Object obj2 = targetMap.get("techStack");
            EventHubTechStack eventHubTechStackFrom = companion.from(obj2 instanceof String ? (String) obj2 : null);
            return (eventHubTechStackFrom == null || (of2 = SetsKt.setOf(eventHubTechStackFrom)) == null) ? SetsKt.emptySet() : of2;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            EventHubTechStack eventHubTechStackFrom2 = EventHubTechStack.INSTANCE.from(next != null ? next.toString() : null);
            if (eventHubTechStackFrom2 != null) {
                arrayList.add(eventHubTechStackFrom2);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    private final String toLogString(EventHubTarget eventHubTarget) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("techStacks=");
        Set<EventHubTechStack> setM93458c = eventHubTarget.m93458c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setM93458c, 10));
        Iterator<T> it = setM93458c.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventHubTechStack) it.next()).getValue());
        }
        sb2.append(arrayList);
        return sb2.toString();
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void getContext(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        String strCurrentContainerId = currentContainerId();
        C44128b.m97266j("EventHub", "rn getContext containerId=" + strCurrentContainerId);
        promise.resolve(C24267r0.m58522f(C42677p.f94436a.m93491j(strCurrentContainerId, EventHubTechStack.RN)));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void publish(@NotNull String topic, @NotNull ReadableMap payload, @NotNull ReadableMap target, @NotNull String deliveryPolicy, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(deliveryPolicy, "deliveryPolicy");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String strCurrentContainerId = currentContainerId();
        Map<String, ? extends Object> eventHubMap = toEventHubMap(payload);
        EventHubDeliveryPolicy eventHubDeliveryPolicyFrom = EventHubDeliveryPolicy.INSTANCE.from(deliveryPolicy);
        if (eventHubDeliveryPolicyFrom == null) {
            eventHubDeliveryPolicyFrom = EventHubDeliveryPolicy.BROADCAST;
        }
        EventHubDeliveryPolicy eventHubDeliveryPolicy = eventHubDeliveryPolicyFrom;
        EventHubTarget eventHubTarget = toEventHubTarget(target);
        C42677p c42677p = C42677p.f94436a;
        EventHubTechStack eventHubTechStack = EventHubTechStack.RN;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        EventHubPublishResult eventHubPublishResultM93492k = c42677p.m93492k(topic, eventHubMap, strCurrentContainerId, eventHubTechStack, eventHubDeliveryPolicy, eventHubTarget, string);
        C44128b.m97266j("EventHub", "rn publish containerId=" + strCurrentContainerId + ", topic=" + topic + ", policy=" + eventHubDeliveryPolicy.getValue() + ", target=" + toLogString(eventHubTarget) + ", success=" + eventHubPublishResultM93492k.getNativeDelivered());
        promise.resolve(C24267r0.m58522f(MapsKt.mapOf(TuplesKt.m90091to("success", Boolean.valueOf(eventHubPublishResultM93492k.getNativeDelivered())))));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void subscribe(@NotNull String topic, boolean sticky, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String strCurrentContainerId = currentContainerId();
        String strM93496p = C42677p.f94436a.m93496p(strCurrentContainerId, topic);
        C44128b.m97266j("EventHub", "rn subscribe containerId=" + strCurrentContainerId + ", topic=" + topic + ", subscriptionId=" + strM93496p);
        promise.resolve(C24267r0.m58522f(MapsKt.mapOf(TuplesKt.m90091to("subscriptionId", strM93496p))));
    }

    @Override // com.kubi.p110rn.core.turbo.NativeKRNEventHubBridgeSpec
    public void unsubscribe(@NotNull String subscriptionId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        boolean zM93498s = C42677p.f94436a.m93498s(subscriptionId);
        C44128b.m97266j("EventHub", "rn unsubscribe subscriptionId=" + subscriptionId + ", removed=" + zM93498s);
        promise.resolve(C24267r0.m58522f(MapsKt.mapOf(TuplesKt.m90091to("success", Boolean.valueOf(zM93498s)))));
    }

    private final Map<String, Object> toEventHubMap(ReadableMap readableMap) {
        Set<Map.Entry<String, Object>> setEntrySet = readableMap.toHashMap().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM90091to = TuplesKt.m90091to(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }

    private final EventHubTarget toEventHubTarget(ReadableMap readableMap) {
        return new EventHubTarget(null, readTechStacks(readableMap.toHashMap()), 1, null);
    }
}
