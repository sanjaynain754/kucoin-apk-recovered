package com.tencent.bugly.traffic;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import com.tencent.bugly.common.network.INetworkStateListener;
import com.tencent.bugly.common.network.NetworkWatcher;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.AbstractC33615e;
import com.tencent.bugly.proguard.C33591ch;
import com.tencent.bugly.proguard.C33654fh;
import com.tencent.bugly.proguard.C33717ih;
import com.tencent.bugly.proguard.C33738jh;
import com.tencent.bugly.proguard.C33755kd;
import com.tencent.bugly.proguard.C33859pc;
import com.tencent.bugly.proguard.C33880qc;
import com.tencent.bugly.proguard.C33886qi;
import com.tencent.bugly.proguard.C33906ri;
import com.tencent.bugly.proguard.C33955u7;
import com.tencent.bugly.proguard.C33991w3;
import com.tencent.bugly.traffic.custom.CustomTrafficStatistic;
import com.tencent.bugly.traffic.custom.SocketInfo;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.meta.BaseInfo;
import com.tencent.rmonitor.base.meta.TrafficInfo;
import com.tencent.rmonitor.base.p144db.table.TrafficInfoTable;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.common.util.AppInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class TrafficMonitor implements INetworkStateListener, IActivityStateCallback {

    /* JADX INFO: renamed from: t */
    public static final String f72642t = "TrafficMonitor";

    /* JADX INFO: renamed from: u */
    public static final int f72643u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f72644v = 2;

    /* JADX INFO: renamed from: w */
    public static final int f72645w = 1;

    /* JADX INFO: renamed from: x */
    public static final long f72646x = 60000;

    /* JADX INFO: renamed from: y */
    public static final long f72647y = 600000;

    /* JADX INFO: renamed from: z */
    public static String f72648z = "unknown";

    /* JADX INFO: renamed from: b */
    public long f72649b;

    /* JADX INFO: renamed from: c */
    public final C33654fh f72650c;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f72651d;

    /* JADX INFO: renamed from: e */
    public boolean f72652e;

    /* JADX INFO: renamed from: f */
    public boolean f72653f;

    /* JADX INFO: renamed from: g */
    public boolean f72654g;

    /* JADX INFO: renamed from: h */
    public ArrayList<TrafficMsg> f72655h;

    /* JADX INFO: renamed from: i */
    public AbstractC33615e f72656i;

    /* JADX INFO: renamed from: j */
    public AbstractC33615e f72657j;

    /* JADX INFO: renamed from: k */
    public AbstractC33615e f72658k;

    /* JADX INFO: renamed from: l */
    public AbstractC33615e f72659l;

    /* JADX INFO: renamed from: m */
    public List<AbstractC33615e> f72660m;

    /* JADX INFO: renamed from: n */
    public AbstractC33615e f72661n;

    /* JADX INFO: renamed from: o */
    public AbstractC33615e f72662o;

    /* JADX INFO: renamed from: p */
    public AbstractC33615e f72663p;

    /* JADX INFO: renamed from: q */
    public AbstractC33615e f72664q;

    /* JADX INFO: renamed from: r */
    public List<AbstractC33615e> f72665r;

    /* JADX INFO: renamed from: s */
    public final Handler f72666s;

    /* JADX INFO: renamed from: com.tencent.bugly.traffic.TrafficMonitor$a */
    /* JADX INFO: compiled from: BUGLY */
    public class HandlerC34067a extends Handler {
        public HandlerC34067a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                TrafficMonitor.this.m75612a(false);
                TrafficMonitor.this.m75610a();
                sendMessageDelayed(obtainMessage(1), 60000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.traffic.TrafficMonitor$b */
    /* JADX INFO: compiled from: BUGLY */
    public static final class C34068b {

        /* JADX INFO: renamed from: a */
        public static final TrafficMonitor f72668a = new TrafficMonitor();
    }

    public /* synthetic */ TrafficMonitor(HandlerC34067a handlerC34067a) {
        this();
    }

    /* JADX INFO: renamed from: c */
    public static TrafficMonitor m75606c() {
        return C34068b.f72668a;
    }

    private static native void nativeClearTrafficInfo();

    private static native void nativeGetTrafficInfo(ArrayList<TrafficMsg> arrayList);

    private static native void nativeInitMatrixTraffic(boolean z11, boolean z12, boolean z13, String[] strArr);

    private static native void nativeReleaseMatrixTraffic();

    private static native void nativeRestart();

    private static native void nativeSetForegroundState(int i11);

    private static native void nativeSetNetworkState(int i11);

    /* JADX INFO: renamed from: a */
    public void m75610a() {
        nativeClearTrafficInfo();
        CustomTrafficStatistic.getInstance().getHttpQueue().clear();
        CustomTrafficStatistic.getInstance().getSocketToQueue().clear();
    }

    /* JADX INFO: renamed from: b */
    public boolean m75616b(boolean z11) {
        this.f72653f = z11;
        return z11;
    }

    /* JADX INFO: renamed from: d */
    public void m75620d(boolean z11) {
        if (z11) {
            ArrayList<TrafficMsg> arrayListM75619d = m75619d();
            m75617c(arrayListM75619d);
            m75611a(arrayListM75619d, false);
            m75610a();
        }
        if (this.f72652e || this.f72653f) {
            return;
        }
        Logger.INSTANCE.mo77132i(f72642t, "traffic monitor stop");
        this.f72651d.set(false);
        this.f72666s.removeMessages(1);
        nativeReleaseMatrixTraffic();
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
        nativeSetForegroundState(2);
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
        nativeSetForegroundState(1);
    }

    public TrafficMonitor() {
        this.f72649b = 0L;
        this.f72651d = new AtomicBoolean(false);
        this.f72652e = false;
        this.f72653f = false;
        this.f72654g = false;
        this.f72655h = new ArrayList<>();
        this.f72656i = new C33906ri();
        this.f72657j = new C33886qi();
        this.f72658k = new C33880qc();
        this.f72659l = new C33859pc();
        this.f72660m = new ArrayList();
        this.f72661n = new C33906ri();
        this.f72662o = new C33886qi();
        this.f72663p = new C33880qc();
        this.f72664q = new C33859pc();
        this.f72665r = new ArrayList();
        this.f72666s = new HandlerC34067a(ThreadManager.getMonitorThreadLooper());
        this.f72650c = (C33654fh) ConfigProxy.INSTANCE.getConfig().m77076e("traffic_detail");
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList<TrafficMsg> m75615b(ArrayList<TrafficMsg> arrayList) {
        if (!this.f72650c.f69905s) {
            return arrayList;
        }
        ArrayList<TrafficMsg> arrayList2 = new ArrayList<>();
        for (TrafficMsg trafficMsg : arrayList) {
            if (!C33755kd.m73813a(trafficMsg.mHost)) {
                TrafficMsg trafficMsg2 = new TrafficMsg();
                trafficMsg2.mCollectType = trafficMsg.mCollectType;
                trafficMsg2.mHost = trafficMsg.mHost;
                trafficMsg2.mRx = trafficMsg.mRx;
                trafficMsg2.mTx = trafficMsg.mTx;
                trafficMsg2.mFore = trafficMsg.mFore;
                trafficMsg2.mId = trafficMsg.mId;
                trafficMsg2.mNet = trafficMsg.mNet;
                trafficMsg2.mTime = trafficMsg.mTime;
                arrayList2.add(trafficMsg2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: c */
    public boolean m75618c(boolean z11) {
        this.f72652e = z11;
        return z11;
    }

    /* JADX INFO: renamed from: e */
    public final void m75621e() {
        this.f72660m.add(this.f72656i);
        this.f72660m.add(this.f72657j);
        this.f72660m.add(this.f72658k);
        this.f72660m.add(this.f72659l);
        this.f72665r.add(this.f72661n);
        this.f72665r.add(this.f72662o);
        this.f72665r.add(this.f72663p);
        this.f72665r.add(this.f72664q);
        NetworkWatcher networkWatcher = NetworkWatcher.INSTANCE;
        f72648z = networkWatcher.getOperatorName();
        System.loadLibrary("rmonitor_base");
        String[] strArr = new String[0];
        List<String> list = this.f72650c.f69908v;
        if (list != null) {
            strArr = (String[]) list.toArray(new String[0]);
        }
        networkWatcher.registerListener(this);
        if (networkWatcher.isWiFiConnectedRealtime()) {
            nativeSetNetworkState(1);
        } else if (networkWatcher.isNetworkConnectedRealtime()) {
            nativeSetNetworkState(2);
        } else {
            nativeSetNetworkState(3);
        }
        LifecycleCallback.register(this);
        if (LifecycleCallback.INSTANCE.isCurrentForeground()) {
            nativeSetForegroundState(1);
        } else {
            nativeSetForegroundState(2);
        }
        nativeInitMatrixTraffic(true, true, true, strArr);
    }

    /* JADX INFO: renamed from: g */
    public void m75623g() {
        if ((this.f72652e || this.f72653f) && !this.f72651d.get() && m75622f()) {
            Logger.INSTANCE.mo77132i(f72642t, "traffic monitor start");
            this.f72651d.set(true);
            this.f72649b = System.currentTimeMillis();
            if (this.f72654g) {
                nativeRestart();
            } else {
                m75621e();
                this.f72654g = true;
            }
            Handler handler = this.f72666s;
            handler.sendMessageDelayed(handler.obtainMessage(1), 60000L);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m75617c(ArrayList<TrafficMsg> arrayList) {
        for (AbstractC33615e abstractC33615e : this.f72665r) {
            abstractC33615e.m72868a(arrayList);
            for (TrafficMsg trafficMsg : m75609a(abstractC33615e.m72873d(), abstractC33615e.m72869b())) {
                ArrayList<TrafficInfo> arrayListM75607a = m75607a(trafficMsg.mHost, trafficMsg);
                if (arrayListM75607a.size() >= 1) {
                    TrafficInfo trafficInfo = arrayListM75607a.get(0);
                    for (int i11 = 1; i11 < arrayListM75607a.size(); i11++) {
                        trafficInfo.setRx(arrayListM75607a.get(i11).getRx() + trafficInfo.getRx());
                        trafficInfo.setTx(arrayListM75607a.get(i11).getTx() + trafficInfo.getTx());
                        TrafficInfoTable.getInstance().delete(arrayListM75607a.get(i11));
                    }
                    trafficInfo.setRx(trafficInfo.getRx() + trafficMsg.mRx);
                    trafficInfo.setTx(trafficInfo.getTx() + trafficMsg.mTx);
                    TrafficInfoTable.getInstance().replace(trafficInfo);
                } else {
                    TrafficInfo trafficInfo2 = new TrafficInfo();
                    trafficInfo2.setHost(trafficMsg.mHost);
                    trafficInfo2.setLaunchID(C33591ch.m72741a(BaseInfo.app));
                    trafficInfo2.setProcessName(AppInfo.obtainProcessName(BaseInfo.app));
                    trafficInfo2.setProcessLaunchID(C33591ch.f69465f);
                    trafficInfo2.setFrontState(C33738jh.m73568a(trafficMsg.mFore));
                    trafficInfo2.setNetState(C33738jh.m73569b(trafficMsg.mNet));
                    trafficInfo2.setRx(trafficMsg.mRx);
                    trafficInfo2.setTx(trafficMsg.mTx);
                    trafficInfo2.setAppVersion(BaseInfo.userMeta.appVersion);
                    trafficInfo2.setType(trafficMsg.mCollectType);
                    trafficInfo2.setHotPatchNum(C33955u7.m75163c().m75164a());
                    JSONObject jSONObjectM77159g = C33991w3.m75338a().m77159g();
                    if (jSONObjectM77159g != null) {
                        trafficInfo2.setUserData(jSONObjectM77159g);
                    }
                    TrafficInfoTable.getInstance().replace(trafficInfo2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m75622f() {
        if (!AndroidVersion.isOverO()) {
            Logger.INSTANCE.mo77132i(f72642t, "below android o, could not open traffic");
            return false;
        }
        return true;
    }

    @Override // com.tencent.bugly.common.network.INetworkStateListener
    public void onNetworkStateChanged(int i11) {
        nativeSetNetworkState(i11);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<TrafficInfo> m75607a(String str, TrafficMsg trafficMsg) {
        return (ArrayList) TrafficInfoTable.getInstance().query(null, "host = ? AND front_state = ? AND net_state = ? AND process_name = ? AND process_launch_id = ? AND type = ?", new String[]{str, C33738jh.m73568a(trafficMsg.mFore), C33738jh.m73569b(trafficMsg.mNet), AppInfo.obtainProcessName(BaseInfo.app), C33591ch.m72746d(), trafficMsg.mCollectType}, false, null, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<TrafficMsg> m75609a(Map<String, TrafficMsg> map, Map<String, TrafficMsg> map2) {
        ArrayList<TrafficMsg> arrayList = new ArrayList<>();
        if (map != null && !map.isEmpty()) {
            Iterator<Map.Entry<String, TrafficMsg>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getValue());
            }
        }
        if (map2 != null && !map2.isEmpty()) {
            Iterator<Map.Entry<String, TrafficMsg>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getValue());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<TrafficMsg> m75619d() {
        ArrayList<TrafficMsg> arrayList = new ArrayList<>();
        nativeGetTrafficInfo(arrayList);
        for (SocketInfo socketInfo : CustomTrafficStatistic.getInstance().getHttpQueue()) {
            TrafficMsg trafficMsg = new TrafficMsg();
            trafficMsg.mRx = (int) socketInfo.receivedBytes;
            trafficMsg.mTx = (int) socketInfo.sendBytes;
            trafficMsg.mCollectType = "custom";
            trafficMsg.mNet = socketInfo.networkType;
            trafficMsg.mFore = socketInfo.frontState;
            trafficMsg.mHost = socketInfo.host;
            trafficMsg.mTime = socketInfo.startTimeStamp;
            arrayList.add(trafficMsg);
        }
        return m75615b(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final int m75614b() {
        int i11 = ((double) (this.f72659l.m72872c() + (this.f72658k.m72872c() + (this.f72657j.m72872c() + this.f72656i.m72872c())))) > (this.f72650c.f69900n * 1024.0d) * 1024.0d ? 1 : 0;
        if (this.f72657j.m72872c() + this.f72659l.m72872c() > this.f72650c.f69901o * 1024.0d * 1024.0d) {
            i11 += 2;
        }
        if (this.f72659l.m72872c() + this.f72658k.m72872c() > this.f72650c.f69902p * 1024.0d * 1024.0d) {
            i11 += 4;
        }
        return ((double) (this.f72659l.m72874e() + (this.f72658k.m72874e() + (this.f72656i.m72874e() + this.f72657j.m72874e())))) > (this.f72650c.f69903q * 1024.0d) * 1024.0d ? i11 + 16 : i11;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m75613a(TrafficMsg trafficMsg) {
        for (TrafficMsg trafficMsg2 : this.f72655h) {
            if (trafficMsg.mCollectType.equals(trafficMsg2.mCollectType)) {
                if (trafficMsg.mCollectType.equals("custom") && trafficMsg2.mHost.equals(trafficMsg.mHost)) {
                    trafficMsg2.mRx += trafficMsg.mRx;
                    trafficMsg2.mTx += trafficMsg.mTx;
                    return true;
                }
                long j11 = trafficMsg.mId;
                if (j11 != -1 && j11 == trafficMsg2.mId && trafficMsg.mCollectType.equals("auto")) {
                    trafficMsg2.mRx += trafficMsg.mRx;
                    trafficMsg2.mTx += trafficMsg.mTx;
                    return true;
                }
            }
        }
        return false;
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

    /* JADX INFO: renamed from: a */
    public ArrayList<TrafficMsg> m75608a(ArrayList<TrafficMsg> arrayList) {
        for (TrafficMsg trafficMsg : arrayList) {
            if (!m75613a(trafficMsg)) {
                this.f72655h.add(trafficMsg);
            }
        }
        return this.f72655h;
    }

    /* JADX INFO: renamed from: a */
    public final void m75611a(ArrayList<TrafficMsg> arrayList, boolean z11) {
        m75608a(arrayList);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f72649b >= 600000 || z11) {
            this.f72649b = jCurrentTimeMillis;
            Iterator<AbstractC33615e> it = this.f72660m.iterator();
            while (it.hasNext()) {
                it.next().m72868a(this.f72655h);
            }
            int iM75614b = m75614b();
            if (iM75614b == 0 && Math.random() < this.f72650c.f69906t) {
                C33717ih.m73438b(iM75614b, this.f72655h, this.f72660m);
            } else if (iM75614b != 0 && Math.random() < this.f72650c.f69907u) {
                C33717ih.m73438b(iM75614b, this.f72655h, this.f72660m);
            }
            this.f72655h.clear();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75612a(boolean z11) {
        ArrayList<TrafficMsg> arrayListM75619d = m75619d();
        if (this.f72652e) {
            Logger.INSTANCE.mo77130d(f72642t, "saveTrafficMsgs");
            m75617c(arrayListM75619d);
        }
        if (this.f72653f) {
            Logger.INSTANCE.mo77130d(f72642t, "reportTrafficMsgs");
            m75611a(arrayListM75619d, z11);
        }
    }
}
