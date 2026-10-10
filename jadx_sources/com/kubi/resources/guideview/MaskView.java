package com.kubi.resources.guideview;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5267e0;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.resources.NotchUtils;
import com.kubi.sdk.res.R$color;
import ro.C44128b;

/* JADX INFO: loaded from: classes11.dex */
public class MaskView extends ViewGroup {

    /* JADX INFO: renamed from: b */
    public final RectF f43605b;

    /* JADX INFO: renamed from: c */
    public final RectF f43606c;

    /* JADX INFO: renamed from: d */
    public final RectF f43607d;

    /* JADX INFO: renamed from: e */
    public final Paint f43608e;

    /* JADX INFO: renamed from: f */
    public int f43609f;

    /* JADX INFO: renamed from: g */
    public int f43610g;

    /* JADX INFO: renamed from: h */
    public int f43611h;

    /* JADX INFO: renamed from: i */
    public int f43612i;

    /* JADX INFO: renamed from: j */
    public int f43613j;

    /* JADX INFO: renamed from: k */
    public boolean f43614k;

    /* JADX INFO: renamed from: l */
    public boolean f43615l;

    /* JADX INFO: renamed from: m */
    public int f43616m;

    /* JADX INFO: renamed from: n */
    public int f43617n;

    /* JADX INFO: renamed from: o */
    public Paint f43618o;

    /* JADX INFO: renamed from: p */
    public Bitmap f43619p;

    /* JADX INFO: renamed from: q */
    public Canvas f43620q;

    /* JADX INFO: renamed from: r */
    public Paint f43621r;

    /* JADX INFO: renamed from: s */
    public Paint f43622s;

    /* JADX INFO: renamed from: t */
    public Paint f43623t;

    /* JADX INFO: renamed from: u */
    public int f43624u;

    public MaskView(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C22892a c22892a;
        int childCount = getChildCount();
        float f11 = getResources().getDisplayMetrics().density;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null && (c22892a = (C22892a) childAt.getLayoutParams()) != null) {
                switch (c22892a.f43625a) {
                    case 1:
                        if (getLayoutDirection() == 1) {
                            RectF rectF = this.f43607d;
                            rectF.left = this.f43605b.right;
                            rectF.right = childAt.getMeasuredWidth() - this.f43607d.left;
                        } else {
                            RectF rectF2 = this.f43607d;
                            float f12 = this.f43605b.left;
                            rectF2.right = f12;
                            rectF2.left = f12 - childAt.getMeasuredWidth();
                        }
                        m54300e(childAt, this.f43607d, c22892a.f43626b);
                        break;
                    case 2:
                        RectF rectF3 = this.f43607d;
                        float f13 = this.f43605b.top;
                        rectF3.bottom = f13;
                        rectF3.top = f13 - childAt.getMeasuredHeight();
                        m54297b(childAt, this.f43607d, c22892a.f43626b);
                        break;
                    case 3:
                        if (getLayoutDirection() == 1) {
                            RectF rectF4 = this.f43607d;
                            float f14 = this.f43605b.left;
                            rectF4.right = f14;
                            rectF4.left = f14 - childAt.getMeasuredWidth();
                        } else {
                            RectF rectF5 = this.f43607d;
                            float f15 = this.f43605b.right;
                            rectF5.left = f15;
                            rectF5.right = f15 + childAt.getMeasuredWidth();
                        }
                        m54300e(childAt, this.f43607d, c22892a.f43626b);
                        break;
                    case 4:
                        RectF rectF6 = this.f43607d;
                        float f16 = this.f43605b.bottom;
                        rectF6.top = f16;
                        rectF6.bottom = f16 + childAt.getMeasuredHeight();
                        float f17 = this.f43607d.bottom;
                        int iM6179a = C5267e0.m6179a();
                        NotchUtils notchUtils = NotchUtils.f43671a;
                        if (f17 > iM6179a + notchUtils.m54368b(getContext())) {
                            this.f43607d.bottom = C5267e0.m6179a() + notchUtils.m54368b(getContext());
                            RectF rectF7 = this.f43607d;
                            rectF7.top = rectF7.bottom - childAt.getMeasuredHeight();
                        }
                        m54297b(childAt, this.f43607d, c22892a.f43626b);
                        break;
                    case 5:
                        this.f43607d.left = (((int) this.f43605b.width()) - childAt.getMeasuredWidth()) >> 1;
                        this.f43607d.top = (((int) this.f43605b.height()) - childAt.getMeasuredHeight()) >> 1;
                        this.f43607d.right = (((int) this.f43605b.width()) + childAt.getMeasuredWidth()) >> 1;
                        this.f43607d.bottom = (((int) this.f43605b.height()) + childAt.getMeasuredHeight()) >> 1;
                        RectF rectF8 = this.f43607d;
                        RectF rectF9 = this.f43605b;
                        rectF8.offset(rectF9.left, rectF9.top);
                        break;
                    case 6:
                        this.f43607d.bottom = C5267e0.m6179a() + NotchUtils.f43671a.m54368b(getContext());
                        RectF rectF10 = this.f43607d;
                        rectF10.top = rectF10.bottom - childAt.getMeasuredHeight();
                        m54297b(childAt, this.f43607d, c22892a.f43626b);
                        break;
                }
                if (getLayoutDirection() == 1) {
                    this.f43607d.offset((int) (((-c22892a.f43627c) * f11) + 0.5f), (int) ((c22892a.f43628d * f11) + 0.5f));
                } else {
                    this.f43607d.offset((int) ((c22892a.f43627c * f11) + 0.5f), (int) ((c22892a.f43628d * f11) + 0.5f));
                }
                RectF rectF11 = this.f43607d;
                childAt.layout((int) rectF11.left, (int) rectF11.top, (int) rectF11.right, (int) rectF11.bottom);
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.resources.guideview.MaskView$a */
    public static class C22892a extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a */
        public int f43625a;

        /* JADX INFO: renamed from: b */
        public int f43626b;

        /* JADX INFO: renamed from: c */
        public int f43627c;

        /* JADX INFO: renamed from: d */
        public int f43628d;

        public C22892a(int i11, int i12) {
            super(i11, i12);
            this.f43625a = 4;
            this.f43626b = 32;
            this.f43627c = 0;
            this.f43628d = 0;
        }
    }

    public MaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C22892a generateDefaultLayoutParams() {
        return new C22892a(-2, -2);
    }

    /* JADX INFO: renamed from: b */
    public final void m54297b(View view, RectF rectF, int i11) {
        if (i11 == 16) {
            if (getLayoutDirection() == 1) {
                float f11 = this.f43605b.right;
                rectF.right = f11;
                rectF.left = f11 - view.getMeasuredWidth();
                return;
            } else {
                float f12 = this.f43605b.left;
                rectF.left = f12;
                rectF.right = f12 + view.getMeasuredWidth();
                return;
            }
        }
        if (i11 != 32) {
            if (i11 != 48) {
                return;
            }
            if (getLayoutDirection() == 1) {
                rectF.left = this.f43605b.left;
                rectF.right = view.getMeasuredWidth() + rectF.left;
                return;
            } else {
                float f13 = this.f43605b.right;
                rectF.right = f13;
                rectF.left = f13 - view.getMeasuredWidth();
                return;
            }
        }
        rectF.left = (this.f43605b.width() - view.getMeasuredWidth()) / 2.0f;
        rectF.right = (this.f43605b.width() + view.getMeasuredWidth()) / 2.0f;
        rectF.offset(this.f43605b.left, 0.0f);
        float f14 = rectF.left;
        if (f14 < 0.0f) {
            rectF.offset(-f14, 0.0f);
        } else if (rectF.right > getMeasuredWidth()) {
            rectF.offset(getMeasuredWidth() - rectF.right, 0.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m54299d() {
        int i11 = this.f43609f;
        if (i11 != 0 && this.f43610g == 0) {
            this.f43605b.left -= i11;
        }
        if (i11 != 0 && this.f43611h == 0) {
            this.f43605b.top -= i11;
        }
        if (i11 != 0 && this.f43612i == 0) {
            this.f43605b.right += i11;
        }
        if (i11 != 0 && this.f43613j == 0) {
            this.f43605b.bottom += i11;
        }
        int i12 = this.f43610g;
        if (i12 != 0) {
            this.f43605b.left -= i12;
        }
        int i13 = this.f43611h;
        if (i13 != 0) {
            this.f43605b.top -= i13;
        }
        int i14 = this.f43612i;
        if (i14 != 0) {
            this.f43605b.right += i14;
        }
        int i15 = this.f43613j;
        if (i15 != 0) {
            this.f43605b.bottom += i15;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m54300e(View view, RectF rectF, int i11) {
        if (i11 == 16) {
            float f11 = this.f43605b.top;
            rectF.top = f11;
            rectF.bottom = f11 + view.getMeasuredHeight();
        } else if (i11 == 32) {
            rectF.top = (this.f43605b.width() - view.getMeasuredHeight()) / 2.0f;
            rectF.bottom = (this.f43605b.width() + view.getMeasuredHeight()) / 2.0f;
            rectF.offset(0.0f, this.f43605b.top);
        } else {
            if (i11 != 48) {
                return;
            }
            RectF rectF2 = this.f43605b;
            rectF.bottom = rectF2.bottom;
            rectF.top = rectF2.bottom - view.getMeasuredHeight();
        }
    }

    public void setFullingAlpha(int i11) {
        this.f43608e.setAlpha(i11);
        invalidate();
    }

    public void setFullingColor(int i11) {
        this.f43608e.setColor(i11);
        invalidate();
    }

    public void setFullingRect(Rect rect) {
        this.f43606c.set(rect);
        m54298c();
        this.f43614k = true;
        invalidate();
    }

    public void setHighTargetCorner(int i11) {
        this.f43616m = i11;
    }

    public void setHighTargetDashColor(int i11) {
        this.f43624u = i11;
        Paint paint = this.f43623t;
        if (paint != null) {
            paint.setColor(ContextCompat.getColor(getContext(), i11));
        }
    }

    public void setHighTargetGraphStyle(int i11) {
        this.f43617n = i11;
    }

    public void setOverlayTarget(boolean z11) {
        this.f43615l = z11;
    }

    public void setPadding(int i11) {
        this.f43609f = i11;
    }

    public void setPaddingBottom(int i11) {
        this.f43613j = i11;
    }

    public void setPaddingLeft(int i11) {
        this.f43610g = i11;
    }

    public void setPaddingRight(int i11) {
        this.f43612i = i11;
    }

    public void setPaddingTop(int i11) {
        this.f43611h = i11;
    }

    public void setTargetRect(Rect rect) {
        this.f43605b.set(rect);
        m54298c();
        invalidate();
    }

    public MaskView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f43605b = new RectF();
        this.f43606c = new RectF();
        this.f43607d = new RectF();
        this.f43608e = new Paint();
        this.f43609f = 0;
        this.f43610g = 0;
        this.f43611h = 0;
        this.f43612i = 0;
        this.f43613j = 0;
        this.f43616m = 0;
        this.f43617n = 0;
        this.f43624u = R$color.primary;
        setWillNotDraw(false);
        this.f43620q = new Canvas();
        Paint paint = new Paint();
        this.f43621r = paint;
        paint.setColor(-872415232);
        Paint paint2 = new Paint();
        this.f43622s = paint2;
        paint2.setColor(getResources().getColor(R.color.transparent));
        Paint paint3 = this.f43622s;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        paint3.setXfermode(new PorterDuffXfermode(mode));
        Paint paint4 = new Paint();
        this.f43618o = paint4;
        paint4.setColor(-1);
        this.f43618o.setXfermode(new PorterDuffXfermode(mode));
        this.f43618o.setFlags(1);
        Paint paint5 = new Paint();
        this.f43623t = paint5;
        paint5.setColor(ContextCompat.getColor(getContext(), this.f43624u));
        this.f43623t.setStrokeWidth(C5275i0.m6236a(1.0f));
        this.f43623t.setStyle(Paint.Style.STROKE);
        this.f43623t.setPathEffect(new DashPathEffect(new float[]{C5275i0.m6236a(3.0f), C5275i0.m6236a(3.0f)}, 0.0f));
    }

    /* JADX INFO: renamed from: c */
    public final void m54298c() {
        m54299d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        long drawingTime = getDrawingTime();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            try {
                drawChild(canvas, getChildAt(i11), drawingTime);
            } catch (NullPointerException unused) {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            clearFocus();
            this.f43620q.setBitmap(null);
            this.f43619p = null;
        } catch (Exception e11) {
            C44128b.m97264h(e11);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            if (this.f43619p == null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                this.f43619p = bitmapCreateBitmap;
                this.f43620q.setBitmap(bitmapCreateBitmap);
            }
            this.f43619p.eraseColor(0);
            this.f43620q.drawColor(this.f43608e.getColor());
            if (!this.f43615l) {
                int i11 = this.f43617n;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            Canvas canvas2 = this.f43620q;
                            RectF rectF = this.f43605b;
                            int i12 = this.f43616m;
                            canvas2.drawRoundRect(rectF, i12, i12, this.f43618o);
                            Canvas canvas3 = this.f43620q;
                            RectF rectF2 = this.f43605b;
                            int i13 = this.f43616m;
                            canvas3.drawRoundRect(rectF2, i13, i13, this.f43623t);
                        }
                    } else {
                        this.f43620q.drawCircle(this.f43605b.centerX(), this.f43605b.centerY(), this.f43605b.width() / 2.0f, this.f43618o);
                    }
                } else {
                    Canvas canvas4 = this.f43620q;
                    RectF rectF3 = this.f43605b;
                    int i14 = this.f43616m;
                    canvas4.drawRoundRect(rectF3, i14, i14, this.f43618o);
                }
                canvas.drawBitmap(this.f43619p, 0.0f, 0.0f, (Paint) null);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        setMeasuredDimension(size, size2);
        if (!this.f43614k) {
            this.f43606c.set(0.0f, 0.0f, size, size2);
            m54298c();
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt != null) {
                C22892a c22892a = (C22892a) childAt.getLayoutParams();
                if (c22892a == null) {
                    childAt.setLayoutParams(c22892a);
                }
                measureChild(childAt, size - Integer.MIN_VALUE, Integer.MIN_VALUE + size2);
            }
        }
    }
}
