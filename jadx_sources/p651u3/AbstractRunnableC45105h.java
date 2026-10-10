package p651u3;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: u3.h */
/* JADX INFO: compiled from: StatefulRunnable.java */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractRunnableC45105h<T> implements Runnable {

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f101515b = new AtomicInteger(0);

    /* JADX INFO: renamed from: b */
    public abstract void mo9585b(T t11);

    /* JADX INFO: renamed from: c */
    public abstract T mo9586c() throws Exception;

    /* JADX INFO: renamed from: d */
    public abstract void mo9655d();

    /* JADX INFO: renamed from: e */
    public abstract void mo9656e(Exception exc);

    /* JADX INFO: renamed from: f */
    public abstract void mo9597f(T t11);

    /* JADX INFO: renamed from: a */
    public void m99725a() {
        if (this.f101515b.compareAndSet(0, 2)) {
            mo9655d();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f101515b.compareAndSet(0, 1)) {
            try {
                T tMo9586c = mo9586c();
                this.f101515b.set(3);
                try {
                    mo9597f(tMo9586c);
                } finally {
                    mo9585b(tMo9586c);
                }
            } catch (Exception e11) {
                this.f101515b.set(4);
                mo9656e(e11);
            }
        }
    }
}
