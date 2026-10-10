package com.tencent.liteav.videobase.utils;

import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p130b.C34692b;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.C34742g;
import com.tencent.liteav.base.util.CustomHandler;
import com.tencent.liteav.base.util.LiteavLog;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav::video")
public class SurfaceTextureHolder implements SurfaceTexture.OnFrameAvailableListener {
    private CustomHandler mCallbackHandler;
    private SurfaceTexture.OnFrameAvailableListener mOnFrameAvailableListener;
    private Surface mSurface;
    private SurfaceTexture mSurfaceTexture;
    private final String mTag = "SurfaceTextureHolder_" + Integer.toHexString(hashCode());
    private final C34692b mThrottlers = new C34692b();

    public static /* synthetic */ void lambda$onFrameAvailable$0(SurfaceTextureHolder surfaceTextureHolder, SurfaceTexture surfaceTexture) {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = surfaceTextureHolder.mOnFrameAvailableListener;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(surfaceTexture);
        }
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    public float[] getTransformMatrix(boolean z11, float f11, float f12, float f13, float f14) {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("getTransformMatrix"), this.mTag, "getTransformMatrix, surface texture is released!", new Object[0]);
            return null;
        }
        float[] fArr = new float[16];
        try {
            surfaceTexture.getTransformMatrix(fArr);
        } catch (Throwable th2) {
            LiteavLog.m76092w(this.mThrottlers.m76042a("getTransformMatrix"), this.mTag, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
        }
        if (z11) {
            if (!C34742g.m76112a(f11, 0.0f) || !C34742g.m76112a(f12, 0.0f)) {
                Matrix.translateM(fArr, 0, f11, f12, 0.0f);
            }
            if (!C34742g.m76112a(f13, 1.0f) || !C34742g.m76112a(f14, 1.0f)) {
                Matrix.scaleM(fArr, 0, f13, f14, 1.0f);
            }
        }
        return fArr;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        CustomHandler customHandler = this.mCallbackHandler;
        if (customHandler != null) {
            customHandler.runOrPost(RunnableC34901g.m76564a(this, surfaceTexture));
        }
    }

    public void release() {
        Surface surface = this.mSurface;
        if (surface != null) {
            surface.release();
            this.mSurface = null;
        }
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
    }

    public void setDefaultBufferSize(int i11, int i12) {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("setDefaultBufferSize"), this.mTag, "setDefaultBufferSize, surface texture is released!", new Object[0]);
        } else {
            surfaceTexture.setDefaultBufferSize(i11, i12);
        }
    }

    public void setOnFrameAvailableListener(SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        if (this.mSurfaceTexture == null) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("setOnFrameAvailableListener"), this.mTag, "setOnFrameAvailableListener, surface texture is released!", new Object[0]);
            return;
        }
        this.mCallbackHandler = new CustomHandler(handler != null ? handler.getLooper() : Looper.getMainLooper());
        this.mOnFrameAvailableListener = onFrameAvailableListener;
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
            this.mSurfaceTexture.setOnFrameAvailableListener(this, this.mCallbackHandler);
        } else {
            this.mSurfaceTexture.setOnFrameAvailableListener(this);
        }
    }

    public void updateTexImage() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture == null) {
            LiteavLog.m76082e(this.mThrottlers.m76042a("updateTexImage"), this.mTag, "updateTexImage, surface texture is released!", new Object[0]);
            return;
        }
        try {
            surfaceTexture.updateTexImage();
        } catch (Throwable th2) {
            LiteavLog.m76092w(this.mThrottlers.m76042a("updateTexImage"), this.mTag, "updateTexImage exception: ".concat(String.valueOf(th2)), new Object[0]);
        }
    }

    public SurfaceTextureHolder(int i11, boolean z11) {
        this.mSurfaceTexture = new SurfaceTexture(i11);
        if (z11) {
            this.mSurface = new Surface(this.mSurfaceTexture);
        }
    }
}
