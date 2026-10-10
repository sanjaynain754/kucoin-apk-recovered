package my;

import com.kubi.sdk.eventhub.EventHubDeliveryPolicy;
import com.kubi.sdk.eventhub.EventHubSkipReason;
import com.kubi.sdk.eventhub.EventHubTechStack;
import com.tencent.bugly.proguard.InterfaceC33826o0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Pair;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.collections.SetsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: my.p */
/* JADX INFO: compiled from: NativeEventHubCenter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002;<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0007J$\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0007J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00072\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ?\u0010 \u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072/\u0010!\u001a+\u0012!\u0012\u001f\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000f0\rJ\u0016\u0010%\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007JP\u0010'\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00072\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+2\b\b\u0002\u0010,\u001a\u00020-2\b\b\u0002\u0010.\u001a\u00020\u0007J>\u0010/\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00072\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00142\b\b\u0002\u0010.\u001a\u00020\u0007J\u0006\u00100\u001a\u00020\u000fJ&\u00101\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00072\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH\u0002J(\u00102\u001a\u0002032\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\\\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0006\u0010\u0019\u001a\u00020\u00072\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0007H\u0002J,\u00105\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u00072\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u0007072\f\u00108\u001a\b\u0012\u0004\u0012\u00020907H\u0002J\b\u0010:\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b`\tX\u0082\u0004¢\u0006\u0002\n\u0000RË\u0001\u0010\f\u001a¾\u0001\u0012\u0004\u0012\u00020\u0007\u0012T\u0012R\u0012\u0004\u0012\u00020\u0007\u0012\u001e\u0012\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u0006j(\u0012\u0004\u0012\u00020\u0007\u0012\u001e\u0012\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r`\t0\u0006j^\u0012\u0004\u0012\u00020\u0007\u0012T\u0012R\u0012\u0004\u0012\u00020\u0007\u0012\u001e\u0012\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r0\u0006j(\u0012\u0004\u0012\u00020\u0007\u0012\u001e\u0012\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e\u0012\u0004\u0012\u00020\u000f0\r`\t`\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m90084d2 = {"Lcom/kubi/sdk/eventhub/NativeEventHubCenter;", "", "<init>", "()V", "lock", "endpointMap", "Ljava/util/LinkedHashMap;", "", "Lcom/kubi/sdk/eventhub/NativeEventHubCenter$EndpointRef;", "Lkotlin/collections/LinkedHashMap;", "subscriptionMap", "Lcom/kubi/sdk/eventhub/EventHubSubscription;", "nativeObserverMap", "Lkotlin/Function1;", "", "", "register", "endpoint", "Lcom/kubi/sdk/eventhub/EventHubEndpoint;", "techStack", "Lcom/kubi/sdk/eventhub/EventHubTechStack;", "unregister", "containerId", "getContext", "subscribe", "topic", "unsubscribe", "", "subscriptionId", "publishToRN", "Lcom/kubi/sdk/eventhub/EventHubPublishResult;", "payload", "addNativeObserver", "observer", "Lkotlin/ParameterName;", "name", "envelope", "removeNativeObserver", InterfaceC33826o0.f71244p, "publish", "sourceContainerId", "sourceTechStack", "deliveryPolicy", "Lcom/kubi/sdk/eventhub/EventHubDeliveryPolicy;", "target", "Lcom/kubi/sdk/eventhub/EventHubTarget;", "traceId", "publishBroadcast", "clearForTest", "dispatchToNativeObservers", "collectTargets", "Lcom/kubi/sdk/eventhub/NativeEventHubCenter$RouteResult;", "buildEnvelope", "finish", "delivered", "", "skipped", "Lcom/kubi/sdk/eventhub/EventHubSkippedTarget;", "cleanInvalidEndpointsLocked", "EndpointRef", "RouteResult", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNativeEventHubCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeEventHubCenter.kt\ncom/kubi/sdk/eventhub/NativeEventHubCenter\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,426:1\n11228#2:427\n11563#2,3:428\n382#3,7:431\n1563#4:438\n1634#4,3:439\n1869#4:442\n1870#4:444\n1869#4,2:445\n774#4:447\n865#4,2:448\n1563#4:450\n1634#4,3:451\n1869#4,2:454\n1869#4,2:456\n1563#4:458\n1634#4,3:459\n1#5:443\n*S KotlinDebug\n*F\n+ 1 NativeEventHubCenter.kt\ncom/kubi/sdk/eventhub/NativeEventHubCenter\n*L\n166#1:427\n166#1:428,3\n210#1:431,7\n243#1:438\n243#1:439,3\n271#1:442\n271#1:444\n320#1:445,2\n341#1:447\n341#1:448,2\n342#1:450\n342#1:451,3\n351#1:454,2\n367#1:456,2\n394#1:458\n394#1:459,3\n*E\n"})
public final class C42677p {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42677p f94436a = new C42677p();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Object f94437b = new Object();

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final LinkedHashMap<String, a> f94438c = new LinkedHashMap<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final LinkedHashMap<String, EventHubSubscription> f94439d = new LinkedHashMap<>();

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final LinkedHashMap<String, LinkedHashMap<String, Function1<Map<String, ? extends Object>, Unit>>> f94440e = new LinkedHashMap<>();

    /* JADX INFO: renamed from: my.p$a */
    /* JADX INFO: compiled from: NativeEventHubCenter.kt */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u00030\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/NativeEventHubCenter$EndpointRef;", "", "endpoint", "Lcom/kubi/sdk/eventhub/EventHubEndpoint;", "techStack", "Lcom/kubi/sdk/eventhub/EventHubTechStack;", "<init>", "(Lcom/kubi/sdk/eventhub/EventHubEndpoint;Lcom/kubi/sdk/eventhub/EventHubTechStack;)V", "getTechStack", "()Lcom/kubi/sdk/eventhub/EventHubTechStack;", "ref", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getRef", "()Ljava/lang/ref/WeakReference;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final EventHubTechStack f94441a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final WeakReference<InterfaceC42662a> f94442b;

        public a(@NotNull InterfaceC42662a endpoint, @NotNull EventHubTechStack techStack) {
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            Intrinsics.checkNotNullParameter(techStack, "techStack");
            this.f94441a = techStack;
            this.f94442b = new WeakReference<>(endpoint);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final WeakReference<InterfaceC42662a> m93499a() {
            return this.f94442b;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final EventHubTechStack getF94441a() {
            return this.f94441a;
        }
    }

    /* JADX INFO: renamed from: my.p$b, reason: from toString */
    /* JADX INFO: compiled from: NativeEventHubCenter.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/NativeEventHubCenter$RouteResult;", "", "targets", "", "Lcom/kubi/sdk/eventhub/EventHubEndpoint;", "skipped", "Lcom/kubi/sdk/eventhub/EventHubSkippedTarget;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getTargets", "()Ljava/util/List;", "getSkipped", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* data */ class RouteResult {

        /* JADX INFO: renamed from: a, reason: from toString */
        @NotNull
        public final List<InterfaceC42662a> targets;

        /* JADX INFO: renamed from: b, reason: from toString */
        @NotNull
        public final List<EventHubSkippedTarget> skipped;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RouteResult)) {
                return false;
            }
            RouteResult routeResult = (RouteResult) other;
            return Intrinsics.areEqual(this.targets, routeResult.targets) && Intrinsics.areEqual(this.skipped, routeResult.skipped);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public RouteResult(@NotNull List<? extends InterfaceC42662a> targets, @NotNull List<EventHubSkippedTarget> skipped) {
            Intrinsics.checkNotNullParameter(targets, "targets");
            Intrinsics.checkNotNullParameter(skipped, "skipped");
            this.targets = targets;
            this.skipped = skipped;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final List<EventHubSkippedTarget> m93501a() {
            return this.skipped;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final List<InterfaceC42662a> m93502b() {
            return this.targets;
        }

        public int hashCode() {
            return (this.targets.hashCode() * 31) + this.skipped.hashCode();
        }

        @NotNull
        public String toString() {
            return "RouteResult(targets=" + this.targets + ", skipped=" + this.skipped + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public static /* synthetic */ EventHubPublishResult m93483l(C42677p c42677p, String str, Map map, String str2, EventHubTechStack eventHubTechStack, EventHubDeliveryPolicy eventHubDeliveryPolicy, EventHubTarget c42666e, String str3, int i11, Object obj) {
        EventHubTarget c42666e2;
        String str4;
        if ((i11 & 32) != 0) {
            c42666e2 = new EventHubTarget(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        } else {
            c42666e2 = c42666e;
        }
        if ((i11 & 64) != 0) {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            str4 = string;
        } else {
            str4 = str3;
        }
        return c42677p.m93492k(str, map, str2, eventHubTechStack, eventHubDeliveryPolicy, c42666e2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final EventHubPublishResult m93492k(@NotNull String topic, @NotNull Map<String, ? extends Object> payload, @NotNull String sourceContainerId, @NotNull EventHubTechStack sourceTechStack, @NotNull EventHubDeliveryPolicy deliveryPolicy, @NotNull EventHubTarget target, @NotNull String traceId) {
        Object objM103844constructorimpl;
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(sourceContainerId, "sourceContainerId");
        Intrinsics.checkNotNullParameter(sourceTechStack, "sourceTechStack");
        Intrinsics.checkNotNullParameter(deliveryPolicy, "deliveryPolicy");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(traceId, "traceId");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("publish begin traceId=");
        sb2.append(traceId);
        sb2.append(", topic=");
        sb2.append(topic);
        sb2.append(", policy=");
        sb2.append(deliveryPolicy.getValue());
        sb2.append(", source=");
        sb2.append(sourceTechStack.getValue());
        sb2.append(':');
        sb2.append(sourceContainerId);
        sb2.append(", targetContainerIds=");
        sb2.append(target.m93457b());
        sb2.append(", targetTechStacks=");
        Set<EventHubTechStack> setM93458c = target.m93458c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setM93458c, 10));
        Iterator<T> it = setM93458c.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventHubTechStack) it.next()).getValue());
        }
        sb2.append(arrayList);
        C44128b.m97266j("EventHub", sb2.toString());
        if (StringsKt.isBlank(topic)) {
            return m93490i(traceId, CollectionsKt.emptyList(), CollectionsKt.listOf(new EventHubSkippedTarget("", EventHubSkipReason.INVALID_TOPIC)));
        }
        if (deliveryPolicy == EventHubDeliveryPolicy.DIRECT && target.m93457b().isEmpty()) {
            return m93490i(traceId, CollectionsKt.emptyList(), CollectionsKt.listOf(new EventHubSkippedTarget("", EventHubSkipReason.INVALID_TARGET)));
        }
        Map<String, ? extends Object> mapM93486d = m93486d(topic, payload, sourceContainerId, sourceTechStack, deliveryPolicy, target, traceId);
        m93489h(topic, mapM93486d);
        RouteResult routeResultM93488g = m93488g(topic, sourceContainerId, deliveryPolicy, target);
        ArrayList arrayList2 = new ArrayList();
        List<EventHubSkippedTarget> mutableList = CollectionsKt.toMutableList((Collection) routeResultM93488g.m93501a());
        for (InterfaceC42662a interfaceC42662a : routeResultM93488g.m93502b()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.valueOf(interfaceC42662a.mo56093a(mapM93486d)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                objM103844constructorimpl = bool;
            }
            if (((Boolean) objM103844constructorimpl).booleanValue()) {
                arrayList2.add(interfaceC42662a.getF46694a());
                C44128b.m97266j("EventHub", "native route deliver traceId=" + traceId + ", containerId=" + interfaceC42662a.getF46694a());
            } else {
                mutableList.add(new EventHubSkippedTarget(interfaceC42662a.getF46694a(), EventHubSkipReason.SEND_FAILED));
                C44128b.m97266j("EventHub", "native route skip traceId=" + traceId + ", containerId=" + interfaceC42662a.getF46694a() + ", reason=sendFailed");
            }
        }
        return m93490i(traceId, arrayList2, mutableList);
    }

    /* JADX INFO: renamed from: my.p$c */
    /* JADX INFO: compiled from: NativeEventHubCenter.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventHubDeliveryPolicy.values().length];
            try {
                iArr[EventHubDeliveryPolicy.BROADCAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventHubDeliveryPolicy.DIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m93482f(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((a) it.getValue()).m93499a().get() == null;
    }

    /* JADX INFO: renamed from: r */
    public static final boolean m93484r(String str, Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Intrinsics.areEqual(((EventHubSubscription) it.getValue()).getContainerId(), str);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m93485c(@NotNull String topic, @NotNull Function1<? super Map<String, ? extends Object>, Unit> observer) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (StringsKt.isBlank(topic)) {
            return "";
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        synchronized (f94437b) {
            try {
                LinkedHashMap<String, LinkedHashMap<String, Function1<Map<String, ? extends Object>, Unit>>> linkedHashMap = f94440e;
                LinkedHashMap<String, Function1<Map<String, ? extends Object>, Unit>> linkedHashMap2 = linkedHashMap.get(topic);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap<>();
                    linkedHashMap.put(topic, linkedHashMap2);
                }
                linkedHashMap2.put(string, observer);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C44128b.m97266j("EventHub", "addNativeObserver topic=" + topic + ", token=" + string);
        return string;
    }

    /* JADX INFO: renamed from: e */
    public final void m93487e() {
        Set<Map.Entry<String, a>> setEntrySet = f94438c.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        CollectionsKt.removeAll(setEntrySet, new Function1() { // from class: my.n
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(C42677p.m93482f((Map.Entry) obj));
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final RouteResult m93488g(String str, String str2, EventHubDeliveryPolicy eventHubDeliveryPolicy, EventHubTarget c42666e) {
        Set<String> setMinus;
        RouteResult routeResult;
        WeakReference<InterfaceC42662a> weakReferenceM93499a;
        synchronized (f94437b) {
            try {
                f94436a.m93487e();
                Collection<EventHubSubscription> collectionValues = f94439d.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionValues) {
                    if (Intrinsics.areEqual(((EventHubSubscription) obj).getTopic(), str)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((EventHubSubscription) it.next()).getContainerId());
                }
                Set set = CollectionsKt.toSet(arrayList2);
                int i11 = c.$EnumSwitchMapping$0[eventHubDeliveryPolicy.ordinal()];
                if (i11 == 1) {
                    setMinus = SetsKt.minus((Set<? extends String>) set, str2);
                } else {
                    if (i11 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    setMinus = CollectionsKt.toSet(c42666e.m93457b());
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList<EventHubSkippedTarget> arrayList4 = new ArrayList();
                for (String str3 : setMinus) {
                    a aVar = f94438c.get(str3);
                    InterfaceC42662a interfaceC42662a = (aVar == null || (weakReferenceM93499a = aVar.m93499a()) == null) ? null : weakReferenceM93499a.get();
                    EventHubTechStack f94441a = aVar != null ? aVar.getF94441a() : null;
                    if (interfaceC42662a == null) {
                        arrayList4.add(new EventHubSkippedTarget(str3, EventHubSkipReason.NOT_FOUND));
                    } else if (!set.contains(str3)) {
                        arrayList4.add(new EventHubSkippedTarget(str3, EventHubSkipReason.NOT_SUBSCRIBED));
                    } else if (f94441a == null) {
                        arrayList4.add(new EventHubSkippedTarget(str3, EventHubSkipReason.NOT_FOUND));
                    } else if (c42666e.m93456a(f94441a)) {
                        arrayList3.add(interfaceC42662a);
                    } else {
                        arrayList4.add(new EventHubSkippedTarget(str3, EventHubSkipReason.TECH_STACK_FILTERED));
                        C44128b.m97266j("EventHub", "native route skip containerId=" + str3 + ", reason=techStackFiltered, techStack=" + f94441a.getValue());
                    }
                }
                for (EventHubSkippedTarget c42664c : arrayList4) {
                    C44128b.m97266j("EventHub", "native route skip containerId=" + c42664c.getContainerId() + ", reason=" + c42664c.getReason().getValue());
                }
                routeResult = new RouteResult(arrayList3, arrayList4);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return routeResult;
    }

    /* JADX INFO: renamed from: h */
    public final void m93489h(String str, Map<String, ? extends Object> map) {
        List<Function1> list;
        Object objM103844constructorimpl;
        Collection<Function1<Map<String, ? extends Object>, Unit>> collectionValues;
        synchronized (f94437b) {
            LinkedHashMap<String, Function1<Map<String, ? extends Object>, Unit>> linkedHashMap = f94440e.get(str);
            list = (linkedHashMap == null || (collectionValues = linkedHashMap.values()) == null) ? null : CollectionsKt.toList(collectionValues);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        for (Function1 function1 : list) {
            try {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(map);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97266j("EventHub", "nativeObserver error topic=" + str + ", msg=" + thM103847exceptionOrNullimpl.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final EventHubPublishResult m93490i(String str, List<String> list, List<EventHubSkippedTarget> list2) {
        EventHubPublishResult c42663b = new EventHubPublishResult(!list.isEmpty(), list.size(), list2, str);
        C44128b.m97266j("EventHub", "publish end traceId=" + str + ", delivered=" + c42663b.getDeliveredCount() + ", skipped=" + c42663b.m93449c().size());
        return c42663b;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final Map<String, Object> m93491j(@NotNull String containerId, @NotNull EventHubTechStack techStack) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(techStack, "techStack");
        Pair pairM90091to = TuplesKt.m90091to("containerId", containerId);
        Pair pairM90091to2 = TuplesKt.m90091to("techStack", techStack.getValue());
        EventHubDeliveryPolicy[] eventHubDeliveryPolicyArrValues = EventHubDeliveryPolicy.values();
        ArrayList arrayList = new ArrayList(eventHubDeliveryPolicyArrValues.length);
        for (EventHubDeliveryPolicy eventHubDeliveryPolicy : eventHubDeliveryPolicyArrValues) {
            arrayList.add(eventHubDeliveryPolicy.getValue());
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, TuplesKt.m90091to("supportedDeliveryPolicies", arrayList));
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final EventHubPublishResult m93493m(@NotNull String topic, @NotNull Map<String, ? extends Object> payload) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return m93483l(this, topic, payload, "", EventHubTechStack.RN, EventHubDeliveryPolicy.BROADCAST, null, null, 96, null);
    }

    /* JADX INFO: renamed from: n */
    public final void m93494n(@NotNull InterfaceC42662a endpoint, @NotNull EventHubTechStack techStack) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        Intrinsics.checkNotNullParameter(techStack, "techStack");
        synchronized (f94437b) {
            f94438c.put(endpoint.getF46694a(), new a(endpoint, techStack));
            Unit unit = Unit.INSTANCE;
        }
        C44128b.m97266j("EventHub", "register containerId=" + endpoint.getF46694a() + ", techStack=" + techStack.getValue());
    }

    /* JADX INFO: renamed from: o */
    public final void m93495o(@NotNull String topic, @NotNull String token) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(token, "token");
        synchronized (f94437b) {
            try {
                LinkedHashMap<String, LinkedHashMap<String, Function1<Map<String, ? extends Object>, Unit>>> linkedHashMap = f94440e;
                LinkedHashMap<String, Function1<Map<String, ? extends Object>, Unit>> linkedHashMap2 = linkedHashMap.get(topic);
                if (linkedHashMap2 != null) {
                    linkedHashMap2.remove(token);
                }
                LinkedHashMap<String, Function1<Map<String, ? extends Object>, Unit>> linkedHashMap3 = linkedHashMap.get(topic);
                if (linkedHashMap3 != null && linkedHashMap3.isEmpty()) {
                    linkedHashMap.remove(topic);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final String m93496p(@NotNull String containerId, @NotNull String topic) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(topic, "topic");
        if (StringsKt.isBlank(topic)) {
            C44128b.m97266j("EventHub", "subscribe skipped: invalidTopic containerId=" + containerId);
            return "";
        }
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        synchronized (f94437b) {
            f94439d.put(string, new EventHubSubscription(string, topic, containerId, 0L, 8, null));
            Unit unit = Unit.INSTANCE;
        }
        C44128b.m97266j("EventHub", "subscribe containerId=" + containerId + ", topic=" + topic + ", subscriptionId=" + string);
        return string;
    }

    /* JADX INFO: renamed from: q */
    public final void m93497q(@NotNull final String containerId) {
        int size;
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        synchronized (f94437b) {
            f94438c.remove(containerId);
            LinkedHashMap<String, EventHubSubscription> linkedHashMap = f94439d;
            int size2 = linkedHashMap.size();
            Set<Map.Entry<String, EventHubSubscription>> setEntrySet = linkedHashMap.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            CollectionsKt.removeAll(setEntrySet, new Function1() { // from class: my.o
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(C42677p.m93484r(containerId, (Map.Entry) obj));
                }
            });
            size = size2 - linkedHashMap.size();
            Unit unit = Unit.INSTANCE;
        }
        C44128b.m97266j("EventHub", "unregister containerId=" + containerId + ", subscriptionsRemoved=" + size);
    }

    /* JADX INFO: renamed from: s */
    public final boolean m93498s(@NotNull String subscriptionId) {
        EventHubSubscription eventHubSubscriptionRemove;
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        synchronized (f94437b) {
            eventHubSubscriptionRemove = f94439d.remove(subscriptionId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("unsubscribe subscriptionId=");
        sb2.append(subscriptionId);
        sb2.append(", removed=");
        sb2.append(eventHubSubscriptionRemove != null);
        C44128b.m97266j("EventHub", sb2.toString());
        return eventHubSubscriptionRemove != null;
    }

    /* JADX INFO: renamed from: d */
    public final Map<String, Object> m93486d(String str, Map<String, ? extends Object> map, String str2, EventHubTechStack eventHubTechStack, EventHubDeliveryPolicy eventHubDeliveryPolicy, EventHubTarget c42666e, String str3) {
        Pair pairM90091to = TuplesKt.m90091to("eventId", UUID.randomUUID().toString());
        Pair pairM90091to2 = TuplesKt.m90091to("topic", str);
        Pair pairM90091to3 = TuplesKt.m90091to("payload", map);
        Pair pairM90091to4 = TuplesKt.m90091to("source", MapsKt.mapOf(TuplesKt.m90091to("containerId", str2), TuplesKt.m90091to("techStack", eventHubTechStack.getValue())));
        Pair pairM90091to5 = TuplesKt.m90091to("containerIds", c42666e.m93457b());
        Set<EventHubTechStack> setM93458c = c42666e.m93458c();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setM93458c, 10));
        Iterator<T> it = setM93458c.iterator();
        while (it.hasNext()) {
            arrayList.add(((EventHubTechStack) it.next()).getValue());
        }
        return MapsKt.mapOf(pairM90091to, pairM90091to2, pairM90091to3, pairM90091to4, TuplesKt.m90091to("target", MapsKt.mapOf(pairM90091to5, TuplesKt.m90091to("techStacks", CollectionsKt.sorted(arrayList)))), TuplesKt.m90091to("timestamp", Double.valueOf(System.currentTimeMillis() / 1000.0d)), TuplesKt.m90091to("deliveryPolicy", eventHubDeliveryPolicy.getValue()), TuplesKt.m90091to("traceId", str3));
    }
}
