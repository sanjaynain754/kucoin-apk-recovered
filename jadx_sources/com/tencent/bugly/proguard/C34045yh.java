package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.yh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34045yh {

    /* JADX INFO: renamed from: b */
    public static final String f72573b = "RMonitor_plugins";

    /* JADX INFO: renamed from: c */
    public static C34045yh f72574c;

    /* JADX INFO: renamed from: a */
    public final Set<String> f72575a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: a */
    public boolean m75542a(String str) {
        return this.f72575a.contains(str);
    }

    /* JADX INFO: renamed from: c */
    public static C34045yh m75539c() {
        if (f72574c == null) {
            synchronized (C34045yh.class) {
                try {
                    if (f72574c == null) {
                        f72574c = new C34045yh();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72574c;
    }

    /* JADX INFO: renamed from: a */
    public void m75541a(List<String> list, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            Logger.INSTANCE.mo77132i("RMonitor_plugins", String.format("trackExpectedPlugin, %s: %s, current: %s", z11 ? "append" : "remove", list, this.f72575a));
            if (z11) {
                this.f72575a.addAll(list);
            } else {
                this.f72575a.removeAll(list);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77130d("RMonitor_plugins", "trackExpectedPlugin error: " + th2.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public List<String> m75543b() {
        return new ArrayList(this.f72575a);
    }

    /* JADX INFO: renamed from: a */
    public void m75540a() {
        this.f72575a.clear();
        Logger.INSTANCE.mo77132i("RMonitor_plugins", "abolish");
    }
}
