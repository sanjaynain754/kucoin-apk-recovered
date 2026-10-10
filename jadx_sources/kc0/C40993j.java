package kc0;

import hc0.C38168a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: kc0.j */
/* JADX INFO: compiled from: RetryQueue.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40993j {

    /* JADX INFO: renamed from: a */
    public final DelayQueue<DelayedC40992i> f91110a = new DelayQueue<>();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f91111b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c */
    public volatile boolean f91112c = false;

    /* JADX INFO: renamed from: b */
    public boolean m89807b() {
        return this.f91112c;
    }

    /* JADX INFO: renamed from: c */
    public void m89808c(DelayedC40992i delayedC40992i) {
        this.f91111b.incrementAndGet();
        try {
            if (this.f91112c) {
                throw new IllegalStateException("cannot put after the retry queue was closed");
            }
            this.f91110a.put(delayedC40992i);
            this.f91111b.decrementAndGet();
        } catch (Throwable th2) {
            this.f91111b.decrementAndGet();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m89809d() {
        return this.f91111b.get() > 0;
    }

    /* JADX INFO: renamed from: e */
    public List<DelayedC40992i> m89810e() {
        if (!this.f91112c) {
            throw new IllegalStateException("cannot get the remaining batches before the retry queue closed");
        }
        while (m89809d()) {
        }
        ArrayList arrayList = new ArrayList(this.f91110a);
        this.f91110a.clear();
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public List<DelayedC40992i> m89806a(long j11) {
        long jCurrentTimeMillis = System.currentTimeMillis() + j11;
        ArrayList arrayList = new ArrayList();
        this.f91110a.drainTo(arrayList);
        if (arrayList.isEmpty()) {
            while (j11 >= 0) {
                try {
                    DelayedC40992i delayedC40992i = (DelayedC40992i) this.f91110a.poll(j11, TimeUnit.MILLISECONDS);
                    if (delayedC40992i == null) {
                        break;
                    }
                    arrayList.add(delayedC40992i);
                    this.f91110a.drainTo(arrayList);
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                    j11 = jCurrentTimeMillis - System.currentTimeMillis();
                } catch (InterruptedException unused) {
                    C38168a.m86128e("producer", "Interrupted when poll batch from the retry batches");
                }
            }
        }
        return arrayList;
    }
}
