package com.facebook.common.references;

import java.util.IdentityHashMap;
import java.util.Map;
import p006a4.InterfaceC0117h;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes34.dex */
public class SharedReference<T> {

    /* JADX INFO: renamed from: d */
    public static final Map<Object, Integer> f8150d = new IdentityHashMap();

    /* JADX INFO: renamed from: a */
    public T f8151a;

    /* JADX INFO: renamed from: b */
    public int f8152b = 1;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0117h<T> f8153c;

    public static class NullReferenceException extends RuntimeException {
        public NullReferenceException() {
            super("Null shared reference");
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m8543b() {
        m8546e();
        this.f8152b++;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized int m8544c() {
        int i11;
        m8546e();
        C45708h.m100891b(Boolean.valueOf(this.f8152b > 0));
        i11 = this.f8152b - 1;
        this.f8152b = i11;
        return i11;
    }

    /* JADX INFO: renamed from: f */
    public synchronized T m8547f() {
        return this.f8151a;
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m8548g() {
        return this.f8152b > 0;
    }

    /* JADX INFO: renamed from: a */
    public static void m8540a(Object obj) {
        Map<Object, Integer> map = f8150d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    map.put(obj, 1);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() + 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8541h(SharedReference<?> sharedReference) {
        return sharedReference != null && sharedReference.m8548g();
    }

    /* JADX INFO: renamed from: i */
    public static void m8542i(Object obj) {
        Map<Object, Integer> map = f8150d;
        synchronized (map) {
            try {
                Integer num = map.get(obj);
                if (num == null) {
                    C45999a.m101494O("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
                } else if (num.intValue() == 1) {
                    map.remove(obj);
                } else {
                    map.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public SharedReference(T t11, InterfaceC0117h<T> interfaceC0117h, boolean z11) {
        this.f8151a = (T) C45708h.m100896g(t11);
        this.f8153c = interfaceC0117h;
        if (z11) {
            m8540a(t11);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m8545d() {
        T t11;
        if (m8544c() == 0) {
            synchronized (this) {
                t11 = this.f8151a;
                this.f8151a = null;
            }
            if (t11 != null) {
                InterfaceC0117h<T> interfaceC0117h = this.f8153c;
                if (interfaceC0117h != null) {
                    interfaceC0117h.release(t11);
                }
                m8542i(t11);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8546e() {
        if (m8541h(this)) {
        } else {
            throw new NullReferenceException();
        }
    }
}
