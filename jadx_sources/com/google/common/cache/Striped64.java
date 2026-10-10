package com.google.common.cache;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.common.annotations.GwtIncompatible;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Random;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class Striped64 extends Number {
    private static final Unsafe UNSAFE;
    private static final long baseOffset;
    private static final long busyOffset;
    volatile transient long base;
    volatile transient int busy;
    volatile transient Cell[] cells;
    static final ThreadLocal<int[]> threadHashCode = new ThreadLocal<>();
    static final Random rng = new Random();
    static final int NCPU = Runtime.getRuntime().availableProcessors();

    public static final class Cell {
        private static final Unsafe UNSAFE;
        private static final long valueOffset;

        /* JADX INFO: renamed from: p0 */
        volatile long f12226p0;

        /* JADX INFO: renamed from: p1 */
        volatile long f12227p1;

        /* JADX INFO: renamed from: p2 */
        volatile long f12228p2;

        /* JADX INFO: renamed from: p3 */
        volatile long f12229p3;

        /* JADX INFO: renamed from: p4 */
        volatile long f12230p4;

        /* JADX INFO: renamed from: p5 */
        volatile long f12231p5;

        /* JADX INFO: renamed from: p6 */
        volatile long f12232p6;

        /* JADX INFO: renamed from: q0 */
        volatile long f12233q0;

        /* JADX INFO: renamed from: q1 */
        volatile long f12234q1;

        /* JADX INFO: renamed from: q2 */
        volatile long f12235q2;

        /* JADX INFO: renamed from: q3 */
        volatile long f12236q3;

        /* JADX INFO: renamed from: q4 */
        volatile long f12237q4;

        /* JADX INFO: renamed from: q5 */
        volatile long f12238q5;

        /* JADX INFO: renamed from: q6 */
        volatile long f12239q6;
        volatile long value;

        public final boolean cas(long j11, long j12) {
            return UNSAFE.compareAndSwapLong(this, valueOffset, j11, j12);
        }

        static {
            try {
                Unsafe unsafe = Striped64.getUnsafe();
                UNSAFE = unsafe;
                valueOffset = unsafe.objectFieldOffset(Cell.class.getDeclaredField("value"));
            } catch (Exception e11) {
                throw new Error(e11);
            }
        }

        public Cell(long j11) {
            this.value = j11;
        }
    }

    /* JADX INFO: renamed from: fn */
    public abstract long mo13390fn(long j11, long j12);

    static {
        try {
            Unsafe unsafe = getUnsafe();
            UNSAFE = unsafe;
            baseOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField(TtmlNode.RUBY_BASE));
            busyOffset = unsafe.objectFieldOffset(Striped64.class.getDeclaredField("busy"));
        } catch (Exception e11) {
            throw new Error(e11);
        }
    }

    public final boolean casBase(long j11, long j12) {
        return UNSAFE.compareAndSwapLong(this, baseOffset, j11, j12);
    }

    public final boolean casBusy() {
        return UNSAFE.compareAndSwapInt(this, busyOffset, 0, 1);
    }

    public final void internalReset(long j11) {
        Cell[] cellArr = this.cells;
        this.base = j11;
        if (cellArr != null) {
            for (Cell cell : cellArr) {
                if (cell != null) {
                    cell.value = j11;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    public final void retryUpdate(long j11, int[] iArr, boolean z11) {
        int iNextInt;
        int[] iArr2;
        boolean z12;
        int length;
        boolean z13;
        int length2;
        if (iArr == null) {
            iArr2 = new int[1];
            threadHashCode.set(iArr2);
            iNextInt = rng.nextInt();
            if (iNextInt == 0) {
                iNextInt = 1;
            }
            iArr2[0] = iNextInt;
        } else {
            iNextInt = iArr[0];
            iArr2 = iArr;
        }
        boolean z14 = false;
        int i11 = iNextInt;
        boolean z15 = z11;
        while (true) {
            Cell[] cellArr = this.cells;
            if (cellArr != null && (length = cellArr.length) > 0) {
                Cell cell = cellArr[(length - 1) & i11];
                if (cell == null) {
                    if (this.busy == 0) {
                        Cell cell2 = new Cell(j11);
                        if (this.busy == 0 && casBusy()) {
                            try {
                                Cell[] cellArr2 = this.cells;
                                if (cellArr2 == null || (length2 = cellArr2.length) <= 0) {
                                    z13 = false;
                                } else {
                                    int i12 = (length2 - 1) & i11;
                                    if (cellArr2[i12] == null) {
                                        cellArr2[i12] = cell2;
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                }
                                this.busy = 0;
                                if (z13) {
                                    return;
                                }
                            } catch (Throwable th2) {
                                this.busy = 0;
                                throw th2;
                            }
                        }
                    }
                    z14 = false;
                    int i13 = i11 ^ (i11 << 13);
                    int i14 = i13 ^ (i13 >>> 17);
                    i11 = i14 ^ (i14 << 5);
                    iArr2[0] = i11;
                } else {
                    if (z15) {
                        long j12 = cell.value;
                        if (cell.cas(j12, mo13390fn(j12, j11))) {
                            return;
                        }
                        if (length >= NCPU || this.cells != cellArr) {
                            z14 = false;
                        } else if (!z14) {
                            z14 = true;
                        } else if (this.busy == 0 && casBusy()) {
                            try {
                                if (this.cells == cellArr) {
                                    Cell[] cellArr3 = new Cell[length << 1];
                                    for (int i15 = 0; i15 < length; i15++) {
                                        cellArr3[i15] = cellArr[i15];
                                    }
                                    this.cells = cellArr3;
                                }
                                this.busy = 0;
                                z14 = false;
                            } catch (Throwable th3) {
                                this.busy = 0;
                                throw th3;
                            }
                        }
                    } else {
                        z15 = true;
                    }
                    int i16 = i11 ^ (i11 << 13);
                    int i17 = i16 ^ (i16 >>> 17);
                    i11 = i17 ^ (i17 << 5);
                    iArr2[0] = i11;
                }
            } else if (this.busy == 0 && this.cells == cellArr && casBusy()) {
                try {
                    if (this.cells == cellArr) {
                        Cell[] cellArr4 = new Cell[2];
                        cellArr4[i11 & 1] = new Cell(j11);
                        this.cells = cellArr4;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    this.busy = 0;
                    if (z12) {
                        return;
                    }
                } catch (Throwable th4) {
                    this.busy = 0;
                    throw th4;
                }
            } else {
                long j13 = this.base;
                if (casBase(j13, mo13390fn(j13, j11))) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Unsafe getUnsafe() {
        try {
            try {
                return Unsafe.getUnsafe();
            } catch (PrivilegedActionException e11) {
                throw new RuntimeException("Could not initialize intrinsics", e11.getCause());
            }
        } catch (SecurityException unused) {
            return (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.common.cache.Striped64.1
                @Override // java.security.PrivilegedExceptionAction
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
    }
}
