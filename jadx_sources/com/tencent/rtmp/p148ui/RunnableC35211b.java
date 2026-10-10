package com.tencent.rtmp.p148ui;

import android.graphics.Color;

/* JADX INFO: renamed from: com.tencent.rtmp.ui.b */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35211b implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TXCloudVideoView f75427a;

    /* JADX INFO: renamed from: b */
    private final int f75428b;

    /* JADX INFO: renamed from: c */
    private final int f75429c;

    /* JADX INFO: renamed from: d */
    private final int f75430d;

    /* JADX INFO: renamed from: e */
    private final int f75431e;

    /* JADX INFO: renamed from: a */
    public static Runnable m77299a(TXCloudVideoView tXCloudVideoView, int i11, int i12, int i13, int i14) {
        return new RunnableC35211b(tXCloudVideoView, i11, i12, i13, i14);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75427a.setBackgroundColor(Color.argb(this.f75428b, this.f75429c, this.f75430d, this.f75431e));
    }

    private RunnableC35211b(TXCloudVideoView tXCloudVideoView, int i11, int i12, int i13, int i14) {
        this.f75427a = tXCloudVideoView;
        this.f75428b = i11;
        this.f75429c = i12;
        this.f75430d = i13;
        this.f75431e = i14;
    }
}
