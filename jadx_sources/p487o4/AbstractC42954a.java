package p487o4;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.fresco.p061ui.common.ControllerListener2;
import com.facebook.fresco.p061ui.common.ForwardingControllerListener2;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import java.util.Map;
import java.util.concurrent.Executor;
import p192d6.C36621b;
import p251f4.AbstractC37350a;
import p251f4.InterfaceC37351b;
import p252f5.C37359a;
import p283g5.InterfaceC37812e;
import p462n4.AbstractC42743a;
import p462n4.C42745c;
import p584r4.C43921a;
import p616s4.C44311a;
import p631t4.InterfaceC44686a;
import p631t4.InterfaceC44687b;
import p631t4.InterfaceC44688c;
import p712w3.C45706f;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: o4.a */
/* JADX INFO: compiled from: AbstractDraweeController.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC42954a<T, INFO> implements InterfaceC44686a, AbstractC42743a.a, C44311a.a {

    /* JADX INFO: renamed from: w */
    public static final Map<String, Object> f95060w = ImmutableMap.m8533of("component_tag", "drawee");

    /* JADX INFO: renamed from: x */
    public static final Map<String, Object> f95061x = ImmutableMap.m8534of("origin", "memory_bitmap", HasExtraData.Companion.KEY_ORIGIN_SUBCATEGORY, "shortcut");

    /* JADX INFO: renamed from: y */
    public static final Class<?> f95062y = AbstractC42954a.class;

    /* JADX INFO: renamed from: b */
    public final AbstractC42743a f95064b;

    /* JADX INFO: renamed from: c */
    public final Executor f95065c;

    /* JADX INFO: renamed from: d */
    public C42745c f95066d;

    /* JADX INFO: renamed from: e */
    public C44311a f95067e;

    /* JADX INFO: renamed from: f */
    public InterfaceC42956c<INFO> f95068f;

    /* JADX INFO: renamed from: h */
    public InterfaceC44688c f95070h;

    /* JADX INFO: renamed from: i */
    public Drawable f95071i;

    /* JADX INFO: renamed from: j */
    public String f95072j;

    /* JADX INFO: renamed from: k */
    public Object f95073k;

    /* JADX INFO: renamed from: l */
    public boolean f95074l;

    /* JADX INFO: renamed from: m */
    public boolean f95075m;

    /* JADX INFO: renamed from: n */
    public boolean f95076n;

    /* JADX INFO: renamed from: o */
    public boolean f95077o;

    /* JADX INFO: renamed from: p */
    public boolean f95078p;

    /* JADX INFO: renamed from: q */
    public String f95079q;

    /* JADX INFO: renamed from: r */
    public InterfaceC37351b<T> f95080r;

    /* JADX INFO: renamed from: s */
    public T f95081s;

    /* JADX INFO: renamed from: v */
    public Drawable f95084v;

    /* JADX INFO: renamed from: a */
    public final DraweeEventTracker f95063a = DraweeEventTracker.m8607a();

    /* JADX INFO: renamed from: g */
    public ForwardingControllerListener2<INFO> f95069g = new ForwardingControllerListener2<>();

    /* JADX INFO: renamed from: t */
    public boolean f95082t = true;

    /* JADX INFO: renamed from: u */
    public boolean f95083u = false;

    /* JADX INFO: renamed from: o4.a$a */
    /* JADX INFO: compiled from: AbstractDraweeController.java */
    public class a extends AbstractC37350a<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f95085a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f95086b;

        public a(String str, boolean z11) {
            this.f95085a = str;
            this.f95086b = z11;
        }

        @Override // p251f4.AbstractC37350a
        public void onFailureImpl(InterfaceC37351b<T> interfaceC37351b) {
            AbstractC42954a.this.m94298L(this.f95085a, interfaceC37351b, interfaceC37351b.mo8590c(), true);
        }

        @Override // p251f4.AbstractC37350a
        public void onNewResultImpl(InterfaceC37351b<T> interfaceC37351b) {
            boolean zIsFinished = interfaceC37351b.isFinished();
            boolean zMo8591d = interfaceC37351b.mo8591d();
            float progress = interfaceC37351b.getProgress();
            T result = interfaceC37351b.getResult();
            if (result != null) {
                AbstractC42954a.this.m94299N(this.f95085a, interfaceC37351b, result, progress, zIsFinished, this.f95086b, zMo8591d);
            } else if (zIsFinished) {
                AbstractC42954a.this.m94298L(this.f95085a, interfaceC37351b, new NullPointerException(), true);
            }
        }

        @Override // p251f4.AbstractC37350a, p251f4.InterfaceC37353d
        public void onProgressUpdate(InterfaceC37351b<T> interfaceC37351b) {
            boolean zIsFinished = interfaceC37351b.isFinished();
            AbstractC42954a.this.m94300O(this.f95085a, interfaceC37351b, interfaceC37351b.getProgress(), zIsFinished);
        }
    }

    /* JADX INFO: renamed from: C */
    public final synchronized void m94290C(String str, Object obj) {
        AbstractC42743a abstractC42743a;
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("AbstractDraweeController#init");
            }
            this.f95063a.m8608b(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
            if (!this.f95082t && (abstractC42743a = this.f95064b) != null) {
                abstractC42743a.mo93664a(this);
            }
            this.f95074l = false;
            this.f95076n = false;
            m94301Q();
            this.f95078p = false;
            C42745c c42745c = this.f95066d;
            if (c42745c != null) {
                c42745c.m93671a();
            }
            C44311a c44311a = this.f95067e;
            if (c44311a != null) {
                c44311a.m97761a();
                this.f95067e.m97765f(this);
            }
            InterfaceC42956c<INFO> interfaceC42956c = this.f95068f;
            if (interfaceC42956c instanceof b) {
                ((b) interfaceC42956c).m94337b();
            } else {
                this.f95068f = null;
            }
            InterfaceC44688c interfaceC44688c = this.f95070h;
            if (interfaceC44688c != null) {
                interfaceC44688c.reset();
                this.f95070h.mo96760c(null);
                this.f95070h = null;
            }
            this.f95071i = null;
            if (C45999a.m101517w(2)) {
                C45999a.m101480A(f95062y, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f95072j, str);
            }
            this.f95072j = str;
            this.f95073k = obj;
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: E */
    public final boolean m94292E(String str, InterfaceC37351b<T> interfaceC37351b) {
        if (interfaceC37351b == null && this.f95080r == null) {
            return true;
        }
        return str.equals(this.f95072j) && interfaceC37351b == this.f95080r && this.f95075m;
    }

    /* JADX INFO: renamed from: G */
    public final void m94294G(String str, Throwable th2) {
        if (C45999a.m101517w(2)) {
            C45999a.m101481B(f95062y, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f95072j, str, th2);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m94295H(String str, T t11) {
        if (C45999a.m101517w(2)) {
            C45999a.m101482C(f95062y, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f95072j, str, m94333w(t11), Integer.valueOf(mo89556x(t11)));
        }
    }

    /* JADX INFO: renamed from: K */
    public abstract Map<String, Object> mo89534K(INFO info);

    /* JADX INFO: renamed from: P */
    public abstract void mo89536P(Drawable drawable);

    /* JADX INFO: renamed from: R */
    public abstract void mo89537R(T t11);

    /* JADX INFO: renamed from: T */
    public final void m94303T(Throwable th2, InterfaceC37351b<T> interfaceC37351b) {
        ControllerListener2.Extras extrasM94296I = m94296I(interfaceC37351b, null, null);
        m94327p().onFailure(this.f95072j, th2);
        m94328q().mo8839j(this.f95072j, th2, extrasM94296I);
    }

    @Override // p616s4.C44311a.a
    /* JADX INFO: renamed from: a */
    public boolean mo94310a() {
        if (C45999a.m101517w(2)) {
            C45999a.m101520z(f95062y, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.f95072j);
        }
        if (!m94321g0()) {
            return false;
        }
        this.f95066d.m93672b();
        this.f95070h.reset();
        m94322h0();
        return true;
    }

    @Override // p631t4.InterfaceC44686a
    /* JADX INFO: renamed from: b */
    public boolean mo94312b(MotionEvent motionEvent) {
        if (C45999a.m101517w(2)) {
            C45999a.m101480A(f95062y, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f95072j, motionEvent);
        }
        C44311a c44311a = this.f95067e;
        if (c44311a == null) {
            return false;
        }
        if (!c44311a.m97762b() && !m94320f0()) {
            return false;
        }
        this.f95067e.m97763d(motionEvent);
        return true;
    }

    @Override // p631t4.InterfaceC44686a
    /* JADX INFO: renamed from: f */
    public void mo89538f(InterfaceC44687b interfaceC44687b) {
        if (C45999a.m101517w(2)) {
            C45999a.m101480A(f95062y, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f95072j, interfaceC44687b);
        }
        this.f95063a.m8608b(interfaceC44687b != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.f95075m) {
            this.f95064b.mo93664a(this);
            release();
        }
        InterfaceC44688c interfaceC44688c = this.f95070h;
        if (interfaceC44688c != null) {
            interfaceC44688c.mo96760c(null);
            this.f95070h = null;
        }
        if (interfaceC44687b != null) {
            C45708h.m100891b(Boolean.valueOf(interfaceC44687b instanceof InterfaceC44688c));
            InterfaceC44688c interfaceC44688c2 = (InterfaceC44688c) interfaceC44687b;
            this.f95070h = interfaceC44688c2;
            interfaceC44688c2.mo96760c(this.f95071i);
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract Drawable mo89541l(T t11);

    /* JADX INFO: renamed from: n */
    public T mo89544n() {
        return null;
    }

    /* JADX INFO: renamed from: s */
    public abstract InterfaceC37351b<T> mo89550s();

    /* JADX INFO: renamed from: y */
    public abstract INFO mo89558y(T t11);

    /* JADX INFO: renamed from: z */
    public Uri mo89560z() {
        return null;
    }

    /* JADX INFO: renamed from: o4.a$b */
    /* JADX INFO: compiled from: AbstractDraweeController.java */
    public static class b<INFO> extends C42958e<INFO> {
        /* JADX INFO: renamed from: d */
        public static <INFO> b<INFO> m94334d(InterfaceC42956c<? super INFO> interfaceC42956c, InterfaceC42956c<? super INFO> interfaceC42956c2) {
            if (C36621b.m81959d()) {
                C36621b.m81957a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.m94336a(interfaceC42956c);
            bVar.m94336a(interfaceC42956c2);
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            return bVar;
        }
    }

    /* JADX INFO: renamed from: A */
    public C42745c m94288A() {
        if (this.f95066d == null) {
            this.f95066d = new C42745c();
        }
        return this.f95066d;
    }

    /* JADX INFO: renamed from: B */
    public final InterfaceC44688c m94289B() {
        InterfaceC44688c interfaceC44688c = this.f95070h;
        if (interfaceC44688c != null) {
            return interfaceC44688c;
        }
        throw new IllegalStateException("mSettableDraweeHierarchy is null; Caller context: " + this.f95073k);
    }

    /* JADX INFO: renamed from: F */
    public boolean m94293F() {
        return this.f95083u;
    }

    /* JADX INFO: renamed from: I */
    public final ControllerListener2.Extras m94296I(InterfaceC37351b<T> interfaceC37351b, INFO info, Uri uri) {
        return m94297J(interfaceC37351b == null ? null : interfaceC37351b.getExtras(), mo89534K(info), uri);
    }

    /* JADX INFO: renamed from: J */
    public final ControllerListener2.Extras m94297J(Map<String, Object> map, Map<String, Object> map2, Uri uri) {
        String str;
        PointF pointFM96769l;
        InterfaceC44688c interfaceC44688c = this.f95070h;
        if (interfaceC44688c instanceof C43921a) {
            C43921a c43921a = (C43921a) interfaceC44688c;
            String strValueOf = String.valueOf(c43921a.m96770m());
            pointFM96769l = c43921a.m96769l();
            str = strValueOf;
        } else {
            str = null;
            pointFM96769l = null;
        }
        return C37359a.m83988a(f95060w, f95061x, map, null, m94330t(), str, pointFM96769l, map2, m94326o(), m94293F(), uri);
    }

    /* JADX INFO: renamed from: Q */
    public final void m94301Q() {
        Map<String, Object> extras;
        boolean z11 = this.f95075m;
        this.f95075m = false;
        this.f95077o = false;
        InterfaceC37351b<T> interfaceC37351b = this.f95080r;
        Map<String, Object> map = null;
        if (interfaceC37351b != null) {
            extras = interfaceC37351b.getExtras();
            this.f95080r.close();
            this.f95080r = null;
        } else {
            extras = null;
        }
        Drawable drawable = this.f95084v;
        if (drawable != null) {
            mo89536P(drawable);
        }
        if (this.f95079q != null) {
            this.f95079q = null;
        }
        this.f95084v = null;
        T t11 = this.f95081s;
        if (t11 != null) {
            Map<String, Object> mapMo89534K = mo89534K(mo89558y(t11));
            m94295H("release", this.f95081s);
            mo89537R(this.f95081s);
            this.f95081s = null;
            map = mapMo89534K;
        }
        if (z11) {
            m94306W(extras, map);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m94302S(ControllerListener2<INFO> controllerListener2) {
        this.f95069g.m8843m(controllerListener2);
    }

    /* JADX INFO: renamed from: Z */
    public void m94309Z(String str) {
        this.f95079q = str;
    }

    /* JADX INFO: renamed from: a0 */
    public void m94311a0(Drawable drawable) {
        this.f95071i = drawable;
        InterfaceC44688c interfaceC44688c = this.f95070h;
        if (interfaceC44688c != null) {
            interfaceC44688c.mo96760c(drawable);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m94315c0(C44311a c44311a) {
        this.f95067e = c44311a;
        if (c44311a != null) {
            c44311a.m97765f(this);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m94317d0(boolean z11) {
        this.f95083u = z11;
    }

    @Override // p631t4.InterfaceC44686a
    /* JADX INFO: renamed from: e */
    public InterfaceC44687b mo94318e() {
        return this.f95070h;
    }

    /* JADX INFO: renamed from: e0 */
    public void m94319e0(boolean z11) {
        this.f95078p = z11;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m94321g0() {
        C42745c c42745c;
        return this.f95077o && (c42745c = this.f95066d) != null && c42745c.m93675e();
    }

    /* JADX INFO: renamed from: k */
    public void m94324k(ControllerListener2<INFO> controllerListener2) {
        this.f95069g.m8842l(controllerListener2);
    }

    /* JADX INFO: renamed from: m */
    public Animatable m94325m() {
        Object obj = this.f95084v;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public Object m94326o() {
        return this.f95073k;
    }

    /* JADX INFO: renamed from: p */
    public InterfaceC42956c<INFO> m94327p() {
        InterfaceC42956c<INFO> interfaceC42956c = this.f95068f;
        return interfaceC42956c == null ? C42955b.m94335a() : interfaceC42956c;
    }

    /* JADX INFO: renamed from: q */
    public ControllerListener2<INFO> m94328q() {
        return this.f95069g;
    }

    /* JADX INFO: renamed from: r */
    public Drawable m94329r() {
        return this.f95071i;
    }

    @Override // p462n4.AbstractC42743a.a
    public void release() {
        this.f95063a.m8608b(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        C42745c c42745c = this.f95066d;
        if (c42745c != null) {
            c42745c.m93673c();
        }
        C44311a c44311a = this.f95067e;
        if (c44311a != null) {
            c44311a.m97764e();
        }
        InterfaceC44688c interfaceC44688c = this.f95070h;
        if (interfaceC44688c != null) {
            interfaceC44688c.reset();
        }
        m94301Q();
    }

    /* JADX INFO: renamed from: t */
    public final Rect m94330t() {
        InterfaceC44688c interfaceC44688c = this.f95070h;
        if (interfaceC44688c == null) {
            return null;
        }
        return interfaceC44688c.getBounds();
    }

    /* JADX INFO: renamed from: u */
    public C44311a m94331u() {
        return this.f95067e;
    }

    /* JADX INFO: renamed from: v */
    public String m94332v() {
        return this.f95072j;
    }

    /* JADX INFO: renamed from: w */
    public String m94333w(T t11) {
        return t11 != null ? t11.getClass().getSimpleName() : "<null>";
    }

    public AbstractC42954a(AbstractC42743a abstractC42743a, Executor executor, String str, Object obj) {
        this.f95064b = abstractC42743a;
        this.f95065c = executor;
        m94290C(str, obj);
    }

    /* JADX INFO: renamed from: D */
    public void m94291D(String str, Object obj) {
        m94290C(str, obj);
        this.f95082t = false;
        this.f95083u = false;
    }

    /* JADX INFO: renamed from: L */
    public final void m94298L(String str, InterfaceC37351b<T> interfaceC37351b, Throwable th2, boolean z11) {
        DraweeEventTracker.Event event;
        Drawable drawable;
        if (C36621b.m81959d()) {
            C36621b.m81957a("AbstractDraweeController#onFailureInternal");
        }
        if (!m94292E(str, interfaceC37351b)) {
            m94294G("ignore_old_datasource @ onFailure", th2);
            interfaceC37351b.close();
            if (C36621b.m81959d()) {
                C36621b.m81958b();
                return;
            }
            return;
        }
        DraweeEventTracker draweeEventTracker = this.f95063a;
        if (z11) {
            event = DraweeEventTracker.Event.ON_DATASOURCE_FAILURE;
        } else {
            event = DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT;
        }
        draweeEventTracker.m8608b(event);
        if (z11) {
            m94294G("final_failed @ onFailure", th2);
            this.f95080r = null;
            this.f95077o = true;
            InterfaceC44688c interfaceC44688c = this.f95070h;
            if (interfaceC44688c != null) {
                if (this.f95078p && (drawable = this.f95084v) != null) {
                    interfaceC44688c.mo96763f(drawable, 1.0f, true);
                } else if (m94321g0()) {
                    interfaceC44688c.mo96758a(th2);
                } else {
                    interfaceC44688c.mo96761d(th2);
                }
            }
            m94303T(th2, interfaceC37351b);
        } else {
            m94294G("intermediate_failed @ onFailure", th2);
            m94304U(th2);
        }
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m94299N(String str, InterfaceC37351b<T> interfaceC37351b, T t11, float f11, boolean z11, boolean z12, boolean z13) {
        DraweeEventTracker.Event event;
        try {
            if (C36621b.m81959d()) {
                C36621b.m81957a("AbstractDraweeController#onNewResultInternal");
            }
            if (!m94292E(str, interfaceC37351b)) {
                m94295H("ignore_old_datasource @ onNewResult", t11);
                mo89537R(t11);
                interfaceC37351b.close();
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                    return;
                }
                return;
            }
            DraweeEventTracker draweeEventTracker = this.f95063a;
            if (z11) {
                event = DraweeEventTracker.Event.ON_DATASOURCE_RESULT;
            } else {
                event = DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT;
            }
            draweeEventTracker.m8608b(event);
            try {
                Drawable drawableMo89541l = mo89541l(t11);
                T t12 = this.f95081s;
                Drawable drawable = this.f95084v;
                this.f95081s = t11;
                this.f95084v = drawableMo89541l;
                try {
                    if (z11) {
                        m94295H("set_final_result @ onNewResult", t11);
                        this.f95080r = null;
                        m94289B().mo96763f(drawableMo89541l, 1.0f, z12);
                        m94308Y(str, t11, interfaceC37351b);
                    } else if (z13) {
                        m94295H("set_temporary_result @ onNewResult", t11);
                        m94289B().mo96763f(drawableMo89541l, 1.0f, z12);
                        m94308Y(str, t11, interfaceC37351b);
                    } else {
                        m94295H("set_intermediate_result @ onNewResult", t11);
                        m94289B().mo96763f(drawableMo89541l, f11, z12);
                        m94305V(str, t11);
                    }
                    if (drawable != null && drawable != drawableMo89541l) {
                        mo89536P(drawable);
                    }
                    if (t12 != null && t12 != t11) {
                        m94295H("release_previous_result @ onNewResult", t12);
                        mo89537R(t12);
                    }
                    if (C36621b.m81959d()) {
                        C36621b.m81958b();
                    }
                } catch (Throwable th2) {
                    if (drawable != null && drawable != drawableMo89541l) {
                        mo89536P(drawable);
                    }
                    if (t12 != null && t12 != t11) {
                        m94295H("release_previous_result @ onNewResult", t12);
                        mo89537R(t12);
                    }
                    throw th2;
                }
            } catch (Exception e11) {
                m94295H("drawable_failed @ onNewResult", t11);
                mo89537R(t11);
                m94298L(str, interfaceC37351b, e11, z11);
                if (C36621b.m81959d()) {
                    C36621b.m81958b();
                }
            }
        } catch (Throwable th3) {
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m94300O(String str, InterfaceC37351b<T> interfaceC37351b, float f11, boolean z11) {
        if (!m94292E(str, interfaceC37351b)) {
            m94294G("ignore_old_datasource @ onProgress", null);
            interfaceC37351b.close();
        } else if (!z11) {
            this.f95070h.mo96762e(f11, false);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m94304U(Throwable th2) {
        m94327p().onIntermediateImageFailed(this.f95072j, th2);
        m94328q().mo8835a(this.f95072j);
    }

    /* JADX INFO: renamed from: V */
    public final void m94305V(String str, T t11) {
        INFO infoMo89558y = mo89558y(t11);
        m94327p().onIntermediateImageSet(str, infoMo89558y);
        m94328q().onIntermediateImageSet(str, infoMo89558y);
    }

    /* JADX INFO: renamed from: W */
    public final void m94306W(Map<String, Object> map, Map<String, Object> map2) {
        m94327p().onRelease(this.f95072j);
        m94328q().mo8837h(this.f95072j, m94297J(map, map2, null));
    }

    /* JADX INFO: renamed from: X */
    public void m94307X(InterfaceC37351b<T> interfaceC37351b, INFO info) {
        m94327p().onSubmit(this.f95072j, this.f95073k);
        m94328q().mo8838i(this.f95072j, this.f95073k, m94296I(interfaceC37351b, info, mo89560z()));
    }

    /* JADX INFO: renamed from: Y */
    public final void m94308Y(String str, T t11, InterfaceC37351b<T> interfaceC37351b) {
        INFO infoMo89558y = mo89558y(t11);
        m94327p().onFinalImageSet(str, infoMo89558y, m94325m());
        m94328q().mo8836g(str, infoMo89558y, m94296I(interfaceC37351b, infoMo89558y, null));
    }

    @Override // p631t4.InterfaceC44686a
    /* JADX INFO: renamed from: c */
    public void mo94314c() {
        String str;
        if (C36621b.m81959d()) {
            C36621b.m81957a("AbstractDraweeController#onAttach");
        }
        if (C45999a.m101517w(2)) {
            Class<?> cls = f95062y;
            Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
            String str2 = this.f95072j;
            if (this.f95075m) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            C45999a.m101480A(cls, "controller %x %s: onAttach: %s", numValueOf, str2, str);
        }
        this.f95063a.m8608b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        C45708h.m100896g(this.f95070h);
        this.f95064b.mo93664a(this);
        this.f95074l = true;
        if (!this.f95075m) {
            m94322h0();
        }
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    @Override // p631t4.InterfaceC44686a
    /* JADX INFO: renamed from: d */
    public void mo94316d() {
        if (C36621b.m81959d()) {
            C36621b.m81957a("AbstractDraweeController#onDetach");
        }
        if (C45999a.m101517w(2)) {
            C45999a.m101520z(f95062y, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.f95072j);
        }
        this.f95063a.m8608b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.f95074l = false;
        this.f95064b.mo93665d(this);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m94320f0() {
        return m94321g0();
    }

    /* JADX INFO: renamed from: h0 */
    public void m94322h0() {
        if (C36621b.m81959d()) {
            C36621b.m81957a("AbstractDraweeController#submitRequest");
        }
        T tMo89544n = mo89544n();
        if (tMo89544n != null) {
            if (C36621b.m81959d()) {
                C36621b.m81957a("AbstractDraweeController#submitRequest->cache");
            }
            this.f95080r = null;
            this.f95075m = true;
            this.f95077o = false;
            this.f95063a.m8608b(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
            m94307X(this.f95080r, mo89558y(tMo89544n));
            mo89535M(this.f95072j, tMo89544n);
            m94299N(this.f95072j, this.f95080r, tMo89544n, 1.0f, true, true, true);
            if (C36621b.m81959d()) {
                C36621b.m81958b();
            }
            if (C36621b.m81959d()) {
                C36621b.m81958b();
                return;
            }
            return;
        }
        this.f95063a.m8608b(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
        this.f95070h.mo96762e(0.0f, true);
        this.f95075m = true;
        this.f95077o = false;
        InterfaceC37351b<T> interfaceC37351bMo89550s = mo89550s();
        this.f95080r = interfaceC37351bMo89550s;
        m94307X(interfaceC37351bMo89550s, null);
        if (C45999a.m101517w(2)) {
            C45999a.m101480A(f95062y, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f95072j, Integer.valueOf(System.identityHashCode(this.f95080r)));
        }
        this.f95080r.mo8589b(new a(this.f95072j, this.f95080r.mo8588a()), this.f95065c);
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m94323j(InterfaceC42956c<? super INFO> interfaceC42956c) {
        C45708h.m100896g(interfaceC42956c);
        InterfaceC42956c<INFO> interfaceC42956c2 = this.f95068f;
        if (interfaceC42956c2 instanceof b) {
            ((b) interfaceC42956c2).m94336a(interfaceC42956c);
        } else if (interfaceC42956c2 != null) {
            this.f95068f = b.m94334d(interfaceC42956c2, interfaceC42956c);
        } else {
            this.f95068f = interfaceC42956c;
        }
    }

    public String toString() {
        return C45706f.m100884b(this).m100887c("isAttached", this.f95074l).m100887c("isRequestSubmitted", this.f95075m).m100887c("hasFetchFailed", this.f95077o).m100885a("fetchedImage", mo89556x(this.f95081s)).m100886b(DbParams.TABLE_EVENTS, this.f95063a.toString()).toString();
    }

    /* JADX INFO: renamed from: x */
    public int mo89556x(T t11) {
        return System.identityHashCode(t11);
    }

    /* JADX INFO: renamed from: b0 */
    public void m94313b0(InterfaceC42957d interfaceC42957d) {
    }

    public void setLoggingListener(InterfaceC37812e interfaceC37812e) {
    }

    /* JADX INFO: renamed from: M */
    public void mo89535M(String str, T t11) {
    }
}
