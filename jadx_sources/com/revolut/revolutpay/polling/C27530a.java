package com.revolut.revolutpay.polling;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.revolut.revolutpay.polling.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C27530a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final a f56190a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final WeakHashMap<InterfaceC27532c, InterfaceC27532c> f56191b;

    /* JADX INFO: renamed from: com.revolut.revolutpay.polling.a$a */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m90084d2 = {"Lcom/revolut/revolutpay/polling/a$a;", "Landroidx/lifecycle/LifecycleEventObserver;", "<init>", "(Lcom/revolut/revolutpay/polling/a;)V", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "onStateChanged", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V", "revolut_pay_sdk_2_0_release"}, m90085k = 1, m90086mv = {1, 7, 1}, m90088xi = 48)
    public final class a implements LifecycleEventObserver {

        /* JADX INFO: renamed from: com.revolut.revolutpay.polling.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C46983a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f56193a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f56193a = iArr;
            }
        }

        public a() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            int i11 = C46983a.f56193a[event.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            Set setKeySet = C27530a.this.f56191b.keySet();
                            Intrinsics.checkNotNullExpressionValue(setKeySet, "callbackMap.keys");
                            Iterator it = setKeySet.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC27532c) it.next()).onDestroy();
                            }
                            return;
                        }
                        return;
                    }
                    Set setKeySet2 = C27530a.this.f56191b.keySet();
                    Intrinsics.checkNotNullExpressionValue(setKeySet2, "callbackMap.keys");
                    Iterator it2 = setKeySet2.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC27532c) it2.next()).onStop();
                    }
                    return;
                }
                Set setKeySet3 = C27530a.this.f56191b.keySet();
                Intrinsics.checkNotNullExpressionValue(setKeySet3, "callbackMap.keys");
                Iterator it3 = setKeySet3.iterator();
                while (it3.hasNext()) {
                    ((InterfaceC27532c) it3.next()).mo68256b();
                }
                return;
            }
            Set setKeySet4 = C27530a.this.f56191b.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet4, "callbackMap.keys");
            Iterator it4 = setKeySet4.iterator();
            while (it4.hasNext()) {
                ((InterfaceC27532c) it4.next()).mo68255a();
            }
        }
    }

    public C27530a(@NotNull Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        a aVar = new a();
        this.f56190a = aVar;
        this.f56191b = new WeakHashMap<>();
        lifecycle.addObserver(aVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m68234b(@NotNull InterfaceC27532c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f56191b.put(callback, callback);
    }

    /* JADX INFO: renamed from: c */
    public final void m68235c(@NotNull InterfaceC27532c callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f56191b.remove(callback);
    }
}
