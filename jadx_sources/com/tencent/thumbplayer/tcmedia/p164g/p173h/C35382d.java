package com.tencent.thumbplayer.tcmedia.p164g.p173h;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.g.h.d */
/* JADX INFO: loaded from: classes64.dex */
public final class C35382d {

    /* JADX INFO: renamed from: a */
    private static final Handler f76197a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b */
    private static final ExecutorService f76198b = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: c */
    private static final HandlerThread f76199c;

    /* JADX INFO: renamed from: d */
    private static Handler f76200d;

    static {
        HandlerThread handlerThread = new HandlerThread("tmediacodec-sub");
        f76199c = handlerThread;
        handlerThread.start();
        f76200d = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: b */
    public static void m78351b(Runnable runnable) {
        f76200d.post(runnable);
    }

    /* JADX INFO: renamed from: a */
    public static void m78350a(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            f76198b.execute(runnable);
        } else {
            runnable.run();
        }
    }
}
