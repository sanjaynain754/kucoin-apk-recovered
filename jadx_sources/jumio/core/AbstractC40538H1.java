package jumio.core;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.view.Surface;
import androidx.camera.core.processing.util.GLUtils;
import androidx.work.Data;
import com.jumio.commons.camera.renderer.opengl.GLUtils$SamplerShaderProgram$Companion;
import com.jumio.commons.camera.renderer.opengl.ShaderProvider;
import com.jumio.commons.camera.renderer.surface.OutputSurface$Companion;
import com.jumio.commons.log.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: jumio.core.H1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40538H1 {

    /* JADX INFO: renamed from: a */
    public static final int[] f89991a = {12344};

    /* JADX INFO: renamed from: b */
    public static final int[] f89992b = {GLUtils.EGL_GL_COLORSPACE_KHR, GLUtils.EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344};

    /* JADX INFO: renamed from: c */
    public static final C40518D1 f89993c = new C40518D1();

    /* JADX INFO: renamed from: d */
    public static final C40523E1 f89994d = new C40523E1();

    /* JADX INFO: renamed from: e */
    public static final C40528F1 f89995e = new C40528F1();

    /* JADX INFO: renamed from: f */
    public static final FloatBuffer f89996f;

    /* JADX INFO: renamed from: g */
    public static final FloatBuffer f89997g;

    /* JADX INFO: renamed from: h */
    public static final AbstractC40524E2 f89998h;

    /* JADX INFO: renamed from: a */
    public static EGLSurface m89175a(EGLDisplay eglDisplay, EGLConfig eglConfig, Surface surface, int[] surfaceAttrib) {
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        Intrinsics.checkNotNullParameter(surface, "surface");
        Intrinsics.checkNotNullParameter(surfaceAttrib, "surfaceAttrib");
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eglDisplay, eglConfig, surface, surfaceAttrib, 0);
        m89178a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* JADX INFO: renamed from: b */
    public static int m89182b(int i11, String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int iGlCreateShader = GLES20.glCreateShader(i11);
        m89184b("glCreateShader type=" + i11);
        GLES20.glShaderSource(iGlCreateShader, source);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.m14484w(GLUtils.TAG, "Could not compile shader: ".concat(source));
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i11 + ':' + GLES20.glGetShaderInfoLog(iGlCreateShader));
    }

    static {
        float[] coords = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        Intrinsics.checkNotNullParameter(coords, "coords");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(coords);
        floatBufferAsFloatBuffer.position(0);
        Intrinsics.checkNotNull(floatBufferAsFloatBuffer);
        f89996f = floatBufferAsFloatBuffer;
        float[] coords2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        Intrinsics.checkNotNullParameter(coords2, "coords");
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(coords2);
        floatBufferAsFloatBuffer2.position(0);
        Intrinsics.checkNotNull(floatBufferAsFloatBuffer2);
        f89997g = floatBufferAsFloatBuffer2;
        OutputSurface$Companion outputSurface$Companion = AbstractC40524E2.f89955a;
        EGLSurface EGL_NO_SURFACE = EGL14.EGL_NO_SURFACE;
        Intrinsics.checkNotNullExpressionValue(EGL_NO_SURFACE, "EGL_NO_SURFACE");
        f89998h = outputSurface$Companion.m14460of(EGL_NO_SURFACE, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static EGLSurface m89174a(EGLDisplay eglDisplay, EGLConfig eglConfig) {
        Intrinsics.checkNotNullParameter(eglDisplay, "eglDisplay");
        Intrinsics.checkNotNullParameter(eglConfig, "eglConfig");
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglDisplay, eglConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        m89178a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    /* JADX INFO: renamed from: a */
    public static HashMap m89176a(C40654e1 dynamicRange, Map shaderProviderOverrides) {
        Object c40533g1;
        EnumC40508B1 inputFormat;
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        Intrinsics.checkNotNullParameter(shaderProviderOverrides, "shaderProviderOverrides");
        HashMap map = new HashMap();
        for (EnumC40508B1 inputFormat2 : EnumC40508B1.f89925e) {
            ShaderProvider shaderProvider = (ShaderProvider) shaderProviderOverrides.get(inputFormat2);
            if (shaderProvider != null) {
                c40533g1 = new C40533G1(dynamicRange, shaderProvider);
            } else if (inputFormat2 != EnumC40508B1.YUV && inputFormat2 != (inputFormat = EnumC40508B1.DEFAULT)) {
                String str = "Unhandled input format: " + inputFormat2;
                if (inputFormat2 == EnumC40508B1.UNKNOWN) {
                    if (dynamicRange.m89253a()) {
                        c40533g1 = new C40503A1();
                    } else {
                        ShaderProvider shaderProvider2 = (ShaderProvider) shaderProviderOverrides.get(inputFormat);
                        if (shaderProvider2 != null) {
                            c40533g1 = new C40533G1(dynamicRange, shaderProvider2);
                        } else {
                            Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
                            Intrinsics.checkNotNullParameter(inputFormat, "inputFormat");
                            c40533g1 = new C40533G1(dynamicRange, GLUtils$SamplerShaderProgram$Companion.access$resolveDefaultShaderProvider(C40533G1.f89974l, dynamicRange, inputFormat));
                        }
                    }
                } else {
                    Intrinsics.checkNotNull(str);
                    throw new IllegalStateException(str.toString());
                }
            } else {
                Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
                Intrinsics.checkNotNullParameter(inputFormat2, "inputFormat");
                c40533g1 = new C40533G1(dynamicRange, GLUtils$SamplerShaderProgram$Companion.access$resolveDefaultShaderProvider(C40533G1.f89974l, dynamicRange, inputFormat2));
            }
            Log.m14463d(GLUtils.TAG, "Shader program for input format " + inputFormat2 + " created: " + c40533g1);
            map.put(inputFormat2, c40533g1);
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static void m89184b(String op2) {
        Intrinsics.checkNotNullParameter(op2, "op");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException((op2 + ": GL error 0x" + Integer.toHexString(iGlGetError)).toString());
    }

    /* JADX INFO: renamed from: b */
    public static String m89183b() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                String strGroup2 = matcher.group(2);
                if (strGroup2 != null) {
                    return strGroup + '.' + strGroup2;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        return GLUtils.VERSION_UNKNOWN;
    }

    /* JADX INFO: renamed from: a */
    public static int m89173a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        m89184b("glGenTextures");
        int i11 = iArr[0];
        GLES20.glBindTexture(36197, i11);
        m89184b("glBindTexture " + i11);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, Data.MAX_DATA_BYTES, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m89184b("glTexParameter");
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static void m89177a(int i11, String label) {
        Intrinsics.checkNotNullParameter(label, "label");
        if (i11 >= 0) {
            return;
        }
        throw new IllegalStateException(("Unable to locate '" + label + "' in program").toString());
    }

    /* JADX INFO: renamed from: a */
    public static void m89178a(String op2) {
        Intrinsics.checkNotNullParameter(op2, "op");
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException((op2 + ": EGL error: 0x" + Integer.toHexString(iEglGetError)).toString());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m89180a(AtomicBoolean initialized, boolean z11) {
        String str;
        Intrinsics.checkNotNullParameter(initialized, "initialized");
        boolean z12 = z11 == initialized.get();
        if (z11) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        if (!z12) {
            Log.m14484w(GLUtils.TAG, str);
        }
        return !z12;
    }

    /* JADX INFO: renamed from: a */
    public static void m89179a(Thread thread) {
        if (thread == Thread.currentThread()) {
            return;
        }
        Intrinsics.checkNotNull("Method call must be called on the GL thread.");
        throw new IllegalStateException("Method call must be called on the GL thread.");
    }

    /* JADX INFO: renamed from: a */
    public static int[] m89181a(String eglExtensions, C40654e1 dynamicRange) {
        Intrinsics.checkNotNullParameter(eglExtensions, "eglExtensions");
        Intrinsics.checkNotNullParameter(dynamicRange, "dynamicRange");
        int[] iArr = f89991a;
        if (dynamicRange.f90259a == 3) {
            if (StringsKt.contains$default((CharSequence) eglExtensions, (CharSequence) "EGL_EXT_gl_colorspace_bt2020_hlg", false, 2, (Object) null)) {
                return f89992b;
            }
            Log.m14484w(GLUtils.TAG, "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg. Fallback to default colorspace.");
        }
        return iArr;
    }
}
