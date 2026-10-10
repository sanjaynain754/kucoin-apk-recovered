package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class PatternView extends GroupView {

    /* JADX INFO: renamed from: t */
    public static final float[] f13030t = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: g */
    public SVGLength f13031g;

    /* JADX INFO: renamed from: h */
    public SVGLength f13032h;

    /* JADX INFO: renamed from: i */
    public SVGLength f13033i;

    /* JADX INFO: renamed from: j */
    public SVGLength f13034j;

    /* JADX INFO: renamed from: k */
    public Brush.BrushUnits f13035k;

    /* JADX INFO: renamed from: l */
    public Brush.BrushUnits f13036l;

    /* JADX INFO: renamed from: m */
    public float f13037m;

    /* JADX INFO: renamed from: n */
    public float f13038n;

    /* JADX INFO: renamed from: o */
    public float f13039o;

    /* JADX INFO: renamed from: p */
    public float f13040p;

    /* JADX INFO: renamed from: q */
    public String f13041q;

    /* JADX INFO: renamed from: r */
    public int f13042r;

    /* JADX INFO: renamed from: s */
    public Matrix f13043s;

    public RectF getViewBox() {
        float f11 = this.f13037m;
        float f12 = this.mScale;
        float f13 = this.f13038n;
        return new RectF(f11 * f12, f13 * f12, (f11 + this.f13039o) * f12, (f13 + this.f13040p) * f12);
    }

    /* JADX INFO: renamed from: r */
    public void m14099r(int i11) {
        if (i11 == 0) {
            this.f13036l = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f13036l = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public void m14100s(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f13030t;
            int iM14268c = C9241i.m14268c(readableArray, fArr, this.mScale);
            if (iM14268c == 6) {
                if (this.f13043s == null) {
                    this.f13043s = new Matrix();
                }
                this.f13043s.setValues(fArr);
            } else if (iM14268c != -1) {
                C45999a.m101488I(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f13043s = null;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            Brush brush = new Brush(Brush.BrushType.PATTERN, new SVGLength[]{this.f13031g, this.f13032h, this.f13033i, this.f13034j}, this.f13035k);
            brush.m13980d(this.f13036l);
            brush.m13983g(this);
            Matrix matrix = this.f13043s;
            if (matrix != null) {
                brush.m13982f(matrix);
            }
            SvgView svgView = getSvgView();
            Brush.BrushUnits brushUnits = this.f13035k;
            Brush.BrushUnits brushUnits2 = Brush.BrushUnits.USER_SPACE_ON_USE;
            if (brushUnits == brushUnits2 || this.f13036l == brushUnits2) {
                brush.m13984h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(brush, this.mName);
        }
    }

    public void setAlign(String str) {
        this.f13041q = str;
        invalidate();
    }

    public void setMeetOrSlice(int i11) {
        this.f13042r = i11;
        invalidate();
    }

    public void setMinX(float f11) {
        this.f13037m = f11;
        invalidate();
    }

    public void setMinY(float f11) {
        this.f13038n = f11;
        invalidate();
    }

    public void setVbHeight(float f11) {
        this.f13040p = f11;
        invalidate();
    }

    public void setVbWidth(float f11) {
        this.f13039o = f11;
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public void m14101t(int i11) {
        if (i11 == 0) {
            this.f13035k = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f13035k = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    public PatternView(ReactContext reactContext) {
        super(reactContext);
        this.f13043s = null;
    }

    /* JADX INFO: renamed from: q */
    public void m14098q(Dynamic dynamic) {
        this.f13034j = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public void m14102u(Dynamic dynamic) {
        this.f13033i = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: v */
    public void m14103v(Dynamic dynamic) {
        this.f13031g = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public void m14104w(Dynamic dynamic) {
        this.f13032h = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
