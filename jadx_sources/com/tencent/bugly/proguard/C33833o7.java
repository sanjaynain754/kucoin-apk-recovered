package com.tencent.bugly.proguard;

import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33833o7 {

    /* JADX INFO: renamed from: a */
    public final Context f71320a;

    /* JADX INFO: renamed from: b */
    public final C33724j3 f71321b;

    /* JADX INFO: renamed from: c */
    public final C33863pg f71322c;

    /* JADX INFO: renamed from: d */
    public final C33765l2 f71323d;

    /* JADX INFO: renamed from: e */
    public Thread.UncaughtExceptionHandler f71324e;

    /* JADX INFO: renamed from: f */
    public C33555b2.a f71325f;

    /* JADX INFO: renamed from: a */
    public void m74432a(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        C34012x4.m75437b("H5 Crash Happen", new Object[0]);
        try {
            if (!this.f71322c.m74583d()) {
                C34012x4.m75431a(LogState.WARN, "no remote but still store!", new Object[0]);
            }
            StrategyBean strategyBeanM74582c = this.f71322c.m74582c();
            if (!strategyBeanM74582c.f68568d && this.f71322c.m74583d()) {
                LogState logState = LogState.ERROR;
                C34012x4.m75431a(logState, "crash report was closed by remote , will not upload to Bugly , print local for helpful!", new Object[0]);
                C33724j3.m73469a("H5", C33571bi.m72572a(), this.f71323d.f70745f, thread.getName(), str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str3, null);
                C34012x4.m75431a(logState, "handle end", new Object[0]);
                return;
            }
            if (!strategyBeanM74582c.f68574j) {
                LogState logState2 = LogState.ERROR;
                C34012x4.m75431a(logState2, "cocos report is disabled.", new Object[0]);
                C34012x4.m75431a(logState2, "handle end", new Object[0]);
                return;
            }
            CrashDetailBean crashDetailBeanM74433b = m74433b(thread, str, str2, str3, map);
            if (crashDetailBeanM74433b == null) {
                LogState logState3 = LogState.ERROR;
                C34012x4.m75431a(logState3, "pkg crash datas fail!", new Object[0]);
                C34012x4.m75431a(logState3, "handle end", new Object[0]);
                return;
            }
            C33724j3.m73469a("H5", C33571bi.m72572a(), this.f71323d.f70745f, thread.getName(), str + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str3, crashDetailBeanM74433b);
            if (!this.f71321b.m73502a(crashDetailBeanM74433b, true)) {
                this.f71321b.m73497a(crashDetailBeanM74433b, 3000L, false);
            }
            C34012x4.m75431a(LogState.ERROR, "handle end", new Object[0]);
        } catch (Throwable th2) {
            try {
                if (!C34012x4.m75432a(LogState.WARN, th2)) {
                    th2.printStackTrace();
                }
                C34012x4.m75431a(LogState.ERROR, "handle end", new Object[0]);
            } catch (Throwable th3) {
                C34012x4.m75431a(LogState.ERROR, "handle end", new Object[0]);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public CrashDetailBean m74433b(Thread thread, String str, String str2, String str3, Map<String, String> map) {
        CrashDetailBean crashDetailBean = new CrashDetailBean();
        crashDetailBean.f68613L = C33830o4.m74406i();
        crashDetailBean.f68614M = C33830o4.m74408k();
        crashDetailBean.f68615N = C33830o4.m74400e();
        crashDetailBean.f68616O = this.f71323d.m73830C();
        crashDetailBean.f68617P = this.f71323d.m73831D();
        crashDetailBean.f68619R = C33830o4.m74395b(this.f71320a);
        crashDetailBean.f68620S = C33830o4.m74412o();
        crashDetailBean.f68621T = C33830o4.m74402f();
        crashDetailBean.f68622U = Runtime.getRuntime().maxMemory();
        crashDetailBean.f68623V = Runtime.getRuntime().totalMemory();
        crashDetailBean.f68618Q = this.f71323d.m73832E();
        crashDetailBean.f68631c = 5;
        crashDetailBean.f68643i = this.f71323d.m73890n();
        crashDetailBean.f68645j = this.f71323d.m73892o();
        C33765l2 c33765l2 = this.f71323d;
        crashDetailBean.f68649l = c33765l2.f70714F;
        crashDetailBean.f68647k = c33765l2.f70755k;
        crashDetailBean.f68651m = c33765l2.f70748g0;
        crashDetailBean.f68653n = c33765l2.m73868d();
        crashDetailBean.f68657p = LifecycleCallback.INSTANCE.getOperationLogString();
        C33765l2 c33765l3 = this.f71323d;
        crashDetailBean.f68641h = c33765l3.f70752i0;
        crashDetailBean.f68655o = c33765l3.m73882j();
        crashDetailBean.f68665v = this.f71323d.m73833F();
        crashDetailBean.f68666w = C33770l7.m73937a("", str);
        crashDetailBean.f68667x = C33770l7.m73937a("", str2);
        crashDetailBean.f68668y = "0";
        crashDetailBean.f68669z = str3;
        crashDetailBean.f68602A = System.currentTimeMillis();
        crashDetailBean.f68605D = C33571bi.m72614c(crashDetailBean.f68669z.getBytes());
        crashDetailBean.f68610I = C33571bi.m72588a(this.f71323d.m73840M(), C33745k3.f70490B, false, false);
        crashDetailBean.f68611J = this.f71323d.f70745f;
        crashDetailBean.f68612K = thread.getName() + "(" + thread.getId() + ")";
        crashDetailBean.f68624W = this.f71323d.m73900x();
        crashDetailBean.f68659q = this.f71323d.m73898v();
        C33765l2 c33765l4 = this.f71323d;
        crashDetailBean.f68630b0 = c33765l4.f70739c;
        crashDetailBean.f68632c0 = c33765l4.m73838K();
        crashDetailBean.f68638f0 = this.f71323d.m73835H();
        crashDetailBean.f68640g0 = this.f71323d.m73828A();
        crashDetailBean.f68642h0 = this.f71323d.m73880i();
        crashDetailBean.f68644i0 = this.f71323d.m73878h();
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

    public C33833o7(Context context, C33724j3 c33724j3, C33863pg c33863pg, C33765l2 c33765l2, C33555b2.a aVar) {
        this.f71320a = context;
        this.f71321b = c33724j3;
        this.f71322c = c33863pg;
        this.f71323d = c33765l2;
        this.f71325f = aVar;
    }
}
