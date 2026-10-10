package com.kubi.p110rn.modules.eventhub;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.kubi.p110rn.modules.eventhub.RNEventHubRegistry;
import com.kubi.sdk.eventhub.EventHubTechStack;
import com.kubi.sdk.util.C24267r0;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.ref.WeakReference;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import my.C42677p;
import my.InterfaceC42662a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RNEventHubRegistry.kt */
/* JADX INFO: loaded from: classes39.dex */
@Metadata(m90083d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\tJ\"\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J \u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J \u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001eH\u0002J\f\u0010\u001f\u001a\u00020\u0017*\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/rn/modules/eventhub/RNEventHubRegistry;", "", "<init>", "()V", "lock", "contextToContainerIds", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "endpoints", "Lcom/kubi/rn/modules/eventhub/RNEventHubRegistry$RNEventHubEndpoint;", "register", "", "containerId", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "unregister", "findContainerId", "activity", "Landroid/app/Activity;", "containsContainerId", "", "findVisibleContainerIdOnMain", "containerIds", "", "findVisibleContainerId", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "", "isVisibleInHierarchy", "RNEventHubEndpoint", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRNEventHubRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RNEventHubRegistry.kt\ncom/kubi/rn/modules/eventhub/RNEventHubRegistry\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,192:1\n72#2,2:193\n1#3:195\n*S KotlinDebug\n*F\n+ 1 RNEventHubRegistry.kt\ncom/kubi/rn/modules/eventhub/RNEventHubRegistry\n*L\n40#1:193,2\n40#1:195\n*E\n"})
public final class RNEventHubRegistry {

    @NotNull
    public static final RNEventHubRegistry INSTANCE = new RNEventHubRegistry();

    @NotNull
    private static final Object lock = new Object();

    @NotNull
    private static final ConcurrentHashMap<Integer, LinkedHashSet<String>> contextToContainerIds = new ConcurrentHashMap<>();

    @NotNull
    private static final ConcurrentHashMap<String, C23580a> endpoints = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.kubi.rn.modules.eventhub.RNEventHubRegistry$a */
    /* JADX INFO: compiled from: RNEventHubRegistry.kt */
    @Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u000e\u001a\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00050\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/rn/modules/eventhub/RNEventHubRegistry$RNEventHubEndpoint;", "Lcom/kubi/sdk/eventhub/EventHubEndpoint;", "containerId", "", "reactContext", "Lcom/facebook/react/bridge/ReactContext;", "<init>", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReactContext;)V", "getContainerId", "()Ljava/lang/String;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "getReactContext", "()Ljava/lang/ref/WeakReference;", "sendEventHubMessage", "", "envelope", "", "", "BReactNativeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C23580a implements InterfaceC42662a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public final String f46102a;

        /* JADX INFO: renamed from: b */
        @NotNull
        public final WeakReference<ReactContext> f46103b;

        public C23580a(@NotNull String containerId, @NotNull ReactContext reactContext) {
            Intrinsics.checkNotNullParameter(containerId, "containerId");
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            this.f46102a = containerId;
            this.f46103b = new WeakReference<>(reactContext);
        }

        @Override // my.InterfaceC42662a
        /* JADX INFO: renamed from: a */
        public boolean mo56093a(@NotNull Map<String, ? extends Object> envelope) {
            Object objM103844constructorimpl;
            Intrinsics.checkNotNullParameter(envelope, "envelope");
            ReactContext reactContext = this.f46103b.get();
            if (reactContext == null) {
                C44128b.m97266j("EventHub", "rn send skip containerId=" + getF46102a() + ", reason=contextReleased");
                return false;
            }
            if (!reactContext.hasActiveReactInstance()) {
                C44128b.m97266j("EventHub", "rn send skip containerId=" + getF46102a() + ", reason=inactiveReactInstance");
                return false;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("eventHubMessage", C24267r0.m58522f(envelope));
                C44128b.m97266j("EventHub", "rn send success containerId=" + getF46102a() + ", topic=" + envelope.get("topic") + ", traceId=" + envelope.get("traceId"));
                objM103844constructorimpl = Result.m103844constructorimpl(Boolean.TRUE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
            if (thM103847exceptionOrNullimpl != null) {
                C44128b.m97266j("EventHub", "rn send failed containerId=" + getF46102a() + ", error=" + thM103847exceptionOrNullimpl.getMessage());
                objM103844constructorimpl = Boolean.FALSE;
            }
            return ((Boolean) objM103844constructorimpl).booleanValue();
        }

        @Override // my.InterfaceC42662a
        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public String getF46102a() {
            return this.f46102a;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final WeakReference<ReactContext> m56095c() {
            return this.f46103b;
        }
    }

    private final String findVisibleContainerId(Activity activity, List<String> containerIds) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return findVisibleContainerId(decorView, CollectionsKt.toSet(containerIds));
    }

    private final String findVisibleContainerIdOnMain(final Activity activity, final List<String> containerIds) {
        if (activity == null) {
            return null;
        }
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            return findVisibleContainerId(activity, containerIds);
        }
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: qx.a
            @Override // java.lang.Runnable
            public final void run() {
                RNEventHubRegistry.findVisibleContainerIdOnMain$lambda$9(countDownLatch, atomicReference, activity, containerIds);
            }
        });
        if (!countDownLatch.await(300L, TimeUnit.MILLISECONDS)) {
            C44128b.m97266j("EventHub", "rn findVisibleContainerId timeout candidates=" + containerIds);
        }
        return (String) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void findVisibleContainerIdOnMain$lambda$9(CountDownLatch countDownLatch, AtomicReference atomicReference, Activity activity, List list) {
        Object objM103844constructorimpl;
        RNEventHubRegistry rNEventHubRegistry = INSTANCE;
        try {
            Result.Companion companion = Result.INSTANCE;
            atomicReference.set(rNEventHubRegistry.findVisibleContainerId(activity, (List<String>) list));
            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97266j("EventHub", "rn findVisibleContainerId failed: " + thM103847exceptionOrNullimpl.getMessage());
        }
        countDownLatch.countDown();
    }

    public final boolean containsContainerId(@NotNull ReactContext reactContext, @NotNull String containerId) {
        boolean z11;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        int iIdentityHashCode = System.identityHashCode(reactContext);
        synchronized (lock) {
            LinkedHashSet<String> linkedHashSet = contextToContainerIds.get(Integer.valueOf(iIdentityHashCode));
            z11 = false;
            if (linkedHashSet != null && linkedHashSet.contains(containerId)) {
                z11 = true;
            }
        }
        if (!z11) {
            C44128b.m97266j("EventHub", "rn containsContainerId miss containerId=" + containerId + ", context=" + iIdentityHashCode);
        }
        return z11;
    }

    @Nullable
    public final String findContainerId(@NotNull ReactContext reactContext, @Nullable Activity activity) {
        List<String> list;
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        int iIdentityHashCode = System.identityHashCode(reactContext);
        synchronized (lock) {
            try {
                LinkedHashSet<String> linkedHashSet = contextToContainerIds.get(Integer.valueOf(iIdentityHashCode));
                list = linkedHashSet != null ? CollectionsKt.toList(linkedHashSet) : null;
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (list.isEmpty()) {
            C44128b.m97266j("EventHub", "rn findContainerId skipped: empty context=" + iIdentityHashCode);
            return null;
        }
        String strFindVisibleContainerIdOnMain = findVisibleContainerIdOnMain(activity, list);
        if (strFindVisibleContainerIdOnMain != null) {
            C44128b.m97266j("EventHub", "rn findContainerId visible=" + strFindVisibleContainerIdOnMain + ", context=" + iIdentityHashCode);
            return strFindVisibleContainerIdOnMain;
        }
        if (list.size() == 1) {
            return (String) CollectionsKt.first((List) list);
        }
        String str = (String) CollectionsKt.last((List) list);
        C44128b.m97266j("EventHub", "rn findContainerId fallbackLatest=" + str + ", context=" + iIdentityHashCode + ", candidates=" + list);
        return str;
    }

    public final void register(@NotNull String containerId, @NotNull ReactContext reactContext) {
        LinkedHashSet<String> linkedHashSetPutIfAbsent;
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        C23580a c23580a = new C23580a(containerId, reactContext);
        int iIdentityHashCode = System.identityHashCode(reactContext);
        synchronized (lock) {
            try {
                ConcurrentHashMap<Integer, LinkedHashSet<String>> concurrentHashMap = contextToContainerIds;
                Integer numValueOf = Integer.valueOf(iIdentityHashCode);
                LinkedHashSet<String> linkedHashSet = concurrentHashMap.get(numValueOf);
                if (linkedHashSet == null && (linkedHashSetPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (linkedHashSet = new LinkedHashSet<>()))) != null) {
                    linkedHashSet = linkedHashSetPutIfAbsent;
                }
                linkedHashSet.add(containerId);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        endpoints.put(containerId, c23580a);
        C42677p.f94436a.m93494n(c23580a, EventHubTechStack.RN);
        C44128b.m97266j("EventHub", "rn register containerId=" + containerId + ", context=" + iIdentityHashCode);
    }

    public final void unregister(@NotNull String containerId) {
        WeakReference<ReactContext> weakReferenceM56095c;
        ReactContext reactContext;
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        C23580a c23580aRemove = endpoints.remove(containerId);
        if (c23580aRemove != null && (weakReferenceM56095c = c23580aRemove.m56095c()) != null && (reactContext = weakReferenceM56095c.get()) != null) {
            int iIdentityHashCode = System.identityHashCode(reactContext);
            synchronized (lock) {
                try {
                    ConcurrentHashMap<Integer, LinkedHashSet<String>> concurrentHashMap = contextToContainerIds;
                    LinkedHashSet<String> linkedHashSet = concurrentHashMap.get(Integer.valueOf(iIdentityHashCode));
                    if (linkedHashSet != null) {
                        linkedHashSet.remove(containerId);
                        if (linkedHashSet.isEmpty()) {
                            concurrentHashMap.remove(Integer.valueOf(iIdentityHashCode));
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        C42677p.f94436a.m93497q(containerId);
        C44128b.m97266j("EventHub", "rn unregister containerId=" + containerId);
    }

    private RNEventHubRegistry() {
    }

    private final String findVisibleContainerId(View view, Set<String> containerIds) {
        String strFindVisibleContainerId;
        if ((view instanceof ReactRootView) && isVisibleInHierarchy(view)) {
            String strValueOf = String.valueOf(((ReactRootView) view).getRootViewTag());
            if (containerIds.contains(strValueOf) && endpoints.containsKey(strValueOf)) {
                return strValueOf;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            View childAt = viewGroup.getChildAt(childCount);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            strFindVisibleContainerId = findVisibleContainerId(childAt, containerIds);
        } while (strFindVisibleContainerId == null);
        return strFindVisibleContainerId;
    }

    private final boolean isVisibleInHierarchy(View view) {
        if (!view.isShown() || view.getAlpha() <= 0.01f || view.getWindowToken() == null) {
            return false;
        }
        while (view != null) {
            if (view.getVisibility() != 0 || view.getAlpha() <= 0.01f) {
                return false;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return true;
    }
}
