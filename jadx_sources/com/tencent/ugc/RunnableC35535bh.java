package com.tencent.ugc;

/* JADX INFO: renamed from: com.tencent.ugc.bh */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35535bh implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXVideoEditer f76826a;

    /* JADX INFO: renamed from: b */
    private final float[] f76827b;

    /* JADX INFO: renamed from: a */
    public static Runnable m79034a(TXVideoEditer tXVideoEditer, float[] fArr) {
        return new RunnableC35535bh(tXVideoEditer, fArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76826a.mAudioProcessor.setVideoVolumes(this.f76827b);
    }

    private RunnableC35535bh(TXVideoEditer tXVideoEditer, float[] fArr) {
        this.f76826a = tXVideoEditer;
        this.f76827b = fArr;
    }
}
