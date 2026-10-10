package com.kubi.futures.settings.vm;

import com.kubi.broker.BrokerConfig;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.trade.model.AutoDepositStatus;
import com.kubi.kumex.data.trade.model.SubmitAutoDepositEntity;
import com.kubi.kumex.utils.CoroutineExKt;
import com.kubi.network.retrofit.utils.C19331c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {126}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isChecked;
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ TradingPreferenceViewModel this$0;

    /* JADX INFO: renamed from: com.kubi.futures.settings.vm.TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1$1 */
    /* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
    @Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C135171 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isChecked;
        final /* synthetic */ boolean $isTrial;
        final /* synthetic */ String $symbol;
        int label;
        final /* synthetic */ TradingPreferenceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C135171(boolean z11, String str, boolean z12, TradingPreferenceViewModel tradingPreferenceViewModel, Continuation<? super C135171> continuation) {
            super(1, continuation);
            this.$isTrial = z11;
            this.$symbol = str;
            this.$isChecked = z12;
            this.this$0 = tradingPreferenceViewModel;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new C135171(this.$isTrial, this.$symbol, this.$isChecked, this.this$0, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((C135171) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AutoDepositStatus autoDepositStatus;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                if (!BrokerConfig.f19211a.m20201d().mo20227J0()) {
                    MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null).mo93807R0(this.$isTrial, this.$symbol, Boxing.boxBoolean(this.$isChecked), "BOTH");
                } else {
                    MultiBizFacadeManager.m20257l(MultiBizFacadeManager.f19232a, null, 1, null).mo89033T0(this.$isTrial, new SubmitAutoDepositEntity(this.$symbol, new AutoDepositStatus(null, null, Boxing.boxBoolean(this.$isChecked), 3, null)));
                }
                AutoDepositStatus value = this.this$0.m26413n().getValue();
                if (value == null) {
                    autoDepositStatus = new AutoDepositStatus(null, null, null, 7, null);
                } else {
                    autoDepositStatus = value;
                }
                this.this$0.m26413n().postValue(AutoDepositStatus.copy$default(autoDepositStatus, null, null, Boxing.boxBoolean(this.$isChecked), 3, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1(boolean z11, String str, boolean z12, TradingPreferenceViewModel tradingPreferenceViewModel, Continuation<? super TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.$isChecked = z12;
        this.this$0 = tradingPreferenceViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1(this.$isTrial, this.$symbol, this.$isChecked, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m26425f(TradingPreferenceViewModel tradingPreferenceViewModel, boolean z11, Throwable th2) {
        AutoDepositStatus autoDepositStatus;
        AutoDepositStatus value = tradingPreferenceViewModel.m26413n().getValue();
        if (value == null) {
            autoDepositStatus = new AutoDepositStatus(null, null, null, 7, null);
        } else {
            autoDepositStatus = value;
        }
        tradingPreferenceViewModel.m26413n().postValue(AutoDepositStatus.copy$default(autoDepositStatus, null, null, Boolean.valueOf(z11), 3, null));
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
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
            C135171 c135171 = new C135171(this.$isTrial, this.$symbol, this.$isChecked, this.this$0, null);
            final TradingPreferenceViewModel tradingPreferenceViewModel = this.this$0;
            final boolean z11 = this.$isChecked;
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.m0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradingPreferenceViewModel$submitOneWayAutoDepositMargin$1.m26425f(tradingPreferenceViewModel, z11, (Throwable) obj2);
                }
            };
            this.label = 1;
            if (CoroutineExKt.m36471a(c135171, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
