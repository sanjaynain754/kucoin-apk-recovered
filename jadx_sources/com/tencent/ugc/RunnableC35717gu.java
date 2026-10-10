package com.tencent.ugc;

import com.tencent.liteav.base.util.EnumC34747l;

/* JADX INFO: renamed from: com.tencent.ugc.gu */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35717gu implements Runnable {

    /* JADX INFO: renamed from: a */
    private final UGCVideoProcessor f77137a;

    /* JADX INFO: renamed from: b */
    private final EnumC34747l f77138b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79211a(UGCVideoProcessor uGCVideoProcessor, EnumC34747l enumC34747l) {
        return new RunnableC35717gu(uGCVideoProcessor, enumC34747l);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77137a.mRotation = this.f77138b;
    }

    private RunnableC35717gu(UGCVideoProcessor uGCVideoProcessor, EnumC34747l enumC34747l) {
        this.f77137a = uGCVideoProcessor;
        this.f77138b = enumC34747l;
    }
}
