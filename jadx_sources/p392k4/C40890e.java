package p392k4;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.drawable.C5574a;
import com.facebook.drawee.drawable.C5595o;
import com.facebook.drawee.drawable.InterfaceC5578c;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.imagepipeline.cache.InterfaceC5648f;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p006a4.AbstractC0110a;
import p192d6.C36621b;
import p251f4.InterfaceC37351b;
import p283g5.C37813f;
import p283g5.InterfaceC37809b;
import p358j4.InterfaceC40267a;
import p421l4.C42052a;
import p462n4.AbstractC42743a;
import p487o4.AbstractC42954a;
import p525p4.C43380a;
import p547q3.InterfaceC43595a;
import p548q4.C43609a;
import p631t4.InterfaceC44687b;
import p712w3.C45706f;
import p712w3.C45708h;
import p712w3.InterfaceC45711k;
import p714w5.InterfaceC45739a;
import p747x3.C45999a;
import p749x5.InterfaceC46071e;
import p749x5.InterfaceC46077k;
import p821z5.C46703b;
import p821z5.InterfaceC46705d;

/* JADX INFO: renamed from: k4.e */
/* JADX INFO: compiled from: PipelineDraweeController.java */
/* JADX INFO: loaded from: classes34.dex */
public class C40890e extends AbstractC42954a<AbstractC0110a<InterfaceC46071e>, InterfaceC46077k> {

    /* JADX INFO: renamed from: M */
    public static final Class<?> f90928M = C40890e.class;

    /* JADX INFO: renamed from: A */
    public final InterfaceC45739a f90929A;

    /* JADX INFO: renamed from: B */
    public final ImmutableList<InterfaceC45739a> f90930B;

    /* JADX INFO: renamed from: C */
    public final InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> f90931C;

    /* JADX INFO: renamed from: D */
    public InterfaceC43595a f90932D;

    /* JADX INFO: renamed from: E */
    public InterfaceC45711k<InterfaceC37351b<AbstractC0110a<InterfaceC46071e>>> f90933E;

    /* JADX INFO: renamed from: F */
    public boolean f90934F;

    /* JADX INFO: renamed from: G */
    public ImmutableList<InterfaceC45739a> f90935G;

    /* JADX INFO: renamed from: H */
    public C42052a f90936H;

    /* JADX INFO: renamed from: I */
    public Set<InterfaceC46705d> f90937I;

    /* JADX INFO: renamed from: J */
    public ImageRequest f90938J;

    /* JADX INFO: renamed from: K */
    public ImageRequest[] f90939K;

    /* JADX INFO: renamed from: L */
    public ImageRequest f90940L;

    /* JADX INFO: renamed from: z */
    public final Resources f90941z;

    public C40890e(Resources resources, AbstractC42743a abstractC42743a, InterfaceC45739a interfaceC45739a, Executor executor, InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f, ImmutableList<InterfaceC45739a> immutableList) {
        super(abstractC42743a, executor, null, null);
        this.f90941z = resources;
        this.f90929A = new C40886a(resources, interfaceC45739a);
        this.f90930B = immutableList;
        this.f90931C = interfaceC5648f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static C5595o m89531k0(Drawable drawable) {
        if (drawable == 0) {
            return null;
        }
        if (drawable instanceof C5595o) {
            return (C5595o) drawable;
        }
        if (drawable instanceof InterfaceC5578c) {
            return m89531k0(((InterfaceC5578c) drawable).getDrawable());
        }
        if (drawable instanceof C5574a) {
            C5574a c5574a = (C5574a) drawable;
            int iM8655d = c5574a.m8655d();
            for (int i11 = 0; i11 < iM8655d; i11++) {
                C5595o c5595oM89531k0 = m89531k0(c5574a.m8653b(i11));
                if (c5595oM89531k0 != null) {
                    return c5595oM89531k0;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public synchronized void m89539i0(InterfaceC46705d interfaceC46705d) {
        try {
            if (this.f90937I == null) {
                this.f90937I = new HashSet();
            }
            this.f90937I.add(interfaceC46705d);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: p0 */
    public synchronized InterfaceC46705d m89547p0() {
        Set<InterfaceC46705d> set = this.f90937I;
        if (set == null) {
            return null;
        }
        return new C46703b(set);
    }

    /* JADX INFO: renamed from: s0 */
    public synchronized void m89551s0(InterfaceC37809b interfaceC37809b, AbstractDraweeControllerBuilder<C40891f, ImageRequest, AbstractC0110a<InterfaceC46071e>, InterfaceC46077k> abstractDraweeControllerBuilder) {
        try {
            C42052a c42052a = this.f90936H;
            if (c42052a != null) {
                c42052a.m92257f();
            }
            if (interfaceC37809b != null) {
                if (this.f90936H == null) {
                    this.f90936H = new C42052a(AwakeTimeSinceBootClock.get(), this);
                }
                this.f90936H.m92254c(interfaceC37809b);
                this.f90936H.m92258g(true);
            }
            this.f90938J = abstractDraweeControllerBuilder.m8628n();
            this.f90939K = abstractDraweeControllerBuilder.m8627m();
            this.f90940L = abstractDraweeControllerBuilder.m8629o();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final Drawable m89552t0(ImmutableList<InterfaceC45739a> immutableList, InterfaceC46071e interfaceC46071e) {
        Drawable drawableCreateDrawable;
        if (immutableList == null) {
            return null;
        }
        for (InterfaceC45739a interfaceC45739a : immutableList) {
            if (interfaceC45739a.supportsImageType(interfaceC46071e) && (drawableCreateDrawable = interfaceC45739a.createDrawable(interfaceC46071e)) != null) {
                return drawableCreateDrawable;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public synchronized void m89559y0(InterfaceC46705d interfaceC46705d) {
        Set<InterfaceC46705d> set = this.f90937I;
        if (set == null) {
            return;
        }
        set.remove(interfaceC46705d);
    }

    /* JADX INFO: renamed from: A0 */
    public void m89532A0(boolean z11) {
        this.f90934F = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: P */
    public void mo89536P(Drawable drawable) {
        if (drawable instanceof InterfaceC40267a) {
            ((InterfaceC40267a) drawable).mo4953a();
        }
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int mo89556x(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
        if (abstractC0110a != null) {
            return abstractC0110a.m566m();
        }
        return 0;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m89548q0(InterfaceC45711k<InterfaceC37351b<AbstractC0110a<InterfaceC46071e>>> interfaceC45711k) {
        this.f90933E = interfaceC45711k;
        m89553u0(null);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m89553u0(InterfaceC46071e interfaceC46071e) {
        if (this.f90934F) {
            if (m94329r() == null) {
                C43380a c43380a = new C43380a();
                m94323j(new C43609a(c43380a));
                m94311a0(c43380a);
            }
            if (m94329r() instanceof C43380a) {
                m89533B0(interfaceC46071e, (C43380a) m94329r());
            }
        }
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public Map<String, Object> mo89534K(InterfaceC46077k interfaceC46077k) {
        if (interfaceC46077k == null) {
            return null;
        }
        return interfaceC46077k.getExtras();
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: z */
    public Uri mo89560z() {
        return C37813f.m85328a(this.f90938J, this.f90940L, this.f90939K, ImageRequest.REQUEST_TO_URI_FN);
    }

    /* JADX INFO: renamed from: z0 */
    public void m89561z0(ImmutableList<InterfaceC45739a> immutableList) {
        this.f90935G = immutableList;
    }

    /* JADX INFO: renamed from: B0 */
    public void m89533B0(InterfaceC46071e interfaceC46071e, C43380a c43380a) {
        C5595o c5595oM89531k0;
        c43380a.m95551j(m94332v());
        InterfaceC44687b interfaceC44687bMo94318e = mo94318e();
        InterfaceC5597q interfaceC5597qM8702l = null;
        if (interfaceC44687bMo94318e != null && (c5595oM89531k0 = m89531k0(interfaceC44687bMo94318e.mo96759b())) != null) {
            interfaceC5597qM8702l = c5595oM89531k0.m8702l();
        }
        c43380a.m95554m(interfaceC5597qM8702l);
        String strM89543m0 = m89543m0();
        if (strM89543m0 != null) {
            c43380a.m95544b("cc", strM89543m0);
        }
        if (interfaceC46071e != null) {
            c43380a.m95552k(interfaceC46071e.getWidth(), interfaceC46071e.getHeight());
            c43380a.m95553l(interfaceC46071e.getSizeInBytes());
        } else {
            c43380a.m95550i();
        }
    }

    @Override // p487o4.AbstractC42954a, p631t4.InterfaceC44686a
    /* JADX INFO: renamed from: f */
    public void mo89538f(InterfaceC44687b interfaceC44687b) {
        super.mo89538f(interfaceC44687b);
        m89553u0(null);
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public Drawable mo89541l(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("PipelineDraweeController#createDrawable");
            }
            C45708h.m100898i(AbstractC0110a.m557o(abstractC0110a));
            InterfaceC46071e interfaceC46071eM565l = abstractC0110a.m565l();
            m89553u0(interfaceC46071eM565l);
            Drawable drawableM89552t0 = m89552t0(this.f90935G, interfaceC46071eM565l);
            if (drawableM89552t0 != null) {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
                return drawableM89552t0;
            }
            Drawable drawableM89552t1 = m89552t0(this.f90930B, interfaceC46071eM565l);
            if (drawableM89552t1 != null) {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
                return drawableM89552t1;
            }
            Drawable drawableCreateDrawable = this.f90929A.createDrawable(interfaceC46071eM565l);
            if (drawableCreateDrawable != null) {
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
                return drawableCreateDrawable;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + interfaceC46071eM565l);
        } catch (Throwable th2) {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            throw th2;
        }
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public AbstractC0110a<InterfaceC46071e> mo89544n() {
        InterfaceC43595a interfaceC43595a;
        if (C36621b.m81959d()) {
            C36621b.m81957a("PipelineDraweeController#getCachedImage");
        }
        try {
            InterfaceC5648f<InterfaceC43595a, InterfaceC46071e> interfaceC5648f = this.f90931C;
            if (interfaceC5648f != null && (interfaceC43595a = this.f90932D) != null) {
                AbstractC0110a<InterfaceC46071e> abstractC0110a = interfaceC5648f.get(interfaceC43595a);
                if (abstractC0110a != null && !abstractC0110a.m565l().getQualityInfo().mo101589a()) {
                    abstractC0110a.close();
                    return null;
                }
                return abstractC0110a;
            }
            return null;
        } finally {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public String m89543m0() {
        Object objM94326o = m94326o();
        if (objM94326o == null) {
            return null;
        }
        return objM94326o.toString();
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public InterfaceC46077k mo89558y(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
        C45708h.m100898i(AbstractC0110a.m557o(abstractC0110a));
        return abstractC0110a.m565l().getImageInfo();
    }

    /* JADX INFO: renamed from: r0 */
    public void m89549r0(InterfaceC45711k<InterfaceC37351b<AbstractC0110a<InterfaceC46071e>>> interfaceC45711k, String str, InterfaceC43595a interfaceC43595a, Object obj, ImmutableList<InterfaceC45739a> immutableList) {
        if (C36621b.m81959d()) {
            C36621b.m81957a("PipelineDraweeController#initialize");
        }
        super.m94291D(str, obj);
        m89548q0(interfaceC45711k);
        this.f90932D = interfaceC43595a;
        m89561z0(immutableList);
        m89553u0(null);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: s */
    public InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> mo89550s() {
        if (C36621b.m81959d()) {
            C36621b.m81957a("PipelineDraweeController#getDataSource");
        }
        if (C45999a.m101517w(2)) {
            C45999a.m101519y(f90928M, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        InterfaceC37351b<AbstractC0110a<InterfaceC46071e>> interfaceC37351b = this.f90933E.get();
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
        return interfaceC37351b;
    }

    @Override // p487o4.AbstractC42954a
    public String toString() {
        return C45706f.m100884b(this).m100886b("super", super.toString()).m100886b("dataSourceSupplier", this.f90933E).toString();
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public void mo89535M(String str, AbstractC0110a<InterfaceC46071e> abstractC0110a) {
        super.mo89535M(str, abstractC0110a);
        synchronized (this) {
        }
    }

    @Override // p487o4.AbstractC42954a
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void mo89537R(AbstractC0110a<InterfaceC46071e> abstractC0110a) {
        AbstractC0110a.m555j(abstractC0110a);
    }
}
