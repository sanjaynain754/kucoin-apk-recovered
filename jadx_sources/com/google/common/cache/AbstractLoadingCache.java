package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.util.concurrent.UncheckedExecutionException;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes56.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class AbstractLoadingCache<K, V> extends AbstractCache<K, V> implements LoadingCache<K, V> {
    @Override // com.google.common.cache.LoadingCache
    public void refresh(K k11) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public final V apply(K k11) {
        return getUnchecked(k11);
    }

    @Override // com.google.common.cache.LoadingCache
    public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        for (K k11 : iterable) {
            if (!linkedHashMapNewLinkedHashMap.containsKey(k11)) {
                linkedHashMapNewLinkedHashMap.put(k11, get(k11));
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // com.google.common.cache.LoadingCache
    @CanIgnoreReturnValue
    public V getUnchecked(K k11) {
        try {
            return get(k11);
        } catch (ExecutionException e11) {
            throw new UncheckedExecutionException(e11.getCause());
        }
    }
}
