package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class MinMaxPriorityQueue<E> extends AbstractQueue<E> {
    private static final int DEFAULT_CAPACITY = 11;
    private static final int EVEN_POWERS_OF_TWO = 1431655765;
    private static final int ODD_POWERS_OF_TWO = -1431655766;
    private final MinMaxPriorityQueue<E>.Heap maxHeap;

    @VisibleForTesting
    final int maximumSize;
    private final MinMaxPriorityQueue<E>.Heap minHeap;
    private int modCount;
    private Object[] queue;
    private int size;

    public static final class Builder<B> {
        private static final int UNSET_EXPECTED_SIZE = -1;
        private final Comparator<B> comparator;
        private int expectedSize;
        private int maximumSize;

        public <T extends B> MinMaxPriorityQueue<T> create() {
            return create(Collections.EMPTY_SET);
        }

        private Builder(Comparator<B> comparator) {
            this.expectedSize = -1;
            this.maximumSize = Integer.MAX_VALUE;
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T extends B> Ordering<T> ordering() {
            return Ordering.from(this.comparator);
        }

        public <T extends B> MinMaxPriorityQueue<T> create(Iterable<? extends T> iterable) {
            MinMaxPriorityQueue<T> minMaxPriorityQueue = new MinMaxPriorityQueue<>(this, MinMaxPriorityQueue.initialQueueSize(this.expectedSize, this.maximumSize, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                minMaxPriorityQueue.offer(it.next());
            }
            return minMaxPriorityQueue;
        }

        @CanIgnoreReturnValue
        public Builder<B> expectedSize(int i11) {
            Preconditions.checkArgument(i11 >= 0);
            this.expectedSize = i11;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<B> maximumSize(int i11) {
            Preconditions.checkArgument(i11 > 0);
            this.maximumSize = i11;
            return this;
        }
    }

    public class Heap {
        final Ordering<E> ordering;

        @Weak
        MinMaxPriorityQueue<E>.Heap otherHeap;

        @CanIgnoreReturnValue
        public int bubbleUpAlternatingLevels(int i11, E e11) {
            while (i11 > 2) {
                int grandparentIndex = getGrandparentIndex(i11);
                Object objElementData = MinMaxPriorityQueue.this.elementData(grandparentIndex);
                if (this.ordering.compare((E) objElementData, e11) <= 0) {
                    break;
                }
                MinMaxPriorityQueue.this.queue[i11] = objElementData;
                i11 = grandparentIndex;
            }
            MinMaxPriorityQueue.this.queue[i11] = e11;
            return i11;
        }

        public Heap(Ordering<E> ordering) {
            this.ordering = ordering;
        }

        private int getLeftChildIndex(int i11) {
            return (i11 * 2) + 1;
        }

        private int getParentIndex(int i11) {
            return (i11 - 1) / 2;
        }

        private int getRightChildIndex(int i11) {
            return (i11 * 2) + 2;
        }

        public int compareElements(int i11, int i12) {
            return this.ordering.compare((E) MinMaxPriorityQueue.this.elementData(i11), (E) MinMaxPriorityQueue.this.elementData(i12));
        }

        public int crossOverUp(int i11, E e11) {
            int rightChildIndex;
            if (i11 == 0) {
                MinMaxPriorityQueue.this.queue[0] = e11;
                return 0;
            }
            int parentIndex = getParentIndex(i11);
            Object objElementData = MinMaxPriorityQueue.this.elementData(parentIndex);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object objElementData2 = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData2, (E) objElementData) < 0) {
                    parentIndex = rightChildIndex;
                    objElementData = objElementData2;
                }
            }
            if (this.ordering.compare((E) objElementData, e11) >= 0) {
                MinMaxPriorityQueue.this.queue[i11] = e11;
                return i11;
            }
            MinMaxPriorityQueue.this.queue[i11] = objElementData;
            MinMaxPriorityQueue.this.queue[parentIndex] = e11;
            return parentIndex;
        }

        public int findMin(int i11, int i12) {
            if (i11 >= MinMaxPriorityQueue.this.size) {
                return -1;
            }
            Preconditions.checkState(i11 > 0);
            int iMin = Math.min(i11, MinMaxPriorityQueue.this.size - i12) + i12;
            for (int i13 = i11 + 1; i13 < iMin; i13++) {
                if (compareElements(i13, i11) < 0) {
                    i11 = i13;
                }
            }
            return i11;
        }

        public int swapWithConceptuallyLastElement(E e11) {
            int rightChildIndex;
            int parentIndex = getParentIndex(MinMaxPriorityQueue.this.size);
            if (parentIndex != 0 && (rightChildIndex = getRightChildIndex(getParentIndex(parentIndex))) != parentIndex && getLeftChildIndex(rightChildIndex) >= MinMaxPriorityQueue.this.size) {
                Object objElementData = MinMaxPriorityQueue.this.elementData(rightChildIndex);
                if (this.ordering.compare((E) objElementData, e11) < 0) {
                    MinMaxPriorityQueue.this.queue[rightChildIndex] = e11;
                    MinMaxPriorityQueue.this.queue[MinMaxPriorityQueue.this.size] = objElementData;
                    return rightChildIndex;
                }
            }
            return MinMaxPriorityQueue.this.size;
        }

        private int getGrandparentIndex(int i11) {
            return getParentIndex(getParentIndex(i11));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean verifyIndex(int i11) {
            if (getLeftChildIndex(i11) < MinMaxPriorityQueue.this.size && compareElements(i11, getLeftChildIndex(i11)) > 0) {
                return false;
            }
            if (getRightChildIndex(i11) < MinMaxPriorityQueue.this.size && compareElements(i11, getRightChildIndex(i11)) > 0) {
                return false;
            }
            if (i11 > 0 && compareElements(i11, getParentIndex(i11)) > 0) {
                return false;
            }
            if (i11 > 2 && compareElements(getGrandparentIndex(i11), i11) > 0) {
                return false;
            }
            return true;
        }

        public void bubbleUp(int i11, E e11) {
            Heap heap;
            int iCrossOverUp = crossOverUp(i11, e11);
            if (iCrossOverUp == i11) {
                iCrossOverUp = i11;
                heap = this;
            } else {
                heap = this.otherHeap;
            }
            heap.bubbleUpAlternatingLevels(iCrossOverUp, e11);
        }

        public int crossOver(int i11, E e11) {
            int iFindMinChild = findMinChild(i11);
            if (iFindMinChild > 0 && this.ordering.compare((E) MinMaxPriorityQueue.this.elementData(iFindMinChild), e11) < 0) {
                MinMaxPriorityQueue.this.queue[i11] = MinMaxPriorityQueue.this.elementData(iFindMinChild);
                MinMaxPriorityQueue.this.queue[iFindMinChild] = e11;
                return iFindMinChild;
            }
            return crossOverUp(i11, e11);
        }

        public int fillHoleAt(int i11) {
            while (true) {
                int iFindMinGrandChild = findMinGrandChild(i11);
                if (iFindMinGrandChild > 0) {
                    MinMaxPriorityQueue.this.queue[i11] = MinMaxPriorityQueue.this.elementData(iFindMinGrandChild);
                    i11 = iFindMinGrandChild;
                } else {
                    return i11;
                }
            }
        }

        public int findMinChild(int i11) {
            return findMin(getLeftChildIndex(i11), 2);
        }

        public int findMinGrandChild(int i11) {
            int leftChildIndex = getLeftChildIndex(i11);
            if (leftChildIndex < 0) {
                return -1;
            }
            return findMin(getLeftChildIndex(leftChildIndex), 4);
        }

        public MoveDesc<E> tryCrossOverAndBubbleUp(int i11, int i12, E e11) {
            Object objElementData;
            int iCrossOver = crossOver(i12, e11);
            if (iCrossOver == i12) {
                return null;
            }
            if (iCrossOver < i11) {
                objElementData = MinMaxPriorityQueue.this.elementData(i11);
            } else {
                objElementData = MinMaxPriorityQueue.this.elementData(getParentIndex(i11));
            }
            if (this.otherHeap.bubbleUpAlternatingLevels(iCrossOver, e11) >= i11) {
                return null;
            }
            return new MoveDesc<>(e11, objElementData);
        }
    }

    public class QueueIterator implements Iterator<E> {
        private boolean canRemove;
        private int cursor;
        private int expectedModCount;
        private Queue<E> forgetMeNot;
        private E lastFromForgetMeNot;
        private int nextCursor;
        private List<E> skipMe;

        private QueueIterator() {
            this.cursor = -1;
            this.nextCursor = -1;
            this.expectedModCount = MinMaxPriorityQueue.this.modCount;
        }

        private boolean removeExact(Object obj) {
            for (int i11 = 0; i11 < MinMaxPriorityQueue.this.size; i11++) {
                if (MinMaxPriorityQueue.this.queue[i11] == obj) {
                    MinMaxPriorityQueue.this.removeAt(i11);
                    return true;
                }
            }
            return false;
        }

        private void checkModCount() {
            if (MinMaxPriorityQueue.this.modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void nextNotInSkipMe(int i11) {
            if (this.nextCursor < i11) {
                if (this.skipMe != null) {
                    while (i11 < MinMaxPriorityQueue.this.size() && foundAndRemovedExactReference(this.skipMe, MinMaxPriorityQueue.this.elementData(i11))) {
                        i11++;
                    }
                }
                this.nextCursor = i11;
            }
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            checkModCount();
            this.canRemove = false;
            this.expectedModCount++;
            if (this.cursor >= MinMaxPriorityQueue.this.size()) {
                E e11 = this.lastFromForgetMeNot;
                Objects.requireNonNull(e11);
                Preconditions.checkState(removeExact(e11));
                this.lastFromForgetMeNot = null;
                return;
            }
            MoveDesc<E> moveDescRemoveAt = MinMaxPriorityQueue.this.removeAt(this.cursor);
            if (moveDescRemoveAt != null) {
                if (this.forgetMeNot == null || this.skipMe == null) {
                    this.forgetMeNot = new ArrayDeque();
                    this.skipMe = new ArrayList(3);
                }
                if (!foundAndRemovedExactReference(this.skipMe, moveDescRemoveAt.toTrickle)) {
                    this.forgetMeNot.add(moveDescRemoveAt.toTrickle);
                }
                if (!foundAndRemovedExactReference(this.forgetMeNot, moveDescRemoveAt.replaced)) {
                    this.skipMe.add(moveDescRemoveAt.replaced);
                }
            }
            this.cursor--;
            this.nextCursor--;
        }

        private boolean foundAndRemovedExactReference(Iterable<E> iterable, E e11) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e11) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Queue<E> queue;
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < MinMaxPriorityQueue.this.size() || ((queue = this.forgetMeNot) != null && !queue.isEmpty())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public E next() {
            checkModCount();
            nextNotInSkipMe(this.cursor + 1);
            if (this.nextCursor < MinMaxPriorityQueue.this.size()) {
                int i11 = this.nextCursor;
                this.cursor = i11;
                this.canRemove = true;
                return (E) MinMaxPriorityQueue.this.elementData(i11);
            }
            if (this.forgetMeNot != null) {
                this.cursor = MinMaxPriorityQueue.this.size();
                E ePoll = this.forgetMeNot.poll();
                this.lastFromForgetMeNot = ePoll;
                if (ePoll != null) {
                    this.canRemove = true;
                    return ePoll;
                }
            }
            throw new NoSuchElementException("iterator moved past last element in queue.");
        }
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create() {
        return new Builder(Ordering.natural()).create();
    }

    @VisibleForTesting
    public static int initialQueueSize(int i11, int i12, Iterable<?> iterable) {
        if (i11 == -1) {
            i11 = 11;
        }
        if (iterable instanceof Collection) {
            i11 = Math.max(i11, ((Collection) iterable).size());
        }
        return capAtMaximumSize(i11, i12);
    }

    @VisibleForTesting
    public static boolean isEvenLevel(int i11) {
        int i12 = ~(~(i11 + 1));
        Preconditions.checkState(i12 > 0, "negative index");
        return (EVEN_POWERS_OF_TWO & i12) > (i12 & ODD_POWERS_OF_TWO);
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i11 = 0; i11 < this.size; i11++) {
            this.queue[i11] = null;
        }
        this.size = 0;
    }

    @VisibleForTesting
    public boolean isIntact() {
        for (int i11 = 1; i11 < this.size; i11++) {
            if (!heapForIndex(i11).verifyIndex(i11)) {
                return false;
            }
        }
        return true;
    }

    public static class MoveDesc<E> {
        final E replaced;
        final E toTrickle;

        public MoveDesc(E e11, E e12) {
            this.toTrickle = e11;
            this.replaced = e12;
        }
    }

    private MinMaxPriorityQueue(Builder<? super E> builder, int i11) {
        Ordering ordering = builder.ordering();
        MinMaxPriorityQueue<E>.Heap heap = new Heap(ordering);
        this.minHeap = heap;
        MinMaxPriorityQueue<E>.Heap heap2 = new Heap(ordering.reverse());
        this.maxHeap = heap2;
        heap.otherHeap = heap2;
        heap2.otherHeap = heap;
        this.maximumSize = ((Builder) builder).maximumSize;
        this.queue = new Object[i11];
    }

    private int calculateNewCapacity() {
        int length = this.queue.length;
        return capAtMaximumSize(length < 64 ? (length + 1) * 2 : IntMath.checkedMultiply(length / 2, 3), this.maximumSize);
    }

    private static int capAtMaximumSize(int i11, int i12) {
        return Math.min(i11 - 1, i12) + 1;
    }

    public static <E extends Comparable<E>> MinMaxPriorityQueue<E> create(Iterable<? extends E> iterable) {
        return new Builder(Ordering.natural()).create(iterable);
    }

    public static Builder<Comparable> expectedSize(int i11) {
        return new Builder(Ordering.natural()).expectedSize(i11);
    }

    private int getMaxElementIndex() {
        int i11 = this.size;
        if (i11 != 1) {
            return (i11 == 2 || this.maxHeap.compareElements(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void growIfNeeded() {
        if (this.size > this.queue.length) {
            Object[] objArr = new Object[calculateNewCapacity()];
            Object[] objArr2 = this.queue;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.queue = objArr;
        }
    }

    public static Builder<Comparable> maximumSize(int i11) {
        return new Builder(Ordering.natural()).maximumSize(i11);
    }

    public static <B> Builder<B> orderedBy(Comparator<B> comparator) {
        return new Builder<>(comparator);
    }

    @VisibleForTesting
    public int capacity() {
        return this.queue.length;
    }

    public Comparator<? super E> comparator() {
        return this.minHeap.ordering;
    }

    public E elementData(int i11) {
        E e11 = (E) this.queue[i11];
        Objects.requireNonNull(e11);
        return e11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    @VisibleForTesting
    @CanIgnoreReturnValue
    public MoveDesc<E> removeAt(int i11) {
        Preconditions.checkPositionIndex(i11, this.size);
        this.modCount++;
        int i12 = this.size - 1;
        this.size = i12;
        if (i12 == i11) {
            this.queue[i12] = null;
            return null;
        }
        E eElementData = elementData(i12);
        int iSwapWithConceptuallyLastElement = heapForIndex(this.size).swapWithConceptuallyLastElement(eElementData);
        if (iSwapWithConceptuallyLastElement == i11) {
            this.queue[this.size] = null;
            return null;
        }
        E eElementData2 = elementData(this.size);
        this.queue[this.size] = null;
        MoveDesc<E> moveDescFillHole = fillHole(i11, eElementData2);
        if (iSwapWithConceptuallyLastElement < i11) {
            return moveDescFillHole == null ? new MoveDesc<>(eElementData, eElementData2) : new MoveDesc<>(eElementData, moveDescFillHole.replaced);
        }
        return moveDescFillHole;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J2ktIncompatible
    public Object[] toArray() {
        int i11 = this.size;
        Object[] objArr = new Object[i11];
        System.arraycopy(this.queue, 0, objArr, 0, i11);
        return objArr;
    }

    private MoveDesc<E> fillHole(int i11, E e11) {
        MinMaxPriorityQueue<E>.Heap heapHeapForIndex = heapForIndex(i11);
        int iFillHoleAt = heapHeapForIndex.fillHoleAt(i11);
        int iBubbleUpAlternatingLevels = heapHeapForIndex.bubbleUpAlternatingLevels(iFillHoleAt, e11);
        if (iBubbleUpAlternatingLevels == iFillHoleAt) {
            return heapHeapForIndex.tryCrossOverAndBubbleUp(i11, iFillHoleAt, e11);
        }
        if (iBubbleUpAlternatingLevels < i11) {
            return new MoveDesc<>(e11, elementData(i11));
        }
        return null;
    }

    private MinMaxPriorityQueue<E>.Heap heapForIndex(int i11) {
        if (isEvenLevel(i11)) {
            return this.minHeap;
        }
        return this.maxHeap;
    }

    private E removeAndGet(int i11) {
        E eElementData = elementData(i11);
        removeAt(i11);
        return eElementData;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e11) {
        offer(e11);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            offer(it.next());
            z11 = true;
        }
        return z11;
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e11) {
        Preconditions.checkNotNull(e11);
        this.modCount++;
        int i11 = this.size;
        this.size = i11 + 1;
        growIfNeeded();
        heapForIndex(i11).bubbleUp(i11, e11);
        if (this.size <= this.maximumSize || pollLast() != e11) {
            return true;
        }
        return false;
    }

    @Override // java.util.Queue
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return elementData(0);
    }

    public E peekFirst() {
        return peek();
    }

    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return elementData(getMaxElementIndex());
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(0);
    }

    @CanIgnoreReturnValue
    public E pollFirst() {
        return poll();
    }

    @CanIgnoreReturnValue
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return removeAndGet(getMaxElementIndex());
    }

    @CanIgnoreReturnValue
    public E removeFirst() {
        return remove();
    }

    @CanIgnoreReturnValue
    public E removeLast() {
        if (!isEmpty()) {
            return removeAndGet(getMaxElementIndex());
        }
        throw new NoSuchElementException();
    }
}
