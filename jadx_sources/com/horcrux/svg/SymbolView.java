package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class SymbolView extends GroupView {

    /* JADX INFO: renamed from: g */
    public float f13110g;

    /* JADX INFO: renamed from: h */
    public float f13111h;

    /* JADX INFO: renamed from: i */
    public float f13112i;

    /* JADX INFO: renamed from: j */
    public float f13113j;

    /* JADX INFO: renamed from: k */
    public String f13114k;

    /* JADX INFO: renamed from: l */
    public int f13115l;

    /* JADX INFO: renamed from: q */
    public void m14154q(Canvas canvas, Paint paint, float f11, float f12, float f13) {
        if (this.f13114k != null) {
            float f14 = this.f13110g;
            float f15 = this.mScale;
            float f16 = this.f13111h;
            canvas.concat(C9251t.m14287a(new RectF(f14 * f15, f16 * f15, (f14 + this.f13112i) * f15, (f16 + this.f13113j) * f15), new RectF(0.0f, 0.0f, f12, f13), this.f13114k, this.f13115l));
            super.draw(canvas, paint, f11);
        }
    }

    public void setAlign(String str) {
        this.f13114k = str;
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f13115l = i11;
        invalidate();
    }

    public void setMinX(float f11) {
        this.f13110g = f11;
        invalidate();
    }

    public void setMinY(float f11) {
        this.f13111h = f11;
        invalidate();
    }

    public void setVbHeight(float f11) {
        this.f13113j = f11;
        invalidate();
    }

    public void setVbWidth(float f11) {
        this.f13112i = f11;
        invalidate();
    }

    public SymbolView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        saveDefinition();
    }
}
