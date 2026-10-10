package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Matrix;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34921b extends RenderViewHelperInterface {

    /* JADX INFO: renamed from: a */
    private final String f74487a;

    /* JADX INFO: renamed from: b */
    private final CustomHandler f74488b;

    /* JADX INFO: renamed from: c */
    private final RenderViewHelperInterface.RenderViewListener f74489c;

    /* JADX INFO: renamed from: d */
    private Surface f74490d;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76599a(C34921b c34921b, Surface surface) {
        LiteavLog.m76087i(c34921b.f74487a, "construct,surface=".concat(String.valueOf(surface)));
        RenderViewHelperInterface.RenderViewListener renderViewListener = c34921b.f74489c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceChanged(surface, false);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return false;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isVisible() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76600b(C34921b c34921b) {
        LiteavLog.m76087i(c34921b.f74487a, "release,mSurface=" + c34921b.f74490d);
        if (c34921b.f74490d == null) {
            return;
        }
        RenderViewHelperInterface.RenderViewListener renderViewListener = c34921b.f74489c;
        if (renderViewListener != null) {
            renderViewListener.onSurfaceDestroy();
        }
        c34921b.f74490d = null;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f74488b.post(RunnableC34924e.m76603a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final Matrix getTransformMatrix(int i11, int i12) {
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z11) {
        this.f74488b.post(RunnableC34923d.m76602a(this));
    }

    public C34921b(String str, Surface surface, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        CustomHandler customHandler = new CustomHandler(Looper.getMainLooper());
        this.f74488b = customHandler;
        String str2 = str + "SurfaceRenderHelper_" + hashCode();
        this.f74487a = str2;
        this.f74489c = renderViewListener;
        if (surface == null) {
            LiteavLog.m76093w(str2, "surface is null.");
        } else {
            this.f74490d = surface;
            customHandler.post(RunnableC34922c.m76601a(this, surface));
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76598a(C34921b c34921b) {
        Surface surface = c34921b.f74490d;
        if (surface == null) {
            LiteavLog.m76087i(c34921b.f74487a, "view is not available when surface is null");
        } else {
            if (surface.isValid()) {
                return;
            }
            LiteavLog.m76088i(c34921b.f74487a, "view is not available when %s is not valid", c34921b.f74490d);
        }
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void enableNonUniformScale(boolean z11) {
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i11, int i12, boolean z11) {
    }
}
