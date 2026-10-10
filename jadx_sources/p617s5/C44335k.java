package p617s5;

import com.facebook.cache.disk.C5562c;
import com.facebook.cache.disk.InterfaceC5561b;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p583r3.C43909b;
import p583r3.InterfaceC43912e;

/* JADX INFO: renamed from: s5.k */
/* JADX INFO: compiled from: DiskStorageCacheFactory.java */
/* JADX INFO: loaded from: classes34.dex */
public class C44335k implements InterfaceC44343o {

    /* JADX INFO: renamed from: a */
    public InterfaceC44337l f97983a;

    /* JADX INFO: renamed from: c */
    public static C5562c m97809c(C43909b c43909b, InterfaceC5561b interfaceC5561b, Executor executor) {
        return new C5562c(interfaceC5561b, c43909b.m96728h(), new C5562c.c(c43909b.m96731k(), c43909b.m96730j(), c43909b.m96726f()), c43909b.m96725e(), c43909b.m96724d(), c43909b.m96727g(), executor, c43909b.m96729i());
    }

    @Override // p617s5.InterfaceC44343o
    /* JADX INFO: renamed from: a */
    public InterfaceC43912e mo97810a(C43909b c43909b) {
        return m97808b(c43909b, this.f97983a.mo97811a(c43909b));
    }

    public C44335k(InterfaceC44337l interfaceC44337l) {
        this.f97983a = interfaceC44337l;
    }

    /* JADX INFO: renamed from: b */
    public static C5562c m97808b(C43909b c43909b, InterfaceC5561b interfaceC5561b) {
        return m97809c(c43909b, interfaceC5561b, Executors.newSingleThreadExecutor());
    }
}
