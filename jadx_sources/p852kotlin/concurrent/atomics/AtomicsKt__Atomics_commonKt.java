package p852kotlin.concurrent.atomics;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Atomics.common.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0002\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u0011\u0010\u000b\u001a\u00020\u0004*\u00020\u0002H\u0007¢\u0006\u0002\u0010\b\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\u0010\u000e\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\f2\u0006\u0010\u0003\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\u0010\u000e\u001a\u0011\u0010\u0007\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0011\u0010\t\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0011\u0010\n\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0011\u0010\u000b\u001a\u00020\r*\u00020\fH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m90084d2 = {"plusAssign", "", "Lkotlin/concurrent/atomics/AtomicInt;", "delta", "", "(Ljava/util/concurrent/atomic/AtomicInteger;I)V", "minusAssign", "fetchAndIncrement", "(Ljava/util/concurrent/atomic/AtomicInteger;)I", "incrementAndFetch", "decrementAndFetch", "fetchAndDecrement", "Lkotlin/concurrent/atomics/AtomicLong;", "", "(Ljava/util/concurrent/atomic/AtomicLong;J)V", "(Ljava/util/concurrent/atomic/AtomicLong;)J", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/concurrent/atomics/AtomicsKt")
class AtomicsKt__Atomics_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int decrementAndFetch(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.addAndGet(-1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndDecrement(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(-1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndIncrement(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int incrementAndFetch(@NotNull AtomicInteger atomicInteger) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        return atomicInteger.addAndGet(1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void minusAssign(@NotNull AtomicInteger atomicInteger, int i11) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        atomicInteger.addAndGet(-i11);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void plusAssign(@NotNull AtomicInteger atomicInteger, int i11) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        atomicInteger.addAndGet(i11);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long decrementAndFetch(@NotNull AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.addAndGet(-1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndDecrement(@NotNull AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.getAndAdd(-1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndIncrement(@NotNull AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.getAndAdd(1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long incrementAndFetch(@NotNull AtomicLong atomicLong) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        return atomicLong.addAndGet(1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void minusAssign(@NotNull AtomicLong atomicLong, long j11) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        atomicLong.addAndGet(-j11);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final void plusAssign(@NotNull AtomicLong atomicLong, long j11) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        atomicLong.addAndGet(j11);
    }
}
