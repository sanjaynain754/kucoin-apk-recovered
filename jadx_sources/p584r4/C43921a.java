package p584r4;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C5584f;
import com.facebook.drawee.drawable.C5586g;
import com.facebook.drawee.drawable.C5588h;
import com.facebook.drawee.drawable.C5595o;
import com.facebook.drawee.drawable.InterfaceC5578c;
import com.facebook.drawee.drawable.InterfaceC5597q;
import com.facebook.drawee.generic.C5607a;
import com.facebook.drawee.generic.RoundingParams;
import java.util.Iterator;
import p192d6.C36621b;
import p283g5.InterfaceC37814g;
import p631t4.InterfaceC44688c;
import p712w3.C45708h;

/* JADX INFO: renamed from: r4.a */
/* JADX INFO: compiled from: GenericDraweeHierarchy.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43921a implements InterfaceC44688c {

    /* JADX INFO: renamed from: a */
    public final Drawable f97088a;

    /* JADX INFO: renamed from: b */
    public final Resources f97089b;

    /* JADX INFO: renamed from: c */
    public RoundingParams f97090c;

    /* JADX INFO: renamed from: d */
    public final C43924d f97091d;

    /* JADX INFO: renamed from: e */
    public final C5584f f97092e;

    /* JADX INFO: renamed from: f */
    public final C5586g f97093f;

    /* JADX INFO: renamed from: j */
    public final void m96767j() {
        m96768k(1);
        m96768k(2);
        m96768k(3);
        m96768k(4);
        m96768k(5);
    }

    /* JADX INFO: renamed from: l */
    public PointF m96769l() {
        if (m96774q(2)) {
            return m96773p(2).m8701k();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC5597q m96770m() {
        if (m96774q(2)) {
            return m96773p(2).m8702l();
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public void m96780w(Drawable drawable, InterfaceC5597q interfaceC5597q) {
        m96778u(1, drawable);
        m96773p(1).m8704n(interfaceC5597q);
    }

    /* JADX INFO: renamed from: y */
    public void m96782y(Drawable drawable) {
        m96778u(3, drawable);
    }

    @Override // p631t4.InterfaceC44688c
    /* JADX INFO: renamed from: a */
    public void mo96758a(Throwable th2) {
        this.f97092e.m8669f();
        m96767j();
        if (this.f97092e.m8653b(4) != null) {
            m96766i(4);
        } else {
            m96766i(1);
        }
        this.f97092e.m8671h();
    }

    @Override // p631t4.InterfaceC44687b
    /* JADX INFO: renamed from: b */
    public Drawable mo96759b() {
        return this.f97091d;
    }

    @Override // p631t4.InterfaceC44688c
    /* JADX INFO: renamed from: c */
    public void mo96760c(Drawable drawable) {
        this.f97091d.m96826i(drawable);
    }

    @Override // p631t4.InterfaceC44688c
    /* JADX INFO: renamed from: d */
    public void mo96761d(Throwable th2) {
        this.f97092e.m8669f();
        m96767j();
        if (this.f97092e.m8653b(5) != null) {
            m96766i(5);
        } else {
            m96766i(1);
        }
        this.f97092e.m8671h();
    }

    @Override // p631t4.InterfaceC44688c
    /* JADX INFO: renamed from: e */
    public void mo96762e(float f11, boolean z11) {
        if (this.f97092e.m8653b(3) == null) {
            return;
        }
        this.f97092e.m8669f();
        m96781x(f11);
        if (z11) {
            this.f97092e.m8675l();
        }
        this.f97092e.m8671h();
    }

    @Override // p631t4.InterfaceC44688c
    /* JADX INFO: renamed from: f */
    public void mo96763f(Drawable drawable, float f11, boolean z11) {
        Drawable drawableM8729d = C5607a.m8729d(drawable, this.f97090c, this.f97089b);
        drawableM8729d.mutate();
        this.f97093f.setDrawable(drawableM8729d);
        this.f97092e.m8669f();
        m96767j();
        m96766i(2);
        m96781x(f11);
        if (z11) {
            this.f97092e.m8675l();
        }
        this.f97092e.m8671h();
    }

    @Override // p631t4.InterfaceC44687b
    public Rect getBounds() {
        return this.f97091d.getBounds();
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m96765h(Drawable drawable, InterfaceC5597q interfaceC5597q) {
        return C5607a.m8731f(C5607a.m8729d(drawable, this.f97090c, this.f97089b), interfaceC5597q);
    }

    /* JADX INFO: renamed from: i */
    public final void m96766i(int i11) {
        if (i11 >= 0) {
            this.f97092e.m8673j(i11);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m96768k(int i11) {
        if (i11 >= 0) {
            this.f97092e.m8674k(i11);
        }
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC5578c m96771n(int i11) {
        InterfaceC5578c interfaceC5578cM8654c = this.f97092e.m8654c(i11);
        if (interfaceC5578cM8654c.getDrawable() instanceof C5588h) {
            interfaceC5578cM8654c = (C5588h) interfaceC5578cM8654c.getDrawable();
        }
        return interfaceC5578cM8654c.getDrawable() instanceof C5595o ? (C5595o) interfaceC5578cM8654c.getDrawable() : interfaceC5578cM8654c;
    }

    /* JADX INFO: renamed from: o */
    public RoundingParams m96772o() {
        return this.f97090c;
    }

    /* JADX INFO: renamed from: r */
    public final void m96775r() {
        this.f97093f.setDrawable(this.f97088a);
    }

    /* JADX INFO: renamed from: s */
    public final void m96776s() {
        C5584f c5584f = this.f97092e;
        if (c5584f != null) {
            c5584f.m8669f();
            this.f97092e.m8672i();
            m96767j();
            m96766i(1);
            this.f97092e.m8675l();
            this.f97092e.m8671h();
        }
    }

    public void setOnFadeListener(InterfaceC37814g interfaceC37814g) {
        this.f97092e.setOnFadeListener(interfaceC37814g);
    }

    /* JADX INFO: renamed from: u */
    public final void m96778u(int i11, Drawable drawable) {
        if (drawable == null) {
            this.f97092e.m8656e(i11, null);
        } else {
            m96771n(i11).setDrawable(C5607a.m8729d(drawable, this.f97090c, this.f97089b));
        }
    }

    /* JADX INFO: renamed from: v */
    public void m96779v(int i11) {
        this.f97092e.m8681r(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m96781x(float f11) {
        Drawable drawableM8653b = this.f97092e.m8653b(3);
        if (drawableM8653b == 0) {
            return;
        }
        if (f11 >= 0.999f) {
            if (drawableM8653b instanceof Animatable) {
                ((Animatable) drawableM8653b).stop();
            }
            m96768k(3);
        } else {
            if (drawableM8653b instanceof Animatable) {
                ((Animatable) drawableM8653b).start();
            }
            m96766i(3);
        }
        drawableM8653b.setLevel(Math.round(f11 * 10000.0f));
    }

    /* JADX INFO: renamed from: z */
    public void m96783z(RoundingParams roundingParams) {
        this.f97090c = roundingParams;
        C5607a.m8735j(this.f97091d, roundingParams);
        for (int i11 = 0; i11 < this.f97092e.m8655d(); i11++) {
            C5607a.m8734i(m96771n(i11), this.f97090c, this.f97089b);
        }
    }

    public C43921a(C43922b c43922b) {
        int size;
        int i11;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f97088a = colorDrawable;
        if (C36621b.m81959d()) {
            C36621b.m81957a("GenericDraweeHierarchy()");
        }
        this.f97089b = c43922b.m96811p();
        this.f97090c = c43922b.m96814s();
        C5586g c5586g = new C5586g(colorDrawable);
        this.f97093f = c5586g;
        int i12 = 1;
        if (c43922b.m96805j() != null) {
            size = c43922b.m96805j().size();
        } else {
            size = 1;
        }
        size = size == 0 ? 1 : size;
        if (c43922b.m96808m() != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i13 = size + i11;
        Drawable[] drawableArr = new Drawable[i13 + 6];
        drawableArr[0] = m96765h(c43922b.m96800e(), null);
        drawableArr[1] = m96765h(c43922b.m96806k(), c43922b.m96807l());
        drawableArr[2] = m96764g(c5586g, c43922b.m96799d(), c43922b.m96798c(), c43922b.m96797b());
        drawableArr[3] = m96765h(c43922b.m96809n(), c43922b.m96810o());
        drawableArr[4] = m96765h(c43922b.m96812q(), c43922b.m96813r());
        drawableArr[5] = m96765h(c43922b.m96803h(), c43922b.m96804i());
        if (i13 > 0) {
            if (c43922b.m96805j() != null) {
                Iterator<Drawable> it = c43922b.m96805j().iterator();
                i12 = 0;
                while (it.hasNext()) {
                    drawableArr[i12 + 6] = m96765h(it.next(), null);
                    i12++;
                }
            }
            if (c43922b.m96808m() != null) {
                drawableArr[i12 + 6] = m96765h(c43922b.m96808m(), null);
            }
        }
        C5584f c5584f = new C5584f(drawableArr, false, 2);
        this.f97092e = c5584f;
        c5584f.m8681r(c43922b.m96802g());
        C43924d c43924d = new C43924d(C5607a.m8730e(c5584f, this.f97090c));
        this.f97091d = c43924d;
        c43924d.mutate();
        m96776s();
        if (C36621b.m81959d()) {
            C36621b.m81958b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m96764g(Drawable drawable, InterfaceC5597q interfaceC5597q, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return C5607a.m8732g(drawable, interfaceC5597q, pointF);
    }

    /* JADX INFO: renamed from: p */
    public final C5595o m96773p(int i11) {
        InterfaceC5578c interfaceC5578cM96771n = m96771n(i11);
        if (interfaceC5578cM96771n instanceof C5595o) {
            return (C5595o) interfaceC5578cM96771n;
        }
        return C5607a.m8736k(interfaceC5578cM96771n, InterfaceC5597q.f8351a);
    }

    /* JADX INFO: renamed from: q */
    public final boolean m96774q(int i11) {
        return m96771n(i11) instanceof C5595o;
    }

    @Override // p631t4.InterfaceC44688c
    public void reset() {
        m96775r();
        m96776s();
    }

    /* JADX INFO: renamed from: t */
    public void m96777t(InterfaceC5597q interfaceC5597q) {
        C45708h.m100896g(interfaceC5597q);
        m96773p(2).m8704n(interfaceC5597q);
    }
}
