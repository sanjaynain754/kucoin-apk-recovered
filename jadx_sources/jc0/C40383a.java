package jc0;

import com.google.common.util.concurrent.ListenableFuture;
import com.tencentcloudapi.cls.android.producer.errors.MaxBatchCountExceedException;
import com.tencentcloudapi.cls.android.producer.errors.ProducerException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import kc0.C40985b;
import kc0.C40987d;
import kc0.C40989f;
import kc0.C40993j;
import kc0.C40995l;
import kc0.C40996m;
import oc0.C43019f;

/* JADX INFO: renamed from: jc0.a */
/* JADX INFO: compiled from: AsyncProducerClient.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40383a {

    /* JADX INFO: renamed from: j */
    public static final AtomicInteger f89667j = new AtomicInteger(0);

    /* JADX INFO: renamed from: a */
    public final C40384b f89668a;

    /* JADX INFO: renamed from: b */
    public final Semaphore f89669b;

    /* JADX INFO: renamed from: c */
    public final C40993j f89670c;

    /* JADX INFO: renamed from: d */
    public final C40995l f89671d;

    /* JADX INFO: renamed from: e */
    public final C40987d f89672e;

    /* JADX INFO: renamed from: f */
    public final C40996m f89673f;

    /* JADX INFO: renamed from: g */
    public final C40985b f89674g;

    /* JADX INFO: renamed from: h */
    public final C40985b f89675h;

    /* JADX INFO: renamed from: i */
    public final AtomicInteger f89676i;

    /* JADX INFO: renamed from: a */
    public ListenableFuture<C40386d> m88982a(String str, List<C40989f> list, InterfaceC40385c interfaceC40385c) throws InterruptedException, ProducerException {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("topicIDInvalid", new Exception("topic id cannot be empty"));
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("logItems cannot be empty");
        }
        int size = list.size();
        if (size <= 10000) {
            return this.f89672e.m89774a(str, list, interfaceC40385c);
        }
        throw new MaxBatchCountExceedException("the log list size is " + size + " which exceeds the MAX_BATCH_COUNT 10000");
    }

    public C40383a(C40384b c40384b) {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f89676i = atomicInteger;
        int andIncrement = f89667j.getAndIncrement();
        String str = "tencent-cloud-cls-log-producer-" + andIncrement;
        String strM94495b = C43019f.m94495b(andIncrement);
        this.f89668a = c40384b;
        Semaphore semaphore = new Semaphore(c40384b.m88998p());
        this.f89669b = semaphore;
        C40993j c40993j = new C40993j();
        this.f89670c = c40993j;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        C40995l c40995l = new C40995l(c40384b.m88996n(), str);
        this.f89671d = c40995l;
        C40987d c40987d = new C40987d(strM94495b, c40384b, semaphore, c40993j, linkedBlockingQueue, linkedBlockingQueue2, atomicInteger, c40995l);
        this.f89672e = c40987d;
        C40996m c40996m = new C40996m(str + "-timer-send-batch", true, c40384b, c40987d, c40993j, linkedBlockingQueue, linkedBlockingQueue2, c40995l, atomicInteger);
        this.f89673f = c40996m;
        C40985b c40985b = new C40985b(str + "-success-batch-handler", true, linkedBlockingQueue, atomicInteger, semaphore);
        this.f89674g = c40985b;
        C40985b c40985b2 = new C40985b(str + "-failure-batch-handler", true, linkedBlockingQueue2, atomicInteger, semaphore);
        this.f89675h = c40985b2;
        c40996m.start();
        c40985b.start();
        c40985b2.start();
    }
}
