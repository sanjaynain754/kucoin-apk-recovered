package com.tencent.liteav.videobase.utils;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.utils.e */
/* JADX INFO: loaded from: classes59.dex */
public final class C34899e {

    /* JADX INFO: renamed from: a */
    public final String f74320a;

    /* JADX INFO: renamed from: b */
    public final String f74321b;

    /* JADX INFO: renamed from: a */
    public static int m76562a(String str, int i11) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        OpenGlUtils.checkGlError("glCompileShader");
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public C34899e(String str, String str2) {
        this.f74320a = str;
        this.f74321b = str2;
    }
}
