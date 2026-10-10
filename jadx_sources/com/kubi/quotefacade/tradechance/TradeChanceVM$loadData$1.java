package com.kubi.quotefacade.tradechance;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: TradeChanceVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.tradechance.TradeChanceVM", m90122f = "TradeChanceVM.kt", m90123i = {0}, m90124l = {88}, m90125m = "loadData", m90126n = {"dataList"}, m90127s = {"L$0"})
public final class TradeChanceVM$loadData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TradeChanceVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeChanceVM$loadData$1(TradeChanceVM tradeChanceVM, Continuation<? super TradeChanceVM$loadData$1> continuation) {
        super(continuation);
        this.this$0 = tradeChanceVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m53065X(this);
    }
}
