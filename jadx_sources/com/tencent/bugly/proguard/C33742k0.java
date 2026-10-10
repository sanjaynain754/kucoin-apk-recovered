package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.lang.reflect.Field;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k0 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33742k0 {

    /* JADX INFO: renamed from: a */
    public static final String f70463a = "RMonitor_ThreadSuspend";

    /* JADX INFO: renamed from: b */
    public static WeakHashMap<Thread, Long> f70464b = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    public static Object m73620a(Object obj, String str) {
        try {
            Field declaredField = Thread.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_ThreadSuspend", C33799mf.m74131a("getPrivateField ", th2));
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m73619a(Thread thread) {
        try {
            Long l11 = f70464b.get(thread);
            if (l11 != null && l11.intValue() != 0) {
                return l11.longValue();
            }
            Long l12 = (Long) m73620a(thread, "nativePeer");
            if (l12 == null) {
                return -1L;
            }
            f70464b.put(thread, l12);
            return l12.longValue();
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_ThreadSuspend", C33799mf.m74131a("getNativeThreadAddr ", th2));
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m73621a() {
        f70464b.clear();
    }
}
