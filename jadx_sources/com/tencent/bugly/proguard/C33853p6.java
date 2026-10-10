package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.p6 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33853p6 {

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.p6$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Comparator<C33973v5> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C33973v5 c33973v5, C33973v5 c33973v6) {
            return c33973v6.m75286a() - c33973v5.m75286a();
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<C33973v5> m74505a(Map<String, Integer> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (String str : map.keySet()) {
                arrayList.add(new C33973v5(str, map.get(str).intValue()));
            }
            Collections.sort(arrayList, new a());
        }
        return arrayList;
    }
}
