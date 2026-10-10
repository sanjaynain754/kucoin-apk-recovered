package com.tencent.rmonitor.looper;

import android.os.Looper;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.common.looper.ILooperDispatchListener;
import com.tencent.bugly.common.looper.LooperDispatchWatcher;
import com.tencent.bugly.proguard.AbstractC33857pa;
import com.tencent.bugly.proguard.C33542aa;
import com.tencent.bugly.proguard.C33878qa;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.rmonitor.common.logger.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/LooperObserver;", "Lcom/tencent/bugly/proguard/pa;", "Lcom/tencent/bugly/common/looper/ILooperDispatchListener;", "Ljava/lang/Thread;", "getMonitoredThread", "", "start", InterfaceC33730j9.f70350a, "", "isOpen", "", "msg", "", "startTime", "onDispatchStart", "endTime", TypedValues.TransitionType.S_DURATION, "onDispatchEnd", "Landroid/os/Looper;", "monitoredLooper", "Landroid/os/Looper;", "Lcom/tencent/bugly/proguard/qa;", "lagParam", "<init>", "(Landroid/os/Looper;Lcom/tencent/bugly/proguard/qa;)V", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
public final class LooperObserver extends AbstractC33857pa implements ILooperDispatchListener {

    @NotNull
    private final Looper monitoredLooper;

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public boolean isOpen() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LooperObserver(@NotNull Looper monitoredLooper, @NotNull C33878qa lagParam) {
        super(lagParam);
        Intrinsics.checkNotNullParameter(monitoredLooper, "monitoredLooper");
        Intrinsics.checkNotNullParameter(lagParam, "lagParam");
        this.monitoredLooper = monitoredLooper;
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    @Nullable
    public Thread getMonitoredThread() {
        return this.monitoredLooper.getThread();
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public void onDispatchEnd(@NotNull String msg, long endTime, long duration) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        endDetection(endTime, duration);
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public void onDispatchStart(@NotNull String msg, long startTime) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        beginDetection(startTime);
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    public void stop() {
        LooperDispatchWatcher.INSTANCE.unregister(this.monitoredLooper, this);
        super.stop();
        Logger.INSTANCE.mo77132i(C33542aa.f68809e, "stop Looper Observer of " + getMonitoredThreadName());
    }

    @Override // com.tencent.bugly.proguard.AbstractC33857pa
    public void start() {
        super.start();
        LooperDispatchWatcher.INSTANCE.register(this.monitoredLooper, this);
        Logger.INSTANCE.mo77132i(C33542aa.f68809e, "start Looper Observer of " + getMonitoredThreadName());
    }
}
