package com.tencent.liteav.videobase.frame;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.util.CommonUtil;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.liteav.videobase.egl.C34880d;
import com.tencent.liteav.videobase.egl.EGLCore;
import com.tencent.liteav.videobase.utils.C34898d;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class PixelFrameFactory {
    private EGLSurface mCallerEGLDrawSurface;
    private EGLSurface mCallerEGLReadSurface;
    private C34886e mGLTexturePool;
    private final Size mLastFrameSize;
    private C34890i mPixelFrameRenderer;
    private EGLCore mRenderEGLCore;
    private final C34692b mThrottlers;
    private final String mTAG = "PixelFrameFactory_" + hashCode();
    private Object mSharedEGLContext = null;
    private EGLDisplay mCallerEGLDisplay = EGL14.EGL_NO_DISPLAY;
    private EGLContext mCallerEGLContext = EGL14.EGL_NO_CONTEXT;

    public synchronized PixelFrame create(int i11, int i12, int i13, long j11, int i14, int i15, int i16, Object obj, Object obj2, boolean z11) {
        PixelFrame pixelFrameDeepCopyDataToPixelFrame;
        try {
            PixelFrame pixelFrame = new PixelFrame();
            pixelFrame.setWidth(i11);
            pixelFrame.setHeight(i12);
            pixelFrame.setRotation(EnumC34747l.m76131a(i13));
            pixelFrame.setTimestamp(j11);
            pixelFrame.setGLContext(obj);
            pixelFrame.setTextureId(i16);
            pixelFrame.setPixelBufferType(GLConstants.EnumC34866a.m76485a(i14));
            pixelFrame.setPixelFormatType(GLConstants.PixelFormatType.m76484a(i15));
            if (pixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.BYTE_ARRAY || pixelFrame.getPixelBufferType() == GLConstants.EnumC34866a.BYTE_BUFFER) {
                pixelFrameDeepCopyDataToPixelFrame = z11 ? deepCopyDataToPixelFrame(pixelFrame, obj2) : shallowCopyDataToPixelFrame(pixelFrame, obj2);
            } else {
                pixelFrameDeepCopyDataToPixelFrame = deepCopyTextureToPixelFrame(pixelFrame, obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return pixelFrameDeepCopyDataToPixelFrame;
    }

    public synchronized void release(PixelFrame pixelFrame) {
        if (pixelFrame != null) {
            pixelFrame.release();
        }
    }

    public synchronized void uninitOpenGLComponents() {
        try {
            if (this.mRenderEGLCore == null) {
                return;
            }
            LiteavLog.m76087i(this.mTAG, "uninitOpenGLComponents");
            if (makeCurrent()) {
                C34886e c34886e = this.mGLTexturePool;
                if (c34886e != null) {
                    c34886e.mo76516a();
                    this.mGLTexturePool.mo76519b();
                    this.mGLTexturePool = null;
                }
                C34890i c34890i = this.mPixelFrameRenderer;
                if (c34890i != null) {
                    c34890i.m76549a();
                    this.mPixelFrameRenderer = null;
                }
            }
            EGLCore.destroy(this.mRenderEGLCore);
            this.mRenderEGLCore = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private PixelFrame copyTexture(PixelFrame pixelFrame) {
        if (this.mGLTexturePool == null) {
            this.mGLTexturePool = new C34886e();
        }
        AbstractC34885d abstractC34885dM76532a = this.mGLTexturePool.m76532a(pixelFrame.getWidth(), pixelFrame.getHeight());
        if (this.mLastFrameSize.width != pixelFrame.getWidth() || this.mLastFrameSize.height != pixelFrame.getHeight()) {
            C34890i c34890i = this.mPixelFrameRenderer;
            if (c34890i != null) {
                c34890i.m76549a();
                this.mPixelFrameRenderer = null;
            }
            this.mLastFrameSize.width = pixelFrame.getWidth();
            this.mLastFrameSize.height = pixelFrame.getHeight();
        }
        if (this.mPixelFrameRenderer == null) {
            this.mPixelFrameRenderer = new C34890i(pixelFrame.getWidth(), pixelFrame.getHeight());
        }
        this.mPixelFrameRenderer.m76551a(pixelFrame, GLConstants.GLScaleType.FILL, abstractC34885dM76532a);
        PixelFrame pixelFrameMo76527a = abstractC34885dM76532a.mo76527a(pixelFrame.getGLContext());
        abstractC34885dM76532a.release();
        return pixelFrameMo76527a;
    }

    private PixelFrame deepCopyDataToPixelFrame(PixelFrame pixelFrame, Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArrM76560a = C34898d.m76560a(((byte[]) obj).length);
            if (bArrM76560a == null) {
                return null;
            }
            System.arraycopy(obj, 0, bArrM76560a, 0, bArrM76560a.length);
            pixelFrame.setData(bArrM76560a);
        } else if (obj instanceof ByteBuffer) {
            ByteBuffer byteBuffer = (ByteBuffer) obj;
            ByteBuffer byteBufferM76561b = C34898d.m76561b(byteBuffer.capacity());
            if (byteBufferM76561b == null) {
                return null;
            }
            byteBuffer.rewind();
            byteBufferM76561b.put(byteBuffer);
            byteBufferM76561b.rewind();
            pixelFrame.setBuffer(byteBufferM76561b);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    private void initRenderEGLContext(Object obj) {
        if (this.mRenderEGLCore != null) {
            return;
        }
        LiteavLog.m76087i(this.mTAG, "initRenderEGLContext");
        this.mSharedEGLContext = obj;
        EGLCore eGLCore = new EGLCore();
        this.mRenderEGLCore = eGLCore;
        try {
            eGLCore.initialize(obj, null, 128, 128);
        } catch (C34880d e11) {
            this.mRenderEGLCore = null;
            LiteavLog.m76081e(this.mThrottlers.m76042a("initEGLCore"), this.mTAG, "create EGLCore failed.", e11);
        }
    }

    private boolean makeCurrent() {
        EGLCore eGLCore = this.mRenderEGLCore;
        if (eGLCore == null) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("makeCurrentNull"), this.mTAG, "makeCurrent on mEGLCore is null", new Object[0]);
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (C34880d e11) {
            LiteavLog.m76081e(this.mThrottlers.m76042a("makeCurrentError"), this.mTAG, "make current failed.", e11);
            return false;
        }
    }

    private void restoreCallerEGLContext() {
        if (!CommonUtil.equals(this.mCallerEGLContext, EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglMakeCurrent(this.mCallerEGLDisplay, this.mCallerEGLDrawSurface, this.mCallerEGLReadSurface, this.mCallerEGLContext);
            return;
        }
        EGLDisplay eGLDisplayEglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplayEglGetCurrentDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
    }

    private PixelFrame shallowCopyDataToPixelFrame(PixelFrame pixelFrame, Object obj) {
        if (obj instanceof byte[]) {
            pixelFrame.setData((byte[]) obj);
        } else if (obj instanceof ByteBuffer) {
            pixelFrame.setBuffer((ByteBuffer) obj);
        }
        pixelFrame.retain();
        return pixelFrame;
    }

    public PixelFrameFactory() {
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        this.mCallerEGLReadSurface = eGLSurface;
        this.mCallerEGLDrawSurface = eGLSurface;
        this.mLastFrameSize = new Size();
        this.mThrottlers = new C34692b();
    }

    private PixelFrame deepCopyTextureToPixelFrame(PixelFrame pixelFrame, Object obj) {
        saveCallerEGLContext();
        GLES20.glFinish();
        if (!CommonUtil.equals(this.mSharedEGLContext, obj)) {
            uninitOpenGLComponents();
            initRenderEGLContext(obj);
        }
        if (!makeCurrent()) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("makeCurrent"), this.mTAG, "use origin texture when makeCurrent error", new Object[0]);
            pixelFrame.retain();
            return pixelFrame;
        }
        PixelFrame pixelFrameCopyTexture = copyTexture(pixelFrame);
        GLES20.glFinish();
        restoreCallerEGLContext();
        return pixelFrameCopyTexture;
    }

    private void saveCallerEGLContext() {
        EGLContext eGLContextEglGetCurrentContext = EGL14.eglGetCurrentContext();
        if (!CommonUtil.equals(this.mCallerEGLContext, EGL14.EGL_NO_CONTEXT) && CommonUtil.equals(eGLContextEglGetCurrentContext, this.mCallerEGLContext)) {
            return;
        }
        this.mCallerEGLContext = eGLContextEglGetCurrentContext;
        this.mCallerEGLDisplay = EGL14.eglGetCurrentDisplay();
        this.mCallerEGLReadSurface = EGL14.eglGetCurrentSurface(12378);
        this.mCallerEGLDrawSurface = EGL14.eglGetCurrentSurface(12377);
    }
}
