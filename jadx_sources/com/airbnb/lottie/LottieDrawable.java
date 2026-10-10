package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.airbnb.lottie.model.layer.C5096b;
import com.tencent.bugly.proguard.C33820nf;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p187d1.C36592a;
import p279g1.C37768a;
import p279g1.C37769b;
import p297h1.C38072b;
import p297h1.C38074d;
import p297h1.C38077g;
import p444m1.C42382v;
import p484o1.C42924f;
import p484o1.C42929k;
import p484o1.ChoreographerFrameCallbackC42927i;
import p484o1.ThreadFactoryC42925g;
import p522p1.C43350c;

/* JADX INFO: loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: U */
    public static final boolean f5878U;

    /* JADX INFO: renamed from: V */
    public static final List<String> f5879V;

    /* JADX INFO: renamed from: W */
    public static final Executor f5880W;

    /* JADX INFO: renamed from: A */
    public final Matrix f5881A;

    /* JADX INFO: renamed from: B */
    public Bitmap f5882B;

    /* JADX INFO: renamed from: C */
    public Canvas f5883C;

    /* JADX INFO: renamed from: D */
    public Rect f5884D;

    /* JADX INFO: renamed from: E */
    public RectF f5885E;

    /* JADX INFO: renamed from: F */
    public Paint f5886F;

    /* JADX INFO: renamed from: G */
    public Rect f5887G;

    /* JADX INFO: renamed from: H */
    public Rect f5888H;

    /* JADX INFO: renamed from: I */
    public RectF f5889I;

    /* JADX INFO: renamed from: J */
    public RectF f5890J;

    /* JADX INFO: renamed from: K */
    public Matrix f5891K;

    /* JADX INFO: renamed from: L */
    public Matrix f5892L;

    /* JADX INFO: renamed from: M */
    public boolean f5893M;

    /* JADX INFO: renamed from: N */
    @Nullable
    public AsyncUpdates f5894N;

    /* JADX INFO: renamed from: O */
    public final ValueAnimator.AnimatorUpdateListener f5895O;

    /* JADX INFO: renamed from: P */
    public final Semaphore f5896P;

    /* JADX INFO: renamed from: Q */
    public Handler f5897Q;

    /* JADX INFO: renamed from: R */
    public Runnable f5898R;

    /* JADX INFO: renamed from: S */
    public final Runnable f5899S;

    /* JADX INFO: renamed from: T */
    public float f5900T;

    /* JADX INFO: renamed from: b */
    public C5080h f5901b;

    /* JADX INFO: renamed from: c */
    public final ChoreographerFrameCallbackC42927i f5902c;

    /* JADX INFO: renamed from: d */
    public boolean f5903d;

    /* JADX INFO: renamed from: e */
    public boolean f5904e;

    /* JADX INFO: renamed from: f */
    public boolean f5905f;

    /* JADX INFO: renamed from: g */
    public OnVisibleAction f5906g;

    /* JADX INFO: renamed from: h */
    public final ArrayList<InterfaceC5064a> f5907h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public C37769b f5908i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public String f5909j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public C37768a f5910k;

    /* JADX INFO: renamed from: l */
    @Nullable
    public Map<String, Typeface> f5911l;

    /* JADX INFO: renamed from: m */
    @Nullable
    public String f5912m;

    /* JADX INFO: renamed from: n */
    @Nullable
    public C5066a f5913n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public C5112t0 f5914o;

    /* JADX INFO: renamed from: p */
    public boolean f5915p;

    /* JADX INFO: renamed from: q */
    public boolean f5916q;

    /* JADX INFO: renamed from: r */
    public boolean f5917r;

    /* JADX INFO: renamed from: s */
    @Nullable
    public C5096b f5918s;

    /* JADX INFO: renamed from: t */
    public int f5919t;

    /* JADX INFO: renamed from: u */
    public boolean f5920u;

    /* JADX INFO: renamed from: v */
    public boolean f5921v;

    /* JADX INFO: renamed from: w */
    public boolean f5922w;

    /* JADX INFO: renamed from: x */
    public boolean f5923x;

    /* JADX INFO: renamed from: y */
    public RenderMode f5924y;

    /* JADX INFO: renamed from: z */
    public boolean f5925z;

    public enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieDrawable$a */
    /* JADX INFO: loaded from: classes34.dex */
    public interface InterfaceC5064a {
        /* JADX INFO: renamed from: a */
        void mo5638a(C5080h c5080h);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    static {
        f5878U = Build.VERSION.SDK_INT <= 25;
        f5879V = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
        f5880W = new ThreadPoolExecutor(0, 2, 35L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC42925g());
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m5543k(final LottieDrawable lottieDrawable) {
        C5096b c5096b = lottieDrawable.f5918s;
        if (c5096b == null) {
            return;
        }
        try {
            lottieDrawable.f5896P.acquire();
            c5096b.mo5782L(lottieDrawable.f5902c.m94169j());
            if (f5878U && lottieDrawable.f5893M) {
                if (lottieDrawable.f5897Q == null) {
                    lottieDrawable.f5897Q = new Handler(Looper.getMainLooper());
                    lottieDrawable.f5898R = new Runnable() { // from class: com.airbnb.lottie.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            LottieDrawable.m5546n(this.f6239b);
                        }
                    };
                }
                lottieDrawable.f5897Q.post(lottieDrawable.f5898R);
            }
        } catch (InterruptedException unused) {
        } finally {
            lottieDrawable.f5896P.release();
        }
    }

    /* JADX INFO: renamed from: A */
    public final void m5549A(Canvas canvas) {
        C5096b c5096b = this.f5918s;
        C5080h c5080h = this.f5901b;
        if (c5096b == null || c5080h == null) {
            return;
        }
        this.f5881A.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            this.f5881A.preScale(bounds.width() / c5080h.m5651b().width(), bounds.height() / c5080h.m5651b().height());
            this.f5881A.preTranslate(bounds.left, bounds.top);
        }
        c5096b.mo5787d(canvas, this.f5881A, this.f5919t);
    }

    /* JADX INFO: renamed from: A0 */
    public void m5550A0(final int i11) {
        if (this.f5901b == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f5971a.m5550A0(i11);
                }
            });
        } else {
            this.f5902c.m94184y(i11);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m5551B(boolean z11) {
        if (this.f5915p == z11) {
            return;
        }
        this.f5915p = z11;
        if (this.f5901b != null) {
            m5625u();
        }
    }

    /* JADX INFO: renamed from: B0 */
    public void m5552B0(boolean z11) {
        this.f5904e = z11;
    }

    /* JADX INFO: renamed from: C */
    public boolean m5553C() {
        return this.f5915p;
    }

    /* JADX INFO: renamed from: C0 */
    public void m5554C0(InterfaceC5068b interfaceC5068b) {
        C37769b c37769b = this.f5908i;
        if (c37769b != null) {
            c37769b.m85203d(interfaceC5068b);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: D */
    public void m5555D() {
        this.f5907h.clear();
        this.f5902c.m94168i();
        if (isVisible()) {
            return;
        }
        this.f5906g = OnVisibleAction.NONE;
    }

    /* JADX INFO: renamed from: D0 */
    public void m5556D0(@Nullable String str) {
        this.f5909j = str;
    }

    /* JADX INFO: renamed from: E */
    public final void m5557E(int i11, int i12) {
        Bitmap bitmap = this.f5882B;
        if (bitmap == null || bitmap.getWidth() < i11 || this.f5882B.getHeight() < i12) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            this.f5882B = bitmapCreateBitmap;
            this.f5883C.setBitmap(bitmapCreateBitmap);
            this.f5893M = true;
            return;
        }
        if (this.f5882B.getWidth() > i11 || this.f5882B.getHeight() > i12) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f5882B, 0, 0, i11, i12);
            this.f5882B = bitmapCreateBitmap2;
            this.f5883C.setBitmap(bitmapCreateBitmap2);
            this.f5893M = true;
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m5558E0(boolean z11) {
        this.f5916q = z11;
    }

    /* JADX INFO: renamed from: F */
    public final void m5559F() {
        if (this.f5883C != null) {
            return;
        }
        this.f5883C = new Canvas();
        this.f5890J = new RectF();
        this.f5891K = new Matrix();
        this.f5892L = new Matrix();
        this.f5884D = new Rect();
        this.f5885E = new RectF();
        this.f5886F = new C36592a();
        this.f5887G = new Rect();
        this.f5888H = new Rect();
        this.f5889I = new RectF();
    }

    /* JADX INFO: renamed from: F0 */
    public void m5560F0(final int i11) {
        if (this.f5901b == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.u
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f6229a.m5560F0(i11);
                }
            });
        } else {
            this.f5902c.m94185z(i11 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: G */
    public AsyncUpdates m5561G() {
        AsyncUpdates asyncUpdates = this.f5894N;
        return asyncUpdates != null ? asyncUpdates : C5072d.m5644d();
    }

    /* JADX INFO: renamed from: G0 */
    public void m5562G0(final String str) {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.a0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h2) {
                    this.f5929a.m5562G0(str);
                }
            });
            return;
        }
        C38077g c38077gM5661l = c5080h.m5661l(str);
        if (c38077gM5661l != null) {
            m5560F0((int) (c38077gM5661l.f85720b + c38077gM5661l.f85721c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + C33978va.f72339h);
    }

    /* JADX INFO: renamed from: H0 */
    public void m5564H0(@FloatRange(from = 0.0d, m1552to = 1.0d) final float f11) {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.x
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h2) {
                    this.f6237a.m5564H0(f11);
                }
            });
        } else {
            this.f5902c.m94185z(C42929k.m94195i(c5080h.m5665p(), this.f5901b.m5655f(), f11));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m5566I0(final int i11, final int i12) {
        if (this.f5901b == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.t
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f6222a.m5566I0(i11, i12);
                }
            });
        } else {
            this.f5902c.m94162A(i11, i12 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: J */
    public boolean m5567J() {
        return this.f5923x;
    }

    /* JADX INFO: renamed from: J0 */
    public void m5568J0(final String str) {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.s
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h2) {
                    this.f6220a.m5568J0(str);
                }
            });
            return;
        }
        C38077g c38077gM5661l = c5080h.m5661l(str);
        if (c38077gM5661l != null) {
            int i11 = (int) c38077gM5661l.f85720b;
            m5566I0(i11, ((int) c38077gM5661l.f85721c) + i11);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + C33978va.f72339h);
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m5569K() {
        return this.f5917r;
    }

    /* JADX INFO: renamed from: K0 */
    public void m5570K0(final int i11) {
        if (this.f5901b == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.v
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f6231a.m5570K0(i11);
                }
            });
        } else {
            this.f5902c.m94163B(i11);
        }
    }

    /* JADX INFO: renamed from: L */
    public C5080h m5571L() {
        return this.f5901b;
    }

    /* JADX INFO: renamed from: L0 */
    public void m5572L0(final String str) {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.b0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h2) {
                    this.f5931a.m5572L0(str);
                }
            });
            return;
        }
        C38077g c38077gM5661l = c5080h.m5661l(str);
        if (c38077gM5661l != null) {
            m5570K0((int) c38077gM5661l.f85720b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + C33978va.f72339h);
    }

    /* JADX INFO: renamed from: M0 */
    public void m5574M0(final float f11) {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.f0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h2) {
                    this.f5949a.m5574M0(f11);
                }
            });
        } else {
            m5570K0((int) C42929k.m94195i(c5080h.m5665p(), this.f5901b.m5655f(), f11));
        }
    }

    /* JADX INFO: renamed from: N0 */
    public void m5576N0(boolean z11) {
        if (this.f5921v == z11) {
            return;
        }
        this.f5921v = z11;
        C5096b c5096b = this.f5918s;
        if (c5096b != null) {
            c5096b.mo5780J(z11);
        }
    }

    /* JADX INFO: renamed from: O */
    public int m5577O() {
        return (int) this.f5902c.m94170k();
    }

    /* JADX INFO: renamed from: O0 */
    public void m5578O0(boolean z11) {
        this.f5920u = z11;
        C5080h c5080h = this.f5901b;
        if (c5080h != null) {
            c5080h.m5671v(z11);
        }
    }

    /* JADX INFO: renamed from: P */
    public final C37769b m5579P() {
        C37769b c37769b = this.f5908i;
        if (c37769b != null && !c37769b.m85201b(m5573M())) {
            this.f5908i = null;
        }
        if (this.f5908i == null) {
            this.f5908i = new C37769b(getCallback(), this.f5909j, null, this.f5901b.m5659j());
        }
        return this.f5908i;
    }

    /* JADX INFO: renamed from: P0 */
    public void m5580P0(@FloatRange(from = 0.0d, m1552to = 1.0d) final float f11) {
        if (this.f5901b == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f5953a.m5580P0(f11);
                }
            });
            return;
        }
        if (C5072d.m5647g()) {
            C5072d.m5642b("Drawable#setProgress");
        }
        this.f5902c.m94184y(this.f5901b.m5657h(f11));
        if (C5072d.m5647g()) {
            C5072d.m5643c("Drawable#setProgress");
        }
    }

    @Nullable
    /* JADX INFO: renamed from: Q */
    public String m5581Q() {
        return this.f5909j;
    }

    /* JADX INFO: renamed from: Q0 */
    public void m5582Q0(RenderMode renderMode) {
        this.f5924y = renderMode;
        m5631x();
    }

    @Nullable
    /* JADX INFO: renamed from: R */
    public C5083i0 m5583R(String str) {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            return null;
        }
        return c5080h.m5659j().get(str);
    }

    /* JADX INFO: renamed from: R0 */
    public void m5584R0(int i11) {
        this.f5902c.setRepeatCount(i11);
    }

    /* JADX INFO: renamed from: S */
    public boolean m5585S() {
        return this.f5916q;
    }

    /* JADX INFO: renamed from: S0 */
    public void m5586S0(int i11) {
        this.f5902c.setRepeatMode(i11);
    }

    /* JADX INFO: renamed from: T */
    public final C38077g m5587T() {
        Iterator<String> it = f5879V.iterator();
        C38077g c38077gM5661l = null;
        while (it.hasNext()) {
            c38077gM5661l = this.f5901b.m5661l(it.next());
            if (c38077gM5661l != null) {
                break;
            }
        }
        return c38077gM5661l;
    }

    /* JADX INFO: renamed from: T0 */
    public void m5588T0(boolean z11) {
        this.f5905f = z11;
    }

    /* JADX INFO: renamed from: U */
    public float m5589U() {
        return this.f5902c.m94172m();
    }

    /* JADX INFO: renamed from: U0 */
    public void m5590U0(float f11) {
        this.f5902c.m94164C(f11);
    }

    /* JADX INFO: renamed from: V */
    public float m5591V() {
        return this.f5902c.m94173n();
    }

    @Nullable
    /* JADX INFO: renamed from: W */
    public C5108r0 m5593W() {
        C5080h c5080h = this.f5901b;
        if (c5080h != null) {
            return c5080h.m5663n();
        }
        return null;
    }

    /* JADX INFO: renamed from: W0 */
    public void m5594W0(C5112t0 c5112t0) {
        this.f5914o = c5112t0;
    }

    @FloatRange(from = 0.0d, m1552to = 1.0d)
    /* JADX INFO: renamed from: X */
    public float m5595X() {
        return this.f5902c.m94169j();
    }

    /* JADX INFO: renamed from: X0 */
    public void m5596X0(boolean z11) {
        this.f5902c.m94165D(z11);
    }

    /* JADX INFO: renamed from: Y */
    public RenderMode m5597Y() {
        return this.f5925z ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    /* JADX INFO: renamed from: Y0 */
    public final boolean m5598Y0() {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            return false;
        }
        float f11 = this.f5900T;
        float fM94169j = this.f5902c.m94169j();
        this.f5900T = fM94169j;
        return Math.abs(fM94169j - f11) * c5080h.m5653d() >= 50.0f;
    }

    /* JADX INFO: renamed from: Z */
    public int m5599Z() {
        return this.f5902c.getRepeatCount();
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m5600Z0() {
        return this.f5911l == null && this.f5914o == null && this.f5901b.m5652c().size() > 0;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: a0 */
    public int m5601a0() {
        return this.f5902c.getRepeatMode();
    }

    /* JADX INFO: renamed from: b0 */
    public float m5602b0() {
        return this.f5902c.m94174o();
    }

    @Nullable
    /* JADX INFO: renamed from: c0 */
    public C5112t0 m5603c0() {
        return this.f5914o;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: d0 */
    public Typeface m5604d0(C38072b c38072b) {
        Map<String, Typeface> map = this.f5911l;
        if (map != null) {
            String strM85957a = c38072b.m85957a();
            if (map.containsKey(strM85957a)) {
                return map.get(strM85957a);
            }
            String strM85958b = c38072b.m85958b();
            if (map.containsKey(strM85958b)) {
                return map.get(strM85958b);
            }
            String str = c38072b.m85957a() + C33820nf.f71144W + c38072b.m85959c();
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        C37768a c37768aM5575N = m5575N();
        if (c37768aM5575N != null) {
            return c37768aM5575N.m85196b(c38072b);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        float fM5808O;
        float fM94169j;
        C5096b c5096b = this.f5918s;
        if (c5096b == null) {
            return;
        }
        boolean zM5563H = m5563H();
        if (zM5563H) {
            try {
                this.f5896P.acquire();
            } catch (InterruptedException unused) {
                if (!zM5563H) {
                    return;
                } else {
                    if ((fM5808O > fM94169j ? 1 : (fM5808O == fM94169j ? 0 : -1)) == 0) {
                        return;
                    }
                }
            } finally {
                if (C5072d.m5647g()) {
                    C5072d.m5643c("Drawable#draw");
                }
                if (zM5563H) {
                    this.f5896P.release();
                    if (c5096b.m5808O() != this.f5902c.m94169j()) {
                        f5880W.execute(this.f5899S);
                    }
                }
            }
        }
        if (C5072d.m5647g()) {
            C5072d.m5642b("Drawable#draw");
        }
        if (zM5563H && m5598Y0()) {
            m5580P0(this.f5902c.m94169j());
        }
        if (this.f5905f) {
            try {
                if (this.f5925z) {
                    m5614n0(canvas, c5096b);
                } else {
                    m5549A(canvas);
                }
            } catch (Throwable th2) {
                C42924f.m94157b("Lottie crashed in draw!", th2);
            }
        } else if (this.f5925z) {
            m5614n0(canvas, c5096b);
        } else {
            m5549A(canvas);
        }
        this.f5893M = false;
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m5606f0() {
        ChoreographerFrameCallbackC42927i choreographerFrameCallbackC42927i = this.f5902c;
        if (choreographerFrameCallbackC42927i == null) {
            return false;
        }
        return choreographerFrameCallbackC42927i.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5919t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            return -1;
        }
        return c5080h.m5651b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            return -1;
        }
        return c5080h.m5651b().width();
    }

    /* JADX INFO: renamed from: h0 */
    public boolean m5608h0() {
        return this.f5922w;
    }

    /* JADX INFO: renamed from: i0 */
    public void m5609i0() {
        this.f5907h.clear();
        this.f5902c.m94176q();
        if (isVisible()) {
            return;
        }
        this.f5906g = OnVisibleAction.NONE;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable.Callback callback;
        if (this.f5893M) {
            return;
        }
        this.f5893M = true;
        if ((!f5878U || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @MainThread
    /* JADX INFO: renamed from: j0 */
    public void m5610j0() {
        if (this.f5918s == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.e0
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f5948a.m5610j0();
                }
            });
            return;
        }
        m5631x();
        if (m5623t() || m5599Z() == 0) {
            if (isVisible()) {
                this.f5902c.m94177r();
                this.f5906g = OnVisibleAction.NONE;
            } else {
                this.f5906g = OnVisibleAction.PLAY;
            }
        }
        if (m5623t()) {
            return;
        }
        C38077g c38077gM5587T = m5587T();
        if (c38077gM5587T != null) {
            m5550A0((int) c38077gM5587T.f85720b);
        } else {
            m5550A0((int) (m5602b0() < 0.0f ? m5591V() : m5589U()));
        }
        this.f5902c.m94168i();
        if (isVisible()) {
            return;
        }
        this.f5906g = OnVisibleAction.NONE;
    }

    /* JADX INFO: renamed from: k0 */
    public void m5611k0() {
        this.f5902c.removeAllListeners();
    }

    /* JADX INFO: renamed from: l0 */
    public void m5612l0() {
        this.f5902c.removeAllUpdateListeners();
        this.f5902c.addUpdateListener(this.f5895O);
    }

    /* JADX INFO: renamed from: m0 */
    public void m5613m0(Animator.AnimatorListener animatorListener) {
        this.f5902c.removeListener(animatorListener);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m5614n0(Canvas canvas, C5096b c5096b) {
        if (this.f5901b == null || c5096b == null) {
            return;
        }
        m5559F();
        canvas.getMatrix(this.f5891K);
        canvas.getClipBounds(this.f5884D);
        m5633y(this.f5884D, this.f5885E);
        this.f5891K.mapRect(this.f5885E);
        m5635z(this.f5885E, this.f5884D);
        if (this.f5917r) {
            this.f5890J.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            c5096b.mo5786b(this.f5890J, null, false);
        }
        this.f5891K.mapRect(this.f5890J);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        m5620r0(this.f5890J, fWidth, fHeight);
        if (!m5605e0()) {
            RectF rectF = this.f5890J;
            Rect rect = this.f5884D;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int iCeil = (int) Math.ceil(this.f5890J.width());
        int iCeil2 = (int) Math.ceil(this.f5890J.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            return;
        }
        m5557E(iCeil, iCeil2);
        if (this.f5893M) {
            this.f5881A.set(this.f5891K);
            this.f5881A.preScale(fWidth, fHeight);
            Matrix matrix = this.f5881A;
            RectF rectF2 = this.f5890J;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f5882B.eraseColor(0);
            c5096b.mo5787d(this.f5883C, this.f5881A, this.f5919t);
            this.f5891K.invert(this.f5892L);
            this.f5892L.mapRect(this.f5889I, this.f5890J);
            m5635z(this.f5889I, this.f5888H);
        }
        this.f5887G.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f5882B, this.f5887G, this.f5888H, this.f5886F);
    }

    /* JADX INFO: renamed from: o0 */
    public List<C38074d> m5615o0(C38074d c38074d) {
        if (this.f5918s == null) {
            C42924f.m94158c("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f5918s.mo5790g(c38074d, 0, arrayList, new C38074d(new String[0]));
        return arrayList;
    }

    @MainThread
    /* JADX INFO: renamed from: p0 */
    public void m5616p0() {
        if (this.f5918s == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f6240a.m5616p0();
                }
            });
            return;
        }
        m5631x();
        if (m5623t() || m5599Z() == 0) {
            if (isVisible()) {
                this.f5902c.m94181v();
                this.f5906g = OnVisibleAction.NONE;
            } else {
                this.f5906g = OnVisibleAction.RESUME;
            }
        }
        if (m5623t()) {
            return;
        }
        m5550A0((int) (m5602b0() < 0.0f ? m5591V() : m5589U()));
        this.f5902c.m94168i();
        if (isVisible()) {
            return;
        }
        this.f5906g = OnVisibleAction.NONE;
    }

    /* JADX INFO: renamed from: q */
    public void m5617q(Animator.AnimatorListener animatorListener) {
        this.f5902c.addListener(animatorListener);
    }

    /* JADX INFO: renamed from: q0 */
    public void m5618q0() {
        this.f5902c.m94182w();
    }

    /* JADX INFO: renamed from: r */
    public void m5619r(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f5902c.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m5620r0(RectF rectF, float f11, float f12) {
        rectF.set(rectF.left * f11, rectF.top * f12, rectF.right * f11, rectF.bottom * f12);
    }

    /* JADX INFO: renamed from: s */
    public <T> void m5621s(final C38074d c38074d, final T t11, @Nullable final C43350c<T> c43350c) {
        C5096b c5096b = this.f5918s;
        if (c5096b == null) {
            this.f5907h.add(new InterfaceC5064a() { // from class: com.airbnb.lottie.w
                @Override // com.airbnb.lottie.LottieDrawable.InterfaceC5064a
                /* JADX INFO: renamed from: a */
                public final void mo5638a(C5080h c5080h) {
                    this.f6233a.m5621s(c38074d, t11, c43350c);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (c38074d == C38074d.f85714c) {
            c5096b.mo5785a(t11, c43350c);
        } else if (c38074d.m85968d() != null) {
            c38074d.m85968d().mo5785a(t11, c43350c);
        } else {
            List<C38074d> listM5615o0 = m5615o0(c38074d);
            for (int i11 = 0; i11 < listM5615o0.size(); i11++) {
                listM5615o0.get(i11).m85968d().mo5785a(t11, c43350c);
            }
            zIsEmpty = true ^ listM5615o0.isEmpty();
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t11 == InterfaceC5091m0.f5995E) {
                m5580P0(m5595X());
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m5622s0(boolean z11) {
        this.f5922w = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, m1553to = 255) int i11) {
        this.f5919t = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        C42924f.m94158c("Use addColorFilter instead.");
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5623t() {
        return this.f5903d || this.f5904e;
    }

    /* JADX INFO: renamed from: t0 */
    public void m5624t0(@Nullable AsyncUpdates asyncUpdates) {
        this.f5894N = asyncUpdates;
    }

    /* JADX INFO: renamed from: u */
    public final void m5625u() {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            return;
        }
        C5096b c5096b = new C5096b(this, C42382v.m92996a(c5080h), c5080h.m5660k(), c5080h);
        this.f5918s = c5096b;
        if (this.f5921v) {
            c5096b.mo5780J(true);
        }
        this.f5918s.m5809P(this.f5917r);
    }

    /* JADX INFO: renamed from: u0 */
    public void m5626u0(boolean z11) {
        if (z11 != this.f5923x) {
            this.f5923x = z11;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m5627v() {
        this.f5907h.clear();
        this.f5902c.cancel();
        if (isVisible()) {
            return;
        }
        this.f5906g = OnVisibleAction.NONE;
    }

    /* JADX INFO: renamed from: v0 */
    public void m5628v0(boolean z11) {
        if (z11 != this.f5917r) {
            this.f5917r = z11;
            C5096b c5096b = this.f5918s;
            if (c5096b != null) {
                c5096b.m5809P(z11);
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: w */
    public void m5629w() {
        if (this.f5902c.isRunning()) {
            this.f5902c.cancel();
            if (!isVisible()) {
                this.f5906g = OnVisibleAction.NONE;
            }
        }
        this.f5901b = null;
        this.f5918s = null;
        this.f5908i = null;
        this.f5900T = -3.4028235E38f;
        this.f5902c.m94167h();
        invalidateSelf();
    }

    /* JADX INFO: renamed from: w0 */
    public boolean m5630w0(C5080h c5080h) {
        if (this.f5901b == c5080h) {
            return false;
        }
        this.f5893M = true;
        m5629w();
        this.f5901b = c5080h;
        m5625u();
        this.f5902c.m94183x(c5080h);
        m5580P0(this.f5902c.getAnimatedFraction());
        Iterator it = new ArrayList(this.f5907h).iterator();
        while (it.hasNext()) {
            InterfaceC5064a interfaceC5064a = (InterfaceC5064a) it.next();
            if (interfaceC5064a != null) {
                interfaceC5064a.mo5638a(c5080h);
            }
            it.remove();
        }
        this.f5907h.clear();
        c5080h.m5671v(this.f5920u);
        m5631x();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m5631x() {
        C5080h c5080h = this.f5901b;
        if (c5080h == null) {
            return;
        }
        this.f5925z = this.f5924y.useSoftwareRendering(Build.VERSION.SDK_INT, c5080h.m5666q(), c5080h.m5662m());
    }

    /* JADX INFO: renamed from: x0 */
    public void m5632x0(String str) {
        this.f5912m = str;
        C37768a c37768aM5575N = m5575N();
        if (c37768aM5575N != null) {
            c37768aM5575N.m85197c(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m5633y(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: renamed from: y0 */
    public void m5634y0(C5066a c5066a) {
        this.f5913n = c5066a;
        C37768a c37768a = this.f5910k;
        if (c37768a != null) {
            c37768a.m85198d(c5066a);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5635z(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: z0 */
    public void m5636z0(@Nullable Map<String, Typeface> map) {
        if (map == this.f5911l) {
            return;
        }
        this.f5911l = map;
        invalidateSelf();
    }

    public LottieDrawable() {
        ChoreographerFrameCallbackC42927i choreographerFrameCallbackC42927i = new ChoreographerFrameCallbackC42927i();
        this.f5902c = choreographerFrameCallbackC42927i;
        this.f5903d = true;
        this.f5904e = false;
        this.f5905f = false;
        this.f5906g = OnVisibleAction.NONE;
        this.f5907h = new ArrayList<>();
        this.f5916q = false;
        this.f5917r = true;
        this.f5919t = 255;
        this.f5923x = false;
        this.f5924y = RenderMode.AUTOMATIC;
        this.f5925z = false;
        this.f5881A = new Matrix();
        this.f5893M = false;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.c0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LottieDrawable.m5539g(this.f5934b, valueAnimator);
            }
        };
        this.f5895O = animatorUpdateListener;
        this.f5896P = new Semaphore(1);
        this.f5899S = new Runnable() { // from class: com.airbnb.lottie.d0
            @Override // java.lang.Runnable
            public final void run() {
                LottieDrawable.m5543k(this.f5945b);
            }
        };
        this.f5900T = -3.4028235E38f;
        choreographerFrameCallbackC42927i.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m5539g(LottieDrawable lottieDrawable, ValueAnimator valueAnimator) {
        if (lottieDrawable.m5563H()) {
            lottieDrawable.invalidateSelf();
            return;
        }
        C5096b c5096b = lottieDrawable.f5918s;
        if (c5096b != null) {
            c5096b.mo5782L(lottieDrawable.f5902c.m94169j());
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m5546n(LottieDrawable lottieDrawable) {
        Drawable.Callback callback = lottieDrawable.getCallback();
        if (callback != null) {
            callback.invalidateDrawable(lottieDrawable);
        }
    }

    /* JADX INFO: renamed from: H */
    public boolean m5563H() {
        if (m5561G() == AsyncUpdates.ENABLED) {
            return true;
        }
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public Bitmap m5565I(String str) {
        C37769b c37769bM5579P = m5579P();
        if (c37769bM5579P != null) {
            return c37769bM5579P.m85200a(str);
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: M */
    public final Context m5573M() {
        Drawable.Callback callback = getCallback();
        if (callback == null || !(callback instanceof View)) {
            return null;
        }
        return ((View) callback).getContext();
    }

    /* JADX INFO: renamed from: N */
    public final C37768a m5575N() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f5910k == null) {
            C37768a c37768a = new C37768a(getCallback(), this.f5913n);
            this.f5910k = c37768a;
            String str = this.f5912m;
            if (str != null) {
                c37768a.m85197c(str);
            }
        }
        return this.f5910k;
    }

    /* JADX INFO: renamed from: V0 */
    public void m5592V0(Boolean bool) {
        this.f5903d = bool.booleanValue();
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m5605e0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        ViewParent parent = ((View) callback).getParent();
        if (!(parent instanceof ViewGroup)) {
            return false;
        }
        return !((ViewGroup) parent).getClipChildren();
    }

    /* JADX INFO: renamed from: g0 */
    public boolean m5607g0() {
        if (isVisible()) {
            return this.f5902c.isRunning();
        }
        OnVisibleAction onVisibleAction = this.f5906g;
        if (onVisibleAction != OnVisibleAction.PLAY && onVisibleAction != OnVisibleAction.RESUME) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m5606f0();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z11, z12);
        if (z11) {
            OnVisibleAction onVisibleAction = this.f5906g;
            if (onVisibleAction == OnVisibleAction.PLAY) {
                m5610j0();
                return visible;
            }
            if (onVisibleAction == OnVisibleAction.RESUME) {
                m5616p0();
                return visible;
            }
        } else {
            if (this.f5902c.isRunning()) {
                m5609i0();
                this.f5906g = OnVisibleAction.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f5906g = OnVisibleAction.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m5610j0();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        m5555D();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }
}
