package com.tencent.rmonitor.sla;

import android.os.Handler;
import android.os.Message;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.ProcessUtil;
import com.tencent.bugly.proguard.C33673gf;
import com.tencent.bugly.proguard.C34042ye;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.tencent.rmonitor.sla.b */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
public class C35185b implements Handler.Callback {

    /* JADX INFO: renamed from: f */
    public static final String f75322f = "RMonitor_metric_sla_Helper";

    /* JADX INFO: renamed from: g */
    public static final int f75323g = 1;

    /* JADX INFO: renamed from: h */
    public static final int f75324h = 2;

    /* JADX INFO: renamed from: i */
    public static final long f75325i = 30000;

    /* JADX INFO: renamed from: j */
    public static final long f75326j = 1000;

    /* JADX INFO: renamed from: c */
    public boolean f75328c = false;

    /* JADX INFO: renamed from: b */
    public boolean f75327b = false;

    /* JADX INFO: renamed from: d */
    public final C35187d f75329d = new C35187d();

    /* JADX INFO: renamed from: e */
    public final Handler f75330e = new Handler(ThreadManager.getMonitorThreadLooper(), this);

    /* JADX INFO: renamed from: com.tencent.rmonitor.sla.b$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Logger logger = Logger.INSTANCE;
            logger.mo77132i(C35185b.f75322f, "checkSLAReportInner, begin, isSLAReported: " + C35185b.this.f75327b);
            C35185b c35185b = C35185b.this;
            if (!c35185b.f75327b) {
                c35185b.m77225a();
                C35185b.this.m77232h();
            }
            logger.mo77132i(C35185b.f75322f, "checkSLAReportInner, end, isSLAReported: " + C35185b.this.f75327b);
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.sla.b$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C35185b c35185b = C35185b.this;
            if (c35185b.f75328c) {
                return;
            }
            c35185b.f75328c = true;
            ArrayList arrayList = new ArrayList(2);
            arrayList.add("looper_metric");
            if (ProcessUtil.isMainProcess(BaseInfo.app)) {
                arrayList.add("memory_quantile");
            } else {
                arrayList.add("sub_memory_quantile");
            }
            C34042ye.m75504a(arrayList);
        }
    }

    /* JADX INFO: renamed from: com.tencent.rmonitor.sla.b$c */
    /* JADX INFO: compiled from: BUGLY */
    public static class c {

        /* JADX INFO: renamed from: a */
        public static final C35185b f75333a = new C35185b();
    }

    /* JADX INFO: renamed from: g */
    public void m77231g() {
        this.f75328c = true;
        this.f75327b = true;
        this.f75330e.removeMessages(1);
        this.f75330e.removeMessages(2);
        Logger.INSTANCE.mo77132i(f75322f, "disable metric and sla.");
    }

    /* JADX INFO: renamed from: b */
    public void m77226b() {
        m77227c();
        m77229e();
    }

    /* JADX INFO: renamed from: c */
    public void m77227c() {
        if (this.f75328c) {
            return;
        }
        this.f75330e.removeMessages(2);
        this.f75330e.sendEmptyMessageDelayed(2, 1000L);
    }

    /* JADX INFO: renamed from: e */
    public void m77229e() {
        if (this.f75327b) {
            return;
        }
        this.f75330e.removeMessages(1);
        this.f75330e.sendEmptyMessageDelayed(1, 30000L);
    }

    /* JADX INFO: renamed from: h */
    public void m77232h() {
        C35187d c35187d = this.f75329d;
        if (c35187d == null || this.f75327b) {
            return;
        }
        this.f75327b = c35187d.m77238a(1);
        Logger.INSTANCE.mo77132i(f75322f, "endStartRMonitor, isSLAReported: " + this.f75327b);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i11 = message.what;
        if (i11 == 1) {
            m77230f();
        } else if (i11 == 2) {
            m77228d();
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static C35185b m77224i() {
        return c.f75333a;
    }

    /* JADX INFO: renamed from: a */
    public void m77225a() {
        C35187d c35187d = this.f75329d;
        if (c35187d == null || this.f75327b) {
            return;
        }
        c35187d.m77237a();
        Logger.INSTANCE.mo77132i(f75322f, "beginStartRMonitor");
    }

    /* JADX INFO: renamed from: d */
    public final void m77228d() {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77132i(f75322f, "checkMetricReportInner, not match base info.");
        } else if (!this.f75328c) {
            C33673gf.m73197a(new b());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m77230f() {
        if (!C33673gf.m73198a()) {
            Logger.INSTANCE.mo77132i(f75322f, "checkSLAReportInner, not match base info limit.");
        } else if (!this.f75327b) {
            C33673gf.m73197a(new a());
        }
    }
}
