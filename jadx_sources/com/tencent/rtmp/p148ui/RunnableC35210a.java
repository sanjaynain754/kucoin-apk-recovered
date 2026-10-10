package com.tencent.rtmp.p148ui;

/* JADX INFO: renamed from: com.tencent.rtmp.ui.a */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35210a implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCloudVideoView f75426a;

    /* JADX INFO: renamed from: a */
    public static Runnable m77298a(TXCloudVideoView tXCloudVideoView) {
        return new RunnableC35210a(tXCloudVideoView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75426a.hideIndicatorView();
    }

    private RunnableC35210a(TXCloudVideoView tXCloudVideoView) {
        this.f75426a = tXCloudVideoView;
    }
}
