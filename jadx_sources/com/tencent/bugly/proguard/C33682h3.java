package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.base.config.C35101b;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.h3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33682h3 {

    /* JADX INFO: renamed from: a */
    public static final int f70055a = 1024000;

    /* JADX INFO: renamed from: b */
    public static final long f70056b = 10;

    /* JADX INFO: renamed from: a */
    public static void m73240a(Context context) {
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a("crash");
        if (abstractC34022xeM77083a instanceof C33640f3) {
            C33640f3 c33640f3 = (C33640f3) abstractC34022xeM77083a;
            int iM72995e = c33640f3.m72995e();
            if (iM72995e > 0 && iM72995e < 1024000) {
                C33745k3.f70517x = iM72995e;
            }
            long jM72994d = c33640f3.m72994d();
            if (jM72994d > 0 && jM72994d < 10) {
                C33745k3.f70499K = jM72994d;
            }
            C33765l2.m73825a(context).m73867c(c33640f3.m72996f());
            NativeCrashHandler.setCustomFileUploadAble(c33640f3.m72993c());
        }
    }
}
