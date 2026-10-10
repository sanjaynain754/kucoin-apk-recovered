package p255f8;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: f8.a */
/* JADX INFO: compiled from: FrameDecoderExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class C37389a {

    /* JADX INFO: renamed from: c */
    public static int f82983c = 4;

    /* JADX INFO: renamed from: a */
    public ArrayList<HandlerThread> f82984a;

    /* JADX INFO: renamed from: b */
    public AtomicInteger f82985b;

    /* JADX INFO: renamed from: f8.a$b */
    /* JADX INFO: compiled from: FrameDecoderExecutor.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static final C37389a f82986a = new C37389a();
    }

    public C37389a() {
        this.f82984a = new ArrayList<>();
        this.f82985b = new AtomicInteger(0);
    }

    /* JADX INFO: renamed from: b */
    public static C37389a m84113b() {
        return b.f82986a;
    }

    /* JADX INFO: renamed from: a */
    public int m84114a() {
        return this.f82985b.getAndIncrement();
    }

    /* JADX INFO: renamed from: c */
    public Looper m84115c(int i11) {
        int i12 = i11 % f82983c;
        if (i12 < this.f82984a.size()) {
            if (this.f82984a.get(i12) == null) {
                return Looper.getMainLooper();
            }
            Looper looper = this.f82984a.get(i12).getLooper();
            return looper != null ? looper : Looper.getMainLooper();
        }
        HandlerThread handlerThread = new HandlerThread("FrameDecoderExecutor-" + i12);
        handlerThread.start();
        this.f82984a.add(handlerThread);
        Looper looper2 = handlerThread.getLooper();
        return looper2 != null ? looper2 : Looper.getMainLooper();
    }
}
