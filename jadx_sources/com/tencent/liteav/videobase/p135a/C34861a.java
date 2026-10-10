package com.tencent.liteav.videobase.p135a;

import android.opengl.GLES20;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.liteav.videobase.frame.AbstractC34885d;
import com.tencent.liteav.videobase.frame.C34884c;
import com.tencent.liteav.videobase.frame.C34886e;
import com.tencent.liteav.videobase.utils.C34895a;
import com.tencent.liteav.videobase.utils.C34899e;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import com.tencent.ugc.videobase.chain.TXCGPUImageFilter;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.a.a */
/* JADX INFO: loaded from: classes59.dex */
public class C34861a {

    /* JADX INFO: renamed from: h */
    private static final float[] f74101h = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: i */
    private static final AtomicInteger f74102i = new AtomicInteger();

    /* JADX INFO: renamed from: a */
    protected final Size f74103a;

    /* JADX INFO: renamed from: b */
    protected int f74104b;

    /* JADX INFO: renamed from: c */
    protected int f74105c;

    /* JADX INFO: renamed from: d */
    protected int f74106d;

    /* JADX INFO: renamed from: e */
    protected C34886e f74107e;

    /* JADX INFO: renamed from: f */
    public int f74108f;

    /* JADX INFO: renamed from: g */
    public float[] f74109g;

    /* JADX INFO: renamed from: j */
    private final C34895a f74110j;

    /* JADX INFO: renamed from: k */
    private final C34899e f74111k;

    /* JADX INFO: renamed from: l */
    private int f74112l;

    /* JADX INFO: renamed from: m */
    private final C34884c f74113m;

    /* JADX INFO: renamed from: n */
    private boolean f74114n;

    public C34861a() {
        this(TXCGPUImageFilter.NO_FILTER_VERTEX_SHADER, TXCGPUImageFilter.NO_FILTER_FRAGMENT_SHADER);
    }

    /* JADX INFO: renamed from: a */
    public int mo76469a() {
        return 3553;
    }

    /* JADX INFO: renamed from: b */
    public final void m76475b() {
        if (this.f74114n) {
            this.f74110j.m76554a();
            mo76477c();
            this.f74114n = false;
            this.f74113m.m76525d();
            int i11 = this.f74108f;
            if (i11 != -1) {
                GLES20.glDeleteProgram(i11);
                this.f74108f = -1;
            }
            LiteavLog.m76080d("TXCGPUImageFilter", "%s uninitialized, count: %d", this, Integer.valueOf(f74102i.decrementAndGet()));
        }
    }

    public C34861a(String str, String str2) {
        this.f74103a = new Size(-1, -1);
        this.f74108f = -1;
        this.f74113m = new C34884c();
        this.f74110j = new C34895a();
        this.f74111k = new C34899e(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public void mo76470a(int i11) {
    }

    /* JADX INFO: renamed from: a */
    public final void m76473a(C34886e c34886e) {
        if (this.f74114n) {
            return;
        }
        this.f74113m.m76521a();
        C34899e c34899e = this.f74111k;
        int iM76562a = C34899e.m76562a(c34899e.f74320a, 35633);
        int i11 = -1;
        if (iM76562a == 0) {
            LiteavLog.m76083e("Program", "load vertex shader failed.");
        } else {
            int iM76562a2 = C34899e.m76562a(c34899e.f74321b, 35632);
            if (iM76562a2 == 0) {
                LiteavLog.m76083e("Program", "load fragment shader failed.");
                GLES20.glDeleteShader(iM76562a);
            } else {
                int iGlCreateProgram = GLES20.glCreateProgram();
                GLES20.glAttachShader(iGlCreateProgram, iM76562a);
                GLES20.glAttachShader(iGlCreateProgram, iM76562a2);
                GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                if (iArr[0] == 0) {
                    LiteavLog.m76083e("Program", "link program failed. status: " + iArr[0]);
                    GLES20.glDeleteShader(iM76562a);
                    GLES20.glDeleteShader(iM76562a2);
                    GLES20.glDeleteProgram(iGlCreateProgram);
                } else {
                    GLES20.glDeleteShader(iM76562a);
                    GLES20.glDeleteShader(iM76562a2);
                    i11 = iGlCreateProgram;
                }
            }
        }
        this.f74108f = i11;
        this.f74104b = GLES20.glGetAttribLocation(i11, ViewProps.POSITION);
        this.f74105c = GLES20.glGetUniformLocation(this.f74108f, "inputImageTexture");
        this.f74106d = GLES20.glGetAttribLocation(this.f74108f, "inputTextureCoordinate");
        this.f74112l = GLES20.glGetUniformLocation(this.f74108f, "textureTransform");
        mo76476b(c34886e);
        this.f74114n = true;
        LiteavLog.m76080d("TXCGPUImageFilter", "%s initialized, count: %d", this, Integer.valueOf(f74102i.incrementAndGet()));
    }

    /* JADX INFO: renamed from: b */
    public void mo76476b(C34886e c34886e) {
        this.f74107e = c34886e;
    }

    /* JADX INFO: renamed from: c */
    public void mo76477c() {
    }

    /* JADX INFO: renamed from: a */
    public final void m76474a(Runnable runnable) {
        C34895a c34895a = this.f74110j;
        synchronized (c34895a.f74289a) {
            c34895a.f74289a.add(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76471a(int i11, int i12) {
        Size size = this.f74103a;
        size.width = i11;
        size.height = i12;
    }

    /* JADX INFO: renamed from: a */
    public void mo76472a(int i11, AbstractC34885d abstractC34885d, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (this.f74114n) {
            GLES20.glUseProgram(this.f74108f);
            this.f74110j.m76554a();
            floatBuffer.position(0);
            GLES20.glVertexAttribPointer(this.f74104b, 2, 5126, false, 0, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(this.f74104b);
            floatBuffer2.position(0);
            GLES20.glVertexAttribPointer(this.f74106d, 2, 5126, false, 0, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(this.f74106d);
            if (i11 != -1) {
                GLES20.glActiveTexture(33984);
                OpenGlUtils.bindTexture(mo76469a(), i11);
                GLES20.glUniform1i(this.f74105c, 0);
            }
            if (abstractC34885d != null) {
                this.f74113m.m76522a(abstractC34885d.mo76526a());
                this.f74113m.m76523b();
            } else {
                OpenGlUtils.bindFramebuffer(36160, 0);
            }
            float[] fArr = this.f74109g;
            if (fArr == null) {
                fArr = f74101h;
            }
            GLES20.glUniformMatrix4fv(this.f74112l, 1, false, fArr, 0);
            mo76470a(i11);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f74104b);
            GLES20.glDisableVertexAttribArray(this.f74106d);
            GLES20.glActiveTexture(33984);
            OpenGlUtils.bindTexture(mo76469a(), 0);
            if (abstractC34885d != null) {
                OpenGlUtils.bindFramebuffer(36160, 0);
                this.f74113m.m76524c();
            }
        }
    }
}
