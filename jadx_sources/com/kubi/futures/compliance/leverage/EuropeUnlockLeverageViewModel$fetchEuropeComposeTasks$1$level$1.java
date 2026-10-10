package com.kubi.futures.compliance.leverage;

import com.kubi.futures.data.compliance.IComplianceService;
import com.kubi.futures.data.compliance.entity.EuropeUnlockLeverageLevelEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: EuropeUnlockLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/futures/data/compliance/entity/EuropeUnlockLeverageLevelEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.compliance.leverage.EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1", m90122f = "EuropeUnlockLeverageViewModel.kt", m90123i = {}, m90124l = {68}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1 extends SuspendLambda implements Function1<Continuation<? super EuropeUnlockLeverageLevelEntity>, Object> {
    int label;

    public EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1(Continuation<? super EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super EuropeUnlockLeverageLevelEntity> continuation) {
        return ((EuropeUnlockLeverageViewModel$fetchEuropeComposeTasks$1$level$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IComplianceService iComplianceService = IComplianceService.f22675a.get();
        this.label = 1;
        Object objMo97160c = iComplianceService.mo97160c(this);
        if (objMo97160c == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo97160c;
    }
}
