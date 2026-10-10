package com.tencent.liteav.videobase.egl;

import android.opengl.EGLContext;
import android.opengl.EGLExt;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class EGLCore {
    private static final long DESTROY_EGL_CORE_DELAY_TIME_MS = 100;
    private static final int MAX_EGL_CORE_COUNT = 50;
    private static final String TAG = "EGLCore";
    private InterfaceC34881e<?> mEglHelper;
    private boolean mIsOffScreen = false;
    private Object mSharedContext;
    private static final C34748m sSequenceTaskRunner = new C34748m();
    private static final AtomicInteger sEGLCoreCount = new AtomicInteger();

    public void initialize(Object obj, Surface surface, int i11, int i12) throws C34880d {
        this.mIsOffScreen = surface == null;
        if (obj == null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                this.mEglHelper = C34878b.m76508a((EGLContext) null, surface, i11, i12);
            } else {
                this.mEglHelper = C34877a.m76497a((javax.microedition.khronos.egl.EGLContext) null, surface, i11, i12);
            }
        } else if (obj instanceof javax.microedition.khronos.egl.EGLContext) {
            this.mEglHelper = C34877a.m76497a((javax.microedition.khronos.egl.EGLContext) obj, surface, i11, i12);
        } else {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof EGLContext)) {
                throw new C34880d(0, "sharedContext isn't EGLContext");
            }
            this.mEglHelper = C34878b.m76508a((EGLContext) obj, surface, i11, i12);
        }
        this.mSharedContext = obj;
        LiteavLog.m76087i(TAG, "EGLCore created in thread " + Thread.currentThread().getId() + ", sharedContext: " + obj + ", Surface: " + surface + ", width: " + i11 + ", height: " + i12 + ", eglCoreCount: " + sEGLCoreCount.incrementAndGet());
    }

    public static EGLCore create(Object obj) {
        EGLCore eGLCore = new EGLCore();
        try {
            eGLCore.initialize(obj, null, 128, 128);
            eGLCore.makeCurrent();
            return eGLCore;
        } catch (C34880d e11) {
            LiteavLog.m76084e(TAG, "create EGLCore failed.", e11);
            return null;
        }
    }

    public static void destroy(EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        if (eGLCore.mIsOffScreen) {
            destroyAsync(eGLCore);
        } else {
            destroySync(eGLCore);
        }
    }

    public static void destroyAsync(EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        eGLCore.unmakeCurrent();
        sSequenceTaskRunner.m76136b(RunnableC34879c.m76510a(eGLCore), DESTROY_EGL_CORE_DELAY_TIME_MS);
    }

    public static void destroySync(EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        try {
            eGLCore.unmakeCurrent();
            eGLCore.uninitialize();
            LiteavLog.m76087i(TAG, "EGLCore destroy sync success. ".concat(String.valueOf(eGLCore)));
        } catch (C34880d e11) {
            LiteavLog.m76084e(TAG, "EGLCore destroy sync failed.", e11);
        }
    }

    public static /* synthetic */ void lambda$destroyAsync$0(EGLCore eGLCore) {
        try {
            eGLCore.unmakeCurrent();
            eGLCore.uninitialize();
            LiteavLog.m76087i(TAG, "EGLCore destroy async success. ".concat(String.valueOf(eGLCore)));
        } catch (C34880d e11) {
            LiteavLog.m76084e(TAG, "EGLCore destroy async failed.", e11);
        }
    }

    private void uninitialize() throws C34880d {
        InterfaceC34881e<?> interfaceC34881e = this.mEglHelper;
        if (interfaceC34881e != null) {
            interfaceC34881e.mo76503c();
            this.mEglHelper = null;
        }
        this.mSharedContext = null;
        sEGLCoreCount.decrementAndGet();
    }

    public Object getEglContext() {
        InterfaceC34881e<?> interfaceC34881e = this.mEglHelper;
        if (interfaceC34881e == null) {
            return null;
        }
        return interfaceC34881e.mo76506f();
    }

    public Object getSharedContext() {
        return this.mSharedContext;
    }

    public Size getSurfaceSize() {
        InterfaceC34881e<?> interfaceC34881e = this.mEglHelper;
        return interfaceC34881e == null ? new Size(0, 0) : interfaceC34881e.mo76505e();
    }

    public void makeCurrent() throws C34880d {
        InterfaceC34881e<?> interfaceC34881e = this.mEglHelper;
        if (interfaceC34881e != null) {
            interfaceC34881e.mo76502b();
        }
    }

    public void setPresentationTime(long j11) {
        InterfaceC34881e<?> interfaceC34881e = this.mEglHelper;
        if (interfaceC34881e == null || !(interfaceC34881e instanceof C34878b)) {
            return;
        }
        C34878b c34878b = (C34878b) interfaceC34881e;
        EGLExt.eglPresentationTimeANDROID(c34878b.f74230a, c34878b.f74231b, j11);
    }

    public void swapBuffers() throws C34880d {
        InterfaceC34881e<?> interfaceC34881e = this.mEglHelper;
        if (interfaceC34881e != null) {
            interfaceC34881e.mo76501a();
        }
    }

    public void unmakeCurrent() {
        InterfaceC34881e<?> interfaceC34881e = this.mEglHelper;
        if (interfaceC34881e != null) {
            interfaceC34881e.mo76504d();
        }
    }
}
