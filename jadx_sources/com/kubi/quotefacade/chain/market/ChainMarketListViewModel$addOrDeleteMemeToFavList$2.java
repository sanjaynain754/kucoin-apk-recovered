package com.kubi.quotefacade.chain.market;

import com.kubi.quotefacade.entity.ChainBackDeleteEntity;
import com.kubi.quotefacade.entity.ChainItemEntity;
import com.kubi.quotefacade.helper.ChainFavCacheManager;
import java.util.List;
import p212dv.C36962b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: ChainMarketListViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/ChainBackDeleteEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketListViewModel$addOrDeleteMemeToFavList$2", m90122f = "ChainMarketListViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class ChainMarketListViewModel$addOrDeleteMemeToFavList$2 extends SuspendLambda implements Function2<ChainBackDeleteEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChainItemEntity $chainItem;
    final /* synthetic */ int $position;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChainMarketListViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(ChainBackDeleteEntity chainBackDeleteEntity, Continuation<? super Unit> continuation) {
        return ((ChainMarketListViewModel$addOrDeleteMemeToFavList$2) create(chainBackDeleteEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainMarketListViewModel$addOrDeleteMemeToFavList$2(ChainItemEntity chainItemEntity, ChainMarketListViewModel chainMarketListViewModel, int i11, Continuation<? super ChainMarketListViewModel$addOrDeleteMemeToFavList$2> continuation) {
        super(2, continuation);
        this.$chainItem = chainItemEntity;
        this.this$0 = chainMarketListViewModel;
        this.$position = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChainMarketListViewModel$addOrDeleteMemeToFavList$2 chainMarketListViewModel$addOrDeleteMemeToFavList$2 = new ChainMarketListViewModel$addOrDeleteMemeToFavList$2(this.$chainItem, this.this$0, this.$position, continuation);
        chainMarketListViewModel$addOrDeleteMemeToFavList$2.L$0 = obj;
        return chainMarketListViewModel$addOrDeleteMemeToFavList$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ChainBackDeleteEntity chainBackDeleteEntity = (ChainBackDeleteEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChainFavCacheManager chainFavCacheManager = ChainFavCacheManager.f41922a;
        chainFavCacheManager.m51774h(this.$chainItem.getToken() + '-' + this.$chainItem.getChain());
        List<String> outOfBoundsDelete = chainBackDeleteEntity.getOutOfBoundsDelete();
        if (outOfBoundsDelete != null && !outOfBoundsDelete.isEmpty()) {
            chainFavCacheManager.m51776j(chainBackDeleteEntity.getOutOfBoundsDelete());
        }
        this.this$0.send(new C36962b(this.$chainItem, this.$position));
        return Unit.INSTANCE;
    }
}
