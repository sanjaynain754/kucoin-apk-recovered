package kc0;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: kc0.l */
/* JADX INFO: compiled from: SendThreadPool.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40995l {

    /* JADX INFO: renamed from: a */
    public final ExecutorService f91119a;

    /* JADX INFO: renamed from: a */
    public void m89821a(RunnableC40994k runnableC40994k) {
        this.f91119a.submit(runnableC40994k);
    }

    public C40995l(int i11, String str) {
        this.f91119a = Executors.newFixedThreadPool(i11, new ThreadFactoryBuilder().setDaemon(true).setNameFormat(str + "-send-thread-%d").build());
    }
}
