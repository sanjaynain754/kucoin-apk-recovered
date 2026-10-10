package com.kubi.resources.widget.round.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import cx.InterfaceC36553a;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class CornerConstraintLayout extends ConstraintLayout implements Checkable, InterfaceC36553a {

    /* JADX INFO: renamed from: n */
    public C23128a f45076n;

    public CornerConstraintLayout(Context context) {
        this(context, null);
    }

    public void setRadius(int i11) {
        int i12 = 0;
        while (true) {
            float[] fArr = this.f45076n.f45086a;
            if (i12 >= fArr.length) {
                invalidate();
                return;
            } else {
                fArr[i12] = i11;
                i12++;
            }
        }
    }

    public CornerConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setXfermode(null);
        paint.setAntiAlias(true);
        canvas.saveLayer(this.f45076n.f45096k, paint, 31);
        super.dispatchDraw(canvas);
        this.f45076n.m55457c(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (!this.f45076n.f45094i) {
            super.draw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.f45076n.f45087b);
        super.draw(canvas);
        canvas.restore();
    }

    public float getBottomLeftRadius() {
        return this.f45076n.f45086a[4];
    }

    public float getBottomRightRadius() {
        return this.f45076n.f45086a[6];
    }

    public int getStrokeColor() {
        return this.f45076n.f45091f;
    }

    public int getStrokeWidth() {
        return this.f45076n.f45093h;
    }

    public float getTopLeftRadius() {
        return this.f45076n.f45086a[0];
    }

    public float getTopRightRadius() {
        return this.f45076n.f45086a[2];
    }

    @Override // android.view.View
    public void invalidate() {
        C23128a c23128a = this.f45076n;
        if (c23128a != null) {
            c23128a.m55459e(this);
        }
        super.invalidate();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f45076n.f45097l;
    }

    public void setBottomLeftRadius(int i11) {
        float[] fArr = this.f45076n.f45086a;
        float f11 = i11;
        fArr[6] = f11;
        fArr[7] = f11;
        invalidate();
    }

    public void setBottomRightRadius(int i11) {
        float[] fArr = this.f45076n.f45086a;
        float f11 = i11;
        fArr[4] = f11;
        fArr[5] = f11;
        invalidate();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        C23128a c23128a = this.f45076n;
        if (c23128a.f45097l != z11) {
            c23128a.f45097l = z11;
            refreshDrawableState();
            this.f45076n.getClass();
        }
    }

    public void setClipBackground(boolean z11) {
        this.f45076n.f45094i = z11;
        invalidate();
    }

    public void setOnCheckedChangeListener(C23128a.a aVar) {
        this.f45076n.getClass();
    }

    public void setRoundAsCircle(boolean z11) {
        this.f45076n.f45089d = z11;
        invalidate();
    }

    @Override // cx.InterfaceC36553a
    public void setStrokeColor(int i11) {
        this.f45076n.f45091f = i11;
        invalidate();
    }

    public void setStrokeWidth(int i11) {
        this.f45076n.f45093h = i11;
        invalidate();
    }

    public void setTopLeftRadius(int i11) {
        float[] fArr = this.f45076n.f45086a;
        float f11 = i11;
        fArr[0] = f11;
        fArr[1] = f11;
        invalidate();
    }

    public void setTopRightRadius(int i11) {
        float[] fArr = this.f45076n.f45086a;
        float f11 = i11;
        fArr[2] = f11;
        fArr[3] = f11;
        invalidate();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f45076n.f45097l);
    }

    public CornerConstraintLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C23128a c23128a = new C23128a();
        this.f45076n = c23128a;
        c23128a.m55456b(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0 && !this.f45076n.f45095j.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        if (action != 0 && action != 1) {
            if (action == 3) {
                setPressed(false);
                refreshDrawableState();
            }
        } else {
            refreshDrawableState();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f45076n.m55455a(this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f45076n.m55458d(this, i11, i12);
    }
}
