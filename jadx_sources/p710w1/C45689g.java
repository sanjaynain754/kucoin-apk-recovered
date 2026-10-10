package p710w1;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p710w1.InterfaceC45694l;

/* JADX INFO: renamed from: w1.g */
/* JADX INFO: compiled from: GroupedLinkedMap.java */
/* JADX INFO: loaded from: classes.dex */
public class C45689g<K extends InterfaceC45694l, V> {

    /* JADX INFO: renamed from: a */
    public final a<K, V> f102994a = new a<>();

    /* JADX INFO: renamed from: b */
    public final Map<K, a<K, V>> f102995b = new HashMap();

    /* JADX INFO: renamed from: w1.g$a */
    /* JADX INFO: compiled from: GroupedLinkedMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f102996a;

        /* JADX INFO: renamed from: b */
        public List<V> f102997b;

        /* JADX INFO: renamed from: c */
        public a<K, V> f102998c;

        /* JADX INFO: renamed from: d */
        public a<K, V> f102999d;

        public a() {
            this(null);
        }

        public a(K k11) {
            this.f102999d = this;
            this.f102998c = this;
            this.f102996a = k11;
        }

        /* JADX INFO: renamed from: a */
        public void m100824a(V v11) {
            if (this.f102997b == null) {
                this.f102997b = new ArrayList();
            }
            this.f102997b.add(v11);
        }

        /* JADX INFO: renamed from: c */
        public int m100826c() {
            List<V> list = this.f102997b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public V m100825b() {
            int iM100826c = m100826c();
            if (iM100826c > 0) {
                return this.f102997b.remove(iM100826c - 1);
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <K, V> void m100817e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f102999d;
        aVar2.f102998c = aVar.f102998c;
        aVar.f102998c.f102999d = aVar2;
    }

    /* JADX INFO: renamed from: g */
    public static <K, V> void m100818g(a<K, V> aVar) {
        aVar.f102998c.f102999d = aVar;
        aVar.f102999d.f102998c = aVar;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public V m100819a(K k11) {
        a<K, V> aVar = this.f102995b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            this.f102995b.put(k11, aVar);
        } else {
            k11.mo100840a();
        }
        m100820b(aVar);
        return aVar.m100825b();
    }

    /* JADX INFO: renamed from: d */
    public void m100822d(K k11, V v11) {
        a<K, V> aVar = this.f102995b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            m100821c(aVar);
            this.f102995b.put(k11, aVar);
        } else {
            k11.mo100840a();
        }
        aVar.m100824a(v11);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public V m100823f() {
        for (a aVar = this.f102994a.f102999d; !aVar.equals(this.f102994a); aVar = aVar.f102999d) {
            V v11 = (V) aVar.m100825b();
            if (v11 != null) {
                return v11;
            }
            m100817e(aVar);
            this.f102995b.remove(aVar.f102996a);
            ((InterfaceC45694l) aVar.f102996a).mo100840a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f102994a.f102998c;
        boolean z11 = false;
        while (!aVar.equals(this.f102994a)) {
            sb2.append('{');
            sb2.append(aVar.f102996a);
            sb2.append(':');
            sb2.append(aVar.m100826c());
            sb2.append("}, ");
            aVar = aVar.f102998c;
            z11 = true;
        }
        if (z11) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: b */
    public final void m100820b(a<K, V> aVar) {
        m100817e(aVar);
        a<K, V> aVar2 = this.f102994a;
        aVar.f102999d = aVar2;
        aVar.f102998c = aVar2.f102998c;
        m100818g(aVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m100821c(a<K, V> aVar) {
        m100817e(aVar);
        a<K, V> aVar2 = this.f102994a;
        aVar.f102999d = aVar2.f102999d;
        aVar.f102998c = aVar2;
        m100818g(aVar);
    }
}
