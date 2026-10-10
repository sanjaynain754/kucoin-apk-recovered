package ai.advance.sdk.global.iqa.lib.widgets;

import ai.advance.sdk.global.iqa.lib.GlobalIQAView;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import p678v.C45338a;

/* JADX INFO: loaded from: classes23.dex */
public class ImageQualityRootLayout extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    public final int f1067n;

    /* JADX INFO: renamed from: o */
    public View f1068o;

    /* JADX INFO: renamed from: p */
    public final Paint f1069p;

    /* JADX INFO: renamed from: q */
    public final RectF f1070q;

    /* JADX INFO: renamed from: r */
    public Integer f1071r;

    /* JADX INFO: renamed from: s */
    public RectF f1072s;

    /* JADX INFO: renamed from: t */
    public int f1073t;

    /* JADX INFO: renamed from: u */
    public final Path f1074u;

    /* JADX INFO: renamed from: v */
    public C45338a f1075v;

    /* JADX INFO: renamed from: h */
    public final synchronized void m1419h(Canvas canvas) {
        int left = (int) (this.f1068o.getLeft() - (this.f1069p.getStrokeWidth() / 2.0f));
        int top = (int) (this.f1068o.getTop() - (this.f1069p.getStrokeWidth() / 2.0f));
        int right = (int) (this.f1068o.getRight() + (this.f1069p.getStrokeWidth() / 2.0f));
        int bottom = (int) (this.f1068o.getBottom() + (this.f1069p.getStrokeWidth() / 2.0f));
        RectF rectF = this.f1070q;
        float f11 = left;
        rectF.left = f11;
        float f12 = top;
        rectF.top = f12;
        float f13 = right;
        rectF.right = f13;
        float f14 = bottom;
        rectF.bottom = f14;
        this.f1074u.reset();
        float f15 = (bottom - top) * 0.094f;
        float f16 = f12 + f15;
        this.f1074u.moveTo(f11, f16);
        this.f1074u.lineTo(f11, f12);
        float f17 = f11 + f15;
        this.f1074u.lineTo(f17, f12);
        this.f1074u.moveTo(f17, f14);
        this.f1074u.lineTo(f11, f14);
        float f18 = f14 - f15;
        this.f1074u.lineTo(f11, f18);
        this.f1074u.moveTo(f13, f16);
        this.f1074u.lineTo(f13, f12);
        float f19 = f13 - f15;
        this.f1074u.lineTo(f19, f12);
        this.f1074u.moveTo(f19, f14);
        this.f1074u.lineTo(f13, f14);
        this.f1074u.lineTo(f13, f18);
        this.f1069p.setStrokeWidth(f15 / 5.0f);
        canvas.drawPath(this.f1074u, this.f1069p);
        this.f1069p.setStrokeWidth(m1416g(1.0f));
        canvas.drawRect(this.f1070q, this.f1069p);
    }

    /* JADX INFO: renamed from: a */
    public void m1417a(CharSequence charSequence) {
        C45338a c45338a = this.f1075v;
        if (c45338a == null || !c45338a.isShowing()) {
            return;
        }
        this.f1075v.m100231a(charSequence);
    }

    /* JADX INFO: renamed from: f */
    public void m1418f() {
        C45338a c45338a = this.f1075v;
        if (c45338a != null) {
            c45338a.dismiss();
        }
        this.f1075v = null;
    }

    /* JADX INFO: renamed from: i */
    public final void m1420i(Canvas canvas) {
        if (this.f1072s == null) {
            this.f1072s = new RectF();
        }
        RectF rectF = this.f1072s;
        this.f1069p.setStrokeWidth(((rectF.bottom - rectF.top) * 0.094f) / 5.0f);
        this.f1072s.left = (int) (this.f1068o.getLeft() - (this.f1069p.getStrokeWidth() / 2.0f));
        this.f1072s.top = (int) (this.f1068o.getTop() - (this.f1069p.getStrokeWidth() / 2.0f));
        this.f1072s.right = (int) (this.f1068o.getRight() + (this.f1069p.getStrokeWidth() / 2.0f));
        this.f1072s.bottom = (int) (this.f1068o.getBottom() + (this.f1069p.getStrokeWidth() / 2.0f));
        canvas.drawRoundRect(this.f1072s, this.f1071r.intValue(), this.f1071r.intValue(), this.f1069p);
    }

    /* JADX INFO: renamed from: j */
    public final void m1421j() {
        if (this.f1068o == null) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof GlobalIQAView) {
                    this.f1068o = childAt;
                    return;
                }
            }
        }
    }

    public void setCornerRadius(Integer num) {
        this.f1071r = num;
        postInvalidate();
    }

    public void setLineColor(int i11) {
        this.f1073t = i11;
        this.f1069p.setColor(i11);
        postInvalidate();
    }

    public ImageQualityRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1067n = getResources().getColor(getResources().getIdentifier("iqa_timeout_frame", "color", context.getPackageName()));
        this.f1073t = getResources().getColor(getResources().getIdentifier("advance_black", "color", context.getPackageName()));
        this.f1074u = new Path();
        Paint paint = new Paint();
        this.f1069p = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.f1073t);
        paint.setStrokeWidth(m1416g(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        this.f1070q = new RectF();
    }

    /* JADX INFO: renamed from: g */
    private int m1416g(float f11) {
        return (int) (f11 * getResources().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m1421j();
        if (this.f1068o != null) {
            if (this.f1071r == null) {
                m1419h(canvas);
            } else {
                m1420i(canvas);
            }
            C45338a c45338a = this.f1075v;
            if (c45338a != null && c45338a.isShowing()) {
                canvas.drawColor(this.f1067n);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1422k(CharSequence charSequence, int i11) {
        m1421j();
        if (this.f1068o == null) {
            return;
        }
        C45338a c45338a = new C45338a(getContext());
        this.f1075v = c45338a;
        c45338a.m100232b(charSequence, i11);
        this.f1075v.showAtLocation(this, 17, 0, 0);
    }
}
