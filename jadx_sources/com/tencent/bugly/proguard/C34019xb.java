package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.config.DefaultPluginConfig;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.xb */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34019xb {

    /* JADX INFO: renamed from: a */
    public static final float f72507a = 100.0f;

    /* JADX INFO: renamed from: a */
    public static DefaultPluginConfig m75453a() {
        return ConfigProxy.INSTANCE.getConfig().m77072c("java_memory_ceiling_hprof");
    }

    /* JADX INFO: renamed from: d */
    public static DefaultPluginConfig m75456d() {
        return ConfigProxy.INSTANCE.getConfig().m77072c("activity_leak");
    }

    /* JADX INFO: renamed from: b */
    public static float m75454b() {
        return m75455c().f70127l / 100.0f;
    }

    /* JADX INFO: renamed from: c */
    public static C33939tb m75455c() {
        return (C33939tb) m75453a().config;
    }

    /* JADX INFO: renamed from: e */
    public static C33607dc m75457e() {
        return (C33607dc) m75456d().config;
    }
}
