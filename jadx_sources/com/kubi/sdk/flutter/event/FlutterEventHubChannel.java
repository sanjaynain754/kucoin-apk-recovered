package com.kubi.sdk.flutter.event;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.appsflyer.AppsFlyerProperties;
import com.kubi.sdk.eventhub.EventHubDeliveryPolicy;
import com.kubi.sdk.eventhub.EventHubTechStack;
import com.kubi.sdk.flutter.delegate.IChannelRegister;
import com.kubi.sdk.flutter.event.FlutterEventHubChannel;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
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
import my.InterfaceC42662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: FlutterEventHubChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001(B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000fH\u0016J\u001e\u0010\u0015\u001a\u00020\u00162\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0016J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0019H\u0002J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$2\u000e\u0010&\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0018H\u0002J\"\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0018H\u0002R\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m90084d2 = {"Lcom/kubi/sdk/flutter/event/FlutterEventHubChannel;", "Lcom/kubi/sdk/flutter/delegate/IChannelRegister;", "Lcom/kubi/sdk/eventhub/EventHubEndpoint;", "<init>", "()V", "value", "", "containerId", "getContainerId", "()Ljava/lang/String;", AppsFlyerProperties.CHANNEL, "Lio/flutter/plugin/common/MethodChannel;", "mainHandler", "Landroid/os/Handler;", "registerWith", "", "context", "Landroid/content/Context;", "flutterEngine", "Lio/flutter/embedding/engine/FlutterEngine;", "unregister", "sendEventHubMessage", "", "envelope", "", "", "handleMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", DbParams.KEY_CHANNEL_RESULT, "Lio/flutter/plugin/common/MethodChannel$Result;", "readTopic", "readSubscriptionId", "parseTarget", "Lcom/kubi/sdk/eventhub/EventHubTarget;", "readTechStacks", "", "Lcom/kubi/sdk/eventhub/EventHubTechStack;", "targetMap", "toEventHubMap", "Companion", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFlutterEventHubChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlutterEventHubChannel.kt\ncom/kubi/sdk/flutter/event/FlutterEventHubChannel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1617#2,9:196\n1869#2:205\n1870#2:207\n1626#2:208\n1617#2,9:209\n1869#2:218\n1870#2:220\n1626#2:221\n1193#2,2:223\n1267#2,4:225\n1#3:206\n1#3:219\n1#3:222\n*S KotlinDebug\n*F\n+ 1 FlutterEventHubChannel.kt\ncom/kubi/sdk/flutter/event/FlutterEventHubChannel\n*L\n173#1:196,9\n173#1:205\n173#1:207\n173#1:208\n185#1:209,9\n185#1:218\n185#1:220\n185#1:221\n192#1:223,2\n192#1:225,4\n173#1:206\n185#1:219\n*E\n"})
public final class FlutterEventHubChannel implements IChannelRegister, InterfaceC42662a {

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final Companion f46693d = new Companion(null);

    /* JADX INFO: renamed from: b */
    @Nullable
    public MethodChannel f46695b;

    /* JADX INFO: renamed from: a */
    @NotNull
    public String f46694a = "";

    /* JADX INFO: renamed from: c */
    @NotNull
    public final Handler f46696c = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: FlutterEventHubChannel.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/sdk/flutter/event/FlutterEventHubChannel$Companion;", "", "<init>", "()V", "CHANNEL_NAME", "", "METHOD_GET_CONTEXT", "METHOD_SUBSCRIBE", "METHOD_UNSUBSCRIBE", "METHOD_PUBLISH", "LFlutter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x019a A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:3:0x0003, B:5:0x0009, B:9:0x0014, B:11:0x001c, B:62:0x019d, B:14:0x0048, B:17:0x0052, B:18:0x0081, B:21:0x008b, B:22:0x00c4, B:25:0x00ce, B:27:0x00d4, B:30:0x00da, B:31:0x00de, B:33:0x00e8, B:37:0x00f0, B:39:0x00fb, B:42:0x0101, B:47:0x010f, B:49:0x011b, B:51:0x011f, B:53:0x0125, B:54:0x0127, B:56:0x013c, B:59:0x0142, B:60:0x014f, B:46:0x010a, B:61:0x019a), top: B:69:0x0003 }] */
    /* JADX INFO: renamed from: e */
    public final void m56828e(MethodCall methodCall, MethodChannel.Result result) {
        Object objM103844constructorimpl;
        Map<String, ? extends Object> mapEmptyMap;
        try {
            Result.Companion companion = Result.INSTANCE;
            String str = methodCall.method;
            if (str != null) {
                switch (str) {
                    case "publish":
                        Object obj = methodCall.arguments;
                        Map mapEmptyMap2 = obj instanceof Map ? (Map) obj : null;
                        if (mapEmptyMap2 == null) {
                            mapEmptyMap2 = MapsKt.emptyMap();
                        }
                        Object obj2 = mapEmptyMap2.get("topic");
                        String str2 = obj2 instanceof String ? (String) obj2 : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = str2;
                        Object obj3 = mapEmptyMap2.get("payload");
                        Map<?, ?> map = obj3 instanceof Map ? (Map) obj3 : null;
                        if (map == null || (mapEmptyMap = m56833l(map)) == null) {
                            mapEmptyMap = MapsKt.emptyMap();
                        }
                        Map<String, ? extends Object> map2 = mapEmptyMap;
                        EventHubDeliveryPolicy.Companion companion2 = EventHubDeliveryPolicy.INSTANCE;
                        Object obj4 = mapEmptyMap2.get("deliveryPolicy");
                        EventHubDeliveryPolicy eventHubDeliveryPolicyFrom = companion2.from(obj4 instanceof String ? (String) obj4 : null);
                        if (eventHubDeliveryPolicyFrom == null) {
                            eventHubDeliveryPolicyFrom = EventHubDeliveryPolicy.BROADCAST;
                        }
                        EventHubDeliveryPolicy eventHubDeliveryPolicy = eventHubDeliveryPolicyFrom;
                        EventHubTarget eventHubTargetM56829f = m56829f(mapEmptyMap2.get("target"));
                        Object obj5 = mapEmptyMap2.get("traceId");
                        String string = obj5 instanceof String ? (String) obj5 : null;
                        if (string == null) {
                            string = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        }
                        EventHubPublishResult eventHubPublishResultM93492k = C42677p.f94436a.m93492k(str3, map2, getF46102a(), EventHubTechStack.FLUTTER, eventHubDeliveryPolicy, eventHubTargetM56829f, string);
                        C44128b.m97266j("EventHub", "flutter publish containerId=" + getF46102a() + ", topic=" + str3 + ", policy=" + eventHubDeliveryPolicy.getValue() + ", result=" + eventHubPublishResultM93492k.m93450d());
                        result.success(eventHubPublishResultM93492k.m93450d());
                        break;
                    case "subscribe":
                        String strM56832i = m56832i(methodCall);
                        String strM93496p = C42677p.f94436a.m93496p(getF46102a(), strM56832i);
                        C44128b.m97266j("EventHub", "flutter subscribe containerId=" + getF46102a() + ", topic=" + strM56832i + ", subscriptionId=" + strM93496p);
                        result.success(strM93496p);
                        break;
                    case "unsubscribe":
                        String strM56830g = m56830g(methodCall);
                        boolean zM93498s = C42677p.f94436a.m93498s(strM56830g);
                        C44128b.m97266j("EventHub", "flutter unsubscribe subscriptionId=" + strM56830g + ", removed=" + zM93498s);
                        result.success(Boolean.valueOf(zM93498s));
                        break;
                    case "getContext":
                        C44128b.m97266j("EventHub", "flutter getContext containerId=" + getF46102a());
                        result.success(C42677p.f94436a.m93491j(getF46102a(), EventHubTechStack.FLUTTER));
                        break;
                    default:
                        result.notImplemented();
                        break;
                }
            } else {
                result.notImplemented();
            }
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j("EventHub", "flutter method failed method=" + methodCall.method + ", error=" + thM103847exceptionOrNullimpl.getMessage());
            result.error("EVENT_HUB_ERROR", thM103847exceptionOrNullimpl.getMessage(), null);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m56826j(FlutterEventHubChannel flutterEventHubChannel, MethodCall call, MethodChannel.Result result) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(result, "result");
        flutterEventHubChannel.m56828e(call, result);
    }

    /* JADX INFO: renamed from: k */
    public static final void m56827k(FlutterEventHubChannel flutterEventHubChannel, MethodChannel methodChannel, Map map) {
        Object objM103844constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            methodChannel.invokeMethod("eventHubMessage", map);
            C44128b.m97266j("EventHub", "flutter send success containerId=" + flutterEventHubChannel.getF46102a() + ", topic=" + map.get("topic") + ", traceId=" + map.get("traceId"));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j("EventHub", "flutter send failed containerId=" + flutterEventHubChannel.getF46102a() + ", error=" + thM103847exceptionOrNullimpl.getMessage());
        }
    }

    @Override // my.InterfaceC42662a
    /* JADX INFO: renamed from: a */
    public boolean mo56093a(@NotNull final Map<String, ? extends Object> envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        final MethodChannel methodChannel = this.f46695b;
        if (methodChannel == null) {
            C44128b.m97266j("EventHub", "flutter send skip containerId=" + getF46102a() + ", reason=channelNull");
            return false;
        }
        Runnable runnable = new Runnable() { // from class: qy.a
            @Override // java.lang.Runnable
            public final void run() {
                FlutterEventHubChannel.m56827k(this.f96975b, methodChannel, envelope);
            }
        };
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
            return true;
        }
        boolean zPost = this.f46696c.post(runnable);
        C44128b.m97266j("EventHub", "flutter send post containerId=" + getF46102a() + ", topic=" + envelope.get("topic") + ", traceId=" + envelope.get("traceId") + ", posted=" + zPost);
        return zPost;
    }

    @Override // my.InterfaceC42662a
    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public String getF46102a() {
        return this.f46694a;
    }

    /* JADX INFO: renamed from: f */
    public final EventHubTarget m56829f(Object obj) {
        List listEmptyList;
        Map<?, ?> map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return new EventHubTarget(null, null, 3, null);
        }
        Set<EventHubTechStack> setM56831h = m56831h(map);
        Object obj2 = map.get("containerIds");
        List list = obj2 instanceof List ? (List) obj2 : null;
        if (list != null) {
            listEmptyList = new ArrayList();
            for (Object obj3 : list) {
                String str = obj3 instanceof String ? (String) obj3 : null;
                if (str != null) {
                    listEmptyList.add(str);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new EventHubTarget(listEmptyList, setM56831h);
    }

    /* JADX INFO: renamed from: g */
    public final String m56830g(MethodCall methodCall) {
        Object obj = methodCall.arguments;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Map)) {
            return "";
        }
        Object obj2 = ((Map) obj).get("subscriptionId");
        String str = obj2 instanceof String ? (String) obj2 : null;
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: h */
    public final Set<EventHubTechStack> m56831h(Map<?, ?> map) {
        Set<EventHubTechStack> of2;
        Object obj = map.get("techStacks");
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            EventHubTechStack.Companion companion = EventHubTechStack.INSTANCE;
            Object obj2 = map.get("techStack");
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

    /* JADX INFO: renamed from: i */
    public final String m56832i(MethodCall methodCall) {
        Object obj = methodCall.arguments;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof Map)) {
            return "";
        }
        Object obj2 = ((Map) obj).get("topic");
        String str = obj2 instanceof String ? (String) obj2 : null;
        return str == null ? "" : str;
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void registerWith(@NotNull Context context, @NotNull FlutterEngine flutterEngine) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(flutterEngine, "flutterEngine");
        this.f46694a = "flutter-" + System.identityHashCode(flutterEngine);
        MethodChannel methodChannel = new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "kc.event_hub");
        methodChannel.setMethodCallHandler(new MethodChannel.MethodCallHandler() { // from class: qy.b
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                FlutterEventHubChannel.m56826j(this.f96978b, methodCall, result);
            }
        });
        this.f46695b = methodChannel;
        C42677p.f94436a.m93494n(this, EventHubTechStack.FLUTTER);
        C44128b.m97266j("EventHub", "flutter register containerId=" + getF46102a());
    }

    /* JADX INFO: renamed from: l */
    public final Map<String, Object> m56833l(Map<?, ?> map) {
        Set<Map.Entry<?, ?>> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM90091to = TuplesKt.m90091to(String.valueOf(entry.getKey()), entry.getValue());
            linkedHashMap.put(pairM90091to.getFirst(), pairM90091to.getSecond());
        }
        return linkedHashMap;
    }

    @Override // com.kubi.sdk.flutter.delegate.IChannelRegister
    public void unregister() {
        String f46694a = getF46102a();
        MethodChannel methodChannel = this.f46695b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f46695b = null;
        if (!StringsKt.isBlank(f46694a)) {
            C42677p.f94436a.m93497q(f46694a);
        }
        this.f46694a = "";
        C44128b.m97266j("EventHub", "flutter unregister containerId=" + f46694a);
    }
}
