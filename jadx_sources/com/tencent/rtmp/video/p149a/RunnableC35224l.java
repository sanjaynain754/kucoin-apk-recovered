package com.tencent.rtmp.video.p149a;

import android.media.projection.MediaProjection;
import com.tencent.rtmp.video.BaseBridge;
import com.tencent.rtmp.video.VirtualDisplayListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.rtmp.video.a.l */
/* JADX INFO: loaded from: classes56.dex */
final /* synthetic */ class RunnableC35224l implements Runnable {

    /* JADX INFO: renamed from: a */
    private final C35218f f75482a;

    /* JADX INFO: renamed from: b */
    private final MediaProjection f75483b;

    /* JADX INFO: renamed from: a */
    public static Runnable m77322a(C35218f c35218f, MediaProjection mediaProjection) {
        return new RunnableC35224l(c35218f, mediaProjection);
    }

    @Override // java.lang.Runnable
    public final void run() {
        C35218f c35218f = this.f75482a;
        MediaProjection mediaProjection = this.f75483b;
        c35218f.f75457f = false;
        if (mediaProjection != null) {
            BaseBridge.printLog("VirtualDisplayManager", "Got session ".concat(String.valueOf(mediaProjection)));
            c35218f.f75456e = mediaProjection;
            mediaProjection.registerCallback(c35218f.f75460i, c35218f.f75453b);
            c35218f.m77314b();
            C35218f.m77310b(c35218f.f75456e);
            c35218f.f75454c.m77302a(c35218f.f75459h, TimeUnit.SECONDS.toMillis(1L));
            return;
        }
        HashMap map = new HashMap(c35218f.f75455d);
        c35218f.f75455d.clear();
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            VirtualDisplayListener virtualDisplayListener = ((C35218f.a) it.next()).f75465d;
            if (virtualDisplayListener != null) {
                virtualDisplayListener.onStartFinish(false, true);
            }
        }
        C35218f.m77311d();
    }

    private RunnableC35224l(C35218f c35218f, MediaProjection mediaProjection) {
        this.f75482a = c35218f;
        this.f75483b = mediaProjection;
    }
}
