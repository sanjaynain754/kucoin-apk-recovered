package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes56.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface BiMap<K, V> extends Map<K, V> {
    @CanIgnoreReturnValue
    V forcePut(@ParametricNullness K k11, @ParametricNullness V v11);

    BiMap<V, K> inverse();

    @CanIgnoreReturnValue
    V put(@ParametricNullness K k11, @ParametricNullness V v11);

    void putAll(Map<? extends K, ? extends V> map);

    @Override // com.google.common.collect.BiMap
    Set<V> values();
}
