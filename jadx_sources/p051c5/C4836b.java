package p051c5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.drawee.drawable.C5580d;
import com.facebook.fresco.animation.frame.DropFramesFrameScheduler;
import p222e5.InterfaceC37074a;
import p358j4.InterfaceC40267a;
import p683v4.InterfaceC45414a;
import p747x3.C45999a;

/* JADX INFO: renamed from: c5.b */
/* JADX INFO: compiled from: AnimatedDrawable2.java */
/* JADX INFO: loaded from: classes34.dex */
public class C4836b extends Drawable implements Animatable, InterfaceC40267a {

    /* JADX INFO: renamed from: s */
    public static final Class<?> f4871s = C4836b.class;

    /* JADX INFO: renamed from: t */
    public static final InterfaceC4838d f4872t = new C4839e();

    /* JADX INFO: renamed from: b */
    public InterfaceC45414a f4873b;

    /* JADX INFO: renamed from: c */
    public InterfaceC37074a f4874c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f4875d;

    /* JADX INFO: renamed from: e */
    public long f4876e;

    /* JADX INFO: renamed from: f */
    public long f4877f;

    /* JADX INFO: renamed from: g */
    public long f4878g;

    /* JADX INFO: renamed from: h */
    public int f4879h;

    /* JADX INFO: renamed from: i */
    public long f4880i;

    /* JADX INFO: renamed from: j */
    public long f4881j;

    /* JADX INFO: renamed from: k */
    public int f4882k;

    /* JADX INFO: renamed from: l */
    public long f4883l;

    /* JADX INFO: renamed from: m */
    public long f4884m;

    /* JADX INFO: renamed from: n */
    public int f4885n;

    /* JADX INFO: renamed from: o */
    public volatile InterfaceC4838d f4886o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC45414a.a f4887p;

    /* JADX INFO: renamed from: q */
    public C5580d f4888q;

    /* JADX INFO: renamed from: r */
    public final Runnable f4889r;

    /* JADX INFO: renamed from: c5.b$a */
    /* JADX INFO: compiled from: AnimatedDrawable2.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4836b c4836b = C4836b.this;
            c4836b.unscheduleSelf(c4836b.f4889r);
            C4836b.this.invalidateSelf();
        }
    }

    public C4836b() {
        this(null);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public C4836b(InterfaceC45414a interfaceC45414a) {
        this.f4883l = 8L;
        this.f4884m = 0L;
        this.f4886o = f4872t;
        InterfaceC45414a.a aVar = new InterfaceC45414a.a() { // from class: c5.a
        };
        this.f4887p = aVar;
        this.f4889r = new a();
        this.f4873b = interfaceC45414a;
        this.f4874c = m4952c(interfaceC45414a);
        if (interfaceC45414a != null) {
            interfaceC45414a.mo8749l(aVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC37074a m4952c(InterfaceC45414a interfaceC45414a) {
        if (interfaceC45414a == null) {
            return null;
        }
        return new DropFramesFrameScheduler(interfaceC45414a);
    }

    @Override // p358j4.InterfaceC40267a
    /* JADX INFO: renamed from: a */
    public void mo4953a() {
        InterfaceC45414a interfaceC45414a = this.f4873b;
        if (interfaceC45414a != null) {
            interfaceC45414a.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f4873b == null || this.f4874c == null) {
            return;
        }
        long jM4954d = m4954d();
        long jMax = this.f4875d ? (jM4954d - this.f4876e) + this.f4884m : Math.max(this.f4877f, 0L);
        int iMo8830b = this.f4874c.mo8830b(jMax, this.f4877f);
        if (iMo8830b == -1) {
            iMo8830b = this.f4873b.mo4283a() - 1;
            this.f4886o.mo4970d(this);
            this.f4875d = false;
        } else if (iMo8830b == 0 && this.f4879h != -1 && jM4954d >= this.f4878g) {
            this.f4886o.mo4969c(this);
        }
        boolean zMo8750m = this.f4873b.mo8750m(this, canvas, iMo8830b);
        if (zMo8750m) {
            this.f4886o.mo4968b(this, iMo8830b);
            this.f4879h = iMo8830b;
        }
        if (!zMo8750m) {
            m4955e();
        }
        long jM4954d2 = m4954d();
        if (this.f4875d) {
            long jMo8829a = this.f4874c.mo8829a(jM4954d2 - this.f4876e);
            if (jMo8829a != -1) {
                m4956f(jMo8829a + this.f4883l);
            } else {
                this.f4886o.mo4970d(this);
                this.f4875d = false;
            }
        }
        this.f4877f = jMax;
    }

    /* JADX INFO: renamed from: e */
    public final void m4955e() {
        this.f4885n++;
        if (C45999a.m101517w(2)) {
            C45999a.m101519y(f4871s, "Dropped a frame. Count: %s", Integer.valueOf(this.f4885n));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4956f(long j11) {
        long j12 = this.f4876e + j11;
        this.f4878g = j12;
        scheduleSelf(this.f4889r, j12);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        InterfaceC45414a interfaceC45414a = this.f4873b;
        return interfaceC45414a == null ? super.getIntrinsicHeight() : interfaceC45414a.mo8745d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        InterfaceC45414a interfaceC45414a = this.f4873b;
        return interfaceC45414a == null ? super.getIntrinsicWidth() : interfaceC45414a.mo8744c();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f4875d;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        if (this.f4875d) {
            return false;
        }
        long j11 = i11;
        if (this.f4877f == j11) {
            return false;
        }
        this.f4877f = j11;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f4888q == null) {
            this.f4888q = new C5580d();
        }
        this.f4888q.m8660b(i11);
        InterfaceC45414a interfaceC45414a = this.f4873b;
        if (interfaceC45414a != null) {
            interfaceC45414a.mo8748j(i11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f4888q == null) {
            this.f4888q = new C5580d();
        }
        this.f4888q.m8661c(colorFilter);
        InterfaceC45414a interfaceC45414a = this.f4873b;
        if (interfaceC45414a != null) {
            interfaceC45414a.mo8747f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        InterfaceC45414a interfaceC45414a;
        if (this.f4875d || (interfaceC45414a = this.f4873b) == null || interfaceC45414a.mo4283a() <= 1) {
            return;
        }
        this.f4875d = true;
        long jM4954d = m4954d();
        long j11 = jM4954d - this.f4880i;
        this.f4876e = j11;
        this.f4878g = j11;
        this.f4877f = jM4954d - this.f4881j;
        this.f4879h = this.f4882k;
        invalidateSelf();
        this.f4886o.mo4967a(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f4875d) {
            long jM4954d = m4954d();
            this.f4880i = jM4954d - this.f4876e;
            this.f4881j = jM4954d - this.f4877f;
            this.f4882k = this.f4879h;
            this.f4875d = false;
            this.f4876e = 0L;
            this.f4878g = 0L;
            this.f4877f = -1L;
            this.f4879h = -1;
            unscheduleSelf(this.f4889r);
            this.f4886o.mo4970d(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m4954d() {
        return SystemClock.uptimeMillis();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        InterfaceC45414a interfaceC45414a = this.f4873b;
        if (interfaceC45414a != null) {
            interfaceC45414a.mo8746e(rect);
        }
    }
}
