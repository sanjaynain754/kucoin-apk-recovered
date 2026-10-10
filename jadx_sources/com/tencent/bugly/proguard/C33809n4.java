package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.n4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33809n4 extends C33758kg {

    /* JADX INFO: renamed from: b */
    public final long f71028b;

    /* JADX INFO: renamed from: c */
    public final long f71029c;

    /* JADX INFO: renamed from: d */
    public long f71030d;

    /* JADX INFO: renamed from: a */
    public long m74229a() {
        return this.f71030d;
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
        this.f71030d = this.f71029c;
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
        this.f71030d = this.f71028b;
    }

    public C33809n4(long j11, long j12, long j13) {
        this.f71030d = j11;
        this.f71028b = j12;
        this.f71029c = j13;
    }

    /* JADX INFO: renamed from: b */
    public void m74230b() {
        LifecycleCallback.register(this);
    }

    /* JADX INFO: renamed from: c */
    public void m74231c() {
        LifecycleCallback.unRegister(this);
    }
}
