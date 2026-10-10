package com.tencent.ugc;

import android.opengl.GLES20;

/* JADX INFO: renamed from: com.tencent.ugc.fj */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35679fj implements Runnable {

    /* JADX INFO: renamed from: a */
    private final int f77085a;

    /* JADX INFO: renamed from: b */
    private final float[] f77086b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79173a(int i11, float[] fArr) {
        return new RunnableC35679fj(i11, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        GLES20.glUniformMatrix4fv(this.f77085a, 1, false, this.f77086b, 0);
    }

    private RunnableC35679fj(int i11, float[] fArr) {
        this.f77085a = i11;
        this.f77086b = fArr;
    }
}
