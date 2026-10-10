package com.kubi.sdk.web.core;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;

/* JADX INFO: compiled from: BridgeWebChromeClient.kt */
/* JADX INFO: loaded from: classes43.dex */
@Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J%\u0010\b\u001a\u00020\u00072\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m90084d2 = {"com/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter$records$1", "Ljava/util/LinkedHashMap;", "", "Lcom/kubi/sdk/web/core/BridgeWebChromeClient$ConsoleErrorLimiter$a;", "Lkotlin/collections/LinkedHashMap;", "", "eldest", "", "removeEldestEntry", "(Ljava/util/Map$Entry;)Z", "KWebView_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
public final class BridgeWebChromeClient$ConsoleErrorLimiter$records$1 extends LinkedHashMap<String, BridgeWebChromeClient.ConsoleErrorLimiter.Record> {
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean containsValue(BridgeWebChromeClient.ConsoleErrorLimiter.Record c24301a) {
        return super.containsValue((Object) c24301a);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ BridgeWebChromeClient.ConsoleErrorLimiter.Record get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public final /* bridge */ BridgeWebChromeClient.ConsoleErrorLimiter.Record getOrDefault(Object obj, BridgeWebChromeClient.ConsoleErrorLimiter.Record c24301a) {
        return !(obj instanceof String) ? c24301a : getOrDefault((String) obj, c24301a);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ BridgeWebChromeClient.ConsoleErrorLimiter.Record remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public BridgeWebChromeClient$ConsoleErrorLimiter$records$1() {
        super(16, 0.75f, true);
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof BridgeWebChromeClient.ConsoleErrorLimiter.Record) {
            return containsValue((BridgeWebChromeClient.ConsoleErrorLimiter.Record) obj);
        }
        return false;
    }

    public /* bridge */ BridgeWebChromeClient.ConsoleErrorLimiter.Record get(String str) {
        return (BridgeWebChromeClient.ConsoleErrorLimiter.Record) super.get((Object) str);
    }

    public /* bridge */ BridgeWebChromeClient.ConsoleErrorLimiter.Record getOrDefault(String str, BridgeWebChromeClient.ConsoleErrorLimiter.Record c24301a) {
        return (BridgeWebChromeClient.ConsoleErrorLimiter.Record) super.getOrDefault((Object) str, c24301a);
    }

    public /* bridge */ BridgeWebChromeClient.ConsoleErrorLimiter.Record remove(String str) {
        return (BridgeWebChromeClient.ConsoleErrorLimiter.Record) super.remove((Object) str);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, BridgeWebChromeClient.ConsoleErrorLimiter.Record>> entrySet() {
        return getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<String, BridgeWebChromeClient.ConsoleErrorLimiter.Record>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (BridgeWebChromeClient.ConsoleErrorLimiter.Record) obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<BridgeWebChromeClient.ConsoleErrorLimiter.Record> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
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

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(@Nullable Map.Entry<String, BridgeWebChromeClient.ConsoleErrorLimiter.Record> eldest) {
        if (size() > 128) {
            return true;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<BridgeWebChromeClient.ConsoleErrorLimiter.Record> values() {
        return getValues();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof BridgeWebChromeClient.ConsoleErrorLimiter.Record)) {
            return remove((String) obj, (BridgeWebChromeClient.ConsoleErrorLimiter.Record) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str, BridgeWebChromeClient.ConsoleErrorLimiter.Record c24301a) {
        return super.remove((Object) str, (Object) c24301a);
    }
}
