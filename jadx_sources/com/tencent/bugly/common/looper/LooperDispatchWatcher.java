package com.tencent.bugly.common.looper;

import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.util.Printer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.tencent.bugly.common.looper.LooperDispatchWatcher;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.bugly.proguard.C33715if;
import com.tencent.bugly.proguard.C33786m2;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.logger.Logger;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0012J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u0018J\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J \u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\tH\u0002J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\b\u0010%\u001a\u00020\u0007H\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010&\u001a\u00020\u0007H\u0016J\b\u0010'\u001a\u00020\u0012H\u0002J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u000e\u0010)\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fJ\u0010\u0010*\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002J\u0010\u0010,\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, m90084d2 = {"Lcom/tencent/bugly/common/looper/LooperDispatchWatcher;", "Landroid/os/MessageQueue$IdleHandler;", "Lcom/tencent/bugly/common/looper/LooperPrinter$IDispatch;", InterfaceC33617e1.f69652a, "Landroid/os/Looper;", "(Landroid/os/Looper;)V", "isStart", "", "lastCheckPrinterTime", "", "listeners", "Ljava/util/HashSet;", "Lcom/tencent/bugly/common/looper/ILooperDispatchListener;", "Lkotlin/collections/HashSet;", "printer", "Lcom/tencent/bugly/common/looper/LooperPrinter;", "startTime", "addIdleHandler", "", "addListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "checkAndStart", "checkAndStop", "checkValid", "Landroid/util/Printer;", "clearListeners", "dealOriginPrinter", "originPrinter", "dispatch", "isBegin", "log", "", "dispatchEnd", "msg", "endTime", TypedValues.TransitionType.S_DURATION, "dispatchStart", "ignoreOriginPrinter", "queueIdle", "release", "removeIdleHandler", "removeListener", "resetPrinter", "resetPrinterWithOriginPrinter", "resetPrinterWithoutOriginPrinter", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class LooperDispatchWatcher implements MessageQueue.IdleHandler, LooperPrinter.IDispatch {
    private static final long CHECK_TIME_IN_MS = 60000;
    private static final int MAX_CHECK_COUNT = 100;

    @NotNull
    private static final String TAG = "RMonitor_looper_DispatchWatcher";
    private boolean isStart;
    private long lastCheckPrinterTime;

    @NotNull
    private final HashSet<ILooperDispatchListener> listeners;

    @NotNull
    private final Looper looper;

    @Nullable
    private LooperPrinter printer;
    private long startTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ThreadLocal<LooperDispatchWatcher> watcher = new ThreadLocal<>();

    @NotNull
    private static final ConcurrentHashMap<Looper, Handler> handlerMap = new ConcurrentHashMap<>();

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u001a\u0010\u001b\u001a\u00020\u00162\b\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/tencent/bugly/common/looper/LooperDispatchWatcher$Companion;", "", "()V", "CHECK_TIME_IN_MS", "", "MAX_CHECK_COUNT", "", "TAG", "", "handlerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/os/Looper;", "Landroid/os/Handler;", "watcher", "Ljava/lang/ThreadLocal;", "Lcom/tencent/bugly/common/looper/LooperDispatchWatcher;", "fetchHandler", InterfaceC33617e1.f69652a, "createWhenNotExist", "", "fetchWatcher", "forceStop", "", "register", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/tencent/bugly/common/looper/ILooperDispatchListener;", "release", "unregister", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: forceStop$lambda-1, reason: not valid java name */
        public static final void m103808forceStop$lambda1(Looper looper) {
            Companion companion = LooperDispatchWatcher.INSTANCE;
            LooperDispatchWatcher looperDispatchWatcherFetchWatcher = companion.fetchWatcher(looper, false);
            if (looperDispatchWatcherFetchWatcher != null) {
                looperDispatchWatcherFetchWatcher.clearListeners();
                looperDispatchWatcherFetchWatcher.checkAndStop();
                if (looperDispatchWatcherFetchWatcher.getIsStart()) {
                    return;
                }
                companion.release(looper);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: register$lambda-3, reason: not valid java name */
        public static final void m103809register$lambda3(Looper looper, ILooperDispatchListener iLooperDispatchListener) {
            LooperDispatchWatcher looperDispatchWatcherFetchWatcher = LooperDispatchWatcher.INSTANCE.fetchWatcher(looper, true);
            if (looperDispatchWatcherFetchWatcher != null) {
                looperDispatchWatcherFetchWatcher.addListener(iLooperDispatchListener);
                looperDispatchWatcherFetchWatcher.checkAndStart();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: unregister$lambda-5, reason: not valid java name */
        public static final void m103810unregister$lambda5(Looper looper, ILooperDispatchListener iLooperDispatchListener) {
            Companion companion = LooperDispatchWatcher.INSTANCE;
            LooperDispatchWatcher looperDispatchWatcherFetchWatcher = companion.fetchWatcher(looper, false);
            if (looperDispatchWatcherFetchWatcher != null) {
                looperDispatchWatcherFetchWatcher.removeListener(iLooperDispatchListener);
                looperDispatchWatcherFetchWatcher.checkAndStop();
                if (looperDispatchWatcherFetchWatcher.getIsStart()) {
                    return;
                }
                companion.release(looper);
            }
        }

        public final void forceStop(@Nullable final Looper looper) {
            Handler handlerFetchHandler;
            if (looper == null || (handlerFetchHandler = fetchHandler(looper, false)) == null) {
                return;
            }
            handlerFetchHandler.post(new Runnable() { // from class: bc0.f
                @Override // java.lang.Runnable
                public final void run() {
                    LooperDispatchWatcher.Companion.m103808forceStop$lambda1(looper);
                }
            });
        }

        public final void register(@Nullable final Looper looper, @Nullable final ILooperDispatchListener listener) {
            Handler handlerFetchHandler;
            if (listener == null || looper == null || (handlerFetchHandler = fetchHandler(looper, true)) == null) {
                return;
            }
            handlerFetchHandler.post(new Runnable() { // from class: bc0.e
                @Override // java.lang.Runnable
                public final void run() {
                    LooperDispatchWatcher.Companion.m103809register$lambda3(looper, listener);
                }
            });
        }

        public final void unregister(@Nullable final Looper looper, @Nullable final ILooperDispatchListener listener) {
            Handler handlerFetchHandler;
            if (listener == null || looper == null || (handlerFetchHandler = fetchHandler(looper, false)) == null) {
                return;
            }
            handlerFetchHandler.post(new Runnable() { // from class: bc0.g
                @Override // java.lang.Runnable
                public final void run() {
                    LooperDispatchWatcher.Companion.m103810unregister$lambda5(looper, listener);
                }
            });
        }

        private final Handler fetchHandler(Looper looper, boolean createWhenNotExist) {
            Handler handler = (Handler) LooperDispatchWatcher.handlerMap.get(looper);
            if (handler == null && createWhenNotExist) {
                Handler handler2 = new Handler(looper);
                LooperDispatchWatcher.handlerMap.put(looper, handler2);
                Logger.INSTANCE.mo77132i(LooperDispatchWatcher.TAG, "create handler of looper[" + looper + ']');
                return handler2;
            }
            return handler;
        }

        private final LooperDispatchWatcher fetchWatcher(Looper looper, boolean createWhenNotExist) {
            LooperDispatchWatcher looperDispatchWatcher = (LooperDispatchWatcher) LooperDispatchWatcher.watcher.get();
            if (looperDispatchWatcher == null && createWhenNotExist) {
                LooperDispatchWatcher looperDispatchWatcher2 = new LooperDispatchWatcher(looper);
                LooperDispatchWatcher.watcher.set(looperDispatchWatcher2);
                Logger.INSTANCE.mo77132i(LooperDispatchWatcher.TAG, "create watcher of looper[" + looper + ']');
                return looperDispatchWatcher2;
            }
            return looperDispatchWatcher;
        }

        private final void release(Looper looper) {
            LooperDispatchWatcher.watcher.remove();
            LooperDispatchWatcher.handlerMap.remove(looper);
            Logger.INSTANCE.mo77132i(LooperDispatchWatcher.TAG, "release watcher and handler of looper[" + looper + ']');
        }
    }

    private final synchronized void addIdleHandler(Looper looper) {
        if (AndroidVersion.INSTANCE.isOverM()) {
            looper.getQueue().addIdleHandler(this);
        } else {
            try {
                C33715if.m73431b(looper).addIdleHandler(this);
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(TAG, "addIdleHandler in " + looper.getThread().getName() + ", ", th2);
            }
        }
    }

    private final synchronized void release() {
        try {
            LooperPrinter looperPrinter = this.printer;
            if (looperPrinter != null) {
                if (Logger.verbos) {
                    Logger.INSTANCE.mo77133v(TAG, "release printer[" + looperPrinter + "] originPrinter[" + looperPrinter.getOrigin() + "] in " + this.looper.getThread().getName());
                }
                this.looper.setMessageLogging(looperPrinter.getOrigin());
                removeIdleHandler(this.looper);
            }
            this.printer = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void removeIdleHandler(Looper looper) {
        if (AndroidVersion.INSTANCE.isOverM()) {
            looper.getQueue().removeIdleHandler(this);
        } else {
            try {
                C33715if.m73431b(looper).removeIdleHandler(this);
            } catch (Throwable th2) {
                Logger.INSTANCE.exception(TAG, "removeIdleHandler in " + looper.getThread().getName() + ", ", th2);
            }
        }
    }

    private final synchronized void resetPrinter(Looper looper) {
        try {
            if (ignoreOriginPrinter()) {
                resetPrinterWithoutOriginPrinter(looper);
            } else {
                resetPrinterWithOriginPrinter(looper);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Nullable
    public final Printer dealOriginPrinter(@Nullable Printer originPrinter) {
        int i11 = 0;
        while (originPrinter instanceof LooperPrinter) {
            originPrinter = ((LooperPrinter) originPrinter).getOrigin();
            i11++;
            if (i11 >= 100) {
                return null;
            }
        }
        return originPrinter;
    }

    public LooperDispatchWatcher(@NotNull Looper looper) {
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.looper = looper;
        this.listeners = new HashSet<>();
    }

    private final void dispatchEnd(String msg, long endTime, long duration) {
        for (ILooperDispatchListener iLooperDispatchListener : this.listeners) {
            if (iLooperDispatchListener.isOpen()) {
                iLooperDispatchListener.onDispatchEnd(msg, endTime, duration);
            }
        }
    }

    private final void dispatchStart(String msg, long startTime) {
        for (ILooperDispatchListener iLooperDispatchListener : this.listeners) {
            if (iLooperDispatchListener.isOpen()) {
                iLooperDispatchListener.onDispatchStart(msg, startTime);
            }
        }
    }

    private final void resetPrinterWithoutOriginPrinter(Looper looper) {
        if (this.printer == null) {
            this.printer = new LooperPrinter(null, this);
        }
        looper.setMessageLogging(this.printer);
    }

    public final void addListener(@NotNull ILooperDispatchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
    }

    public final void checkAndStart() {
        if (this.isStart || this.listeners.size() == 0) {
            return;
        }
        Logger.INSTANCE.mo77130d(TAG, "checkAndStart in " + this.looper.getThread().getName());
        this.isStart = true;
        resetPrinter(this.looper);
        addIdleHandler(this.looper);
    }

    public final void checkAndStop() {
        if (!this.isStart || this.listeners.size() > 0) {
            return;
        }
        Logger.INSTANCE.mo77130d(TAG, "checkAndStop in " + this.looper.getThread().getName());
        release();
        this.isStart = false;
    }

    public final void clearListeners() {
        this.listeners.clear();
    }

    @Override // com.tencent.bugly.common.looper.LooperPrinter.IDispatch
    public void dispatch(boolean isBegin, @NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
        if (isBegin) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.startTime = jUptimeMillis;
            dispatchStart(log, jUptimeMillis);
        } else if (this.startTime != 0) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            long j11 = jUptimeMillis2 - this.startTime;
            this.startTime = 0L;
            dispatchEnd(log, jUptimeMillis2, j11);
        }
    }

    /* JADX INFO: renamed from: isStart, reason: from getter */
    public final boolean getIsStart() {
        return this.isStart;
    }

    public final void removeListener(@NotNull ILooperDispatchListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    private final boolean ignoreOriginPrinter() {
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33786m2.f70892t);
        if ((abstractC34022xeM77083a instanceof C33786m2) && ((C33786m2) abstractC34022xeM77083a).m74020c()) {
            return true;
        }
        return false;
    }

    private final void resetPrinterWithOriginPrinter(Looper looper) {
        Printer printerM73427a = C33715if.m73427a(looper);
        LooperPrinter looperPrinter = this.printer;
        if (printerM73427a != looperPrinter || looperPrinter == null) {
            if (looperPrinter != null) {
                Logger.INSTANCE.mo77134w(TAG, "resetPrinter maybe printer[" + this.printer + "] was replace by other[" + printerM73427a + "] in " + looper.getThread().getName() + ' ');
            }
            LooperPrinter looperPrinter2 = new LooperPrinter(dealOriginPrinter(printerM73427a), this);
            this.printer = looperPrinter2;
            looper.setMessageLogging(looperPrinter2);
            if (printerM73427a == null && !Logger.debug) {
                return;
            }
            Logger.INSTANCE.mo77134w(TAG, "resetPrinter printer[" + this.printer + "] originPrinter[" + printerM73427a + "] in " + looper.getThread().getName());
        }
    }

    @Override // com.tencent.bugly.common.looper.LooperPrinter.IDispatch
    public boolean checkValid(@NotNull Printer printer) {
        Intrinsics.checkNotNullParameter(printer, "printer");
        LooperPrinter looperPrinter = this.printer;
        if (printer == looperPrinter && looperPrinter != null) {
            return true;
        }
        return false;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public boolean queueIdle() {
        if (SystemClock.uptimeMillis() - this.lastCheckPrinterTime >= 60000) {
            resetPrinter(this.looper);
            this.lastCheckPrinterTime = SystemClock.uptimeMillis();
            return true;
        }
        return true;
    }
}
