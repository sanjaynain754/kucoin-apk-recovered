package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.f */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m90084d2 = {"Lkotlinx/coroutines/f;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/a;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/f1;", "eventLoop", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/f1;)V", "", "state", "", "N", "(Ljava/lang/Object;)V", "Y0", "()Ljava/lang/Object;", "e", "Ljava/lang/Thread;", "f", "Lkotlinx/coroutines/f1;", "", "r0", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BlockingCoroutine\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,112:1\n1#2:113\n*E\n"})
public final class C41587f<T> extends AbstractC41539a<T> {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Thread blockedThread;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final AbstractC41589f1 eventLoop;

    public C41587f(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable AbstractC41589f1 abstractC41589f1) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = abstractC41589f1;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: r0 */
    public boolean mo90433r0() {
        return true;
    }

    @Override // kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: N */
    public void mo90396N(@Nullable Object state) {
        if (!Intrinsics.areEqual(Thread.currentThread(), this.blockedThread)) {
            Thread thread = this.blockedThread;
            C41553c.m90497a();
            LockSupport.unpark(thread);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public final T m90727Y0() throws Throwable {
        long jMo90736T;
        C41553c.m90497a();
        try {
            AbstractC41589f1 abstractC41589f1 = this.eventLoop;
            C41549b0 c41549b0 = null;
            if (abstractC41589f1 != null) {
                AbstractC41589f1.m90728Q(abstractC41589f1, false, 1, null);
            }
            while (true) {
                try {
                    AbstractC41589f1 abstractC41589f2 = this.eventLoop;
                    if (abstractC41589f2 != null) {
                        jMo90736T = abstractC41589f2.mo90736T();
                    } else {
                        jMo90736T = Long.MAX_VALUE;
                    }
                    if (isCompleted()) {
                        break;
                    }
                    C41553c.m90497a();
                    LockSupport.parkNanos(this, jMo90736T);
                    if (Thread.interrupted()) {
                        m90401Q(new InterruptedException());
                    }
                } catch (Throwable th2) {
                    AbstractC41589f1 abstractC41589f3 = this.eventLoop;
                    if (abstractC41589f3 != null) {
                        AbstractC41589f1.m90729q(abstractC41589f3, false, 1, null);
                    }
                    throw th2;
                }
            }
            AbstractC41589f1 abstractC41589f4 = this.eventLoop;
            if (abstractC41589f4 != null) {
                AbstractC41589f1.m90729q(abstractC41589f4, false, 1, null);
            }
            C41553c.m90497a();
            T t11 = (T) C41551b2.m90495h(m90428k0());
            if (t11 instanceof C41549b0) {
                c41549b0 = (C41549b0) t11;
            }
            if (c41549b0 == null) {
                return t11;
            }
            throw c41549b0.cause;
        } catch (Throwable th3) {
            C41553c.m90497a();
            throw th3;
        }
    }
}
