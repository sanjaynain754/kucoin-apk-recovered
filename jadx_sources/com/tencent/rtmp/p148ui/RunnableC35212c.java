package com.tencent.rtmp.p148ui;

/* JADX INFO: renamed from: com.tencent.rtmp.ui.c */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35212c implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCloudVideoView f75432a;

    /* JADX INFO: renamed from: b */
    private final int f75433b;

    /* JADX INFO: renamed from: c */
    private final int f75434c;

    /* JADX INFO: renamed from: d */
    private final int f75435d;

    /* JADX INFO: renamed from: e */
    private final int f75436e;

    /* JADX INFO: renamed from: a */
    public static Runnable m77300a(TXCloudVideoView tXCloudVideoView, int i11, int i12, int i13, int i14) {
        return new RunnableC35212c(tXCloudVideoView, i11, i12, i13, i14);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75432a.showFocusViewInternal(this.f75433b, this.f75434c, this.f75435d, this.f75436e);
    }

    private RunnableC35212c(TXCloudVideoView tXCloudVideoView, int i11, int i12, int i13, int i14) {
        this.f75432a = tXCloudVideoView;
        this.f75433b = i11;
        this.f75434c = i12;
        this.f75435d = i13;
        this.f75436e = i14;
    }
}
