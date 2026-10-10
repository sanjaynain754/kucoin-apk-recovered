package com.tencent.bugly.proguard;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.rmonitor.common.logger.LogState;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.l3 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33766l3 extends AbstractC33575c1 {

    /* JADX INFO: renamed from: h */
    public static final int f70787h = 1004;

    /* JADX INFO: renamed from: i */
    public static int f70788i;

    /* JADX INFO: renamed from: j */
    public static C33766l3 f70789j = new C33766l3();

    /* JADX INFO: renamed from: e */
    public long f70790e;

    /* JADX INFO: renamed from: f */
    public C33555b2.a f70791f;

    /* JADX INFO: renamed from: g */
    public boolean f70792g = false;

    @Override // com.tencent.bugly.proguard.AbstractC33575c1
    /* JADX INFO: renamed from: a */
    public synchronized void mo72633a(Context context, boolean z11, C33555b2 c33555b2) {
        if (context != null) {
            try {
                if (!this.f70792g) {
                    C34012x4.m75442d("Initializing crash module.", new Object[0]);
                    C33871q3 c33871q3M74644a = C33871q3.m74644a();
                    int i11 = f70788i + 1;
                    f70788i = i11;
                    c33871q3M74644a.m74656a(1004, i11);
                    this.f70792g = true;
                    C33891r3.f71604a = context;
                    m73904a(context, c33555b2);
                    C33745k3 c33745k3M73647a = C33745k3.m73647a(1004, context, z11, this.f70791f, null, null);
                    c33745k3M73647a.m73694z();
                    if (c33555b2 != null) {
                        c33745k3M73647a.m73659a(c33555b2.mo72424e());
                        c33745k3M73647a.m73667a(c33555b2.mo72429f());
                        C33745k3.f70497I = c33555b2.m72450u();
                        C33765l2.m73825a(context).m73871d(c33555b2.m72445p());
                        if (c33555b2.m72443n()) {
                            c33745k3M73647a.m73693y();
                        } else {
                            c33745k3M73647a.m73655B();
                        }
                    } else {
                        c33745k3M73647a.m73693y();
                    }
                    c33745k3M73647a.m73670b();
                    if (c33555b2 == null || c33555b2.m72444o()) {
                        c33745k3M73647a.m73654A();
                    } else {
                        C34012x4.m75431a(LogState.INFO, "[crash] Closed native crash monitor!", new Object[0]);
                        c33745k3M73647a.m73675f();
                    }
                    if (c33555b2 == null || c33555b2.m72442m()) {
                        c33745k3M73647a.m73692x();
                    } else {
                        C34012x4.m75431a(LogState.INFO, "[crash] Closed ANR monitor!", new Object[0]);
                        c33745k3M73647a.m73673d();
                    }
                    if (c33555b2 != null) {
                        C33745k3.f70516w = c33555b2.m72447r();
                    }
                    c33745k3M73647a.m73660a(c33555b2 != null ? c33555b2.m72418c() : 0L, true);
                    C33810n5.m74233a(context);
                    C33989w1 c33989w1M75332b = C33989w1.m75332b();
                    c33989w1M75332b.m75334a("android.net.conn.CONNECTIVITY_CHANGE");
                    c33989w1M75332b.m75333a(context);
                    C33871q3 c33871q3M74644a2 = C33871q3.m74644a();
                    int i12 = f70788i - 1;
                    f70788i = i12;
                    c33871q3M74644a2.m74656a(1004, i12);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m73905c() {
        return this.f70792g;
    }

    /* JADX INFO: renamed from: b */
    public static C33766l3 m73903b() {
        C33766l3 c33766l3 = f70789j;
        c33766l3.f69317a = 1004;
        return c33766l3;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m73904a(Context context, C33555b2 c33555b2) {
        if (c33555b2 == null) {
            return;
        }
        try {
            String strM72436j = c33555b2.m72436j();
            if (!TextUtils.isEmpty(strM72436j)) {
                C33765l2.m73825a(context).f70723O = strM72436j;
                C34012x4.m75442d("setted libBugly.so file path :%s", strM72436j);
            }
            if (c33555b2.mo72430g() != null) {
                this.f70791f = c33555b2.mo72430g();
                C34012x4.m75442d("setted CrashHanldeCallback", new Object[0]);
            }
            if (c33555b2.m72418c() > 0) {
                long jM72418c = c33555b2.m72418c();
                this.f70790e = jM72418c;
                C34012x4.m75442d("setted delay: %d", Long.valueOf(jM72418c));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.tencent.bugly.proguard.AbstractC33575c1
    /* JADX INFO: renamed from: a */
    public void mo72636a(StrategyBean strategyBean) {
        C33745k3 c33745k3M73653l;
        if (strategyBean == null || (c33745k3M73653l = C33745k3.m73653l()) == null) {
            return;
        }
        c33745k3M73653l.m73661a(strategyBean);
    }

    @Override // com.tencent.bugly.proguard.AbstractC33575c1
    /* JADX INFO: renamed from: a */
    public String[] mo72637a() {
        return new String[]{C33641f4.f69817d};
    }
}
