package com.kubi.sdk.startup;

import android.app.Application;
import androidx.annotation.MainThread;
import androidx.media3.common.MimeTypes;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.bugly.proguard.C33844oi;
import com.tencent.bugly.proguard.C33978va;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p569qq.C43851l;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: StartupTaskPack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000b\b\u0000\u0018\u0000 E2\u00020\u0001:\u0003EFGB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0014\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b!\u0010 J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u000f¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R$\u00100\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R*\u00107\u001a\u00020\n2\u0006\u00106\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010B\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0018\u0010C\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006H"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupTaskPack;", "", "", "packName", "", "isMainProcess", "<init>", "(Ljava/lang/String;Z)V", "Landroid/app/Application;", MimeTypes.BASE_TYPE_APPLICATION, "", "startType", "Lcom/kubi/sdk/startup/StartupTaskPack$TaskWaiter;", "startWithWaiter", "(Landroid/app/Application;I)Lcom/kubi/sdk/startup/StartupTaskPack$TaskWaiter;", "", "Lcom/kubi/sdk/startup/StartupTaskItem;", "runAllAwait", "(Ljava/util/List;Landroid/app/Application;I)Lcom/kubi/sdk/startup/StartupTaskPack$TaskWaiter;", "", "runAllAsync", "(Ljava/util/List;Landroid/app/Application;I)V", "type", "Lqq/l$a;", "startWatcher", "(Ljava/lang/String;)Lqq/l$a;", "item", "Lcom/kubi/sdk/startup/StartupThreadType;", "threadType", "addTask", "(Lcom/kubi/sdk/startup/StartupTaskItem;Lcom/kubi/sdk/startup/StartupThreadType;)V", "startAll", "(Landroid/app/Application;I)V", "awaitAll", "Lcom/kubi/sdk/startup/StartupDispatcher$TaskExecutionInfo;", "taskExecutionInfo", "()Ljava/util/List;", "taskSize", "()Ljava/lang/String;", "toString", "Ljava/lang/String;", "Z", "", "mainTasks", "Ljava/util/List;", "awaitTasks", "asyncTasks", "Lcom/kubi/sdk/startup/StartupTaskPack$IStateListener;", "stateListener", "Lcom/kubi/sdk/startup/StartupTaskPack$IStateListener;", "getStateListener", "()Lcom/kubi/sdk/startup/StartupTaskPack$IStateListener;", "setStateListener", "(Lcom/kubi/sdk/startup/StartupTaskPack$IStateListener;)V", "value", "state", "I", "getState", "()I", "setState", "(I)V", "", "mainCostTime", "J", "awaitCostTime", "asyncCostTime", "packCostTime", "waiter", "Lcom/kubi/sdk/startup/StartupTaskPack$TaskWaiter;", "Companion", "IStateListener", "TaskWaiter", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStartupTaskPack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupTaskPack.kt\ncom/kubi/sdk/startup/StartupTaskPack\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,265:1\n1855#2,2:266\n1855#2:268\n1856#2:271\n1855#2:272\n1856#2:275\n1855#2,2:276\n1855#2,2:278\n1855#2,2:280\n1864#2,3:282\n1864#2,3:285\n1864#2,3:288\n15#3,2:269\n15#3,2:273\n*S KotlinDebug\n*F\n+ 1 StartupTaskPack.kt\ncom/kubi/sdk/startup/StartupTaskPack\n*L\n80#1:266,2\n126#1:268\n126#1:271\n148#1:272\n148#1:275\n195#1:276,2\n196#1:278,2\n197#1:280,2\n224#1:282,3\n238#1:285,3\n253#1:288,3\n127#1:269,2\n149#1:273,2\n*E\n"})
public final class StartupTaskPack {
    public static final int STATE_ASYNC = 4;
    public static final int STATE_MAIN = 1;
    public static final int STATE_NONE = 0;
    public static final int STATE_SYNC = 2;

    @NotNull
    private static final String TAG = "StartupTaskPack";
    private long asyncCostTime;

    @NotNull
    private final List<StartupTaskItem> asyncTasks;
    private long awaitCostTime;

    @NotNull
    private final List<StartupTaskItem> awaitTasks;
    private final boolean isMainProcess;
    private long mainCostTime;

    @NotNull
    private final List<StartupTaskItem> mainTasks;
    private long packCostTime;

    @NotNull
    private final String packName;
    private volatile int state;

    @Nullable
    private IStateListener stateListener;

    @Nullable
    private TaskWaiter waiter;

    /* JADX INFO: compiled from: StartupTaskPack.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupTaskPack$IStateListener;", "", "onStateChanged", "", "oldState", "", "newState", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    public interface IStateListener {
        void onStateChanged(int oldState, int newState);
    }

    /* JADX INFO: compiled from: StartupTaskPack.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006R\u001c\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m90084d2 = {"Lcom/kubi/sdk/startup/StartupTaskPack$TaskWaiter;", "", "countDownLatch", "Ljava/util/concurrent/CountDownLatch;", "afterAction", "Lkotlin/Function0;", "", "(Ljava/util/concurrent/CountDownLatch;Lkotlin/jvm/functions/Function0;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "getCountDownLatch", "()Ljava/util/concurrent/CountDownLatch;", "await", "onAfter", "Startup_release"}, m90085k = 1, m90086mv = {1, 8, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nStartupTaskPack.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StartupTaskPack.kt\ncom/kubi/sdk/startup/StartupTaskPack$TaskWaiter\n+ 2 StartupIssue.kt\ncom/kubi/sdk/startup/StartupIssueKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,265:1\n48#2,2:266\n48#2,2:270\n15#3,2:268\n*S KotlinDebug\n*F\n+ 1 StartupTaskPack.kt\ncom/kubi/sdk/startup/StartupTaskPack$TaskWaiter\n*L\n172#1:266,2\n186#1:270,2\n182#1:268,2\n*E\n"})
    public static final class TaskWaiter {

        @NotNull
        private final AtomicReference<Function0<Unit>> afterAction;

        @Nullable
        private final CountDownLatch countDownLatch;

        public TaskWaiter(@Nullable CountDownLatch countDownLatch, @Nullable Function0<Unit> function0) {
            this.countDownLatch = countDownLatch;
            this.afterAction = new AtomicReference<>(function0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onAfter$lambda$0(Function0 action) {
            Intrinsics.checkNotNullParameter(action, "$action");
            try {
                action.invoke();
            } catch (InterruptedException e11) {
                C43846g.m96568c(new StartupException(e11, "TaskWaiter after failed", true, null, 8, null), null, 2, null);
            }
        }

        public final void await() {
            try {
                CountDownLatch countDownLatch = this.countDownLatch;
                if (countDownLatch != null) {
                    countDownLatch.await();
                }
            } catch (InterruptedException e11) {
                C43846g.m96568c(new StartupException(e11, "countDownLatch await failed", true, null, 8, null), null, 2, null);
            }
        }

        @Nullable
        public final CountDownLatch getCountDownLatch() {
            return this.countDownLatch;
        }

        public final void onAfter() {
            final Function0<Unit> andSet = this.afterAction.getAndSet(null);
            if (andSet == null) {
                return;
            }
            C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.sdk.startup.i
                @Override // java.lang.Runnable
                public final void run() {
                    StartupTaskPack.TaskWaiter.onAfter$lambda$0(andSet);
                }
            });
        }

        public /* synthetic */ TaskWaiter(CountDownLatch countDownLatch, Function0 function0, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(countDownLatch, (i11 & 2) != 0 ? null : function0);
        }
    }

    /* JADX INFO: compiled from: StartupTaskPack.kt */
    @Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StartupThreadType.values().length];
            try {
                iArr[StartupThreadType.Main.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StartupThreadType.Await.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StartupThreadType.Async.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public StartupTaskPack(@NotNull String packName, boolean z11) {
        Intrinsics.checkNotNullParameter(packName, "packName");
        this.packName = packName;
        this.isMainProcess = z11;
        this.mainTasks = new ArrayList();
        this.awaitTasks = new ArrayList();
        this.asyncTasks = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runAllAsync$lambda$4$lambda$3(StartupTaskItem it, Application application, int i11, Ref.IntRef countDown, StartupTaskPack this$0, long j11, C43851l.a aVar) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(application, "$application");
        Intrinsics.checkNotNullParameter(countDown, "$countDown");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        it.safeRun(application, BaseJavaModule.METHOD_TYPE_ASYNC, i11);
        int i12 = countDown.element - 1;
        countDown.element = i12;
        if (i12 == 0) {
            this$0.asyncCostTime = System.currentTimeMillis() - j11;
            this$0.setState(this$0.state | 4);
            if (aVar != null) {
                aVar.stop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runAllAwait$lambda$2$lambda$1(StartupTaskItem it, Application application, int i11, CountDownLatch countDownLatch, StartupTaskPack this$0, long j11, C43851l.a aVar, TaskWaiter waiter) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(application, "$application");
        Intrinsics.checkNotNullParameter(countDownLatch, "$countDownLatch");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(waiter, "$waiter");
        it.safeRun(application, "await", i11);
        countDownLatch.countDown();
        if (countDownLatch.getCount() == 0) {
            this$0.awaitCostTime = System.currentTimeMillis() - j11;
            this$0.setState(this$0.state | 2);
            if (aVar != null) {
                aVar.stop();
            }
            waiter.onAfter();
        }
    }

    private final void setState(int i11) {
        int i12 = this.state;
        this.state = i11;
        IStateListener iStateListener = this.stateListener;
        if (iStateListener != null) {
            iStateListener.onStateChanged(i12, i11);
        }
    }

    private final C43851l.a startWatcher(String type) {
        if (!this.isMainProcess) {
            return null;
        }
        return C43851l.m96588a("startup_task_" + this.packName + '_' + type, true);
    }

    @MainThread
    public final void addTask(@NotNull StartupTaskItem item, @NotNull StartupThreadType threadType) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(threadType, "threadType");
        int i11 = WhenMappings.$EnumSwitchMapping$0[threadType.ordinal()];
        if (i11 == 1) {
            this.mainTasks.add(item);
        } else if (i11 == 2) {
            this.awaitTasks.add(item);
        } else {
            if (i11 != 3) {
                return;
            }
            this.asyncTasks.add(item);
        }
    }

    @MainThread
    public final void awaitAll(@NotNull Application application, int startType) {
        Intrinsics.checkNotNullParameter(application, "application");
        TaskWaiter taskWaiterStartWithWaiter = this.waiter;
        if (taskWaiterStartWithWaiter == null) {
            taskWaiterStartWithWaiter = startWithWaiter(application, startType);
        }
        taskWaiterStartWithWaiter.await();
        this.waiter = null;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final IStateListener getStateListener() {
        return this.stateListener;
    }

    public final void setStateListener(@Nullable IStateListener iStateListener) {
        this.stateListener = iStateListener;
    }

    @MainThread
    public final void startAll(@NotNull Application application, int startType) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (this.waiter != null) {
            return;
        }
        startWithWaiter(application, startType);
    }

    @NotNull
    public final String taskSize() {
        String str = "main-" + this.mainTasks.size() + "|await-" + this.awaitTasks.size() + "|async-" + this.asyncTasks.size();
        Intrinsics.checkNotNullExpressionValue(str, "builder.toString()");
        return str;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("+--- " + this.packName);
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("|   +--- Main");
        if (this.mainCostTime > 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            sb3.append(this.mainCostTime);
            sb3.append(']');
            sb2.append(sb3.toString());
        }
        sb2.append(": ");
        int i11 = 0;
        int i12 = 0;
        for (Object obj : this.mainTasks) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb2.append(i12);
            sb2.append(C33978va.f72339h);
            sb2.append(((StartupTaskItem) obj).toString());
            sb2.append(" -> ");
            i12 = i13;
        }
        if (this.mainTasks.size() > 0) {
            sb2.setLength(sb2.length() - 3);
        }
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("|   +--- Await");
        if (this.awaitCostTime > 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('[');
            sb4.append(this.awaitCostTime);
            sb4.append(']');
            sb2.append(sb4.toString());
        }
        sb2.append(": ");
        int i14 = 0;
        for (Object obj2 : this.awaitTasks) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb2.append(i14);
            sb2.append(C33978va.f72339h);
            sb2.append(((StartupTaskItem) obj2).toString());
            sb2.append(",");
            i14 = i15;
        }
        if (this.awaitTasks.size() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        sb2.append("|   \\--- Async");
        if (this.asyncCostTime > 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append('[');
            sb5.append(this.asyncCostTime);
            sb5.append(']');
            sb2.append(sb5.toString());
        }
        sb2.append(": ");
        for (Object obj3 : this.asyncTasks) {
            int i16 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            sb2.append(i11);
            sb2.append(C33844oi.f71346o);
            sb2.append(((StartupTaskItem) obj3).toString());
            sb2.append(",");
            i11 = i16;
        }
        if (this.asyncTasks.size() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "builder.toString()");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runAllAsync(List<StartupTaskItem> list, Application application, final int i11) {
        if (!list.isEmpty()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final C43851l.a aVarStartWatcher = startWatcher(BaseJavaModule.METHOD_TYPE_ASYNC);
            final Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = list.size();
            for (final StartupTaskItem startupTaskItem : list) {
                final Application application2 = application;
                C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.sdk.startup.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        StartupTaskPack.runAllAsync$lambda$4$lambda$3(startupTaskItem, application2, i11, intRef, this, jCurrentTimeMillis, aVarStartWatcher);
                    }
                });
                application = application2;
            }
        }
    }

    private final TaskWaiter runAllAwait(List<StartupTaskItem> list, final Application application, final int i11) {
        if (list.isEmpty()) {
            runAllAsync(this.asyncTasks, application, i11);
            return new TaskWaiter(null, null);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final C43851l.a aVarStartWatcher = startWatcher("sync");
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        final TaskWaiter taskWaiter = new TaskWaiter(countDownLatch, new Function0<Unit>() { // from class: com.kubi.sdk.startup.StartupTaskPack$runAllAwait$waiter$1
            @Override // p852kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.packCostTime = System.currentTimeMillis() - jCurrentTimeMillis;
                StartupTaskPack startupTaskPack = this.this$0;
                startupTaskPack.runAllAsync(startupTaskPack.asyncTasks, application, i11);
            }
        });
        for (final StartupTaskItem startupTaskItem : list) {
            C42917g.m94137c().execute(new Runnable() { // from class: com.kubi.sdk.startup.h
                @Override // java.lang.Runnable
                public final void run() {
                    StartupTaskPack.runAllAwait$lambda$2$lambda$1(startupTaskItem, application, i11, countDownLatch, this, jCurrentTimeMillis, aVarStartWatcher, taskWaiter);
                }
            });
        }
        return taskWaiter;
    }

    @MainThread
    private final TaskWaiter startWithWaiter(Application application, int startType) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        TaskWaiter taskWaiterRunAllAwait = runAllAwait(this.awaitTasks, application, startType);
        C43851l.a aVarStartWatcher = startWatcher("main");
        Iterator<T> it = this.mainTasks.iterator();
        while (it.hasNext()) {
            ((StartupTaskItem) it.next()).safeRun(application, "main", startType);
        }
        this.mainCostTime = System.currentTimeMillis() - jCurrentTimeMillis;
        if (aVarStartWatcher != null) {
            aVarStartWatcher.stop();
        }
        setState(this.state | 1);
        this.waiter = taskWaiterRunAllAwait;
        return taskWaiterRunAllAwait;
    }

    @NotNull
    public final List<StartupDispatcher.TaskExecutionInfo> taskExecutionInfo() {
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        Iterator<T> it = this.mainTasks.iterator();
        while (it.hasNext()) {
            listCreateListBuilder.add(((StartupTaskItem) it.next()).taskExecutionInfo(this.packName, StartupThreadType.Main));
        }
        Iterator<T> it2 = this.awaitTasks.iterator();
        while (it2.hasNext()) {
            listCreateListBuilder.add(((StartupTaskItem) it2.next()).taskExecutionInfo(this.packName, StartupThreadType.Await));
        }
        Iterator<T> it3 = this.asyncTasks.iterator();
        while (it3.hasNext()) {
            listCreateListBuilder.add(((StartupTaskItem) it3.next()).taskExecutionInfo(this.packName, StartupThreadType.Async));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
