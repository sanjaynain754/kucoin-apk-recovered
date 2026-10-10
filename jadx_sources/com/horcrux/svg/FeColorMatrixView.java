package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import java.util.HashMap;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class FeColorMatrixView extends FilterPrimitiveView {

    /* JADX INFO: renamed from: d */
    public String f12930d;

    /* JADX INFO: renamed from: e */
    public FilterProperties$FeColorMatrixType f12931e;

    /* JADX INFO: renamed from: f */
    public ReadableArray f12932f;

    /* JADX INFO: renamed from: com.horcrux.svg.FeColorMatrixView$a */
    public static /* synthetic */ class C9189a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12933a;

        static {
            int[] iArr = new int[FilterProperties$FeColorMatrixType.values().length];
            f12933a = iArr;
            try {
                iArr[FilterProperties$FeColorMatrixType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12933a[FilterProperties$FeColorMatrixType.SATURATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12933a[FilterProperties$FeColorMatrixType.HUE_ROTATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12933a[FilterProperties$FeColorMatrixType.LUMINANCE_TO_ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.horcrux.svg.FilterPrimitiveView
    /* JADX INFO: renamed from: f */
    public Bitmap mo13997f(HashMap<String, Bitmap> map, Bitmap bitmap) {
        Bitmap bitmapM14023h = FilterPrimitiveView.m14023h(map, bitmap, this.f12930d);
        ColorMatrix colorMatrix = new ColorMatrix();
        int i11 = C9189a.f12933a[this.f12931e.ordinal()];
        if (i11 == 1) {
            if (this.f12932f.size() >= 20) {
                float[] fArr = new float[this.f12932f.size()];
                for (int i12 = 0; i12 < this.f12932f.size(); i12++) {
                    fArr[i12] = ((float) this.f12932f.getDouble(i12)) * (i12 % 5 == 4 ? 255 : 1);
                }
                colorMatrix.set(fArr);
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapM14023h);
            }
            return bitmapM14023h;
        }
        if (i11 == 2) {
            if (this.f12932f.size() == 1) {
                colorMatrix.setSaturation((float) this.f12932f.getDouble(0));
                return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapM14023h);
            }
            return bitmapM14023h;
        }
        if (i11 == 3) {
            if (this.f12932f.size() == 1) {
                double d11 = (((double) ((float) this.f12932f.getDouble(0))) * 3.141592653589793d) / 180.0d;
                float fCos = (float) Math.cos(d11);
                float fSin = (float) Math.sin(d11);
                float f11 = 0.715f - (fCos * 0.715f);
                float f12 = fSin * 0.715f;
                float f13 = 0.072f - (fCos * 0.072f);
                float f14 = 0.213f - (fCos * 0.213f);
                colorMatrix.set(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f11 - f12, f13 + (fSin * 0.928f), 0.0f, 0.0f, f14 + (0.143f * fSin), (0.285f * fCos) + 0.715f + (0.14f * fSin), f13 - (0.283f * fSin), 0.0f, 0.0f, f14 - (0.787f * fSin), f11 + f12, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            }
            return bitmapM14023h;
        }
        if (i11 == 4) {
            colorMatrix.set(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2125f, 0.7154f, 0.0721f, 0.0f, 0.0f});
        }
        return FilterUtils.getBitmapWithColorMatrix(colorMatrix, bitmapM14023h);
    }

    /* JADX INFO: renamed from: n */
    public void m14001n(String str) {
        this.f12930d = str;
        invalidate();
    }

    /* JADX INFO: renamed from: p */
    public void m14003p(ReadableArray readableArray) {
        this.f12932f = readableArray;
        invalidate();
    }

    public FeColorMatrixView(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: renamed from: o */
    public void m14002o(String str) {
        this.f12931e = FilterProperties$FeColorMatrixType.getEnum(str);
        invalidate();
    }
}
