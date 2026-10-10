package a3d20260409;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Keep;
import intl.o0oOOOOOooooo;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
class a20260409View extends View {

    /* JADX INFO: renamed from: b */
    public final Paint f89b;

    /* JADX INFO: renamed from: c */
    public final Paint f90c;

    /* JADX INFO: renamed from: d */
    public RectF f91d;

    /* JADX INFO: renamed from: e */
    public float f92e;

    /* JADX INFO: renamed from: f */
    public float f93f;

    /* JADX INFO: renamed from: g */
    public float f94g;

    /* JADX INFO: renamed from: h */
    public int f95h;

    /* JADX INFO: renamed from: i */
    public int f96i;

    /* JADX INFO: renamed from: j */
    public int f97j;

    /* JADX INFO: renamed from: k */
    public TimeInterpolator f98k;

    /* JADX INFO: renamed from: l */
    public Long f99l;

    /* JADX INFO: renamed from: m */
    public Path f100m;

    /* JADX INFO: renamed from: n */
    public RectF f101n;

    /* JADX INFO: renamed from: o */
    public int f102o;

    /* JADX INFO: renamed from: p */
    public int f103p;

    /* JADX INFO: renamed from: q */
    public int f104q;

    /* JADX INFO: renamed from: r */
    public boolean f105r;

    /* JADX INFO: renamed from: s */
    public Path f106s;

    /* JADX INFO: renamed from: a3d20260409.a20260409View$a */
    public class C0064a extends AnimatorListenerAdapter {
        public C0064a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            a20260409View.this.f105r = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m101f(String str) {
        if (str == null) {
            this.f94g = -1.0f;
            this.f93f = -1.0f;
            this.f92e = -1.0f;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            float f11 = (float) jSONObject.getDouble("ellipseXMax");
            float f12 = (float) jSONObject.getDouble("ellipseXMin");
            float f13 = (float) jSONObject.getDouble("ellipseYMax");
            if (Math.abs(f12 - this.f93f) > 0.03d) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "ellipseXMin", this.f93f, f12);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "ellipseXMax", this.f92e, f11);
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this, "ellipseYMax", this.f94g, f13);
                AnimatorSet animatorSet = new AnimatorSet();
                Long l11 = this.f99l;
                animatorSet.setDuration(l11 == null ? 300L : l11.longValue());
                TimeInterpolator accelerateInterpolator = this.f98k;
                if (accelerateInterpolator == null) {
                    accelerateInterpolator = new AccelerateInterpolator();
                }
                animatorSet.setInterpolator(accelerateInterpolator);
                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                animatorSet.start();
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m103i() {
        if (this.f105r) {
            return;
        }
        this.f105r = true;
        int i11 = this.f102o;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this, "startAngle", i11, i11 + 180);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this, "swipeAngle", 0, 150);
        ObjectAnimator objectAnimatorOfInt3 = this.f104q == 0 ? ObjectAnimator.ofInt(this, "lineSegmentAlpha", 150, 255, 0) : ObjectAnimator.ofInt(this, "lineSegmentAlpha", 255, 200, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1500L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.addListener(new C0064a());
        animatorSet.playTogether(objectAnimatorOfInt, objectAnimatorOfInt2, objectAnimatorOfInt3);
        animatorSet.start();
    }

    public void O0OOOoOooo(int i11) {
        this.f96i = i11;
        this.f89b.setColor(i11);
        this.f90c.setColor(i11);
        postInvalidate();
    }

    public void OOOoooooo(int i11) {
        this.f97j = i11;
        this.f89b.setColor(i11);
        postInvalidate();
    }

    /* JADX INFO: renamed from: c */
    public void m98c(int i11) {
        this.f95h = i11;
        postInvalidate();
    }

    /* JADX INFO: renamed from: d */
    public final void m99d(Canvas canvas) {
        this.f90c.setStrokeWidth(this.f89b.getStrokeWidth());
        this.f90c.setAlpha(this.f104q);
        if (this.f100m == null) {
            this.f100m = new Path();
            this.f100m = new Path();
        }
        this.f100m.reset();
        if (this.f101n == null) {
            this.f101n = new RectF();
        }
        float measuredWidth = getMeasuredWidth() * 0.03f;
        RectF rectF = this.f101n;
        RectF rectF2 = this.f91d;
        rectF.left = rectF2.left + measuredWidth;
        rectF.right = rectF2.right - measuredWidth;
        rectF.top = rectF2.top + measuredWidth;
        rectF.bottom = rectF2.bottom - measuredWidth;
        this.f100m.addArc(rectF, this.f102o, this.f103p);
        this.f100m.addArc(this.f101n, this.f102o + 180, this.f103p);
        canvas.drawPath(this.f100m, this.f90c);
    }

    /* JADX INFO: renamed from: e */
    public void m100e(o0oOOOOOooooo o0ooooooooooo) {
        boolean z11 = o0ooooooooooo == o0oOOOOOooooo.DISTANT_FACE_CAPTURE || o0ooooooooooo == o0oOOOOOooooo.NEAR_FACE_CAPTURE;
        if (z11) {
            m103i();
        }
        this.f89b.setColor(z11 ? this.f96i : this.f97j);
    }

    @Keep
    public void setEllipseXMax(float f11) {
        this.f92e = f11;
        postInvalidate();
    }

    @Keep
    public void setEllipseXMin(float f11) {
        this.f93f = f11;
    }

    @Keep
    public void setEllipseYMax(float f11) {
        this.f94g = f11;
    }

    @Keep
    public void setLineSegmentAlpha(int i11) {
        this.f104q = i11;
    }

    @Keep
    public void setStartAngle(int i11) {
        this.f102o = i11;
        postInvalidate();
    }

    @Keep
    public void setSwipeAngle(int i11) {
        this.f103p = i11;
    }

    public a20260409View(Context context) {
        super(context);
        this.f102o = -125;
        this.f104q = 255;
        Paint paint = new Paint();
        this.f89b = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f95h = -1;
        this.f97j = Color.parseColor("#F5F5F5");
        this.f96i = Color.parseColor("#5BC413");
        paint.setColor(this.f97j);
        Paint paint2 = new Paint();
        this.f90c = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        paint2.setColor(this.f96i);
        this.f93f = 0.275f;
        this.f92e = 0.725f;
        this.f94g = 0.8f;
    }

    /* JADX INFO: renamed from: a */
    public final void m96a(Canvas canvas) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f11 = measuredWidth;
        this.f89b.setStrokeWidth(0.013f * f11);
        if (this.f92e > 0.0f) {
            if (this.f91d == null) {
                this.f91d = new RectF();
            }
            RectF rectF = this.f91d;
            rectF.left = this.f93f * f11;
            rectF.right = this.f92e * f11;
            float f12 = measuredHeight;
            float f13 = this.f94g;
            rectF.top = (1.0f - f13) * f12;
            rectF.bottom = f13 * f12;
            if (this.f106s == null) {
                this.f106s = new Path();
            }
            this.f106s.reset();
            this.f106s.addOval(this.f91d, Path.Direction.CCW);
            canvas.save();
            canvas.clipPath(this.f106s, Region.Op.DIFFERENCE);
            canvas.drawColor(this.f95h);
            canvas.restore();
            float strokeWidth = this.f89b.getStrokeWidth() / 2.0f;
            RectF rectF2 = this.f91d;
            rectF2.left += strokeWidth;
            rectF2.right = (f11 * this.f92e) - strokeWidth;
            float f14 = this.f94g;
            rectF2.top = ((1.0f - f14) * f12) + strokeWidth;
            rectF2.bottom = (f12 * f14) - strokeWidth;
            canvas.drawOval(rectF2, this.f89b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m97b() {
        return "{\"ellipseXMin\":0.275,\"ellipseXMax\":0.725,\"ellipseYMax\":0.8}";
    }

    /* JADX INFO: renamed from: h */
    public void m102h() {
        m101f(m97b());
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m96a(canvas);
        m99d(canvas);
    }
}
