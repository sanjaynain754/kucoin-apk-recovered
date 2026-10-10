package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract K getKey();

    @Override // java.util.Map.Entry
    @ParametricNullness
    public abstract V getValue();

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (Objects.equal(getKey(), entry.getKey()) && Objects.equal(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    @ParametricNullness
    public V setValue(@ParametricNullness V v11) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int iHashCode;
        K key = getKey();
        V value = getValue();
        int iHashCode2 = 0;
        if (key == null) {
            iHashCode = 0;
        } else {
            iHashCode = key.hashCode();
        }
        if (value != null) {
            iHashCode2 = value.hashCode();
        }
        return iHashCode ^ iHashCode2;
    }
}
