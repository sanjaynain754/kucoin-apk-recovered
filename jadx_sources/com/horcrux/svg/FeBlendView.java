package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.react.bridge.ReactContext;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FeBlendView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: d */
    public String f12926d;

    /* JADX INFO: renamed from: e */
    public String f12927e;

    /* JADX INFO: renamed from: f */
    public FilterProperties$FeBlendMode f12928f;

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ float[] m13996n(float[] fArr, float[] fArr2) {
        float f11 = fArr[0];
        float f12 = 1.0f - f11;
        float f13 = fArr2[0];
        float f14 = 1.0f - f13;
        float f15 = fArr[1] * f11;
        float f16 = fArr2[1];
        float f17 = (f15 * f14) + (f16 * f13 * f12) + (f15 * f16 * f13);
        float f18 = fArr[2] * f11;
        float f19 = fArr2[2];
        float f21 = fArr[3] * f11;
        float f22 = fArr2[3];
        return new float[]{1.0f - (f12 * f14), f17, (f18 * f14) + (f19 * f13 * f12) + (f18 * f19 * f13), (f14 * f21) + (f22 * f13 * f12) + (f21 * f22 * f13)};
    }

    /* JADX INFO: renamed from: com.horcrux.svg.FeBlendView$a */
    public static /* synthetic */ class C9188a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12929a;

        static {
            int[] iArr = new int[FilterProperties$FeBlendMode.values().length];
            f12929a = iArr;
            try {
                iArr[FilterProperties$FeBlendMode.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12929a[FilterProperties$FeBlendMode.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12929a[FilterProperties$FeBlendMode.SCREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12929a[FilterProperties$FeBlendMode.LIGHTEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12929a[FilterProperties$FeBlendMode.DARKEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12929a[FilterProperties$FeBlendMode.MULTIPLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapM14023h = FilterPrimitiveView.m14023h(map, bitmap, this.f12926d);
        Bitmap bitmapM14023h2 = FilterPrimitiveView.m14023h(map, bitmap, this.f12927e);
        if (this.f12928f == FilterProperties$FeBlendMode.MULTIPLY) {
            return CustomFilter.apply(bitmapM14023h, bitmapM14023h2, new InterfaceC9233a() { // from class: com.horcrux.svg.b
                @Override // com.horcrux.svg.InterfaceC9233a
                /* JADX INFO: renamed from: a */
                public final float[] mo14208a(float[] fArr, float[] fArr2) {
                    return FeBlendView.m13996n(fArr, fArr2);
                }
            });
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM14023h.getWidth(), bitmapM14023h.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapM14023h, 0.0f, 0.0f, paint);
        int i11 = C9188a.f12929a[this.f12928f.ordinal()];
        if (i11 == 1 || i11 == 2) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        } else if (i11 == 3) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SCREEN));
        } else if (i11 == 4) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.LIGHTEN));
        } else if (i11 == 5) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DARKEN));
        }
        canvas.drawBitmap(bitmapM14023h2, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: o */
    public void m13998o(String str) {
        this.f12926d = str;
        invalidate();
    }

    /* JADX INFO: renamed from: p */
    public void m13999p(String str) {
        this.f12927e = str;
        invalidate();
    }

    public FeBlendView(ReactContext reactContext) {
        super(reactContext);
        this.f12954c.f12968mX = new SVGLength(0.0d);
        this.f12954c.f12969mY = new SVGLength(0.0d);
        this.f12954c.f12967mW = new SVGLength("100%");
        this.f12954c.f12966mH = new SVGLength("100%");
    }

    /* JADX INFO: renamed from: q */
    public void m14000q(String str) {
        this.f12928f = FilterProperties$FeBlendMode.getEnum(str);
        invalidate();
    }
}
