package com.kubi.quotefacade.chain.market;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: ChainMarketViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.chain.market.ChainMarketViewModel", m90122f = "ChainMarketViewModel.kt", m90123i = {}, m90124l = {51}, m90125m = "getChainMenuList", m90126n = {}, m90127s = {})
public final class ChainMarketViewModel$getChainMenuList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChainMarketViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChainMarketViewModel$getChainMenuList$1(ChainMarketViewModel chainMarketViewModel, Continuation<? super ChainMarketViewModel$getChainMenuList$1> continuation) {
        super(continuation);
        this.this$0 = chainMarketViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m50988h(this);
    }
}
