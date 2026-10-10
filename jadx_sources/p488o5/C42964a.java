package p488o5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import com.facebook.imagepipeline.animated.util.AnimatedDrawableUtil;
import p448m5.C42429d;
import p448m5.InterfaceC42426a;
import p448m5.InterfaceC42427b;
import p448m5.InterfaceC42428c;

/* JADX INFO: renamed from: o5.a */
/* JADX INFO: compiled from: AnimatedDrawableBackendImpl.java */
/* JADX INFO: loaded from: classes34.dex */
public class C42964a implements InterfaceC42426a {

    /* JADX INFO: renamed from: a */
    public final AnimatedDrawableUtil f95090a;

    /* JADX INFO: renamed from: b */
    public final C42429d f95091b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC42427b f95092c;

    /* JADX INFO: renamed from: d */
    public final Rect f95093d;

    /* JADX INFO: renamed from: e */
    public final int[] f95094e;

    /* JADX INFO: renamed from: f */
    public final int[] f95095f;

    /* JADX INFO: renamed from: g */
    public final int f95096g;

    /* JADX INFO: renamed from: h */
    public final AnimatedDrawableFrameInfo[] f95097h;

    /* JADX INFO: renamed from: i */
    public final Rect f95098i = new Rect();

    /* JADX INFO: renamed from: j */
    public final Rect f95099j = new Rect();

    /* JADX INFO: renamed from: k */
    public final boolean f95100k;

    /* JADX INFO: renamed from: l */
    public final Paint f95101l;

    /* JADX INFO: renamed from: m */
    public Bitmap f95102m;

    /* JADX INFO: renamed from: l */
    public static Rect m94339l(InterfaceC42427b interfaceC42427b, Rect rect) {
        return rect == null ? new Rect(0, 0, interfaceC42427b.getWidth(), interfaceC42427b.getHeight()) : new Rect(0, 0, Math.min(rect.width(), interfaceC42427b.getWidth()), Math.min(rect.height(), interfaceC42427b.getHeight()));
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m94340k() {
        Bitmap bitmap = this.f95102m;
        if (bitmap != null) {
            bitmap.recycle();
            this.f95102m = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized Bitmap m94342n(int i11, int i12) {
        try {
            Bitmap bitmap = this.f95102m;
            if (bitmap != null && (bitmap.getWidth() < i11 || this.f95102m.getHeight() < i12)) {
                m94340k();
            }
            if (this.f95102m == null) {
                this.f95102m = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            }
            this.f95102m.eraseColor(0);
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f95102m;
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: a */
    public int mo93130a() {
        return this.f95092c.mo7824a();
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: b */
    public int mo93131b() {
        return this.f95092c.mo7825b();
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: c */
    public AnimatedDrawableFrameInfo mo93132c(int i11) {
        return this.f95097h[i11];
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: d */
    public int mo93133d(int i11) {
        return this.f95094e[i11];
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: e */
    public int mo93134e() {
        return this.f95093d.width();
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: f */
    public C42429d mo93135f() {
        return this.f95091b;
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: g */
    public void mo93136g(int i11, Canvas canvas) {
        InterfaceC42428c interfaceC42428cMo7828e = this.f95092c.mo7828e(i11);
        try {
            if (interfaceC42428cMo7828e.getWidth() > 0 && interfaceC42428cMo7828e.getHeight() > 0) {
                if (this.f95092c.mo7827d()) {
                    m94344p(canvas, interfaceC42428cMo7828e);
                } else {
                    m94343o(canvas, interfaceC42428cMo7828e);
                }
            }
        } finally {
            interfaceC42428cMo7828e.dispose();
        }
    }

    @Override // p448m5.InterfaceC42426a
    public int getDurationMs() {
        return this.f95096g;
    }

    @Override // p448m5.InterfaceC42426a
    public int getHeight() {
        return this.f95092c.getHeight();
    }

    @Override // p448m5.InterfaceC42426a
    public int getWidth() {
        return this.f95092c.getWidth();
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: h */
    public InterfaceC42426a mo93137h(Rect rect) {
        return m94339l(this.f95092c, rect).equals(this.f95093d) ? this : new C42964a(this.f95090a, this.f95091b, rect, this.f95100k);
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: i */
    public int mo93138i() {
        return this.f95093d.height();
    }

    @Override // p448m5.InterfaceC42426a
    /* JADX INFO: renamed from: j */
    public void mo93139j(int i11, Canvas canvas) {
        InterfaceC42428c interfaceC42428cMo7828e = this.f95092c.mo7828e(i11);
        AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo7826c = this.f95092c.mo7826c(i11);
        AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo7826c2 = i11 == 0 ? null : this.f95092c.mo7826c(i11 - 1);
        try {
            if (interfaceC42428cMo7828e.getWidth() > 0 && interfaceC42428cMo7828e.getHeight() > 0) {
                if (this.f95092c.mo7827d()) {
                    m94346r(canvas, interfaceC42428cMo7828e, animatedDrawableFrameInfoMo7826c, animatedDrawableFrameInfoMo7826c2);
                } else {
                    m94345q(canvas, interfaceC42428cMo7828e, animatedDrawableFrameInfoMo7826c, animatedDrawableFrameInfoMo7826c2);
                }
            }
        } finally {
            interfaceC42428cMo7828e.dispose();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m94341m(Canvas canvas, float f11, float f12, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        if (animatedDrawableFrameInfo.f8831g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            int iCeil = (int) Math.ceil(animatedDrawableFrameInfo.f8828d * f11);
            int iCeil2 = (int) Math.ceil(animatedDrawableFrameInfo.f8829e * f12);
            int iCeil3 = (int) Math.ceil(animatedDrawableFrameInfo.f8826b * f11);
            int iCeil4 = (int) Math.ceil(animatedDrawableFrameInfo.f8827c * f12);
            canvas.drawRect(new Rect(iCeil3, iCeil4, iCeil + iCeil3, iCeil2 + iCeil4), this.f95101l);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m94343o(Canvas canvas, InterfaceC42428c interfaceC42428c) {
        int width;
        int height;
        int iMo7816a;
        int iMo7817b;
        if (this.f95100k) {
            float fMax = Math.max(interfaceC42428c.getWidth() / Math.min(interfaceC42428c.getWidth(), canvas.getWidth()), interfaceC42428c.getHeight() / Math.min(interfaceC42428c.getHeight(), canvas.getHeight()));
            width = (int) (interfaceC42428c.getWidth() / fMax);
            height = (int) (interfaceC42428c.getHeight() / fMax);
            iMo7816a = (int) (interfaceC42428c.mo7816a() / fMax);
            iMo7817b = (int) (interfaceC42428c.mo7817b() / fMax);
        } else {
            width = interfaceC42428c.getWidth();
            height = interfaceC42428c.getHeight();
            iMo7816a = interfaceC42428c.mo7816a();
            iMo7817b = interfaceC42428c.mo7817b();
        }
        synchronized (this) {
            Bitmap bitmapM94342n = m94342n(width, height);
            this.f95102m = bitmapM94342n;
            interfaceC42428c.mo7818c(width, height, bitmapM94342n);
            canvas.save();
            canvas.translate(iMo7816a, iMo7817b);
            canvas.drawBitmap(this.f95102m, 0.0f, 0.0f, (Paint) null);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m94344p(Canvas canvas, InterfaceC42428c interfaceC42428c) {
        double dWidth = ((double) this.f95093d.width()) / ((double) this.f95092c.getWidth());
        double dHeight = ((double) this.f95093d.height()) / ((double) this.f95092c.getHeight());
        int iRound = (int) Math.round(((double) interfaceC42428c.getWidth()) * dWidth);
        int iRound2 = (int) Math.round(((double) interfaceC42428c.getHeight()) * dHeight);
        int iMo7816a = (int) (((double) interfaceC42428c.mo7816a()) * dWidth);
        int iMo7817b = (int) (((double) interfaceC42428c.mo7817b()) * dHeight);
        synchronized (this) {
            try {
                int iWidth = this.f95093d.width();
                int iHeight = this.f95093d.height();
                m94342n(iWidth, iHeight);
                Bitmap bitmap = this.f95102m;
                if (bitmap != null) {
                    interfaceC42428c.mo7818c(iRound, iRound2, bitmap);
                }
                this.f95098i.set(0, 0, iWidth, iHeight);
                this.f95099j.set(iMo7816a, iMo7817b, iWidth + iMo7816a, iHeight + iMo7817b);
                Bitmap bitmap2 = this.f95102m;
                if (bitmap2 != null) {
                    canvas.drawBitmap(bitmap2, this.f95098i, this.f95099j, (Paint) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m94345q(Canvas canvas, InterfaceC42428c interfaceC42428c, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        Rect rect = this.f95093d;
        if (rect == null || rect.width() <= 0 || this.f95093d.height() <= 0) {
            return;
        }
        float width = canvas.getWidth() / this.f95093d.width();
        if (animatedDrawableFrameInfo2 != null) {
            m94341m(canvas, width, width, animatedDrawableFrameInfo2);
        }
        int width2 = interfaceC42428c.getWidth();
        int height = interfaceC42428c.getHeight();
        Rect rect2 = new Rect(0, 0, width2, height);
        int i11 = (int) (width2 * width);
        int i12 = (int) (height * width);
        int iMo7816a = (int) (interfaceC42428c.mo7816a() * width);
        int iMo7817b = (int) (interfaceC42428c.mo7817b() * width);
        Rect rect3 = new Rect(iMo7816a, iMo7817b, i11 + iMo7816a, i12 + iMo7817b);
        if (animatedDrawableFrameInfo.f8830f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect3, this.f95101l);
        }
        synchronized (this) {
            Bitmap bitmapM94342n = m94342n(width2, height);
            interfaceC42428c.mo7818c(width2, height, bitmapM94342n);
            canvas.drawBitmap(bitmapM94342n, rect2, rect3, (Paint) null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m94346r(Canvas canvas, InterfaceC42428c interfaceC42428c, AnimatedDrawableFrameInfo animatedDrawableFrameInfo, AnimatedDrawableFrameInfo animatedDrawableFrameInfo2) {
        float f11;
        float f12;
        float f13;
        float f14;
        int width = this.f95092c.getWidth();
        int height = this.f95092c.getHeight();
        float f15 = width;
        float f16 = height;
        int width2 = interfaceC42428c.getWidth();
        int height2 = interfaceC42428c.getHeight();
        int iMo7816a = interfaceC42428c.mo7816a();
        int iMo7817b = interfaceC42428c.mo7817b();
        if (f15 > canvas.getWidth() || f16 > canvas.getHeight()) {
            int iMin = Math.min(canvas.getWidth(), width);
            int iMin2 = Math.min(canvas.getHeight(), height);
            float f17 = f15 / f16;
            if (iMin > iMin2) {
                f12 = iMin;
                f11 = f12 / f17;
            } else {
                f11 = iMin2;
                f12 = f11 * f17;
            }
            f13 = f12 / f15;
            f14 = f11 / f16;
            width2 = (int) Math.ceil(interfaceC42428c.getWidth() * f13);
            height2 = (int) Math.ceil(interfaceC42428c.getHeight() * f14);
            iMo7816a = (int) Math.ceil(interfaceC42428c.mo7816a() * f13);
            iMo7817b = (int) Math.ceil(interfaceC42428c.mo7817b() * f14);
        } else {
            f13 = 1.0f;
            f14 = 1.0f;
        }
        Rect rect = new Rect(0, 0, width2, height2);
        Rect rect2 = new Rect(iMo7816a, iMo7817b, iMo7816a + width2, iMo7817b + height2);
        if (animatedDrawableFrameInfo2 != null) {
            m94341m(canvas, f13, f14, animatedDrawableFrameInfo2);
        }
        if (animatedDrawableFrameInfo.f8830f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            canvas.drawRect(rect2, this.f95101l);
        }
        synchronized (this) {
            Bitmap bitmapM94342n = m94342n(width2, height2);
            interfaceC42428c.mo7818c(width2, height2, bitmapM94342n);
            canvas.drawBitmap(bitmapM94342n, rect, rect2, (Paint) null);
        }
    }

    public C42964a(AnimatedDrawableUtil animatedDrawableUtil, C42429d c42429d, Rect rect, boolean z11) {
        this.f95090a = animatedDrawableUtil;
        this.f95091b = c42429d;
        InterfaceC42427b interfaceC42427bM93144d = c42429d.m93144d();
        this.f95092c = interfaceC42427bM93144d;
        int[] iArrMo7831h = interfaceC42427bM93144d.mo7831h();
        this.f95094e = iArrMo7831h;
        animatedDrawableUtil.m9111a(iArrMo7831h);
        this.f95096g = animatedDrawableUtil.m9113c(iArrMo7831h);
        this.f95095f = animatedDrawableUtil.m9112b(iArrMo7831h);
        this.f95093d = m94339l(interfaceC42427bM93144d, rect);
        this.f95100k = z11;
        this.f95097h = new AnimatedDrawableFrameInfo[interfaceC42427bM93144d.mo7824a()];
        for (int i11 = 0; i11 < this.f95092c.mo7824a(); i11++) {
            this.f95097h[i11] = this.f95092c.mo7826c(i11);
        }
        Paint paint = new Paint();
        this.f95101l = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
