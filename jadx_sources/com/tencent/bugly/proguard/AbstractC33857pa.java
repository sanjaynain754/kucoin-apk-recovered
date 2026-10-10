package com.tencent.bugly.proguard;

import android.os.Debug;
import com.tencent.rmonitor.base.reporter.ReporterMachine;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.LooperReport;
import com.tencent.rmonitor.looper.MonitorInfo;
import com.tencent.rmonitor.looper.listener.IMonitorCallback;
import com.tencent.rmonitor.looper.provider.LooperStackProvider;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.pa */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33857pa implements IMonitorCallback {
    static final String TAG = "RMonitor_lag";
    private final C33878qa lagParam;
    private LooperStackProvider stackProvider = null;
    private boolean isResume = false;
    private boolean isDetecting = false;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.pa$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ MonitorInfo f71383b;

        public a(MonitorInfo monitorInfo) {
            this.f71383b = monitorInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            LooperReport.INSTANCE.gotoReport(this.f71383b);
        }
    }

    public abstract Thread getMonitoredThread();

    public void pause() {
        this.isResume = false;
    }

    public void resume() {
        this.isResume = true;
    }

    public void beginDetection(long j11) {
        LooperStackProvider looperStackProvider = this.stackProvider;
        boolean z11 = this.isResume && Math.random() < ((double) this.lagParam.f71550a);
        if (!z11 || looperStackProvider == null) {
            return;
        }
        this.isDetecting = z11;
        looperStackProvider.dispatchStart(j11);
    }

    public void endDetection(long j11, long j12) {
        LooperStackProvider looperStackProvider = this.stackProvider;
        if (this.isDetecting && looperStackProvider != null) {
            looperStackProvider.dispatchEnd(j11, j12);
        }
        this.isDetecting = false;
    }

    public boolean isResume() {
        return this.isResume;
    }

    public void setStackProvider(LooperStackProvider looperStackProvider) {
        this.stackProvider = looperStackProvider;
    }

    public void stop() {
        LooperStackProvider looperStackProvider = this.stackProvider;
        if (looperStackProvider != null) {
            looperStackProvider.stop();
        }
    }

    public AbstractC33857pa(C33878qa c33878qa) {
        this.lagParam = c33878qa;
    }

    public String getMonitoredThreadName() {
        Thread monitoredThread = getMonitoredThread();
        if (monitoredThread != null) {
            return monitoredThread.getName();
        }
        return "";
    }

    @Override // com.tencent.rmonitor.looper.listener.IMonitorCallback
    public void onAfterStack(MonitorInfo monitorInfo) {
        if (Debug.isDebuggerConnected()) {
            Logger.INSTANCE.mo77130d("RMonitor_lag", "onAfterStack, in debugger mode.");
        } else if (monitorInfo != null && monitorInfo.getDuration() > this.lagParam.f71551b) {
            ReporterMachine.INSTANCE.post(new a(monitorInfo));
        }
    }

    public void start() {
        Thread monitoredThread = getMonitoredThread();
        LooperStackProvider looperStackProvider = this.stackProvider;
        if (looperStackProvider != null && monitoredThread != null) {
            looperStackProvider.prepare(monitoredThread, this.lagParam, this);
        }
    }
}
