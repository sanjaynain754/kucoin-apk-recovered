package com.tencent.bugly.proguard;

import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.m4 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33788m4 extends C33758kg {

    /* JADX INFO: renamed from: b */
    public final long f70914b;

    /* JADX INFO: renamed from: c */
    public final long f70915c;

    /* JADX INFO: renamed from: d */
    public long f70916d;

    /* JADX INFO: renamed from: a */
    public long m74033a() {
        return this.f70916d;
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
        this.f70916d = this.f70915c;
    }

    @Override // com.tencent.bugly.proguard.C33758kg, com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
        this.f70916d = this.f70914b;
    }

    public C33788m4(long j11, long j12, long j13) {
        this.f70916d = j11;
        this.f70914b = j12;
        this.f70915c = j13;
    }

    /* JADX INFO: renamed from: b */
    public void m74034b() {
        LifecycleCallback.register(this);
    }

    /* JADX INFO: renamed from: c */
    public void m74035c() {
        LifecycleCallback.unRegister(this);
    }
}
