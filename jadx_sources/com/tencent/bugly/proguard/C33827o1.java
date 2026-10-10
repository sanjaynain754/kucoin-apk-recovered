package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.Application;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.o1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33827o1 implements IActivityStateCallback {

    /* JADX INFO: renamed from: s */
    public static final String f71253s = "BatteryMonitor";

    /* JADX INFO: renamed from: t */
    public static final int f71254t = 1;

    /* JADX INFO: renamed from: u */
    public static final long f71255u = 60000;

    /* JADX INFO: renamed from: v */
    public static final long f71256v = 600000;

    /* JADX INFO: renamed from: w */
    public static final int f71257w = 1;

    /* JADX INFO: renamed from: x */
    public static final int f71258x = 2;

    /* JADX INFO: renamed from: b */
    public final C33697hi f71259b;

    /* JADX INFO: renamed from: c */
    public final C33606db f71260c;

    /* JADX INFO: renamed from: d */
    public final C33846p f71261d;

    /* JADX INFO: renamed from: e */
    public C33862pf f71262e;

    /* JADX INFO: renamed from: f */
    public ReportData f71263f;

    /* JADX INFO: renamed from: g */
    public final C33659g1 f71264g;

    /* JADX INFO: renamed from: h */
    public int f71265h;

    /* JADX INFO: renamed from: i */
    public long f71266i;

    /* JADX INFO: renamed from: j */
    public final C33902re f71267j;

    /* JADX INFO: renamed from: k */
    public boolean f71268k;

    /* JADX INFO: renamed from: l */
    public boolean f71269l;

    /* JADX INFO: renamed from: m */
    public long f71270m;

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f71271n;

    /* JADX INFO: renamed from: o */
    public final Handler f71272o;

    /* JADX INFO: renamed from: p */
    public final C33672ge.d f71273p;

    /* JADX INFO: renamed from: q */
    public final C33585cb.b f71274q;

    /* JADX INFO: renamed from: r */
    public final C33825o.d f71275r;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o1$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C33827o1.this.m74379a(jCurrentTimeMillis);
                C33827o1.this.m74389f(jCurrentTimeMillis);
                C33827o1.this.m74386d();
                C33827o1.this.m74385c(jCurrentTimeMillis);
                sendMessageDelayed(obtainMessage(1), 60000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o1$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements C33672ge.d {
        @Override // com.tencent.bugly.proguard.C33672ge.d
        /* JADX INFO: renamed from: a */
        public void mo73193a(C33676gi c33676gi, String str, @Nullable WorkSource workSource, @Nullable String str2) {
            Logger.INSTANCE.mo77132i(C33827o1.f71253s, "onAcquireWakeLock, tag = " + c33676gi.f70023k + ", scene = " + c33676gi.f72398e + ", token = " + c33676gi.f70024l);
            C33827o1.this.f71259b.m72752a(c33676gi);
            C33659g1 c33659g1 = C33827o1.this.f71264g;
            c33659g1.f69933g = c33659g1.f69933g + 1;
        }

        public b() {
        }

        @Override // com.tencent.bugly.proguard.C33672ge.d
        /* JADX INFO: renamed from: a */
        public void mo73192a(IBinder iBinder, int i11) {
            Logger.INSTANCE.mo77132i(C33827o1.f71253s, "onReleaseWakeLock, token = " + iBinder);
            C33827o1.this.f71259b.m73291a(iBinder);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o1$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements C33585cb.b {
        @Override // com.tencent.bugly.proguard.C33585cb.b
        /* JADX INFO: renamed from: a */
        public void mo72680a(C33564bb c33564bb, long j11, float f11) {
            Logger.INSTANCE.mo77132i(C33827o1.f71253s, "onRequestLocationUpdates，hashCode = " + c33564bb.f69165k + ", pendingIntent = " + c33564bb.f69164j);
            C33827o1.this.f71260c.m72752a(c33564bb);
            C33659g1 c33659g1 = C33827o1.this.f71264g;
            c33659g1.f69932f = c33659g1.f69932f + 1;
        }

        public c() {
        }

        @Override // com.tencent.bugly.proguard.C33585cb.b
        /* JADX INFO: renamed from: a */
        public void mo72679a(int i11, PendingIntent pendingIntent) {
            Logger.INSTANCE.mo77132i(C33827o1.f71253s, "onRemoveLocationUpdates, hashCode = " + i11 + ", pendingIntent = " + pendingIntent);
            C33827o1.this.f71260c.m72819a(i11, pendingIntent);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o1$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d implements C33825o.d {
        @Override // com.tencent.bugly.proguard.C33825o.d
        /* JADX INFO: renamed from: a */
        public void mo74361a(C33804n c33804n, long j11, long j12, int i11, AlarmManager.OnAlarmListener onAlarmListener) {
            Logger.INSTANCE.mo77132i(C33827o1.f71253s, "onAlarmSet, operation = " + c33804n.f71009m);
            C33827o1.this.f71261d.m74487a(c33804n);
            C33659g1 c33659g1 = C33827o1.this.f71264g;
            c33659g1.f69934h++;
            int i12 = c33804n.f71006j;
            if (i12 == 0 || i12 == 2) {
                c33659g1.f69935i++;
            } else {
                c33659g1.f69936j++;
            }
        }

        public d() {
        }

        @Override // com.tencent.bugly.proguard.C33825o.d
        /* JADX INFO: renamed from: a */
        public void mo74360a(PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener) {
            Logger.INSTANCE.mo77132i(C33827o1.f71253s, "onAlarmRemove, operation = " + pendingIntent);
            C33827o1.this.f71261d.m74486a(pendingIntent, onAlarmListener);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o1$e */
    /* JADX INFO: compiled from: BUGLY */
    public class e implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f71280b;

        public e(String str) {
            this.f71280b = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            C33827o1.this.f71267j.m74854r();
            C33902re.c cVarM74848l = C33827o1.this.f71267j.m74848l();
            if (cVarM74848l == null) {
                return;
            }
            C33827o1.this.f71264g.m73121a(this.f71280b, cVarM74848l.f71719n, cVarM74848l.f71723r + cVarM74848l.f71722q);
            C33827o1.this.m74386d();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.o1$f */
    /* JADX INFO: compiled from: BUGLY */
    public static final class f {

        /* JADX INFO: renamed from: a */
        public static final C33827o1 f71282a = new C33827o1();
    }

    public /* synthetic */ C33827o1(a aVar) {
        this();
    }

    public C33827o1() {
        this.f71262e = new C33862pf();
        this.f71263f = null;
        C33659g1 c33659g1 = new C33659g1();
        this.f71264g = c33659g1;
        this.f71267j = new C33902re(false);
        this.f71268k = true;
        this.f71269l = true;
        this.f71271n = new AtomicBoolean(false);
        this.f71272o = new a(ThreadManager.getMonitorThreadLooper());
        this.f71273p = new b();
        this.f71274q = new c();
        this.f71275r = new d();
        c33659g1.f69928b = AppInfo.obtainProcessName(BaseInfo.app);
        c33659g1.f69929c = C33591ch.m72746d();
        c33659g1.f69930d = C33591ch.m72741a(C33598d3.m72772c());
        c33659g1.f69931e = BaseInfo.userMeta.appVersion;
        c33659g1.f69937k = 0L;
        c33659g1.f69938l = 0L;
        c33659g1.f69939m = 0L;
        c33659g1.f69940n = C33955u7.m75163c().m75164a();
        c33659g1.f69941o = C33991w3.m75338a().m77159g();
        LifecycleCallback.register(this);
        if (LifecycleCallback.INSTANCE.isCurrentForeground()) {
            this.f71265h = 1;
        } else {
            this.f71265h = 2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f71266i = jCurrentTimeMillis;
        this.f71270m = jCurrentTimeMillis;
        C33722j1 c33722j1 = (C33722j1) ConfigProxy.INSTANCE.getConfig().m77076e("battery_element");
        this.f71259b = new C33697hi(c33722j1.f70315q, c33722j1.f70317s, c33722j1.f70316r);
        this.f71260c = new C33606db(c33722j1.f70312n, c33722j1.f70314p, c33722j1.f70313o);
        this.f71261d = new C33846p(c33722j1.f70318t, c33722j1.f70319u);
    }

    /* JADX INFO: renamed from: d */
    public final void m74387d(long j11) {
        ArrayList<AbstractC33988w0> arrayListM72756d = this.f71260c.m72756d(j11);
        ArrayList<AbstractC33988w0> arrayListM72757e = this.f71260c.m72757e(j11);
        ArrayList<AbstractC33988w0> arrayListM72755c = this.f71260c.m72755c(j11);
        if (arrayListM72756d.isEmpty() && arrayListM72757e.isEmpty() && arrayListM72755c.isEmpty()) {
            return;
        }
        C33743k1.m73624a(arrayListM72756d, arrayListM72757e, arrayListM72755c, j11, this.f71260c.f69473g);
    }

    /* JADX INFO: renamed from: e */
    public final void m74388e(long j11) {
        ArrayList<AbstractC33988w0> arrayListM72756d = this.f71259b.m72756d(j11);
        ArrayList<AbstractC33988w0> arrayListM72757e = this.f71259b.m72757e(j11);
        ArrayList<AbstractC33988w0> arrayListM72755c = this.f71259b.m72755c(j11);
        if (arrayListM72755c.isEmpty() && arrayListM72756d.isEmpty() && arrayListM72757e.isEmpty()) {
            return;
        }
        C33743k1.m73626b(arrayListM72756d, arrayListM72757e, arrayListM72755c, j11, this.f71259b.f69473g);
    }

    /* JADX INFO: renamed from: f */
    public final void m74389f(long j11) {
        long j12 = j11 - this.f71266i;
        if (this.f71265h == 2) {
            this.f71264g.f69939m += j12;
        } else {
            this.f71264g.f69938l += j12;
        }
        this.f71264g.f69937k += j12;
        this.f71266i = j11;
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStop(@NonNull Activity activity) {
        if (this.f71268k) {
            this.f71272o.postAtFrontOfQueue(new e(activity.getLocalClassName()));
        }
    }

    /* JADX INFO: renamed from: a */
    public static C33827o1 m74369a() {
        return f.f71282a;
    }

    /* JADX INFO: renamed from: b */
    public void m74381b() throws Throwable {
        if (this.f71271n.get()) {
            return;
        }
        this.f71271n.set(true);
        Logger.INSTANCE.mo77132i(f71253s, "BatteryMonitor start");
        C33672ge.m73180a(this.f71273p);
        C33585cb.m72669a(this.f71274q);
        C33825o.m74348a(this.f71275r);
        this.f71267j.m74851o();
        this.f71267j.m74854r();
        this.f71272o.sendMessageDelayed(this.f71272o.obtainMessage(1), 60000L);
    }

    /* JADX INFO: renamed from: c */
    public void m74384c() {
        if (!this.f71271n.get() || this.f71269l || this.f71268k) {
            return;
        }
        Logger.INSTANCE.mo77132i(f71253s, "BatteryMonitor stop");
        this.f71271n.set(false);
        C33672ge.m73184b(this.f71273p);
        C33585cb.m72672b(this.f71274q);
        C33825o.m74352b(this.f71275r);
        this.f71272o.removeMessages(1);
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
        m74389f(System.currentTimeMillis());
        this.f71265h = 2;
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
        m74389f(System.currentTimeMillis());
        this.f71265h = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m74380a(boolean z11) {
        this.f71269l = z11;
    }

    /* JADX INFO: renamed from: a */
    public final void m74379a(long j11) {
        this.f71259b.m72754b(j11);
        this.f71260c.m72754b(j11);
        this.f71261d.m74484a(j11);
    }

    /* JADX INFO: renamed from: c */
    public final void m74385c(long j11) {
        if (this.f71269l && j11 - this.f71270m >= 600000) {
            this.f71270m = j11;
            m74388e(j11);
            m74387d(j11);
            m74382b(j11);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m74386d() {
        if (this.f71268k) {
            try {
                if (this.f71263f == null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("last_process_name", this.f71264g.f69928b);
                    jSONObject.put("last_launch_id", this.f71264g.f69930d);
                    jSONObject.put("last_process_launch_id", this.f71264g.f69929c);
                    JSONObject jSONObjectM74304a = C33820nf.m74304a(C33820nf.f71141T);
                    jSONObjectM74304a.put("user_custom", this.f71264g.f69941o);
                    jSONObjectM74304a.put(C33820nf.f71135N, this.f71264g.f69940n);
                    Application application = BaseInfo.app;
                    UserMeta userMeta = BaseInfo.userMeta;
                    JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69660i, "battery_ele_metric", userMeta);
                    jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
                    jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
                    ReportData reportData = new ReportData(userMeta.uin, 1, "Battery", jSONObjectM74303a);
                    this.f71263f = reportData;
                    this.f71262e.mo74453d(reportData);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("wake_lock_frequency", this.f71264g.f69933g);
                jSONObject2.put("wake_lock_duration_in_ms", this.f71259b.m72749a(jCurrentTimeMillis));
                jSONObject2.put("element", "wake_lock");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("location_frequency", this.f71264g.f69932f);
                jSONObject3.put("location_duration_in_ms", this.f71260c.m72749a(jCurrentTimeMillis));
                jSONObject3.put("element", FirebaseAnalytics.Param.LOCATION);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("alarm_frequency", this.f71264g.f69934h);
                jSONObject4.put("alarm_wake_up_frequency", this.f71264g.f69935i);
                jSONObject4.put("alarm_other_frequency", this.f71264g.f69936j);
                jSONObject4.put("element", NotificationCompat.CATEGORY_ALARM);
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("process_alive_duration_in_ms", this.f71264g.f69937k);
                jSONObject5.put("foreground_duration_in_ms", this.f71264g.f69938l);
                jSONObject5.put("background_duration_in_ms", this.f71264g.f69939m);
                jSONObject5.put("element", "process");
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject2);
                jSONArray.put(jSONObject3);
                jSONArray.put(jSONObject4);
                jSONArray.put(jSONObject5);
                jSONArray.put(this.f71264g.m73120a());
                JSONObject params = this.f71263f.getParams();
                params.getJSONObject(C33820nf.f71161q).put("elements", jSONArray);
                this.f71263f.setParams(params);
                this.f71262e.mo74451b(this.f71263f);
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(f71253s, th2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m74383b(boolean z11) {
        this.f71268k = z11;
    }

    /* JADX INFO: renamed from: b */
    public final void m74382b(long j11) {
        ArrayList<AbstractC33988w0> arrayListM74491c = this.f71261d.m74491c(j11);
        ArrayList<AbstractC33988w0> arrayListM74490b = this.f71261d.m74490b(j11);
        if (arrayListM74491c.isEmpty() && arrayListM74490b.isEmpty()) {
            return;
        }
        C33743k1.m73623a(arrayListM74490b, arrayListM74491c, j11);
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onCreate(@NonNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onDestroy(@NonNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPause(@NonNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPostCreate(@NonNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onResume(@NonNull Activity activity) {
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStart(@NonNull Activity activity) {
    }
}
