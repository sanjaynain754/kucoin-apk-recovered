package p008a6;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: a6.w */
/* JADX INFO: compiled from: LruBucketsPoolBackend.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC0163w<T> implements InterfaceC0140d0<T> {

    /* JADX INFO: renamed from: a */
    public final Set<T> f551a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final C0151k<T> f552b = new C0151k<>();

    @Override // p008a6.InterfaceC0140d0
    public void put(T t11) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f551a.add(t11);
        }
        if (zAdd) {
            this.f552b.m692e(mo626a(t11), t11);
        }
    }

    /* JADX INFO: renamed from: b */
    public final T m727b(T t11) {
        if (t11 == null) {
            return t11;
        }
        synchronized (this) {
            this.f551a.remove(t11);
        }
        return t11;
    }

    @Override // p008a6.InterfaceC0140d0
    public T get(int i11) {
        return m727b(this.f552b.m688a(i11));
    }

    @Override // p008a6.InterfaceC0140d0
    public T pop() {
        return m727b(this.f552b.m693f());
    }
}
