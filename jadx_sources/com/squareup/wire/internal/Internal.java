package com.squareup.wire.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes59.dex */
public final class Internal {
    public static void checkElementsNotNull(List<?> list) {
        if (list == null) {
            throw new NullPointerException("list == null");
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (list.get(i11) == null) {
                throw new NullPointerException("Element at index " + i11 + " is null");
            }
        }
    }

    public static <T> List<T> copyOf(String str, List<T> list) {
        if (list != null) {
            return (list == Collections.EMPTY_LIST || (list instanceof ImmutableList)) ? new MutableOnWriteList(list) : new ArrayList(list);
        }
        throw new NullPointerException(str + " == null");
    }

    public static int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    public static <T> List<T> immutableCopyOf(String str, List<T> list) {
        if (list == null) {
            throw new NullPointerException(str + " == null");
        }
        if (list instanceof MutableOnWriteList) {
            list = ((MutableOnWriteList) list).mutableList;
        }
        if (list == Collections.EMPTY_LIST || (list instanceof ImmutableList)) {
            return list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (!immutableList.contains(null)) {
            return immutableList;
        }
        throw new IllegalArgumentException(str + ".contains(null)");
    }

    public static <T> void redactElements(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            list.set(i11, protoAdapter.redact(list.get(i11)));
        }
    }

    public static int countNonNull(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 != null ? 1 : 0);
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static IllegalStateException missingRequiredFields(Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        int length = objArr.length;
        String str = "";
        for (int i11 = 0; i11 < length; i11 += 2) {
            if (objArr[i11] == null) {
                if (sb2.length() > 0) {
                    str = CmcdData.Factory.STREAMING_FORMAT_SS;
                }
                sb2.append("\n  ");
                sb2.append(objArr[i11 + 1]);
            }
        }
        throw new IllegalStateException("Required field" + str + " not set:" + ((Object) sb2));
    }

    public static <T> List<T> newMutableList() {
        return new MutableOnWriteList(Collections.EMPTY_LIST);
    }

    public static <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    private Internal() {
    }

    public static int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        int i11 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i11++;
        }
        if (obj3 != null) {
            i11++;
        }
        if (obj4 != null) {
            i11++;
        }
        for (Object obj5 : objArr) {
            if (obj5 != null) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void redactElements(Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        for (Map.Entry entry : map.entrySet()) {
            entry.setValue(protoAdapter.redact(entry.getValue()));
        }
    }

    public static void checkElementsNotNull(Map<?, ?> map) {
        if (map != null) {
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                if (entry.getKey() != null) {
                    if (entry.getValue() == null) {
                        throw new NullPointerException("Value for key " + entry.getKey() + " is null");
                    }
                } else {
                    throw new NullPointerException("map.containsKey(null)");
                }
            }
            return;
        }
        throw new NullPointerException("map == null");
    }

    public static <K, V> Map<K, V> copyOf(String str, Map<K, V> map) {
        if (map != null) {
            return new LinkedHashMap(map);
        }
        throw new NullPointerException(str + " == null");
    }

    public static <K, V> Map<K, V> immutableCopyOf(String str, Map<K, V> map) {
        if (map != null) {
            if (map.isEmpty()) {
                return Collections.EMPTY_MAP;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (!linkedHashMap.containsKey(null)) {
                if (!linkedHashMap.containsValue(null)) {
                    return Collections.unmodifiableMap(linkedHashMap);
                }
                throw new IllegalArgumentException(str + ".containsValue(null)");
            }
            throw new IllegalArgumentException(str + ".containsKey(null)");
        }
        throw new NullPointerException(str + " == null");
    }
}
