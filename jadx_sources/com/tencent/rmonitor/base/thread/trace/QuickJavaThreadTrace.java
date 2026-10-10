package com.tencent.rmonitor.base.thread.trace;

import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33742k0;
import com.tencent.bugly.proguard.C33799mf;
import com.tencent.bugly.proguard.C34002we;
import com.tencent.bugly.proguard.C34024xg;
import com.tencent.bugly.proguard.C34044yg;
import com.tencent.bugly.proguard.RunnableC33958ua;
import com.tencent.rmonitor.base.thread.suspend.ThreadSuspend;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class QuickJavaThreadTrace {

    /* JADX INFO: renamed from: g */
    public static final String f75219g = "RMonitor_ThreadTrace";

    /* JADX INFO: renamed from: h */
    public static boolean f75220h;

    /* JADX INFO: renamed from: a */
    public boolean f75221a;

    /* JADX INFO: renamed from: b */
    public int f75222b = 0;

    /* JADX INFO: renamed from: c */
    public int f75223c = 0;

    /* JADX INFO: renamed from: d */
    public Thread f75224d;

    /* JADX INFO: renamed from: e */
    public long f75225e;

    /* JADX INFO: renamed from: f */
    public boolean f75226f;

    /* JADX INFO: renamed from: com.tencent.rmonitor.base.thread.trace.QuickJavaThreadTrace$a */
    /* JADX INFO: compiled from: BUGLY */
    public class RunnableC35149a implements Runnable {
        public RunnableC35149a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            QuickJavaThreadTrace quickJavaThreadTrace = QuickJavaThreadTrace.this;
            long j11 = quickJavaThreadTrace.f75225e;
            long jM73619a = C33742k0.m73619a(Thread.currentThread());
            QuickJavaThreadTrace quickJavaThreadTrace2 = QuickJavaThreadTrace.this;
            quickJavaThreadTrace.nativePrepare(j11, jM73619a, false, quickJavaThreadTrace2.f75222b, quickJavaThreadTrace2.f75223c);
        }
    }

    public static native int nativeInit(int i11);

    public native long nativeCreate(long j11, long j12, boolean z11, boolean z12);

    public native void nativeDestroy(long j11);

    public native String nativeGetStackTrace(long j11, long j12, long j13);

    public native void nativePrepare(long j11, long j12, boolean z11, int i11, int i12);

    public native void nativeStart(long j11);

    public native void nativeStop(long j11);

    static {
        try {
            if (AndroidVersion.isOverM()) {
                System.loadLibrary("rmonitor_base");
                int iNativeInit = nativeInit(C33714ie.m73408k().mo73415c());
                if (iNativeInit == 0) {
                    f75220h = true;
                    Logger.INSTANCE.mo77130d(f75219g, "init success");
                } else {
                    Logger.INSTANCE.mo77131e(f75219g, "init error, initResult = " + iNativeInit);
                }
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e(f75219g, C33799mf.m74131a("init failed: ", th2));
        }
    }

    public QuickJavaThreadTrace(Thread thread, boolean z11, boolean z12) {
        this.f75221a = false;
        this.f75224d = null;
        this.f75225e = 0L;
        this.f75226f = false;
        if (f75220h && thread != null && thread.isAlive()) {
            try {
                long jM77110a = ThreadSuspend.m77109c().m77110a(thread);
                if (0 == jM77110a) {
                    this.f75226f = false;
                    Logger.INSTANCE.mo77131e(f75219g, "NativeGetThreadID error");
                    C34002we.m75380b();
                    return;
                }
                long jNativeCreate = nativeCreate(C33742k0.m73619a(thread), jM77110a, z11, z12);
                this.f75225e = jNativeCreate;
                if (jNativeCreate != 0) {
                    this.f75224d = thread;
                    this.f75221a = z11;
                    this.f75226f = true;
                } else {
                    this.f75224d = null;
                    this.f75221a = false;
                    this.f75226f = false;
                    C34002we.m75375a();
                }
            } catch (Throwable th2) {
                this.f75226f = false;
                Logger.INSTANCE.mo77131e(f75219g, C33799mf.m74131a("nativeCreate faild: ", th2));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static boolean m77120c() {
        return f75220h;
    }

    /* JADX INFO: renamed from: a */
    public boolean m77123a(int i11, int i12) {
        Thread thread;
        if (!this.f75226f || (thread = this.f75224d) == null || !thread.isAlive()) {
            return false;
        }
        this.f75222b = i11;
        this.f75223c = i12;
        Thread thread2 = new Thread(new RunnableC35149a());
        thread2.setName("QST-" + this.f75224d.getName());
        thread2.start();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public boolean m77124b() {
        Thread thread;
        return this.f75226f && (thread = this.f75224d) != null && thread.isAlive();
    }

    /* JADX INFO: renamed from: d */
    public boolean m77125d() {
        Thread thread;
        if (!this.f75226f || (thread = this.f75224d) == null || !thread.isAlive()) {
            return false;
        }
        nativeStart(this.f75225e);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m77126e() {
        Thread thread;
        if (!this.f75226f || (thread = this.f75224d) == null || !thread.isAlive()) {
            return false;
        }
        nativeStop(this.f75225e);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<C34024xg> m77121a(long j11, long j12) {
        Thread thread;
        if (!this.f75226f || (thread = this.f75224d) == null || !thread.isAlive()) {
            return null;
        }
        String strNativeGetStackTrace = nativeGetStackTrace(this.f75225e, j11, j12);
        ArrayList<C34024xg> arrayListM75538a = C34044yg.m75538a(strNativeGetStackTrace);
        Collections.sort(arrayListM75538a);
        if (this.f75221a) {
            strNativeGetStackTrace.substring(strNativeGetStackTrace.lastIndexOf(RunnableC33958ua.f72251f) + 1);
        }
        return arrayListM75538a;
    }

    /* JADX INFO: renamed from: a */
    public void m77122a() {
        Thread thread;
        if (this.f75226f && (thread = this.f75224d) != null && thread.isAlive()) {
            this.f75226f = false;
            nativeDestroy(this.f75225e);
        }
    }
}
