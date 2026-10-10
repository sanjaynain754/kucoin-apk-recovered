package com.tencent.ugc.videobase.utils;

import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import androidx.work.Data;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.system.LiteavSystemInfo;
import com.tencent.liteav.base.util.EnumC34747l;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.base.GLConstants;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: loaded from: classes2.dex */
@JNINamespace("liteav::ugc")
public class OpenGlUtils {
    private static final String TAG = "OpenGlUtils";

    public static int createTexture(int i11, int i12, int i13, int i14) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        LiteavLog.m76079d(TAG, "glGenTextures textureId: " + iArr[0]);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexImage2D(3553, 0, i13, i11, i12, 0, i14, 5121, null);
        return iArr[0];
    }

    public static void deleteFrameBuffer(int i11) {
        if (i11 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i11}, 0);
        }
    }

    public static void deleteShaderId(int i11) {
        if (i11 != -1) {
            GLES20.glDeleteShader(i11);
        }
    }

    public static void deleteTexture(int i11) {
        if (i11 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i11}, 0);
        }
    }

    private static float flip(float f11) {
        return f11 == 0.0f ? 1.0f : 0.0f;
    }

    public static int generateFrameBufferId() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    public static int generateTextureOES() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static int getGLErrorCount() {
        int i11 = 0;
        while (GLES20.glGetError() != 0) {
            i11++;
        }
        return i11;
    }

    public static int loadTexture(Bitmap bitmap, int i11, boolean z11) {
        int[] iArr = {-1};
        try {
            if (i11 == -1) {
                GLES20.glGenTextures(1, iArr, 0);
                LiteavLog.m76079d(TAG, "glGenTextures textureId: " + iArr[0]);
                bindTexture(3553, iArr[0]);
                GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            } else {
                bindTexture(3553, i11);
                GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
                iArr[0] = i11;
            }
        } catch (Throwable th2) {
            LiteavLog.m76084e(TAG, "loadTexture from bitmap fail.", th2);
        }
        if (z11) {
            try {
                bitmap.recycle();
            } catch (Throwable th3) {
                LiteavLog.m76084e(TAG, "image recycle fail.", th3);
            }
        }
        return iArr[0];
    }

    private static native boolean nativeConvertYuvFormatArrayToArray(int i11, byte[] bArr, int i12, byte[] bArr2, int i13, int i14);

    private static native boolean nativeConvertYuvFormatArrayToBuffer(int i11, byte[] bArr, int i12, ByteBuffer byteBuffer, int i13, int i14);

    private static native boolean nativeConvertYuvFormatBufferToArray(int i11, ByteBuffer byteBuffer, int i12, byte[] bArr, int i13, int i14);

    private static native boolean nativeConvertYuvFormatBufferToBuffer(int i11, ByteBuffer byteBuffer, int i12, ByteBuffer byteBuffer2, int i13, int i14);

    public static native void nativeCopyDataFromByteArrayToByteBuffer(byte[] bArr, ByteBuffer byteBuffer, int i11);

    public static native void nativeCopyDataFromByteBufferToByteArray(ByteBuffer byteBuffer, byte[] bArr, int i11);

    public static native void nativeCopyDataFromByteBufferToByteBuffer(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11);

    public static native void nativeCopyYuvFromByteBufferToByteBuffer(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14, int i15);

    private static native void nativeLoadYuv420ByteArrayToTextures(byte[] bArr, int i11, int i12, int i13, int[] iArr);

    private static native void nativeLoadYuv420ByteBufferToTextures(ByteBuffer byteBuffer, int i11, int i12, int i13, int[] iArr);

    /* JADX INFO: renamed from: com.tencent.ugc.videobase.utils.OpenGlUtils$1 */
    public static /* synthetic */ class C358301 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f77381a;

        static {
            int[] iArr = new int[EnumC34747l.values().length];
            f77381a = iArr;
            try {
                iArr[EnumC34747l.ROTATION_90.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77381a[EnumC34747l.ROTATION_180.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f77381a[EnumC34747l.ROTATION_270.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f77381a[EnumC34747l.NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static FloatBuffer createNormalCubeVerticesBuffer() {
        float[] fArr = GLConstants.f74126d;
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
    }

    public static FloatBuffer createTextureCoordsBuffer(EnumC34747l enumC34747l, boolean z11, boolean z12) {
        float[] fArr = GLConstants.f74127e;
        float[] fArr2 = new float[fArr.length];
        initTextureCoordsBuffer(fArr2, enumC34747l, z11, z12);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr2).position(0);
        return floatBufferAsFloatBuffer;
    }

    public static void initTextureCoordsBuffer(float[] fArr, EnumC34747l enumC34747l, boolean z11, boolean z12) {
        float[] fArr2 = GLConstants.f74127e;
        if (enumC34747l != null) {
            int i11 = C358301.f77381a[enumC34747l.ordinal()];
            if (i11 == 1) {
                fArr2 = GLConstants.f74129g;
            } else if (i11 == 2) {
                fArr2 = GLConstants.f74130h;
            } else if (i11 == 3) {
                fArr2 = GLConstants.f74128f;
            }
        }
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        if (z11) {
            fArr[0] = flip(fArr[0]);
            fArr[2] = flip(fArr[2]);
            fArr[4] = flip(fArr[4]);
            fArr[6] = flip(fArr[6]);
        }
        if (z12) {
            fArr[1] = flip(fArr[1]);
            fArr[3] = flip(fArr[3]);
            fArr[5] = flip(fArr[5]);
            fArr[7] = flip(fArr[7]);
        }
    }

    public static void readPixels(int i11, int i12, int i13, int i14, Object obj) {
        if (obj instanceof Buffer) {
            Buffer buffer = (Buffer) obj;
            buffer.position(0);
            GLES20.glReadPixels(i11, i12, i13, i14, 6408, 5121, buffer);
        } else if (obj instanceof byte[]) {
            GLES20.glReadPixels(i11, i12, i13, i14, 6408, 5121, ByteBuffer.wrap((byte[]) obj));
        } else {
            LiteavLog.m76083e(TAG, "read pixels failed due to unsupport object. ".concat(String.valueOf(obj)));
        }
    }

    public static void attachTextureToFrameBuffer(int i11, int i12) {
        GLES20.glBindFramebuffer(36160, i12);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i11, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public static void bindFramebuffer(int i11, int i12) {
        GLES20.glBindFramebuffer(i11, i12);
    }

    public static void bindTexture(int i11, int i12) {
        GLES20.glBindTexture(i11, i12);
    }

    public static void convertYuvFormat(GLConstants.PixelFormatType pixelFormatType, Object obj, GLConstants.PixelFormatType pixelFormatType2, Object obj2, int i11, int i12) {
        boolean zNativeConvertYuvFormatArrayToArray;
        int value = pixelFormatType.getValue();
        int value2 = pixelFormatType2.getValue();
        boolean z11 = obj instanceof ByteBuffer;
        if (z11 && (obj2 instanceof ByteBuffer)) {
            zNativeConvertYuvFormatArrayToArray = nativeConvertYuvFormatBufferToBuffer(value, (ByteBuffer) obj, value2, (ByteBuffer) obj2, i11, i12);
        } else if (z11 && (obj2 instanceof byte[])) {
            zNativeConvertYuvFormatArrayToArray = nativeConvertYuvFormatBufferToArray(value, (ByteBuffer) obj, value2, (byte[]) obj2, i11, i12);
        } else if ((obj instanceof byte[]) && (obj2 instanceof ByteBuffer)) {
            zNativeConvertYuvFormatArrayToArray = nativeConvertYuvFormatArrayToBuffer(value, (byte[]) obj, value2, (ByteBuffer) obj2, i11, i12);
        } else {
            zNativeConvertYuvFormatArrayToArray = nativeConvertYuvFormatArrayToArray(value, (byte[]) obj, value2, (byte[]) obj2, i11, i12);
        }
        if (zNativeConvertYuvFormatArrayToArray) {
            return;
        }
        throw new IllegalArgumentException("Do not support " + pixelFormatType + " to " + pixelFormatType2);
    }

    public static void detachTextureFromFrameBuffer(int i11) {
        GLES20.glBindFramebuffer(36160, i11);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
        GLES20.glBindFramebuffer(36160, 0);
    }

    public static Object getCurrentContext() {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 17) {
            return EGL14.eglGetCurrentContext();
        }
        return ((EGL10) EGLContext.getEGL()).eglGetCurrentContext();
    }

    public static long getGLContextNativeHandle(Object obj) {
        if (LiteavSystemInfo.getSystemOSVersionInt() >= 17 && (obj instanceof android.opengl.EGLContext)) {
            if (LiteavSystemInfo.getSystemOSVersionInt() >= 21) {
                return ((android.opengl.EGLContext) obj).getNativeHandle();
            }
            return ((android.opengl.EGLContext) obj).getHandle();
        }
        return 0L;
    }

    public static void glViewport(int i11, int i12, int i13, int i14) {
        GLES20.glViewport(i11, i12, i13, i14);
    }

    public static void loadYuv420DataToTextures(ByteBuffer byteBuffer, int i11, int i12, int i13, int[] iArr) {
        if (byteBuffer.isDirect()) {
            nativeLoadYuv420ByteBufferToTextures(byteBuffer, i11, i12, i13, iArr);
        } else {
            nativeLoadYuv420ByteArrayToTextures(byteBuffer.array(), i11, i12, i13, iArr);
        }
    }

    public static int loadTexture(int i11, Buffer buffer, int i12, int i13, int i14) {
        int[] iArr = new int[1];
        if (i14 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            LiteavLog.m76079d(TAG, "glGenTextures textureId: " + iArr[0]);
            bindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, Data.MAX_DATA_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLES20.glTexImage2D(3553, 0, i11, i12, i13, 0, i11, 5121, buffer);
        } else {
            bindTexture(3553, i14);
            GLES20.glTexSubImage2D(3553, 0, 0, 0, i12, i13, i11, 5121, buffer);
            iArr[0] = i14;
        }
        return iArr[0];
    }

    public static void checkGlError(String str) {
    }
}
