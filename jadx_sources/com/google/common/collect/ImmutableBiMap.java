package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements BiMap<K, V> {
    private static final long serialVersionUID = 912559;

    public static final class Builder<K, V> extends ImmutableMap.Builder<K, V> {
        public Builder() {
        }

        public Builder(int i11) {
            super(i11);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> build() {
            return buildOrThrow();
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @DoNotCall
        @Deprecated
        public ImmutableBiMap<K, V> buildKeepingLast() {
            throw new UnsupportedOperationException("Not supported for bimaps");
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        public ImmutableBiMap<K, V> buildOrThrow() {
            int i11 = this.size;
            if (i11 == 0) {
                return ImmutableBiMap.m13426of();
            }
            if (this.valueComparator != null) {
                if (this.entriesUsed) {
                    this.alternatingKeysAndValues = Arrays.copyOf(this.alternatingKeysAndValues, i11 * 2);
                }
                ImmutableMap.Builder.sortEntries(this.alternatingKeysAndValues, this.size, this.valueComparator);
            }
            this.entriesUsed = true;
            return new RegularImmutableBiMap(this.alternatingKeysAndValues, this.size);
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> combine(ImmutableMap.Builder<K, V> builder) {
            super.combine((ImmutableMap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderEntriesByValue(Comparator<? super V> comparator) {
            super.orderEntriesByValue((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k11, V v11) {
            super.put((Object) k11, (Object) v11);
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
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }
    }

    @J2ktIncompatible
    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public Builder<K, V> makeBuilder(int i11) {
            return new Builder<>(i11);
        }

        public SerializedForm(ImmutableBiMap<K, V> immutableBiMap) {
            super(immutableBiMap);
        }
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if (map instanceof ImmutableBiMap) {
            ImmutableBiMap<K, V> immutableBiMap = (ImmutableBiMap) map;
            if (!immutableBiMap.isPartialView()) {
                return immutableBiMap;
            }
        }
        return copyOf((Iterable) map.entrySet());
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13426of() {
        return RegularImmutableBiMap.EMPTY;
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.BiMap
    public abstract ImmutableBiMap<V, K> inverse();

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedSize(int i11) {
        CollectPreconditions.checkNonnegative(i11, "expectedSize");
        return new Builder<>(i11);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13427of(K k11, V v11) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        return new RegularImmutableBiMap(new Object[]{k11, v11}, 1);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableBiMap")
    @Deprecated
    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final V forcePut(K k11, V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @SafeVarargs
    public static <K, V> ImmutableBiMap<K, V> ofEntries(Map.Entry<? extends K, ? extends V>... entryArr) {
        return copyOf((Iterable) Arrays.asList(entryArr));
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableBiMap(function, function2);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13428of(K k11, V v11, K k12, V v12) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12}, 2);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map, com.google.common.collect.BiMap
    public ImmutableSet<V> values() {
        return inverse().keySet();
    }

    public static <K, V> ImmutableBiMap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder(iterable instanceof Collection ? ((Collection) iterable).size() : 4).putAll((Iterable) iterable).build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13429of(K k11, V v11, K k12, V v12, K k13, V v13) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13}, 3);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13430of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13, k14, v14}, 4);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13431of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, 5);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13432of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16}, 6);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13433of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17}, 7);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13434of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18}, 8);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13435of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19}, 9);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableBiMap<K, V> m13436of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15, K k16, V v16, K k17, V v17, K k18, V v18, K k19, V v19, K k21, V v21) {
        CollectPreconditions.checkEntryNotNull(k11, v11);
        CollectPreconditions.checkEntryNotNull(k12, v12);
        CollectPreconditions.checkEntryNotNull(k13, v13);
        CollectPreconditions.checkEntryNotNull(k14, v14);
        CollectPreconditions.checkEntryNotNull(k15, v15);
        CollectPreconditions.checkEntryNotNull(k16, v16);
        CollectPreconditions.checkEntryNotNull(k17, v17);
        CollectPreconditions.checkEntryNotNull(k18, v18);
        CollectPreconditions.checkEntryNotNull(k19, v19);
        CollectPreconditions.checkEntryNotNull(k21, v21);
        return new RegularImmutableBiMap(new Object[]{k11, v11, k12, v12, k13, v13, k14, v14, k15, v15, k16, v16, k17, v17, k18, v18, k19, v19, k21, v21}, 10);
    }
}
