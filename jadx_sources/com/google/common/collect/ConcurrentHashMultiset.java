package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes56.dex */
@GwtIncompatible
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {
    private static final long serialVersionUID = 1;
    private final transient ConcurrentMap<E, AtomicInteger> countMap;

    public class EntrySet extends AbstractMultiset<E>.EntrySet {
        private EntrySet() {
            super();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return snapshot().toArray();
        }

        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        public ConcurrentHashMultiset<E> multiset() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) snapshot().toArray(tArr);
        }

        private List<Multiset.Entry<E>> snapshot() {
            ArrayList arrayListNewArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
            Iterators.addAll(arrayListNewArrayListWithExpectedSize, iterator());
            return arrayListNewArrayListWithExpectedSize;
        }
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    @CanIgnoreReturnValue
    public boolean removeExactly(Object obj, int i11) {
        int i12;
        int i13;
        if (i11 == 0) {
            return true;
        }
        CollectPreconditions.checkPositive(i11, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i12 = atomicInteger.get();
            if (i12 < i11) {
                return false;
            }
            i13 = i12 - i11;
        } while (!atomicInteger.compareAndSet(i12, i13));
        if (i13 == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e11, int i11) {
        AtomicInteger atomicIntegerPutIfAbsent;
        AtomicInteger atomicInteger;
        Preconditions.checkNotNull(e11);
        CollectPreconditions.checkNonnegative(i11, "count");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.safeGet(this.countMap, e11);
            if (atomicIntegerPutIfAbsent != null || (i11 != 0 && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e11, new AtomicInteger(i11))) != null)) {
                while (true) {
                    int i12 = atomicIntegerPutIfAbsent.get();
                    if (i12 == 0) {
                        break;
                    }
                    if (atomicIntegerPutIfAbsent.compareAndSet(i12, i11)) {
                        if (i11 == 0) {
                            this.countMap.remove(e11, atomicIntegerPutIfAbsent);
                        }
                        return i12;
                    }
                }
                if (i11 != 0) {
                    atomicInteger = new AtomicInteger(i11);
                    if (this.countMap.putIfAbsent(e11, atomicInteger) == null) {
                        break;
                    }
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } while (!this.countMap.replace(e11, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return snapshot().toArray();
    }

    public static class FieldSettersHolder {
        static final Serialization.FieldSetter<? super ConcurrentHashMultiset<?>> COUNT_MAP_FIELD_SETTER = Serialization.getFieldSetter(ConcurrentHashMultiset.class, "countMap");

        private FieldSettersHolder() {
        }
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> concurrentHashMultisetCreate = create();
        Iterables.addAll(concurrentHashMultisetCreate, iterable);
        return concurrentHashMultisetCreate;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.countMap.clear();
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Set<E> createElementSet() {
        final Set<E> setKeySet = this.countMap.keySet();
        return new ForwardingSet<E>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.1
            final /* synthetic */ ConcurrentHashMultiset this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return obj != null && Collections2.safeContains(setKeySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return obj != null && Collections2.safeRemove(setKeySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return standardContainsAll(collection);
            }

            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
            public Set<E> delegate() {
                return setKeySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return standardRemoveAll(collection);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    @Deprecated
    public Set<Multiset.Entry<E>> createEntrySet() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public int distinctElements() {
        return this.countMap.size();
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<E> elementIterator() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset
    public Iterator<Multiset.Entry<E>> entryIterator() {
        final AbstractIterator<Multiset.Entry<E>> abstractIterator = new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.ConcurrentHashMultiset.2
            private final Iterator<Map.Entry<E, AtomicInteger>> mapEntries;

            {
                this.mapEntries = ConcurrentHashMultiset.this.countMap.entrySet().iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            public Multiset.Entry<E> computeNext() {
                while (this.mapEntries.hasNext()) {
                    Map.Entry<E, AtomicInteger> next = this.mapEntries.next();
                    int i11 = next.getValue().get();
                    if (i11 != 0) {
                        return Multisets.immutableEntry(next.getKey(), i11);
                    }
                }
                return endOfData();
            }
        };
        return new ForwardingIterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.3
            private Multiset.Entry<E> last;
            final /* synthetic */ ConcurrentHashMultiset this$0;

            {
                this.this$0 = this;
            }

            @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
            public Iterator<Multiset.Entry<E>> delegate() {
                return abstractIterator;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public Multiset.Entry<E> next() {
                Multiset.Entry<E> entry = (Multiset.Entry) super.next();
                this.last = entry;
                return entry;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.last != null, "no calls to next() since the last call to remove()");
                this.this$0.setCount(this.last.getElement(), 0);
                this.last = null;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.countMap.isEmpty();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i11) {
        int i12;
        int iMax;
        if (i11 == 0) {
            return count(obj);
        }
        CollectPreconditions.checkPositive(i11, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i12 = atomicInteger.get();
            if (i12 == 0) {
                return 0;
            }
            iMax = Math.max(0, i12 - i11);
        } while (!atomicInteger.compareAndSet(i12, iMax));
        if (iMax == 0) {
            this.countMap.remove(obj, atomicInteger);
        }
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        Iterator<AtomicInteger> it = this.countMap.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += (long) it.next().get();
        }
        return Ints.saturatedCast(j11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) snapshot().toArray(tArr);
    }

    @VisibleForTesting
    public ConcurrentHashMultiset(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        Preconditions.checkArgument(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.countMap = concurrentMap;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        FieldSettersHolder.COUNT_MAP_FIELD_SETTER.set(this, (ConcurrentMap) object);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List<E> snapshot() {
        ArrayList arrayListNewArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
        for (Multiset.Entry entry : entrySet()) {
            Object element = entry.getElement();
            for (int count = entry.getCount(); count > 0; count--) {
                arrayListNewArrayListWithExpectedSize.add(element);
            }
        }
        return arrayListNewArrayListWithExpectedSize;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.countMap);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e11, int i11) {
        AtomicInteger atomicIntegerPutIfAbsent;
        int i12;
        AtomicInteger atomicInteger;
        Preconditions.checkNotNull(e11);
        if (i11 == 0) {
            return count(e11);
        }
        CollectPreconditions.checkPositive(i11, "occurrences");
        do {
            atomicIntegerPutIfAbsent = (AtomicInteger) Maps.safeGet(this.countMap, e11);
            if (atomicIntegerPutIfAbsent == null && (atomicIntegerPutIfAbsent = this.countMap.putIfAbsent(e11, new AtomicInteger(i11))) == null) {
                return 0;
            }
            do {
                i12 = atomicIntegerPutIfAbsent.get();
                if (i12 != 0) {
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException("Overflow adding " + i11 + " occurrences to a count of " + i12);
                    }
                } else {
                    atomicInteger = new AtomicInteger(i11);
                    if (this.countMap.putIfAbsent(e11, atomicInteger) == null) {
                        break;
                    }
                }
            } while (!atomicIntegerPutIfAbsent.compareAndSet(i12, IntMath.checkedAdd(i12, i11)));
            return i12;
        } while (!this.countMap.replace(e11, atomicIntegerPutIfAbsent, atomicInteger));
        return 0;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.iteratorImpl(this);
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e11, int i11, int i12) {
        Preconditions.checkNotNull(e11);
        CollectPreconditions.checkNonnegative(i11, "oldCount");
        CollectPreconditions.checkNonnegative(i12, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.safeGet(this.countMap, e11);
        if (atomicInteger == null) {
            if (i11 != 0) {
                return false;
            }
            return i12 == 0 || this.countMap.putIfAbsent(e11, new AtomicInteger(i12)) == null;
        }
        int i13 = atomicInteger.get();
        if (i13 == i11) {
            if (i13 == 0) {
                if (i12 == 0) {
                    this.countMap.remove(e11, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i12);
                return this.countMap.putIfAbsent(e11, atomicInteger2) == null || this.countMap.replace(e11, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i13, i12)) {
                if (i12 == 0) {
                    this.countMap.remove(e11, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
