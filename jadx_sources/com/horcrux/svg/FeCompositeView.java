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
class FeCompositeView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: d */
    public String f12934d;

    /* JADX INFO: renamed from: e */
    public String f12935e;

    /* JADX INFO: renamed from: f */
    public float f12936f;

    /* JADX INFO: renamed from: g */
    public float f12937g;

    /* JADX INFO: renamed from: h */
    public float f12938h;

    /* JADX INFO: renamed from: i */
    public float f12939i;

    /* JADX INFO: renamed from: j */
    public FilterProperties$FeCompositeOperator f12940j;

    /* JADX INFO: renamed from: com.horcrux.svg.FeCompositeView$a */
    public static /* synthetic */ class C9190a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12941a;

        static {
            int[] iArr = new int[FilterProperties$FeCompositeOperator.values().length];
            f12941a = iArr;
            try {
                iArr[FilterProperties$FeCompositeOperator.OVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12941a[FilterProperties$FeCompositeOperator.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12941a[FilterProperties$FeCompositeOperator.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12941a[FilterProperties$FeCompositeOperator.ATOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12941a[FilterProperties$FeCompositeOperator.XOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12941a[FilterProperties$FeCompositeOperator.ARITHMETIC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapM14023h = FilterPrimitiveView.m14023h(map, bitmap, this.f12934d);
        Bitmap bitmapM14023h2 = FilterPrimitiveView.m14023h(map, bitmap, this.f12935e);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM14023h.getWidth(), bitmapM14023h.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        canvas.drawBitmap(bitmapM14023h, 0.0f, 0.0f, paint);
        switch (C9190a.f12941a[this.f12940j.ordinal()]) {
            case 1:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                break;
            case 2:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                break;
            case 3:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                break;
            case 4:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
                break;
            case 5:
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
                break;
            case 6:
                int width = bitmapCreateBitmap.getWidth() * bitmapCreateBitmap.getHeight();
                int[] iArr = new int[width];
                bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                int width2 = bitmapCreateBitmap.getWidth();
                int width3 = bitmapCreateBitmap.getWidth();
                int height = bitmapCreateBitmap.getHeight();
                int[] iArr2 = new int[width];
                bitmapM14023h2.getPixels(iArr2, 0, width2, 0, 0, width3, height);
                int i11 = 0;
                while (i11 < width) {
                    int i12 = iArr[i11];
                    int i13 = iArr2[i11];
                    int i14 = width;
                    int[] iArr3 = iArr2;
                    float f11 = this.f12936f;
                    float f12 = (i12 >> 16) & 255;
                    float f13 = (i13 >> 16) & 255;
                    float f14 = f11 * f12 * f13;
                    float f15 = this.f12937g;
                    float f16 = f14 + (f12 * f15);
                    float f17 = this.f12938h;
                    float f18 = f16 + (f13 * f17);
                    float f19 = this.f12939i;
                    int i15 = (int) (f18 + f19);
                    float f21 = (i12 >> 8) & 255;
                    float f22 = (i13 >> 8) & 255;
                    int i16 = (int) ((f11 * f21 * f22) + (f21 * f15) + (f22 * f17) + f19);
                    float f23 = i12 & 255;
                    float f24 = i13 & 255;
                    int i17 = (int) ((f11 * f23 * f24) + (f23 * f15) + (f24 * f17) + f19);
                    float f25 = i12 >>> 24;
                    float f26 = i13 >>> 24;
                    int i18 = (int) ((f11 * f25 * f26) + (f25 * f15) + (f17 * f26) + f19);
                    int iMin = Math.min(255, Math.max(0, i15));
                    iArr[i11] = (Math.min(255, Math.max(0, i16)) << 8) | (iMin << 16) | (Math.min(255, Math.max(0, i18)) << 24) | Math.min(255, Math.max(0, i17));
                    i11++;
                    width = i14;
                    iArr2 = iArr3;
                }
                int width4 = bitmapCreateBitmap.getWidth();
                int width5 = bitmapCreateBitmap.getWidth();
                bitmapCreateBitmap = bitmapCreateBitmap;
                bitmapCreateBitmap.setPixels(iArr, 0, width4, 0, 0, width5, bitmapCreateBitmap.getHeight());
                break;
        }
        if (this.f12940j != FilterProperties$FeCompositeOperator.ARITHMETIC) {
            canvas.drawBitmap(bitmapM14023h2, 0.0f, 0.0f, paint);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: n */
    public void m14004n(String str) {
        this.f12934d = str;
        invalidate();
    }

    /* JADX INFO: renamed from: o */
    public void m14005o(String str) {
        this.f12935e = str;
        invalidate();
    }

    public FeCompositeView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: p */
    public void m14006p(Float f11) {
        this.f12936f = f11.floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: q */
    public void m14007q(Float f11) {
        this.f12937g = f11.floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: r */
    public void m14008r(Float f11) {
        this.f12938h = f11.floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public void m14009s(Float f11) {
        this.f12939i = f11.floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public void m14010t(String str) {
        this.f12940j = FilterProperties$FeCompositeOperator.getEnum(str);
        invalidate();
    }
}
