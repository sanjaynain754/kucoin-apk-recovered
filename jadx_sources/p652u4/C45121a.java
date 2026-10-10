package p652u4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.drawable.InterfaceC5585f0;
import com.facebook.drawee.drawable.InterfaceC5587g0;
import com.sensorsdata.analytics.android.sdk.data.adapter.DbParams;
import p631t4.InterfaceC44686a;
import p631t4.InterfaceC44687b;
import p712w3.C45706f;
import p712w3.C45708h;
import p747x3.C45999a;

/* JADX INFO: renamed from: u4.a */
/* JADX INFO: compiled from: DraweeHolder.java */
/* JADX INFO: loaded from: classes34.dex */
public class C45121a<DH extends InterfaceC44687b> implements InterfaceC5587g0 {

    /* JADX INFO: renamed from: e */
    public DH f101540e;

    /* JADX INFO: renamed from: b */
    public boolean f101537b = false;

    /* JADX INFO: renamed from: c */
    public boolean f101538c = false;

    /* JADX INFO: renamed from: d */
    public boolean f101539d = true;

    /* JADX INFO: renamed from: f */
    public InterfaceC44686a f101541f = null;

    /* JADX INFO: renamed from: g */
    public final DraweeEventTracker f101542g = DraweeEventTracker.m8607a();

    /* JADX INFO: renamed from: o */
    public void m99740o() {
        m99741p(null);
    }

    /* JADX INFO: renamed from: d */
    public static <DH extends InterfaceC44687b> C45121a<DH> m99727d(DH dh2, Context context) {
        C45121a<DH> c45121a = new C45121a<>(dh2);
        c45121a.m99739n(context);
        return c45121a;
    }

    /* JADX INFO: renamed from: a */
    public final void m99728a() {
        if (this.f101537b) {
            return;
        }
        this.f101542g.m8608b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.f101537b = true;
        InterfaceC44686a interfaceC44686a = this.f101541f;
        if (interfaceC44686a == null || interfaceC44686a.mo94318e() == null) {
            return;
        }
        this.f101541f.mo94314c();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5587g0
    /* JADX INFO: renamed from: b */
    public void mo8684b(boolean z11) {
        if (this.f101539d == z11) {
            return;
        }
        this.f101542g.m8608b(z11 ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.f101539d = z11;
        m99729c();
    }

    /* JADX INFO: renamed from: c */
    public final void m99729c() {
        if (this.f101538c && this.f101539d) {
            m99728a();
        } else {
            m99730e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m99730e() {
        if (this.f101537b) {
            this.f101542g.m8608b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.f101537b = false;
            if (m99735j()) {
                this.f101541f.mo94316d();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC44686a m99731f() {
        return this.f101541f;
    }

    /* JADX INFO: renamed from: g */
    public DH m99732g() {
        return (DH) C45708h.m100896g(this.f101540e);
    }

    /* JADX INFO: renamed from: h */
    public Drawable m99733h() {
        DH dh2 = this.f101540e;
        if (dh2 == null) {
            return null;
        }
        return dh2.mo96759b();
    }

    /* JADX INFO: renamed from: i */
    public boolean m99734i() {
        return this.f101540e != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m99735j() {
        InterfaceC44686a interfaceC44686a = this.f101541f;
        return interfaceC44686a != null && interfaceC44686a.mo94318e() == this.f101540e;
    }

    /* JADX INFO: renamed from: k */
    public void m99736k() {
        this.f101542g.m8608b(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.f101538c = true;
        m99729c();
    }

    /* JADX INFO: renamed from: l */
    public void m99737l() {
        this.f101542g.m8608b(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.f101538c = false;
        m99729c();
    }

    @Override // com.facebook.drawee.drawable.InterfaceC5587g0
    public void onDraw() {
        if (this.f101537b) {
            return;
        }
        C45999a.m101486G(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f101541f)), toString());
        this.f101538c = true;
        this.f101539d = true;
        m99729c();
    }

    /* JADX INFO: renamed from: p */
    public void m99741p(InterfaceC44686a interfaceC44686a) {
        boolean z11 = this.f101537b;
        if (z11) {
            m99730e();
        }
        if (m99735j()) {
            this.f101542g.m8608b(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.f101541f.mo89538f(null);
        }
        this.f101541f = interfaceC44686a;
        if (interfaceC44686a != null) {
            this.f101542g.m8608b(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.f101541f.mo89538f(this.f101540e);
        } else {
            this.f101542g.m8608b(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z11) {
            m99728a();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m99742q(DH dh2) {
        this.f101542g.m8608b(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean zM99735j = m99735j();
        m99743r(null);
        DH dh3 = (DH) C45708h.m100896g(dh2);
        this.f101540e = dh3;
        Drawable drawableMo96759b = dh3.mo96759b();
        mo8684b(drawableMo96759b == null || drawableMo96759b.isVisible());
        m99743r(this);
        if (zM99735j) {
            this.f101541f.mo89538f(dh2);
        }
    }

    public C45121a(DH dh2) {
        if (dh2 != null) {
            m99742q(dh2);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m99738m(MotionEvent motionEvent) {
        if (!m99735j()) {
            return false;
        }
        return this.f101541f.mo94312b(motionEvent);
    }

    /* JADX INFO: renamed from: r */
    public final void m99743r(InterfaceC5587g0 interfaceC5587g0) {
        Object objM99733h = m99733h();
        if (objM99733h instanceof InterfaceC5585f0) {
            ((InterfaceC5585f0) objM99733h).mo8683g(interfaceC5587g0);
        }
    }

    public String toString() {
        return C45706f.m100884b(this).m100887c("controllerAttached", this.f101537b).m100887c("holderAttached", this.f101538c).m100887c("drawableVisible", this.f101539d).m100886b(DbParams.TABLE_EVENTS, this.f101542g.toString()).toString();
    }

    /* JADX INFO: renamed from: n */
    public void m99739n(Context context) {
    }
}
