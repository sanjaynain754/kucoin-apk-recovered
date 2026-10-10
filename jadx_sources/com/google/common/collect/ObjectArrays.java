package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class ObjectArrays {
    @CanIgnoreReturnValue
    public static Object[] checkElementsNotNull(Object... objArr) {
        checkElementsNotNull(objArr, objArr.length);
        return objArr;
    }

    @GwtIncompatible
    public static <T> T[] concat(T[] tArr, T[] tArr2, Class<T> cls) {
        T[] tArr3 = (T[]) newArray(cls, tArr.length + tArr2.length);
        System.arraycopy(tArr, 0, tArr3, 0, tArr.length);
        System.arraycopy(tArr2, 0, tArr3, tArr.length, tArr2.length);
        return tArr3;
    }

    @GwtIncompatible
    public static <T> T[] newArray(Class<T> cls, int i11) {
        return (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i11));
    }

    public static <T> T[] toArrayImpl(Collection<?> collection, T[] tArr) {
        int size = collection.size();
        if (tArr.length < size) {
            tArr = (T[]) newArray(tArr, size);
        }
        fillArray(collection, tArr);
        if (tArr.length > size) {
            tArr[size] = null;
        }
        return tArr;
    }

    @CanIgnoreReturnValue
    public static Object checkElementNotNull(Object obj, int i11) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i11);
    }

    @CanIgnoreReturnValue
    public static Object[] checkElementsNotNull(Object[] objArr, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            checkElementNotNull(objArr[i12], i12);
        }
        return objArr;
    }

    public static Object[] copyAsObjectArray(Object[] objArr, int i11, int i12) {
        Preconditions.checkPositionIndexes(i11, i11 + i12, objArr.length);
        if (i12 == 0) {
            return new Object[0];
        }
        Object[] objArr2 = new Object[i12];
        System.arraycopy(objArr, i11, objArr2, 0, i12);
        return objArr2;
    }

    public static <T> T[] newArray(T[] tArr, int i11) {
        return (T[]) Platform.newArray(tArr, i11);
    }

    public static void swap(Object[] objArr, int i11, int i12) {
        Object obj = objArr[i11];
        objArr[i11] = objArr[i12];
        objArr[i12] = obj;
    }

    private ObjectArrays() {
    }

    @CanIgnoreReturnValue
    private static Object[] fillArray(Iterable<?> iterable, Object[] objArr) {
        Iterator<?> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            objArr[i11] = it.next();
            i11++;
        }
        return objArr;
    }

    public static <T> T[] concat(@ParametricNullness T t11, T[] tArr) {
        T[] tArr2 = (T[]) newArray(tArr, tArr.length + 1);
        tArr2[0] = t11;
        System.arraycopy(tArr, 0, tArr2, 1, tArr.length);
        return tArr2;
    }

    public static <T> T[] concat(T[] tArr, @ParametricNullness T t11) {
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length + 1);
        tArr2[tArr.length] = t11;
        return tArr2;
    }

    public static <T> T[] toArrayImpl(Object[] objArr, int i11, int i12, T[] tArr) {
        Preconditions.checkPositionIndexes(i11, i11 + i12, objArr.length);
        if (tArr.length < i12) {
            tArr = (T[]) newArray(tArr, i12);
        } else if (tArr.length > i12) {
            tArr[i12] = null;
        }
        System.arraycopy(objArr, i11, tArr, 0, i12);
        return tArr;
    }

    public static Object[] toArrayImpl(Collection<?> collection) {
        return fillArray(collection, new Object[collection.size()]);
    }
}
