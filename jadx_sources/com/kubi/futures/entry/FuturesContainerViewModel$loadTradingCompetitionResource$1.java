package com.kubi.futures.entry;

import com.kubi.kumex.data.platform.model.ResourcePositionEntity;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p236em.C37214b;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesContainerViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.entry.FuturesContainerViewModel$loadTradingCompetitionResource$1", m90122f = "FuturesContainerViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesContainerViewModel$loadTradingCompetitionResource$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $code;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesContainerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesContainerViewModel$loadTradingCompetitionResource$1(FuturesContainerViewModel futuresContainerViewModel, String str, Continuation<? super FuturesContainerViewModel$loadTradingCompetitionResource$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresContainerViewModel;
        this.$code = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesContainerViewModel$loadTradingCompetitionResource$1 futuresContainerViewModel$loadTradingCompetitionResource$1 = new FuturesContainerViewModel$loadTradingCompetitionResource$1(this.this$0, this.$code, continuation);
        futuresContainerViewModel$loadTradingCompetitionResource$1.L$0 = obj;
        return futuresContainerViewModel$loadTradingCompetitionResource$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesContainerViewModel$loadTradingCompetitionResource$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        FuturesContainerViewModel futuresContainerViewModel = this.this$0;
        String str = this.$code;
        try {
            Result.Companion companion = Result.INSTANCE;
            List<ResourcePositionEntity> list = futuresContainerViewModel.m25535q().mo25008f(str).get(str);
            objM103844constructorimpl = Result.m103844constructorimpl(list != null ? (ResourcePositionEntity) CollectionsKt.firstOrNull((List) list) : null);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        FuturesContainerViewModel futuresContainerViewModel2 = this.this$0;
        if (Result.m103851isSuccessimpl(objM103844constructorimpl)) {
            futuresContainerViewModel2.f23014W.postValue((ResourcePositionEntity) objM103844constructorimpl);
        }
        FuturesContainerViewModel futuresContainerViewModel3 = this.this$0;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C37214b.m83255a(thM103847exceptionOrNullimpl, "FuturesContainerViewModel-loadTradingCompetitionResource");
            futuresContainerViewModel3.f23014W.postValue(null);
        }
        return Unit.INSTANCE;
    }
}
