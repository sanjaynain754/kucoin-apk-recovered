package com.tencent.ugc.renderer;

import android.graphics.Matrix;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: loaded from: classes2.dex */
public class SurfaceRenderHelper extends RenderViewHelperInterface {
    private final RenderViewHelperInterface.RenderViewListener mListener;
    private Surface mSurface;
    private final String mTAG;
    private final CustomHandler mUIHandler;

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public boolean isUsingTextureView() {
        return false;
    }

    public static /* synthetic */ void lambda$checkViewAvailability$2(SurfaceRenderHelper surfaceRenderHelper) {
        Surface surface = surfaceRenderHelper.mSurface;
        if (surface == null) {
            LiteavLog.m76087i(surfaceRenderHelper.mTAG, "view is not available when surface is null");
        } else {
            if (surface.isValid()) {
                return;
            }
            LiteavLog.m76088i(surfaceRenderHelper.mTAG, "view is not available when %s is not valid", surfaceRenderHelper.mSurface);
        }
    }

    public static /* synthetic */ void lambda$new$0(SurfaceRenderHelper surfaceRenderHelper, Surface surface) {
        LiteavLog.m76087i(surfaceRenderHelper.mTAG, "construct,surface=".concat(String.valueOf(surface)));
        RenderViewHelperInterface.RenderViewListener renderViewListener = surfaceRenderHelper.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    public static /* synthetic */ void lambda$release$1(SurfaceRenderHelper surfaceRenderHelper) {
        LiteavLog.m76087i(surfaceRenderHelper.mTAG, "release,mSurface=" + surfaceRenderHelper.mSurface);
        if (surfaceRenderHelper.mSurface == null) {
            return;
        }
        RenderViewHelperInterface.RenderViewListener renderViewListener = surfaceRenderHelper.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
        surfaceRenderHelper.mSurface = null;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void checkViewAvailability() {
        this.mUIHandler.post(RunnableC35779c.m79266a(this));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public Matrix getTransformMatrix(int i11, int i12) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void release(boolean z11) {
        this.mUIHandler.post(RunnableC35778b.m79265a(this));
    }

    public SurfaceRenderHelper(Surface surface, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "SurfaceRenderHelper_" + hashCode();
        this.mTAG = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.mUIHandler = customHandler;
        this.mListener = renderViewListener;
        if (surface == null) {
            LiteavLog.m76093w(str, "surface is null.");
        } else {
            this.mSurface = surface;
            customHandler.post(RunnableC35774a.m79261a(this, surface));
        }
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i11, int i12, boolean z11) {
    }
}
