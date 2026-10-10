package com.tencent.bugly.common.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m90084d2 = {"Lcom/tencent/bugly/common/thread/ThreadManager;", "", "()V", "Companion", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
public final class ThreadManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile Looper DUMP_LOOPER;

    @Nullable
    private static volatile Looper LOG_ERROR_LOOPER;

    @Nullable
    private static volatile Looper MONITOR_LOOPER;

    @Nullable
    private static volatile Handler dumpThreadHandler;

    @Nullable
    private static volatile Handler logAndErrorThreadHandler;

    @Nullable
    private static volatile Handler mainThreadHandler;

    @Nullable
    private static volatile Handler monitorThreadHandler;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u0004H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0007J$\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u001a\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/tencent/bugly/common/thread/ThreadManager$Companion;", "", "()V", "DUMP_LOOPER", "Landroid/os/Looper;", "LOG_ERROR_LOOPER", "MONITOR_LOOPER", "dumpThreadHandler", "Landroid/os/Handler;", "logAndErrorThreadHandler", "mainThreadHandler", "monitorThreadHandler", "cancelFromDumpThread", "", "task", "Ljava/lang/Runnable;", "cancelFromMainThread", "cancelFromMonitorThread", "getDumpThreadLooper", "getLogAndErrorThreadLooper", "getMonitorThreadLooper", "inMonitorThread", "", "postDelayed", "delay", "", "handler", "runInDumpThread", "runInLogThread", "runInMainThread", "runInMonitorThread", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final void postDelayed(Runnable task, long delay, Handler handler) {
            if (delay == 0) {
                if (handler != null) {
                    handler.post(task);
                }
            } else if (handler != null) {
                handler.postDelayed(task, delay);
            }
        }

        public static /* synthetic */ void postDelayed$default(Companion companion, Runnable runnable, long j11, Handler handler, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            companion.postDelayed(runnable, j11, handler);
        }

        public static /* synthetic */ void runInDumpThread$default(Companion companion, Runnable runnable, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            companion.runInDumpThread(runnable, j11);
        }

        public static /* synthetic */ void runInLogThread$default(Companion companion, Runnable runnable, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            companion.runInLogThread(runnable, j11);
        }

        public static /* synthetic */ void runInMainThread$default(Companion companion, Runnable runnable, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            companion.runInMainThread(runnable, j11);
        }

        public static /* synthetic */ void runInMonitorThread$default(Companion companion, Runnable runnable, long j11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                j11 = 0;
            }
            companion.runInMonitorThread(runnable, j11);
        }

        @JvmStatic
        public final void cancelFromDumpThread(@NotNull Runnable task) {
            Intrinsics.checkNotNullParameter(task, "task");
            Handler handler = ThreadManager.dumpThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(task);
            }
        }

        @JvmStatic
        public final void cancelFromMainThread(@NotNull Runnable task) {
            Intrinsics.checkNotNullParameter(task, "task");
            Handler handler = ThreadManager.mainThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(task);
            }
        }

        @JvmStatic
        public final void cancelFromMonitorThread(@NotNull Runnable task) {
            Intrinsics.checkNotNullParameter(task, "task");
            Handler handler = ThreadManager.monitorThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(task);
            }
        }

        @JvmStatic
        @NotNull
        public final Looper getDumpThreadLooper() {
            if (ThreadManager.DUMP_LOOPER == null) {
                synchronized (ThreadManager.class) {
                    try {
                        if (ThreadManager.DUMP_LOOPER == null) {
                            HandlerThread handlerThread = new HandlerThread("RMonitor_Dump");
                            handlerThread.start();
                            ThreadManager.DUMP_LOOPER = handlerThread.getLooper();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Looper looper = ThreadManager.DUMP_LOOPER;
            Intrinsics.checkNotNull(looper);
            return looper;
        }

        @JvmStatic
        @NotNull
        public final Looper getLogAndErrorThreadLooper() {
            if (ThreadManager.LOG_ERROR_LOOPER == null) {
                synchronized (ThreadManager.class) {
                    try {
                        if (ThreadManager.LOG_ERROR_LOOPER == null) {
                            HandlerThread handlerThread = new HandlerThread("RMonitor_Log");
                            handlerThread.start();
                            ThreadManager.LOG_ERROR_LOOPER = handlerThread.getLooper();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Looper looper = ThreadManager.LOG_ERROR_LOOPER;
            Intrinsics.checkNotNull(looper);
            return looper;
        }

        @JvmStatic
        @NotNull
        public final Looper getMonitorThreadLooper() {
            if (ThreadManager.MONITOR_LOOPER == null) {
                synchronized (ThreadManager.class) {
                    try {
                        if (ThreadManager.MONITOR_LOOPER == null) {
                            HandlerThread handlerThread = new HandlerThread("RMonitor_Monitor");
                            handlerThread.start();
                            ThreadManager.MONITOR_LOOPER = handlerThread.getLooper();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Looper looper = ThreadManager.MONITOR_LOOPER;
            Intrinsics.checkNotNull(looper);
            return looper;
        }

        @JvmStatic
        public final boolean inMonitorThread() {
            return Intrinsics.areEqual(Thread.currentThread(), getMonitorThreadLooper().getThread());
        }

        @JvmStatic
        public final void runInDumpThread(@NotNull Runnable task, long delay) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (ThreadManager.dumpThreadHandler == null) {
                ThreadManager.dumpThreadHandler = new Handler(getDumpThreadLooper());
            }
            postDelayed(task, delay, ThreadManager.dumpThreadHandler);
        }

        @JvmStatic
        public final void runInLogThread(@NotNull Runnable task, long delay) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (ThreadManager.logAndErrorThreadHandler == null) {
                ThreadManager.logAndErrorThreadHandler = new Handler(getLogAndErrorThreadLooper());
            }
            postDelayed(task, delay, ThreadManager.logAndErrorThreadHandler);
        }

        @JvmStatic
        public final void runInMainThread(@NotNull Runnable task, long delay) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (ThreadManager.mainThreadHandler == null) {
                ThreadManager.mainThreadHandler = new Handler(Looper.getMainLooper());
            }
            postDelayed(task, delay, ThreadManager.mainThreadHandler);
        }

        @JvmStatic
        public final void runInMonitorThread(@NotNull Runnable task, long delay) {
            Intrinsics.checkNotNullParameter(task, "task");
            if (ThreadManager.monitorThreadHandler == null) {
                ThreadManager.monitorThreadHandler = new Handler(getMonitorThreadLooper());
            }
            postDelayed(task, delay, ThreadManager.monitorThreadHandler);
        }
    }

    @JvmStatic
    public static final void cancelFromDumpThread(@NotNull Runnable runnable) {
        INSTANCE.cancelFromDumpThread(runnable);
    }

    @JvmStatic
    public static final void cancelFromMainThread(@NotNull Runnable runnable) {
        INSTANCE.cancelFromMainThread(runnable);
    }

    @JvmStatic
    public static final void cancelFromMonitorThread(@NotNull Runnable runnable) {
        INSTANCE.cancelFromMonitorThread(runnable);
    }

    @JvmStatic
    @NotNull
    public static final Looper getDumpThreadLooper() {
        return INSTANCE.getDumpThreadLooper();
    }

    @JvmStatic
    @NotNull
    public static final Looper getLogAndErrorThreadLooper() {
        return INSTANCE.getLogAndErrorThreadLooper();
    }

    @JvmStatic
    @NotNull
    public static final Looper getMonitorThreadLooper() {
        return INSTANCE.getMonitorThreadLooper();
    }

    @JvmStatic
    public static final boolean inMonitorThread() {
        return INSTANCE.inMonitorThread();
    }

    @JvmStatic
    public static final void runInDumpThread(@NotNull Runnable runnable, long j11) {
        INSTANCE.runInDumpThread(runnable, j11);
    }

    @JvmStatic
    public static final void runInLogThread(@NotNull Runnable runnable, long j11) {
        INSTANCE.runInLogThread(runnable, j11);
    }

    @JvmStatic
    public static final void runInMainThread(@NotNull Runnable runnable, long j11) {
        INSTANCE.runInMainThread(runnable, j11);
    }

    @JvmStatic
    public static final void runInMonitorThread(@NotNull Runnable runnable, long j11) {
        INSTANCE.runInMonitorThread(runnable, j11);
    }
}
