package com.tencent.liteav.trtc;

import android.graphics.Bitmap;
import com.tencent.trtc.TRTCCloudListener;

/* JADX INFO: renamed from: com.tencent.liteav.trtc.d */
/* JADX INFO: loaded from: classes59.dex */
final /* synthetic */ class RunnableC34792d implements Runnable {

    /* JADX INFO: renamed from: a */
    private final TRTCCloudListener.TRTCSnapshotListener f73726a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f73727b;

    /* JADX INFO: renamed from: a */
    public static Runnable m76204a(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        return new RunnableC34792d(tRTCSnapshotListener, bitmap);
    }

    @Override // java.lang.Runnable
    public final void run() {
        TrtcCloudJni.lambda$onSnapshotComplete$2(this.f73726a, this.f73727b);
    }

    private RunnableC34792d(TRTCCloudListener.TRTCSnapshotListener tRTCSnapshotListener, Bitmap bitmap) {
        this.f73726a = tRTCSnapshotListener;
        this.f73727b = bitmap;
    }
}
