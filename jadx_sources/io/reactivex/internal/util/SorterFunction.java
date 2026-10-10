package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes60.dex */
public final class SorterFunction<T> implements Function<List<T>, List<T>> {
    final Comparator<? super T> comparator;

    @Override // io.reactivex.functions.Function
    public List<T> apply(List<T> list) throws Exception {
        Collections.sort(list, this.comparator);
        return list;
    }

    public SorterFunction(Comparator<? super T> comparator) {
        this.comparator = comparator;
    }
}
