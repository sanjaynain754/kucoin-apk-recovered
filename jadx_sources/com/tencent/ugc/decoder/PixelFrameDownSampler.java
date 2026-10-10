package com.tencent.ugc.decoder;

import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.GlobalContextManager;
import com.tencent.ugc.videobase.egl.EGLCore;
import com.tencent.ugc.videobase.egl.EGLException;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.PixelFrame;
import com.tencent.ugc.videobase.frame.PixelFrameRenderer;
import com.tencent.ugc.videobase.utils.OpenGlUtils;

/* JADX INFO: loaded from: classes2.dex */
public class PixelFrameDownSampler {
    private static final int MAX_OUTPUT_SIDE_LENGTH = 1920;
    private static final String TAG = "DecoderPixelFrameConverter";
    private EGLCore mEGLCore;
    private GLTexturePool mGLTexturePool;
    private PixelFrameRenderer mPixelFrameRenderer;
    private Object mSharedGLContext;
    private final C34692b mThrottlers = new C34692b();

    public PixelFrame scaleTo1080p(PixelFrame pixelFrame) {
        if (pixelFrame == null || this.mGLTexturePool == null) {
            return null;
        }
        if ((pixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_OES || pixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.TEXTURE_2D) && !pixelFrame.getGLContext().equals(getEglContext())) {
            pixelFrame.getGLContext().equals(this.mSharedGLContext);
        }
        if (!makeCurrent()) {
            pixelFrame.release();
            return null;
        }
        EnumC34747l rotation = pixelFrame.getRotation();
        EnumC34747l enumC34747l = EnumC34747l.NORMAL;
        if (rotation != enumC34747l && pixelFrame.getRotation() != EnumC34747l.ROTATION_180) {
            pixelFrame.swapWidthHeight();
        }
        Size sizeClampOutputFrameSize = clampOutputFrameSize(pixelFrame.getWidth(), pixelFrame.getHeight());
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null && !pixelFrameRenderer.getOutputSize().equals(sizeClampOutputFrameSize)) {
            this.mPixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
        if (this.mPixelFrameRenderer == null) {
            this.mPixelFrameRenderer = new PixelFrameRenderer(sizeClampOutputFrameSize.width, sizeClampOutputFrameSize.height);
        }
        OpenGlUtils.glViewport(0, 0, sizeClampOutputFrameSize.width, sizeClampOutputFrameSize.height);
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(sizeClampOutputFrameSize.width, sizeClampOutputFrameSize.height);
        gLTextureObtain.setColorFormat(pixelFrame.getColorRange(), pixelFrame.getColorSpace());
        this.mPixelFrameRenderer.renderFrame(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, gLTextureObtain);
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(this.mEGLCore.getEglContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        pixelFrameWrap.setGLContext(GlobalContextManager.getInstance().getGLContext());
        gLTextureObtain.release();
        if (pixelFrame.getRotation() != enumC34747l && pixelFrame.getRotation() != EnumC34747l.ROTATION_180) {
            pixelFrame.swapWidthHeight();
        }
        pixelFrame.release();
        return pixelFrameWrap;
    }

    private Size clampOutputFrameSize(int i11, int i12) {
        int i13;
        if (i11 == 0 || i12 == 0) {
            return new Size(720, 1280);
        }
        int i14 = MAX_OUTPUT_SIDE_LENGTH;
        if (i11 <= MAX_OUTPUT_SIDE_LENGTH && i12 <= MAX_OUTPUT_SIDE_LENGTH) {
            return new Size(i11, i12);
        }
        if (i11 >= i12) {
            i13 = (int) ((1920.0f / i11) * i12);
        } else {
            i14 = (int) ((1920.0f / i12) * i11);
            i13 = MAX_OUTPUT_SIDE_LENGTH;
        }
        return new Size(i14, i13);
    }

    public Object getEglContext() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore != null) {
            return eGLCore.getEglContext();
        }
        return null;
    }

    public boolean initialize(Object obj) {
        this.mSharedGLContext = obj;
        if (this.mEGLCore != null) {
            LiteavLog.m76093w(TAG, "already has eglcore.");
            return true;
        }
        LiteavLog.m76086i(this.mThrottlers.m76042a("initGL"), TAG, "initialize opengl components", new Object[0]);
        EGLCore eGLCore = new EGLCore();
        this.mEGLCore = eGLCore;
        try {
            eGLCore.initialize(obj, null, 128, 128);
            this.mEGLCore.makeCurrent();
            this.mGLTexturePool = new GLTexturePool();
            return true;
        } catch (EGLException e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("initGLError"), TAG, "initialize opengl components failed.", e11);
            this.mEGLCore = null;
            return false;
        }
    }

    public boolean makeCurrent() {
        try {
            EGLCore eGLCore = this.mEGLCore;
            if (eGLCore == null) {
                return true;
            }
            eGLCore.makeCurrent();
            return true;
        } catch (EGLException e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("makeCurrent"), TAG, "makeCurrent failed.", e11);
            return false;
        }
    }

    public void uninitialize() {
        makeCurrent();
        GLTexturePool gLTexturePool = this.mGLTexturePool;
        if (gLTexturePool != null) {
            gLTexturePool.destroy();
            this.mGLTexturePool = null;
        }
        PixelFrameRenderer pixelFrameRenderer = this.mPixelFrameRenderer;
        if (pixelFrameRenderer != null) {
            pixelFrameRenderer.uninitialize();
            this.mPixelFrameRenderer = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
        this.mSharedGLContext = null;
    }
}
