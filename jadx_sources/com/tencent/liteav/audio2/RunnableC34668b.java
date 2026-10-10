package com.tencent.liteav.audio2;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.b */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34668b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final AndroidInterruptedStateListener f73346a;

    /* JADX INFO: renamed from: a */
    public static Runnable m75999a(AndroidInterruptedStateListener androidInterruptedStateListener) {
        return new RunnableC34668b(androidInterruptedStateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidInterruptedStateListener.lambda$unregisterAudioRecordingCallback$1(this.f73346a);
    }

    private RunnableC34668b(AndroidInterruptedStateListener androidInterruptedStateListener) {
        this.f73346a = androidInterruptedStateListener;
    }
}
