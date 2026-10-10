package com.kubi.futures.data.platform;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: FuturesSpreadConfigService.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u0014¨\u0006\b"}, m90084d2 = {"com/kubi/futures/data/platform/FuturesSpreadConfigService$cache$1", "Ljava/util/LinkedHashMap;", "", "Ljava/math/BigDecimal;", "removeEldestEntry", "", "eldest", "", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FuturesSpreadConfigService$cache$1 extends LinkedHashMap<String, BigDecimal> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof BigDecimal) {
            return containsValue((BigDecimal) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (BigDecimal) obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public FuturesSpreadConfigService$cache$1() {
        super(100, 0.75f, true);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(BigDecimal bigDecimal) {
        return super.containsValue((Object) bigDecimal);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ BigDecimal get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public final /* bridge */ BigDecimal getOrDefault(Object obj, BigDecimal bigDecimal) {
        return !(obj instanceof String) ? bigDecimal : getOrDefault((String) obj, bigDecimal);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ BigDecimal remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, BigDecimal>> entrySet() {
        return getEntries();
    }

    public /* bridge */ BigDecimal get(String str) {
        return (BigDecimal) super.get((Object) str);
    }

    public /* bridge */ Set<Map.Entry<String, BigDecimal>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ BigDecimal getOrDefault(String str, BigDecimal bigDecimal) {
        return (BigDecimal) super.getOrDefault((Object) str, bigDecimal);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<BigDecimal> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    public /* bridge */ BigDecimal remove(String str) {
        return (BigDecimal) super.remove((Object) str);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<String, BigDecimal> eldest) {
        if (size() > 100) {
            return true;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<BigDecimal> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof BigDecimal)) {
            return remove((String) obj, (BigDecimal) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, BigDecimal bigDecimal) {
        return super.remove((Object) str, (Object) bigDecimal);
    }
}
