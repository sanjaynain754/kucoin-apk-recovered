package com.kubi.unify;

import android.annotation.SuppressLint;
import android.app.Application;
import androidx.credentials.provider.CredentialEntry;
import androidx.media3.common.MimeTypes;
import com.kubi.network.socket.WebSocketClient;
import com.kubi.network.subscribe.codec.SubscribeSocketKCCodec;
import com.kubi.network.subscribe.token.SubscribeTokenConfig;
import com.kubi.network.subscribe.token.SubscribeTokenProvider;
import com.kubi.p110rn.Constants;
import com.kubi.sdk.site.C24129b;
import com.kubi.sdk.startup.IStartupTask;
import com.kubi.sdk.startup.StartupOption;
import com.kubi.sdk.startup.StartupStepType;
import com.kubi.sdk.startup.StartupThreadType;
import com.kubi.unify.api.IUnifyAccountService;
import com.kubi.unify.stream.UnifyDataStreamManager;
import com.kubi.user.config.UserInfo;
import com.kubi.utils.C27100x0;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import er.C37237b;
import i60.C38458a;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.C41726q1;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41635f;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p672ur.C45292b;
import p672ur.C45293c;
import p700vr.C45623a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;

/* JADX INFO: compiled from: UnifyAccountStartupTask.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002¨\u0006\n"}, m90084d2 = {"Lcom/kubi/unify/UnifyAccountStartupTask;", "Lcom/kubi/sdk/startup/IStartupTask;", "<init>", "()V", "run", "", MimeTypes.BASE_TYPE_APPLICATION, "Landroid/app/Application;", "registerAccountCategory", "initWsClient", "BUnifyAccountLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@StartupOption(name = "unifyAccount", priority = 100, stepType = StartupStepType.FirstPage, threadType = StartupThreadType.Main)
@SourceDebugExtension({"SMAP\nUnifyAccountStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyAccountStartupTask.kt\ncom/kubi/unify/UnifyAccountStartupTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
public final class UnifyAccountStartupTask implements IStartupTask {

    /* JADX INFO: renamed from: com.kubi.unify.UnifyAccountStartupTask$run$2 */
    /* JADX INFO: compiled from: UnifyAccountStartupTask.kt */
    /* JADX INFO: loaded from: classes52.dex */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.unify.UnifyAccountStartupTask$run$2", m90122f = "UnifyAccountStartupTask.kt", m90123i = {}, m90124l = {69}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C264472 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.kubi.unify.UnifyAccountStartupTask$run$2$a */
        /* JADX INFO: compiled from: UnifyAccountStartupTask.kt */
        @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
        public static final class a<T> implements InterfaceC41635f {

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ UnifyAccountStartupTask f53083b;

            public a(UnifyAccountStartupTask unifyAccountStartupTask) {
                this.f53083b = unifyAccountStartupTask;
            }

            /* JADX INFO: renamed from: a */
            public final Object m64856a(boolean z11, Continuation<? super Unit> continuation) {
                this.f53083b.registerAccountCategory();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC41635f
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return m64856a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        public C264472(Continuation<? super C264472> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UnifyAccountStartupTask.this.new C264472(continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
            return ((C264472) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
                InterfaceC41634e interfaceC41634eM90939v = C41636g.m90939v(IUnifyAccountService.f53155a.get().mo65009y());
                a aVar = new a(UnifyAccountStartupTask.this);
                this.label = 1;
                if (interfaceC41634eM90939v.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void initWsClient(Application application) {
        SubscribeTokenProvider subscribeTokenProvider = new SubscribeTokenProvider(new SubscribeTokenConfig(null, null, MapsKt.mapOf(TuplesKt.m90091to("isWs", CredentialEntry.TRUE_STRING), TuplesKt.m90091to(Constants.BIZ, "unified")), null, new Function0() { // from class: com.kubi.unify.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountStartupTask.initWsClient$lambda$8();
            }
        }, 11, null), null, 2, null);
        WebSocketClient webSocketClientM42867a = new WebSocketClient.C19339a().m42865A(new C45623a()).m42888v(new SubscribeSocketKCCodec(subscribeTokenProvider, C38458a.f86300a.m86731a())).m42890x(new C45292b("unified")).m42892z(new C45293c("unified")).m42866B(subscribeTokenProvider).m42867a(application);
        webSocketClientM42867a.connect();
        C37237b.m83284g("network/channel_unified", webSocketClientM42867a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String initWsClient$lambda$8() {
        return UserInfo.a.n() ? C27041f.m66668h(UserInfo.c().id) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerAccountCategory() {
        C27100x0.m66923d(new Function0() { // from class: com.kubi.unify.a
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountStartupTask.registerAccountCategory$lambda$7();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerAccountCategory$lambda$7() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("account_category", IUnifyAccountService.f53155a.get().mo64979C() ? "unified" : "classic");
        SensorsDataAPI.sharedInstance().registerSuperProperties(jSONObject);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$5$lambda$1(Boolean bool) {
        try {
            Result.Companion companion = Result.INSTANCE;
            C37237b.m83282e("network/channel_unified").mo42862g();
            Result.m103844constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        UnifyGlobalDataManager unifyGlobalDataManager = UnifyGlobalDataManager.f53084a;
        UserInfo userInfo = UserInfo.a;
        unifyGlobalDataManager.m64869A(userInfo.n());
        UnifyDataStreamManager.f53365a.m65346F(userInfo.n());
        return Unit.INSTANCE;
    }

    @Override // com.kubi.sdk.startup.IStartupTask
    @SuppressLint({"CheckResult"})
    public void run(@NotNull final Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        C24129b.m58033e(UnifyConstant.f53295a.m65222a(), new Function0() { // from class: com.kubi.unify.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UnifyAccountStartupTask.run$lambda$5(this.f53174b, application);
            }
        });
        C41696j.m91104d(C41726q1.f91773b, C42911a.m94120b(), null, new C264472(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$5(UnifyAccountStartupTask unifyAccountStartupTask, Application application) {
        unifyAccountStartupTask.initWsClient(application);
        UnifyGlobalDataManager.f53084a.m64888z();
        UnifyDataStreamManager.f53365a.m65363v();
        Observable observableE = UserInfo.a.e();
        final Function1 function1 = new Function1() { // from class: com.kubi.unify.b
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyAccountStartupTask.run$lambda$5$lambda$1((Boolean) obj);
            }
        };
        Consumer consumer = new Consumer() { // from class: com.kubi.unify.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function1.invoke(obj);
            }
        };
        final Function1 function2 = new Function1() { // from class: com.kubi.unify.d
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UnifyAccountStartupTask.run$lambda$5$lambda$3((Throwable) obj);
            }
        };
        observableE.subscribe(consumer, new Consumer() { // from class: com.kubi.unify.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                function2.invoke(obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit run$lambda$5$lambda$3(Throwable th2) {
        C44128b.m97264h(th2);
        return Unit.INSTANCE;
    }
}
