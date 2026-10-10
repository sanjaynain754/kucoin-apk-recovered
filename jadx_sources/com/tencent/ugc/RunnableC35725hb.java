package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.hb */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35725hb implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77154a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f77155b;

    /* JADX INFO: renamed from: c */
    private final float f77156c;

    /* JADX INFO: renamed from: d */
    private final Bitmap f77157d;

    /* JADX INFO: renamed from: e */
    private final float f77158e;

    /* JADX INFO: renamed from: f */
    private final float f77159f;

    /* JADX INFO: renamed from: a */
    public static Runnable m79219a(UGCVideoProcessor uGCVideoProcessor, Bitmap bitmap, float f11, Bitmap bitmap2, float f12, float f13) {
        return new RunnableC35725hb(uGCVideoProcessor, bitmap, f11, bitmap2, f12, f13);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77154a.mVideoProcessManager.setFilter(this.f77155b, this.f77156c, this.f77157d, this.f77158e, this.f77159f);
    }

    private RunnableC35725hb(UGCVideoProcessor uGCVideoProcessor, Bitmap bitmap, float f11, Bitmap bitmap2, float f12, float f13) {
        this.f77154a = uGCVideoProcessor;
        this.f77155b = bitmap;
        this.f77156c = f11;
        this.f77157d = bitmap2;
        this.f77158e = f12;
        this.f77159f = f13;
    }
}
