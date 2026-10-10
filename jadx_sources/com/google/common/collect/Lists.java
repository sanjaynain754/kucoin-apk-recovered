package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Lists {

    /* JADX INFO: loaded from: classes56.dex */
    public static class AbstractListWrapper<E> extends AbstractList<E> {
        final List<E> backingList;

        @Override // java.util.AbstractList, java.util.List
        public void add(int i11, @ParametricNullness E e11) {
            this.backingList.add(i11, e11);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i11, Collection<? extends E> collection) {
            return this.backingList.addAll(i11, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.backingList.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i11) {
            return this.backingList.get(i11);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E remove(int i11) {
            return this.backingList.remove(i11);
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E set(int i11, @ParametricNullness E e11) {
            return this.backingList.set(i11, e11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.backingList.size();
        }

        public AbstractListWrapper(List<E> list) {
            this.backingList = (List) Preconditions.checkNotNull(list);
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static final class CharSequenceAsList extends AbstractList<Character> {
        private final CharSequence sequence;

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Character.valueOf(this.sequence.charAt(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.sequence.length();
        }

        public CharSequenceAsList(CharSequence charSequence) {
            this.sequence = charSequence;
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @J2ktIncompatible
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 1);
        }

        public OnePlusArrayList(@ParametricNullness E e11, E[] eArr) {
            this.first = e11;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            if (i11 == 0) {
                return this.first;
            }
            return this.rest[i11 - 1];
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class Partition<T> extends AbstractList<List<T>> {
        final List<T> list;
        final int size;

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            int i12 = this.size;
            int i13 = i11 * i12;
            return this.list.subList(i13, Math.min(i12 + i13, this.list.size()));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.list.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.divide(this.list.size(), this.size, RoundingMode.CEILING);
        }

        public Partition(List<T> list, int i11) {
            this.list = list;
            this.size = i11;
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class ReverseList<T> extends AbstractList<T> {
        private final List<T> forwardList;

        @Override // java.util.AbstractList, java.util.List
        public void add(int i11, @ParametricNullness T t11) {
            this.forwardList.add(reversePosition(i11), t11);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.forwardList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i11) {
            return this.forwardList.get(reverseIndex(i11));
        }

        public List<T> getForwardList() {
            return this.forwardList;
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T remove(int i11) {
            return this.forwardList.remove(reverseIndex(i11));
        }

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T set(int i11, @ParametricNullness T t11) {
            return this.forwardList.set(reverseIndex(i11), t11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        public ReverseList(List<T> list) {
            this.forwardList = (List) Preconditions.checkNotNull(list);
        }

        private int reverseIndex(int i11) {
            int size = size();
            Preconditions.checkElementIndex(i11, size);
            return (size - 1) - i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int reversePosition(int i11) {
            int size = size();
            Preconditions.checkPositionIndex(i11, size);
            return size - i11;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i11) {
            final ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(i11));
            return new ListIterator<T>(this) { // from class: com.google.common.collect.Lists.ReverseList.1
                boolean canRemoveOrSet;
                final /* synthetic */ ReverseList this$0;

                {
                    this.this$0 = this;
                }

                @Override // java.util.ListIterator
                public void add(@ParametricNullness T t11) {
                    listIterator.add(t11);
                    listIterator.previous();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return this.this$0.reversePosition(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(this.canRemoveOrSet);
                    listIterator.remove();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator
                public void set(@ParametricNullness T t11) {
                    Preconditions.checkState(this.canRemoveOrSet);
                    listIterator.set(t11);
                }

                @Override // java.util.ListIterator, java.util.Iterator
                @ParametricNullness
                public T next() {
                    if (hasNext()) {
                        this.canRemoveOrSet = true;
                        return (T) listIterator.previous();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                @ParametricNullness
                public T previous() {
                    if (hasPrevious()) {
                        this.canRemoveOrSet = true;
                        return (T) listIterator.next();
                    }
                    throw new NoSuchElementException();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }
            };
        }

        @Override // java.util.AbstractList
        public void removeRange(int i11, int i12) {
            subList(i11, i12).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            return Lists.reverse(this.forwardList.subList(reversePosition(i12), reversePosition(i11)));
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // java.util.List
        public Character get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return Character.valueOf(this.string.charAt(i11));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            return Lists.charactersOf(this.string.substring(i11, i12));
        }

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public T get(int i11) {
            return this.function.apply(this.fromList.get(i11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i11) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i11)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                @Override // com.google.common.collect.TransformedIterator
                public T transform(F f11) {
                    return TransformingRandomAccessList.this.function.apply(f11);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i11) {
            return this.function.apply(this.fromList.remove(i11));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i11, int i12) {
            this.fromList.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }

        public TransformingRandomAccessList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final Function<? super F, ? extends T> function;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i11) {
            return new TransformedListIterator<F, T>(this.fromList.listIterator(i11)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                @Override // com.google.common.collect.TransformedIterator
                @ParametricNullness
                public T transform(@ParametricNullness F f11) {
                    return TransformingSequentialList.this.function.apply(f11);
                }
            };
        }

        @Override // java.util.AbstractList
        public void removeRange(int i11, int i12) {
            this.fromList.subList(i11, i12).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }

        public TransformingSequentialList(List<F> list, Function<? super F, ? extends T> function) {
            this.fromList = (List) Preconditions.checkNotNull(list);
            this.function = (Function) Preconditions.checkNotNull(function);
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {

        @J2ktIncompatible
        private static final long serialVersionUID = 0;

        @ParametricNullness
        final E first;
        final E[] rest;

        @ParametricNullness
        final E second;

        @Override // java.util.AbstractList, java.util.List
        @ParametricNullness
        public E get(int i11) {
            if (i11 == 0) {
                return this.first;
            }
            if (i11 == 1) {
                return this.second;
            }
            Preconditions.checkElementIndex(i11, size());
            return this.rest[i11 - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return IntMath.saturatedAdd(this.rest.length, 2);
        }

        public TwoPlusArrayList(@ParametricNullness E e11, @ParametricNullness E e12, E[] eArr) {
            this.first = e11;
            this.second = e12;
            this.rest = (E[]) ((Object[]) Preconditions.checkNotNull(eArr));
        }
    }

    public static <E> List<E> asList(@ParametricNullness E e11, E[] eArr) {
        return new OnePlusArrayList(e11, eArr);
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return CartesianList.create(list);
    }

    public static ImmutableList<Character> charactersOf(String str) {
        return new StringAsImmutableList((String) Preconditions.checkNotNull(str));
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
        public RandomAccessListWrapper(List<E> list) {
            super(list);
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        public RandomAccessPartition(List<T> list, int i11) {
            super(list, i11);
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        public RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    public static <E> List<E> asList(@ParametricNullness E e11, @ParametricNullness E e12, E[] eArr) {
        return new TwoPlusArrayList(e11, e12, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static <T> List<T> cast(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        return new CharSequenceAsList((CharSequence) Preconditions.checkNotNull(charSequence));
    }

    @VisibleForTesting
    public static int computeArrayListCapacity(int i11) {
        CollectPreconditions.checkNonnegative(i11, "arraySize");
        return Ints.saturatedCast(((long) i11) + 5 + ((long) (i11 / 10)));
    }

    public static int indexOfImpl(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (Objects.equal(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int lastIndexOfImpl(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (Objects.equal(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ListIterator<E> listIteratorImpl(List<E> list, int i11) {
        return new AbstractListWrapper(list).listIterator(i11);
    }

    @SafeVarargs
    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        Preconditions.checkNotNull(eArr);
        ArrayList<E> arrayList = new ArrayList<>(computeArrayListCapacity(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithCapacity(int i11) {
        CollectPreconditions.checkNonnegative(i11, "initialArraySize");
        return new ArrayList<>(i11);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i11) {
        return new ArrayList<>(computeArrayListCapacity(i11));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable));
    }

    @GwtCompatible(serializable = true)
    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedListNewLinkedList = newLinkedList();
        Iterables.addAll(linkedListNewLinkedList, iterable);
        return linkedListNewLinkedList;
    }

    public static <T> List<T> reverse(List<T> list) {
        if (list instanceof ImmutableList) {
            return ((ImmutableList) list).reverse();
        }
        if (list instanceof ReverseList) {
            return ((ReverseList) list).getForwardList();
        }
        return list instanceof RandomAccess ? new RandomAccessReverseList(list) : new ReverseList(list);
    }

    public static <E> List<E> subListImpl(List<E> list, int i11, int i12) {
        return (list instanceof RandomAccess ? new RandomAccessListWrapper<E>(list) { // from class: com.google.common.collect.Lists.1

            @J2ktIncompatible
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator<E> listIterator(int i13) {
                return this.backingList.listIterator(i13);
            }
        } : new AbstractListWrapper<E>(list) { // from class: com.google.common.collect.Lists.2

            @J2ktIncompatible
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator<E> listIterator(int i13) {
                return this.backingList.listIterator(i13);
            }
        }).subList(i11, i12);
    }

    public static <F, T> List<T> transform(List<F> list, Function<? super F, ? extends T> function) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, function) : new TransformingSequentialList(list, function);
    }

    private Lists() {
    }

    public static <E> boolean addAllImpl(List<E> list, int i11, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i11);
        Iterator<? extends E> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z11 = true;
        }
        return z11;
    }

    public static boolean equalsImpl(List<?> list, Object obj) {
        if (obj == Preconditions.checkNotNull(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if ((list instanceof RandomAccess) && (list2 instanceof RandomAccess)) {
            for (int i11 = 0; i11 < size; i11++) {
                if (!Objects.equal(list.get(i11), list2.get(i11))) {
                    return false;
                }
            }
            return true;
        }
        return Iterators.elementsEqual(list.iterator(), list2.iterator());
    }

    public static int hashCodeImpl(List<?> list) {
        int iHashCode;
        int i11 = 1;
        for (Object obj : list) {
            int i12 = i11 * 31;
            if (obj == null) {
                iHashCode = 0;
            } else {
                iHashCode = obj.hashCode();
            }
            i11 = ~(~(i12 + iHashCode));
        }
        return i11;
    }

    private static int indexOfRandomAccess(List<?> list, Object obj) {
        int size = list.size();
        int i11 = 0;
        if (obj == null) {
            while (i11 < size) {
                if (list.get(i11) == null) {
                    return i11;
                }
                i11++;
            }
            return -1;
        }
        while (i11 < size) {
            if (obj.equals(list.get(i11))) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static <T> List<List<T>> partition(List<T> list, int i11) {
        boolean z11;
        Preconditions.checkNotNull(list);
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11);
        if (list instanceof RandomAccess) {
            return new RandomAccessPartition(list, i11);
        }
        return new Partition(list, i11);
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            return new ArrayList<>((Collection) iterable);
        }
        return newArrayList(iterable.iterator());
    }

    @GwtCompatible(serializable = true)
    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayListNewArrayList = newArrayList();
        Iterators.addAll(arrayListNewArrayList, it);
        return arrayListNewArrayList;
    }
}
