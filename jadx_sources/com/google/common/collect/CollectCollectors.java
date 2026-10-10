package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
final class CollectCollectors {
    private static final Collector<Object, ?, ImmutableList<Object>> TO_IMMUTABLE_LIST = Collector.of(new Supplier() { // from class: com.google.common.collect.i
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableList.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.m
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableList.Builder) obj).add(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.n
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableList.Builder) obj).combine((ImmutableList.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.o
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableList.Builder) obj).build();
        }
    }, new Collector.Characteristics[0]);
    private static final Collector<Object, ?, ImmutableSet<Object>> TO_IMMUTABLE_SET = Collector.of(new Supplier() { // from class: com.google.common.collect.p
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.q
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableSet.Builder) obj).add(obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.r
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.s
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableSet.Builder) obj).build();
        }
    }, new Collector.Characteristics[0]);

    @GwtIncompatible
    private static final Collector<Range<Comparable<?>>, ?, ImmutableRangeSet<Comparable<?>>> TO_IMMUTABLE_RANGE_SET = Collector.of(new Supplier() { // from class: com.google.common.collect.t
        @Override // java.util.function.Supplier
        public final Object get() {
            return ImmutableRangeSet.builder();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.u
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((ImmutableRangeSet.Builder) obj).add((Range) obj2);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.j
        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((ImmutableRangeSet.Builder) obj).combine((ImmutableRangeSet.Builder) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.k
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ImmutableRangeSet.Builder) obj).build();
        }
    }, new Collector.Characteristics[0]);

    @IgnoreJRERequirement
    public static class EnumMapAccumulator<K extends Enum<K>, V> {
        private EnumMap<K, V> map = null;
        private final BinaryOperator<V> mergeFunction;

        public EnumMapAccumulator<K, V> combine(EnumMapAccumulator<K, V> enumMapAccumulator) {
            if (this.map == null) {
                return enumMapAccumulator;
            }
            EnumMap<K, V> enumMap = enumMapAccumulator.map;
            if (enumMap == null) {
                return this;
            }
            enumMap.forEach(new BiConsumer() { // from class: com.google.common.collect.x1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f12316a.put((Enum) obj, obj2);
                }
            });
            return this;
        }

        public void put(K k11, V v11) {
            EnumMap<K, V> enumMap = this.map;
            if (enumMap == null) {
                this.map = new EnumMap<>(Collections.singletonMap(k11, v11));
            } else {
                enumMap.merge(k11, v11, this.mergeFunction);
            }
        }

        public ImmutableMap<K, V> toImmutableMap() {
            EnumMap<K, V> enumMap = this.map;
            return enumMap == null ? ImmutableMap.m13458of() : ImmutableEnumMap.asImmutable(enumMap);
        }

        public EnumMapAccumulator(BinaryOperator<V> binaryOperator) {
            this.mergeFunction = binaryOperator;
        }
    }

    @IgnoreJRERequirement
    public static final class EnumSetAccumulator<E extends Enum<E>> {
        static final Collector<Enum<?>, ?, ImmutableSet<? extends Enum<?>>> TO_IMMUTABLE_ENUM_SET = CollectCollectors.toImmutableEnumSetGeneric();
        private EnumSet<E> set;

        private EnumSetAccumulator() {
        }

        public void add(E e11) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                this.set = EnumSet.of((Enum) e11);
            } else {
                enumSet.add(e11);
            }
        }

        public EnumSetAccumulator<E> combine(EnumSetAccumulator<E> enumSetAccumulator) {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return enumSetAccumulator;
            }
            EnumSet<E> enumSet2 = enumSetAccumulator.set;
            if (enumSet2 == null) {
                return this;
            }
            enumSet.addAll(enumSet2);
            return this;
        }

        public ImmutableSet<E> toImmutableSet() {
            EnumSet<E> enumSet = this.set;
            if (enumSet == null) {
                return ImmutableSet.m13487of();
            }
            ImmutableSet<E> immutableSetAsImmutable = ImmutableEnumSet.asImmutable(enumSet);
            this.set = null;
            return immutableSetAsImmutable;
        }
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.o0
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.m13399d();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.p0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((CollectCollectors.EnumMapAccumulator) obj).put((Enum) Preconditions.checkNotNull((Enum) function.apply(obj2), "Null key for input %s", obj2), Preconditions.checkNotNull(function2.apply(obj2), "Null value for input %s", obj2));
            }
        }, new C8303q0(), new C8307r0(), Collector.Characteristics.UNORDERED);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.t0
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableMap.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.u0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableMap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.v0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableMap.Builder) obj).combine((ImmutableMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.w0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableMap.Builder) obj).buildOrThrow();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(final Comparator<? super K> comparator, final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.d1
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.m13397b(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.o1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedMap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.u1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedMap.Builder) obj).combine((ImmutableSortedMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.v1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedMap.Builder) obj).buildOrThrow();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ EnumMapAccumulator m13394A(BinaryOperator binaryOperator) {
        return new EnumMapAccumulator(binaryOperator);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ImmutableSortedMap.Builder m13397b(Comparator comparator) {
        return new ImmutableSortedMap.Builder(comparator);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ EnumMapAccumulator m13399d() {
        return new EnumMapAccumulator(new BinaryOperator() { // from class: com.google.common.collect.a
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.m13420y(obj, obj2);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ ImmutableSortedSet.Builder m13402g(Comparator comparator) {
        return new ImmutableSortedSet.Builder(comparator);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ TreeMap m13411p(Comparator comparator) {
        return new TreeMap(comparator);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ EnumSetAccumulator m13412q() {
        return new EnumSetAccumulator();
    }

    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return (Collector<E, ?, ImmutableSet<E>>) EnumSetAccumulator.TO_IMMUTABLE_ENUM_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E extends Enum<E>> Collector<E, EnumSetAccumulator<E>, ImmutableSet<E>> toImmutableEnumSetGeneric() {
        return Collector.of(new Supplier() { // from class: com.google.common.collect.e
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.m13412q();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.f
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((CollectCollectors.EnumSetAccumulator) obj).add((Enum) obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.g
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((CollectCollectors.EnumSetAccumulator) obj).combine((CollectCollectors.EnumSetAccumulator) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((CollectCollectors.EnumSetAccumulator) obj).toImmutableSet();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return (Collector<E, ?, ImmutableList<E>>) TO_IMMUTABLE_LIST;
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> toImmutableListMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.b1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableListMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.c1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableListMultimap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.e1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableListMultimap.Builder) obj).combine((ImmutableMultimap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.f1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableListMultimap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    @GwtIncompatible
    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return (Collector<Range<E>, ?, ImmutableRangeSet<E>>) TO_IMMUTABLE_RANGE_SET;
    }

    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return (Collector<E, ?, ImmutableSet<E>>) TO_IMMUTABLE_SET;
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> toImmutableSetMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function, "keyFunction");
        Preconditions.checkNotNull(function2, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.g1
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableSetMultimap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.h1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSetMultimap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.i1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSetMultimap.Builder) obj).combine((ImmutableMultimap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.j1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSetMultimap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ Object m13420y(Object obj, Object obj2) {
        throw new IllegalArgumentException("Multiple values for key: " + obj + ", " + obj2);
    }

    private CollectCollectors() {
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Multimap m13395B(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    public static <T, K, V> Collector<T, ?, ImmutableListMultimap<K, V>> flatteningToImmutableListMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.y
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Preconditions.checkNotNull(function.apply(obj));
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.z
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new C8291n0());
            }
        };
        final MultimapBuilder.ListMultimapBuilder<Object, Object> listMultimapBuilderArrayListValues = MultimapBuilder.linkedHashKeys().arrayListValues();
        Objects.requireNonNull(listMultimapBuilderArrayListValues);
        return Collectors.collectingAndThen(flatteningToMultimap(function3, function4, new Supplier() { // from class: com.google.common.collect.a0
            @Override // java.util.function.Supplier
            public final Object get() {
                return listMultimapBuilderArrayListValues.build();
            }
        }), new Function() { // from class: com.google.common.collect.b0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableListMultimap.copyOf((Multimap) obj);
            }
        });
    }

    public static <T, K, V> Collector<T, ?, ImmutableSetMultimap<K, V>> flatteningToImmutableSetMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Function function3 = new Function() { // from class: com.google.common.collect.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Preconditions.checkNotNull(function.apply(obj));
            }
        };
        Function function4 = new Function() { // from class: com.google.common.collect.i0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Stream) function2.apply(obj)).peek(new C8291n0());
            }
        };
        final MultimapBuilder.SetMultimapBuilder<Object, Object> setMultimapBuilderLinkedHashSetValues = MultimapBuilder.linkedHashKeys().linkedHashSetValues();
        Objects.requireNonNull(setMultimapBuilderLinkedHashSetValues);
        return Collectors.collectingAndThen(flatteningToMultimap(function3, function4, new Supplier() { // from class: com.google.common.collect.j0
            @Override // java.util.function.Supplier
            public final Object get() {
                return setMultimapBuilderLinkedHashSetValues.build();
            }
        }), new Function() { // from class: com.google.common.collect.k0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSetMultimap.copyOf((Multimap) obj);
            }
        });
    }

    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> flatteningToMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new BiConsumer() { // from class: com.google.common.collect.v
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                CollectCollectors.m13415t(function, function2, (Multimap) obj, obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.x
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.m13395B((Multimap) obj, (Multimap) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Multimap m13403h(Multimap multimap, Multimap multimap2) {
        multimap.putAll(multimap2);
        return multimap;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Multiset m13408m(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ Multiset m13410o(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m13415t(Function function, Function function2, Multimap multimap, Object obj) {
        final Collection collection = multimap.get(function.apply(obj));
        Stream stream = (Stream) function2.apply(obj);
        Objects.requireNonNull(collection);
        stream.forEachOrdered(new Consumer() { // from class: com.google.common.collect.m1
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                collection.add(obj2);
            }
        });
    }

    public static <T, K, V> Collector<T, ?, ImmutableBiMap<K, V>> toImmutableBiMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.w1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableBiMap.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableBiMap.Builder) obj).put(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.c
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableBiMap.Builder) obj).combine((ImmutableMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableBiMap.Builder) obj).buildOrThrow();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.c0
            @Override // java.util.function.Supplier
            public final Object get() {
                return LinkedHashMultiset.create();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.d0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multiset) obj).add(Preconditions.checkNotNull(function.apply(obj2)), toIntFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.e0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.m13408m((Multiset) obj, (Multiset) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMultiset.copyFromEntries(((Multiset) obj).entrySet());
            }
        }, new Collector.Characteristics[0]);
    }

    @GwtIncompatible
    public static <T, K extends Comparable<? super K>, V> Collector<T, ?, ImmutableRangeMap<K, V>> toImmutableRangeMap(final Function<? super T, Range<K>> function, final Function<? super T, ? extends V> function2) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.l
            @Override // java.util.function.Supplier
            public final Object get() {
                return ImmutableRangeMap.builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.w
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableRangeMap.Builder) obj).put((Range) function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.h0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableRangeMap.Builder) obj).combine((ImmutableRangeMap.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.s0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableRangeMap.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(final Comparator<? super E> comparator) {
        Preconditions.checkNotNull(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.x0
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.m13402g(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.y0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableSortedSet.Builder) obj).add(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.z0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableSortedSet.Builder) obj).combine((ImmutableSet.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.a1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableSortedSet.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> toMultimap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new BiConsumer() { // from class: com.google.common.collect.s1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multimap) obj).put(function.apply(obj2), function2.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.t1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.m13403h((Multimap) obj, (Multimap) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, E, M extends Multiset<E>> Collector<T, ?, M> toMultiset(final Function<? super T, E> function, final ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new BiConsumer() { // from class: com.google.common.collect.n1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((Multiset) obj).add(function.apply(obj2), toIntFunction.applyAsInt(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.p1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CollectCollectors.m13410o((Multiset) obj, (Multiset) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(final Function<? super T, ? extends K> function, final Function<? super T, ? extends V> function2, final BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.q1
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.m13394A(binaryOperator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.r1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((CollectCollectors.EnumMapAccumulator) obj).put((Enum) Preconditions.checkNotNull((Enum) function.apply(obj2), "Null key for input %s", obj2), Preconditions.checkNotNull(function2.apply(obj2), "Null value for input %s", obj2));
            }
        }, new C8303q0(), new C8307r0(), new Collector.Characteristics[0]);
    }

    public static <T, K, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.k1
            @Override // java.util.function.Supplier
            public final Object get() {
                return new LinkedHashMap();
            }
        }), new Function() { // from class: com.google.common.collect.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableMap.copyOf((Map) obj);
            }
        });
    }

    public static <T, K, V> Collector<T, ?, ImmutableSortedMap<K, V>> toImmutableSortedMap(final Comparator<? super K> comparator, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(binaryOperator);
        return Collectors.collectingAndThen(Collectors.toMap(function, function2, binaryOperator, new Supplier() { // from class: com.google.common.collect.l0
            @Override // java.util.function.Supplier
            public final Object get() {
                return CollectCollectors.m13411p(comparator);
            }
        }), new Function() { // from class: com.google.common.collect.m0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMap.copyOfSorted((TreeMap) obj);
            }
        });
    }
}
