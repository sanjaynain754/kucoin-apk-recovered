package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements ListMultimap<K, V> {

    @J2ktIncompatible
    @GwtIncompatible
    private static final long serialVersionUID = 0;

    @RetainedWith
    @LazyInit
    private transient ImmutableListMultimap<V, K> inverse;

    public static final class Builder<K, V> extends ImmutableMultimap.Builder<K, V> {
        public Builder() {
        }

        public Builder(int i11) {
            super(i11);
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        public ImmutableListMultimap<K, V> build() {
            return (ImmutableListMultimap) super.build();
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> combine(ImmutableMultimap.Builder<K, V> builder) {
            super.combine((ImmutableMultimap.Builder) builder);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> expectedValuesPerKey(int i11) {
            super.expectedValuesPerKey(i11);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderKeysBy(Comparator<? super K> comparator) {
            super.orderKeysBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> orderValuesBy(Comparator<? super V> comparator) {
            super.orderValuesBy((Comparator) comparator);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(K k11, V v11) {
            super.put((Object) k11, (Object) v11);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> put(Map.Entry<? extends K, ? extends V> entry) {
            super.put((Map.Entry) entry);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.putAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k11, Iterable<? extends V> iterable) {
            super.putAll((Object) k11, (Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(K k11, V... vArr) {
            super.putAll((Object) k11, (Object[]) vArr);
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultimap.Builder
        @CanIgnoreReturnValue
        public Builder<K, V> putAll(Multimap<? extends K, ? extends V> multimap) {
            super.putAll((Multimap) multimap);
            return this;
        }
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Multimap<? extends K, ? extends V> multimap) {
        if (multimap.isEmpty()) {
            return m13452of();
        }
        if (multimap instanceof ImmutableListMultimap) {
            ImmutableListMultimap<K, V> immutableListMultimap = (ImmutableListMultimap) multimap;
            if (!immutableListMultimap.isPartialView()) {
                return immutableListMultimap;
            }
        }
        return fromMapEntries(multimap.asMap().entrySet(), null);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m13452of() {
        return EmptyImmutableListMultimap.INSTANCE;
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> Builder<K, V> builderWithExpectedKeys(int i11) {
        CollectPreconditions.checkNonnegative(i11, "expectedKeys");
        return new Builder<>(i11);
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m13453of(K k11, V v11) {
        Builder builder = builder();
        builder.put((Object) k11, (Object) v11);
        return builder.build();
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public ImmutableListMultimap<V, K> inverse() {
        ImmutableListMultimap<V, K> immutableListMultimap = this.inverse;
        if (immutableListMultimap != null) {
            return immutableListMultimap;
        }
        ImmutableListMultimap<V, K> immutableListMultimapInvert = invert();
        this.inverse = immutableListMultimapInvert;
        return immutableListMultimapInvert;
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i11) {
        super(immutableMap, i11);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2) {
        return CollectCollectors.flatteningToImmutableListMultimap(function, function2);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapBuilderEntries(Collection<? extends Map.Entry<K, ImmutableCollection.Builder<V>>> collection, Comparator<? super V> comparator) {
        ImmutableList immutableListBuildSorted;
        if (collection.isEmpty()) {
            return m13452of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<K, ImmutableCollection.Builder<V>> entry : collection) {
            K key = entry.getKey();
            ImmutableList.Builder builder2 = (ImmutableList.Builder) entry.getValue();
            if (comparator == null) {
                immutableListBuildSorted = builder2.build();
            } else {
                immutableListBuildSorted = builder2.buildSorted(comparator);
            }
            builder.put(key, immutableListBuildSorted);
            size += immutableListBuildSorted.size();
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    public static <K, V> ImmutableListMultimap<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        ImmutableList immutableListSortedCopyOf;
        if (collection.isEmpty()) {
            return m13452of();
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            if (comparator == null) {
                immutableListSortedCopyOf = ImmutableList.copyOf((Collection) value);
            } else {
                immutableListSortedCopyOf = ImmutableList.sortedCopyOf(comparator, value);
            }
            if (!immutableListSortedCopyOf.isEmpty()) {
                builder.put(key, immutableListSortedCopyOf);
                size += immutableListSortedCopyOf.size();
            }
        }
        return new ImmutableListMultimap<>(builder.buildOrThrow(), size);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ImmutableListMultimap<V, K> invert() {
        Builder builder = builder();
        UnmodifiableIterator it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builder.put(entry.getValue(), entry.getKey());
        }
        ImmutableListMultimap<V, K> immutableListMultimapBuild = builder.build();
        immutableListMultimapBuild.inverse = this;
        return immutableListMultimapBuild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i11 = objectInputStream.readInt();
        if (i11 >= 0) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                Object object = objectInputStream.readObject();
                Objects.requireNonNull(object);
                int i14 = objectInputStream.readInt();
                if (i14 > 0) {
                    ImmutableList.Builder builder2 = ImmutableList.builder();
                    for (int i15 = 0; i15 < i14; i15++) {
                        Object object2 = objectInputStream.readObject();
                        Objects.requireNonNull(object2);
                        builder2.add(object2);
                    }
                    builder.put(object, builder2.build());
                    i12 += i14;
                } else {
                    throw new InvalidObjectException("Invalid value count " + i14);
                }
            }
            try {
                ImmutableMultimap.FieldSettersHolder.MAP_FIELD_SETTER.set(this, builder.buildOrThrow());
                ImmutableMultimap.FieldSettersHolder.SIZE_FIELD_SETTER.set(this, i12);
                return;
            } catch (IllegalArgumentException e11) {
                throw ((InvalidObjectException) new InvalidObjectException(e11.getMessage()).initCause(e11));
            }
        }
        throw new InvalidObjectException("Invalid key count " + i11);
    }

    @IgnoreJRERequirement
    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return CollectCollectors.toImmutableListMultimap(function, function2);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.writeMultimap(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public ImmutableList<V> get(K k11) {
        ImmutableList<V> immutableList = (ImmutableList) this.map.get(k11);
        return immutableList == null ? ImmutableList.m13439of() : immutableList;
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final ImmutableList<V> replaceValues(K k11, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m13454of(K k11, V v11, K k12, V v12) {
        Builder builder = builder();
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        return builder.build();
    }

    public static <K, V> ImmutableListMultimap<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new Builder().putAll((Iterable) iterable).build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m13455of(K k11, V v11, K k12, V v12, K k13, V v13) {
        Builder builder = builder();
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        builder.put((Object) k13, (Object) v13);
        return builder.build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m13456of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        Builder builder = builder();
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        builder.put((Object) k13, (Object) v13);
        builder.put((Object) k14, (Object) v14);
        return builder.build();
    }

    /* JADX INFO: renamed from: of */
    public static <K, V> ImmutableListMultimap<K, V> m13457of(K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        Builder builder = builder();
        builder.put((Object) k11, (Object) v11);
        builder.put((Object) k12, (Object) v12);
        builder.put((Object) k13, (Object) v13);
        builder.put((Object) k14, (Object) v14);
        builder.put((Object) k15, (Object) v15);
        return builder.build();
    }
}
