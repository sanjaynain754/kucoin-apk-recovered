package p852kotlin.concurrent.internal;

import androidx.camera.view.C1454t;
import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.C8585f0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.PublishedApi;
import p852kotlin.SinceKotlin;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AtomicIntrinsics.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0001\u001a-\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u000b\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0001\u001a$\u0010\u0000\u001a\u00020\u0005*\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a5\u0010\u0000\u001a\u0002H\t\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u000f2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u0002H\t2\u0006\u0010\u0004\u001a\u0002H\tH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m90084d2 = {"compareAndExchange", "", "Ljava/util/concurrent/atomic/AtomicInteger;", "expected", "newValue", "", "Ljava/util/concurrent/atomic/AtomicLong;", "", "Ljava/util/concurrent/atomic/AtomicBoolean;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/concurrent/atomic/AtomicReference;", "(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicIntegerArray;", "index", "Ljava/util/concurrent/atomic/AtomicLongArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class AtomicIntrinsicsKt {
    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(@NotNull AtomicInteger atomicInteger, int i11, int i12) {
        Intrinsics.checkNotNullParameter(atomicInteger, "<this>");
        do {
            int i13 = atomicInteger.get();
            if (i11 != i13) {
                return i13;
            }
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i11;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(@NotNull AtomicLong atomicLong, long j11, long j12) {
        Intrinsics.checkNotNullParameter(atomicLong, "<this>");
        do {
            long j13 = atomicLong.get();
            if (j11 != j13) {
                return j13;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j11;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final boolean compareAndExchange(@NotNull AtomicBoolean atomicBoolean, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(atomicBoolean, "<this>");
        do {
            boolean z13 = atomicBoolean.get();
            if (z11 != z13) {
                return z13;
            }
        } while (!atomicBoolean.compareAndSet(z11, z12));
        return z11;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final <T> T compareAndExchange(@NotNull AtomicReference<T> atomicReference, T t11, T t12) {
        Intrinsics.checkNotNullParameter(atomicReference, "<this>");
        do {
            T t13 = atomicReference.get();
            if (t11 != t13) {
                return t13;
            }
        } while (!C1454t.m2255a(atomicReference, t11, t12));
        return t11;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final int compareAndExchange(@NotNull AtomicIntegerArray atomicIntegerArray, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(atomicIntegerArray, "<this>");
        do {
            int i14 = atomicIntegerArray.get(i11);
            if (i12 != i14) {
                return i14;
            }
        } while (!atomicIntegerArray.compareAndSet(i11, i12, i13));
        return i12;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final long compareAndExchange(@NotNull AtomicLongArray atomicLongArray, int i11, long j11, long j12) {
        Intrinsics.checkNotNullParameter(atomicLongArray, "<this>");
        do {
            long j13 = atomicLongArray.get(i11);
            if (j11 != j13) {
                return j13;
            }
        } while (!atomicLongArray.compareAndSet(i11, j11, j12));
        return j11;
    }

    @SinceKotlin(version = "2.1")
    @PublishedApi
    public static final <T> T compareAndExchange(@NotNull AtomicReferenceArray<T> atomicReferenceArray, int i11, T t11, T t12) {
        Intrinsics.checkNotNullParameter(atomicReferenceArray, "<this>");
        do {
            T t13 = atomicReferenceArray.get(i11);
            if (t11 != t13) {
                return t13;
            }
        } while (!C8585f0.m13695a(atomicReferenceArray, i11, t11, t12));
        return t11;
    }
}
