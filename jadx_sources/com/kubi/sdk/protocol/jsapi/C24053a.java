package com.kubi.sdk.protocol.jsapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.sdk.protocol.jsapi.a */
/* JADX INFO: compiled from: KCJSApiProtocolManager.kt */
/* JADX INFO: loaded from: classes41.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u0005*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m90084d2 = {"", "value", "", "c", "(Ljava/lang/Object;)Z", "", "", "d", "(Ljava/util/Map;)Ljava/util/Map;", "KcProtocol_release"}, m90085k = 2, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKCJSApiProtocolManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCJSApiProtocolManager.kt\ncom/kubi/sdk/protocol/jsapi/KCJSApiProtocolManagerKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,5421:1\n1726#2,3:5422\n1726#2,3:5425\n1238#2,2:5430\n1549#2:5432\n1620#2,3:5433\n1241#2:5436\n442#3:5428\n392#3:5429\n*S KotlinDebug\n*F\n+ 1 KCJSApiProtocolManager.kt\ncom/kubi/sdk/protocol/jsapi/KCJSApiProtocolManagerKt\n*L\n110#1:5422,3\n111#1:5425,3\n127#1:5430,2\n132#1:5432\n132#1:5433,3\n127#1:5436\n127#1:5428\n127#1:5429\n*E\n"})
public final class C24053a {
    /* JADX INFO: renamed from: c */
    public static final boolean m57898c(Object obj) {
        boolean z11;
        boolean z12;
        if (obj == null ? true : Intrinsics.areEqual(obj, JSONObject.NULL)) {
            return false;
        }
        if (obj instanceof String ? true : obj instanceof Boolean ? true : obj instanceof Number) {
            return true;
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (!m57898c(it.next())) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            Set setKeySet = map.keySet();
            if (setKeySet != null && setKeySet.isEmpty()) {
                z11 = true;
                break;
            }
            Iterator it2 = setKeySet.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = true;
                    break;
                }
                if (!(it2.next() instanceof String)) {
                    z11 = false;
                    break;
                }
            }
            if (z11) {
                Collection collectionValues = map.values();
                if (collectionValues == null || !collectionValues.isEmpty()) {
                    Iterator it3 = collectionValues.iterator();
                    while (it3.hasNext()) {
                        if (!m57898c(it3.next())) {
                            z12 = false;
                        }
                    }
                    z12 = true;
                } else {
                    z12 = true;
                }
                if (z12) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.Map] */
    /* JADX INFO: renamed from: d */
    public static final Map<String, Object> m57899d(Map<String, ? extends Object> map) {
        ?? arrayList;
        Object objM57899d;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(map.size()));
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            ?? value = entry.getValue();
            if (value instanceof Integer) {
                value = Long.valueOf(((Number) value).intValue());
            } else if (value instanceof Double) {
                Number number = (Number) value;
                if (number.doubleValue() % 1.0d == 0.0d) {
                    double dDoubleValue = number.doubleValue();
                    if (-9.223372036854776E18d <= dDoubleValue && dDoubleValue <= 9.223372036854776E18d) {
                        value = Long.valueOf((long) number.doubleValue());
                    }
                }
            } else {
                if (value instanceof Map) {
                    Map map2 = value != 0 ? (Map) value : null;
                    value = (map2 == null || (arrayList = m57899d(map2)) == 0) ? (Map) value : arrayList;
                } else if (value instanceof List) {
                    Iterable iterable = (Iterable) value;
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (next instanceof Integer) {
                            next = Long.valueOf(((Number) next).intValue());
                        } else if (next instanceof Double) {
                            Number number2 = (Number) next;
                            if (number2.doubleValue() % 1.0d == 0.0d) {
                                double dDoubleValue2 = number2.doubleValue();
                                if (-9.223372036854776E18d <= dDoubleValue2 && dDoubleValue2 <= 9.223372036854776E18d) {
                                    next = Long.valueOf((long) number2.doubleValue());
                                }
                            }
                        } else if (next instanceof Map) {
                            Map map3 = next != null ? (Map) next : null;
                            next = (map3 == null || (objM57899d = m57899d(map3)) == null) ? (Map) next : objM57899d;
                        }
                        arrayList.add(next);
                    }
                }
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }
}
