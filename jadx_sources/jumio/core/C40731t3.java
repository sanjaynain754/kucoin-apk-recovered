package jumio.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.t3 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40731t3 extends View {

    /* JADX INFO: renamed from: a */
    public int f90425a;

    /* JADX INFO: renamed from: b */
    public int f90426b;

    /* JADX INFO: renamed from: c */
    public float f90427c;

    /* JADX INFO: renamed from: d */
    public int f90428d;

    /* JADX INFO: renamed from: e */
    public int f90429e;

    /* JADX INFO: renamed from: f */
    public final Paint f90430f;

    /* JADX INFO: renamed from: g */
    public Paint f90431g;

    /* JADX INFO: renamed from: h */
    public RectF f90432h;

    /* JADX INFO: renamed from: i */
    public Matrix f90433i;

    /* JADX INFO: renamed from: j */
    public float f90434j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40731t3(Context context) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f90427c = 1.0f;
        Paint paint = new Paint();
        this.f90430f = paint;
        this.f90431g = new Paint();
        this.f90432h = new RectF();
        this.f90433i = new Matrix();
        paint.setAntiAlias(true);
    }

    private final RectF getBorderRect() {
        float strokeWidth = this.f90431g.getStrokeWidth() / 2.0f;
        RectF rectF = this.f90432h;
        return new RectF(rectF.left + strokeWidth, rectF.top + strokeWidth, rectF.right - strokeWidth, rectF.bottom - strokeWidth);
    }

    private final void setImageBorder(int i11) {
        Paint paint = new Paint();
        paint.setColor(i11);
        this.f90431g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f90431g.setStrokeWidth(4.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m89267a(Bitmap bitmap, float f11, int i11, float f12) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f90425a = bitmap.getWidth();
        this.f90426b = bitmap.getHeight();
        this.f90427c = f12;
        this.f90428d = 0;
        this.f90429e = 0;
        this.f90434j = f11;
        setImageBorder(i11);
        this.f90433i = new Matrix();
        this.f90432h = new RectF(0.0f, 0.0f, this.f90425a, this.f90426b);
        this.f90433i.setRectToRect(this.f90432h, new RectF(0.0f, 0.0f, getWidth(), getHeight()), Matrix.ScaleToFit.CENTER);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f90430f.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Matrix matrix = this.f90433i;
        int iSave = canvas.save();
        canvas.concat(matrix);
        try {
            RectF rectF = this.f90432h;
            float f11 = this.f90434j;
            canvas.drawRoundRect(rectF, f11, f11, this.f90430f);
            RectF borderRect = getBorderRect();
            float f12 = this.f90434j;
            canvas.drawRoundRect(borderRect, f12, f12, this.f90431g);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i11, int i12, int i13, int i14) {
        this.f90433i = new Matrix();
        this.f90432h = new RectF(0.0f, 0.0f, this.f90425a, this.f90426b);
        this.f90433i.setRectToRect(this.f90432h, new RectF(0.0f, 0.0f, getWidth(), getHeight()), Matrix.ScaleToFit.CENTER);
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        int iMin;
        int i15;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (this.f90428d == 0) {
            this.f90428d = size;
        }
        if (this.f90429e == 0) {
            this.f90429e = size2;
        }
        boolean z12 = true;
        if (mode != Integer.MIN_VALUE && mode != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (mode2 != Integer.MIN_VALUE && mode2 != 0) {
            z12 = false;
        }
        int i16 = this.f90425a;
        if (i16 != 0 && (i13 = this.f90426b) != 0) {
            float f11 = i16 / i13;
            int i17 = this.f90428d;
            if (i17 != 0 && z12) {
                float f12 = this.f90427c;
                if (f12 != 1.0f && (i15 = this.f90429e) != 0) {
                    iMin = Math.min((int) (i17 / f12), i15);
                } else {
                    size2 = this.f90429e;
                    if (size2 == 0) {
                        iMin = (int) (i17 / f12);
                    }
                    size = Math.min((int) (size2 * f11), this.f90428d);
                }
                size2 = iMin;
                size = Math.min((int) (size2 * f11), this.f90428d);
            } else if (z11 && (i14 = this.f90429e) != 0) {
                size = (int) (i14 * f11);
                if (i17 != 0) {
                    size = Math.min(size, i17);
                }
                size2 = (int) (size / f11);
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }
}
