package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: CrossLeverageEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/SymbolsCrossLeverage;", "Ljava/util/HashMap;", "", "Lcom/kubi/kumex/data/trade/model/CrossLeverageEntity;", "Lkotlin/collections/HashMap;", "<init>", "()V", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SymbolsCrossLeverage extends HashMap<String, CrossLeverageEntity> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(CrossLeverageEntity crossLeverageEntity) {
        return super.containsValue((Object) crossLeverageEntity);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ CrossLeverageEntity get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public final /* bridge */ CrossLeverageEntity getOrDefault(Object obj, CrossLeverageEntity crossLeverageEntity) {
        return !(obj instanceof String) ? crossLeverageEntity : getOrDefault((String) obj, crossLeverageEntity);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ CrossLeverageEntity remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof CrossLeverageEntity) {
            return containsValue((CrossLeverageEntity) obj);
        }
        return false;
    }

    public /* bridge */ CrossLeverageEntity get(String str) {
        return (CrossLeverageEntity) super.get((Object) str);
    }

    public /* bridge */ CrossLeverageEntity getOrDefault(String str, CrossLeverageEntity crossLeverageEntity) {
        return (CrossLeverageEntity) super.getOrDefault((Object) str, crossLeverageEntity);
    }

    public /* bridge */ CrossLeverageEntity remove(String str) {
        return (CrossLeverageEntity) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, CrossLeverageEntity>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<String, CrossLeverageEntity>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (CrossLeverageEntity) obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<CrossLeverageEntity> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<CrossLeverageEntity> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof CrossLeverageEntity)) {
            return remove((String) obj, (CrossLeverageEntity) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, CrossLeverageEntity crossLeverageEntity) {
        return super.remove((Object) str, (Object) crossLeverageEntity);
    }
}
