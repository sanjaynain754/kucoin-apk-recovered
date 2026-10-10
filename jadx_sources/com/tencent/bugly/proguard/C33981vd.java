package com.tencent.bugly.proguard;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.vd */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33981vd {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, C33631ef> f72361a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m75303a() {
        HashMap<String, C33631ef> map = f72361a;
        map.put("looper_metric", new C33631ef(InterfaceC33617e1.f69652a, "looper_metric", 16));
        map.put("looper_stack", new C33631ef(InterfaceC33617e1.f69652a, "looper_stack", 19));
        map.put("work_thread_lag", new C33631ef(InterfaceC33617e1.f69652a, "work_thread_lag", 29));
        map.put("java_memory_ceiling_hprof", new C33631ef(InterfaceC33617e1.f69653b, "java_memory_ceiling_hprof", 50));
        map.put("activity_leak", new C33631ef(InterfaceC33617e1.f69653b, "activity_leak", 47));
        map.put("big_bitmap", new C33631ef(InterfaceC33617e1.f69653b, "big_bitmap", 38));
        map.put("fd_leak", new C33631ef(InterfaceC33617e1.f69653b, "fd_leak", 28));
        map.put("native_memory", new C33631ef(InterfaceC33617e1.f69653b, "native_memory", 36));
        map.put("asan", new C33631ef(InterfaceC33617e1.f69653b, "asan", 53));
        map.put("page_launch", new C33631ef(InterfaceC33617e1.f69659h, "page_launch", 45));
        map.put("launch_metric", new C33631ef(InterfaceC33617e1.f69659h, "launch_metric", -1));
        map.put("memory_quantile", new C33631ef(InterfaceC33617e1.f69654c, "memory_quantile", -1));
        map.put("io", new C33631ef("io", "io", -1));
        map.put("db", new C33631ef("db", "db", -1));
        map.put("device", new C33631ef("device", "device", -1));
        map.put("battery", new C33631ef("battery", "battery", -1));
        map.put("traffic", new C33631ef(InterfaceC33617e1.f69660i, "traffic", 42));
        map.put("traffic_detail", new C33631ef(InterfaceC33617e1.f69660i, "traffic_detail", 52));
        map.put("net_quality", new C33631ef(InterfaceC33617e1.f69660i, "net_quality", 46));
        map.put("battery_metric", new C33631ef(InterfaceC33617e1.f69660i, "battery_metric", 22));
        map.put("battery_element", new C33631ef(InterfaceC33617e1.f69660i, "battery_element", 26));
        map.put("battery_ele_metric", new C33631ef(InterfaceC33617e1.f69660i, "battery_ele_metric", 43));
        map.put("custom_event", new C33631ef(InterfaceC33617e1.f69654c, "custom_event", -1));
    }

    /* JADX INFO: renamed from: a */
    public static C33631ef m75302a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            HashMap<String, C33631ef> map = f72361a;
            if (map.isEmpty()) {
                m75303a();
            }
            C33631ef c33631ef = map.get(str);
            if (c33631ef != null) {
                return c33631ef;
            }
            return null;
        } catch (Throwable unused) {
        }
    }
}
