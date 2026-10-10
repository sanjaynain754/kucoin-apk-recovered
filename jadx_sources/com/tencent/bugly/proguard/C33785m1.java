package com.tencent.bugly.proguard;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.meta.UserMeta;
import com.tencent.bugly.common.reporter.data.ReportData;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.p144db.table.DropFrameTable;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m1 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33785m1 implements IActivityStateCallback {

    /* JADX INFO: renamed from: n */
    public static final String f70872n = "BatteryMetricMonitor";

    /* JADX INFO: renamed from: o */
    public static final int f70873o = 1;

    /* JADX INFO: renamed from: p */
    public static int f70874p = 1;

    /* JADX INFO: renamed from: q */
    public static final int f70875q = 1;

    /* JADX INFO: renamed from: r */
    public static final int f70876r = 2;

    /* JADX INFO: renamed from: b */
    public final IntentFilter f70877b;

    /* JADX INFO: renamed from: c */
    public BatteryManager f70878c;

    /* JADX INFO: renamed from: d */
    public boolean f70879d;

    /* JADX INFO: renamed from: e */
    public int f70880e;

    /* JADX INFO: renamed from: f */
    public long f70881f;

    /* JADX INFO: renamed from: g */
    public long f70882g;

    /* JADX INFO: renamed from: h */
    public long f70883h;

    /* JADX INFO: renamed from: i */
    public long f70884i;

    /* JADX INFO: renamed from: j */
    public final C33764l1 f70885j;

    /* JADX INFO: renamed from: k */
    public C33862pf f70886k;

    /* JADX INFO: renamed from: l */
    public ReportData f70887l;

    /* JADX INFO: renamed from: m */
    public final Handler f70888m;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.m1$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C33785m1.this.m74016b(jCurrentTimeMillis);
                C33785m1.this.m74014a(jCurrentTimeMillis);
                sendMessageDelayed(obtainMessage(1), ((long) (C33785m1.f70874p * 60)) * 1000);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.m1$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C33785m1 f70890a = new C33785m1();
    }

    public /* synthetic */ C33785m1(a aVar) {
        this();
    }

    public C33785m1() {
        this.f70878c = null;
        this.f70882g = 0L;
        this.f70883h = 0L;
        this.f70884i = 0L;
        C33764l1 c33764l1 = new C33764l1();
        this.f70885j = c33764l1;
        this.f70886k = new C33862pf();
        this.f70887l = null;
        this.f70888m = new a(ThreadManager.getMonitorThreadLooper());
        this.f70877b = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        int i11 = ConfigProxy.INSTANCE.getConfig().m77076e("battery_metric").f70127l;
        f70874p = i11;
        if (i11 < 1) {
            f70874p = 1;
        }
        LifecycleCallback.register(this);
        if (LifecycleCallback.INSTANCE.isCurrentForeground()) {
            this.f70880e = 1;
        } else {
            this.f70880e = 2;
        }
        this.f70881f = System.currentTimeMillis();
        c33764l1.f70689e = BaseInfo.userMeta.appVersion;
        c33764l1.f70688d = C33591ch.m72741a(BaseInfo.app);
        c33764l1.f70687c = C33591ch.m72746d();
        c33764l1.f70686b = AppInfo.obtainProcessName(BaseInfo.app);
        c33764l1.f70694j = f70874p;
        c33764l1.f70693i = 0;
        c33764l1.f70690f = C33955u7.m75163c().m75164a();
        c33764l1.f70692h = C33991w3.m75338a().m77159g();
    }

    /* JADX INFO: renamed from: b */
    public final float m74015b() {
        BatteryManager batteryManager = this.f70878c;
        if (batteryManager == null) {
            return 0.0f;
        }
        float longProperty = batteryManager.getLongProperty(2);
        if (longProperty < -1.0E7f || longProperty > 1.0E7f) {
            return -1.0f;
        }
        if (!C33613di.m72862a() && !C33613di.m72864c()) {
            return (!C33613di.m72863b() || longProperty > 10000.0f) ? longProperty / 1000.0f : longProperty;
        }
        if (longProperty < -10000.0f) {
            longProperty /= 1000.0f;
        }
        return -longProperty;
    }

    /* JADX INFO: renamed from: c */
    public void m74017c() {
        if (this.f70879d) {
            return;
        }
        this.f70888m.sendEmptyMessage(1);
        this.f70879d = true;
    }

    /* JADX INFO: renamed from: d */
    public void m74018d() {
        if (this.f70879d) {
            this.f70888m.removeMessages(1);
            this.f70879d = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m74019e() {
        try {
            if (this.f70887l == null) {
                Application application = BaseInfo.app;
                UserMeta userMeta = BaseInfo.userMeta;
                JSONObject jSONObjectM74303a = C33820nf.m74303a(application, InterfaceC33617e1.f69660i, "battery_metric", userMeta);
                JSONObject jSONObjectM74304a = C33820nf.m74304a(new String[]{"stage"});
                jSONObjectM74304a.put("user_custom", this.f70885j.f70692h);
                jSONObjectM74304a.put(C33820nf.f71135N, this.f70885j.f70690f);
                jSONObjectM74303a.put(C33820nf.f71160p, jSONObjectM74304a);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("last_process_name", this.f70885j.f70686b);
                jSONObject.put("last_launch_id", this.f70885j.f70688d);
                jSONObject.put("last_process_launch_id", this.f70885j.f70687c);
                jSONObjectM74303a.put(C33820nf.f71161q, jSONObject);
                ReportData reportData = new ReportData(userMeta.uin, 1, "Battery", jSONObjectM74303a);
                this.f70887l = reportData;
                this.f70886k.mo74453d(reportData);
            }
            JSONObject params = this.f70887l.getParams();
            JSONObject jSONObject2 = params.getJSONObject(C33820nf.f71161q);
            jSONObject2.put("foreground_duration_in_ms", this.f70885j.f70698n);
            jSONObject2.put("average_battery_temperature", this.f70885j.f70696l);
            jSONObject2.put("average_foreground_current_value", this.f70885j.f70695k);
            jSONObject2.put("process_alive_time_in_ms", this.f70885j.f70697m);
            jSONObject2.put("collect_count", this.f70885j.f70693i);
            jSONObject2.put("collect_interval_in_minute", this.f70885j.f70694j);
            jSONObject2.put(C33556b3.f68963J, this.f70885j.f70691g);
            this.f70887l.setParams(params);
            this.f70886k.mo74451b(this.f70887l);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70872n, th2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74014a(long j11) {
        Intent intentRegisterReceiver;
        if (this.f70880e == 2 || (intentRegisterReceiver = C33598d3.m72772c().registerReceiver(null, this.f70877b)) == null) {
            return;
        }
        boolean z11 = true;
        int intExtra = intentRegisterReceiver.getIntExtra("status", 1);
        if (intExtra == 2 || intExtra == 5) {
            return;
        }
        float intExtra2 = intentRegisterReceiver.getIntExtra("temperature", 0) / 10.0f;
        float fM74013a = m74013a(C33598d3.m72772c());
        Logger.INSTANCE.mo77130d(f70872n, "temperature = " + intExtra2 + ",current = " + fM74013a + ",status = " + intExtra);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", j11);
            jSONObject.put(DropFrameTable.COLUMN_SCENE, C33657g.m73094e());
            jSONObject.put("foreground_duration_in_ms", this.f70884i);
            jSONObject.put("average_foreground_current_value", fM74013a);
            jSONObject.put("average_battery_temperature", intExtra2);
            if (this.f70880e != 1) {
                z11 = false;
            }
            jSONObject.put("foreground", z11);
            this.f70885j.f70691g.put(jSONObject);
        } catch (Throwable th2) {
            Logger.INSTANCE.exception(f70872n, th2);
        }
        C33764l1 c33764l1 = this.f70885j;
        int i11 = c33764l1.f70693i;
        int i12 = i11 + 1;
        c33764l1.f70693i = i12;
        c33764l1.f70697m = this.f70883h;
        c33764l1.f70698n = this.f70884i;
        float f11 = i11;
        float f12 = (c33764l1.f70695k * f11) + fM74013a;
        float f13 = i12;
        c33764l1.f70695k = f12 / f13;
        c33764l1.f70696l = ((c33764l1.f70696l * f11) + intExtra2) / f13;
        m74019e();
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
        m74016b(System.currentTimeMillis());
        this.f70880e = 2;
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
        m74016b(System.currentTimeMillis());
        this.f70880e = 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m74016b(long j11) {
        if (this.f70880e == 2) {
            long j12 = (j11 - this.f70881f) + this.f70882g;
            this.f70882g = j12;
            this.f70883h += j12;
        } else {
            long j13 = (j11 - this.f70881f) + this.f70884i;
            this.f70884i = j13;
            this.f70883h += j13;
        }
        this.f70881f = j11;
    }

    /* JADX INFO: renamed from: a */
    public float m74013a(Context context) {
        if (!AndroidVersion.isOverL()) {
            return 0.0f;
        }
        if (this.f70878c == null) {
            this.f70878c = (BatteryManager) context.getSystemService("batterymanager");
        }
        return m74015b();
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

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStop(@NonNull Activity activity) {
    }
}
