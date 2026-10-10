package com.facebook.drawee.controller;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.fresco.p061ui.common.ControllerListener2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p192d6.C36621b;
import p251f4.C37352c;
import p251f4.C37354e;
import p251f4.C37356g;
import p251f4.InterfaceC37351b;
import p487o4.AbstractC42954a;
import p487o4.C42955b;
import p487o4.InterfaceC42956c;
import p487o4.InterfaceC42957d;
import p616s4.C44311a;
import p631t4.InterfaceC44686a;
import p631t4.InterfaceC44689d;
import p712w3.C45706f;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;

/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractDraweeControllerBuilder<BUILDER extends AbstractDraweeControllerBuilder<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> implements InterfaceC44689d {

    /* JADX INFO: renamed from: q */
    public static final InterfaceC42956c<Object> f8200q = new C5571a();

    /* JADX INFO: renamed from: r */
    public static final NullPointerException f8201r = new NullPointerException("No image request was specified!");

    /* JADX INFO: renamed from: s */
    public static final AtomicLong f8202s = new AtomicLong();

    /* JADX INFO: renamed from: a */
    public final Context f8203a;

    /* JADX INFO: renamed from: b */
    public final Set<InterfaceC42956c> f8204b;

    /* JADX INFO: renamed from: c */
    public final Set<ControllerListener2> f8205c;

    /* JADX INFO: renamed from: d */
    public Object f8206d;

    /* JADX INFO: renamed from: e */
    public REQUEST f8207e;

    /* JADX INFO: renamed from: f */
    public REQUEST f8208f;

    /* JADX INFO: renamed from: g */
    public REQUEST[] f8209g;

    /* JADX INFO: renamed from: h */
    public boolean f8210h;

    /* JADX INFO: renamed from: i */
    public InterfaceC45711k<InterfaceC37351b<IMAGE>> f8211i;

    /* JADX INFO: renamed from: j */
    public InterfaceC42956c<? super INFO> f8212j;

    /* JADX INFO: renamed from: k */
    public boolean f8213k;

    /* JADX INFO: renamed from: l */
    public boolean f8214l;

    /* JADX INFO: renamed from: m */
    public boolean f8215m;

    /* JADX INFO: renamed from: n */
    public boolean f8216n = false;

    /* JADX INFO: renamed from: o */
    public String f8217o;

    /* JADX INFO: renamed from: p */
    public InterfaceC44686a f8218p;

    public enum CacheLevel {
        FULL_FETCH,
        DISK_CACHE,
        BITMAP_MEMORY_CACHE
    }

    /* JADX INFO: renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$a */
    public class C5571a extends C42955b<Object> {
        @Override // p487o4.C42955b, p487o4.InterfaceC42956c
        public void onFinalImageSet(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.drawee.controller.AbstractDraweeControllerBuilder$b */
    public class C5572b implements InterfaceC45711k<InterfaceC37351b<IMAGE>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC44686a f8220a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f8221b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f8222c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Object f8223d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CacheLevel f8224e;

        public C5572b(InterfaceC44686a interfaceC44686a, String str, Object obj, Object obj2, CacheLevel cacheLevel) {
            this.f8220a = interfaceC44686a;
            this.f8221b = str;
            this.f8222c = obj;
            this.f8223d = obj2;
            this.f8224e = cacheLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p712w3.InterfaceC45711k
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public InterfaceC37351b<IMAGE> get() {
            return AbstractDraweeControllerBuilder.this.mo8623i(this.f8220a, this.f8221b, this.f8222c, this.f8223d, this.f8224e);
        }

        public String toString() {
            return C45706f.m100884b(this).m100886b("request", this.f8222c.toString()).toString();
        }
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC42957d m8622h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC37351b<IMAGE> mo8623i(InterfaceC44686a interfaceC44686a, String str, REQUEST request, Object obj, CacheLevel cacheLevel);

    /* JADX INFO: renamed from: s */
    public final void m8633s() {
        this.f8206d = null;
        this.f8207e = null;
        this.f8208f = null;
        this.f8209g = null;
        this.f8210h = true;
        this.f8212j = null;
        this.f8213k = false;
        this.f8214l = false;
        this.f8216n = false;
        this.f8218p = null;
        this.f8217o = null;
    }

    /* JADX INFO: renamed from: x */
    public abstract AbstractC42954a mo8638x();

    /* JADX INFO: renamed from: e */
    public static String m8609e() {
        return String.valueOf(f8202s.getAndIncrement());
    }

    /* JADX INFO: renamed from: A */
    public BUILDER m8610A(boolean z11) {
        this.f8214l = z11;
        return (BUILDER) m8632r();
    }

    /* JADX INFO: renamed from: B */
    public BUILDER m8611B(Object obj) {
        this.f8206d = obj;
        return (BUILDER) m8632r();
    }

    /* JADX INFO: renamed from: C */
    public BUILDER m8612C(InterfaceC42956c<? super INFO> interfaceC42956c) {
        this.f8212j = interfaceC42956c;
        return (BUILDER) m8632r();
    }

    /* JADX INFO: renamed from: D */
    public BUILDER m8613D(REQUEST request) {
        this.f8207e = request;
        return (BUILDER) m8632r();
    }

    /* JADX INFO: renamed from: E */
    public BUILDER m8614E(REQUEST request) {
        this.f8208f = request;
        return (BUILDER) m8632r();
    }

    @Override // p631t4.InterfaceC44689d
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public BUILDER mo8617a(InterfaceC44686a interfaceC44686a) {
        this.f8218p = interfaceC44686a;
        return (BUILDER) m8632r();
    }

    /* JADX INFO: renamed from: G */
    public void m8616G() {
        boolean z11 = true;
        C45708h.m100899j(this.f8209g == null || this.f8207e == null, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        if (this.f8211i != null && (this.f8209g != null || this.f8207e != null || this.f8208f != null)) {
            z11 = false;
        }
        C45708h.m100899j(z11, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
    }

    /* JADX INFO: renamed from: f */
    public Object m8620f() {
        return this.f8206d;
    }

    /* JADX INFO: renamed from: g */
    public String m8621g() {
        return this.f8217o;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC45711k<InterfaceC37351b<IMAGE>> m8624j(InterfaceC44686a interfaceC44686a, String str, REQUEST request) {
        return m8625k(interfaceC44686a, str, request, CacheLevel.FULL_FETCH);
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC45711k<InterfaceC37351b<IMAGE>> m8626l(InterfaceC44686a interfaceC44686a, String str, REQUEST[] requestArr, boolean z11) {
        ArrayList arrayList = new ArrayList(requestArr.length * 2);
        if (z11) {
            for (REQUEST request : requestArr) {
                arrayList.add(m8625k(interfaceC44686a, str, request, CacheLevel.BITMAP_MEMORY_CACHE));
            }
        }
        for (REQUEST request2 : requestArr) {
            arrayList.add(m8624j(interfaceC44686a, str, request2));
        }
        return C37354e.m83955b(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public REQUEST[] m8627m() {
        return this.f8209g;
    }

    /* JADX INFO: renamed from: n */
    public REQUEST m8628n() {
        return this.f8207e;
    }

    /* JADX INFO: renamed from: o */
    public REQUEST m8629o() {
        return this.f8208f;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC44686a m8630p() {
        return this.f8218p;
    }

    /* JADX INFO: renamed from: q */
    public boolean m8631q() {
        return this.f8215m;
    }

    /* JADX INFO: renamed from: t */
    public boolean m8634t() {
        return this.f8216n;
    }

    /* JADX INFO: renamed from: u */
    public void m8635u(AbstractC42954a abstractC42954a) {
        Set<InterfaceC42956c> set = this.f8204b;
        if (set != null) {
            Iterator<InterfaceC42956c> it = set.iterator();
            while (it.hasNext()) {
                abstractC42954a.m94323j(it.next());
            }
        }
        Set<ControllerListener2> set2 = this.f8205c;
        if (set2 != null) {
            Iterator<ControllerListener2> it2 = set2.iterator();
            while (it2.hasNext()) {
                abstractC42954a.m94324k(it2.next());
            }
        }
        InterfaceC42956c<? super INFO> interfaceC42956c = this.f8212j;
        if (interfaceC42956c != null) {
            abstractC42954a.m94323j(interfaceC42956c);
        }
        if (this.f8214l) {
            abstractC42954a.m94323j(f8200q);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m8637w(AbstractC42954a abstractC42954a) {
        if (this.f8213k) {
            abstractC42954a.m94288A().m93674d(this.f8213k);
            m8636v(abstractC42954a);
        }
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC45711k<InterfaceC37351b<IMAGE>> m8639y(InterfaceC44686a interfaceC44686a, String str) {
        InterfaceC45711k<InterfaceC37351b<IMAGE>> interfaceC45711kM8626l;
        InterfaceC45711k<InterfaceC37351b<IMAGE>> interfaceC45711k = this.f8211i;
        if (interfaceC45711k != null) {
            return interfaceC45711k;
        }
        REQUEST request = this.f8207e;
        if (request != null) {
            interfaceC45711kM8626l = m8624j(interfaceC44686a, str, request);
        } else {
            REQUEST[] requestArr = this.f8209g;
            interfaceC45711kM8626l = requestArr != null ? m8626l(interfaceC44686a, str, requestArr, this.f8210h) : null;
        }
        if (interfaceC45711kM8626l != null && this.f8208f != null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(interfaceC45711kM8626l);
            arrayList.add(m8624j(interfaceC44686a, str, this.f8208f));
            interfaceC45711kM8626l = C37356g.m83970c(arrayList, false);
        }
        return interfaceC45711kM8626l == null ? C37352c.m83951a(f8201r) : interfaceC45711kM8626l;
    }

    public AbstractDraweeControllerBuilder(Context context, Set<InterfaceC42956c> set, Set<ControllerListener2> set2) {
        this.f8203a = context;
        this.f8204b = set;
        this.f8205c = set2;
        m8633s();
    }

    @Override // p631t4.InterfaceC44689d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public AbstractC42954a build() {
        REQUEST request;
        m8616G();
        if (this.f8207e == null && this.f8209g == null && (request = this.f8208f) != null) {
            this.f8207e = request;
            this.f8208f = null;
        }
        return m8619d();
    }

    /* JADX INFO: renamed from: d */
    public AbstractC42954a m8619d() {
        if (C36621b.m81959d()) {
            C36621b.m81957a("AbstractDraweeControllerBuilder#buildController");
        }
        AbstractC42954a abstractC42954aMo8638x = mo8638x();
        abstractC42954aMo8638x.m94317d0(m8634t());
        abstractC42954aMo8638x.m94319e0(m8631q());
        abstractC42954aMo8638x.m94309Z(m8621g());
        m8622h();
        abstractC42954aMo8638x.m94313b0(null);
        m8637w(abstractC42954aMo8638x);
        m8635u(abstractC42954aMo8638x);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
        return abstractC42954aMo8638x;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC45711k<InterfaceC37351b<IMAGE>> m8625k(InterfaceC44686a interfaceC44686a, String str, REQUEST request, CacheLevel cacheLevel) {
        return new C5572b(interfaceC44686a, str, request, m8620f(), cacheLevel);
    }

    /* JADX INFO: renamed from: v */
    public void m8636v(AbstractC42954a abstractC42954a) {
        if (abstractC42954a.m94331u() == null) {
            abstractC42954a.m94315c0(C44311a.m97760c(this.f8203a));
        }
    }

    /* JADX INFO: renamed from: z */
    public BUILDER m8640z() {
        m8633s();
        return (BUILDER) m8632r();
    }

    /* JADX INFO: renamed from: r */
    public final BUILDER m8632r() {
        return this;
    }
}
