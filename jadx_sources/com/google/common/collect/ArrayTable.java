package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.tencent.bugly.proguard.C33627eb;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final ImmutableMap<C, Integer> columnKeyToIndex;
    private final ImmutableList<C> columnList;

    @LazyInit
    private transient ArrayTable<R, C, V>.ColumnMap columnMap;
    private final ImmutableMap<R, Integer> rowKeyToIndex;
    private final ImmutableList<R> rowList;

    @LazyInit
    private transient ArrayTable<R, C, V>.RowMap rowMap;

    public static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {
        private final ImmutableMap<K, Integer> keyIndex;

        public abstract String getKeyRole();

        @ParametricNullness
        public abstract V getValue(int i11);

        @ParametricNullness
        public abstract V setValue(int i11, @ParametricNullness V v11);

        private ArrayMap(ImmutableMap<K, Integer> immutableMap) {
            this.keyIndex = immutableMap;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.keyIndex.containsKey(obj);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        public Iterator<Map.Entry<K, V>> entryIterator() {
            return new AbstractIndexedListIterator<Map.Entry<K, V>>(size()) { // from class: com.google.common.collect.ArrayTable.ArrayMap.2
                @Override // com.google.common.collect.AbstractIndexedListIterator
                public Map.Entry<K, V> get(int i11) {
                    return ArrayMap.this.getEntry(i11);
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Integer num = this.keyIndex.get(obj);
            if (num == null) {
                return null;
            }
            return getValue(num.intValue());
        }

        public K getKey(int i11) {
            return this.keyIndex.keySet().asList().get(i11);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.keyIndex.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.keyIndex.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k11, @ParametricNullness V v11) {
            Integer num = this.keyIndex.get(k11);
            if (num != null) {
                return setValue(num.intValue(), v11);
            }
            throw new IllegalArgumentException(getKeyRole() + C33627eb.f69716f + k11 + " not in " + this.keyIndex.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.keyIndex.size();
        }

        public Map.Entry<K, V> getEntry(final int i11) {
            Preconditions.checkElementIndex(i11, size());
            return new AbstractMapEntry<K, V>(this) { // from class: com.google.common.collect.ArrayTable.ArrayMap.1
                final /* synthetic */ ArrayMap this$0;

                {
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public K getKey() {
                    return (K) this.this$0.getKey(i11);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @ParametricNullness
                public V getValue() {
                    return (V) this.this$0.getValue(i11);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @ParametricNullness
                public V setValue(@ParametricNullness V v11) {
                    return (V) this.this$0.setValue(i11, v11);
                }
            };
        }
    }

    public class Column extends ArrayMap<R, V> {
        final int columnIndex;

        public Column(int i11) {
            super(ArrayTable.this.rowKeyToIndex);
            this.columnIndex = i11;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V getValue(int i11) {
            return (V) ArrayTable.this.m13393at(i11, this.columnIndex);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V setValue(int i11, V v11) {
            return (V) ArrayTable.this.set(i11, this.columnIndex, v11);
        }
    }

    public class ColumnMap extends ArrayMap<C, Map<R, V>> {
        private ColumnMap() {
            super(ArrayTable.this.columnKeyToIndex);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public Map<R, V> getValue(int i11) {
            return new Column(i11);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public Map<R, V> put(C c11, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public Map<R, V> setValue(int i11, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    public class Row extends ArrayMap<C, V> {
        final int rowIndex;

        public Row(int i11) {
            super(ArrayTable.this.columnKeyToIndex);
            this.rowIndex = i11;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V getValue(int i11) {
            return (V) ArrayTable.this.m13393at(this.rowIndex, i11);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public V setValue(int i11, V v11) {
            return (V) ArrayTable.this.set(this.rowIndex, i11, v11);
        }
    }

    public class RowMap extends ArrayMap<R, Map<C, V>> {
        private RowMap() {
            super(ArrayTable.this.rowKeyToIndex);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public String getKeyRole() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public Map<C, V> getValue(int i11) {
            return new Row(i11);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public Map<C, V> put(R r11, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        public Map<C, V> setValue(int i11, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    private ArrayTable(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        ImmutableList<R> immutableListCopyOf = ImmutableList.copyOf(iterable);
        this.rowList = immutableListCopyOf;
        ImmutableList<C> immutableListCopyOf2 = ImmutableList.copyOf(iterable2);
        this.columnList = immutableListCopyOf2;
        Preconditions.checkArgument(immutableListCopyOf.isEmpty() == immutableListCopyOf2.isEmpty());
        this.rowKeyToIndex = Maps.indexMap(immutableListCopyOf);
        this.columnKeyToIndex = Maps.indexMap(immutableListCopyOf2);
        this.array = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableListCopyOf.size(), immutableListCopyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Table<R, C, ? extends V> table) {
        return table instanceof ArrayTable ? new ArrayTable<>((ArrayTable) table) : new ArrayTable<>(table);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Table.Cell<R, C, V> getCell(int i11) {
        return new Tables.AbstractCell<R, C, V>(this, i11) { // from class: com.google.common.collect.ArrayTable.2
            final int columnIndex;
            final int rowIndex;
            final /* synthetic */ ArrayTable this$0;
            final /* synthetic */ int val$index;

            {
                this.val$index = i11;
                this.this$0 = this;
                this.rowIndex = i11 / this.columnList.size();
                this.columnIndex = i11 % this.columnList.size();
            }

            @Override // com.google.common.collect.Table.Cell
            public C getColumnKey() {
                return (C) this.this$0.columnList.get(this.columnIndex);
            }

            @Override // com.google.common.collect.Table.Cell
            public R getRowKey() {
                return (R) this.this$0.rowList.get(this.rowIndex);
            }

            @Override // com.google.common.collect.Table.Cell
            public V getValue() {
                return (V) this.this$0.m13393at(this.rowIndex, this.columnIndex);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V getValue(int i11) {
        return m13393at(i11 / this.columnList.size(), i11 % this.columnList.size());
    }

    /* JADX INFO: renamed from: at */
    public V m13393at(int i11, int i12) {
        Preconditions.checkElementIndex(i11, this.rowList.size());
        Preconditions.checkElementIndex(i12, this.columnList.size());
        return this.array[i11][i12];
    }

    @Override // com.google.common.collect.AbstractTable
    public Iterator<Table.Cell<R, C, V>> cellIterator() {
        return new AbstractIndexedListIterator<Table.Cell<R, C, V>>(size()) { // from class: com.google.common.collect.ArrayTable.1
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public Table.Cell<R, C, V> get(int i11) {
                return ArrayTable.this.getCell(i11);
            }
        };
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<C> columnKeyList() {
        return this.columnList;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        ArrayTable<R, C, V>.ColumnMap columnMap = this.columnMap;
        if (columnMap != null) {
            return columnMap;
        }
        ArrayTable<R, C, V>.ColumnMap columnMap2 = new ColumnMap();
        this.columnMap = columnMap2;
        return columnMap2;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        for (V[] vArr : this.array) {
            for (V v11 : vArr) {
                if (Objects.equal(obj, v11)) {
                    return true;
                }
            }
        }
        return false;
    }

    @CanIgnoreReturnValue
    public V erase(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.array) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return m13393at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<R> rowKeyList() {
        return this.rowList;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        ArrayTable<R, C, V>.RowMap rowMap = this.rowMap;
        if (rowMap != null) {
            return rowMap;
        }
        ArrayTable<R, C, V>.RowMap rowMap2 = new RowMap();
        this.rowMap = rowMap2;
        return rowMap2;
    }

    @CanIgnoreReturnValue
    public V set(int i11, int i12, V v11) {
        Preconditions.checkElementIndex(i11, this.rowList.size());
        Preconditions.checkElementIndex(i12, this.columnList.size());
        V[] vArr = this.array[i11];
        V v12 = vArr[i12];
        vArr[i12] = v11;
        return v12;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    @GwtIncompatible
    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i11 = 0; i11 < this.rowList.size(); i11++) {
            V[] vArr2 = this.array[i11];
            System.arraycopy(vArr2, 0, vArr[i11], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.AbstractTable
    public Iterator<V> valuesIterator() {
        return new AbstractIndexedListIterator<V>(size()) { // from class: com.google.common.collect.ArrayTable.3
            @Override // com.google.common.collect.AbstractIndexedListIterator
            public V get(int i11) {
                return (V) ArrayTable.this.getValue(i11);
            }
        };
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c11) {
        Preconditions.checkNotNull(c11);
        Integer num = this.columnKeyToIndex.get(c11);
        if (num == null) {
            return Collections.EMPTY_MAP;
        }
        return new Column(num.intValue());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        if (containsRow(obj) && containsColumn(obj2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r11, C c11, V v11) {
        boolean z11;
        Preconditions.checkNotNull(r11);
        Preconditions.checkNotNull(c11);
        Integer num = this.rowKeyToIndex.get(r11);
        boolean z12 = false;
        if (num != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "Row %s not in %s", r11, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(c11);
        if (num2 != null) {
            z12 = true;
        }
        Preconditions.checkArgument(z12, "Column %s not in %s", c11, this.columnList);
        return set(num.intValue(), num2.intValue(), v11);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r11) {
        Preconditions.checkNotNull(r11);
        Integer num = this.rowKeyToIndex.get(r11);
        if (num == null) {
            return Collections.EMPTY_MAP;
        }
        return new Row(num.intValue());
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ArrayTable(Table<R, C, ? extends V> table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private ArrayTable(ArrayTable<R, C, V> arrayTable) {
        ImmutableList<R> immutableList = arrayTable.rowList;
        this.rowList = immutableList;
        ImmutableList<C> immutableList2 = arrayTable.columnList;
        this.columnList = immutableList2;
        this.rowKeyToIndex = arrayTable.rowKeyToIndex;
        this.columnKeyToIndex = arrayTable.columnKeyToIndex;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, immutableList.size(), immutableList2.size()));
        this.array = vArr;
        for (int i11 = 0; i11 < this.rowList.size(); i11++) {
            V[] vArr2 = arrayTable.array[i11];
            System.arraycopy(vArr2, 0, vArr[i11], 0, vArr2.length);
        }
    }
}
