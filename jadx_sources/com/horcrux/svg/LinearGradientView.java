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
class LinearGradientView extends DefinitionView {

    /* JADX INFO: renamed from: i */
    public static final float[] f13000i = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public SVGLength f13001b;

    /* JADX INFO: renamed from: c */
    public SVGLength f13002c;

    /* JADX INFO: renamed from: d */
    public SVGLength f13003d;

    /* JADX INFO: renamed from: e */
    public SVGLength f13004e;

    /* JADX INFO: renamed from: f */
    public ReadableArray f13005f;

    /* JADX INFO: renamed from: g */
    public Brush.BrushUnits f13006g;

    /* JADX INFO: renamed from: h */
    public Matrix f13007h;

    /* JADX INFO: renamed from: f */
    public void m14073f(ReadableArray readableArray) {
        this.f13005f = readableArray;
        invalidate();
    }

    /* JADX INFO: renamed from: g */
    public void m14074g(ReadableArray readableArray) {
        if (readableArray != null) {
            float[] fArr = f13000i;
            int iM14268c = C9241i.m14268c(readableArray, fArr, this.mScale);
            if (iM14268c == 6) {
                if (this.f13007h == null) {
                    this.f13007h = new Matrix();
                }
                this.f13007h.setValues(fArr);
            } else if (iM14268c != -1) {
                C45999a.m101488I(ReactConstants.TAG, "RNSVG: Transform matrices must be of size 6");
            }
        } else {
            this.f13007h = null;
        }
        invalidate();
    }

    /* JADX INFO: renamed from: h */
    public void m14075h(int i11) {
        if (i11 == 0) {
            this.f13006g = Brush.BrushUnits.OBJECT_BOUNDING_BOX;
        } else if (i11 == 1) {
            this.f13006g = Brush.BrushUnits.USER_SPACE_ON_USE;
        }
        invalidate();
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            Brush brush = new Brush(Brush.BrushType.LINEAR_GRADIENT, new SVGLength[]{this.f13001b, this.f13002c, this.f13003d, this.f13004e}, this.f13006g);
            brush.m13981e(this.f13005f);
            Matrix matrix = this.f13007h;
            if (matrix != null) {
                brush.m13982f(matrix);
            }
            SvgView svgView = getSvgView();
            if (this.f13006g == Brush.BrushUnits.USER_SPACE_ON_USE) {
                brush.m13984h(svgView.getCanvasBounds());
            }
            svgView.defineBrush(brush, this.mName);
        }
    }

    public LinearGradientView(ReactContext reactContext) {
        super(reactContext);
        this.f13007h = null;
    }

    /* JADX INFO: renamed from: i */
    public void m14076i(Dynamic dynamic) {
        this.f13001b = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m14077j(Dynamic dynamic) {
        this.f13003d = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m14078k(Dynamic dynamic) {
        this.f13002c = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m14079l(Dynamic dynamic) {
        this.f13004e = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
