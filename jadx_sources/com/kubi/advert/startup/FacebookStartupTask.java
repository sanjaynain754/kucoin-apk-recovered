package com.kubi.advert.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.advert.AFOpenIdUtil;
import com.kubi.advert.CpsUtils;
import com.kubi.advert.FacebookSdkUtil;
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
import p569qq.C43848i;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppsFlyerStartupTask.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/advert/startup/FacebookStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "facebook_sdk", stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Async)
public final class FacebookStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.advert.startup.FacebookStartupTask$run$1 */
    /* JADX INFO: compiled from: AppsFlyerStartupTask.kt */
    /* JADX INFO: loaded from: classes62.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.advert.startup.FacebookStartupTask$run$1", m90122f = "AppsFlyerStartupTask.kt", m90123i = {}, m90124l = {36}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C93691 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C93691(Continuation<? super C93691> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C93691(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C93691) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CpsUtils cpsUtils;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 == 1) {
                    cpsUtils = (CpsUtils) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                CpsUtils cpsUtils2 = CpsUtils.f15167a;
                this.L$0 = cpsUtils2;
                this.label = 1;
                Object objM96578b = C43848i.m96578b(this);
                if (objM96578b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cpsUtils = cpsUtils2;
                obj = objM96578b;
            }
            cpsUtils.m14815g((String) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        FacebookSdkUtil.f15173a.m14820b(application);
        AFOpenIdUtil.f14967a.m14716n();
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("FacebookStartupTask_AppInstanceId").plus(C42911a.m94120b())), null, null, new C93691(null), 3, null);
    }
}
