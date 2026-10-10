package p852kotlin.concurrent.atomics;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicArrays.jvm.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0003\u001a\u0011\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0011\u0010\u0004\u001a\u00020\u0006*\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\nH\u0007¢\u0006\u0002\u0010\u000b\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\t0\n\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\bH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m90084d2 = {"asJavaAtomicArray", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "Lkotlin/concurrent/atomics/AtomicIntArray;", "(Ljava/util/concurrent/atomic/AtomicIntegerArray;)Ljava/util/concurrent/atomic/AtomicIntegerArray;", "asKotlinAtomicArray", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Lkotlin/concurrent/atomics/AtomicLongArray;", "(Ljava/util/concurrent/atomic/AtomicLongArray;)Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/concurrent/atomics/AtomicArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;)Ljava/util/concurrent/atomic/AtomicReferenceArray;", "kotlin-stdlib"}, m90085k = 5, m90086mv = {2, 2, 0}, m90088xi = 49, m90089xs = "kotlin/concurrent/atomics/AtomicArraysKt")
class AtomicArraysKt__AtomicArrays_jvmKt extends AtomicArraysKt__AtomicArrays_commonKt {
    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicIntegerArray asJavaAtomicArray(@NotNull AtomicIntegerArray atomicIntegerArray) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicIntegerArray asKotlinAtomicArray(@NotNull AtomicIntegerArray atomicIntegerArray) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLongArray asJavaAtomicArray(@NotNull AtomicLongArray atomicLongArray) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final AtomicLongArray asKotlinAtomicArray(@NotNull AtomicLongArray atomicLongArray) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final <T> AtomicReferenceArray<T> asJavaAtomicArray(@NotNull AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    @ExperimentalAtomicApi
    @SinceKotlin(version = "2.1")
    @NotNull
    public static final <T> AtomicReferenceArray<T> asKotlinAtomicArray(@NotNull AtomicReferenceArray<T> atomicReferenceArray) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }
}
