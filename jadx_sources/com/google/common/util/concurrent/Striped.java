package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.MapMaker;
import com.google.common.math.IntMath;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
@J2ktIncompatible
public abstract class Striped<L> {
    private static final int ALL_SET = -1;
    private static final int LARGE_LAZY_CUTOFF = 1024;

    public static class CompactStriped<L> extends PowerOfTwoStriped<L> {
        private final Object[] array;

        private CompactStriped(int i11, Supplier<L> supplier) {
            super(i11);
            int i12 = 0;
            Preconditions.checkArgument(i11 <= 1073741824, "Stripes must be <= 2^30)");
            this.array = new Object[this.mask + 1];
            while (true) {
                Object[] objArr = this.array;
                if (i12 >= objArr.length) {
                    return;
                }
                objArr[i12] = supplier.get();
                i12++;
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i11) {
            return (L) this.array[i11];
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.array.length;
        }
    }

    @VisibleForTesting
    public static class LargeLazyStriped<L> extends PowerOfTwoStriped<L> {
        final ConcurrentMap<Integer, L> locks;
        final int size;
        final Supplier<L> supplier;

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i11) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i11, size());
            }
            L l11 = this.locks.get(Integer.valueOf(i11));
            if (l11 != null) {
                return l11;
            }
            L l12 = this.supplier.get();
            return (L) MoreObjects.firstNonNull(this.locks.putIfAbsent(Integer.valueOf(i11), l12), l12);
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }

        public LargeLazyStriped(int i11, Supplier<L> supplier) {
            int i12;
            super(i11);
            int i13 = this.mask;
            if (i13 == -1) {
                i12 = Integer.MAX_VALUE;
            } else {
                i12 = i13 + 1;
            }
            this.size = i12;
            this.supplier = supplier;
            this.locks = new MapMaker().weakValues().makeMap();
        }
    }

    public static class PaddedLock extends ReentrantLock {
        long unused1;
        long unused2;
        long unused3;

        public PaddedLock() {
            super(false);
        }
    }

    public static class PaddedSemaphore extends Semaphore {
        long unused1;
        long unused2;
        long unused3;

        public PaddedSemaphore(int i11) {
            super(i11, false);
        }
    }

    @VisibleForTesting
    public static class SmallLazyStriped<L> extends PowerOfTwoStriped<L> {
        final AtomicReferenceArray<ArrayReference<? extends L>> locks;
        final ReferenceQueue<L> queue;
        final int size;
        final Supplier<L> supplier;

        public static final class ArrayReference<L> extends WeakReference<L> {
            final int index;

            public ArrayReference(L l11, int i11, ReferenceQueue<L> referenceQueue) {
                super(l11, referenceQueue);
                this.index = i11;
            }
        }

        private void drainQueue() {
            while (true) {
                Reference<? extends L> referencePoll = this.queue.poll();
                if (referencePoll == null) {
                    return;
                }
                ArrayReference arrayReference = (ArrayReference) referencePoll;
                C8585f0.m13695a(this.locks, arrayReference.index, arrayReference, null);
            }
        }

        @Override // com.google.common.util.concurrent.Striped
        public L getAt(int i11) {
            if (this.size != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i11, size());
            }
            ArrayReference<? extends L> arrayReference = this.locks.get(i11);
            L l11 = arrayReference == null ? null : arrayReference.get();
            if (l11 != null) {
                return l11;
            }
            L l12 = this.supplier.get();
            ArrayReference arrayReference2 = new ArrayReference(l12, i11, this.queue);
            while (!C8585f0.m13695a(this.locks, i11, arrayReference, arrayReference2)) {
                arrayReference = this.locks.get(i11);
                L l13 = arrayReference == null ? null : arrayReference.get();
                if (l13 != null) {
                    return l13;
                }
            }
            drainQueue();
            return l12;
        }

        @Override // com.google.common.util.concurrent.Striped
        public int size() {
            return this.size;
        }

        public SmallLazyStriped(int i11, Supplier<L> supplier) {
            int i12;
            super(i11);
            this.queue = new ReferenceQueue<>();
            int i13 = this.mask;
            if (i13 == -1) {
                i12 = Integer.MAX_VALUE;
            } else {
                i12 = i13 + 1;
            }
            this.size = i12;
            this.locks = new AtomicReferenceArray<>(i12);
            this.supplier = supplier;
        }
    }

    public static final class WeakSafeCondition extends ForwardingCondition {
        private final Condition delegate;
        private final WeakSafeReadWriteLock strongReference;

        @Override // com.google.common.util.concurrent.ForwardingCondition
        public Condition delegate() {
            return this.delegate;
        }

        public WeakSafeCondition(Condition condition, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = condition;
            this.strongReference = weakSafeReadWriteLock;
        }
    }

    public static final class WeakSafeLock extends ForwardingLock {
        private final Lock delegate;
        private final WeakSafeReadWriteLock strongReference;

        @Override // com.google.common.util.concurrent.ForwardingLock
        public Lock delegate() {
            return this.delegate;
        }

        @Override // com.google.common.util.concurrent.ForwardingLock, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new WeakSafeCondition(this.delegate.newCondition(), this.strongReference);
        }

        public WeakSafeLock(Lock lock, WeakSafeReadWriteLock weakSafeReadWriteLock) {
            this.delegate = lock;
            this.strongReference = weakSafeReadWriteLock;
        }
    }

    public static final class WeakSafeReadWriteLock implements ReadWriteLock {
        private final ReadWriteLock delegate = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new WeakSafeLock(this.delegate.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new WeakSafeLock(this.delegate.writeLock(), this);
        }
    }

    public abstract L get(Object obj);

    public abstract L getAt(int i11);

    public abstract int indexFor(Object obj);

    public abstract int size();

    public static abstract class PowerOfTwoStriped<L> extends Striped<L> {
        final int mask;

        public PowerOfTwoStriped(int i11) {
            super();
            Preconditions.checkArgument(i11 > 0, "Stripes must be positive");
            this.mask = i11 > 1073741824 ? -1 : Striped.ceilToPowerOfTwo(i11) - 1;
        }

        @Override // com.google.common.util.concurrent.Striped
        public final L get(Object obj) {
            return getAt(indexFor(obj));
        }

        @Override // com.google.common.util.concurrent.Striped
        public final int indexFor(Object obj) {
            return Striped.smear(obj.hashCode()) & this.mask;
        }
    }

    private Striped() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Semaphore m13691a(int i11) {
        return new PaddedSemaphore(i11);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Lock m13692b() {
        return new ReentrantLock(false);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Semaphore m13693c(int i11) {
        return new Semaphore(i11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ceilToPowerOfTwo(int i11) {
        return 1 << IntMath.log2(i11, RoundingMode.CEILING);
    }

    public static <L> Striped<L> custom(int i11, Supplier<L> supplier) {
        return new CompactStriped(i11, supplier);
    }

    public static <L> Striped<L> lazyWeakCustom(int i11, Supplier<L> supplier) {
        return i11 < 1024 ? new SmallLazyStriped(i11, supplier) : new LargeLazyStriped(i11, supplier);
    }

    public static Striped<Lock> lazyWeakLock(int i11) {
        return lazyWeakCustom(i11, new Supplier() { // from class: com.google.common.util.concurrent.d0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m13692b();
            }
        });
    }

    public static Striped<ReadWriteLock> lazyWeakReadWriteLock(int i11) {
        return lazyWeakCustom(i11, new Supplier() { // from class: com.google.common.util.concurrent.z
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.WeakSafeReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> lazyWeakSemaphore(int i11, final int i12) {
        return lazyWeakCustom(i11, new Supplier() { // from class: com.google.common.util.concurrent.c0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m13693c(i12);
            }
        });
    }

    public static Striped<Lock> lock(int i11) {
        return custom(i11, new Supplier() { // from class: com.google.common.util.concurrent.a0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new Striped.PaddedLock();
            }
        });
    }

    public static Striped<ReadWriteLock> readWriteLock(int i11) {
        return custom(i11, new Supplier() { // from class: com.google.common.util.concurrent.e0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static Striped<Semaphore> semaphore(int i11, final int i12) {
        return custom(i11, new Supplier() { // from class: com.google.common.util.concurrent.b0
            @Override // com.google.common.base.Supplier
            public final Object get() {
                return Striped.m13691a(i12);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int smear(int i11) {
        int i12 = i11 ^ ((i11 >>> 20) ^ (i11 >>> 12));
        return (i12 >>> 4) ^ ((i12 >>> 7) ^ i12);
    }

    public Iterable<L> bulkGet(Iterable<? extends Object> iterable) {
        ArrayList arrayListNewArrayList = Lists.newArrayList(iterable);
        if (arrayListNewArrayList.isEmpty()) {
            return ImmutableList.m13439of();
        }
        int[] iArr = new int[arrayListNewArrayList.size()];
        for (int i11 = 0; i11 < arrayListNewArrayList.size(); i11++) {
            iArr[i11] = indexFor(arrayListNewArrayList.get(i11));
        }
        Arrays.sort(iArr);
        int i12 = iArr[0];
        arrayListNewArrayList.set(0, getAt(i12));
        for (int i13 = 1; i13 < arrayListNewArrayList.size(); i13++) {
            int i14 = iArr[i13];
            if (i14 == i12) {
                arrayListNewArrayList.set(i13, arrayListNewArrayList.get(i13 - 1));
            } else {
                arrayListNewArrayList.set(i13, getAt(i14));
                i12 = i14;
            }
        }
        return Collections.unmodifiableList(arrayListNewArrayList);
    }
}
