package com.tencent.bugly.proguard;

import com.tencent.rmonitor.base.config.ConfigProxy;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.p1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33848p1 {

    /* JADX INFO: renamed from: a */
    public static final float f71357a = 1.5f;

    /* JADX INFO: renamed from: b */
    public static final float f71358b = 100.0f;

    /* JADX INFO: renamed from: a */
    public static float m74494a() {
        float f11 = ConfigProxy.INSTANCE.getConfig().m77072c("big_bitmap").config.f70127l / 100.0f;
        if (f11 < 1.5f) {
            return 1.5f;
        }
        return f11;
    }
}
