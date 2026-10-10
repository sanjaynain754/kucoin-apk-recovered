package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes45.dex */
public final class CompactStringObjectMap implements Serializable {

    /* JADX INFO: renamed from: b */
    public static final CompactStringObjectMap f10702b = new CompactStringObjectMap(1, 0, new Object[4]);
    private static final long serialVersionUID = 1;
    private final Object[] _hashArea;
    private final int _hashMask;
    private final int _spillCount;

    /* JADX INFO: renamed from: b */
    public static final int m11864b(int i11) {
        if (i11 <= 5) {
            return 8;
        }
        if (i11 <= 12) {
            return 16;
        }
        int i12 = 32;
        while (i12 < i11 + (i11 >> 2)) {
            i12 += i12;
        }
        return i12;
    }

    /* JADX INFO: renamed from: a */
    public final Object m11865a(String str, int i11, Object obj) {
        if (obj == null) {
            return null;
        }
        int i12 = this._hashMask + 1;
        int i13 = ((i11 >> 1) + i12) << 1;
        Object obj2 = this._hashArea[i13];
        if (str.equals(obj2)) {
            return this._hashArea[i13 + 1];
        }
        if (obj2 != null) {
            int i14 = (i12 + (i12 >> 1)) << 1;
            int i15 = this._spillCount + i14;
            while (i14 < i15) {
                Object obj3 = this._hashArea[i14];
                if (obj3 == str || str.equals(obj3)) {
                    return this._hashArea[i14 + 1];
                }
                i14 += 2;
            }
        }
        return null;
    }

    public Object findCaseInsensitive(String str) {
        int length = this._hashArea.length;
        for (int i11 = 0; i11 < length; i11 += 2) {
            Object obj = this._hashArea[i11];
            if (obj != null && ((String) obj).equalsIgnoreCase(str)) {
                return this._hashArea[i11 + 1];
            }
        }
        return null;
    }

    public List<String> keys() {
        int length = this._hashArea.length;
        ArrayList arrayList = new ArrayList(length >> 2);
        for (int i11 = 0; i11 < length; i11 += 2) {
            Object obj = this._hashArea[i11];
            if (obj != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public CompactStringObjectMap(int i11, int i12, Object[] objArr) {
        this._hashMask = i11;
        this._spillCount = i12;
        this._hashArea = objArr;
    }

    public static <T> CompactStringObjectMap construct(Map<String, T> map) {
        if (map.isEmpty()) {
            return f10702b;
        }
        int iM11864b = m11864b(map.size());
        int i11 = iM11864b - 1;
        int i12 = (iM11864b >> 1) + iM11864b;
        Object[] objArrCopyOf = new Object[i12 * 2];
        int i13 = 0;
        for (Map.Entry<String, T> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null) {
                int iHashCode = key.hashCode() & i11;
                int i14 = iHashCode + iHashCode;
                if (objArrCopyOf[i14] != null) {
                    i14 = ((iHashCode >> 1) + iM11864b) << 1;
                    if (objArrCopyOf[i14] != null) {
                        i14 = (i12 << 1) + i13;
                        i13 += 2;
                        if (i14 >= objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length + 4);
                        }
                    }
                }
                objArrCopyOf[i14] = key;
                objArrCopyOf[i14 + 1] = entry.getValue();
            }
        }
        return new CompactStringObjectMap(i11, i13, objArrCopyOf);
    }

    public Object find(String str) {
        int iHashCode = str.hashCode() & this._hashMask;
        int i11 = iHashCode << 1;
        Object obj = this._hashArea[i11];
        if (obj != str && !str.equals(obj)) {
            return m11865a(str, iHashCode, obj);
        }
        return this._hashArea[i11 + 1];
    }
}
