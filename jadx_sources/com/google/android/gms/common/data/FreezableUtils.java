package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import com.tencent.bugly.proguard.C33724j3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        C33724j3.c cVar = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            cVar.add(arrayList.get(i11).freeze());
        }
        return cVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        C33724j3.c cVar = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            cVar.add(it.next().freeze());
        }
        return cVar;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        C33724j3.c cVar = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e11 : eArr) {
            cVar.add(e11.freeze());
        }
        return cVar;
    }
}
