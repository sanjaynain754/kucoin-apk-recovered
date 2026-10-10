package kc0;

import com.google.common.util.concurrent.ListenableFuture;
import com.tencentcloudapi.cls.android.producer.errors.LogSizeTooLargeException;
import com.tencentcloudapi.cls.android.producer.errors.ProducerException;
import com.tencentcloudapi.cls.android.producer.errors.TimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import jc0.C40384b;
import jc0.C40386d;
import jc0.InterfaceC40385c;
import oc0.C43019f;

/* JADX INFO: renamed from: kc0.d */
/* JADX INFO: compiled from: LogAccumulator.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C40987d {

    /* JADX INFO: renamed from: l */
    public static final AtomicLong f91079l = new AtomicLong(0);

    /* JADX INFO: renamed from: a */
    public final String f91080a;

    /* JADX INFO: renamed from: b */
    public final C40384b f91081b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f91082c;

    /* JADX INFO: renamed from: e */
    public final C40993j f91084e;

    /* JADX INFO: renamed from: f */
    public final BlockingQueue<DelayedC40992i> f91085f;

    /* JADX INFO: renamed from: g */
    public final BlockingQueue<DelayedC40992i> f91086g;

    /* JADX INFO: renamed from: i */
    public final Semaphore f91088i;

    /* JADX INFO: renamed from: j */
    public final C40995l f91089j;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f91087h = new AtomicInteger(0);

    /* JADX INFO: renamed from: k */
    public final ConcurrentMap<String, a> f91090k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public volatile boolean f91083d = false;

    /* JADX INFO: renamed from: kc0.d$a */
    /* JADX INFO: compiled from: LogAccumulator.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public DelayedC40992i f91091a;

        /* JADX INFO: renamed from: a */
        public void m89783a(C40986c c40986c) {
            DelayedC40992i delayedC40992i = this.f91091a;
            if (delayedC40992i == null) {
                return;
            }
            c40986c.m89770a(delayedC40992i);
            this.f91091a = null;
        }

        /* JADX INFO: renamed from: b */
        public void m89784b(C40995l c40995l, C40384b c40384b, C40993j c40993j, BlockingQueue<DelayedC40992i> blockingQueue, BlockingQueue<DelayedC40992i> blockingQueue2, AtomicInteger atomicInteger) {
            DelayedC40992i delayedC40992i = this.f91091a;
            if (delayedC40992i == null) {
                return;
            }
            c40995l.m89821a(new RunnableC40994k(delayedC40992i, c40384b, c40993j, blockingQueue, blockingQueue2, atomicInteger));
            this.f91091a = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public ListenableFuture<C40386d> m89774a(String str, List<C40989f> list, InterfaceC40385c interfaceC40385c) throws InterruptedException, ProducerException {
        this.f91087h.incrementAndGet();
        try {
            return m89777d(str, list, interfaceC40385c);
        } finally {
            this.f91087h.decrementAndGet();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ListenableFuture<C40386d> m89775b(String str, List<C40989f> list, InterfaceC40385c interfaceC40385c, int i11, a aVar) {
        DelayedC40992i delayedC40992i = aVar.f91091a;
        if (delayedC40992i != null) {
            ListenableFuture<C40386d> listenableFutureM89805q = delayedC40992i.m89805q(list, i11, interfaceC40385c);
            if (listenableFutureM89805q != null) {
                if (aVar.f91091a.m89801m()) {
                    aVar.m89784b(this.f91089j, this.f91081b, this.f91084e, this.f91085f, this.f91086g, this.f91082c);
                }
                return listenableFutureM89805q;
            }
            aVar.m89784b(this.f91089j, this.f91081b, this.f91084e, this.f91085f, this.f91086g, this.f91082c);
        }
        DelayedC40992i delayedC40992i2 = new DelayedC40992i(str, C43019f.m94494a(this.f91080a, f91079l), this.f91081b.m88985c(), this.f91081b.m88984b(), this.f91081b.m88990h(), System.currentTimeMillis());
        aVar.f91091a = delayedC40992i2;
        ListenableFuture<C40386d> listenableFutureM89805q2 = delayedC40992i2.m89805q(list, i11, interfaceC40385c);
        this.f91082c.incrementAndGet();
        if (aVar.f91091a.m89801m()) {
            aVar.m89784b(this.f91089j, this.f91081b, this.f91084e, this.f91085f, this.f91086g, this.f91082c);
        }
        return listenableFutureM89805q2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89776c() {
        return this.f91087h.get() > 0;
    }

    /* JADX INFO: renamed from: d */
    public final ListenableFuture<C40386d> m89777d(String str, List<C40989f> list, InterfaceC40385c interfaceC40385c) throws InterruptedException, ProducerException {
        C40987d c40987d;
        ListenableFuture<C40386d> listenableFutureM89775b;
        if (this.f91083d) {
            throw new IllegalStateException("cannot append after the log accumulator was closed");
        }
        int iM89786a = AbstractC40990g.m89786a(list);
        m89779f(iM89786a);
        long jM88989g = this.f91081b.m88989g();
        if (jM88989g < 0) {
            this.f91088i.acquire(iM89786a);
        } else if (!this.f91088i.tryAcquire(iM89786a, jM88989g, TimeUnit.MILLISECONDS)) {
            throw new TimeoutException("failed to acquire memory within the configured max blocking time " + this.f91081b.m88989g() + " ms");
        }
        try {
            a aVarM89781h = m89781h(str);
            synchronized (aVarM89781h) {
                c40987d = this;
                try {
                    listenableFutureM89775b = c40987d.m89775b(str, list, interfaceC40385c, iM89786a, aVarM89781h);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Exception e11) {
                        e = e11;
                        Exception exc = e;
                        c40987d.f91088i.release(iM89786a);
                        throw new ProducerException(exc);
                    }
                }
            }
            return listenableFutureM89775b;
        } catch (Exception e12) {
            e = e12;
            c40987d = this;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m89778e(List<DelayedC40992i> list) {
        Iterator<Map.Entry<String, a>> it = this.f91090k.entrySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            a value = it.next().getValue();
            synchronized (value) {
                try {
                    DelayedC40992i delayedC40992i = value.f91091a;
                    if (delayedC40992i != null) {
                        list.add(delayedC40992i);
                        i11++;
                        value.f91091a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: f */
    public final void m89779f(int i11) throws LogSizeTooLargeException {
        if (i11 > 5242880) {
            throw new LogSizeTooLargeException("the logs is " + i11 + " bytes which is larger than MAX_BATCH_SIZE_IN_BYTES 5242880");
        }
        if (i11 <= this.f91081b.m88998p()) {
            return;
        }
        throw new LogSizeTooLargeException("the logs is " + i11 + " bytes which is larger than the totalSizeInBytes you specified");
    }

    /* JADX INFO: renamed from: h */
    public final a m89781h(String str) {
        a aVar = this.f91090k.get(str);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        a aVarPutIfAbsent = this.f91090k.putIfAbsent(str, aVar2);
        return aVarPutIfAbsent == null ? aVar2 : aVarPutIfAbsent;
    }

    /* JADX INFO: renamed from: i */
    public List<DelayedC40992i> m89782i() {
        if (!this.f91083d) {
            throw new IllegalStateException("cannot get the remaining batches before the log accumulator closed");
        }
        ArrayList arrayList = new ArrayList();
        while (m89776c()) {
            m89778e(arrayList);
        }
        m89778e(arrayList);
        this.f91090k.clear();
        return arrayList;
    }

    public C40987d(String str, C40384b c40384b, Semaphore semaphore, C40993j c40993j, BlockingQueue<DelayedC40992i> blockingQueue, BlockingQueue<DelayedC40992i> blockingQueue2, AtomicInteger atomicInteger, C40995l c40995l) {
        this.f91080a = str;
        this.f91081b = c40384b;
        this.f91088i = semaphore;
        this.f91082c = atomicInteger;
        this.f91084e = c40993j;
        this.f91085f = blockingQueue;
        this.f91086g = blockingQueue2;
        this.f91089j = c40995l;
    }

    /* JADX INFO: renamed from: g */
    public C40986c m89780g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C40986c c40986c = new C40986c();
        long jM88988f = this.f91081b.m88988f();
        Iterator<Map.Entry<String, a>> it = this.f91090k.entrySet().iterator();
        while (it.hasNext()) {
            a value = it.next().getValue();
            synchronized (value) {
                try {
                    DelayedC40992i delayedC40992i = value.f91091a;
                    if (delayedC40992i != null) {
                        long jM89802n = delayedC40992i.m89802n(jCurrentTimeMillis, this.f91081b.m88988f());
                        if (jM89802n <= 0) {
                            value.m89783a(c40986c);
                        } else {
                            jM88988f = Math.min(jM88988f, jM89802n);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        c40986c.m89773d(jM88988f);
        return c40986c;
    }
}
