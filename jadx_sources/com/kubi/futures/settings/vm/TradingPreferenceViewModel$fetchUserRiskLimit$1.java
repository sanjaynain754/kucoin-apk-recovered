package com.kubi.futures.settings.vm;

import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
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
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchUserRiskLimit$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {106}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradingPreferenceViewModel$fetchUserRiskLimit$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ TradingPreferenceViewModel this$0;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Unit m26423f(Throwable th2) {
        C19331c.m42836c(th2, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingPreferenceViewModel$fetchUserRiskLimit$1(boolean z11, String str, TradingPreferenceViewModel tradingPreferenceViewModel, Continuation<? super TradingPreferenceViewModel$fetchUserRiskLimit$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.this$0 = tradingPreferenceViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradingPreferenceViewModel$fetchUserRiskLimit$1(this.$isTrial, this.$symbol, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradingPreferenceViewModel$fetchUserRiskLimit$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1 tradingPreferenceViewModel$fetchUserRiskLimit$1$result$1 = new TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1(this.$isTrial, this.$symbol, null);
            Function1 function1 = new Function1() { // from class: com.kubi.futures.settings.vm.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradingPreferenceViewModel$fetchUserRiskLimit$1.m26423f((Throwable) obj2);
                }
            };
            this.label = 1;
            obj = CoroutineExKt.m36471a(tradingPreferenceViewModel$fetchUserRiskLimit$1$result$1, function1, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ContractRiskLimitEntity contractRiskLimitEntity = (ContractRiskLimitEntity) obj;
        if (contractRiskLimitEntity != null) {
            this.this$0.m26417r().postValue(contractRiskLimitEntity);
        }
        return Unit.INSTANCE;
    }
}
