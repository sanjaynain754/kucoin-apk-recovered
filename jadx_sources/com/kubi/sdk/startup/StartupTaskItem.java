package com.kubi.sdk.startup;

import android.app.Application;
import android.os.SystemClock;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.common.MimeTypes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.monitor.TechnologyEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43851l;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: StartupTaskItem.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u001e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupTaskItem;", "", "name", "", "task", "Lcom/kubi/sdk/startup/IStartupTask;", "isMainProcess", "", "(Ljava/lang/String;Lcom/kubi/sdk/startup/IStartupTask;Z)V", "completed", "success", "Ljava/lang/Boolean;", "taskCostTime", "", "safeRun", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "threadType", "startType", "", "taskExecutionInfo", "Lcom/kubi/sdk/startup/StartupDispatcher$TaskExecutionInfo;", "packName", "Lcom/kubi/sdk/startup/StartupThreadType;", "toString", "Companion", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupTaskItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupTaskItem.kt\ncom/kubi/sdk/startup/StartupTaskItem\n+ 2 StartupTaskItem.kt\ncom/kubi/sdk/startup/StartupTaskItem$Companion\n+ 3 TechnologyEvent.kt\ncom/kubi/monitor/TechnologyEvent\n+ 4 StartupIssue.kt\ncom/kubi/sdk/startup/StartupIssueKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n18#2,2:106\n20#2,4:112\n18#2,2:116\n20#2,4:124\n71#3,4:108\n71#3,4:120\n48#4,2:118\n1#5:128\n*S KotlinDebug\n*F\n+ 1 StartupTaskItem.kt\ncom/kubi/sdk/startup/StartupTaskItem\n*L\n49#1:106,2\n49#1:112,4\n67#1:116,2\n67#1:124,4\n53#1:108,4\n72#1:120,4\n70#1:118,2\n*E\n"})
public final class StartupTaskItem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private volatile boolean completed;
    private final boolean isMainProcess;

    @NotNull
    private final String name;

    @Nullable
    private volatile Boolean success;

    @NotNull
    private final IStartupTask task;
    private long taskCostTime;

    /* JADX INFO: compiled from: StartupTaskItem.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupTaskItem$Companion;", "", "()V", "safe", "", "block", "Lkotlin/Function0;", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void safe(@NotNull Function0<Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            try {
                block.invoke();
            } catch (Throwable unused) {
                C44128b.m97265i("safe error");
            }
        }
    }

    public StartupTaskItem(@NotNull String name, @NotNull IStartupTask task, boolean z11) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(task, "task");
        this.name = name;
        this.task = task;
        this.isMainProcess = z11;
    }

    public final void safeRun(@NotNull Application application, @NotNull String threadType, int startType) {
        C43851l.a aVarM96588a;
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(threadType, "threadType");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            if (this.isMainProcess) {
                aVarM96588a = C43851l.m96588a("startup_task_" + this.name, true);
                aVarM96588a.putAttribute("startType", String.valueOf(startType));
                aVarM96588a.putAttribute("threadType", threadType);
            } else {
                aVarM96588a = null;
            }
            this.task.run(application);
            this.success = Boolean.TRUE;
            this.taskCostTime = SystemClock.elapsedRealtime() - jElapsedRealtime;
            try {
                if (this.isMainProcess) {
                    StartupIssueKt.techEvent(EventCode.TASK_SUCCESS);
                    TechnologyEvent technologyEvent = TechnologyEvent.f35482a;
                    TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                    eventParametersBuilderAcquire.m42393d("type", this.name);
                    eventParametersBuilderAcquire.m42394e("success", true);
                    eventParametersBuilderAcquire.m42391b("code", startType);
                    eventParametersBuilderAcquire.m42393d(FirebaseAnalytics.Param.METHOD, threadType);
                    eventParametersBuilderAcquire.m42396g(TypedValues.TransitionType.S_DURATION, this.taskCostTime);
                    TechnologyEvent.m42388d("startup", eventParametersBuilderAcquire);
                    if (aVarM96588a != null) {
                        aVarM96588a.stop();
                    }
                }
            } catch (Throwable unused) {
                C44128b.m97265i("safe error");
            }
        } catch (Throwable th2) {
            try {
                this.success = Boolean.FALSE;
                this.taskCostTime = SystemClock.elapsedRealtime() - jElapsedRealtime;
                C44128b.m97263g(StartupIssueKt.TAG, th2);
                try {
                    if (this.isMainProcess) {
                        C43846g.m96568c(new StartupException(th2, "task " + this.name + " failed", true, null, 8, null), null, 2, null);
                        StartupIssueKt.techEvent(EventCode.TASK_FAIL);
                        TechnologyEvent technologyEvent2 = TechnologyEvent.f35482a;
                        TechnologyEvent.EventParametersBuilder eventParametersBuilderAcquire2 = TechnologyEvent.EventParametersBuilder.INSTANCE.acquire();
                        eventParametersBuilderAcquire2.m42393d("type", this.name);
                        eventParametersBuilderAcquire2.m42391b("code", startType);
                        eventParametersBuilderAcquire2.m42393d(FirebaseAnalytics.Param.METHOD, threadType);
                        eventParametersBuilderAcquire2.m42394e("success", false);
                        TechnologyEvent.m42388d("startup", eventParametersBuilderAcquire2);
                    }
                } catch (Throwable unused2) {
                    C44128b.m97265i("safe error");
                }
            } catch (Throwable th3) {
                this.completed = true;
                throw th3;
            }
        }
        this.completed = true;
    }

    @NotNull
    public final StartupDispatcher.TaskExecutionInfo taskExecutionInfo(@NotNull String packName, @NotNull StartupThreadType threadType) {
        Intrinsics.checkNotNullParameter(packName, "packName");
        Intrinsics.checkNotNullParameter(threadType, "threadType");
        boolean z11 = this.completed;
        String str = this.name;
        Long lValueOf = Long.valueOf(this.taskCostTime);
        if (!z11) {
            lValueOf = null;
        }
        return new StartupDispatcher.TaskExecutionInfo(packName, str, threadType, lValueOf, z11, this.success);
    }

    @NotNull
    public String toString() {
        if (this.taskCostTime == 0) {
            return this.name;
        }
        return this.name + '[' + this.taskCostTime + ']';
    }
}
