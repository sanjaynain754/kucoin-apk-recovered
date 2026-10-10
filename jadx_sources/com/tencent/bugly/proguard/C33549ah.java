package com.tencent.bugly.proguard;

import android.os.Looper;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ah */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33549ah {
    /* JADX INFO: renamed from: a */
    public static boolean m72370a() {
        return m72371a(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public static boolean m72371a(Looper looper) {
        return looper != null && Thread.currentThread() == looper.getThread();
    }
}
