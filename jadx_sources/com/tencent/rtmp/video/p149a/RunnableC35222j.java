package com.tencent.rtmp.video.p149a;

import android.view.Surface;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayWrapper;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.j */
/* JADX INFO: loaded from: classes56.dex */
public final /* synthetic */ class RunnableC35222j implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C35218f f75475a;

    /* JADX INFO: renamed from: b */
    private final Surface f75476b;

    /* JADX INFO: renamed from: a */
    public static Runnable m77320a(C35218f c35218f, Surface surface) {
        return new RunnableC35222j(c35218f, surface);
    }

    @Override // java.lang.Runnable
    public final void run() {
        VirtualDisplayWrapper virtualDisplayWrapper;
        C35218f c35218f = this.f75475a;
        Surface surface = this.f75476b;
        if (surface != null) {
            C35218f.a aVarRemove = c35218f.f75455d.remove(surface);
            if (aVarRemove != null && (virtualDisplayWrapper = aVarRemove.f75466e) != null) {
                virtualDisplayWrapper.release();
                BaseBridge.printLog("VirtualDisplayManager", "VirtualDisplay released, " + aVarRemove.f75466e);
            }
            c35218f.m77315c();
        }
    }

    private RunnableC35222j(C35218f c35218f, Surface surface) {
        this.f75475a = c35218f;
        this.f75476b = surface;
    }
}
