package com.tencent.rmonitor.looper.provider;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.proguard.C33657g;
import com.tencent.bugly.proguard.C33789m5;
import com.tencent.bugly.proguard.C33878qa;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.bugly.proguard.InterfaceC33953u5;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.MonitorInfo;
import com.tencent.rmonitor.looper.listener.IMonitorCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u0013\u001a\u00020\nH&J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH&J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH&J\b\u0010\u0016\u001a\u00020\nH&J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0004J\b\u0010\u0019\u001a\u00020\u0018H\u0004J\b\u0010\u001a\u001a\u00020\u0018H\u0004J\u0006\u0010\u001b\u001a\u00020\bJ\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;", "Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;", "Ljava/lang/Thread;", InterfaceC33953u5.f72225u, "Lcom/tencent/bugly/proguard/qa;", "lagParam", "Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;", TUIConstants.TUIChat.CALL_BACK, "", "prepare", "", InterfaceC33730j9.f70350a, "", "startTime", "dispatchStart", "endTime", TypedValues.TransitionType.S_DURATION, "dispatchEnd", "init", "release", "Lcom/tencent/rmonitor/looper/MonitorInfo;", "monitorInfo", "checkStackTraceNormal", "getLooperThread", "", "getLooperThreadName", "getLooperThreadId", "shouldSuspendBeforeGetStack", C33789m5.f70921k, "markStackTrace", "appendData", "Lcom/tencent/bugly/proguard/qa;", "getLagParam", "()Lcom/tencent/bugly/proguard/qa;", "looperThreadName", "Ljava/lang/String;", "looperThreadId", "looperThread", "Ljava/lang/Thread;", "isInit", "Z", "Lcom/tencent/rmonitor/looper/MonitorInfo;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isStackTraceNormal", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public abstract class BaseStackProvider implements LooperStackProvider {

    @NotNull
    private static final String TAG = "RMonitor_looper_StackProvider";
    private volatile boolean isInit;

    @Nullable
    private volatile Thread looperThread;
    private String looperThreadId;
    private String looperThreadName;

    @Nullable
    private MonitorInfo monitorInfo;

    @NotNull
    private final C33878qa lagParam = new C33878qa();

    @NotNull
    private AtomicBoolean isStackTraceNormal = new AtomicBoolean(true);

    public abstract void checkStackTraceNormal();

    @Override // com.tencent.rmonitor.looper.provider.LooperStackProvider
    public void dispatchEnd(long endTime, long duration) {
        BaseStackProvider baseStackProvider;
        if (!this.isInit) {
            Logger.INSTANCE.mo77132i("RMonitor_looper_StackProvider", "dispatch end fail because provide is not prepared.");
            return;
        }
        MonitorInfo monitorInfo = this.monitorInfo;
        if (monitorInfo != null) {
            monitorInfo.setDuration(duration);
            baseStackProvider = this;
            baseStackProvider.dispatchEnd(monitorInfo, endTime, duration);
            MonitorInfo.INSTANCE.recycle(monitorInfo);
        } else {
            baseStackProvider = this;
        }
        baseStackProvider.monitorInfo = null;
    }

    public abstract void dispatchEnd(@NotNull MonitorInfo monitorInfo, long endTime, long duration);

    @Override // com.tencent.rmonitor.looper.provider.LooperStackProvider
    public void dispatchStart(long startTime) {
        if (!this.isInit) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_StackProvider", "dispatch start fail because provide is not prepared.");
            return;
        }
        if (!this.isStackTraceNormal.get()) {
            checkStackTraceNormal();
            Logger.INSTANCE.mo77130d("RMonitor_looper_StackProvider", "dispatch start fail because stack trace not normal.");
            return;
        }
        MonitorInfo monitorInfo = this.monitorInfo;
        if (monitorInfo != null) {
            Logger.INSTANCE.mo77134w("RMonitor_looper_StackProvider", "last msg not call dispatchEnd, key: " + monitorInfo.getLastStackRequestTime());
            MonitorInfo.INSTANCE.recycle(monitorInfo);
        }
        MonitorInfo monitorInfoObtain = MonitorInfo.INSTANCE.obtain();
        this.monitorInfo = monitorInfoObtain;
        if (monitorInfoObtain != null) {
            monitorInfoObtain.setLastStackRequestTime(System.currentTimeMillis());
            dispatchStart(monitorInfoObtain, startTime);
        }
    }

    public abstract void dispatchStart(@NotNull MonitorInfo monitorInfo, long startTime);

    public abstract boolean init(@NotNull IMonitorCallback callback);

    public abstract void release();

    @Override // com.tencent.rmonitor.looper.provider.LooperStackProvider
    public void stop() {
        this.isInit = false;
        release();
        this.looperThread = null;
        Logger.INSTANCE.mo77132i("RMonitor_looper_StackProvider", InterfaceC33730j9.f70350a);
    }

    public final void appendData(@NotNull MonitorInfo monitorInfo) {
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
        if (monitorInfo.getScene() == null) {
            monitorInfo.setAppInForeground(LifecycleCallback.INSTANCE.isCurrentForeground());
            monitorInfo.setScene(C33657g.m73094e());
            monitorInfo.setThreadId(getLooperThreadId());
            monitorInfo.setThreadName(getLooperThreadName());
            monitorInfo.getLagParam().m74679a(this.lagParam);
        }
    }

    @NotNull
    public final C33878qa getLagParam() {
        return this.lagParam;
    }

    @Nullable
    public final Thread getLooperThread() {
        return this.looperThread;
    }

    @NotNull
    public final String getLooperThreadId() {
        String str = this.looperThreadId;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("looperThreadId");
        return null;
    }

    @NotNull
    public final String getLooperThreadName() {
        String str = this.looperThreadName;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException("looperThreadName");
        return null;
    }

    public final void markStackTrace(boolean normal) {
        boolean z11 = this.isStackTraceNormal.get();
        if (z11 != normal) {
            this.isStackTraceNormal.compareAndSet(z11, normal);
            Logger.INSTANCE.mo77130d("RMonitor_looper_StackProvider", "markStackTrace, pre: " + z11 + ", new: " + normal);
        }
    }

    @Override // com.tencent.rmonitor.looper.provider.LooperStackProvider
    public boolean prepare(@NotNull Thread thread, @NotNull C33878qa lagParam, @NotNull IMonitorCallback callback) {
        Intrinsics.checkNotNullParameter(thread, "thread");
        Intrinsics.checkNotNullParameter(lagParam, "lagParam");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String name = thread.getName();
        Intrinsics.checkNotNullExpressionValue(name, "thread.name");
        this.looperThreadName = name;
        this.looperThreadId = String.valueOf(thread.getId());
        this.looperThread = thread;
        this.lagParam.m74679a(lagParam);
        this.isInit = init(callback);
        Logger.INSTANCE.mo77132i("RMonitor_looper_StackProvider", "prepare stack provider, isInit: " + this.isInit + ", lagParam: " + lagParam);
        return this.isInit;
    }

    public final boolean shouldSuspendBeforeGetStack() {
        return this.lagParam.f71554e;
    }
}
