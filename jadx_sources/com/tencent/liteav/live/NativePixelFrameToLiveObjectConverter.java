package com.tencent.liteav.live;

import android.os.Looper;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("liteav")
public class NativePixelFrameToLiveObjectConverter {
    public static ByteBuffer createByteBuffer(int i11) {
        return ByteBuffer.allocateDirect(i11);
    }

    public static long getGLContextNativeHandle(Object obj) {
        return OpenGlUtils.getGLContextNativeHandle(obj);
    }

    public static boolean isInUIThread() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
