package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.crashreport.crash.jni.NativeExceptionHandler;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.k3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33745k3 {

    /* JADX INFO: renamed from: A */
    public static int f70489A = 3000;

    /* JADX INFO: renamed from: B */
    public static int f70490B = 20480;

    /* JADX INFO: renamed from: C */
    public static long f70491C = 209715200;

    /* JADX INFO: renamed from: D */
    public static long f70492D = 604800000;

    /* JADX INFO: renamed from: E */
    public static String f70493E = null;

    /* JADX INFO: renamed from: F */
    public static boolean f70494F = false;

    /* JADX INFO: renamed from: G */
    public static String f70495G = null;

    /* JADX INFO: renamed from: H */
    public static int f70496H = 5000;

    /* JADX INFO: renamed from: I */
    public static boolean f70497I = true;

    /* JADX INFO: renamed from: J */
    public static boolean f70498J = true;

    /* JADX INFO: renamed from: K */
    public static long f70499K = 2;

    /* JADX INFO: renamed from: L */
    public static long f70500L = 30000;

    /* JADX INFO: renamed from: M */
    public static long f70501M = 10000;

    /* JADX INFO: renamed from: N */
    public static final String f70502N = "local_crash_lock";

    /* JADX INFO: renamed from: O */
    public static final long f70503O = 10000;

    /* JADX INFO: renamed from: P */
    public static String f70504P = null;

    /* JADX INFO: renamed from: Q */
    public static String f70505Q = null;

    /* JADX INFO: renamed from: R */
    public static C33745k3 f70506R = null;

    /* JADX INFO: renamed from: n */
    public static int f70507n = 0;

    /* JADX INFO: renamed from: o */
    public static boolean f70508o = false;

    /* JADX INFO: renamed from: p */
    public static final int f70509p = 86400000;

    /* JADX INFO: renamed from: q */
    public static final int f70510q = 3000;

    /* JADX INFO: renamed from: r */
    public static final int f70511r = 1000;

    /* JADX INFO: renamed from: s */
    public static final int f70512s = 86400000;

    /* JADX INFO: renamed from: t */
    public static final long f70513t = 3;

    /* JADX INFO: renamed from: u */
    public static final long f70514u = 20;

    /* JADX INFO: renamed from: v */
    public static int f70515v = 2;

    /* JADX INFO: renamed from: w */
    public static boolean f70516w = false;

    /* JADX INFO: renamed from: x */
    public static int f70517x = 61440;

    /* JADX INFO: renamed from: y */
    public static int f70518y = 10240;

    /* JADX INFO: renamed from: z */
    public static int f70519z = 50;

    /* JADX INFO: renamed from: a */
    public final Context f70520a;

    /* JADX INFO: renamed from: b */
    public final C33724j3 f70521b;

    /* JADX INFO: renamed from: c */
    public final C33647fa f70522c;

    /* JADX INFO: renamed from: d */
    public final NativeCrashHandler f70523d;

    /* JADX INFO: renamed from: e */
    public final C33863pg f70524e;

    /* JADX INFO: renamed from: f */
    public final C33784m0 f70525f;

    /* JADX INFO: renamed from: g */
    public final C33947u f70526g;

    /* JADX INFO: renamed from: h */
    public C33555b2.a f70527h;

    /* JADX INFO: renamed from: i */
    public InterfaceC34063zf f70528i;

    /* JADX INFO: renamed from: j */
    public Boolean f70529j;

    /* JADX INFO: renamed from: k */
    public int f70530k = 31;

    /* JADX INFO: renamed from: l */
    public boolean f70531l = false;

    /* JADX INFO: renamed from: m */
    public final C33829o3 f70532m = new C33829o3();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k3$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeCrashHandler.getInstance().unBlockSigquit(true);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k3$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeCrashHandler.getInstance().unBlockSigquit(false);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k3$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f70535b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Thread f70536c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Throwable f70537d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f70538e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ byte[] f70539f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ boolean f70540g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ boolean f70541h;

        public c(boolean z11, Thread thread, Throwable th2, String str, byte[] bArr, boolean z12, boolean z13) {
            this.f70535b = z11;
            this.f70536c = thread;
            this.f70537d = th2;
            this.f70538e = str;
            this.f70539f = bArr;
            this.f70540g = z12;
            this.f70541h = z13;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C34012x4.m75434a("post a throwable %b", Boolean.valueOf(this.f70535b));
                C33745k3.this.f70522c.m73030a(this.f70536c, this.f70537d, false, this.f70538e, this.f70539f, this.f70540g);
                if (this.f70541h) {
                    C34012x4.m75431a(LogState.INFO, "clear user datas", new Object[0]);
                    C33765l2.m73825a(C33745k3.this.f70520a).m73848a();
                }
            } catch (Throwable th2) {
                if (!C34012x4.m75435a(th2)) {
                    th2.printStackTrace();
                }
                C34012x4.m75431a(LogState.ERROR, "java catch error: %s", this.f70537d.toString());
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k3$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d extends Thread {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f70543b;

        public d(boolean z11) {
            this.f70543b = z11;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C33745k3.this.m73677h();
            if (!C33571bi.m72592a(C33745k3.this.f70520a, C33745k3.f70502N, 10000L)) {
                C34012x4.m75434a("Failed to lock file for uploading local crash.", new Object[0]);
                return;
            }
            if (this.f70543b) {
                C33745k3.this.f70523d.checkSaveRecordCrash();
            }
            C33745k3.this.m73682n();
            C33745k3.this.m73658a();
            C33590cg.b.f69449a.m72710c();
            C34012x4.m75442d("check db and upload record.", new Object[0]);
            List<CrashDetailBean> listM73507b = C33745k3.this.f70521b.m73507b();
            if (listM73507b == null || listM73507b.size() <= 0) {
                C34012x4.m75431a(LogState.DEBUG, "no crash need to be uploaded at this start.", new Object[0]);
            } else {
                C34012x4.m75431a(LogState.DEBUG, "Size of crash list need to upload: %s", Integer.valueOf(listM73507b.size()));
                C33745k3.this.m73665a(listM73507b);
            }
            C33571bi.m72609b(C33745k3.this.f70520a, C33745k3.f70502N);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.k3$e */
    /* JADX INFO: compiled from: BUGLY */
    public class e extends Thread {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ List f70545b;

        public e(List list) {
            this.f70545b = list;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            C33745k3.this.f70521b.m73499a(this.f70545b, 0L, false, false, false);
            C34012x4.m75434a("do upload db crash delay, upload crash num: " + this.f70545b.size(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m73656C() {
        this.f70526g.m75110p();
    }

    /* JADX INFO: renamed from: D */
    public synchronized void m73657D() {
        this.f70523d.testNativeCrash();
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m73685q() {
        C33647fa c33647fa;
        try {
            if (this.f70532m.f71287a && (c33647fa = this.f70522c) != null) {
                c33647fa.m73035b();
            }
            NativeCrashHandler nativeCrashHandler = this.f70523d;
            if (nativeCrashHandler != null) {
                nativeCrashHandler.reRegisterNativeHandler(this.f70532m.f71288b);
                this.f70523d.reRegisterANRHandler(this.f70532m.f71289c);
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: w */
    public synchronized void m73691w() {
        m73694z();
        m73654A();
        m73692x();
    }

    /* JADX INFO: renamed from: l */
    public static synchronized C33745k3 m73653l() {
        return f70506R;
    }

    /* JADX INFO: renamed from: A */
    public void m73654A() {
        this.f70532m.f71288b = true;
        this.f70523d.setUserOpened(true);
    }

    /* JADX INFO: renamed from: B */
    public void m73655B() {
        this.f70523d.disableCatchAnrTrace();
    }

    /* JADX INFO: renamed from: b */
    public final void m73671b(List<CrashDetailBean> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f70521b.m73499a(list, 0L, false, false, false);
        C34012x4.m75434a("do upload db crash immediately, upload crash num: " + list.size(), new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m73672c() {
        m73674e();
        m73675f();
        m73673d();
    }

    /* JADX INFO: renamed from: d */
    public void m73673d() {
        this.f70532m.f71289c = false;
        new Handler(Looper.getMainLooper()).post(new b());
        this.f70526g.m75093c(false);
    }

    /* JADX INFO: renamed from: e */
    public void m73674e() {
        this.f70532m.f71287a = false;
        this.f70522c.m73040d();
    }

    /* JADX INFO: renamed from: f */
    public void m73675f() {
        this.f70532m.f71288b = false;
        this.f70523d.setUserOpened(false);
    }

    /* JADX INFO: renamed from: g */
    public int m73676g() {
        List<CrashDetailBean> listM73507b = this.f70521b.m73507b();
        if (listM73507b == null) {
            return 0;
        }
        return listM73507b.size();
    }

    /* JADX INFO: renamed from: h */
    public void m73677h() {
        try {
            AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33911s3.f71802h);
            if (abstractC34022xeM77083a instanceof C33911s3) {
                C33765l2.f70705H0 = ((C33911s3) abstractC34022xeM77083a).m74909c().booleanValue();
                C34012x4.m75442d("crash upload with json = " + C33765l2.f70705H0, new Object[0]);
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
    }

    /* JADX INFO: renamed from: i */
    public C33947u m73678i() {
        return this.f70526g;
    }

    /* JADX INFO: renamed from: j */
    public int m73679j() {
        return this.f70530k;
    }

    /* JADX INFO: renamed from: k */
    public boolean m73680k() {
        return this.f70531l;
    }

    /* JADX INFO: renamed from: m */
    public NativeExceptionHandler m73681m() {
        return this.f70523d.getNativeExceptionHandler();
    }

    /* JADX INFO: renamed from: o */
    public boolean m73683o() {
        C33620e4 c33620e4;
        Boolean bool = this.f70529j;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = C33765l2.m73827s().f70745f;
        List<C33543ab> listM72905a = C33620e4.m72891a().m72905a(1);
        ArrayList arrayList = new ArrayList();
        if (listM72905a == null || listM72905a.size() <= 0) {
            this.f70529j = Boolean.FALSE;
            return false;
        }
        for (C33543ab c33543ab : listM72905a) {
            if (str.equals(c33543ab.f68821c)) {
                this.f70529j = Boolean.TRUE;
                arrayList.add(c33543ab);
            }
        }
        if (arrayList.size() > 0) {
            synchronized (C33620e4.class) {
                c33620e4 = C33620e4.f69668a;
            }
            c33620e4.m72908a(arrayList);
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m73684p() {
        return this.f70526g.m75099e();
    }

    /* JADX INFO: renamed from: r */
    public boolean m73686r() {
        return (this.f70530k & 8) > 0;
    }

    /* JADX INFO: renamed from: s */
    public boolean m73687s() {
        return (this.f70530k & 16) > 0;
    }

    /* JADX INFO: renamed from: t */
    public boolean m73688t() {
        return (this.f70530k & 2) > 0;
    }

    /* JADX INFO: renamed from: u */
    public boolean m73689u() {
        return (this.f70530k & 1) > 0;
    }

    /* JADX INFO: renamed from: v */
    public boolean m73690v() {
        return (this.f70530k & 4) > 0;
    }

    /* JADX INFO: renamed from: x */
    public void m73692x() {
        this.f70532m.f71289c = true;
        if (Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId()) {
            NativeCrashHandler.getInstance().unBlockSigquit(true);
            this.f70526g.m75093c(true);
        } else {
            new Handler(Looper.getMainLooper()).post(new a());
            this.f70526g.m75093c(true);
        }
    }

    /* JADX INFO: renamed from: y */
    public void m73693y() {
        this.f70523d.enableCatchAnrTrace();
    }

    /* JADX INFO: renamed from: z */
    public void m73694z() {
        this.f70532m.f71287a = true;
        this.f70522c.m73039c();
    }

    public C33745k3(int i11, Context context, C33784m0 c33784m0, boolean z11, C33555b2.a aVar, InterfaceC34063zf interfaceC34063zf, String str) {
        f70507n = i11;
        Context contextM72565a = C33571bi.m72565a(context);
        this.f70520a = contextM72565a;
        C33863pg c33863pgM74576b = C33863pg.m74576b();
        this.f70524e = c33863pgM74576b;
        this.f70525f = c33784m0;
        this.f70527h = aVar;
        this.f70528i = interfaceC34063zf;
        C33905rh c33905rhM74876d = C33905rh.m74876d();
        C33620e4 c33620e4M72891a = C33620e4.m72891a();
        C33724j3 c33724j3 = new C33724j3(i11, contextM72565a, c33905rhM74876d, c33620e4M72891a, c33863pgM74576b, aVar, interfaceC34063zf);
        this.f70521b = c33724j3;
        C33765l2 c33765l2M73825a = C33765l2.m73825a(contextM72565a);
        this.f70522c = new C33647fa(contextM72565a, c33724j3, c33863pgM74576b, c33765l2M73825a);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextM72565a, c33765l2M73825a, c33724j3, c33863pgM74576b, c33784m0, z11, str);
        this.f70523d = nativeCrashHandler;
        c33765l2M73825a.f70758l0 = nativeCrashHandler;
        this.f70526g = C33947u.m75068a(contextM72565a, c33863pgM74576b, c33765l2M73825a, c33784m0, c33620e4M72891a, c33724j3, aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m73664a(Thread thread, Throwable th2, boolean z11, String str, byte[] bArr, boolean z12, boolean z13) {
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33600d5.f69503h);
        if (abstractC34022xeM77083a != null && (abstractC34022xeM77083a instanceof C33600d5) && !((C33600d5) abstractC34022xeM77083a).m72776c().booleanValue()) {
            C34012x4.m75444f("java error report is disabled, please modify your project's setting", new Object[0]);
        } else {
            ThreadManager.runInLogThread(new c(z11, thread, th2, str, bArr, z13, z12), 0L);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m73682n() {
        C33557b4.m72455c().m72473d(this.f70520a);
        C33557b4.m72455c().m72468b(this.f70520a);
        C33557b4.m72455c().m72458a(this.f70520a);
    }

    /* JADX INFO: renamed from: b */
    public void m73670b() {
        if (C33765l2.m73827s().f70745f.equals(C34007x.m75411d(this.f70520a))) {
            this.f70523d.removeEmptyNativeRecordFiles();
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33745k3 m73647a(int i11, Context context, boolean z11, C33555b2.a aVar, InterfaceC34063zf interfaceC34063zf, String str) {
        try {
            if (f70506R == null) {
                f70506R = new C33745k3(i11, context, C33784m0.m74004c(), z11, aVar, interfaceC34063zf, str);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f70506R;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m73663a(InterfaceC34063zf interfaceC34063zf) {
        C33724j3 c33724j3 = this.f70521b;
        if (c33724j3 != null) {
            c33724j3.f70336e = interfaceC34063zf;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73661a(StrategyBean strategyBean) {
        this.f70522c.m73025a(strategyBean);
        this.f70523d.onStrategyChanged(strategyBean);
        this.f70526g.m75082a(strategyBean);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m73668a(boolean z11, boolean z12, boolean z13) {
        this.f70523d.testNativeCrash(z11, z12, z13);
    }

    /* JADX INFO: renamed from: a */
    public void m73662a(CrashDetailBean crashDetailBean) {
        this.f70521b.m73518i(crashDetailBean);
    }

    /* JADX INFO: renamed from: a */
    public void m73660a(long j11, boolean z11) {
        C33784m0.m74004c().m74007a(new d(z11), j11);
    }

    /* JADX INFO: renamed from: a */
    public final void m73665a(List<CrashDetailBean> list) {
        int size = list.size();
        if (size > 20) {
            ArrayList arrayList = new ArrayList();
            Collections.sort(list);
            for (int i11 = 0; i11 < 20; i11++) {
                arrayList.add(list.get((size - 1) - i11));
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (CrashDetailBean crashDetailBean : list) {
            int i12 = crashDetailBean.f68631c;
            if ((i12 == 3 && jCurrentTimeMillis - crashDetailBean.f68602A < f70500L) || ((i12 == 0 || i12 == 1) && jCurrentTimeMillis - crashDetailBean.f68602A < f70501M)) {
                C34012x4.m75434a("crash may in upload process, try add to delay list, crash type: " + crashDetailBean.f68666w, new Object[0]);
                if (!crashDetailBean.f68656o0) {
                    if (crashDetailBean.f68631c == 3) {
                        arrayList3.add(crashDetailBean);
                    } else {
                        arrayList4.add(crashDetailBean);
                    }
                    crashDetailBean.f68656o0 = true;
                    m73662a(crashDetailBean);
                } else {
                    C34012x4.m75431a(LogState.DEBUG, "crash in upload delay process, do not add to delay upload list again.", new Object[0]);
                }
            } else {
                arrayList2.add(crashDetailBean);
            }
        }
        C34012x4.m75434a("try upload crash, " + arrayList2.size() + " immediately, " + arrayList4.size() + " crash delay, " + arrayList3.size() + " anr delay.", new Object[0]);
        m73671b(arrayList2);
        m73666a(arrayList3, f70500L);
        m73666a(arrayList4, f70501M);
    }

    /* JADX INFO: renamed from: a */
    public final void m73666a(List<CrashDetailBean> list, long j11) {
        if (list.isEmpty()) {
            return;
        }
        C34012x4.m75434a("do post a delay upload task to upload crash, delay time: " + j11, new Object[0]);
        C33784m0.m74004c().m74007a(new e(list), j11);
    }

    /* JADX INFO: renamed from: a */
    public final void m73658a() {
        try {
            List<CrashDetailBean> listM73495a = this.f70521b.m73495a(this.f70521b.m73494a());
            if (listM73495a == null || listM73495a.size() <= 0) {
                return;
            }
            for (CrashDetailBean crashDetailBean : listM73495a) {
                if (crashDetailBean.f68639g) {
                    C33557b4.m72455c().m72475e(this.f70520a, crashDetailBean.f68635e);
                }
            }
        } catch (Throwable th2) {
            C34012x4.m75438b(th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public byte[] m73669a(Context context) {
        return this.f70521b.m73504a(this.f70521b.m73507b(), true);
    }

    /* JADX INFO: renamed from: a */
    public void m73659a(int i11) {
        this.f70530k = i11;
    }

    /* JADX INFO: renamed from: a */
    public void m73667a(boolean z11) {
        this.f70531l = z11;
    }
}
