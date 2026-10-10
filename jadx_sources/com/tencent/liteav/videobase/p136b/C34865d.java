package com.tencent.liteav.videobase.p136b;

import com.tencent.liteav.videobase.frame.AbstractC34885d;
import com.tencent.liteav.videobase.p135a.C34861a;
import com.tencent.liteav.videobase.utils.OpenGlUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.b.d */
/* JADX INFO: loaded from: classes59.dex */
public final class C34865d extends C34861a {

    /* JADX INFO: renamed from: h */
    private int f74120h = -1;

    /* JADX INFO: renamed from: i */
    private int f74121i = -1;

    /* JADX INFO: renamed from: j */
    private int f74122j = -1;

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: a */
    public final void mo76472a(int i11, AbstractC34885d abstractC34885d, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        super.mo76472a(this.f74122j, abstractC34885d, floatBuffer, floatBuffer2);
    }

    /* JADX INFO: renamed from: a */
    public final void m76480a(Buffer buffer, int i11, int i12) {
        if (this.f74120h != i11 || this.f74121i != i12) {
            this.f74120h = i11;
            this.f74121i = i12;
            OpenGlUtils.deleteTexture(this.f74122j);
            this.f74122j = -1;
        }
        this.f74122j = OpenGlUtils.loadTexture(6408, buffer, i11, i12, this.f74122j);
    }

    @Override // com.tencent.liteav.videobase.p135a.C34861a
    /* JADX INFO: renamed from: c */
    public final void mo76477c() {
        super.mo76477c();
        OpenGlUtils.deleteTexture(this.f74122j);
        this.f74122j = -1;
    }
}
