package jumio.core;

import com.jumio.analytics.Analytics;
import com.jumio.analytics.MobileEvents;
import com.jumio.commons.log.Log;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jumio.core.f1 */
/* JADX INFO: loaded from: classes61.dex */
public final class C40659f1 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final Thread.UncaughtExceptionHandler f90265a;

    public C40659f1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Class<?> cls;
        this.f90265a = uncaughtExceptionHandler;
        StringBuilder sb2 = new StringBuilder("Wrapping handler :");
        if (uncaughtExceptionHandler != null) {
            cls = uncaughtExceptionHandler.getClass();
        } else {
            cls = null;
        }
        sb2.append(cls);
        Log.m14477v(sb2.toString());
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable ex2) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(ex2, "ex");
        if (ex2 instanceof Exception) {
            Log.m14461d("uncaught exception: " + ex2);
            Analytics.Companion companion = Analytics.INSTANCE;
            companion.add(MobileEvents.exception(ex2));
            companion.add(MobileEvents.lifecycle$default(EnumC40670h2.ABORTED, null, 2, null));
            companion.flush();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f90265a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, ex2);
        }
    }
}
