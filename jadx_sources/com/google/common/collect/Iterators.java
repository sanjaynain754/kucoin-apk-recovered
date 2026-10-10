package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import p852kotlin.text.Typography;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Iterators {

    public static final class ArrayItr<T> extends AbstractIndexedListIterator<T> {
        static final UnmodifiableListIterator<Object> EMPTY = new ArrayItr(new Object[0], 0);
        private final T[] array;

        public ArrayItr(T[] tArr, int i11) {
            super(tArr.length, i11);
            this.array = tArr;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        @ParametricNullness
        public T get(int i11) {
            return this.array[i11];
        }
    }

    public static class ConcatenatedIterator<T> implements Iterator<T> {
        private Iterator<? extends T> iterator = Iterators.emptyIterator();
        private Deque<Iterator<? extends Iterator<? extends T>>> metaIterators;
        private Iterator<? extends T> toRemove;
        private Iterator<? extends Iterator<? extends T>> topMetaIterator;

        private Iterator<? extends Iterator<? extends T>> getTopMetaIterator() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.topMetaIterator;
                if (it != null && it.hasNext()) {
                    return this.topMetaIterator;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.metaIterators;
                if (deque == null || deque.isEmpty()) {
                    return null;
                }
                this.topMetaIterator = this.metaIterators.removeFirst();
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (!((Iterator) Preconditions.checkNotNull(this.iterator)).hasNext()) {
                Iterator<? extends Iterator<? extends T>> topMetaIterator = getTopMetaIterator();
                this.topMetaIterator = topMetaIterator;
                if (topMetaIterator == null) {
                    return false;
                }
                Iterator<? extends T> next = topMetaIterator.next();
                this.iterator = next;
                if (next instanceof ConcatenatedIterator) {
                    ConcatenatedIterator concatenatedIterator = (ConcatenatedIterator) next;
                    this.iterator = concatenatedIterator.iterator;
                    if (this.metaIterators == null) {
                        this.metaIterators = new ArrayDeque();
                    }
                    this.metaIterators.addFirst(this.topMetaIterator);
                    if (concatenatedIterator.metaIterators != null) {
                        while (!concatenatedIterator.metaIterators.isEmpty()) {
                            this.metaIterators.addFirst(concatenatedIterator.metaIterators.removeLast());
                        }
                    }
                    this.topMetaIterator = concatenatedIterator.topMetaIterator;
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            Iterator<? extends T> it = this.toRemove;
            if (it == null) {
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
            it.remove();
            this.toRemove = null;
        }

        public ConcatenatedIterator(Iterator<? extends Iterator<? extends T>> it) {
            this.topMetaIterator = (Iterator) Preconditions.checkNotNull(it);
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.iterator;
                this.toRemove = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }
    }

    public enum EmptyModifiableIterator implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(false);
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }
    }

    public static class MergingIterator<T> extends UnmodifiableIterator<T> {
        final Queue<PeekingIterator<T>> queue;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.queue.isEmpty();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            PeekingIterator<T> peekingIteratorRemove = this.queue.remove();
            T next = peekingIteratorRemove.next();
            if (peekingIteratorRemove.hasNext()) {
                this.queue.add(peekingIteratorRemove);
            }
            return next;
        }

        public MergingIterator(Iterable<? extends Iterator<? extends T>> iterable, final Comparator<? super T> comparator) {
            this.queue = new PriorityQueue(2, new Comparator() { // from class: com.google.common.collect.n2
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return comparator.compare(((PeekingIterator) obj).peek(), ((PeekingIterator) obj2).peek());
                }
            });
            for (Iterator<? extends T> it : iterable) {
                if (it.hasNext()) {
                    this.queue.add(Iterators.peekingIterator(it));
                }
            }
        }
    }

    public static class PeekingImpl<E> implements PeekingIterator<E> {
        private boolean hasPeeked;
        private final Iterator<? extends E> iterator;
        private E peekedElement;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasPeeked || this.iterator.hasNext();
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        @ParametricNullness
        public E next() {
            if (!this.hasPeeked) {
                return this.iterator.next();
            }
            E e11 = (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
            this.hasPeeked = false;
            this.peekedElement = null;
            return e11;
        }

        @Override // com.google.common.collect.PeekingIterator
        @ParametricNullness
        public E peek() {
            if (!this.hasPeeked) {
                this.peekedElement = this.iterator.next();
                this.hasPeeked = true;
            }
            return (E) NullnessCasts.uncheckedCastNullableTToT(this.peekedElement);
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
            Preconditions.checkState(!this.hasPeeked, "Can't remove after you've peeked at next");
            this.iterator.remove();
        }

        public PeekingImpl(Iterator<? extends E> it) {
            this.iterator = (Iterator) Preconditions.checkNotNull(it);
        }
    }

    public static final class SingletonIterator<T> extends UnmodifiableIterator<T> {
        private boolean done;
        private final T value;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.done;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (this.done) {
                throw new NoSuchElementException();
            }
            this.done = true;
            return this.value;
        }

        public SingletonIterator(T t11) {
            this.value = t11;
        }
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        return concat(consumingForArray(it, it2));
    }

    public static boolean contains(Iterator<?> it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterator<T> cycle(final Iterable<T> iterable) {
        Preconditions.checkNotNull(iterable);
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.2
            Iterator<T> iterator = Iterators.emptyModifiableIterator();

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext() || iterable.iterator().hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (!this.iterator.hasNext()) {
                    Iterator<T> it = iterable.iterator();
                    this.iterator = it;
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                }
                return this.iterator.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        };
    }

    public static <T> UnmodifiableIterator<T> filter(final Iterator<T> it, final Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new AbstractIterator<T>() { // from class: com.google.common.collect.Iterators.5
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // com.google.common.collect.AbstractIterator
            public T computeNext() {
                while (it.hasNext()) {
                    T t11 = (T) it.next();
                    if (predicate.apply(t11)) {
                        return t11;
                    }
                }
                return endOfData();
            }
        };
    }

    @ParametricNullness
    public static <T> T find(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @SafeVarargs
    public static <T> UnmodifiableIterator<T> forArray(T... tArr) {
        return forArrayWithPosition(tArr, 0);
    }

    public static <T> UnmodifiableListIterator<T> forArrayWithPosition(T[] tArr, int i11) {
        if (tArr.length != 0) {
            return new ArrayItr(tArr, i11);
        }
        Preconditions.checkPositionIndex(i11, tArr.length);
        return emptyListIterator();
    }

    public static int frequency(Iterator<?> it, Object obj) {
        int i11 = 0;
        while (contains(it, obj)) {
            i11++;
        }
        return i11;
    }

    @ParametricNullness
    public static <T> T get(Iterator<T> it, int i11) {
        checkNonnegative(i11);
        int iAdvance = advance(it, i11);
        if (it.hasNext()) {
            return it.next();
        }
        throw new IndexOutOfBoundsException("position (" + i11 + ") must be less than the number of elements that remained (" + iAdvance + ")");
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<T> it) {
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("expected one element but was: <");
        sb2.append(next);
        for (int i11 = 0; i11 < 4 && it.hasNext(); i11++) {
            sb2.append(", ");
            sb2.append(it.next());
        }
        if (it.hasNext()) {
            sb2.append(", ...");
        }
        sb2.append(Typography.greater);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static <T> UnmodifiableIterator<List<T>> paddedPartition(Iterator<T> it, int i11) {
        return partitionImpl(it, i11, true);
    }

    public static <T> UnmodifiableIterator<List<T>> partition(Iterator<T> it, int i11) {
        return partitionImpl(it, i11, false);
    }

    public static <T> PeekingIterator<T> peekingIterator(Iterator<? extends T> it) {
        return it instanceof PeekingImpl ? (PeekingImpl) it : new PeekingImpl(it);
    }

    public static <T> UnmodifiableIterator<T> unmodifiableIterator(final Iterator<? extends T> it) {
        Preconditions.checkNotNull(it);
        return it instanceof UnmodifiableIterator ? (UnmodifiableIterator) it : new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) it.next();
            }
        };
    }

    public static void checkNonnegative(int i11) {
        if (i11 >= 0) {
            return;
        }
        throw new IndexOutOfBoundsException("position (" + i11 + ") must not be negative");
    }

    private static <I extends Iterator<?>> Iterator<I> consumingForArray(final I... iArr) {
        return new UnmodifiableIterator<I>() { // from class: com.google.common.collect.Iterators.3
            int index = 0;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < iArr.length;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TI; */
            @Override // java.util.Iterator
            public Iterator next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Iterator it = iArr[this.index];
                Objects.requireNonNull(it);
                Iterator it2 = it;
                Iterator[] itArr = iArr;
                int i11 = this.index;
                itArr[i11] = null;
                this.index = i11 + 1;
                return it2;
            }
        };
    }

    public static <T> UnmodifiableListIterator<T> emptyListIterator() {
        return (UnmodifiableListIterator<T>) ArrayItr.EMPTY;
    }

    public static <T> Iterator<T> emptyModifiableIterator() {
        return EmptyModifiableIterator.INSTANCE;
    }

    public static <T> int indexOf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i11 = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static <T> UnmodifiableIterator<T> mergeSorted(Iterable<? extends Iterator<? extends T>> iterable, Comparator<? super T> comparator) {
        Preconditions.checkNotNull(iterable, "iterators");
        Preconditions.checkNotNull(comparator, "comparator");
        return new MergingIterator(iterable, comparator);
    }

    public static <T> UnmodifiableIterator<T> singletonIterator(@ParametricNullness T t11) {
        return new SingletonIterator(t11);
    }

    public static int size(Iterator<?> it) {
        long j11 = 0;
        while (it.hasNext()) {
            it.next();
            j11++;
        }
        return Ints.saturatedCast(j11);
    }

    public static String toString(Iterator<?> it) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        boolean z11 = true;
        while (it.hasNext()) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z11 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }

    private Iterators() {
    }

    @CanIgnoreReturnValue
    public static <T> boolean addAll(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    @CanIgnoreReturnValue
    public static int advance(Iterator<?> it, int i11) {
        boolean z11;
        Preconditions.checkNotNull(it);
        int i12 = 0;
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "numberToAdvance must be nonnegative");
        while (i12 < i11 && it.hasNext()) {
            it.next();
            i12++;
        }
        return i12;
    }

    public static <T> boolean all(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            if (!predicate.apply(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean any(Iterator<T> it, Predicate<? super T> predicate) {
        if (indexOf(it, predicate) != -1) {
            return true;
        }
        return false;
    }

    public static <T> Enumeration<T> asEnumeration(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new Enumeration<T>() { // from class: com.google.common.collect.Iterators.10
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            @ParametricNullness
            public T nextElement() {
                return (T) it.next();
            }
        };
    }

    public static void clear(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> Iterator<T> concatNoDefensiveCopy(Iterator<? extends T>... itArr) {
        for (Iterator it : (Iterator[]) Preconditions.checkNotNull(itArr)) {
            Preconditions.checkNotNull(it);
        }
        return concat(consumingForArray(itArr));
    }

    public static <T> Iterator<T> consumingIterator(final Iterator<T> it) {
        Preconditions.checkNotNull(it);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                T t11 = (T) it.next();
                it.remove();
                return t11;
            }

            public String toString() {
                return "Iterators.consumingIterator(...)";
            }
        };
    }

    @SafeVarargs
    public static <T> Iterator<T> cycle(T... tArr) {
        return cycle(Lists.newArrayList(tArr));
    }

    public static boolean elementsEqual(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !com.google.common.base.Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> UnmodifiableIterator<T> emptyIterator() {
        return emptyListIterator();
    }

    public static <T> UnmodifiableIterator<T> forEnumeration(final Enumeration<T> enumeration) {
        Preconditions.checkNotNull(enumeration);
        return new UnmodifiableIterator<T>() { // from class: com.google.common.collect.Iterators.9
            @Override // java.util.Iterator
            public boolean hasNext() {
                return enumeration.hasMoreElements();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                return (T) enumeration.nextElement();
            }
        };
    }

    @ParametricNullness
    public static <T> T getLast(Iterator<? extends T> it, @ParametricNullness T t11) {
        return it.hasNext() ? (T) getLast(it) : t11;
    }

    @ParametricNullness
    public static <T> T getNext(Iterator<? extends T> it, @ParametricNullness T t11) {
        if (it.hasNext()) {
            return it.next();
        }
        return t11;
    }

    public static <T> Iterator<T> limit(final Iterator<T> it, final int i11) {
        boolean z11;
        Preconditions.checkNotNull(it);
        if (i11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "limit is negative");
        return new Iterator<T>() { // from class: com.google.common.collect.Iterators.7
            private int count;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.count < i11 && it.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                it.remove();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public T next() {
                if (hasNext()) {
                    this.count++;
                    return (T) it.next();
                }
                throw new NoSuchElementException();
            }
        };
    }

    private static <T> UnmodifiableIterator<List<T>> partitionImpl(final Iterator<T> it, final int i11, final boolean z11) {
        boolean z12;
        Preconditions.checkNotNull(it);
        if (i11 > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Preconditions.checkArgument(z12);
        return new UnmodifiableIterator<List<T>>() { // from class: com.google.common.collect.Iterators.4
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public List<T> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = new Object[i11];
                int i12 = 0;
                while (i12 < i11 && it.hasNext()) {
                    objArr[i12] = it.next();
                    i12++;
                }
                for (int i13 = i12; i13 < i11; i13++) {
                    objArr[i13] = null;
                }
                List<T> listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(objArr));
                return (z11 || i12 == i11) ? listUnmodifiableList : listUnmodifiableList.subList(0, i12);
            }
        };
    }

    public static <T> T pollNext(Iterator<T> it) {
        if (it.hasNext()) {
            T next = it.next();
            it.remove();
            return next;
        }
        return null;
    }

    @CanIgnoreReturnValue
    public static boolean removeAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z11 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @CanIgnoreReturnValue
    public static <T> boolean removeIf(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z11 = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @CanIgnoreReturnValue
    public static boolean retainAll(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z11 = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    @GwtIncompatible
    public static <T> T[] toArray(Iterator<? extends T> it, Class<T> cls) {
        return (T[]) Iterables.toArray(Lists.newArrayList(it), cls);
    }

    public static <F, T> Iterator<T> transform(Iterator<F> it, final Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new TransformedIterator<F, T>(it) { // from class: com.google.common.collect.Iterators.6
            @Override // com.google.common.collect.TransformedIterator
            @ParametricNullness
            public T transform(@ParametricNullness F f11) {
                return (T) function.apply(f11);
            }
        };
    }

    public static <T> Optional<T> tryFind(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return Optional.m13374of(next);
            }
        }
        return Optional.absent();
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        return concat(consumingForArray(it, it2, it3));
    }

    @GwtIncompatible
    public static <T> UnmodifiableIterator<T> filter(Iterator<?> it, Class<T> cls) {
        return filter(it, Predicates.instanceOf(cls));
    }

    @Deprecated
    public static <T> PeekingIterator<T> peekingIterator(PeekingIterator<T> peekingIterator) {
        return (PeekingIterator) Preconditions.checkNotNull(peekingIterator);
    }

    @Deprecated
    public static <T> UnmodifiableIterator<T> unmodifiableIterator(UnmodifiableIterator<T> unmodifiableIterator) {
        return (UnmodifiableIterator) Preconditions.checkNotNull(unmodifiableIterator);
    }

    @ParametricNullness
    public static <T> T get(Iterator<? extends T> it, int i11, @ParametricNullness T t11) {
        checkNonnegative(i11);
        advance(it, i11);
        return (T) getNext(it, t11);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public static <T> T find(Iterator<? extends T> it, Predicate<? super T> predicate, T t11) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t11;
    }

    public static <T> Iterator<T> concat(Iterator<? extends T> it, Iterator<? extends T> it2, Iterator<? extends T> it3, Iterator<? extends T> it4) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(it2);
        Preconditions.checkNotNull(it3);
        Preconditions.checkNotNull(it4);
        return concat(consumingForArray(it, it2, it3, it4));
    }

    @ParametricNullness
    public static <T> T getOnlyElement(Iterator<? extends T> it, @ParametricNullness T t11) {
        return it.hasNext() ? (T) getOnlyElement(it) : t11;
    }

    @SafeVarargs
    public static <T> Iterator<T> concat(Iterator<? extends T>... itArr) {
        return concatNoDefensiveCopy((Iterator[]) Arrays.copyOf(itArr, itArr.length));
    }

    public static <T> Iterator<T> concat(Iterator<? extends Iterator<? extends T>> it) {
        return new ConcatenatedIterator(it);
    }
}
