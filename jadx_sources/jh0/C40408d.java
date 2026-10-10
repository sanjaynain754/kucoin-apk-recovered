package jh0;

import fh0.C37487h;
import fh0.C37492m;
import fh0.C37493n;
import ih0.AbstractC38619a;
import ih0.AbstractC38637s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kh0.InterfaceC41045e;
import lh0.InterfaceC42224a;

/* JADX INFO: renamed from: jh0.d */
/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes61.dex */
public class C40408d {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC41045e> f89712a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC42224a> f89713b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC40407c f89714c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC40409e> f89715d;

    /* JADX INFO: renamed from: jh0.d$b */
    /* JADX INFO: compiled from: Parser.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final List<InterfaceC41045e> f89716a = new ArrayList();

        /* JADX INFO: renamed from: b */
        public final List<InterfaceC42224a> f89717b = new ArrayList();

        /* JADX INFO: renamed from: c */
        public final List<InterfaceC40409e> f89718c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Set<Class<? extends AbstractC38619a>> f89719d = C37487h.m84331q();

        /* JADX INFO: renamed from: e */
        public InterfaceC40407c f89720e;

        /* JADX INFO: renamed from: jh0.d$b$a */
        /* JADX INFO: compiled from: Parser.java */
        public class a implements InterfaceC40407c {
            public a() {
            }

            @Override // jh0.InterfaceC40407c
            /* JADX INFO: renamed from: a */
            public InterfaceC40405a mo89039a(InterfaceC40406b interfaceC40406b) {
                return new C37493n(interfaceC40406b);
            }
        }

        /* JADX INFO: renamed from: f */
        public C40408d m89048f() {
            return new C40408d(this);
        }

        /* JADX INFO: renamed from: g */
        public b m89049g(InterfaceC42224a interfaceC42224a) {
            if (interfaceC42224a == null) {
                throw new NullPointerException("delimiterProcessor must not be null");
            }
            this.f89717b.add(interfaceC42224a);
            return this;
        }

        /* JADX INFO: renamed from: h */
        public final InterfaceC40407c m89050h() {
            InterfaceC40407c interfaceC40407c = this.f89720e;
            return interfaceC40407c != null ? interfaceC40407c : new a();
        }
    }

    public C40408d(b bVar) {
        this.f89712a = C37487h.m84330j(bVar.f89716a, bVar.f89719d);
        InterfaceC40407c interfaceC40407cM89050h = bVar.m89050h();
        this.f89714c = interfaceC40407cM89050h;
        this.f89715d = bVar.f89718c;
        List<InterfaceC42224a> list = bVar.f89717b;
        this.f89713b = list;
        interfaceC40407cM89050h.mo89039a(new C37492m(list, Collections.EMPTY_MAP));
    }

    /* JADX INFO: renamed from: a */
    public final C37487h m89040a() {
        return new C37487h(this.f89712a, this.f89714c, this.f89713b);
    }

    /* JADX INFO: renamed from: b */
    public AbstractC38637s m89041b(String str) {
        if (str != null) {
            return m89042c(m89040a().m84348s(str));
        }
        throw new NullPointerException("input must not be null");
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC38637s m89042c(AbstractC38637s abstractC38637s) {
        Iterator<InterfaceC40409e> it = this.f89715d.iterator();
        while (it.hasNext()) {
            abstractC38637s = it.next().m89051a(abstractC38637s);
        }
        return abstractC38637s;
    }
}
