package com.tencent.liteav.audio2;

/* JADX INFO: renamed from: com.tencent.liteav.audio2.a */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34667a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final AndroidInterruptedStateListener f73345a;

    /* JADX INFO: renamed from: a */
    public static Runnable m75998a(AndroidInterruptedStateListener androidInterruptedStateListener) {
        return new RunnableC34667a(androidInterruptedStateListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AndroidInterruptedStateListener.lambda$registerAudioRecordingCallback$0(this.f73345a);
    }

    private RunnableC34667a(AndroidInterruptedStateListener androidInterruptedStateListener) {
        this.f73345a = androidInterruptedStateListener;
    }
}
