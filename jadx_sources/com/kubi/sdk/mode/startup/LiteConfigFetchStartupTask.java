package com.kubi.sdk.mode.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.sdk.mode.config.LiteConfigManager;
import com.kubi.sdk.mode.exception.modeException;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupIssueKt;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.user.config.UserInfo;
import com.kubi.user.model.AccountEventState;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: LiteConfigFetchStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0002¨\u0006\t"}, m90084d2 = {"Lcom/kubi/sdk/mode/startup/LiteConfigFetchStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "fetchLiteConfig", "LMode_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "lite_mode_config_fetch", priority = 200, stepType = StartupStepType.MainPage, threadType = StartupThreadType.Async)
public final class LiteConfigFetchStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.sdk.mode.startup.LiteConfigFetchStartupTask$fetchLiteConfig$1 */
    /* JADX INFO: compiled from: LiteConfigFetchStartupTask.kt */
    /* JADX INFO: loaded from: classes41.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.mode.startup.LiteConfigFetchStartupTask$fetchLiteConfig$1", m90122f = "LiteConfigFetchStartupTask.kt", m90123i = {}, m90124l = {44}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    @SourceDebugExtension({"SMAP\nLiteConfigFetchStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiteConfigFetchStartupTask.kt\ncom/kubi/sdk/mode/startup/LiteConfigFetchStartupTask$fetchLiteConfig$1\n+ 2 ModeIssue.kt\ncom/kubi/sdk/mode/exception/ModeIssueKt\n*L\n1#1,50:1\n39#2,3:51\n*S KotlinDebug\n*F\n+ 1 LiteConfigFetchStartupTask.kt\ncom/kubi/sdk/mode/startup/LiteConfigFetchStartupTask$fetchLiteConfig$1\n*L\n46#1:51,3\n*E\n"})
    public static final class C238911 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C238911(Continuation<? super C238911> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C238911(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C238911) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                        ((Result) obj).getValue();
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    LiteConfigManager liteConfigManager = LiteConfigManager.f47070a;
                    this.label = 1;
                    if (liteConfigManager.m57259c(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } catch (Exception e11) {
                C44128b.m97263g("LiteConfigFetchStartUpTask", e11);
                C43846g.m96568c(new modeException(e11, "LiteConfigFetchStartUpTask", false, null, 8, null), null, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    private final void fetchLiteConfig() {
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("LiteConfigFetchStartUpTask").plus(C42911a.m94120b())), null, null, new C238911(null), 3, null);
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C44128b.m97266j(StartupIssueKt.STARTUP_CATEGORY, "LiteConfigFetchStartUpTask start");
        UserInfo userInfo = UserInfo.a;
        if (userInfo.d() == UserInfo.LoginState.Login) {
            fetchLiteConfig();
        }
        Observable observableA = userInfo.a();
        final Function1 function1 = new Function1() { // from class: com.kubi.sdk.mode.startup.a
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LiteConfigFetchStartupTask.run$lambda$0(this.f47135b, (AccountEventState) obj);
            }
        };
        observableA.subscribe(new Consumer() { // from class: com.kubi.sdk.mode.startup.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$0(LiteConfigFetchStartupTask liteConfigFetchStartupTask, AccountEventState accountEventState) {
        if (accountEventState.isLoginAccountEvent()) {
            liteConfigFetchStartupTask.fetchLiteConfig();
        }
        return Unit.INSTANCE;
    }
}
