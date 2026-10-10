package com.tencent.bugly.proguard;

import android.os.Debug;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.j7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33728j7 {

    /* JADX INFO: renamed from: a */
    public static final String f70347a = "Bugly_GcGuard";

    /* JADX INFO: renamed from: b */
    public static final long f70348b = -1000;

    /* JADX INFO: renamed from: c */
    public static final long f70349c = -2000;

    /* JADX INFO: renamed from: a */
    public static long m73530a() {
        try {
            if (AndroidVersion.isOverM()) {
                long j11 = Long.parseLong(Debug.getRuntimeStat("art.gc.gc-count"));
                if (j11 >= 0) {
                    return j11;
                }
            }
            return f70349c;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70347a, th2);
            return -1000L;
        }
    }
}
