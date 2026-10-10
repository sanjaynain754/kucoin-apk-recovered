package com.bumptech.glide.load.engine;

import com.bumptech.glide.C5311e;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p030b2.C4467m;
import p628t1.C44613e;
import p628t1.InterfaceC44609a;
import p628t1.InterfaceC44610b;
import p628t1.InterfaceC44615g;
import p628t1.InterfaceC44616h;
import p680v1.AbstractC45352c;
import p680v1.InterfaceC45359j;
import p710w1.InterfaceC45684b;
import p745x1.InterfaceC45981a;
import p817z1.InterfaceC46635n;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.d */
/* JADX INFO: compiled from: DecodeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5344d<Transcode> {

    /* JADX INFO: renamed from: a */
    public final List<InterfaceC46635n.a<?>> f6843a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC44610b> f6844b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C5311e f6845c;

    /* JADX INFO: renamed from: d */
    public Object f6846d;

    /* JADX INFO: renamed from: e */
    public int f6847e;

    /* JADX INFO: renamed from: f */
    public int f6848f;

    /* JADX INFO: renamed from: g */
    public Class<?> f6849g;

    /* JADX INFO: renamed from: h */
    public DecodeJob.InterfaceC5338e f6850h;

    /* JADX INFO: renamed from: i */
    public C44613e f6851i;

    /* JADX INFO: renamed from: j */
    public Map<Class<?>, InterfaceC44616h<?>> f6852j;

    /* JADX INFO: renamed from: k */
    public Class<Transcode> f6853k;

    /* JADX INFO: renamed from: l */
    public boolean f6854l;

    /* JADX INFO: renamed from: m */
    public boolean f6855m;

    /* JADX INFO: renamed from: n */
    public InterfaceC44610b f6856n;

    /* JADX INFO: renamed from: o */
    public Priority f6857o;

    /* JADX INFO: renamed from: p */
    public AbstractC45352c f6858p;

    /* JADX INFO: renamed from: q */
    public boolean f6859q;

    /* JADX INFO: renamed from: r */
    public boolean f6860r;

    /* JADX INFO: renamed from: a */
    public void m6755a() {
        this.f6845c = null;
        this.f6846d = null;
        this.f6856n = null;
        this.f6849g = null;
        this.f6853k = null;
        this.f6851i = null;
        this.f6857o = null;
        this.f6852j = null;
        this.f6858p = null;
        this.f6843a.clear();
        this.f6854l = false;
        this.f6844b.clear();
        this.f6855m = false;
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC45684b m6756b() {
        return this.f6845c.m6579b();
    }

    /* JADX INFO: renamed from: c */
    public List<InterfaceC44610b> m6757c() {
        if (!this.f6855m) {
            this.f6855m = true;
            this.f6844b.clear();
            List<InterfaceC46635n.a<?>> listM6761g = m6761g();
            int size = listM6761g.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC46635n.a<?> aVar = listM6761g.get(i11);
                if (!this.f6844b.contains(aVar.f104427a)) {
                    this.f6844b.add(aVar.f104427a);
                }
                for (int i12 = 0; i12 < aVar.f104428b.size(); i12++) {
                    if (!this.f6844b.contains(aVar.f104428b.get(i12))) {
                        this.f6844b.add(aVar.f104428b.get(i12));
                    }
                }
            }
        }
        return this.f6844b;
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC45981a m6758d() {
        return this.f6850h.mo6734a();
    }

    /* JADX INFO: renamed from: e */
    public AbstractC45352c m6759e() {
        return this.f6858p;
    }

    /* JADX INFO: renamed from: f */
    public int m6760f() {
        return this.f6848f;
    }

    /* JADX INFO: renamed from: g */
    public List<InterfaceC46635n.a<?>> m6761g() {
        if (!this.f6854l) {
            this.f6854l = true;
            this.f6843a.clear();
            List listM6535i = this.f6845c.m6586i().m6535i(this.f6846d);
            int size = listM6535i.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC46635n.a<?> aVarMo10a = ((InterfaceC46635n) listM6535i.get(i11)).mo10a(this.f6846d, this.f6847e, this.f6848f, this.f6851i);
                if (aVarMo10a != null) {
                    this.f6843a.add(aVarMo10a);
                }
            }
        }
        return this.f6843a;
    }

    /* JADX INFO: renamed from: h */
    public <Data> C5349i<Data, ?, Transcode> m6762h(Class<Data> cls) {
        return this.f6845c.m6586i().m6534h(cls, this.f6849g, this.f6853k);
    }

    /* JADX INFO: renamed from: i */
    public Class<?> m6763i() {
        return this.f6846d.getClass();
    }

    /* JADX INFO: renamed from: j */
    public List<InterfaceC46635n<File, ?>> m6764j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f6845c.m6586i().m6535i(file);
    }

    /* JADX INFO: renamed from: k */
    public C44613e m6765k() {
        return this.f6851i;
    }

    /* JADX INFO: renamed from: l */
    public Priority m6766l() {
        return this.f6857o;
    }

    /* JADX INFO: renamed from: m */
    public List<Class<?>> m6767m() {
        return this.f6845c.m6586i().m6536j(this.f6846d.getClass(), this.f6849g, this.f6853k);
    }

    /* JADX INFO: renamed from: n */
    public <Z> InterfaceC44615g<Z> m6768n(InterfaceC45359j<Z> interfaceC45359j) {
        return this.f6845c.m6586i().m6537k(interfaceC45359j);
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC44610b m6769o() {
        return this.f6856n;
    }

    /* JADX INFO: renamed from: p */
    public <X> InterfaceC44609a<X> m6770p(X x11) throws Registry.NoSourceEncoderAvailableException {
        return this.f6845c.m6586i().m6539m(x11);
    }

    /* JADX INFO: renamed from: q */
    public Class<?> m6771q() {
        return this.f6853k;
    }

    /* JADX INFO: renamed from: r */
    public <Z> InterfaceC44616h<Z> m6772r(Class<Z> cls) {
        InterfaceC44616h<Z> interfaceC44616h = (InterfaceC44616h) this.f6852j.get(cls);
        if (interfaceC44616h == null) {
            for (Map.Entry<Class<?>, InterfaceC44616h<?>> entry : this.f6852j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    interfaceC44616h = (InterfaceC44616h) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC44616h != null) {
            return interfaceC44616h;
        }
        if (!this.f6852j.isEmpty() || !this.f6859q) {
            return C4467m.m4267c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* JADX INFO: renamed from: s */
    public int m6773s() {
        return this.f6847e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public <R> void m6775u(C5311e c5311e, Object obj, InterfaceC44610b interfaceC44610b, int i11, int i12, AbstractC45352c abstractC45352c, Class<?> cls, Class<R> cls2, Priority priority, C44613e c44613e, Map<Class<?>, InterfaceC44616h<?>> map, boolean z11, boolean z12, DecodeJob.InterfaceC5338e interfaceC5338e) {
        this.f6845c = c5311e;
        this.f6846d = obj;
        this.f6856n = interfaceC44610b;
        this.f6847e = i11;
        this.f6848f = i12;
        this.f6858p = abstractC45352c;
        this.f6849g = cls;
        this.f6850h = interfaceC5338e;
        this.f6853k = cls2;
        this.f6857o = priority;
        this.f6851i = c44613e;
        this.f6852j = map;
        this.f6859q = z11;
        this.f6860r = z12;
    }

    /* JADX INFO: renamed from: v */
    public boolean m6776v(InterfaceC45359j<?> interfaceC45359j) {
        return this.f6845c.m6586i().m6540n(interfaceC45359j);
    }

    /* JADX INFO: renamed from: w */
    public boolean m6777w() {
        return this.f6860r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public boolean m6774t(Class<?> cls) {
        if (m6762h(cls) != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public boolean m6778x(InterfaceC44610b interfaceC44610b) {
        List<InterfaceC46635n.a<?>> listM6761g = m6761g();
        int size = listM6761g.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (listM6761g.get(i11).f104427a.equals(interfaceC44610b)) {
                return true;
            }
        }
        return false;
    }
}
