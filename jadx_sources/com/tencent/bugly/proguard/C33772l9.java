package com.tencent.bugly.proguard;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l9 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public final class C33772l9 {

    /* JADX INFO: renamed from: a */
    public static final String f70832a = "RMonitor_FdLeak_IOUtil";

    /* JADX INFO: renamed from: a */
    public static void m73938a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e11) {
                C33648fb.m73043b(f70832a, "close silently failed: " + e11.getMessage());
            }
        }
    }
}
