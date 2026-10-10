package com.tencent.bugly.proguard;

import com.tencent.bugly.traffic.TrafficMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.e */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33615e {

    /* JADX INFO: renamed from: a */
    public long f69628a;

    /* JADX INFO: renamed from: c */
    public long f69630c;

    /* JADX INFO: renamed from: b */
    public HashMap<String, TrafficMsg> f69629b = new HashMap<>();

    /* JADX INFO: renamed from: d */
    public HashMap<String, TrafficMsg> f69631d = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final void m72867a(TrafficMsg trafficMsg) {
        this.f69628a = this.f69628a + ((long) trafficMsg.mRx) + ((long) trafficMsg.mTx);
        if (!this.f69629b.containsKey(trafficMsg.mHost)) {
            this.f69629b.put(trafficMsg.mHost, new TrafficMsg(trafficMsg));
            return;
        }
        TrafficMsg trafficMsg2 = this.f69629b.get(trafficMsg.mHost);
        if (trafficMsg2 != null) {
            trafficMsg2.mRx += trafficMsg.mRx;
            trafficMsg2.mTx += trafficMsg.mTx;
            this.f69629b.put(trafficMsg.mHost, trafficMsg2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72870b(TrafficMsg trafficMsg) {
        this.f69630c = this.f69630c + ((long) trafficMsg.mRx) + ((long) trafficMsg.mTx);
        if (!this.f69631d.containsKey(trafficMsg.mHost)) {
            this.f69631d.put(trafficMsg.mHost, new TrafficMsg(trafficMsg));
            return;
        }
        TrafficMsg trafficMsg2 = this.f69631d.get(trafficMsg.mHost);
        if (trafficMsg2 != null) {
            trafficMsg2.mRx += trafficMsg.mRx;
            trafficMsg2.mTx += trafficMsg.mTx;
            this.f69631d.put(trafficMsg.mHost, trafficMsg2);
        }
    }

    /* JADX INFO: renamed from: f */
    public int mo72875f() {
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public int mo72876g() {
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public long m72872c() {
        return this.f69628a;
    }

    /* JADX INFO: renamed from: d */
    public Map<String, TrafficMsg> m72873d() {
        return this.f69631d;
    }

    /* JADX INFO: renamed from: e */
    public long m72874e() {
        return this.f69630c;
    }

    /* JADX INFO: renamed from: a */
    public void m72868a(ArrayList<TrafficMsg> arrayList) {
        m72866a();
        m72871b(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final void m72871b(ArrayList<TrafficMsg> arrayList) {
        for (TrafficMsg trafficMsg : arrayList) {
            if (trafficMsg.mCollectType.equalsIgnoreCase("auto") && trafficMsg.mFore == mo72875f() && trafficMsg.mNet == mo72876g()) {
                m72867a(trafficMsg);
            } else if (trafficMsg.mCollectType.equalsIgnoreCase("custom") && trafficMsg.mFore == mo72875f() && trafficMsg.mNet == mo72876g()) {
                m72870b(trafficMsg);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72866a() {
        this.f69629b.clear();
        this.f69631d.clear();
        this.f69628a = 0L;
        this.f69630c = 0L;
    }

    /* JADX INFO: renamed from: b */
    public Map<String, TrafficMsg> m72869b() {
        return this.f69629b;
    }
}
