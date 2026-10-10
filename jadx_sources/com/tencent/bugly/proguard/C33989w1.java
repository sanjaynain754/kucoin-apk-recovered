package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.rmonitor.common.logger.LogState;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.w1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33989w1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: e */
    public static C33989w1 f72402e;

    /* JADX INFO: renamed from: b */
    public Context f72404b;

    /* JADX INFO: renamed from: c */
    public String f72405c;

    /* JADX INFO: renamed from: d */
    public boolean f72406d = true;

    /* JADX INFO: renamed from: a */
    public IntentFilter f72403a = new IntentFilter();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.w1$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C33989w1 f72407b;

        public a(C33989w1 c33989w1) {
            this.f72407b = c33989w1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C34012x4.m75440c(C33989w1.f72402e.getClass(), "Register broadcast receiver of Bugly.", new Object[0]);
                synchronized (this.f72407b) {
                    C33989w1 c33989w1 = C33989w1.this;
                    c33989w1.f72404b.registerReceiver(C33989w1.f72402e, c33989w1.f72403a, "com.tencent.bugly.BuglyBroadcastReceiver.permission", null);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C33989w1 m75332b() {
        try {
            if (f72402e == null) {
                f72402e = new C33989w1();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f72402e;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m75334a(String str) {
        try {
            if (!this.f72403a.hasAction(str)) {
                this.f72403a.addAction(str);
            }
            C34012x4.m75434a("add action %s", str);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            m75335a(context, intent);
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m75336b(Context context) {
        try {
            C34012x4.m75440c(getClass(), "Unregister broadcast receiver of Bugly.", new Object[0]);
            context.unregisterReceiver(this);
            this.f72404b = context;
        } catch (Throwable th2) {
            if (!C34012x4.m75438b(th2)) {
                th2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m75333a(Context context) {
        this.f72404b = context;
        C33571bi.m72595a(new a(this));
    }

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m75335a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                if (this.f72406d) {
                    this.f72406d = false;
                    return true;
                }
                String strM74391a = C33830o4.m74391a(this.f72404b);
                C34012x4.m75434a(C33770l7.m73937a("is Connect BC ", strM74391a), new Object[0]);
                Object[] objArr = {"" + this.f72405c, C33770l7.m73937a("", strM74391a)};
                LogState logState = LogState.INFO;
                C34012x4.m75431a(logState, "network %s changed to %s", objArr);
                if (strM74391a == null) {
                    this.f72405c = null;
                    return true;
                }
                String str = this.f72405c;
                this.f72405c = strM74391a;
                long jCurrentTimeMillis = System.currentTimeMillis();
                C33863pg c33863pgM74576b = C33863pg.m74576b();
                C33905rh c33905rhM74876d = C33905rh.m74876d();
                C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
                if (c33863pgM74576b != null && c33905rhM74876d != null && c33765l2M73825a != null) {
                    if (!strM74391a.equals(str) && jCurrentTimeMillis - c33905rhM74876d.m74895c(C33745k3.f70507n) > 30000) {
                        C34012x4.m75431a(logState, "try to upload crash on network changed.", new Object[0]);
                        C33745k3 c33745k3M73653l = C33745k3.m73653l();
                        if (c33745k3M73653l != null) {
                            c33745k3M73653l.m73660a(0L, false);
                        }
                        C34012x4.m75431a(logState, "try to upload userinfo on network changed.", new Object[0]);
                        C33918sa.f71856p.m75254c(false);
                    }
                    return true;
                }
                C34012x4.m75431a(LogState.WARN, "not inited BC not work", new Object[0]);
                return true;
            }
        }
        return false;
    }
}
