package com.kubi.sdk.site.startup;

import android.annotation.SuppressLint;
import android.app.Application;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import com.kubi.sdk.site.C24137e;
import com.kubi.sdk.site.config.SiteConfigManager;
import com.kubi.sdk.site.info.SiteInfoManager;
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
import y70.C46395d;

/* JADX INFO: compiled from: SiteInitStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\f"}, m90084d2 = {"Lcom/kubi/sdk/site/startup/SiteInitStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "logi", "tag", "", "message", "LSiteConfig_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "site_init", priority = 0, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
public final class SiteInitStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.sdk.site.startup.SiteInitStartupTask$run$1 */
    /* JADX INFO: compiled from: SiteInitStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.sdk.site.startup.SiteInitStartupTask$run$1", m90122f = "SiteInitStartupTask.kt", m90123i = {}, m90124l = {44}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C241821 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241821(Application application, Continuation<? super C241821> continuation) {
            super(2, continuation);
            this.$application = application;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C241821(this.$application, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C241821) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Application application = this.$application;
                this.label = 1;
                if (siteConfigManager.m58041h(application, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public final void logi(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Log.i(tag, message);
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"VisibleForTests"})
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        InterfaceC41709m0 interfaceC41709m0M91125a = C41713n0.m91125a(new CoroutineName("SiteInitStartupTask").plus(C42911a.m94120b()));
        logi("SiteConfigManager", "SiteInitStartupTask start");
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        siteInfoManager.m58111e();
        C41696j.m91104d(interfaceC41709m0M91125a, null, null, new C241821(application, null), 3, null);
        String strM58109c = siteInfoManager.m58109c();
        C46395d.m102340f(strM58109c);
        C46395d.m102341g(!C24137e.m58087a(strM58109c));
    }
}
