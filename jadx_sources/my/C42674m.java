package my;

import android.os.Handler;
import android.os.Looper;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.sdk.eventhub.EventHubTechStack;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: renamed from: my.m */
/* JADX INFO: compiled from: KCTabBarVisibilityCoordinator.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0016\u001a\u00020\u0017J\u001e\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001aH\u0002J9\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010!J \u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u000eJ\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u000eJ\u000e\u0010'\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0011J\u000e\u0010(\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0005J\r\u0010)\u001a\u00020\u0017H\u0000¢\u0006\u0002\b*J\u0010\u0010+\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u0016\u0010-\u001a\u00020\u00172\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00170/H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\nj\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e`\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, m90084d2 = {"Lcom/kubi/sdk/eventhub/KCTabBarVisibilityCoordinator;", "", "<init>", "()V", "TAG", "", "NAVIGATION_TOPIC", "mainHandler", "Landroid/os/Handler;", "levelByContainer", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "explicitHiddenByContainer", "", "activeHostRef", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/sdk/eventhub/IBusinessTabBarHideable;", "activeContainerId", "adoptNextReport", "started", "observerToken", "startObservingNavigationEvents", "", "handleEnvelope", "envelope", "", "updateNavigationState", "containerId", FirebaseAnalytics.Param.LEVEL, "tabBarHidden", "hiddenKeyPresent", "routeName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;ZLjava/lang/String;)V", "setActiveTab", "host", "isRnTab", "syncActiveTab", "animated", "clearActiveHost", "clear", "clearForTest", "clearForTest$LBase_googleRelease", "shouldHide", "applyIfActive", "runOnMain", "block", "Lkotlin/Function0;", "LBase_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCTabBarVisibilityCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCTabBarVisibilityCoordinator.kt\ncom/kubi/sdk/eventhub/KCTabBarVisibilityCoordinator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class C42674m {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C42674m f94426a = new C42674m();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Handler f94427b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final HashMap<String, Integer> f94428c = new HashMap<>();

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final HashMap<String, Boolean> f94429d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    @Nullable
    public static WeakReference<InterfaceC42667f> f94430e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public static String f94431f;

    /* JADX INFO: renamed from: g */
    public static boolean f94432g;

    /* JADX INFO: renamed from: h */
    public static boolean f94433h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public static String f94434i;

    /* JADX INFO: renamed from: r */
    public final synchronized void m93478r() {
        if (f94433h) {
            return;
        }
        f94433h = true;
        f94434i = C42677p.f94436a.m93485c("kc.navigation.state", new Function1() { // from class: my.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C42674m.m93469s((Map) obj);
            }
        });
        C44128b.m97266j("TabBarVisibility", "startObservingNavigationEvents");
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m93465i(String str) {
        f94428c.remove(str);
        f94429d.remove(str);
        if (Intrinsics.areEqual(f94431f, str)) {
            f94431f = null;
            WeakReference<InterfaceC42667f> weakReference = f94430e;
            f94432g = (weakReference != null ? weakReference.get() : null) != null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static final Unit m93466k(InterfaceC42667f interfaceC42667f) {
        WeakReference<InterfaceC42667f> weakReference = f94430e;
        if ((weakReference != null ? weakReference.get() : null) == interfaceC42667f) {
            f94430e = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m93468p(InterfaceC42667f interfaceC42667f, String str, boolean z11) {
        f94430e = new WeakReference<>(interfaceC42667f);
        f94431f = str;
        f94432g = z11 && str == null;
        if (str != null) {
            interfaceC42667f.mo32392c(f94426a.m93477q(str), false);
        } else if (!z11) {
            interfaceC42667f.mo32392c(false, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static final Unit m93469s(Map envelope) {
        Intrinsics.checkNotNullParameter(envelope, "envelope");
        f94426a.m93474l(envelope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public final void m93471g(String str) {
        WeakReference<InterfaceC42667f> weakReference;
        InterfaceC42667f interfaceC42667f;
        if (!Intrinsics.areEqual(str, f94431f) || (weakReference = f94430e) == null || (interfaceC42667f = weakReference.get()) == null) {
            return;
        }
        interfaceC42667f.mo32392c(m93477q(str), true);
    }

    /* JADX INFO: renamed from: h */
    public final void m93472h(@NotNull final String containerId) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        m93475m(new Function0() { // from class: my.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42674m.m93465i(containerId);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m93473j(@NotNull final InterfaceC42667f host) {
        Intrinsics.checkNotNullParameter(host, "host");
        m93475m(new Function0() { // from class: my.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42674m.m93466k(host);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final void m93474l(Map<String, ? extends Object> map) {
        Object obj = map.get("source");
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("containerId") : null;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            return;
        }
        Object obj3 = map2.get("techStack");
        if (Intrinsics.areEqual(obj3 instanceof String ? (String) obj3 : null, EventHubTechStack.RN.getValue())) {
            Object obj4 = map.get("payload");
            Map map3 = obj4 instanceof Map ? (Map) obj4 : null;
            Object obj5 = map3 != null ? map3.get(FirebaseAnalytics.Param.LEVEL) : null;
            Number number = obj5 instanceof Number ? (Number) obj5 : null;
            Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
            boolean z11 = map3 != null && map3.containsKey("tabBarHidden");
            Object obj6 = map3 != null ? map3.get("tabBarHidden") : null;
            Boolean bool = obj6 instanceof Boolean ? (Boolean) obj6 : null;
            Object obj7 = map3 != null ? map3.get("routeName") : null;
            m93479t(str, numValueOf, bool, z11, obj7 instanceof String ? (String) obj7 : null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m93476o(@NotNull final InterfaceC42667f host, @Nullable final String str, final boolean z11) {
        Intrinsics.checkNotNullParameter(host, "host");
        m93475m(new Function0() { // from class: my.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42674m.m93468p(host, str, z11);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final boolean m93477q(String str) {
        Boolean bool = f94429d.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        Integer num = f94428c.get(str);
        return (num != null ? num.intValue() : 1) >= 2;
    }

    /* JADX INFO: renamed from: t */
    public final void m93479t(@NotNull final String containerId, @Nullable final Integer num, @Nullable final Boolean bool, final boolean z11, @Nullable final String str) {
        Intrinsics.checkNotNullParameter(containerId, "containerId");
        m93475m(new Function0() { // from class: my.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C42674m.m93470u(containerId, num, z11, bool, str);
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static final void m93467n(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m93470u(String str, Integer num, boolean z11, Boolean bool, String str2) {
        int iIntValue;
        if (StringsKt.isBlank(str)) {
            return Unit.INSTANCE;
        }
        if (num != null) {
            f94428c.put(str, Integer.valueOf(Math.max(1, num.intValue())));
        }
        if (z11 && bool != null) {
            f94429d.put(str, bool);
            Unit unit = Unit.INSTANCE;
        } else {
            f94429d.remove(str);
        }
        if (f94432g && f94431f == null) {
            f94431f = str;
            f94432g = false;
        }
        f94426a.m93471g(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("nav state container=");
        sb2.append(str);
        sb2.append(" level=");
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        sb2.append(iIntValue);
        sb2.append(" hidden=");
        sb2.append(bool);
        sb2.append(" route=");
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        C44128b.m97266j("TabBarVisibility", sb2.toString());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public final void m93475m(final Function0<Unit> function0) {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            function0.invoke();
        } else {
            f94427b.post(new Runnable() { // from class: my.k
                @Override // java.lang.Runnable
                public final void run() {
                    C42674m.m93467n(function0);
                }
            });
        }
    }
}
