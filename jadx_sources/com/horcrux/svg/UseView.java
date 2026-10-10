package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import p747x3.C45999a;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class UseView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public String f13156b;

    /* JADX INFO: renamed from: c */
    public SVGLength f13157c;

    /* JADX INFO: renamed from: d */
    public SVGLength f13158d;

    /* JADX INFO: renamed from: e */
    public SVGLength f13159e;

    /* JADX INFO: renamed from: f */
    public SVGLength f13160f;

    /* JADX INFO: renamed from: g */
    public void m14203g(String str) {
        this.f13156b = str;
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f13156b);
        if (definedTemplate != null) {
            int iHitTest = definedTemplate.hitTest(fArr2);
            if (iHitTest != -1) {
                return (definedTemplate.isResponsible() || iHitTest != definedTemplate.getId()) ? iHitTest : getId();
            }
            return -1;
        }
        C45999a.m101488I(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f13156b + " is not defined.");
        return -1;
    }

    public UseView(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        Canvas canvas2;
        Paint paint2;
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f13156b);
        if (definedTemplate == null) {
            C45999a.m101488I(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f13156b + " is not defined.");
            return;
        }
        definedTemplate.clearCache();
        canvas.translate((float) relativeOnWidth(this.f13157c), (float) relativeOnHeight(this.f13158d));
        boolean z11 = definedTemplate instanceof RenderableView;
        if (z11) {
            ((RenderableView) definedTemplate).mergeProperties(this);
        }
        int iSaveAndSetupCanvas = definedTemplate.saveAndSetupCanvas(canvas, this.mCTM);
        clip(canvas, paint);
        if (definedTemplate instanceof SymbolView) {
            canvas2 = canvas;
            paint2 = paint;
            ((SymbolView) definedTemplate).m14154q(canvas2, paint2, f11, (float) relativeOnWidth(this.f13159e), (float) relativeOnHeight(this.f13160f));
        } else {
            canvas2 = canvas;
            paint2 = paint;
            definedTemplate.draw(canvas2, paint2, f11 * this.mOpacity);
        }
        RectF rectF = new RectF();
        getPath(canvas2, paint2).computeBounds(rectF, true);
        canvas2.getMatrix().mapRect(rectF);
        setClientRect(rectF);
        definedTemplate.restoreCanvas(canvas2, iSaveAndSetupCanvas);
        if (z11) {
            ((RenderableView) definedTemplate).resetProperties();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14202f(Dynamic dynamic) {
        this.f13160f = SVGLength.m14122b(dynamic);
        invalidate();
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        VirtualView definedTemplate = getSvgView().getDefinedTemplate(this.f13156b);
        if (definedTemplate == null) {
            C45999a.m101488I(ReactConstants.TAG, "`Use` element expected a pre-defined svg template as `href` prop, template named: " + this.f13156b + " is not defined.");
            return null;
        }
        Path path = definedTemplate.getPath(canvas, paint);
        Path path2 = new Path();
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) relativeOnWidth(this.f13157c), (float) relativeOnHeight(this.f13158d));
        path.transform(matrix, path2);
        return path2;
    }

    /* JADX INFO: renamed from: h */
    public void m14204h(Dynamic dynamic) {
        this.f13159e = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: i */
    public void m14205i(Dynamic dynamic) {
        this.f13157c = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public void m14206j(Dynamic dynamic) {
        this.f13158d = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
