package com.kubi.quotefacade.repository;

import com.kubi.quotefacade.entity.ChainItemEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: QuoteMarketRepository.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/quotefacade/entity/ChainItemEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.repository.QuoteMarketRepository$getChainDataByTokens$2", m90122f = "QuoteMarketRepository.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class QuoteMarketRepository$getChainDataByTokens$2 extends SuspendLambda implements Function2<List<? extends ChainItemEntity>, Continuation<? super Unit>, Object> {
    int label;

    public QuoteMarketRepository$getChainDataByTokens$2(Continuation<? super QuoteMarketRepository$getChainDataByTokens$2> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ChainItemEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ChainItemEntity>) list, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new QuoteMarketRepository$getChainDataByTokens$2(continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ChainItemEntity> list, Continuation<? super Unit> continuation) {
        return ((QuoteMarketRepository$getChainDataByTokens$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
