package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class ExplicitOrdering<T> extends Ordering<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final ImmutableMap<T, Integer> rankMap;

    public ExplicitOrdering(List<T> list) {
        this(Maps.indexMap(list));
    }

    public ExplicitOrdering(ImmutableMap<T, Integer> immutableMap) {
        this.rankMap = immutableMap;
    }

    private int rank(T t11) {
        Integer num = this.rankMap.get(t11);
        if (num != null) {
            return num.intValue();
        }
        throw new Ordering.IncomparableValueException(t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj instanceof ExplicitOrdering) {
            return this.rankMap.equals(((ExplicitOrdering) obj).rankMap);
        }
        return false;
    }

    public int hashCode() {
        return this.rankMap.hashCode();
    }

    public String toString() {
        return "Ordering.explicit(" + this.rankMap.keySet() + ")";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t11, T t12) {
        return rank(t11) - rank(t12);
    }
}
