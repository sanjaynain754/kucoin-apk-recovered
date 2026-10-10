package com.kubi.quotefacade.chain.market;

import com.kubi.quotefacade.entity.ChainMenuEntity;
import com.kubi.quotefacade.event.UIState;
import java.util.List;
import p212dv.C36961a;
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
import ro.C44128b;

/* JADX INFO: compiled from: ChainMarketViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/entity/ChainMenuEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketViewModel$getChainMenuList$2", m90122f = "ChainMarketViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChainMarketViewModel$getChainMenuList$2 extends SuspendLambda implements Function2<List<? extends ChainMenuEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainMarketViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ChainMenuEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ChainMenuEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainMarketViewModel$getChainMenuList$2(ChainMarketViewModel chainMarketViewModel, Continuation<? super ChainMarketViewModel$getChainMenuList$2> continuation) {
        super(2, continuation);
        this.this$0 = chainMarketViewModel;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m50991f(UIState uIState) {
        return UIState.copy$default(uIState, null, null, new Object(), 3, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChainMarketViewModel$getChainMenuList$2 chainMarketViewModel$getChainMenuList$2 = new ChainMarketViewModel$getChainMenuList$2(this.this$0, continuation);
        chainMarketViewModel$getChainMenuList$2.L$0 = obj;
        return chainMarketViewModel$getChainMenuList$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ChainMenuEntity> list, Continuation<? super Unit> continuation) {
        return ((ChainMarketViewModel$getChainMenuList$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j(this.this$0.f41575X, "getChainMenuList = " + list);
        if (list.isEmpty()) {
            C44128b.m97266j(this.this$0.f41575X, "getChainMenuList empty");
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.chain.market.n0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ChainMarketViewModel$getChainMenuList$2.m50991f((UIState) obj2);
                }
            }));
        } else {
            this.this$0.send(new C36961a(list));
        }
        return Unit.INSTANCE;
    }
}
