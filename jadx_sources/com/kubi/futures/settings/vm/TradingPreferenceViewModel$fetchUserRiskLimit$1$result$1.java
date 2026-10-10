package com.kubi.futures.settings.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.platform.model.ContractRiskLimitEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: TradingPreferenceViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/kumex/data/platform/model/ContractRiskLimitEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1", m90122f = "TradingPreferenceViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1 extends SuspendLambda implements Function1<Continuation<? super ContractRiskLimitEntity>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ String $symbol;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1(boolean z11, String str, Continuation<? super TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1> continuation) {
        super(1, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1(this.$isTrial, this.$symbol, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super ContractRiskLimitEntity> continuation) {
        return ((TradingPreferenceViewModel$fetchUserRiskLimit$1$result$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return MultiBizFacadeManager.m20259p(MultiBizFacadeManager.f19232a, null, 1, null).mo93811h0(this.$isTrial, this.$symbol);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
