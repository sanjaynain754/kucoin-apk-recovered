package com.tencent.ugc.renderer;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.rtmp.p148ui.TXCloudVideoView;

/* JADX INFO: loaded from: classes2.dex */
public class SurfaceViewRenderHelper extends RenderViewHelperInterface {
    private final Size mFrameSize;
    private boolean mIsHDR;
    private final Size mLastViewSize;
    private final RenderViewHelperInterface.RenderViewListener mListener;
    private final View.OnLayoutChangeListener mOnLayoutChangeListener;
    private GLConstants.GLScaleType mScaleType;
    private SurfaceView mSurfaceView;
    private final SurfaceHolder.Callback mSurfaceViewListener;
    private final String mTAG;
    private final CustomHandler mUIHandler;

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public boolean isUsingTextureView() {
        return false;
    }

    public static /* synthetic */ void lambda$checkViewAvailability$2(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        SurfaceView surfaceView = surfaceViewRenderHelper.mSurfaceView;
        if (surfaceView == null) {
            LiteavLog.m76087i(surfaceViewRenderHelper.mTAG, "view is not available when surfaceView is null");
            return;
        }
        Surface surface = surfaceView.getHolder().getSurface();
        boolean z11 = surface != null && surface.isValid();
        if (!z11 || surfaceViewRenderHelper.mSurfaceView.getWidth() == 0 || surfaceViewRenderHelper.mSurfaceView.getHeight() == 0 || !surfaceViewRenderHelper.mSurfaceView.isShown()) {
            String str = surfaceViewRenderHelper.mTAG;
            SurfaceView surfaceView2 = surfaceViewRenderHelper.mSurfaceView;
            LiteavLog.m76088i(str, "%s is not available when isShown:%b, surface isValid:%b", surfaceView2, Boolean.valueOf(surfaceView2.isShown()), Boolean.valueOf(z11));
        }
    }

    public static /* synthetic */ void lambda$release$1(SurfaceViewRenderHelper surfaceViewRenderHelper) {
        LiteavLog.m76087i(surfaceViewRenderHelper.mTAG, "release,mSurfaceView=" + surfaceViewRenderHelper.mSurfaceView);
        if (surfaceViewRenderHelper.mSurfaceView == null) {
            return;
        }
        surfaceViewRenderHelper.notifySurfaceDestroy();
        surfaceViewRenderHelper.mSurfaceView.getHolder().removeCallback(surfaceViewRenderHelper.mSurfaceViewListener);
        surfaceViewRenderHelper.mSurfaceView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySurfaceChanged(Surface surface) {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySurfaceDestroy() {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.mListener;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    public void updateViewLayoutForHDR() {
        double d11;
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView == null || !(surfaceView.getParent() instanceof TXCloudVideoView)) {
            return;
        }
        TXCloudVideoView tXCloudVideoView = (TXCloudVideoView) this.mSurfaceView.getParent();
        Size size = new Size(tXCloudVideoView.getWidth(), tXCloudVideoView.getHeight());
        if (this.mFrameSize.isValid() && size.isValid()) {
            if (!this.mLastViewSize.isValid()) {
                tXCloudVideoView.addOnLayoutChangeListener(this.mOnLayoutChangeListener);
            }
            this.mLastViewSize.set(size);
            double dAspectRatio = size.aspectRatio();
            double dAspectRatio2 = this.mFrameSize.aspectRatio();
            double d12 = 1.0d;
            if (dAspectRatio2 < dAspectRatio) {
                GLConstants.GLScaleType gLScaleType = this.mScaleType;
                if (gLScaleType == GLConstants.GLScaleType.FIT_CENTER) {
                    double d13 = dAspectRatio2 / dAspectRatio;
                    d11 = 1.0d;
                    d12 = d13;
                } else if (gLScaleType == GLConstants.GLScaleType.CENTER_CROP) {
                    d11 = dAspectRatio / dAspectRatio2;
                } else {
                    d11 = 1.0d;
                }
            } else {
                GLConstants.GLScaleType gLScaleType2 = this.mScaleType;
                if (gLScaleType2 == GLConstants.GLScaleType.FIT_CENTER) {
                    d11 = dAspectRatio / dAspectRatio2;
                } else if (gLScaleType2 == GLConstants.GLScaleType.CENTER_CROP) {
                    double d14 = dAspectRatio2 / dAspectRatio;
                    d11 = 1.0d;
                    d12 = d14;
                } else {
                    d11 = 1.0d;
                }
            }
            ViewGroup.LayoutParams layoutParams = this.mSurfaceView.getLayoutParams();
            layoutParams.width = (int) (((double) size.getWidth()) * d12);
            layoutParams.height = (int) (((double) size.getHeight()) * d11);
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            this.mSurfaceView.setLayoutParams(layoutParams);
            LiteavLog.m76088i(this.mTAG, "adjust view size to %d*%d", Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
        }
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void checkViewAvailability() {
        this.mUIHandler.post(RunnableC35782f.m79269a(this));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public Matrix getTransformMatrix(int i11, int i12) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void release(boolean z11) {
        this.mUIHandler.post(RunnableC35781e.m79268a(this));
    }

    @Override // com.tencent.ugc.renderer.RenderViewHelperInterface
    public void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i11, int i12, boolean z11) {
        if (this.mScaleType == gLScaleType && this.mIsHDR == z11) {
            Size size = this.mFrameSize;
            if (size.width == i11 && size.height == i12) {
                return;
            }
        }
        this.mIsHDR = z11;
        this.mScaleType = gLScaleType;
        this.mFrameSize.set(i11, i12);
        if (this.mIsHDR) {
            this.mUIHandler.runOrPost(RunnableC35783g.m79270a(this));
        }
    }

    public SurfaceViewRenderHelper(SurfaceView surfaceView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        String str = "SurfaceViewRenderHelper_" + hashCode();
        this.mTAG = str;
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.mUIHandler = customHandler;
        this.mFrameSize = new Size();
        this.mLastViewSize = new Size();
        this.mScaleType = null;
        this.mIsHDR = false;
        this.mSurfaceViewListener = new SurfaceHolder.Callback() { // from class: com.tencent.ugc.renderer.SurfaceViewRenderHelper.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
                if (surfaceHolder != null) {
                    LiteavLog.m76088i(SurfaceViewRenderHelper.this.mTAG, "surfaceChanged,format=%d,Size(%dx%d)", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
                    SurfaceViewRenderHelper.this.notifySurfaceChanged(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (surfaceHolder != null) {
                    Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                    LiteavLog.m76088i(SurfaceViewRenderHelper.this.mTAG, "surfaceCreated,Size(%dx%d)", Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
                    SurfaceViewRenderHelper.this.notifySurfaceChanged(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                LiteavLog.m76087i(SurfaceViewRenderHelper.this.mTAG, "surfaceDestroyed");
                SurfaceViewRenderHelper.this.notifySurfaceDestroy();
            }
        };
        this.mOnLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.tencent.ugc.renderer.SurfaceViewRenderHelper.2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                if (SurfaceViewRenderHelper.this.mIsHDR) {
                    if (SurfaceViewRenderHelper.this.mLastViewSize.width == view.getWidth() && SurfaceViewRenderHelper.this.mLastViewSize.height == view.getHeight()) {
                        return;
                    }
                    SurfaceViewRenderHelper.this.updateViewLayoutForHDR();
                }
            }
        };
        this.mListener = renderViewListener;
        if (surfaceView == null) {
            LiteavLog.m76093w(str, "surfaceView is null.");
        } else {
            this.mSurfaceView = surfaceView;
            customHandler.post(RunnableC35780d.m79267a(this, surfaceView));
        }
    }

    public static /* synthetic */ void lambda$new$0(SurfaceViewRenderHelper surfaceViewRenderHelper, SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface().isValid()) {
            Surface surface = holder.getSurface();
            Rect surfaceFrame = holder.getSurfaceFrame();
            LiteavLog.m76088i(surfaceViewRenderHelper.mTAG, "construct,surface=%s,Size(%dx%d)", surface, Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
            surfaceViewRenderHelper.notifySurfaceChanged(surface);
        } else {
            LiteavLog.m76087i(surfaceViewRenderHelper.mTAG, "construct,surfaceView not valid.");
        }
        holder.addCallback(surfaceViewRenderHelper.mSurfaceViewListener);
    }
}
