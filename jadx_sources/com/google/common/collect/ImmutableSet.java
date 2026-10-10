package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E> {
    private static final int CUTOFF = 751619276;
    private static final double DESIRED_LOAD_FACTOR = 0.7d;
    static final int MAX_TABLE_SIZE = 1073741824;
    private static final long serialVersionUID = 912559;

    @RetainedWith
    @LazyInit
    private transient ImmutableList<E> asList;

    /* JADX INFO: loaded from: classes56.dex */
    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        private int hashCode;

        @VisibleForTesting
        Object[] hashTable;

        public Builder() {
            super(4);
        }

        public Builder(int i11, boolean z11) {
            super(i11);
            if (z11) {
                this.hashTable = new Object[ImmutableSet.chooseTableSize(i11)];
            }
        }

        private void addDeduping(E e11) {
            Objects.requireNonNull(this.hashTable);
            int length = this.hashTable.length - 1;
            int iHashCode = e11.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i11 = iSmear & length;
                Object[] objArr = this.hashTable;
                Object obj = objArr[i11];
                if (obj == null) {
                    objArr[i11] = e11;
                    this.hashCode += iHashCode;
                    super.add((Object) e11);
                    return;
                } else if (obj.equals(e11)) {
                    return;
                } else {
                    iSmear = i11 + 1;
                }
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetConstruct;
            int i11 = this.size;
            if (i11 == 0) {
                return ImmutableSet.m13487of();
            }
            if (i11 == 1) {
                Object obj = this.contents[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.m13488of(obj);
            }
            if (this.hashTable == null || ImmutableSet.chooseTableSize(i11) != this.hashTable.length) {
                immutableSetConstruct = ImmutableSet.construct(this.size, this.contents);
                this.size = immutableSetConstruct.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.shouldTrim(this.size, this.contents.length) ? Arrays.copyOf(this.contents, this.size) : this.contents;
                int i12 = this.hashCode;
                Object[] objArr = this.hashTable;
                immutableSetConstruct = new RegularImmutableSet<>(objArrCopyOf, i12, objArr, objArr.length - 1, this.size);
            }
            this.forceCopy = true;
            this.hashTable = null;
            return immutableSetConstruct;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @CanIgnoreReturnValue
        public Builder<E> combine(Builder<E> builder) {
            if (this.hashTable == null) {
                addAll(builder.contents, builder.size);
                return this;
            }
            for (int i11 = 0; i11 < builder.size; i11++) {
                Object obj = builder.contents[i11];
                Objects.requireNonNull(obj);
                add(obj);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.hashTable != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((Object) it.next());
                }
                return this;
            }
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e11) {
            Preconditions.checkNotNull(e11);
            if (this.hashTable != null && ImmutableSet.chooseTableSize(this.size) <= this.hashTable.length) {
                addDeduping(e11);
                return this;
            }
            this.hashTable = null;
            super.add((Object) e11);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add((Object) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            if (this.hashTable != null) {
                for (E e11 : eArr) {
                    add((Object) e11);
                }
                return this;
            }
            super.add((Object[]) eArr);
            return this;
        }
    }

    /* JADX INFO: loaded from: classes56.dex */
    @J2ktIncompatible
    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        public Object readResolve() {
            return ImmutableSet.copyOf(this.elements);
        }

        public SerializedForm(Object[] objArr) {
            this.elements = objArr;
        }
    }

    @VisibleForTesting
    public static int chooseTableSize(int i11) {
        int iMax = Math.max(i11, 2);
        if (iMax >= CUTOFF) {
            Preconditions.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * DESIRED_LOAD_FACTOR < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m13487of() {
        return RegularImmutableSet.EMPTY;
    }

    public boolean isHashCodeFast() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i11) {
        CollectPreconditions.checkNonnegative(i11, "expectedSize");
        return new Builder<>(i11, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSet<E> construct(int i11, Object... objArr) {
        if (i11 == 0) {
            return m13487of();
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return m13488of(obj);
        }
        int iChooseTableSize = chooseTableSize(i11);
        Object[] objArr2 = new Object[iChooseTableSize];
        int i12 = iChooseTableSize - 1;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            Object objCheckElementNotNull = ObjectArrays.checkElementNotNull(objArr[i15], i15);
            int iHashCode = objCheckElementNotNull.hashCode();
            int iSmear = Hashing.smear(iHashCode);
            while (true) {
                int i16 = iSmear & i12;
                Object obj2 = objArr2[i16];
                if (obj2 == null) {
                    objArr[i14] = objCheckElementNotNull;
                    objArr2[i16] = objCheckElementNotNull;
                    i13 += iHashCode;
                    i14++;
                    break;
                }
                if (obj2.equals(objCheckElementNotNull)) {
                    break;
                }
                iSmear++;
            }
        }
        Arrays.fill(objArr, i14, i11, (Object) null);
        if (i14 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (chooseTableSize(i14) < iChooseTableSize / 2) {
            return construct(i14, objArr);
        }
        if (shouldTrim(i14, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i14);
        }
        return new RegularImmutableSet(objArr, i13, objArr2, i12, i14);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m13488of(E e11) {
        return new SingletonImmutableSet(e11);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldTrim(int i11, int i12) {
        return i11 < (i12 >> 1) + (i12 >> 2);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.asList;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListCreateAsList = createAsList();
        this.asList = immutableListCreateAsList;
        return immutableListCreateAsList;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && isHashCodeFast() && ((ImmutableSet) obj).isHashCodeFast() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.equalsImpl(this, obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(toArray());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m13489of(E e11, E e12) {
        return construct(2, e11, e12);
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return CollectCollectors.toImmutableSet();
    }

    public ImmutableList<E> createAsList() {
        return ImmutableList.asImmutableList(toArray());
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.hashCodeImpl(this);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m13490of(E e11, E e12, E e13) {
        return construct(3, e11, e12, e13);
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m13491of(E e11, E e12, E e13, E e14) {
        return construct(4, e11, e12, e13, e14);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m13492of(E e11, E e12, E e13, E e14, E e15) {
        return construct(5, e11, e12, e13, e14, e15);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: of */
    public static <E> ImmutableSet<E> m13493of(E e11, E e12, E e13, E e14, E e15, E e16, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e11;
        objArr[1] = e12;
        objArr[2] = e13;
        objArr[3] = e14;
        objArr[4] = e15;
        objArr[5] = e16;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return m13487of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return m13488of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return m13487of();
        }
        if (length != 1) {
            return construct(eArr.length, (Object[]) eArr.clone());
        }
        return m13488of((Object) eArr[0]);
    }
}
