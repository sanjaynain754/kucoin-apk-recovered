package com.p059BV.LinearGradient;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.PixelUtil;

/* JADX INFO: loaded from: classes34.dex */
public class LinearGradientView extends View {

    /* JADX INFO: renamed from: b */
    public final Paint f5850b;

    /* JADX INFO: renamed from: c */
    public Path f5851c;

    /* JADX INFO: renamed from: d */
    public RectF f5852d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f5853e;

    /* JADX INFO: renamed from: f */
    public float[] f5854f;

    /* JADX INFO: renamed from: g */
    public float[] f5855g;

    /* JADX INFO: renamed from: h */
    public float[] f5856h;

    /* JADX INFO: renamed from: i */
    public int[] f5857i;

    /* JADX INFO: renamed from: j */
    public boolean f5858j;

    /* JADX INFO: renamed from: k */
    public float[] f5859k;

    /* JADX INFO: renamed from: l */
    public float f5860l;

    /* JADX INFO: renamed from: m */
    public int[] f5861m;

    /* JADX INFO: renamed from: n */
    public float[] f5862n;

    /* JADX INFO: renamed from: b */
    public static float[] m5511b(float f11, int[] iArr) {
        float f12 = f11 % 360.0f;
        if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        if (f12 % 90.0f == 0.0f) {
            return m5512c(f12, iArr);
        }
        float fTan = (float) Math.tan((((double) f12) * 3.141592653589793d) / 180.0d);
        float f13 = (-1.0f) / fTan;
        float[] fArrM5513d = m5513d(f12, iArr);
        float f14 = (fArrM5513d[1] - (fArrM5513d[0] * f13)) / (fTan - f13);
        return new float[]{f14, fTan * f14};
    }

    /* JADX INFO: renamed from: c */
    public static float[] m5512c(float f11, int[] iArr) {
        float f12 = iArr[0] / 2.0f;
        float f13 = iArr[1] / 2.0f;
        if (f11 == 0.0f) {
            return new float[]{-f12, 0.0f};
        }
        if (f11 == 90.0f) {
            return new float[]{0.0f, -f13};
        }
        return f11 == 180.0f ? new float[]{f12, 0.0f} : new float[]{0.0f, f13};
    }

    /* JADX INFO: renamed from: d */
    public static float[] m5513d(float f11, int[] iArr) {
        float f12 = iArr[0] / 2.0f;
        float f13 = iArr[1] / 2.0f;
        if (f11 < 90.0f) {
            return new float[]{-f12, -f13};
        }
        if (f11 < 180.0f) {
            return new float[]{f12, -f13};
        }
        return f11 < 270.0f ? new float[]{f12, f13} : new float[]{-f12, f13};
    }

    /* JADX INFO: renamed from: a */
    public final void m5514a() {
        float[] fArr;
        float[] fArr2;
        int[] iArr = this.f5857i;
        if (iArr != null) {
            float[] fArr3 = this.f5854f;
            if (fArr3 == null || iArr.length == fArr3.length) {
                if (!this.f5858j || this.f5859k == null) {
                    float[] fArr4 = this.f5855g;
                    float f11 = fArr4[0];
                    int[] iArr2 = this.f5861m;
                    int i11 = iArr2[0];
                    float f12 = fArr4[1];
                    int i12 = iArr2[1];
                    fArr = new float[]{f11 * i11, f12 * i12};
                    float[] fArr5 = this.f5856h;
                    fArr2 = new float[]{fArr5[0] * i11, fArr5[1] * i12};
                } else {
                    float[] fArrM5511b = m5511b(90.0f - this.f5860l, this.f5861m);
                    float[] fArr6 = this.f5859k;
                    float f13 = fArr6[0];
                    int[] iArr3 = this.f5861m;
                    float[] fArr7 = {f13 * iArr3[0], fArr6[1] * iArr3[1]};
                    fArr = new float[]{fArr7[0] + fArrM5511b[0], fArr7[1] - fArrM5511b[1]};
                    fArr2 = new float[]{fArr7[0] - fArrM5511b[0], fArr7[1] + fArrM5511b[1]};
                }
                LinearGradient linearGradient = new LinearGradient(fArr[0], fArr[1], fArr2[0], fArr2[1], this.f5857i, this.f5854f, Shader.TileMode.CLAMP);
                this.f5853e = linearGradient;
                this.f5850b.setShader(linearGradient);
                invalidate();
            }
        }
    }

    public void setAngleCenter(ReadableArray readableArray) {
        this.f5859k = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m5514a();
    }

    public void setEndPoint(ReadableArray readableArray) {
        this.f5856h = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m5514a();
    }

    public void setStartPoint(ReadableArray readableArray) {
        this.f5855g = new float[]{(float) readableArray.getDouble(0), (float) readableArray.getDouble(1)};
        m5514a();
    }

    /* JADX INFO: renamed from: e */
    public final void m5515e() {
        if (this.f5851c == null) {
            this.f5851c = new Path();
            this.f5852d = new RectF();
        }
        this.f5851c.reset();
        RectF rectF = this.f5852d;
        int[] iArr = this.f5861m;
        rectF.set(0.0f, 0.0f, iArr[0], iArr[1]);
        this.f5851c.addRoundRect(this.f5852d, this.f5862n, Path.Direction.CW);
    }

    public void setAngle(float f11) {
        this.f5860l = f11;
        m5514a();
    }

    public void setUseAngle(boolean z11) {
        this.f5858j = z11;
        m5514a();
    }

    public LinearGradientView(Context context) {
        super(context);
        this.f5850b = new Paint(1);
        this.f5855g = new float[]{0.0f, 0.0f};
        this.f5856h = new float[]{0.0f, 1.0f};
        this.f5858j = false;
        this.f5859k = new float[]{0.5f, 0.5f};
        this.f5860l = 45.0f;
        this.f5861m = new int[]{0, 0};
        this.f5862n = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.f5851c;
        if (path == null) {
            canvas.drawPaint(this.f5850b);
        } else {
            canvas.drawPath(path, this.f5850b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        this.f5861m = new int[]{i11, i12};
        m5515e();
        m5514a();
    }

    public void setBorderRadii(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            fArr[i11] = PixelUtil.toPixelFromDIP((float) readableArray.getDouble(i11));
        }
        this.f5862n = fArr;
        m5515e();
        m5514a();
    }

    public void setColors(ReadableArray readableArray) {
        int iIntValue;
        int size = readableArray.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            if (readableArray.getType(i11) == ReadableType.Map) {
                iIntValue = ColorPropConverter.getColor(readableArray.getMap(i11), getContext()).intValue();
            } else {
                iIntValue = readableArray.getInt(i11);
            }
            iArr[i11] = iIntValue;
        }
        this.f5857i = iArr;
        m5514a();
    }

    public void setLocations(ReadableArray readableArray) {
        int size = readableArray.size();
        float[] fArr = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            fArr[i11] = (float) readableArray.getDouble(i11);
        }
        this.f5854f = fArr;
        m5514a();
    }
}
