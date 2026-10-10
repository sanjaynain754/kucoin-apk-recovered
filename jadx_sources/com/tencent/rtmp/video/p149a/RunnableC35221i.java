package com.tencent.rtmp.video.p149a;

import android.media.projection.MediaProjection;
import android.view.Surface;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.i */
/* JADX INFO: loaded from: classes56.dex */
public final /* synthetic */ class RunnableC35221i implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C35218f f75469a;

    /* JADX INFO: renamed from: b */
    private final Surface f75470b;

    /* JADX INFO: renamed from: c */
    private final int f75471c;

    /* JADX INFO: renamed from: d */
    private final int f75472d;

    /* JADX INFO: renamed from: e */
    private final MediaProjection f75473e;

    /* JADX INFO: renamed from: f */
    private final VirtualDisplayListener f75474f;

    /* JADX INFO: renamed from: a */
    public static Runnable m77319a(C35218f c35218f, Surface surface, int i11, int i12, MediaProjection mediaProjection, VirtualDisplayListener virtualDisplayListener) {
        return new RunnableC35221i(c35218f, surface, i11, i12, mediaProjection, virtualDisplayListener);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35218f c35218f = this.f75469a;
        Surface surface = this.f75470b;
        int i11 = this.f75471c;
        int i12 = this.f75472d;
        MediaProjection mediaProjection = this.f75473e;
        VirtualDisplayListener virtualDisplayListener = this.f75474f;
        if (surface == null) {
            BaseBridge.printLog("VirtualDisplayManager", "surface is null!");
            virtualDisplayListener.onStartFinish(false, false);
            return;
        }
        C35218f.a aVar = new C35218f.a((byte) 0);
        aVar.f75462a = surface;
        aVar.f75463b = i11;
        aVar.f75464c = i12;
        aVar.f75465d = virtualDisplayListener;
        aVar.f75466e = null;
        c35218f.f75455d.put(surface, aVar);
        c35218f.f75454c.m77304c(c35218f.f75459h);
        MediaProjection mediaProjection2 = c35218f.f75456e;
        if (mediaProjection2 == null && mediaProjection == null) {
            if (c35218f.f75457f) {
                c35218f.f75454c.m77304c(c35218f.f75458g);
                c35218f.f75454c.m77302a(c35218f.f75458g, TimeUnit.SECONDS.toMillis(1L));
                return;
            } else {
                c35218f.f75457f = true;
                C35218f.m77309a();
                return;
            }
        }
        if (mediaProjection == null || mediaProjection2 == mediaProjection) {
            c35218f.m77314b();
        } else {
            BaseBridge.printLog("VirtualDisplayManager", "start capture with media projection from user:".concat(String.valueOf(mediaProjection)));
            c35218f.m77313a(mediaProjection);
        }
    }

    private RunnableC35221i(C35218f c35218f, Surface surface, int i11, int i12, MediaProjection mediaProjection, VirtualDisplayListener virtualDisplayListener) {
        this.f75469a = c35218f;
        this.f75470b = surface;
        this.f75471c = i11;
        this.f75472d = i12;
        this.f75473e = mediaProjection;
        this.f75474f = virtualDisplayListener;
    }
}
