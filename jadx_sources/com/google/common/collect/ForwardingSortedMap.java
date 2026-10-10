package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    public class StandardKeySet extends Maps.SortedKeySet<K, V> {
        public StandardKeySet() {
            super(ForwardingSortedMap.this);
        }
    }

    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    public abstract SortedMap<K, V> delegate();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap
    public boolean standardContainsKey(Object obj) {
        try {
            return unsafeCompare(comparator(), tailMap(obj).firstKey(), obj) == 0;
        } catch (ClassCastException | NullPointerException | NoSuchElementException unused) {
        }
    }

    public static int unsafeCompare(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return delegate().comparator();
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public K firstKey() {
        return delegate().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@ParametricNullness K k11) {
        return delegate().headMap(k11);
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public K lastKey() {
        return delegate().lastKey();
    }

    public SortedMap<K, V> standardSubMap(K k11, K k12) {
        boolean z11;
        if (unsafeCompare(comparator(), k11, k12) <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Preconditions.checkArgument(z11, "fromKey must be <= toKey");
        return tailMap(k11).headMap(k12);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@ParametricNullness K k11, @ParametricNullness K k12) {
        return delegate().subMap(k11, k12);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@ParametricNullness K k11) {
        return delegate().tailMap(k11);
    }
}
