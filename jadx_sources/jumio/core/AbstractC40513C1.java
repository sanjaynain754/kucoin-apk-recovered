package jumio.core;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.C1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractC40513C1 {

    /* JADX INFO: renamed from: a */
    public final int f89932a;

    /* JADX INFO: renamed from: b */
    public int f89933b;

    /* JADX INFO: renamed from: c */
    public int f89934c;

    /* JADX INFO: renamed from: d */
    public int f89935d;

    /* JADX INFO: renamed from: e */
    public int f89936e;

    /* JADX INFO: renamed from: f */
    public int f89937f;

    /* JADX INFO: renamed from: g */
    public int f89938g;

    /* JADX INFO: renamed from: h */
    public int f89939h;

    /* JADX INFO: renamed from: a */
    public final void m89151a(float f11, float f12) {
        int i11 = this.f89935d;
        if (i11 == -1) {
            return;
        }
        GLES20.glUniform2f(i11, f11, f12);
        AbstractC40538H1.m89184b("glUniform2f");
    }

    /* JADX INFO: renamed from: b */
    public void mo89153b() {
        GLES20.glUseProgram(this.f89932a);
        AbstractC40538H1.m89184b("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.f89937f);
        AbstractC40538H1.m89184b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f89937f, 2, 5126, false, 0, (Buffer) AbstractC40538H1.f89996f);
        AbstractC40538H1.m89184b("glVertexAttribPointer");
        float[] transformMat = new float[16];
        Matrix.setIdentityM(transformMat, 0);
        Intrinsics.checkNotNullParameter(transformMat, "transformMat");
        GLES20.glUniformMatrix4fv(this.f89933b, 1, false, transformMat, 0);
        AbstractC40538H1.m89184b("glUniformMatrix4fv");
        int i11 = this.f89934c;
        if (i11 == -1) {
            return;
        }
        GLES20.glUniform1f(i11, 1.0f);
        AbstractC40538H1.m89184b("glUniform1f");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab  */
    public AbstractC40513C1(String vertexShaderSource, String fragmentShaderSource) {
        int iM89182b;
        int iM89182b2;
        int iGlCreateProgram;
        Intrinsics.checkNotNullParameter(vertexShaderSource, "vertexShaderSource");
        Intrinsics.checkNotNullParameter(fragmentShaderSource, "fragmentShaderSource");
        this.f89933b = -1;
        this.f89934c = -1;
        this.f89935d = -1;
        this.f89936e = -1;
        this.f89937f = -1;
        this.f89938g = -1;
        this.f89939h = -1;
        try {
            iM89182b = AbstractC40538H1.m89182b(35633, vertexShaderSource);
            try {
                iM89182b2 = AbstractC40538H1.m89182b(35632, fragmentShaderSource);
                try {
                    iGlCreateProgram = GLES20.glCreateProgram();
                    try {
                        AbstractC40538H1.m89184b("glCreateProgram");
                        GLES20.glAttachShader(iGlCreateProgram, iM89182b);
                        AbstractC40538H1.m89184b("glAttachShader");
                        GLES20.glAttachShader(iGlCreateProgram, iM89182b2);
                        AbstractC40538H1.m89184b("glAttachShader");
                        GLES20.glLinkProgram(iGlCreateProgram);
                        int[] iArr = new int[1];
                        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                        if (iArr[0] == 1) {
                            this.f89932a = iGlCreateProgram;
                            mo89149a();
                        } else {
                            throw new IllegalStateException(("Could not link program: " + GLES20.glGetProgramInfoLog(iGlCreateProgram)).toString());
                        }
                    } catch (IllegalArgumentException e11) {
                        e = e11;
                        if (iM89182b != -1) {
                            GLES20.glDeleteShader(iM89182b);
                        }
                        if (iM89182b2 != -1) {
                            GLES20.glDeleteShader(iM89182b2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    } catch (IllegalStateException e12) {
                        e = e12;
                        if (iM89182b != -1) {
                            GLES20.glDeleteShader(iM89182b);
                        }
                        if (iM89182b2 != -1) {
                            GLES20.glDeleteShader(iM89182b2);
                        }
                        if (iGlCreateProgram != -1) {
                            GLES20.glDeleteProgram(iGlCreateProgram);
                        }
                        throw e;
                    }
                } catch (IllegalArgumentException e13) {
                    e = e13;
                    iGlCreateProgram = -1;
                } catch (IllegalStateException e14) {
                    e = e14;
                    iGlCreateProgram = -1;
                }
            } catch (IllegalArgumentException e15) {
                e = e15;
                iM89182b2 = -1;
                iGlCreateProgram = iM89182b2;
                if (iM89182b != -1) {
                    GLES20.glDeleteShader(iM89182b);
                }
                if (iM89182b2 != -1) {
                    GLES20.glDeleteShader(iM89182b2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            } catch (IllegalStateException e16) {
                e = e16;
                iM89182b2 = -1;
                iGlCreateProgram = iM89182b2;
                if (iM89182b != -1) {
                    GLES20.glDeleteShader(iM89182b);
                }
                if (iM89182b2 != -1) {
                    GLES20.glDeleteShader(iM89182b2);
                }
                if (iGlCreateProgram != -1) {
                    GLES20.glDeleteProgram(iGlCreateProgram);
                }
                throw e;
            }
        } catch (IllegalArgumentException e17) {
            e = e17;
            iM89182b = -1;
            iM89182b2 = -1;
        } catch (IllegalStateException e18) {
            e = e18;
            iM89182b = -1;
            iM89182b2 = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m89150a(float f11) {
        int i11 = this.f89938g;
        if (i11 == -1) {
            return;
        }
        GLES20.glUniform1f(i11, f11);
        AbstractC40538H1.m89184b("glUniform1f");
    }

    /* JADX INFO: renamed from: a */
    public final void m89152a(int i11) {
        int i12 = this.f89939h;
        if (i12 == -1) {
            return;
        }
        GLES20.glUniform1i(i12, i11);
        AbstractC40538H1.m89184b("glUniform1i");
    }

    /* JADX INFO: renamed from: a */
    public void mo89149a() {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f89932a, "aPosition");
        this.f89937f = iGlGetAttribLocation;
        AbstractC40538H1.m89177a(iGlGetAttribLocation, "aPosition");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f89932a, "uTransMatrix");
        this.f89933b = iGlGetUniformLocation;
        AbstractC40538H1.m89177a(iGlGetUniformLocation, "uTransMatrix");
        this.f89934c = GLES20.glGetUniformLocation(this.f89932a, "uAlphaScale");
        this.f89935d = GLES20.glGetUniformLocation(this.f89932a, "uResolution");
        this.f89936e = GLES20.glGetUniformLocation(this.f89932a, "uScaleFactor");
        this.f89938g = GLES20.glGetUniformLocation(this.f89932a, "uIntensity");
        this.f89939h = GLES20.glGetUniformLocation(this.f89932a, "uRadius");
    }

    /* JADX INFO: renamed from: b */
    public final void m89154b(float f11) {
        int i11 = this.f89936e;
        if (i11 == -1) {
            return;
        }
        GLES20.glUniform1f(i11, f11);
        AbstractC40538H1.m89184b("glUniform1f");
    }
}
