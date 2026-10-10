package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.common.utils.HprofFileIUtil;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.fa */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33647fa implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: i */
    public static final int f69873i = 10;

    /* JADX INFO: renamed from: j */
    public static String f69874j;

    /* JADX INFO: renamed from: k */
    public static final Object f69875k = new Object();

    /* JADX INFO: renamed from: a */
    public final Context f69876a;

    /* JADX INFO: renamed from: b */
    public final C33724j3 f69877b;

    /* JADX INFO: renamed from: c */
    public final C33863pg f69878c;

    /* JADX INFO: renamed from: d */
    public final C33765l2 f69879d;

    /* JADX INFO: renamed from: e */
    public Thread.UncaughtExceptionHandler f69880e;

    /* JADX INFO: renamed from: f */
    public Thread.UncaughtExceptionHandler f69881f;

    /* JADX INFO: renamed from: g */
    public boolean f69882g = false;

    /* JADX INFO: renamed from: h */
    public int f69883h;

    /* JADX INFO: renamed from: a */
    public final boolean m73034a(Throwable th2) {
        try {
            AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a("crash");
            if (!(abstractC34022xeM77083a instanceof C33640f3)) {
                return false;
            }
            C33640f3 c33640f3 = (C33640f3) abstractC34022xeM77083a;
            if (c33640f3.m72997g() && c33640f3.m72990a(th2.getClass().getName(), m73021b(th2, C33745k3.f70490B))) {
                C34012x4.m75442d("Crash in white list: %s", th2.getClass().getName());
                return true;
            }
        } catch (Throwable th3) {
            C34012x4.m75437b("check crash white list error %s", th3.toString());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m73035b() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().equals(getClass().getName())) {
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m73039c() {
        if (this.f69883h >= 10) {
            C34012x4.m75442d("java crash handler over %d, no need set.", 10);
            return;
        }
        this.f69882g = true;
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            if (getClass().getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                return;
            }
            if ("com.android.internal.os.RuntimeInit$UncaughtHandler".equals(defaultUncaughtExceptionHandler.getClass().getName())) {
                C34012x4.m75442d("backup system java handler: %s", defaultUncaughtExceptionHandler.toString());
                this.f69881f = defaultUncaughtExceptionHandler;
            } else {
                C34012x4.m75442d("backup java handler: %s", defaultUncaughtExceptionHandler.toString());
            }
            this.f69880e = defaultUncaughtExceptionHandler;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.f69883h++;
        C34012x4.m75442d("registered java monitor: %s", toString());
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m73040d() {
        this.f69882g = false;
        C34012x4.m75442d("close java monitor!", new Object[0]);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null && getClass().getName().equals(defaultUncaughtExceptionHandler.getClass().getName())) {
            C34012x4.m75431a(LogState.INFO, "Java monitor to unregister: %s", toString());
            Thread.setDefaultUncaughtExceptionHandler(this.f69880e);
            this.f69883h--;
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        synchronized (f69875k) {
            m73030a(thread, th2, true, (String) null, (byte[]) null, this.f69879d.m73840M());
        }
    }

    public C33647fa(Context context, C33724j3 c33724j3, C33863pg c33863pg, C33765l2 c33765l2) {
        this.f69876a = context;
        this.f69877b = c33724j3;
        this.f69878c = c33863pg;
        this.f69879d = c33765l2;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m73036b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f69880e = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: b */
    public final void m73038b(Throwable th2) {
        NativeCrashHandler.getInstance().saveAdditionalAttachmentPaths("crash");
    }

    /* JADX INFO: Infinite loop detected, blocks: 12, insns: 0 */
    /* JADX INFO: renamed from: b */
    public final void m73037b(Thread thread, Throwable th2) {
        while (true) {
            try {
                C34012x4.m75442d("tryRestoreFromException: %s", th2.getClass().getName());
                Looper.loop();
            } catch (Throwable th3) {
                if (!m73034a(th3)) {
                    C34012x4.m75442d("%s is not in white list, exit process", th3.getClass().getName());
                    m73030a(thread, th3, true, (String) null, (byte[]) null, this.f69879d.m73840M());
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m73021b(Throwable th2, int i11) {
        if (th2 == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            if (th2.getStackTrace() != null) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (i11 > 0 && sb2.length() >= i11) {
                        sb2.append("\n[Stack over limit size :" + i11 + " , has been cutted !]");
                        return sb2.toString();
                    }
                    sb2.append(stackTraceElement.toString());
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
        } catch (Throwable th3) {
            C34012x4.m75437b("gen stack error %s", th3.toString());
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public synchronized Thread.UncaughtExceptionHandler m73024a() {
        return this.f69880e;
    }

    /* JADX INFO: renamed from: a */
    public void m73029a(Thread thread, Throwable th2) {
        C34012x4.m75437b("current process die", new Object[0]);
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m73031a(Throwable th2, boolean z11, final CountDownLatch countDownLatch) {
        if (th2.getClass().getName().equals(OutOfMemoryError.class.getName()) && z11) {
            AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33786m2.f70892t);
            if ((abstractC34022xeM77083a instanceof C33786m2) && ((C33786m2) abstractC34022xeM77083a).m74024g()) {
                if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
                    C33784m0.m74004c().m74006a(new Runnable() { // from class: com.tencent.bugly.proguard.cj
                        @Override // java.lang.Runnable
                        public final void run() {
                            C33647fa.m73020a(countDownLatch);
                        }
                    });
                    return;
                } else {
                    HprofFileIUtil.dumpOOMHprof();
                    countDownLatch.countDown();
                    return;
                }
            }
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m73020a(CountDownLatch countDownLatch) {
        HprofFileIUtil.dumpOOMHprof();
        countDownLatch.countDown();
    }

    /* JADX INFO: renamed from: a */
    public CrashDetailBean m73022a(Thread thread, Throwable th2, boolean z11, String str, byte[] bArr, CountDownLatch countDownLatch) {
        if (th2 == null) {
            C34012x4.m75444f("We can do nothing with a null throwable.", new Object[0]);
            C33922se.m74981a().m74985a(C33922se.c.node_1.ordinal(), true, z11);
            return null;
        }
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        String strM73023a = m73023a(crashDetailBean, th2, thread, z11);
        this.f69877b.m73518i(crashDetailBean);
        C33922se.m74981a().m74985a(C33922se.c.node_2.ordinal(), true, z11);
        m73031a(th2, z11, countDownLatch);
        m73026a(crashDetailBean, strM73023a);
        List<String> list = crashDetailBean.f68657p;
        if (list != null && !list.isEmpty()) {
            C33922se.m74981a().m74983a(C33922se.b.martianLog.ordinal(), z11);
        }
        C33922se.m74981a().m74985a(C33922se.c.node_3.ordinal(), false, z11);
        m73027a(crashDetailBean, z11);
        C33922se.m74981a().m74985a(C33922se.c.node_4.ordinal(), false, z11);
        m73028a(crashDetailBean, z11, str, bArr);
        this.f69877b.m73518i(crashDetailBean);
        C33922se.m74981a().m74985a(C33922se.c.node_5.ordinal(), true, z11);
        byte[] bArrM72943b = C33627eb.m72943b();
        crashDetailBean.f68609H = bArrM72943b;
        C34012x4.m75442d("user log size:%d", Integer.valueOf(bArrM72943b != null ? bArrM72943b.length : 0));
        return crashDetailBean;
    }

    /* JADX INFO: renamed from: a */
    public final void m73027a(CrashDetailBean crashDetailBean, boolean z11) {
        crashDetailBean.f68613L = C33830o4.m74406i();
        crashDetailBean.f68614M = C33830o4.m74408k();
        crashDetailBean.f68615N = C33830o4.m74400e();
        crashDetailBean.f68616O = this.f69879d.m73830C();
        crashDetailBean.f68617P = this.f69879d.m73831D();
        crashDetailBean.f68618Q = this.f69879d.m73832E();
        if (!z11 && this.f69879d.m73863c() >= 31) {
            crashDetailBean.f68619R = 0L;
        } else {
            crashDetailBean.f68619R = C33830o4.m74395b(this.f69876a);
        }
        crashDetailBean.f68620S = C33830o4.m74412o();
        crashDetailBean.f68621T = C33830o4.m74402f();
        crashDetailBean.f68622U = Runtime.getRuntime().maxMemory();
        crashDetailBean.f68623V = Runtime.getRuntime().totalMemory();
    }

    /* JADX INFO: renamed from: a */
    public final void m73026a(CrashDetailBean crashDetailBean, String str) {
        crashDetailBean.f68665v = this.f69879d.m73833F();
        crashDetailBean.f68643i = this.f69879d.m73890n();
        crashDetailBean.f68645j = this.f69879d.m73892o();
        C33765l2 c33765l2 = this.f69879d;
        crashDetailBean.f68649l = c33765l2.f70714F;
        crashDetailBean.f68647k = c33765l2.f70755k;
        crashDetailBean.f68651m = c33765l2.f70748g0;
        crashDetailBean.f68653n = c33765l2.m73868d();
        crashDetailBean.f68657p = LifecycleCallback.INSTANCE.getOperationLogString();
        C33765l2 c33765l3 = this.f69879d;
        crashDetailBean.f68641h = c33765l3.f70752i0;
        crashDetailBean.f68655o = c33765l3.m73882j();
        crashDetailBean.f68624W = this.f69879d.m73900x();
        crashDetailBean.f68659q = this.f69879d.m73898v();
        crashDetailBean.f68661r = this.f69879d.m73897u();
        C33765l2 c33765l4 = this.f69879d;
        crashDetailBean.f68630b0 = c33765l4.f70739c;
        crashDetailBean.f68632c0 = c33765l4.m73838K();
        crashDetailBean.f68605D = C33571bi.m72614c(crashDetailBean.f68669z.getBytes());
        HashMap map = new HashMap();
        crashDetailBean.f68610I = map;
        map.put(crashDetailBean.f68612K, str);
        crashDetailBean.f68652m0 = C33955u7.m75163c().m75164a();
        crashDetailBean.f68654n0 = C33955u7.m75163c().m75167b();
    }

    /* JADX INFO: renamed from: a */
    public final String m73023a(CrashDetailBean crashDetailBean, Throwable th2, Thread thread, boolean z11) {
        String str;
        crashDetailBean.f68602A = System.currentTimeMillis();
        crashDetailBean.f68631c = z11 ? 0 : 2;
        crashDetailBean.f68611J = this.f69879d.f70745f;
        crashDetailBean.f68612K = thread.getName() + "(" + thread.getId() + ")";
        String name = th2.getClass().getName();
        String strM73019a = m73019a(th2, 1000);
        C34012x4.m75437b("stack frame :%d, has cause %b", Integer.valueOf(th2.getStackTrace().length), Boolean.valueOf(th2.getCause() != null));
        String string = th2.getStackTrace().length > 0 ? th2.getStackTrace()[0].toString() : "";
        Throwable cause = th2;
        while (cause != null && cause.getCause() != null) {
            cause = cause.getCause();
        }
        if (cause != null && cause != th2) {
            crashDetailBean.f68666w = cause.getClass().getName();
            crashDetailBean.f68667x = m73019a(cause, 1000);
            if (cause.getStackTrace().length > 0) {
                crashDetailBean.f68668y = cause.getStackTrace()[0].toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(name);
            sb2.append(C33844oi.f71346o);
            sb2.append(strM73019a);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append(m73021b(th2, C33745k3.f70490B));
            sb2.append("\nCaused by:\n");
            sb2.append(crashDetailBean.f68666w);
            sb2.append(C33844oi.f71346o);
            sb2.append(crashDetailBean.f68667x);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            String strM73021b = m73021b(cause, C33745k3.f70490B);
            sb2.append(strM73021b);
            crashDetailBean.f68669z = sb2.toString();
            return strM73021b;
        }
        crashDetailBean.f68666w = name;
        if (C33745k3.m73653l().m73684p() && z11) {
            C34012x4.m75431a(LogState.ERROR, "This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful!", new Object[0]);
            str = " This Crash Caused By ANR , PLS To Fix ANR , This Trace May Be Not Useful![Bugly]";
        } else {
            str = "";
        }
        crashDetailBean.f68667x = strM73019a + "" + str;
        crashDetailBean.f68668y = string;
        String strM73021b2 = m73021b(th2, C33745k3.f70490B);
        crashDetailBean.f68669z = strM73021b2;
        return strM73021b2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    /* JADX WARN: Code duplicated, block: B:16:0x0019 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0006, B:12:0x0013, B:16:0x0019, B:18:0x0027, B:19:0x0029, B:21:0x0047, B:23:0x0055, B:24:0x005c), top: B:28:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0027 A[Catch: all -> 0x000e, TryCatch #0 {all -> 0x000e, blocks: (B:5:0x0006, B:12:0x0013, B:16:0x0019, B:18:0x0027, B:19:0x0029, B:21:0x0047, B:23:0x0055, B:24:0x005c), top: B:28:0x0006 }] */
    /* JADX INFO: renamed from: a */
    public final void m73028a(CrashDetailBean crashDetailBean, boolean z11, String str, byte[] bArr) {
        boolean z12;
        if (!z11) {
            boolean z13 = false;
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (bArr != null && bArr.length > 0) {
                        z13 = true;
                    }
                    if (z12) {
                        HashMap map = new HashMap(1);
                        crashDetailBean.f68634d0 = map;
                        map.put("UserData", str);
                    }
                    if (z13) {
                        crashDetailBean.f68646j0 = bArr;
                    }
                } catch (Throwable th2) {
                    C34012x4.m75437b("handle crash error %s", th2.toString());
                    return;
                }
            } else {
                z12 = false;
                if (bArr != null) {
                    z13 = true;
                }
                if (z12) {
                    HashMap map2 = new HashMap(1);
                    crashDetailBean.f68634d0 = map2;
                    map2.put("UserData", str);
                }
                if (z13) {
                    crashDetailBean.f68646j0 = bArr;
                }
            }
        }
        crashDetailBean.f68638f0 = this.f69879d.m73835H();
        crashDetailBean.f68640g0 = this.f69879d.m73828A();
        crashDetailBean.f68642h0 = this.f69879d.m73880i();
        if (NativeCrashHandler.getInstance() != null) {
            String crashThreadLocalValue = NativeCrashHandler.getInstance().getCrashThreadLocalValue();
            if (!TextUtils.isEmpty(crashThreadLocalValue)) {
                crashDetailBean.f68642h0.put(C33765l2.f70707J0, crashThreadLocalValue);
            }
        }
        crashDetailBean.f68644i0 = this.f69879d.m73878h();
        C33663g5.m73147b(crashDetailBean);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73033a(Thread thread) {
        synchronized (f69875k) {
            try {
                if (f69874j != null && thread.getName().equals(f69874j)) {
                    return true;
                }
                f69874j = thread.getName();
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:136:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:145:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x030b  */
    /* JADX WARN: Code duplicated, block: B:149:0x0323 A[Catch: all -> 0x0327, TRY_LEAVE, TryCatch #4 {all -> 0x0327, blocks: (B:147:0x031d, B:149:0x0323), top: B:183:0x031d }] */
    /* JADX WARN: Code duplicated, block: B:154:0x032b  */
    /* JADX WARN: Code duplicated, block: B:156:0x032f  */
    /* JADX WARN: Code duplicated, block: B:161:0x034b  */
    /* JADX WARN: Code duplicated, block: B:162:0x035d  */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public void m73030a(Thread thread, Throwable th2, boolean z11, String str, byte[] bArr, boolean z12) {
        C33647fa c33647fa;
        Thread thread2;
        String str2;
        boolean z13;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        String str3;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2;
        Throwable th3 = th2;
        if (z11 && m73034a(th3)) {
            C34012x4.m75442d("this crash is in white list, bugly will not handle it", new Object[0]);
            if (Looper.myLooper() != null) {
                m73037b(thread, th2);
            } else {
                C34012x4.m75431a(LogState.INFO, "this crash is in white list and not looper thread, just return", new Object[0]);
                return;
            }
        }
        if (z11) {
            C34012x4.m75437b("Java Crash Happen cause by %s(%d)", thread.getName(), Long.valueOf(thread.getId()));
            if (m73033a(thread)) {
                LogState logState = LogState.INFO;
                C34012x4.m75431a(logState, "this class has handled this exception", new Object[0]);
                if (this.f69881f != null) {
                    C34012x4.m75431a(logState, "call system handler", new Object[0]);
                    this.f69881f.uncaughtException(thread, th3);
                } else {
                    m73029a(thread, th2);
                }
            }
        } else {
            C34012x4.m75437b("Java Catch Happen", new Object[0]);
        }
        try {
            if (!this.f69882g) {
                C34012x4.m75434a("Java crash handler is disable. Just return.", new Object[0]);
                if (z11) {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f69880e;
                    if (uncaughtExceptionHandler3 != null && m73032a(uncaughtExceptionHandler3)) {
                        LogState logState2 = LogState.ERROR;
                        C34012x4.m75431a(logState2, "sys default last handle start!", new Object[0]);
                        this.f69880e.uncaughtException(thread, th3);
                        C34012x4.m75431a(logState2, "sys default last handle end!", new Object[0]);
                        return;
                    }
                    if (this.f69881f != null) {
                        LogState logState3 = LogState.ERROR;
                        C34012x4.m75431a(logState3, "system handle start!", new Object[0]);
                        this.f69881f.uncaughtException(thread, th3);
                        C34012x4.m75431a(logState3, "system handle end!", new Object[0]);
                        return;
                    }
                    LogState logState4 = LogState.ERROR;
                    C34012x4.m75431a(logState4, "crashreport last handle start!", new Object[0]);
                    m73029a(thread, th2);
                    C34012x4.m75431a(logState4, "crashreport last handle end!", new Object[0]);
                }
            } else {
                if (!this.f69878c.m74583d()) {
                    C34012x4.m75444f("no remote but still store!", new Object[0]);
                }
                if (!this.f69878c.m74582c().f68568d && this.f69878c.m74583d()) {
                    C34012x4.m75437b("crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                    C33724j3.m73469a(z11 ? "JAVA_CRASH" : "JAVA_CATCH", C33571bi.m72572a(), this.f69879d.f70745f, thread.getName(), C33571bi.m72605b(th3), null);
                    if (z11) {
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f69880e;
                        if (uncaughtExceptionHandler4 != null && m73032a(uncaughtExceptionHandler4)) {
                            LogState logState5 = LogState.ERROR;
                            C34012x4.m75431a(logState5, "sys default last handle start!", new Object[0]);
                            this.f69880e.uncaughtException(thread, th3);
                            C34012x4.m75431a(logState5, "sys default last handle end!", new Object[0]);
                            return;
                        }
                        if (this.f69881f != null) {
                            LogState logState6 = LogState.ERROR;
                            C34012x4.m75431a(logState6, "system handle start!", new Object[0]);
                            this.f69881f.uncaughtException(thread, th3);
                            C34012x4.m75431a(logState6, "system handle end!", new Object[0]);
                            return;
                        }
                        LogState logState7 = LogState.ERROR;
                        C34012x4.m75431a(logState7, "crashreport last handle start!", new Object[0]);
                        m73029a(thread, th2);
                        C34012x4.m75431a(logState7, "crashreport last handle end!", new Object[0]);
                    }
                } else {
                    C33922se.m74981a().m74984a(C33922se.c.crash.ordinal(), z11, th3);
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    CrashDetailBean crashDetailBeanM73022a = m73022a(thread, th3, z11, str, bArr, countDownLatch);
                    c33647fa = this;
                    if (crashDetailBeanM73022a == null) {
                        try {
                            C34012x4.m75437b("pkg crash data fail!", new Object[0]);
                            if (z11) {
                                Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = c33647fa.f69880e;
                                if (uncaughtExceptionHandler5 != null && c33647fa.m73032a(uncaughtExceptionHandler5)) {
                                    LogState logState8 = LogState.ERROR;
                                    C34012x4.m75431a(logState8, "sys default last handle start!", new Object[0]);
                                    c33647fa.f69880e.uncaughtException(thread, th3);
                                    C34012x4.m75431a(logState8, "sys default last handle end!", new Object[0]);
                                    return;
                                }
                                if (c33647fa.f69881f != null) {
                                    LogState logState9 = LogState.ERROR;
                                    C34012x4.m75431a(logState9, "system handle start!", new Object[0]);
                                    c33647fa.f69881f.uncaughtException(thread, th3);
                                    C34012x4.m75431a(logState9, "system handle end!", new Object[0]);
                                    return;
                                }
                                LogState logState10 = LogState.ERROR;
                                C34012x4.m75431a(logState10, "crashreport last handle start!", new Object[0]);
                                m73029a(thread, th2);
                                C34012x4.m75431a(logState10, "crashreport last handle end!", new Object[0]);
                                return;
                            }
                            return;
                        } catch (Throwable th4) {
                            th = th4;
                            th3 = th3;
                            str2 = "crashreport last handle end!";
                            z13 = z11;
                            thread2 = thread;
                        }
                    } else {
                        try {
                            try {
                                crashDetailBeanM73022a.f68610I.putAll(C33571bi.m72588a(z12, C33745k3.f70490B, true, false));
                                if (z11 && Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
                                    crashDetailBeanM73022a.f68648k0 = C33571bi.m72575a(c33647fa.f69876a, NativeCrashHandler.getInstance());
                                }
                                String str4 = crashDetailBeanM73022a.f68648k0;
                                if (str4 != null && str4.length() >= 50) {
                                    C33922se.m74981a().m74983a(C33922se.b.crashInfos.ordinal(), z11);
                                }
                                try {
                                    thread2 = thread;
                                    str3 = "crashreport last handle end!";
                                    z13 = z11;
                                    try {
                                        C33724j3.m73469a(z11 ? "JAVA_CRASH" : "JAVA_CATCH", C33571bi.m72573a(System.currentTimeMillis()), c33647fa.f69879d.f70745f, thread.getName(), C33571bi.m72605b(th3), crashDetailBeanM73022a);
                                        C33922se.m74981a().m74985a(C33922se.c.node_6.ordinal(), false, z13);
                                        if (crashDetailBeanM73022a.f68666w.equals(OutOfMemoryError.class.getName())) {
                                            NativeCrashHandler.getInstance().getNativeProcessInfo("crash");
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        try {
                                            C34012x4.m75435a(th);
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th3 = th2;
                                            str2 = str3;
                                            if (!C34012x4.m75438b(th)) {
                                                th.printStackTrace();
                                            }
                                            if (z13) {
                                                uncaughtExceptionHandler = c33647fa.f69880e;
                                                if (uncaughtExceptionHandler == null) {
                                                }
                                                if (c33647fa.f69881f != null) {
                                                    LogState logState11 = LogState.ERROR;
                                                    C34012x4.m75431a(logState11, "system handle start!", new Object[0]);
                                                    c33647fa.f69881f.uncaughtException(thread2, th3);
                                                    C34012x4.m75431a(logState11, "system handle end!", new Object[0]);
                                                    return;
                                                }
                                                LogState logState12 = LogState.ERROR;
                                                C34012x4.m75431a(logState12, "crashreport last handle start!", new Object[0]);
                                                m73029a(thread, th2);
                                                C34012x4.m75431a(logState12, str2, new Object[0]);
                                            }
                                        }
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    thread2 = thread;
                                    str3 = "crashreport last handle end!";
                                    z13 = z11;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                thread2 = thread;
                                str3 = "crashreport last handle end!";
                                z13 = z11;
                                C34012x4.m75435a(th);
                                if (!c33647fa.f69877b.m73502a(crashDetailBeanM73022a, z13)) {
                                    c33647fa.f69877b.m73497a(crashDetailBeanM73022a, 3000L, z13);
                                }
                                if (z13) {
                                    th3 = th2;
                                    try {
                                        c33647fa.m73038b(th3);
                                        try {
                                            countDownLatch.await();
                                        } catch (Throwable th9) {
                                            C34012x4.m75435a(th9);
                                        }
                                        c33647fa.f69877b.m73516g(crashDetailBeanM73022a);
                                    } catch (Throwable th10) {
                                        th = th10;
                                        str2 = str3;
                                        if (!C34012x4.m75438b(th)) {
                                            th.printStackTrace();
                                        }
                                        if (z13) {
                                            uncaughtExceptionHandler = c33647fa.f69880e;
                                            if (uncaughtExceptionHandler == null) {
                                            }
                                            if (c33647fa.f69881f != null) {
                                                LogState logState13 = LogState.ERROR;
                                                C34012x4.m75431a(logState13, "system handle start!", new Object[0]);
                                                c33647fa.f69881f.uncaughtException(thread2, th3);
                                                C34012x4.m75431a(logState13, "system handle end!", new Object[0]);
                                                return;
                                            }
                                            LogState logState14 = LogState.ERROR;
                                            C34012x4.m75431a(logState14, "crashreport last handle start!", new Object[0]);
                                            m73029a(thread, th2);
                                            C34012x4.m75431a(logState14, str2, new Object[0]);
                                        }
                                    }
                                } else {
                                    th3 = th2;
                                }
                                if (z13) {
                                    uncaughtExceptionHandler2 = c33647fa.f69880e;
                                    if (uncaughtExceptionHandler2 == null) {
                                    }
                                    if (c33647fa.f69881f != null) {
                                        C34012x4.m75437b("system handle start!", new Object[0]);
                                        c33647fa.f69881f.uncaughtException(thread2, th3);
                                        C34012x4.m75431a(LogState.ERROR, "system handle end!", new Object[0]);
                                        return;
                                    } else {
                                        C34012x4.m75437b("crashreport last handle start!", new Object[0]);
                                        m73029a(thread, th2);
                                        C34012x4.m75431a(LogState.ERROR, str3, new Object[0]);
                                        return;
                                    }
                                }
                                return;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            thread2 = thread;
                        }
                        if (!c33647fa.f69877b.m73502a(crashDetailBeanM73022a, z13) && Thread.currentThread().getId() != Looper.getMainLooper().getThread().getId()) {
                            c33647fa.f69877b.m73497a(crashDetailBeanM73022a, 3000L, z13);
                        }
                        if (z13) {
                            th3 = th2;
                            c33647fa.m73038b(th3);
                            countDownLatch.await();
                            c33647fa.f69877b.m73516g(crashDetailBeanM73022a);
                        } else {
                            th3 = th2;
                        }
                        if (z13) {
                            uncaughtExceptionHandler2 = c33647fa.f69880e;
                            if (uncaughtExceptionHandler2 == null && c33647fa.m73032a(uncaughtExceptionHandler2)) {
                                C34012x4.m75437b("sys default last handle start!", new Object[0]);
                                c33647fa.f69880e.uncaughtException(thread2, th3);
                                C34012x4.m75431a(LogState.ERROR, "sys default last handle end!", new Object[0]);
                                return;
                            } else if (c33647fa.f69881f != null) {
                                C34012x4.m75437b("system handle start!", new Object[0]);
                                c33647fa.f69881f.uncaughtException(thread2, th3);
                                C34012x4.m75431a(LogState.ERROR, "system handle end!", new Object[0]);
                                return;
                            } else {
                                C34012x4.m75437b("crashreport last handle start!", new Object[0]);
                                m73029a(thread, th2);
                                C34012x4.m75431a(LogState.ERROR, str3, new Object[0]);
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        if (!C34012x4.m75438b(th)) {
                            th.printStackTrace();
                        }
                        if (z13) {
                            uncaughtExceptionHandler = c33647fa.f69880e;
                            if (uncaughtExceptionHandler == null && c33647fa.m73032a(uncaughtExceptionHandler)) {
                                LogState logState15 = LogState.ERROR;
                                C34012x4.m75431a(logState15, "sys default last handle start!", new Object[0]);
                                c33647fa.f69880e.uncaughtException(thread2, th3);
                                C34012x4.m75431a(logState15, "sys default last handle end!", new Object[0]);
                                return;
                            }
                            if (c33647fa.f69881f != null) {
                                LogState logState16 = LogState.ERROR;
                                C34012x4.m75431a(logState16, "system handle start!", new Object[0]);
                                c33647fa.f69881f.uncaughtException(thread2, th3);
                                C34012x4.m75431a(logState16, "system handle end!", new Object[0]);
                                return;
                            }
                            LogState logState17 = LogState.ERROR;
                            C34012x4.m75431a(logState17, "crashreport last handle start!", new Object[0]);
                            m73029a(thread, th2);
                            C34012x4.m75431a(logState17, str2, new Object[0]);
                        }
                    } catch (Throwable th12) {
                        if (z13) {
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = c33647fa.f69880e;
                            if (uncaughtExceptionHandler6 != null && c33647fa.m73032a(uncaughtExceptionHandler6)) {
                                C34012x4.m75437b("sys default last handle start!", new Object[0]);
                                c33647fa.f69880e.uncaughtException(thread2, th3);
                                C34012x4.m75431a(LogState.ERROR, "sys default last handle end!", new Object[0]);
                            } else if (c33647fa.f69881f != null) {
                                C34012x4.m75437b("system handle start!", new Object[0]);
                                c33647fa.f69881f.uncaughtException(thread2, th3);
                                C34012x4.m75431a(LogState.ERROR, "system handle end!", new Object[0]);
                            } else {
                                LogState logState18 = LogState.ERROR;
                                C34012x4.m75431a(logState18, "crashreport last handle start!", new Object[0]);
                                m73029a(thread, th2);
                                C34012x4.m75431a(logState18, str2, new Object[0]);
                            }
                        }
                        throw th12;
                    }
                }
            }
        } catch (Throwable th13) {
            th = th13;
            c33647fa = this;
            thread2 = thread;
            str2 = "crashreport last handle end!";
            z13 = z11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73032a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        if (uncaughtExceptionHandler == null) {
            return true;
        }
        String name = uncaughtExceptionHandler.getClass().getName();
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            String className = stackTraceElement.getClassName();
            String methodName = stackTraceElement.getMethodName();
            if (name.equals(className) && "uncaughtException".equals(methodName)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m73025a(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                boolean z11 = strategyBean.f68568d;
                if (z11 != this.f69882g) {
                    C34012x4.m75442d("java changed to %b", Boolean.valueOf(z11));
                    if (strategyBean.f68568d) {
                        m73039c();
                    } else {
                        m73040d();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m73019a(Throwable th2, int i11) {
        String message = th2.getMessage();
        if (message == null) {
            return "";
        }
        if (i11 < 0 || message.length() <= i11) {
            return message;
        }
        return message.substring(0, i11) + "\n[Message over limit size:" + i11 + ", has been cutted!]";
    }
}
