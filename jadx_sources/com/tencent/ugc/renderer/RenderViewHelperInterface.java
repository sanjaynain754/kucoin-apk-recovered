package com.tencent.ugc.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.DisplayTarget;
import com.tencent.rtmp.p148ui.TXCloudVideoView;
import com.tencent.ugc.videobase.videobase.TXCCloudVideoViewMethodInvoker;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public abstract class RenderViewHelperInterface {
    private static final String TAG = "RenderViewHelperInterface";

    public interface RenderViewListener {
        void onRequestRedraw(Bitmap bitmap);

        void onSurfaceChanged(Surface surface, boolean z11);

        void onSurfaceDestroy();
    }

    public abstract void checkViewAvailability();

    public abstract Matrix getTransformMatrix(int i11, int i12);

    public abstract boolean isUsingTextureView();

    public abstract void release(boolean z11);

    public abstract void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i11, int i12, boolean z11);

    /* JADX INFO: renamed from: com.tencent.ugc.renderer.RenderViewHelperInterface$1 */
    public static /* synthetic */ class C357701 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77270a;

        static {
            int[] iArr = new int[DisplayTarget.EnumC34903a.values().length];
            f77270a = iArr;
            try {
                iArr[DisplayTarget.EnumC34903a.SURFACEVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77270a[DisplayTarget.EnumC34903a.TEXTUREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77270a[DisplayTarget.EnumC34903a.SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77270a[DisplayTarget.EnumC34903a.TXCLOUDVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.view.SurfaceView] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.view.TextureView] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static RenderViewHelperInterface create(DisplayTarget displayTarget, RenderViewListener renderViewListener) {
        Surface surface;
        ?? textureView;
        ?? surfaceView;
        TXCloudVideoView tXCloudVideoView;
        if (displayTarget == null || displayTarget.getType() == null) {
            LiteavLog.m76093w(TAG, "displayTarget or type is null. displayTarget=".concat(String.valueOf(displayTarget)));
            return null;
        }
        int i11 = C357701.f77270a[displayTarget.getType().ordinal()];
        if (i11 == 1) {
            surface = null;
            textureView = 0;
            surfaceView = displayTarget.getSurfaceView();
            tXCloudVideoView = null;
        } else if (i11 != 2) {
            if (i11 == 3) {
                surface = displayTarget.getSurface();
                tXCloudVideoView = null;
            } else if (i11 != 4) {
                surface = null;
                tXCloudVideoView = null;
            } else {
                TXCloudVideoView tXCloudVideoView2 = displayTarget.getTXCloudVideoView();
                if (tXCloudVideoView2 == null) {
                    LiteavLog.m76093w(TAG, "txCloudVideoView is null.");
                    surfaceView = 0;
                    textureView = 0;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                } else {
                    SurfaceView surfaceView2 = tXCloudVideoView2.getSurfaceView();
                    textureView = TXCCloudVideoViewMethodInvoker.getTextureViewSetByUser(tXCloudVideoView2);
                    surfaceView = surfaceView2;
                    tXCloudVideoView = tXCloudVideoView2;
                    surface = null;
                }
            }
            TXCloudVideoView tXCloudVideoView3 = tXCloudVideoView;
            textureView = tXCloudVideoView3;
            surfaceView = tXCloudVideoView3;
        } else {
            surface = null;
            tXCloudVideoView = null;
            textureView = displayTarget.getTextureView();
            surfaceView = 0;
        }
        if (surfaceView != 0) {
            return new SurfaceViewRenderHelper(surfaceView, renderViewListener);
        }
        if (textureView != 0) {
            return new TextureViewRenderHelper((TextureView) textureView, renderViewListener);
        }
        if (surface != null) {
            return new SurfaceRenderHelper(surface, renderViewListener);
        }
        if (tXCloudVideoView != null) {
            return new TextureViewRenderHelper(tXCloudVideoView, renderViewListener);
        }
        LiteavLog.m76093w(TAG, "RenderViewHelper not created. displayTarget=".concat(String.valueOf(displayTarget)));
        return null;
    }

    public static GLConstants.GLScaleType createScaleType(int i11) {
        return GLConstants.GLScaleType.m76483a(i11);
    }
}
