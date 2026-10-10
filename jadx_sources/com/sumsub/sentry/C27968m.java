package com.sumsub.sentry;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import tg0.InterfaceC44962o;

/* JADX INFO: renamed from: com.sumsub.sentry.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
@InterfaceC44962o(with = C27964l.class)
public final class C27968m extends ConcurrentHashMap<String, Object> {

    @NotNull
    public static final C27956j Companion = new C27956j();

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return super.remove((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return super.containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj == null ? true : obj instanceof String) {
            return super.get((String) obj);
        }
        return null;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj == null ? true : obj instanceof String) ? obj2 : super.getOrDefault((String) obj, obj2);
    }

    /* JADX INFO: renamed from: a */
    public final void m69012a(C27911a1 c27911a1) {
        Objects.requireNonNull(c27911a1, "traceContext is required");
        put("trace", c27911a1);
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj == null ? true : obj instanceof String) {
            return super.remove((String) obj, obj2);
        }
        return false;
    }
}
