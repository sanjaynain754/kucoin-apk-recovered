package com.tencent.liteav.videoconsumer.renderer;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.videobase.TXCCloudVideoViewMethodInvoker;
import com.tencent.rtmp.p148ui.TXCloudVideoView;

/* JADX INFO: renamed from: com.tencent.liteav.videoconsumer.renderer.k */
/* JADX INFO: loaded from: classes59.dex */
public final class TextureViewSurfaceTextureListenerC34930k extends RenderViewHelperInterface implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a */
    TextureView f74513a;

    /* JADX INFO: renamed from: b */
    private final String f74514b;

    /* JADX INFO: renamed from: c */
    private final CustomHandler f74515c;

    /* JADX INFO: renamed from: d */
    private final C34692b f74516d;

    /* JADX INFO: renamed from: e */
    private final RenderViewHelperInterface.RenderViewListener f74517e;

    /* JADX INFO: renamed from: f */
    private final TXCloudVideoView f74518f;

    /* JADX INFO: renamed from: g */
    private boolean f74519g;

    /* JADX INFO: renamed from: h */
    private final Size f74520h;

    /* JADX INFO: renamed from: i */
    private GLConstants.GLScaleType f74521i;

    /* JADX INFO: renamed from: j */
    private boolean f74522j;

    /* JADX INFO: renamed from: k */
    private boolean f74523k;

    /* JADX INFO: renamed from: l */
    private Matrix f74524l;

    /* JADX INFO: renamed from: m */
    private boolean f74525m;

    /* JADX INFO: renamed from: n */
    private boolean f74526n;

    /* JADX INFO: renamed from: o */
    private SurfaceTexture f74527o;

    /* JADX INFO: renamed from: p */
    private Surface f74528p;

    /* JADX INFO: renamed from: q */
    private final Size f74529q;

    public TextureViewSurfaceTextureListenerC34930k(String str, TXCloudVideoView tXCloudVideoView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        this(str, renderViewListener, tXCloudVideoView, null);
        if (this.f74518f == null) {
            LiteavLog.m76083e(this.f74514b, "construct: txCloudVideoView is null.");
            return;
        }
        LiteavLog.m76087i(this.f74514b, "construct: txCloudVideoView=" + this.f74518f);
        this.f74526n = false;
        this.f74515c.post(RunnableC34931l.m76633a(this));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76625a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k, boolean z11) {
        LiteavLog.m76087i(textureViewSurfaceTextureListenerC34930k.f74514b, "release: clearLastImage=".concat(String.valueOf(z11)));
        TextureView textureView = textureViewSurfaceTextureListenerC34930k.f74513a;
        if (textureView == null) {
            return;
        }
        if (textureView.getSurfaceTextureListener() == textureViewSurfaceTextureListenerC34930k) {
            textureViewSurfaceTextureListenerC34930k.f74513a.setSurfaceTextureListener(null);
        }
        Surface surface = textureViewSurfaceTextureListenerC34930k.f74528p;
        if (surface != null) {
            surface.release();
            textureViewSurfaceTextureListenerC34930k.f74528p = null;
        }
        if (textureViewSurfaceTextureListenerC34930k.f74527o != null) {
            SurfaceTexture surfaceTexture = textureViewSurfaceTextureListenerC34930k.f74513a.getSurfaceTexture();
            SurfaceTexture surfaceTexture2 = textureViewSurfaceTextureListenerC34930k.f74527o;
            if (surfaceTexture != surfaceTexture2) {
                surfaceTexture2.release();
            }
        }
        TXCloudVideoView tXCloudVideoView = textureViewSurfaceTextureListenerC34930k.f74518f;
        if (tXCloudVideoView != null) {
            TXCCloudVideoViewMethodInvoker.removeViewInternal(tXCloudVideoView, textureViewSurfaceTextureListenerC34930k.f74513a, z11);
        }
        textureViewSurfaceTextureListenerC34930k.f74527o = null;
        textureViewSurfaceTextureListenerC34930k.f74513a = null;
        textureViewSurfaceTextureListenerC34930k.f74519g = true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m76627b(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        textureViewSurfaceTextureListenerC34930k.m76626b();
        textureViewSurfaceTextureListenerC34930k.m76628c();
        TextureView textureView = textureViewSurfaceTextureListenerC34930k.f74513a;
        if (textureView == null || textureView.getVisibility() == 0) {
            return;
        }
        textureViewSurfaceTextureListenerC34930k.f74513a.setVisibility(0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m76629c(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        TextureView textureView = textureViewSurfaceTextureListenerC34930k.f74513a;
        if (textureView == null) {
            LiteavLog.m76093w(textureViewSurfaceTextureListenerC34930k.f74514b, "checkViewAvailability: textureView is null");
            return;
        }
        if (!textureView.isAvailable() || textureViewSurfaceTextureListenerC34930k.f74513a.getWidth() == 0 || textureViewSurfaceTextureListenerC34930k.f74513a.getHeight() == 0 || !textureViewSurfaceTextureListenerC34930k.f74513a.isShown()) {
            LiteavLog.m76094w(textureViewSurfaceTextureListenerC34930k.f74514b, "checkViewAvailability: %s, %s", m76621a(textureViewSurfaceTextureListenerC34930k.f74513a), m76621a(textureViewSurfaceTextureListenerC34930k.f74518f));
        }
        if (textureViewSurfaceTextureListenerC34930k.f74518f != null && textureViewSurfaceTextureListenerC34930k.f74513a.getVisibility() != 0) {
            textureViewSurfaceTextureListenerC34930k.f74513a.setVisibility(0);
        }
        textureViewSurfaceTextureListenerC34930k.f74522j = textureViewSurfaceTextureListenerC34930k.f74513a.isShown();
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final synchronized void enableNonUniformScale(boolean z11) {
        if (this.f74525m == z11) {
            return;
        }
        this.f74525m = z11;
        LiteavLog.m76087i(this.f74514b, "enableNonUniformScale: ".concat(String.valueOf(z11)));
        this.f74515c.post(RunnableC34936q.m76638a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isUsingTextureView() {
        return true;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final synchronized void updateVideoFrameInfo(GLConstants.GLScaleType gLScaleType, int i11, int i12, boolean z11) {
        if (this.f74521i == gLScaleType) {
            Size size = this.f74520h;
            if (i11 == size.width && i12 == size.height) {
                return;
            }
        }
        LiteavLog.m76088i(this.f74514b, "updateVideoFrameInfo: scaleType: %s, width: %d, height: %d", gLScaleType, Integer.valueOf(i11), Integer.valueOf(i12));
        this.f74521i = gLScaleType;
        this.f74520h.set(i11, i12);
        this.f74515c.runOrPost(RunnableC34935p.m76637a(this));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m76632f(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        TextureView textureView;
        LiteavLog.m76087i(textureViewSurfaceTextureListenerC34930k.f74514b, "first frame rendered");
        TXCloudVideoView tXCloudVideoView = textureViewSurfaceTextureListenerC34930k.f74518f;
        if (tXCloudVideoView == null || (textureView = textureViewSurfaceTextureListenerC34930k.f74513a) == null) {
            return;
        }
        TXCCloudVideoViewMethodInvoker.notifyFirstFrameRendered(tXCloudVideoView, textureView);
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void checkViewAvailability() {
        this.f74515c.runOrPost(RunnableC34934o.m76636a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final Matrix getTransformMatrix(int i11, int i12) {
        Matrix matrix = new Matrix(this.f74524l);
        matrix.postScale(1.0f, -1.0f, i11 / 2.0f, i12 / 2.0f);
        return matrix;
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final boolean isVisible() {
        return this.f74522j;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        LiteavLog.m76087i(this.f74514b, "onSurfaceTextureAvailable, size:" + i11 + "x" + i12 + " surfaceTexture:" + surfaceTexture);
        m76623a(surfaceTexture, i11, i12);
        m76626b();
        checkViewAvailability();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        LiteavLog.m76087i(this.f74514b, "onSurfaceTextureDestroyed surface:".concat(String.valueOf(surfaceTexture)));
        this.f74523k = false;
        return this.f74527o != surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        TextureView textureView;
        Bitmap bitmap;
        LiteavLog.m76086i(this.f74516d.m76042a("surfaceSizeChanged"), this.f74514b, "onSurfaceTextureSizeChanged: %dx%d --> %dx%d", Integer.valueOf(this.f74529q.width), Integer.valueOf(this.f74529q.height), Integer.valueOf(i11), Integer.valueOf(i12));
        Size size = this.f74529q;
        boolean z11 = size.width > size.height;
        m76623a(surfaceTexture, i11, i12);
        m76626b();
        if (z11 == (i11 > i12) || this.f74517e == null || (textureView = this.f74513a) == null || (bitmap = textureView.getBitmap()) == null) {
            return;
        }
        this.f74517e.onRequestRedraw(bitmap);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.f74523k) {
            return;
        }
        this.f74523k = true;
        checkViewAvailability();
        this.f74515c.post(RunnableC34937r.m76639a(this));
    }

    @Override // com.tencent.liteav.videoconsumer.renderer.RenderViewHelperInterface
    public final void release(boolean z11) {
        this.f74515c.post(RunnableC34933n.m76635a(this, z11));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX INFO: renamed from: b */
    private synchronized void m76626b() {
        double d11;
        TextureView textureView = this.f74513a;
        if (textureView == null) {
            return;
        }
        if (!this.f74525m) {
            Matrix matrix = new Matrix();
            this.f74524l = matrix;
            this.f74513a.setTransform(matrix);
            this.f74513a.postInvalidate();
            LiteavLog.m76086i(this.f74516d.m76042a("resetTextureViewRenderMatrix"), this.f74514b, "resetTextureViewRenderMatrix", new Object[0]);
            return;
        }
        Size size = new Size(textureView.getWidth(), this.f74513a.getHeight());
        if (this.f74520h.isValid() && size.isValid()) {
            double dAspectRatio = size.aspectRatio();
            double dAspectRatio2 = this.f74520h.aspectRatio();
            double d12 = 1.0d;
            if (dAspectRatio2 < dAspectRatio) {
                GLConstants.GLScaleType gLScaleType = this.f74521i;
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
                GLConstants.GLScaleType gLScaleType2 = this.f74521i;
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
            Matrix matrix2 = new Matrix();
            matrix2.setScale((float) d12, (float) d11, size.width / 2.0f, size.height / 2.0f);
            if (!matrix2.equals(this.f74513a.getTransform(new Matrix()))) {
                this.f74513a.setTransform(matrix2);
                this.f74513a.postInvalidate();
                LiteavLog.m76086i(this.f74516d.m76042a("updateTextureViewMatrix"), this.f74514b, "updateTextureViewRenderMatrix: view: %s, scaleX: %.2f, scaleY: %.2f, frame: %s, view: %s", this.f74513a, Double.valueOf(d12), Double.valueOf(d11), this.f74520h, size);
            }
            this.f74524l = matrix2;
            return;
        }
        LiteavLog.m76086i(this.f74516d.m76042a("updateTextureViewMatrixFailure"), this.f74514b, "updateTextureViewRenderMatrix, invalid frameSize: %s, viewSize: %s", this.f74520h.toString(), size.toString());
    }

    public TextureViewSurfaceTextureListenerC34930k(String str, TextureView textureView, RenderViewHelperInterface.RenderViewListener renderViewListener) {
        this(str, renderViewListener, null, textureView);
        if (this.f74513a == null) {
            LiteavLog.m76083e(this.f74514b, "construct: textureView is null.");
            return;
        }
        LiteavLog.m76087i(this.f74514b, "construct: textureView=" + this.f74513a);
        this.f74526n = true;
        this.f74515c.post(RunnableC34932m.m76634a(this));
    }

    private TextureViewSurfaceTextureListenerC34930k(String str, RenderViewHelperInterface.RenderViewListener renderViewListener, TXCloudVideoView tXCloudVideoView, TextureView textureView) {
        this.f74515c = new CustomHandler(Looper.getMainLooper());
        this.f74516d = new C34692b();
        this.f74519g = false;
        this.f74520h = new Size();
        this.f74521i = null;
        this.f74522j = true;
        this.f74523k = false;
        this.f74524l = new Matrix();
        this.f74525m = true;
        this.f74526n = false;
        this.f74529q = new Size();
        this.f74514b = str + "TextureViewRenderHelper_" + hashCode();
        this.f74517e = renderViewListener;
        this.f74518f = tXCloudVideoView;
        this.f74513a = textureView;
    }

    /* JADX INFO: renamed from: c */
    private synchronized void m76628c() {
        TextureView textureView = this.f74513a;
        if (textureView != null && !this.f74526n) {
            if (!this.f74525m && this.f74521i == GLConstants.GLScaleType.FIT_CENTER) {
                textureView.setOpaque(false);
            } else {
                textureView.setOpaque(true);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static String m76621a(View view) {
        if (view == null) {
            return "null";
        }
        String str = String.format("%s: is_shown:%b, visibility:%s, window_visibility:%s, size:%dx%d", view.getClass().getSimpleName(), Boolean.valueOf(view.isShown()), Integer.valueOf(view.getVisibility()), Integer.valueOf(view.getWindowVisibility()), Integer.valueOf(view.getWidth()), Integer.valueOf(view.getHeight()));
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 19) {
            str = str + String.format(", is_attached:%b", Boolean.valueOf(view.isAttachedToWindow()));
        }
        if (!(view instanceof TextureView)) {
            return str;
        }
        return str + String.format(", is_surface_available:%s", Boolean.valueOf(((TextureView) view).isAvailable()));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m76624a(TextureViewSurfaceTextureListenerC34930k textureViewSurfaceTextureListenerC34930k) {
        textureViewSurfaceTextureListenerC34930k.m76626b();
        textureViewSurfaceTextureListenerC34930k.m76628c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m76622a() {
        if (this.f74513a == null && this.f74518f == null) {
            LiteavLog.m76083e(this.f74514b, "setup: null view");
            return;
        }
        TXCloudVideoView tXCloudVideoView = this.f74518f;
        if (tXCloudVideoView != null) {
            TextureView freeTextureView = TXCCloudVideoViewMethodInvoker.getFreeTextureView(tXCloudVideoView);
            this.f74513a = freeTextureView;
            if (freeTextureView == null) {
                this.f74513a = new TextureView(this.f74518f.getContext());
            }
            TXCCloudVideoViewMethodInvoker.addViewInternal(this.f74518f, this.f74513a);
            LiteavLog.m76087i(this.f74514b, "setup: add view: " + this.f74513a);
        }
        this.f74513a.setSurfaceTextureListener(this);
        if (!this.f74513a.isAvailable()) {
            LiteavLog.m76087i(this.f74514b, "setup: textureView not available.");
            checkViewAvailability();
            return;
        }
        Size size = new Size(this.f74513a.getWidth(), this.f74513a.getHeight());
        LiteavLog.m76087i(this.f74514b, "setup: " + this.f74513a + "," + size + ", isShown=" + this.f74513a.isShown());
        m76623a(this.f74513a.getSurfaceTexture(), size.width, size.height);
    }

    /* JADX INFO: renamed from: a */
    private void m76623a(SurfaceTexture surfaceTexture, int i11, int i12) {
        SurfaceTexture surfaceTexture2 = this.f74527o;
        if (surfaceTexture2 == null) {
            this.f74527o = surfaceTexture;
        } else if (surfaceTexture != surfaceTexture2) {
            LiteavLog.m76087i(this.f74514b, "notifySurfaceChanged: reset surfaceTexture: " + this.f74527o);
            this.f74513a.setSurfaceTexture(this.f74527o);
        }
        this.f74529q.set(i11, i12);
        if (this.f74528p == null) {
            Surface surface = new Surface(this.f74527o);
            this.f74528p = surface;
            RenderViewHelperInterface.RenderViewListener renderViewListener = this.f74517e;
            if (renderViewListener != null) {
                renderViewListener.onSurfaceChanged(surface, false);
            }
        }
    }
}
