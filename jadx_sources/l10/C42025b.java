package l10;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import m10.C42387a;
import m10.C42388b;
import o10.InterfaceC42932b;

/* JADX INFO: renamed from: l10.b */
/* JADX INFO: compiled from: ShapeDrawableBuilder.java */
/* JADX INFO: loaded from: classes43.dex */
public final class C42025b {

    /* JADX INFO: renamed from: A */
    public Integer f92222A;

    /* JADX INFO: renamed from: B */
    public Integer f92223B;

    /* JADX INFO: renamed from: C */
    public int f92224C;

    /* JADX INFO: renamed from: D */
    public int f92225D;

    /* JADX INFO: renamed from: E */
    public int f92226E;

    /* JADX INFO: renamed from: F */
    public int f92227F;

    /* JADX INFO: renamed from: G */
    public int f92228G;

    /* JADX INFO: renamed from: H */
    public int f92229H;

    /* JADX INFO: renamed from: I */
    public int f92230I;

    /* JADX INFO: renamed from: J */
    public int f92231J;

    /* JADX INFO: renamed from: K */
    public float f92232K;

    /* JADX INFO: renamed from: L */
    public int f92233L;

    /* JADX INFO: renamed from: M */
    public float f92234M;

    /* JADX INFO: renamed from: N */
    public int f92235N;

    /* JADX INFO: renamed from: a */
    public final View f92236a;

    /* JADX INFO: renamed from: b */
    public int f92237b;

    /* JADX INFO: renamed from: c */
    public int f92238c;

    /* JADX INFO: renamed from: d */
    public int f92239d;

    /* JADX INFO: renamed from: e */
    public int f92240e;

    /* JADX INFO: renamed from: f */
    public Integer f92241f;

    /* JADX INFO: renamed from: g */
    public Integer f92242g;

    /* JADX INFO: renamed from: h */
    public Integer f92243h;

    /* JADX INFO: renamed from: i */
    public Integer f92244i;

    /* JADX INFO: renamed from: j */
    public Integer f92245j;

    /* JADX INFO: renamed from: k */
    public float f92246k;

    /* JADX INFO: renamed from: l */
    public float f92247l;

    /* JADX INFO: renamed from: m */
    public float f92248m;

    /* JADX INFO: renamed from: n */
    public float f92249n;

    /* JADX INFO: renamed from: o */
    public int[] f92250o;

    /* JADX INFO: renamed from: p */
    public int[] f92251p;

    /* JADX INFO: renamed from: q */
    public boolean f92252q;

    /* JADX INFO: renamed from: r */
    public int f92253r;

    /* JADX INFO: renamed from: s */
    public int f92254s;

    /* JADX INFO: renamed from: t */
    public float f92255t;

    /* JADX INFO: renamed from: u */
    public float f92256u;

    /* JADX INFO: renamed from: v */
    public int f92257v;

    /* JADX INFO: renamed from: w */
    public int f92258w;

    /* JADX INFO: renamed from: x */
    public Integer f92259x;

    /* JADX INFO: renamed from: y */
    public Integer f92260y;

    /* JADX INFO: renamed from: z */
    public Integer f92261z;

    /* JADX INFO: renamed from: a */
    public Drawable m92139a() {
        boolean z11 = true;
        boolean z12 = (this.f92241f == null && this.f92242g == null && this.f92243h == null && this.f92244i == null && this.f92245j == null) ? false : true;
        if (this.f92259x == null && this.f92260y == null && this.f92261z == null && this.f92222A == null && this.f92223B == null) {
            z11 = false;
        }
        if (!m92146h() && !m92147i() && this.f92240e == 0 && !z12 && this.f92258w == 0 && !z11) {
            return null;
        }
        Drawable background = this.f92236a.getBackground();
        C42388b c42388bM92142d = background instanceof C42387a ? m92142d(((C42387a) background).m93008b()) : m92142d(background);
        m92148j(c42388bM92142d, null, null);
        if (!z12 && !z11) {
            return c42388bM92142d;
        }
        C42387a c42387a = new C42387a();
        if (this.f92241f != null || this.f92259x != null) {
            C42388b c42388bM92142d2 = m92142d(c42387a.m93011e());
            m92148j(c42388bM92142d2, this.f92241f, this.f92259x);
            c42387a.m93017k(c42388bM92142d2);
        }
        if (this.f92242g != null || this.f92260y != null) {
            C42388b c42388bM92142d3 = m92142d(c42387a.m93007a());
            m92148j(c42388bM92142d3, this.f92242g, this.f92260y);
            c42387a.m93013g(c42388bM92142d3);
        }
        if (this.f92243h != null || this.f92261z != null) {
            C42388b c42388bM92142d4 = m92142d(c42387a.m93009c());
            m92148j(c42388bM92142d4, this.f92243h, this.f92261z);
            c42387a.m93015i(c42388bM92142d4);
        }
        if (this.f92244i != null || this.f92222A != null) {
            C42388b c42388bM92142d5 = m92142d(c42387a.m93010d());
            m92148j(c42388bM92142d5, this.f92244i, this.f92222A);
            c42387a.m93016j(c42388bM92142d5);
        }
        if (this.f92245j != null || this.f92223B != null) {
            C42388b c42388bM92142d6 = m92142d(c42387a.m93012f());
            m92148j(c42388bM92142d6, this.f92245j, this.f92223B);
            c42387a.m93018l(c42388bM92142d6);
        }
        c42387a.m93014h(c42388bM92142d);
        return c42387a;
    }

    /* JADX INFO: renamed from: b */
    public void m92140b() {
        this.f92250o = null;
    }

    /* JADX INFO: renamed from: c */
    public void m92141c() {
        this.f92251p = null;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public C42388b m92142d(Drawable drawable) {
        return drawable instanceof C42388b ? (C42388b) drawable : new C42388b();
    }

    /* JADX INFO: renamed from: f */
    public boolean m92144f() {
        return this.f92226E > 0;
    }

    /* JADX INFO: renamed from: g */
    public boolean m92145g() {
        return this.f92227F > 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m92146h() {
        int[] iArr = this.f92250o;
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m92147i() {
        int[] iArr = this.f92251p;
        return iArr != null && iArr.length > 0;
    }

    /* JADX INFO: renamed from: j */
    public void m92148j(C42388b c42388b, @Nullable Integer num, @Nullable Integer num2) {
        c42388b.m93038s(this.f92237b).m93039t(this.f92238c, this.f92239d).m93033n(this.f92246k, this.f92247l, this.f92248m, this.f92249n).m93019A(this.f92252q).m93043x(this.f92224C).m93042w(this.f92225D, this.f92226E);
        c42388b.m93024e(this.f92253r).m93028i(this.f92254s).m93027h(this.f92257v).m93025f(this.f92255t, this.f92256u);
        c42388b.m93037r(this.f92227F).m93034o(this.f92228G).m93035p(this.f92229H).m93036q(this.f92230I);
        c42388b.m93030k(this.f92232K).m93029j(this.f92231J).m93045z(this.f92234M).m93044y(this.f92233L);
        c42388b.m93031l(this.f92235N);
        if (num != null) {
            c42388b.m93040u(num.intValue());
        } else if (m92146h()) {
            c42388b.m93040u(this.f92250o);
        } else {
            c42388b.m93040u(this.f92240e);
        }
        if (num2 != null) {
            c42388b.m93041v(num2.intValue());
        } else if (m92147i()) {
            c42388b.m93041v(this.f92251p);
        } else {
            c42388b.m93041v(this.f92258w);
        }
    }

    /* JADX INFO: renamed from: l */
    public C42025b m92150l(float f11, float f12, float f13, float f14) {
        this.f92246k = f11;
        this.f92247l = f12;
        this.f92248m = f13;
        this.f92249n = f14;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public C42025b m92151m(int i11) {
        this.f92240e = i11;
        m92140b();
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C42025b m92152n(int i11) {
        this.f92258w = i11;
        m92141c();
        return this;
    }

    /* JADX INFO: renamed from: o */
    public C42025b m92153o(int i11) {
        this.f92224C = i11;
        return this;
    }

    public C42025b(View view, TypedArray typedArray, InterfaceC42932b interfaceC42932b) {
        this.f92236a = view;
        this.f92237b = typedArray.getInt(interfaceC42932b.mo94248f(), 0);
        this.f92238c = typedArray.getDimensionPixelSize(interfaceC42932b.mo94227K(), -1);
        this.f92239d = typedArray.getDimensionPixelSize(interfaceC42932b.mo94243b0(), -1);
        this.f92240e = typedArray.getColor(interfaceC42932b.mo94250g0(), 0);
        if (typedArray.hasValue(interfaceC42932b.mo94244c0())) {
            this.f92241f = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94244c0(), 0));
        }
        if (interfaceC42932b.mo94249f0() > 0 && typedArray.hasValue(interfaceC42932b.mo94249f0())) {
            this.f92242g = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94249f0(), 0));
        }
        if (typedArray.hasValue(interfaceC42932b.mo94231O())) {
            this.f92243h = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94231O(), 0));
        }
        if (typedArray.hasValue(interfaceC42932b.mo94251h())) {
            this.f92244i = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94251h(), 0));
        }
        if (typedArray.hasValue(interfaceC42932b.mo94238Y())) {
            this.f92245j = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94238Y(), 0));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(interfaceC42932b.mo94247e0(), 0);
        this.f92246k = typedArray.getDimensionPixelSize(interfaceC42932b.mo94228L(), dimensionPixelSize);
        this.f92247l = typedArray.getDimensionPixelSize(interfaceC42932b.mo94264x(), dimensionPixelSize);
        this.f92248m = typedArray.getDimensionPixelSize(interfaceC42932b.mo94242b(), dimensionPixelSize);
        this.f92249n = typedArray.getDimensionPixelSize(interfaceC42932b.mo94263w(), dimensionPixelSize);
        if (typedArray.hasValue(interfaceC42932b.mo94245d()) && typedArray.hasValue(interfaceC42932b.mo94234U())) {
            if (typedArray.hasValue(interfaceC42932b.mo94253i0())) {
                this.f92250o = new int[]{typedArray.getColor(interfaceC42932b.mo94245d(), 0), typedArray.getColor(interfaceC42932b.mo94253i0(), 0), typedArray.getColor(interfaceC42932b.mo94234U(), 0)};
            } else {
                this.f92250o = new int[]{typedArray.getColor(interfaceC42932b.mo94245d(), 0), typedArray.getColor(interfaceC42932b.mo94234U(), 0)};
            }
        }
        if (typedArray.hasValue(interfaceC42932b.mo94226J()) && typedArray.hasValue(interfaceC42932b.mo94229M())) {
            if (typedArray.hasValue(interfaceC42932b.mo94255k())) {
                this.f92251p = new int[]{typedArray.getColor(interfaceC42932b.mo94226J(), 0), typedArray.getColor(interfaceC42932b.mo94255k(), 0), typedArray.getColor(interfaceC42932b.mo94229M(), 0)};
            } else {
                this.f92251p = new int[]{typedArray.getColor(interfaceC42932b.mo94226J(), 0), typedArray.getColor(interfaceC42932b.mo94229M(), 0)};
            }
        }
        this.f92252q = typedArray.getBoolean(interfaceC42932b.mo94257n(), false);
        this.f92253r = (int) typedArray.getFloat(interfaceC42932b.mo94230N(), 0.0f);
        this.f92254s = typedArray.getInt(interfaceC42932b.mo94241a0(), 0);
        this.f92255t = typedArray.getFloat(interfaceC42932b.mo94239Z(), 0.5f);
        this.f92256u = typedArray.getFloat(interfaceC42932b.mo94223E(), 0.5f);
        this.f92257v = typedArray.getDimensionPixelSize(interfaceC42932b.mo94235V(), dimensionPixelSize);
        this.f92258w = typedArray.getColor(interfaceC42932b.mo94232S(), 0);
        if (typedArray.hasValue(interfaceC42932b.mo94237X())) {
            this.f92259x = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94237X(), 0));
        }
        if (interfaceC42932b.mo94246e() > 0 && typedArray.hasValue(interfaceC42932b.mo94246e())) {
            this.f92260y = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94246e(), 0));
        }
        if (typedArray.hasValue(interfaceC42932b.mo94259q())) {
            this.f92261z = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94259q(), 0));
        }
        if (typedArray.hasValue(interfaceC42932b.mo94258o())) {
            this.f92222A = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94258o(), 0));
        }
        if (typedArray.hasValue(interfaceC42932b.mo94240a())) {
            this.f92223B = Integer.valueOf(typedArray.getColor(interfaceC42932b.mo94240a(), 0));
        }
        this.f92224C = typedArray.getDimensionPixelSize(interfaceC42932b.mo94236W(), 0);
        this.f92225D = typedArray.getDimensionPixelSize(interfaceC42932b.mo94254j(), 0);
        this.f92226E = typedArray.getDimensionPixelSize(interfaceC42932b.mo94224G(), 0);
        this.f92227F = typedArray.getDimensionPixelSize(interfaceC42932b.mo94225I(), 0);
        this.f92228G = typedArray.getColor(interfaceC42932b.mo94265z(), 268435456);
        this.f92229H = typedArray.getDimensionPixelOffset(interfaceC42932b.mo94233T(), 0);
        this.f92230I = typedArray.getDimensionPixelOffset(interfaceC42932b.mo94260s(), 0);
        this.f92231J = typedArray.getDimensionPixelOffset(interfaceC42932b.mo94262u(), -1);
        this.f92232K = typedArray.getFloat(interfaceC42932b.mo94261t(), 3.0f);
        this.f92233L = typedArray.getDimensionPixelOffset(interfaceC42932b.mo94256m(), -1);
        this.f92234M = typedArray.getFloat(interfaceC42932b.mo94222D(), 9.0f);
        this.f92235N = typedArray.getInt(interfaceC42932b.mo94252i(), 17);
    }

    /* JADX INFO: renamed from: e */
    public void m92143e() {
        Drawable drawableM92139a = m92139a();
        if (m92144f() || m92145g()) {
            this.f92236a.setLayerType(1, null);
        }
        this.f92236a.setBackground(drawableM92139a);
    }

    /* JADX INFO: renamed from: k */
    public C42025b m92149k(float f11) {
        return m92150l(f11, f11, f11, f11);
    }
}
