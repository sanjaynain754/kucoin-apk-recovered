package p549q5;

import java.util.concurrent.TimeUnit;
import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: q5.l */
/* JADX INFO: compiled from: DefaultEncodedMemoryCacheParamsSupplier.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43623l implements InterfaceC45711k<C43628q> {

    /* JADX INFO: renamed from: a */
    public static final long f96297a = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: b */
    private int m95993b() {
        int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (iMin < 16777216) {
            return 1048576;
        }
        if (iMin < 33554432) {
            return 2097152;
        }
        return 4194304;
    }

    @Override // p712w3.InterfaceC45711k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C43628q get() {
        int iM95993b = m95993b();
        return new C43628q(iM95993b, Integer.MAX_VALUE, iM95993b, Integer.MAX_VALUE, iM95993b / 8, f96297a);
    }
}
