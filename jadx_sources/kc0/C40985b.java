package kc0;

import hc0.C38168a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: kc0.b */
/* JADX INFO: compiled from: BatchHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40985b extends C40991h {

    /* JADX INFO: renamed from: b */
    public final BlockingQueue<DelayedC40992i> f91073b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f91074c;

    /* JADX INFO: renamed from: d */
    public final Semaphore f91075d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f91076e;

    /* JADX INFO: renamed from: c */
    public final void m89768c() {
        ArrayList arrayList = new ArrayList();
        this.f91073b.drainTo(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m89767b((DelayedC40992i) it.next());
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m89769d() {
        while (!this.f91076e) {
            try {
                m89767b(this.f91073b.take());
            } catch (InterruptedException unused) {
                C38168a.m86128e("producer", "The batch handler has been interrupted");
            }
        }
    }

    public C40985b(String str, boolean z11, BlockingQueue<DelayedC40992i> blockingQueue, AtomicInteger atomicInteger, Semaphore semaphore) {
        super(str, z11);
        this.f91073b = blockingQueue;
        this.f91074c = atomicInteger;
        this.f91075d = semaphore;
        this.f91076e = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m89767b(DelayedC40992i delayedC40992i) {
        try {
            delayedC40992i.m89793e();
            this.f91074c.decrementAndGet();
            this.f91075d.release(delayedC40992i.m89794f());
        } catch (Throwable th2) {
            try {
                C38168a.m86124a("producer", C38168a.m86126c("Failed to handle batch, e=%s", th2.getMessage()));
            } finally {
                this.f91074c.decrementAndGet();
                this.f91075d.release(delayedC40992i.m89794f());
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        m89769d();
        m89768c();
    }
}
