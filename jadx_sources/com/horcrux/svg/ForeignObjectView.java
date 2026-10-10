package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class ForeignObjectView extends GroupView {

    /* JADX INFO: renamed from: g */
    public SVGLength f12974g;

    /* JADX INFO: renamed from: h */
    public SVGLength f12975h;

    /* JADX INFO: renamed from: i */
    public SVGLength f12976i;

    /* JADX INFO: renamed from: j */
    public SVGLength f12977j;

    /* JADX INFO: renamed from: k */
    public Bitmap f12978k;

    /* JADX INFO: renamed from: l */
    public Canvas f12979l;

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(this.f12979l);
    }

    @Override // com.horcrux.svg.GroupView, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        float fRelativeOnWidth = (float) relativeOnWidth(this.f12974g);
        float fRelativeOnHeight = (float) relativeOnHeight(this.f12975h);
        float fRelativeOnWidth2 = (float) relativeOnWidth(this.f12976i);
        float fRelativeOnHeight2 = (float) relativeOnHeight(this.f12977j);
        canvas.translate(fRelativeOnWidth, fRelativeOnHeight);
        canvas.clipRect(0.0f, 0.0f, fRelativeOnWidth2, fRelativeOnHeight2);
        super.draw(canvas, paint, f11);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(this.f12979l, view, j11);
    }

    public ForeignObjectView(ReactContext reactContext) {
        super(reactContext);
        this.f12978k = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        this.f12979l = new Canvas(this.f12978k);
    }

    @Override // com.horcrux.svg.GroupView
    /* JADX INFO: renamed from: f */
    public void mo14042f(Canvas canvas, Paint paint, float f11) {
        mo14053l();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof MaskView)) {
                if (childAt instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt;
                    if (!"none".equals(virtualView.mDisplay)) {
                        boolean z11 = virtualView instanceof RenderableView;
                        if (z11) {
                            ((RenderableView) virtualView).mergeProperties(this);
                        }
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, this.mCTM);
                        virtualView.render(canvas, paint, this.mOpacity * f11);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                        if (z11) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                } else {
                    childAt.draw(canvas);
                }
            }
        }
        setClientRect(rectF);
        mo14052k();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(@NonNull View view, @NonNull View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
    }

    /* JADX INFO: renamed from: q */
    public void m14043q(Dynamic dynamic) {
        this.f12977j = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: r */
    public void m14044r(Dynamic dynamic) {
        this.f12976i = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: s */
    public void m14045s(Dynamic dynamic) {
        this.f12974g = SVGLength.m14122b(dynamic);
        invalidate();
    }

    /* JADX INFO: renamed from: t */
    public void m14046t(Dynamic dynamic) {
        this.f12975h = SVGLength.m14122b(dynamic);
        invalidate();
    }
}
