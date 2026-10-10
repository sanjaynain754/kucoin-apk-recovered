package com.tencent.thumbplayer.tcmedia.p164g.p169e.p170a;

import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import androidx.work.Data;
import com.tencent.bugly.proguard.C33627eb;
import com.tencent.bugly.proguard.C33844oi;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.e.a.b */
/* JADX INFO: loaded from: classes64.dex */
public class C35375b {

    /* JADX INFO: renamed from: a */
    private final float[] f76156a;

    /* JADX INFO: renamed from: b */
    private FloatBuffer f76157b;

    /* JADX INFO: renamed from: e */
    private int f76160e;

    /* JADX INFO: renamed from: g */
    private int f76162g;

    /* JADX INFO: renamed from: h */
    private int f76163h;

    /* JADX INFO: renamed from: i */
    private int f76164i;

    /* JADX INFO: renamed from: j */
    private int f76165j;

    /* JADX INFO: renamed from: c */
    private float[] f76158c = new float[16];

    /* JADX INFO: renamed from: d */
    private float[] f76159d = new float[16];

    /* JADX INFO: renamed from: f */
    private int f76161f = -12345;

    /* JADX INFO: renamed from: a */
    public int m78312a() {
        return this.f76161f;
    }

    /* JADX INFO: renamed from: a */
    private int m78310a(int i11, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        m78313a("glCreateShader type=".concat(String.valueOf(i11)));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("TextureRender", "Could not compile shader " + i11 + C33844oi.f71346o);
        StringBuilder sb2 = new StringBuilder(C33627eb.f69716f);
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("TextureRender", sb2.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public void m78314b() {
        int iM78311a = m78311a("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.f76160e = iM78311a;
        if (iM78311a == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.f76164i = GLES20.glGetAttribLocation(iM78311a, "aPosition");
        m78313a("glGetAttribLocation aPosition");
        if (this.f76164i == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.f76165j = GLES20.glGetAttribLocation(this.f76160e, "aTextureCoord");
        m78313a("glGetAttribLocation aTextureCoord");
        if (this.f76165j == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.f76162g = GLES20.glGetUniformLocation(this.f76160e, "uMVPMatrix");
        m78313a("glGetUniformLocation uMVPMatrix");
        if (this.f76162g == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.f76163h = GLES20.glGetUniformLocation(this.f76160e, "uSTMatrix");
        m78313a("glGetUniformLocation uSTMatrix");
        if (this.f76163h == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i11 = iArr[0];
        this.f76161f = i11;
        GLES20.glBindTexture(36197, i11);
        m78313a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9728.0f);
        GLES20.glTexParameterf(36197, Data.MAX_DATA_BYTES, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m78313a("glTexParameter");
    }

    public C35375b() {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.f76156a = fArr;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f76157b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(this.f76159d, 0);
    }

    /* JADX INFO: renamed from: a */
    private int m78311a(String str, String str2) {
        int iM78310a;
        int iM78310a2 = m78310a(35633, str);
        if (iM78310a2 == 0 || (iM78310a = m78310a(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m78313a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            Log.e("TextureRender", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM78310a2);
        m78313a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM78310a);
        m78313a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        Log.e("TextureRender", "Could not link program: ");
        Log.e("TextureRender", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public void m78313a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        Log.e("TextureRender", str + ": glError " + iGlGetError);
        throw new RuntimeException(str + ": glError " + iGlGetError);
    }
}
