package com.kubi.resources.widget.chart.depth;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pw.C43543a;
import pw.C43544b;
import pw.C43545c;
import pw.C43546d;

/* JADX INFO: loaded from: classes13.dex */
public class KuCoinDepthView extends View {

    /* JADX INFO: renamed from: b */
    public List<DepthEntity> f44479b;

    /* JADX INFO: renamed from: c */
    public List<DepthEntity> f44480c;

    /* JADX INFO: renamed from: d */
    public float f44481d;

    /* JADX INFO: renamed from: e */
    public float f44482e;

    /* JADX INFO: renamed from: f */
    public float f44483f;

    /* JADX INFO: renamed from: g */
    public float f44484g;

    /* JADX INFO: renamed from: h */
    public double f44485h;

    /* JADX INFO: renamed from: i */
    public double f44486i;

    /* JADX INFO: renamed from: j */
    public C43545c f44487j;

    /* JADX INFO: renamed from: k */
    public C43544b f44488k;

    /* JADX INFO: renamed from: l */
    public C43544b f44489l;

    /* JADX INFO: renamed from: m */
    public C43543a f44490m;

    /* JADX INFO: renamed from: n */
    public C43546d f44491n;

    /* JADX INFO: renamed from: o */
    public GestureDetector f44492o;

    /* JADX INFO: renamed from: p */
    public long f44493p;

    /* JADX INFO: renamed from: q */
    public int f44494q;

    /* JADX INFO: renamed from: r */
    public int f44495r;

    /* JADX INFO: renamed from: s */
    public int f44496s;

    /* JADX INFO: renamed from: t */
    public int f44497t;

    /* JADX INFO: renamed from: u */
    public int f44498u;

    /* JADX INFO: renamed from: v */
    public int f44499v;

    /* JADX INFO: renamed from: w */
    public int f44500w;

    /* JADX INFO: renamed from: x */
    public float f44501x;

    /* JADX INFO: renamed from: com.kubi.resources.widget.chart.depth.KuCoinDepthView$a */
    public class C23024a extends GestureDetector.SimpleOnGestureListener {
        public C23024a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            KuCoinDepthView.this.f44493p = System.currentTimeMillis();
            KuCoinDepthView.this.f44491n.m95830d(motionEvent.getX());
            KuCoinDepthView.this.f44491n.m95834h(true);
            return super.onDown(motionEvent);
        }
    }

    public KuCoinDepthView(Context context) {
        super(context);
        this.f44479b = new ArrayList();
        this.f44480c = new ArrayList();
        this.f44493p = 0L;
        m55107c(context, null);
    }

    public void setAmountPrecision(int i11) {
        this.f44491n.m95833g(i11);
        this.f44487j.m95825f(i11);
    }

    public void setPricePrecision(int i11) {
        this.f44491n.m95835i(i11);
        this.f44487j.m95826g(i11);
    }

    /* JADX INFO: renamed from: c */
    public final void m55107c(Context context, @Nullable AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.KuCoinDepthView);
        this.f44494q = typedArrayObtainStyledAttributes.getColor(R$styleable.KuCoinDepthView_depth_gridColor, ContextCompat.getColor(getContext(), R$color.emphasis8));
        this.f44495r = typedArrayObtainStyledAttributes.getColor(R$styleable.KuCoinDepthView_depth_upColor, ContextCompat.getColor(getContext(), R$color.primary));
        this.f44496s = typedArrayObtainStyledAttributes.getColor(R$styleable.KuCoinDepthView_depth_upColor16, ContextCompat.getColor(getContext(), R$color.primary20));
        this.f44497t = typedArrayObtainStyledAttributes.getColor(R$styleable.KuCoinDepthView_depth_downColor, ContextCompat.getColor(getContext(), R$color.secondary));
        this.f44498u = typedArrayObtainStyledAttributes.getColor(R$styleable.KuCoinDepthView_depth_downColor16, ContextCompat.getColor(getContext(), R$color.secondary20));
        this.f44499v = typedArrayObtainStyledAttributes.getColor(R$styleable.KuCoinDepthView_depth_textColor, ContextCompat.getColor(getContext(), R$color.emphasis60));
        this.f44500w = typedArrayObtainStyledAttributes.getColor(R$styleable.KuCoinDepthView_depth_touchBackColor, ContextCompat.getColor(getContext(), R$color.c_large));
        typedArrayObtainStyledAttributes.recycle();
        this.f44487j = new C43545c(this);
        this.f44488k = new C43544b(this);
        this.f44489l = new C43544b(this);
        this.f44490m = new C43543a(this);
        this.f44491n = new C43546d(this);
        this.f44492o = new GestureDetector(getContext(), new C23024a());
        setAmountPrecision(2);
    }

    /* JADX INFO: renamed from: d */
    public void m55108d(List<double[]> list, List<double[]> list2) {
        int iMin = Math.min(Math.min(list.size(), list2.size()), 100);
        this.f44479b.clear();
        for (int i11 = 0; i11 < iMin; i11++) {
            this.f44479b.add(new DepthEntity(list.get(i11)[0], list.get(i11)[1], false));
        }
        Collections.sort(this.f44479b);
        for (int size = this.f44479b.size() - 1; size >= 0; size--) {
            if (size < this.f44479b.size() - 1) {
                this.f44479b.get(size).setVolume(this.f44479b.get(size).getVolume() + this.f44479b.get(size + 1).getVolume());
            }
        }
        this.f44480c.clear();
        for (int size2 = list2.size() - iMin; size2 < list2.size(); size2++) {
            this.f44480c.add(new DepthEntity(list2.get(size2)[0], list2.get(size2)[1], true));
        }
        Collections.sort(this.f44480c);
        for (int i12 = 0; i12 < this.f44480c.size(); i12++) {
            if (i12 > 0) {
                this.f44480c.get(i12).setVolume(this.f44480c.get(i12).getVolume() + this.f44480c.get(i12 - 1).getVolume());
            }
        }
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z11;
        super.onDraw(canvas);
        C43546d c43546d = this.f44491n;
        if (System.currentTimeMillis() - this.f44493p < 2000) {
            z11 = true;
        } else {
            z11 = false;
        }
        c43546d.m95834h(z11);
        this.f44490m.m95817a(canvas, getWidth(), getHeight() - this.f44487j.m95822c());
        if (this.f44479b.isEmpty() && this.f44480c.isEmpty()) {
            return;
        }
        this.f44488k.m95818a(canvas, this.f44479b);
        this.f44489l.m95819b(canvas, this.f44480c);
        this.f44487j.m95824e(canvas, getWidth(), getHeight());
        this.f44491n.m95828b(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        double volume;
        double volume2;
        double volume3;
        super.onLayout(z11, i11, i12, i13, i14);
        this.f44481d = getPaddingLeft() + 1;
        this.f44482e = getPaddingTop() + 1;
        this.f44483f = (getMeasuredWidth() - getPaddingRight()) - 1;
        this.f44484g = (getMeasuredHeight() - getPaddingBottom()) - 1;
        double volume4 = 0.0d;
        if (!this.f44479b.isEmpty()) {
            volume = this.f44479b.get(0).getVolume();
            List<DepthEntity> list = this.f44479b;
            volume2 = list.get(list.size() - 1).getVolume();
        } else {
            volume = 0.0d;
            volume2 = 0.0d;
        }
        if (!this.f44480c.isEmpty()) {
            List<DepthEntity> list2 = this.f44480c;
            volume4 = list2.get(list2.size() - 1).getVolume();
            volume3 = this.f44480c.get(0).getVolume();
        } else {
            volume3 = 0.0d;
        }
        this.f44485h = Math.max(volume, volume4);
        double dMin = Math.min(volume2, volume3);
        double dM6236a = (this.f44484g - this.f44482e) - C5275i0.m6236a(15.0f);
        this.f44486i = dM6236a;
        double d11 = dM6236a / (this.f44485h - dMin);
        double size = (this.f44483f - this.f44481d) / (this.f44479b.size() + this.f44480c.size());
        for (int i15 = 0; i15 < this.f44479b.size(); i15++) {
            this.f44479b.get(i15).setX(this.f44481d + (((float) size) * i15));
            this.f44479b.get(i15).setY(this.f44482e + ((float) ((this.f44485h - this.f44479b.get(i15).getVolume()) * d11)));
        }
        for (int size2 = this.f44480c.size() - 1; size2 >= 0; size2--) {
            this.f44480c.get(size2).setX(this.f44483f - ((float) (((double) ((this.f44480c.size() - 1) - size2)) * size)));
            this.f44480c.get(size2).setY(this.f44482e + ((float) ((this.f44485h - this.f44480c.get(size2).getVolume()) * d11)));
        }
        this.f44487j.m95823d(this.f44479b, this.f44480c);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        invalidate();
                    }
                } else if (this.f44491n.m95832f()) {
                    this.f44493p = System.currentTimeMillis();
                    this.f44491n.m95830d(motionEvent.getX());
                    invalidate();
                    if (Math.abs(this.f44501x - motionEvent.getX()) > 30.0f) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
                invalidate();
            }
        } else {
            this.f44501x = motionEvent.getX();
        }
        this.f44492o.onTouchEvent(motionEvent);
        return true;
    }

    public KuCoinDepthView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44479b = new ArrayList();
        this.f44480c = new ArrayList();
        this.f44493p = 0L;
        m55107c(context, attributeSet);
    }

    public KuCoinDepthView(Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f44479b = new ArrayList();
        this.f44480c = new ArrayList();
        this.f44493p = 0L;
        m55107c(context, attributeSet);
    }
}
