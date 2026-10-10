package com.kubi.widget.web.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: KWebWidgetStartupTask.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m90084d2 = {"Lcom/kubi/widget/web/startup/KWebWidgetStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "dependencies", "Lcom/kubi/widget/web/startup/KWebStartupDependencies;", "<init>", "(Lcom/kubi/widget/web/startup/KWebStartupDependencies;)V", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "runLegacy", "runParallelPrepare", "LWebWidget_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "k_web_widget", priority = 100, stepType = StartupStepType.Application, threadType = StartupThreadType.Await)
public final class KWebWidgetStartupTask implements IStartupTask {

    @NotNull
    private final KWebStartupDependencies dependencies;

    public KWebWidgetStartupTask(@NotNull KWebStartupDependencies dependencies) {
        Intrinsics.checkNotNullParameter(dependencies, "dependencies");
        this.dependencies = dependencies;
    }

    private final void runLegacy() {
        this.dependencies.mo67386f();
        this.dependencies.mo67394n();
        this.dependencies.mo67391k();
        this.dependencies.mo67385e();
    }

    private final void runParallelPrepare() throws InterruptedException {
        new KWebParallelPrepareRunner(this.dependencies.mo67389i()).m67370b(new Function0() { // from class: com.kubi.widget.web.startup.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$0(this.f55244b);
            }
        }, new Function0() { // from class: com.kubi.widget.web.startup.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$1(this.f55245b);
            }
        }, new Function0() { // from class: com.kubi.widget.web.startup.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$2(this.f55246b);
            }
        }, new Function1() { // from class: com.kubi.widget.web.startup.o
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$3(this.f55247b, (PreparedConfig) obj);
            }
        }, new Function0() { // from class: com.kubi.widget.web.startup.p
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$4(this.f55248b);
            }
        }, new Function1() { // from class: com.kubi.widget.web.startup.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$5(this.f55249b, (PreparedConfig) obj);
            }
        }, new Function1() { // from class: com.kubi.widget.web.startup.r
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$6(this.f55250b, (PreparedConfig) obj);
            }
        }, new Function0() { // from class: com.kubi.widget.web.startup.s
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return KWebWidgetStartupTask.runParallelPrepare$lambda$7(this.f55251b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreparedConfig runParallelPrepare$lambda$0(KWebWidgetStartupTask kWebWidgetStartupTask) {
        return kWebWidgetStartupTask.dependencies.mo67392l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreparedConfig runParallelPrepare$lambda$1(KWebWidgetStartupTask kWebWidgetStartupTask) {
        return kWebWidgetStartupTask.dependencies.mo67387g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreparedConfig runParallelPrepare$lambda$2(KWebWidgetStartupTask kWebWidgetStartupTask) {
        return kWebWidgetStartupTask.dependencies.mo67381a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runParallelPrepare$lambda$3(KWebWidgetStartupTask kWebWidgetStartupTask, PreparedConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kWebWidgetStartupTask.dependencies.mo67383c(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runParallelPrepare$lambda$4(KWebWidgetStartupTask kWebWidgetStartupTask) {
        kWebWidgetStartupTask.dependencies.mo67388h();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runParallelPrepare$lambda$5(KWebWidgetStartupTask kWebWidgetStartupTask, PreparedConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kWebWidgetStartupTask.dependencies.mo67393m(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runParallelPrepare$lambda$6(KWebWidgetStartupTask kWebWidgetStartupTask, PreparedConfig it) {
        Intrinsics.checkNotNullParameter(it, "it");
        kWebWidgetStartupTask.dependencies.mo67384d(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runParallelPrepare$lambda$7(KWebWidgetStartupTask kWebWidgetStartupTask) {
        kWebWidgetStartupTask.dependencies.mo67390j();
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) throws InterruptedException {
        Intrinsics.checkNotNullParameter(application, "application");
        if (this.dependencies.mo67382b()) {
            runParallelPrepare();
        } else {
            runLegacy();
        }
    }

    public KWebWidgetStartupTask() {
        this(DefaultKWebStartupDependencies.f55237a);
    }
}
