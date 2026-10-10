package p549q5;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;
import p712w3.InterfaceC45711k;

/* JADX INFO: renamed from: q5.j */
/* JADX INFO: compiled from: DefaultBitmapMemoryCacheParamsSupplier.java */
/* JADX INFO: loaded from: classes34.dex */
public class C43621j implements InterfaceC45711k<C43628q> {

    /* JADX INFO: renamed from: b */
    public static final long f96294b = TimeUnit.MINUTES.toMillis(5);

    /* JADX INFO: renamed from: a */
    public final ActivityManager f96295a;

    @Override // p712w3.InterfaceC45711k
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C43628q get() {
        return new C43628q(m95990b(), 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, f96294b);
    }

    /* JADX INFO: renamed from: b */
    public final int m95990b() {
        int iMin = Math.min(this.f96295a.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (iMin < 33554432) {
            return 4194304;
        }
        if (iMin < 67108864) {
            return 6291456;
        }
        return iMin / 4;
    }

    public C43621j(ActivityManager activityManager) {
        this.f96295a = activityManager;
    }
}
