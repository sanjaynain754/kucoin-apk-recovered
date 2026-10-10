package p549q5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p712w3.InterfaceC45709i;

/* JADX INFO: renamed from: q5.i */
/* JADX INFO: compiled from: CountingLruMap.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43620i<K, V> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC43632u<V> f96291a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap<K, V> f96292b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c */
    public int f96293c = 0;

    /* JADX INFO: renamed from: a */
    public synchronized boolean m95978a(K k11) {
        return this.f96292b.containsKey(k11);
    }

    /* JADX INFO: renamed from: b */
    public synchronized V m95979b(K k11) {
        return this.f96292b.get(k11);
    }

    /* JADX INFO: renamed from: c */
    public synchronized int m95980c() {
        return this.f96292b.size();
    }

    /* JADX INFO: renamed from: d */
    public synchronized K m95981d() {
        return this.f96292b.isEmpty() ? null : this.f96292b.keySet().iterator().next();
    }

    /* JADX INFO: renamed from: e */
    public synchronized ArrayList<Map.Entry<K, V>> m95982e(InterfaceC45709i<K> interfaceC45709i) {
        ArrayList<Map.Entry<K, V>> arrayList;
        try {
            arrayList = new ArrayList<>(this.f96292b.entrySet().size());
            for (Map.Entry<K, V> entry : this.f96292b.entrySet()) {
                if (interfaceC45709i == null || interfaceC45709i.apply(entry.getKey())) {
                    arrayList.add(entry);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public synchronized int m95983f() {
        return this.f96293c;
    }

    /* JADX INFO: renamed from: h */
    public synchronized V m95985h(K k11, V v11) {
        V vRemove;
        vRemove = this.f96292b.remove(k11);
        this.f96293c -= m95984g(vRemove);
        this.f96292b.put(k11, v11);
        this.f96293c += m95984g(v11);
        return vRemove;
    }

    /* JADX INFO: renamed from: i */
    public synchronized V m95986i(K k11) {
        V vRemove;
        vRemove = this.f96292b.remove(k11);
        this.f96293c -= m95984g(vRemove);
        return vRemove;
    }

    /* JADX INFO: renamed from: j */
    public synchronized ArrayList<V> m95987j(InterfaceC45709i<K> interfaceC45709i) {
        ArrayList<V> arrayList;
        try {
            arrayList = new ArrayList<>();
            Iterator<Map.Entry<K, V>> it = this.f96292b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (interfaceC45709i == null || interfaceC45709i.apply(next.getKey())) {
                    arrayList.add(next.getValue());
                    this.f96293c -= m95984g(next.getValue());
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m95988k() {
        if (this.f96292b.isEmpty()) {
            this.f96293c = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m95984g(V v11) {
        if (v11 == null) {
            return 0;
        }
        return this.f96291a.mo9142a(v11);
    }

    public C43620i(InterfaceC43632u<V> interfaceC43632u) {
        this.f96291a = interfaceC43632u;
    }
}
