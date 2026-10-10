package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import og0.C43066l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.ArrayDeque;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.f1 */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010&\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0006R\u0011\u0010*\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b)\u0010\tR\u0011\u0010,\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b+\u0010\t¨\u0006-"}, m90084d2 = {"Lkotlinx/coroutines/f1;", "Lkotlinx/coroutines/j0;", "<init>", "()V", "", ExifInterface.GPS_DIRECTION_TRUE, "()J", "", "U", "()Z", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/w0;", "task", "", "M", "(Lkotlinx/coroutines/w0;)V", "unconfined", "P", "(Z)V", "p", "", "parallelism", "", "name", "limitedParallelism", "(ILjava/lang/String;)Lkotlinx/coroutines/j0;", "shutdown", "L", "(Z)J", "b", "J", "useCount", "c", "Z", "shared", "Lkotlin/collections/ArrayDeque;", "d", "Lkotlin/collections/ArrayDeque;", "unconfinedQueue", "O", "nextTime", "R", "isUnconfinedLoopActive", ExifInterface.LATITUDE_SOUTH, "isUnconfinedQueueEmpty", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
public abstract class AbstractC41589f1 extends AbstractC41697j0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public long useCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean shared;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public ArrayDeque<AbstractC41770w0<?>> unconfinedQueue;

    /* JADX INFO: renamed from: V */
    public boolean m90738V() {
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m90728Q(AbstractC41589f1 abstractC41589f1, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        abstractC41589f1.m90733P(z11);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m90729q(AbstractC41589f1 abstractC41589f1, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        abstractC41589f1.m90739p(z11);
    }

    /* JADX INFO: renamed from: L */
    public final long m90730L(boolean unconfined) {
        return unconfined ? 4294967296L : 1L;
    }

    /* JADX INFO: renamed from: M */
    public final void m90731M(@NotNull AbstractC41770w0<?> task) {
        ArrayDeque<AbstractC41770w0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null) {
            arrayDeque = new ArrayDeque<>();
            this.unconfinedQueue = arrayDeque;
        }
        arrayDeque.addLast(task);
    }

    /* JADX INFO: renamed from: O */
    public long mo90732O() {
        ArrayDeque<AbstractC41770w0<?>> arrayDeque = this.unconfinedQueue;
        return (arrayDeque == null || arrayDeque.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    /* JADX INFO: renamed from: P */
    public final void m90733P(boolean unconfined) {
        this.useCount += m90730L(unconfined);
        if (unconfined) {
            return;
        }
        this.shared = true;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m90734R() {
        return this.useCount >= m90730L(true);
    }

    /* JADX INFO: renamed from: S */
    public final boolean m90735S() {
        ArrayDeque<AbstractC41770w0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque != null) {
            return arrayDeque.isEmpty();
        }
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m90737U() {
        AbstractC41770w0<?> abstractC41770w0RemoveFirstOrNull;
        ArrayDeque<AbstractC41770w0<?>> arrayDeque = this.unconfinedQueue;
        if (arrayDeque == null || (abstractC41770w0RemoveFirstOrNull = arrayDeque.removeFirstOrNull()) == null) {
            return false;
        }
        abstractC41770w0RemoveFirstOrNull.run();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m90739p(boolean unconfined) {
        long jM90730L = this.useCount - m90730L(unconfined);
        this.useCount = jM90730L;
        if (jM90730L <= 0 && this.shared) {
            shutdown();
        }
    }

    /* JADX INFO: renamed from: T */
    public long mo90736T() {
        if (!m90737U()) {
            return Long.MAX_VALUE;
        }
        return 0L;
    }

    @Override // kotlinx.coroutines.AbstractC41697j0
    @NotNull
    public final AbstractC41697j0 limitedParallelism(int parallelism, @Nullable String name) {
        C43066l.m94607a(parallelism);
        return C43066l.m94608b(this, name);
    }

    public void shutdown() {
    }
}
