package com.ishumei.smantifraud.l111l1111l1Il;

import android.os.Build;
import com.tencent.bugly.proguard.C33820nf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class l1111l111111Il<E> {
    private final Queue<C46975l1111l111111Il<E, Integer>> l1111l111111Il;
    private final int l111l11111lIl;

    public l1111l111111Il() {
    }

    public static HashMap<String, String> l111l11111lIl() {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put("board", Build.BOARD);
            map.put("model", Build.MODEL);
            map.put(C33820nf.f71125D, Build.BRAND);
            map.put("manufacturer", Build.MANUFACTURER);
            map.put("fingerprint", Build.FINGERPRINT);
            map.put("cpu_abi", Build.CPU_ABI);
            map.put("cpu_abi2", Build.CPU_ABI2);
            map.put("radioVersion", Build.getRadioVersion());
        } catch (Exception unused) {
        }
        return map;
    }

    public final synchronized int l1111l111111Il(int... iArr) {
        int i11;
        i11 = 0;
        for (C46975l1111l111111Il<E, Integer> c46975l1111l111111Il : this.l1111l111111Il) {
            for (int i12 = 0; i12 < 2; i12++) {
                if (c46975l1111l111111Il.l111l11111lIl.intValue() == iArr[i12]) {
                    i11++;
                }
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: com.ishumei.smantifraud.l111l1111l1Il.l1111l111111Il$l1111l111111Il, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes56.dex */
    public static class C46975l1111l111111Il<T1, T2> {
        public final T1 l1111l111111Il;
        public T2 l111l11111lIl;

        public C46975l1111l111111Il(T1 t11, T2 t12) {
            this.l1111l111111Il = t11;
            this.l111l11111lIl = t12;
        }
    }

    public l1111l111111Il(int i11) {
        this.l111l11111lIl = i11;
        this.l1111l111111Il = new LinkedList();
    }

    public final synchronized List<E> l1111l111111Il() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.l1111l111111Il.size() + 1);
        Iterator<C46975l1111l111111Il<E, Integer>> it = this.l1111l111111Il.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l1111l111111Il);
        }
        return arrayList;
    }

    public final synchronized List<E> l111l11111lIl(int... iArr) {
        ArrayList arrayList;
        arrayList = new ArrayList(this.l1111l111111Il.size() + 1);
        for (C46975l1111l111111Il<E, Integer> c46975l1111l111111Il : this.l1111l111111Il) {
            for (int i11 = 0; i11 < 2; i11++) {
                if (c46975l1111l111111Il.l111l11111lIl.intValue() == iArr[i11]) {
                    arrayList.add(c46975l1111l111111Il.l1111l111111Il);
                }
            }
        }
        return arrayList;
    }

    public final synchronized void l1111l111111Il(Set<E> set) {
        Iterator<C46975l1111l111111Il<E, Integer>> it = this.l1111l111111Il.iterator();
        while (it.hasNext()) {
            if (set.contains(it.next().l1111l111111Il)) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T2, java.lang.Integer] */
    public final synchronized void l1111l111111Il(Set<E> set, int i11) {
        for (C46975l1111l111111Il<E, Integer> c46975l1111l111111Il : this.l1111l111111Il) {
            if (set.contains(c46975l1111l111111Il.l1111l111111Il)) {
                c46975l1111l111111Il.l111l11111lIl = Integer.valueOf(i11);
            }
        }
    }

    public final synchronized boolean l1111l111111Il(E e11, int i11) {
        boolean zAdd;
        zAdd = this.l1111l111111Il.add(new C46975l1111l111111Il<>(e11, 0));
        while (this.l1111l111111Il.size() > this.l111l11111lIl) {
            this.l1111l111111Il.remove();
        }
        return zAdd;
    }
}
