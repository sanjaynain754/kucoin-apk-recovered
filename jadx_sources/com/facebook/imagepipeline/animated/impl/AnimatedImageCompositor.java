package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.imagepipeline.animated.base.AnimatedDrawableFrameInfo;
import p006a4.AbstractC0110a;
import p448m5.C42429d;
import p448m5.InterfaceC42426a;

/* JADX INFO: loaded from: classes34.dex */
public class AnimatedImageCompositor {

    /* JADX INFO: renamed from: a */
    public final InterfaceC42426a f8834a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5637b f8835b;

    /* JADX INFO: renamed from: c */
    public final Paint f8836c;

    /* JADX INFO: renamed from: d */
    public final boolean f8837d;

    public enum FrameNeededResult {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$b */
    public interface InterfaceC5637b {
        /* JADX INFO: renamed from: a */
        void mo8812a(int i11, Bitmap bitmap);

        /* JADX INFO: renamed from: b */
        AbstractC0110a<Bitmap> mo8813b(int i11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9106d(int i11) {
        if (i11 == 0) {
            return true;
        }
        AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo93132c = this.f8834a.mo93132c(i11);
        AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo93132c2 = this.f8834a.mo93132c(i11 - 1);
        if (animatedDrawableFrameInfoMo93132c.f8830f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND && m9105c(animatedDrawableFrameInfoMo93132c)) {
            return true;
        }
        return animatedDrawableFrameInfoMo93132c2.f8831g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND && m9105c(animatedDrawableFrameInfoMo93132c2);
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor$a */
    public static /* synthetic */ class C5636a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8839a;

        static {
            int[] iArr = new int[FrameNeededResult.values().length];
            f8839a = iArr;
            try {
                iArr[FrameNeededResult.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8839a[FrameNeededResult.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8839a[FrameNeededResult.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8839a[FrameNeededResult.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m9103a(Canvas canvas, AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        int i11 = animatedDrawableFrameInfo.f8826b;
        int i12 = animatedDrawableFrameInfo.f8827c;
        canvas.drawRect(i11, i12, i11 + animatedDrawableFrameInfo.f8828d, i12 + animatedDrawableFrameInfo.f8829e, this.f8836c);
    }

    /* JADX INFO: renamed from: b */
    public final FrameNeededResult m9104b(int i11) {
        AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo93132c = this.f8834a.mo93132c(i11);
        AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = animatedDrawableFrameInfoMo93132c.f8831g;
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_DO_NOT) {
            return FrameNeededResult.REQUIRED;
        }
        if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
            return m9105c(animatedDrawableFrameInfoMo93132c) ? FrameNeededResult.NOT_REQUIRED : FrameNeededResult.REQUIRED;
        }
        return disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS ? FrameNeededResult.SKIP : FrameNeededResult.ABORT;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m9105c(AnimatedDrawableFrameInfo animatedDrawableFrameInfo) {
        return animatedDrawableFrameInfo.f8826b == 0 && animatedDrawableFrameInfo.f8827c == 0 && animatedDrawableFrameInfo.f8828d == this.f8834a.mo93134e() && animatedDrawableFrameInfo.f8829e == this.f8834a.mo93138i();
    }

    /* JADX INFO: renamed from: e */
    public final void m9107e(Bitmap bitmap) {
        C42429d c42429dMo93135f = this.f8834a.mo93135f();
        if (c42429dMo93135f == null) {
            return;
        }
        c42429dMo93135f.m93143c();
    }

    /* JADX INFO: renamed from: f */
    public final int m9108f(int i11, Canvas canvas) {
        while (i11 >= 0) {
            int i12 = C5636a.f8839a[m9104b(i11).ordinal()];
            if (i12 == 1) {
                AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo93132c = this.f8834a.mo93132c(i11);
                AbstractC0110a<Bitmap> abstractC0110aMo8813b = this.f8835b.mo8813b(i11);
                if (abstractC0110aMo8813b != null) {
                    try {
                        canvas.drawBitmap(abstractC0110aMo8813b.m565l(), 0.0f, 0.0f, (Paint) null);
                        if (animatedDrawableFrameInfoMo93132c.f8831g == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                            m9103a(canvas, animatedDrawableFrameInfoMo93132c);
                        }
                        return i11 + 1;
                    } finally {
                        if (!this.f8837d) {
                            abstractC0110aMo8813b.close();
                        }
                    }
                }
                if (m9106d(i11)) {
                    return i11;
                }
                i11--;
            } else {
                if (i12 == 2) {
                    return i11 + 1;
                }
                if (i12 == 3) {
                    return i11;
                }
                i11--;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m9109g(int i11, Bitmap bitmap) {
        this.f8834a.mo93139j(i11, new Canvas(bitmap));
    }

    /* JADX INFO: renamed from: h */
    public void m9110h(int i11, Bitmap bitmap) {
        if (this.f8837d) {
            m9109g(i11, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int iM9108f = !m9106d(i11) ? m9108f(i11 - 1, canvas) : i11; iM9108f < i11; iM9108f++) {
            AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo93132c = this.f8834a.mo93132c(iM9108f);
            AnimatedDrawableFrameInfo.DisposalMethod disposalMethod = animatedDrawableFrameInfoMo93132c.f8831g;
            if (disposalMethod != AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_PREVIOUS) {
                if (animatedDrawableFrameInfoMo93132c.f8830f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
                    m9103a(canvas, animatedDrawableFrameInfoMo93132c);
                }
                this.f8834a.mo93136g(iM9108f, canvas);
                this.f8835b.mo8812a(iM9108f, bitmap);
                if (disposalMethod == AnimatedDrawableFrameInfo.DisposalMethod.DISPOSE_TO_BACKGROUND) {
                    m9103a(canvas, animatedDrawableFrameInfoMo93132c);
                }
            }
        }
        AnimatedDrawableFrameInfo animatedDrawableFrameInfoMo93132c2 = this.f8834a.mo93132c(i11);
        if (animatedDrawableFrameInfoMo93132c2.f8830f == AnimatedDrawableFrameInfo.BlendOperation.NO_BLEND) {
            m9103a(canvas, animatedDrawableFrameInfoMo93132c2);
        }
        this.f8834a.mo93136g(i11, canvas);
        m9107e(bitmap);
    }

    public AnimatedImageCompositor(InterfaceC42426a interfaceC42426a, boolean z11, InterfaceC5637b interfaceC5637b) {
        this.f8834a = interfaceC42426a;
        this.f8835b = interfaceC5637b;
        this.f8837d = z11;
        Paint paint = new Paint();
        this.f8836c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
