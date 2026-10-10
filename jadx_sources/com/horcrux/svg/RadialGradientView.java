package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.ReactConstants;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class RadialGradientView extends DefinitionView {

    /* JADX INFO: renamed from: k */
    public static final float[] f13045k = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public SVGLength f13046b;

    /* JADX INFO: renamed from: c */
    public SVGLength f13047c;

    /* JADX INFO: renamed from: d */
    public SVGLength f13048d;

    /* JADX INFO: renamed from: e */
    public SVGLength f13049e;

    /* JADX INFO: renamed from: f */
    public SVGLength f13050f;

    /* JADX INFO: renamed from: g */
    public SVGLength f13051g;

    /* JADX INFO: renamed from: h */
    public ReadableArray f13052h;

    /* JADX INFO: renamed from: i */
    public Brush.BrushUnits f13053i;

    /* JADX INFO: renamed from: j */
    public Matrix f13054j;

    /* JADX INFO: renamed from: j */
    public void m14110j(ReadableArray readableArray) {
        this.f13052h = readableArray;
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m14111k(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f13045k;
            int iM14268c = C9241i.m14268c(readableArray, fArr, this.mScale);
            if (iM14268c == 6) {
                if (this.f13054j == null) {
                    this.f13054j = new Matrix();
                }
                this.f13054j.setValues(fArr);
            } else if (iM14268c != -1) {
                C45999a.m101488I(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f13054j = null;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m14112l(int i11) {
        if (i11 == 0) {
            this.f13053i = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f13053i = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            Brush brush = new Brush(Brush.BrushType.RADIAL_GRADIENT, new SVGLength[]{this.f13046b, this.f13047c, this.f13048d, this.f13049e, this.f13050f, this.f13051g}, this.f13053i);
            brush.m13981e(this.f13052h);
            Matrix matrix = this.f13054j;
            if (matrix != null) {
                brush.m13982f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f13053i == Brush.BrushUnits.USER_SPACE_ON_USE) {
                brush.m13984h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(brush, this.mName);
        }
    }

    public RadialGradientView(ReactContext reactContext) {
        super(reactContext);
        this.f13054j = null;
    }

    /* JADX INFO: renamed from: f */
    public void m14106f(Dynamic dynamic) {
        this.f13050f = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m14107g(Dynamic dynamic) {
        this.f13051g = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m14108h(Dynamic dynamic) {
        this.f13046b = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m14109i(Dynamic dynamic) {
        this.f13047c = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public void m14113m(Dynamic dynamic) {
        this.f13048d = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public void m14114n(Dynamic dynamic) {
        this.f13049e = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
