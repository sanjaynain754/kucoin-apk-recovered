package com.tencent.bugly.common.replay;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.bugly.common.replay.tool.ExecutorsKt;
import com.tencent.bugly.common.replay.tool.MainLooperHandler;
import com.tencent.bugly.common.thread.ThreadManager;
import com.tencent.bugly.proguard.AbstractC34022xe;
import com.tencent.bugly.proguard.C33598d3;
import com.tencent.bugly.proguard.C33757kf;
import com.tencent.bugly.proguard.C33948u0;
import com.tencent.bugly.proguard.InterfaceC33708i8;
import com.tencent.bugly.proguard.InterfaceC33730j9;
import com.tencent.rmonitor.base.config.C35101b;
import com.tencent.rmonitor.common.lifecycle.IActivityStateCallback;
import com.tencent.rmonitor.common.lifecycle.LifecycleCallback;
import com.tencent.rmonitor.common.logger.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jdk7.AutoCloseableKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000\u0093\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001A\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002LMB\u0011\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010KJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\r\u001a\u00020\bJ\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R0\u0010&\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060$0#j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060$`%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R#\u00107\u001a\n 2*\u0004\u0018\u000101018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010I¨\u0006N"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/BuglyReplayManager;", "Lcom/tencent/bugly/common/replay/IReplay;", "Lcom/tencent/bugly/common/replay/OnRootViewsChangedListener;", "Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;", "", "init", "Landroid/view/View;", "root", "", "added", "onRootViewsChanged", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "getBuglyReplayOptions", "isInitialize", "start", "resume", "pause", InterfaceC33730j9.f70350a, "close", "onForeground", "onBackground", "Landroid/app/Activity;", "activity", "onCreate", "onPostCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy", "options", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "rootViews", "Ljava/util/ArrayList;", "Lcom/tencent/bugly/proguard/u0;", "rootViewsLock", "Lcom/tencent/bugly/proguard/u0;", "Lcom/tencent/bugly/common/replay/ScreenshotRecorder;", "recorder", "Lcom/tencent/bugly/common/replay/ScreenshotRecorder;", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;", "recorderConfig", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "capturer$delegate", "Lkotlin/Lazy;", "getCapturer", "()Ljava/util/concurrent/ScheduledExecutorService;", "capturer", "Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;", "mainLooperHandler", "Lcom/tencent/bugly/common/replay/tool/MainLooperHandler;", "Lcom/tencent/bugly/common/replay/ReplayCache;", "replayCache", "Lcom/tencent/bugly/common/replay/ReplayCache;", "initialize", "Z", "enableThisTime", "com/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1", "periodicRunnable", "Lcom/tencent/bugly/common/replay/BuglyReplayManager$periodicRunnable$1;", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "Lcom/tencent/bugly/common/replay/ScreenshotRecorderCallback;", "Lcom/tencent/bugly/common/replay/RootViewsSpy;", "rootViewsSpy", "Lcom/tencent/bugly/common/replay/RootViewsSpy;", "<init>", "(Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)V", "Companion", "RecorderExecutorServiceThreadFactory", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0})
@TargetApi(26)
public final class BuglyReplayManager implements IReplay, OnRootViewsChangedListener, IActivityStateCallback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile BuglyReplayManager INSTANCE = null;

    @NotNull
    private static final String TAG = "BuglyReplayManager";

    /* JADX INFO: renamed from: capturer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy capturer;
    private boolean enableThisTime;
    private boolean initialize;

    @NotNull
    private final AtomicBoolean isRecording;

    @NotNull
    private final MainLooperHandler mainLooperHandler;

    @NotNull
    private final BuglyReplayOptions options;

    @NotNull
    private final BuglyReplayManager$periodicRunnable$1 periodicRunnable;

    @Nullable
    private ScreenshotRecorder recorder;

    @Nullable
    private ScreenshotRecorderConfig recorderConfig;

    @NotNull
    private final ReplayCache replayCache;

    @NotNull
    private final ArrayList<WeakReference<View>> rootViews;

    @NotNull
    private final C33948u0 rootViewsLock;

    @Nullable
    private RootViewsSpy rootViewsSpy;

    @NotNull
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/BuglyReplayManager$Companion;", "", "()V", "INSTANCE", "Lcom/tencent/bugly/common/replay/BuglyReplayManager;", "TAG", "", "getInstance", "options", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BuglyReplayManager getInstance(@NotNull BuglyReplayOptions options) {
            BuglyReplayManager buglyReplayManager;
            Intrinsics.checkNotNullParameter(options, "options");
            BuglyReplayManager buglyReplayManager2 = BuglyReplayManager.INSTANCE;
            if (buglyReplayManager2 != null) {
                return buglyReplayManager2;
            }
            synchronized (this) {
                buglyReplayManager = BuglyReplayManager.INSTANCE;
                if (buglyReplayManager == null) {
                    buglyReplayManager = new BuglyReplayManager(options, null);
                    BuglyReplayManager.INSTANCE = buglyReplayManager;
                }
            }
            return buglyReplayManager;
        }

        private Companion() {
        }

        @Nullable
        public final BuglyReplayManager getInstance() {
            return BuglyReplayManager.INSTANCE;
        }
    }

    public /* synthetic */ BuglyReplayManager(BuglyReplayOptions buglyReplayOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(buglyReplayOptions);
    }

    /* JADX INFO: compiled from: BUGLY */
    @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/BuglyReplayManager$RecorderExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class RecorderExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r11) {
            Intrinsics.checkNotNullParameter(r11, "r");
            StringBuilder sb2 = new StringBuilder("BuglyWindowRecorder-");
            int i11 = this.cnt;
            this.cnt = i11 + 1;
            sb2.append(i11);
            Thread thread = new Thread(r11, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.tencent.bugly.common.replay.BuglyReplayManager$periodicRunnable$1] */
    private BuglyReplayManager(BuglyReplayOptions buglyReplayOptions) {
        this.options = buglyReplayOptions;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.rootViewsLock = new C33948u0();
        this.capturer = LazyKt.lazy(new Function0<ScheduledExecutorService>() { // from class: com.tencent.bugly.common.replay.BuglyReplayManager$capturer$2
            @Override // p852kotlin.jvm.functions.Function0
            public final ScheduledExecutorService invoke() {
                return Executors.newSingleThreadScheduledExecutor(new BuglyReplayManager.RecorderExecutorServiceThreadFactory());
            }
        });
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
        this.replayCache = new ReplayCache(buglyReplayOptions);
        this.periodicRunnable = new Runnable() { // from class: com.tencent.bugly.common.replay.BuglyReplayManager$periodicRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                ScreenshotRecorder screenshotRecorder = this.this$0.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.capture();
                }
                ThreadManager.Companion companion = ThreadManager.INSTANCE;
                ScreenshotRecorderConfig screenshotRecorderConfig = this.this$0.recorderConfig;
                companion.runInDumpThread(this, 1000 / ((long) (screenshotRecorderConfig != null ? screenshotRecorderConfig.getFrameRate() : 1)));
            }
        };
        this.screenshotRecorderCallback = new BuglyReplayManager$screenshotRecorderCallback$1(this);
    }

    private final ScheduledExecutorService getCapturer() {
        return (ScheduledExecutorService) this.capturer.getValue();
    }

    private final void init() {
        if (this.initialize) {
            return;
        }
        AbstractC34022xe abstractC34022xeM77083a = C35101b.c.f75199a.m77083a(C33757kf.f70663i);
        if (abstractC34022xeM77083a != null && (abstractC34022xeM77083a instanceof C33757kf)) {
            Boolean boolM73819d = ((C33757kf) abstractC34022xeM77083a).m73819d();
            Intrinsics.checkNotNullExpressionValue(boolM73819d, "replayReportConfig.isReplayReportEnabled()");
            if (boolM73819d.booleanValue()) {
                this.enableThisTime = true;
            }
        }
        LifecycleCallback.register(this);
        if (this.rootViewsSpy == null) {
            this.rootViewsSpy = RootViewsSpy.INSTANCE.install();
        }
        this.initialize = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        RootViewsSpy rootViewsSpy;
        CopyOnWriteArrayList<OnRootViewsChangedListener> listeners;
        if (!this.initialize) {
            init();
        }
        if (!this.enableThisTime) {
            Logger.INSTANCE.mo77134w(TAG, "close: not enabled");
            return;
        }
        RootViewsSpy rootViewsSpy2 = this.rootViewsSpy;
        if (rootViewsSpy2 != null) {
            Intrinsics.checkNotNull(rootViewsSpy2);
            if (rootViewsSpy2.getListeners().contains(this) && (rootViewsSpy = this.rootViewsSpy) != null && (listeners = rootViewsSpy.getListeners()) != null) {
                listeners.remove(this);
            }
        }
        stop();
        ScheduledExecutorService capturer = getCapturer();
        Intrinsics.checkNotNullExpressionValue(capturer, "capturer");
        ExecutorsKt.gracefullyShutdown(capturer);
        ThreadManager.INSTANCE.cancelFromDumpThread(this.periodicRunnable);
    }

    @NotNull
    /* JADX INFO: renamed from: getBuglyReplayOptions, reason: from getter */
    public final BuglyReplayOptions getOptions() {
        return this.options;
    }

    /* JADX INFO: renamed from: isInitialize, reason: from getter */
    public final boolean getInitialize() {
        return this.initialize;
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onCreate(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onDestroy(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPause(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onPostCreate(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onResume(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStart(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onStop(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.tencent.bugly.common.replay.IReplay
    public void pause() {
        if (!this.initialize) {
            init();
        }
        if (!this.enableThisTime) {
            Logger.INSTANCE.mo77134w(TAG, "pause: not enabled");
            return;
        }
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.pause();
        }
        ThreadManager.INSTANCE.cancelFromDumpThread(this.periodicRunnable);
    }

    @Override // com.tencent.bugly.common.replay.IReplay
    public void resume() {
        if (!this.initialize) {
            init();
        }
        if (!this.enableThisTime) {
            Logger.INSTANCE.mo77134w(TAG, "resume: not enabled");
            return;
        }
        ScreenshotRecorder screenshotRecorder = this.recorder;
        if (screenshotRecorder != null) {
            screenshotRecorder.resume();
        }
        ThreadManager.Companion companion = ThreadManager.INSTANCE;
        companion.cancelFromDumpThread(this.periodicRunnable);
        companion.runInDumpThread(this.periodicRunnable, 100L);
    }

    @Override // com.tencent.bugly.common.replay.IReplay
    public void start() {
        ScreenshotRecorder screenshotRecorder;
        RootViewsSpy rootViewsSpy;
        CopyOnWriteArrayList<OnRootViewsChangedListener> listeners;
        if (!this.initialize) {
            init();
        }
        if (!this.enableThisTime) {
            Logger.INSTANCE.mo77134w(TAG, "start: not enabled");
            return;
        }
        if (this.isRecording.getAndSet(true)) {
            return;
        }
        ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
        Context contextM72772c = C33598d3.m72772c();
        Intrinsics.checkNotNullExpressionValue(contextM72772c, "getGlobalContext()");
        ScreenshotRecorderConfig screenshotRecorderConfigFrom = companion.from(contextM72772c, this.options);
        this.recorderConfig = screenshotRecorderConfigFrom;
        Intrinsics.checkNotNull(screenshotRecorderConfigFrom);
        BuglyReplayOptions buglyReplayOptions = this.options;
        MainLooperHandler mainLooperHandler = this.mainLooperHandler;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new RecorderExecutorServiceThreadFactory());
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "newSingleThreadScheduled…orServiceThreadFactory())");
        this.recorder = new ScreenshotRecorder(screenshotRecorderConfigFrom, buglyReplayOptions, mainLooperHandler, scheduledExecutorServiceNewSingleThreadScheduledExecutor, this.screenshotRecorderCallback);
        ThreadManager.Companion companion2 = ThreadManager.INSTANCE;
        companion2.cancelFromDumpThread(this.periodicRunnable);
        companion2.runInDumpThread(this.periodicRunnable, 100L);
        RootViewsSpy rootViewsSpy2 = this.rootViewsSpy;
        if (rootViewsSpy2 != null) {
            Intrinsics.checkNotNull(rootViewsSpy2);
            if (!rootViewsSpy2.getListeners().contains(this) && (rootViewsSpy = this.rootViewsSpy) != null && (listeners = rootViewsSpy.getListeners()) != null) {
                listeners.add(this);
            }
        }
        if (LifecycleCallback.INSTANCE.isCurrentAppOnForeground(C33598d3.m72772c()) || (screenshotRecorder = this.recorder) == null) {
            return;
        }
        screenshotRecorder.pause();
    }

    @Override // com.tencent.bugly.common.replay.IReplay
    public void stop() {
        if (!this.initialize) {
            init();
        }
        if (!this.enableThisTime) {
            Logger.INSTANCE.mo77134w(TAG, "stop: not enabled");
            return;
        }
        InterfaceC33708i8 interfaceC33708i8M75112a = this.rootViewsLock.m75112a();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.unbind((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            Unit unit = Unit.INSTANCE;
            AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
            ScreenshotRecorder screenshotRecorder2 = this.recorder;
            if (screenshotRecorder2 != null) {
                screenshotRecorder2.close();
            }
            this.recorder = null;
            this.isRecording.set(false);
            ThreadManager.INSTANCE.cancelFromDumpThread(this.periodicRunnable);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, th2);
                throw th3;
            }
        }
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onBackground() {
        pause();
    }

    @Override // com.tencent.rmonitor.common.lifecycle.IActivityStateCallback
    public void onForeground() {
        resume();
    }

    @Override // com.tencent.bugly.common.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(@NotNull final View root, boolean added) {
        View view;
        Intrinsics.checkNotNullParameter(root, "root");
        InterfaceC33708i8 interfaceC33708i8M75112a = this.rootViewsLock.m75112a();
        try {
            if (added) {
                this.rootViews.add(new WeakReference<>(root));
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.bind(root);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                ScreenshotRecorder screenshotRecorder2 = this.recorder;
                if (screenshotRecorder2 != null) {
                    screenshotRecorder2.unbind(root);
                }
                CollectionsKt.removeAll((List) this.rootViews, (Function1) new Function1<WeakReference<View>, Boolean>() { // from class: com.tencent.bugly.common.replay.BuglyReplayManager$onRootViewsChanged$1$1
                    @Override // p852kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull WeakReference<View> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(Intrinsics.areEqual(it.get(), root));
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
                WeakReference weakReference = (WeakReference) CollectionsKt.lastOrNull((List) this.rootViews);
                if (weakReference != null) {
                    view = (View) weakReference.get();
                } else {
                    view = null;
                }
                if (view != null && !Intrinsics.areEqual(root, view)) {
                    ScreenshotRecorder screenshotRecorder3 = this.recorder;
                    if (screenshotRecorder3 != null) {
                        screenshotRecorder3.bind(view);
                        Unit unit2 = Unit.INSTANCE;
                    }
                } else {
                    Unit unit3 = Unit.INSTANCE;
                }
            }
            AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AutoCloseableKt.closeFinally(interfaceC33708i8M75112a, th2);
                throw th3;
            }
        }
    }
}
