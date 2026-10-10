package com.kubi.sdk.startup;

import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.media3.common.MimeTypes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43840a;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.annotation.AnnotationRetention;
import p852kotlin.annotation.AnnotationTarget;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.JvmStatic;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: StartupDispatcher.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0006DEFGHIB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0007J\u0015\u0010$\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b%J\u0016\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bJ\u0015\u0010)\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b,J\u0015\u0010-\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000eH\u0001¢\u0006\u0002\b.J\u0015\u0010/\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0004H\u0001¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u0012H\u0007J\u000e\u00102\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u00103\u001a\u00020\u0012H\u0007J)\u00104\u001a\u00020\u00122!\u00105\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rJ3\u00106\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#2\u0006\u00107\u001a\u0002082\u0019\b\u0002\u00109\u001a\u0013\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\u00120\r¢\u0006\u0002\b;H\u0007J\u0012\u0010<\u001a\u00020\u00122\b\b\u0002\u0010=\u001a\u000208H\u0007J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?H\u0007J\b\u0010A\u001a\u00020\u000bH\u0007J\f\u0010B\u001a\u000208*\u00020CH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R+\u0010\f\u001a\u001f\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\u00020\u00048F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006J"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupDispatcher;", "", "()V", "STATE_APPLICATION", "", "STATE_DONE", "STATE_FIRST_PAGE", "STATE_NONE", "STATE_PRE_FIRST_PAGE", "STATE_SETUP", "TAG", "", "onErrorHandler", "Lkotlin/Function1;", "Landroid/app/Activity;", "Lkotlin/ParameterName;", "name", "activity", "", "setupConfig", "Lcom/kubi/sdk/startup/StartupDispatcher$SetupConfig;", "state", "getState$annotations", "getState", "()I", "stateManager", "Lcom/kubi/sdk/startup/StartupDispatcher$StateManager;", "addStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/sdk/startup/StartupDispatcher$IStateListener;", "beginFirstPageTask", "startType", "beginFirstPageTask$Startup_release", "clear", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "endFirstPageTask", "endFirstPageTask$Startup_release", "logi", "tag", "msg", "onAppStart", "onAppStart$Startup_release", "onMainPageLoaded", "onMainPageLoaded$Startup_release", "onSuspendError", "onSuspendError$Startup_release", "perFirstPageTask", "perFirstPageTask$Startup_release", "printTasks", "removeStateListener", "resume", "setOnSuspendErrorHandler", "onError", "setup", "isMainProcess", "", "config", "Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;", "Lkotlin/ExtensionFunctionType;", "startup", "suspend", "taskExecutionInfo", "", "Lcom/kubi/sdk/startup/StartupDispatcher$TaskExecutionInfo;", "taskSize", "isDone", "Lcom/kubi/sdk/startup/StartupTaskPack;", "ISetupConfig", "IStateListener", "SetupConfig", "StateManager", "TaskExecutionInfo", "TaskState", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupDispatcher.kt\ncom/kubi/sdk/startup/StartupDispatcher\n+ 2 StartupIssue.kt\ncom/kubi/sdk/startup/StartupIssueKt\n*L\n1#1,379:1\n48#2,2:380\n*S KotlinDebug\n*F\n+ 1 StartupDispatcher.kt\ncom/kubi/sdk/startup/StartupDispatcher\n*L\n225#1:380,2\n*E\n"})
public final class StartupDispatcher {
    public static final int STATE_APPLICATION = 2;
    private static final int STATE_DONE = 3;
    public static final int STATE_FIRST_PAGE = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PRE_FIRST_PAGE = 3;
    public static final int STATE_SETUP = 1;

    @NotNull
    private static final String TAG = "StartupDispatcher";

    @Nullable
    private static Function1<? super Activity, Unit> onErrorHandler;

    @Nullable
    private static SetupConfig setupConfig;

    @NotNull
    public static final StartupDispatcher INSTANCE = new StartupDispatcher();

    @NotNull
    private static final StateManager stateManager = new StateManager();

    /* JADX INFO: compiled from: StartupDispatcher.kt */
    @Keep
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;", "", "addTask", "", "name", "", "task", "Lcom/kubi/sdk/startup/IStartupTask;", "stepType", "Lcom/kubi/sdk/startup/StartupStepType;", "threadType", "Lcom/kubi/sdk/startup/StartupThreadType;", "crossProcess", "", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface ISetupConfig {

        /* JADX INFO: compiled from: StartupDispatcher.kt */
        /* JADX INFO: loaded from: classes45.dex */
        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void addTask$default(ISetupConfig iSetupConfig, String str, IStartupTask iStartupTask, StartupStepType startupStepType, StartupThreadType startupThreadType, boolean z11, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTask");
                }
                if ((i11 & 16) != 0) {
                    z11 = false;
                }
                iSetupConfig.addTask(str, iStartupTask, startupStepType, startupThreadType, z11);
            }
        }

        void addTask(@NotNull String name, @NotNull IStartupTask task, @NotNull StartupStepType stepType, @NotNull StartupThreadType threadType, boolean crossProcess);
    }

    /* JADX INFO: compiled from: StartupDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupDispatcher$IStateListener;", "", "onStateChanged", "", "newState", "", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface IStateListener {
        void onStateChanged(int newState);
    }

    /* JADX INFO: compiled from: StartupDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0005H\u0016J\u0006\u0010!\u001a\u00020\u0019J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#J\b\u0010%\u001a\u00020\u0019H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u0011\u0010\u0014\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n¨\u0006&"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupDispatcher$SetupConfig;", "Lcom/kubi/sdk/startup/StartupDispatcher$ISetupConfig;", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "isMainProcess", "", "(Landroid/app/Application;Z)V", "appTaskPack", "Lcom/kubi/sdk/startup/StartupTaskPack;", "getAppTaskPack", "()Lcom/kubi/sdk/startup/StartupTaskPack;", "getApplication", "()Landroid/app/Application;", "firstPageTaskPack", "getFirstPageTaskPack", "()Z", "mainPageTaskPack", "getMainPageTaskPack", "preFirstPageTaskPack", "getPreFirstPageTaskPack", "setupTaskPack", "getSetupTaskPack", "addTask", "", "name", "", "task", "Lcom/kubi/sdk/startup/IStartupTask;", "stepType", "Lcom/kubi/sdk/startup/StartupStepType;", "threadType", "Lcom/kubi/sdk/startup/StartupThreadType;", "crossProcess", "getTaskSize", "taskExecutionInfo", "", "Lcom/kubi/sdk/startup/StartupDispatcher$TaskExecutionInfo;", "toString", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final class SetupConfig implements ISetupConfig {

        @NotNull
        private final StartupTaskPack appTaskPack;

        @NotNull
        private final Application application;

        @NotNull
        private final StartupTaskPack firstPageTaskPack;
        private final boolean isMainProcess;

        @NotNull
        private final StartupTaskPack mainPageTaskPack;

        @NotNull
        private final StartupTaskPack preFirstPageTaskPack;

        @NotNull
        private final StartupTaskPack setupTaskPack;

        /* JADX INFO: compiled from: StartupDispatcher.kt */
        @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StartupStepType.values().length];
                try {
                    iArr[StartupStepType.Setup.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StartupStepType.Application.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StartupStepType.PreFirstPage.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StartupStepType.FirstPage.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StartupStepType.MainPage.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public SetupConfig(@NotNull Application application, boolean z11) {
            Intrinsics.checkNotNullParameter(application, "application");
            this.application = application;
            this.isMainProcess = z11;
            this.setupTaskPack = new StartupTaskPack("setup", z11);
            this.appTaskPack = new StartupTaskPack(MimeTypes.BASE_TYPE_APPLICATION, z11);
            this.preFirstPageTaskPack = new StartupTaskPack("per_first_page", z11);
            this.firstPageTaskPack = new StartupTaskPack("first_page", z11);
            this.mainPageTaskPack = new StartupTaskPack("main_page", z11);
        }

        @Override // com.kubi.sdk.startup.StartupDispatcher.ISetupConfig
        public void addTask(@NotNull String name, @NotNull IStartupTask task, @NotNull StartupStepType stepType, @NotNull StartupThreadType threadType, boolean crossProcess) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(task, "task");
            Intrinsics.checkNotNullParameter(stepType, "stepType");
            Intrinsics.checkNotNullParameter(threadType, "threadType");
            if (this.isMainProcess || crossProcess) {
                StartupTaskItem startupTaskItem = new StartupTaskItem(name, task, this.isMainProcess);
                int i11 = WhenMappings.$EnumSwitchMapping$0[stepType.ordinal()];
                if (i11 == 1) {
                    this.setupTaskPack.addTask(startupTaskItem, threadType);
                    return;
                }
                if (i11 == 2) {
                    this.appTaskPack.addTask(startupTaskItem, threadType);
                    return;
                }
                if (i11 == 3) {
                    this.preFirstPageTaskPack.addTask(startupTaskItem, threadType);
                } else if (i11 == 4) {
                    this.firstPageTaskPack.addTask(startupTaskItem, threadType);
                } else {
                    if (i11 != 5) {
                        return;
                    }
                    this.mainPageTaskPack.addTask(startupTaskItem, threadType);
                }
            }
        }

        @NotNull
        public final StartupTaskPack getAppTaskPack() {
            return this.appTaskPack;
        }

        @NotNull
        public final Application getApplication() {
            return this.application;
        }

        @NotNull
        public final StartupTaskPack getFirstPageTaskPack() {
            return this.firstPageTaskPack;
        }

        @NotNull
        public final StartupTaskPack getMainPageTaskPack() {
            return this.mainPageTaskPack;
        }

        @NotNull
        public final StartupTaskPack getPreFirstPageTaskPack() {
            return this.preFirstPageTaskPack;
        }

        @NotNull
        public final StartupTaskPack getSetupTaskPack() {
            return this.setupTaskPack;
        }

        @NotNull
        public final String getTaskSize() {
            String str = "setup[" + this.setupTaskPack.taskSize() + "] app[" + this.appTaskPack.taskSize() + "] preFirstPage[" + this.preFirstPageTaskPack.taskSize() + "] firstPage[" + this.firstPageTaskPack.taskSize() + "] mainPage[" + this.mainPageTaskPack.taskSize() + "]";
            Intrinsics.checkNotNullExpressionValue(str, "builder.toString()");
            return str;
        }

        /* JADX INFO: renamed from: isMainProcess, reason: from getter */
        public final boolean getIsMainProcess() {
            return this.isMainProcess;
        }

        @NotNull
        public final List<TaskExecutionInfo> taskExecutionInfo() {
            return CollectionsKt.flatten(CollectionsKt.listOf((Object[]) new List[]{this.setupTaskPack.taskExecutionInfo(), this.appTaskPack.taskExecutionInfo(), this.preFirstPageTaskPack.taskExecutionInfo(), this.firstPageTaskPack.taskExecutionInfo(), this.mainPageTaskPack.taskExecutionInfo()}));
        }

        @NotNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Startup TaskFlow[isMainProcess=" + this.isMainProcess + "]\n");
            sb2.append(this.setupTaskPack.toString());
            sb2.append(this.appTaskPack.toString());
            sb2.append(this.preFirstPageTaskPack.toString());
            sb2.append(this.firstPageTaskPack.toString());
            sb2.append(this.mainPageTaskPack.toString());
            sb2.append("\n\n");
            String string = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
            return string;
        }
    }

    /* JADX INFO: compiled from: StartupDispatcher.kt */
    @Metadata(m90083d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\b\u0010\u0016\u001a\u00020\bH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupDispatcher$StateManager;", "Lcom/kubi/sdk/startup/StartupTaskPack$IStateListener;", "()V", "listeners", "", "Ljava/lang/ref/WeakReference;", "Lcom/kubi/sdk/startup/StartupDispatcher$IStateListener;", "state", "", "getState$annotations", "getState", "()I", "setState", "(I)V", "addStateListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "callListener", "onStateChanged", "oldState", "newState", "removeStateListener", "updateNewState", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nStartupDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupDispatcher.kt\ncom/kubi/sdk/startup/StartupDispatcher$StateManager\n+ 2 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 StartupIssue.kt\ncom/kubi/sdk/startup/StartupIssueKt\n*L\n1#1,379:1\n15#2,2:380\n1855#3:382\n1856#3:385\n48#4,2:383\n*S KotlinDebug\n*F\n+ 1 StartupDispatcher.kt\ncom/kubi/sdk/startup/StartupDispatcher$StateManager\n*L\n278#1:380,2\n279#1:382\n279#1:385\n283#1:383,2\n*E\n"})
    public static final class StateManager implements StartupTaskPack.IStateListener {

        @NotNull
        private final List<WeakReference<IStateListener>> listeners = new ArrayList();
        private volatile int state;

        private final void callListener(final int state) {
            if (this.listeners.isEmpty()) {
                return;
            }
            final ArrayList arrayList = new ArrayList();
            synchronized (this.listeners) {
                try {
                    Iterator<WeakReference<IStateListener>> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        IStateListener iStateListener = it.next().get();
                        if (iStateListener == null) {
                            it.remove();
                        } else {
                            arrayList.add(iStateListener);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.sdk.startup.a
                @Override // java.lang.Runnable
                public final void run() {
                    StartupDispatcher.StateManager.callListener$lambda$4(arrayList, state);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void callListener$lambda$4(List callList, int i11) {
            Intrinsics.checkNotNullParameter(callList, "$callList");
            Iterator it = callList.iterator();
            while (it.hasNext()) {
                try {
                    ((IStateListener) it.next()).onStateChanged(i11);
                } catch (Exception e11) {
                    C43846g.m96568c(new StartupException(e11, "onStateChanged error", true, null, 8, null), null, 2, null);
                }
            }
        }

        public final void addStateListener(@NotNull IStateListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            synchronized (listener) {
                this.listeners.add(new WeakReference<>(listener));
            }
        }

        public final int getState() {
            return this.state;
        }

        public final void removeStateListener(@NotNull IStateListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            synchronized (this.listeners) {
                try {
                    Iterator<WeakReference<IStateListener>> it = this.listeners.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(it.next().get(), listener)) {
                            it.remove();
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void setState(int i11) {
            this.state = i11;
        }

        private final int updateNewState() {
            SetupConfig setupConfig = StartupDispatcher.setupConfig;
            if (setupConfig == null) {
                return 0;
            }
            StartupDispatcher startupDispatcher = StartupDispatcher.INSTANCE;
            if (startupDispatcher.isDone(setupConfig.getFirstPageTaskPack())) {
                return 4;
            }
            if (startupDispatcher.isDone(setupConfig.getPreFirstPageTaskPack())) {
                return 3;
            }
            if (startupDispatcher.isDone(setupConfig.getAppTaskPack())) {
                return 2;
            }
            if (!startupDispatcher.isDone(setupConfig.getSetupTaskPack())) {
                return 0;
            }
            return 1;
        }

        @Override // com.kubi.sdk.startup.StartupTaskPack.IStateListener
        public void onStateChanged(int oldState, int newState) {
            int iUpdateNewState = updateNewState();
            if (this.state != iUpdateNewState) {
                this.state = iUpdateNewState;
                callListener(iUpdateNewState);
            }
        }

        public static /* synthetic */ void getState$annotations() {
        }
    }

    /* JADX INFO: compiled from: StartupDispatcher.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupDispatcher$TaskExecutionInfo;", "", "packName", "", "taskName", "threadType", "Lcom/kubi/sdk/startup/StartupThreadType;", "durationMs", "", "completed", "", "success", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/startup/StartupThreadType;Ljava/lang/Long;ZLjava/lang/Boolean;)V", "getCompleted", "()Z", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPackName", "()Ljava/lang/String;", "getSuccess", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTaskName", "getThreadType", "()Lcom/kubi/sdk/startup/StartupThreadType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/kubi/sdk/startup/StartupThreadType;Ljava/lang/Long;ZLjava/lang/Boolean;)Lcom/kubi/sdk/startup/StartupDispatcher$TaskExecutionInfo;", "equals", "other", "hashCode", "", "toString", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public static final /* data */ class TaskExecutionInfo {
        private final boolean completed;

        @Nullable
        private final Long durationMs;

        @NotNull
        private final String packName;

        @Nullable
        private final Boolean success;

        @NotNull
        private final String taskName;

        @NotNull
        private final StartupThreadType threadType;

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TaskExecutionInfo)) {
                return false;
            }
            TaskExecutionInfo taskExecutionInfo = (TaskExecutionInfo) other;
            return Intrinsics.areEqual(this.packName, taskExecutionInfo.packName) && Intrinsics.areEqual(this.taskName, taskExecutionInfo.taskName) && this.threadType == taskExecutionInfo.threadType && Intrinsics.areEqual(this.durationMs, taskExecutionInfo.durationMs) && this.completed == taskExecutionInfo.completed && Intrinsics.areEqual(this.success, taskExecutionInfo.success);
        }

        public TaskExecutionInfo(@NotNull String packName, @NotNull String taskName, @NotNull StartupThreadType threadType, @Nullable Long l11, boolean z11, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(packName, "packName");
            Intrinsics.checkNotNullParameter(taskName, "taskName");
            Intrinsics.checkNotNullParameter(threadType, "threadType");
            this.packName = packName;
            this.taskName = taskName;
            this.threadType = threadType;
            this.durationMs = l11;
            this.completed = z11;
            this.success = bool;
        }

        public static /* synthetic */ TaskExecutionInfo copy$default(TaskExecutionInfo taskExecutionInfo, String str, String str2, StartupThreadType startupThreadType, Long l11, boolean z11, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = taskExecutionInfo.packName;
            }
            if ((i11 & 2) != 0) {
                str2 = taskExecutionInfo.taskName;
            }
            if ((i11 & 4) != 0) {
                startupThreadType = taskExecutionInfo.threadType;
            }
            if ((i11 & 8) != 0) {
                l11 = taskExecutionInfo.durationMs;
            }
            if ((i11 & 16) != 0) {
                z11 = taskExecutionInfo.completed;
            }
            if ((i11 & 32) != 0) {
                bool = taskExecutionInfo.success;
            }
            boolean z12 = z11;
            Boolean bool2 = bool;
            return taskExecutionInfo.copy(str, str2, startupThreadType, l11, z12, bool2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPackName() {
            return this.packName;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getTaskName() {
            return this.taskName;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final StartupThreadType getThreadType() {
            return this.threadType;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Long getDurationMs() {
            return this.durationMs;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getCompleted() {
            return this.completed;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final TaskExecutionInfo copy(@NotNull String packName, @NotNull String taskName, @NotNull StartupThreadType threadType, @Nullable Long durationMs, boolean completed, @Nullable Boolean success) {
            Intrinsics.checkNotNullParameter(packName, "packName");
            Intrinsics.checkNotNullParameter(taskName, "taskName");
            Intrinsics.checkNotNullParameter(threadType, "threadType");
            return new TaskExecutionInfo(packName, taskName, threadType, durationMs, completed, success);
        }

        public final boolean getCompleted() {
            return this.completed;
        }

        @Nullable
        public final Long getDurationMs() {
            return this.durationMs;
        }

        @NotNull
        public final String getPackName() {
            return this.packName;
        }

        @Nullable
        public final Boolean getSuccess() {
            return this.success;
        }

        @NotNull
        public final String getTaskName() {
            return this.taskName;
        }

        @NotNull
        public final StartupThreadType getThreadType() {
            return this.threadType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [int] */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v8, types: [int] */
        public int hashCode() {
            int iHashCode = ((((this.packName.hashCode() * 31) + this.taskName.hashCode()) * 31) + this.threadType.hashCode()) * 31;
            Long l11 = this.durationMs;
            int iHashCode2 = (iHashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
            boolean z11 = this.completed;
            ?? r11 = z11;
            if (z11) {
                r11 = 1;
            }
            int i11 = (iHashCode2 + r11) * 31;
            Boolean bool = this.success;
            return i11 + (bool != null ? bool.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TaskExecutionInfo(packName=" + this.packName + ", taskName=" + this.taskName + ", threadType=" + this.threadType + ", durationMs=" + this.durationMs + ", completed=" + this.completed + ", success=" + this.success + ')';
        }
    }

    /* JADX INFO: compiled from: StartupDispatcher.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Metadata(m90083d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupDispatcher$TaskState;", "", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @p852kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.TYPE, AnnotationTarget.PROPERTY})
    @Retention(RetentionPolicy.SOURCE)
    @p852kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TaskState {
    }

    @JvmStatic
    @MainThread
    public static final void beginFirstPageTask$Startup_release(int startType) {
        SetupConfig setupConfig2 = setupConfig;
        if (setupConfig2 == null) {
            throw new IllegalStateException("not setup config");
        }
        StartupDispatcher startupDispatcher = INSTANCE;
        startupDispatcher.logi(TAG, "闪屏页可见 start");
        C43840a.m96550d("闪屏页可见 start", TAG);
        setupConfig2.getFirstPageTaskPack().startAll(setupConfig2.getApplication(), startType);
        startupDispatcher.logi(TAG, "闪屏页可见 end");
        C43840a.m96550d("闪屏页可见 end", TAG);
    }

    @JvmStatic
    @MainThread
    public static final void clear(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        StartupLifecycle.INSTANCE.clear(application);
    }

    @JvmStatic
    @MainThread
    public static final void endFirstPageTask$Startup_release(int startType) {
        SetupConfig setupConfig2 = setupConfig;
        if (setupConfig2 == null) {
            throw new IllegalStateException("not setup config");
        }
        StartupDispatcher startupDispatcher = INSTANCE;
        startupDispatcher.logi(TAG, "闪屏页关闭 start");
        C43840a.m96550d("闪屏页关闭 start", TAG);
        setupConfig2.getFirstPageTaskPack().awaitAll(setupConfig2.getApplication(), startType);
        startupDispatcher.logi(TAG, "闪屏页关闭 end");
        C43840a.m96550d("闪屏页关闭 end", TAG);
    }

    @JvmStatic
    @MainThread
    public static final void onAppStart$Startup_release(int startType) {
        SetupConfig setupConfig2 = setupConfig;
        if (setupConfig2 == null) {
            throw new IllegalStateException("not setup config");
        }
        StartupTaskPack setupTaskPack = setupConfig2.getSetupTaskPack();
        StateManager stateManager2 = stateManager;
        setupTaskPack.setStateListener(stateManager2);
        setupConfig2.getAppTaskPack().setStateListener(stateManager2);
        setupConfig2.getFirstPageTaskPack().setStateListener(stateManager2);
        setupConfig2.getMainPageTaskPack().setStateListener(stateManager2);
        StartupDispatcher startupDispatcher = INSTANCE;
        startupDispatcher.logi(TAG, "app启动任务setup、application start");
        setupConfig2.getSetupTaskPack().awaitAll(setupConfig2.getApplication(), startType);
        setupConfig2.getAppTaskPack().awaitAll(setupConfig2.getApplication(), startType);
        startupDispatcher.logi(TAG, "app启动任务setup、application end");
    }

    @JvmStatic
    @MainThread
    public static final void onMainPageLoaded$Startup_release(int startType) {
        SetupConfig setupConfig2 = setupConfig;
        if (setupConfig2 == null) {
            throw new IllegalStateException("not setup config");
        }
        StartupDispatcher startupDispatcher = INSTANCE;
        startupDispatcher.logi(TAG, "首页任务 start");
        setupConfig2.getMainPageTaskPack().awaitAll(setupConfig2.getApplication(), startType);
        startupDispatcher.logi(TAG, "首页任务 end");
    }

    @JvmStatic
    @MainThread
    public static final void onSuspendError$Startup_release(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Function1<? super Activity, Unit> function1 = onErrorHandler;
        if (function1 == null) {
            return;
        }
        try {
            function1.invoke(activity);
        } catch (Throwable th2) {
            C43846g.m96568c(new StartupException(th2, "onSuspendError", true, null, 8, null), null, 2, null);
        }
    }

    @JvmStatic
    @MainThread
    public static final void perFirstPageTask$Startup_release(int startType) {
        SetupConfig setupConfig2 = setupConfig;
        if (setupConfig2 == null) {
            throw new IllegalStateException("not setup config");
        }
        StartupDispatcher startupDispatcher = INSTANCE;
        startupDispatcher.logi(TAG, "app 页面展示前pre任务 start");
        setupConfig2.getPreFirstPageTaskPack().awaitAll(setupConfig2.getApplication(), startType);
        startupDispatcher.logi(TAG, "app 页面展示前pre任务 end");
    }

    @JvmStatic
    public static final void printTasks() {
        String string;
        String string2;
        SetupConfig setupConfig2 = setupConfig;
        String str = "not setup config";
        if (setupConfig2 == null || (string = setupConfig2.toString()) == null) {
            string = "not setup config";
        }
        C43840a.m96550d(string, StartupIssueKt.STARTUP_CATEGORY);
        StartupDispatcher startupDispatcher = INSTANCE;
        SetupConfig setupConfig3 = setupConfig;
        if (setupConfig3 != null && (string2 = setupConfig3.toString()) != null) {
            str = string2;
        }
        startupDispatcher.logi(TAG, str);
    }

    @JvmStatic
    @MainThread
    public static final void resume() {
        StartupLifecycle.INSTANCE.resume();
    }

    @JvmStatic
    public static final void setup(@NotNull Application application, boolean isMainProcess, @NotNull Function1<? super ISetupConfig, Unit> config) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(config, "config");
        SetupConfig setupConfig2 = new SetupConfig(application, isMainProcess);
        config.invoke(setupConfig2);
        setupConfig = setupConfig2;
    }

    public static /* synthetic */ void setup$default(Application application, boolean z11, Function1 function1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            function1 = new Function1<ISetupConfig, Unit>() { // from class: com.kubi.sdk.startup.StartupDispatcher.setup.1
                @Override // p852kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ISetupConfig iSetupConfig) {
                    invoke2(iSetupConfig);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ISetupConfig iSetupConfig) {
                    Intrinsics.checkNotNullParameter(iSetupConfig, "$this$null");
                    new StartupRegister().injectStartupTask(iSetupConfig);
                }
            };
        }
        setup(application, z11, function1);
    }

    @JvmStatic
    @MainThread
    public static final void startup(boolean suspend) {
        SetupConfig setupConfig2 = setupConfig;
        if (setupConfig2 == null) {
            throw new IllegalStateException("not setup config");
        }
        StartupLifecycle.INSTANCE.init(setupConfig2.getApplication(), setupConfig2.getIsMainProcess(), suspend);
    }

    public static /* synthetic */ void startup$default(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        startup(z11);
    }

    @JvmStatic
    @NotNull
    public static final List<TaskExecutionInfo> taskExecutionInfo() {
        SetupConfig setupConfig2 = setupConfig;
        List<TaskExecutionInfo> listTaskExecutionInfo = setupConfig2 != null ? setupConfig2.taskExecutionInfo() : null;
        return listTaskExecutionInfo == null ? CollectionsKt.emptyList() : listTaskExecutionInfo;
    }

    @JvmStatic
    @NotNull
    public static final String taskSize() {
        SetupConfig setupConfig2 = setupConfig;
        String taskSize = setupConfig2 != null ? setupConfig2.getTaskSize() : null;
        return taskSize == null ? "" : taskSize;
    }

    public final void addStateListener(@NotNull IStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        stateManager.addStateListener(listener);
    }

    public final int getState() {
        return stateManager.getState();
    }

    public final void logi(@NotNull String tag, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        Log.i(tag, msg);
    }

    public final void removeStateListener(@NotNull IStateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        stateManager.removeStateListener(listener);
    }

    public final void setOnSuspendErrorHandler(@NotNull Function1<? super Activity, Unit> onError) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        onErrorHandler = onError;
    }

    private StartupDispatcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDone(StartupTaskPack startupTaskPack) {
        if ((startupTaskPack.getState() & 3) == 3) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void getState$annotations() {
    }
}
