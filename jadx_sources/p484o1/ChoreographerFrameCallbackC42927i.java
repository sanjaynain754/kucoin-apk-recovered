package p484o1;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.C5072d;
import com.airbnb.lottie.C5080h;

/* JADX INFO: renamed from: o1.i */
/* JADX INFO: compiled from: LottieValueAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class ChoreographerFrameCallbackC42927i extends AbstractC42921c implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: m */
    @Nullable
    public C5080h f95044m;

    /* JADX INFO: renamed from: e */
    public float f95036e = 1.0f;

    /* JADX INFO: renamed from: f */
    public boolean f95037f = false;

    /* JADX INFO: renamed from: g */
    public long f95038g = 0;

    /* JADX INFO: renamed from: h */
    public float f95039h = 0.0f;

    /* JADX INFO: renamed from: i */
    public float f95040i = 0.0f;

    /* JADX INFO: renamed from: j */
    public int f95041j = 0;

    /* JADX INFO: renamed from: k */
    public float f95042k = -2.1474836E9f;

    /* JADX INFO: renamed from: l */
    public float f95043l = 2.1474836E9f;

    /* JADX INFO: renamed from: n */
    @VisibleForTesting
    public boolean f95045n = false;

    /* JADX INFO: renamed from: o */
    public boolean f95046o = false;

    /* JADX INFO: renamed from: B */
    public void m94163B(int i11) {
        m94162A(i11, (int) this.f95043l);
    }

    /* JADX INFO: renamed from: h */
    public void m94167h() {
        this.f95044m = null;
        this.f95042k = -2.1474836E9f;
        this.f95043l = 2.1474836E9f;
    }

    @MainThread
    /* JADX INFO: renamed from: r */
    public void m94177r() {
        this.f95045n = true;
        m94150f(m94175p());
        m94184y((int) (m94175p() ? m94172m() : m94173n()));
        this.f95038g = 0L;
        this.f95041j = 0;
        m94178s();
    }

    @MainThread
    /* JADX INFO: renamed from: t */
    public void m94179t() {
        m94180u(true);
    }

    @MainThread
    /* JADX INFO: renamed from: v */
    public void m94181v() {
        this.f95045n = true;
        m94178s();
        this.f95038g = 0L;
        if (m94175p() && m94170k() == m94173n()) {
            m94184y(m94172m());
        } else if (!m94175p() && m94170k() == m94172m()) {
            m94184y(m94173n());
        }
        m94149e();
    }

    /* JADX INFO: renamed from: A */
    public void m94162A(float f11, float f12) {
        if (f11 > f12) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f11), Float.valueOf(f12)));
        }
        C5080h c5080h = this.f95044m;
        float fM5665p = c5080h == null ? -3.4028235E38f : c5080h.m5665p();
        C5080h c5080h2 = this.f95044m;
        float fM5655f = c5080h2 == null ? Float.MAX_VALUE : c5080h2.m5655f();
        float fM94188b = C42929k.m94188b(f11, fM5665p, fM5655f);
        float fM94188b2 = C42929k.m94188b(f12, fM5665p, fM5655f);
        if (fM94188b == this.f95042k && fM94188b2 == this.f95043l) {
            return;
        }
        this.f95042k = fM94188b;
        this.f95043l = fM94188b2;
        m94184y((int) C42929k.m94188b(this.f95040i, fM94188b, fM94188b2));
    }

    /* JADX INFO: renamed from: C */
    public void m94164C(float f11) {
        this.f95036e = f11;
    }

    /* JADX INFO: renamed from: D */
    public void m94165D(boolean z11) {
        this.f95046o = z11;
    }

    /* JADX INFO: renamed from: E */
    public final void m94166E() {
        if (this.f95044m == null) {
            return;
        }
        float f11 = this.f95040i;
        if (f11 < this.f95042k || f11 > this.f95043l) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f95042k), Float.valueOf(this.f95043l), Float.valueOf(this.f95040i)));
        }
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, m1552to = 1.0d)
    public float getAnimatedFraction() {
        float fM94173n;
        float fM94172m;
        float fM94173n2;
        if (this.f95044m == null) {
            return 0.0f;
        }
        if (m94175p()) {
            fM94173n = m94172m() - this.f95040i;
            fM94172m = m94172m();
            fM94173n2 = m94173n();
        } else {
            fM94173n = this.f95040i - m94173n();
            fM94172m = m94172m();
            fM94173n2 = m94173n();
        }
        return fM94173n / (fM94172m - fM94173n2);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        C5080h c5080h = this.f95044m;
        if (c5080h == null) {
            return 0L;
        }
        return (long) c5080h.m5653d();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f95045n;
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    /* JADX INFO: renamed from: j */
    public float m94169j() {
        C5080h c5080h = this.f95044m;
        if (c5080h == null) {
            return 0.0f;
        }
        return (this.f95040i - c5080h.m5665p()) / (this.f95044m.m5655f() - this.f95044m.m5665p());
    }

    /* JADX INFO: renamed from: k */
    public float m94170k() {
        return this.f95040i;
    }

    /* JADX INFO: renamed from: l */
    public final float m94171l() {
        C5080h c5080h = this.f95044m;
        if (c5080h == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / c5080h.m5658i()) / Math.abs(this.f95036e);
    }

    /* JADX INFO: renamed from: m */
    public float m94172m() {
        C5080h c5080h = this.f95044m;
        if (c5080h == null) {
            return 0.0f;
        }
        float f11 = this.f95043l;
        return f11 == 2.1474836E9f ? c5080h.m5655f() : f11;
    }

    /* JADX INFO: renamed from: n */
    public float m94173n() {
        C5080h c5080h = this.f95044m;
        if (c5080h == null) {
            return 0.0f;
        }
        float f11 = this.f95042k;
        return f11 == -2.1474836E9f ? c5080h.m5665p() : f11;
    }

    /* JADX INFO: renamed from: o */
    public float m94174o() {
        return this.f95036e;
    }

    /* JADX INFO: renamed from: x */
    public void m94183x(C5080h c5080h) {
        boolean z11 = this.f95044m == null;
        this.f95044m = c5080h;
        if (z11) {
            m94162A(Math.max(this.f95042k, c5080h.m5665p()), Math.min(this.f95043l, c5080h.m5655f()));
        } else {
            m94162A((int) c5080h.m5665p(), (int) c5080h.m5655f());
        }
        float f11 = this.f95040i;
        this.f95040i = 0.0f;
        this.f95039h = 0.0f;
        m94184y((int) f11);
        m94151g();
    }

    /* JADX INFO: renamed from: y */
    public void m94184y(float f11) {
        if (this.f95039h == f11) {
            return;
        }
        float fM94188b = C42929k.m94188b(f11, m94173n(), m94172m());
        this.f95039h = fM94188b;
        if (this.f95046o) {
            fM94188b = (float) Math.floor(fM94188b);
        }
        this.f95040i = fM94188b;
        this.f95038g = 0L;
        m94151g();
    }

    /* JADX INFO: renamed from: z */
    public void m94185z(float f11) {
        m94162A(this.f95042k, f11);
    }

    @Override // p484o1.AbstractC42921c
    /* JADX INFO: renamed from: a */
    public void mo94145a() {
        super.mo94145a();
        m94146b(m94175p());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        mo94145a();
        m94179t();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        float fM94173n;
        float fM94172m;
        m94178s();
        if (this.f95044m != null && isRunning()) {
            if (C5072d.m5647g()) {
                C5072d.m5642b("LottieValueAnimator#doFrame");
            }
            long j12 = this.f95038g;
            long j13 = 0;
            if (j12 != 0) {
                j13 = j11 - j12;
            }
            float fM94171l = j13 / m94171l();
            float f11 = this.f95039h;
            if (m94175p()) {
                fM94171l = -fM94171l;
            }
            float f12 = f11 + fM94171l;
            boolean zM94190d = C42929k.m94190d(f12, m94173n(), m94172m());
            float f13 = this.f95039h;
            float fM94188b = C42929k.m94188b(f12, m94173n(), m94172m());
            this.f95039h = fM94188b;
            if (this.f95046o) {
                fM94188b = (float) Math.floor(fM94188b);
            }
            this.f95040i = fM94188b;
            this.f95038g = j11;
            if (!this.f95046o || this.f95039h != f13) {
                m94151g();
            }
            if (!zM94190d) {
                if (getRepeatCount() != -1 && this.f95041j >= getRepeatCount()) {
                    if (this.f95036e < 0.0f) {
                        fM94172m = m94173n();
                    } else {
                        fM94172m = m94172m();
                    }
                    this.f95039h = fM94172m;
                    this.f95040i = fM94172m;
                    m94179t();
                    m94146b(m94175p());
                } else {
                    m94148d();
                    this.f95041j++;
                    if (getRepeatMode() == 2) {
                        this.f95037f = !this.f95037f;
                        m94182w();
                    } else {
                        if (m94175p()) {
                            fM94173n = m94172m();
                        } else {
                            fM94173n = m94173n();
                        }
                        this.f95039h = fM94173n;
                        this.f95040i = fM94173n;
                    }
                    this.f95038g = j11;
                }
            }
            m94166E();
            if (C5072d.m5647g()) {
                C5072d.m5643c("LottieValueAnimator#doFrame");
            }
        }
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m94169j());
    }

    @MainThread
    /* JADX INFO: renamed from: i */
    public void m94168i() {
        m94179t();
        m94146b(m94175p());
    }

    /* JADX INFO: renamed from: p */
    public final boolean m94175p() {
        if (m94174o() < 0.0f) {
            return true;
        }
        return false;
    }

    @MainThread
    /* JADX INFO: renamed from: q */
    public void m94176q() {
        m94179t();
        m94147c();
    }

    /* JADX INFO: renamed from: s */
    public void m94178s() {
        if (isRunning()) {
            m94180u(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i11) {
        super.setRepeatMode(i11);
        if (i11 != 2 && this.f95037f) {
            this.f95037f = false;
            m94182w();
        }
    }

    @MainThread
    /* JADX INFO: renamed from: u */
    public void m94180u(boolean z11) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z11) {
            this.f95045n = false;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m94182w() {
        m94164C(-m94174o());
    }
}
