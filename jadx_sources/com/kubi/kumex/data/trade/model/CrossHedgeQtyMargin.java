package com.kubi.kumex.data.trade.model;

import androidx.annotation.Keep;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CrossHedgeQtyMarginEntity.kt */
/* JADX INFO: loaded from: classes20.dex */
@Keep
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0000¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin;", "Ljava/util/HashMap;", "", "Lcom/kubi/kumex/data/trade/model/CrossOrderOfSymbol;", "Lkotlin/collections/HashMap;", "<init>", "()V", "deepCopy", "KumexApi_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCrossHedgeQtyMarginEntity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossHedgeQtyMarginEntity.kt\ncom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,43:1\n216#2,2:44\n*S KotlinDebug\n*F\n+ 1 CrossHedgeQtyMarginEntity.kt\ncom/kubi/kumex/data/trade/model/CrossHedgeQtyMargin\n*L\n34#1:44,2\n*E\n"})
public final class CrossHedgeQtyMargin extends HashMap<String, CrossOrderOfSymbol> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(CrossOrderOfSymbol crossOrderOfSymbol) {
        return super.containsValue((Object) crossOrderOfSymbol);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ CrossOrderOfSymbol get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public final /* bridge */ CrossOrderOfSymbol getOrDefault(Object obj, CrossOrderOfSymbol crossOrderOfSymbol) {
        return !(obj instanceof String) ? crossOrderOfSymbol : getOrDefault((String) obj, crossOrderOfSymbol);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ CrossOrderOfSymbol remove(Object obj) {
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
        if (obj instanceof CrossOrderOfSymbol) {
            return containsValue((CrossOrderOfSymbol) obj);
        }
        return false;
    }

    @NotNull
    public final CrossHedgeQtyMargin deepCopy() {
        CrossHedgeQtyMargin crossHedgeQtyMargin = new CrossHedgeQtyMargin();
        for (Map.Entry<String, CrossOrderOfSymbol> entry : entrySet()) {
            crossHedgeQtyMargin.put(entry.getKey(), CrossOrderOfSymbol.copy$default(entry.getValue(), null, null, null, null, null, null, 63, null));
        }
        return crossHedgeQtyMargin;
    }

    public /* bridge */ CrossOrderOfSymbol get(String str) {
        return (CrossOrderOfSymbol) super.get((Object) str);
    }

    public /* bridge */ CrossOrderOfSymbol getOrDefault(String str, CrossOrderOfSymbol crossOrderOfSymbol) {
        return (CrossOrderOfSymbol) super.getOrDefault((Object) str, crossOrderOfSymbol);
    }

    public /* bridge */ CrossOrderOfSymbol remove(String str) {
        return (CrossOrderOfSymbol) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, CrossOrderOfSymbol>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<String, CrossOrderOfSymbol>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (CrossOrderOfSymbol) obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<CrossOrderOfSymbol> getValues() {
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
    public final /* bridge */ Collection<CrossOrderOfSymbol> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof CrossOrderOfSymbol)) {
            return remove((String) obj, (CrossOrderOfSymbol) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, CrossOrderOfSymbol crossOrderOfSymbol) {
        return super.remove((Object) str, (Object) crossOrderOfSymbol);
    }
}
