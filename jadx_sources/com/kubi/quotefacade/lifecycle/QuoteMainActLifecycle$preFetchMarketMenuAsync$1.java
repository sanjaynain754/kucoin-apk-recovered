package com.kubi.quotefacade.lifecycle;

import com.kubi.quotefacade.repository.QuoteMarketRepository;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: QuoteMainActLifecycle.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.lifecycle.QuoteMainActLifecycle$preFetchMarketMenuAsync$1", m90122f = "QuoteMainActLifecycle.kt", m90123i = {}, m90124l = {32}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class QuoteMainActLifecycle$preFetchMarketMenuAsync$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    int label;

    public QuoteMainActLifecycle$preFetchMarketMenuAsync$1(Continuation<? super QuoteMainActLifecycle$preFetchMarketMenuAsync$1> continuation) {
        super(1, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new QuoteMainActLifecycle$preFetchMarketMenuAsync$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((QuoteMainActLifecycle$preFetchMarketMenuAsync$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            QuoteMarketRepository quoteMarketRepository = new QuoteMarketRepository();
            this.label = 1;
            if (quoteMarketRepository.m52977L(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
