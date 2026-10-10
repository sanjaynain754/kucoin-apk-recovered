package com.kubi.resources.widget.rorbin.badgeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.navigation.NavigationBarView;
import com.kubi.sdk.res.R$font;
import java.util.ArrayList;
import java.util.List;
import ro.C44128b;
import zw.C46931b;
import zw.C46933d;
import zw.C46934e;
import zw.InterfaceC46930a;

/* JADX INFO: loaded from: classes12.dex */
public class QBadgeView extends View implements InterfaceC46930a {

    /* JADX INFO: renamed from: A */
    public Paint.FontMetrics f45036A;

    /* JADX INFO: renamed from: B */
    public PointF f45037B;

    /* JADX INFO: renamed from: C */
    public PointF f45038C;

    /* JADX INFO: renamed from: D */
    public PointF f45039D;

    /* JADX INFO: renamed from: E */
    public PointF f45040E;

    /* JADX INFO: renamed from: F */
    public List<PointF> f45041F;

    /* JADX INFO: renamed from: G */
    public View f45042G;

    /* JADX INFO: renamed from: H */
    public int f45043H;

    /* JADX INFO: renamed from: I */
    public int f45044I;

    /* JADX INFO: renamed from: J */
    public TextPaint f45045J;

    /* JADX INFO: renamed from: K */
    public Paint f45046K;

    /* JADX INFO: renamed from: L */
    public Paint f45047L;

    /* JADX INFO: renamed from: M */
    public C46931b f45048M;

    /* JADX INFO: renamed from: N */
    public ViewGroup f45049N;

    /* JADX INFO: renamed from: b */
    public int f45050b;

    /* JADX INFO: renamed from: c */
    public int f45051c;

    /* JADX INFO: renamed from: d */
    public int f45052d;

    /* JADX INFO: renamed from: e */
    public Drawable f45053e;

    /* JADX INFO: renamed from: f */
    public Bitmap f45054f;

    /* JADX INFO: renamed from: g */
    public boolean f45055g;

    /* JADX INFO: renamed from: h */
    public float f45056h;

    /* JADX INFO: renamed from: i */
    public float f45057i;

    /* JADX INFO: renamed from: j */
    public float f45058j;

    /* JADX INFO: renamed from: k */
    public int f45059k;

    /* JADX INFO: renamed from: l */
    public String f45060l;

    /* JADX INFO: renamed from: m */
    public boolean f45061m;

    /* JADX INFO: renamed from: n */
    public boolean f45062n;

    /* JADX INFO: renamed from: o */
    public boolean f45063o;

    /* JADX INFO: renamed from: p */
    public boolean f45064p;

    /* JADX INFO: renamed from: q */
    public int f45065q;

    /* JADX INFO: renamed from: r */
    public float f45066r;

    /* JADX INFO: renamed from: s */
    public float f45067s;

    /* JADX INFO: renamed from: t */
    public float f45068t;

    /* JADX INFO: renamed from: u */
    public float f45069u;

    /* JADX INFO: renamed from: v */
    public int f45070v;

    /* JADX INFO: renamed from: w */
    public boolean f45071w;

    /* JADX INFO: renamed from: x */
    public RectF f45072x;

    /* JADX INFO: renamed from: y */
    public RectF f45073y;

    /* JADX INFO: renamed from: z */
    public Path f45074z;

    public class BadgeContainer extends ViewGroup {
        @Override // android.view.ViewGroup, android.view.View
        public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override // android.view.View
        public void onMeasure(int i11, int i12) {
            View view = null;
            View view2 = null;
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                if (childAt instanceof QBadgeView) {
                    view2 = childAt;
                } else {
                    view = childAt;
                }
            }
            if (view == null) {
                super.onMeasure(i11, i12);
                return;
            }
            view.measure(i11, i12);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        public BadgeContainer(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
            if (!(getParent() instanceof RelativeLayout)) {
                super.dispatchRestoreInstanceState(sparseArray);
            }
        }
    }

    public QBadgeView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: u */
    public final void m55444u() {
        setLayerType(1, null);
        this.f45072x = new RectF();
        this.f45073y = new RectF();
        this.f45074z = new Path();
        this.f45037B = new PointF();
        this.f45038C = new PointF();
        this.f45039D = new PointF();
        this.f45040E = new PointF();
        this.f45041F = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.f45045J = textPaint;
        textPaint.setAntiAlias(true);
        this.f45045J.setSubpixelText(true);
        this.f45045J.setFakeBoldText(true);
        this.f45045J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint = new Paint();
        this.f45046K = paint;
        paint.setAntiAlias(true);
        this.f45046K.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f45047L = paint2;
        paint2.setAntiAlias(true);
        this.f45047L.setStyle(Paint.Style.STROKE);
        this.f45050b = -1552832;
        this.f45052d = -1;
        this.f45057i = C46933d.m103407a(getContext(), 11.0f);
        this.f45058j = C46933d.m103407a(getContext(), 5.0f);
        this.f45059k = 0;
        this.f45065q = 8388661;
        this.f45066r = C46933d.m103407a(getContext(), 1.0f);
        this.f45067s = C46933d.m103407a(getContext(), 1.0f);
        this.f45069u = C46933d.m103407a(getContext(), 90.0f);
        this.f45064p = true;
        this.f45055g = false;
        setTranslationZ(1000.0f);
    }

    /* JADX INFO: renamed from: w */
    public final void m55446w() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        PointF pointF = this.f45039D;
        PointF pointF2 = this.f45037B;
        pointF.x = pointF2.x + iArr[0];
        pointF.y = pointF2.y + iArr[1];
    }

    public QBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float getBadgeCircleRadius() {
        if (this.f45060l.isEmpty()) {
            return this.f45058j;
        }
        if (this.f45060l.length() == 1) {
            return this.f45072x.height() > this.f45072x.width() ? (this.f45072x.height() / 2.0f) + (this.f45058j * 0.5f) : (this.f45072x.width() / 2.0f) + (this.f45058j * 0.5f);
        }
        return this.f45073y.height() / 2.0f;
    }

    /* JADX INFO: renamed from: B */
    public InterfaceC46930a m55419B(int i11) {
        this.f45050b = i11;
        if (i11 == 0) {
            this.f45045J.setXfermode(null);
        } else {
            this.f45045J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: C */
    public InterfaceC46930a m55420C(String str) {
        this.f45060l = str;
        this.f45059k = 1;
        m55447x();
        invalidate();
        return this;
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: a */
    public void mo55424a(boolean z11) {
        if (!z11 || this.f45049N == null) {
            mo55425b(0);
        } else {
            m55446w();
            m55433j(this.f45039D);
        }
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: b */
    public InterfaceC46930a mo55425b(int i11) {
        this.f45059k = i11;
        if (i11 < 0) {
            this.f45060l = "";
        } else if (i11 > 99) {
            this.f45060l = this.f45063o ? String.valueOf(i11) : "99+";
        } else if (i11 > 0 && i11 <= 99) {
            this.f45060l = String.valueOf(i11);
        } else if (i11 == 0) {
            this.f45060l = null;
        }
        m55447x();
        invalidate();
        return this;
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: c */
    public InterfaceC46930a mo55426c(float f11, float f12, boolean z11) {
        if (z11) {
            f11 = C46933d.m103407a(getContext(), f11);
        }
        this.f45066r = f11;
        if (z11) {
            f12 = C46933d.m103407a(getContext(), f12);
        }
        this.f45067s = f12;
        invalidate();
        return this;
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: d */
    public InterfaceC46930a mo55427d(boolean z11) {
        this.f45064p = z11;
        invalidate();
        return this;
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: e */
    public InterfaceC46930a mo55428e(float f11, boolean z11) {
        if (z11) {
            f11 = C46933d.m103407a(getContext(), f11);
        }
        this.f45058j = f11;
        m55436m();
        invalidate();
        return this;
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: f */
    public InterfaceC46930a mo55429f(View view) {
        if (view == null) {
            throw new IllegalStateException("targetView can not be null");
        }
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("targetView must have a parent");
        }
        this.f45042G = view;
        if (parent instanceof BadgeContainer) {
            ((BadgeContainer) parent).addView(this);
            return this;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int iIndexOfChild = viewGroup.indexOfChild(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        BadgeContainer badgeContainer = new BadgeContainer(getContext());
        if (viewGroup instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewGroup;
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ConstraintSet constraintSetM55443t = m55443t(badgeContainer, view.getId(), constraintLayout);
            if (constraintSetM55443t == null) {
                return this;
            }
            constraintLayout.removeView(view);
            layoutParams2.reset();
            constraintLayout.addView(badgeContainer, iIndexOfChild, layoutParams2);
            constraintLayout.setConstraintSet(constraintSetM55443t);
        } else {
            viewGroup.removeView(view);
            if (viewGroup instanceof RelativeLayout) {
                badgeContainer.setId(view.getId());
            }
            viewGroup.addView(badgeContainer, iIndexOfChild, layoutParams);
        }
        badgeContainer.addView(view);
        badgeContainer.addView(this);
        return this;
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: g */
    public InterfaceC46930a mo55430g(int i11, float f11, boolean z11) {
        this.f45051c = i11;
        if (z11) {
            f11 = C46933d.m103407a(getContext(), f11);
        }
        this.f45056h = f11;
        invalidate();
        return this;
    }

    public Drawable getBadgeBackground() {
        return this.f45053e;
    }

    public int getBadgeBackgroundColor() {
        return this.f45050b;
    }

    public int getBadgeGravity() {
        return this.f45065q;
    }

    @Override // zw.InterfaceC46930a
    public int getBadgeNumber() {
        return this.f45059k;
    }

    public String getBadgeText() {
        return this.f45060l;
    }

    public int getBadgeTextColor() {
        return this.f45052d;
    }

    public PointF getDragCenter() {
        if (this.f45061m && this.f45062n) {
            return this.f45038C;
        }
        return null;
    }

    public View getTargetView() {
        return this.f45042G;
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: i */
    public InterfaceC46930a mo55432i(float f11, boolean z11) {
        if (z11) {
            f11 = C46933d.m103407a(getContext(), f11);
        }
        this.f45057i = f11;
        m55447x();
        invalidate();
        return this;
    }

    /* JADX INFO: renamed from: j */
    public void m55433j(PointF pointF) {
        if (this.f45060l == null) {
            return;
        }
        C46931b c46931b = this.f45048M;
        if (c46931b == null || !c46931b.isRunning()) {
            m55418A(true);
            C46931b c46931b2 = new C46931b(m55435l(), pointF, this);
            this.f45048M = c46931b2;
            c46931b2.start();
            mo55425b(0);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m55434k(int i11, int i12, ConstraintSet.Layout layout) {
        if (i12 == layout.baselineToBaseline) {
            layout.baselineToBaseline = i11;
        }
        if (i12 == layout.guideBegin) {
            layout.guideBegin = i11;
        }
        if (i12 == layout.guideEnd) {
            layout.guideEnd = i11;
        }
        if (i12 == layout.leftToLeft) {
            layout.leftToLeft = i11;
        }
        if (i12 == layout.leftToRight) {
            layout.leftToRight = i11;
        }
        if (i12 == layout.rightToLeft) {
            layout.rightToLeft = i11;
        }
        if (i12 == layout.rightToRight) {
            layout.rightToRight = i11;
        }
        if (i12 == layout.topToTop) {
            layout.topToTop = i11;
        }
        if (i12 == layout.topToBottom) {
            layout.topToBottom = i11;
        }
        if (i12 == layout.bottomToTop) {
            layout.bottomToTop = i11;
        }
        if (i12 == layout.bottomToBottom) {
            layout.bottomToBottom = i11;
        }
        if (i12 == layout.baselineToTop) {
            layout.baselineToTop = i11;
        }
        if (i12 == layout.baselineToBottom) {
            layout.baselineToBottom = i11;
        }
        if (i12 == layout.startToEnd) {
            layout.startToEnd = i11;
        }
        if (i12 == layout.startToStart) {
            layout.startToStart = i11;
        }
        if (i12 == layout.endToStart) {
            layout.endToStart = i11;
        }
        if (i12 == layout.endToEnd) {
            layout.endToEnd = i11;
        }
        if (i12 == layout.circleConstraint) {
            layout.circleConstraint = i11;
        }
    }

    /* JADX INFO: renamed from: l */
    public Bitmap m55435l() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.f45073y.width()) + C46933d.m103407a(getContext(), 3.0f), ((int) this.f45073y.height()) + C46933d.m103407a(getContext(), 3.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        m55437n(canvas, new PointF(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f), getBadgeCircleRadius());
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: m */
    public final void m55436m() {
        if (this.f45060l != null && this.f45055g) {
            Bitmap bitmap = this.f45054f;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f45054f.recycle();
            }
            float badgeCircleRadius = getBadgeCircleRadius();
            if (!this.f45060l.isEmpty() && this.f45060l.length() != 1) {
                this.f45054f = Bitmap.createBitmap((int) (this.f45072x.width() + (this.f45058j * 2.0f)), (int) (this.f45072x.height() + this.f45058j), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(this.f45054f);
                canvas.drawRoundRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), canvas.getHeight() / 2.0f, canvas.getHeight() / 2.0f, this.f45046K);
            } else {
                int i11 = ((int) badgeCircleRadius) * 2;
                this.f45054f = Bitmap.createBitmap(i11, i11, Bitmap.Config.ARGB_4444);
                Canvas canvas2 = new Canvas(this.f45054f);
                canvas2.drawCircle(canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f, canvas2.getWidth() / 2.0f, this.f45046K);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m55437n(Canvas canvas, PointF pointF, float f11) {
        if (pointF.x == -1000.0f && pointF.y == -1000.0f) {
            return;
        }
        if (this.f45060l.isEmpty() || this.f45060l.length() == 1) {
            RectF rectF = this.f45073y;
            float f12 = pointF.x;
            float f13 = (int) f11;
            rectF.left = f12 - f13;
            float f14 = pointF.y;
            rectF.top = f14 - f13;
            rectF.right = f12 + f13;
            rectF.bottom = f13 + f14;
            if (this.f45053e != null) {
                m55438o(canvas);
            } else {
                canvas.drawCircle(f12, f14, f11, this.f45046K);
                if (this.f45051c != 0 && this.f45056h > 0.0f) {
                    canvas.drawCircle(pointF.x, pointF.y, f11, this.f45047L);
                }
            }
        } else {
            this.f45073y.left = pointF.x - ((this.f45072x.width() / 2.0f) + this.f45058j);
            this.f45073y.top = pointF.y - ((this.f45072x.height() / 2.0f) + (this.f45058j * 0.5f));
            this.f45073y.right = pointF.x + (this.f45072x.width() / 2.0f) + this.f45058j;
            this.f45073y.bottom = pointF.y + (this.f45072x.height() / 2.0f) + (this.f45058j * 0.5f);
            float fHeight = this.f45073y.height() / 2.0f;
            if (this.f45053e != null) {
                m55438o(canvas);
            } else {
                canvas.drawRoundRect(this.f45073y, fHeight, fHeight, this.f45046K);
                if (this.f45051c != 0 && this.f45056h > 0.0f) {
                    canvas.drawRoundRect(this.f45073y, fHeight, fHeight, this.f45047L);
                }
            }
        }
        if (this.f45060l.isEmpty()) {
            return;
        }
        String str = this.f45060l;
        float f15 = pointF.x;
        RectF rectF2 = this.f45073y;
        float f16 = rectF2.bottom + rectF2.top;
        Paint.FontMetrics fontMetrics = this.f45036A;
        canvas.drawText(str, f15, ((f16 - fontMetrics.bottom) - fontMetrics.top) / 2.0f, this.f45045J);
    }

    /* JADX INFO: renamed from: o */
    public final void m55438o(Canvas canvas) {
        Canvas canvas2;
        this.f45046K.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        RectF rectF = this.f45073y;
        int i11 = (int) rectF.left;
        int i12 = (int) rectF.top;
        int width = (int) rectF.right;
        int height = (int) rectF.bottom;
        if (this.f45055g) {
            width = i11 + this.f45054f.getWidth();
            height = this.f45054f.getHeight() + i12;
            canvas2 = canvas;
            canvas2.saveLayer(i11, i12, width, height, null, 31);
        } else {
            canvas2 = canvas;
        }
        this.f45053e.setBounds(i11, i12, width, height);
        this.f45053e.draw(canvas2);
        if (!this.f45055g) {
            canvas2.drawRect(this.f45073y, this.f45047L);
            return;
        }
        this.f45046K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(this.f45054f, i11, i12, this.f45046K);
        canvas2.restore();
        this.f45046K.setXfermode(null);
        if (this.f45060l.isEmpty() || this.f45060l.length() == 1) {
            canvas2.drawCircle(this.f45073y.centerX(), this.f45073y.centerY(), this.f45073y.width() / 2.0f, this.f45047L);
        } else {
            RectF rectF2 = this.f45073y;
            canvas2.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f45073y.height() / 2.0f, this.f45047L);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C46931b c46931b = this.f45048M;
        if (c46931b != null && c46931b.isRunning()) {
            this.f45048M.m103401b(canvas);
            return;
        }
        if (this.f45060l != null) {
            m55445v();
            float badgeCircleRadius = getBadgeCircleRadius();
            float fM103409b = this.f45068t * (1.0f - (C46934e.m103409b(this.f45039D, this.f45038C) / this.f45069u));
            if (!this.f45061m || !this.f45062n) {
                m55441r();
                m55437n(canvas, this.f45037B, badgeCircleRadius);
                return;
            }
            this.f45070v = C46934e.m103410c(this.f45038C, this.f45039D);
            m55422E(this.f45064p);
            boolean z11 = fM103409b < ((float) C46933d.m103407a(getContext(), 1.5f));
            this.f45071w = z11;
            if (z11) {
                m55423F(3);
                m55437n(canvas, this.f45038C, badgeCircleRadius);
            } else {
                m55423F(2);
                m55439p(canvas, fM103409b, badgeCircleRadius);
                m55437n(canvas, this.f45038C, badgeCircleRadius);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m55439p(Canvas canvas, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        PointF pointF = this.f45038C;
        float f16 = pointF.y;
        PointF pointF2 = this.f45039D;
        float f17 = f16 - pointF2.y;
        float f18 = pointF.x - pointF2.x;
        this.f45041F.clear();
        if (f18 != 0.0f) {
            double d11 = (-1.0d) / ((double) (f17 / f18));
            C46934e.m103408a(this.f45038C, f12, Double.valueOf(d11), this.f45041F);
            C46934e.m103408a(this.f45039D, f11, Double.valueOf(d11), this.f45041F);
        } else {
            C46934e.m103408a(this.f45038C, f12, Double.valueOf(0.0d), this.f45041F);
            C46934e.m103408a(this.f45039D, f11, Double.valueOf(0.0d), this.f45041F);
        }
        this.f45074z.reset();
        Path path = this.f45074z;
        PointF pointF3 = this.f45039D;
        float f19 = pointF3.x;
        float f21 = pointF3.y;
        int i11 = this.f45070v;
        path.addCircle(f19, f21, f11, (i11 == 1 || i11 == 2) ? Path.Direction.CCW : Path.Direction.CW);
        PointF pointF4 = this.f45040E;
        PointF pointF5 = this.f45039D;
        float f22 = pointF5.x;
        PointF pointF6 = this.f45038C;
        pointF4.x = (f22 + pointF6.x) / 2.0f;
        pointF4.y = (pointF5.y + pointF6.y) / 2.0f;
        this.f45074z.moveTo(this.f45041F.get(2).x, this.f45041F.get(2).y);
        Path path2 = this.f45074z;
        PointF pointF7 = this.f45040E;
        path2.quadTo(pointF7.x, pointF7.y, this.f45041F.get(0).x, this.f45041F.get(0).y);
        this.f45074z.lineTo(this.f45041F.get(1).x, this.f45041F.get(1).y);
        Path path3 = this.f45074z;
        PointF pointF8 = this.f45040E;
        path3.quadTo(pointF8.x, pointF8.y, this.f45041F.get(3).x, this.f45041F.get(3).y);
        this.f45074z.lineTo(this.f45041F.get(2).x, this.f45041F.get(2).y);
        this.f45074z.close();
        canvas.drawPath(this.f45074z, this.f45046K);
        if (this.f45051c == 0 || this.f45056h <= 0.0f) {
            return;
        }
        this.f45074z.reset();
        this.f45074z.moveTo(this.f45041F.get(2).x, this.f45041F.get(2).y);
        Path path4 = this.f45074z;
        PointF pointF9 = this.f45040E;
        path4.quadTo(pointF9.x, pointF9.y, this.f45041F.get(0).x, this.f45041F.get(0).y);
        this.f45074z.moveTo(this.f45041F.get(1).x, this.f45041F.get(1).y);
        Path path5 = this.f45074z;
        PointF pointF10 = this.f45040E;
        path5.quadTo(pointF10.x, pointF10.y, this.f45041F.get(3).x, this.f45041F.get(3).y);
        int i12 = this.f45070v;
        if (i12 == 1 || i12 == 2) {
            float f23 = this.f45041F.get(2).x;
            PointF pointF11 = this.f45039D;
            f13 = f23 - pointF11.x;
            f14 = pointF11.y;
            f15 = this.f45041F.get(2).y;
        } else {
            float f24 = this.f45041F.get(3).x;
            PointF pointF12 = this.f45039D;
            f13 = f24 - pointF12.x;
            f14 = pointF12.y;
            f15 = this.f45041F.get(3).y;
        }
        double dAtan = Math.atan((f14 - f15) / f13);
        int i13 = this.f45070v;
        float fM103412e = 360.0f - ((float) C46934e.m103412e(C46934e.m103411d(dAtan, i13 + (-1) == 0 ? 4 : i13 - 1)));
        Path path6 = this.f45074z;
        PointF pointF13 = this.f45039D;
        float f25 = pointF13.x;
        float f26 = pointF13.y;
        path6.addArc(f25 - f11, f26 - f11, f25 + f11, f26 + f11, fM103412e, 180.0f);
        canvas.drawPath(this.f45074z, this.f45047L);
    }

    /* JADX INFO: renamed from: r */
    public final void m55441r() {
        float fHeight = this.f45072x.height() > this.f45072x.width() ? this.f45072x.height() : this.f45072x.width();
        switch (this.f45065q) {
            case 17:
                PointF pointF = this.f45037B;
                pointF.x = this.f45043H / 2.0f;
                pointF.y = this.f45044I / 2.0f;
                break;
            case 49:
                PointF pointF2 = this.f45037B;
                pointF2.x = this.f45043H / 2.0f;
                pointF2.y = this.f45067s + this.f45058j + (this.f45072x.height() / 2.0f);
                break;
            case 81:
                PointF pointF3 = this.f45037B;
                pointF3.x = this.f45043H / 2.0f;
                pointF3.y = this.f45044I - ((this.f45067s + this.f45058j) + (this.f45072x.height() / 2.0f));
                break;
            case NavigationBarView.ITEM_GRAVITY_START_CENTER /* 8388627 */:
                if (getLayoutDirection() == 1) {
                    this.f45037B.x = this.f45043H - ((this.f45066r + this.f45058j) + (fHeight / 2.0f));
                } else {
                    this.f45037B.x = this.f45066r + this.f45058j + (fHeight / 2.0f);
                }
                this.f45037B.y = this.f45044I / 2.0f;
                break;
            case 8388629:
                if (getLayoutDirection() == 1) {
                    this.f45037B.x = this.f45066r + this.f45058j + (fHeight / 2.0f);
                } else {
                    this.f45037B.x = this.f45043H - ((this.f45066r + this.f45058j) + (fHeight / 2.0f));
                }
                this.f45037B.y = this.f45044I / 2.0f;
                break;
            case 8388659:
                if (getLayoutDirection() == 1) {
                    this.f45037B.x = this.f45043H - ((this.f45066r + this.f45058j) + (fHeight / 2.0f));
                } else {
                    this.f45037B.x = this.f45066r + this.f45058j + (fHeight / 2.0f);
                }
                this.f45037B.y = this.f45067s + this.f45058j + (this.f45072x.height() / 2.0f);
                break;
            case 8388661:
                if (getLayoutDirection() == 1) {
                    this.f45037B.x = this.f45066r + this.f45058j + (fHeight / 2.0f);
                } else {
                    this.f45037B.x = this.f45043H - ((this.f45066r + this.f45058j) + (fHeight / 2.0f));
                }
                this.f45037B.y = this.f45067s + this.f45058j + (this.f45072x.height() / 2.0f);
                break;
            case 8388691:
                if (getLayoutDirection() == 1) {
                    this.f45037B.x = this.f45043H - ((this.f45066r + this.f45058j) + (fHeight / 2.0f));
                } else {
                    this.f45037B.x = this.f45066r + this.f45058j + (fHeight / 2.0f);
                }
                this.f45037B.y = this.f45044I - ((this.f45067s + this.f45058j) + (this.f45072x.height() / 2.0f));
                break;
            case 8388693:
                if (getLayoutDirection() == 1) {
                    this.f45037B.x = this.f45066r + this.f45058j + (fHeight / 2.0f);
                } else {
                    this.f45037B.x = this.f45043H - ((this.f45066r + this.f45058j) + (fHeight / 2.0f));
                }
                this.f45037B.y = this.f45044I - ((this.f45067s + this.f45058j) + (this.f45072x.height() / 2.0f));
                break;
        }
        m55446w();
    }

    /* JADX INFO: renamed from: t */
    public final ConstraintSet m55443t(BadgeContainer badgeContainer, int i11, ConstraintLayout constraintLayout) {
        try {
            ConstraintSet constraintSet = new ConstraintSet();
            int iGenerateViewId = View.generateViewId();
            badgeContainer.setId(iGenerateViewId);
            constraintSet.clone(constraintLayout);
            int childCount = constraintLayout.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                int id2 = constraintLayout.getChildAt(i12).getId();
                if (id2 != -1) {
                    m55434k(iGenerateViewId, i11, constraintSet.getParameters(id2).layout);
                }
            }
            return constraintSet;
        } catch (Exception e11) {
            C44128b.m97264h(e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m55445v() {
        m55422E(this.f45064p);
        this.f45046K.setColor(this.f45050b);
        this.f45047L.setColor(this.f45051c);
        this.f45047L.setStrokeWidth(this.f45056h);
        this.f45045J.setColor(this.f45052d);
        this.f45045J.setTextAlign(Paint.Align.CENTER);
    }

    /* JADX INFO: renamed from: x */
    public final void m55447x() {
        RectF rectF = this.f45072x;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        if (TextUtils.isEmpty(this.f45060l)) {
            RectF rectF2 = this.f45072x;
            rectF2.right = 0.0f;
            rectF2.bottom = 0.0f;
        } else {
            this.f45045J.setTextSize(this.f45057i);
            this.f45045J.setTypeface(ResourcesCompat.getFont(getContext(), R$font.medium));
            this.f45072x.right = this.f45045J.measureText(this.f45060l);
            Paint.FontMetrics fontMetrics = this.f45045J.getFontMetrics();
            this.f45036A = fontMetrics;
            this.f45072x.bottom = fontMetrics.descent - fontMetrics.ascent;
        }
        m55436m();
    }

    /* JADX INFO: renamed from: y */
    public final void m55448y() {
        if (this.f45071w) {
            m55433j(this.f45038C);
            m55423F(5);
        } else {
            m55449z();
            m55423F(4);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m55449z() {
        PointF pointF = this.f45038C;
        pointF.x = -1000.0f;
        pointF.y = -1000.0f;
        this.f45070v = 4;
        m55418A(false);
        getParent().requestDisallowInterceptTouchEvent(false);
        invalidate();
    }

    public QBadgeView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m55444u();
    }

    /* JADX INFO: renamed from: A */
    public void m55418A(boolean z11) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z11) {
            this.f45049N.addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            mo55429f(this.f45042G);
        }
    }

    /* JADX INFO: renamed from: D */
    public InterfaceC46930a m55421D(float f11, boolean z11) {
        return mo55426c(f11, f11, z11);
    }

    /* JADX INFO: renamed from: E */
    public final void m55422E(boolean z11) {
        float fM103407a;
        int iM103407a = C46933d.m103407a(getContext(), 1.0f);
        int iM103407a2 = C46933d.m103407a(getContext(), 1.5f);
        int i11 = this.f45070v;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        iM103407a = C46933d.m103407a(getContext(), 1.0f);
                        iM103407a2 = C46933d.m103407a(getContext(), 1.5f);
                    }
                } else {
                    iM103407a = C46933d.m103407a(getContext(), -1.0f);
                    iM103407a2 = C46933d.m103407a(getContext(), 1.5f);
                }
            } else {
                iM103407a = C46933d.m103407a(getContext(), -1.0f);
                iM103407a2 = C46933d.m103407a(getContext(), -1.5f);
            }
        } else {
            iM103407a = C46933d.m103407a(getContext(), 1.0f);
            iM103407a2 = C46933d.m103407a(getContext(), -1.5f);
        }
        Paint paint = this.f45046K;
        if (z11) {
            fM103407a = C46933d.m103407a(getContext(), 2.0f);
        } else {
            fM103407a = 0.0f;
        }
        paint.setShadowLayer(fM103407a, iM103407a, iM103407a2, 855638016);
    }

    @Override // zw.InterfaceC46930a
    /* JADX INFO: renamed from: h */
    public InterfaceC46930a mo55431h(int i11) {
        if (i11 != 8388659 && i11 != 8388661 && i11 != 8388691 && i11 != 8388693 && i11 != 17 && i11 != 49 && i11 != 81 && i11 != 8388627 && i11 != 8388629) {
            throw new IllegalStateException("only support Gravity.START | Gravity.TOP , Gravity.END | Gravity.TOP , Gravity.START | Gravity.BOTTOM , Gravity.END | Gravity.BOTTOM , Gravity.CENTER , Gravity.CENTER | Gravity.TOP , Gravity.CENTER | Gravity.BOTTOM ,Gravity.CENTER | Gravity.START , Gravity.CENTER | Gravity.END");
        }
        this.f45065q = i11;
        invalidate();
        return this;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f45049N == null) {
            m55442s(this.f45042G);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f45043H = i11;
        this.f45044I = i12;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0031  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float x11;
        RectF rectF;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                if (motionEvent.getPointerId(motionEvent.getActionIndex()) == 0) {
                                    this.f45062n = false;
                                    m55448y();
                                }
                            }
                        } else {
                            x11 = motionEvent.getX();
                            float y11 = motionEvent.getY();
                            if (this.f45061m) {
                                rectF = this.f45073y;
                                if (x11 > rectF.left) {
                                    m55446w();
                                    this.f45062n = true;
                                    m55423F(1);
                                    this.f45068t = C46933d.m103407a(getContext(), 7.0f);
                                    getParent().requestDisallowInterceptTouchEvent(true);
                                    m55418A(true);
                                    this.f45038C.x = motionEvent.getRawX();
                                    this.f45038C.y = motionEvent.getRawY();
                                }
                            }
                        }
                    } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == 0) {
                        this.f45062n = false;
                        m55448y();
                    }
                } else if (this.f45062n) {
                    this.f45038C.x = motionEvent.getRawX();
                    this.f45038C.y = motionEvent.getRawY();
                    invalidate();
                }
            } else if (motionEvent.getPointerId(motionEvent.getActionIndex()) == 0 && this.f45062n) {
                this.f45062n = false;
                m55448y();
            }
        } else {
            x11 = motionEvent.getX();
            float y12 = motionEvent.getY();
            if (this.f45061m && motionEvent.getPointerId(motionEvent.getActionIndex()) == 0) {
                rectF = this.f45073y;
                if (x11 > rectF.left && x11 < rectF.right && y12 > rectF.top && y12 < rectF.bottom && this.f45060l != null) {
                    m55446w();
                    this.f45062n = true;
                    m55423F(1);
                    this.f45068t = C46933d.m103407a(getContext(), 7.0f);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    m55418A(true);
                    this.f45038C.x = motionEvent.getRawX();
                    this.f45038C.y = motionEvent.getRawY();
                }
            }
        }
        if (!this.f45062n && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m55440q(View view) {
        if (view.getParent() != null && (view.getParent() instanceof View)) {
            m55440q((View) view.getParent());
        } else if (view instanceof ViewGroup) {
            this.f45049N = (ViewGroup) view;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m55442s(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        this.f45049N = viewGroup;
        if (viewGroup == null) {
            m55440q(view);
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m55423F(int i11) {
    }
}
