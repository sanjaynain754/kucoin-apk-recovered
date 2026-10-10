package ai.advance.sdk.global.iqa.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: ai.advance.sdk.global.iqa.lib.k */
/* JADX INFO: loaded from: classes23.dex */
public class C0359k extends View {

    /* JADX INFO: renamed from: b */
    public final Paint f1053b;

    /* JADX INFO: renamed from: c */
    public Integer f1054c;

    /* JADX INFO: renamed from: d */
    public RectF f1055d;

    /* JADX INFO: renamed from: e */
    public final RectF f1056e;

    /* JADX INFO: renamed from: f */
    public int f1057f;

    /* JADX INFO: renamed from: g */
    public final Path f1058g;

    public C0359k(Context context) {
        this(context, null);
    }

    public C0359k(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1058g = new Path();
        Paint paint = new Paint();
        this.f1053b = paint;
        paint.setAntiAlias(true);
        int color = Color.parseColor("#ff0000");
        this.f1057f = color;
        paint.setColor(color);
        paint.setStrokeWidth(m1412a(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.f1056e = new RectF();
    }

    /* JADX INFO: renamed from: c */
    public final void m1414c(Canvas canvas) {
        if (this.f1055d == null) {
            this.f1055d = new RectF();
        }
        RectF rectF = this.f1055d;
        this.f1053b.setStrokeWidth(((rectF.bottom - rectF.top) * 0.094f) / 5.0f);
        this.f1055d.left = (int) (getLeft() - (this.f1053b.getStrokeWidth() / 2.0f));
        this.f1055d.top = (int) (getTop() - (this.f1053b.getStrokeWidth() / 2.0f));
        this.f1055d.right = (int) (getRight() + (this.f1053b.getStrokeWidth() / 2.0f));
        this.f1055d.bottom = (int) (getBottom() + (this.f1053b.getStrokeWidth() / 2.0f));
        canvas.drawRoundRect(this.f1055d, this.f1054c.intValue(), this.f1054c.intValue(), this.f1053b);
    }

    public void setCornerRadius(Integer num) {
        this.f1054c = num;
        postInvalidate();
    }

    public void setLineColor(int i11) {
        this.f1057f = i11;
        this.f1053b.setColor(i11);
        postInvalidate();
    }

    /* JADX INFO: renamed from: a */
    public final int m1412a(float f11) {
        return (int) (f11 * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: renamed from: b */
    public final void m1413b(Canvas canvas) {
        int left = (int) (getLeft() - (this.f1053b.getStrokeWidth() / 2.0f));
        int top = (int) (getTop() - (this.f1053b.getStrokeWidth() / 2.0f));
        int right = (int) (getRight() + (this.f1053b.getStrokeWidth() / 2.0f));
        int bottom = (int) (getBottom() + (this.f1053b.getStrokeWidth() / 2.0f));
        RectF rectF = this.f1056e;
        float f11 = left;
        rectF.left = f11;
        float f12 = top;
        rectF.top = f12;
        float f13 = right;
        rectF.right = f13;
        float f14 = bottom;
        rectF.bottom = f14;
        this.f1058g.reset();
        float f15 = (bottom - top) * 0.094f;
        float f16 = f12 + f15;
        this.f1058g.moveTo(f11, f16);
        this.f1058g.lineTo(f11, f12);
        float f17 = f11 + f15;
        this.f1058g.lineTo(f17, f12);
        this.f1058g.moveTo(f17, f14);
        this.f1058g.lineTo(f11, f14);
        float f18 = f14 - f15;
        this.f1058g.lineTo(f11, f18);
        this.f1058g.moveTo(f13, f16);
        this.f1058g.lineTo(f13, f12);
        float f19 = f13 - f15;
        this.f1058g.lineTo(f19, f12);
        this.f1058g.moveTo(f19, f14);
        this.f1058g.lineTo(f13, f14);
        this.f1058g.lineTo(f13, f18);
        this.f1053b.setStrokeWidth(f15 / 5.0f);
        canvas.drawPath(this.f1058g, this.f1053b);
        this.f1053b.setStrokeWidth(m1412a(1.0f));
        canvas.drawRect(this.f1056e, this.f1053b);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1054c == null) {
            m1413b(canvas);
        } else {
            m1414c(canvas);
        }
    }
}
