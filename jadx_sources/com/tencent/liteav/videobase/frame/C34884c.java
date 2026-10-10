package com.tencent.liteav.videobase.frame;

import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.videobase.utils.OpenGlUtils;

/* JADX INFO: renamed from: com.tencent.liteav.videobase.frame.c */
/* JADX INFO: loaded from: classes59.dex */
public final class C34884c {

    /* JADX INFO: renamed from: a */
    private int f74245a = -1;

    /* JADX INFO: renamed from: a */
    public final void m76521a() {
        if (this.f74245a == -1) {
            this.f74245a = OpenGlUtils.generateFrameBufferId();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76524c() {
        int i11 = this.f74245a;
        if (i11 == -1) {
            LiteavLog.m76079d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            OpenGlUtils.detachTextureFromFrameBuffer(i11);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m76525d() {
        int i11 = this.f74245a;
        if (i11 != -1) {
            OpenGlUtils.deleteFrameBuffer(i11);
            this.f74245a = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m76522a(int i11) {
        int i12 = this.f74245a;
        if (i12 == -1) {
            LiteavLog.m76079d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            OpenGlUtils.attachTextureToFrameBuffer(i11, i12);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m76523b() {
        OpenGlUtils.bindFramebuffer(36160, this.f74245a);
    }
}
