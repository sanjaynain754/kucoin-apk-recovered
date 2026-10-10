package com.kubi.operation.lib.widgets.newuser;

import com.kubi.home.api.HomeConst;
import com.kubi.home.api.HomeWidgetCode;
import com.kubi.mvi.state.AbstractC19291m;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.entity.WidgetNewUserEntity;
import com.kubi.sdk.util.StartupTrace;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p502oj.C43101f;
import p502oj.C43103h;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: NewUserWidgetVM.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0094@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetVM;", "Lcom/kubi/mvi/state/SingleSimpleStateVM;", "Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UIState;", "<init>", "()V", "repo", "Lcom/kubi/operation/lib/api/OperationRepo;", "firstLoad", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initState", "getInitState", "()Lcom/kubi/operation/lib/widgets/newuser/NewUserWidgetContract$UIState;", "dispatchIntent", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadData", "forceRefresh", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNewUserWidgetVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewUserWidgetVM.kt\ncom/kubi/operation/lib/widgets/newuser/NewUserWidgetVM\n+ 2 BaseStateVM.kt\ncom/kubi/mvi/state/BaseStateVM\n*L\n1#1,55:1\n473#2,4:56\n*S KotlinDebug\n*F\n+ 1 NewUserWidgetVM.kt\ncom/kubi/operation/lib/widgets/newuser/NewUserWidgetVM\n*L\n26#1:56,4\n*E\n"})
public final class NewUserWidgetVM extends AbstractC19291m<UIState> {

    /* JADX INFO: renamed from: X */
    @NotNull
    public final OperationRepo f36915X = new OperationRepo();

    /* JADX INFO: renamed from: Y */
    @NotNull
    public final AtomicBoolean f36916Y = new AtomicBoolean(true);

    /* JADX INFO: renamed from: com.kubi.operation.lib.widgets.newuser.NewUserWidgetVM$dispatchIntent$1 */
    /* JADX INFO: compiled from: NewUserWidgetVM.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.widgets.newuser.NewUserWidgetVM", m90122f = "NewUserWidgetVM.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {26}, m90125m = "dispatchIntent", m90126n = {"intent", "this_$iv", "$this$checkIntent$iv", "it", "$i$f$checkIntent", "$i$a$-checkIntent-NewUserWidgetVM$dispatchIntent$2"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class C195811 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C195811(Continuation<? super C195811> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NewUserWidgetVM.this.dispatchIntent(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m43745o(boolean z11, Continuation<? super Unit> continuation) throws JSONException {
        NewUserWidgetVM$loadData$1 newUserWidgetVM$loadData$1;
        long j11;
        final WidgetNewUserEntity widgetNewUserEntityM43266f;
        if (continuation instanceof NewUserWidgetVM$loadData$1) {
            newUserWidgetVM$loadData$1 = (NewUserWidgetVM$loadData$1) continuation;
            int i11 = newUserWidgetVM$loadData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                newUserWidgetVM$loadData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                newUserWidgetVM$loadData$1 = new NewUserWidgetVM$loadData$1(this, continuation);
            }
        } else {
            newUserWidgetVM$loadData$1 = new NewUserWidgetVM$loadData$1(this, continuation);
        }
        Object objM43273n = newUserWidgetVM$loadData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = newUserWidgetVM$loadData$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM43273n);
            C43101f c43101f = C43101f.f95302a;
            c43101f.m94709b("home_page_new_user_widget_load_data");
            StartupTrace startupTrace = StartupTrace.f48194a;
            startupTrace.m58450j("duration10");
            if (this.f36916Y.compareAndSet(true, false) && (widgetNewUserEntityM43266f = this.f36915X.m43266f()) != null) {
                c43101f.m94709b("home_page_new_user_widget_use_cache");
                startupTrace.m58450j("duration11");
                Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.operation.lib.widgets.newuser.i
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return NewUserWidgetVM.m43746p(widgetNewUserEntityM43266f, (UIState) obj);
                    }
                }));
            }
            Long lBoxLong = z11 ? null : Boxing.boxLong(HomeConst.f25513a.m28962b());
            c43101f.m94709b("home_page_new_user_widget_start_fetch_data");
            long jM94718b = C43103h.f95308a.m94718b();
            OperationRepo operationRepo = this.f36915X;
            newUserWidgetVM$loadData$1.L$0 = SpillingKt.nullOutSpilledVariable(lBoxLong);
            newUserWidgetVM$loadData$1.Z$0 = z11;
            newUserWidgetVM$loadData$1.J$0 = jM94718b;
            newUserWidgetVM$loadData$1.label = 1;
            objM43273n = operationRepo.m43273n(lBoxLong, newUserWidgetVM$loadData$1);
            if (objM43273n == coroutine_suspended) {
                return coroutine_suspended;
            }
            j11 = jM94718b;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = newUserWidgetVM$loadData$1.J$0;
            ResultKt.throwOnFailure(objM43273n);
        }
        final WidgetNewUserEntity widgetNewUserEntity = (WidgetNewUserEntity) objM43273n;
        if (widgetNewUserEntity == null) {
            C43101f.f95302a.m94714h();
        }
        C43103h c43103h = C43103h.f95308a;
        c43103h.m94720d(HomeWidgetCode.NewUser.getCode(), c43103h.m94718b() - j11);
        StartupTrace.f48194a.m58450j("duration11");
        C43101f.f95302a.m94709b("home_page_new_user_widget_end_fetch_data");
        if (widgetNewUserEntity != null) {
            Boxing.boxBoolean(updateState(new Function1() { // from class: com.kubi.operation.lib.widgets.newuser.j
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewUserWidgetVM.m43747q(widgetNewUserEntity, (UIState) obj);
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final UIState m43746p(WidgetNewUserEntity widgetNewUserEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return updateState.copy(widgetNewUserEntity, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: q */
    public static final UIState m43747q(WidgetNewUserEntity widgetNewUserEntity, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, widgetNewUserEntity, null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    public Object dispatchIntent(@NotNull InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C195811 c195811;
        if (continuation instanceof C195811) {
            c195811 = (C195811) continuation;
            int i11 = c195811.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c195811.label = i11 - Integer.MIN_VALUE;
            } else {
                c195811 = new C195811(continuation);
            }
        } else {
            c195811 = new C195811(continuation);
        }
        Object obj = c195811.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c195811.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            if (interfaceC19282d instanceof NewUserWidgetContract$UiIntent.LoadData) {
                NewUserWidgetContract$UiIntent.LoadData loadData = (NewUserWidgetContract$UiIntent.LoadData) interfaceC19282d;
                boolean forceRefresh = loadData.getForceRefresh();
                c195811.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                c195811.L$1 = SpillingKt.nullOutSpilledVariable(this);
                c195811.L$2 = interfaceC19282d;
                c195811.L$3 = SpillingKt.nullOutSpilledVariable(loadData);
                c195811.I$0 = 0;
                c195811.I$1 = 0;
                c195811.label = 1;
                if (m43745o(forceRefresh, c195811) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, 3, null);
    }
}
