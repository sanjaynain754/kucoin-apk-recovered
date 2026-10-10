package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class MarkerView extends GroupView {

    /* JADX INFO: renamed from: g */
    public SVGLength f13008g;

    /* JADX INFO: renamed from: h */
    public SVGLength f13009h;

    /* JADX INFO: renamed from: i */
    public SVGLength f13010i;

    /* JADX INFO: renamed from: j */
    public SVGLength f13011j;

    /* JADX INFO: renamed from: k */
    public String f13012k;

    /* JADX INFO: renamed from: l */
    public String f13013l;

    /* JADX INFO: renamed from: m */
    public float f13014m;

    /* JADX INFO: renamed from: n */
    public float f13015n;

    /* JADX INFO: renamed from: o */
    public float f13016o;

    /* JADX INFO: renamed from: p */
    public float f13017p;

    /* JADX INFO: renamed from: q */
    public String f13018q;

    /* JADX INFO: renamed from: r */
    public int f13019r;

    /* JADX INFO: renamed from: s */
    public Matrix f13020s;

    /* JADX INFO: renamed from: q */
    public void m14080q(Canvas canvas, Paint paint, float f11, C9242j c9242j, float f12) {
        int iSaveAndSetupCanvas = saveAndSetupCanvas(canvas, this.mCTM);
        this.f13020s.reset();
        C9240h c9240h = c9242j.f13252b;
        this.f13020s.setTranslate((float) c9240h.f13241a, (float) c9240h.f13242b);
        double d11 = "auto".equals(this.f13013l) ? -1.0d : Double.parseDouble(this.f13013l);
        if (d11 == -1.0d) {
            d11 = c9242j.f13253c;
        }
        this.f13020s.preRotate(((float) d11) + 180.0f);
        if ("strokeWidth".equals(this.f13012k)) {
            Matrix matrix = this.f13020s;
            float f13 = this.mScale;
            matrix.preScale(f12 / f13, f12 / f13);
        }
        RectF rectF = new RectF(0.0f, 0.0f, (float) (relativeOnWidth(this.f13010i) / ((double) this.mScale)), (float) (relativeOnHeight(this.f13011j) / ((double) this.mScale)));
        if (this.f13018q != null) {
            float f14 = this.f13014m;
            float f15 = this.mScale;
            float f16 = this.f13015n;
            Matrix matrixM14287a = C9251t.m14287a(new RectF(f14 * f15, f16 * f15, (f14 + this.f13016o) * f15, (f16 + this.f13017p) * f15), rectF, this.f13018q, this.f13019r);
            float[] fArr = new float[9];
            matrixM14287a.getValues(fArr);
            this.f13020s.preScale(fArr[0], fArr[4]);
        }
        this.f13020s.preTranslate((float) (-relativeOnWidth(this.f13008g)), (float) (-relativeOnHeight(this.f13009h)));
        canvas.concat(this.f13020s);
        mo14042f(canvas, paint, f11);
        restoreCanvas(canvas, iSaveAndSetupCanvas);
    }

    /* JADX INFO: renamed from: s */
    public void m14082s(String str) {
        this.f13012k = str;
        invalidate();
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineMarker(this, this.mName);
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
        }
    }

    public void setAlign(String str) {
        this.f13018q = str;
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f13019r = i11;
        invalidate();
    }

    public void setMinX(float f11) {
        this.f13014m = f11;
        invalidate();
    }

    public void setMinY(float f11) {
        this.f13015n = f11;
        invalidate();
    }

    public void setVbHeight(float f11) {
        this.f13017p = f11;
        invalidate();
    }

    public void setVbWidth(float f11) {
        this.f13016o = f11;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public void m14084u(String str) {
        this.f13013l = str;
        invalidate();
    }

    public MarkerView(ReactContext reactContext) {
        super(reactContext);
        this.f13020s = new Matrix();
    }

    /* JADX INFO: renamed from: r */
    public void m14081r(Dynamic dynamic) {
        this.f13011j = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public void m14083t(Dynamic dynamic) {
        this.f13010i = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public void m14085v(Dynamic dynamic) {
        this.f13008g = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public void m14086w(Dynamic dynamic) {
        this.f13009h = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
