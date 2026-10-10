package com.tencent.liteav.videoproducer.capture;

import android.opengl.GLES20;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.egl.C34880d;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.frame.AbstractC34885d;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.liteav.videobase.frame.C34890i;
import com.tencent.liteav.videobase.frame.PixelFrame;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class CustomFrameToPixelFrameConverter {
    private static final String TAG = "CustomFrameToPixelFrameConverter";
    private final Object mSharedContext;
    private final C34692b mThrottlers = new C34692b();
    private EGLCore mEGLCore = null;
    private C34890i mPixelFrameRenderer = null;
    private C34886e mGLTexturePool = null;
    private int mWidth = 0;
    private int mHeight = 0;

    public PixelFrame convertFrame(PixelFrame pixelFrame) {
        if (pixelFrame == null) {
            LiteavLog.m76093w(TAG, "convertFrame: pixelFrame is null.");
            return null;
        }
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null || isNeedRecreateEGL(pixelFrame, eGLCore)) {
            this.mWidth = pixelFrame.getWidth();
            this.mHeight = pixelFrame.getHeight();
            uninitializedGLComponents();
            initializeGLComponents(this.mWidth, this.mHeight, pixelFrame);
        }
        EGLCore eGLCore2 = this.mEGLCore;
        if (eGLCore2 == null || this.mGLTexturePool == null || this.mPixelFrameRenderer == null) {
            return null;
        }
        try {
            eGLCore2.makeCurrent();
        } catch (C34880d e11) {
            LiteavLog.m76084e(TAG, "EGL makeCurrent error ", e11);
        }
        OpenGlUtils.glViewport(0, 0, this.mWidth, this.mHeight);
        AbstractC34885d abstractC34885dM76532a = this.mGLTexturePool.m76532a(this.mWidth, this.mHeight);
        this.mPixelFrameRenderer.m76551a(pixelFrame, GLConstants.GLScaleType.CENTER_CROP, abstractC34885dM76532a);
        GLES20.glFinish();
        PixelFrame pixelFrameMo76527a = abstractC34885dM76532a.mo76527a(this.mEGLCore.getEglContext());
        pixelFrameMo76527a.setTimestamp(pixelFrame.getTimestamp());
        abstractC34885dM76532a.release();
        return pixelFrameMo76527a;
    }

    private void initializeGLComponents(int i11, int i12, PixelFrame pixelFrame) {
        if (this.mEGLCore != null) {
            LiteavLog.m76092w(this.mThrottlers.m76042a("initGL"), TAG, "egl is initialized!", new Object[0]);
            return;
        }
        Object gLContext = pixelFrame.getGLContext() != null ? pixelFrame.getGLContext() : this.mSharedContext;
        try {
            EGLCore eGLCore = new EGLCore();
            this.mEGLCore = eGLCore;
            eGLCore.initialize(gLContext, null, i11, i12);
            this.mEGLCore.makeCurrent();
            LiteavLog.m76086i(this.mThrottlers.m76042a("initSuccess"), TAG, "initialize egl, width: " + i11 + ", height: " + i12 + ", sharedContext: " + gLContext, new Object[0]);
        } catch (C34880d e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("initError"), TAG, "initialize egl failed.", e11);
            this.mEGLCore = null;
        }
        if (this.mEGLCore != null) {
            this.mGLTexturePool = new C34886e();
            if (this.mPixelFrameRenderer == null) {
                this.mPixelFrameRenderer = new C34890i(i11, i12);
            }
        }
    }

    private void uninitializedGLComponents() {
        EGLCore eGLCore = this.mEGLCore;
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.makeCurrent();
        } catch (C34880d e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("make"), TAG, "uninitialize egl, make current error ", e11);
        }
        LiteavLog.m76086i(this.mThrottlers.m76042a("uninitGL"), TAG, "uninitialize egl", new Object[0]);
        C34890i c34890i = this.mPixelFrameRenderer;
        if (c34890i != null) {
            c34890i.m76549a();
            this.mPixelFrameRenderer = null;
        }
        C34886e c34886e = this.mGLTexturePool;
        if (c34886e != null) {
            c34886e.mo76516a();
            this.mGLTexturePool.mo76519b();
            this.mGLTexturePool = null;
        }
        EGLCore.destroy(this.mEGLCore);
        this.mEGLCore = null;
    }

    public void releaseFrame(PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }

    public CustomFrameToPixelFrameConverter(Object obj) {
        this.mSharedContext = obj;
    }

    private boolean isNeedRecreateEGL(PixelFrame pixelFrame, EGLCore eGLCore) {
        boolean z11;
        if (pixelFrame.getGLContext() != null && !CommonUtil.equals(pixelFrame.getGLContext(), eGLCore.getSharedContext())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (pixelFrame.getHeight() == this.mHeight && pixelFrame.getWidth() == this.mWidth && !z11) {
            return false;
        }
        return true;
    }

    public void release() {
        uninitializedGLComponents();
    }
}
