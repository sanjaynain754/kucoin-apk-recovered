package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
@IgnoreJRERequirement
final class TableCollectors {

    public static final class ImmutableTableCollectorState<R, C, V> {
        final List<MutableCell<R, C, V>> insertionOrder;
        final Table<R, C, MutableCell<R, C, V>> table;

        private ImmutableTableCollectorState() {
            this.insertionOrder = new ArrayList();
            this.table = HashBasedTable.create();
        }

        public ImmutableTableCollectorState<R, C, V> combine(ImmutableTableCollectorState<R, C, V> immutableTableCollectorState, BinaryOperator<V> binaryOperator) {
            for (MutableCell<R, C, V> mutableCell : immutableTableCollectorState.insertionOrder) {
                put(mutableCell.getRowKey(), mutableCell.getColumnKey(), mutableCell.getValue(), binaryOperator);
            }
            return this;
        }

        public void put(R r11, C c11, V v11, BinaryOperator<V> binaryOperator) {
            MutableCell<R, C, V> mutableCell = this.table.get(r11, c11);
            if (mutableCell != null) {
                mutableCell.merge(v11, binaryOperator);
                return;
            }
            MutableCell<R, C, V> mutableCell2 = new MutableCell<>(r11, c11, v11);
            this.insertionOrder.add(mutableCell2);
            this.table.put(r11, c11, mutableCell2);
        }

        public ImmutableTable<R, C, V> toTable() {
            return ImmutableTable.copyOf(this.insertionOrder);
        }
    }

    @IgnoreJRERequirement
    public static final class MutableCell<R, C, V> extends Tables.AbstractCell<R, C, V> {
        private final C column;
        private final R row;
        private V value;

        @Override // com.google.common.collect.Table.Cell
        public C getColumnKey() {
            return this.column;
        }

        @Override // com.google.common.collect.Table.Cell
        public R getRowKey() {
            return this.row;
        }

        @Override // com.google.common.collect.Table.Cell
        public V getValue() {
            return this.value;
        }

        public void merge(V v11, BinaryOperator<V> binaryOperator) {
            Preconditions.checkNotNull(v11, "value");
            this.value = (V) Preconditions.checkNotNull(binaryOperator.apply(this.value, v11), "mergeFunction.apply");
        }

        public MutableCell(R r11, C c11, V v11) {
            this.row = (R) Preconditions.checkNotNull(r11, "row");
            this.column = (C) Preconditions.checkNotNull(c11, "column");
            this.value = (V) Preconditions.checkNotNull(v11, "value");
        }
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.g3
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImmutableTable.Builder();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.h3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((ImmutableTable.Builder) obj).put(function.apply(obj2), function2.apply(obj2), function3.apply(obj2));
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.i3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((ImmutableTable.Builder) obj).combine((ImmutableTable.Builder) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.z2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ImmutableTable.Builder) obj).build();
            }
        }, new Collector.Characteristics[0]);
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(Function<? super T, ? extends R> function, Function<? super T, ? extends C> function2, Function<? super T, ? extends V> function3, Supplier<I> supplier) {
        return toTable(function, function2, function3, new BinaryOperator() { // from class: com.google.common.collect.y2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return TableCollectors.m13564b(obj, obj2);
            }
        }, supplier);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m13564b(Object obj, Object obj2) {
        throw new IllegalStateException("Conflicting values " + obj + " and " + obj2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ ImmutableTableCollectorState m13568f() {
        return new ImmutableTableCollectorState();
    }

    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3, final BinaryOperator<V> binaryOperator, Supplier<I> supplier) {
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(function2);
        Preconditions.checkNotNull(function3);
        Preconditions.checkNotNull(binaryOperator);
        Preconditions.checkNotNull(supplier);
        return Collector.of(supplier, new BiConsumer() { // from class: com.google.common.collect.a3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Table table = (Table) obj;
                TableCollectors.mergeTables(table, function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.b3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return TableCollectors.m13569g(binaryOperator, (Table) obj, (Table) obj2);
            }
        }, new Collector.Characteristics[0]);
    }

    private TableCollectors() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Table m13569g(BinaryOperator binaryOperator, Table table, Table table2) {
        for (Table.Cell cell : table2.cellSet()) {
            mergeTables(table, cell.getRowKey(), cell.getColumnKey(), cell.getValue(), binaryOperator);
        }
        return table;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <R, C, V> void mergeTables(Table<R, C, V> table, @ParametricNullness R r11, @ParametricNullness C c11, V v11, BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(v11);
        V v12 = table.get(r11, c11);
        if (v12 == null) {
            table.put(r11, c11, v11);
            return;
        }
        Object objApply = binaryOperator.apply(v12, v11);
        if (objApply == null) {
            table.remove(r11, c11);
        } else {
            table.put(r11, c11, objApply);
        }
    }

    public static <T, R, C, V> Collector<T, ?, ImmutableTable<R, C, V>> toImmutableTable(final Function<? super T, ? extends R> function, final Function<? super T, ? extends C> function2, final Function<? super T, ? extends V> function3, final BinaryOperator<V> binaryOperator) {
        Preconditions.checkNotNull(function, "rowFunction");
        Preconditions.checkNotNull(function2, "columnFunction");
        Preconditions.checkNotNull(function3, "valueFunction");
        Preconditions.checkNotNull(binaryOperator, "mergeFunction");
        return Collector.of(new Supplier() { // from class: com.google.common.collect.c3
            @Override // java.util.function.Supplier
            public final Object get() {
                return TableCollectors.m13568f();
            }
        }, new BiConsumer() { // from class: com.google.common.collect.d3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                TableCollectors.ImmutableTableCollectorState immutableTableCollectorState = (TableCollectors.ImmutableTableCollectorState) obj;
                immutableTableCollectorState.put(function.apply(obj2), function2.apply(obj2), function3.apply(obj2), binaryOperator);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.e3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((TableCollectors.ImmutableTableCollectorState) obj).combine((TableCollectors.ImmutableTableCollectorState) obj2, binaryOperator);
            }
        }, new Function() { // from class: com.google.common.collect.f3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TableCollectors.ImmutableTableCollectorState) obj).toTable();
            }
        }, new Collector.Characteristics[0]);
    }
}
