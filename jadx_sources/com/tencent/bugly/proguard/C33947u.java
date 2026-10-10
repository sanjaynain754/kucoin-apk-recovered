package com.tencent.bugly.proguard;

import android.app.ActivityManager;
import android.content.Context;
import android.os.FileObserver;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.LogState;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.u */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33947u {

    /* JADX INFO: renamed from: A */
    public static final String f72127A = "/data/anr/";

    /* JADX INFO: renamed from: B */
    public static final String f72128B = "ANR_EXCEPTION";

    /* JADX INFO: renamed from: C */
    public static final int f72129C = 10000;

    /* JADX INFO: renamed from: D */
    public static final int f72130D = 100;

    /* JADX INFO: renamed from: E */
    public static C33947u f72131E = null;

    /* JADX INFO: renamed from: F */
    public static volatile String f72132F = null;

    /* JADX INFO: renamed from: G */
    public static volatile long f72133G = -1;

    /* JADX INFO: renamed from: r */
    public static final int f72134r = 101376;

    /* JADX INFO: renamed from: s */
    public static final String f72135s = "bugly";

    /* JADX INFO: renamed from: t */
    public static final String f72136t = "bugly_trace_";

    /* JADX INFO: renamed from: u */
    public static final String f72137u = "manual_bugly_trace_";

    /* JADX INFO: renamed from: v */
    public static final String f72138v = "main_stack_record_";

    /* JADX INFO: renamed from: w */
    public static final String f72139w = ".merged";

    /* JADX INFO: renamed from: x */
    public static final String f72140x = ".txt";

    /* JADX INFO: renamed from: y */
    public static final int f72141y = 10000;

    /* JADX INFO: renamed from: z */
    public static final long f72142z = 21000;

    /* JADX INFO: renamed from: b */
    public final Context f72144b;

    /* JADX INFO: renamed from: c */
    public final ActivityManager f72145c;

    /* JADX INFO: renamed from: d */
    public final C33765l2 f72146d;

    /* JADX INFO: renamed from: e */
    public final C33784m0 f72147e;

    /* JADX INFO: renamed from: f */
    public final C33863pg f72148f;

    /* JADX INFO: renamed from: g */
    public final C33724j3 f72149g;

    /* JADX INFO: renamed from: i */
    public String f72151i;

    /* JADX INFO: renamed from: j */
    public FileObserver f72152j;

    /* JADX INFO: renamed from: l */
    public C34004wg f72154l;

    /* JADX INFO: renamed from: m */
    public int f72155m;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f72143a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h */
    public final Object f72150h = new Object();

    /* JADX INFO: renamed from: k */
    public boolean f72153k = true;

    /* JADX INFO: renamed from: n */
    public long f72156n = 0;

    /* JADX INFO: renamed from: o */
    public String f72157o = "";

    /* JADX INFO: renamed from: p */
    public String f72158p = "";

    /* JADX INFO: renamed from: q */
    public long f72159q = -1;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.u$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends FileObserver {

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BUGLY */
        public class RunnableC46995a implements Runnable {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ String f72161b;

            public RunnableC46995a(String str) {
                this.f72161b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                C33947u.this.m75095d(this.f72161b);
            }
        }

        public a(String str, int i11) {
            super(str, i11);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i11, String str) {
            if (str == null) {
                return;
            }
            String strConcat = C33947u.f72127A.concat(str);
            C34012x4.m75444f("watching file %s", strConcat);
            if (strConcat.contains("trace")) {
                C33947u.this.f72147e.m74006a(new RunnableC46995a(strConcat));
            } else {
                C34012x4.m75431a(LogState.WARN, "not anr file %s", strConcat);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.u$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33947u.this.m75103i();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.u$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C33947u.this.f72146d.m73838K()) {
                C34012x4.m75434a("Found foreground anr, resend sigquit immediately.", new Object[0]);
                NativeCrashHandler.getInstance().resendSigquit();
                C33947u.this.m75092c((CrashDetailBean) null);
                C34012x4.m75431a(LogState.DEBUG, "Finish handling one anr.", new Object[0]);
                return;
            }
            C34012x4.m75434a("Found background anr, resend sigquit later.", new Object[0]);
            C33947u.this.m75092c((CrashDetailBean) null);
            C34012x4.m75431a(LogState.DEBUG, "Finish handling one anr, now resend sigquit.", new Object[0]);
            NativeCrashHandler.getInstance().resendSigquit();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.u$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d extends FileObserver {
        public d(String str, int i11) {
            super(str, i11);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i11, String str) {
            if (str == null) {
                return;
            }
            C34012x4.m75444f("observe file, dir:%s fileName:%s", C33947u.this.f72151i, str);
            if (!C33947u.m75074b(str)) {
                C34012x4.m75431a(LogState.DEBUG, "not manual trace file, ignore.", new Object[0]);
                return;
            }
            if (!C33947u.this.m75099e()) {
                C34012x4.m75431a(LogState.DEBUG, "proc is not in anr, just ignore", new Object[0]);
                return;
            }
            long jM72310a = C33539a7.m72310a(str, C33947u.f72137u, ".txt");
            C33947u.this.m75081a(jM72310a, C33947u.this.f72151i + "/" + str);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.u$e */
    /* JADX INFO: compiled from: BUGLY */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33947u.this.m75103i();
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m75099e() {
        return this.f72143a.get();
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m75100f() {
        return this.f72153k;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m75105k() {
        if (m75096d()) {
            C34012x4.m75444f("start when started!", new Object[0]);
            return;
        }
        if (TextUtils.isEmpty(this.f72151i)) {
            return;
        }
        m75104j();
        d dVar = new d(this.f72151i, 8);
        this.f72152j = dVar;
        try {
            dVar.startWatching();
            C34012x4.m75442d("startWatchingPrivateAnrDir! dumFilePath is %s", this.f72151i);
            this.f72147e.m74006a(new e());
        } catch (Throwable th2) {
            this.f72152j = null;
            C34012x4.m75444f("startWatchingPrivateAnrDir failed!", new Object[0]);
            if (!C34012x4.m75432a(LogState.WARN, th2)) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public synchronized void m75106l() {
        if (m75096d()) {
            C34012x4.m75444f("start when started!", new Object[0]);
            return;
        }
        a aVar = new a(f72127A, 8);
        this.f72152j = aVar;
        try {
            aVar.startWatching();
            C34012x4.m75442d("start anr monitor!", new Object[0]);
            this.f72147e.m74006a(new b());
        } catch (Throwable th2) {
            this.f72152j = null;
            C34012x4.m75444f("start anr monitor failed!", new Object[0]);
            if (!C34012x4.m75432a(LogState.WARN, th2)) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m75108n() {
        if (!m75096d()) {
            C34012x4.m75444f("close when closed!", new Object[0]);
            return;
        }
        m75107m();
        C34012x4.m75442d("stopWatchingPrivateAnrDir", new Object[0]);
        try {
            this.f72152j.stopWatching();
            this.f72152j = null;
            C34012x4.m75431a(LogState.WARN, "close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            LogState logState = LogState.WARN;
            C34012x4.m75431a(logState, "stop anr monitor failed!", new Object[0]);
            if (!C34012x4.m75432a(logState, th2)) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m75109o() {
        if (!m75096d()) {
            C34012x4.m75444f("close when closed!", new Object[0]);
            return;
        }
        try {
            this.f72152j.stopWatching();
            this.f72152j = null;
            C34012x4.m75444f("close anr monitor!", new Object[0]);
        } catch (Throwable th2) {
            C34012x4.m75444f("stop anr monitor failed!", new Object[0]);
            if (!C34012x4.m75432a(LogState.WARN, th2)) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public void m75110p() {
        int i11 = 0;
        while (true) {
            int i12 = i11 + 1;
            if (i11 >= 30) {
                return;
            }
            try {
                C34012x4.m75442d("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i12));
                C33571bi.m72615c(5000L);
                i11 = i12;
            } catch (Throwable th2) {
                if (C34012x4.m75438b(th2)) {
                    return;
                }
                th2.printStackTrace();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C33947u m75076c() {
        return f72131E;
    }

    /* JADX INFO: renamed from: b */
    public void m75090b(CrashDetailBean crashDetailBean) {
        try {
            crashDetailBean.f68613L = C33830o4.m74406i();
            crashDetailBean.f68614M = C33830o4.m74408k();
            crashDetailBean.f68615N = C33830o4.m74400e();
            crashDetailBean.f68616O = this.f72146d.m73830C();
            crashDetailBean.f68617P = this.f72146d.m73831D();
            crashDetailBean.f68618Q = this.f72146d.m73832E();
            crashDetailBean.f68619R = C33830o4.m74395b(this.f72144b);
            crashDetailBean.f68620S = C33830o4.m74412o();
            crashDetailBean.f68621T = C33830o4.m74402f();
            crashDetailBean.f68622U = C33830o4.m74405h();
            crashDetailBean.f68623V = C33830o4.m74404g();
            C33765l2 c33765l2 = this.f72146d;
            crashDetailBean.f68647k = c33765l2.f70755k;
            crashDetailBean.f68651m = c33765l2.f70748g0;
            crashDetailBean.f68653n = c33765l2.m73868d();
            C33765l2 c33765l3 = this.f72146d;
            crashDetailBean.f68641h = c33765l3.f70752i0;
            crashDetailBean.f68655o = c33765l3.m73882j();
            crashDetailBean.f68665v = this.f72146d.m73833F();
            crashDetailBean.f68645j = this.f72146d.m73892o();
            crashDetailBean.f68643i = this.f72146d.m73890n();
            crashDetailBean.f68636e0 = new HashMap();
            String str = crashDetailBean.f68669z;
            int iIndexOf = str != null ? str.indexOf(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE) : -1;
            crashDetailBean.f68668y = iIndexOf > 0 ? crashDetailBean.f68669z.substring(0, iIndexOf) : "GET_FAIL";
            String str2 = crashDetailBean.f68669z;
            if (str2 != null) {
                crashDetailBean.f68605D = C33571bi.m72614c(str2.getBytes());
            }
            crashDetailBean.f68612K = "main(1)";
            crashDetailBean.f68624W = this.f72146d.m73900x();
            crashDetailBean.f68659q = this.f72146d.m73898v();
            crashDetailBean.f68661r = this.f72146d.m73897u();
            C33765l2 c33765l4 = this.f72146d;
            crashDetailBean.f68628a0 = c33765l4.f70724P;
            crashDetailBean.f68630b0 = c33765l4.f70739c;
            crashDetailBean.f68632c0 = c33765l4.m73838K();
            crashDetailBean.f68638f0 = this.f72146d.m73835H();
            crashDetailBean.f68640g0 = this.f72146d.m73828A();
            crashDetailBean.f68642h0 = this.f72146d.m73880i();
            crashDetailBean.f68644i0 = this.f72146d.m73878h();
            crashDetailBean.f68652m0 = C33955u7.m75163c().m75164a();
            crashDetailBean.f68654n0 = C33955u7.m75163c().m75167b();
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m75095d(String str) {
        if (m75097d(true)) {
            try {
                C34012x4.m75434a("read trace first dump for create time!", new Object[0]);
                C33570bh.c cVarM72556a = C33570bh.m72556a(str, false);
                long jCurrentTimeMillis = cVarM72556a != null ? cVarM72556a.f69308c : -1L;
                if (jCurrentTimeMillis == -1) {
                    C34012x4.m75431a(LogState.WARN, "trace dump fail could not get time!", new Object[0]);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                if (m75087a(jCurrentTimeMillis)) {
                    return;
                }
                NativeCrashHandler.getInstance().recordProcessingState("ANR", C33922se.c.crash.ordinal());
                m75081a(jCurrentTimeMillis, str);
                CrashDetailBean crashDetailBeanM75101g = m75101g();
                this.f72149g.m73518i(crashDetailBeanM75101g);
                NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.node_1.ordinal(), true);
                m75092c(crashDetailBeanM75101g);
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
                C34012x4.m75431a(LogState.ERROR, "handle anr error %s", th2.getClass().toString());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m75098e(String str) {
        this.f72151i = str;
    }

    /* JADX INFO: renamed from: g */
    public CrashDetailBean m75101g() {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f68602A = f72133G;
        crashDetailBean.f68606E = f72132F;
        return crashDetailBean;
    }

    /* JADX INFO: renamed from: i */
    public final void m75103i() {
        long jCurrentTimeMillis = (System.currentTimeMillis() + C33745k3.f70492D) - C33571bi.m72601b();
        C33539a7.m72313a(this.f72151i, f72136t, ".txt", jCurrentTimeMillis);
        C33539a7.m72313a(this.f72151i, f72137u, ".txt", jCurrentTimeMillis);
        C33539a7.m72313a(this.f72151i, f72138v, ".txt", jCurrentTimeMillis);
        C33539a7.m72313a(this.f72151i, f72138v, ".txt.merged", jCurrentTimeMillis);
    }

    /* JADX INFO: renamed from: j */
    public final void m75104j() {
        synchronized (this.f72150h) {
            try {
                C34004wg c34004wg = this.f72154l;
                if (c34004wg == null || !c34004wg.isAlive()) {
                    C34004wg c34004wg2 = new C34004wg();
                    this.f72154l = c34004wg2;
                    c34004wg2.m75387a(this.f72146d.m73841N());
                    C34004wg c34004wg3 = this.f72154l;
                    StringBuilder sb2 = new StringBuilder("Bugly-ThreadMonitor");
                    int i11 = this.f72155m;
                    this.f72155m = i11 + 1;
                    sb2.append(i11);
                    c34004wg3.setName(sb2.toString());
                    if (this.f72146d.m73841N()) {
                        this.f72154l.m75394e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m75107m() {
        synchronized (this.f72150h) {
            try {
                C34004wg c34004wg = this.f72154l;
                if (c34004wg != null) {
                    c34004wg.m75395f();
                    this.f72154l = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C33947u(Context context, C33863pg c33863pg, C33765l2 c33765l2, C33784m0 c33784m0, C33620e4 c33620e4, C33724j3 c33724j3, C33555b2.a aVar) {
        Context contextM72565a = C33571bi.m72565a(context);
        this.f72144b = contextM72565a;
        this.f72145c = (ActivityManager) contextM72565a.getSystemService("activity");
        if (C33571bi.m72617c(NativeCrashHandler.getDumpFilePath())) {
            this.f72151i = context.getDir(f72135s, 0).getAbsolutePath();
        } else {
            this.f72151i = NativeCrashHandler.getDumpFilePath();
        }
        this.f72146d = c33765l2;
        this.f72147e = c33784m0;
        this.f72148f = c33863pg;
        this.f72149g = c33724j3;
        try {
            AbstractC34022xe abstractC34022xeM77083a = C35101b.m77082d().m77083a(C33786m2.f70892t);
            if (abstractC34022xeM77083a instanceof C33786m2) {
                C33967v.f72283c = ((C33786m2) abstractC34022xeM77083a).m74023f();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m75094c(String str) {
        if (str != null && !str.isEmpty()) {
            File file = new File(str);
            if (file.exists() && file.isFile() && file.length() > 50) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m75102h() {
        try {
            C34012x4.m75442d("preDumpAnrInfo", new Object[0]);
            this.f72159q = System.currentTimeMillis();
            if (C33927t.m75008a().m75011c()) {
                this.f72157o = new C33816nb(C33927t.m75008a().m75010b(), C33588ce.m72684b()).m74260a();
                C34012x4.m75434a("pre save main thread's message schedule info", new Object[0]);
            }
            this.f72158p = C33571bi.m72580a(Looper.getMainLooper().getThread());
            return true;
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m75111q() {
        if (m75099e()) {
            C34012x4.m75434a("anr is processing, return", new Object[0]);
            return false;
        }
        if (!C33967v.m75221b(this.f72145c)) {
            C34012x4.m75434a("proc is not in anr, wait next check", new Object[0]);
            return false;
        }
        if (m75087a(System.currentTimeMillis())) {
            return false;
        }
        boolean zM75097d = m75097d(true);
        if (zM75097d) {
            NativeCrashHandler.getInstance().recordProcessingState("ANR", C33922se.c.crash.ordinal());
            C33784m0.m74004c().m74006a(new c());
        }
        return zM75097d;
    }

    /* JADX INFO: renamed from: a */
    public static C33947u m75068a(Context context, C33863pg c33863pg, C33765l2 c33765l2, C33784m0 c33784m0, C33620e4 c33620e4, C33724j3 c33724j3, C33555b2.a aVar) {
        if (f72131E == null) {
            f72131E = new C33947u(context, c33863pg, c33765l2, c33784m0, c33620e4, c33724j3, aVar);
        }
        return f72131E;
    }

    /* JADX INFO: renamed from: c */
    public void m75093c(boolean z11) {
        m75085a(z11);
        boolean zM75100f = m75100f();
        C33863pg c33863pgM74576b = C33863pg.m74576b();
        if (c33863pgM74576b != null) {
            zM75100f = zM75100f && c33863pgM74576b.m74582c().f68568d;
        }
        if (zM75100f != m75096d()) {
            C34012x4.m75442d("anr changed to %b", Boolean.valueOf(zM75100f));
            m75091b(zM75100f);
        }
    }

    /* JADX INFO: renamed from: a */
    public CrashDetailBean m75079a(String str, CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            try {
                crashDetailBean = new CrashDetailBean();
            } catch (Throwable th2) {
                C34012x4.m75435a(th2);
                return null;
            }
        }
        if (crashDetailBean.f68602A < 0) {
            long j11 = this.f72159q;
            if (j11 != -1) {
                crashDetailBean.f68602A = j11;
            } else {
                crashDetailBean.f68602A = System.currentTimeMillis();
            }
        }
        crashDetailBean.f68631c = 3;
        crashDetailBean.f68666w = f72128B;
        if (TextUtils.isEmpty(str)) {
            str = "main stack is null , some error may be encountered.";
        }
        crashDetailBean.f68669z = str;
        C33765l2 c33765l2 = this.f72146d;
        crashDetailBean.f68611J = c33765l2.f70745f;
        crashDetailBean.f68649l = c33765l2.f70714F;
        List<String> operationLogString = LifecycleCallback.INSTANCE.getOperationLogString();
        crashDetailBean.f68657p = operationLogString;
        if (operationLogString != null && !operationLogString.isEmpty()) {
            NativeCrashHandler.getInstance().modifyAttachmentState(C33922se.b.martianLog.ordinal());
        }
        return crashDetailBean;
    }

    /* JADX INFO: renamed from: c */
    public final void m75092c(CrashDetailBean crashDetailBean) {
        ActivityManager.ProcessErrorStateInfo processErrorStateInfoM75217a;
        try {
            synchronized (this.f72150h) {
                try {
                    if (this.f72154l != null) {
                        C34012x4.m75434a("Disable record main stack trace.", new Object[0]);
                        this.f72154l.m75385a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            CrashDetailBean crashDetailBeanM75078a = m75078a(crashDetailBean);
            NativeCrashHandler.getInstance().saveAdditionalAttachmentPaths("anr");
            NativeCrashHandler.getInstance().getNativeProcessInfo("anr");
            NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.node_6.ordinal(), false);
            if (this.f72146d.m73838K() && !C33967v.m75220a(this.f72144b)) {
                processErrorStateInfoM75217a = C33967v.m75217a(this.f72145c, f72142z);
            } else {
                processErrorStateInfoM75217a = C33967v.m75217a(this.f72145c, 0L);
            }
            if (processErrorStateInfoM75217a == null && !C33967v.f72283c) {
                C34012x4.m75434a("proc state is invisible or not my proc!", new Object[0]);
                f72132F = null;
                f72133G = -1L;
                m75097d(false);
                return;
            }
            m75083a(crashDetailBeanM75078a, processErrorStateInfoM75217a);
            synchronized (this.f72150h) {
                try {
                    if (this.f72154l != null) {
                        C34012x4.m75434a("Finish anr process.", new Object[0]);
                        this.f72154l.m75391b(true);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            f72132F = null;
            f72133G = -1L;
            m75097d(false);
        } catch (Throwable th4) {
            try {
                C34012x4.m75435a(th4);
            } finally {
                f72132F = null;
                f72133G = -1L;
                m75097d(false);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m75097d(boolean z11) {
        boolean zCompareAndSet = this.f72143a.compareAndSet(!z11, z11);
        C34012x4.m75434a("tryChangeAnrState to %s, success:%s", Boolean.valueOf(z11), Boolean.valueOf(zCompareAndSet));
        return zCompareAndSet;
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m75096d() {
        return this.f72152j != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m75088a(String str, String str2, String str3) throws Throwable {
        Map<String, String[]> map;
        C33570bh.c cVarM72555a = C33570bh.m72555a(str3, str, true);
        if (cVarM72555a != null && (map = cVarM72555a.f69309d) != null && !map.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(1024);
            String[] strArr = cVarM72555a.f69309d.get("main");
            if (strArr != null && strArr.length >= 3) {
                sb2.append("\"main\" tid=");
                sb2.append(strArr[2]);
                sb2.append(" :\n");
                sb2.append(strArr[0]);
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                sb2.append(strArr[1]);
                sb2.append("\n\n");
            }
            for (Map.Entry<String, String[]> entry : cVarM72555a.f69309d.entrySet()) {
                if (!entry.getKey().equals("main") && entry.getValue() != null && entry.getValue().length >= 3) {
                    sb2.append("\"");
                    sb2.append(entry.getKey());
                    sb2.append("\" tid=");
                    sb2.append(entry.getValue()[2]);
                    sb2.append(" :\n");
                    sb2.append(entry.getValue()[0]);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    sb2.append(entry.getValue()[1]);
                    sb2.append("\n\n");
                }
            }
            return C33539a7.m72318a(str2, sb2.toString(), sb2.length() * 2);
        }
        C34012x4.m75437b("not found trace dump for %s", str3);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final CrashDetailBean m75078a(CrashDetailBean crashDetailBean) {
        NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.node_2.ordinal(), false);
        String strM72580a = this.f72158p;
        if (TextUtils.isEmpty(strM72580a)) {
            strM72580a = C33571bi.m72580a(Looper.getMainLooper().getThread());
        }
        NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.node_3.ordinal(), false, strM72580a.length() > 0);
        CrashDetailBean crashDetailBeanM75079a = m75079a(strM72580a, crashDetailBean);
        if (crashDetailBeanM75079a == null) {
            C34012x4.m75437b("pack anr fail!", new Object[0]);
            return null;
        }
        C33749k7 c33749k7 = C33749k7.d.f70597a;
        long j11 = crashDetailBeanM75079a.f68602A;
        JSONObject jSONObjectM73733a = c33749k7.m73733a(j11 - 60000, j11);
        if (jSONObjectM73733a != null) {
            crashDetailBeanM75079a.f68660q0 = jSONObjectM73733a.toString();
        }
        this.f72149g.m73518i(crashDetailBeanM75079a);
        NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.node_4.ordinal(), true);
        m75090b(crashDetailBeanM75079a);
        this.f72149g.m73518i(crashDetailBeanM75079a);
        try {
            if (C33927t.m75008a().m75011c()) {
                String strM74260a = this.f72157o;
                if (TextUtils.isEmpty(strM74260a)) {
                    strM74260a = new C33816nb(C33927t.m75008a().m75010b(), C33588ce.m72684b()).m74260a();
                }
                C34012x4.m75434a("save main thread's message schedule info", new Object[0]);
                File file = new File(C33557b4.m72455c().m72456a(this.f72144b, "anr", C33765l2.f70706I0) + File.separator);
                if (!file.exists()) {
                    file.mkdirs();
                }
                File file2 = new File(file, "main_thread_msg.json");
                if (!file2.exists()) {
                    file2.createNewFile();
                }
                C33539a7.m72315a(file2, strM74260a, 2147483647L, false);
                if (!TextUtils.isEmpty(strM74260a)) {
                    NativeCrashHandler.getInstance().modifyAttachmentState(C33922se.b.mainThreadMsg.ordinal());
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        NativeCrashHandler.getInstance().modifyProcessingState(C33922se.c.node_5.ordinal(), false);
        for (int i11 = 0; i11 < 10000; i11 += 100) {
            if (f72133G != -1 && f72132F != null) {
                crashDetailBeanM75079a.f68602A = f72133G;
                crashDetailBeanM75079a.f68606E = f72132F;
                this.f72149g.m73518i(crashDetailBeanM75079a);
                if (!m75094c(f72132F)) {
                    break;
                }
                NativeCrashHandler.getInstance().modifyAttachmentState(C33922se.b.traceInfo.ordinal());
                break;
            }
            C33571bi.m72615c(100L);
        }
        this.f72149g.m73518i(crashDetailBeanM75079a);
        C33724j3.m73469a("ANR", C33571bi.m72572a(), crashDetailBeanM75079a.f68611J, "main", crashDetailBeanM75079a.f68669z, crashDetailBeanM75079a);
        crashDetailBeanM75079a.f68610I = C33571bi.m72588a(this.f72146d.m73839L(), C33745k3.f70490B, false, true);
        String strM72575a = C33571bi.m72575a(this.f72144b, NativeCrashHandler.getInstance());
        crashDetailBeanM75079a.f68648k0 = strM72575a;
        if (strM72575a != null && strM72575a.length() >= 50) {
            NativeCrashHandler.getInstance().modifyAttachmentState(C33922se.b.crashInfos.ordinal());
        }
        C33663g5.m73147b(crashDetailBeanM75079a);
        this.f72149g.m73518i(crashDetailBeanM75079a);
        crashDetailBeanM75079a.f68609H = C33627eb.m72943b();
        return crashDetailBeanM75079a;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m75091b(boolean z11) {
        try {
            if (z11) {
                m75105k();
            } else {
                m75108n();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized String m75089b() {
        return this.f72151i;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m75074b(String str) {
        return str.startsWith(f72137u) && str.endsWith(".txt");
    }

    /* JADX INFO: renamed from: a */
    public final void m75083a(CrashDetailBean crashDetailBean, ActivityManager.ProcessErrorStateInfo processErrorStateInfo) {
        if (crashDetailBean == null) {
            C34012x4.m75437b("pack anr fail!", new Object[0]);
            return;
        }
        crashDetailBean.f68667x = processErrorStateInfo == null ? "Find process anr, but unable to get anr message." : processErrorStateInfo.shortMsg;
        String str = processErrorStateInfo == null ? "" : processErrorStateInfo.longMsg;
        crashDetailBean.f68636e0.put(CrashDetailBean.f68592G0, str);
        if (str != null && str.length() >= 50) {
            NativeCrashHandler.getInstance().modifyAttachmentState(C33922se.b.anrMessage.ordinal());
        }
        if (crashDetailBean.f68629b >= 0) {
            C34012x4.m75442d("backup anr record success!", new Object[0]);
        } else {
            C34012x4.m75444f("backup anr record fail!", new Object[0]);
        }
        if (!this.f72149g.m73502a(crashDetailBean, !C33830o4.m74403f(this.f72144b))) {
            this.f72149g.m73497a(crashDetailBean, 3000L, true);
        }
        this.f72149g.m73516g(crashDetailBean);
    }

    /* JADX INFO: renamed from: a */
    public final void m75084a(String str, long j11) {
        List<C33821ng> listM75389b;
        C34012x4.m75434a("trace file:%s", str);
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            File file = new File(this.f72151i, f72136t + j11 + ".txt");
            LogState logState = LogState.DEBUG;
            C34012x4.m75431a(logState, "trace file exists", new Object[0]);
            if (str.startsWith(f72127A)) {
                C34012x4.m75431a(LogState.INFO, "backup trace isOK:%s", Boolean.valueOf(m75088a(str, file.getAbsolutePath(), C34007x.m75404a(Process.myPid()))));
            } else {
                C34012x4.m75431a(LogState.INFO, "trace file rename :%s", Boolean.valueOf(new File(str).renameTo(file)));
            }
            synchronized (this.f72150h) {
                try {
                    C34004wg c34004wg = this.f72154l;
                    listM75389b = c34004wg != null ? c34004wg.m75389b() : null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (listM75389b != null) {
                String strM75080a = m75080a(listM75389b, j11);
                C34012x4.m75431a(logState, "save main stack trace", new Object[0]);
                C33539a7.m72315a(file, strM75080a, 2147483647L, true);
            }
            f72133G = j11;
            f72132F = file.getAbsolutePath();
            return;
        }
        C34012x4.m75431a(LogState.DEBUG, "trace file is null or not exists, just ignore", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public final String m75080a(List<C33821ng> list, long j11) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(4096);
            sb2.append("\n>>>>> 以下为anr过程中主线程堆栈记录，可根据堆栈出现次数推测在该堆栈阻塞的时间，出现次数越多对anr贡献越大，越可能是造成anr的原因 >>>>>\n\n>>>>> Thread Stack Traces Records Start >>>>>\n");
            for (int i11 = 0; i11 < list.size(); i11++) {
                C33821ng c33821ng = list.get(i11);
                sb2.append("Thread name:");
                sb2.append(c33821ng.m74322d());
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                long jM74318b = c33821ng.m74318b() - j11;
                String str = jM74318b <= 0 ? "before " : "after ";
                sb2.append("Got ");
                sb2.append(str);
                sb2.append("anr:");
                sb2.append(Math.abs(jM74318b));
                sb2.append("ms\n");
                sb2.append(c33821ng.m74321c());
                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                if (sb2.length() * 2 >= 101376) {
                    break;
                }
            }
            sb2.append("\n<<<<< Thread Stack Traces Records End <<<<<\n");
            return sb2.toString();
        }
        return "main thread stack not enable\n";
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m75085a(boolean z11) {
        if (this.f72153k != z11) {
            C34012x4.m75442d("user change anr %b", Boolean.valueOf(z11));
            this.f72153k = z11;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m75082a(StrategyBean strategyBean) {
        C34012x4.m75444f("customer decides whether to open or close.", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public final void m75081a(long j11, String str) {
        C34012x4.m75434a("anr time:%s", Long.valueOf(j11));
        m75084a(str, j11);
    }

    /* JADX INFO: renamed from: a */
    public boolean m75086a() {
        this.f72159q = -1L;
        this.f72158p = "";
        this.f72157o = "";
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75087a(long j11) {
        if (Math.abs(j11 - this.f72156n) < 10000) {
            C34012x4.m75444f("should not process ANR too Fre in %dms", 10000);
            return true;
        }
        this.f72156n = j11;
        return false;
    }
}
