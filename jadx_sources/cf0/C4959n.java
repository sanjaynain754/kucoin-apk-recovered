package cf0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ih0.AbstractC38623e;
import ih0.AbstractC38637s;
import ih0.C38620b;
import ih0.C38621c;
import ih0.C38622d;
import ih0.C38624f;
import ih0.C38625g;
import ih0.C38626h;
import ih0.C38627i;
import ih0.C38628j;
import ih0.C38629k;
import ih0.C38630l;
import ih0.C38631m;
import ih0.C38632n;
import ih0.C38633o;
import ih0.C38634p;
import ih0.C38636r;
import ih0.C38638t;
import ih0.C38639u;
import ih0.C38640v;
import ih0.C38641w;
import ih0.C38642x;
import ih0.C38643y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: cf0.n */
/* JADX INFO: compiled from: MarkwonVisitorImpl.java */
/* JADX INFO: loaded from: classes60.dex */
public class C4959n implements InterfaceC4957l {

    /* JADX INFO: renamed from: a */
    public final C4952g f5530a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4962q f5531b;

    /* JADX INFO: renamed from: c */
    public final C4965t f5532c;

    /* JADX INFO: renamed from: d */
    public final Map<Class<? extends AbstractC38637s>, InterfaceC4957l.c<? extends AbstractC38637s>> f5533d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC4957l.a f5534e;

    /* JADX INFO: renamed from: cf0.n$a */
    /* JADX INFO: compiled from: MarkwonVisitorImpl.java */
    public static class a implements InterfaceC4957l.b {

        /* JADX INFO: renamed from: a */
        public final Map<Class<? extends AbstractC38637s>, InterfaceC4957l.c<? extends AbstractC38637s>> f5535a = new HashMap();

        /* JADX INFO: renamed from: b */
        public InterfaceC4957l.a f5536b;

        @Override // cf0.InterfaceC4957l.b
        @NonNull
        /* JADX INFO: renamed from: a */
        public InterfaceC4957l mo5206a(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q) {
            InterfaceC4957l.a c4947b = this.f5536b;
            if (c4947b == null) {
                c4947b = new C4947b();
            }
            return new C4959n(c4952g, interfaceC4962q, new C4965t(), Collections.unmodifiableMap(this.f5535a), c4947b);
        }

        @Override // cf0.InterfaceC4957l.b
        @NonNull
        /* JADX INFO: renamed from: b */
        public <N extends AbstractC38637s> InterfaceC4957l.b mo5207b(@NonNull Class<N> cls, @Nullable InterfaceC4957l.c<? super N> cVar) {
            if (cVar == null) {
                this.f5535a.remove(cls);
                return this;
            }
            this.f5535a.put(cls, cVar);
            return this;
        }

        @Override // cf0.InterfaceC4957l.b
        @NonNull
        /* JADX INFO: renamed from: c */
        public InterfaceC4957l.b mo5208c(@NonNull InterfaceC4957l.a aVar) {
            this.f5536b = aVar;
            return this;
        }
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: D */
    public void mo5196D() {
        this.f5532c.append('\n');
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: F */
    public void mo5197F(@NonNull AbstractC38637s abstractC38637s) {
        this.f5534e.blockEnd(this, abstractC38637s);
    }

    /* JADX INFO: renamed from: G */
    public <N extends AbstractC38637s> void m5216G(@NonNull Class<N> cls, int i11) {
        InterfaceC4964s interfaceC4964s = this.f5530a.m5180c().get(cls);
        if (interfaceC4964s != null) {
            mo5198c(i11, interfaceC4964s.mo5246a(this.f5530a, this.f5531b));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m5217H(@NonNull AbstractC38637s abstractC38637s) {
        InterfaceC4957l.c<? extends AbstractC38637s> cVar = this.f5533d.get(abstractC38637s.getClass());
        if (cVar != null) {
            cVar.mo5209a(this, abstractC38637s);
        } else {
            mo5205w(abstractC38637s);
        }
    }

    @Override // cf0.InterfaceC4957l
    @NonNull
    public C4965t builder() {
        return this.f5532c;
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: c */
    public void mo5198c(int i11, @Nullable Object obj) {
        C4965t c4965t = this.f5532c;
        C4965t.m5248j(c4965t, obj, i11, c4965t.length());
    }

    @Override // cf0.InterfaceC4957l
    @NonNull
    /* JADX INFO: renamed from: h */
    public InterfaceC4962q mo5200h() {
        return this.f5531b;
    }

    @Override // cf0.InterfaceC4957l
    public int length() {
        return this.f5532c.length();
    }

    @Override // cf0.InterfaceC4957l
    @NonNull
    /* JADX INFO: renamed from: o */
    public C4952g mo5202o() {
        return this.f5530a;
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: q */
    public void mo5203q() {
        if (this.f5532c.length() <= 0 || '\n' == this.f5532c.m5256h()) {
            return;
        }
        this.f5532c.append('\n');
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: v */
    public void mo5204v(@NonNull AbstractC38637s abstractC38637s) {
        this.f5534e.blockStart(this, abstractC38637s);
    }

    public C4959n(@NonNull C4952g c4952g, @NonNull InterfaceC4962q interfaceC4962q, @NonNull C4965t c4965t, @NonNull Map<Class<? extends AbstractC38637s>, InterfaceC4957l.c<? extends AbstractC38637s>> map, @NonNull InterfaceC4957l.a aVar) {
        this.f5530a = c4952g;
        this.f5531b = interfaceC4962q;
        this.f5532c = c4965t;
        this.f5533d = map;
        this.f5534e = aVar;
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: A */
    public void mo5212A(C38628j c38628j) {
        m5217H(c38628j);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: B */
    public void mo5213B(C38622d c38622d) {
        m5217H(c38622d);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: C */
    public void mo5214C(C38624f c38624f) {
        m5217H(c38624f);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: E */
    public void mo5215E(C38639u c38639u) {
        m5217H(c38639u);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: a */
    public void mo5218a(C38633o c38633o) {
        m5217H(c38633o);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: b */
    public void mo5219b(C38625g c38625g) {
        m5217H(c38625g);
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: d */
    public <N extends AbstractC38637s> void mo5199d(@NonNull N n11, int i11) {
        m5216G(n11.getClass(), i11);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: e */
    public void mo5220e(C38642x c38642x) {
        m5217H(c38642x);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: f */
    public void mo5221f(C38640v c38640v) {
        m5217H(c38640v);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: g */
    public void mo5222g(C38631m c38631m) {
        m5217H(c38631m);
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: i */
    public boolean mo5201i(@NonNull AbstractC38637s abstractC38637s) {
        if (abstractC38637s.m87357e() != null) {
            return true;
        }
        return false;
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: j */
    public void mo5223j(C38643y c38643y) {
        m5217H(c38643y);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: k */
    public void mo5224k(C38636r c38636r) {
        m5217H(c38636r);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: l */
    public void mo5225l(C38629k c38629k) {
        m5217H(c38629k);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: m */
    public void mo5226m(C38626h c38626h) {
        m5217H(c38626h);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: n */
    public void mo5227n(C38620b c38620b) {
        m5217H(c38620b);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: p */
    public void mo5228p(C38638t c38638t) {
        m5217H(c38638t);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: r */
    public void mo5229r(C38627i c38627i) {
        m5217H(c38627i);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: s */
    public void mo5230s(C38621c c38621c) {
        m5217H(c38621c);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: t */
    public void mo5231t(C38630l c38630l) {
        m5217H(c38630l);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: u */
    public void mo5232u(AbstractC38623e abstractC38623e) {
        m5217H(abstractC38623e);
    }

    @Override // cf0.InterfaceC4957l
    /* JADX INFO: renamed from: w */
    public void mo5205w(@NonNull AbstractC38637s abstractC38637s) {
        AbstractC38637s abstractC38637sM87355c = abstractC38637s.m87355c();
        while (abstractC38637sM87355c != null) {
            AbstractC38637s abstractC38637sM87357e = abstractC38637sM87355c.m87357e();
            abstractC38637sM87355c.mo87323a(this);
            abstractC38637sM87355c = abstractC38637sM87357e;
        }
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: x */
    public void mo5233x(C38641w c38641w) {
        m5217H(c38641w);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: y */
    public void mo5234y(C38634p c38634p) {
        m5217H(c38634p);
    }

    @Override // ih0.InterfaceC38644z
    /* JADX INFO: renamed from: z */
    public void mo5235z(C38632n c38632n) {
        m5217H(c38632n);
    }
}
