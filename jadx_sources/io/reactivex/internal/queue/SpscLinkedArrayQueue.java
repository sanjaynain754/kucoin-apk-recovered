package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes23.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    AtomicReferenceArray<Object> consumerBuffer;
    final int consumerMask;
    AtomicReferenceArray<Object> producerBuffer;
    long producerLookAhead;
    int producerLookAheadStep;
    final int producerMask;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();
    final AtomicLong producerIndex = new AtomicLong();
    final AtomicLong consumerIndex = new AtomicLong();

    private static int calcWrappedOffset(long j11, int i11) {
        return calcDirectOffset(((int) j11) & i11);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t11) {
        if (t11 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLpProducerIndex = lpProducerIndex();
        int i11 = this.producerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpProducerIndex, i11);
        if (jLpProducerIndex < this.producerLookAhead) {
            return writeToQueue(atomicReferenceArray, t11, jLpProducerIndex, iCalcWrappedOffset);
        }
        long j11 = ((long) this.producerLookAheadStep) + jLpProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j11, i11)) == null) {
            this.producerLookAhead = j11 - 1;
            return writeToQueue(atomicReferenceArray, t11, jLpProducerIndex, iCalcWrappedOffset);
        }
        if (lvElement(atomicReferenceArray, calcWrappedOffset(jLpProducerIndex + 1, i11)) == null) {
            return writeToQueue(atomicReferenceArray, t11, jLpProducerIndex, iCalcWrappedOffset);
        }
        resize(atomicReferenceArray, jLpProducerIndex, iCalcWrappedOffset, t11, i11);
        return true;
    }

    private void adjustLookAheadStep(int i11) {
        this.producerLookAheadStep = Math.min(i11 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private long lpConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lpProducerIndex() {
        return this.producerIndex.get();
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j11, i11));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11) {
        this.consumerBuffer = atomicReferenceArray;
        int iCalcWrappedOffset = calcWrappedOffset(j11, i11);
        T t11 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        if (t11 != null) {
            soElement(atomicReferenceArray, iCalcWrappedOffset, null);
            soConsumerIndex(j11 + 1);
        }
        return t11;
    }

    private void soConsumerIndex(long j11) {
        this.consumerIndex.lazySet(j11);
    }

    private void soProducerIndex(long j11) {
        this.producerIndex.lazySet(j11);
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i11 = this.consumerMask;
        T t11 = (T) lvElement(atomicReferenceArray, calcWrappedOffset(jLpConsumerIndex, i11));
        return t11 == HAS_NEXT ? newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i11 + 1), jLpConsumerIndex, i11) : t11;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long jLpConsumerIndex = lpConsumerIndex();
        int i11 = this.consumerMask;
        int iCalcWrappedOffset = calcWrappedOffset(jLpConsumerIndex, i11);
        T t11 = (T) lvElement(atomicReferenceArray, iCalcWrappedOffset);
        boolean z11 = t11 == HAS_NEXT;
        if (t11 == null || z11) {
            if (z11) {
                return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i11 + 1), jLpConsumerIndex, i11);
            }
            return null;
        }
        soElement(atomicReferenceArray, iCalcWrappedOffset, null);
        soConsumerIndex(jLpConsumerIndex + 1);
        return t11;
    }

    public SpscLinkedArrayQueue(int i11) {
        int iRoundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i11));
        int i12 = iRoundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iRoundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i12;
        adjustLookAheadStep(iRoundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i12;
        this.producerLookAhead = iRoundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        return atomicReferenceArray.get(i11);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> atomicReferenceArray, int i11) {
        int iCalcDirectOffset = calcDirectOffset(i11);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) lvElement(atomicReferenceArray, iCalcDirectOffset);
        soElement(atomicReferenceArray, iCalcDirectOffset, null);
        return atomicReferenceArray2;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j11, int i11, T t11, long j12) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j12 + j11) - 1;
        soElement(atomicReferenceArray2, i11, t11);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i11, HAS_NEXT);
        soProducerIndex(j11 + 1);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i11, Object obj) {
        atomicReferenceArray.lazySet(i11, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t11, long j11, int i11) {
        soElement(atomicReferenceArray, i11, t11);
        soProducerIndex(j11 + 1);
        return true;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        if (lvProducerIndex() == lvConsumerIndex()) {
            return true;
        }
        return false;
    }

    public int size() {
        long jLvConsumerIndex = lvConsumerIndex();
        while (true) {
            long jLvProducerIndex = lvProducerIndex();
            long jLvConsumerIndex2 = lvConsumerIndex();
            if (jLvConsumerIndex == jLvConsumerIndex2) {
                return (int) (jLvProducerIndex - jLvConsumerIndex2);
            }
            jLvConsumerIndex = jLvConsumerIndex2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t11, T t12) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long jLvProducerIndex = lvProducerIndex();
        int i11 = this.producerMask;
        long j11 = 2 + jLvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j11, i11)) == null) {
            int iCalcWrappedOffset = calcWrappedOffset(jLvProducerIndex, i11);
            soElement(atomicReferenceArray, iCalcWrappedOffset + 1, t12);
            soElement(atomicReferenceArray, iCalcWrappedOffset, t11);
            soProducerIndex(j11);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        int iCalcWrappedOffset2 = calcWrappedOffset(jLvProducerIndex, i11);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2 + 1, t12);
        soElement(atomicReferenceArray2, iCalcWrappedOffset2, t11);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, iCalcWrappedOffset2, HAS_NEXT);
        soProducerIndex(j11);
        return true;
    }

    private static int calcDirectOffset(int i11) {
        return i11;
    }
}
