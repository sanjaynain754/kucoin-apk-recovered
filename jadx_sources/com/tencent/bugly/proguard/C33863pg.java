package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.pg */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33863pg {

    /* JADX INFO: renamed from: f */
    public static int f71436f = 1000;

    /* JADX INFO: renamed from: g */
    public static C33863pg f71437g = null;

    /* JADX INFO: renamed from: h */
    public static final String f71438h = "gateway";

    /* JADX INFO: renamed from: i */
    public static final String f71439i = "device";

    /* JADX INFO: renamed from: j */
    public static final long f71440j = 2097152;

    /* JADX INFO: renamed from: k */
    public static final long f71441k = 2097152;

    /* JADX INFO: renamed from: l */
    public static long f71442l = 259200000;

    /* JADX INFO: renamed from: m */
    public static final int f71443m = 50;

    /* JADX INFO: renamed from: n */
    public static final int f71444n = 50;

    /* JADX INFO: renamed from: o */
    public static final int f71445o = 200;

    /* JADX INFO: renamed from: p */
    public static final int f71446p = 100;

    /* JADX INFO: renamed from: q */
    public static final int f71447q = 500;

    /* JADX INFO: renamed from: r */
    public static String f71448r;

    /* JADX INFO: renamed from: a */
    public final List<AbstractC33575c1> f71449a;

    /* JADX INFO: renamed from: e */
    public Context f71453e;

    /* JADX INFO: renamed from: d */
    public StrategyBean f71452d = null;

    /* JADX INFO: renamed from: c */
    public final StrategyBean f71451c = new StrategyBean();

    /* JADX INFO: renamed from: b */
    public final C33784m0 f71450b = C33784m0.m74004c();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pg$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends Thread {
        public a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Map<String, byte[]> mapM72907a = C33620e4.m72891a().m72907a(C33863pg.f71436f, (InterfaceC33599d4) null, true);
                if (mapM72907a != null) {
                    byte[] bArr = mapM72907a.get("device");
                    byte[] bArr2 = mapM72907a.get(C33863pg.f71438h);
                    if (bArr != null) {
                        C33765l2.m73825a(C33863pg.this.f71453e).m73887l(new String(bArr));
                    }
                    if (bArr2 != null) {
                        C33765l2.m73825a(C33863pg.this.f71453e).m73885k(new String(bArr2));
                    }
                }
                C33863pg c33863pg = C33863pg.this;
                c33863pg.f71452d = c33863pg.m74584e();
                if (C33863pg.this.f71452d != null) {
                    if (C33571bi.m72617c(C33863pg.f71448r) || !C33571bi.m72620e(C33863pg.f71448r)) {
                        C33863pg.this.f71452d.f68579o = StrategyBean.f68563w;
                        C33863pg.this.f71452d.f68580p = StrategyBean.f68564x;
                    } else {
                        C33863pg.this.f71452d.f68579o = C33863pg.f71448r;
                        C33863pg.this.f71452d.f68580p = C33863pg.f71448r;
                    }
                }
            } catch (Throwable th2) {
                if (!C34012x4.m75438b(th2)) {
                    th2.printStackTrace();
                }
            }
            C33863pg c33863pg2 = C33863pg.this;
            c33863pg2.m74580a(c33863pg2.f71452d, false);
        }
    }

    /* JADX INFO: renamed from: c */
    public StrategyBean m74582c() {
        StrategyBean strategyBean = this.f71452d;
        if (strategyBean != null) {
            if (!C33571bi.m72620e(strategyBean.f68579o)) {
                this.f71452d.f68579o = StrategyBean.f68563w;
            }
            if (!C33571bi.m72620e(this.f71452d.f68580p)) {
                this.f71452d.f68580p = StrategyBean.f68564x;
            }
            return this.f71452d;
        }
        if (!C33571bi.m72617c(f71448r) && C33571bi.m72620e(f71448r)) {
            StrategyBean strategyBean2 = this.f71451c;
            String str = f71448r;
            strategyBean2.f68579o = str;
            strategyBean2.f68580p = str;
        }
        return this.f71451c;
    }

    /* JADX INFO: renamed from: d */
    public synchronized boolean m74583d() {
        return this.f71452d != null;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C33863pg m74576b() {
        return f71437g;
    }

    public C33863pg(Context context, List<AbstractC33575c1> list) {
        this.f71453e = context;
        this.f71449a = list;
    }

    /* JADX INFO: renamed from: b */
    public static void m74577b(StrategyBean strategyBean, C33569bg c33569bg) {
        if (C33571bi.m72617c(f71448r) || !C33571bi.m72620e(f71448r)) {
            if (C33571bi.m72620e(c33569bg.f69289t)) {
                C34012x4.m75434a("[Strategy] Upload url changes to %s", c33569bg.f69289t);
                strategyBean.f68579o = c33569bg.f69289t;
            }
            if (C33571bi.m72620e(c33569bg.f69290u)) {
                C34012x4.m75434a("[Strategy] Exception upload url changes to %s", c33569bg.f69290u);
                strategyBean.f68580p = c33569bg.f69290u;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public StrategyBean m74584e() {
        byte[] bArr;
        List<C33543ab> listM72905a = C33620e4.m72891a().m72905a(2);
        if (listM72905a != null && listM72905a.size() > 0 && (bArr = listM72905a.get(0).f68825g) != null) {
            return (StrategyBean) C33571bi.m72571a(bArr, StrategyBean.CREATOR);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33863pg m74571a(Context context, List<AbstractC33575c1> list) {
        try {
            if (f71437g == null) {
                f71437g = new C33863pg(context, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f71437g;
    }

    /* JADX INFO: renamed from: a */
    public void m74579a(long j11) {
        this.f71450b.m74007a(new a(), j11);
    }

    /* JADX INFO: renamed from: a */
    public void m74580a(StrategyBean strategyBean, boolean z11) {
        C34012x4.m75434a("[Strategy] Notify %s", C33918sa.class.getName());
        C33918sa.m74930a(strategyBean, z11);
        for (AbstractC33575c1 abstractC33575c1 : this.f71449a) {
            try {
                C34012x4.m75431a(LogState.DEBUG, "[Strategy] Notify %s", abstractC33575c1.getClass().getName());
                abstractC33575c1.mo72636a(strategyBean);
            } catch (Throwable th2) {
                if (!C34012x4.m75432a(LogState.WARN, th2)) {
                    th2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m74578c(StrategyBean strategyBean, C33569bg c33569bg) {
        Map<String, String> map;
        if (strategyBean == null || c33569bg == null || (map = c33569bg.f69292w) == null || map.size() <= 0) {
            return;
        }
        Map<String, String> map2 = c33569bg.f69292w;
        strategyBean.f68582r = map2;
        String str = map2.get(C33556b3.f68957H1);
        boolean z11 = false;
        strategyBean.f68571g = str != null && str.equals("1");
        String str2 = c33569bg.f69292w.get(C33556b3.f69121z1);
        if (str2 != null) {
            strategyBean.f68585u = Long.parseLong(str2);
        }
        long j11 = c33569bg.f69285B;
        strategyBean.f68578n = j11;
        strategyBean.f68584t = j11;
        String str3 = c33569bg.f69292w.get(C33556b3.f69009W1);
        if (str3 != null && str3.length() > 0) {
            try {
                int i11 = Integer.parseInt(str3);
                if (i11 > 0) {
                    strategyBean.f68583s = i11;
                }
            } catch (Exception e11) {
                if (!C34012x4.m75438b(e11)) {
                    e11.printStackTrace();
                }
            }
        }
        String str4 = c33569bg.f69292w.get(C33556b3.f69006V1);
        if (str4 != null && str4.equals("1")) {
            z11 = true;
        }
        strategyBean.f68573i = z11;
    }

    /* JADX INFO: renamed from: a */
    public static void m74574a(String str) {
        if (!C33571bi.m72617c(str) && C33571bi.m72620e(str)) {
            f71448r = str;
        } else {
            C34012x4.m75444f("URL user set is invalid.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74581a(C33569bg c33569bg) {
        C33620e4 c33620e4;
        if (c33569bg == null) {
            return;
        }
        StrategyBean strategyBean = this.f71452d;
        if (strategyBean == null || c33569bg.f69293x != strategyBean.f68577m) {
            StrategyBean strategyBean2 = new StrategyBean();
            strategyBean2.f68568d = c33569bg.f69286q;
            strategyBean2.f68570f = c33569bg.f69288s;
            strategyBean2.f68569e = c33569bg.f69287r;
            m74577b(strategyBean2, c33569bg);
            m74573a(strategyBean2, c33569bg);
            long j11 = c33569bg.f69293x;
            if (j11 != 0) {
                strategyBean2.f68577m = j11;
            }
            m74578c(strategyBean2, c33569bg);
            C34012x4.m75442d("[Strategy] enableCrashReport:%b, enableQuery:%b, enableUserInfo:%b, enableAnr:%b, enableBlock:%b, enableSession:%b, enableSessionTimer:%b, sessionOverTime:%d, enableCocos:%b, strategyLastUpdateTime:%d", Boolean.valueOf(strategyBean2.f68568d), Boolean.valueOf(strategyBean2.f68570f), Boolean.valueOf(strategyBean2.f68569e), Boolean.valueOf(strategyBean2.f68571g), Boolean.valueOf(strategyBean2.f68572h), Boolean.valueOf(strategyBean2.f68575k), Boolean.valueOf(strategyBean2.f68576l), Long.valueOf(strategyBean2.f68578n), Boolean.valueOf(strategyBean2.f68573i), Long.valueOf(strategyBean2.f68577m));
            this.f71452d = strategyBean2;
            if (!C33571bi.m72620e(c33569bg.f69289t)) {
                C34012x4.m75431a(LogState.DEBUG, "[Strategy] download url is null", new Object[0]);
                this.f71452d.f68579o = "";
            }
            if (!C33571bi.m72620e(c33569bg.f69290u)) {
                C34012x4.m75431a(LogState.DEBUG, "[Strategy] download crashurl is null", new Object[0]);
                this.f71452d.f68580p = "";
            }
            C33620e4.m72891a().m72916c(2);
            C33543ab c33543ab = new C33543ab();
            c33543ab.f68820b = 2;
            c33543ab.f68819a = strategyBean2.f68566b;
            c33543ab.f68823e = strategyBean2.f68567c;
            c33543ab.f68825g = C33571bi.m72596a(strategyBean2);
            synchronized (C33620e4.class) {
                c33620e4 = C33620e4.f69668a;
            }
            c33620e4.m72918d(c33543ab);
            m74580a(strategyBean2, true);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74573a(StrategyBean strategyBean, C33569bg c33569bg) {
        C33548ag c33548ag = c33569bg.f69291v;
        if (c33548ag == null || C33571bi.m72617c(c33548ag.f68870q)) {
            return;
        }
        strategyBean.f68581q = c33569bg.f69291v.f68870q;
    }
}
