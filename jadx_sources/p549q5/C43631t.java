package p549q5;

import com.facebook.common.memory.PooledByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p006a4.AbstractC0110a;
import p547q3.InterfaceC43595a;
import p712w3.C45708h;
import p747x3.C45999a;
import p749x5.C46075i;

/* JADX INFO: renamed from: q5.t */
/* JADX INFO: compiled from: StagingArea.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43631t {

    /* JADX INFO: renamed from: b */
    public static final Class<?> f96309b = C43631t.class;

    /* JADX INFO: renamed from: a */
    public Map<InterfaceC43595a, C46075i> f96310a = new HashMap();

    /* JADX INFO: renamed from: a */
    public void m96022a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f96310a.values());
            this.f96310a.clear();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            C46075i c46075i = (C46075i) arrayList.get(i11);
            if (c46075i != null) {
                c46075i.close();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m96023b(InterfaceC43595a interfaceC43595a) {
        C45708h.m100896g(interfaceC43595a);
        if (!this.f96310a.containsKey(interfaceC43595a)) {
            return false;
        }
        C46075i c46075i = this.f96310a.get(interfaceC43595a);
        synchronized (c46075i) {
            if (C46075i.m101554E(c46075i)) {
                return true;
            }
            this.f96310a.remove(interfaceC43595a);
            C45999a.m101486G(f96309b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c46075i)), interfaceC43595a.mo8758a(), Integer.valueOf(System.identityHashCode(interfaceC43595a)));
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized C46075i m96024c(InterfaceC43595a interfaceC43595a) {
        C45708h.m100896g(interfaceC43595a);
        C46075i c46075iM101555b = this.f96310a.get(interfaceC43595a);
        if (c46075iM101555b != null) {
            synchronized (c46075iM101555b) {
                if (!C46075i.m101554E(c46075iM101555b)) {
                    this.f96310a.remove(interfaceC43595a);
                    C45999a.m101486G(f96309b, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(c46075iM101555b)), interfaceC43595a.mo8758a(), Integer.valueOf(System.identityHashCode(interfaceC43595a)));
                    return null;
                }
                c46075iM101555b = C46075i.m101555b(c46075iM101555b);
            }
        }
        return c46075iM101555b;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m96025e() {
        C45999a.m101519y(f96309b, "Count = %d", Integer.valueOf(this.f96310a.size()));
    }

    /* JADX INFO: renamed from: f */
    public synchronized void m96026f(InterfaceC43595a interfaceC43595a, C46075i c46075i) {
        C45708h.m100896g(interfaceC43595a);
        C45708h.m100891b(Boolean.valueOf(C46075i.m101554E(c46075i)));
        C46075i.m101556g(this.f96310a.put(interfaceC43595a, C46075i.m101555b(c46075i)));
        m96025e();
    }

    /* JADX INFO: renamed from: h */
    public synchronized boolean m96028h(InterfaceC43595a interfaceC43595a, C46075i c46075i) {
        C45708h.m100896g(interfaceC43595a);
        C45708h.m100896g(c46075i);
        C45708h.m100891b(Boolean.valueOf(C46075i.m101554E(c46075i)));
        C46075i c46075i2 = this.f96310a.get(interfaceC43595a);
        if (c46075i2 == null) {
            return false;
        }
        AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i = c46075i2.m101574i();
        AbstractC0110a<PooledByteBuffer> abstractC0110aM101574i2 = c46075i.m101574i();
        if (abstractC0110aM101574i != null && abstractC0110aM101574i2 != null) {
            try {
                if (abstractC0110aM101574i.m565l() == abstractC0110aM101574i2.m565l()) {
                    this.f96310a.remove(interfaceC43595a);
                    AbstractC0110a.m555j(abstractC0110aM101574i2);
                    AbstractC0110a.m555j(abstractC0110aM101574i);
                    C46075i.m101556g(c46075i2);
                    m96025e();
                    return true;
                }
            } catch (Throwable th2) {
                AbstractC0110a.m555j(abstractC0110aM101574i2);
                AbstractC0110a.m555j(abstractC0110aM101574i);
                C46075i.m101556g(c46075i2);
                throw th2;
            }
        }
        AbstractC0110a.m555j(abstractC0110aM101574i2);
        AbstractC0110a.m555j(abstractC0110aM101574i);
        C46075i.m101556g(c46075i2);
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static C43631t m96021d() {
        return new C43631t();
    }

    /* JADX INFO: renamed from: g */
    public boolean m96027g(InterfaceC43595a interfaceC43595a) {
        C46075i c46075iRemove;
        C45708h.m100896g(interfaceC43595a);
        synchronized (this) {
            c46075iRemove = this.f96310a.remove(interfaceC43595a);
        }
        if (c46075iRemove == null) {
            return false;
        }
        try {
            return c46075iRemove.m101558C();
        } finally {
            c46075iRemove.close();
        }
    }
}
