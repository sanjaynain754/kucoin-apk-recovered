package com.tencent.rmonitor.base.thread.suspend;

import com.facebook.soloader.MinElf;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33742k0;
import com.tencent.bugly.proguard.C33786m2;
import com.tencent.bugly.proguard.C33799mf;
import com.tencent.bugly.proguard.C33864ph;
import com.tencent.bugly.proguard.C33872q4;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class ThreadSuspend {

    /* JADX INFO: renamed from: d */
    public static final String f75213d = "RMonitor_ThreadSuspend";

    /* JADX INFO: renamed from: e */
    public static ThreadSuspend f75214e;

    /* JADX INFO: renamed from: f */
    public static boolean f75215f;

    /* JADX INFO: renamed from: b */
    public boolean f75217b;

    /* JADX INFO: renamed from: c */
    public boolean f75218c = false;

    /* JADX INFO: renamed from: a */
    public boolean f75216a = m77115d();

    /* JADX INFO: renamed from: a */
    public static boolean m77108a() {
        f75215f = true;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m77114b() {
        AbstractC34022xe abstractC34022xeM77083a;
        if (f75215f) {
            return false;
        }
        String strM74662a = C33872q4.m74662a(C33598d3.m72772c());
        if (strM74662a.contains(MinElf.ISA.X86) || strM74662a.contains(C33864ph.f71456b) || !AndroidVersion.isOverM() || (abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33786m2.f70892t)) == null || !(abstractC34022xeM77083a instanceof C33786m2)) {
            return false;
        }
        return ((C33786m2) abstractC34022xeM77083a).m74025h();
    }

    public native int nativeGetThreadId(long j11);

    public native boolean nativeHookStackTrace(boolean z11);

    public native int nativeInit(int i11);

    public native boolean nativeResumeThread(long j11);

    public native long nativeSuspendThread(int i11);

    /* JADX INFO: renamed from: c */
    public static ThreadSuspend m77109c() {
        if (f75214e == null) {
            synchronized (ThreadSuspend.class) {
                try {
                    if (f75214e == null) {
                        f75214e = new ThreadSuspend();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f75214e;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77111a(long j11) {
        if (!this.f75216a || this.f75218c || j11 == 0) {
            return false;
        }
        return nativeResumeThread(j11);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m77115d() {
        if (!m77114b()) {
            Logger.INSTANCE.mo77132i("RMonitor_ThreadSuspend", "enableThisTime return false");
            return false;
        }
        try {
            this.f75217b = false;
            System.loadLibrary("rmonitor_base");
            this.f75217b = true;
            int iNativeInit = nativeInit(C33714ie.m73408k().mo73415c());
            Logger.INSTANCE.mo77130d("RMonitor_ThreadSuspend", "nativeInit's result is " + iNativeInit);
            return iNativeInit == 0;
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_ThreadSuspend", C33799mf.m74131a("init failed: ", th2));
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m77116e() {
        return this.f75216a;
    }

    /* JADX INFO: renamed from: a */
    public int m77110a(Thread thread) {
        if (this.f75216a && thread != null && thread.isAlive()) {
            return nativeGetThreadId(C33742k0.m73619a(thread));
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77112a(boolean z11) {
        boolean zNativeHookStackTrace;
        try {
            if (AndroidVersion.isOverO()) {
                if (!this.f75217b) {
                    System.loadLibrary("rmonitor_base");
                    this.f75217b = true;
                }
                zNativeHookStackTrace = nativeHookStackTrace(z11);
            } else {
                zNativeHookStackTrace = false;
            }
            if (zNativeHookStackTrace) {
                this.f75218c = true;
            }
            Logger.INSTANCE.mo77132i("RMonitor_ThreadSuspend", "enableHookJavaStackTrace: " + zNativeHookStackTrace);
            return zNativeHookStackTrace;
        } catch (Throwable th2) {
            Logger.INSTANCE.exception("RMonitor_ThreadSuspend", th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public long m77113b(Thread thread) {
        Thread threadCurrentThread = Thread.currentThread();
        if (!this.f75216a || this.f75218c || thread == null || !thread.isAlive() || thread == threadCurrentThread) {
            return 0L;
        }
        long jM73619a = C33742k0.m73619a(thread);
        if (jM73619a == -1) {
            return 0L;
        }
        int iNativeGetThreadId = nativeGetThreadId(jM73619a);
        if (iNativeGetThreadId != 0) {
            return nativeSuspendThread(iNativeGetThreadId);
        }
        Logger.INSTANCE.mo77131e("RMonitor_ThreadSuspend", "thread id is not valid");
        return 0L;
    }
}
