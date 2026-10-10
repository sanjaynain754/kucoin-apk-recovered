package com.tencent.bugly.proguard;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.yd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Deprecated
public final class C34041yd {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, Integer> f72559a;

    static {
        HashMap<String, Integer> map = new HashMap<>();
        f72559a = map;
        map.put("looper_metric", 101);
        map.put("looper_stack", 102);
        map.put("work_thread_lag", 158);
    }

    /* JADX INFO: renamed from: a */
    public static String m75500a(int i11) {
        for (Map.Entry<String, Integer> entry : f72559a.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i11) {
                return entry.getKey();
            }
        }
        return null;
    }
}
