package org.springframework.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import wh0.AbstractC45839g;

/* JADX INFO: loaded from: classes61.dex */
public class LinkedMultiValueMap<K, V> extends MultiValueMapAdapter<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 3801124242820219131L;

    public LinkedMultiValueMap() {
        super(new LinkedHashMap());
    }

    public LinkedMultiValueMap(int i11) {
        super(AbstractC45839g.m101261d(i11));
    }

    public LinkedMultiValueMap<K, V> clone() {
        return new LinkedMultiValueMap<>(this);
    }

    public LinkedMultiValueMap<K, V> deepCopy() {
        final LinkedMultiValueMap<K, V> linkedMultiValueMap = new LinkedMultiValueMap<>(size());
        forEach(new BiConsumer() { // from class: wh0.h
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.f103314a.put(obj, (List) new ArrayList((List) obj2));
            }
        });
        return linkedMultiValueMap;
    }

    public LinkedMultiValueMap(Map<K, List<V>> map) {
        super(new LinkedHashMap(map));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.springframework.util.MultiValueMapAdapter, wh0.InterfaceC45841i
    public /* bridge */ /* synthetic */ void addIfAbsent(Object obj, Object obj2) {
        super.addIfAbsent(obj, obj2);
    }
}
