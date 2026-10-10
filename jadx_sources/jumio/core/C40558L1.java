package jumio.core;

import android.os.Handler;
import android.os.Looper;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.L1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40558L1 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        ScheduledExecutorServiceC40568N1 scheduledExecutorServiceC40568N1;
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            ScheduledExecutorServiceC40568N1 scheduledExecutorServiceC40568N2 = AbstractC40695m2.f90327a;
            if (scheduledExecutorServiceC40568N2 == null) {
                synchronized (AbstractC40695m2.class) {
                    scheduledExecutorServiceC40568N1 = new ScheduledExecutorServiceC40568N1(new Handler(Looper.getMainLooper()));
                    AbstractC40695m2.f90327a = scheduledExecutorServiceC40568N1;
                }
                return scheduledExecutorServiceC40568N1;
            }
            return scheduledExecutorServiceC40568N2;
        }
        if (Looper.myLooper() != null) {
            Looper looperMyLooper = Looper.myLooper();
            Intrinsics.checkNotNull(looperMyLooper);
            return new ScheduledExecutorServiceC40568N1(new Handler(looperMyLooper));
        }
        return null;
    }
}
