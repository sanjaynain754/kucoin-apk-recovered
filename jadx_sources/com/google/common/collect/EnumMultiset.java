package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public final class EnumMultiset<E extends Enum<E>> extends AbstractMultiset<E> implements Serializable {

    @GwtIncompatible
    private static final long serialVersionUID = 0;
    private transient int[] counts;
    private transient int distinctElements;
    private transient E[] enumConstants;
    private transient long size;
    private transient Class<E> type;

    public abstract class Itr<T> implements Iterator<T> {
        int index = 0;
        int toRemove = -1;

        public abstract T output(int i11);

        public Itr() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            while (this.index < EnumMultiset.this.enumConstants.length) {
                int[] iArr = EnumMultiset.this.counts;
                int i11 = this.index;
                if (iArr[i11] > 0) {
                    return true;
                }
                this.index = i11 + 1;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.toRemove >= 0);
            if (EnumMultiset.this.counts[this.toRemove] > 0) {
                EnumMultiset.access$210(EnumMultiset.this);
                EnumMultiset enumMultiset = EnumMultiset.this;
                EnumMultiset.access$322(enumMultiset, enumMultiset.counts[this.toRemove]);
                EnumMultiset.this.counts[this.toRemove] = 0;
            }
            this.toRemove = -1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                T tOutput = output(this.index);
                int i11 = this.index;
                this.toRemove = i11;
                this.index = i11 + 1;
                return tOutput;
            }
            throw new NoSuchElementException();
        }
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Class<E> cls) {
        return new EnumMultiset<>(cls);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i11) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        Enum r11 = (Enum) obj;
        CollectPreconditions.checkNonnegative(i11, "occurrences");
        if (i11 == 0) {
            return count(obj);
        }
        int iOrdinal = r11.ordinal();
        int[] iArr = this.counts;
        int i12 = iArr[iOrdinal];
        if (i12 == 0) {
            return 0;
        }
        if (i12 > i11) {
            iArr[iOrdinal] = i12 - i11;
            this.size -= (long) i11;
            return i12;
        }
        iArr[iOrdinal] = 0;
        this.distinctElements--;
        this.size -= (long) i12;
        return i12;
    }

    public static /* synthetic */ int access$210(EnumMultiset enumMultiset) {
        int i11 = enumMultiset.distinctElements;
        enumMultiset.distinctElements = i11 - 1;
        return i11;
    }

    public static /* synthetic */ long access$322(EnumMultiset enumMultiset, long j11) {
        long j12 = enumMultiset.size - j11;
        enumMultiset.size = j12;
        return j12;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable) {
        Iterator<E> it = iterable.iterator();
        Preconditions.checkArgument(it.hasNext(), "EnumMultiset constructor passed empty Iterable");
        EnumMultiset<E> enumMultiset = new EnumMultiset<>(it.next().getDeclaringClass());
        Iterables.addAll(enumMultiset, iterable);
        return enumMultiset;
    }

    private boolean isActuallyE(Object obj) {
        if (obj instanceof Enum) {
            Enum r11 = (Enum) obj;
            int iOrdinal = r11.ordinal();
            E[] eArr = this.enumConstants;
            if (iOrdinal < eArr.length && eArr[iOrdinal] == r11) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e11, int i11) {
        checkIsE(e11);
        CollectPreconditions.checkNonnegative(i11, "occurrences");
        if (i11 == 0) {
            return count(e11);
        }
        int iOrdinal = e11.ordinal();
        int i12 = this.counts[iOrdinal];
        long j11 = i11;
        long j12 = ((long) i12) + j11;
        Preconditions.checkArgument(j12 <= 2147483647L, "too many occurrences: %s", j12);
        this.counts[iOrdinal] = (int) j12;
        if (i12 == 0) {
            this.distinctElements++;
        }
        this.size += j11;
        return i12;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        Arrays.fill(this.counts, 0);
        this.size = 0L;
        this.distinctElements = 0;
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        if (obj == null || !isActuallyE(obj)) {
            return 0;
        }
        return this.counts[((Enum) obj).ordinal()];
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return this.distinctElements;
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        return new EnumMultiset<E>.Itr<E>() { // from class: com.google.common.collect.EnumMultiset.1
            @Override // com.google.common.collect.EnumMultiset.Itr
            public E output(int i11) {
                return (E) EnumMultiset.this.enumConstants[i11];
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        return new EnumMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.EnumMultiset.2
            @Override // com.google.common.collect.EnumMultiset.Itr
            public Multiset.Entry<E> output(final int i11) {
                return new Multisets.AbstractEntry<E>(this) { // from class: com.google.common.collect.EnumMultiset.2.1
                    final /* synthetic */ C80652 this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public int getCount() {
                        return EnumMultiset.this.counts[i11];
                    }

                    @Override // com.google.common.collect.Multiset.Entry
                    public E getElement() {
                        return (E) EnumMultiset.this.enumConstants[i11];
                    }
                };
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ boolean setCount(@ParametricNullness Object obj, int i11, int i12) {
        return super.setCount(obj, i11, i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return Ints.saturatedCast(this.size);
    }

    private EnumMultiset(Class<E> cls) {
        this.type = cls;
        Preconditions.checkArgument(cls.isEnum());
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
    }

    private void checkIsE(Object obj) {
        Preconditions.checkNotNull(obj);
        if (isActuallyE(obj)) {
            return;
        }
        throw new ClassCastException("Expected an " + this.type + " but got " + obj);
    }

    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Class<E> cls = (Class) object;
        this.type = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.enumConstants = enumConstants;
        this.counts = new int[enumConstants.length];
        Serialization.populateMultiset(this, objectInputStream);
    }

    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.type);
        Serialization.writeMultiset(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e11, int i11) {
        checkIsE(e11);
        CollectPreconditions.checkNonnegative(i11, "count");
        int iOrdinal = e11.ordinal();
        int[] iArr = this.counts;
        int i12 = iArr[iOrdinal];
        iArr[iOrdinal] = i11;
        this.size += (long) (i11 - i12);
        if (i12 == 0 && i11 > 0) {
            this.distinctElements++;
            return i12;
        }
        if (i12 > 0 && i11 == 0) {
            this.distinctElements--;
        }
        return i12;
    }

    public static <E extends Enum<E>> EnumMultiset<E> create(Iterable<E> iterable, Class<E> cls) {
        EnumMultiset<E> enumMultisetCreate = create(cls);
        Iterables.addAll(enumMultisetCreate, iterable);
        return enumMultisetCreate;
    }
}
