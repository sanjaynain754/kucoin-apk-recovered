package com.kubi.quotefacade.tradechance;

import com.kubi.quotefacade.entity.ChanceHotRankEntity;
import com.kubi.quotefacade.tradechance.utils.C22586f;
import com.kubi.quotefacade.tradechance.utils.TradeChanceSocketHelper;
import kotlinx.coroutines.C41713n0;
import kotlinx.coroutines.InterfaceC41709m0;
import p844zu.InterfaceC46926c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TradeChanceVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM$subscribeWs$1", m90122f = "TradeChanceVM.kt", m90123i = {}, m90124l = {219}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TradeChanceVM$subscribeWs$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChanceHotRankEntity $entity;
    int label;
    final /* synthetic */ TradeChanceVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeChanceVM$subscribeWs$1(TradeChanceVM tradeChanceVM, ChanceHotRankEntity chanceHotRankEntity, Continuation<? super TradeChanceVM$subscribeWs$1> continuation) {
        super(2, continuation);
        this.this$0 = tradeChanceVM;
        this.$entity = chanceHotRankEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TradeChanceVM$subscribeWs$1(this.this$0, this.$entity, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((TradeChanceVM$subscribeWs$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m53101f(TradeChanceVM tradeChanceVM, ChanceHotRankEntity chanceHotRankEntity) {
        if (C41713n0.m91132h(tradeChanceVM.f42608Z)) {
            tradeChanceVM.m53096Z(CollectionsKt.mutableListOf(new ChanceDataHotRank(chanceHotRankEntity)));
        }
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
            C22586f.m53265j("[ws]start HotRankPush");
            TradeChanceSocketHelper tradeChanceSocketHelper = TradeChanceSocketHelper.f42694a;
            InterfaceC46926c interfaceC46926cM53093V = this.this$0.m53093V();
            ChanceHotRankEntity chanceHotRankEntity = this.$entity;
            final TradeChanceVM tradeChanceVM = this.this$0;
            Function1<? super ChanceHotRankEntity, Unit> function1 = new Function1() { // from class: com.kubi.quotefacade.tradechance.q
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return TradeChanceVM$subscribeWs$1.m53101f(tradeChanceVM, (ChanceHotRankEntity) obj2);
                }
            };
            this.label = 1;
            if (tradeChanceSocketHelper.m53247b(interfaceC46926cM53093V, chanceHotRankEntity, function1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
