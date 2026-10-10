package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes23.dex */
class ArraySetJvmUtil {
    public static <T> T[] resizeForToArray(T[] tArr, int i11) {
        if (tArr.length < i11) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i11));
        }
        if (tArr.length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    private ArraySetJvmUtil() {
    }
}
