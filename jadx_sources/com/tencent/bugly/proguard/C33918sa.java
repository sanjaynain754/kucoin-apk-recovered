package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.sa */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33918sa {

    /* JADX INFO: renamed from: a */
    public static final int f71841a = 1001;

    /* JADX INFO: renamed from: b */
    public static final int f71842b = 1;

    /* JADX INFO: renamed from: c */
    public static final int f71843c = 0;

    /* JADX INFO: renamed from: d */
    public static boolean f71844d = false;

    /* JADX INFO: renamed from: e */
    public static final int f71845e = 10;

    /* JADX INFO: renamed from: f */
    public static final long f71846f = 30000;

    /* JADX INFO: renamed from: g */
    public static final long f71847g = 300000;

    /* JADX INFO: renamed from: h */
    public static final long f71848h = 21600000;

    /* JADX INFO: renamed from: i */
    public static int f71849i = 10;

    /* JADX INFO: renamed from: j */
    public static long f71850j = 300000;

    /* JADX INFO: renamed from: k */
    public static long f71851k = 30000;

    /* JADX INFO: renamed from: l */
    public static long f71852l = 0;

    /* JADX INFO: renamed from: m */
    public static int f71853m = 0;

    /* JADX INFO: renamed from: n */
    public static long f71854n = 0;

    /* JADX INFO: renamed from: o */
    public static long f71855o = 0;

    /* JADX INFO: renamed from: p */
    public static C33969v1 f71856p = null;

    /* JADX INFO: renamed from: q */
    public static long f71857q = 0;

    /* JADX INFO: renamed from: r */
    public static IActivityStateCallback f71858r = null;

    /* JADX INFO: renamed from: s */
    public static Class<?> f71859s = null;

    /* JADX INFO: renamed from: t */
    public static boolean f71860t = true;

    /* JADX INFO: renamed from: u */
    public static boolean f71861u = false;

    /* JADX INFO: renamed from: v */
    public static final long f71862v = 1000;

    /* JADX INFO: renamed from: w */
    public static long f71863w = 1000;

    /* JADX INFO: renamed from: x */
    public static long f71864x;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.sa$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f71865b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C33555b2 f71866c;

        public a(Context context, C33555b2 c33555b2) {
            this.f71865b = context;
            this.f71866c = c33555b2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C33918sa.m74940c(this.f71865b, this.f71866c);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.sa$b */
    /* JADX INFO: compiled from: BUGLY */
    public static class b implements IActivityStateCallback {

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.sa$b$a */
        /* JADX INFO: compiled from: BUGLY */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C33918sa.f71856p.m75239a(4);
            }
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onBackground() {
            if (C33918sa.f71861u) {
                C33918sa.f71864x = System.currentTimeMillis();
            }
            C33765l2.m73827s().m73853a(false);
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onCreate(@NotNull Activity activity) {
            String name = activity.getClass().getName();
            if (C33918sa.f71859s != null && !C33918sa.f71859s.getName().equals(name)) {
                return;
            }
            C34012x4.m75434a(">>> %s onCreated <<<", name);
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onDestroy(@NotNull Activity activity) {
            String name = activity.getClass().getName();
            if (C33918sa.f71859s != null && !C33918sa.f71859s.getName().equals(name)) {
                return;
            }
            C34012x4.m75434a(">>> %s onDestroyed <<<", name);
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onForeground() {
            C33765l2.m73827s().m73853a(true);
            if (C33918sa.f71861u && C33918sa.f71864x != 0 && System.currentTimeMillis() - C33918sa.f71864x > C33918sa.f71863w) {
                C34012x4.m75442d("onForeground, lastBackgroundTime: " + C33918sa.f71864x + ",backgroundIntervalMills = " + C33918sa.f71863w, new Object[0]);
                C33784m0.m74004c().m74007a(new a(), 0L);
            }
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onPause(@NotNull Activity activity) {
            String name = activity.getClass().getName();
            if (C33918sa.f71859s == null || C33918sa.f71859s.getName().equals(name)) {
                C34012x4.m75434a(">>> %s onPaused <<<", name);
                C33765l2 c33765l2M73827s = C33765l2.m73827s();
                if (c33765l2M73827s == null) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                c33765l2M73827s.f70736a0 = jCurrentTimeMillis;
                long j11 = jCurrentTimeMillis - c33765l2M73827s.f70734Z;
                c33765l2M73827s.f70738b0 = j11;
                C33918sa.f71854n = jCurrentTimeMillis;
                if (j11 < 0) {
                    c33765l2M73827s.f70738b0 = 0L;
                }
                c33765l2M73827s.f70733Y = "background";
            }
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onResume(@NotNull Activity activity) {
            C33657g.m73095h().m73097a(activity);
            String name = activity.getClass().getName();
            if (C33918sa.f71859s == null || C33918sa.f71859s.getName().equals(name)) {
                C34012x4.m75434a(">>> %s onResumed <<<", name);
                C33765l2 c33765l2M73827s = C33765l2.m73827s();
                if (c33765l2M73827s != null) {
                    c33765l2M73827s.f70733Y = name;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c33765l2M73827s.f70734Z = jCurrentTimeMillis;
                    c33765l2M73827s.f70740c0 = jCurrentTimeMillis - C33918sa.f71855o;
                    long j11 = jCurrentTimeMillis - C33918sa.f71854n;
                    long j12 = C33918sa.f71852l;
                    if (j12 <= 0) {
                        j12 = C33918sa.f71851k;
                    }
                    if (j11 > j12) {
                        c33765l2M73827s.m73845R();
                        C33918sa.m74953n();
                        Object[] objArr = {Long.valueOf(j11 / 1000), Long.valueOf(C33918sa.f71851k / 1000)};
                        LogState logState = LogState.INFO;
                        C34012x4.m75431a(logState, "[session] launch app one times (app in background %d seconds and over %d seconds)", objArr);
                        if (C33918sa.f71853m % C33918sa.f71849i == 0) {
                            C33918sa.f71856p.m75240a(4, C33918sa.f71860t, 0L);
                            return;
                        }
                        C33918sa.f71856p.m75240a(4, false, 0L);
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (jCurrentTimeMillis2 - C33918sa.f71857q > C33918sa.f71850j) {
                            C33918sa.f71857q = jCurrentTimeMillis2;
                            C34012x4.m75431a(logState, "add a timer to upload hot start user info", new Object[0]);
                            if (C33918sa.f71860t) {
                                C33918sa.f71856p.m75241a(C33918sa.f71850j);
                            }
                        }
                    }
                }
            }
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onStart(@NotNull Activity activity) {
            C34012x4.m75434a(">>> %s onStart <<<", activity.getClass().getName());
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onStop(@NotNull Activity activity) {
            C34012x4.m75434a(">>> %s onStop <<<", activity.getClass().getName());
        }

        @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
        public void onPostCreate(@NotNull Activity activity) {
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m74943d(long j11) {
        if (j11 < 0) {
            j11 = C33863pg.m74576b().m74582c().f68578n;
        }
        f71852l = j11;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ int m74953n() {
        int i11 = f71853m;
        f71853m = i11 + 1;
        return i11;
    }

    /* JADX INFO: renamed from: p */
    public static void m74955p() {
        C33969v1 c33969v1 = f71856p;
        if (c33969v1 != null) {
            c33969v1.m75240a(2, false, 0L);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m74956q() {
        try {
            if (f71858r == null) {
                f71858r = new b();
            }
            LifecycleCallback.register(f71858r);
        } catch (Exception e11) {
            if (C34012x4.m75438b(e11)) {
                return;
            }
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m74957r() {
        try {
            IActivityStateCallback iActivityStateCallback = f71858r;
            if (iActivityStateCallback != null) {
                LifecycleCallback.unRegister(iActivityStateCallback);
            }
        } catch (Exception e11) {
            if (C34012x4.m75438b(e11)) {
                return;
            }
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m74937b(Context context, C33555b2 c33555b2) {
        long jM72418c;
        if (f71844d) {
            return;
        }
        f71860t = C33765l2.m73825a(context).f70751i;
        f71856p = new C33969v1(context, f71860t);
        try {
            m74939c(context);
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                LifecycleCallback.init((Application) applicationContext);
                m74956q();
            }
        } catch (Throwable th2) {
            C34012x4.m75435a(th2);
        }
        f71844d = true;
        if (c33555b2 != null) {
            f71859s = c33555b2.m72439k();
            jM72418c = c33555b2.m72418c();
        } else {
            jM72418c = 0;
        }
        if (jM72418c <= 0) {
            m74940c(context, c33555b2);
        } else {
            C33784m0.m74004c().m74007a(new a(context, c33555b2), jM72418c);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m74940c(Context context, C33555b2 c33555b2) {
        boolean zM72451v;
        if (c33555b2 != null) {
            zM72451v = c33555b2.m72451v();
            c33555b2.m72446q();
        } else {
            zM72451v = false;
        }
        if ((!zM72451v || m74933a(context)) && f71860t) {
            m74954o();
            f71856p.m75238a();
            f71856p.m75250b(f71848h);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m74954o() {
        f71855o = System.currentTimeMillis();
        f71856p.m75240a(1, true, 0L);
        C34012x4.m75442d("[session] launch app, new start", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m74933a(Context context) {
        C33765l2 c33765l2M73825a = C33765l2.m73825a(context);
        List<UserInfoBean> listM75235a = f71856p.m75235a(c33765l2M73825a.f70745f);
        if (listM75235a == null) {
            return true;
        }
        for (int i11 = 0; i11 < listM75235a.size(); i11++) {
            UserInfoBean userInfoBean = listM75235a.get(i11);
            if (userInfoBean.f68552o.equals(c33765l2M73825a.f70714F) && userInfoBean.f68540c == 1) {
                long jM72601b = C33571bi.m72601b();
                if (jM72601b <= 0) {
                    return true;
                }
                if (userInfoBean.f68543f >= jM72601b) {
                    if (userInfoBean.f68544g <= 0) {
                        f71856p.m75254c(false);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m74939c(Context context) {
        C33765l2 c33765l2M73827s = C33765l2.m73827s();
        if (c33765l2M73827s == null) {
            return;
        }
        if (LifecycleCallback.INSTANCE.isCurrentAppOnForeground(context)) {
            c33765l2M73827s.m73853a(true);
        } else {
            f71864x = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m74931a(boolean z11, long j11) {
        f71861u = z11;
        if (j11 > 0) {
            f71863w = j11;
        } else {
            f71863w = 1000L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m74936b(Context context) {
        if (!f71844d || context == null) {
            return;
        }
        m74957r();
        f71844d = false;
    }

    /* JADX INFO: renamed from: a */
    public static void m74930a(StrategyBean strategyBean, boolean z11) {
        C33969v1 c33969v1 = f71856p;
        if (c33969v1 != null && !z11) {
            c33969v1.m75254c(false);
        }
        if (strategyBean == null) {
            return;
        }
        long j11 = strategyBean.f68578n;
        if (j11 > 0) {
            f71851k = j11;
        }
        int i11 = strategyBean.f68583s;
        if (i11 > 0) {
            f71849i = i11;
        }
        long j12 = strategyBean.f68584t;
        if (j12 > 0) {
            f71850j = j12;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m74928a(String str, String str2) {
        return C33571bi.m72572a() + "  " + str + "  " + str2 + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE;
    }
}
