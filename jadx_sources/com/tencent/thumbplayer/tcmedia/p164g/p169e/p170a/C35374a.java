package com.tencent.thumbplayer.tcmedia.p164g.p169e.p170a;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import com.tencent.thumbplayer.tcmedia.p164g.p167c.C35368a;
import com.tencent.thumbplayer.tcmedia.p164g.p167c.C35369b;
import com.tencent.thumbplayer.tcmedia.p164g.p173h.C35380b;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.e.a.a */
/* JADX INFO: loaded from: classes64.dex */
public class C35374a implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    EGL10 f76146a;

    /* JADX INFO: renamed from: b */
    EGLDisplay f76147b;

    /* JADX INFO: renamed from: c */
    EGLContext f76148c;

    /* JADX INFO: renamed from: d */
    EGLSurface f76149d;

    /* JADX INFO: renamed from: e */
    C35369b f76150e;

    /* JADX INFO: renamed from: f */
    Surface f76151f;

    /* JADX INFO: renamed from: g */
    Object f76152g = new Object();

    /* JADX INFO: renamed from: h */
    boolean f76153h;

    /* JADX INFO: renamed from: i */
    C35375b f76154i;

    public C35374a() {
        m78304a();
    }

    /* JADX INFO: renamed from: a */
    public void m78304a() {
        C35375b c35375b = new C35375b();
        this.f76154i = c35375b;
        c35375b.m78314b();
        C35369b c35369b = new C35369b(this.f76154i.m78312a());
        this.f76150e = c35369b;
        c35369b.m78287a(new C35369b.a() { // from class: com.tencent.thumbplayer.tcmedia.g.e.a.a.1
            @Override // com.tencent.thumbplayer.tcmedia.p164g.p167c.C35369b.a
            /* JADX INFO: renamed from: a */
            public void mo78288a() {
                C35380b.m78334b("OutputSurface", "mSurfaceTexture:" + C35374a.this.f76150e + " onReleased, release OutputSurface");
                C35374a.this.m78307b();
            }
        });
        this.f76150e.setOnFrameAvailableListener(this);
        this.f76151f = new C35368a(this.f76150e);
    }

    public C35374a(int i11, int i12) {
        if (i11 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException();
        }
        m78305a(i11, i12);
        m78308c();
        m78304a();
    }

    /* JADX INFO: renamed from: a */
    public void m78305a(int i11, int i12) {
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        this.f76146a = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        this.f76147b = eGLDisplayEglGetDisplay;
        if (!this.f76146a.eglInitialize(eGLDisplayEglGetDisplay, null)) {
            throw new RuntimeException("unable to initialize EGL10");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!this.f76146a.eglChooseConfig(this.f76147b, new int[]{12324, 8, 12323, 8, 12322, 8, 12339, 1, 12352, 4, 12344}, eGLConfigArr, 1, new int[1])) {
            throw new RuntimeException("unable to find RGB888+pbuffer EGL config");
        }
        this.f76148c = this.f76146a.eglCreateContext(this.f76147b, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
        m78306a("eglCreateContext");
        if (this.f76148c == null) {
            throw new RuntimeException("null context");
        }
        this.f76149d = this.f76146a.eglCreatePbufferSurface(this.f76147b, eGLConfigArr[0], new int[]{12375, i11, 12374, i12, 12344});
        m78306a("eglCreatePbufferSurface");
        if (this.f76149d == null) {
            throw new RuntimeException("surface was null");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m78307b() {
        EGL10 egl10 = this.f76146a;
        if (egl10 != null) {
            if (egl10.eglGetCurrentContext().equals(this.f76148c)) {
                EGL10 egl11 = this.f76146a;
                EGLDisplay eGLDisplay = this.f76147b;
                EGLSurface eGLSurface = EGL10.EGL_NO_SURFACE;
                egl11.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            }
            this.f76146a.eglDestroySurface(this.f76147b, this.f76149d);
            this.f76146a.eglDestroyContext(this.f76147b, this.f76148c);
        }
        this.f76151f.release();
        this.f76147b = null;
        this.f76148c = null;
        this.f76149d = null;
        this.f76146a = null;
        this.f76154i = null;
        this.f76151f = null;
        this.f76150e = null;
    }

    /* JADX INFO: renamed from: c */
    public void m78308c() {
        if (this.f76146a == null) {
            throw new RuntimeException("not configured for makeCurrent");
        }
        m78306a("before makeCurrent");
        EGL10 egl10 = this.f76146a;
        EGLDisplay eGLDisplay = this.f76147b;
        EGLSurface eGLSurface = this.f76149d;
        if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f76148c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    /* JADX INFO: renamed from: d */
    public Surface m78309d() {
        return this.f76151f;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.f76152g) {
            try {
                if (this.f76153h) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                this.f76153h = true;
                this.f76152g.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m78306a(String str) {
        boolean z11 = false;
        while (true) {
            int iEglGetError = this.f76146a.eglGetError();
            if (iEglGetError == 12288) {
                break;
            }
            Log.e("OutputSurface", str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
            z11 = true;
        }
        if (z11) {
            throw new RuntimeException("EGL error encountered (see log)");
        }
    }
}
