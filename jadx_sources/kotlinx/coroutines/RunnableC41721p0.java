package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: kotlinx.coroutines.p0 */
/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0005J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0018\u0010\u0005J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010\u0005R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001e\u0010'\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b'\u0010(\u0012\u0004\b)\u0010\u0005R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u001d8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u001fR\u0014\u00100\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\"R\u0014\u00102\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\"¨\u00063"}, m90084d2 = {"Lkotlinx/coroutines/p0;", "Lkotlinx/coroutines/g1;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "<init>", "()V", "task", "", "c0", "(Ljava/lang/Runnable;)V", "", "now", "Lkotlinx/coroutines/g1$c;", "delayedTask", "X", "(JLkotlinx/coroutines/g1$c;)V", "shutdown", "timeMillis", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/b1;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/b1;", "run", "", "toString", "()Ljava/lang/String;", "v0", "Ljava/lang/Thread;", "r0", "()Ljava/lang/Thread;", "", "u0", "()Z", "q0", "i", "J", "KEEP_ALIVE_NANOS", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "", "debugStatus", "I", ExifInterface.LONGITUDE_WEST, InterfaceC33953u5.f72225u, "s0", "isShutDown", "t0", "isShutdownRequested", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nDefaultExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultExecutor.kt\nkotlinx/coroutines/DefaultExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
public final class RunnableC41721p0 extends AbstractC41684g1 implements Runnable {

    @Nullable
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: h */
    @NotNull
    public static final RunnableC41721p0 f91769h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static final long KEEP_ALIVE_NANOS;

    /* JADX INFO: renamed from: q0 */
    public final synchronized void m91180q0() {
        if (m91183t0()) {
            debugStatus = 3;
            m91031k0();
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final synchronized Thread m91181r0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setContextClassLoader(f91769h.getClass().getClassLoader());
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    @Override // kotlinx.coroutines.AbstractC41684g1, kotlinx.coroutines.AbstractC41589f1
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* JADX INFO: renamed from: u0 */
    public final synchronized boolean m91184u0() {
        if (m91183t0()) {
            return false;
        }
        debugStatus = 1;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    static {
        Long l11;
        RunnableC41721p0 runnableC41721p0 = new RunnableC41721p0();
        f91769h = runnableC41721p0;
        AbstractC41589f1.m90728Q(runnableC41721p0, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l11 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l11 = 1000L;
        }
        KEEP_ALIVE_NANOS = timeUnit.toNanos(l11.longValue());
    }

    @Override // kotlinx.coroutines.AbstractC41688h1
    @NotNull
    /* JADX INFO: renamed from: W */
    public Thread getThread() {
        Thread thread = _thread;
        return thread == null ? m91181r0() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM91029i0;
        C41760t2.f91865a.m91358d(this);
        C41553c.m90497a();
        try {
            if (!m91184u0()) {
                if (zM91029i0) {
                    return;
                } else {
                    return;
                }
            }
            long j11 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jMo90736T = mo90736T();
                if (jMo90736T == Long.MAX_VALUE) {
                    C41553c.m90497a();
                    long jNanoTime = System.nanoTime();
                    if (j11 == Long.MAX_VALUE) {
                        j11 = KEEP_ALIVE_NANOS + jNanoTime;
                    }
                    long j12 = j11 - jNanoTime;
                    if (j12 <= 0) {
                        if (zM91029i0) {
                            return;
                        } else {
                            return;
                        }
                    }
                    jMo90736T = RangesKt.coerceAtMost(jMo90736T, j12);
                } else {
                    j11 = Long.MAX_VALUE;
                }
                if (jMo90736T > 0) {
                    if (m91183t0()) {
                        if (zM91029i0) {
                            return;
                        } else {
                            return;
                        }
                    } else {
                        C41553c.m90497a();
                        LockSupport.parkNanos(this, jMo90736T);
                    }
                }
            }
        } finally {
            _thread = null;
            m91180q0();
            C41553c.m90497a();
            if (!m91029i0()) {
                getThread();
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m91182s0() {
        return debugStatus == 4;
    }

    /* JADX INFO: renamed from: t0 */
    public final boolean m91183t0() {
        int i11 = debugStatus;
        return i11 == 2 || i11 == 3;
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "DefaultExecutor";
    }

    /* JADX INFO: renamed from: v0 */
    public final void m91185v0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // kotlinx.coroutines.AbstractC41688h1
    /* JADX INFO: renamed from: X */
    public void mo91063X(long now, @NotNull AbstractC41684g1.c delayedTask) {
        m91185v0();
    }

    @Override // kotlinx.coroutines.AbstractC41684g1
    /* JADX INFO: renamed from: c0 */
    public void mo91026c0(@NotNull Runnable task) {
        if (m91182s0()) {
            m91185v0();
        }
        super.mo91026c0(task);
    }

    @Override // kotlinx.coroutines.AbstractC41684g1, kotlinx.coroutines.InterfaceC41758t0
    @NotNull
    public InterfaceC41550b1 invokeOnTimeout(long timeMillis, @NotNull Runnable block, @NotNull CoroutineContext context) {
        return m91034n0(timeMillis, block);
    }
}
