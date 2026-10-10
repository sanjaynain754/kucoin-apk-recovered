package com.kubi.kucoin.startup;

import al.RunnableC0377a;
import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.google.firebase.messaging.Constants;
import com.kubi.route.config.RouteConfigManager;
import com.kubi.router.core.Router;
import com.kubi.router.core.RouterConfig;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import o00.C42911a;
import o00.C42917g;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: RouterStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/kucoin/startup/RouterStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "initRoute", "initRouteConfig", "handleException", "uriStr", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "Companion", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "router", priority = 4, stepType = StartupStepType.Setup, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nRouterStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouterStartupTask.kt\ncom/kubi/kucoin/startup/RouterStartupTask\n+ 2 AppRouterIssue.kt\ncom/kubi/kucoin/exception/AppRouterIssueKt\n+ 3 KThreadPoolEx.kt\ncom/kubi/sdk/thread/KThreadPoolExKt\n*L\n1#1,102:1\n49#2:103\n70#2:106\n49#2:107\n70#2:110\n15#3,2:104\n15#3,2:108\n*S KotlinDebug\n*F\n+ 1 RouterStartupTask.kt\ncom/kubi/kucoin/startup/RouterStartupTask\n*L\n65#1:103\n65#1:106\n69#1:107\n69#1:110\n65#1:104,2\n69#1:108,2\n*E\n"})
public final class RouterStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static Function1<? super Throwable, Unit> errorHandler = new Function1() { // from class: com.kubi.kucoin.startup.v
        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return RouterStartupTask.errorHandler$lambda$1((Throwable) obj);
        }
    };

    /* JADX INFO: compiled from: RouterStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m90084d2 = {"Lcom/kubi/kucoin/startup/RouterStartupTask$Companion;", "", "<init>", "()V", "errorHandler", "Lkotlin/Function1;", "", "", "setErrorHandler", "handler", "LAppRouter_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void setErrorHandler(@NotNull Function1<? super Throwable, Unit> handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            RouterStartupTask.errorHandler = handler;
        }
    }

    /* JADX INFO: renamed from: com.kubi.kucoin.startup.RouterStartupTask$initRouteConfig$1 */
    /* JADX INFO: compiled from: RouterStartupTask.kt */
    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.kucoin.startup.RouterStartupTask$initRouteConfig$1", m90122f = "RouterStartupTask.kt", m90123i = {}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C156121 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        final /* synthetic */ Application $application;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C156121(Application application, Continuation<? super C156121> continuation) {
            super(2, continuation);
            this.$application = application;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C156121(this.$application, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C156121) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                if (routeConfigManager.m56160d(application, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit errorHandler$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C44128b.m97264h(it);
        return Unit.INSTANCE;
    }

    private final void handleException(String uriStr, Throwable error) {
        try {
            C44128b.m97261e("RouterStartupTask", "Route jump error, uri: " + uriStr + ", error: " + error);
            C42917g.m94137c().execute(new RunnableC0377a(error, "RouterStartupTask"));
            errorHandler.invoke(error);
        } catch (Exception e11) {
            C42917g.m94137c().execute(new RunnableC0377a(e11, "RouterStartupTask"));
        }
    }

    private final void initRoute(Application application) {
        Router.f46192a.m56195q(new RouterConfig.Builder().m56207c("kucoin").m56206b(new Function2() { // from class: com.kubi.kucoin.startup.w
            @Override // p852kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return RouterStartupTask.initRoute$lambda$0(this.f28415b, (String) obj, (Throwable) obj2);
            }
        }).m56205a(application));
        C44128b.m97266j("RouterStartupTask", "initRoute completed");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initRoute$lambda$0(RouterStartupTask routerStartupTask, String uri, Throwable error) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(error, "error");
        routerStartupTask.handleException(uri, error);
        return Unit.INSTANCE;
    }

    private final void initRouteConfig(Application application) {
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("RouterStartupTask").plus(C42911a.m94120b())), null, null, new C156121(application, null), 3, null);
        C44128b.m97266j("RouterStartupTask", "initRouteConfig completed");
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        initRoute(application);
        initRouteConfig(application);
    }
}
