package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.SortedMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V> {
    private static final long serialVersionUID = 0;
    private transient ImmutableSortedMap<K, V> descendingMap;
    private final transient RegularImmutableSortedSet<K> keySet;
    private final transient ImmutableList<V> valueList;
    private static final Comparator<?> NATURAL_ORDER = Ordering.natural();
    private static final ImmutableSortedMap<Comparable<?>, Object> NATURAL_EMPTY_MAP = new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(Ordering.natural()), ImmutableList.m13439of());

    public static class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        private final Comparator<? super K> comparator;
        private transient Object[] keys;
        private transient Object[] values;

        public Builder(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private Builder(Comparator<? super K> comparator, int i11) {
            this.comparator = (Comparator) Preconditions.checkNotNull(comparator);
            this.keys = new Object[i11];
            this.values = new Object[i11];
        }

        private void ensureCapacity(int i11) {
            Object[] objArr = this.keys;
            if (i11 > objArr.length) {
                int iExpandedCapacity = ImmutableCollection.Builder.expandedCapacity(objArr.length, i11);
                this.keys = Arrays.copyOf(this.keys, iExpandedCapacity);
                this.values = Arrays.copyOf(this.values, iExpandedCapacity);
            }
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public final ImmutableSortedMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableSortedMap<K, V> buildOrThrow() {
            int i11 = this.size;
            if (i11 == 0) {
                return ImmutableSortedMap.emptyMap(this.comparator);
            }
            if (i11 == 1) {
                Comparator<? super K> comparator = this.comparator;
                Object obj = this.keys[0];
                Objects.requireNonNull(obj);
                Object obj2 = this.values[0];
                Objects.requireNonNull(obj2);
                return ImmutableSortedMap.m13522of(comparator, obj, obj2);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.keys, i11);
            Arrays.sort(objArrCopyOf, this.comparator);
            Object[] objArr = new Object[this.size];
            for (int i12 = 0; i12 < this.size; i12++) {
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    if (this.comparator.compare(objArrCopyOf[i13], objArrCopyOf[i12]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i13] + " and " + objArrCopyOf[i12]);
                    }
                }
                Object obj3 = this.keys[i12];
                Objects.requireNonNull(obj3);
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, this.comparator);
                Object obj4 = this.values[i12];
                Objects.requireNonNull(obj4);
                objArr[iBinarySearch] = obj4;
            }
            return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArrCopyOf), this.comparator), ImmutableList.asImmutableList(objArr));
        }

        @CanIgnoreReturnValue
        public Builder<K, V> combine(Builder<K, V> builder) {
            ensureCapacity(this.size + builder.size);
            System.arraycopy(builder.keys, 0, this.keys, this.size, builder.size);
            System.arraycopy(builder.values, 0, this.values, this.size, builder.size);
            this.size += builder.size;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k11, V v11) {
            ensureCapacity(this.size + 1);
            CollectPreconditions.checkEntryNotNull(k11, v11);
            Object[] objArr = this.keys;
            int i11 = this.size;
            objArr[i11] = k11;
            this.values[i11] = v11;
            this.size = i11 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Map<? extends K, ? extends V> map) {
            super.putAll((Map) map);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }
    }

    @J2ktIncompatible
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        private final Comparator<? super K> comparator;

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Builder<K, V> makeBuilder(int i11) {
            return new Builder<>(this.comparator);
        }

        public SerializedForm(ImmutableSortedMap<K, V> immutableSortedMap) {
            super(immutableSortedMap);
            this.comparator = immutableSortedMap.comparator();
        }
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList) {
        this(regularImmutableSortedSet, immutableList, null);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return copyOfInternal(map, (Ordering) NATURAL_ORDER);
    }

    private static <K extends Comparable<? super K>, V> ImmutableSortedMap<K, V> fromEntries(Map.Entry<K, V>... entryArr) {
        return fromEntries(Ordering.natural(), false, entryArr, entryArr.length);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13501of() {
        return (ImmutableSortedMap<K, V>) NATURAL_EMPTY_MAP;
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableSortedMap(comparator, function, function2);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k11) {
        return tailMap((Object) k11, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k11) {
        return headMap((Object) k11, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k11) {
        return tailMap((Object) k11, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k11) {
        return headMap((Object) k11, false).lastEntry();
    }

    public ImmutableSortedMap(RegularImmutableSortedSet<K> regularImmutableSortedSet, ImmutableList<V> immutableList, ImmutableSortedMap<K, V> immutableSortedMap) {
        this.keySet = regularImmutableSortedSet;
        this.valueList = immutableList;
        this.descendingMap = immutableSortedMap;
    }

    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <K, V> Builder<K, V> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <K, V> Builder<K, V> builderWithExpectedSize(int i11) {
        throw new UnsupportedOperationException();
    }

    private static <K, V> ImmutableSortedMap<K, V> copyOfInternal(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == NATURAL_ORDER) {
                zEquals = true;
            }
        }
        if (zEquals && (map instanceof ImmutableSortedMap)) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) map;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, zEquals, map.entrySet());
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(Comparator<? super K> comparator, boolean z11, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) Iterables.toArray(iterable, ImmutableMap.EMPTY_ENTRY_ARRAY);
        return fromEntries(comparator, z11, entryArr, entryArr.length);
    }

    private ImmutableSortedMap<K, V> getSubMap(int i11, int i12) {
        if (i11 == 0 && i12 == size()) {
            return this;
        }
        return i11 == i12 ? emptyMap(comparator()) : new ImmutableSortedMap<>(this.keySet.getSubSet(i11, i12), this.valueList.subList(i11, i12));
    }

    public static <K extends Comparable<?>, V> Builder<K, V> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13502of(Comparable comparable, Object obj) {
        return m13522of(Ordering.natural(), comparable, obj);
    }

    @SafeVarargs
    @DoNotCall("ImmutableSortedMap.ofEntries not currently available; use ImmutableSortedMap.copyOf")
    @Deprecated
    public static <K, V> ImmutableSortedMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> Builder<K, V> orderedBy(Comparator<K> comparator) {
        return new Builder<>(comparator);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <K extends Comparable<?>, V> Builder<K, V> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return CollectCollectors.toImmutableSortedMap(comparator, function, function2, binaryOperator);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> descendingKeySet() {
        return this.keySet.descendingSet();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> descendingMap() {
        ImmutableSortedMap<K, V> immutableSortedMap = this.descendingMap;
        if (immutableSortedMap == null) {
            return isEmpty() ? emptyMap(Ordering.from(comparator()).reverse()) : new ImmutableSortedMap<>((RegularImmutableSortedSet) this.keySet.descendingSet(), this.valueList.reverse(), this);
        }
        return immutableSortedMap;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        int iIndexOf = this.keySet.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.valueList.get(iIndexOf);
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return this.keySet.isPartialView() || this.valueList.isPartialView();
    }

    @Override // java.util.NavigableMap
    public ImmutableSortedSet<K> navigableKeySet() {
        return this.keySet;
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.valueList.size();
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableCollection<V> values() {
        return this.valueList;
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m13500a(Comparator comparator, Map.Entry entry, Map.Entry entry2) {
        Objects.requireNonNull(entry);
        Objects.requireNonNull(entry2);
        return comparator.compare(entry.getKey(), entry2.getKey());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return copyOfInternal(map, (Comparator) Preconditions.checkNotNull(comparator));
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = NATURAL_ORDER;
        }
        if (sortedMap instanceof ImmutableSortedMap) {
            ImmutableSortedMap<K, V> immutableSortedMap = (ImmutableSortedMap) sortedMap;
            if (!immutableSortedMap.isPartialView()) {
                return immutableSortedMap;
            }
        }
        return fromEntries(comparator, true, sortedMap.entrySet());
    }

    public static <K, V> ImmutableSortedMap<K, V> emptyMap(Comparator<? super K> comparator) {
        if (Ordering.natural().equals(comparator)) {
            return m13501of();
        }
        return new ImmutableSortedMap<>(ImmutableSortedSet.emptySet(comparator), ImmutableList.m13439of());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13522of(Comparator<? super K> comparator, K k11, V v11) {
        return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.m13440of(k11), (Comparator) Preconditions.checkNotNull(comparator)), ImmutableList.m13440of(v11));
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k11) {
        return (K) Maps.keyOrNull(ceilingEntry(k11));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        if (isEmpty()) {
            return ImmutableSet.m13487of();
        }
        return new ImmutableMapEntrySet<K, V>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
            @Override // com.google.common.collect.ImmutableSet
            public ImmutableList<Map.Entry<K, V>> createAsList() {
                return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                    @Override // com.google.common.collect.ImmutableCollection
                    public boolean isPartialView() {
                        return true;
                    }

                    @Override // java.util.List
                    public Map.Entry<K, V> get(int i11) {
                        return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.keySet.asList().get(i11), ImmutableSortedMap.this.valueList.get(i11));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return ImmutableSortedMap.this.size();
                    }

                    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                    @J2ktIncompatible
                    @GwtIncompatible
                    public Object writeReplace() {
                        return super.writeReplace();
                    }
                };
            }

            @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
            public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
                return asList().iterator();
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet
            public ImmutableMap<K, V> map() {
                return ImmutableSortedMap.this;
            }

            @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k11) {
        return (K) Maps.keyOrNull(floorEntry(k11));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> headMap(K k11) {
        return headMap((Object) k11, false);
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k11) {
        return (K) Maps.keyOrNull(higherEntry(k11));
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public ImmutableSortedSet<K> keySet() {
        return this.keySet;
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k11) {
        return (K) Maps.keyOrNull(lowerEntry(k11));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> subMap(K k11, K k12) {
        return subMap((Object) k11, true, (Object) k12, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public ImmutableSortedMap<K, V> tailMap(K k11) {
        return tailMap((Object) k11, true);
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (Ordering) NATURAL_ORDER);
    }

    private static <K, V> ImmutableSortedMap<K, V> fromEntries(final Comparator<? super K> comparator, boolean z11, Map.Entry<K, V>[] entryArr, int i11) {
        if (i11 == 0) {
            return emptyMap(comparator);
        }
        if (i11 != 1) {
            Object[] objArr = new Object[i11];
            Object[] objArr2 = new Object[i11];
            if (z11) {
                for (int i12 = 0; i12 < i11; i12++) {
                    Map.Entry<K, V> entry = entryArr[i12];
                    Objects.requireNonNull(entry);
                    Map.Entry<K, V> entry2 = entry;
                    K key = entry2.getKey();
                    V value = entry2.getValue();
                    CollectPreconditions.checkEntryNotNull(key, value);
                    objArr[i12] = key;
                    objArr2[i12] = value;
                }
            } else {
                Arrays.sort(entryArr, 0, i11, new Comparator() { // from class: com.google.common.collect.h2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return ImmutableSortedMap.m13500a(comparator, (Map.Entry) obj, (Map.Entry) obj2);
                    }
                });
                Map.Entry<K, V> entry3 = entryArr[0];
                Objects.requireNonNull(entry3);
                Map.Entry<K, V> entry4 = entry3;
                Object key2 = entry4.getKey();
                objArr[0] = key2;
                V value2 = entry4.getValue();
                objArr2[0] = value2;
                CollectPreconditions.checkEntryNotNull(objArr[0], value2);
                int i13 = 1;
                while (i13 < i11) {
                    Map.Entry<K, V> entry5 = entryArr[i13 - 1];
                    Objects.requireNonNull(entry5);
                    Map.Entry<K, V> entry6 = entry5;
                    Map.Entry<K, V> entry7 = entryArr[i13];
                    Objects.requireNonNull(entry7);
                    Map.Entry<K, V> entry8 = entry7;
                    Object key3 = entry8.getKey();
                    V value3 = entry8.getValue();
                    CollectPreconditions.checkEntryNotNull(key3, value3);
                    objArr[i13] = key3;
                    objArr2[i13] = value3;
                    ImmutableMap.checkNoConflict(comparator.compare(key2, key3) != 0, "key", entry6, entry8);
                    i13++;
                    key2 = key3;
                }
            }
            return new ImmutableSortedMap<>(new RegularImmutableSortedSet(ImmutableList.asImmutableList(objArr), comparator), ImmutableList.asImmutableList(objArr2));
        }
        Map.Entry<K, V> entry9 = entryArr[0];
        Objects.requireNonNull(entry9);
        Map.Entry<K, V> entry10 = entry9;
        return m13522of(comparator, entry10.getKey(), entry10.getValue());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> headMap(K k11, boolean z11) {
        return getSubMap(0, this.keySet.headIndex((K) Preconditions.checkNotNull(k11), z11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> subMap(K k11, boolean z11, K k12, boolean z12) {
        Preconditions.checkNotNull(k11);
        Preconditions.checkNotNull(k12);
        Preconditions.checkArgument(comparator().compare(k11, k12) <= 0, "expected fromKey <= toKey but %s > %s", k11, k12);
        return headMap((Object) k12, z12).tailMap((Object) k11, z11);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public ImmutableSortedMap<K, V> tailMap(K k11, boolean z11) {
        return getSubMap(this.keySet.tailIndex((K) Preconditions.checkNotNull(k11), z11), size());
    }

    public static <K, V> ImmutableSortedMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return fromEntries((Comparator) Preconditions.checkNotNull(comparator), false, iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13503of(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13504of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13505of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13506of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13507of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13508of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13509of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7), ImmutableMap.entryOf(comparable8, obj8));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13510of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7), ImmutableMap.entryOf(comparable8, obj8), ImmutableMap.entryOf(comparable9, obj9));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/ImmutableSortedMap<TK;TV;>; */
    /* JADX INFO: renamed from: of */
    public static ImmutableSortedMap m13511of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5, Comparable comparable6, Object obj6, Comparable comparable7, Object obj7, Comparable comparable8, Object obj8, Comparable comparable9, Object obj9, Comparable comparable10, Object obj10) {
        return fromEntries(ImmutableMap.entryOf(comparable, obj), ImmutableMap.entryOf(comparable2, obj2), ImmutableMap.entryOf(comparable3, obj3), ImmutableMap.entryOf(comparable4, obj4), ImmutableMap.entryOf(comparable5, obj5), ImmutableMap.entryOf(comparable6, obj6), ImmutableMap.entryOf(comparable7, obj7), ImmutableMap.entryOf(comparable8, obj8), ImmutableMap.entryOf(comparable9, obj9), ImmutableMap.entryOf(comparable10, obj10));
    }

    @DoNotCall("Pass a key of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13512of(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13513of(K k11, V v11, K k12, V v12) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13514of(K k11, V v11, K k12, V v12, K k13, V v13) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13515of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13516of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13517of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13518of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13519of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13520of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass keys of type Comparable")
    @Deprecated
    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableSortedMap<K, V> m13521of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k21, V v21) {
        throw new UnsupportedOperationException();
    }
}
