package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import p852kotlin.UShort;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    private static final byte ABSENT = -1;
    private static final int BYTE_MASK = 255;
    private static final int BYTE_MAX_SIZE = 128;
    static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap(null, new Object[0], 0);
    private static final int SHORT_MASK = 65535;
    private static final int SHORT_MAX_SIZE = 32768;

    @J2ktIncompatible
    private static final long serialVersionUID = 0;

    @VisibleForTesting
    final transient Object[] alternatingKeysAndValues;
    private final transient Object hashTable;
    private final transient int size;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int keyOffset;
        private final transient ImmutableMap<K, V> map;
        private final transient int size;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (value != null && value.equals(this.map.get(key))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet
        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // com.google.common.collect.ImmutableCollection
                public boolean isPartialView() {
                    return true;
                }

                @Override // java.util.List
                public Map.Entry<K, V> get(int i11) {
                    Preconditions.checkElementIndex(i11, EntrySet.this.size);
                    int i12 = i11 * 2;
                    Object obj = EntrySet.this.alternatingKeysAndValues[EntrySet.this.keyOffset + i12];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.alternatingKeysAndValues[i12 + (EntrySet.this.keyOffset ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.size;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.size;
        }

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i11, int i12) {
            this.map = immutableMap;
            this.alternatingKeysAndValues = objArr;
            this.keyOffset = i11;
            this.size = i12;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i11) {
            return asList().copyIntoArray(objArr, i11);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableList<K> list;
        private final transient ImmutableMap<K, ?> map;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList<K> asList() {
            return this.list;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.map.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<K> iterator() {
            return asList().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.map.size();
        }

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.map = immutableMap;
            this.list = immutableList;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public int copyIntoArray(Object[] objArr, int i11) {
            return asList().copyIntoArray(objArr, i11);
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] alternatingKeysAndValues;
        private final transient int offset;
        private final transient int size;

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.List
        public Object get(int i11) {
            Preconditions.checkElementIndex(i11, this.size);
            Object obj = this.alternatingKeysAndValues[(i11 * 2) + this.offset];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.size;
        }

        public KeysOrValuesAsList(Object[] objArr, int i11, int i12) {
            this.alternatingKeysAndValues = objArr;
            this.offset = i11;
            this.size = i12;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i11, Object[] objArr) {
        return create(i11, objArr, null);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public V get(Object obj) {
        V v11 = (V) get(this.hashTable, this.alternatingKeysAndValues, this.size, 0, obj);
        if (v11 == null) {
            return null;
        }
        return v11;
    }

    @Override // com.google.common.collect.ImmutableMap
    public boolean isPartialView() {
        return false;
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i11, Object[] objArr, ImmutableMap.Builder<K, V> builder) {
        if (i11 == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i11 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return new RegularImmutableMap<>(null, objArr, 1);
        }
        Preconditions.checkPositionIndex(i11, objArr.length >> 1);
        Object objCreateHashTable = createHashTable(objArr, i11, ImmutableSet.chooseTableSize(i11), 0);
        if (objCreateHashTable instanceof Object[]) {
            Object[] objArr2 = (Object[]) objCreateHashTable;
            ImmutableMap.Builder.DuplicateKey duplicateKey = (ImmutableMap.Builder.DuplicateKey) objArr2[2];
            if (builder == null) {
                throw duplicateKey.exception();
            }
            builder.duplicateKey = duplicateKey;
            Object obj3 = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objCreateHashTable = obj3;
            i11 = iIntValue;
        }
        return new RegularImmutableMap<>(objCreateHashTable, objArr, i11);
    }

    private static Object createHashTable(Object[] objArr, int i11, int i12, int i13) {
        int i14;
        ImmutableMap.Builder.DuplicateKey duplicateKey = null;
        int i15 = 1;
        if (i11 == 1) {
            Object obj = objArr[i13];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i13 ^ 1];
            Objects.requireNonNull(obj2);
            CollectPreconditions.checkEntryNotNull(obj, obj2);
            return null;
        }
        int i16 = i12 - 1;
        if (i12 <= 128) {
            byte[] bArr = new byte[i12];
            Arrays.fill(bArr, (byte) -1);
            int i17 = 0;
            for (int i18 = 0; i18 < i11; i18++) {
                int i19 = (i18 * 2) + i13;
                int i21 = (i17 * 2) + i13;
                Object obj3 = objArr[i19];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i19 ^ 1];
                Objects.requireNonNull(obj4);
                CollectPreconditions.checkEntryNotNull(obj3, obj4);
                int iSmear = Hashing.smear(obj3.hashCode());
                while (true) {
                    int i22 = iSmear & i16;
                    int i23 = bArr[i22] & 255;
                    if (i23 == 255) {
                        bArr[i22] = (byte) i21;
                        if (i17 < i18) {
                            objArr[i21] = obj3;
                            objArr[i21 ^ 1] = obj4;
                        }
                        i17++;
                        break;
                    }
                    if (obj3.equals(objArr[i23])) {
                        int i24 = i23 ^ 1;
                        Object obj5 = objArr[i24];
                        Objects.requireNonNull(obj5);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj3, obj4, obj5);
                        objArr[i24] = obj4;
                        break;
                    }
                    iSmear = i22 + 1;
                }
            }
            return i17 == i11 ? bArr : new Object[]{bArr, Integer.valueOf(i17), duplicateKey};
        }
        if (i12 <= 32768) {
            short[] sArr = new short[i12];
            Arrays.fill(sArr, (short) -1);
            int i25 = 0;
            for (int i26 = 0; i26 < i11; i26++) {
                int i27 = (i26 * 2) + i13;
                int i28 = (i25 * 2) + i13;
                Object obj6 = objArr[i27];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i27 ^ 1];
                Objects.requireNonNull(obj7);
                CollectPreconditions.checkEntryNotNull(obj6, obj7);
                int iSmear2 = Hashing.smear(obj6.hashCode());
                while (true) {
                    int i29 = iSmear2 & i16;
                    int i31 = sArr[i29] & UShort.MAX_VALUE;
                    if (i31 == 65535) {
                        sArr[i29] = (short) i28;
                        if (i25 < i26) {
                            objArr[i28] = obj6;
                            objArr[i28 ^ 1] = obj7;
                        }
                        i25++;
                        break;
                    }
                    if (obj6.equals(objArr[i31])) {
                        int i32 = i31 ^ 1;
                        Object obj8 = objArr[i32];
                        Objects.requireNonNull(obj8);
                        duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj6, obj7, obj8);
                        objArr[i32] = obj7;
                        break;
                    }
                    iSmear2 = i29 + 1;
                }
            }
            return i25 == i11 ? sArr : new Object[]{sArr, Integer.valueOf(i25), duplicateKey};
        }
        int[] iArr = new int[i12];
        Arrays.fill(iArr, -1);
        int i33 = 0;
        int i34 = 0;
        while (i33 < i11) {
            int i35 = (i33 * 2) + i13;
            int i36 = (i34 * 2) + i13;
            Object obj9 = objArr[i35];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i35 ^ i15];
            Objects.requireNonNull(obj10);
            CollectPreconditions.checkEntryNotNull(obj9, obj10);
            int iSmear3 = Hashing.smear(obj9.hashCode());
            while (true) {
                int i37 = iSmear3 & i16;
                int i38 = iArr[i37];
                if (i38 == -1) {
                    iArr[i37] = i36;
                    if (i34 < i33) {
                        objArr[i36] = obj9;
                        objArr[i36 ^ 1] = obj10;
                    }
                    i34++;
                    i14 = i15;
                    break;
                }
                i14 = i15;
                if (obj9.equals(objArr[i38])) {
                    int i39 = i38 ^ 1;
                    Object obj11 = objArr[i39];
                    Objects.requireNonNull(obj11);
                    duplicateKey = new ImmutableMap.Builder.DuplicateKey(obj9, obj10, obj11);
                    objArr[i39] = obj10;
                    break;
                }
                iSmear3 = i37 + 1;
                i15 = i14;
            }
            i33++;
            i15 = i14;
        }
        int i41 = i15;
        if (i34 == i11) {
            return iArr;
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i41] = Integer.valueOf(i34);
        objArr2[2] = duplicateKey;
        return objArr2;
    }

    public static Object get(Object obj, Object[] objArr, int i11, int i12, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i11 == 1) {
            Object obj3 = objArr[i12];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i12 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iSmear = Hashing.smear(obj2.hashCode());
            while (true) {
                int i13 = iSmear & length;
                int i14 = bArr[i13] & 255;
                if (i14 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                iSmear = i13 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iSmear2 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i15 = iSmear2 & length2;
                int i16 = sArr[i15] & UShort.MAX_VALUE;
                if (i16 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i16])) {
                    return objArr[i16 ^ 1];
                }
                iSmear2 = i15 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iSmear3 = Hashing.smear(obj2.hashCode());
            while (true) {
                int i17 = iSmear3 & length3;
                int i18 = iArr[i17];
                if (i18 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i18])) {
                    return objArr[i18 ^ 1];
                }
                iSmear3 = i17 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.size);
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.size));
    }

    @Override // com.google.common.collect.ImmutableMap
    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.size);
    }

    @Override // java.util.Map
    public int size() {
        return this.size;
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i11) {
        this.hashTable = obj;
        this.alternatingKeysAndValues = objArr;
        this.size = i11;
    }

    public static Object createHashTableOrThrow(Object[] objArr, int i11, int i12, int i13) {
        Object objCreateHashTable = createHashTable(objArr, i11, i12, i13);
        if (!(objCreateHashTable instanceof Object[])) {
            return objCreateHashTable;
        }
        throw ((ImmutableMap.Builder.DuplicateKey) ((Object[]) objCreateHashTable)[2]).exception();
    }

    @Override // com.google.common.collect.ImmutableMap
    @J2ktIncompatible
    @GwtIncompatible
    public Object writeReplace() {
        return super.writeReplace();
    }
}
