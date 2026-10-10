package com.tencent.rmonitor.looper.provider;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.bugly.proguard.C33673gf;
import com.tencent.bugly.proguard.C33799mf;
import com.tencent.bugly.proguard.C33800mg;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.thread.suspend.ThreadSuspend;
import com.tencent.rmonitor.common.logger.Logger;
import com.tencent.rmonitor.looper.MonitorInfo;
import com.tencent.rmonitor.looper.listener.IMonitorCallback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes56.dex */
@Metadata(m90083d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H&J\n\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0004J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ#\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H&¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u000bH\u0016J\u0018\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010(\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020\rH\u0002J \u0010)\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020'2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010*\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, m90084d2 = {"Lcom/tencent/rmonitor/looper/provider/MultiStackProvider;", "Lcom/tencent/rmonitor/looper/provider/BaseStackProvider;", "Landroid/os/Handler$Callback;", "()V", "lastStackRequestTime", "", "monitorCallBack", "Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;", "stackThreadHandler", "Landroid/os/Handler;", "beginTrace", "", "monitorInfo", "Lcom/tencent/rmonitor/looper/MonitorInfo;", "dispatchEnd", "endTime", TypedValues.TransitionType.S_DURATION, "dispatchStart", "startTime", "endTrace", "isOverThreshold", "", "getStackThreadHandler", "handleCollectCompleted", "handleCollectStart", "handleMessage", "msg", "Landroid/os/Message;", "init", TUIConstants.TUIChat.CALL_BACK, "isCurrentMsg", "onTrace", "stackTrace", "", "Ljava/lang/StackTraceElement;", "(Lcom/tencent/rmonitor/looper/MonitorInfo;[Ljava/lang/StackTraceElement;)V", "release", "removeMonitorMessage", "what", "", "sendMonitorMessage", "sendMonitorMessageDelay", "delay", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public abstract class MultiStackProvider extends BaseStackProvider implements Handler.Callback {
    public static final long LONG_LAG_LIMIT = 5000;
    public static final int MSG_COLLECT_COMPLETED = 2;
    public static final int MSG_COLLECT_START = 1;

    @NotNull
    public static final String TAG = "RMonitor_looper_StackProvider";
    private long lastStackRequestTime;

    @Nullable
    private IMonitorCallback monitorCallBack;

    @Nullable
    private Handler stackThreadHandler;

    private final void handleCollectCompleted(MonitorInfo monitorInfo) {
        endTrace(monitorInfo, true);
        IMonitorCallback iMonitorCallback = this.monitorCallBack;
        if (iMonitorCallback != null) {
            iMonitorCallback.onAfterStack(monitorInfo);
        }
    }

    public abstract void beginTrace(@NotNull MonitorInfo monitorInfo);

    public abstract void endTrace(@NotNull MonitorInfo monitorInfo, boolean isOverThreshold);

    public abstract void onTrace(@NotNull MonitorInfo monitorInfo, @NotNull StackTraceElement[] stackTrace);

    private final void handleCollectStart(MonitorInfo monitorInfo) {
        if (!isCurrentMsg(monitorInfo)) {
            Logger.INSTANCE.mo77130d("RMonitor_looper_StackProvider", "handleCollectStart, deal msg not latest msg before trace, latest: " + this.lastStackRequestTime + ", deal: " + monitorInfo.getLastStackRequestTime());
            return;
        }
        appendData(monitorInfo);
        long jCurrentTimeMillis = System.currentTimeMillis() - monitorInfo.getLastStackRequestTime();
        if (jCurrentTimeMillis > getLagParam().f71552c) {
            long j11 = 5000 - jCurrentTimeMillis;
            MonitorInfo monitorInfoCopy = monitorInfo.copy();
            monitorInfoCopy.setDuration(Math.max(5000L, jCurrentTimeMillis));
            monitorInfoCopy.setDetectedLongLag(true);
            if (j11 <= 0) {
                handleCollectCompleted(monitorInfoCopy);
                return;
            } else {
                sendMonitorMessageDelay(2, monitorInfoCopy, j11);
                return;
            }
        }
        Thread looperThread = getLooperThread();
        if (looperThread == null || !looperThread.isAlive()) {
            return;
        }
        try {
            long jM77113b = shouldSuspendBeforeGetStack() ? ThreadSuspend.m77109c().m77113b(looperThread) : 0L;
            StackTraceElement[] stackTrace = looperThread.getStackTrace();
            if (jM77113b != 0) {
                ThreadSuspend.m77109c().m77111a(jM77113b);
            }
            if (isCurrentMsg(monitorInfo)) {
                Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
                onTrace(monitorInfo, stackTrace);
                sendMonitorMessageDelay(1, monitorInfo, getLagParam().f71553d);
            } else {
                Logger.INSTANCE.mo77130d("RMonitor_looper_StackProvider", "handleCollectStart, deal msg not latest msg after trace, latest: " + this.lastStackRequestTime + ", deal: " + monitorInfo.getLastStackRequestTime());
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.mo77131e("RMonitor_looper_StackProvider", C33799mf.m74131a("on trace fail for ", th2));
        }
    }

    private final void removeMonitorMessage(int what, MonitorInfo monitorInfo) {
        Handler handler = this.stackThreadHandler;
        if (handler != null) {
            handler.removeMessages(what, monitorInfo);
        }
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void dispatchEnd(@NotNull MonitorInfo monitorInfo, long endTime, long duration) {
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
        removeMonitorMessage(1, monitorInfo);
        if (duration >= getLagParam().f71551b) {
            appendData(monitorInfo);
            sendMonitorMessage(2, monitorInfo.copy());
        } else {
            endTrace(monitorInfo, false);
        }
        this.lastStackRequestTime = 0L;
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void dispatchStart(@NotNull MonitorInfo monitorInfo, long startTime) {
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
        this.lastStackRequestTime = monitorInfo.getLastStackRequestTime();
        beginTrace(monitorInfo);
        sendMonitorMessageDelay(1, monitorInfo, getLagParam().f71553d);
    }

    @Nullable
    public final Handler getStackThreadHandler() {
        return this.stackThreadHandler;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Object obj = msg.obj;
        MonitorInfo monitorInfo = obj instanceof MonitorInfo ? (MonitorInfo) obj : null;
        if (monitorInfo == null) {
            return false;
        }
        int i11 = msg.what;
        if (i11 == 1) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jM73200b = C33673gf.m73200b();
            handleCollectStart(monitorInfo);
            monitorInfo.addCollectStackMsgSample(jUptimeMillis - msg.getWhen(), C33673gf.m73200b() - jM73200b);
        } else if (i11 == 2) {
            handleCollectCompleted(monitorInfo);
        }
        return true;
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public boolean init(@NotNull IMonitorCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.monitorCallBack = callback;
        try {
            Looper looperM74132a = C33800mg.m74132a(getLooperThread());
            if (looperM74132a == null) {
                return false;
            }
            this.stackThreadHandler = new Handler(looperM74132a, this);
            return true;
        } catch (Exception e11) {
            Logger.INSTANCE.mo77131e("RMonitor_looper_StackProvider", "prepare stack provider fail for exception {" + e11 + '}');
            return false;
        }
    }

    public final boolean isCurrentMsg(@NotNull MonitorInfo monitorInfo) {
        Intrinsics.checkNotNullParameter(monitorInfo, "monitorInfo");
        long j11 = this.lastStackRequestTime;
        return j11 != 0 && j11 == monitorInfo.getLastStackRequestTime();
    }

    @Override // com.tencent.rmonitor.looper.provider.BaseStackProvider
    public void release() {
        Handler handler = this.stackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.stackThreadHandler = null;
        C33800mg.m74134e(getLooperThread());
        this.monitorCallBack = null;
    }

    private final void sendMonitorMessage(int what, MonitorInfo monitorInfo) {
        Message messageObtain = Message.obtain();
        messageObtain.what = what;
        messageObtain.obj = monitorInfo;
        Handler handler = this.stackThreadHandler;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    private final void sendMonitorMessageDelay(int what, MonitorInfo monitorInfo, long delay) {
        Message messageObtain = Message.obtain();
        messageObtain.what = what;
        messageObtain.obj = monitorInfo;
        Handler handler = this.stackThreadHandler;
        if (handler != null) {
            handler.sendMessageDelayed(messageObtain, delay);
        }
    }
}
