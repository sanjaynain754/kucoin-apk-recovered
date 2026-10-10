package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes56.dex */
public class Brush {

    /* JADX INFO: renamed from: a */
    public final BrushType f12908a;

    /* JADX INFO: renamed from: b */
    public final SVGLength[] f12909b;

    /* JADX INFO: renamed from: c */
    public ReadableArray f12910c;

    /* JADX INFO: renamed from: d */
    public final boolean f12911d;

    /* JADX INFO: renamed from: e */
    public boolean f12912e;

    /* JADX INFO: renamed from: f */
    public Matrix f12913f;

    /* JADX INFO: renamed from: g */
    public Rect f12914g;

    /* JADX INFO: renamed from: h */
    public PatternView f12915h;

    public enum BrushType {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    public enum BrushUnits {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    /* JADX INFO: renamed from: c */
    public static void m13977c(ReadableArray readableArray, int i11, float[] fArr, int[] iArr, float f11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 2;
            fArr[i12] = (float) readableArray.getDouble(i13);
            int i14 = readableArray.getInt(i13 + 1);
            iArr[i12] = (i14 & 16777215) | (Math.round((i14 >>> 24) * f11) << 24);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m13985i(Paint paint, RectF rectF, float f11, float f12) {
        int[] iArr;
        float[] fArr;
        int[] iArr2;
        float[] fArr2;
        double d11;
        RectF rectFM13978a = m13978a(rectF);
        float fWidth = rectFM13978a.width();
        float fHeight = rectFM13978a.height();
        float f13 = rectFM13978a.left;
        float f14 = rectFM13978a.top;
        float textSize = paint.getTextSize();
        if (this.f12908a == BrushType.PATTERN) {
            double d12 = fWidth;
            double dM13979b = m13979b(this.f12909b[0], d12, f11, textSize);
            double d13 = fHeight;
            double dM13979b2 = m13979b(this.f12909b[1], d13, f11, textSize);
            double dM13979b3 = m13979b(this.f12909b[2], d12, f11, textSize);
            double dM13979b4 = m13979b(this.f12909b[3], d13, f11, textSize);
            if (dM13979b3 <= 1.0d || dM13979b4 <= 1.0d) {
                return;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) dM13979b3, (int) dM13979b4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            RectF viewBox = this.f12915h.getViewBox();
            if (viewBox != null && viewBox.width() > 0.0f && viewBox.height() > 0.0f) {
                RectF rectF2 = new RectF((float) dM13979b, (float) dM13979b2, (float) dM13979b3, (float) dM13979b4);
                PatternView patternView = this.f12915h;
                canvas.concat(C9251t.m14287a(viewBox, rectF2, patternView.f13041q, patternView.f13042r));
            }
            if (this.f12912e) {
                canvas.scale(fWidth / f11, fHeight / f11);
            }
            this.f12915h.draw(canvas, new Paint(), f12);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f12913f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f12910c.size();
        if (size == 0) {
            C45999a.m101488I(ReactConstants.TAG, "Gradient contains no stops");
            return;
        }
        int i11 = size / 2;
        int[] iArr3 = new int[i11];
        float[] fArr3 = new float[i11];
        m13977c(this.f12910c, i11, fArr3, iArr3, f12);
        if (i11 == 1) {
            int[] iArr4 = {iArr3[0], iArr3[0]};
            float[] fArr4 = {fArr3[0], fArr3[0]};
            C45999a.m101488I(ReactConstants.TAG, "Gradient contains only one stop");
            fArr = fArr4;
            iArr = iArr4;
        } else {
            iArr = iArr3;
            fArr = fArr3;
        }
        BrushType brushType = this.f12908a;
        if (brushType == BrushType.LINEAR_GRADIENT) {
            double d14 = fWidth;
            double d15 = f13;
            double dM13979b5 = m13979b(this.f12909b[0], d14, f11, textSize) + d15;
            double d16 = fHeight;
            double d17 = f14;
            LinearGradient linearGradient = new LinearGradient((float) dM13979b5, (float) (m13979b(this.f12909b[1], d16, f11, textSize) + d17), (float) (d15 + m13979b(this.f12909b[2], d14, f11, textSize)), (float) (m13979b(this.f12909b[3], d16, f11, textSize) + d17), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f12913f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f12913f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
            return;
        }
        int[] iArr5 = iArr;
        float[] fArr5 = fArr;
        if (brushType == BrushType.RADIAL_GRADIENT) {
            double d18 = fWidth;
            double dM13979b6 = m13979b(this.f12909b[2], d18, f11, textSize);
            double d19 = fHeight;
            double dM13979b7 = m13979b(this.f12909b[3], d19, f11, textSize);
            if (dM13979b6 <= 0.0d || dM13979b7 <= 0.0d) {
                float[] fArr6 = {fArr5[0], fArr5[fArr5.length - 1]};
                iArr2 = new int[]{iArr5[iArr5.length - 1], iArr5[iArr5.length - 1]};
                fArr2 = fArr6;
                dM13979b6 = d18;
                d11 = d19;
            } else {
                iArr2 = iArr5;
                fArr2 = fArr5;
                d11 = dM13979b7;
            }
            double d21 = d11 / dM13979b6;
            RadialGradient radialGradient = new RadialGradient((float) (m13979b(this.f12909b[4], d18, f11, textSize) + ((double) f13)), (float) (m13979b(this.f12909b[5], d19 / d21, f11, textSize) + (((double) f14) / d21)), (float) dM13979b6, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) d21);
            Matrix matrix5 = this.f12913f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }

    /* JADX INFO: renamed from: a */
    public final RectF m13978a(RectF rectF) {
        float f11;
        float f12;
        if (!this.f12911d) {
            rectF = new RectF(this.f12914g);
        }
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        if (this.f12911d) {
            f11 = rectF.left;
            f12 = rectF.top;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        return new RectF(f11, f12, fWidth + f11, fHeight + f12);
    }

    /* JADX INFO: renamed from: b */
    public final double m13979b(SVGLength sVGLength, double d11, float f11, float f12) {
        return C9241i.m14266a(sVGLength, d11, 0.0d, (this.f12911d && sVGLength.f13064b == SVGLength.UnitType.NUMBER) ? d11 : f11, f12);
    }

    /* JADX INFO: renamed from: d */
    public void m13980d(BrushUnits brushUnits) {
        this.f12912e = brushUnits == BrushUnits.OBJECT_BOUNDING_BOX;
    }

    /* JADX INFO: renamed from: e */
    public void m13981e(ReadableArray readableArray) {
        this.f12910c = readableArray;
    }

    /* JADX INFO: renamed from: f */
    public void m13982f(Matrix matrix) {
        this.f12913f = matrix;
    }

    /* JADX INFO: renamed from: g */
    public void m13983g(PatternView patternView) {
        this.f12915h = patternView;
    }

    /* JADX INFO: renamed from: h */
    public void m13984h(Rect rect) {
        this.f12914g = rect;
    }

    public Brush(BrushType brushType, SVGLength[] sVGLengthArr, BrushUnits brushUnits) {
        boolean z11;
        this.f12908a = brushType;
        this.f12909b = sVGLengthArr;
        if (brushUnits == BrushUnits.OBJECT_BOUNDING_BOX) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f12911d = z11;
    }
}
