package com.tencent.ugc.decoder;

import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import com.tencent.ugc.videobase.frame.GLTexture;
import com.tencent.ugc.videobase.frame.GLTexturePool;
import com.tencent.ugc.videobase.frame.HDRType;
import com.tencent.ugc.videobase.frame.PixelFrame;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class UGCHDRToSDRPixelFrameConverterJni {
    private static final String TAG = "UGCHDRToSDRPixelFrameConverterJni";
    private GLTexturePool mGLTexturePool;
    private long mNativeHandler = nativeCreate();

    private static native void nativeConvert(long j11, int i11, int i12, int i13, int i14, int i15);

    private static native long nativeCreate();

    private static native void nativeDestroy(long j11);

    public PixelFrame convert(PixelFrame pixelFrame) {
        if (this.mNativeHandler == 0 || pixelFrame == null) {
            return pixelFrame;
        }
        if (this.mGLTexturePool == null) {
            this.mGLTexturePool = new GLTexturePool();
        }
        GLTexture gLTextureObtain = this.mGLTexturePool.obtain(pixelFrame.getWidth(), pixelFrame.getHeight());
        HDRType hdrType = pixelFrame.getHdrType();
        if (hdrType == null) {
            hdrType = HDRType.NONE;
        }
        nativeConvert(this.mNativeHandler, pixelFrame.getTextureId(), gLTextureObtain.getId(), pixelFrame.getWidth(), pixelFrame.getHeight(), hdrType.getValue());
        PixelFrame pixelFrameWrap = gLTextureObtain.wrap(pixelFrame.getGLContext());
        pixelFrameWrap.setTimestamp(pixelFrame.getTimestamp());
        pixelFrameWrap.setColorFormat(GLConstants.ColorRange.FULL_RANGE, GLConstants.ColorSpace.BT709);
        gLTextureObtain.release();
        pixelFrame.release();
        return pixelFrameWrap;
    }

    public void release() {
        long j11 = this.mNativeHandler;
        if (j11 != 0) {
            nativeDestroy(j11);
            this.mNativeHandler = 0L;
        }
        GLTexturePool gLTexturePool = this.mGLTexturePool;
        if (gLTexturePool != null) {
            gLTexturePool.evictAll();
            this.mGLTexturePool.destroy();
            this.mGLTexturePool = null;
        }
    }

    public UGCHDRToSDRPixelFrameConverterJni() {
        LiteavLog.m76087i(TAG, "native handler is: " + this.mNativeHandler);
    }
}
