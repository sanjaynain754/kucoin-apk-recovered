package rb0;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: rb0.o */
/* JADX INFO: compiled from: ScaleGestureDetector.java */
/* JADX INFO: loaded from: classes59.dex */
public class C43981o {

    /* JADX INFO: renamed from: a */
    public final Context f97193a;

    /* JADX INFO: renamed from: b */
    public final b f97194b;

    /* JADX INFO: renamed from: c */
    public float f97195c;

    /* JADX INFO: renamed from: d */
    public float f97196d;

    /* JADX INFO: renamed from: e */
    public boolean f97197e;

    /* JADX INFO: renamed from: f */
    public boolean f97198f;

    /* JADX INFO: renamed from: g */
    public float f97199g;

    /* JADX INFO: renamed from: h */
    public float f97200h;

    /* JADX INFO: renamed from: i */
    public float f97201i;

    /* JADX INFO: renamed from: j */
    public float f97202j;

    /* JADX INFO: renamed from: k */
    public float f97203k;

    /* JADX INFO: renamed from: l */
    public float f97204l;

    /* JADX INFO: renamed from: m */
    public float f97205m;

    /* JADX INFO: renamed from: n */
    public long f97206n;

    /* JADX INFO: renamed from: o */
    public long f97207o;

    /* JADX INFO: renamed from: p */
    public boolean f97208p;

    /* JADX INFO: renamed from: q */
    public int f97209q;

    /* JADX INFO: renamed from: r */
    public int f97210r;

    /* JADX INFO: renamed from: s */
    public final Handler f97211s;

    /* JADX INFO: renamed from: t */
    public float f97212t;

    /* JADX INFO: renamed from: u */
    public float f97213u;

    /* JADX INFO: renamed from: v */
    public int f97214v;

    /* JADX INFO: renamed from: w */
    public GestureDetector f97215w;

    /* JADX INFO: renamed from: x */
    public boolean f97216x;

    /* JADX INFO: renamed from: rb0.o$a */
    /* JADX INFO: compiled from: ScaleGestureDetector.java */
    public class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            C43981o.this.f97212t = motionEvent.getX();
            C43981o.this.f97213u = motionEvent.getY();
            C43981o.this.f97214v = 1;
            return true;
        }
    }

    /* JADX INFO: renamed from: rb0.o$b */
    /* JADX INFO: compiled from: ScaleGestureDetector.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo96923a(C43981o c43981o);

        /* JADX INFO: renamed from: b */
        boolean mo96924b(C43981o c43981o);

        /* JADX INFO: renamed from: c */
        void mo96925c(C43981o c43981o);
    }

    public C43981o(Context context, b bVar) {
        this(context, bVar, null);
    }

    public C43981o(Context context, b bVar, Handler handler) {
        this.f97214v = 0;
        this.f97193a = context;
        this.f97194b = bVar;
        this.f97209q = ViewConfiguration.get(context).getScaledTouchSlop() * 2;
        this.f97210r = 0;
        this.f97211s = handler;
        int i11 = context.getApplicationInfo().targetSdkVersion;
        if (i11 > 18) {
            m96937l(true);
        }
        if (i11 > 22) {
            m96938m(true);
        }
    }

    /* JADX INFO: renamed from: d */
    public float m96929d() {
        return this.f97199g;
    }

    /* JADX INFO: renamed from: e */
    public float m96930e() {
        return this.f97195c;
    }

    /* JADX INFO: renamed from: f */
    public float m96931f() {
        return this.f97196d;
    }

    /* JADX INFO: renamed from: h */
    public long m96933h() {
        return this.f97206n - this.f97207o;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m96935j() {
        return this.f97214v != 0;
    }

    /* JADX INFO: renamed from: k */
    public boolean m96936k(MotionEvent motionEvent) {
        float f11;
        float f12;
        this.f97206n = motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f97197e) {
            this.f97215w.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z11 = (motionEvent.getButtonState() & 32) != 0;
        boolean z12 = this.f97214v == 2 && !z11;
        boolean z13 = actionMasked == 1 || actionMasked == 3 || z12;
        float fAbs = 0.0f;
        if (actionMasked == 0 || z13) {
            if (this.f97208p) {
                this.f97194b.mo96925c(this);
                this.f97208p = false;
                this.f97201i = 0.0f;
                this.f97214v = 0;
            } else if (m96935j() && z13) {
                this.f97208p = false;
                this.f97201i = 0.0f;
                this.f97214v = 0;
            }
            if (z13) {
                return true;
            }
        }
        if (!this.f97208p && this.f97198f && !m96935j() && !z13 && z11) {
            this.f97212t = motionEvent.getX();
            this.f97213u = motionEvent.getY();
            this.f97214v = 2;
            this.f97201i = 0.0f;
        }
        boolean z14 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z12;
        boolean z15 = actionMasked == 6;
        int actionIndex = z15 ? motionEvent.getActionIndex() : -1;
        int i11 = z15 ? pointerCount - 1 : pointerCount;
        if (m96935j()) {
            f12 = this.f97212t;
            f11 = this.f97213u;
            if (motionEvent.getY() < f11) {
                this.f97216x = true;
            } else {
                this.f97216x = false;
            }
        } else {
            float x11 = 0.0f;
            float y11 = 0.0f;
            for (int i12 = 0; i12 < pointerCount; i12++) {
                if (actionIndex != i12) {
                    x11 += motionEvent.getX(i12);
                    y11 += motionEvent.getY(i12);
                }
            }
            float f13 = i11;
            float f14 = x11 / f13;
            f11 = y11 / f13;
            f12 = f14;
        }
        float fAbs2 = 0.0f;
        for (int i13 = 0; i13 < pointerCount; i13++) {
            if (actionIndex != i13) {
                fAbs += Math.abs(motionEvent.getX(i13) - f12);
                fAbs2 += Math.abs(motionEvent.getY(i13) - f11);
            }
        }
        float f15 = i11;
        float f16 = (fAbs / f15) * 2.0f;
        float f17 = (fAbs2 / f15) * 2.0f;
        float fHypot = m96935j() ? f17 : (float) Math.hypot(f16, f17);
        boolean z16 = this.f97208p;
        this.f97195c = f12;
        this.f97196d = f11;
        if (!m96935j() && this.f97208p && (fHypot < this.f97210r || z14)) {
            this.f97194b.mo96925c(this);
            this.f97208p = false;
            this.f97201i = fHypot;
        }
        if (z14) {
            this.f97202j = f16;
            this.f97204l = f16;
            this.f97203k = f17;
            this.f97205m = f17;
            this.f97199g = fHypot;
            this.f97200h = fHypot;
            this.f97201i = fHypot;
        }
        int i14 = m96935j() ? this.f97209q : this.f97210r;
        if (!this.f97208p && fHypot >= i14 && (z16 || Math.abs(fHypot - this.f97201i) > this.f97209q)) {
            this.f97202j = f16;
            this.f97204l = f16;
            this.f97203k = f17;
            this.f97205m = f17;
            this.f97199g = fHypot;
            this.f97200h = fHypot;
            this.f97207o = this.f97206n;
            this.f97208p = this.f97194b.mo96923a(this);
        }
        if (actionMasked == 2) {
            this.f97202j = f16;
            this.f97203k = f17;
            this.f97199g = fHypot;
            if (this.f97208p ? this.f97194b.mo96924b(this) : true) {
                this.f97204l = this.f97202j;
                this.f97205m = this.f97203k;
                this.f97200h = this.f97199g;
                this.f97207o = this.f97206n;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m96937l(boolean z11) {
        this.f97197e = z11;
        if (z11 && this.f97215w == null) {
            this.f97215w = new GestureDetector(this.f97193a, new a(), this.f97211s);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m96938m(boolean z11) {
        this.f97198f = z11;
    }

    /* JADX INFO: renamed from: g */
    public float m96932g() {
        boolean z11;
        if (m96935j()) {
            boolean z12 = this.f97216x;
            if ((z12 && this.f97199g < this.f97200h) || (!z12 && this.f97199g > this.f97200h)) {
                z11 = true;
            } else {
                z11 = false;
            }
            float fAbs = Math.abs(1.0f - (this.f97199g / this.f97200h)) * 0.5f;
            if (this.f97200h <= this.f97209q) {
                return 1.0f;
            }
            if (z11) {
                return fAbs + 1.0f;
            }
            return 1.0f - fAbs;
        }
        float f11 = this.f97200h;
        if (f11 <= 0.0f) {
            return 1.0f;
        }
        return this.f97199g / f11;
    }

    /* JADX INFO: renamed from: i */
    public double m96934i() {
        return m96933h() / 1000.0d;
    }
}
