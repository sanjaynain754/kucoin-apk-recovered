package com.tencent.liteav.videoconsumer.renderer;

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

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.f */
/* JADX INFO: loaded from: classes59.dex */
public final class C34925f extends RenderViewHelperInterface {

    /* JADX INFO: renamed from: a */
    private final String f74495a;

    /* JADX INFO: renamed from: b */
    private final CustomHandler f74496b;

    /* JADX INFO: renamed from: c */
    private final RenderViewHelperInterface.RenderViewListener f74497c;

    /* JADX INFO: renamed from: d */
    private SurfaceView f74498d;

    /* JADX INFO: renamed from: e */
    private final Size f74499e;

    /* JADX INFO: renamed from: f */
    private final Size f74500f;

    /* JADX INFO: renamed from: g */
    private GLConstants.GLScaleType f74501g;

    /* JADX INFO: renamed from: h */
    private boolean f74502h;

    /* JADX INFO: renamed from: i */
    private boolean f74503i;

    /* JADX INFO: renamed from: j */
    private final SurfaceHolder.Callback f74504j;

    /* JADX INFO: renamed from: k */
    private final View.OnLayoutChangeListener f74505k;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76610b(C34925f c34925f) {
        SurfaceView surfaceView = c34925f.f74498d;
        if (surfaceView == null) {
            LiteavLog.m76087i(c34925f.f74495a, "view is not available when surfaceView is null");
            return;
        }
        Surface surface = surfaceView.getHolder().getSurface();
        boolean z11 = surface != null && surface.isValid();
        if (!z11 || c34925f.f74498d.getWidth() == 0 || c34925f.f74498d.getHeight() == 0 || !c34925f.f74498d.isShown()) {
            String str = c34925f.f74495a;
            SurfaceView surfaceView2 = c34925f.f74498d;
            LiteavLog.m76088i(str, "%s is not available when isShown:%b, surface isValid:%b", surfaceView2, Boolean.valueOf(surfaceView2.isShown()), Boolean.valueOf(z11));
        }
        c34925f.f74503i = c34925f.f74498d.isShown();
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76608a(C34925f c34925f, SurfaceView surfaceView) {
        SurfaceHolder holder = surfaceView.getHolder();
        if (holder.getSurface().isValid()) {
            Surface surface = holder.getSurface();
            Rect surfaceFrame = holder.getSurfaceFrame();
            LiteavLog.m76088i(c34925f.f74495a, "construct,surface=%s,Size(%dx%d)", surface, Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
            c34925f.m76605a(surface);
        } else {
            LiteavLog.m76087i(c34925f.f74495a, "construct,surfaceView not valid.");
        }
        holder.addCallback(c34925f.f74504j);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m76611c(C34925f c34925f) {
        LiteavLog.m76087i(c34925f.f74495a, "release,mSurfaceView=" + c34925f.f74498d);
        if (c34925f.f74498d == null) {
            return;
        }
        c34925f.m76604a();
        c34925f.f74498d.getHolder().removeCallback(c34925f.f74504j);
        c34925f.f74498d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f74496b.post(RunnableC34928i.m76619a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final Matrix getTransformMatrix(int i11, int i12) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isVisible() {
        return this.f74503i;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z11) {
        this.f74496b.post(RunnableC34927h.m76618a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i11, int i12, boolean z11) {
        if (this.f74501g == gLScaleType && this.f74502h == z11) {
            Size size = this.f74499e;
            if (size.width == i11 && size.height == i12) {
                return;
            }
        }
        this.f74502h = z11;
        this.f74501g = gLScaleType;
        this.f74499e.set(i11, i12);
        if (this.f74502h) {
            this.f74496b.runOrPost(RunnableC34929j.m76620a(this));
        }
    }

    public C34925f(String str, SurfaceView surfaceView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f74496b = customHandler;
        this.f74499e = new Size();
        this.f74500f = new Size();
        this.f74501g = null;
        this.f74502h = false;
        this.f74503i = true;
        this.f74504j = new SurfaceHolder.Callback() { // from class: com.tencent.liteav.videoconsumer.renderer.f.1
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
                if (surfaceHolder != null) {
                    LiteavLog.m76088i(C34925f.this.f74495a, "surfaceChanged,format=%d,Size(%dx%d)", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
                    C34925f.this.m76605a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (surfaceHolder != null) {
                    Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                    LiteavLog.m76088i(C34925f.this.f74495a, "surfaceCreated,Size(%dx%d)", Integer.valueOf(surfaceFrame.width()), Integer.valueOf(surfaceFrame.height()));
                    C34925f.this.m76605a(surfaceHolder.getSurface());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                LiteavLog.m76087i(C34925f.this.f74495a, "surfaceDestroyed");
                C34925f.this.m76604a();
            }
        };
        this.f74505k = new View.OnLayoutChangeListener() { // from class: com.tencent.liteav.videoconsumer.renderer.f.2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                if (C34925f.this.f74502h) {
                    if (C34925f.this.f74500f.width == view.getWidth() && C34925f.this.f74500f.height == view.getHeight()) {
                        return;
                    }
                    C34925f.this.m76609b();
                }
            }
        };
        String str2 = str + "SurfaceViewRenderHelper_" + hashCode();
        this.f74495a = str2;
        this.f74497c = renderViewListener;
        if (surfaceView == null) {
            LiteavLog.m76093w(str2, "surfaceView is null.");
        } else {
            this.f74498d = surfaceView;
            customHandler.post(RunnableC34926g.m76617a(this, surfaceView));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX INFO: renamed from: b */
    public void m76609b() {
        double d11;
        SurfaceView surfaceView = this.f74498d;
        if (surfaceView == null || !(surfaceView.getParent() instanceof TXCloudVideoView)) {
            return;
        }
        TXCloudVideoView tXCloudVideoView = (TXCloudVideoView) this.f74498d.getParent();
        Size size = new Size(tXCloudVideoView.getWidth(), tXCloudVideoView.getHeight());
        if (this.f74499e.isValid() && size.isValid()) {
            if (!this.f74500f.isValid()) {
                tXCloudVideoView.addOnLayoutChangeListener(this.f74505k);
            }
            this.f74500f.set(size);
            double dAspectRatio = size.aspectRatio();
            double dAspectRatio2 = this.f74499e.aspectRatio();
            double d12 = 1.0d;
            if (dAspectRatio2 < dAspectRatio) {
                GLConstants.GLScaleType gLScaleType = this.f74501g;
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
                GLConstants.GLScaleType gLScaleType2 = this.f74501g;
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
            ViewGroup.LayoutParams layoutParams = this.f74498d.getLayoutParams();
            layoutParams.width = (int) (((double) size.getWidth()) * d12);
            layoutParams.height = (int) (((double) size.getHeight()) * d11);
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
            }
            this.f74498d.setLayoutParams(layoutParams);
            LiteavLog.m76088i(this.f74495a, "adjust view size to %d*%d", Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76605a(Surface surface) {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f74497c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76604a() {
        RenderViewHelperInterface.RenderViewListener renderViewListener = this.f74497c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void enableNonUniformScale(boolean z11) {
    }
}
