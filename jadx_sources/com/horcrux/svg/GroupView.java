package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
class GroupView extends RenderableView {

    /* JADX INFO: renamed from: b */
    public ReadableMap f12980b;

    /* JADX INFO: renamed from: c */
    public C9236d f12981c;

    /* JADX INFO: renamed from: d */
    public Bitmap f12982d;

    /* JADX INFO: renamed from: e */
    public Canvas f12983e;

    /* JADX INFO: renamed from: f */
    public final Paint f12984f;

    @Override // com.horcrux.svg.RenderableView
    public void resetProperties() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof RenderableView) {
                ((RenderableView) childAt).resetProperties();
            }
        }
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = this.mPath;
        if (path != null) {
            return path;
        }
        this.mPath = new Path();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof MaskView) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                this.mPath.addPath(virtualView.getPath(canvas, paint), virtualView.mMatrix);
            }
        }
        return this.mPath;
    }

    /* JADX INFO: renamed from: h */
    public C9236d m14049h() {
        return this.f12981c;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        int iReactTagForTouch;
        VirtualView virtualView;
        int iHitTest;
        if (!this.mInvertible) {
            return -1;
        }
        float[] fArr2 = new float[2];
        this.mInvMatrix.mapPoints(fArr2, fArr);
        this.mInvTransform.mapPoints(fArr2);
        int iRound = Math.round(fArr2[0]);
        int iRound2 = Math.round(fArr2[1]);
        Path clipPath = getClipPath();
        if (clipPath != null) {
            if (this.mClipRegionPath != clipPath) {
                this.mClipRegionPath = clipPath;
                RectF rectF = new RectF();
                this.mClipBounds = rectF;
                clipPath.computeBounds(rectF, true);
                this.mClipRegion = getRegion(clipPath, this.mClipBounds);
            }
            if (!this.mClipRegion.contains(iRound, iRound2)) {
                return -1;
            }
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                if (!(childAt instanceof MaskView) && (iHitTest = (virtualView = (VirtualView) childAt).hitTest(fArr2)) != -1) {
                    return (virtualView.isResponsible() || iHitTest != childAt.getId()) ? iHitTest : getId();
                }
            } else if ((childAt instanceof SvgView) && (iReactTagForTouch = ((SvgView) childAt).reactTagForTouch(fArr2[0], fArr2[1])) != childAt.getId()) {
                return iReactTagForTouch;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: i */
    public Path mo14050i(Canvas canvas, Paint paint, Region.Op op2) {
        Path path = new Path();
        Path.Op opValueOf = Path.Op.valueOf(op2.name());
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt instanceof MaskView) && (childAt instanceof VirtualView)) {
                VirtualView virtualView = (VirtualView) childAt;
                Matrix matrix = virtualView.mMatrix;
                Path pathMo14050i = virtualView instanceof GroupView ? ((GroupView) virtualView).mo14050i(canvas, paint, op2) : virtualView.getPath(canvas, paint);
                pathMo14050i.transform(matrix);
                path.op(pathMo14050i, opValueOf);
            }
        }
        return path;
    }

    /* JADX INFO: renamed from: o */
    public void m14055o(ReadableMap readableMap) {
        this.f12980b = readableMap;
        invalidate();
    }

    /* JADX INFO: renamed from: p */
    public void m14056p(Canvas canvas) {
        RectF rectF = new RectF(canvas.getClipBounds());
        Matrix matrix = this.mMatrix;
        if (matrix != null) {
            matrix.mapRect(rectF);
        }
        this.f12981c = new C9236d(this.mScale, rectF.width(), rectF.height());
    }

    @Override // com.horcrux.svg.VirtualView
    public void saveDefinition() {
        if (this.mName != null) {
            getSvgView().defineTemplate(this, this.mName);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof VirtualView) {
                ((VirtualView) childAt).saveDefinition();
            }
        }
    }

    public GroupView(ReactContext reactContext) {
        super(reactContext);
        this.f12984f = new Paint(1);
    }

    /* JADX INFO: renamed from: m */
    public static <T> T m14047m(T t11) {
        t11.getClass();
        return t11;
    }

    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        m14056p(canvas);
        clip(canvas, paint);
        mo14042f(canvas, paint, f11);
        renderMarkers(canvas, paint, f11);
    }

    /* JADX INFO: renamed from: f */
    public void mo14042f(Canvas canvas, Paint paint, float f11) {
        mo14053l();
        SvgView svgView = getSvgView();
        RectF rectF = new RectF();
        if (this.mOpacity != 1.0f) {
            Bitmap bitmap = this.f12982d;
            if (bitmap == null) {
                this.f12982d = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f12983e = new Canvas(this.f12982d);
            } else {
                bitmap.recycle();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                this.f12982d = bitmapCreateBitmap;
                this.f12983e.setBitmap(bitmapCreateBitmap);
            }
            this.f12983e.save();
            this.f12983e.setMatrix(canvas.getMatrix());
        } else {
            this.f12983e = canvas;
        }
        this.elements = new ArrayList<>();
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
                        int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(this.f12983e, this.mCTM);
                        virtualView.render(this.f12983e, paint, f11);
                        RectF clientRect = virtualView.getClientRect();
                        if (clientRect != null) {
                            rectF.union(clientRect);
                        }
                        virtualView.restoreCanvas(this.f12983e, iSaveAndSetupCanvas);
                        if (z11) {
                            ((RenderableView) virtualView).resetProperties();
                        }
                        if (virtualView.isResponsible()) {
                            svgView.enableTouchEvents();
                        }
                        ArrayList<C9238f> arrayList = virtualView.elements;
                        if (arrayList != null) {
                            this.elements.addAll(arrayList);
                        }
                    }
                } else if (childAt instanceof SvgView) {
                    SvgView svgView2 = (SvgView) childAt;
                    svgView2.drawChildren(canvas);
                    if (svgView2.isResponsible()) {
                        svgView.enableTouchEvents();
                    }
                }
            }
        }
        if (this.mOpacity != 1.0f) {
            this.f12983e.restore();
            int iSave = canvas.save();
            canvas.setMatrix(null);
            this.f12984f.setAlpha((int) (this.mOpacity * 255.0f));
            canvas.drawBitmap(this.f12982d, 0.0f, 0.0f, this.f12984f);
            canvas.restoreToCount(iSave);
        }
        setClientRect(rectF);
        mo14052k();
    }

    /* JADX INFO: renamed from: g */
    public void m14048g(Canvas canvas, Paint paint, float f11) {
        super.draw(canvas, paint, f11);
    }

    /* JADX INFO: renamed from: j */
    public C9236d m14051j() {
        return ((GroupView) m14047m(getTextRoot())).m14049h();
    }

    /* JADX INFO: renamed from: k */
    public void mo14052k() {
        m14051j().m14229n();
    }

    /* JADX INFO: renamed from: l */
    public void mo14053l() {
        m14051j().m14230o(this, this.f12980b);
    }

    /* JADX INFO: renamed from: n */
    public void m14054n(Dynamic dynamic) {
        if (dynamic.getType() == ReadableType.Map) {
            this.f12980b = dynamic.asMap();
        } else {
            this.f12980b = null;
        }
        invalidate();
    }
}
