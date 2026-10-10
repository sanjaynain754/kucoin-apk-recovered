package com.kubi.quotefacade.chain.market;

import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.entity.ChainListEntity;
import com.kubi.quotefacade.entity.ChainListParam;
import com.kubi.quotefacade.event.UIState;
import java.util.List;
import p212dv.C36963c;
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

/* JADX INFO: compiled from: ChainMarketListViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/ChainListEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketListViewModel$getChainMarketList$2", m90122f = "ChainMarketListViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChainMarketListViewModel$getChainMarketList$2 extends SuspendLambda implements Function2<ChainListEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChainListParam $param;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainMarketListViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(ChainListEntity chainListEntity, Continuation<? super Unit> continuation) {
        return ((ChainMarketListViewModel$getChainMarketList$2) create(chainListEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainMarketListViewModel$getChainMarketList$2(ChainMarketListViewModel chainMarketListViewModel, ChainListParam chainListParam, Continuation<? super ChainMarketListViewModel$getChainMarketList$2> continuation) {
        super(2, continuation);
        this.this$0 = chainMarketListViewModel;
        this.$param = chainListParam;
    }

    /* JADX INFO: renamed from: g */
    public static final UIState m50980g(UIState uIState) {
        return UIState.copy$default(uIState, null, new Object(), null, 5, null);
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m50981h(UIState uIState) {
        return UIState.copy$default(uIState, null, null, new Object(), 3, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChainMarketListViewModel$getChainMarketList$2 chainMarketListViewModel$getChainMarketList$2 = new ChainMarketListViewModel$getChainMarketList$2(this.this$0, this.$param, continuation);
        chainMarketListViewModel$getChainMarketList$2.L$0 = obj;
        return chainMarketListViewModel$getChainMarketList$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChainListEntity chainListEntity = (ChainListEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = this.this$0.f41572X;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getChainMarketList = ");
        List<ChainItemEntity> items = chainListEntity.getItems();
        sb2.append(items != null ? Boxing.boxInt(items.size()) : null);
        C44128b.m97266j(str, sb2.toString());
        if (chainListEntity.getItems() == null) {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.chain.market.k0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ChainMarketListViewModel$getChainMarketList$2.m50980g((UIState) obj2);
                }
            }));
        } else if (chainListEntity.getItems().isEmpty()) {
            Boxing.boxBoolean(this.this$0.updateState(new Function1() { // from class: com.kubi.quotefacade.chain.market.l0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return ChainMarketListViewModel$getChainMarketList$2.m50981h((UIState) obj2);
                }
            }));
        } else {
            this.this$0.f41574Z = chainListEntity;
            ChainMarketListViewModel chainMarketListViewModel = this.this$0;
            chainMarketListViewModel.send(new C36963c(chainMarketListViewModel.m50976r(this.$param, chainListEntity)));
            Unit unit = Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
