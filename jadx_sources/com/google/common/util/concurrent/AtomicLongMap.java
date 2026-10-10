package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes56.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtCompatible
public final class AtomicLongMap<K> implements Serializable {

    @LazyInit
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    @CanIgnoreReturnValue
    public long remove(K k11) {
        long j11;
        AtomicLong atomicLong = this.map.get(k11);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j11 = atomicLong.get();
            if (j11 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j11, 0L));
        this.map.remove(k11, atomicLong);
        return j11;
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map) {
        AtomicLongMap<K> atomicLongMapCreate = create();
        atomicLongMapCreate.putAll(map);
        return atomicLongMapCreate;
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(Maps.transformValues(this.map, new Function<AtomicLong, Long>() { // from class: com.google.common.util.concurrent.AtomicLongMap.1
            @Override // com.google.common.base.Function
            public Long apply(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    @CanIgnoreReturnValue
    public long addAndGet(K k11, long j11) {
        AtomicLong atomicLongPutIfAbsent;
        long j12;
        long j13;
        do {
            atomicLongPutIfAbsent = this.map.get(k11);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k11, new AtomicLong(j11))) == null) {
                break;
            }
            do {
                j12 = atomicLongPutIfAbsent.get();
                if (j12 != 0) {
                    j13 = j12 + j11;
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j12, j13));
            return j13;
        } while (!this.map.replace(k11, atomicLongPutIfAbsent, new AtomicLong(j11)));
        return j11;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> mapCreateAsMap = createAsMap();
        this.asMap = mapCreateAsMap;
        return mapCreateAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @CanIgnoreReturnValue
    public long decrementAndGet(K k11) {
        return addAndGet(k11, -1L);
    }

    public long get(K k11) {
        AtomicLong atomicLong = this.map.get(k11);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @CanIgnoreReturnValue
    public long getAndAdd(K k11, long j11) {
        AtomicLong atomicLongPutIfAbsent;
        long j12;
        do {
            atomicLongPutIfAbsent = this.map.get(k11);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k11, new AtomicLong(j11))) == null) {
                return 0L;
            }
            do {
                j12 = atomicLongPutIfAbsent.get();
                if (j12 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j12, j12 + j11));
            return j12;
        } while (!this.map.replace(k11, atomicLongPutIfAbsent, new AtomicLong(j11)));
        return 0L;
    }

    @CanIgnoreReturnValue
    public long getAndDecrement(K k11) {
        return getAndAdd(k11, -1L);
    }

    @CanIgnoreReturnValue
    public long getAndIncrement(K k11) {
        return getAndAdd(k11, 1L);
    }

    @CanIgnoreReturnValue
    public long incrementAndGet(K k11) {
        return addAndGet(k11, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @CanIgnoreReturnValue
    public long put(K k11, long j11) {
        AtomicLong atomicLongPutIfAbsent;
        long j12;
        do {
            atomicLongPutIfAbsent = this.map.get(k11);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k11, new AtomicLong(j11))) == null) {
                return 0L;
            }
            do {
                j12 = atomicLongPutIfAbsent.get();
                if (j12 == 0) {
                }
            } while (!atomicLongPutIfAbsent.compareAndSet(j12, j11));
            return j12;
        } while (!this.map.replace(k11, atomicLongPutIfAbsent, new AtomicLong(j11)));
        return 0L;
    }

    public long putIfAbsent(K k11, long j11) {
        AtomicLong atomicLongPutIfAbsent;
        do {
            atomicLongPutIfAbsent = this.map.get(k11);
            if (atomicLongPutIfAbsent == null && (atomicLongPutIfAbsent = this.map.putIfAbsent(k11, new AtomicLong(j11))) == null) {
                return 0L;
            }
            long j12 = atomicLongPutIfAbsent.get();
            if (j12 != 0) {
                return j12;
            }
        } while (!this.map.replace(k11, atomicLongPutIfAbsent, new AtomicLong(j11)));
        return 0L;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @CanIgnoreReturnValue
    public boolean removeIfZero(K k11) {
        return remove(k11, 0L);
    }

    public boolean replace(K k11, long j11, long j12) {
        if (j11 == 0) {
            return putIfAbsent(k11, j12) == 0;
        }
        AtomicLong atomicLong = this.map.get(k11);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(j11, j12);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.map.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += it.next().get();
        }
        return j11;
    }

    public String toString() {
        return this.map.toString();
    }

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.map = (ConcurrentHashMap) Preconditions.checkNotNull(concurrentHashMap);
    }

    public void putAll(Map<? extends K, ? extends Long> map) {
        for (Map.Entry<? extends K, ? extends Long> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public boolean remove(K k11, long j11) {
        AtomicLong atomicLong = this.map.get(k11);
        if (atomicLong == null) {
            return false;
        }
        long j12 = atomicLong.get();
        if (j12 != j11) {
            return false;
        }
        if (j12 != 0 && !atomicLong.compareAndSet(j12, 0L)) {
            return false;
        }
        this.map.remove(k11, atomicLong);
        return true;
    }
}
