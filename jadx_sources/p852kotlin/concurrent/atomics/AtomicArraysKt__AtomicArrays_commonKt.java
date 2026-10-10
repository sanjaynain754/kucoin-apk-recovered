package p852kotlin.concurrent.atomics;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicArrays.common.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\t\u001a-\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0007\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\n\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\u000b\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0019\u0010\f\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00140\u0005H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, m90084d2 = {"AtomicIntArray", "Lkotlin/concurrent/atomics/AtomicIntArray;", "size", "", "init", "Lkotlin/Function1;", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "fetchAndIncrementAt", "index", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;I)I", "incrementAndFetchAt", "decrementAndFetchAt", "fetchAndDecrementAt", "AtomicLongArray", "Lkotlin/concurrent/atomics/AtomicLongArray;", "", "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;I)J", "AtomicArray", "Lkotlin/concurrent/atomics/AtomicArray;", ExifInterface.GPS_DIRECTION_TRUE, "(ILkotlin/jvm/functions/Function1;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/concurrent/atomics/AtomicArraysKt")
class AtomicArraysKt__AtomicArrays_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int decrementAndFetchAt(@NotNull AtomicIntegerArray atomicIntegerArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i11, -1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndDecrementAt(@NotNull AtomicIntegerArray atomicIntegerArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i11, -1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int fetchAndIncrementAt(@NotNull AtomicIntegerArray atomicIntegerArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i11, 1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final int incrementAndFetchAt(@NotNull AtomicIntegerArray atomicIntegerArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i11, 1);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final /* synthetic */ <T> AtomicReferenceArray<T> AtomicArray(int i11, Function1<? super Integer, ? extends T> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        Intrinsics.reifiedOperationMarker(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = init.invoke(Integer.valueOf(i12));
        }
        return new AtomicReferenceArray<>(objArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicIntegerArray AtomicIntArray(int i11, @NotNull Function1<? super Integer, Integer> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = init.invoke(Integer.valueOf(i12)).intValue();
        }
        return new AtomicIntegerArray(iArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLongArray AtomicLongArray(int i11, @NotNull Function1<? super Integer, Long> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        long[] jArr = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = init.invoke(Integer.valueOf(i12)).longValue();
        }
        return new AtomicLongArray(jArr);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long decrementAndFetchAt(@NotNull AtomicLongArray atomicLongArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i11, -1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndDecrementAt(@NotNull AtomicLongArray atomicLongArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i11, -1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long fetchAndIncrementAt(@NotNull AtomicLongArray atomicLongArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i11, 1L);
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    public static final long incrementAndFetchAt(@NotNull AtomicLongArray atomicLongArray, int i11) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i11, 1L);
    }
}
