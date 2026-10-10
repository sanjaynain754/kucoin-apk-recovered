package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess {
    private static final UnmodifiableListIterator<Object> EMPTY_ITR = new Itr(RegularImmutableList.EMPTY, 0);
    private static final long serialVersionUID = -889275714;

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            this(4);
        }

        public ImmutableList<E> buildSorted(Comparator<? super E> comparator) {
            this.forceCopy = true;
            Arrays.sort(this.contents, 0, this.size, comparator);
            return ImmutableList.asImmutableList(this.contents, this.size);
        }

        public Builder(int i11) {
            super(i11);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableList<E> build() {
            this.forceCopy = true;
            return ImmutableList.asImmutableList(this.contents, this.size);
        }

        @CanIgnoreReturnValue
        public Builder<E> combine(Builder<E> builder) {
            addAll(builder.contents, builder.size);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e11) {
            super.add((Object) e11);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    public static class Itr<E> extends AbstractIndexedListIterator<E> {
        private final ImmutableList<E> list;

        @Override // com.google.common.collect.AbstractIndexedListIterator
        public E get(int i11) {
            return this.list.get(i11);
        }

        public Itr(ImmutableList<E> immutableList, int i11) {
            super(immutableList.size(), i11);
            this.list = immutableList;
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public static class ReverseImmutableList<E> extends ImmutableList<E> {
        private final transient ImmutableList<E> forwardList;

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.forwardList.contains(obj);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.forwardList.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return reverseIndex(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return this.forwardList.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.forwardList.indexOf(obj);
            if (iIndexOf >= 0) {
                return reverseIndex(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return super.listIterator(i11);
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.forwardList;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, size());
            return this.forwardList.subList(reversePosition(i12), reversePosition(i11)).reverse();
        }

        public ReverseImmutableList(ImmutableList<E> immutableList) {
            this.forwardList = immutableList;
        }

        private int reverseIndex(int i11) {
            return (size() - 1) - i11;
        }

        private int reversePosition(int i11) {
            return size() - i11;
        }

        @Override // java.util.List
        public E get(int i11) {
            Preconditions.checkElementIndex(i11, size());
            return this.forwardList.get(reverseIndex(i11));
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    @J2ktIncompatible
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public Object readResolve() {
            return ImmutableList.copyOf(this.elements);
        }

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    public class SubList extends ImmutableList<E> {
        final transient int length;
        final transient int offset;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        public SubList(int i11, int i12) {
            this.offset = i11;
            this.length = i12;
        }

        @Override // java.util.List
        public E get(int i11) {
            Preconditions.checkElementIndex(i11, this.length);
            return ImmutableList.this.get(i11 + this.offset);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public Object[] internalArray() {
            return ImmutableList.this.internalArray();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayEnd() {
            return ImmutableList.this.internalArrayStart() + this.offset + this.length;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int internalArrayStart() {
            return ImmutableList.this.internalArrayStart() + this.offset;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return super.listIterator(i11);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.length;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i11, int i12) {
            Preconditions.checkPositionIndexes(i11, i12, this.length);
            ImmutableList immutableList = ImmutableList.this;
            int i13 = this.offset;
            return immutableList.subList(i11 + i13, i12 + i13);
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr) {
        return asImmutableList(objArr, objArr.length);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13439of() {
        return (ImmutableList<E>) RegularImmutableList.EMPTY;
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) Iterables.toArray(iterable, new Comparable[0]);
        ObjectArrays.checkElementsNotNull(comparableArr);
        Arrays.sort(comparableArr);
        return asImmutableList(comparableArr);
    }

    public static <E> ImmutableList<E> asImmutableList(Object[] objArr, int i11) {
        return i11 == 0 ? m13439of() : new RegularImmutableList(objArr, i11);
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i11) {
        CollectPreconditions.checkNonnegative(i11, "expectedSize");
        return new Builder<>(i11);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13440of(E e11) {
        return construct(e11);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i11, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.indexOfImpl(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.lastIndexOfImpl(this, obj);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i11, E e11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i11, int i12) {
        Preconditions.checkPositionIndexes(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        return i13 == 0 ? m13439of() : subListUnchecked(i11, i12);
    }

    public ImmutableList<E> subListUnchecked(int i11, int i12) {
        return new SubList(i11, i12 - i11);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    private static <E> ImmutableList<E> construct(Object... objArr) {
        return asImmutableList(ObjectArrays.checkElementsNotNull(objArr));
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13441of(E e11, E e12) {
        return construct(e11, e12);
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return CollectCollectors.toImmutableList();
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i11 + i12] = get(i12);
        }
        return i11 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return Lists.equalsImpl(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~((i11 * 31) + get(i12).hashCode()));
        }
        return i11;
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    public ImmutableList<E> reverse() {
        if (size() <= 1) {
            return this;
        }
        return new ReverseImmutableList(this);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13442of(E e11, E e12, E e13) {
        return construct(e11, e12, e13);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator(int i11) {
        Preconditions.checkPositionIndex(i11, size());
        if (isEmpty()) {
            return (UnmodifiableListIterator<E>) EMPTY_ITR;
        }
        return new Itr(this, i11);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> immutableListAsList = ((ImmutableCollection) collection).asList();
            return immutableListAsList.isPartialView() ? asImmutableList(immutableListAsList.toArray()) : immutableListAsList;
        }
        return construct(collection.toArray());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13443of(E e11, E e12, E e13, E e14) {
        return construct(e11, e12, e13, e14);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] array = Iterables.toArray(iterable);
        ObjectArrays.checkElementsNotNull(array);
        Arrays.sort(array, comparator);
        return asImmutableList(array);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13444of(E e11, E e12, E e13, E e14, E e15) {
        return construct(e11, e12, e13, e14, e15);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13445of(E e11, E e12, E e13, E e14, E e15, E e16) {
        return construct(e11, e12, e13, e14, e15, e16);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13446of(E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return construct(e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m13439of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return m13440of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13447of(E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return construct(e11, e12, e13, e14, e15, e16, e17, e18);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13448of(E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        return construct(e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13449of(E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e21) {
        return construct(e11, e12, e13, e14, e15, e16, e17, e18, e19, e21);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13450of(E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e21, E e22) {
        return construct(e11, e12, e13, e14, e15, e16, e17, e18, e19, e21, e22);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableList<E> m13451of(E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e21, E e22, E e23, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e11;
        objArr[1] = e12;
        objArr[2] = e13;
        objArr[3] = e14;
        objArr[4] = e15;
        objArr[5] = e16;
        objArr[6] = e17;
        objArr[7] = e18;
        objArr[8] = e19;
        objArr[9] = e21;
        objArr[10] = e22;
        objArr[11] = e23;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return construct(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return m13439of();
        }
        return construct((Object[]) eArr.clone());
    }

    @Override // com.google.common.collect.ImmutableCollection
    @InlineMe(replacement = "this")
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }
}
