package com.tencent.liteav.videobase.egl;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.egl.b */
/* JADX INFO: loaded from: classes59.dex */
public final class C34878b implements InterfaceC34881e<EGLContext> {

    /* JADX INFO: renamed from: h */
    private static final int[] f74228h = {12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: i */
    private static final int[] f74229i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: d */
    private final int f74233d;

    /* JADX INFO: renamed from: e */
    private final int f74234e;

    /* JADX INFO: renamed from: f */
    private EGLConfig f74235f = null;

    /* JADX INFO: renamed from: a */
    EGLDisplay f74230a = EGL14.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: g */
    private EGLContext f74236g = EGL14.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: b */
    EGLSurface f74231b = EGL14.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: c */
    private final String f74232c = "EGL14Helper@" + hashCode();

    /* JADX INFO: renamed from: a */
    public static C34878b m76508a(EGLContext eGLContext, Surface surface, int i11, int i12) throws C34880d {
        C34878b c34878b = new C34878b(i11, i12);
        try {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            c34878b.f74230a = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL14.EGL_NO_DISPLAY) {
                LiteavLog.m76083e(c34878b.f74232c, "unable to get EGL14 display");
                throw new C34880d(0);
            }
            int i13 = 2;
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                c34878b.f74230a = null;
                LiteavLog.m76083e(c34878b.f74232c, "unable to initialize EGL14");
                throw new C34880d(0);
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (!EGL14.eglChooseConfig(c34878b.f74230a, surface == null ? f74229i : f74228h, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new C34880d(0);
            }
            c34878b.f74235f = eGLConfigArr[0];
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    c34878b.f74236g = m76507a(c34878b.f74230a, c34878b.f74235f, 2, eGLContext);
                } catch (C34880d unused) {
                    LiteavLog.m76087i(c34878b.f74232c, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                    c34878b.f74236g = m76507a(c34878b.f74230a, c34878b.f74235f, 3, eGLContext);
                    i13 = 3;
                }
            } else {
                c34878b.f74236g = m76507a(c34878b.f74230a, c34878b.f74235f, 2, eGLContext);
            }
            LiteavLog.m76087i(c34878b.f74232c, "create eglContext " + c34878b.f74236g + " sharedContext: " + eGLContext + " version:" + i13);
            if (surface == null) {
                c34878b.f74231b = EGL14.eglCreatePbufferSurface(c34878b.f74230a, c34878b.f74235f, new int[]{12375, c34878b.f74233d, 12374, c34878b.f74234e, 12344}, 0);
            } else {
                try {
                    c34878b.f74231b = EGL14.eglCreateWindowSurface(c34878b.f74230a, c34878b.f74235f, surface, new int[]{12344}, 0);
                } catch (Throwable th2) {
                    throw new C34880d(EGL14.eglGetError(), "", th2);
                }
            }
            m76509g();
            EGLDisplay eGLDisplay = c34878b.f74230a;
            EGLSurface eGLSurface = c34878b.f74231b;
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c34878b.f74236g)) {
                m76509g();
            }
            return c34878b;
        } catch (C34880d e11) {
            c34878b.mo76503c();
            throw e11;
        }
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: e */
    public final Size mo76505e() {
        int[] iArr = new int[2];
        return (EGL14.eglQuerySurface(this.f74230a, this.f74231b, 12375, iArr, 0) && EGL14.eglQuerySurface(this.f74230a, this.f74231b, 12374, iArr, 1)) ? new Size(iArr[0], iArr[1]) : new Size(0, 0);
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: b */
    public final void mo76502b() throws C34880d {
        EGLDisplay eGLDisplay = this.f74230a;
        EGLSurface eGLSurface = this.f74231b;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f74236g)) {
            return;
        }
        m76509g();
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: c */
    public final void mo76503c() {
        EGLDisplay eGLDisplay = this.f74230a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGLSurface eGLSurface2 = this.f74231b;
            if (eGLSurface2 != EGL14.EGL_NO_SURFACE) {
                EGL14.eglDestroySurface(this.f74230a, eGLSurface2);
                this.f74231b = EGL14.EGL_NO_SURFACE;
            }
            if (this.f74236g != EGL14.EGL_NO_CONTEXT) {
                LiteavLog.m76087i(this.f74232c, "destroy eglContext " + this.f74236g);
                EGL14.eglDestroyContext(this.f74230a, this.f74236g);
                this.f74236g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f74230a);
        }
        this.f74230a = EGL14.EGL_NO_DISPLAY;
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: d */
    public final void mo76504d() {
        EGLDisplay eGLDisplay = this.f74230a;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ EGLContext mo76506f() {
        return this.f74236g;
    }

    private C34878b(int i11, int i12) {
        this.f74233d = i11;
        this.f74234e = i12;
    }

    /* JADX INFO: renamed from: g */
    private static void m76509g() throws C34880d {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
        } else {
            throw new C34880d(iEglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: a */
    public final void mo76501a() throws C34880d {
        GLES20.glFinish();
        if (EGL14.eglSwapBuffers(this.f74230a, this.f74231b)) {
            return;
        }
        m76509g();
    }

    /* JADX INFO: renamed from: a */
    private static EGLContext m76507a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, EGLContext eGLContext) throws C34880d {
        int[] iArr = {12440, i11, 12344};
        if (eGLContext == null) {
            eGLContext = EGL14.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr, 0);
        m76509g();
        return eGLContextEglCreateContext;
    }
}
