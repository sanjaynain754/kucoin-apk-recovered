package com.kubi.quotefacade.market.holdings;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: HoldingContainerViewModel.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.market.holdings.HoldingContainerViewModel", m90122f = "HoldingContainerViewModel.kt", m90123i = {}, m90124l = {63}, m90125m = "handleHoldingsTabData", m90126n = {}, m90127s = {})
public final class HoldingContainerViewModel$handleHoldingsTabData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HoldingContainerViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldingContainerViewModel$handleHoldingsTabData$1(HoldingContainerViewModel holdingContainerViewModel, Continuation<? super HoldingContainerViewModel$handleHoldingsTabData$1> continuation) {
        super(continuation);
        this.this$0 = holdingContainerViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m52444o(this);
    }
}
