package com.kubi.sdk.startup;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewTreeObserver;
import androidx.annotation.MainThread;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.monitor.TechnologyEvent;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o00.C42917g;
import o00.C42918h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p569qq.InterfaceC43845f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: StartupLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\rJ\r\u0010\u0018\u001a\u00020\u0012*\u00020\u0019H\u0082\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupLifecycle;", "", "()V", "DELAY_TIME", "", "TAG", "", "clearFlag", "Ljava/util/concurrent/atomic/AtomicBoolean;", "launcherRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/kubi/sdk/startup/StartupLifecycle$StartupLifecycleLauncher;", "clear", "", "context", "Landroid/app/Application;", "init", "isMainProcess", "", "suspend", "logi", "tag", "msg", "resume", "isThirdParty", "Landroid/app/Activity;", "FirstTimeOnDrawListener", "StartupLifecycleLauncher", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupLifecycle.kt\ncom/kubi/sdk/startup/StartupLifecycle\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,475:1\n1#2:476\n*E\n"})
public final class StartupLifecycle {
    private static final long DELAY_TIME = 3;

    @NotNull
    private static final String TAG = "StartupDispatcher";

    @NotNull
    public static final StartupLifecycle INSTANCE = new StartupLifecycle();

    @NotNull
    private static final AtomicReference<StartupLifecycleLauncher> launcherRef = new AtomicReference<>(null);

    @NotNull
    private static final AtomicBoolean clearFlag = new AtomicBoolean(false);

    /* JADX INFO: compiled from: StartupLifecycle.kt */
    @Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0016R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00030\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupLifecycle$FirstTimeOnDrawListener;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "activity", "Landroid/app/Activity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V", "activityRef", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "handler", "Landroid/os/Handler;", "invoked", "", "getListener", "()Lkotlin/jvm/functions/Function0;", "addListener", "onDraw", "Companion", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class FirstTimeOnDrawListener implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @NotNull
        private final WeakReference<Activity> activityRef;

        @NotNull
        private final Handler handler;
        private boolean invoked;

        @NotNull
        private final Function0<Unit> listener;

        /* JADX INFO: compiled from: StartupLifecycle.kt */
        @Metadata(m90083d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupLifecycle$FirstTimeOnDrawListener$Companion;", "", "()V", "addFirstTimeOnDrawListener", "", "activity", "Landroid/app/Activity;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function0;", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            @MainThread
            public final void addFirstTimeOnDrawListener(@NotNull Activity activity, @NotNull Function0<Unit> listener) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(listener, "listener");
                new FirstTimeOnDrawListener(activity, listener).addListener();
            }
        }

        public FirstTimeOnDrawListener(@NotNull Activity activity, @NotNull Function0<Unit> listener) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.listener = listener;
            this.activityRef = new WeakReference<>(activity);
            this.handler = new Handler(Looper.getMainLooper());
        }

        @JvmStatic
        @MainThread
        public static final void addFirstTimeOnDrawListener(@NotNull Activity activity, @NotNull Function0<Unit> function0) {
            INSTANCE.addFirstTimeOnDrawListener(activity, function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addListener() {
            Activity activity = this.activityRef.get();
            if (activity == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 26) {
                Handler handler = this.handler;
                final Function0<Unit> function0 = this.listener;
                handler.post(new Runnable() { // from class: com.kubi.sdk.startup.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        StartupLifecycle.FirstTimeOnDrawListener.addListener$lambda$1(function0);
                    }
                });
                return;
            }
            try {
                activity.getWindow().getDecorView().getViewTreeObserver().addOnDrawListener(new FirstTimeOnDrawListener(activity, this.listener));
            } catch (Exception e11) {
                C44128b.m97265i(e11.toString());
                Handler handler2 = this.handler;
                final Function0<Unit> function1 = this.listener;
                handler2.post(new Runnable() { // from class: com.kubi.sdk.startup.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        StartupLifecycle.FirstTimeOnDrawListener.addListener$lambda$0(function1);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addListener$lambda$0(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void addListener$lambda$1(Function0 tmp0) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            tmp0.invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onDraw$lambda$2(FirstTimeOnDrawListener this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.listener.invoke();
            Activity activity = this$0.activityRef.get();
            if (activity == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = activity.getWindow().getDecorView().getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this$0);
            }
        }

        @NotNull
        public final Function0<Unit> getListener() {
            return this.listener;
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (this.invoked) {
                return;
            }
            this.invoked = true;
            StartupLifecycle.INSTANCE.logi(StartupLifecycle.TAG, "onDraw");
            this.handler.postAtFrontOfQueue(new Runnable() { // from class: com.kubi.sdk.startup.b
                @Override // java.lang.Runnable
                public final void run() {
                    StartupLifecycle.FirstTimeOnDrawListener.onDraw$lambda$2(this.f47958b);
                }
            });
        }
    }

    /* JADX INFO: compiled from: StartupLifecycle.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J\u0011\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0082\bJ\u0006\u0010\u0013\u001a\u00020\u0007J\u0006\u0010\u0014\u001a\u00020\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u0018H\u0016J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010 \u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0006\u0010!\u001a\u00020\fJ\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010\b\u001a\u00020\fJ\u0018\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007H\u0002J\u0011\u0010'\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0082\bJ\u0010\u0010(\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u0007H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupLifecycle$StartupLifecycleLauncher;", "Lcom/kubi/sdk/startup/StartupAttachLifecycle$IAttachLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "activityState", "", "suspend", "Ljava/util/concurrent/atomic/AtomicBoolean;", "taskState", "activityToTaskState", "", "newState", "activity", "Landroid/app/Activity;", "changeTaskState", "startType", "checkState", "getActivityState", "getTaskState", "onActivityAttach", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityPreCreated", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onAppStart", "resume", "track", "type", "", "code", "trackState", "updateTaskState", "", "Companion", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nStartupLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupLifecycle.kt\ncom/kubi/sdk/startup/StartupLifecycle$StartupLifecycleLauncher\n+ 2 StartupLifecycle.kt\ncom/kubi/sdk/startup/StartupLifecycle\n+ 3 StartupIssue.kt\ncom/kubi/sdk/startup/StartupIssueKt\n+ 4 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n*L\n1#1,475:1\n315#1,15:476\n332#1,13:498\n351#1,5:513\n86#2:491\n86#2:492\n86#2:493\n86#2:494\n86#2:495\n52#3,2:496\n52#3,2:511\n52#3,2:518\n52#3,2:520\n71#4,4:522\n*S KotlinDebug\n*F\n+ 1 StartupLifecycle.kt\ncom/kubi/sdk/startup/StartupLifecycle$StartupLifecycleLauncher\n*L\n193#1:476,15\n306#1:498,13\n306#1:513,5\n201#1:491\n211#1:492\n221#1:493\n233#1:494\n242#1:495\n293#1:496,2\n306#1:511,2\n344#1:518,2\n352#1:520,2\n404#1:522,4\n*E\n"})
    public static final class StartupLifecycleLauncher implements StartupAttachLifecycle.IAttachLifecycleCallbacks, Application.ActivityLifecycleCallbacks {
        public static final int MAIN_ACTIVITY_ATTACH = 11;
        public static final int MAIN_ACTIVITY_CREATED = 13;
        public static final int MAIN_ACTIVITY_PRE_CREATE = 12;
        public static final int MAIN_ACTIVITY_RESUMED = 14;
        public static final int NONE = 0;
        public static final int START_UP_ACTIVITY_ATTACH = 1;
        public static final int START_UP_ACTIVITY_CREATED = 3;
        public static final int START_UP_ACTIVITY_PAUSED = 5;
        public static final int START_UP_ACTIVITY_PRE_CREATE = 2;
        public static final int START_UP_ACTIVITY_RESUMED = 4;
        public static final int STATE_TASK_FIRST_PAGE_END = 4;
        public static final int STATE_TASK_FIRST_PAGE_START = 3;
        public static final int STATE_TASK_MAIN_PAGE_LOAD = 5;
        public static final int STATE_TASK_PRE_FIRST_PAGE = 2;
        public static final int STATE_TASK_SETUP = 1;
        private int activityState;

        @NotNull
        private final Application application;

        @NotNull
        private final AtomicBoolean suspend;
        private volatile int taskState;

        private final void activityToTaskState(int newState, Activity activity) {
            AppRouterMessage appRouterMessage;
            if (newState == 1 || newState == 2) {
                changeTaskState(2, 1);
            } else if (newState == 3) {
                changeTaskState(2, 3);
            } else if (newState == 4 && this.taskState < 3) {
                FirstTimeOnDrawListener.INSTANCE.addFirstTimeOnDrawListener(activity, new Function0<Unit>() { // from class: com.kubi.sdk.startup.StartupLifecycle$StartupLifecycleLauncher$activityToTaskState$1
                    @Override // p852kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    {
                        super(0);
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.changeTaskState(3, 4);
                    }
                });
            } else if (newState == 11) {
                changeTaskState(4, 10);
            } else if (newState == 12) {
                changeTaskState(4, 11);
            } else if (newState == 13) {
                if (this.suspend.get()) {
                    StartupDispatcher.onSuspendError$Startup_release(activity);
                    track("suspend_mainPage", 22);
                    C43846g.m96568c(new AppRouterMessage("suspend mainPage " + Reflection.getOrCreateKotlinClass(activity.getClass()).getSimpleName() + '}', "StartupLifecycle", false, 4, null), null, 2, null);
                }
                changeTaskState(4, 12);
            } else if (newState == 14) {
                C42917g.m94136b().schedule(new Runnable() { // from class: com.kubi.sdk.startup.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        StartupLifecycle.StartupLifecycleLauncher.activityToTaskState$lambda$0(this.f47961b);
                    }
                }, 3L, TimeUnit.SECONDS);
            } else if (newState >= 5) {
                if (this.taskState == 0) {
                    switch (newState) {
                        case 11:
                        case 12:
                        case 13:
                            int i11 = this.activityState;
                            if (i11 == 0) {
                                track("second_page_onRecover", -1);
                            } else if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                                track("second_page_protect_onCreate", -1);
                                appRouterMessage = new AppRouterMessage("called startup second page protect onCreate " + this.suspend.get(), "StartupLifecycle", false, 4, null);
                                C43846g.m96568c(appRouterMessage, null, 2, null);
                            }
                            break;
                        case 14:
                            track("second_page_protect_onResume", -1);
                            appRouterMessage = new AppRouterMessage("called startup second page protect onResume " + this.suspend.get(), "StartupLifecycle", false, 4, null);
                            C43846g.m96568c(appRouterMessage, null, 2, null);
                            break;
                    }
                }
                changeTaskState(4, 5);
            }
            this.activityState = newState;
        }

        private final void trackState(int newState) {
            String str;
            if (newState == 1) {
                str = "FIRST_ACTIVITY_ATTACH";
            } else if (newState == 2) {
                str = "FIRST_ACTIVITY_PRE_CREATE";
            } else if (newState == 3) {
                str = "FIRST_ACTIVITY_CREATED";
            } else if (newState == 4) {
                str = "FIRST_ACTIVITY_RESUMED";
            } else if (newState != 5) {
                switch (newState) {
                    case 11:
                        str = "SECOND_ACTIVITY_ATTACH";
                        break;
                    case 12:
                        str = "SECOND_ACTIVITY_PRE_CREATE";
                        break;
                    case 13:
                        str = "SECOND_ACTIVITY_CREATED";
                        break;
                    case 14:
                        str = "SECOND_ACTIVITY_RESUMED";
                        break;
                    default:
                        str = "NONE";
                        break;
                }
            } else {
                str = "FIRST_ACTIVITY_PAUSED";
            }
            C43840a.m96550d(str, StartupIssueKt.STARTUP_CATEGORY);
        }

        public final void onAppStart() {
            changeTaskState(1, 0);
        }

        public StartupLifecycleLauncher(@NotNull Application application) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
            this.suspend = new AtomicBoolean(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void activityToTaskState$lambda$0(StartupLifecycleLauncher this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.changeTaskState(5, 13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void changeTaskState(int newState, int startType) {
            if (this.suspend.get()) {
                return;
            }
            if (newState >= 1 && updateTaskState(1)) {
                track("setup_task", startType);
                StartupDispatcher.onAppStart$Startup_release(startType);
            }
            if (newState >= 2 && updateTaskState(2)) {
                track("pef_first_page_task", startType);
                StartupDispatcher.perFirstPageTask$Startup_release(startType);
            }
            if (newState >= 3 && updateTaskState(3)) {
                track("first_page_beginTask", startType);
                StartupDispatcher.beginFirstPageTask$Startup_release(startType);
            }
            if (newState >= 4 && updateTaskState(4)) {
                track("first_page_endTask", startType);
                StartupDispatcher.endFirstPageTask$Startup_release(startType);
            }
            if (newState < 5 || !updateTaskState(5)) {
                return;
            }
            track("main_page_loadTask", startType);
            StartupDispatcher.onMainPageLoaded$Startup_release(startType);
            StartupLifecycle.INSTANCE.clear(this.application);
            C42918h.m94142b(5L, TimeUnit.SECONDS, new Runnable() { // from class: com.kubi.sdk.startup.f
                @Override // java.lang.Runnable
                public final void run() {
                    StartupLifecycle.StartupLifecycleLauncher.changeTaskState$lambda$1();
                }
            });
        }

        private final void checkState(int newState) {
            if (this.taskState != 0) {
                return;
            }
            switch (newState) {
                case 11:
                case 12:
                case 13:
                    int i11 = this.activityState;
                    if (i11 == 0) {
                        track("second_page_onRecover", -1);
                    } else if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4) {
                        track("second_page_protect_onCreate", -1);
                        C43846g.m96568c(new AppRouterMessage("called startup second page protect onCreate " + this.suspend.get(), "StartupLifecycle", false, 4, null), null, 2, null);
                    }
                    break;
                case 14:
                    track("second_page_protect_onResume", -1);
                    C43846g.m96568c(new AppRouterMessage("called startup second page protect onResume " + this.suspend.get(), "StartupLifecycle", false, 4, null), null, 2, null);
                    break;
            }
        }

        private final void track(String type, int code) {
            C43840a.m96550d(type, StartupIssueKt.STARTUP_CATEGORY);
            TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
            TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
            eventParametersBuilderAcquire.m42393d("category", type);
            eventParametersBuilderAcquire.m42391b("code", code);
            eventParametersBuilderAcquire.m42394e("success", !this.suspend.get());
            TechnologyEvent.m42388d("startup_event", eventParametersBuilderAcquire);
        }

        private final boolean updateTaskState(int newState) {
            if (newState <= this.taskState) {
                return false;
            }
            this.taskState = newState;
            return true;
        }

        public final int getActivityState() {
            return this.activityState;
        }

        public final int getTaskState() {
            return this.taskState;
        }

        @Override // com.kubi.sdk.startup.StartupAttachLifecycle.IAttachLifecycleCallbacks
        public void onActivityAttach(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            StartupLifecycle startupLifecycle = StartupLifecycle.INSTANCE;
            if (activity instanceof InterfaceC43845f) {
                if (this.activityState < 11) {
                    StartupLifecycle.INSTANCE.logi(StartupLifecycle.TAG, "onActivityAttach");
                    activityToTaskState(activity instanceof IStartupActivity ? 1 : 11, activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            StartupLifecycle startupLifecycle = StartupLifecycle.INSTANCE;
            if (activity instanceof InterfaceC43845f) {
                StartupLifecycle.INSTANCE.logi(StartupLifecycle.TAG, "onActivityCreated");
                if (this.activityState < 13) {
                    activityToTaskState(activity instanceof IStartupActivity ? 3 : 13, activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            StartupLifecycle startupLifecycle = StartupLifecycle.INSTANCE;
            if ((activity instanceof InterfaceC43845f) && this.activityState < 5) {
                activityToTaskState(5, activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NotNull Activity activity, @Nullable Bundle savedInstanceState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            StartupLifecycle startupLifecycle = StartupLifecycle.INSTANCE;
            if (activity instanceof InterfaceC43845f) {
                if (this.activityState < 12) {
                    int i11 = activity instanceof IStartupActivity ? 2 : 12;
                    StartupLifecycle.INSTANCE.logi(StartupLifecycle.TAG, "onActivityPreCreated");
                    activityToTaskState(i11, activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            StartupLifecycle startupLifecycle = StartupLifecycle.INSTANCE;
            if (activity instanceof InterfaceC43845f) {
                int i11 = this.activityState;
                if (i11 < 14) {
                    activityToTaskState(i11 < 4 ? 4 : 14, activity);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NotNull Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
        }

        public final void resume() {
            String str;
            if (this.suspend.getAndSet(false)) {
                int i11 = this.activityState;
                if (i11 <= 3) {
                    changeTaskState(2, 21);
                    return;
                }
                if (i11 <= 4) {
                    changeTaskState(3, 21);
                    return;
                }
                if (i11 == 1) {
                    str = "FIRST_ACTIVITY_ATTACH";
                } else if (i11 == 2) {
                    str = "FIRST_ACTIVITY_PRE_CREATE";
                } else if (i11 == 3) {
                    str = "FIRST_ACTIVITY_CREATED";
                } else if (i11 == 4) {
                    str = "FIRST_ACTIVITY_RESUMED";
                } else if (i11 != 5) {
                    switch (i11) {
                        case 11:
                            str = "SECOND_ACTIVITY_ATTACH";
                            break;
                        case 12:
                            str = "SECOND_ACTIVITY_PRE_CREATE";
                            break;
                        case 13:
                            str = "SECOND_ACTIVITY_CREATED";
                            break;
                        case 14:
                            str = "SECOND_ACTIVITY_RESUMED";
                            break;
                        default:
                            str = "NONE";
                            break;
                    }
                } else {
                    str = "FIRST_ACTIVITY_PAUSED";
                }
                C43840a.m96550d(str, StartupIssueKt.STARTUP_CATEGORY);
                changeTaskState(4, 22);
            }
        }

        public final void suspend() {
            this.suspend.set(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void changeTaskState$lambda$1() {
            try {
                StartupDispatcher.printTasks();
            } catch (Exception e11) {
                C44128b.m97265i(e11.toString());
            }
        }
    }

    public static /* synthetic */ void init$default(StartupLifecycle startupLifecycle, Application application, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z12 = false;
        }
        startupLifecycle.init(application, z11, z12);
    }

    private final boolean isThirdParty(Activity activity) {
        return !(activity instanceof InterfaceC43845f);
    }

    public final void clear(@NotNull Application context) {
        Intrinsics.checkNotNullParameter(context, "context");
        StartupLifecycleLauncher andSet = launcherRef.getAndSet(null);
        if (andSet == null) {
            return;
        }
        Log.d(TAG, "StartupLifecycle clear");
        clearFlag.set(true);
        context.unregisterActivityLifecycleCallbacks(andSet);
        StartupAttachLifecycle.INSTANCE.unregisterAttachLifecycleCallbacks$Startup_release(andSet);
    }

    public final void init(@NotNull Application context, boolean isMainProcess, boolean suspend) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!isMainProcess) {
            StartupDispatcher.onAppStart$Startup_release(100);
            StartupDispatcher.perFirstPageTask$Startup_release(100);
            StartupDispatcher.endFirstPageTask$Startup_release(100);
            StartupDispatcher.onMainPageLoaded$Startup_release(100);
            return;
        }
        Log.d(TAG, "StartupLifecycle init");
        StartupLifecycleLauncher startupLifecycleLauncher = new StartupLifecycleLauncher(context);
        launcherRef.set(startupLifecycleLauncher);
        context.registerActivityLifecycleCallbacks(startupLifecycleLauncher);
        StartupAttachLifecycle.INSTANCE.registerAttachLifecycleCallbacks$Startup_release(startupLifecycleLauncher);
        if (suspend) {
            startupLifecycleLauncher.suspend();
        } else {
            startupLifecycleLauncher.onAppStart();
        }
    }

    public final void logi(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i(tag, msg);
    }

    public final void resume() {
        Log.d(TAG, "StartupLifecycle resume");
        if (clearFlag.get()) {
            return;
        }
        StartupLifecycleLauncher startupLifecycleLauncher = launcherRef.get();
        if (startupLifecycleLauncher == null) {
            throw new IllegalStateException("not init or not MainProcess");
        }
        startupLifecycleLauncher.resume();
    }

    private StartupLifecycle() {
    }
}
