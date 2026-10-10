package com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class l111l1111l1Il extends Thread {
    private final BlockingQueue<l111l1111lI1l<?>> l1111l111111Il;
    private final l11l1111I11l l111l11111I1l;
    private volatile boolean l111l11111Il = false;
    private final l111l11111Il l111l11111lIl;

    private void l111l11111lIl() {
        l111l11111lIl(this.l1111l111111Il.take());
    }

    public final void l1111l111111Il() {
        this.l111l11111Il = true;
        interrupt();
    }

    @TargetApi(14)
    private static void l1111l111111Il(l111l1111lI1l<?> l111l1111li1l) {
        TrafficStats.setThreadStatsTag(l111l1111li1l.l111l1111l1Il());
    }

    private void l111l11111lIl(l111l1111lI1l<?> l111l1111li1l) {
        SystemClock.elapsedRealtime();
        l111l1111li1l.l1111l111111Il(3);
        try {
            l111l1111li1l.l1111l111111Il("network-queue-take");
            if (l111l1111li1l.l11l1111I11l()) {
                l111l1111li1l.l111l11111lIl("network-discard-cancelled");
                return;
            }
            TrafficStats.setThreadStatsTag(l111l1111li1l.l111l1111l1Il());
            l11l1111lIIl<?> l11l1111liilL1111l111111Il = this.l111l11111lIl.l1111l111111Il(l111l1111li1l);
            l111l1111li1l.l1111l111111Il("network-http-complete");
            l111l1111li1l.l11l11IlIIll();
            this.l111l11111I1l.l1111l111111Il(l111l1111li1l, l11l1111liilL1111l111111Il);
        } catch (l11l1111I1ll e11) {
            this.l111l11111I1l.l1111l111111Il(l111l1111li1l, e11);
        } catch (Exception e12) {
            l11l1111Il.l1111l111111Il(e12, "Unhandled exception %s", e12.toString());
            this.l111l11111I1l.l1111l111111Il(l111l1111li1l, ((e12 instanceof IllegalArgumentException) && TextUtils.equals(e12.getMessage(), "body is null")) ? new l11l1111I1ll("body is null", -3) : new l11l1111I1ll(e12, -4));
        } finally {
            l111l1111li1l.l1111l111111Il(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                l111l11111lIl(this.l1111l111111Il.take());
            } catch (InterruptedException unused) {
                if (this.l111l11111Il) {
                    Thread.currentThread().interrupt();
                    return;
                }
                l11l1111Il.l111l11111I1l("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public l111l1111l1Il(BlockingQueue<l111l1111lI1l<?>> blockingQueue, l111l11111Il l111l11111il, l11l1111I11l l11l1111i11l) {
        this.l1111l111111Il = blockingQueue;
        this.l111l11111lIl = l111l11111il;
        this.l111l11111I1l = l11l1111i11l;
    }
}
