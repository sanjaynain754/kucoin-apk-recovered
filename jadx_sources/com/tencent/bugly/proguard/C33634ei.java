package com.tencent.bugly.proguard;

import android.os.Looper;
import android.os.SystemClock;
import com.tencent.bugly.common.looper.FrameManager;
import com.tencent.bugly.common.looper.IFrame;
import com.tencent.rmonitor.common.logger.Logger;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ei */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33634ei extends AbstractC33857pa implements IFrame, InterfaceC33699i {

    /* JADX INFO: renamed from: d */
    public static final String f69783d = "RMonitor_lag_vsync";

    /* JADX INFO: renamed from: b */
    public final C33720j f69784b;

    /* JADX INFO: renamed from: c */
    public long f69785c;

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    /* JADX INFO: renamed from: a */
    public void mo72968a(String str) {
    }

    @Override // com.tencent.bugly.common.looper.IFrame
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final void m72967a(long j11) {
        long j12 = this.f69785c;
        if (j12 != 0) {
            endDetection(j11, j11 - j12);
        }
        this.f69785c = 0L;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    public void stop() {
        FrameManager.INSTANCE.unRegister(this);
        this.f69784b.m73453b();
        super.stop();
        Logger.INSTANCE.mo77130d(f69783d, InterfaceC33730j9.f70350a);
    }

    public C33634ei(C33878qa c33878qa) {
        super(c33878qa);
        this.f69785c = 0L;
        this.f69784b = new C33720j(this);
    }

    @Override // com.tencent.bugly.common.looper.IFrame
    public void doFrame(long j11) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        m72967a(jUptimeMillis);
        this.f69785c = jUptimeMillis;
        beginDetection(jUptimeMillis);
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    public Thread getMonitoredThread() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return null;
        }
        return mainLooper.getThread();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    public void onBackground() {
        pause();
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33699i
    public void onForeground() {
        resume();
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    public void pause() {
        super.pause();
        FrameManager.INSTANCE.unRegister(this);
        m72967a(SystemClock.uptimeMillis());
        Logger.INSTANCE.mo77130d(f69783d, "pause");
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    public void resume() {
        super.resume();
        FrameManager.INSTANCE.register(this);
        Logger.INSTANCE.mo77130d(f69783d, "resume");
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    public void start() {
        super.start();
        this.f69784b.m73452a();
        FrameManager.INSTANCE.register(this);
        Logger.INSTANCE.mo77130d(f69783d, "start");
    }
}
