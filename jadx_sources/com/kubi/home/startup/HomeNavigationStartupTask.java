package com.kubi.home.startup;

import android.app.Application;
import androidx.media3.common.MimeTypes;
import com.kubi.advert.api.entity.PromotionConfig;
import com.kubi.advert.api.entity.Property;
import com.kubi.home.exception.HomeException;
import com.kubi.home.navigation.NavigationApi;
import com.kubi.home.router.RouterNavigationInterceptor;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import p569qq.C43846g;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: HomeNavigationStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/home/startup/HomeNavigationStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "api", "Lcom/kubi/home/navigation/NavigationApi;", "getApi", "()Lcom/kubi/home/navigation/NavigationApi;", "api$delegate", "Lkotlin/Lazy;", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "fetchNavigationConfig", "HomeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "home_navigation_startup_task", priority = 200, stepType = StartupStepType.MainPage, threadType = StartupThreadType.Async)
public final class HomeNavigationStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: api$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy api = LazyKt.lazy(new Function0() { // from class: com.kubi.home.startup.b
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return HomeNavigationStartupTask.api_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.kubi.home.startup.HomeNavigationStartupTask$fetchNavigationConfig$1 */
    /* JADX INFO: compiled from: HomeNavigationStartupTask.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.home.startup.HomeNavigationStartupTask$fetchNavigationConfig$1", m90122f = "HomeNavigationStartupTask.kt", m90123i = {1}, m90124l = {46, 48}, m90125m = "invokeSuspend", m90126n = {"jumpUrl"}, m90127s = {"L$0"})
    @SourceDebugExtension({"SMAP\nHomeNavigationStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeNavigationStartupTask.kt\ncom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1\n+ 2 HomeIssue.kt\ncom/kubi/home/exception/HomeIssueKt\n*L\n1#1,54:1\n47#2,2:55\n*S KotlinDebug\n*F\n+ 1 HomeNavigationStartupTask.kt\ncom/kubi/home/startup/HomeNavigationStartupTask$fetchNavigationConfig$1\n*L\n50#1:55,2\n*E\n"})
    public static final class C148971 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C148971(Continuation<? super C148971> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeNavigationStartupTask.this.new C148971(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C148971) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        
            if (r1.updateKuCoinPayLink(r0, r16) == r6) goto L29;
         */
        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM42826g;
            List<Property> properties;
            Property property;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC41634e<PromotionConfig> interfaceC41634eM29700a = HomeNavigationStartupTask.this.getApi().m29700a("toc", "KuCoinPayHomeEntry");
                    this.label = 1;
                    objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM29700a, false, null, this, 2, null);
                    if (objM42826g == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objM42826g = obj;
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
                PromotionConfig promotionConfig = (PromotionConfig) ((C19334f) objM42826g).m42846a();
                String jumpUrl = (promotionConfig == null || (properties = promotionConfig.getProperties()) == null || (property = (Property) CollectionsKt.firstOrNull((List) properties)) == null) ? null : property.getJumpUrl();
                RouterNavigationInterceptor.Companion companion = RouterNavigationInterceptor.f26191a;
                this.L$0 = SpillingKt.nullOutSpilledVariable(jumpUrl);
                this.label = 2;
            } catch (Exception e11) {
                C43846g.m96568c(new HomeException(e11, "HomeNavigationStartupTask", false, null, 8, null), null, 2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavigationApi api_delegate$lambda$0() {
        return (NavigationApi) RetrofitFlowExKt.m42820a(NavigationApi.class);
    }

    private final void fetchNavigationConfig() {
        C41696j.m91104d(C41713n0.m91125a(new CoroutineName("HomeNavigationStartupTask").plus(C42911a.m94120b())), null, null, new C148971(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationApi getApi() {
        return (NavigationApi) this.api.getValue();
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    public void run(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        fetchNavigationConfig();
    }
}
