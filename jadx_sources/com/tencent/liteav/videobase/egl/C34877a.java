package com.tencent.liteav.videobase.egl;

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

/* JADX INFO: renamed from: com.tencent.liteav.videobase.egl.a */
/* JADX INFO: loaded from: classes59.dex */
public final class C34877a implements InterfaceC34881e<EGLContext> {

    /* JADX INFO: renamed from: i */
    private static final int[] f74218i = {12339, 1, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12344};

    /* JADX INFO: renamed from: j */
    private static final int[] f74219j = {12339, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12352, 4, 12610, 1, 12344};

    /* JADX INFO: renamed from: b */
    private final int f74221b;

    /* JADX INFO: renamed from: c */
    private final int f74222c;

    /* JADX INFO: renamed from: g */
    private EGL10 f74226g;

    /* JADX INFO: renamed from: h */
    private EGLConfig f74227h;

    /* JADX INFO: renamed from: d */
    private EGLDisplay f74223d = EGL10.EGL_NO_DISPLAY;

    /* JADX INFO: renamed from: e */
    private EGLContext f74224e = EGL10.EGL_NO_CONTEXT;

    /* JADX INFO: renamed from: f */
    private EGLSurface f74225f = EGL10.EGL_NO_SURFACE;

    /* JADX INFO: renamed from: a */
    private final String f74220a = "EGL10Helper@" + hashCode();

    /* JADX INFO: renamed from: a */
    public static C34877a m76497a(EGLContext eGLContext, Surface surface, int i11, int i12) throws C34880d {
        C34877a c34877a = new C34877a(i11, i12);
        try {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            c34877a.f74226g = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            c34877a.f74223d = eGLDisplayEglGetDisplay;
            int i13 = 2;
            c34877a.f74226g.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            c34877a.f74226g.eglChooseConfig(c34877a.f74223d, surface == null ? f74218i : f74219j, eGLConfigArr, 1, new int[1]);
            c34877a.f74227h = eGLConfigArr[0];
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 18) {
                try {
                    c34877a.f74224e = c34877a.m76498a(c34877a.f74223d, c34877a.f74227h, 2, eGLContext);
                } catch (C34880d unused) {
                    LiteavLog.m76087i(c34877a.f74220a, "failed to create EGLContext of OpenGL ES 2.0, try 3.0");
                    i13 = 3;
                    c34877a.f74224e = c34877a.m76498a(c34877a.f74223d, c34877a.f74227h, 3, eGLContext);
                }
            } else {
                c34877a.f74224e = c34877a.m76498a(c34877a.f74223d, c34877a.f74227h, 2, eGLContext);
            }
            LiteavLog.m76087i(c34877a.f74220a, "create eglContext " + c34877a.f74224e + " sharedContext: " + eGLContext + " version:" + i13);
            if (surface == null) {
                c34877a.f74225f = c34877a.f74226g.eglCreatePbufferSurface(c34877a.f74223d, c34877a.f74227h, new int[]{12375, c34877a.f74221b, 12374, c34877a.f74222c, 12344});
            } else {
                try {
                    c34877a.f74225f = c34877a.f74226g.eglCreateWindowSurface(c34877a.f74223d, c34877a.f74227h, surface, null);
                } catch (Throwable th2) {
                    throw new C34880d(c34877a.f74226g.eglGetError(), "", th2);
                }
            }
            if (c34877a.f74225f == EGL10.EGL_NO_SURFACE) {
                c34877a.m76500h();
            }
            EGL10 egl11 = c34877a.f74226g;
            EGLDisplay eGLDisplay = c34877a.f74223d;
            EGLSurface eGLSurface = c34877a.f74225f;
            if (!egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, c34877a.f74224e)) {
                c34877a.m76500h();
            }
            return c34877a;
        } catch (C34880d e11) {
            c34877a.mo76503c();
            throw e11;
        }
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: e */
    public final Size mo76505e() {
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        return (this.f74226g.eglQuerySurface(this.f74223d, this.f74225f, 12375, iArr) && this.f74226g.eglQuerySurface(this.f74223d, this.f74225f, 12374, iArr2)) ? new Size(iArr[0], iArr2[0]) : new Size(0, 0);
    }

    /* JADX INFO: renamed from: g */
    private void m76499g() throws C34880d {
        EGLSurface eGLSurface = this.f74225f;
        EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
        if (eGLSurface != eGLSurface2) {
            mo76504d();
            if (!this.f74226g.eglDestroySurface(this.f74223d, this.f74225f)) {
                m76500h();
            }
            this.f74225f = eGLSurface2;
        }
    }

    /* JADX INFO: renamed from: h */
    private void m76500h() throws C34880d {
        int iEglGetError = this.f74226g.eglGetError();
        if (iEglGetError != 12288) {
            throw new C34880d(iEglGetError);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: b */
    public final void mo76502b() throws C34880d {
        EGL10 egl10 = this.f74226g;
        EGLDisplay eGLDisplay = this.f74223d;
        EGLSurface eGLSurface = this.f74225f;
        if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f74224e)) {
            return;
        }
        m76500h();
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: c */
    public final void mo76503c() throws C34880d {
        EGLDisplay eGLDisplay = this.f74223d;
        EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
        if (eGLDisplay != eGLDisplay2) {
            mo76504d();
            m76499g();
            EGLContext eGLContext = this.f74224e;
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
            if (eGLContext != eGLContext2) {
                LiteavLog.m76087i(this.f74220a, "destroy eglContext " + this.f74224e);
                this.f74226g.eglDestroyContext(this.f74223d, this.f74224e);
                this.f74224e = eGLContext2;
            }
            this.f74226g.eglTerminate(this.f74223d);
        }
        this.f74223d = eGLDisplay2;
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: d */
    public final void mo76504d() {
        EGLDisplay eGLDisplay = this.f74223d;
        if (eGLDisplay != EGL10.EGL_NO_DISPLAY) {
            EGL10 egl10 = this.f74226g;
            EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
            egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
        }
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ EGLContext mo76506f() {
        return this.f74224e;
    }

    private C34877a(int i11, int i12) {
        this.f74221b = i11;
        this.f74222c = i12;
    }

    @Override // com.tencent.liteav.videobase.egl.InterfaceC34881e
    /* JADX INFO: renamed from: a */
    public final void mo76501a() throws C34880d {
        GLES20.glFinish();
        if (this.f74226g.eglSwapBuffers(this.f74223d, this.f74225f)) {
            return;
        }
        m76500h();
    }

    /* JADX INFO: renamed from: a */
    private EGLContext m76498a(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i11, EGLContext eGLContext) throws C34880d {
        int[] iArr = {12440, i11, 12344};
        if (eGLContext == null) {
            eGLContext = EGL10.EGL_NO_CONTEXT;
        }
        EGLContext eGLContextEglCreateContext = this.f74226g.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        m76500h();
        return eGLContextEglCreateContext;
    }
}
