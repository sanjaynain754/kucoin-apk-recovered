package com.tencent.liteav.videoproducer2.capture;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.VirtualDisplayWrapper;

/* JADX INFO: renamed from: com.tencent.liteav.videoproducer2.capture.j */
/* JADX INFO: loaded from: classes59.dex */
public final class C34981j {

    /* JADX INFO: renamed from: g */
    private static BaseBridge.BaseBridgeCallback f74797g;

    /* JADX INFO: renamed from: a */
    Surface f74798a;

    /* JADX INFO: renamed from: b */
    MediaProjection f74799b;

    /* JADX INFO: renamed from: c */
    int f74800c;

    /* JADX INFO: renamed from: d */
    int f74801d;

    /* JADX INFO: renamed from: e */
    VirtualDisplayWrapper f74802e;

    /* JADX INFO: renamed from: f */
    VirtualDisplayListener f74803f = new VirtualDisplayListener() { // from class: com.tencent.liteav.videoproducer2.capture.j.1
        @Override // com.tencent.rtmp.video.VirtualDisplayListener
        public final void onCaptureError() {
            if (C34981j.this.f74804h != null) {
                C34981j.this.f74804h.onCaptureError();
            }
        }

        @Override // com.tencent.rtmp.video.VirtualDisplayListener
        public final void onStartFinish(boolean z11, boolean z12) {
            if (C34981j.this.f74804h != null) {
                C34981j.this.f74804h.onStartFinish(z11, z12);
            }
        }

        @Override // com.tencent.rtmp.video.VirtualDisplayListener
        public final void onVirtualDisplayCreate(VirtualDisplayWrapper virtualDisplayWrapper) {
            C34981j.this.f74802e = virtualDisplayWrapper;
        }
    };

    /* JADX INFO: renamed from: h */
    private NativeScreenCaptureListener f74804h;

    static {
        C34972a c34972a = new C34972a();
        f74797g = c34972a;
        BaseBridge.setBaseBridgeCallback(c34972a);
    }

    public C34981j(Surface surface, int i11, int i12, MediaProjection mediaProjection, NativeScreenCaptureListener nativeScreenCaptureListener) {
        this.f74798a = surface;
        this.f74799b = mediaProjection;
        this.f74804h = nativeScreenCaptureListener;
        this.f74800c = i11;
        this.f74801d = i12;
    }
}
