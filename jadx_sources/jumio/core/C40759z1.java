package jumio.core;

import com.jumio.core.performance.FrameRateCallback;
import java.util.ArrayList;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.z1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40759z1 implements FrameRateCallback {

    /* JADX INFO: renamed from: a */
    public final FrameRateCallback f90505a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f90506b;

    /* JADX INFO: renamed from: c */
    public final Object f90507c;

    public C40759z1(FrameRateCallback originalCallback) {
        Intrinsics.checkNotNullParameter(originalCallback, "originalCallback");
        this.f90505a = originalCallback;
        this.f90506b = new ArrayList();
        this.f90507c = new Object();
    }

    @Override // com.jumio.core.performance.FrameRateCallback
    public final void onFramesSampled(int i11) {
        synchronized (this.f90507c) {
            this.f90506b.add(Integer.valueOf(i11));
        }
        this.f90505a.onFramesSampled(i11);
    }
}
