package jumio.core;

import android.view.Choreographer;
import com.jumio.commons.log.Log;
import com.jumio.core.performance.FrameRateUtils;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.V1 */
/* JADX INFO: loaded from: classes61.dex */
public abstract class AbstractChoreographerFrameCallbackC40607V1 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a */
    public final long f90139a;

    /* JADX INFO: renamed from: b */
    public final C40759z1 f90140b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f90141c;

    /* JADX INFO: renamed from: d */
    public long f90142d;

    /* JADX INFO: renamed from: e */
    public boolean f90143e;

    /* JADX INFO: renamed from: a */
    public abstract String mo89240a();

    /* JADX INFO: renamed from: b */
    public abstract void mo89241b();

    public AbstractChoreographerFrameCallbackC40607V1(long j11, C40759z1 frameRateCallback) {
        Intrinsics.checkNotNullParameter(frameRateCallback, "frameRateCallback");
        this.f90139a = j11;
        this.f90140b = frameRateCallback;
        this.f90141c = new ArrayList();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j11) {
        if (!this.f90143e) {
            this.f90143e = false;
            this.f90141c.clear();
            return;
        }
        if (this.f90142d == 0) {
            this.f90142d = j11;
        }
        if (j11 - this.f90142d > this.f90139a) {
            Log.m14463d(mo89240a(), "Sampling finished with " + this.f90141c.size() + " frames, elapsed time was " + TimeUnit.MILLISECONDS.convert(j11 - this.f90142d, TimeUnit.NANOSECONDS));
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f90141c);
            Log.m14479v(mo89240a(), "Publishing frames " + CollectionsKt.joinToString$default(arrayList, ", \n", null, null, 0, null, null, 62, null));
            this.f90140b.onFramesSampled(FrameRateUtils.INSTANCE.getFrameRateFromSample(arrayList, 1000000000L));
            this.f90141c.clear();
            this.f90142d = j11;
        }
        this.f90141c.add(Long.valueOf(j11));
        mo89241b();
    }
}
