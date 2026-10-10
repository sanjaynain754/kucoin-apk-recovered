package com.kubi.resources.widget.lockview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$color;

/* JADX INFO: loaded from: classes13.dex */
public class LockView extends View implements InterfaceC23096b {

    /* JADX INFO: renamed from: b */
    public int f44977b;

    /* JADX INFO: renamed from: c */
    public int f44978c;

    /* JADX INFO: renamed from: d */
    public int f44979d;

    /* JADX INFO: renamed from: e */
    public int f44980e;

    /* JADX INFO: renamed from: f */
    public int f44981f;

    /* JADX INFO: renamed from: g */
    public Paint f44982g;

    /* JADX INFO: renamed from: h */
    public int f44983h;

    /* JADX INFO: renamed from: i */
    public float f44984i;

    /* JADX INFO: renamed from: j */
    public float f44985j;

    public LockView(Context context) {
        this(context, null);
    }

    @Override // com.kubi.resources.widget.lockview.InterfaceC23096b
    /* JADX INFO: renamed from: a */
    public void mo55403a() {
        this.f44983h = 0;
        postInvalidate();
    }

    @Override // com.kubi.resources.widget.lockview.InterfaceC23096b
    /* JADX INFO: renamed from: b */
    public void mo55404b() {
        this.f44983h = 3;
        postInvalidate();
    }

    @Override // com.kubi.resources.widget.lockview.InterfaceC23096b
    /* JADX INFO: renamed from: c */
    public void mo55405c() {
        this.f44983h = 1;
        postInvalidate();
    }

    @Override // com.kubi.resources.widget.lockview.InterfaceC23096b
    /* JADX INFO: renamed from: d */
    public void mo55406d() {
        this.f44983h = 2;
        postInvalidate();
    }

    public LockView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44983h = 0;
        this.f44984i = C5275i0.m6236a(25.0f);
        this.f44985j = C5275i0.m6236a(10.0f);
        m55411i(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m55407e(Canvas canvas) {
        this.f44982g.setStyle(Paint.Style.FILL);
        this.f44982g.setColor(this.f44979d);
        canvas.drawCircle(0.0f, 0.0f, this.f44984i, this.f44982g);
        this.f44982g.setColor(this.f44978c);
        canvas.drawCircle(0.0f, 0.0f, this.f44985j, this.f44982g);
    }

    /* JADX INFO: renamed from: f */
    public final void m55408f(Canvas canvas) {
        this.f44982g.setStyle(Paint.Style.FILL);
        this.f44982g.setColor(this.f44979d);
        canvas.drawCircle(0.0f, 0.0f, this.f44984i, this.f44982g);
        this.f44982g.setColor(this.f44978c);
        canvas.drawCircle(0.0f, 0.0f, this.f44985j, this.f44982g);
    }

    /* JADX INFO: renamed from: g */
    public final void m55409g(Canvas canvas) {
        this.f44982g.setStyle(Paint.Style.FILL);
        this.f44982g.setColor(this.f44980e);
        canvas.drawCircle(0.0f, 0.0f, this.f44984i, this.f44982g);
        this.f44982g.setColor(this.f44981f);
        canvas.drawCircle(0.0f, 0.0f, this.f44985j, this.f44982g);
    }

    /* JADX INFO: renamed from: h */
    public final void m55410h(Canvas canvas) {
        this.f44982g.setStyle(Paint.Style.FILL);
        this.f44982g.setColor(this.f44977b);
        canvas.drawCircle(0.0f, 0.0f, this.f44985j, this.f44982g);
    }

    /* JADX INFO: renamed from: i */
    public final void m55411i(Context context) {
        Paint paint = new Paint();
        this.f44982g = paint;
        paint.setAntiAlias(true);
        this.f44977b = getResources().getColor(R$color.color_331d1d1d_33ffffff);
        this.f44978c = getResources().getColor(R$color.color_1d1d1d_fff);
        this.f44981f = getResources().getColor(R$color.secondary);
        this.f44979d = getResources().getColor(R$color.emphasis8);
        this.f44980e = getResources().getColor(R$color.secondary20);
    }

    public void setCurrentState(int i11) {
        this.f44983h = i11;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.translate(getWidth() / 2, getHeight() / 2);
        int i11 = this.f44983h;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        return;
                    }
                    m55409g(canvas);
                    return;
                }
                m55408f(canvas);
                return;
            }
            m55407e(canvas);
            return;
        }
        m55410h(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int iMin = Math.min(View.MeasureSpec.getSize(i11), View.MeasureSpec.getSize(i12));
        setMeasuredDimension(iMin, iMin);
    }

    @Override // com.kubi.resources.widget.lockview.InterfaceC23096b
    public View getView() {
        return this;
    }
}
