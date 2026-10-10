package com.kubi.kucoin.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.gson.reflect.TypeToken;
import com.kubi.config.RemoteConfig;
import com.kubi.config.exception.KCConfigException;
import com.kubi.route.config.RouteConfigManager;
import com.kubi.router.core.Router;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27025c;
import java.lang.reflect.Type;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RouterStartupTask.kt */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/startup/RouteConfigStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "route-config", stepType = StartupStepType.PreFirstPage, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nRouterStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouterStartupTask.kt\ncom/kubi/kucoin/startup/RouteConfigStartupTask\n+ 2 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 3 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,102:1\n35#2,4:103\n39#2:109\n44#3,2:107\n*S KotlinDebug\n*F\n+ 1 RouterStartupTask.kt\ncom/kubi/kucoin/startup/RouteConfigStartupTask\n*L\n92#1:103,4\n92#1:109\n92#1:107,2\n*E\n"})
public final class RouteConfigStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.RouteConfigStartupTask$a */
    /* JADX INFO: compiled from: RemoteConfig.kt */
    @Metadata(m90083d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, m90084d2 = {"com/kubi/config/RemoteConfig$getConfig$1", "Lcom/google/gson/reflect/TypeToken;", "Config_release"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nRemoteConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteConfig.kt\ncom/kubi/config/RemoteConfig$getConfig$1\n*L\n1#1,109:1\n*E\n"})
    public static final class C15609a extends TypeToken<Boolean> {
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.RouteConfigStartupTask$run$1 */
    /* JADX INFO: compiled from: RouterStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kucoin.startup.RouteConfigStartupTask$run$1", m90122f = "RouterStartupTask.kt", m90123i = {}, m90124l = {88}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C156101 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C156101(Application application, Continuation<? super C156101> continuation) {
            super(2, continuation);
            this.$application = application;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C156101(this.$application, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C156101) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                RouteConfigManager routeConfigManager = RouteConfigManager.f46179a;
                Application application = this.$application;
                String strM100675Z = C45590s.f102687a.m100675Z();
                this.label = 1;
                if (routeConfigManager.m56157a(application, strM100675Z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.RouteConfigStartupTask$run$2 */
    /* JADX INFO: compiled from: RouterStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kucoin.startup.RouteConfigStartupTask$run$2", m90122f = "RouterStartupTask.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C156112 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        public C156112(Continuation<? super C156112> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public static final Unit m32855g() {
            Router.f46192a.m56201w();
            return Unit.INSTANCE;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C156112(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C156112) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                C27100x0.m66923d(new Function0() { // from class: com.kubi.kucoin.startup.u
                    @Override // p852kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RouteConfigStartupTask.C156112.m32855g();
                    }
                });
                C44128b.m97266j("RouterStartupTask", "warmUp completed");
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Object objM20457a;
        Intrinsics.checkNotNullParameter(application, "application");
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("RouteConfigStartupTask").plus(C42911a.m94120b())), null, null, new C156101(application, null), 3, null);
        C44128b.m97266j("RouteConfigStartupTask", "fetch route config initiated");
        try {
            RemoteConfig remoteConfig = RemoteConfig.f19636a;
            Type type = new C15609a().getType();
            Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<T>() {}.type");
            objM20457a = RemoteConfig.m20457a("startup_router_warmup", type);
        } catch (Throwable th2) {
            C43846g.m96568c(new KCConfigException(th2, "RemoteConfig", false, null, 8, null), null, 2, null);
            objM20457a = null;
        }
        if (C27025c.m66567e((Boolean) objM20457a, true)) {
            C41696j.m91104d(C41713n0.m91125a(new CoroutineName("RouterWarmUp").plus(C42911a.m94120b())), null, null, new C156112(null), 3, null);
        }
    }
}
