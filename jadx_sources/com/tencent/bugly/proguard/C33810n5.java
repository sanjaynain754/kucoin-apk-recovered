package com.tencent.bugly.proguard;

import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n5 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33810n5 {

    /* JADX INFO: renamed from: e */
    public static C33810n5 f71031e;

    /* JADX INFO: renamed from: a */
    public C33863pg f71032a;

    /* JADX INFO: renamed from: b */
    public C33765l2 f71033b;

    /* JADX INFO: renamed from: c */
    public C33724j3 f71034c;

    /* JADX INFO: renamed from: d */
    public Context f71035d;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.n5$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C33810n5.this.m74239b();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.n5$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Thread f71037b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f71038c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f71039d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f71040e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f71041f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Map f71042g;

        public b(Thread thread, int i11, String str, String str2, String str3, Map map) {
            this.f71037b = thread;
            this.f71038c = i11;
            this.f71039d = str;
            this.f71040e = str2;
            this.f71041f = str3;
            this.f71042g = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (C33810n5.f71031e == null) {
                    C34012x4.m75437b("[ExtraCrashManager] Extra crash manager has not been initialized.", new Object[0]);
                } else {
                    C33810n5.f71031e.m74237a(this.f71037b, this.f71038c, this.f71039d, this.f71040e, this.f71041f, this.f71042g);
                }
            } catch (Throwable th2) {
                if (!C34012x4.m75435a(th2)) {
                    th2.printStackTrace();
                }
                C34012x4.m75431a(LogState.ERROR, "[ExtraCrashManager] Crash error %s %s %s", this.f71039d, this.f71040e, this.f71041f);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m74239b() {
        C34012x4.m75434a("[ExtraCrashManager] Trying to notify Bugly agents.", new Object[0]);
        try {
            String str = C33707i7.f70197a;
            Objects.requireNonNull(this.f71033b);
            C33571bi.m72590a((Class<?>) C33707i7.class, "sdkPackageName", "com.tencent.bugly", (Object) null);
            C34012x4.m75431a(LogState.DEBUG, "[ExtraCrashManager] Bugly game agent has been notified.", new Object[0]);
        } catch (Throwable unused) {
            C34012x4.m75431a(LogState.INFO, "[ExtraCrashManager] no game agent", new Object[0]);
        }
    }

    public C33810n5(Context context) {
        C33745k3 c33745k3M73653l = C33745k3.m73653l();
        if (c33745k3M73653l == null) {
            return;
        }
        this.f71032a = C33863pg.m74576b();
        this.f71033b = C33765l2.m73825a(context);
        this.f71034c = c33745k3M73653l.f70521b;
        this.f71035d = context;
        C33784m0.m74004c().m74006a(new a());
    }

    /* JADX INFO: renamed from: c */
    public static void m74236c(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33600d5.f69503h);
        if (abstractC34022xeM77083a != null && (abstractC34022xeM77083a instanceof C33600d5) && !((C33600d5) abstractC34022xeM77083a).m72776c().booleanValue()) {
            C34012x4.m75444f("extra error report is disabled, please modify your project's setting", new Object[0]);
        } else {
            C33784m0.m74004c().m74006a(new b(thread, i11, str, str2, str3, map));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33810n5 m74233a(Context context) {
        if (f71031e == null) {
            f71031e = new C33810n5(context);
        }
        return f71031e;
    }

    /* JADX INFO: renamed from: a */
    public final void m74237a(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        String str4;
        Thread threadCurrentThread = thread == null ? Thread.currentThread() : thread;
        if (i11 == 4) {
            str4 = "Unity";
        } else if (i11 == 5 || i11 == 6) {
            str4 = "Cocos";
        } else {
            if (i11 != 8) {
                C34012x4.m75444f("[ExtraCrashManager] Unknown extra crash type: %d", Integer.valueOf(i11));
                return;
            }
            str4 = "H5";
        }
        C34012x4.m75437b("[ExtraCrashManager] %s Crash Happen", str4);
        try {
            if (!this.f71032a.m74583d()) {
                C34012x4.m75431a(LogState.WARN, "[ExtraCrashManager] There is no remote strategy, but still store it.", new Object[0]);
            }
            StrategyBean strategyBeanM74582c = this.f71032a.m74582c();
            if (!strategyBeanM74582c.f68568d && this.f71032a.m74583d()) {
                LogState logState = LogState.ERROR;
                C34012x4.m75431a(logState, "[ExtraCrashManager] Crash report was closed by remote. Will not upload to Bugly , print local for helpful!", new Object[0]);
                C33724j3.m73469a(str4, C33571bi.m72572a(), this.f71033b.f70745f, threadCurrentThread.getName(), str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str3, null);
                C34012x4.m75431a(logState, "[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            String str5 = str4;
            if (i11 != 5 && i11 != 6) {
                if (i11 == 8 && !strategyBeanM74582c.f68574j) {
                    LogState logState2 = LogState.ERROR;
                    C34012x4.m75431a(logState2, "[ExtraCrashManager] %s report is disabled.", str5);
                    C34012x4.m75431a(logState2, "[ExtraCrashManager] Successfully handled.", new Object[0]);
                    return;
                }
            } else if (!strategyBeanM74582c.f68573i) {
                LogState logState3 = LogState.ERROR;
                C34012x4.m75431a(logState3, "[ExtraCrashManager] %s report is disabled.", str5);
                C34012x4.m75431a(logState3, "[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            CrashDetailBean crashDetailBeanM74238b = m74238b(threadCurrentThread, i11 == 8 ? 5 : i11, str, str2, str3, map);
            if (crashDetailBeanM74238b == null) {
                LogState logState4 = LogState.ERROR;
                C34012x4.m75431a(logState4, "[ExtraCrashManager] Failed to package crash data.", new Object[0]);
                C34012x4.m75431a(logState4, "[ExtraCrashManager] Successfully handled.", new Object[0]);
                return;
            }
            C33724j3.m73469a(str5, C33571bi.m72572a(), this.f71033b.f70745f, threadCurrentThread.getName(), str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str3, crashDetailBeanM74238b);
            if (!this.f71034c.m73502a(crashDetailBeanM74238b, !C33745k3.m73653l().m73680k())) {
                this.f71034c.m73497a(crashDetailBeanM74238b, 3000L, false);
            }
            C34012x4.m75431a(LogState.ERROR, "[ExtraCrashManager] Successfully handled.", new Object[0]);
        } catch (Throwable th2) {
            try {
                if (!C34012x4.m75432a(LogState.WARN, th2)) {
                    th2.printStackTrace();
                }
                C34012x4.m75431a(LogState.ERROR, "[ExtraCrashManager] Successfully handled.", new Object[0]);
            } catch (Throwable th3) {
                C34012x4.m75431a(LogState.ERROR, "[ExtraCrashManager] Successfully handled.", new Object[0]);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final CrashDetailBean m74238b(Thread thread, int i11, String str, String str2, String str3, Map<String, String> map) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f68613L = C33830o4.m74406i();
        crashDetailBean.f68614M = C33830o4.m74408k();
        crashDetailBean.f68615N = C33830o4.m74400e();
        crashDetailBean.f68616O = this.f71033b.m73830C();
        crashDetailBean.f68617P = this.f71033b.m73831D();
        crashDetailBean.f68618Q = this.f71033b.m73832E();
        crashDetailBean.f68619R = C33830o4.m74395b(this.f71035d);
        crashDetailBean.f68620S = C33830o4.m74412o();
        crashDetailBean.f68621T = C33830o4.m74402f();
        crashDetailBean.f68622U = Runtime.getRuntime().maxMemory();
        crashDetailBean.f68623V = Runtime.getRuntime().totalMemory();
        crashDetailBean.f68631c = i11;
        crashDetailBean.f68643i = this.f71033b.m73890n();
        C33765l2 c33765l2 = this.f71033b;
        crashDetailBean.f68641h = c33765l2.f70752i0;
        crashDetailBean.f68645j = c33765l2.m73892o();
        C33765l2 c33765l3 = this.f71033b;
        crashDetailBean.f68647k = c33765l3.f70755k;
        crashDetailBean.f68649l = c33765l3.f70714F;
        crashDetailBean.f68655o = c33765l3.m73882j();
        C33765l2 c33765l4 = this.f71033b;
        crashDetailBean.f68651m = c33765l4.f70748g0;
        crashDetailBean.f68653n = c33765l4.m73868d();
        crashDetailBean.f68665v = this.f71033b.m73833F();
        crashDetailBean.f68657p = LifecycleCallback.INSTANCE.getOperationLogString();
        String str4 = "";
        crashDetailBean.f68666w = C33770l7.m73937a("", str);
        crashDetailBean.f68667x = C33770l7.m73937a("", str2);
        if (str3 == null) {
            str3 = "";
        } else {
            String[] strArrSplit = str3.split(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            if (strArrSplit.length > 0) {
                str4 = strArrSplit[0];
            }
        }
        crashDetailBean.f68668y = str4;
        crashDetailBean.f68669z = str3;
        crashDetailBean.f68602A = System.currentTimeMillis();
        crashDetailBean.f68605D = C33571bi.m72614c(crashDetailBean.f68669z.getBytes());
        crashDetailBean.f68610I = C33571bi.m72588a(this.f71033b.m73840M(), C33745k3.f70490B, false, false);
        crashDetailBean.f68611J = this.f71033b.f70745f;
        crashDetailBean.f68612K = thread.getName() + "(" + thread.getId() + ")";
        crashDetailBean.f68624W = this.f71033b.m73900x();
        crashDetailBean.f68659q = this.f71033b.m73898v();
        C33765l2 c33765l5 = this.f71033b;
        crashDetailBean.f68630b0 = c33765l5.f70739c;
        crashDetailBean.f68632c0 = c33765l5.m73838K();
        crashDetailBean.f68638f0 = this.f71033b.m73835H();
        crashDetailBean.f68640g0 = this.f71033b.m73828A();
        crashDetailBean.f68642h0 = this.f71033b.m73880i();
        crashDetailBean.f68644i0 = this.f71033b.m73878h();
        crashDetailBean.f68609H = C33627eb.m72943b();
        crashDetailBean.f68652m0 = C33955u7.m75163c().m75164a();
        crashDetailBean.f68654n0 = C33955u7.m75163c().m75167b();
        if (crashDetailBean.f68634d0 == null) {
            crashDetailBean.f68634d0 = new LinkedHashMap();
        }
        if (map != null) {
            crashDetailBean.f68634d0.putAll(map);
        }
        C33663g5.m73147b(crashDetailBean);
        return crashDetailBean;
    }
}
