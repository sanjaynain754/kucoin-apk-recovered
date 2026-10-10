package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchAutoMarginByHedge$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {89}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradingPreferenceViewModel$fetchAutoMarginByHedge$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ TradingPreferenceViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchAutoMarginByHedge$1$1 */
    /* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/data/trade/model/AutoDepositStatus;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchAutoMarginByHedge$1$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C135131 extends SuspendLambda implements Function1<Continuation<? super AutoDepositStatus>, Object> {
        final /* synthetic */ boolean $isTrial;
        final /* synthetic */ String $symbol;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135131(boolean z11, String str, Continuation<? super C135131> continuation) {
            super(1, continuation);
            this.$isTrial = z11;
            this.$symbol = str;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C135131(this.$isTrial, this.$symbol, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super AutoDepositStatus> continuation) {
            return ((C135131) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null).mo93813p0(this.$isTrial, this.$symbol);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m26421f(Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingPreferenceViewModel$fetchAutoMarginByHedge$1(boolean z11, String str, TradingPreferenceViewModel tradingPreferenceViewModel, Continuation<? super TradingPreferenceViewModel$fetchAutoMarginByHedge$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.this$0 = tradingPreferenceViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingPreferenceViewModel$fetchAutoMarginByHedge$1(this.$isTrial, this.$symbol, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradingPreferenceViewModel$fetchAutoMarginByHedge$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            C135131 c135131 = new C135131(this.$isTrial, this.$symbol, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradingPreferenceViewModel$fetchAutoMarginByHedge$1.m26421f((Throwable) obj2);
                }
            };
            this.label = 1;
            obj = CoroutineExKt.m36471a(c135131, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AutoDepositStatus autoDepositStatus = (AutoDepositStatus) obj;
        MutableLiveData<AutoDepositStatus> mutableLiveDataM26413n = this.this$0.m26413n();
        if (autoDepositStatus == null) {
            autoDepositStatus = new AutoDepositStatus(null, null, null, 7, null);
        }
        mutableLiveDataM26413n.postValue(autoDepositStatus);
        return Unit.INSTANCE;
    }
}
