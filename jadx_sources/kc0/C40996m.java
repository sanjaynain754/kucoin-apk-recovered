package kc0;

import hc0.C38168a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import jc0.C40384b;

/* JADX INFO: renamed from: kc0.m */
/* JADX INFO: compiled from: TimerSendBatchTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40996m extends C40991h {

    /* JADX INFO: renamed from: b */
    public final C40384b f91120b;

    /* JADX INFO: renamed from: c */
    public final C40987d f91121c;

    /* JADX INFO: renamed from: d */
    public final C40993j f91122d;

    /* JADX INFO: renamed from: e */
    public final BlockingQueue<DelayedC40992i> f91123e;

    /* JADX INFO: renamed from: f */
    public final BlockingQueue<DelayedC40992i> f91124f;

    /* JADX INFO: renamed from: g */
    public final C40995l f91125g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f91126h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f91127i;

    /* JADX INFO: renamed from: b */
    public final RunnableC40994k m89822b(DelayedC40992i delayedC40992i) {
        return new RunnableC40994k(delayedC40992i, this.f91120b, this.f91122d, this.f91123e, this.f91124f, this.f91126h);
    }

    /* JADX INFO: renamed from: c */
    public final void m89823c() {
        C40986c c40986cM89780g = this.f91121c.m89780g();
        Iterator<DelayedC40992i> it = c40986cM89780g.m89771b().iterator();
        while (it.hasNext()) {
            this.f91125g.m89821a(m89822b(it.next()));
        }
        Iterator<DelayedC40992i> it2 = this.f91122d.m89806a(c40986cM89780g.m89772c()).iterator();
        while (it2.hasNext()) {
            this.f91125g.m89821a(m89822b(it2.next()));
        }
    }

    /* JADX INFO: renamed from: d */
    public final List<DelayedC40992i> m89824d() {
        List<DelayedC40992i> listM89782i = this.f91121c.m89782i();
        listM89782i.addAll(this.f91122d.m89810e());
        return listM89782i;
    }

    /* JADX INFO: renamed from: e */
    public final void m89825e() {
        while (!this.f91127i) {
            try {
                m89823c();
            } catch (Exception e11) {
                C38168a.m86124a("producer", C38168a.m86126c("Uncaught exception in timer batch send task, e=%s", e11.getMessage()));
            }
        }
    }

    public C40996m(String str, boolean z11, C40384b c40384b, C40987d c40987d, C40993j c40993j, BlockingQueue<DelayedC40992i> blockingQueue, BlockingQueue<DelayedC40992i> blockingQueue2, C40995l c40995l, AtomicInteger atomicInteger) {
        super(str, z11);
        this.f91120b = c40384b;
        this.f91121c = c40987d;
        this.f91122d = c40993j;
        this.f91123e = blockingQueue;
        this.f91124f = blockingQueue2;
        this.f91125g = c40995l;
        this.f91126h = atomicInteger;
        this.f91127i = false;
    }

    /* JADX INFO: renamed from: f */
    public final void m89826f(List<DelayedC40992i> list) {
        Iterator<DelayedC40992i> it = list.iterator();
        while (it.hasNext()) {
            this.f91125g.m89821a(m89822b(it.next()));
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        m89825e();
        m89826f(m89824d());
    }
}
