package com.kubi.user.token;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.user.token.TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1 */
/* JADX INFO: compiled from: TokenLifecycleRefreshExecutor.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003`\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bH\u0014¨\u0006\t"}, m90084d2 = {"com/kubi/user/token/TokenLifecycleRefreshExecutor$lastRefreshElapsedRealtimeBySession$1", "Ljava/util/LinkedHashMap;", "Lcom/kubi/user/token/TokenLifecycleRefreshExecutor$RefreshRateLimitKey;", "", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C26830xe289c863 extends LinkedHashMap<TokenLifecycleRefreshExecutor.RefreshRateLimitKey, Long> {
    public /* bridge */ boolean containsKey(TokenLifecycleRefreshExecutor.RefreshRateLimitKey c26828c) {
        return super.containsKey((Object) c26828c);
    }

    public /* bridge */ boolean containsValue(Long l11) {
        return super.containsValue((Object) l11);
    }

    public /* bridge */ Long get(TokenLifecycleRefreshExecutor.RefreshRateLimitKey c26828c) {
        return (Long) super.get((Object) c26828c);
    }

    public /* bridge */ Long getOrDefault(TokenLifecycleRefreshExecutor.RefreshRateLimitKey c26828c, Long l11) {
        return (Long) super.getOrDefault((Object) c26828c, l11);
    }

    public /* bridge */ Long remove(TokenLifecycleRefreshExecutor.RefreshRateLimitKey c26828c) {
        return (Long) super.remove((Object) c26828c);
    }

    public C26830xe289c863() {
        super(16, 0.75f, true);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) {
            return containsKey((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Long) {
            return containsValue((Long) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Long get(Object obj) {
        if (obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) {
            return get((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj);
        }
        return null;
    }

    public final /* bridge */ Long getOrDefault(Object obj, Long l11) {
        return !(obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) ? l11 : getOrDefault((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj, l11);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Long remove(Object obj) {
        if (obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) {
            return remove((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<TokenLifecycleRefreshExecutor.RefreshRateLimitKey, Long>> entrySet() {
        return getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) {
            return get((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<TokenLifecycleRefreshExecutor.RefreshRateLimitKey, Long>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<TokenLifecycleRefreshExecutor.RefreshRateLimitKey> getKeys() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) ? obj2 : getOrDefault((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj, (Long) obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Long> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<TokenLifecycleRefreshExecutor.RefreshRateLimitKey> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) {
            return remove((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj);
        }
        return null;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<TokenLifecycleRefreshExecutor.RefreshRateLimitKey, Long> eldest) {
        if (size() > 64) {
            return true;
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Long> values() {
        return getValues();
    }

    public /* bridge */ boolean remove(TokenLifecycleRefreshExecutor.RefreshRateLimitKey c26828c, Long l11) {
        return super.remove((Object) c26828c, (Object) l11);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof TokenLifecycleRefreshExecutor.RefreshRateLimitKey) && (obj2 instanceof Long)) {
            return remove((TokenLifecycleRefreshExecutor.RefreshRateLimitKey) obj, (Long) obj2);
        }
        return false;
    }
}
