package com.tencent.bugly.common.heapdump;

import android.os.Process;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.C33714ie;
import com.tencent.bugly.proguard.C33742k0;
import com.tencent.bugly.proguard.C33895r7;
import com.tencent.bugly.proguard.C33952u4;
import com.tencent.bugly.proguard.InterfaceC33541a9;
import com.tencent.rmonitor.common.logger.Logger;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class ForkJvmHeapDumper extends StripHeapDumper {

    /* JADX INFO: renamed from: p */
    public static final String f68484p = "RMonitor_ForkDumper";

    /* JADX INFO: renamed from: q */
    public static final long f68485q = 60000;

    /* JADX INFO: renamed from: r */
    public static boolean f68486r;

    /* JADX INFO: renamed from: s */
    public static ArrayList<InterfaceC33541a9> f68487s = new ArrayList<>();

    /* JADX INFO: renamed from: t */
    public static final Object f68488t = new Object();

    /* JADX INFO: renamed from: com.tencent.bugly.common.heapdump.ForkJvmHeapDumper$a */
    /* JADX INFO: compiled from: BUGLY */
    public class RunnableC33506a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f68489b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f68490c;

        public RunnableC33506a(AtomicBoolean atomicBoolean, int i11) {
            this.f68489b = atomicBoolean;
            this.f68490c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.i(ForkJvmHeapDumper.f68484p, "wait sub process dump timeout.");
            this.f68489b.set(true);
            Process.killProcess(this.f68490c);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72141a(InterfaceC33541a9 interfaceC33541a9) {
        synchronized (f68488t) {
            try {
                if (!f68487s.contains(interfaceC33541a9)) {
                    f68487s.add(interfaceC33541a9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static native boolean nInitForkDump(int i11);

    private static native void nResumeVM(long j11);

    private static native int nSuspendVM(long j11, String str, int i11);

    private static native int nWaitProcessExit(int i11);

    /* JADX INFO: renamed from: c */
    public final int m72146c(String str, @NotNull C33895r7 c33895r7) {
        m72142a(true);
        int iNSuspendVM = nSuspendVM(C33742k0.m73619a(Thread.currentThread()), str, c33895r7.m74800c());
        if (iNSuspendVM != 0) {
            m72142a(false);
            nResumeVM(C33742k0.m73619a(Thread.currentThread()));
            Log.i(f68484p, "main process waiting dump result.");
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            RunnableC33506a runnableC33506a = new RunnableC33506a(atomicBoolean, iNSuspendVM);
            m72153b().postDelayed(runnableC33506a, 60000L);
            int iNWaitProcessExit = nWaitProcessExit(iNSuspendVM);
            m72153b().removeCallbacks(runnableC33506a);
            Log.i(f68484p, "main process wait result: " + iNWaitProcessExit);
            if (iNWaitProcessExit != 0) {
                int i11 = atomicBoolean.get() ? 106 : 105;
                m72149a(c33895r7, new RuntimeException());
                return i11;
            }
        }
        File file = new File(str);
        return (!file.exists() || file.length() <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) ? 108 : 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m72143b(InterfaceC33541a9 interfaceC33541a9) {
        synchronized (f68488t) {
            f68487s.remove(interfaceC33541a9);
        }
    }

    public ForkJvmHeapDumper() {
        if (C33952u4.m75157c() && StripHeapDumper.f68493m && !f68486r) {
            f68486r = nInitForkDump(C33714ie.m73408k().mo73415c());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m72142a(boolean z11) {
        synchronized (f68488t) {
            try {
                for (InterfaceC33541a9 interfaceC33541a9 : f68487s) {
                    if (z11) {
                        interfaceC33541a9.mo72322b();
                    } else {
                        interfaceC33541a9.mo72321a();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33625e9
    /* JADX INFO: renamed from: a */
    public int mo72144a(String str, @NotNull C33895r7 c33895r7) {
        Logger logger = Logger.INSTANCE;
        logger.mo77132i(f68484p, "dump ", str);
        if (!StripHeapDumper.f68493m) {
            logger.mo77131e(f68484p, "dump failed caused by so not loaded!");
            return 101;
        }
        if (!f68486r) {
            logger.mo77131e(f68484p, "dump failed caused by Symbol is not resolved!");
            return 102;
        }
        if (!C33952u4.m75156b()) {
            logger.mo77131e(f68484p, "dump failed caused by disk space not enough!");
            return 103;
        }
        if (!AndroidVersion.isOverL()) {
            logger.mo77131e(f68484p, "dump failed caused by version net permitted!");
            return 104;
        }
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        return m72146c(str, c33895r7);
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33625e9
    /* JADX INFO: renamed from: a */
    public boolean mo72145a() {
        return f68486r;
    }
}
