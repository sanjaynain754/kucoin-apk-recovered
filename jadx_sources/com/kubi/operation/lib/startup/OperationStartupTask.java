package com.kubi.operation.lib.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.operation.lib.exception.OperationException;
import com.kubi.operation.lib.startup.OperationStartupTask;
import com.kubi.operation.lib.utils.C19553c;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: OperationStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m90084d2 = {"Lcom/kubi/operation/lib/startup/OperationStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "lastLoginState", "Ljava/util/concurrent/atomic/AtomicBoolean;", "subscribeLoginState", "resetCountDownTime", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "operation_init", priority = 100, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
@SourceDebugExtension({"SMAP\nOperationStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationStartupTask.kt\ncom/kubi/operation/lib/startup/OperationStartupTask\n+ 2 OperationIssue.kt\ncom/kubi/operation/lib/exception/OperationIssueKt\n*L\n1#1,58:1\n45#2,2:59\n*S KotlinDebug\n*F\n+ 1 OperationStartupTask.kt\ncom/kubi/operation/lib/startup/OperationStartupTask\n*L\n38#1:59,2\n*E\n"})
public final class OperationStartupTask implements IStartupTask {

    @NotNull
    private final AtomicBoolean lastLoginState = new AtomicBoolean(false);

    private final void resetCountDownTime() {
        C19553c.m43659g(-1L);
        C19553c.m43660h(-1L);
    }

    private final void subscribeLoginState() {
        AtomicBoolean atomicBoolean = this.lastLoginState;
        UserInfo userInfo = UserInfo.a;
        atomicBoolean.set(userInfo.n());
        Observable observableE = userInfo.e();
        final Function1 function1 = new Function1() { // from class: ct.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OperationStartupTask.subscribeLoginState$lambda$0(this.f79380b, (Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: ct.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: ct.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OperationStartupTask.subscribeLoginState$lambda$2((Throwable) obj);
            }
        };
        observableE.subscribe(consumer, new Consumer() { // from class: ct.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeLoginState$lambda$0(OperationStartupTask operationStartupTask, Boolean bool) {
        boolean zN = UserInfo.a.n();
        if (operationStartupTask.lastLoginState.compareAndSet(!zN, zN)) {
            operationStartupTask.resetCountDownTime();
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        subscribeLoginState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeLoginState$lambda$2(Throwable th2) {
        Intrinsics.checkNotNull(th2);
        C43846g.m96568c(new OperationException(th2, "OperationStartupTask", false, null, 8, null), null, 2, null);
        return Unit.INSTANCE;
    }
}
