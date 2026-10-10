package com.tencent.rmonitor.looper;

import android.os.Looper;
import com.tencent.bugly.proguard.AbstractC33610df;
import com.tencent.bugly.proguard.AbstractC33857pa;
import com.tencent.bugly.proguard.C33634ei;
import com.tencent.bugly.proguard.C33694hf;
import com.tencent.bugly.proguard.C33749k7;
import com.tencent.bugly.proguard.C33753kb;
import com.tencent.bugly.proguard.C33878qa;
import com.tencent.bugly.proguard.C33982ve;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.rmonitor.base.config.ConfigProxy;
import com.tencent.rmonitor.base.thread.trace.QuickJavaThreadTrace;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.provider.LooperStackProvider;
import com.tencent.rmonitor.looper.provider.StackQueueProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/LooperMonitor;", "Lcom/tencent/bugly/proguard/df;", "Lcom/tencent/bugly/proguard/pa;", "createLagObserver", "Lcom/tencent/bugly/proguard/qa;", "createLagParam", "Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;", "createLooperStackProvider", "", "start", "", "isResume", "pause", "resume", InterfaceC33730j9.f70350a, "", "getPluginName", "isRunning", "lagObserver", "Lcom/tencent/bugly/proguard/pa;", "isStart", "Z", "<init>", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class LooperMonitor extends AbstractC33610df {

    @NotNull
    private static final String TAG = "RMonitor_lag";
    private boolean isStart;

    @Nullable
    private AbstractC33857pa lagObserver;

    private final C33878qa createLagParam() {
        C33878qa c33878qa = new C33878qa();
        C33694hf pluginConfig = LooperConfig.INSTANCE.getPluginConfig("looper_stack");
        C33753kb c33753kb = pluginConfig instanceof C33753kb ? (C33753kb) pluginConfig : null;
        if (c33753kb != null) {
            c33878qa.f71550a = c33753kb.f70125j;
            c33878qa.f71551b = c33753kb.f70127l;
            c33878qa.f71553d = c33753kb.m73801l();
            c33878qa.f71554e = c33753kb.m73800k();
            c33878qa.f71555f = c33753kb.f70641x;
        } else {
            c33878qa.f71550a = 0.1f;
            c33878qa.f71551b = 200L;
            c33878qa.f71553d = 52L;
            c33878qa.f71554e = true;
            c33878qa.f71555f = "msg";
        }
        Logger.INSTANCE.mo77130d("RMonitor_lag", "createLagParam lagParam: " + c33878qa);
        return c33878qa;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    private final LooperStackProvider createLooperStackProvider() {
        LooperStackProvider stackQueueProvider;
        C33694hf c33694hfM77076e = ConfigProxy.INSTANCE.getConfig().m77076e("looper_stack");
        if (!(c33694hfM77076e instanceof C33753kb) || Math.random() >= ((C33753kb) c33694hfM77076e).m73799j()) {
            stackQueueProvider = null;
        } else {
            stackQueueProvider = new C33982ve();
            if (!QuickJavaThreadTrace.m77120c()) {
                stackQueueProvider = null;
            }
        }
        if (stackQueueProvider == null) {
            stackQueueProvider = new StackQueueProvider();
        }
        Logger.INSTANCE.mo77130d("RMonitor_lag", "createLooperStackProvider, stackProvider: " + stackQueueProvider);
        return stackQueueProvider;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    @Nullable
    public String getPluginName() {
        return "looper_stack";
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public boolean isResume() {
        AbstractC33857pa abstractC33857pa = this.lagObserver;
        if (abstractC33857pa != null) {
            return abstractC33857pa.isResume();
        }
        return false;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    /* JADX INFO: renamed from: isRunning, reason: from getter */
    public boolean getIsStart() {
        return this.isStart;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public void pause() {
        AbstractC33857pa abstractC33857pa;
        if (!this.isStart || (abstractC33857pa = this.lagObserver) == null) {
            return;
        }
        abstractC33857pa.pause();
    }

    @Override // com.tencent.bugly.proguard.AbstractC33610df
    public void resume() {
        AbstractC33857pa abstractC33857pa;
        if (!this.isStart || (abstractC33857pa = this.lagObserver) == null) {
            return;
        }
        abstractC33857pa.resume();
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void start() {
        if (!LooperConfig.INSTANCE.isCanCollect("looper_stack")) {
            Logger.INSTANCE.mo77132i("RMonitor_lag", "start Lag Monitor fail for can't collect.");
            this.isStart = false;
            notifyStartResult(1, "can not collect");
            return;
        }
        if (this.isStart) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.isStart) {
                    AbstractC33857pa abstractC33857paCreateLagObserver = createLagObserver();
                    if (abstractC33857paCreateLagObserver != null) {
                        abstractC33857paCreateLagObserver.start();
                        this.lagObserver = abstractC33857paCreateLagObserver;
                        this.isStart = true;
                    }
                    C33749k7.d.f70597a.m73735a("looper_stack");
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.isStart) {
            notifyStartResult(0, null);
        } else {
            notifyStartResult(2, "Lag Observer is null");
        }
        resume();
        Logger.INSTANCE.mo77132i("RMonitor_lag", "start Lag Monitors.");
    }

    @Override // com.tencent.rmonitor.base.plugin.monitor.QAPMMonitorPlugin
    public void stop() {
        if (this.isStart) {
            pause();
            synchronized (this) {
                try {
                    if (this.isStart) {
                        AbstractC33857pa abstractC33857pa = this.lagObserver;
                        if (abstractC33857pa != null) {
                            abstractC33857pa.stop();
                        }
                        this.lagObserver = null;
                        this.isStart = false;
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            notifyStopResult(0, null);
            Logger.INSTANCE.mo77132i("RMonitor_lag", "stop Lag Monitor.");
        }
    }

    private final AbstractC33857pa createLagObserver() {
        AbstractC33857pa looperObserver;
        C33878qa c33878qaCreateLagParam = createLagParam();
        if (Intrinsics.areEqual(c33878qaCreateLagParam.f71555f, C33753kb.f70627K)) {
            looperObserver = new C33634ei(c33878qaCreateLagParam);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkNotNullExpressionValue(mainLooper, "getMainLooper()");
            looperObserver = new LooperObserver(mainLooper, c33878qaCreateLagParam);
        }
        looperObserver.setStackProvider(createLooperStackProvider());
        return looperObserver;
    }
}
