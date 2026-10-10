package com.kubi.quotefacade.repository;

import com.kubi.quotefacade.entity.MarketMenuEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: QuoteMarketRepository.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/quotefacade/entity/MarketMenuEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.repository.QuoteMarketRepository$getMenuList$2", m90122f = "QuoteMarketRepository.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class QuoteMarketRepository$getMenuList$2 extends SuspendLambda implements Function2<MarketMenuEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ QuoteMarketRepository this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(MarketMenuEntity marketMenuEntity, Continuation<? super Unit> continuation) {
        return ((QuoteMarketRepository$getMenuList$2) create(marketMenuEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteMarketRepository$getMenuList$2(QuoteMarketRepository quoteMarketRepository, Continuation<? super QuoteMarketRepository$getMenuList$2> continuation) {
        super(2, continuation);
        this.this$0 = quoteMarketRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        QuoteMarketRepository$getMenuList$2 quoteMarketRepository$getMenuList$2 = new QuoteMarketRepository$getMenuList$2(this.this$0, continuation);
        quoteMarketRepository$getMenuList$2.L$0 = obj;
        return quoteMarketRepository$getMenuList$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MarketMenuEntity marketMenuEntity = (MarketMenuEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.m52987W(marketMenuEntity);
        return Unit.INSTANCE;
    }
}
