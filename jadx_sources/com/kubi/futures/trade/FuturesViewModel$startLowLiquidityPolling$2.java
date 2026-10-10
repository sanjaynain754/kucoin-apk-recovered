package com.kubi.futures.trade;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.ContractEntity;
import p801yl.C46527h0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$startLowLiquidityPolling$2", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesViewModel$startLowLiquidityPolling$2 extends SuspendLambda implements Function2<Unit, Continuation<? super Boolean>, Object> {
    int label;
    final /* synthetic */ FuturesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesViewModel$startLowLiquidityPolling$2(FuturesViewModel futuresViewModel, Continuation<? super FuturesViewModel$startLowLiquidityPolling$2> continuation) {
        super(2, continuation);
        this.this$0 = futuresViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesViewModel$startLowLiquidityPolling$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super Boolean> continuation) {
        return ((FuturesViewModel$startLowLiquidityPolling$2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ContractEntity contractEntityM102673I = C46527h0.f104291a.m102673I();
            boolean zBooleanValue = false;
            if (contractEntityM102673I != null && contractEntityM102673I.isUsStock()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(Boxing.boxBoolean(RepositoryServiceLocator.f19236a.m20288g().mo24995W().isLowLiquidityPeriod()));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                }
                FuturesViewModel futuresViewModel = this.this$0;
                Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    C44128b.m97264h(thM103847exceptionOrNullimpl);
                    Boolean value = futuresViewModel.m26717E().getValue();
                    if (value != null) {
                        zBooleanValue = value.booleanValue();
                    }
                    objM103844constructorimpl = Boxing.boxBoolean(zBooleanValue);
                }
                zBooleanValue = ((Boolean) objM103844constructorimpl).booleanValue();
            }
            return Boxing.boxBoolean(zBooleanValue);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
