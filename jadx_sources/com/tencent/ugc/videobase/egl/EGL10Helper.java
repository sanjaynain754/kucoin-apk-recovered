package com.tencent.ugc.videobase.egl;

import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: loaded from: classes2.dex */
public class EGL10Helper implements EGLHelper<EGLContext> {
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final int EGL_OPENGL_ES2_BIT = 4;
    private EGL10 mEGL;
    private EGLConfig mEGLConfig;
    private final int mHeight;
    private final int mWidth;
    private static final int[] ATTRIBUTES_FOR_OFFSCREEN_SURFACE = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};
    private static final int EGL_RECORDABLE_ANDROID = 12610;
    private static final int[] ATTRIBUTES_FOR_SURFACE = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, EGL_RECORDABLE_ANDROID, 1, 12344};
    private EGLDisplay mEGLDisplay = EGL10.EGL_NO_DISPLAY;
    private EGLContext mEGLContext = EGL10.EGL_NO_CONTEXT;
    private EGLSurface mEGLSurface = EGL10.EGL_NO_SURFACE;
    private final String mTag = "EGL10Helper@" + hashCode();

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public Size getSurfaceSize() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12375, iArr) && this.mEGL.eglQuerySurface(this.mEGLDisplay, this.mEGLSurface, 12374, iArr2)) ? new Size(iArr[0], iArr2[0]) : new Size(0, 0);
    }

    private EGLContext createEGLContext(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, EGLContext eGLContext) throws EGLException {
        int[] iArr = {EGL_CONTEXT_CLIENT_VERSION, i11, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.mEGL.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        throwEGLExceptionIfFailed();
        return eGLContextEglCreateContext;
    }

    public static EGL10Helper createEGLSurface(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface, int i11, int i12) throws EGLException {
        EGL10Helper eGL10Helper = new EGL10Helper(i11, i12);
        try {
            eGL10Helper.initialize(eGLConfig, eGLContext, surface);
            return eGL10Helper;
        } catch (EGLException e11) {
            eGL10Helper.destroy();
            throw e11;
        }
    }

    private void throwEGLExceptionIfFailed() throws EGLException {
        int iEglGetError = this.mEGL.eglGetError();
        if (iEglGetError != 12288) {
            throw new EGLException(iEglGetError);
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void destroy() throws EGLException {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            unmakeCurrent();
            destroySurface();
            EGLContext eGLContext = this.mEGLContext;
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
            if (eGLContext != eGLContext2) {
                LiteavLog.m76087i(this.mTag, "destroy eglContext " + this.mEGLContext);
                this.mEGL.eglDestroyContext(this.mEGLDisplay, this.mEGLContext);
                this.mEGLContext = eGLContext2;
            }
            this.mEGL.eglTerminate(this.mEGLDisplay);
        }
        this.mEGLDisplay = eGLDisplay2;
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void destroySurface() throws EGLException {
        EGLSurface eGLSurface = this.mEGLSurface;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            unmakeCurrent();
            if (!this.mEGL.eglDestroySurface(this.mEGLDisplay, this.mEGLSurface)) {
                throwEGLExceptionIfFailed();
            }
            this.mEGLSurface = eGLSurface2;
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public EGLContext getContext() {
        return this.mEGLContext;
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void makeCurrent() throws EGLException {
        EGL10 egl10 = this.mEGL;
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            return;
        }
        throwEGLExceptionIfFailed();
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void unmakeCurrent() {
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.mEGL;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
    }

    private EGL10Helper(int i11, int i12) {
        this.mWidth = i11;
        this.mHeight = i12;
    }

    private void initialize(EGLConfig eGLConfig, EGLContext eGLContext, Surface surface) throws EGLException {
        int[] iArr;
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.mEGL = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.mEGLDisplay = eGLDisplayEglGetDisplay;
        int i11 = 2;
        this.mEGL.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
        if (eGLConfig == null) {
            int[] iArr2 = new int[1];
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (surface == null) {
                iArr = ATTRIBUTES_FOR_OFFSCREEN_SURFACE;
            } else {
                iArr = ATTRIBUTES_FOR_SURFACE;
            }
            this.mEGL.eglChooseConfig(this.mEGLDisplay, iArr, eGLConfigArr, 1, iArr2);
            this.mEGLConfig = eGLConfigArr[0];
        } else {
            this.mEGLConfig = eGLConfig;
        }
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
            try {
                this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 2, eGLContext);
            } catch (EGLException unused) {
                LiteavLog.m76087i(this.mTag, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                i11 = 3;
                this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 3, eGLContext);
            }
        } else {
            this.mEGLContext = createEGLContext(this.mEGLDisplay, this.mEGLConfig, 2, eGLContext);
        }
        LiteavLog.m76087i(this.mTag, "create eglContext " + this.mEGLContext + " sharedContext: " + eGLContext + " version:" + i11);
        if (surface == null) {
            this.mEGLSurface = this.mEGL.eglCreatePbufferSurface(this.mEGLDisplay, this.mEGLConfig, new int[]{12375, this.mWidth, 12374, this.mHeight, 12344});
        } else {
            try {
                this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, surface, null);
            } catch (Throwable th2) {
                throw new EGLException(this.mEGL.eglGetError(), "", th2);
            }
        }
        if (this.mEGLSurface == EGL10.EGL_NO_SURFACE) {
            throwEGLExceptionIfFailed();
        }
        EGL10 egl11 = this.mEGL;
        EGLDisplay eGLDisplay = this.mEGLDisplay;
        EGLSurface eGLSurface = this.mEGLSurface;
        if (!egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.mEGLContext)) {
            throwEGLExceptionIfFailed();
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void swapBuffers() throws EGLException {
        GLES20.glFinish();
        if (!this.mEGL.eglSwapBuffers(this.mEGLDisplay, this.mEGLSurface)) {
            throwEGLExceptionIfFailed();
        }
    }

    @Override // com.tencent.ugc.videobase.egl.EGLHelper
    public void updateSurface(Object obj) throws EGLException {
        destroySurface();
        this.mEGLSurface = this.mEGL.eglCreateWindowSurface(this.mEGLDisplay, this.mEGLConfig, obj, null);
        throwEGLExceptionIfFailed();
    }
}
