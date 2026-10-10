package com.tencent.ugc;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: com.tencent.ugc.br */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35545br implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76849a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f76850b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79044a(TXVideoEditer tXVideoEditer, Bitmap bitmap) {
        return new RunnableC35545br(tXVideoEditer, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TXVideoEditer.lambda$setFilter$5(this.f76849a, this.f76850b);
    }

    private RunnableC35545br(TXVideoEditer tXVideoEditer, Bitmap bitmap) {
        this.f76849a = tXVideoEditer;
        this.f76850b = bitmap;
    }
}
