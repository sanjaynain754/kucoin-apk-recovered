package com.tencent.rtmp.video.p149a;

import android.view.Surface;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import com.tencent.rtmp.video.VirtualDisplayWrapper;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.k */
/* JADX INFO: loaded from: classes56.dex */
public final /* synthetic */ class RunnableC35223k implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C35218f f75477a;

    /* JADX INFO: renamed from: b */
    private final Surface f75478b;

    /* JADX INFO: renamed from: c */
    private final int f75479c;

    /* JADX INFO: renamed from: d */
    private final int f75480d;

    /* JADX INFO: renamed from: e */
    private final VirtualDisplayListener f75481e;

    /* JADX INFO: renamed from: a */
    public static Runnable m77321a(C35218f c35218f, Surface surface, int i11, int i12, VirtualDisplayListener virtualDisplayListener) {
        return new RunnableC35223k(c35218f, surface, i11, i12, virtualDisplayListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35218f c35218f = this.f75477a;
        Surface surface = this.f75478b;
        int i11 = this.f75479c;
        int i12 = this.f75480d;
        VirtualDisplayListener virtualDisplayListener = this.f75481e;
        if (surface == null || c35218f.f75456e == null) {
            BaseBridge.printLog("VirtualDisplayManager", "Invalid surface or mediaProjection:surface = " + surface + ", mediapProjection = " + c35218f.f75456e);
            virtualDisplayListener.onStartFinish(false, false);
            return;
        }
        C35218f.a aVar = c35218f.f75455d.get(surface);
        if (aVar != null) {
            VirtualDisplayWrapper virtualDisplayWrapper = aVar.f75466e;
            if (virtualDisplayWrapper != null) {
                virtualDisplayWrapper.release();
                BaseBridge.printLog("VirtualDisplayManager", "VirtualDisplay released, " + aVar.f75466e);
            }
            aVar.f75463b = i11;
            aVar.f75464c = i12;
            aVar.f75465d = virtualDisplayListener;
        } else {
            aVar = new C35218f.a((byte) 0);
            aVar.f75462a = surface;
            aVar.f75463b = i11;
            aVar.f75464c = i12;
            aVar.f75465d = virtualDisplayListener;
            aVar.f75466e = null;
            c35218f.f75455d.put(surface, aVar);
        }
        try {
            aVar.f75466e = new VirtualDisplayWrapper(c35218f.f75456e.createVirtualDisplay("TXCScreenCapture", aVar.f75463b, aVar.f75464c, 1, 1, aVar.f75462a, null, null));
            BaseBridge.printLog("VirtualDisplayManager", "update VirtualDisplay success" + aVar.f75466e);
            VirtualDisplayListener virtualDisplayListener2 = aVar.f75465d;
            if (virtualDisplayListener2 != null) {
                virtualDisplayListener2.onVirtualDisplayCreate(aVar.f75466e);
            }
        } catch (Throwable th2) {
            BaseBridge.printLog("VirtualDisplayManager", "update VirtualDisplay error ".concat(String.valueOf(th2)));
        }
    }

    private RunnableC35223k(C35218f c35218f, Surface surface, int i11, int i12, VirtualDisplayListener virtualDisplayListener) {
        this.f75477a = c35218f;
        this.f75478b = surface;
        this.f75479c = i11;
        this.f75480d = i12;
        this.f75481e = virtualDisplayListener;
    }
}
