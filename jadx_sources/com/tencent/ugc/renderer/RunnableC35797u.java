package com.tencent.ugc.renderer;

import android.graphics.Matrix;
import com.tencent.ugc.videobase.base.TakeSnapshotListener;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.tencent.ugc.renderer.u */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC35797u implements Runnable {

    /* JADX INFO: renamed from: a */
    private final VideoRenderer f77315a;

    /* JADX INFO: renamed from: b */
    private final ByteBuffer f77316b;

    /* JADX INFO: renamed from: c */
    private final int f77317c;

    /* JADX INFO: renamed from: d */
    private final int f77318d;

    /* JADX INFO: renamed from: e */
    private final Matrix f77319e;

    /* JADX INFO: renamed from: f */
    private final TakeSnapshotListener f77320f;

    /* JADX INFO: renamed from: a */
    public static Runnable m79284a(VideoRenderer videoRenderer, ByteBuffer byteBuffer, int i11, int i12, Matrix matrix, TakeSnapshotListener takeSnapshotListener) {
        return new RunnableC35797u(videoRenderer, byteBuffer, i11, i12, matrix, takeSnapshotListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f77315a.notifySnapshotCompleted(this.f77316b, this.f77317c, this.f77318d, this.f77319e, this.f77320f);
    }

    private RunnableC35797u(VideoRenderer videoRenderer, ByteBuffer byteBuffer, int i11, int i12, Matrix matrix, TakeSnapshotListener takeSnapshotListener) {
        this.f77315a = videoRenderer;
        this.f77316b = byteBuffer;
        this.f77317c = i11;
        this.f77318d = i12;
        this.f77319e = matrix;
        this.f77320f = takeSnapshotListener;
    }
}
