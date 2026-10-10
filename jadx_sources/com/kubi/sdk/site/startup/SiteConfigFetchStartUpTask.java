package com.kubi.sdk.site.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.NetworkUtils;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: SiteInitStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/site/startup/SiteConfigFetchStartUpTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "site_config_fetch", priority = 0, stepType = StartupStepType.Application, threadType = StartupThreadType.Async)
public final class SiteConfigFetchStartUpTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.sdk.site.startup.SiteConfigFetchStartUpTask$run$1 */
    /* JADX INFO: compiled from: SiteInitStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.startup.SiteConfigFetchStartUpTask$run$1", m90122f = "SiteInitStartupTask.kt", m90123i = {}, m90124l = {73}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241761 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C241761(Continuation<? super C241761> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C241761(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241761) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                SiteConfigManager siteConfigManager = SiteConfigManager.f47884a;
                this.label = 1;
                if (siteConfigManager.m58048o(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.startup.SiteConfigFetchStartUpTask$run$2 */
    /* JADX INFO: compiled from: SiteInitStartupTask.kt */
    /* JADX INFO: loaded from: classes45.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.startup.SiteConfigFetchStartUpTask$run$2", m90122f = "SiteInitStartupTask.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241772 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241772(Application application, Continuation<? super C241772> continuation) {
            super(2, continuation);
            this.$application = application;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C241772(this.$application, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241772) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C44128b.m97266j("SiteConfigManager", "SiteConfigFetchStartUpTask start");
                SiteConfigManager siteConfigManager = SiteConfigManager.f47884a;
                Application application = this.$application;
                this.label = 1;
                if (SiteConfigManager.m58036e(siteConfigManager, application, null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"VisibleForTests"})
    public void run(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        final InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(new CoroutineName("SiteConfigFetchStartUpTask").plus(C42911a.m94120b()));
        C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C241761(null), 3, null);
        C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C241772(application, null), 3, null);
        try {
            NetworkUtils.registerNetworkStatusChangedListener(new NetworkUtils.InterfaceC5242a() { // from class: com.kubi.sdk.site.startup.SiteConfigFetchStartUpTask.run.3
                @Override // com.blankj.utilcode.util.NetworkUtils.InterfaceC5242a
                /* JADX INFO: renamed from: a */
                public void mo6072a(NetworkUtils.NetworkType networkType) {
                    C41696j.m91104d(interfaceC41709m0M91125a, null, null, new SiteConfigFetchStartUpTask$run$3$onConnected$1(application, null), 3, null);
                }

                @Override // com.blankj.utilcode.util.NetworkUtils.InterfaceC5242a
                public void onDisconnected() {
                }
            });
        } catch (Exception e11) {
            C44128b.m97266j("SiteConfigManager", "registerNetworkStatusChangedListener error: " + e11.getMessage());
        }
    }
}
