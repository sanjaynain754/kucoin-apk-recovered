package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.de */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33609de {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, Integer> f69574a;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.de$a */
    /* JADX INFO: compiled from: BUGLY */
    public interface a {

        /* JADX INFO: renamed from: a */
        public static final int f69575a = 0;

        /* JADX INFO: renamed from: b */
        public static final int f69576b = 1;

        /* JADX INFO: renamed from: c */
        public static final int f69577c = 2;

        /* JADX INFO: renamed from: d */
        public static final int f69578d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f69579e = 8;

        /* JADX INFO: renamed from: f */
        public static final int f69580f = 32;

        /* JADX INFO: renamed from: g */
        public static final int f69581g = 64;

        /* JADX INFO: renamed from: h */
        public static final int f69582h = 128;

        /* JADX INFO: renamed from: i */
        public static final int f69583i = 256;

        /* JADX INFO: renamed from: j */
        public static final int f69584j = 2048;

        /* JADX INFO: renamed from: k */
        public static final int f69585k = 65536;

        /* JADX INFO: renamed from: l */
        public static final int f69586l = 131072;

        /* JADX INFO: renamed from: m */
        public static final int f69587m = 1048576;

        /* JADX INFO: renamed from: n */
        public static final int f69588n = 2097152;

        /* JADX INFO: renamed from: o */
        public static final int f69589o = 4194304;

        /* JADX INFO: renamed from: p */
        public static final int f69590p = 8388608;

        /* JADX INFO: renamed from: q */
        public static final int f69591q = 16777216;
    }

    /* JADX INFO: renamed from: a */
    public static String m72855a(int i11) {
        for (Map.Entry<String, Integer> entry : f69574a.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i11) {
                return entry.getKey();
            }
        }
        return null;
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        f69574a = map;
        map.put("looper_stack", 4);
        map.put("looper_metric", 8);
        map.put("db", 2);
        map.put("io", 1);
        map.put("battery", 65536);
        map.put("device", 4194304);
        map.put("java_memory_ceiling_hprof", 128);
        map.put("memory_quantile", 256);
        map.put("sub_memory_quantile", 2048);
        map.put("big_bitmap", 131072);
        map.put("activity_leak", 64);
        map.put("fd_leak", 1048576);
        map.put("native_memory", 2097152);
        map.put("launch_metric", 0);
        map.put("work_thread_lag", 32);
        map.put("traffic", 8388608);
        map.put("traffic_detail", 16777216);
    }

    /* JADX INFO: renamed from: b */
    public static List<String> m72856b(int i11) {
        if (i11 == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : f69574a.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null && (value.intValue() & i11) != 0) {
                arrayList.add(key);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static int m72854a(String str) {
        Integer num;
        if (TextUtils.isEmpty(str) || (num = f69574a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
