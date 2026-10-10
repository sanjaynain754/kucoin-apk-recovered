package com.kubi.assets.finance;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.autoearn.AutoEarnApi;
import com.kubi.assets.autoearn.data.AutoEarnStateResp;
import com.kubi.assets.entity.FinanceConfig;
import com.kubi.mvi.state.AbstractC19290l;
import com.kubi.mvi.state.InterfaceC19282d;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.profit.loss.analysis.api.AssetsProfitLossAnalysisManager;
import kotlinx.coroutines.flow.InterfaceC41634e;
import lb.C42153h;
import mr.C42597a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: FinanceViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0094@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0017R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/assets/finance/FinanceViewModel;", "Lcom/kubi/mvi/state/SimpleStateVM;", "Lcom/kubi/assets/finance/FinanceContract$UIState;", "<init>", "()V", "api", "Lcom/kubi/assets/AssetV2Api;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/assets/AssetV2Api;", "api$delegate", "Lkotlin/Lazy;", "autoEarnApi", "Lcom/kubi/assets/autoearn/AutoEarnApi;", "getAutoEarnApi", "()Lcom/kubi/assets/autoearn/AutoEarnApi;", "autoEarnApi$delegate", "dispatchIntentOnIO", "", "intent", "Lcom/kubi/mvi/state/IIntent;", "(Lcom/kubi/mvi/state/IIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGetFinanceConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initState", "getInitState", "()Lcom/kubi/assets/finance/FinanceContract$UIState;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nFinanceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FinanceViewModel.kt\ncom/kubi/assets/finance/FinanceViewModel\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n126#2,2:76\n25#3:78\n26#3:80\n1#4:79\n*S KotlinDebug\n*F\n+ 1 FinanceViewModel.kt\ncom/kubi/assets/finance/FinanceViewModel\n*L\n40#1:76,2\n66#1:78\n66#1:80\n66#1:79\n*E\n"})
public final class FinanceViewModel extends AbstractC19290l<UIState> {

    /* JADX INFO: renamed from: W */
    @NotNull
    public final Lazy f17398W = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.finance.h0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinanceViewModel.m16709r();
        }
    });

    /* JADX INFO: renamed from: X */
    @NotNull
    public final Lazy f17399X = LazyKt.lazy(new Function0() { // from class: com.kubi.assets.finance.i0
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FinanceViewModel.m16710s();
        }
    });

    /* JADX INFO: renamed from: com.kubi.assets.finance.FinanceViewModel$dispatchIntentOnIO$1 */
    /* JADX INFO: compiled from: FinanceViewModel.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.assets.finance.FinanceViewModel", m90122f = "FinanceViewModel.kt", m90123i = {0, 1, 2, 2, 2}, m90124l = {28, 36, 49}, m90125m = "dispatchIntentOnIO", m90126n = {"intent", "intent", "intent", "$this$dispatchIntentOnIO_u24lambda_u244", "$i$a$-runCatching-FinanceViewModel$dispatchIntentOnIO$3"}, m90127s = {"L$0", "L$0", "L$0", "L$1", "I$0"})
    public static final class C99611 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C99611(Continuation<? super C99611> continuation) {
            super(continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FinanceViewModel.this.dispatchIntentOnIO(null, this);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final UIState m16711t(InterfaceC19282d interfaceC19282d, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, null, ((FinanceContract$UiIntent.HideOrShowNumber) interfaceC19282d).getIsChecked(), null, 23, null);
    }

    /* JADX INFO: renamed from: u */
    public static final UIState m16712u(AutoEarnStateResp autoEarnStateResp, UIState updateState) {
        Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
        return UIState.copy$default(updateState, null, null, null, false, autoEarnStateResp != null ? autoEarnStateResp.getStatus() : null, 15, null);
    }

    /* JADX INFO: renamed from: v */
    private final AssetV2Api m16713v() {
        return (AssetV2Api) this.f17398W.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d6 A[Catch: all -> 0x0039, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:44:0x00c8, B:46:0x00d6, B:47:0x00da, B:40:0x00ad), top: B:55:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0106  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (m16716y(r0) == r1) goto L42;
     */
    @Override // com.kubi.mvi.state.BaseStateVM
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object dispatchIntentOnIO(@NotNull final InterfaceC19282d interfaceC19282d, @NotNull Continuation<? super Unit> continuation) {
        C99611 c99611;
        Object objM103844constructorimpl;
        Throwable thM103847exceptionOrNullimpl;
        FinanceViewModel financeViewModel;
        if (continuation instanceof C99611) {
            c99611 = (C99611) continuation;
            int i11 = c99611.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c99611.label = i11 - Integer.MIN_VALUE;
            } else {
                c99611 = new C99611(continuation);
            }
        } else {
            c99611 = new C99611(continuation);
        }
        Object objM15432g = c99611.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c99611.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM15432g);
                c99611.L$0 = interfaceC19282d;
                c99611.label = 1;
                if (super.dispatchIntentOnIO(interfaceC19282d, c99611) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i12 != 1) {
                if (i12 == 2) {
                    ResultKt.throwOnFailure(objM15432g);
                    return Unit.INSTANCE;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                financeViewModel = (FinanceViewModel) c99611.L$1;
                ResultKt.throwOnFailure(objM15432g);
                final AutoEarnStateResp autoEarnStateResp = (AutoEarnStateResp) objM15432g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GetAutoEarnState: ");
                sb2.append(autoEarnStateResp != null ? autoEarnStateResp.getStatus() : null);
                C44128b.m97258b(sb2.toString());
                objM103844constructorimpl = Result.m103844constructorimpl(Boxing.boxBoolean(financeViewModel.updateState(new Function1() { // from class: com.kubi.assets.finance.g0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FinanceViewModel.m16712u(autoEarnStateResp, (UIState) obj);
                    }
                })));
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    sendSingleEvent(new C10006p(thM103847exceptionOrNullimpl.getMessage()));
                }
                return Unit.INSTANCE;
            }
            interfaceC19282d = (InterfaceC19282d) c99611.L$0;
            ResultKt.throwOnFailure(objM15432g);
            if (!(interfaceC19282d instanceof FinanceContract$UiIntent.GetCoinList)) {
                if (interfaceC19282d instanceof FinanceContract$UiIntent.GetFinanceConfig) {
                    c99611.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c99611.label = 2;
                } else if (interfaceC19282d instanceof FinanceContract$UiIntent.HideOrShowNumber) {
                    FinanceContract$UiIntent.HideOrShowNumber hideOrShowNumber = (FinanceContract$UiIntent.HideOrShowNumber) interfaceC19282d;
                    AssetsProfitLossAnalysisManager.f40608a.m49943e(hideOrShowNumber.getIsChecked());
                    C46392a.m102328k(C42153h.f93593a.m92500D(), hideOrShowNumber.getIsChecked());
                    updateState(new Function1() { // from class: com.kubi.assets.finance.f0
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FinanceViewModel.m16711t(interfaceC19282d, (UIState) obj);
                        }
                    });
                } else if (interfaceC19282d instanceof FinanceContract$UiIntent.GetAutoEarnState) {
                    Result.Companion companion = Result.INSTANCE;
                    AutoEarnApi autoEarnApiM16714w = m16714w();
                    c99611.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC19282d);
                    c99611.L$1 = this;
                    c99611.I$0 = 0;
                    c99611.label = 3;
                    objM15432g = AutoEarnApi.m15432g(autoEarnApiM16714w, null, c99611, 1, null);
                    if (objM15432g != coroutine_suspended) {
                        financeViewModel = this;
                        final AutoEarnStateResp autoEarnStateResp2 = (AutoEarnStateResp) objM15432g;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("GetAutoEarnState: ");
                        sb3.append(autoEarnStateResp2 != null ? autoEarnStateResp2.getStatus() : null);
                        C44128b.m97258b(sb3.toString());
                        objM103844constructorimpl = Result.m103844constructorimpl(Boxing.boxBoolean(financeViewModel.updateState(new Function1() { // from class: com.kubi.assets.finance.g0
                            @Override // p852kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return FinanceViewModel.m16712u(autoEarnStateResp2, (UIState) obj);
                            }
                        })));
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            sendSingleEvent(new C10006p(thM103847exceptionOrNullimpl.getMessage()));
                        }
                    }
                }
                return coroutine_suspended;
            }
            sendSingleEvent(C10027q.f17497a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public final AutoEarnApi m16714w() {
        return (AutoEarnApi) this.f17399X.getValue();
    }

    @Override // com.kubi.mvi.state.BaseStateVM
    @NotNull
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public UIState getInitState() {
        return new UIState(null, null, null, false, null, 31, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final Object m16716y(Continuation<? super Unit> continuation) {
        FinanceViewModel$handleGetFinanceConfig$1 financeViewModel$handleGetFinanceConfig$1;
        if (continuation instanceof FinanceViewModel$handleGetFinanceConfig$1) {
            financeViewModel$handleGetFinanceConfig$1 = (FinanceViewModel$handleGetFinanceConfig$1) continuation;
            int i11 = financeViewModel$handleGetFinanceConfig$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                financeViewModel$handleGetFinanceConfig$1.label = i11 - Integer.MIN_VALUE;
            } else {
                financeViewModel$handleGetFinanceConfig$1 = new FinanceViewModel$handleGetFinanceConfig$1(this, continuation);
            }
        } else {
            financeViewModel$handleGetFinanceConfig$1 = new FinanceViewModel$handleGetFinanceConfig$1(this, continuation);
        }
        FinanceViewModel$handleGetFinanceConfig$1 financeViewModel$handleGetFinanceConfig$2 = financeViewModel$handleGetFinanceConfig$1;
        Object objM42824e = financeViewModel$handleGetFinanceConfig$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = financeViewModel$handleGetFinanceConfig$2.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM42824e);
            InterfaceC41634e<FinanceConfig> interfaceC41634eM17098Q0 = m16713v().m17098Q0();
            FinanceViewModel$handleGetFinanceConfig$2 financeViewModel$handleGetFinanceConfig$3 = new FinanceViewModel$handleGetFinanceConfig$2(this, null);
            financeViewModel$handleGetFinanceConfig$2.label = 1;
            objM42824e = RetrofitFlowExKt.m42824e(interfaceC41634eM17098Q0, false, financeViewModel$handleGetFinanceConfig$3, financeViewModel$handleGetFinanceConfig$2, 1, null);
            if (objM42824e == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM42824e);
        }
        if (((C19334f) objM42824e).getThrowable() != null && ((UIState) getState()).getConfig() == null) {
            sendSingleEvent(C10004o.f17457a);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final AssetV2Api m16709r() {
        return (AssetV2Api) C42597a.m93387c().create(AssetV2Api.class);
    }

    /* JADX INFO: renamed from: s */
    public static final AutoEarnApi m16710s() {
        return (AutoEarnApi) C42597a.m93388d().create(AutoEarnApi.class);
    }
}
