package com.kubi.futures.trade;

import androidx.core.app.FrameMetricsAggregator;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.FuturesViewModel$fetchAirdropBonusPopInfo$1", m90122f = "FuturesViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesViewModel$fetchAirdropBonusPopInfo$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $airdropCode;
    int label;
    final /* synthetic */ FuturesViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesViewModel$fetchAirdropBonusPopInfo$1(String str, FuturesViewModel futuresViewModel, Continuation<? super FuturesViewModel$fetchAirdropBonusPopInfo$1> continuation) {
        super(2, continuation);
        this.$airdropCode = str;
        this.this$0 = futuresViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesViewModel$fetchAirdropBonusPopInfo$1(this.$airdropCode, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesViewModel$fetchAirdropBonusPopInfo$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            AirdropBonusEntity airdropBonusEntityMo100566q = RepositoryServiceLocator.f19236a.m20292k().mo100566q(this.$airdropCode);
            if (airdropBonusEntityMo100566q == null) {
                airdropBonusEntityMo100566q = new AirdropBonusEntity(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
            }
            this.this$0.m26713A().postValue(new Pair<>(this.$airdropCode, airdropBonusEntityMo100566q));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
