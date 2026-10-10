package re0;

import javax.inject.Provider;

/* JADX INFO: renamed from: re0.a */
/* JADX INFO: compiled from: DoubleCheck.java */
/* JADX INFO: loaded from: classes23.dex */
public final class C43995a<T> implements Provider<T> {

    /* JADX INFO: renamed from: c */
    public static final Object f97234c = new Object();

    /* JADX INFO: renamed from: a */
    public volatile Provider<T> f97235a;

    /* JADX INFO: renamed from: b */
    public volatile Object f97236b = f97234c;

    /* JADX INFO: renamed from: b */
    public static Object m96961b(Object obj, Object obj2) {
        if (obj == f97234c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // javax.inject.Provider
    public T get() {
        T t11;
        T t12 = (T) this.f97236b;
        Object obj = f97234c;
        if (t12 != obj) {
            return t12;
        }
        synchronized (this) {
            try {
                t11 = (T) this.f97236b;
                if (t11 == obj) {
                    t11 = this.f97235a.get();
                    this.f97236b = m96961b(this.f97236b, t11);
                    this.f97235a = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t11;
    }

    public C43995a(Provider<T> provider) {
        this.f97235a = provider;
    }

    /* JADX INFO: renamed from: a */
    public static <P extends Provider<T>, T> Provider<T> m96960a(P p11) {
        C43996b.m96963b(p11);
        if (p11 instanceof C43995a) {
            return p11;
        }
        return new C43995a(p11);
    }
}
