package com.tencent.thumbplayer.tcmedia.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.o */
/* JADX INFO: loaded from: classes64.dex */
public class C35435o {

    /* JADX INFO: renamed from: a */
    private static volatile HandlerThread f76607a;

    /* JADX INFO: renamed from: b */
    private static volatile Handler f76608b;

    /* JADX INFO: renamed from: c */
    private static int f76609c;

    /* JADX INFO: renamed from: d */
    private static volatile ExecutorService f76610d;

    /* JADX INFO: renamed from: e */
    private static volatile ExecutorService f76611e;

    /* JADX INFO: renamed from: f */
    private static volatile ScheduledExecutorService f76612f;

    /* JADX INFO: renamed from: g */
    private static volatile C35435o f76613g;

    /* JADX INFO: renamed from: a */
    public HandlerThread m78919a(String str) {
        return m78920a(str, 0);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0010, B:13:0x0021, B:15:0x0029, B:16:0x003a, B:10:0x0016, B:12:0x001e), top: B:20:0x0003 }] */
    /* JADX INFO: renamed from: f */
    private static void m78918f() {
        HandlerThread handlerThread;
        synchronized (C35435o.class) {
            try {
                if (f76607a == null) {
                    handlerThread = new HandlerThread("TP-ShareThreadPool");
                    f76607a = handlerThread;
                } else {
                    if (!f76607a.isAlive()) {
                        handlerThread = f76607a;
                    }
                    if (f76607a.getLooper() == null) {
                        f76607a.quit();
                        HandlerThread handlerThread2 = new HandlerThread("TP-ShareThreadPool");
                        f76607a = handlerThread2;
                        handlerThread2.start();
                    }
                }
                handlerThread.start();
                if (f76607a.getLooper() == null) {
                    f76607a.quit();
                    HandlerThread handlerThread3 = new HandlerThread("TP-ShareThreadPool");
                    f76607a = handlerThread3;
                    handlerThread3.start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public HandlerThread m78920a(String str, int i11) {
        if (i11 >= 19 || i11 <= -19) {
            i11 = 0;
        }
        if (TextUtils.isEmpty(str)) {
            str = "TP-HandlerThread";
        }
        HandlerThread handlerThread = new HandlerThread(str, i11);
        handlerThread.start();
        return handlerThread;
    }

    /* JADX INFO: renamed from: c */
    public ExecutorService m78923c() {
        if (f76610d == null) {
            synchronized (C35435o.class) {
                try {
                    if (f76610d == null) {
                        f76610d = Executors.newSingleThreadExecutor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f76610d;
    }

    /* JADX INFO: renamed from: d */
    public ExecutorService m78924d() {
        if (f76611e == null) {
            synchronized (C35435o.class) {
                try {
                    if (f76611e == null) {
                        f76611e = C35436p.m78926a(4, 20);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f76611e;
    }

    /* JADX INFO: renamed from: e */
    public ScheduledExecutorService m78925e() {
        if (f76612f == null) {
            synchronized (C35435o.class) {
                try {
                    if (f76612f == null) {
                        f76612f = Executors.newScheduledThreadPool(4);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f76612f;
    }

    private C35435o() {
    }

    /* JADX INFO: renamed from: a */
    public static C35435o m78917a() {
        if (f76613g == null) {
            synchronized (C35435o.class) {
                try {
                    if (f76613g == null) {
                        f76613g = new C35435o();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f76613g;
    }

    /* JADX INFO: renamed from: b */
    public HandlerThread m78922b() {
        HandlerThread handlerThread;
        m78918f();
        synchronized (C35435o.class) {
            f76609c++;
            TPLogUtil.m78800i("TPPlayer[TPThreadPool]", "handlerThread obtainShareThread mShareThreadCount:" + f76609c);
            handlerThread = f76607a;
        }
        return handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public void m78921a(HandlerThread handlerThread, Handler handler) {
        if (handlerThread == null) {
            return;
        }
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        if (!handlerThread.equals(f76607a)) {
            handlerThread.quit();
            return;
        }
        synchronized (C35435o.class) {
            f76609c--;
            TPLogUtil.m78800i("TPPlayer[TPThreadPool]", "handlerThread recycle mShareThreadCount:" + f76609c);
        }
    }
}
