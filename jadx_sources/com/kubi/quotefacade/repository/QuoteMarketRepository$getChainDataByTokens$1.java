package com.kubi.quotefacade.repository;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: QuoteMarketRepository.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.repository.QuoteMarketRepository", m90122f = "QuoteMarketRepository.kt", m90123i = {0, 0}, m90124l = {418}, m90125m = "getChainDataByTokens", m90126n = {"tokens", "orderByRange"}, m90127s = {"L$0", "L$1"})
public final class QuoteMarketRepository$getChainDataByTokens$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuoteMarketRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteMarketRepository$getChainDataByTokens$1(QuoteMarketRepository quoteMarketRepository, Continuation<? super QuoteMarketRepository$getChainDataByTokens$1> continuation) {
        super(continuation);
        this.this$0 = quoteMarketRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m53006v(null, null, this);
    }
}
