package p008a6;

import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import java.util.LinkedList;

/* JADX INFO: renamed from: a6.k */
/* JADX INFO: compiled from: BucketMap.java */
/* JADX INFO: loaded from: classes34.dex */
public class C0151k<T> {

    /* JADX INFO: renamed from: a */
    public final SparseArray<a<T>> f526a = new SparseArray<>();

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public a<T> f527b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public a<T> f528c;

    /* JADX INFO: renamed from: a6.k$a */
    /* JADX INFO: compiled from: BucketMap.java */
    @VisibleForTesting
    public static class a<I> {

        /* JADX INFO: renamed from: a */
        public a<I> f529a;

        /* JADX INFO: renamed from: b */
        public int f530b;

        /* JADX INFO: renamed from: c */
        public LinkedList<I> f531c;

        /* JADX INFO: renamed from: d */
        public a<I> f532d;

        public a(a<I> aVar, int i11, LinkedList<I> linkedList, a<I> aVar2) {
            this.f529a = aVar;
            this.f530b = i11;
            this.f531c = linkedList;
            this.f532d = aVar2;
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f530b + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized T m688a(int i11) {
        a<T> aVar = this.f526a.get(i11);
        if (aVar == null) {
            return null;
        }
        T tPollFirst = aVar.f531c.pollFirst();
        m690c(aVar);
        return tPollFirst;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m691d(a<T> aVar) {
        try {
            a aVar2 = (a<T>) aVar.f529a;
            a aVar3 = (a<T>) aVar.f532d;
            if (aVar2 != null) {
                aVar2.f532d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f529a = aVar2;
            }
            aVar.f529a = null;
            aVar.f532d = null;
            if (aVar == this.f527b) {
                this.f527b = aVar3;
            }
            if (aVar == this.f528c) {
                this.f528c = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m692e(int i11, T t11) {
        try {
            a<T> aVar = this.f526a.get(i11);
            if (aVar == null) {
                a<T> aVar2 = new a<>(null, i11, new LinkedList(), null);
                this.f526a.put(i11, aVar2);
                aVar = aVar2;
            }
            aVar.f531c.addLast(t11);
            m690c(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public synchronized T m693f() {
        a<T> aVar = this.f528c;
        if (aVar == null) {
            return null;
        }
        T tPollLast = aVar.f531c.pollLast();
        m689b(aVar);
        return tPollLast;
    }

    /* JADX INFO: renamed from: b */
    public final void m689b(a<T> aVar) {
        if (aVar == null || !aVar.f531c.isEmpty()) {
            return;
        }
        m691d(aVar);
        this.f526a.remove(aVar.f530b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m690c(a<T> aVar) {
        if (this.f527b == aVar) {
            return;
        }
        m691d(aVar);
        a<T> aVar2 = this.f527b;
        if (aVar2 == 0) {
            this.f527b = aVar;
            this.f528c = aVar;
        } else {
            aVar.f532d = aVar2;
            aVar2.f529a = aVar;
            this.f527b = aVar;
        }
    }
}
