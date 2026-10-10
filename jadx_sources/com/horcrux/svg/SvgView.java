package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.Base64;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.views.view.ReactViewGroup;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
@SuppressLint({"ViewConstructor"})
public class SvgView extends ReactViewGroup implements ReactCompoundView, ReactCompoundViewGroup {
    private String mAlign;
    private Bitmap mBitmap;
    private Canvas mCanvas;
    private Bitmap mCurrentBitmap;
    int mCurrentColor;
    private final Map<String, Brush> mDefinedBrushes;
    private final Map<String, VirtualView> mDefinedClipPaths;
    private final Map<String, VirtualView> mDefinedFilters;
    private final Map<String, VirtualView> mDefinedMarkers;
    private final Map<String, VirtualView> mDefinedMasks;
    private final Map<String, VirtualView> mDefinedTemplates;
    final Matrix mInvViewBoxMatrix;
    private boolean mInvertible;
    private int mMeetOrSlice;
    private float mMinX;
    private float mMinY;
    private final Paint mPaint;
    private boolean mRemovalTransitionStarted;
    private boolean mRendered;
    private boolean mResponsible;
    private final float mScale;
    private float mVbHeight;
    private float mVbWidth;
    private SVGLength mbbHeight;
    private SVGLength mbbWidth;
    private Runnable toDataUrlTask;

    public enum Events {
        EVENT_DATA_URL("onDataURL");

        private final String mName;

        @Override // java.lang.Enum
        public String toString() {
            return this.mName;
        }

        Events(String str) {
            this.mName = str;
        }
    }

    private Bitmap drawOutput() {
        this.mRendered = true;
        float width = getWidth();
        float height = getHeight();
        if (Float.isNaN(width) || Float.isNaN(height) || width < 1.0f || height < 1.0f || Math.log10(width) + Math.log10(height) > 42.0d) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) width, (int) height, Bitmap.Config.ARGB_8888);
        this.mCurrentBitmap = bitmapCreateBitmap;
        drawChildren(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    private int hitTest(float f11, float f12) {
        if (!this.mResponsible || !this.mInvertible) {
            return getId();
        }
        float[] fArr = {f11, f12};
        this.mInvViewBoxMatrix.mapPoints(fArr);
        int iHitTest = -1;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt instanceof VirtualView) {
                iHitTest = ((VirtualView) childAt).hitTest(fArr);
            } else if (childAt instanceof SvgView) {
                iHitTest = ((SvgView) childAt).hitTest(f11, f12);
            }
            if (iHitTest != -1) {
                break;
            }
        }
        return iHitTest == -1 ? getId() : iHitTest;
    }

    public synchronized void drawChildren(Canvas canvas) {
        try {
            this.mRendered = true;
            this.mCanvas = canvas;
            Matrix matrix = new Matrix();
            if (this.mAlign != null) {
                RectF viewBox = getViewBox();
                float width = canvas.getWidth();
                float height = canvas.getHeight();
                boolean z11 = getParent() instanceof VirtualView;
                if (z11) {
                    width = (float) C9241i.m14266a(this.mbbWidth, width, 0.0d, this.mScale, 12.0d);
                    height = (float) C9241i.m14266a(this.mbbHeight, height, 0.0d, this.mScale, 12.0d);
                }
                RectF rectF = new RectF(0.0f, 0.0f, width, height);
                if (z11) {
                    canvas.clipRect(rectF);
                }
                matrix = C9251t.m14287a(viewBox, rectF, this.mAlign, this.mMeetOrSlice);
                this.mInvertible = matrix.invert(this.mInvViewBoxMatrix);
                canvas.concat(matrix);
            }
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).saveDefinition();
                }
            }
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt2 = getChildAt(i12);
                if (childAt2 instanceof VirtualView) {
                    VirtualView virtualView = (VirtualView) childAt2;
                    int iSaveAndSetupCanvas = virtualView.saveAndSetupCanvas(canvas, matrix);
                    virtualView.render(canvas, this.mPaint, 1.0f);
                    virtualView.restoreCanvas(canvas, iSaveAndSetupCanvas);
                    if (virtualView.isResponsible() && !this.mResponsible) {
                        this.mResponsible = true;
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.facebook.react.uimanager.ReactCompoundViewGroup
    public boolean interceptsTouchEvent(float f11, float f12) {
        return true;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        this.mRemovalTransitionStarted = true;
    }

    public String toDataURL() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(bitmapCreateBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private void clearChildCache() {
        if (this.mRendered) {
            this.mRendered = false;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt instanceof VirtualView) {
                    ((VirtualView) childAt).clearChildCache();
                }
            }
        }
    }

    private RectF getViewBox() {
        float f11 = this.mMinX;
        float f12 = this.mScale;
        float f13 = this.mMinY;
        return new RectF(f11 * f12, f13 * f12, (f11 + this.mVbWidth) * f12, (f13 + this.mVbHeight) * f12);
    }

    public void defineBrush(Brush brush, String str) {
        this.mDefinedBrushes.put(str, brush);
    }

    public void defineClipPath(VirtualView virtualView, String str) {
        this.mDefinedClipPaths.put(str, virtualView);
    }

    public void defineFilter(VirtualView virtualView, String str) {
        this.mDefinedFilters.put(str, virtualView);
    }

    public void defineMarker(VirtualView virtualView, String str) {
        this.mDefinedMarkers.put(str, virtualView);
    }

    public void defineMask(VirtualView virtualView, String str) {
        this.mDefinedMasks.put(str, virtualView);
    }

    public void defineTemplate(VirtualView virtualView, String str) {
        this.mDefinedTemplates.put(str, virtualView);
    }

    public void enableTouchEvents() {
        if (this.mResponsible) {
            return;
        }
        this.mResponsible = true;
    }

    public Rect getCanvasBounds() {
        return this.mCanvas.getClipBounds();
    }

    public float getCanvasHeight() {
        return this.mCanvas.getHeight();
    }

    public float getCanvasWidth() {
        return this.mCanvas.getWidth();
    }

    public Matrix getCtm() {
        return this.mCanvas.getMatrix();
    }

    public Bitmap getCurrentBitmap() {
        return this.mCurrentBitmap;
    }

    public Brush getDefinedBrush(String str) {
        return this.mDefinedBrushes.get(str);
    }

    public VirtualView getDefinedClipPath(String str) {
        return this.mDefinedClipPaths.get(str);
    }

    public VirtualView getDefinedFilter(String str) {
        return this.mDefinedFilters.get(str);
    }

    public VirtualView getDefinedMarker(String str) {
        return this.mDefinedMarkers.get(str);
    }

    public VirtualView getDefinedMask(String str) {
        return this.mDefinedMasks.get(str);
    }

    public VirtualView getDefinedTemplate(String str) {
        return this.mDefinedTemplates.get(str);
    }

    public boolean isResponsible() {
        return this.mResponsible;
    }

    public boolean notRendered() {
        return !this.mRendered;
    }

    public void setAlign(String str) {
        this.mAlign = str;
        invalidate();
        clearChildCache();
    }

    public void setCurrentColor(Integer num) {
        this.mCurrentColor = num != null ? num.intValue() : 0;
        invalidate();
        clearChildCache();
    }

    public void setMeetOrSlice(int i11) {
        this.mMeetOrSlice = i11;
        invalidate();
        clearChildCache();
    }

    public void setMinX(float f11) {
        this.mMinX = f11;
        invalidate();
        clearChildCache();
    }

    public void setMinY(float f11) {
        this.mMinY = f11;
        invalidate();
        clearChildCache();
    }

    public void setToDataUrlTask(Runnable runnable) {
        this.toDataUrlTask = runnable;
    }

    public void setVbHeight(float f11) {
        this.mVbHeight = f11;
        invalidate();
        clearChildCache();
    }

    public void setVbWidth(float f11) {
        this.mVbWidth = f11;
        invalidate();
        clearChildCache();
    }

    public SvgView(ReactContext reactContext) {
        super(reactContext);
        this.toDataUrlTask = null;
        this.mResponsible = false;
        this.mDefinedClipPaths = new HashMap();
        this.mDefinedTemplates = new HashMap();
        this.mDefinedMarkers = new HashMap();
        this.mDefinedMasks = new HashMap();
        this.mDefinedFilters = new HashMap();
        this.mDefinedBrushes = new HashMap();
        Paint paint = new Paint();
        this.mPaint = paint;
        this.mInvViewBoxMatrix = new Matrix();
        this.mInvertible = true;
        this.mRendered = false;
        this.mCurrentColor = ViewCompat.MEASURED_STATE_MASK;
        this.mScale = DisplayMetricsHolder.getScreenDisplayMetrics().density;
        paint.setFlags(385);
        paint.setTypeface(Typeface.DEFAULT);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        ViewParent parent = getParent();
        if (parent instanceof VirtualView) {
            if (this.mRendered) {
                this.mRendered = false;
                ((VirtualView) parent).getSvgView().invalidate();
                return;
            }
            return;
        }
        if (!this.mRemovalTransitionStarted) {
            Bitmap bitmap = this.mBitmap;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mBitmap = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.mBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mBitmap = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (!(getParent() instanceof VirtualView)) {
            super.onDraw(canvas);
            if (this.mBitmap == null) {
                this.mBitmap = drawOutput();
            }
            if (this.mBitmap != null) {
                this.mPaint.reset();
                this.mPaint.setFlags(387);
                this.mPaint.setTypeface(Typeface.DEFAULT);
                canvas.drawBitmap(this.mBitmap, 0.0f, 0.0f, this.mPaint);
                Runnable runnable = this.toDataUrlTask;
                if (runnable != null) {
                    runnable.run();
                    this.toDataUrlTask = null;
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(getGlobalVisibleRect(new Rect()));
        accessibilityNodeInfo.setClassName(getClass().getCanonicalName());
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        invalidate();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float f11, float f12) {
        return hitTest(f11, f12);
    }

    public void setBbHeight(Dynamic dynamic) {
        this.mbbHeight = SVGLength.m14122b(dynamic);
        invalidate();
        clearChildCache();
    }

    public void setBbWidth(Dynamic dynamic) {
        this.mbbWidth = SVGLength.m14122b(dynamic);
        invalidate();
        clearChildCache();
    }

    @Override // android.view.View
    public void setId(int i11) {
        super.setId(i11);
        SvgViewManager.setSvgView(i11, this);
    }

    public String toDataURL(int i11, int i12) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        clearChildCache();
        drawChildren(new Canvas(bitmapCreateBitmap));
        clearChildCache();
        invalidate();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }
}
