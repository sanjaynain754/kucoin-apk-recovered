package com.kubi.sdk.site.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.sdk.site.SiteService;
import com.kubi.sdk.site.exception.SiteException;
import com.kubi.sdk.site.migration.SiteMigrationService;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupIssueKt;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.AbstractCoroutineContextElement;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: SiteFetchStartupTask.kt */
/* JADX INFO: loaded from: classes45.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/sdk/site/startup/SiteFetchStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LSite_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "site", priority = 0, stepType = StartupStepType.MainPage, threadType = StartupThreadType.Async)
@SourceDebugExtension({"SMAP\nSiteFetchStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SiteFetchStartupTask.kt\ncom/kubi/sdk/site/startup/SiteFetchStartupTask\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,40:1\n47#2,4:41\n*S KotlinDebug\n*F\n+ 1 SiteFetchStartupTask.kt\ncom/kubi/sdk/site/startup/SiteFetchStartupTask\n*L\n31#1:41,4\n*E\n"})
public final class SiteFetchStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.sdk.site.startup.SiteFetchStartupTask$a */
    /* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
    @Metadata(m90083d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t¸\u0006\u0000"}, m90084d2 = {"kotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handleException", "", "context", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 SiteFetchStartupTask.kt\ncom/kubi/sdk/site/startup/SiteFetchStartupTask\n+ 3 SiteIssue.kt\ncom/kubi/sdk/site/exception/SiteIssueKt\n*L\n1#1,49:1\n31#2:50\n45#3,3:51\n*S KotlinDebug\n*F\n+ 1 SiteFetchStartupTask.kt\ncom/kubi/sdk/site/startup/SiteFetchStartupTask\n*L\n31#1:51,3\n*E\n"})
    public static final class C24180a extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext context, Throwable exception) {
            C44128b.m97263g("SITE", exception);
            C43846g.m96568c(new SiteException(exception, "SITE", false, null, 8, null), null, 2, null);
        }

        public C24180a(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }
    }

    /* JADX INFO: renamed from: com.kubi.sdk.site.startup.SiteFetchStartupTask$run$1 */
    /* JADX INFO: compiled from: SiteFetchStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.startup.SiteFetchStartupTask$run$1", m90122f = "SiteFetchStartupTask.kt", m90123i = {}, m90124l = {34, 35}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241811 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C241811(Continuation<? super C241811> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C241811(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241811) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        
            if (r5.m58146d(r4) == r0) goto L15;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            C44128b.m97266j("SiteService", "SiteStartupTask start Splash");
            SiteService siteService = SiteService.f47793a;
            SiteService.SwitchFromType switchFromType = SiteService.SwitchFromType.Splash;
            this.label = 1;
            if (siteService.m58002p(switchFromType, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
            SiteMigrationService siteMigrationService = SiteMigrationService.f47924a;
            this.label = 2;
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C44128b.m97266j(StartupIssueKt.STARTUP_CATEGORY, "SiteStartupTask start");
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("siteUpdate").plus(new C24180a(CoroutineExceptionHandler.INSTANCE))), null, null, new C241811(null), 3, null);
    }
}
