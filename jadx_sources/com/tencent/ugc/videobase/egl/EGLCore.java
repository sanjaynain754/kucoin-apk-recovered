package com.tencent.ugc.videobase.egl;

import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34748m;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class EGLCore {
    private static final long DESTROY_EGL_CORE_DELAY_TIME_MS = 100;
    private static final int MAX_EGL_CORE_COUNT = 50;
    private static final String TAG = "EGLCore";
    private EGLHelper<?> mEglHelper;
    private boolean mIsOffScreen = false;
    private static final C34748m sSequenceTaskRunner = new C34748m();
    private static final AtomicInteger sEGLCoreCount = new AtomicInteger();

    public static boolean makeCurrent(EGLCore eGLCore) {
        if (eGLCore == null) {
            return false;
        }
        try {
            eGLCore.makeCurrent();
            return true;
        } catch (EGLException e11) {
            LiteavLog.m76083e(TAG, "make current failed. " + e11.getMessage());
            return false;
        }
    }

    public void initialize(Object obj, Surface surface, int i11, int i12) throws EGLException {
        this.mIsOffScreen = surface == null;
        if (obj == null) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
                this.mEglHelper = EGL14Helper.createEGLSurface(null, null, surface, i11, i12);
            } else {
                this.mEglHelper = EGL10Helper.createEGLSurface(null, null, surface, i11, i12);
            }
        } else if (obj instanceof EGLContext) {
            this.mEglHelper = EGL10Helper.createEGLSurface(null, (EGLContext) obj, surface, i11, i12);
        } else {
            if (LiteavSystemInfo.getSystemOSVersionInt() < 17 || !(obj instanceof android.opengl.EGLContext)) {
                throw new EGLException(0, "sharedContext isn't EGLContext");
            }
            this.mEglHelper = EGL14Helper.createEGLSurface(null, (android.opengl.EGLContext) obj, surface, i11, i12);
        }
        LiteavLog.m76087i(TAG, "EGLCore created in thread " + Thread.currentThread().getId() + ", sharedContext: " + obj + ", Surface: " + surface + ", width: " + i11 + ", height: " + i12 + ", eglCoreCount: " + sEGLCoreCount.incrementAndGet());
    }

    public static EGLCore create(Object obj) {
        EGLCore eGLCore = new EGLCore();
        try {
            eGLCore.initialize(obj, null, 128, 128);
            eGLCore.makeCurrent();
            return eGLCore;
        } catch (EGLException e11) {
            LiteavLog.m76084e(TAG, "create EGLCore failed.", e11);
            return null;
        }
    }

    public static void destroy(EGLCore eGLCore) {
        if (eGLCore == null) {
            return;
        }
        eGLCore.unmakeCurrent();
        Runnable runnableM79300a = RunnableC35814a.m79300a(eGLCore);
        if (eGLCore.mIsOffScreen) {
            sSequenceTaskRunner.m76136b(runnableM79300a, DESTROY_EGL_CORE_DELAY_TIME_MS);
        } else {
            runnableM79300a.run();
        }
    }

    public static /* synthetic */ void lambda$destroy$0(EGLCore eGLCore) {
        try {
            eGLCore.uninitialize();
            LiteavLog.m76087i(TAG, "EGLCore destroy success. ".concat(String.valueOf(eGLCore)));
        } catch (EGLException e11) {
            LiteavLog.m76084e(TAG, "EGLCore destroy failed.", e11);
        }
    }

    private void uninitialize() throws EGLException {
        EGLHelper<?> eGLHelper = this.mEglHelper;
        if (eGLHelper != null) {
            eGLHelper.destroy();
            this.mEglHelper = null;
        }
        sEGLCoreCount.decrementAndGet();
    }

    public Object getEglContext() {
        EGLHelper<?> eGLHelper = this.mEglHelper;
        if (eGLHelper == null) {
            return null;
        }
        return eGLHelper.getContext();
    }

    public Size getSurfaceSize() {
        EGLHelper<?> eGLHelper = this.mEglHelper;
        return eGLHelper == null ? new Size(0, 0) : eGLHelper.getSurfaceSize();
    }

    public void swapBuffers() throws EGLException {
        EGLHelper<?> eGLHelper = this.mEglHelper;
        if (eGLHelper != null) {
            eGLHelper.swapBuffers();
        }
    }

    public void unmakeCurrent() {
        EGLHelper<?> eGLHelper = this.mEglHelper;
        if (eGLHelper != null) {
            eGLHelper.unmakeCurrent();
        }
    }

    public void makeCurrent() throws EGLException {
        EGLHelper<?> eGLHelper = this.mEglHelper;
        if (eGLHelper != null) {
            eGLHelper.makeCurrent();
        }
    }
}
