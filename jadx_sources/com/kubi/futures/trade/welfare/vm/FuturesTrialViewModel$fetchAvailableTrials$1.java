package com.kubi.futures.trade.welfare.vm;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p692vh.InterfaceC45544a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesTrialViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel$fetchAvailableTrials$1", m90122f = "FuturesTrialViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesTrialViewModel$fetchAvailableTrials$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $currentPage;
    final /* synthetic */ int $pageSize;
    int label;
    final /* synthetic */ FuturesTrialViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTrialViewModel$fetchAvailableTrials$1(int i11, int i12, FuturesTrialViewModel futuresTrialViewModel, Continuation<? super FuturesTrialViewModel$fetchAvailableTrials$1> continuation) {
        super(2, continuation);
        this.$currentPage = i11;
        this.$pageSize = i12;
        this.this$0 = futuresTrialViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTrialViewModel$fetchAvailableTrials$1(this.$currentPage, this.$pageSize, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTrialViewModel$fetchAvailableTrials$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FuturesWelfareTrialEntity futuresWelfareTrialEntityM100552s = InterfaceC45544a.m100552s(RepositoryServiceLocator.f19236a.m20292k(), "ACTIVATE_FINISHED", this.$currentPage, this.$pageSize, null, 8, null);
            if (futuresWelfareTrialEntityM100552s == null) {
                futuresWelfareTrialEntityM100552s = new FuturesWelfareTrialEntity(0, 0, 0, 0, 0, 0, null, 127, null);
            }
            this.this$0.m28769v().postValue(futuresWelfareTrialEntityM100552s);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
