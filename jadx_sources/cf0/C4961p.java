package cf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.core.C39137a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: cf0.p */
/* JADX INFO: compiled from: RegistryImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4961p implements InterfaceC4954i.b {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC4954i> f5538a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC4954i> f5539b;

    /* JADX INFO: renamed from: c */
    public final Set<InterfaceC4954i> f5540c = new HashSet(3);

    /* JADX INFO: renamed from: b */
    public final void m5241b(@NonNull InterfaceC4954i interfaceC4954i) {
        if (this.f5539b.contains(interfaceC4954i)) {
            return;
        }
        if (this.f5540c.contains(interfaceC4954i)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.f5540c);
        }
        this.f5540c.add(interfaceC4954i);
        interfaceC4954i.configure(this);
        this.f5540c.remove(interfaceC4954i);
        if (this.f5539b.contains(interfaceC4954i)) {
            return;
        }
        if (C39137a.class.isAssignableFrom(interfaceC4954i.getClass())) {
            this.f5539b.add(0, interfaceC4954i);
        } else {
            this.f5539b.add(interfaceC4954i);
        }
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public final <P extends InterfaceC4954i> P m5242d(@NonNull Class<P> cls) {
        P p11 = (P) m5240c(this.f5539b, cls);
        if (p11 != null) {
            return p11;
        }
        P p12 = (P) m5240c(this.f5538a, cls);
        if (p12 != null) {
            m5241b(p12);
            return p12;
        }
        throw new IllegalStateException("Requested plugin is not added: " + cls.getName() + ", plugins: " + this.f5538a);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public List<InterfaceC4954i> m5243e() {
        Iterator<InterfaceC4954i> it = this.f5538a.iterator();
        while (it.hasNext()) {
            m5241b(it.next());
        }
        return this.f5539b;
    }

    public C4961p(@NonNull List<InterfaceC4954i> list) {
        this.f5538a = list;
        this.f5539b = new ArrayList(list.size());
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public static <P extends InterfaceC4954i> P m5240c(@NonNull List<InterfaceC4954i> list, @NonNull Class<P> cls) {
        Iterator<InterfaceC4954i> it = list.iterator();
        while (it.hasNext()) {
            P p11 = (P) it.next();
            if (cls.isAssignableFrom(p11.getClass())) {
                return p11;
            }
        }
        return null;
    }

    @Override // cf0.InterfaceC4954i.b
    /* JADX INFO: renamed from: a */
    public <P extends InterfaceC4954i> void mo5194a(@NonNull Class<P> cls, @NonNull InterfaceC4954i.a<? super P> aVar) {
        aVar.apply(m5242d(cls));
    }
}
